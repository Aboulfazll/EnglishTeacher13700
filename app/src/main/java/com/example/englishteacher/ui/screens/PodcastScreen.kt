package com.example.englishteacher.ui.screens

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SearchOff
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.englishteacher.data.Podcast
import com.example.englishteacher.data.PodcastCategory
import com.example.englishteacher.data.PodcastLevel
import com.example.englishteacher.data.PodcastRepository
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastScreen() {
    val context = LocalContext.current
    val allPodcasts = remember { PodcastRepository.getAllPodcasts() }

    val exoPlayer = remember { ExoPlayer.Builder(context).build() }

    var currentlyPlayingId by remember { mutableStateOf<String?>(null) }
    var isPlaying by remember { mutableStateOf(false) }
    var currentPosition by remember { mutableLongStateOf(0L) }
    var totalDuration by remember { mutableLongStateOf(0L) }
    var isDragging by remember { mutableStateOf(false) }
    var playbackSpeed by remember { mutableFloatStateOf(1.0f) }

    var searchQuery by remember { mutableStateOf("") }
    var selectedLevel by remember { mutableStateOf<PodcastLevel?>(null) }
    var selectedCategory by remember { mutableStateOf<PodcastCategory?>(null) }
    var expandedPodcastId by remember { mutableStateOf<String?>(null) }

    DisposableEffect(Unit) {
        onDispose { exoPlayer.release() }
    }

    LaunchedEffect(currentlyPlayingId, isPlaying) {
        while (isPlaying) {
            if (!isDragging) {
                currentPosition = exoPlayer.currentPosition.coerceAtLeast(0)
                val dur = exoPlayer.duration
                if (dur > 0) totalDuration = dur
            }
            delay(300)
        }
    }

    LaunchedEffect(playbackSpeed) {
        exoPlayer.setPlaybackSpeed(playbackSpeed)
    }

    val filteredPodcasts = allPodcasts.filter { podcast ->
        val matchesSearch = searchQuery.isEmpty() ||
                podcast.title.contains(searchQuery, true) ||
                podcast.titlePersian.contains(searchQuery, true) ||
                podcast.description.contains(searchQuery, true)
        val matchesLevel = selectedLevel == null || podcast.level == selectedLevel
        val matchesCategory = selectedCategory == null || podcast.category == selectedCategory
        matchesSearch && matchesLevel && matchesCategory
    }

    fun playPodcast(podcast: Podcast) {
        if (currentlyPlayingId == podcast.id && isPlaying) {
            exoPlayer.pause()
            isPlaying = false
        } else if (currentlyPlayingId == podcast.id && !isPlaying) {
            exoPlayer.play()
            isPlaying = true
        } else {
            exoPlayer.stop()
            exoPlayer.setMediaItem(MediaItem.fromUri(podcast.audioUrl))
            exoPlayer.prepare()
            exoPlayer.play()
            exoPlayer.setPlaybackSpeed(playbackSpeed)
            currentlyPlayingId = podcast.id
            currentPosition = 0L
            totalDuration = 0L
            isPlaying = true
            Toast.makeText(context, "▶ ${podcast.title}", Toast.LENGTH_SHORT).show()
        }
    }

    fun playNext() {
        val idx = filteredPodcasts.indexOfFirst { it.id == currentlyPlayingId }
        if (idx >= 0 && idx < filteredPodcasts.size - 1) playPodcast(filteredPodcasts[idx + 1])
    }

    fun playPrevious() {
        val idx = filteredPodcasts.indexOfFirst { it.id == currentlyPlayingId }
        if (idx > 0) playPodcast(filteredPodcasts[idx - 1])
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("🎧 پادکست‌های آموزشی", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "${filteredPodcasts.size} از ${allPodcasts.size} پادکست",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF6200EE))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {

            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("جستجوی پادکست...") },
                    leadingIcon = { Icon(Icons.Filled.Search, null, tint = Color(0xFF6200EE)) },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(Icons.Filled.Clear, "Clear", tint = Color.Gray)
                            }
                        }
                    },
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    )
                )
            }

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                item {
                    FilterChip(
                        selected = selectedLevel == null,
                        onClick = { selectedLevel = null },
                        label = { Text("همه سطوح", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFF6200EE),
                            selectedLabelColor = Color.White
                        )
                    )
                }
                items(PodcastLevel.values().toList()) { level ->
                    FilterChip(
                        selected = selectedLevel == level,
                        onClick = { selectedLevel = if (selectedLevel == level) null else level },
                        label = { Text("${level.emoji} ${level.persianName}", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(level.color),
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(4.dp))

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                item {
                    FilterChip(
                        selected = selectedCategory == null,
                        onClick = { selectedCategory = null },
                        label = { Text("همه دسته‌ها", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFF00695C),
                            selectedLabelColor = Color.White
                        )
                    )
                }
                items(PodcastCategory.values().toList()) { cat ->
                    FilterChip(
                        selected = selectedCategory == cat,
                        onClick = { selectedCategory = if (selectedCategory == cat) null else cat },
                        label = { Text("${cat.emoji} ${cat.persianName}", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFF00695C),
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(filteredPodcasts, key = { it.id }) { podcast ->
                    PodcastItem(
                        podcast = podcast,
                        isPlaying = currentlyPlayingId == podcast.id && isPlaying,
                        isCurrent = currentlyPlayingId == podcast.id,
                        isExpanded = expandedPodcastId == podcast.id,
                        currentPosition = currentPosition,
                        totalDuration = totalDuration,
                        playbackSpeed = playbackSpeed,
                        onPlayPause = { playPodcast(podcast) },
                        onSeek = { newPos ->
                            exoPlayer.seekTo(newPos)
                            currentPosition = newPos
                        },
                        onDragging = { isDragging = it },
                        onSpeedChange = { playbackSpeed = it },
                        onNext = { playNext() },
                        onPrevious = { playPrevious() },
                        onToggleTranscript = {
                            expandedPodcastId =
                                if (expandedPodcastId == podcast.id) null else podcast.id
                        }
                    )
                }

                if (filteredPodcasts.isEmpty()) {
                    item {
                        Column(
                            modifier = Modifier.fillMaxWidth().padding(40.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Filled.SearchOff,
                                null,
                                modifier = Modifier.size(64.dp),
                                tint = Color.LightGray
                            )
                            Spacer(Modifier.height(16.dp))
                            Text("پادکستی یافت نشد", color = Color.Gray, fontSize = 14.sp)
                        }
                    }
                }
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
    isExpanded: Boolean,
    currentPosition: Long,
    totalDuration: Long,
    playbackSpeed: Float,
    onPlayPause: () -> Unit,
    onSeek: (Long) -> Unit,
    onDragging: (Boolean) -> Unit,
    onSpeedChange: (Float) -> Unit,
    onNext: () -> Unit,
    onPrevious: () -> Unit,
    onToggleTranscript: () -> Unit
) {
    val levelColor = Color(podcast.level.color)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isCurrent) 8.dp else 3.dp)
    ) {
        Column {

            Row(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(
                            Brush.linearGradient(
                                listOf(levelColor, levelColor.copy(alpha = 0.6f))
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(podcast.level.emoji, fontSize = 22.sp)
                        Text(podcast.category.emoji, fontSize = 14.sp)
                    }
                }

                Spacer(Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        podcast.title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color(0xFF1A1A2E),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        podcast.titlePersian,
                        fontSize = 12.sp,
                        color = Color(0xFF666666)
                    )
                    Spacer(Modifier.height(6.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(levelColor.copy(alpha = 0.15f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                podcast.level.persianName,
                                fontSize = 10.sp,
                                color = levelColor,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(Modifier.width(6.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFF00695C).copy(alpha = 0.1f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                podcast.category.persianName,
                                fontSize = 10.sp,
                                color = Color(0xFF00695C)
                            )
                        }
                        Spacer(Modifier.width(6.dp))
                        Text("• ${podcast.durationMinutes} دقیقه", fontSize = 10.sp, color = Color.Gray)
                    }
                }

                IconButton(
                    onClick = onPlayPause,
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(if (isPlaying) Color(0xFFE91E63) else levelColor)
                ) {
                    Icon(
                        imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.White,
                        modifier = Modifier.size(26.dp)
                    )
                }
            }

            Text(
                podcast.description,
                fontSize = 12.sp,
                color = Color(0xFF555555),
                modifier = Modifier.padding(horizontal = 12.dp),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            TextButton(
                onClick = onToggleTranscript,
                modifier = Modifier.padding(start = 4.dp)
            ) {
                Icon(
                    if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(Modifier.width(4.dp))
                Text(
                    if (isExpanded) "بستن متن" else "نمایش متن و لغات",
                    fontSize = 11.sp
                )
            }

            AnimatedVisibility(visible = isExpanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF8F8FF))
                        .padding(12.dp)
                ) {
                    if (podcast.transcript.isNotEmpty()) {
                        Text(
                            "📄 متن انگلیسی",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF1A1A2E)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            podcast.transcript,
                            fontSize = 12.sp,
                            color = Color(0xFF333333),
                            lineHeight = 18.sp
                        )
                    }

                    if (podcast.transcriptPersian.isNotEmpty()) {
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "🇮🇷 ترجمه",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF1A1A2E)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            podcast.transcriptPersian,
                            fontSize = 12.sp,
                            color = Color(0xFF555555),
                            lineHeight = 18.sp
                        )
                    }

                    if (podcast.vocabulary.isNotEmpty()) {
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "📚 لغات کلیدی",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF1A1A2E)
                        )
                        Spacer(Modifier.height(4.dp))
                        podcast.vocabulary.forEach { word ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(vertical = 2.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(4.dp)
                                        .clip(CircleShape)
                                        .background(levelColor)
                                )
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    "${word.english} = ${word.persian}",
                                    fontSize = 11.sp,
                                    color = Color(0xFF333333)
                                )
                            }
                        }
                    }
                }
            }

            AnimatedVisibility(visible = isCurrent) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF0F0FF))
                        .padding(12.dp)
                ) {
                    Slider(
                        value = currentPosition.toFloat(),
                        onValueChange = {
                            onDragging(true)
                            onSeek(it.toLong())
                        },
                        onValueChangeFinished = { onDragging(false) },
                        valueRange = 0f..(if (totalDuration > 0) totalDuration.toFloat() else 1f),
                        colors = SliderDefaults.colors(
                            thumbColor = levelColor,
                            activeTrackColor = levelColor,
                            inactiveTrackColor = Color.LightGray.copy(alpha = 0.5f)
                        )
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(formatTime(currentPosition), fontSize = 11.sp, color = Color.Gray)
                        Text(formatTime(totalDuration), fontSize = 11.sp, color = Color.Gray)
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        TextButton(onClick = {
                            onSpeedChange(
                                when {
                                    playbackSpeed < 0.8f -> 1.0f
                                    playbackSpeed < 1.2f -> 1.5f
                                    playbackSpeed < 1.8f -> 0.75f
                                    else -> 1.0f
                                }
                            )
                        }) {
                            Text(
                                "${playbackSpeed}x",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        IconButton(onClick = onPrevious) {
                            Icon(Icons.Filled.SkipPrevious, "Previous", tint = levelColor)
                        }

                        IconButton(
                            onClick = onPlayPause,
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(levelColor)
                        ) {
                            Icon(
                                if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                                "Play",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp)
                            )
                        }

                        IconButton(onClick = onNext) {
                            Icon(Icons.Filled.SkipNext, "Next", tint = levelColor)
                        }

                        Spacer(Modifier.width(40.dp))
                    }
                }
            }
        }
    }
}