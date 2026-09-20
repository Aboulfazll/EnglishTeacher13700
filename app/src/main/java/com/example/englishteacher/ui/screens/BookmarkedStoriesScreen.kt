package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Delete
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.Story
import com.example.englishteacher.data.StoryBookRepository
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookmarkedStoriesScreen(
    onStoryClick: (String) -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var bookmarkedIds by remember { mutableStateOf<Set<String>>(emptySet()) }

    LaunchedEffect(Unit) {
        BookmarkManager.getBookmarkedStories(context).collectLatest {
            bookmarkedIds = it
        }
    }

    val bookmarkedStories: List<Story> = remember(bookmarkedIds) {
        StoryBookRepository.getAllStories().filter { it.id in bookmarkedIds }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🔖 داستان‌های ذخیره‌شده",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "${bookmarkedStories.size} داستان",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFE91E63))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            if (bookmarkedStories.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(40.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFFCE4EC)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Bookmark,
                                contentDescription = null,
                                tint = Color(0xFFE91E63),
                                modifier = Modifier.size(60.dp)
                            )
                        }
                        Spacer(Modifier.height(20.dp))
                        Text(
                            "هنوز داستانی ذخیره نکردی",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "توی هر داستان، روی آیکون 🔖 بالای صفحه بزن تا اینجا ذخیره بشه",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            textAlign = TextAlign.Center,
                            lineHeight = 20.sp
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(bookmarkedStories, key = { it.id }) { story ->
                        val levelColor = when (story.level) {
                            Level.BEGINNER -> Color(0xFF11998E)
                            Level.INTERMEDIATE -> Color(0xFF8E2DE2)
                            Level.ADVANCED -> Color(0xFFF12711)
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onStoryClick(story.id) },
                            shape = RoundedCornerShape(18.dp),
                            elevation = CardDefaults.cardElevation(4.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(80.dp)
                                        .clip(RoundedCornerShape(14.dp))
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
                                                    listOf(
                                                        Color.Transparent,
                                                        Color.Black.copy(alpha = 0.3f)
                                                    )
                                                )
                                            )
                                    )
                                }

                                Spacer(Modifier.width(12.dp))

                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        story.title,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color(0xFF1A237E),
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                    Text(
                                        story.titlePersian,
                                        fontSize = 12.sp,
                                        color = Color.Gray,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                    Spacer(Modifier.height(6.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(6.dp))
                                            .background(levelColor.copy(alpha = 0.12f))
                                            .padding(horizontal = 8.dp, vertical = 3.dp)
                                    ) {
                                        Text(
                                            story.level.persianName,
                                            fontSize = 10.sp,
                                            color = levelColor,
                                            fontWeight = FontWeight.SemiBold
                                        )
                                    }
                                }

                                IconButton(
                                    onClick = {
                                        scope.launch {
                                            BookmarkManager.removeStoryBookmark(context, story.id)
                                        }
                                    },
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFD32F2F).copy(alpha = 0.1f))
                                ) {
                                    Icon(
                                        Icons.Filled.Delete,
                                        contentDescription = "حذف",
                                        tint = Color(0xFFD32F2F),
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                        }
                    }

                    item { Spacer(Modifier.height(20.dp)) }
                }
            }
        }
    }
}