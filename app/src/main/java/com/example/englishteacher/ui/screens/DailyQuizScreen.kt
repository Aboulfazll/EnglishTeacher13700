package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.DailySentencesRepository
import kotlin.random.Random

private val QUIZ_ACCENT = Color(0xFF00897B)

data class DailyQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val categoryEmoji: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DailyQuizScreen(onBack: () -> Unit) {

    val allQuestions: List<DailyQuestion> = remember { generateDailyQuestions() }

    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

    val total = allQuestions.size
    val percentage = if (total > 0) (score.toFloat() / total * 100).toInt() else 0

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎯 کوییز جملات روزمره",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                        Text(
                            "$total سؤال تصادفی",
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = QUIZ_ACCENT)
            )
        }
    ) { padding ->

        // ==================== نتیجه ====================
        if (showResult) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F7FA))
                    .padding(padding)
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.verticalScroll(rememberScrollState())
                ) {
                    Box(
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .background(
                                Brush.linearGradient(
                                    when {
                                        percentage >= 90 -> listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                                        percentage >= 70 -> listOf(Color(0xFFFFA726), Color(0xFFFFD54F))
                                        else -> listOf(Color(0xFFEF5350), Color(0xFFE57373))
                                    }
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                when {
                                    percentage >= 90 -> "🏆"
                                    percentage >= 70 -> "👍"
                                    else -> "💪"
                                },
                                fontSize = 46.sp
                            )
                            Text(
                                "$percentage%",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(Modifier.height(24.dp))

                    Text(
                        text = when {
                            percentage >= 90 -> "🎉 عالی بود!"
                            percentage >= 70 -> "خوب بود!"
                            else -> "نیاز به تمرین بیشتر"
                        },
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )

                    Spacer(Modifier.height(12.dp))

                    Text("امتیاز شما", fontSize = 14.sp, color = Color.Gray)
                    Text(
                        "$score از $total",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = QUIZ_ACCENT
                    )

                    Spacer(Modifier.height(30.dp))

                    Button(
                        onClick = {
                            currentQuestion = 0
                            selectedOption = null
                            score = 0
                            showResult = false
                        },
                        modifier = Modifier.fillMaxWidth().height(56.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = QUIZ_ACCENT)
                    ) {
                        Text("تلاش مجدد", color = Color.White, fontWeight = FontWeight.Bold)
                    }

                    Spacer(Modifier.height(12.dp))

                    OutlinedButton(
                        onClick = onBack,
                        modifier = Modifier.fillMaxWidth().height(56.dp),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text("بازگشت", color = QUIZ_ACCENT, fontWeight = FontWeight.Bold)
                    }
                }
            }
            return@Scaffold
        }

        // ==================== سوال ====================
        if (allQuestions.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize().padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("سوالی موجود نیست")
            }
            return@Scaffold
        }

        val q = allQuestions[currentQuestion]

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "سوال ${currentQuestion + 1} از $total",
                    fontSize = 13.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    "امتیاز: $score",
                    fontSize = 13.sp,
                    color = QUIZ_ACCENT,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(Modifier.height(8.dp))

            LinearProgressIndicator(
                progress = { (currentQuestion + 1).toFloat() / total },
                modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                color = QUIZ_ACCENT,
                trackColor = QUIZ_ACCENT.copy(alpha = 0.15f)
            )

            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(QUIZ_ACCENT.copy(alpha = 0.12f))
                    .padding(horizontal = 10.dp, vertical = 5.dp)
            ) {
                Text(
                    q.categoryEmoji,
                    fontSize = 14.sp,
                    color = QUIZ_ACCENT,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(Modifier.height(14.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(QUIZ_ACCENT.copy(alpha = 0.08f), Color.White)
                            )
                        )
                        .padding(20.dp)
                ) {
                    Text(
                        q.question,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 26.sp,
                        color = Color(0xFF1A237E),
                        textAlign = TextAlign.Start
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            q.options.forEachIndexed { index, option ->
                val isSelected = selectedOption == index
                val isCorrect = index == q.correctIndex
                val showFeedback = selectedOption != null

                val bgColor = when {
                    !showFeedback -> Color.White
                    isCorrect -> Color(0xFFC8E6C9)
                    isSelected -> Color(0xFFFFCDD2)
                    else -> Color.White
                }

                val borderColor = when {
                    !showFeedback -> Color.Transparent
                    isCorrect -> Color(0xFF43A047)
                    isSelected -> Color(0xFFD32F2F)
                    else -> Color.Transparent
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = bgColor),
                    border = androidx.compose.foundation.BorderStroke(2.dp, borderColor),
                    elevation = CardDefaults.cardElevation(if (isSelected) 4.dp else 2.dp),
                    onClick = {
                        if (selectedOption == null) {
                            selectedOption = index
                            if (isCorrect) score++
                        }
                    }
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = isSelected,
                            onClick = {
                                if (selectedOption == null) {
                                    selectedOption = index
                                    if (isCorrect) score++
                                }
                            },
                            colors = RadioButtonDefaults.colors(selectedColor = QUIZ_ACCENT)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            option,
                            fontSize = 15.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            color = Color(0xFF1A237E)
                        )
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            if (selectedOption != null) {
                Button(
                    onClick = {
                        if (currentQuestion < total - 1) {
                            currentQuestion++
                            selectedOption = null
                        } else {
                            showResult = true
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = QUIZ_ACCENT)
                ) {
                    Text(
                        if (currentQuestion < total - 1) "سوال بعدی →" else "دیدن نتیجه 🎉",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }

            Spacer(Modifier.height(30.dp))
        }
    }
}

// ==================== ساخت سوالات ====================

private fun generateDailyQuestions(): List<DailyQuestion> {
    val allCategories = DailySentencesRepository.getAllCategories()
    val questions = mutableListOf<DailyQuestion>()

    // جمع‌آوری همه‌ی جملات
    val allSentences = allCategories.flatMap { cat ->
        cat.sentences.map { s ->
            Triple(s.english, s.persian, "${cat.emoji} ${cat.titlePersian}")
        }
    }

    // انواع سوال:
    // ۱. انگلیسی → معنی فارسی درست
    // ۲. فارسی → معنی انگلیسی درست

    val shuffled = allSentences.shuffled(Random(System.currentTimeMillis())).take(20)

    for ((english, persian, category) in shuffled) {
        val questionType = Random.nextInt(2)

        if (questionType == 0) {
            // انگلیسی → فارسی
            val wrongPersian = allSentences
                .filter { it.first != english }
                .shuffled()
                .take(3)
                .map { it.second }

            if (wrongPersian.size < 3) continue

            val options = (wrongPersian + persian).shuffled()
            val correctIndex = options.indexOf(persian)

            questions.add(
                DailyQuestion(
                    question = "معنی این جمله چیست؟\n\n« $english »",
                    options = options,
                    correctIndex = correctIndex,
                    categoryEmoji = category
                )
            )
        } else {
            // فارسی → انگلیسی
            val wrongEnglish = allSentences
                .filter { it.second != persian }
                .shuffled()
                .take(3)
                .map { it.first }

            if (wrongEnglish.size < 3) continue

            val options = (wrongEnglish + english).shuffled()
            val correctIndex = options.indexOf(english)

            questions.add(
                DailyQuestion(
                    question = "کدام جمله انگلیسی معادل این است؟\n\n« $persian »",
                    options = options,
                    correctIndex = correctIndex,
                    categoryEmoji = category
                )
            )
        }
    }

    return questions.shuffled().take(10)
}