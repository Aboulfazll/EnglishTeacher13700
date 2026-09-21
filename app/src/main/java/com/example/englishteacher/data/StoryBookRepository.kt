package com.example.englishteacher.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.ShareHelper
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.StoryBookRepository
import com.example.englishteacher.data.StoryChapters
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryDetailScreen(
    storyId: String,
    onBack: () -> Unit
) {
    val story = StoryBookRepository.getAllStories().firstOrNull { it.id == storyId }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }
    var isPlaying by remember { mutableStateOf(false) }
    var isBookmarked by remember { mutableStateOf(false) }
    var expandedChapter by remember { mutableIntStateOf(0) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    LaunchedEffect(storyId) {
        ProgressManager.markStoryRead(context, storyId)
    }

    LaunchedEffect(storyId) {
        BookmarkManager.isStoryBookmarked(context, storyId).collectLatest {
            isBookmarked = it
        }
    }

    if (story == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("داستان پیدا نشد")
        }
        return
    }

    // فصل‌های داستان
    val chapters = remember(storyId) {
        StoryChapters.getChaptersForStory(storyId)
    }

    val levelColor = when (story.level) {
        Level.BEGINNER -> Color(0xFF11998E)
        Level.INTERMEDIATE -> Color(0xFF8E2DE2)
        Level.ADVANCED -> Color(0xFFF12711)
    }

    val emoji = when (story.level) {
        Level.BEGINNER -> "🌱"
        Level.INTERMEDIATE -> "🚀"
        Level.ADVANCED -> "🏆"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            story.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            maxLines = 1
                        )
                        Text(
                            story.titlePersian,
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {
                        scope.launch {
                            BookmarkManager.toggleStoryBookmark(context, storyId)
                        }
                    }) {
                        Icon(
                            if (isBookmarked) Icons.Filled.Bookmark
                            else Icons.Filled.BookmarkBorder,
                            "Bookmark",
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = {
                        ShareHelper.shareStory(
                            context = context,
                            title = story.title,
                            titlePersian = story.titlePersian,
                            text = story.text,
                            moral = story.moral
                        )
                    }) {
                        Icon(Icons.Filled.Share, "Share", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = levelColor)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {

            // ==================== تصویر جلد ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
            ) {
                if (story.coverUrl.isNotEmpty()) {
                    AsyncImage(
                        model = story.coverUrl,
                        contentDescription = story.title,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    listOf(levelColor, levelColor.copy(alpha = 0.7f))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(getStoryEmoji(story.id), fontSize = 90.sp)
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                listOf(Color.Transparent, Color.Black.copy(alpha = 0.85f))
                            )
                        )
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(20.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(levelColor)
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            "$emoji ${story.level.persianName}",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    Text(
                        story.title,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        story.titlePersian,
                        fontSize = 15.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }

            Column(modifier = Modifier.padding(20.dp)) {

                // ==================== دکمه‌های پخش ====================
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(
                        onClick = {
                            val fullText = if (chapters.isNotEmpty()) {
                                chapters.joinToString(" ") { it.text }
                            } else story.text
                            if (isPlaying) speechHelper.stop() else speechHelper.speak(fullText)
                            isPlaying = !isPlaying
                        },
                        modifier = Modifier.weight(1f).height(56.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = levelColor)
                    ) {
                        Icon(
                            if (isPlaying) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                            null,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            if (isPlaying) "توقف" else "پخش کامل",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }

                    OutlinedButton(
                        onClick = {
                            ShareHelper.shareStory(
                                context = context,
                                title = story.title,
                                titlePersian = story.titlePersian,
                                text = story.text,
                                moral = story.moral
                            )
                        },
                        modifier = Modifier.height(56.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = levelColor)
                    ) {
                        Icon(Icons.Filled.Share, "Share", tint = levelColor, modifier = Modifier.size(22.dp))
                    }
                }

                Spacer(Modifier.height(20.dp))

                // ==================== فصل‌ها یا متن ساده ====================
                if (chapters.isNotEmpty()) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📖", fontSize = 22.sp)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "فصل‌های داستان",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Spacer(Modifier.weight(1f))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(levelColor.copy(alpha = 0.12f))
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                "${chapters.size} فصل",
                                fontSize = 11.sp,
                                color = levelColor,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    chapters.forEachIndexed { index, chapter ->
                        ChapterCard(
                            chapter = chapter,
                            index = index,
                            levelColor = levelColor,
                            speechHelper = speechHelper,
                            isExpanded = expandedChapter == index,
                            onToggle = {
                                expandedChapter = if (expandedChapter == index) -1 else index
                            }
                        )
                        Spacer(Modifier.height(10.dp))
                    }
                } else {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(18.dp),
                        elevation = CardDefaults.cardElevation(3.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("📖", fontSize = 22.sp)
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    "متن داستان",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF1A237E)
                                )
                                Spacer(Modifier.weight(1f))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(levelColor.copy(alpha = 0.12f))
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                ) {
                                    Text(
                                        "👆 لمس کن",
                                        fontSize = 10.sp,
                                        color = levelColor,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                            Spacer(Modifier.height(14.dp))

                            ClickableStoryText(
                                text = story.text,
                                accent = levelColor,
                                fontSize = 16,
                                lineHeight = 30
                            )
                        }
                    }
                }

                Spacer(Modifier.height(16.dp))

                // ==================== نتیجه اخلاقی ====================
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    elevation = CardDefaults.cardElevation(3.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Brush.horizontalGradient(
                                    listOf(Color(0xFFFFA726), Color(0xFFFFD54F))
                                )
                            )
                            .padding(16.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("💡", fontSize = 26.sp)
                            Spacer(Modifier.width(10.dp))
                            Text(
                                "نتیجه اخلاقی",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFFFF8E1))
                            .padding(18.dp)
                    ) {
                        Column {
                            Text(
                                story.moral,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFE65100),
                                lineHeight = 24.sp
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                story.moralPersian,
                                fontSize = 13.sp,
                                color = Color(0xFF6D4C41),
                                lineHeight = 22.sp
                            )
                        }
                    }
                }

                Spacer(Modifier.height(16.dp))

                // ==================== کارت اطلاعات ====================
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = levelColor.copy(alpha = 0.1f)),
                    elevation = CardDefaults.cardElevation(1.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(levelColor.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(emoji, fontSize = 22.sp)
                        }
                        Spacer(Modifier.width(12.dp))
                        Column {
                            Text("سطح داستان", fontSize = 11.sp, color = Color.Gray)
                            Text(
                                story.level.persianName,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = levelColor
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        Text(
                            "${story.text.split(" ").size} کلمه",
                            fontSize = 12.sp,
                            color = Color.Gray,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Spacer(Modifier.height(30.dp))
            }
        }
    }
}

// ==================== کارت فصل ====================
@Composable
private fun ChapterCard(
    chapter: com.example.englishteacher.data.StoryChapter,
    index: Int,
    levelColor: Color,
    speechHelper: SpeechHelper,
    isExpanded: Boolean,
    onToggle: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(if (isExpanded) 5.dp else 3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            // Header فصل
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onToggle() }
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                levelColor.copy(alpha = 0.12f),
                                levelColor.copy(alpha = 0.05f)
                            )
                        )
                    )
                    .padding(14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(levelColor),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "${index + 1}",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        chapter.title,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        chapter.titlePersian,
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }

                // دکمه پخش فصل
                IconButton(
                    onClick = { speechHelper.speak(chapter.text) },
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(levelColor.copy(alpha = 0.12f))
                ) {
                    Icon(
                        Icons.Filled.PlayArrow,
                        "Play",
                        tint = levelColor,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Spacer(Modifier.width(4.dp))

                Icon(
                    if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    "Expand",
                    tint = levelColor
                )
            }

            // محتوای فصل
            AnimatedVisibility(
                visible = isExpanded,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    // متن انگلیسی
                    ClickableStoryText(
                        text = chapter.text,
                        accent = levelColor,
                        fontSize = 15,
                        lineHeight = 26
                    )

                    Spacer(Modifier.height(12.dp))

                    Divider(color = levelColor.copy(alpha = 0.2f))

                    Spacer(Modifier.height(12.dp))

                    // ترجمه فارسی
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("🇮🇷", fontSize = 14.sp)
                        Spacer(Modifier.width(6.dp))
                        Text(
                            "ترجمه",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = levelColor
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        chapter.persianTranslation,
                        fontSize = 13.sp,
                        color = Color(0xFF424242),
                        lineHeight = 22.sp
                    )
                }
            }
        }
    }
}

private fun getStoryEmoji(storyId: String): String {
    return when {
        storyId.contains("b1") -> "🐱"
        storyId.contains("b2") -> "🥖"
        storyId.contains("b3") -> "👥"
        storyId.contains("b4") -> "🌻"
        storyId.contains("b5") -> "💰"
        storyId.contains("b6") -> "🐕"
        storyId.contains("b7") -> "🐦"
        storyId.contains("b8") -> "☔"
        storyId.contains("b9") -> "🏫"
        storyId.contains("b10") -> "🎈"
        storyId.contains("b11") -> "🐦‍⬛"
        storyId.contains("b12") -> "🦊"
        storyId.contains("b13") -> "🐜"
        storyId.contains("b14") -> "🦁"
        storyId.contains("b15") -> "🐢"
        storyId.contains("b16") -> "🍇"
        storyId.contains("b17") -> "🐕"
        storyId.contains("b18") -> "🪓"
        storyId.contains("b19") -> "🐸"
        storyId.contains("b20") -> "🐺"
        storyId.contains("b21") -> "🥚"
        storyId.contains("b22") -> "🐻"
        storyId.contains("b23") -> "🥛"
        storyId.contains("b24") -> "🦴"
        storyId.contains("b25") -> "🌾"
        storyId.contains("b26") -> "☀️"
        storyId.contains("b27") -> "🐭"
        storyId.contains("b28") -> "🦢"
        storyId.contains("b29") -> "🐷"
        storyId.contains("b30") -> "🐔"
        storyId.contains("b31") -> "🐻"
        storyId.contains("b32") -> "🍪"
        storyId.contains("b33") -> "🥕"
        storyId.contains("b34") -> "🍲"
        storyId.contains("b35") -> "👸"
        storyId.contains("b36") -> "🧝"
        storyId.contains("b37") -> "🧣"
        storyId.contains("b38") -> "🦁"
        storyId.contains("b39") -> "🐺"
        storyId.contains("b40") -> "🦊"
        storyId.contains("b41") -> "🐇"
        storyId.contains("b42") -> "🐺"
        storyId.contains("b43") -> "🐒"
        storyId.contains("b44") -> "🐘"
        storyId.contains("b45") -> "🐐"
        storyId.contains("b46") -> "🐄"
        storyId.contains("b47") -> "🦩"
        storyId.contains("b48") -> "🐕"
        storyId.contains("b49") -> "🦇"
        storyId.contains("b50") -> "🌾"
        storyId.contains("i1") -> "⚖️"
        storyId.contains("i2") -> "👬"
        storyId.contains("i3") -> "🎋"
        storyId.contains("i4") -> "👑"
        storyId.contains("i5") -> "🎓"
        storyId.contains("i6") -> "🏗️"
        storyId.contains("i7") -> "🧘"
        storyId.contains("i8") -> "🏜️"
        storyId.contains("i9") -> "🗺️"
        storyId.contains("i10") -> "💎"
        storyId.contains("i11") -> "🌉"
        storyId.contains("i12") -> "🔔"
        storyId.contains("i13") -> "🌳"
        storyId.contains("i14") -> "✉️"
        storyId.contains("i15") -> "🗼"
        storyId.contains("i16") -> "🐺"
        storyId.contains("i17") -> "🏺"
        storyId.contains("i18") -> "🧩"
        storyId.contains("i19") -> "👑"
        storyId.contains("i20") -> "📖"
        storyId.contains("i21") -> "🌊"
        storyId.contains("i22") -> "👨‍👦"
        storyId.contains("i23") -> "🏮"
        storyId.contains("i24") -> "✂️"
        storyId.contains("i25") -> "🧭"
        storyId.contains("i26") -> "📷"
        storyId.contains("i27") -> "📢"
        storyId.contains("i28") -> "⏳"
        storyId.contains("i29") -> "✨"
        storyId.contains("i30") -> "📞"
        storyId.contains("a1") -> "💡"
        storyId.contains("a2") -> "👂"
        storyId.contains("a3") -> "🚶"
        storyId.contains("a4") -> "👑"
        storyId.contains("a5") -> "🙏"
        storyId.contains("a6") -> "⚖️"
        storyId.contains("a7") -> "🎭"
        storyId.contains("a8") -> "♟️"
        storyId.contains("a9") -> "💬"
        storyId.contains("a10") -> "📝"
        storyId.contains("a11") -> "🧠"
        storyId.contains("a12") -> "🧘"
        storyId.contains("a13") -> "🛒"
        storyId.contains("a14") -> "🏺"
        storyId.contains("a15") -> "🌱"
        storyId.contains("a16") -> "⏰"
        storyId.contains("a17") -> "🪞"
        storyId.contains("a18") -> "🎁"
        storyId.contains("a19") -> "🚪"
        storyId.contains("a20") -> "🕊️"
        else -> "📖"
    }
}