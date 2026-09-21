package com.example.englishteacher.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.Podcast
import com.example.englishteacher.data.PodcastCategory
import com.example.englishteacher.data.PodcastLevel
import com.example.englishteacher.data.PodcastRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastScreen(
    onPodcastClick: (url: String, title: String) -> Unit
) {
    val context = LocalContext.current
    val allPodcasts = remember { PodcastRepository.getAllPodcasts() }

    var selectedLevel by remember { mutableStateOf<PodcastLevel?>(null) }
    var selectedCategory by remember { mutableStateOf<PodcastCategory?>(null) }
    var searchQuery by remember { mutableStateOf("") }
    var showSearch by remember { mutableStateOf(false) }

    val filteredPodcasts = remember(selectedLevel, selectedCategory, searchQuery) {
        allPodcasts.filter { podcast ->
            val matchesLevel = selectedLevel == null || podcast.level == selectedLevel
            val matchesCategory = selectedCategory == null || podcast.category == selectedCategory
            val matchesSearch = searchQuery.isEmpty() ||
                    podcast.title.contains(searchQuery, ignoreCase = true) ||
                    podcast.titlePersian.contains(searchQuery) ||
                    podcast.description.contains(searchQuery, ignoreCase = true)
            matchesLevel && matchesCategory && matchesSearch
        }
    }

    val beginnerCount = remember { PodcastRepository.getCountByLevel(PodcastLevel.BEGINNER) }
    val intermediateCount = remember { PodcastRepository.getCountByLevel(PodcastLevel.INTERMEDIATE) }
    val advancedCount = remember { PodcastRepository.getCountByLevel(PodcastLevel.ADVANCED) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    if (showSearch) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = {
                                Text(
                                    "جستجوی پادکست...",
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontSize = 14.sp
                                )
                            },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.White,
                                unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                                cursorColor = Color.White
                            )
                        )
                    } else {
                        Column {
                            Text(
                                "🎧 پادکست‌ها",
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "${allPodcasts.size} پادکست در ۳ سطح",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.85f)
                            )
                        }
                    }
                },
                navigationIcon = {
                    AnimatedVisibility(
                        visible = showSearch,
                        enter = scaleIn(),
                        exit = scaleOut()
                    ) {
                        IconButton(onClick = {
                            showSearch = false
                            searchQuery = ""
                        }) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    }
                },
                actions = {
                    IconButton(onClick = { showSearch = !showSearch }) {
                        Icon(
                            if (showSearch) Icons.Filled.Close else Icons.Filled.Search,
                            contentDescription = "Search",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFEF6C00))
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            // ==================== کارت آمار ====================
            item {
                PodcastStatsCard(
                    total = allPodcasts.size,
                    beginner = beginnerCount,
                    intermediate = intermediateCount,
                    advanced = advancedCount
                )
            }

            // ==================== فیلتر سطوح ====================
            item {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(4.dp, 20.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(Color(0xFFEF6C00))
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "📊 انتخاب سطح",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item {
                            LevelChip(
                                emoji = "🎧",
                                label = "همه",
                                count = allPodcasts.size,
                                selected = selectedLevel == null,
                                color = Color(0xFFEF6C00)
                            ) { selectedLevel = null }
                        }
                        items(PodcastLevel.values().toList()) { level ->
                            LevelChip(
                                emoji = level.emoji,
                                label = level.persianName,
                                count = when (level) {
                                    PodcastLevel.BEGINNER -> beginnerCount
                                    PodcastLevel.INTERMEDIATE -> intermediateCount
                                    PodcastLevel.ADVANCED -> advancedCount
                                },
                                selected = selectedLevel == level,
                                color = Color(level.color)
                            ) { selectedLevel = level }
                        }
                    }
                }
            }

            // ==================== فیلتر دسته‌بندی ====================
            item {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(4.dp, 20.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(Color(0xFF6A1B9A))
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "🎯 دسته‌بندی",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        item {
                            CategoryChip(
                                emoji = "🌟",
                                label = "همه",
                                selected = selectedCategory == null
                            ) { selectedCategory = null }
                        }
                        items(PodcastCategory.values().toList()) { cat ->
                            CategoryChip(
                                emoji = cat.emoji,
                                label = cat.persianName,
                                selected = selectedCategory == cat
                            ) { selectedCategory = cat }
                        }
                    }
                }
            }

            // ==================== شمارنده نتایج ====================
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(4.dp, 20.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color(0xFF00897B))
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        "📻 ${filteredPodcasts.size} پادکست",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                }
            }

            // ==================== لیست پادکست‌ها ====================
            if (filteredPodcasts.isEmpty()) {
                item {
                    EmptyPodcastsState(searchQuery)
                }
            } else {
                items(filteredPodcasts, key = { it.id }) { podcast ->
                    PodcastCard(
                        podcast = podcast,
                        onClick = {
                            onPodcastClick(podcast.audioUrl, podcast.title)
                        }
                    )
                }
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

// ==================== کارت آمار ====================
@Composable
private fun PodcastStatsCard(
    total: Int,
    beginner: Int,
    intermediate: Int,
    advanced: Int
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        listOf(Color(0xFFEF6C00), Color(0xFFFFB74D))
                    )
                )
                .padding(20.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.Headphones,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Spacer(Modifier.width(14.dp))
                    Column {
                        Text(
                            "کتابخانه صوتی",
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                        Text(
                            "$total پادکست آموزشی",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    StatBox(
                        emoji = "🌱",
                        count = beginner,
                        label = "مبتدی",
                        modifier = Modifier.weight(1f)
                    )
                    StatBox(
                        emoji = "🚀",
                        count = intermediate,
                        label = "متوسط",
                        modifier = Modifier.weight(1f)
                    )
                    StatBox(
                        emoji = "🏆",
                        count = advanced,
                        label = "پیشرفته",
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
private fun StatBox(
    emoji: String,
    count: Int,
    label: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White.copy(alpha = 0.2f))
            .padding(vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(emoji, fontSize = 20.sp)
        Spacer(Modifier.height(2.dp))
        Text(
            "$count",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            label,
            fontSize = 10.sp,
            color = Color.White.copy(alpha = 0.9f)
        )
    }
}

// ==================== Level Chip ====================
@Composable
private fun LevelChip(
    emoji: String,
    label: String,
    count: Int,
    selected: Boolean,
    color: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .height(70.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(if (selected) 8.dp else 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selected) color else Color.White
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(emoji, fontSize = 16.sp)
                Spacer(Modifier.width(4.dp))
                Text(
                    label,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (selected) Color.White else Color(0xFF1A237E)
                )
            }
            Spacer(Modifier.height(2.dp))
            Text(
                "$count پادکست",
                fontSize = 10.sp,
                color = if (selected) Color.White.copy(alpha = 0.9f) else Color.Gray
            )
        }
    }
}

// ==================== Category Chip ====================
@Composable
private fun CategoryChip(
    emoji: String,
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(
                if (selected) Color(0xFF6A1B9A) else Color.White
            )
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(emoji, fontSize = 13.sp)
            Spacer(Modifier.width(4.dp))
            Text(
                label,
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
                color = if (selected) Color.White else Color(0xFF424242)
            )
        }
    }
}

// ==================== Podcast Card ====================
@Composable
private fun PodcastCard(
    podcast: Podcast,
    onClick: () -> Unit
) {
    val levelColor = Color(podcast.level.color)

    var pressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(
        targetValue = if (pressed) 0.97f else 1f,
        animationSpec = tween(150),
        label = "podcastScale"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                pressed = true
                onClick()
            },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // کاور
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(14.dp))
            ) {
                if (podcast.coverUrl.isNotEmpty()) {
                    AsyncImage(
                        model = podcast.coverUrl,
                        contentDescription = podcast.title,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    listOf(levelColor, levelColor.copy(alpha = 0.6f))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(podcast.level.emoji, fontSize = 36.sp)
                    }
                }

                // دکمه Play روی کاور
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.95f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.PlayArrow,
                            contentDescription = "Play",
                            tint = levelColor,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }

            Spacer(Modifier.width(12.dp))

            // اطلاعات
            Column(modifier = Modifier.weight(1f)) {
                // ردیف سطح + دسته + زمان
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(levelColor.copy(alpha = 0.12f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            "${podcast.level.emoji} ${podcast.level.persianName}",
                            fontSize = 9.sp,
                            color = levelColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(4.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFFF5F5F5))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            "${podcast.category.emoji} ${podcast.category.persianName}",
                            fontSize = 9.sp,
                            color = Color(0xFF616161),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Spacer(Modifier.height(6.dp))

                Text(
                    podcast.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF1A237E),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    podcast.titlePersian,
                    fontSize = 11.sp,
                    color = Color.Gray,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(Modifier.height(6.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Filled.AccessTime,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        "${podcast.durationMinutes} دقیقه",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        "• ${podcast.source}",
                        fontSize = 9.sp,
                        color = Color.Gray,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

// ==================== حالت خالی ====================
@Composable
private fun EmptyPodcastsState(searchQuery: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFFF3E0)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.Headphones,
                    contentDescription = null,
                    tint = Color(0xFFEF6C00),
                    modifier = Modifier.size(50.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                if (searchQuery.isEmpty()) "پادکستی پیدا نشد"
                else "نتیجه‌ای برای «$searchQuery» نیست",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E),
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "فیلترها رو تغییر بده یا عبارت دیگه‌ای جستجو کن",
                fontSize = 12.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}تال