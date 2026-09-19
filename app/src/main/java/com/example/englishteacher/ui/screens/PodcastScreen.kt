package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.Podcast
import com.example.englishteacher.data.PodcastRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastScreen(onPodcastClick: (String, String) -> Unit) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("پادکست‌ها", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "برای یادگیری بهتر",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.8f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1A237E))
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FA))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE8EAF6))
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Filled.Headphones,
                            contentDescription = null,
                            tint = Color(0xFF1A237E),
                            modifier = Modifier.size(32.dp)
                        )
                        Spacer(Modifier.width(12.dp))
                        Text(
                            "پادکست‌های منتخب برای یادگیری انگلیسی",
                            fontSize = 14.sp,
                            color = Color(0xFF1A237E),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            val groupedPodcasts = PodcastRepository.getAllPodcasts().groupBy { it.category }

            groupedPodcasts.forEach { (category, podcasts) ->
                item {
                    Text(
                        category,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E),
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }

                items(podcasts) { podcast ->
                    PodcastCard(podcast, onPodcastClick)
                }
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

@Composable
private fun PodcastCard(podcast: Podcast, onClick: (String, String) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick(podcast.url, podcast.title) },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(podcast.color1),
                                Color(podcast.color2)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.Headphones,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    podcast.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    maxLines = 2
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    podcast.titlePersian,
                    color = Color.Gray,
                    fontSize = 12.sp,
                    maxLines = 2
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "🎧 ${podcast.episodeCount} قسمت",
                    fontSize = 11.sp,
                    color = Color(0xFF1A237E)
                )
            }

            Icon(
                Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = Color(0xFF1A237E),
                modifier = Modifier.size(36.dp)
            )
        }
    }
}