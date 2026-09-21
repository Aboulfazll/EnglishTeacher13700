package com.example.englishteacher.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Refresh
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
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.StoryBookRepository
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChapterQuizScreen(
    storyId: String,
    chapterNumber: Int,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val story = remember { StoryBookRepository.getAllStories().firstOrNull { it.id == storyId } }
    val chapter = remember {
        story?.chapters?.firstOrNull { it.number == chapterNumber }
    }

    if (story == null || chapter == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("فصل پیدا نشد")
        }
        return
    }

    val questions = chapter.quiz
    if (questions.isEmpty()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("📝", fontSize = 64.sp)
                Spacer(Modifier.height(16.dp))
                Text("کوییز این فصل هنوز آماده نشده", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(12.dp))
                Button(onClick = onBack) {
                    Text("بازگشت")
                }
            }
        }
        return
    }

    val levelColor = when (story.level) {
        Level.BEGINNER -> Color(0xFF11998E)
        Level.INTERMEDIATE -> Color(0xFF8E2DE2)
        Level.ADVANCED -> Color(0xFFF12711)
        else -> Color(0xFFE91E63)
    }

    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableIntStateOf(-1) }
    var showResult by remember { mutableStateOf(false) }
    var correctCount by remember { mutableIntStateOf(0) }
    var quizFinished by remember { mutableStateOf(false) }

    val currentQuestion = questions[currentQuestionIndex]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "📝 کوییز فصل ${chapter.number}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.White
                        )
                        Text(
                            "سوال ${currentQuestionIndex + 1} از ${questions.size}",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = levelColor)
            )
        }
    ) { padding ->

        if (quizFinished) {
            QuizResultScreen(
                correctCount = correctCount,
                totalQuestions = questions.size,
                levelColor = levelColor,
                padding = padding,
                onRetry = {
                    currentQuestionIndex = 0
                    selectedAnswer = -1
                    showResult = false
                    correctCount = 0
                    quizFinished = false
                },
                onBack = onBack
            )
            return@Scaffold
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {

            // ==================== نوار پیشرفت ====================
            LinearProgressIndicator(
                progress = { (currentQuestionIndex + 1).toFloat() / questions.size },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = levelColor,
                trackColor = levelColor.copy(alpha = 0.15f)
            )

            Spacer(Modifier.height(20.dp))

            // ==================== سوال ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(levelColor.copy(alpha = 0.12f))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            "سوال ${currentQuestionIndex + 1}",
                            fontSize = 11.sp,
                            color = levelColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    Text(
                        currentQuestion.question,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 26.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        currentQuestion.questionPersian,
                        fontSize = 13.sp,
                        color = Color.Gray,
                        lineHeight = 22.sp
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== گزینه‌ها ====================
            currentQuestion.options.forEachIndexed { index, option ->
                val isSelected = selectedAnswer == index
                val isCorrect = index == currentQuestion.correctIndex

                val bgColor = when {
                    !showResult && isSelected -> levelColor.copy(alpha = 0.15f)
                    !showResult -> MaterialTheme.colorScheme.surface
                    showResult && isCorrect -> Color(0xFF43A047).copy(alpha = 0.15f)
                    showResult && isSelected && !isCorrect -> Color(0xFFE53935).copy(alpha = 0.15f)
                    else -> MaterialTheme.colorScheme.surface
                }

                val borderColor = when {
                    !showResult && isSelected -> levelColor
                    !showResult -> Color.Transparent
                    showResult && isCorrect -> Color(0xFF43A047)
                    showResult && isSelected && !isCorrect -> Color(0xFFE53935)
                    else -> Color.Transparent
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp)
                        .clickable(enabled = !showResult) {
                            selectedAnswer = index
                            showResult = true
                            if (isCorrect) correctCount++
                        },
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = bgColor),
                    elevation = CardDefaults.cardElevation(if (isSelected) 4.dp else 1.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(
                                    when {
                                        showResult && isCorrect -> Color(0xFF43A047)
                                        showResult && isSelected && !isCorrect -> Color(0xFFE53935)
                                        isSelected -> levelColor
                                        else -> MaterialTheme.colorScheme.surfaceVariant
                                    }
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            when {
                                showResult && isCorrect -> Icon(
                                    Icons.Filled.Check,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(20.dp)
                                )
                                showResult && isSelected && !isCorrect -> Icon(
                                    Icons.Filled.Close,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(20.dp)
                                )
                                else -> Text(
                                    "${('A' + index)}",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                        Spacer(Modifier.width(14.dp))
                        Text(
                            option,
                            fontSize = 15.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== توضیح پاسخ ====================
            AnimatedVisibility(
                visible = showResult && currentQuestion.explanation.isNotEmpty(),
                enter = fadeIn()
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF1E88E5).copy(alpha = 0.1f)
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text("💡", fontSize = 20.sp)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            currentQuestion.explanation,
                            fontSize = 13.sp,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 20.sp
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== دکمه بعدی ====================
            if (showResult) {
                Button(
                    onClick = {
                        if (currentQuestionIndex < questions.size - 1) {
                            currentQuestionIndex++
                            selectedAnswer = -1
                            showResult = false
                        } else {
                            // پایان کوییز
                            quizFinished = true
                            val scorePercent = (correctCount * 100) / questions.size
                            scope.launch {
                                ProgressManager.addStars(context, scorePercent / 10)
                            }
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = levelColor)
                ) {
                    Text(
                        if (currentQuestionIndex < questions.size - 1) "سوال بعدی →"
                        else "دیدن نتیجه 🎉",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

// ==================== صفحه نتیجه ====================
@Composable
private fun QuizResultScreen(
    correctCount: Int,
    totalQuestions: Int,
    levelColor: Color,
    padding: PaddingValues,
    onRetry: () -> Unit,
    onBack: () -> Unit
) {
    val percent = (correctCount * 100) / totalQuestions

    val (emoji, title, message) = when {
        percent >= 90 -> Triple("🏆", "فوق‌العاده!", "تسلط کامل داری!")
        percent >= 70 -> Triple("👍", "عالی بود!", "ادامه بده تا کامل بشه.")
        percent >= 50 -> Triple("💪", "خوب بود!", "با یه بار دیگه خوندن بهتر می‌شی.")
        else -> Triple("📚", "نیاز به تلاش بیشتر", "یه بار دیگه فصل رو بخون.")
    }

    val animatedScale by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(800),
        label = "resultScale"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(padding)
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.height(40.dp))

        Box(
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(
                        listOf(levelColor, levelColor.copy(alpha = 0.6f))
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(emoji, fontSize = 72.sp)
        }

        Spacer(Modifier.height(24.dp))

        Text(
            title,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = levelColor
        )

        Spacer(Modifier.height(8.dp))

        Text(
            message,
            fontSize = 15.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(32.dp))

        // ==================== نمره ====================
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("نمره شما", fontSize = 13.sp, color = Color.Gray)
                Spacer(Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.Bottom) {
                    Text(
                        "$percent",
                        fontSize = 56.sp,
                        fontWeight = FontWeight.Bold,
                        color = levelColor
                    )
                    Text(
                        "%",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = levelColor,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )
                }
                Spacer(Modifier.height(12.dp))
                Text(
                    "$correctCount از $totalQuestions سوال درست",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        // ==================== ستاره‌های گرفته‌شده ====================
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFD54F).copy(alpha = 0.2f)
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    Icons.Filled.EmojiEvents,
                    contentDescription = null,
                    tint = Color(0xFFFFA000),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    "+${percent / 10} امتیاز گرفتی!",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE65100)
                )
            }
        }

        Spacer(Modifier.height(32.dp))

        // ==================== دکمه‌ها ====================
        Button(
            onClick = onRetry,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = levelColor)
        ) {
            Icon(
                Icons.Filled.Refresh,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(Modifier.width(8.dp))
            Text(
                "تلاش دوباره",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }

        Spacer(Modifier.height(12.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = levelColor)
        ) {
            Text(
                "بازگشت به داستان",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }

        Spacer(Modifier.height(30.dp))
    }
}