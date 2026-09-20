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
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
    onLessonClick: (String) -> Unit,
    onGroupQuizClick: (Int) -> Unit = {}
) {
    val lessons = LessonRepository.getLessonsByLevel(level)
    val context = LocalContext.current

    var completedLessons by remember { mutableStateOf<Set<String>>(emptySet()) }
    var groupScores by remember { mutableStateOf<Map<String, Int>>(emptyMap()) }

    LaunchedEffect(Unit) {
        ProgressManager.getCompletedLessons(context).collectLatest {
            completedLessons = it
        }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getAllGroupScores(context).collectLatest {
            groupScores = it
        }
    }

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

    // گروه‌بندی درس‌ها
    val groupSize = ProgressManager.GROUP_SIZE
    val totalGroups = (lessons.size + groupSize - 1) / groupSize

    val completedCount = lessons.count { it.id in completedLessons }
    val progress = if (lessons.isNotEmpty()) completedCount.toFloat() / lessons.size else 0f

    fun isGroupPassed(groupIdx: Int): Boolean {
        val key = "${level.name}_g$groupIdx"
        return (groupScores[key] ?: 0) >= ProgressManager.PASSING_SCORE
    }

    fun isGroupUnlocked(groupIdx: Int): Boolean {
        if (groupIdx == 0) return true
        return isGroupPassed(groupIdx - 1)
    }

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

            // ==================== راهنمای قوانین ====================
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = accent.copy(alpha = 0.08f)
                    ),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("💡", fontSize = 22.sp)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "برای باز شدن هر گروه، باید امتحان گروه قبلی رو با نمره ${ProgressManager.PASSING_SCORE}% یا بالاتر پاس کنی",
                            fontSize = 11.sp,
                            color = accent,
                            lineHeight = 18.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            // ==================== گروه‌ها ====================
            for (groupIdx in 0 until totalGroups) {
                val start = groupIdx * groupSize
                val end = minOf(start + groupSize, lessons.size)
                val groupLessons = lessons.subList(start, end)
                val groupPassed = isGroupPassed(groupIdx)
                val groupUnlocked = isGroupUnlocked(groupIdx)
                val groupScore = groupScores["${level.name}_g$groupIdx"]
                val groupLabel = "گروه ${groupIdx + 1}"

                // --- عنوان گروه ---
                item {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 12.dp, bottom = 4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(4.dp, 22.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(
                                    when {
                                        groupPassed -> Color(0xFF43A047)
                                        !groupUnlocked -> Color.Gray
                                        else -> accent
                                    }
                                )
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            groupLabel,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = when {
                                groupPassed -> Color(0xFF2E7D32)
                                !groupUnlocked -> Color.Gray
                                else -> Color(0xFF1A237E)
                            }
                        )
                        Spacer(Modifier.width(8.dp))
                        if (groupPassed) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(Color(0xFFE8F5E9))
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    "✅ ${groupScore ?: 0}%",
                                    fontSize = 10.sp,
                                    color = Color(0xFF2E7D32),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        } else if (!groupUnlocked) {
                            Icon(
                                Icons.Filled.Lock,
                                contentDescription = null,
                                tint = Color.Gray,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                    }
                }

                // --- درس‌های گروه ---
                itemsIndexed(groupLessons) { idx, lesson ->
                    val isCompleted = lesson.id in completedLessons
                    BeautifulLessonCard(
                        index = start + idx + 1,
                        lesson = lesson,
                        isCompleted = isCompleted,
                        isLocked = !groupUnlocked,
                        accent = accent
                    ) {
                        if (groupUnlocked) onLessonClick(lesson.id)
                    }
                }

                // --- کارت امتحان گروه ---
                item {
                    GroupQuizCard(
                        groupIndex = groupIdx,
                        isUnlocked = groupUnlocked,
                        isPassed = groupPassed,
                        score = groupScore,
                        accent = accent,
                        gradient = gradient
                    ) { onGroupQuizClick(groupIdx) }
                }
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

// ==================== کارت امتحان گروه ====================
@Composable
private fun GroupQuizCard(
    groupIndex: Int,
    isUnlocked: Boolean,
    isPassed: Boolean,
    score: Int?,
    accent: Color,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = isUnlocked) { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(if (isUnlocked) 5.dp else 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = when {
                !isUnlocked -> Color(0xFFEEEEEE)
                isPassed -> Color(0xFFE8F5E9)
                else -> Color.White
            }
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // آیکون
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(
                        when {
                            !isUnlocked -> Brush.linearGradient(
                                listOf(Color(0xFFBDBDBD), Color(0xFF9E9E9E))
                            )
                            isPassed -> Brush.linearGradient(
                                listOf(Color(0xFF43A047), Color(0xFF66BB6A))
                            )
                            else -> Brush.linearGradient(gradient)
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                when {
                    !isUnlocked -> Icon(
                        Icons.Filled.Lock,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                    isPassed -> Icon(
                        Icons.Filled.CheckCircle,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                    else -> Icon(
                        Icons.Filled.Quiz,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                }
            }

            Spacer(Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    "📝 امتحان گروه ${groupIndex + 1}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = when {
                        !isUnlocked -> Color.Gray
                        isPassed -> Color(0xFF2E7D32)
                        else -> Color(0xFF1A237E)
                    }
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = when {
                        !isUnlocked -> "اول گروه قبلی رو پاس کن"
                        isPassed -> "قبولی ✅ — می‌تونی دوباره امتحان بدی"
                        else -> "برای باز شدن گروه بعدی، این امتحان رو پاس کن"
                    },
                    fontSize = 11.sp,
                    color = when {
                        !isUnlocked -> Color.Gray
                        isPassed -> Color(0xFF2E7D32).copy(alpha = 0.8f)
                        else -> Color.Gray
                    },
                    lineHeight = 16.sp
                )
                if (isPassed && score != null) {
                    Spacer(Modifier.height(6.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFC8E6C9))
                            .padding(horizontal = 8.dp, vertical = 3.dp)
                    ) {
                        Text(
                            "امتیاز: $score%",
                            fontSize = 10.sp,
                            color = Color(0xFF2E7D32),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(
                        when {
                            !isUnlocked -> Color(0xFFE0E0E0)
                            isPassed -> Color(0xFFC8E6C9)
                            else -> accent.copy(alpha = 0.12f)
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    when {
                        !isUnlocked -> "🔒"
                        isPassed -> "🔄"
                        else -> "→"
                    },
                    color = when {
                        !isUnlocked -> Color.Gray
                        isPassed -> Color(0xFF2E7D32)
                        else -> accent
                    },
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

// ==================== کارت درس ====================
@Composable
private fun BeautifulLessonCard(
    index: Int,
    lesson: Lesson,
    isCompleted: Boolean,
    isLocked: Boolean,
    accent: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = !isLocked) { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(if (isLocked) 2.dp else 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isLocked) Color(0xFFF5F5F5) else Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // شماره/آیکون
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        when {
                            isLocked -> Brush.linearGradient(
                                listOf(Color(0xFFBDBDBD), Color(0xFF9E9E9E))
                            )
                            isCompleted -> Brush.linearGradient(
                                listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                            )
                            else -> Brush.linearGradient(
                                listOf(accent.copy(alpha = 0.8f), accent)
                            )
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                when {
                    isLocked -> Icon(
                        Icons.Filled.Lock,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(26.dp)
                    )
                    isCompleted -> Icon(
                        Icons.Filled.CheckCircle,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                    else -> Column(
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

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lesson.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = if (isLocked) Color.Gray else Color(0xFF1A237E),
                    maxLines = 2
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    text = lesson.titlePersian,
                    color = Color.Gray,
                    fontSize = 12.sp,
                    maxLines = 1
                )

                if (!isLocked) {
                    Spacer(Modifier.height(6.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        SmallBadge(
                            "📖 ${lesson.vocabulary.size}",
                            Color(0xFFE8EAF6),
                            Color(0xFF1A237E)
                        )
                        if (lesson.spelling.isNotEmpty()) {
                            SmallBadge("🔤 هجی", Color(0xFFF3E5F5), Color(0xFF7B1FA2))
                        }
                    }
                }
            }

            // فلش
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(
                        when {
                            isLocked -> Color(0xFFE0E0E0)
                            isCompleted -> Color(0xFFE8F5E9)
                            else -> Color(0xFFE8EAF6)
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                when {
                    isLocked -> Icon(
                        Icons.Filled.Lock,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.size(18.dp)
                    )
                    isCompleted -> Text(
                        "✓",
                        color = Color(0xFF2E7D32),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    else -> Icon(
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