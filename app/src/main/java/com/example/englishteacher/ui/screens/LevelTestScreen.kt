package com.example.englishteacher.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
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

data class LevelQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val level: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelTestScreen(onBack: () -> Unit) {

    var selectedAnswer by remember { mutableStateOf<Int?>(null) }
    var currentQuestion by remember { mutableIntStateOf(0) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

    val questions = listOf(
        // مبتدی
        LevelQuestion(
            "What ___ your name?",
            listOf("is", "are", "am", "be"),
            0, "مبتدی"
        ),
        LevelQuestion(
            "She ___ a teacher.",
            listOf("are", "is", "am", "be"),
            1, "مبتدی"
        ),
        LevelQuestion(
            "I ___ from Iran.",
            listOf("is", "are", "am", "be"),
            2, "مبتدی"
        ),
        LevelQuestion(
            "This is ___ apple.",
            listOf("a", "an", "the", "-"),
            1, "مبتدی"
        ),
        LevelQuestion(
            "They ___ football every day.",
            listOf("plays", "play", "playing", "played"),
            1, "مبتدی"
        ),
        // متوسط
        LevelQuestion(
            "I ___ here since 2020.",
            listOf("live", "lived", "have lived", "am living"),
            2, "متوسط"
        ),
        LevelQuestion(
            "She is taller ___ me.",
            listOf("then", "than", "that", "as"),
            1, "متوسط"
        ),
        LevelQuestion(
            "If it rains, I ___ at home.",
            listOf("will stay", "would stay", "stayed", "staying"),
            0, "متوسط"
        ),
        LevelQuestion(
            "This book ___ written by Shakespeare.",
            listOf("is", "was", "were", "has"),
            1, "متوسط"
        ),
        LevelQuestion(
            "I enjoy ___ books.",
            listOf("read", "reading", "to read", "reads"),
            1, "متوسط"
        ),
        // پیشرفته
        LevelQuestion(
            "Had I known, I ___ differently.",
            listOf("would act", "would have acted", "will act", "acted"),
            1, "پیشرفته"
        ),
        LevelQuestion(
            "___ having finished his work, he went out.",
            listOf("After", "While", "Because", "Since"),
            0, "پیشرفته"
        ),
        LevelQuestion(
            "It is essential that he ___ present.",
            listOf("is", "be", "was", "will be"),
            1, "پیشرفته"
        ),
        LevelQuestion(
            "Never ___ I seen such beauty.",
            listOf("have", "has", "did", "do"),
            0, "پیشرفته"
        ),
        LevelQuestion(
            "The report ___ by the manager yesterday.",
            listOf("was reviewed", "reviewed", "has reviewed", "is reviewing"),
            0, "پیشرفته"
        )
    )

    // صفحه نتیجه
    if (showResult) {
        val (level, emoji, color, message) = when {
            score >= 13 -> Quadruple(
                "پیشرفته",
                "🏆",
                Color(0xFFF12711),
                "سطح شما پیشرفته است! می‌توانید از Top Notch 2 شروع کنید."
            )
            score >= 8 -> Quadruple(
                "متوسط",
                "🚀",
                Color(0xFF8E2DE2),
                "سطح شما متوسط است! می‌توانید از Top Notch 1 شروع کنید."
            )
            else -> Quadruple(
                "مبتدی",
                "🌱",
                Color(0xFF11998E),
                "سطح شما مبتدی است! از Top Notch Fundamentals شروع کنید."
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Box(
                    modifier = Modifier
                        .size(140.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(
                                listOf(color.copy(alpha = 0.7f), color)
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(emoji, fontSize = 70.sp)
                }

                Spacer(Modifier.height(24.dp))

                Text(
                    "نتیجه تست",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "سطح شما: $level",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = color
                )

                Spacer(Modifier.height(16.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "امتیاز شما: $score از ${questions.size}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Spacer(Modifier.height(10.dp))
                        Text(
                            message,
                            fontSize = 14.sp,
                            color = Color.Gray,
                            textAlign = TextAlign.Center,
                            lineHeight = 22.sp
                        )
                    }
                }

                Spacer(Modifier.height(24.dp))

                Button(
                    onClick = {
                        currentQuestion = 0
                        selectedAnswer = null
                        score = 0
                        showResult = false
                    },
                    modifier = Modifier.fillMaxWidth().height(54.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = color)
                ) {
                    Text("تلاش مجدد", color = Color.White, fontWeight = FontWeight.Bold)
                }

                Spacer(Modifier.height(12.dp))

                OutlinedButton(
                    onClick = onBack,
                    modifier = Modifier.fillMaxWidth().height(54.dp),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text("بازگشت", color = color, fontWeight = FontWeight.Bold)
                }
            }
        }
        return
    }

    // صفحه سوال
    val q = questions[currentQuestion]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("تست تعیین سطح", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "سوال ${currentQuestion + 1} از ${questions.size}",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1A237E))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {

            LinearProgressIndicator(
                progress = { (currentQuestion + 1).toFloat() / questions.size },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = Color(0xFF1A237E),
                trackColor = Color(0xFF1A237E).copy(alpha = 0.15f)
            )

            Spacer(Modifier.height(24.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color(0xFF1A237E).copy(alpha = 0.08f),
                                    Color.White
                                )
                            )
                        )
                        .padding(20.dp)
                ) {
                    Text(
                        q.question,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 28.sp,
                        color = Color(0xFF1A237E)
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            q.options.forEachIndexed { index, option ->
                val isSelected = selectedAnswer == index
                val isCorrect = index == q.correctIndex
                val showFeedback = selectedAnswer != null

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
                    elevation = CardDefaults.cardElevation(2.dp),
                    onClick = {
                        if (selectedAnswer == null) {
                            selectedAnswer = index
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
                                if (selectedAnswer == null) {
                                    selectedAnswer = index
                                    if (isCorrect) score++
                                }
                            },
                            colors = RadioButtonDefaults.colors(selectedColor = Color(0xFF1A237E))
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            option,
                            fontSize = 15.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            if (selectedAnswer != null) {
                Button(
                    onClick = {
                        if (currentQuestion < questions.size - 1) {
                            currentQuestion++
                            selectedAnswer = null
                        } else {
                            showResult = true
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
                ) {
                    Text(
                        if (currentQuestion < questions.size - 1) "سوال بعدی →" else "دیدن نتیجه 🎉",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}

data class Quadruple<A, B, C, D>(val first: A, val second: B, val third: C, val fourth: D)