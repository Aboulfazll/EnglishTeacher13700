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
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VocabularyBankScreen() {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    // گرفتن همه لغات از همه دروس
    val allWords = remember {
        val list = mutableListOf<Pair<String, String>>() // (english, level)
        Level.values().forEach { level ->
            val lessons = LessonRepository.getLessonsByLevel(level)
            lessons.forEach { lesson ->
                lesson.vocabulary.forEach { word ->
                    list.add(word.english to level.persianName)
                }
            }
        }
        list.distinctBy { it.first }
    }

    var searchQuery by remember { mutableStateOf("") }
    var selectedLevel by remember { mutableStateOf<String?>(null) }

    val filteredWords = allWords.filter { (english, level) ->
        val matchesSearch = searchQuery.isEmpty() || english.contains(searchQuery, ignoreCase = true)
        val matchesLevel = selectedLevel == null || level == selectedLevel
        matchesSearch && matchesLevel
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

            // ==================== نوار جستجو ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
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
                    shape = RoundedCornerShape(12.dp),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF00695C),
                        unfocusedBorderColor = Color.LightGray
                    )
                )
            }

            // ==================== فیلتر سطح ====================
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChip(
                    selected = selectedLevel == null,
                    onClick = { selectedLevel = null },
                    label = { Text("همه", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF00695C),
                        selectedLabelColor = Color.White
                    )
                )
                FilterChip(
                    selected = selectedLevel == "مبتدی",
                    onClick = { selectedLevel = if (selectedLevel == "مبتدی") null else "مبتدی" },
                    label = { Text("مبتدی", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF11998E),
                        selectedLabelColor = Color.White
                    )
                )
                FilterChip(
                    selected = selectedLevel == "متوسط",
                    onClick = { selectedLevel = if (selectedLevel == "متوسط") null else "متوسط" },
                    label = { Text("متوسط", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF8E2DE2),
                        selectedLabelColor = Color.White
                    )
                )
                FilterChip(
                    selected = selectedLevel == "پیشرفته",
                    onClick = { selectedLevel = if (selectedLevel == "پیشرفته") null else "پیشرفته" },
                    label = { Text("پیشرفته", fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFFF12711),
                        selectedLabelColor = Color.White
                    )
                )
            }

            Spacer(Modifier.height(8.dp))

            // ==================== نتیجه ====================
            Text(
                text = "${filteredWords.size} لغت پیدا شد",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(Modifier.height(8.dp))

            // ==================== لیست لغات ====================
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(filteredWords) { (english, level) ->
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        elevation = CardDefaults.cardElevation(2.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // آیکون حرف اول
                            Box(
                                modifier = Modifier
                                    .size(42.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF00695C).copy(alpha = 0.15f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    english.first().uppercase(),
                                    color = Color(0xFF00695C),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Spacer(Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    english,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color(0xFF1A237E)
                                )
                                Spacer(Modifier.height(3.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(6.dp))
                                        .background(Color(0xFF00695C).copy(alpha = 0.1f))
                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Text(
                                        level,
                                        fontSize = 10.sp,
                                        color = Color(0xFF00695C),
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }

                            IconButton(
                                onClick = { speechHelper.speak(english) },
                                modifier = Modifier
                                    .size(42.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF00695C).copy(alpha = 0.12f))
                            ) {
                                Icon(
                                    Icons.AutoMirrored.Filled.VolumeUp,
                                    contentDescription = "Play",
                                    tint = Color(0xFF00695C),
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}