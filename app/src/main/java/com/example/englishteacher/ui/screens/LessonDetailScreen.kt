package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.QuizQuestion
import com.example.englishteacher.data.Word

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(lessonId: String, onBack: () -> Unit) {
    val lesson = LessonRepository.getLessonById(lessonId)
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    if (lesson == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("درس پیدا نشد")
        }
        return
    }

    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("لغات", "گرامر", "داستان", "کوییز")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = lesson.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                        Text(
                            text = lesson.titlePersian,
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.8f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1A237E)
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FA))
                .padding(padding)
        ) {
            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = Color.White,
                contentColor = Color(0xFF1A237E)
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = {
                            Text(title, fontWeight = FontWeight.SemiBold)
                        }
                    )
                }
            }

            when (selectedTab) {
                0 -> VocabularyTab(lesson.vocabulary, speechHelper)
                1 -> GrammarTab(
                    lesson.grammarTitle,
                    lesson.grammarExplanation,
                    lesson.grammarExamples
                )
                2 -> StoryTab(lesson.storyTitle, lesson.storyText, speechHelper)
                3 -> QuizTab(lesson.quiz)
            }
        }
    }
}

@Composable
private fun VocabularyTab(words: List<Word>, speechHelper: SpeechHelper) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(words) { word ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = word.english,
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp
                        )
                        if (word.pronunciation.isNotEmpty()) {
                            Text(
                                text = "/${word.pronunciation}/",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = word.persian,
                            color = Color(0xFF1A237E),
                            fontSize = 14.sp
                        )
                    }
                    IconButton(onClick = { speechHelper.speak(word.english) }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.VolumeUp,
                            contentDescription = "Play",
                            tint = Color(0xFF1A237E)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun GrammarTab(
    title: String,
    explanation: String,
    examples: List<String>
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
        Spacer(Modifier.height(16.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8EAF6)),
            shape = RoundedCornerShape(14.dp)
        ) {
            Text(
                text = explanation,
                modifier = Modifier.padding(16.dp),
                fontSize = 15.sp,
                lineHeight = 24.sp
            )
        }

        Spacer(Modifier.height(20.dp))
        Text("مثال‌ها:", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Spacer(Modifier.height(10.dp))

        examples.forEach { example ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "• $example",
                    modifier = Modifier.padding(14.dp),
                    fontSize = 14.sp,
                    lineHeight = 22.sp
                )
            }
        }
    }
}

@Composable
private fun StoryTab(
    title: String,
    text: String,
    speechHelper: SpeechHelper
) {
    var isPlaying by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Text(
            text = title,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
        Spacer(Modifier.height(16.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(3.dp)
        ) {
            Text(
                text = text,
                modifier = Modifier.padding(20.dp),
                fontSize = 16.sp,
                lineHeight = 26.sp
            )
        }

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = {
                if (isPlaying) {
                    speechHelper.stop()
                } else {
                    speechHelper.speak(text)
                }
                isPlaying = !isPlaying
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
        ) {
            Icon(
                imageVector = if (isPlaying) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = if (isPlaying) "توقف" else "پخش داستان",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun QuizTab(quiz: List<QuizQuestion>) {
    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

    if (showResult) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("🎉", fontSize = 60.sp)
                Text(
                    text = "نتیجه کوییز",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "امتیاز شما: $score از ${quiz.size}",
                    fontSize = 18.sp
                )
                Spacer(Modifier.height(24.dp))
                Button(
                    onClick = {
                        currentQuestion = 0
                        selectedOption = null
                        score = 0
                        showResult = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
                ) {
                    Text("تلاش مجدد", color = Color.White)
                }
            }
        }
        return
    }

    if (quiz.isEmpty()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("کوییز موجود نیست")
        }
        return
    }

    val q = quiz[currentQuestion]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        LinearProgressIndicator(
            progress = { (currentQuestion + 1).toFloat() / quiz.size },
            modifier = Modifier.fillMaxWidth(),
            color = Color(0xFF1A237E)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = "سوال ${currentQuestion + 1} از ${quiz.size}",
            fontSize = 13.sp,
            color = Color.Gray
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = q.question,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(20.dp))

        q.options.forEachIndexed { index, option ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = when {
                        selectedOption == null -> Color.White
                        index == q.correctIndex -> Color(0xFFC8E6C9)
                        index == selectedOption -> Color(0xFFFFCDD2)
                        else -> Color.White
                    }
                ),
                shape = RoundedCornerShape(12.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                onClick = {
                    if (selectedOption == null) {
                        selectedOption = index
                        if (index == q.correctIndex) score++
                    }
                }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedOption == index,
                        onClick = {
                            if (selectedOption == null) {
                                selectedOption = index
                                if (index == q.correctIndex) score++
                            }
                        }
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(text = option, fontSize = 15.sp)
                }
            }
        }

        Spacer(Modifier.height(24.dp))

        if (selectedOption != null) {
            Button(
                onClick = {
                    if (currentQuestion < quiz.size - 1) {
                        currentQuestion++
                        selectedOption = null
                    } else {
                        showResult = true
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
            ) {
                Text(
                    text = if (currentQuestion < quiz.size - 1) "سوال بعدی" else "دیدن نتیجه",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}