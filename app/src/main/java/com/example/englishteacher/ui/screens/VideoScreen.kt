package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.VideoLesson
import com.example.englishteacher.data.VideoRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VideoScreen() {
    var selectedVideo by remember { mutableStateOf<VideoLesson?>(null) }

    if (selectedVideo != null) {
        VideoPlayerScreen(
            video = selectedVideo!!,
            onBack = { selectedVideo = null }
        )
    } else {
        VideoListView(onVideoClick = { selectedVideo = it })
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun VideoListView(onVideoClick: (VideoLesson) -> Unit) {
    val videos = VideoRepository.getAllVideos()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎥 ویدیوهای آموزشی",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "${videos.size} ویدیو",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF00695C)
                )
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(videos) { video ->
                VideoCard(video) { onVideoClick(video) }
            }
        }
    }
}

@Composable
private fun VideoCard(video: VideoLesson, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(Color(0xFF00695C), Color(0xFF26A69A))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(34.dp)
                )
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    video.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color(0xFF1A237E),
                    maxLines = 1
                )
                Text(
                    video.titlePersian,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    maxLines = 1
                )
                Spacer(Modifier.height(6.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        "⏱ ${video.duration}",
                        fontSize = 10.sp,
                        color = Color(0xFF00695C),
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        "• ${video.level}",
                        fontSize = 10.sp,
                        color = Color(0xFF00695C)
                    )
                }
            }
        }
    }
}