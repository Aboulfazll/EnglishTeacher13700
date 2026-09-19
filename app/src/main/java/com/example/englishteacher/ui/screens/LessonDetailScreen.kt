package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.Conversation
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.QuizQuestion
import com.example.englishteacher.data.SpellingExercise
import com.example.englishteacher.data.Word
import com.example.englishteacher.data.ProgressManager
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(lessonId: String, onBack: () -> Unit) {
    val lesson = LessonRepository.getLessonById(lessonId)
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
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

    // رنگ بر اساس سطح
    val accent = when (lesson.level) {
        com.example.englishteacher.data.Level.BEGINNER -> Color(0xFF11998E)
        com.example.englishteacher.data.Level.INTERMEDIATE -> Color(0xFF8E2DE2)
        com.example.englishteacher.data.Level.ADVANCED -> Color(0xFFF12711)
    }

    var selectedTab by remember { mutableIntStateOf(0) }

    // تب‌ها بر اساس داشتن spelling
    val tabs = if (lesson.spelling.isNotEmpty()) {
        listOf("لغات", "هجی", "گرامر", "مکالمه", "داستان", "کوییز", "🗣️ گفتار")
    } else {
        listOf("لغات", "گرامر", "مکالمه", "داستان", "کوییز", "🗣️ گفتار")
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            lesson.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            maxLines = 1
                        )
                        Text(
                            lesson.titlePersian,
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = accent)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            ScrollableTabRow(
                selectedTabIndex = selectedTab,
                containerColor = Color.White,
                contentColor = accent,
                edgePadding = 8.dp,
                divider = {}
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = {
                            Text(
                                title,
                                fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Normal,
                                fontSize = 12.sp
                            )
                        }
                    )
                }
            }

            // محتوا
            if (lesson.spelling.isNotEmpty()) {
                when (selectedTab) {
                    0 -> VocabularyTab(lesson.vocabulary, speechHelper, accent)
                    1 -> SpellingTab(lesson.spelling, speechHelper, accent)
                    2 -> GrammarTab(lesson.grammarTitle, lesson.grammarExplanation, lesson.grammarExamples, accent)
                    3 -> ConversationTab(lesson.conversation, speechHelper, accent)
                    4 -> StoryTab(lesson.storyTitle, lesson.storyText, speechHelper, accent)
                    5 -> QuizTab(lesson.quiz, lesson.id, accent, scope, context, onBack)
                    6 -> SpeakingTab(lesson.vocabulary, speechHelper, accent)
                }
            } else {
                when (selectedTab) {
                    0 -> VocabularyTab(lesson.vocabulary, speechHelper, accent)
                    1 -> GrammarTab(lesson.grammarTitle, lesson.grammarExplanation, lesson.grammarExamples, accent)
                    2 -> ConversationTab(lesson.conversation, speechHelper, accent)
                    3 -> StoryTab(lesson.storyTitle, lesson.storyText, speechHelper, accent)
                    4 -> QuizTab(lesson.quiz, lesson.id, accent, scope, context, onBack)
                    5 -> SpeakingTab(lesson.vocabulary, speechHelper, accent)
                }
            }
        }
    }
}

// ==================== تب لغات ====================
@Composable
private fun VocabularyTab(words: List<Word>, speechHelper: SpeechHelper, accent: Color) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Text(
                "📖 ${words.size} لغت این درس",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = accent,
                modifier = Modifier.padding(bottom = 6.dp)
            )
        }

        items(words) { word ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .clip(CircleShape)
                            .background(
                                Brush.linearGradient(
                                    listOf(accent.copy(alpha = 0.15f), accent.copy(alpha = 0.3f))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            word.english.first().uppercase(),
                            color = accent,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            word.english,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Color(0xFF1A237E)
                        )
                        if (word.pronunciation.isNotEmpty()) {
                            Text(
                                "/${word.pronunciation}/",
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        }
                        Spacer(Modifier.height(3.dp))
                        Text(
                            word.persian,
                            color = accent,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    IconButton(
                        onClick = { speechHelper.speak(word.english) },
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(accent.copy(alpha = 0.12f))
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.VolumeUp,
                            contentDescription = "Play",
                            tint = accent,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }
        }
    }
}

// ==================== تب هجی ====================
@Composable
private fun SpellingTab(spellingList: List<SpellingExercise>, speechHelper: SpeechHelper, accent: Color) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = accent.copy(alpha = 0.1f))
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("🔤", fontSize = 28.sp)
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "هجی کردن اسم‌ها",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = accent
                        )
                        Text(
                            "گوش کن و حروف را تکرار کن",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }

        items(spellingList) { item ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                item.name,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                color = Color(0xFF1A237E)
                            )
                            Text(item.persian, fontSize = 13.sp, color = Color.Gray)
                        }
                        IconButton(
                            onClick = { speechHelper.speak(item.name) },
                            modifier = Modifier
                                .size(42.dp)
                                .clip(CircleShape)
                                .background(accent.copy(alpha = 0.12f))
                        ) {
                            Icon(
                                Icons.AutoMirrored.Filled.VolumeUp,
                                contentDescription = "Play",
                                tint = accent
                            )
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(
                                Brush.horizontalGradient(
                                    listOf(accent.copy(alpha = 0.08f), accent.copy(alpha = 0.2f))
                                )
                            )
                            .padding(12.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            item.spelling,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = accent,
                            letterSpacing = 3.sp
                        )
                    }
                }
            }
        }
    }
}

// ==================== تب گرامر ====================
@Composable
private fun GrammarTab(title: String, explanation: String, examples: List<String>, accent: Color) {
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(4.dp, 26.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(accent)
            )
            Spacer(Modifier.width(10.dp))
            Text(
                title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )
        }

        Spacer(Modifier.height(16.dp))

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
                            listOf(accent.copy(alpha = 0.08f), accent.copy(alpha = 0.15f))
                        )
                    )
                    .padding(16.dp)
            ) {
                Text(
                    explanation,
                    fontSize = 14.sp,
                    lineHeight = 24.sp,
                    color = Color(0xFF424242)
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        Text(
            "✏️ مثال‌ها:",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = accent
        )
        Spacer(Modifier.height(10.dp))

        examples.forEachIndexed { index, example ->
            Card(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(12.dp),
                elevation = CardDefaults.cardElevation(1.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(accent.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "${index + 1}",
                            color = accent,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(10.dp))
                    Text(
                        example,
                        fontSize = 14.sp,
                        lineHeight = 22.sp,
                        color = Color(0xFF424242)
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))
    }
}

// ==================== تب مکالمه ====================
@Composable
private fun ConversationTab(conversation: Conversation, speechHelper: SpeechHelper, accent: Color) {
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp)
    ) {
        Text(
            "💬 ${conversation.title}",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
        Text(conversation.titlePersian, fontSize = 13.sp, color = Color.Gray)
        Spacer(Modifier.height(20.dp))

        conversation.lines.forEach { line ->
            val isA = line.speaker == "A"
            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
                horizontalArrangement = if (isA) Arrangement.Start else Arrangement.End
            ) {
                Column(
                    horizontalAlignment = if (isA) Alignment.Start else Alignment.End
                ) {
                    Text(
                        line.speaker,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isA) accent else Color(0xFF7B1FA2)
                    )
                    Spacer(Modifier.height(4.dp))
                    Card(
                        modifier = Modifier.widthIn(max = 290.dp),
                        shape = RoundedCornerShape(
                            topStart = 18.dp,
                            topEnd = 18.dp,
                            bottomStart = if (isA) 4.dp else 18.dp,
                            bottomEnd = if (isA) 18.dp else 4.dp
                        ),
                        colors = CardDefaults.cardColors(
                            containerColor = if (isA) accent.copy(alpha = 0.12f) else Color(0xFFF3E5F5)
                        ),
                        elevation = CardDefaults.cardElevation(1.dp)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    line.english,
                                    fontSize = 14.sp,
                                    modifier = Modifier.weight(1f),
                                    lineHeight = 20.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                IconButton(
                                    onClick = { speechHelper.speak(line.english) },
                                    modifier = Modifier.size(30.dp)
                                ) {
                                    Icon(
                                        Icons.AutoMirrored.Filled.VolumeUp,
                                        contentDescription = "Play",
                                        tint = if (isA) accent else Color(0xFF7B1FA2),
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                            Spacer(Modifier.height(4.dp))
                            Text(
                                line.persian,
                                fontSize = 12.sp,
                                color = Color.Gray,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))
    }
}

// ==================== تب داستان ====================
@Composable
private fun StoryTab(title: String, text: String, speechHelper: SpeechHelper, accent: Color) {
    var isPlaying by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("📚", fontSize = 26.sp)
            Spacer(Modifier.width(10.dp))
            Text(
                title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )
        }

        Spacer(Modifier.height(16.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(18.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Text(
                text,
                modifier = Modifier.padding(20.dp),
                fontSize = 16.sp,
                lineHeight = 28.sp,
                color = Color(0xFF424242)
            )
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                if (isPlaying) speechHelper.stop() else speechHelper.speak(text)
                isPlaying = !isPlaying
            },
            modifier = Modifier.fillMaxWidth().height(58.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = accent)
        ) {
            Icon(
                imageVector = if (isPlaying) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(26.dp)
            )
            Spacer(Modifier.width(10.dp))
            Text(
                text = if (isPlaying) "توقف پخش" else "پخش داستان",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }

        Spacer(Modifier.height(20.dp))
    }
}

// ==================== تب کوییز ====================
@Composable
private fun QuizTab(
    quiz: List<QuizQuestion>,
    lessonId: String,
    accent: Color,
    scope: kotlinx.coroutines.CoroutineScope,
    context: android.content.Context,
    onFinish: () -> Unit
) {
    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

    if (showResult) {
        Box(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(
                                if (score == quiz.size) {
                                    listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                                } else if (score >= quiz.size / 2) {
                                    listOf(Color(0xFFFFA726), Color(0xFFFFD54F))
                                } else {
                                    listOf(Color(0xFFEF5350), Color(0xFFE57373))
                                }
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        when {
                            score == quiz.size -> "🏆"
                            score >= quiz.size / 2 -> "👍"
                            else -> "💪"
                        },
                        fontSize = 56.sp
                    )
                }

                Spacer(Modifier.height(24.dp))

                Text(
                    text = when {
                        score == quiz.size -> "عالی! کامل!"
                        score >= quiz.size / 2 -> "خوب بود!"
                        else -> "نیاز به تمرین بیشتر"
                    },
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )

                Spacer(Modifier.height(12.dp))

                Text("امتیاز شما", fontSize = 14.sp, color = Color.Gray)
                Text(
                    "$score از ${quiz.size}",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = accent
                )

                Spacer(Modifier.height(30.dp))

                LaunchedEffect(Unit) {
                    scope.launch {
                        ProgressManager.markLessonCompleted(context, lessonId)
                        ProgressManager.saveQuizScore(context, lessonId, score)
                        ProgressManager.addStars(context, score * 10)
                    }
                }

                Button(
                    onClick = {
                        currentQuestion = 0
                        selectedOption = null
                        score = 0
                        showResult = false
                    },
                    modifier = Modifier.fillMaxWidth().height(52.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = accent)
                ) {
                    Text("تلاش مجدد", color = Color.White, fontWeight = FontWeight.Bold)
                }

                Spacer(Modifier.height(12.dp))

                OutlinedButton(
                    onClick = onFinish,
                    modifier = Modifier.fillMaxWidth().height(52.dp),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text("بازگشت به دروس", color = accent, fontWeight = FontWeight.Bold)
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
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "سوال ${currentQuestion + 1} از ${quiz.size}",
                fontSize = 13.sp,
                color = Color.Gray,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                "امتیاز: $score",
                fontSize = 13.sp,
                color = accent,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(Modifier.height(8.dp))

        LinearProgressIndicator(
            progress = { (currentQuestion + 1).toFloat() / quiz.size },
            modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
            color = accent,
            trackColor = accent.copy(alpha = 0.15f)
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
                            listOf(accent.copy(alpha = 0.08f), Color.White)
                        )
                    )
                    .padding(20.dp)
            ) {
                Text(
                    q.question,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 26.sp,
                    color = Color(0xFF1A237E)
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
                modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
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
                        colors = RadioButtonDefaults.colors(selectedColor = accent)
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
                modifier = Modifier.fillMaxWidth().height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = accent)
            ) {
                Text(
                    if (currentQuestion < quiz.size - 1) "سوال بعدی →" else "دیدن نتیجه 🎉",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(Modifier.height(20.dp))
    }
}