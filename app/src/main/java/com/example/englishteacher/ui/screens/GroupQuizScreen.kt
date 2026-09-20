package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.ProgressManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GroupQuizScreen(
    level: Level,
    groupIndex: Int,
    onBack: () -> Unit,
    onPassed: () -> Unit = {}
) {
    val context = LocalContext.current
    val accent = when (level) {
        Level.BEGINNER -> Color(0xFF11998E)
        Level.INTERMEDIATE -> Color(0xFF8E2DE2)
        Level.ADVANCED -> Color(0xFFF12711)
    }
    val allLessons = LessonRepository.getLessonsByLevel(level)
    val start = groupIndex * ProgressManager.GROUP_SIZE
    val end = minOf(start + ProgressManager.GROUP_SIZE, allLessons.size)
    val groupLessons = allLessons.subList(start, end)
    val questions = remember { groupLessons.flatMap { it.quiz } }

    var current by remember { mutableIntStateOf(0) }
    var selected by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var isPassed by remember { mutableStateOf(false) }

    val total = questions.size
    val percent = if (total > 0) (score.toFloat() / total * 100).toInt() else 0

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "امتحان گروه ${groupIndex + 1}",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
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
        if (showResult) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F7FA))
                    .padding(padding)
                    .padding(24.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(40.dp))
                Box(
                    modifier = Modifier
                        .size(140.dp)
                        .clip(CircleShape)
                        .background(if (isPassed) accent else Color(0xFFEF5350)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "$percent%",
                        fontSize = 34.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
                Spacer(Modifier.height(20.dp))
                Text(
                    if (isPassed) "قبول شدی!" else "دوباره تلاش کن",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "امتیاز: $score از $total",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "حد نصاب: ${ProgressManager.PASSING_SCORE}%",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(24.dp))

                if (isPassed) {
                    LaunchedEffect(Unit) {
                        ProgressManager.saveGroupScore(context, level, groupIndex, percent)
                    }
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
                    ) {
                        Text(
                            "گروه بعدی باز شد!",
                            modifier = Modifier.padding(16.dp),
                            color = Color(0xFF2E7D32),
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    Button(
                        onClick = { onPassed(); onBack() },
                        modifier = Modifier.fillMaxWidth().height(56.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = accent)
                    ) {
                        Text("ادامه", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                    Spacer(Modifier.height(12.dp))
                }

                OutlinedButton(
                    onClick = {
                        current = 0
                        selected = null
                        score = 0
                        showResult = false
                    },
                    modifier = Modifier.fillMaxWidth().height(56.dp)
                ) {
                    Text("تلاش مجدد", color = accent)
                }
                Spacer(Modifier.height(12.dp))
                TextButton(onClick = onBack) {
                    Text("بازگشت", color = Color.Gray)
                }
            }
            return@Scaffold
        }

        if (questions.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize().padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("سوالی موجود نیست")
            }
            return@Scaffold
        }

        val q = questions[current]

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                "سوال ${current + 1} از $total",
                fontSize = 13.sp,
                color = Color.Gray
            )
            Spacer(Modifier.height(12.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Text(
                    q.question,
                    modifier = Modifier.padding(20.dp),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
            }
            Spacer(Modifier.height(16.dp))

            q.options.forEachIndexed { i, option ->
                val isSel = selected == i
                val isCor = i == q.correctIndex
                val show = selected != null
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp)
                        .clickable(enabled = !show) {
                            selected = i
                            if (isCor) score++
                        },
                    colors = CardDefaults.cardColors(
                        containerColor = when {
                            !show -> Color.White
                            isCor -> Color(0xFFC8E6C9)
                            isSel -> Color(0xFFFFCDD2)
                            else -> Color.White
                        }
                    ),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Text(
                        option,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 15.sp,
                        color = Color(0xFF1A237E)
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            if (selected != null) {
                Button(
                    onClick = {
                        if (current < total - 1) {
                            current++
                            selected = null
                        } else {
                            isPassed = percent >= ProgressManager.PASSING_SCORE
                            showResult = true
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = accent)
                ) {
                    Text(
                        if (current < total - 1) "سوال بعدی" else "دیدن نتیجه",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}