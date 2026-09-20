package com.example.englishteacher.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

data class FlashWord(
    val english: String,
    val persian: String,
    val pronunciation: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlashcardScreen(
    mode: String,        // "all" یا "bookmarked"
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    // بارگذاری لغات
    var allCards by remember { mutableStateOf<List<FlashWord>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(mode) {
        val words = mutableListOf<FlashWord>()

        // جمع‌آوری همه‌ی لغات
        Level.values().forEach { level ->
            LessonRepository.getLessonsByLevel(level).forEach { lesson ->
                lesson.vocabulary.forEach { w ->
                    words.add(FlashWord(w.english, w.persian, w.pronunciation))
                }
            }
        }

        val uniqueWords = words.distinctBy { it.english }

        allCards = if (mode == "bookmarked") {
            val bookmarked = BookmarkManager.getBookmarkedWords(context).first()
            uniqueWords.filter { it.english in bookmarked }
        } else {
            uniqueWords
        }

        isLoading = false
    }

    // ==================== حالت‌ها ====================
    var currentIndex by remember { mutableIntStateOf(0) }
    var showAnswer by remember { mutableStateOf(false) }
    var isFlipped by remember { mutableStateOf(false) }
    var masteredWords by remember { mutableStateOf<Set<String>>(emptySet()) }
    var learningWords by remember { mutableStateOf<Set<String>>(emptySet()) }

    // لیست فعال (برای shuffle)
    var activeList by remember { mutableStateOf<List<FlashWord>>(emptyList()) }

    LaunchedEffect(allCards) {
        activeList = allCards
    }

    // ==================== انیمیشن چرخش ====================
    val rotation by animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = tween(durationMillis = 500),
        label = "cardFlip"
    )

    val scale by animateFloatAsState(
        targetValue = if (isFlipped) 1f else 1f,
        animationSpec = tween(durationMillis = 300),
        label = "cardScale"
    )

    // ==================== صفحه‌ی خالی ====================
    if (isLoading) {
        Box(
            modifier = Modifier.fillMaxSize().background(Color(0xFFF5F7FA)),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(color = Color(0xFF00695C))
        }
        return
    }

    if (activeList.isEmpty()) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("🎴 فلش‌کارت", fontWeight = FontWeight.Bold, color = Color.White) },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF00695C))
                )
            }
        ) { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F7FA))
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(40.dp)
                ) {
                    Text("🎴", fontSize = 80.sp)
                    Spacer(Modifier.height(20.dp))
                    Text(
                        if (mode == "bookmarked") "هیچ لغت ذخیره‌شده‌ای نداری"
                        else "لغتی موجود نیست",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        if (mode == "bookmarked") "اول چند لغت رو ذخیره کن"
                        else "اول لغات رو توی دروس یاد بگیر",
                        fontSize = 13.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        return
    }

    val currentCard = activeList[currentIndex]
    val total = activeList.size

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎴 فلش‌کارت",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            if (mode == "bookmarked") "لغات ذخیره‌شده" else "همه‌ی لغات",
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
                        activeList = activeList.shuffled()
                        currentIndex = 0
                        isFlipped = false
                        showAnswer = false
                    }) {
                        Icon(
                            Icons.Filled.Shuffle,
                            contentDescription = "Shuffle",
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
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // ==================== نوار پیشرفت ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "${currentIndex + 1} از $total",
                    fontSize = 13.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold
                )
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.Check,
                            contentDescription = null,
                            tint = Color(0xFF43A047),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            "${masteredWords.size}",
                            fontSize = 13.sp,
                            color = Color(0xFF43A047),
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.Close,
                            contentDescription = null,
                            tint = Color(0xFFD32F2F),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            "${learningWords.size}",
                            fontSize = 13.sp,
                            color = Color(0xFFD32F2F),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            LinearProgressIndicator(
                progress = { (currentIndex + 1).toFloat() / total },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = Color(0xFF00695C),
                trackColor = Color(0xFF00695C).copy(alpha = 0.15f)
            )

            Spacer(Modifier.height(30.dp))

            // ==================== کارت فلش ====================
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clickable {
                        isFlipped = !isFlipped
                        showAnswer = isFlipped
                    },
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.85f)
                        .graphicsLayer {
                            rotationY = rotation
                            scaleX = scale
                            scaleY = scale
                            cameraDistance = 12f * density
                        },
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    listOf(
                                        Color(0xFF00695C),
                                        Color(0xFF26A69A)
                                    )
                                )
                            )
                            .padding(24.dp)
                    ) {
                        if (rotation <= 90f) {
                            // ==================== روی کارت: انگلیسی ====================
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    "🇬🇧",
                                    fontSize = 32.sp
                                )
                                Spacer(Modifier.height(16.dp))
                                Text(
                                    currentCard.english,
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    textAlign = TextAlign.Center
                                )
                                if (currentCard.pronunciation.isNotEmpty()) {
                                    Spacer(Modifier.height(10.dp))
                                    Text(
                                        "/${currentCard.pronunciation}/",
                                        fontSize = 16.sp,
                                        color = Color.White.copy(alpha = 0.8f)
                                    )
                                }
                                Spacer(Modifier.height(20.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(Color.White.copy(alpha = 0.2f))
                                        .padding(horizontal = 12.dp, vertical = 6.dp)
                                ) {
                                    Text(
                                        "👆 برای دیدن معنی بزن",
                                        fontSize = 12.sp,
                                        color = Color.White,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }

                                Spacer(Modifier.height(16.dp))

                                // دکمه تلفظ
                                IconButton(
                                    onClick = { speechHelper.speak(currentCard.english) },
                                    modifier = Modifier
                                        .size(52.dp)
                                        .clip(CircleShape)
                                        .background(Color.White.copy(alpha = 0.25f))
                                ) {
                                    Icon(
                                        Icons.AutoMirrored.Filled.VolumeUp,
                                        contentDescription = "Speak",
                                        tint = Color.White,
                                        modifier = Modifier.size(26.dp)
                                    )
                                }
                            }
                        } else {
                            // ==================== پشت کارت: فارسی ====================
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .graphicsLayer { rotationY = 180f },
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    "🇮🇷",
                                    fontSize = 32.sp
                                )
                                Spacer(Modifier.height(16.dp))
                                Text(
                                    currentCard.persian,
                                    fontSize = 34.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    textAlign = TextAlign.Center
                                )
                                Spacer(Modifier.height(16.dp))
                                Text(
                                    currentCard.english,
                                    fontSize = 16.sp,
                                    color = Color.White.copy(alpha = 0.8f)
                                )
                                Spacer(Modifier.height(20.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(Color.White.copy(alpha = 0.2f))
                                        .padding(horizontal = 12.dp, vertical = 6.dp)
                                ) {
                                    Text(
                                        "👆 برای برگشت بزن",
                                        fontSize = 12.sp,
                                        color = Color.White,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== دکمه‌های بلد بودم / بلد نبودم ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(
                    onClick = {
                        learningWords = learningWords + currentCard.english
                        masteredWords = masteredWords - currentCard.english
                        // برو بعدی
                        if (currentIndex < total - 1) {
                            currentIndex++
                        } else {
                            currentIndex = 0
                        }
                        isFlipped = false
                        showAnswer = false
                    },
                    modifier = Modifier.weight(1f).height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD32F2F))
                ) {
                    Icon(
                        Icons.Filled.Close,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        "بلد نبودم",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }

                Button(
                    onClick = {
                        masteredWords = masteredWords + currentCard.english
                        learningWords = learningWords - currentCard.english
                        // برو بعدی
                        if (currentIndex < total - 1) {
                            currentIndex++
                        } else {
                            currentIndex = 0
                        }
                        isFlipped = false
                        showAnswer = false
                    },
                    modifier = Modifier.weight(1f).height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF43A047))
                ) {
                    Icon(
                        Icons.Filled.Check,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        "بلد بودم",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            // ==================== نوار پایین: Previous / Reset / Next ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = {
                        if (currentIndex > 0) currentIndex--
                        isFlipped = false
                        showAnswer = false
                    },
                    enabled = currentIndex > 0,
                    modifier = Modifier.height(44.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF00695C))
                ) {
                    Text("قبلی", fontWeight = FontWeight.Bold)
                }

                IconButton(
                    onClick = {
                        masteredWords = emptySet()
                        learningWords = emptySet()
                        currentIndex = 0
                        isFlipped = false
                        showAnswer = false
                    },
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF00695C).copy(alpha = 0.12f))
                ) {
                    Icon(
                        Icons.Filled.Refresh,
                        contentDescription = "Reset",
                        tint = Color(0xFF00695C),
                        modifier = Modifier.size(22.dp)
                    )
                }

                OutlinedButton(
                    onClick = {
                        if (currentIndex < total - 1) {
                            currentIndex++
                        } else {
                            currentIndex = 0
                        }
                        isFlipped = false
                        showAnswer = false
                    },
                    modifier = Modifier.height(44.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF00695C))
                ) {
                    Text(
                        if (currentIndex < total - 1) "بعدی" else "شروع دوباره",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}