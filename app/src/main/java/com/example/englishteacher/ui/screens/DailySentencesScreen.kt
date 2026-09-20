package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Search
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
import com.example.englishteacher.data.DailySentence
import com.example.englishteacher.data.DailySentencesRepository
import com.example.englishteacher.data.SentenceCategory

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DailySentencesScreen(onStartQuiz: () -> Unit = {}) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    var selectedCategory by remember { mutableStateOf<SentenceCategory?>(null) }

    if (selectedCategory != null) {
        SentencesListView(
            category = selectedCategory!!,
            speechHelper = speechHelper,
            onBack = { selectedCategory = null }
        )
    } else {
        CategoriesListView(
            speechHelper = speechHelper,
            onCategoryClick = { selectedCategory = it },
            onStartQuiz = onStartQuiz
        )
    }
}

// ==================== لیست دسته‌بندی‌ها ====================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CategoriesListView(
    speechHelper: SpeechHelper,
    onCategoryClick: (SentenceCategory) -> Unit,
    onStartQuiz: () -> Unit
) {
    val categories = DailySentencesRepository.getAllCategories()
    var searchQuery by remember { mutableStateOf("") }
    val searchResults = remember(searchQuery) {
        DailySentencesRepository.searchSentences(searchQuery)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "💬 جملات روزمره",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "${categories.size} دسته‌بندی • ${categories.sumOf { it.sentences.size }} جمله",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                actions = {
                    IconButton(onClick = onStartQuiz) {
                        Icon(
                            Icons.Filled.Quiz,
                            contentDescription = "کوییز",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF00695C)
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {

            // ==================== کارت کوییز ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
                    .clickable { onStartQuiz() },
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
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.EmojiEvents,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "🎯 کوییز جملات روزمره",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "۱۰ سؤال تصادفی — خودت رو محک بزن!",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "→",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // ==================== نوار جستجو ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    placeholder = { Text("جستجوی جمله...") },
                    leadingIcon = {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = null,
                            tint = Color(0xFF00695C)
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(
                                    Icons.Filled.Clear,
                                    contentDescription = "پاک کردن",
                                    tint = Color.Gray
                                )
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

            // ==================== نتایج جستجو یا دسته‌بندی‌ها ====================
            if (searchQuery.isNotBlank()) {
                if (searchResults.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("🔍", fontSize = 48.sp)
                            Spacer(Modifier.height(10.dp))
                            Text(
                                "جمله‌ای پیدا نشد",
                                fontSize = 16.sp,
                                color = Color.Gray
                            )
                        }
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        item {
                            Text(
                                "🔍 ${searchResults.size} نتیجه",
                                fontSize = 13.sp,
                                color = Color.Gray,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.padding(bottom = 4.dp)
                            )
                        }
                        items(searchResults) { sentence ->
                            SentenceCard(
                                sentence = sentence,
                                accent = Color(0xFF00695C),
                                speechHelper = speechHelper
                            )
                        }
                        item { Spacer(Modifier.height(20.dp)) }
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(categories) { category ->
                        CategoryCard(category) { onCategoryClick(category) }
                    }
                    item { Spacer(Modifier.height(20.dp)) }
                }
            }
        }
    }
}

// ==================== کارت دسته‌بندی ====================
@Composable
private fun CategoryCard(category: SentenceCategory, onClick: () -> Unit) {
    val color = Color(category.color)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(
                            listOf(
                                color.copy(alpha = 0.25f),
                                color.copy(alpha = 0.45f)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(category.emoji, fontSize = 26.sp)
            }

            Spacer(Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    category.titlePersian,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color(0xFF1A237E)
                )
                Text(
                    category.title,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(Modifier.height(6.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(color.copy(alpha = 0.12f))
                        .padding(horizontal = 8.dp, vertical = 3.dp)
                ) {
                    Text(
                        "${category.sentences.size} جمله",
                        fontSize = 10.sp,
                        color = color,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Box(
                modifier = Modifier
                    .size(34.dp)
                    .clip(CircleShape)
                    .background(color.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "→",
                    color = color,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

// ==================== لیست جملات یک دسته ====================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SentencesListView(
    category: SentenceCategory,
    speechHelper: SpeechHelper,
    onBack: () -> Unit
) {
    val color = Color(category.color)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "${category.emoji} ${category.titlePersian}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                        Text(
                            "${category.sentences.size} جمله",
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = color)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = color.copy(alpha = 0.1f)
                    ),
                    elevation = CardDefaults.cardElevation(0.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("💡", fontSize = 22.sp)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "👆 روی دکمه‌ی 🔊 بزن تا جمله رو بشنوی",
                            fontSize = 12.sp,
                            color = color,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            items(category.sentences) { sentence ->
                SentenceCard(
                    sentence = sentence,
                    accent = color,
                    speechHelper = speechHelper
                )
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

// ==================== کارت جمله ====================
@Composable
private fun SentenceCard(
    sentence: DailySentence,
    accent: Color,
    speechHelper: SpeechHelper
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                ClickableStoryText(
                    text = sentence.english,
                    accent = accent,
                    fontSize = 15,
                    lineHeight = 22,
                    showHint = false,
                    baseColor = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    sentence.persian,
                    fontSize = 13.sp,
                    color = Color.Gray,
                    lineHeight = 20.sp
                )
            }

            Spacer(Modifier.width(8.dp))

            IconButton(
                onClick = { speechHelper.speak(sentence.english) },
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(accent.copy(alpha = 0.13f))
            ) {
                Icon(
                    Icons.AutoMirrored.Filled.VolumeUp,
                    contentDescription = "پخش",
                    tint = accent,
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}