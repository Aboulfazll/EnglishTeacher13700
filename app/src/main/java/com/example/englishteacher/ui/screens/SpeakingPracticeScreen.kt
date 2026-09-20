package com.example.englishteacher.ui.screens

import android.content.Context
import android.content.Intent
import android.media.MediaRecorder
import android.os.Build
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.SpeakingCategory
import com.example.englishteacher.data.SpeakingDifficulty
import com.example.englishteacher.data.SpeakingRepository
import com.example.englishteacher.data.SpeakingSentence
import kotlinx.coroutines.delay
import java.io.File
import kotlin.math.sin
import kotlin.random.Random

private val ACCENT = Color(0xFF7B1FA2)
private val SUCCESS = Color(0xFF43A047)
private val ERROR = Color(0xFFE53935)
private val WARNING = Color(0xFFFFA726)
private val INFO = Color(0xFF0288D1)

enum class PracticeMode(val emoji: String, val title: String, val desc: String) {
    PRACTICE("🎯", "تمرین عادی", "روی هر جمله تمرکز کن"),
    SHADOW("🎭", "سایه", "بعد از گوینده تکرار کن"),
    FREESTYLE("⚡", "آزاد", "سریع برو جلو")
}

data class SentenceRecord(
    val sentenceId: String,
    val bestScore: Int,
    val attempts: Int,
    val lastScore: Int
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpeakingPracticeScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    // ==================== فیلترها ====================
    var selectedCategory by remember { mutableStateOf<SpeakingCategory?>(null) }
    var selectedDifficulty by remember { mutableStateOf<SpeakingDifficulty?>(null) }
    var practiceMode by remember { mutableStateOf(PracticeMode.PRACTICE) }

    val filteredSentences = remember(selectedCategory, selectedDifficulty) {
        SpeakingRepository.getFiltered(selectedCategory, selectedDifficulty)
            .shuffled()
            .take(20)
    }

    // ==================== وضعیت ====================
    var currentIndex by remember { mutableIntStateOf(0) }
    var isListening by remember { mutableStateOf(false) }
    var recognizedText by remember { mutableStateOf("") }
    var lastScore by remember { mutableIntStateOf(-1) }
    var totalAttempts by remember { mutableIntStateOf(0) }
    var totalScore by remember { mutableIntStateOf(0) }
    var perfectCount by remember { mutableIntStateOf(0) }
    var showConfetti by remember { mutableStateOf(false) }
    var sessionStarted by remember { mutableStateOf(false) }
    var showFilterSheet by remember { mutableStateOf(false) }
    var voiceLevel by remember { mutableFloatStateOf(0f) }
    var records by remember { mutableStateOf<Map<String, SentenceRecord>>(emptyMap()) }
    var showAiFeedback by remember { mutableStateOf(false) }
    var aiFeedback by remember { mutableStateOf("") }
    var startTime by remember { mutableLongStateOf(0L) }
    var speakingSpeed by remember { mutableIntStateOf(0) }

    LaunchedEffect(filteredSentences) {
        currentIndex = 0
        recognizedText = ""
        lastScore = -1
    }

    // ==================== Speech Recognizer ====================
    val speechRecognizer = remember {
        if (SpeechRecognizer.isRecognitionAvailable(context)) {
            SpeechRecognizer.createSpeechRecognizer(context)
        } else null
    }

    val recognizerIntent = remember {
        Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
            )
            putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
            putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true)
        }
    }

    DisposableEffect(speechRecognizer) {
        onDispose { speechRecognizer?.destroy() }
    }

    if (speechRecognizer != null) {
        DisposableEffect(speechRecognizer) {
            speechRecognizer.setRecognitionListener(object : RecognitionListener {
                override fun onReadyForSpeech(params: Bundle?) {
                    isListening = true
                    recognizedText = ""
                    startTime = System.currentTimeMillis()
                }

                override fun onBeginningOfSpeech() {}
                override fun onBufferReceived(buffer: ByteArray?) {}
                override fun onEndOfSpeech() {
                    isListening = false
                    voiceLevel = 0f
                }

                override fun onRmsChanged(rmsdB: Float) {
                    voiceLevel = ((rmsdB + 2f) / 12f).coerceIn(0f, 1f)
                }

                override fun onError(error: Int) {
                    isListening = false
                    voiceLevel = 0f
                }

                override fun onResults(results: Bundle?) {
                    val matches = results?.getStringArrayList(
                        SpeechRecognizer.RESULTS_RECOGNITION
                    )
                    val text = matches?.firstOrNull() ?: ""
                    recognizedText = text
                    isListening = false
                    voiceLevel = 0f

                    val durationSec = (System.currentTimeMillis() - startTime) / 1000.0

                    if (text.isNotEmpty() && filteredSentences.isNotEmpty()) {
                        val target = filteredSentences[currentIndex]
                        val newScore = calculateScore(target.english, text)
                        lastScore = newScore
                        totalScore += newScore
                        totalAttempts++

                        // سرعت گفتار
                        val wordCount = text.split(Regex("\\s+")).size
                        speakingSpeed = if (durationSec > 0)
                            ((wordCount / durationSec) * 60).toInt() else 0

                        // ذخیره رکورد
                        val old = records[target.id]
                        val newRecord = SentenceRecord(
                            sentenceId = target.id,
                            bestScore = maxOf(old?.bestScore ?: 0, newScore),
                            attempts = (old?.attempts ?: 0) + 1,
                            lastScore = newScore
                        )
                        records = records + (target.id to newRecord)

                        if (newScore >= 90) {
                            perfectCount++
                            showConfetti = true
                            scope.launch {
                                delay(2500)
                                showConfetti = false
                            }
                            scope.launch {
                                ProgressManager.addStars(context, newScore / 10)
                            }
                        }

                        // AI Feedback اگه نمره پایین بود
                        if (newScore < 70 && text.isNotEmpty()) {
                            generateAiFeedback(target.english, text, newScore) { feedback ->
                                aiFeedback = feedback
                                showAiFeedback = true
                            }
                        }
                    }
                }

                override fun onPartialResults(partialResults: Bundle?) {
                    val matches = partialResults?.getStringArrayList(
                        SpeechRecognizer.RESULTS_RECOGNITION
                    )
                    val text = matches?.firstOrNull() ?: ""
                    if (text.isNotEmpty()) recognizedText = text
                }

                override fun onEvent(eventType: Int, params: Bundle?) {}
            })
            onDispose {}
        }
    }

    // ==================== صفحه‌ی شروع ====================
    if (!sessionStarted) {
        SpeakingStartScreen(
            selectedCategory = selectedCategory,
            selectedDifficulty = selectedDifficulty,
            practiceMode = practiceMode,
            totalCount = filteredSentences.size,
            onCategoryChange = { selectedCategory = it },
            onDifficultyChange = { selectedDifficulty = it },
            onModeChange = { practiceMode = it },
            onStart = { sessionStarted = true },
            onBack = onBack
        )
        return
    }

    if (filteredSentences.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize().background(Color(0xFFF5F7FA)),
            contentAlignment = Alignment.Center
        ) {
            Text("جمله‌ای پیدا نشد", color = Color.Gray)
        }
        return
    }

    val currentItem = filteredSentences[currentIndex]
    val total = filteredSentences.size
    val avgScore = if (totalAttempts > 0) totalScore / totalAttempts else 0
    val bestRecord = records[currentItem.id]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎤 ${practiceMode.title}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.White
                        )
                        Text(
                            "${currentIndex + 1} از $total • میانگین: $avgScore%",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        speechRecognizer?.stopListening()
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
                    IconButton(onClick = { showFilterSheet = true }) {
                        Icon(
                            Icons.Filled.Refresh,
                            contentDescription = "Filter",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = ACCENT)
            )
        }
    ) { padding ->
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F7FA))
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
                    .padding(18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                LinearProgressIndicator(
                    progress = { (currentIndex + 1).toFloat() / total },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp)
                        .clip(RoundedCornerShape(4.dp)),
                    color = ACCENT,
                    trackColor = ACCENT.copy(alpha = 0.15f)
                )

                Spacer(Modifier.height(10.dp))

                // آمار
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    MiniStat(Modifier.weight(1f), "🎯", "$totalAttempts", "تلاش", ACCENT)
                    MiniStat(Modifier.weight(1f), "🏆", "$perfectCount", "کامل", SUCCESS)
                    MiniStat(Modifier.weight(1f), "📊", "$avgScore%", "میانگین",
                        if (avgScore >= 70) SUCCESS else WARNING)
                    MiniStat(Modifier.weight(1f), "⚡", "$speakingSpeed", "ک/دقیقه", INFO)
                }

                Spacer(Modifier.height(14.dp))

                // کارت جمله
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(6.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Brush.verticalGradient(
                                    listOf(ACCENT.copy(alpha = 0.06f), Color.White)
                                )
                            )
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(currentItem.category.emoji, fontSize = 14.sp)
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    currentItem.category.displayName,
                                    fontSize = 11.sp,
                                    color = Color.Gray,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            if (bestRecord != null) {
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(SUCCESS.copy(alpha = 0.12f))
                                        .padding(horizontal = 8.dp, vertical = 3.dp)
                                ) {
                                    Text(
                                        "🏆 رکورد: ${bestRecord.bestScore}%",
                                        fontSize = 10.sp,
                                        color = SUCCESS,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }

                        Spacer(Modifier.height(16.dp))

                        Text(
                            currentItem.english,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E),
                            textAlign = TextAlign.Center,
                            lineHeight = 32.sp
                        )

                        Spacer(Modifier.height(8.dp))

                        Text(
                            currentItem.persian,
                            fontSize = 14.sp,
                            color = Color.Gray,
                            textAlign = TextAlign.Center
                        )

                        Spacer(Modifier.height(14.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(ACCENT.copy(alpha = 0.1f))
                                    .clickable { speechHelper.speak(currentItem.english) }
                                    .padding(horizontal = 12.dp, vertical = 6.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        Icons.AutoMirrored.Filled.VolumeUp,
                                        contentDescription = null,
                                        tint = ACCENT,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(Modifier.width(6.dp))
                                    Text(
                                        "گوش کن",
                                        fontSize = 12.sp,
                                        color = ACCENT,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                            if (practiceMode == PracticeMode.SHADOW) {
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(INFO.copy(alpha = 0.1f))
                                        .clickable {
                                            speechHelper.speakSlow(currentItem.english)
                                        }
                                        .padding(horizontal = 12.dp, vertical = 6.dp)
                                ) {
                                    Text(
                                        "🐢 آهسته",
                                        fontSize = 12.sp,
                                        color = INFO,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(Modifier.height(20.dp))

                // Waveform + Mic
                WaveformMicButton(
                    isListening = isListening,
                    voiceLevel = voiceLevel,
                    onClick = {
                        if (isListening) {
                            speechRecognizer?.stopListening()
                            isListening = false
                        } else {
                            recognizedText = ""
                            lastScore = -1
                            showAiFeedback = false
                            try {
                                speechRecognizer?.startListening(recognizerIntent)
                            } catch (_: Exception) {}
                        }
                    }
                )

                Spacer(Modifier.height(14.dp))

                // نمایش متن
                if (recognizedText.isNotEmpty()) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(3.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("🎤", fontSize = 18.sp)
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    "تو گفتی:",
                                    fontSize = 12.sp,
                                    color = Color.Gray,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = buildColoredComparison(
                                    currentItem.english,
                                    recognizedText
                                ),
                                fontSize = 16.sp,
                                lineHeight = 24.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                }

                // نمره
                if (lastScore >= 0) {
                    ScoreDisplay(lastScore)
                    Spacer(Modifier.height(12.dp))
                }

                // AI Feedback
                if (showAiFeedback && aiFeedback.isNotEmpty()) {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = INFO.copy(alpha = 0.1f)
                        ),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("🤖", fontSize = 18.sp)
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    "بازخورد AI:",
                                    fontSize = 12.sp,
                                    color = INFO,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(Modifier.weight(1f))
                                Text(
                                    "✕",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                    modifier = Modifier.clickable {
                                        showAiFeedback = false
                                    }
                                )
                            }
                            Spacer(Modifier.height(8.dp))
                            Text(
                                aiFeedback,
                                fontSize = 13.sp,
                                color = Color(0xFF424242),
                                lineHeight = 20.sp
                            )
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                }

                // ناوبری
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = {
                            if (currentIndex > 0) {
                                currentIndex--
                                recognizedText = ""
                                lastScore = -1
                                showAiFeedback = false
                            }
                        },
                        enabled = currentIndex > 0,
                        modifier = Modifier.weight(1f).height(52.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = ACCENT)
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text("قبلی", fontWeight = FontWeight.Bold)
                    }

                    Button(
                        onClick = {
                            if (currentIndex < total - 1) {
                                currentIndex++
                                recognizedText = ""
                                lastScore = -1
                                showAiFeedback = false
                            }
                        },
                        enabled = currentIndex < total - 1,
                        modifier = Modifier.weight(1f).height(52.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = ACCENT)
                    ) {
                        Text("بعدی", fontWeight = FontWeight.Bold, color = Color.White)
                        Spacer(Modifier.width(4.dp))
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(Modifier.height(30.dp))
            }

            if (showConfetti) ConfettiOverlay()
        }
    }
}

// ==================== Waveform + Mic ====================
@Composable
private fun WaveformMicButton(
    isListening: Boolean,
    voiceLevel: Float,
    onClick: () -> Unit
) {
    val infiniteTransition = rememberInfiniteTransition(label = "wave")

    val wave1 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "w1"
    )

    val pulse by infiniteTransition.animateFloat(
        initialValue = 0.6f,
        targetValue = 1.5f,
        animationSpec = infiniteRepeatable(
            animation = tween(1400, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "p"
    )
    val pulseAlpha by infiniteTransition.animateFloat(
        initialValue = 0.5f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(1400, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "pa"
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        // Waveform میله‌ها
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            contentAlignment = Alignment.Center
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val barCount = 40
                val barWidth = size.width / barCount - 2
                val centerY = size.height / 2

                for (i in 0 until barCount) {
                    val x = i * (size.width / barCount) + barWidth / 2

                    val heightFactor = if (isListening) {
                        // میله‌های متحرک که به صدا واکنش می‌دن
                        val wave = sin((wave1 + i * 15f) * Math.PI.toFloat() / 180f)
                        val randomEffect = voiceLevel * 0.8f + 0.2f
                        (abs(wave) * randomEffect).coerceIn(0.1f, 1f)
                    } else {
                        // میله‌های ساکن کوچیک
                        (sin((i + wave1 / 10f) * 0.5f) * 0.15f + 0.2f).coerceIn(0.05f, 0.4f)
                    }

                    val barHeight = size.height * heightFactor

                    drawRoundRect(
                        brush = Brush.verticalGradient(
                            colors = if (isListening)
                                listOf(ERROR, ACCENT.copy(alpha = 0.7f))
                            else
                                listOf(ACCENT.copy(alpha = 0.6f), ACCENT.copy(alpha = 0.3f)),
                            startY = centerY - barHeight / 2,
                            endY = centerY + barHeight / 2
                        ),
                        topLeft = Offset(x, centerY - barHeight / 2),
                        size = androidx.compose.ui.geometry.Size(barWidth, barHeight),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius(barWidth / 2)
                    )
                }
            }
        }

        Spacer(Modifier.height(14.dp))

        // Mic Button
        Box(
            modifier = Modifier
                .size(160.dp)
                .clickable { onClick() },
            contentAlignment = Alignment.Center
        ) {
            if (isListening) {
                Canvas(modifier = Modifier.size(160.dp)) {
                    drawCircle(
                        color = ERROR.copy(alpha = pulseAlpha),
                        radius = (size.minDimension / 2) * pulse,
                        style = Stroke(width = 3.dp.toPx())
                    )
                    drawCircle(
                        color = ERROR.copy(alpha = pulseAlpha * 0.5f),
                        radius = (size.minDimension / 2) * (pulse * 0.75f),
                        style = Stroke(width = 2.dp.toPx())
                    )
                }
            }

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(
                            if (isListening) listOf(ERROR, Color(0xFFC62828))
                            else listOf(ACCENT, ACCENT.copy(alpha = 0.75f))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isListening) Icons.Filled.Stop else Icons.Filled.Mic,
                    contentDescription = "Mic",
                    tint = Color.White,
                    modifier = Modifier.size(46.dp)
                )
            }
        }
    }
}

// ==================== صفحه‌ی شروع ====================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SpeakingStartScreen(
    selectedCategory: SpeakingCategory?,
    selectedDifficulty: SpeakingDifficulty?,
    practiceMode: PracticeMode,
    totalCount: Int,
    onCategoryChange: (SpeakingCategory?) -> Unit,
    onDifficultyChange: (SpeakingDifficulty?) -> Unit,
    onModeChange: (PracticeMode) -> Unit,
    onStart: () -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🎤 تمرین گفتار",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "با صدای بلند تمرین کن!",
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = ACCENT)
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
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(listOf(ACCENT, Color(0xFFAB47BC)))
                        )
                        .padding(20.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()) {
                        Text("🎤", fontSize = 54.sp)
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "تمرین Speaking",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            "با میکروفن تلفظت رو بسنج",
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            SectionTitle("🎭 حالت تمرین")
            Spacer(Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                PracticeMode.values().forEach { mode ->
                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .clickable { onModeChange(mode) },
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = if (practiceMode == mode) ACCENT
                            else Color.White
                        ),
                        elevation = CardDefaults.cardElevation(
                            if (practiceMode == mode) 6.dp else 2.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth().padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(mode.emoji, fontSize = 22.sp)
                            Spacer(Modifier.height(4.dp))
                            Text(
                                mode.title,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (practiceMode == mode) Color.White
                                else Color(0xFF1A237E)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            SectionTitle("📚 دسته")
            Spacer(Modifier.height(8.dp))

            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                item {
                    FilterChip(
                        selected = selectedCategory == null,
                        onClick = { onCategoryChange(null) },
                        label = { Text("همه", fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT,
                            selectedLabelColor = Color.White
                        )
                    )
                }
                items(SpeakingCategory.values().toList()) { cat ->
                    FilterChip(
                        selected = selectedCategory == cat,
                        onClick = { onCategoryChange(cat) },
                        label = { Text("${cat.emoji} ${cat.displayName}", fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            SectionTitle("🎚️ سطح")
            Spacer(Modifier.height(8.dp))

            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                item {
                    FilterChip(
                        selected = selectedDifficulty == null,
                        onClick = { onDifficultyChange(null) },
                        label = { Text("همه", fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT,
                            selectedLabelColor = Color.White
                        )
                    )
                }
                items(SpeakingDifficulty.values().toList()) { diff ->
                    FilterChip(
                        selected = selectedDifficulty == diff,
                        onClick = { onDifficultyChange(diff) },
                        label = { Text("${diff.emoji} ${diff.displayName}", fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = ACCENT.copy(alpha = 0.1f)),
                elevation = CardDefaults.cardElevation(0.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("📊", fontSize = 24.sp)
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "$totalCount جمله آماده",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = ACCENT
                        )
                        Text(
                            "شامل کلمات، جملات و مکالمه",
                            fontSize = 11.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            Button(
                onClick = onStart,
                enabled = totalCount > 0,
                modifier = Modifier.fillMaxWidth().height(58.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = ACCENT)
            ) {
                Text("🚀 شروع تمرین", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
private fun SectionTitle(text: String) {
    Text(text, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
}

@Composable
private fun MiniStat(
    modifier: Modifier = Modifier,
    emoji: String,
    value: String,
    label: String,
    color: Color
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(emoji, fontSize = 14.sp)
            Text(value, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = color)
            Text(label, fontSize = 8.sp, color = Color.Gray)
        }
    }
}

@Composable
private fun ScoreDisplay(score: Int) {
    val color = when {
        score >= 90 -> SUCCESS
        score >= 70 -> WARNING
        score >= 50 -> Color(0xFFFB8C00)
        else -> ERROR
    }
    val emoji = when {
        score >= 90 -> "🏆"
        score >= 70 -> "👍"
        score >= 50 -> "💪"
        else -> "🎯"
    }
    val message = when {
        score >= 90 -> "عالی! بی‌نقص!"
        score >= 70 -> "خیلی خوب بود"
        score >= 50 -> "خوب بود، بهتر می‌شی"
        else -> "دوباره امتحان کن"
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(color.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Text(emoji, fontSize = 26.sp)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    message,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Text("امتیاز تلفظ", fontSize = 10.sp, color = Color.Gray)
            }
            Text(
                "$score%",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )
        }
    }
}

@Composable
private fun ConfettiOverlay() {
    val particles = remember {
        List(70) {
            ConfettiParticle(
                x = Random.nextFloat(),
                color = listOf(
                    Color(0xFFE91E63), Color(0xFFFFA726), Color(0xFF43A047),
                    Color(0xFF1E88E5), Color(0xFF8E24AA), Color(0xFFFFEB3B)
                ).random(),
                size = Random.nextInt(6, 12),
                speed = Random.nextFloat() * 1.5f + 1f
            )
        }
    }

    val infiniteTransition = rememberInfiniteTransition(label = "confetti")
    val progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(2500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "cp"
    )

    Canvas(modifier = Modifier.fillMaxSize()) {
        particles.forEach { p ->
            val y = progress * size.height * p.speed
            val x = p.x * size.width + sin(progress * 10f + p.x * 5f) * 30
            val alpha = if (progress > 0.8f) (1f - progress) * 5f else 1f
            if (y < size.height) {
                drawCircle(
                    color = p.color.copy(alpha = alpha.coerceIn(0f, 1f)),
                    radius = p.size.dp.toPx() / 2,
                    center = Offset(x, y)
                )
            }
        }
    }
}

private data class ConfettiParticle(
    val x: Float,
    val color: Color,
    val size: Int,
    val speed: Float
)

private fun buildColoredComparison(target: String, recognized: String) = buildAnnotatedString {
    val targetWords = target.lowercase()
        .replace(Regex("[^a-z0-9\\s']"), "")
        .split(Regex("\\s+"))
        .filter { it.isNotBlank() }

    val recognizedWords = recognized.lowercase()
        .replace(Regex("[^a-z0-9\\s']"), "")
        .split(Regex("\\s+"))
        .filter { it.isNotBlank() }

    targetWords.forEachIndexed { index, word ->
        val isCorrect = recognizedWords.any { levenshtein(it, word) <= 1 }
        withStyle(
            SpanStyle(
                color = if (isCorrect) SUCCESS else ERROR,
                fontWeight = FontWeight.Bold
            )
        ) {
            append(word)
        }
        if (index < targetWords.size - 1) append(" ")
    }
}

private fun calculateScore(target: String, recognized: String): Int {
    if (recognized.isBlank()) return 0

    val targetWords = target.lowercase()
        .replace(Regex("[^a-z0-9\\s']"), "")
        .split(Regex("\\s+"))
        .filter { it.isNotBlank() }

    val recognizedWords = recognized.lowercase()
        .replace(Regex("[^a-z0-9\\s']"), "")
        .split(Regex("\\s+"))
        .filter { it.isNotBlank() }

    if (targetWords.isEmpty()) return 0

    var matches = 0
    targetWords.forEach { tw ->
        if (recognizedWords.any { rw -> levenshtein(rw, tw) <= 1 }) matches++
    }

    return (matches.toFloat() / targetWords.size * 100).toInt().coerceIn(0, 100)
}

private fun levenshtein(a: String, b: String): Int {
    if (a == b) return 0
    if (a.isEmpty()) return b.length
    if (b.isEmpty()) return a.length

    val dp = Array(a.length + 1) { IntArray(b.length + 1) }
    for (i in 0..a.length) dp[i][0] = i
    for (j in 0..b.length) dp[0][j] = j

    for (i in 1..a.length) {
        for (j in 1..b.length) {
            val cost = if (a[i - 1] == b[j - 1]) 0 else 1
            dp[i][j] = minOf(
                dp[i - 1][j] + 1,
                dp[i][j - 1] + 1,
                dp[i - 1][j - 1] + cost
            )
        }
    }
    return dp[a.length][b.length]
}

private fun abs(value: Float): Float = if (value < 0) -value else value