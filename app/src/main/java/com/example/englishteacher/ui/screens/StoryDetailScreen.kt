package com.example.englishteacher.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
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
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.Translate
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
import com.example.englishteacher.ShareHelper
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.StoryBookRepository
import com.example.englishteacher.data.StoryChapter
import com.example.englishteacher.ui.components.StoryCover
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryDetailScreen(
    storyId: String,
    onBack: () -> Unit,
    onQuizClick: (storyId: String, chapterNumber: Int) -> Unit = { _, _ -> }
) {
    val story = StoryBookRepository.getAllStories().firstOrNull { it.id == storyId }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }
    var isPlaying by remember { mutableStateOf(false) }
    var isBookmarked by remember { mutableStateOf(false) }
    var playingChapterIndex by remember { mutableIntStateOf(-1) }

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

    val levelColor = when (story.level) {
        Level.BEGINNER -> Color(0xFF11998E)
        Level.INTERMEDIATE -> Color(0xFF8E2DE2)
        Level.ADVANCED -> Color(0xFFF12711)
        else -> Color(0xFFE91E63)
    }

    val emoji = when (story.level) {
        Level.BEGINNER -> "🌱"
        Level.INTERMEDIATE -> "🚀"
        Level.ADVANCED -> "🏆"
        else -> "📖"
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
                            "${story.readingMinutes} دقیقه • $emoji ${story.level.persianName}",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
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
                    IconButton(onClick = {
                        scope.launch {
                            BookmarkManager.toggleStoryBookmark(context, storyId)
                        }
                    }) {
                        Icon(
                            imageVector = if (isBookmarked)
                                Icons.Filled.Bookmark
                            else
                                Icons.Filled.BookmarkBorder,
                            contentDescription = "Bookmark",
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
                        Icon(
                            Icons.Filled.Share,
                            contentDescription = "Share",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = levelColor)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {

            // ==================== کاور ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            ) {
                StoryCover(
                    coverUrl = story.coverUrl,
                    title = story.title,
                    modifier = Modifier.fillMaxSize()
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black.copy(alpha = 0.85f)
                                )
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

            Column(modifier = Modifier.padding(16.dp)) {

                // ==================== کارت اطلاعات ====================
                if (story.hasChapters) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = levelColor.copy(alpha = 0.1f)
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("📖", fontSize = 28.sp)
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    "این داستان ${story.chapters.size} فصل داره",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = levelColor
                                )
                                Text(
                                    "مجموعاً ${story.totalWords} کلمه • ${story.readingMinutes} دقیقه مطالعه",
                                    fontSize = 11.sp,
                                    color = Color.Gray
                                )
                            }
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                }

                // ==================== فصل‌ها ====================
                if (story.hasChapters) {
                    story.chapters.forEachIndexed { index, chapter ->
                        ChapterCard(
                            chapter = chapter,
                            index = index,
                            accent = levelColor,
                            isPlaying = playingChapterIndex == index && isPlaying,
                            onPlayClick = {
                                if (playingChapterIndex == index && isPlaying) {
                                    speechHelper.stop()
                                    isPlaying = false
                                    playingChapterIndex = -1
                                } else {
                                    speechHelper.stop()
                                    speechHelper.speak(chapter.text)
                                    isPlaying = true
                                    playingChapterIndex = index
                                }
                            },
                            onQuizClick = {
                                onQuizClick(storyId, chapter.number)
                            }
                        )
                        Spacer(Modifier.height(14.dp))
                    }
                } else {
                    // داستان بدون فصل
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(18.dp),
                        elevation = CardDefaults.cardElevation(3.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("📖", fontSize = 22.sp)
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    "متن داستان",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            }
                            Spacer(Modifier.height(14.dp))
                            Text(
                                story.text,
                                fontSize = 16.sp,
                                lineHeight = 28.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                    Spacer(Modifier.height(14.dp))

                    // دکمه پخش کل داستان
                    Button(
                        onClick = {
                            if (isPlaying) {
                                speechHelper.stop()
                                isPlaying = false
                            } else {
                                speechHelper.speak(story.text)
                                isPlaying = true
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = levelColor)
                    ) {
                        Icon(
                            imageVector = if (isPlaying) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                            contentDescription = null,
                            tint = Color.White
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            if (isPlaying) "توقف" else "پخش داستان",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
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

                Spacer(Modifier.height(30.dp))
            }
        }
    }
}

// ==================== کارت فصل ====================
@Composable
private fun ChapterCard(
    chapter: StoryChapter,
    index: Int,
    accent: Color,
    isPlaying: Boolean,
    onPlayClick: () -> Unit,
    onQuizClick: () -> Unit
) {
    var showTranslation by remember { mutableStateOf(false) }
    var showVocabulary by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column {

            // ==================== هدر فصل ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.horizontalGradient(
                            listOf(accent, accent.copy(alpha = 0.7f))
                        )
                    )
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "${chapter.number}",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            chapter.title,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            maxLines = 1
                        )
                        Text(
                            chapter.titlePersian,
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.9f),
                            maxLines = 1
                        )
                    }
                    IconButton(
                        onClick = onPlayClick,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f))
                    ) {
                        Icon(
                            imageVector = if (isPlaying) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }

            // ==================== متن انگلیسی ====================
            Column(modifier = Modifier.padding(18.dp)) {

                Text(
                    chapter.text,
                    fontSize = 16.sp,
                    lineHeight = 30.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Spacer(Modifier.height(14.dp))

                // ==================== دکمه نمایش ترجمه ====================
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { showTranslation = !showTranslation },
                    color = accent.copy(alpha = 0.08f)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Filled.Translate,
                            contentDescription = null,
                            tint = accent,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            if (showTranslation) "بستن ترجمه فارسی" else "نمایش ترجمه فارسی",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = accent,
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            imageVector = if (showTranslation)
                                Icons.Filled.ExpandLess
                            else
                                Icons.Filled.ExpandMore,
                            contentDescription = null,
                            tint = accent,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                // ==================== ترجمه فارسی (پنهان) ====================
                AnimatedVisibility(
                    visible = showTranslation,
                    enter = fadeIn() + expandVertically(),
                    exit = fadeOut() + shrinkVertically()
                ) {
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        shape = RoundedCornerShape(12.dp),
                        color = MaterialTheme.colorScheme.surfaceVariant
                    ) {
                        Text(
                            chapter.textPersian,
                            modifier = Modifier.padding(14.dp),
                            fontSize = 14.sp,
                            lineHeight = 26.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // ==================== لغات جدید ====================
                if (chapter.vocabulary.isNotEmpty()) {
                    Spacer(Modifier.height(14.dp))

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .clickable { showVocabulary = !showVocabulary },
                        color = Color(0xFFFFF3E0)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 14.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("📚", fontSize = 18.sp)
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "لغات جدید (${chapter.vocabulary.size})",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFFE65100),
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                imageVector = if (showVocabulary)
                                    Icons.Filled.ExpandLess
                                else
                                    Icons.Filled.ExpandMore,
                                contentDescription = null,
                                tint = Color(0xFFE65100),
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    AnimatedVisibility(
                        visible = showVocabulary,
                        enter = fadeIn() + expandVertically(),
                        exit = fadeOut() + shrinkVertically()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp)
                        ) {
                            chapter.vocabulary.forEach { word ->
                                Surface(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 3.dp),
                                    shape = RoundedCornerShape(10.dp),
                                    color = Color(0xFFFFFDE7)
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 12.dp, vertical = 10.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                word.english,
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(0xFF1A237E)
                                            )
                                            if (word.pronunciation.isNotEmpty()) {
                                                Text(
                                                    "/${word.pronunciation}/",
                                                    fontSize = 11.sp,
                                                    color = Color.Gray
                                                )
                                            }
                                        }
                                        Text(
                                            word.persian,
                                            fontSize = 13.sp,
                                            color = Color(0xFFE65100),
                                            fontWeight = FontWeight.SemiBold
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // ==================== دکمه کوییز فصل ====================
                if (chapter.quiz.isNotEmpty()) {
                    Spacer(Modifier.height(14.dp))

                    Button(
                        onClick = onQuizClick,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = accent)
                    ) {
                        Icon(
                            Icons.Filled.Quiz,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "شروع کوییز فصل ${chapter.number}",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}