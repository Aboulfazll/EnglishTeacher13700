package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
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
import com.example.englishteacher.BookmarkManager
import com.example.englishteacher.ShareHelper
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.StoryBookRepository
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

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    // ثبت داستان به عنوان خونده‌شده
    LaunchedEffect(storyId) {
        ProgressManager.markStoryRead(context, storyId)
    }

    // چک کردن وضعیت بوکمارک
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
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    // 🔖 دکمه بوکمارک
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

                    // اشتراک‌گذاری
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
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
            ) {
                AsyncImage(
                    model = story.coverUrl,
                    contentDescription = story.title,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
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

            Column(modifier = Modifier.padding(20.dp)) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(
                        onClick = {
                            if (isPlaying) {
                                speechHelper.stop()
                            } else {
                                speechHelper.speak(story.text)
                            }
                            isPlaying = !isPlaying
                        },
                        modifier = Modifier.weight(1f).height(56.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = levelColor)
                    ) {
                        Icon(
                            imageVector = if (isPlaying) Icons.Filled.Stop else Icons.Filled.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = if (isPlaying) "توقف" else "پخش",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                    }

                    OutlinedButton(
                        onClick = {
                            scope.launch {
                                BookmarkManager.toggleStoryBookmark(context, storyId)
                            }
                        },
                        modifier = Modifier.height(56.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = levelColor)
                    ) {
                        Icon(
                            imageVector = if (isBookmarked)
                                Icons.Filled.Bookmark
                            else
                                Icons.Filled.BookmarkBorder,
                            contentDescription = "Bookmark",
                            tint = levelColor,
                            modifier = Modifier.size(22.dp)
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
                        Icon(
                            Icons.Filled.Share,
                            contentDescription = "Share",
                            tint = levelColor,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }

                Spacer(Modifier.height(20.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(18.dp)),
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

                Spacer(Modifier.height(16.dp))

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