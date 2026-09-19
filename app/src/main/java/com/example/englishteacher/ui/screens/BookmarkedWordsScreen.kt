package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Delete
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
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.Word
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookmarkedWordsScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    var bookmarkedIds by remember { mutableStateOf<Set<String>>(emptySet()) }

    LaunchedEffect(Unit) {
        BookmarkManager.getBookmarkedWords(context).collectLatest { bookmarkedIds = it }
    }

    // جمع‌آوری همه لغات ذخیره‌شده از دروس
    val bookmarkedWords: List<Pair<Word, String>> = remember(bookmarkedIds) {
        val list = mutableListOf<Pair<Word, String>>()
        Level.values().forEach { level ->
            val lessons = LessonRepository.getLessonsByLevel(level)
            lessons.forEach { lesson ->
                lesson.vocabulary.forEach { word ->
                    if (bookmarkedIds.contains(word.english)) {
                        list.add(word to level.persianName)
                    }
                }
            }
        }
        list.distinctBy { it.first.english }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("🔖 لغات ذخیره‌شده", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "${bookmarkedWords.size} لغت",
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
        ) {
            if (bookmarkedWords.isEmpty()) {
                // حالت خالی
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
                                .background(Color(0xFFE8EAF6)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Bookmark,
                                contentDescription = null,
                                tint = Color(0xFF1A237E),
                                modifier = Modifier.size(60.dp)
                            )
                        }
                        Spacer(Modifier.height(20.dp))
                        Text(
                            "هنوز لغتی ذخیره نکردی",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "توی بانک لغات یا دروس، روی آیکون 🔖 بزن تا لغات اینجا ذخیره شن",
                            fontSize = 13.sp,
                            color = Color.Gray,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                            lineHeight = 20.sp
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(bookmarkedWords) { (word, levelName) ->
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            elevation = CardDefaults.cardElevation(3.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(14.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(46.dp)
                                        .clip(CircleShape)
                                        .background(
                                            Brush.linearGradient(
                                                listOf(
                                                    Color(0xFF1A237E).copy(alpha = 0.15f),
                                                    Color(0xFF1A237E).copy(alpha = 0.3f)
                                                )
                                            )
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        word.english.first().uppercase(),
                                        color = Color(0xFF1A237E),
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                Spacer(Modifier.width(12.dp))

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
                                        color = Color(0xFF1A237E),
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    Spacer(Modifier.height(4.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(6.dp))
                                            .background(Color(0xFF1A237E).copy(alpha = 0.08f))
                                            .padding(horizontal = 6.dp, vertical = 2.dp)
                                    ) {
                                        Text(
                                            levelName,
                                            fontSize = 10.sp,
                                            color = Color(0xFF1A237E),
                                            fontWeight = FontWeight.SemiBold
                                        )
                                    }
                                }

                                // دکمه پخش
                                IconButton(
                                    onClick = { speechHelper.speak(word.english) },
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF1A237E).copy(alpha = 0.1f))
                                ) {
                                    Icon(
                                        Icons.AutoMirrored.Filled.VolumeUp,
                                        contentDescription = "Play",
                                        tint = Color(0xFF1A237E),
                                        modifier = Modifier.size(20.dp)
                                    )
                                }

                                Spacer(Modifier.width(4.dp))

                                // دکمه حذف
                                IconButton(
                                    onClick = {
                                        scope.launch {
                                            BookmarkManager.removeBookmark(context, word.english)
                                        }
                                    },
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFFD32F2F).copy(alpha = 0.1f))
                                ) {
                                    Icon(
                                        Icons.Filled.Delete,
                                        contentDescription = "Delete",
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