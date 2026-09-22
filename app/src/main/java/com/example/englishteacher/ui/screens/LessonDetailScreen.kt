package com.example.englishteacher.ui.screens

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
fun LessonDetailScreen(
    lessonId: String,
    onBack: () -> Unit,
    onStartReading: () -> Unit = {}
) {
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

    val accent = when (lesson.level) {
        com.example.englishteacher.data.Level.BEGINNER -> Color(0xFF11998E)
        com.example.englishteacher.data.Level.INTERMEDIATE -> Color(0xFF8E2DE2)
        com.example.englishteacher.data.Level.ADVANCED -> Color(0xFFF12711)
    }

    var selectedTab by remember { mutableIntStateOf(0) }

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
                        Text(lesson.title, fontWeight = FontWeight.Bold, fontSize = 15.sp, maxLines = 1)
                        Text(
                            lesson.titlePersian,
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
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

            if (lesson.spelling.isNotEmpty()) {
                when (selectedTab) {
                    0 -> VocabularyTab(lesson.vocabulary, speechHelper, accent)
                    1 -> SpellingTab(lesson.spelling, speechHelper, accent)
                    2 -> GrammarTab(lesson.grammarTitle, lesson.grammarExplanation, lesson.grammarExamples, accent)
                    3 -> ConversationTab(lesson.conversation, speechHelper, accent, onStartReading)
                    4 -> StoryTab(lesson.storyTitle, lesson.storyText, speechHelper, accent)
                    5 -> QuizTab(lesson.quiz, lesson.id, accent, scope, context, onBack)
                    6 -> LessonSpeakingTab(lesson.vocabulary, speechHelper, accent)
                }
            } else {
                when (selectedTab) {
                    0 -> VocabularyTab(lesson.vocabulary, speechHelper, accent)
                    1 -> GrammarTab(lesson.grammarTitle, lesson.grammarExplanation, lesson.grammarExamples, accent)
                    2 -> ConversationTab(lesson.conversation, speechHelper, accent, onStartReading)
                    3 -> StoryTab(lesson.storyTitle, lesson.storyText, speechHelper, accent)
                    4 -> QuizTab(lesson.quiz, lesson.id, accent, scope, context, onBack)
                    5 -> LessonSpeakingTab(lesson.vocabulary, speechHelper, accent)
                }
            }
        }
    }
}

@Composable
private fun VocabularyTab(words: List<Word>, speechHelper: SpeechHelper, accent: Color) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 6.dp)
            ) {
                Text("📖 ${words.size} لغت این درس", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = accent)
                Spacer(Modifier.weight(1f))
                Text("👆 روی کارت بزن", fontSize = 10.sp, color = Color.Gray)
            }
        }
        items(words) { word ->
            Card(
                modifier = Modifier.fillMaxWidth().clickable { speechHelper.speak(word.english) },
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
                            .size(46.dp).clip(CircleShape)
                            .background(Brush.linearGradient(listOf(accent.copy(alpha = 0.15f), accent.copy(alpha = 0.3f)))),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(word.english.first().uppercase(), color = accent, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(word.english, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF1A237E))
                        if (word.pronunciation.isNotEmpty()) {
                            Text("/${word.pronunciation}/", fontSize = 11.sp, color = Color.Gray)
                        }
                        Spacer(Modifier.height(3.dp))
                        Text(word.persian, color = accent, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                    }
                    IconButton(
                        onClick = { speechHelper.speak(word.english) },
                        modifier = Modifier.size(42.dp).clip(CircleShape).background(accent.copy(alpha = 0.12f))
                    ) {
                        Icon(Icons.AutoMirrored.Filled.VolumeUp, "Play", tint = accent, modifier = Modifier.size(22.dp))
                    }
                }
            }
        }
    }
}

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
                Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text("🔤", fontSize = 28.sp)
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text("هجی کردن اسم‌ها", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = accent)
                        Text("گوش کن و حروف را تکرار کن", fontSize = 12.sp, color = Color.Gray)
                    }
                }
            }
        }
        items(spellingList) { item ->
            Card(
                modifier = Modifier.fillMaxWidth().clickable { speechHelper.speak(item.name) },
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(item.name, fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color(0xFF1A237E))
                            Text(item.persian, fontSize = 13.sp, color = Color.Gray)
                        }
                        IconButton(
                            onClick = { speechHelper.speak(item.name) },
                            modifier = Modifier.size(42.dp).clip(CircleShape).background(accent.copy(alpha = 0.12f))
                        ) {
                            Icon(Icons.AutoMirrored.Filled.VolumeUp, "Play", tint = accent)
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth().clip(RoundedCornerShape(12.dp))
                            .background(Brush.horizontalGradient(listOf(accent.copy(alpha = 0.08f), accent.copy(alpha = 0.2f))))
                            .padding(12.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(item.spelling, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = accent, letterSpacing = 3.sp)
                    }
                }
            }
        }
    }
}

// ==================== 📝 گرامر پیشرفته ====================
@Composable
private fun GrammarTab(title: String, explanation: String, examples: List<String>, accent: Color) {
    var expandedSection by remember { mutableStateOf(0) }
    var showChecklist by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(listOf(accent, accent.copy(alpha = 0.7f))))
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(56.dp).clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("📝", fontSize = 28.sp)
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text("درس گرامر", fontSize = 12.sp, color = Color.White.copy(alpha = 0.9f), fontWeight = FontWeight.SemiBold)
                        Text(title, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        GrammarSection(1, "توضیحات", "💡", expandedSection == 0, accent,
            { expandedSection = if (expandedSection == 0) -1 else 0 }) {
            Text(explanation, fontSize = 14.sp, lineHeight = 26.sp, color = Color(0xFF424242))
        }

        Spacer(Modifier.height(12.dp))

        GrammarSection(2, "مثال‌ها (${examples.size})", "✏️", expandedSection == 1, accent,
            { expandedSection = if (expandedSection == 1) -1 else 1 }) {
            Column {
                Text("👆 روی هر مثال بزن تا تلفظش رو بشنوی", fontSize = 11.sp, color = Color.Gray,
                    modifier = Modifier.padding(bottom = 10.dp))
                examples.forEachIndexed { index, example ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFF8F9FF)),
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(1.dp)
                    ) {
                        Row(modifier = Modifier.fillMaxWidth().padding(14.dp), verticalAlignment = Alignment.Top) {
                            Box(
                                modifier = Modifier.size(26.dp).clip(CircleShape).background(accent.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("${index + 1}", color = accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            }
                            Spacer(Modifier.width(12.dp))
                            Box(modifier = Modifier.weight(1f)) {
                                ClickableStoryText(example, accent, 14, 22, false)
                            }
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        GrammarSection(3, "نکات مهم", "⚠️", expandedSection == 2, accent,
            { expandedSection = if (expandedSection == 2) -1 else 2 }) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📌", fontSize = 18.sp)
                        Spacer(Modifier.width(8.dp))
                        Text("قبل از ادامه، این رو یادت باشه:", fontSize = 13.sp,
                            fontWeight = FontWeight.Bold, color = Color(0xFFE65100))
                    }
                    Spacer(Modifier.height(8.dp))
                    Text("• به ساختار جمله دقت کن\n• ترتیب کلمات رو تمرین کن\n• مثال‌ها رو با صدای بلند تکرار کن\n• هر روز ۱۰ دقیقه مرور کن",
                        fontSize = 13.sp, lineHeight = 22.sp, color = Color(0xFF5D4037))
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = { showChecklist = !showChecklist },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = accent)
        ) {
            Text(if (showChecklist) "بستن چک‌لیست" else "🧠 چک‌لیست یادگیری",
                color = Color.White, fontWeight = FontWeight.Bold, fontSize = 15.sp)
        }

        if (showChecklist) {
            Spacer(Modifier.height(12.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("🎯 چک‌لیست یادگیری", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                    Spacer(Modifier.height(10.dp))
                    listOf("ساختار اصلی رو می‌فهمم", "می‌تونم مثال بسازم",
                        "اشتباهات رایج رو می‌شناسم", "می‌تونم تو مکالمه استفاده کنم").forEach { item ->
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(vertical = 4.dp)) {
                            Box(
                                modifier = Modifier.size(18.dp).clip(CircleShape).background(accent.copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("✓", color = accent, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            }
                            Spacer(Modifier.width(10.dp))
                            Text(item, fontSize = 13.sp, color = Color(0xFF424242))
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(30.dp))
    }
}

@Composable
private fun GrammarSection(
    number: Int, title: String, icon: String, isExpanded: Boolean,
    accent: Color, onToggle: () -> Unit, content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(3.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth().clickable { onToggle() }.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier.size(40.dp).clip(CircleShape).background(accent.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(icon, fontSize = 20.sp)
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text("بخش $number", fontSize = 10.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
                    Text(title, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                }
                Text(if (isExpanded) "▲" else "▼", fontSize = 14.sp, color = accent, fontWeight = FontWeight.Bold)
            }
            if (isExpanded) {
                Divider(color = Color.LightGray.copy(alpha = 0.3f))
                Box(modifier = Modifier.padding(16.dp)) { content() }
            }
        }
    }
}

// ==================== 💬 مکالمه فوق‌پیشرفته ====================
@Composable
private fun ConversationTab(
    conversation: Conversation,
    speechHelper: SpeechHelper,
    accent: Color,
    onStartReading: () -> Unit
) {
    val context = LocalContext.current
    var isPlayingAll by remember { mutableStateOf(false) }
    var showTranslation by remember { mutableStateOf(true) }
    var showOnlySpeaker by remember { mutableStateOf<String?>(null) }
    var ttsSpeed by remember { mutableFloatStateOf(1.0f) }
    var currentlyPlayingIndex by remember { mutableIntStateOf(-1) }
    var practiceMode by remember { mutableStateOf(false) }

    // فیلتر کردن خطوط
    val filteredLines = conversation.lines.filter { line ->
        showOnlySpeaker == null || line.speaker == showOnlySpeaker
    }

    // اعمال سرعت پخش
    LaunchedEffect(ttsSpeed) {
        speechHelper.setSpeed(ttsSpeed)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        // ============ هدر مکالمه ============
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(listOf(accent, accent.copy(alpha = 0.7f))))
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
                            Text("💬", fontSize = 28.sp)
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(conversation.title, fontSize = 17.sp,
                                fontWeight = FontWeight.Bold, color = Color.White)
                            Text(conversation.titlePersian, fontSize = 12.sp,
                                color = Color.White.copy(alpha = 0.9f))
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                    // آمار مکالمه
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        ConversationStatChip("📊 ${conversation.lines.size} جمله")
                        ConversationStatChip("👥 ${conversation.lines.map { it.speaker }.distinct().size} گوینده")
                    }
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // ============ پنل تنظیمات ============
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(3.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("🎛️ تنظیمات پخش", fontSize = 13.sp, fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E))
                Spacer(Modifier.height(12.dp))

                // ردیف ۱: کنترل سرعت
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("🎙️ سرعت:", fontSize = 12.sp, color = Color.Gray)
                    Spacer(Modifier.width(8.dp))
                    listOf(0.75f to "آهسته", 1.0f to "معمولی", 1.25f to "سریع").forEach { (speed, label) ->
                        FilterChip(
                            selected = ttsSpeed == speed,
                            onClick = { ttsSpeed = speed },
                            label = { Text(label, fontSize = 10.sp) },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = accent,
                                selectedLabelColor = Color.White
                            ),
                            modifier = Modifier.padding(end = 4.dp)
                        )
                    }
                }

                Spacer(Modifier.height(8.dp))

                // ردیف ۲: کنترل نمایش ترجمه و فیلتر گوینده
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = if (showTranslation) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        contentDescription = null,
                        tint = accent,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text("نمایش ترجمه", fontSize = 12.sp, color = Color.Gray)
                    Spacer(Modifier.weight(1f))
                    Switch(
                        checked = showTranslation,
                        onCheckedChange = { showTranslation = it },
                        colors = SwitchDefaults.colors(checkedTrackColor = accent)
                    )
                }

                Spacer(Modifier.height(8.dp))

                // ردیف ۳: فیلتر گوینده
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("👥 گوینده:", fontSize = 12.sp, color = Color.Gray)
                    Spacer(Modifier.width(8.dp))
                    FilterChip(
                        selected = showOnlySpeaker == null,
                        onClick = { showOnlySpeaker = null },
                        label = { Text("هر دو", fontSize = 10.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = accent,
                            selectedLabelColor = Color.White
                        )
                    )
                    conversation.lines.map { it.speaker }.distinct().forEach { speaker ->
                        FilterChip(
                            selected = showOnlySpeaker == speaker,
                            onClick = { showOnlySpeaker = if (showOnlySpeaker == speaker) null else speaker },
                            label = { Text(speaker, fontSize = 10.sp) },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = accent,
                                selectedLabelColor = Color.White
                            ),
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // ============ دکمه‌های عملیات ============
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            // دکمه پخش کل مکالمه
            Button(
                onClick = {
                    if (isPlayingAll) {
                        speechHelper.stop()
                        isPlayingAll = false
                        currentlyPlayingIndex = -1
                    } else {
                        val fullText = filteredLines.joinToString(". ") { it.english }
                        speechHelper.speak(fullText)
                        isPlayingAll = true
                    }
                },
                modifier = Modifier.weight(1f).height(52.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isPlayingAll) Color(0xFFE91E63) else accent
                )
            ) {
                Icon(
                    imageVector = if (isPlayingAll) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(22.dp)
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    if (isPlayingAll) "توقف" else "پخش مکالمه",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )
            }

            // دکمه حالت تمرین
            OutlinedButton(
                onClick = { practiceMode = !practiceMode },
                modifier = Modifier.height(52.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = if (practiceMode) accent.copy(alpha = 0.1f) else Color.Transparent
                )
            ) {
                Text(
                    if (practiceMode) "🎯 تمرین" else "📝 تمرین",
                    color = accent,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )
            }
        }

        Spacer(Modifier.height(16.dp))

        // ============ راهنمای حالت تمرین ============
        AnimatedVisibility(visible = practiceMode) {
            Card(
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0)),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(modifier = Modifier.padding(14.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text("🎯", fontSize = 22.sp)
                    Spacer(Modifier.width(10.dp))
                    Column {
                        Text("حالت تمرین فعال شد", fontSize = 13.sp,
                            fontWeight = FontWeight.Bold, color = Color(0xFFE65100))
                        Text("متن انگلیسی مخفی شده. اول سعی کن از حفظ بگی، بعد نمایش بده.",
                            fontSize = 11.sp, color = Color(0xFF5D4037))
                    }
                }
            }
        }

        // ============ راهنمای کلیک ============
        if (!practiceMode) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(accent.copy(alpha = 0.1f))
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("👆", fontSize = 14.sp)
                    Spacer(Modifier.width(6.dp))
                    Text("روی هر جمله بزن تا تلفظش رو بشنوی",
                        fontSize = 11.sp, color = accent, fontWeight = FontWeight.SemiBold)
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // ============ حباب‌های مکالمه ============
        filteredLines.forEachIndexed { index, line ->
            val originalIndex = conversation.lines.indexOf(line)
            val isA = line.speaker == "A"
            val bubbleAccent = if (isA) accent else Color(0xFF7B1FA2)
            val avatarEmoji = if (isA) "👤" else "👥"
            val isCurrentPlaying = currentlyPlayingIndex == originalIndex

            AnimatedVisibility(visible = true) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp)
                        .animateContentSize(),
                    horizontalArrangement = if (isA) Arrangement.Start else Arrangement.End
                ) {
                    Column(
                        horizontalAlignment = if (isA) Alignment.Start else Alignment.End,
                        modifier = Modifier.widthIn(max = 340.dp)
                    ) {
                        // نام گوینده + شماره خط
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(bottom = 4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(20.dp)
                                    .clip(CircleShape)
                                    .background(bubbleAccent.copy(alpha = 0.2f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("${originalIndex + 1}", fontSize = 10.sp,
                                    color = bubbleAccent, fontWeight = FontWeight.Bold)
                            }
                            Spacer(Modifier.width(6.dp))
                            if (isA) {
                                Text(avatarEmoji, fontSize = 12.sp)
                                Spacer(Modifier.width(4.dp))
                            }
                            Text(line.speaker, fontSize = 11.sp,
                                fontWeight = FontWeight.Bold, color = bubbleAccent)
                            if (!isA) {
                                Spacer(Modifier.width(4.dp))
                                Text(avatarEmoji, fontSize = 12.sp)
                            }
                        }

                        // حباب پیام
                        Card(
                            modifier = Modifier
                                .alpha(if (isCurrentPlaying) 1f else 1f),
                            shape = RoundedCornerShape(
                                topStart = 20.dp, topEnd = 20.dp,
                                bottomStart = if (isA) 6.dp else 20.dp,
                                bottomEnd = if (isA) 20.dp else 6.dp
                            ),
                            colors = CardDefaults.cardColors(
                                containerColor = when {
                                    isCurrentPlaying -> bubbleAccent.copy(alpha = 0.25f)
                                    isA -> accent.copy(alpha = 0.12f)
                                    else -> Color(0xFFF3E5F5)
                                }
                            ),
                            elevation = CardDefaults.cardElevation(
                                if (isCurrentPlaying) 8.dp else 2.dp
                            )
                        ) {
                            Column(modifier = Modifier.padding(14.dp)) {
                                // متن انگلیسی یا placeholder در حالت تمرین
                                if (practiceMode && isCurrentPlaying) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(Color.Black.copy(alpha = 0.05f))
                                            .clickable { currentlyPlayingIndex = originalIndex }
                                            .padding(12.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text("👆 برای نمایش متن بزن", fontSize = 12.sp,
                                            color = Color.Gray, fontWeight = FontWeight.SemiBold)
                                    }
                                } else {
                                    ClickableStoryText(
                                        text = line.english,
                                        accent = bubbleAccent,
                                        fontSize = 15,
                                        lineHeight = 22,
                                        showHint = false,
                                        baseColor = Color(0xFF1A237E)
                                    )
                                }

                                // ترجمه (قابل مخفی کردن)
                                AnimatedVisibility(visible = showTranslation && !practiceMode) {
                                    Column {
                                        Spacer(Modifier.height(10.dp))
                                        Divider(color = bubbleAccent.copy(alpha = 0.2f))
                                        Spacer(Modifier.height(8.dp))
                                        Text(
                                            line.persian,
                                            fontSize = 13.sp,
                                            color = Color(0xFF616161),
                                            lineHeight = 20.sp
                                        )
                                    }
                                }

                                Spacer(Modifier.height(10.dp))

                                // دکمه‌های عملیات
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    // دکمه کپی
                                    IconButton(
                                        onClick = {
                                            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                            val clip = ClipData.newPlainText("text", "${line.english}\n${line.persian}")
                                            clipboard.setPrimaryClip(clip)
                                            Toast.makeText(context, "کپی شد ✓", Toast.LENGTH_SHORT).show()
                                        },
                                        modifier = Modifier.size(30.dp)
                                    ) {
                                        Icon(
                                            Icons.Filled.ContentCopy,
                                            "Copy",
                                            tint = bubbleAccent.copy(alpha = 0.6f),
                                            modifier = Modifier.size(15.dp)
                                        )
                                    }

                                    Spacer(Modifier.width(4.dp))

                                    // دکمه پخش
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(20.dp))
                                            .background(bubbleAccent.copy(alpha = 0.15f))
                                            .clickable {
                                                speechHelper.setSpeed(ttsSpeed)
                                                speechHelper.speak(line.english)
                                                currentlyPlayingIndex = originalIndex
                                            }
                                            .padding(horizontal = 12.dp, vertical = 6.dp)
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                Icons.AutoMirrored.Filled.VolumeUp,
                                                "Play",
                                                tint = bubbleAccent,
                                                modifier = Modifier.size(16.dp)
                                            )
                                            Spacer(Modifier.width(4.dp))
                                            Text(
                                                "پخش",
                                                fontSize = 11.sp,
                                                color = bubbleAccent,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // ============ خلاصه یادگیری ============
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9)),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("💡", fontSize = 18.sp)
                    Spacer(Modifier.width(8.dp))
                    Text("نکته یادگیری", fontSize = 14.sp,
                        fontWeight = FontWeight.Bold, color = Color(0xFF2E7D32))
                }
                Spacer(Modifier.height(8.dp))
                Text(
                    "۱. اول با سرعت معمولی گوش کن\n" +
                    "۲. بعد جمله‌به‌جمله تکرار کن\n" +
                    "۳. ترجمه رو مخفی کن و از حفظ بگو\n" +
                    "۴. آخر با سرعت 1.25x گوش کن تا گوشت عادت کنه",
                    fontSize = 12.sp,
                    lineHeight = 22.sp,
                    color = Color(0xFF424242)
                )
            }
        }

        Spacer(Modifier.height(20.dp))
    }
}

@Composable
private fun ConversationStatChip(text: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White.copy(alpha = 0.25f))
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(text, fontSize = 11.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun StoryTab(title: String, text: String, speechHelper: SpeechHelper, accent: Color) {
    var isPlaying by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("📚", fontSize = 26.sp)
            Spacer(Modifier.width(10.dp))
            Text(title, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(accent.copy(alpha = 0.12f))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text("👆 لمس کن", fontSize = 10.sp, color = accent, fontWeight = FontWeight.SemiBold)
            }
        }
        Spacer(Modifier.height(16.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(18.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Box(modifier = Modifier.padding(20.dp)) {
                ClickableStoryText(text = text, accent = accent, fontSize = 16, lineHeight = 28)
            }
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
        Box(modifier = Modifier.fillMaxSize().padding(20.dp), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier
                        .size(120.dp).clip(CircleShape)
                        .background(Brush.linearGradient(
                            if (score == quiz.size) listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                            else if (score >= quiz.size / 2) listOf(Color(0xFFFFA726), Color(0xFFFFD54F))
                            else listOf(Color(0xFFEF5350), Color(0xFFE57373))
                        )),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        when {
                            score == quiz.size -> "🏆"
                            score >= quiz.size / 2 -> "👍"
                            else -> "💪"
                        }, fontSize = 56.sp
                    )
                }
                Spacer(Modifier.height(24.dp))
                Text(
                    text = when {
                        score == quiz.size -> "عالی! کامل!"
                        score >= quiz.size / 2 -> "خوب بود!"
                        else -> "نیاز به تمرین بیشتر"
                    },
                    fontSize = 26.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(12.dp))
                Text("امتیاز شما", fontSize = 14.sp, color = Color.Gray)
                Text("$score از ${quiz.size}", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = accent)
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
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("کوییز موجود نیست") }
        return
    }

    val q = quiz[currentQuestion]
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("سوال ${currentQuestion + 1} از ${quiz.size}", fontSize = 13.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
            Text("امتیاز: $score", fontSize = 13.sp, color = accent, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.height(8.dp))
        LinearProgressIndicator(
            progress = { (currentQuestion + 1).toFloat() / quiz.size },
            modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
            color = accent, trackColor = accent.copy(alpha = 0.15f)
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
                    .background(Brush.verticalGradient(listOf(accent.copy(alpha = 0.08f), Color.White)))
                    .padding(20.dp)
            ) {
                Text(q.question, fontSize = 17.sp, fontWeight = FontWeight.Bold, lineHeight = 26.sp, color = Color(0xFF1A237E))
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
                Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
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
                    Text(option, fontSize = 15.sp, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal)
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
                    color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp
                )
            }
        }
        Spacer(Modifier.height(20.dp))
    }
}

@Composable
private fun LessonSpeakingTab(words: List<Word>, speechHelper: SpeechHelper, accent: Color) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = accent.copy(alpha = 0.1f))
            ) {
                Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text("🗣️", fontSize = 28.sp)
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text("تمرین گفتار", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = accent)
                        Text("گوش کن و تکرار کن", fontSize = 12.sp, color = Color.Gray)
                    }
                }
            }
        }
        items(words) { word ->
            Card(
                modifier = Modifier.fillMaxWidth().clickable { speechHelper.speak(word.english) },
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.AutoMirrored.Filled.VolumeUp, null, tint = accent, modifier = Modifier.size(28.dp))
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(word.english, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF1A237E))
                        Text(word.persian, fontSize = 12.sp, color = Color.Gray)
                    }
                    Text("👆", fontSize = 18.sp)
                }
            }
        }
    }
}