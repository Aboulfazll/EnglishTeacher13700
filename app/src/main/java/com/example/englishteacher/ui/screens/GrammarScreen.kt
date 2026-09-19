package com.example.englishteacher.ui.screens

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
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
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
import com.example.englishteacher.data.GrammarRepository
import com.example.englishteacher.data.GrammarTopic

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GrammarScreen() {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    var selectedTopic by remember { mutableStateOf<GrammarTopic?>(null) }

    if (selectedTopic != null) {
        GrammarDetailView(
            topic = selectedTopic!!,
            speechHelper = speechHelper,
            onBack = { selectedTopic = null }
        )
    } else {
        GrammarListView(
            onTopicClick = { selectedTopic = it }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun GrammarListView(
    onTopicClick: (GrammarTopic) -> Unit
) {
    val allTopics = GrammarRepository.getAllTopics()
    var searchQuery by remember { mutableStateOf("") }

    val filteredTopics = if (searchQuery.isEmpty()) {
        allTopics
    } else {
        allTopics.filter {
            it.title.contains(searchQuery, ignoreCase = true) ||
            it.titlePersian.contains(searchQuery)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("📖 کتابخانه گرامر", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "${allTopics.size} موضوع گرامری",
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

            // نوار جستجو
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
                    placeholder = { Text("جستجوی گرامر...") },
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

            // لیست گرامرها
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                val grouped = filteredTopics.groupBy { it.category }

                grouped.forEach { (category, topics) ->
                    item {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(4.dp, 22.dp)
                                    .clip(RoundedCornerShape(2.dp))
                                    .background(Color(0xFF00695C))
                            )
                            Spacer(Modifier.width(10.dp))
                            Text(
                                category,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                        }
                    }

                    items(topics) { topic ->
                        BeautifulGrammarCard(topic) { onTopicClick(topic) }
                    }
                }

                item { Spacer(Modifier.height(20.dp)) }
            }
        }
    }
}

@Composable
private fun BeautifulGrammarCard(topic: GrammarTopic, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
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
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(
                            listOf(Color(0xFF00695C).copy(alpha = 0.2f), Color(0xFF00695C).copy(alpha = 0.4f))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.Book,
                    contentDescription = null,
                    tint = Color(0xFF00695C),
                    modifier = Modifier.size(26.dp)
                )
            }

            Spacer(Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    topic.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    topic.titlePersian,
                    color = Color.Gray,
                    fontSize = 12.sp
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "${topic.examples.size} مثال",
                    fontSize = 10.sp,
                    color = Color(0xFF00695C),
                    fontWeight = FontWeight.SemiBold
                )
            }

            Box(
                modifier = Modifier
                    .size(34.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF00695C).copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "→",
                    color = Color(0xFF00695C),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun GrammarDetailView(
    topic: GrammarTopic,
    speechHelper: SpeechHelper,
    onBack: () -> Unit
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(topic.title, fontWeight = FontWeight.Bold, fontSize = 15.sp, maxLines = 1)
                        Text(
                            topic.titlePersian,
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
                    IconButton(onClick = {
                        ShareHelper.shareGrammar(
                            context = context,
                            title = topic.title,
                            titlePersian = topic.titlePersian,
                            explanation = topic.explanation,
                            examples = topic.examples.map { it.english + " — " + it.persian }
                        )
                    }) {
                        Icon(
                            Icons.Filled.Share,
                            contentDescription = "Share",
                            tint = Color.White
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
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {

            // دکمه اشتراک‌گذاری
            OutlinedButton(
                onClick = {
                    ShareHelper.shareGrammar(
                        context = context,
                        title = topic.title,
                        titlePersian = topic.titlePersian,
                        explanation = topic.explanation,
                        examples = topic.examples.map { it.english + " — " + it.persian }
                    )
                },
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF00695C))
            ) {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = "Share",
                    tint = Color(0xFF00695C),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(8.dp))
                Text("اشتراک‌گذاری این گرامر", fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(16.dp))

            // توضیح
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
                                listOf(Color(0xFF00695C), Color(0xFF26A69A))
                            )
                        )
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📖", fontSize = 26.sp)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "توضیح",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(16.dp)
                ) {
                    Text(
                        topic.explanation,
                        fontSize = 14.sp,
                        lineHeight = 24.sp,
                        color = Color(0xFF424242)
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            // فرمول
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
                        Text("🧮", fontSize = 26.sp)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "فرمول",
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
                        .padding(16.dp)
                ) {
                    Text(
                        topic.formula,
                        fontSize = 14.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFE65100)
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            // مثال‌ها
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("✏️", fontSize = 22.sp)
                Spacer(Modifier.width(8.dp))
                Text(
                    "مثال‌ها",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
            }

            Spacer(Modifier.height(12.dp))

            topic.examples.forEachIndexed { index, example ->
                Card(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    shape = RoundedCornerShape(14.dp),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF00695C).copy(alpha = 0.15f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "${index + 1}",
                                color = Color(0xFF00695C),
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                example.english,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                lineHeight = 20.sp,
                                color = Color(0xFF1A237E)
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                example.persian,
                                fontSize = 12.sp,
                                color = Color.Gray,
                                lineHeight = 18.sp
                            )
                        }
                        IconButton(
                            onClick = { speechHelper.speak(example.english) },
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF00695C).copy(alpha = 0.1f))
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

            Spacer(Modifier.height(30.dp))
        }
    }
}