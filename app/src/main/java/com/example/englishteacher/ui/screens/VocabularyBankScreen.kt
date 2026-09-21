package com.example.englishteacher.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.ShareHelper
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

// ================= دیتا کلاس اختصاصی برای نگهداری سطح کلمه =================
data class VocabWord(
    val english: String,
    val persian: String,
    val pronunciation: String,
    val level: Level
)

// توابع کمکی برای رنگ و نام فارسی سطح
fun levelToPersian(level: Level): String = when (level.name.lowercase()) {
    "beginner" -> "مبتدی"
    "intermediate" -> "متوسط"
    "advanced" -> "پیشرفته"
    else -> level.name
}

fun levelColor(level: Level): Color = when (level.name.lowercase()) {
    "beginner" -> Color(0xFF4CAF50)
    "intermediate" -> Color(0xFFFF9800)
    "advanced" -> Color(0xFFF44336)
    else -> Color(0xFF00695C)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun VocabularyBankScreen(
    onStartFlashcard: (String) -> Unit = {}
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    var bookmarkedWords by remember { mutableStateOf<Set<String>>(emptySet()) }

    LaunchedEffect(Unit) {
        BookmarkManager.getBookmarkedWords(context).collectLatest { bookmarkedWords = it }
    }

    // ساخت لیست کلمات به همراه سطح
    val allWords = remember {
        val list = mutableListOf<VocabWord>()
        Level.values().forEach { level ->
            val lessons = LessonRepository.getLessonsByLevel(level)
            lessons.forEach { lesson ->
                lesson.vocabulary.forEach { word ->
                    list.add(
                        VocabWord(
                            english = word.english,
                            persian = word.persian,
                            pronunciation = word.pronunciation,
                            level = level
                        )
                    )
                }
            }
        }
        list.distinctBy { it.english }
    }

    var searchQuery by remember { mutableStateOf("") }
    var showOnlyBookmarked by remember { mutableStateOf(false) }
    
    // ⚙️ متغیرهای جدید برای فیلتر سطح و تنظیمات TTS
    var selectedLevel by remember { mutableStateOf<Level?>(null) }
    var ttsSpeed by remember { mutableStateOf(0.9f) }
    var isUK by remember { mutableStateOf(false) }
    var selectedWord by remember { mutableStateOf<VocabWord?>(null) } // برای دیالوگ جزئیات

    // اعمال تنظیمات TTS (توجه: SpeechHelper باید آپدیت شده باشه)
    LaunchedEffect(ttsSpeed) { speechHelper.setSpeed(ttsSpeed) }
    LaunchedEffect(isUK) { speechHelper.setAccent(isUK) }

    // فیلتر کردن کلمات
    val filteredWords = allWords.filter { word ->
        val matchesSearch = searchQuery.isEmpty() || word.english.contains(searchQuery, ignoreCase = true)
        val matchesBookmark = !showOnlyBookmarked || bookmarkedWords.contains(word.english)
        val matchesLevel = selectedLevel == null || word.level == selectedLevel
        matchesSearch && matchesBookmark && matchesLevel
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("📖 بانک لغات", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "${allWords.size} لغت از ۳۴ درس",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF00695C))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {

            // ==================== کارت فلش‌کارت ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC))
                            )
                        )
                        .padding(18.dp)
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
                                Icon(
                                    Icons.Filled.Style,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                            Spacer(Modifier.width(14.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    "🎴 فلش‌کارت",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    "با کارت‌های چرخشی لغات رو حفظ کن",
                                    fontSize = 11.sp,
                                    color = Color.White.copy(alpha = 0.9f)
                                )
                            }
                        }

                        Spacer(Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Button(
                                onClick = { onStartFlashcard("all") },
                                modifier = Modifier.weight(1f).height(44.dp),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.White,
                                    contentColor = Color(0xFF6A1B9A)
                                )
                            ) {
                                Text(
                                    "همه (${allWords.size})",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Button(
                                onClick = { onStartFlashcard("bookmarked") },
                                modifier = Modifier.weight(1f).height(44.dp),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.White.copy(alpha = 0.85f),
                                    contentColor = Color(0xFFFFA000)
                                )
                            ) {
                                Text(
                                    "ذخیره (${bookmarkedWords.size})",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }

            // نوار جستجو
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    placeholder = { Text("جستجوی لغت...") },
                    leadingIcon = {
                        Icon(Icons.Filled.Search, contentDescription = null, tint = Color(0xFF00695C))
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(Icons.Filled.Clear, contentDescription = "Clear", tint = Color.Gray)
                            }
                        }
                    },
                    shape = RoundedCornerShape(12.dp),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF00695C),
                        unfocusedBorderColor = Color.LightGray
                    )
                )
            }

            Spacer(Modifier.height(10.dp))

            // فیلترهای سطح و ذخیره‌شده
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                FilterChip(
                    selected = showOnlyBookmarked,
                    onClick = { showOnlyBookmarked = !showOnlyBookmarked },
                    label = { Text("🔖 ذخیره‌شده", fontSize = 11.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFFFFA000),
                        selectedLabelColor = Color.White
                    )
                )
                FilterChip(
                    selected = selectedLevel == null,
                    onClick = { selectedLevel = null },
                    label = { Text("همه سطوح", fontSize = 11.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF00695C),
                        selectedLabelColor = Color.White
                    )
                )
                Level.values().forEach { level ->
                    FilterChip(
                        selected = selectedLevel == level,
                        onClick = { selectedLevel = if (selectedLevel == level) null else level },
                        label = { Text(levelToPersian(level), fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = levelColor(level),
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            // 🎙️ تنظیمات TTS (سرعت و لهجه)
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text("🎙️ سرعت:", fontSize = 12.sp, color = Color.Gray)
                listOf(0.6f to "آهسته", 0.9f to "معمولی", 1.2f to "سریع").forEach { (speed, label) ->
                    FilterChip(
                        selected = ttsSpeed == speed,
                        onClick = { ttsSpeed = speed },
                        label = { Text(label, fontSize = 10.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFF00695C),
                            selectedLabelColor = Color.White
                        )
                    )
                }
                Spacer(Modifier.weight(1f))
                // دکمه تغییر لهجه
                FilterChip(
                    selected = isUK,
                    onClick = { isUK = !isUK },
                    label = { Text(if (isUK) "🇬🇧 UK" else "🇺🇸 US", fontSize = 10.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF00695C),
                        selectedLabelColor = Color.White
                    )
                )
            }

            Spacer(Modifier.height(8.dp))

            Text(
                text = "${filteredWords.size} لغت یافت شد",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(Modifier.height(8.dp))

            // لیست لغات
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(filteredWords, key = { it.english }) { word ->
                    val isBookmarked = bookmarkedWords.contains(word.english)

                    WordItem(
                        word = word,
                        isBookmarked = isBookmarked,
                        searchQuery = searchQuery,
                        onSpeakClick = { speechHelper.speak(word.english) },
                        onLongClick = { selectedWord = word },
                        onBookmarkToggle = {
                            scope.launch {
                                BookmarkManager.toggleBookmark(context, word.english)
                            }
                        },
                        onShareClick = {
                            ShareHelper.shareWord(context, word.english, word.persian, word.pronunciation)
                        }
                    )
                }

                if (filteredWords.isEmpty()) {
                    item {
                        Column(
                            modifier = Modifier.fillMaxWidth().padding(40.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Filled.SearchOff,
                                contentDescription = null,
                                modifier = Modifier.size(64.dp),
                                tint = Color.LightGray
                            )
                            Spacer(Modifier.height(16.dp))
                            Text(
                                "لغتی با این مشخصات یافت نشد",
                                color = Color.Gray,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
    }

    // دیالوگ جزئیات کلمه (با نگه داشتن طولانی باز میشه)
    selectedWord?.let { word ->
        WordDetailDialog(
            word = word,
            isBookmarked = bookmarkedWords.contains(word.english),
            onDismiss = { selectedWord = null },
            onSpeakClick = { speechHelper.speak(word.english) },
            onBookmarkToggle = {
                scope.launch {
                    BookmarkManager.toggleBookmark(context, word.english)
                }
            },
            onShareClick = {
                ShareHelper.shareWord(context, word.english, word.persian, word.pronunciation)
            }
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WordItem(
    word: VocabWord,
    isBookmarked: Boolean,
    searchQuery: String,
    onSpeakClick: () -> Unit,
    onLongClick: () -> Unit,
    onBookmarkToggle: () -> Unit,
    onShareClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = { onSpeakClick() },
                onLongClick = { onLongClick() }
            ),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(levelColor(word.level).copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    word.english.first().uppercase(),
                    color = levelColor(word.level),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                // هایلایت کردن متن جستجو شده
                Text(
                    text = buildAnnotatedString {
                        val startIndex = word.english.indexOf(searchQuery, ignoreCase = true)
                        if (searchQuery.isNotEmpty() && startIndex >= 0) {
                            append(word.english.substring(0, startIndex))
                            withStyle(SpanStyle(background = Color(0xFFFFF59D), fontWeight = FontWeight.Bold)) {
                                append(word.english.substring(startIndex, startIndex + searchQuery.length))
                            }
                            append(word.english.substring(startIndex + searchQuery.length))
                        } else {
                            append(word.english)
                        }
                    },
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color(0xFF1A237E)
                )
                if (word.pronunciation.isNotEmpty()) {
                    Text(
                        "/${word.pronunciation}/",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        word.persian,
                        fontSize = 12.sp,
                        color = Color(0xFF00695C),
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(Modifier.width(8.dp))
                    // نشانگر سطح
                    Box(
                        modifier = Modifier
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(levelColor(word.level))
                    )
                }
            }

            IconButton(
                onClick = onBookmarkToggle,
                modifier = Modifier.size(36.dp)
            ) {
                Icon(
                    imageVector = if (isBookmarked) Icons.Filled.Bookmark else Icons.Filled.BookmarkBorder,
                    contentDescription = "Bookmark",
                    tint = if (isBookmarked) Color(0xFFFFA000) else Color.Gray,
                    modifier = Modifier.size(20.dp)
                )
            }

            IconButton(
                onClick = onShareClick,
                modifier = Modifier.size(36.dp)
            ) {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = "Share",
                    tint = Color(0xFF7B1FA2),
                    modifier = Modifier.size(20.dp)
                )
            }

            IconButton(
                onClick = onSpeakClick,
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF00695C).copy(alpha = 0.12f))
            ) {
                Icon(
                    Icons.AutoMirrored.Filled.VolumeUp,
                    contentDescription = "Play",
                    tint = Color(0xFF00695C),
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}

@Composable
fun WordDetailDialog(
    word: VocabWord,
    isBookmarked: Boolean,
    onDismiss: () -> Unit,
    onSpeakClick: () -> Unit,
    onBookmarkToggle: () -> Unit,
    onShareClick: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    word.english,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.weight(1f))
                IconButton(onClick = onSpeakClick) {
                    Icon(
                        Icons.AutoMirrored.Filled.VolumeUp,
                        contentDescription = "Speak",
                        tint = Color(0xFF00695C)
                    )
                }
            }
        },
        text = {
            Column {
                if (word.pronunciation.isNotEmpty()) {
                    Text(
                        "/${word.pronunciation}/",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.height(8.dp))
                }
                Text(
                    word.persian,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF00695C)
                )
                Spacer(Modifier.height(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(levelColor(word.level))
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        levelToPersian(word.level),
                        fontSize = 13.sp,
                        color = levelColor(word.level),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("بستن")
            }
        },
        dismissButton = {
            Row {
                IconButton(onClick = onBookmarkToggle) {
                    Icon(
                        imageVector = if (isBookmarked) Icons.Filled.Bookmark else Icons.Filled.BookmarkBorder,
                        contentDescription = "Bookmark",
                        tint = if (isBookmarked) Color(0xFFFFA000) else Color.Gray
                    )
                }
                IconButton(onClick = onShareClick) {
                    Icon(
                        Icons.Filled.Share,
                        contentDescription = "Share",
                        tint = Color(0xFF7B1FA2)
                    )
                }
            }
        }
    )
}