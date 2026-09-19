package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
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
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.Lesson
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.ProgressManager
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonListScreen(
    level: Level,
    onBack: () -> Unit,
    onLessonClick: (String) -> Unit
) {
    val lessons = LessonRepository.getLessonsByLevel(level)
    val context = androidx.compose.ui.platform.LocalContext.current

    var completedLessons by remember { mutableStateOf<Set<String>>(emptySet()) }

    LaunchedEffect(Unit) {
        ProgressManager.getCompletedLessons(context).collectLatest {
            completedLessons = it
        }
    }

    // رنگ‌ها بر اساس سطح
    val (gradient, accent) = when (level) {
        Level.BEGINNER -> listOf(Color(0xFF11998E), Color(0xFF38EF7D)) to Color(0xFF11998E)
        Level.INTERMEDIATE -> listOf(Color(0xFF8E2DE2), Color(0xFFB621FE)) to Color(0xFF8E2DE2)
        Level.ADVANCED -> listOf(Color(0xFFF12711), Color(0xFFF5AF19)) to Color(0xFFF12711)
    }

    val emoji = when (level) {
        Level.BEGINNER -> "🌱"
        Level.INTERMEDIATE -> "🚀"
        Level.ADVANCED -> "🏆"
    }

    val completedCount = lessons.count { it.id in completedLessons }
    val progress = if (lessons.isNotEmpty()) completedCount.toFloat() / lessons.size else 0f

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "$emoji سطح ${level.persianName}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Text(
                            level.bookName,
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.8f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = accent)
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

            // ==================== کارت پیشرفت ====================
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Brush.horizontalGradient(gradient))
                            .padding(20.dp)
                    ) {
                        Column {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column {
                                    Text(
                                        "پیشرفت شما",
                                        color = Color.White.copy(alpha = 0.9f),
                                        fontSize = 13.sp
                                    )
                                    Text(
                                        "$completedCount از ${lessons.size} درس",
                                        color = Color.White,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .size(56.dp)
                                        .clip(CircleShape)
                                        .background(Color.White.copy(alpha = 0.25f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        "${(progress * 100).toInt()}%",
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp
                                    )
                                }
                            }
                            Spacer(Modifier.height(12.dp))
                            LinearProgressIndicator(
                                progress = { progress },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp)),
                                color = Color.White,
                                trackColor = Color.White.copy(alpha = 0.3f)
                            )
                        }
                    }
                }
            }

            // ==================== عنوان لیست ====================
            item {
                Text(
                    text = "📚 همه دروس",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                )
            }

            // ==================== لیست دروس ====================
            itemsIndexed(lessons) { index, lesson ->
                val isCompleted = lesson.id in completedLessons
                BeautifulLessonCard(
                    index = index + 1,
                    lesson = lesson,
                    isCompleted = isCompleted,
                    accent = accent
                ) { onLessonClick(lesson.id) }
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

// ==================== کارت درس زیبا ====================
@Composable
private fun BeautifulLessonCard(
    index: Int,
    lesson: Lesson,
    isCompleted: Boolean,
    accent: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // ==================== شماره/آیکون ====================
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        if (isCompleted) {
                            Brush.linearGradient(
                                listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                            )
                        } else {
                            Brush.linearGradient(
                                listOf(accent.copy(alpha = 0.8f), accent)
                            )
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (isCompleted) {
                    Icon(
                        Icons.Filled.CheckCircle,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                } else {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "Unit",
                            color = Color.White.copy(alpha = 0.85f),
                            fontSize = 9.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            "${lesson.unitNumber}",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(Modifier.width(14.dp))

            // ==================== اطلاعات درس ====================
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lesson.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color(0xFF1A237E),
                    maxLines = 2
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    text = lesson.titlePersian,
                    color = Color.Gray,
                    fontSize = 12.sp,
                    maxLines = 1
                )
                Spacer(Modifier.height(6.dp))

                // برچسب‌های کوچک
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    SmallBadge("📖 ${lesson.vocabulary.size}", Color(0xFFE8EAF6), Color(0xFF1A237E))
                    if (lesson.spelling.isNotEmpty()) {
                        SmallBadge("🔤 هجی", Color(0xFFF3E5F5), Color(0xFF7B1FA2))
                    }
                }
            }

            // ==================== فلش ====================
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(
                        if (isCompleted) Color(0xFFE8F5E9) else Color(0xFFE8EAF6)
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (isCompleted) {
                    Text("✓", color = Color(0xFF2E7D32), fontWeight = FontWeight.Bold, fontSize = 18.sp)
                } else {
                    Icon(
                        Icons.Filled.PlayArrow,
                        contentDescription = null,
                        tint = accent,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

// ==================== برچسب کوچک ====================
@Composable
private fun SmallBadge(text: String, bg: Color, fg: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(bg)
            .padding(horizontal = 8.dp, vertical = 3.dp)
    ) {
        Text(
            text = text,
            fontSize = 10.sp,
            color = fg,
            fontWeight = FontWeight.SemiBold
        )
    }
}