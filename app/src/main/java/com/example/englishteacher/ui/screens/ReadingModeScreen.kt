package com.example.englishteacher.ui.screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.DailySentencesRepository
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import kotlinx.coroutines.delay

data class ReadingLine(
    val english: String,
    val persian: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingModeScreen(
    lessonId: String,
    categoryId: String,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    // ==================== بارگذاری داده ====================
    val readingData = remember(lessonId, categoryId) {
        when {
            lessonId.isNotEmpty() -> {
                val lesson = LessonRepository.getLessonById(lessonId)
                if (lesson != null) {
                    val accent = when (lesson.level) {
                        Level.BEGINNER -> Color(0xFF11998E)
                        Level.INTERMEDIATE -> Color(0xFF8E2DE2)
                        Level.ADVANCED -> Color(0xFFF12711)
                    }
                    ReadingData(
                        title = "💬 ${lesson.conversation.title}",
                        subtitle = lesson.titlePersian,
                        accent = accent,
                        lines = lesson.conversation.lines.map {
                            ReadingLine(it.english, it.persian)
                        }
                    )
                } else emptyData()
            }
            categoryId.isNotEmpty() -> {
                val category = DailySentencesRepository.getAllCategories()
                    .firstOrNull { it.id == categoryId }
                if (category != null) {
                    ReadingData(
                        title = "${category.emoji} ${category.titlePersian}",
                        subtitle = "${category.sentences.size} جمله",
                        accent = Color(category.color),
                        lines = category.sentences.map {
                            ReadingLine(it.english, it.persian)
                        }
                    )
                } else emptyData()
            }
            else -> emptyData()
        }
    }

    val accent = readingData.accent
    val total = readingData.lines.size

    var currentIndex by remember { mutableIntStateOf(0) }
    var isAutoPlay by remember { mutableStateOf(false) }
    var repeatMode by remember { mutableStateOf(false) }
    var showAnswer by remember { mutableStateOf(true) }

    // انیمیشن پیشرفت
    val progress = if (total > 0) (currentIndex + 1).toFloat() / total else 0f
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(400),
        label = "readingProgress"
    )

    // ==================== منطق پخش خودکار ====================
    LaunchedEffect(currentIndex, isAutoPlay) {
        if (isAutoPlay && total > 0) {
            val line = readingData.lines[currentIndex]
            speechHelper.speak(line.english)

            // تخمین زمان بر اساس تعداد کلمات
            val wordCount = line.english.split(Regex("\\s+")).size
            val delayMs = (wordCount * 500L + 1500L).coerceAtLeast(2500L)

            delay(delayMs)

            if (isAutoPlay) {
                if (currentIndex < total - 1) {
                    currentIndex++
                } else {
                    if (repeatMode) {
                        currentIndex = 0
                    } else {
                        isAutoPlay = false
                    }
                }
            }
        }
    }

    if (total == 0) {
        Box(
            modifier = Modifier.fillMaxSize().background(Color(0xFFF5F7FA)),
            contentAlignment = Alignment.Center
        ) {
            Text("محتوایی موجود نیست", color = Color.Gray)
        }
        return
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            readingData.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            maxLines = 1,
                            color = Color.White
                        )
                        Text(
                            readingData.subtitle,
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        isAutoPlay = false
                        speechHelper.stop()
                        onBack()
                    }) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    // دکمه تکرار
                    IconButton(onClick = { repeatMode = !repeatMode }) {
                        Icon(
                            Icons.Filled.Repeat,
                            contentDescription = "Repeat",
                            tint = if (repeatMode) Color(0xFFFFD54F) else Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = accent)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // ==================== نوار پیشرفت ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "جمله ${currentIndex + 1} از $total",
                    fontSize = 13.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold
                )
                if (repeatMode) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFFFD54F).copy(alpha = 0.2f))
                            .padding(horizontal = 8.dp, vertical = 3.dp)
                    ) {
                        Text(
                            "🔁 تکرار فعال",
                            fontSize = 10.sp,
                            color = Color(0xFFE65100),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            LinearProgressIndicator(
                progress = { animatedProgress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = accent,
                trackColor = accent.copy(alpha = 0.15f)
            )

            Spacer(Modifier.height(30.dp))

            // ==================== کارت جمله ====================
            AnimatedContent(
                targetState = currentIndex,
                transitionSpec = {
                    if (targetState > initialState) {
                        (slideInHorizontally { it } + fadeIn()) togetherWith
                                (slideOutHorizontally { -it } + fadeOut())
                    } else {
                        (slideInHorizontally { -it } + fadeIn()) togetherWith
                                (slideOutHorizontally { it } + fadeOut())
                    }
                },
                label = "sentenceCard"
            ) { index ->
                val line = readingData.lines[index]

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false),
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Brush.verticalGradient(
                                    listOf(
                                        accent.copy(alpha = 0.05f),
                                        Color.White
                                    )
                                )
                            )
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        // آیکون بالا
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(CircleShape)
                                .background(accent.copy(alpha = 0.12f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("💬", fontSize = 26.sp)
                        }

                        Spacer(Modifier.height(24.dp))

                        // جمله انگلیسی
                        Text(
                            line.english,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E),
                            textAlign = TextAlign.Center,
                            lineHeight = 34.sp
                        )

                        Spacer(Modifier.height(8.dp))

                        // آیکون اسپیکر
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .clickable {
                                    speechHelper.speak(line.english)
                                }
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                Icons.AutoMirrored.Filled.VolumeUp,
                                contentDescription = null,
                                tint = accent,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                "دوباره پخش کن",
                                fontSize = 12.sp,
                                color = accent,
                                fontWeight = FontWeight.SemiBold
                            )
                        }

                        Spacer(Modifier.height(20.dp))

                        // جداکننده
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .height(2.dp)
                                .clip(RoundedCornerShape(1.dp))
                                .background(accent.copy(alpha = 0.2f))
                        )

                        Spacer(Modifier.height(20.dp))

                        // ترجمه فارسی
                        if (showAnswer) {
                            Text(
                                line.persian,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                color = accent,
                                textAlign = TextAlign.Center,
                                lineHeight = 26.sp
                            )
                        } else {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(accent.copy(alpha = 0.1f))
                                    .clickable { showAnswer = true }
                                    .padding(horizontal = 16.dp, vertical = 8.dp)
                            ) {
                                Text(
                                    "👆 نمایش ترجمه",
                                    fontSize = 13.sp,
                                    color = accent,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== کنترل‌های پخش ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // قبلی
                IconButton(
                    onClick = {
                        if (currentIndex > 0) currentIndex--
                        showAnswer = true
                    },
                    enabled = currentIndex > 0,
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(
                            if (currentIndex > 0) accent.copy(alpha = 0.12f)
                            else Color(0xFFEEEEEE)
                        )
                ) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Previous",
                        tint = if (currentIndex > 0) accent else Color.Gray,
                        modifier = Modifier.size(26.dp)
                    )
                }

                // پخش/توقف
                IconButton(
                    onClick = {
                        if (isAutoPlay) {
                            isAutoPlay = false
                            speechHelper.stop()
                        } else {
                            isAutoPlay = true
                        }
                    },
                    modifier = Modifier
                        .size(78.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(
                                listOf(accent, accent.copy(alpha = 0.7f))
                            )
                        )
                ) {
                    Icon(
                        if (isAutoPlay) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.White,
                        modifier = Modifier.size(36.dp)
                    )
                }

                // بعدی
                IconButton(
                    onClick = {
                        if (currentIndex < total - 1) currentIndex++
                        showAnswer = true
                    },
                    enabled = currentIndex < total - 1,
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(
                            if (currentIndex < total - 1) accent.copy(alpha = 0.12f)
                            else Color(0xFFEEEEEE)
                        )
                ) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "Next",
                        tint = if (currentIndex < total - 1) accent else Color.Gray,
                        modifier = Modifier.size(26.dp)
                    )
                }
            }

            Spacer(Modifier.height(14.dp))

            // ==================== وضعیت ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.White)
                        .clickable { showAnswer = !showAnswer }
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Speed,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        if (showAnswer) "ترجمه فعال" else "ترجمه مخفی",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.White)
                        .clickable {
                            currentIndex = 0
                            showAnswer = true
                        }
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Refresh,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        "از اول",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

// ==================== داده ====================

private data class ReadingData(
    val title: String,
    val subtitle: String,
    val accent: Color,
    val lines: List<ReadingLine>
)

private fun emptyData() = ReadingData(
    title = "خوانش",
    subtitle = "",
    accent = Color(0xFF00695C),
    lines = emptyList()
)