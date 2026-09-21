package com.example.englishteacher.ui.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.englishteacher.data.Podcast
import com.example.englishteacher.data.PodcastRepository
import kotlinx.coroutines.delay

@Composable
fun PodcastScreen() {
    val context = LocalContext.current
    val podcasts = remember { PodcastRepository.getAllPodcasts() }

    val exoPlayer = remember {
        ExoPlayer.Builder(context).build()
    }

    var currentlyPlayingId by remember { mutableStateOf<String?>(null) }
    var isPlaying by remember { mutableStateOf(false) }

    var currentPosition by remember { mutableLongStateOf(0L) }
    var totalDuration by remember { mutableLongStateOf(0L) }
    var isDragging by remember { mutableStateOf(false) }

    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    LaunchedEffect(currentlyPlayingId, isPlaying) {
        while (isPlaying) {
            if (!isDragging) {
                currentPosition = exoPlayer.currentPosition
                val dur = exoPlayer.duration
                if (dur > 0) totalDuration = dur
            }
            delay(500)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF6200EE))
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "🎧 پادکست‌های آموزشی",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(podcasts) { podcast ->
                PodcastItem(
                    podcast = podcast,
                    isPlaying = currentlyPlayingId == podcast.id && isPlaying,
                    isCurrent = currentlyPlayingId == podcast.id,
                    currentPosition = currentPosition,
                    totalDuration = totalDuration,
                    onSeek = { newPosition ->
                        exoPlayer.seekTo(newPosition)
                        currentPosition = newPosition
                    },
                    onDragging = { dragging -> isDragging = dragging },
                    onClick = {
                        if (currentlyPlayingId == podcast.id && isPlaying) {
                            exoPlayer.pause()
                            isPlaying = false
                        } else {
                            if (currentlyPlayingId != podcast.id) {
                                exoPlayer.stop()
                                val mediaItem = MediaItem.fromUri(podcast.audioUrl)
                                exoPlayer.setMediaItem(mediaItem)
                                exoPlayer.prepare()
                                currentlyPlayingId = podcast.id
                                currentPosition = 0L
                                totalDuration = 0L
                            }
                            exoPlayer.play()
                            isPlaying = true
                            Toast.makeText(context, "در حال پخش: ${podcast.title}", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
            }
        }
    }
}

fun formatTime(ms: Long): String {
    if (ms <= 0) return "00:00"
    val totalSeconds = ms / 1000
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    return String.format("%02d:%02d", minutes, seconds)
}

@Composable
fun PodcastItem(
    podcast: Podcast,
    isPlaying: Boolean,
    isCurrent: Boolean,
    currentPosition: Long,
    totalDuration: Long,
    onSeek: (Long) -> Unit,
    onDragging: (Boolean) -> Unit,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(if (isPlaying) Color(0xFFE91E63) else Color(0xFF6200EE)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                        contentDescription = "Play/Pause",
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = podcast.title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color(0xFF333333)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = podcast.description,
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.Headphones,
                            contentDescription = null,
                            modifier = Modifier.size(14.dp),
                            tint = Color(0xFF6200EE)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "${podcast.level.persianName} • ${podcast.durationMinutes} دقیقه",
                            fontSize = 12.sp,
                            color = Color(0xFF6200EE)
                        )
                    }
                }
            }

            if (isCurrent) {
                Spacer(modifier = Modifier.height(12.dp))
                Column {
                    Slider(
                        value = currentPosition.toFloat(),
                        onValueChange = {
                            onDragging(true)
                            onSeek(it.toLong())
                        },
                        onValueChangeFinished = {
                            onDragging(false)
                        },
                        valueRange = 0f..(if (totalDuration > 0) totalDuration.toFloat() else 1f),
                        colors = SliderDefaults.colors(
                            thumbColor = Color(0xFFE91E63),
                            activeTrackColor = Color(0xFF6200EE),
                            inactiveTrackColor = Color.LightGray
                        )
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = formatTime(currentPosition),
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                        Text(
                            text = formatTime(totalDuration),
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}