package com.example.englishteacher.ui.screens

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
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
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
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
import com.example.englishteacher.data.SpeakingLevel
import com.example.englishteacher.data.SpeakingRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.sin
import kotlin.random.Random

private val ACCENT = Color(0xFF7B1FA2)
private val SUCCESS = Color(0xFF43A047)
private val ERROR = Color(0xFFE53935)
private val WARNING = Color(0xFFFFA726)
private val INFO = Color(0xFF0288D1)
private val GOLD = Color(0xFFFFB300)

enum class PracticeMode(val emoji: String, val title: String, val desc: String) {
    PRACTICE("🎯", "عادی", "تمرکز روی هر جمله"),
    SHADOW("🎭", "سایه", "بعد از گوینده تکرار کن"),
    FREESTYLE("⚡", "آزاد", "سریع برو جلو"),
    REVIEW("🔄", "مرور", "جملات اشتباه")
}

data class SentenceRecord(
    val sentenceId: String,
    val bestScore: Int,
    val attempts: Int,
    val lastScore: Int
)

data class SessionStat(val score: Int, val timestamp: Long)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpeakingPracticeScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val speechHelper = remember { SpeechHelper(context) }
    val prefs = remember { context.getSharedPreferences("app_settings", Context.MODE_PRIVATE) }

    // ==================== خواندن تنظیمات ذخیره‌شده ====================
    val savedMode = remember {
        val modeStr = prefs.getString("speaking_mode", "PRACTICE") ?: "PRACTICE"
        try { PracticeMode.valueOf(modeStr) } catch (_: Exception) { PracticeMode.PRACTICE }
    }
    val savedLevelName = remember {
        prefs.getString("speaking_level", "ALL") ?: "ALL"
    }
    val savedLevel = remember {
        when (savedLevelName) {
            "BEGINNER" -> SpeakingLevel.BEGINNER
            "INTERMEDIATE" -> SpeakingLevel.INTERMEDIATE
            else -> null
        }
    }
    val savedSessionSize = remember {
        prefs.getInt("speaking_session_size", 25)
    }
    val savedAccent = remember {
        prefs.getString("speaking_accent", "US") ?: "US"
    }
    val savedStrictness = remember {
        prefs.getString("speaking_strictness", "NORMAL") ?: "NORMAL"
    }
    val autoPlayEnabled = remember {
        prefs.getBoolean("speaking_auto_play", false)
    }
    val showTipsEnabled = remember {
        prefs.getBoolean("speaking_show_tips", false)
    }
    val confettiEnabled = remember {
        prefs.getBoolean("speaking_confetti", true)
    }
    val saveHistory = remember {
        prefs.getBoolean("speaking_save_history", true)
    }

    // ==================== اعمال تنظیمات صوت ====================
    DisposableEffect(Unit) {
        val rate = prefs.getFloat("speech_rate", 1.0f)
        val pitch = prefs.getFloat("speech_pitch", 1.0f)
        val gender = prefs.getString("voice_gender", "female") ?: "female"
        speechHelper.setVoiceGender(gender)
        speechHelper.setSpeedAndPitch(rate, pitch)
        onDispose { speechHelper.close() }
    }

    // ==================== وضعیت‌ها ====================
    var selectedLevel by remember { mutableStateOf<SpeakingLevel?>(savedLevel) }
    var selectedCategory by remember { mutableStateOf<SpeakingCategory?>(null) }
    var selectedDifficulty by remember { mutableStateOf<SpeakingDifficulty?>(null) }
    var practiceMode by remember { mutableStateOf(savedMode) }

    val filteredSentences = remember(selectedLevel, selectedCategory, selectedDifficulty) {
        SpeakingRepository.getFiltered(selectedCategory, selectedDifficulty, selectedLevel)
            .shuffled()
            .take(savedSessionSize)
    }

    var currentIndex by remember { mutableIntStateOf(0) }
    var isListening by remember { mutableStateOf(false) }
    var recognizedText by remember { mutableStateOf("") }
    var lastScore by remember { mutableIntStateOf(-1) }
    var totalAttempts by remember { mutableIntStateOf(0) }
    var totalScore by remember { mutableIntStateOf(0) }
    var perfectCount by remember { mutableIntStateOf(0) }
    var comboCount by remember { mutableIntStateOf(0) }
    var maxCombo by remember { mutableIntStateOf(0) }
    var showConfetti by remember { mutableStateOf(false) }
    var sessionStarted by remember { mutableStateOf(false) }
    var voiceLevel by remember { mutableFloatStateOf(0f) }
    var records by remember { mutableStateOf<Map<String, SentenceRecord>>(emptyMap()) }
    var aiFeedback by remember { mutableStateOf("") }
    var showAiFeedback by remember { mutableStateOf(false) }
    var speakingSpeed by remember { mutableIntStateOf(0) }
    var sessionHistory by remember { mutableStateOf<List<SessionStat>>(emptyList()) }
    var startTime by remember { mutableLongStateOf(0L) }
    var showPronunciationTips by remember { mutableStateOf(showTipsEnabled) }
    var wrongSentenceIds by remember { mutableStateOf<Set<String>>(emptySet()) }
    var showHistorySheet by remember { mutableStateOf(false) }

    LaunchedEffect(filteredSentences) {
        currentIndex = 0
        recognizedText = ""
        lastScore = -1
    }

    // ==================== پخش خودکار تلفظ ====================
    LaunchedEffect(currentIndex, sessionStarted, autoPlayEnabled) {
        if (sessionStarted && autoPlayEnabled && filteredSentences.isNotEmpty()) {
            delay(500)
            speechHelper.speak(filteredSentences[currentIndex].english)
        }
    }

    // ==================== Speech Recognizer ====================
    val speechRecognizer = remember {
        if (SpeechRecognizer.isRecognitionAvailable(context)) {
            SpeechRecognizer.createSpeechRecognizer(context)
        } else null
    }

    val recognizerIntent = remember(savedAccent) {
        Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
            // اعمال لهجه انتخاب‌شده
            putExtra(
                RecognizerIntent.EXTRA_LANGUAGE,
                if (savedAccent == "UK") "en-GB" else "en-US"
            )
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
                override fun onEndOfSpeech() { isListening = false; voiceLevel = 0f }
                override fun onRmsChanged(rmsdB: Float) {
                    voiceLevel = ((rmsdB + 2f) / 12f).coerceIn(0f, 1f)
                }
                override fun onError(error: Int) {
                    isListening = false
                    voiceLevel = 0f
                }
                override fun onResults(results: Bundle?) {
                    val text = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                        ?.firstOrNull() ?: ""
                    recognizedText = text
                    isListening = false
                    voiceLevel = 0f

                    val durationSec = (System.currentTimeMillis() - startTime) / 1000.0
                    if (text.isNotEmpty() && filteredSentences.isNotEmpty()) {
                        val target = filteredSentences[currentIndex]
                        // اعمال حساسیت
                        val newScore = calculateScore(target.english, text, savedStrictness)
                        lastScore = newScore
                        totalScore += newScore
                        totalAttempts++
                        if (saveHistory) {
                            sessionHistory = sessionHistory + SessionStat(newScore, System.currentTimeMillis())
                        }

                        val wordCount = text.split(Regex("\\s+")).size
                        speakingSpeed = if (durationSec > 0)
                            ((wordCount / durationSec) * 60).toInt() else 0

                        val old = records[target.id]
                        records = records + (target.id to SentenceRecord(
                            sentenceId = target.id,
                            bestScore = maxOf(old?.bestScore ?: 0, newScore),
                            attempts = (old?.attempts ?: 0) + 1,
                            lastScore = newScore
                        ))

                        if (newScore >= 90) {
                            perfectCount++
                            comboCount++
                            if (comboCount > maxCombo) maxCombo = comboCount
                            if (confettiEnabled) {
                                showConfetti = true
                                scope.launch { delay(2500); showConfetti = false }
                            }
                            val bonus = if (newScore == 100) 20 else newScore / 10
                            scope.launch { ProgressManager.addStars(context, bonus) }
                            wrongSentenceIds = wrongSentenceIds - target.id
                        } else {
                            comboCount = 0
                            wrongSentenceIds = wrongSentenceIds + target.id
                        }

                        if (newScore < 70 && text.isNotEmpty()) {
                            aiFeedback = generateFeedback(newScore)
                            showAiFeedback = true
                        }

                        // پخش خودکار جمله بعدی در حالت FREESTYLE
                        if (autoPlayEnabled && practiceMode == PracticeMode.FREESTYLE && currentIndex < filteredSentences.size - 1) {
                            scope.launch {
                                delay(1500)
                                currentIndex++
                                recognizedText = ""
                                lastScore = -1
                                showAiFeedback = false
                            }
                        }
                    }
                }
                override fun onPartialResults(partialResults: Bundle?) {
                    val text = partialResults?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                        ?.firstOrNull() ?: ""
                    if (text.isNotEmpty()) recognizedText = text
                }
                override fun onEvent(eventType: Int, params: Bundle?) {}
            })
            onDispose {}
        }
    }

    if (!sessionStarted) {
        SpeakingStartScreen(
            selectedLevel = selectedLevel,
            selectedCategory = selectedCategory,
            selectedDifficulty = selectedDifficulty,
            practiceMode = practiceMode,
            totalCount = filteredSentences.size,
            wrongCount = wrongSentenceIds.size,
            sessionSize = savedSessionSize,
            accent = savedAccent,
            strictness = savedStrictness,
            onLevelChange = { selectedLevel = it },
            onCategoryChange = { selectedCategory = it },
            onDifficultyChange = { selectedDifficulty = it },
            onModeChange = { practiceMode = it },
            onStart = { sessionStarted = true },
            onBack = onBack
        )
        return
    }

    if (filteredSentences.isEmpty()) {
        Box(Modifier.fillMaxSize().background(Color(0xFFF5F7FA)), contentAlignment = Alignment.Center) {
            Text("جمله‌ای موجود نیست", color = Color.Gray)
        }
        return
    }

    val currentItem = filteredSentences[currentIndex]
    val total = filteredSentences.size
    val avgScore = if (totalAttempts > 0) totalScore / totalAttempts else 0
    val bestRecord = records[currentItem.id]
    val sessionBest = records.values.maxOfOrNull { it.bestScore } ?: 0
    val hardWordSet = remember(currentItem) { findHardWords(currentItem.english) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("🎤 ${practiceMode.title}", fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color.White)
                        Text(
                            "${currentIndex + 1}/$total • میانگین: $avgScore% • ${
                                if (savedAccent == "UK") "🇬🇧" else "🇺🇸"
                            }",
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
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, null, tint = Color.White)
                    }
                },
                actions = {
                    if (comboCount > 1) {
                        Box(
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(GOLD)
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text("🔥 $comboCount", fontSize = 11.sp, color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                    IconButton(onClick = { showHistorySheet = true }) {
                        Icon(Icons.Filled.History, "History", tint = Color.White)
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
                    .padding(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LinearProgressIndicator(
                    progress = { (currentIndex + 1).toFloat() / total },
                    modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                    color = ACCENT,
                    trackColor = ACCENT.copy(alpha = 0.15f)
                )

                Spacer(Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    MiniStat(Modifier.weight(1f), "🎯", "$totalAttempts", "تلاش", ACCENT)
                    MiniStat(Modifier.weight(1f), "🏆", "$perfectCount", "کامل", SUCCESS)
                    MiniStat(Modifier.weight(1f), "📊", "$avgScore%", "میانگین", if (avgScore >= 70) SUCCESS else WARNING)
                    MiniStat(Modifier.weight(1f), "👑", "$sessionBest%", "رکورد", GOLD)
                }

                if (speakingSpeed > 0) {
                    Spacer(Modifier.height(6.dp))
                    SpeedGauge(speakingSpeed)
                }

                if (sessionHistory.size > 1) {
                    Spacer(Modifier.height(6.dp))
                    ProgressChart(sessionHistory)
                }

                Spacer(Modifier.height(10.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(18.dp),
                    elevation = CardDefaults.cardElevation(5.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Brush.verticalGradient(listOf(ACCENT.copy(alpha = 0.06f), Color.White)))
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(6.dp))
                                        .background(Color(currentItem.level.color).copy(alpha = 0.15f))
                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Text(
                                        "${currentItem.level.emoji} ${currentItem.level.displayName}",
                                        fontSize = 9.sp,
                                        color = Color(currentItem.level.color),
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                Spacer(Modifier.width(4.dp))
                                Text("${currentItem.category.emoji} ${currentItem.category.displayName}", fontSize = 10.sp, color = Color.Gray)
                            }
                            if (bestRecord != null) {
                                Text("🏆 ${bestRecord.bestScore}%", fontSize = 10.sp, color = SUCCESS, fontWeight = FontWeight.Bold)
                            }
                        }

                        Spacer(Modifier.height(12.dp))

                        Text(
                            text = buildHardWordHighlight(currentItem.english, hardWordSet),
                            fontSize = 21.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E),
                            textAlign = TextAlign.Center,
                            lineHeight = 28.sp
                        )

                        Spacer(Modifier.height(6.dp))

                        Text(currentItem.persian, fontSize = 12.sp, color = Color.Gray, textAlign = TextAlign.Center)

                        Spacer(Modifier.height(10.dp))

                        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            CompactButton("🔊 گوش کن", ACCENT) { speechHelper.speak(currentItem.english) }
                            CompactButton("💡 نکات", WARNING) { showPronunciationTips = !showPronunciationTips }
                        }
                    }
                }

                AnimatedVisibility(visible = showPronunciationTips, enter = fadeIn() + slideInVertically()) {
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = WARNING.copy(alpha = 0.1f))
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text("💡 نکات تلفظ", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xFFE65100))
                            Spacer(Modifier.height(6.dp))
                            getPronunciationTips(currentItem.english).forEach { tip ->
                                Row(modifier = Modifier.padding(vertical = 1.dp)) {
                                    Text("•", color = WARNING, fontSize = 11.sp)
                                    Spacer(Modifier.width(6.dp))
                                    Text(tip, fontSize = 11.sp, color = Color(0xFF424242), lineHeight = 16.sp)
                                }
                            }
                        }
                    }
                }

                Spacer(Modifier.height(10.dp))

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
                            try { speechRecognizer?.startListening(recognizerIntent) } catch (_: Exception) {}
                        }
                    }
                )

                if (recognizedText.isNotEmpty()) {
                    Spacer(Modifier.height(10.dp))
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("🎤", fontSize = 14.sp)
                                Spacer(Modifier.width(6.dp))
                                Text("تو گفتی:", fontSize = 11.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
                            }
                            Spacer(Modifier.height(6.dp))
                            Text(
                                text = buildColoredComparison(currentItem.english, recognizedText),
                                fontSize = 14.sp, lineHeight = 20.sp, fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }

                if (lastScore >= 0) {
                    Spacer(Modifier.height(10.dp))
                    ScoreDisplay(lastScore)
                }

                if (showAiFeedback && aiFeedback.isNotEmpty()) {
                    Spacer(Modifier.height(8.dp))
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = INFO.copy(alpha = 0.08f))
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("🤖", fontSize = 14.sp)
                                Spacer(Modifier.width(6.dp))
                                Text("AI:", fontSize = 11.sp, color = INFO, fontWeight = FontWeight.Bold)
                                Spacer(Modifier.weight(1f))
                                Text("✕", fontSize = 12.sp, color = Color.Gray, modifier = Modifier.clickable { showAiFeedback = false })
                            }
                            Spacer(Modifier.height(4.dp))
                            Text(aiFeedback, fontSize = 12.sp, color = Color(0xFF424242), lineHeight = 18.sp)
                        }
                    }
                }

                Spacer(Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedButton(
                        onClick = {
                            if (currentIndex > 0) {
                                currentIndex--
                                recognizedText = ""
                                lastScore = -1
                                showAiFeedback = false
                                showPronunciationTips = showTipsEnabled
                            }
                        },
                        enabled = currentIndex > 0,
                        modifier = Modifier.weight(1f).height(48.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = ACCENT)
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, null, modifier = Modifier.size(16.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("قبلی", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                    }

                    Button(
                        onClick = {
                            if (currentIndex < total - 1) {
                                currentIndex++
                                recognizedText = ""
                                lastScore = -1
                                showAiFeedback = false
                                showPronunciationTips = showTipsEnabled
                            }
                        },
                        enabled = currentIndex < total - 1,
                        modifier = Modifier.weight(1f).height(48.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = ACCENT)
                    ) {
                        Text("بعدی", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 13.sp)
                        Spacer(Modifier.width(4.dp))
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, null, modifier = Modifier.size(16.dp))
                    }
                }

                Spacer(Modifier.height(20.dp))
            }

            if (showConfetti && confettiEnabled) ConfettiOverlay()
        }
    }

    if (showHistorySheet) {
        AlertDialog(
            onDismissRequest = { showHistorySheet = false },
            title = { Text("📈 تاریخچه") },
            text = {
                Column(modifier = Modifier.verticalScroll(rememberScrollState()).heightIn(max = 350.dp)) {
                    if (sessionHistory.isEmpty()) {
                        Text("هنوز چیزی ثبت نشده", color = Color.Gray)
                    } else {
                        Text("میانگین: $avgScore%", fontWeight = FontWeight.Bold)
                        Text("بهترین کمبو: $maxCombo 🔥", fontWeight = FontWeight.Bold, color = GOLD)
                        Spacer(Modifier.height(8.dp))
                        sessionHistory.reversed().take(20).forEachIndexed { i, stat ->
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(vertical = 2.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("${sessionHistory.size - i}.", fontSize = 12.sp, color = Color.Gray)
                                Text(
                                    "${stat.score}%",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = when {
                                        stat.score >= 90 -> SUCCESS
                                        stat.score >= 70 -> WARNING
                                        else -> ERROR
                                    }
                                )
                            }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showHistorySheet = false }) {
                    Text("بستن", color = ACCENT, fontWeight = FontWeight.Bold)
                }
            }
        )
    }
}

@Composable
private fun SpeedGauge(speed: Int) {
    val color = when {
        speed < 80 -> INFO
        speed < 150 -> SUCCESS
        else -> WARNING
    }
    val label = when {
        speed < 80 -> "آهسته"
        speed < 150 -> "عالی"
        else -> "سریع"
    }
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = color.copy(alpha = 0.1f)),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("⚡", fontSize = 16.sp)
            Spacer(Modifier.width(6.dp))
            Text("سرعت:", fontSize = 10.sp, color = Color.Gray)
            Spacer(Modifier.weight(1f))
            Text("$speed کلمه/د", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = color)
            Spacer(Modifier.width(6.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(color)
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            ) {
                Text(label, fontSize = 9.sp, color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
private fun ProgressChart(history: List<SessionStat>) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            Text("📊 روند", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
            Spacer(Modifier.height(6.dp))
            Canvas(modifier = Modifier.fillMaxWidth().height(60.dp)) {
                val points = history.takeLast(15)
                if (points.size < 2) return@Canvas
                val step = size.width / (points.size - 1)
                val path = Path()
                points.forEachIndexed { i, stat ->
                    val x = i * step
                    val y = size.height - (stat.score / 100f) * size.height
                    if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
                }
                drawPath(
                    path = path,
                    brush = Brush.horizontalGradient(listOf(ACCENT, INFO)),
                    style = Stroke(width = 3.dp.toPx(), cap = StrokeCap.Round)
                )
                points.forEachIndexed { i, stat ->
                    val x = i * step
                    val y = size.height - (stat.score / 100f) * size.height
                    drawCircle(
                        color = when {
                            stat.score >= 90 -> SUCCESS
                            stat.score >= 70 -> WARNING
                            else -> ERROR
                        },
                        radius = 3.dp.toPx(),
                        center = Offset(x, y)
                    )
                }
            }
        }
    }
}

@Composable
private fun CompactButton(label: String, color: Color, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(color.copy(alpha = 0.12f))
            .clickable { onClick() }
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(label, fontSize = 11.sp, color = color, fontWeight = FontWeight.SemiBold)
    }
}

@Composable
private fun WaveformMicButton(isListening: Boolean, voiceLevel: Float, onClick: () -> Unit) {
    val infiniteTransition = rememberInfiniteTransition(label = "wave")
    val wave1 by infiniteTransition.animateFloat(
        initialValue = 0f, targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(2000, easing = LinearEasing)),
        label = "w1"
    )
    val pulse by infiniteTransition.animateFloat(
        initialValue = 0.6f, targetValue = 1.5f,
        animationSpec = infiniteRepeatable(tween(1400, easing = LinearEasing)),
        label = "p"
    )
    val pulseAlpha by infiniteTransition.animateFloat(
        initialValue = 0.5f, targetValue = 0f,
        animationSpec = infiniteRepeatable(tween(1400, easing = LinearEasing)),
        label = "pa"
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.fillMaxWidth().height(45.dp), contentAlignment = Alignment.Center) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val barCount = 36
                val barWidth = size.width / barCount - 2
                val centerY = size.height / 2
                for (i in 0 until barCount) {
                    val x = i * (size.width / barCount) + barWidth / 2
                    val heightFactor = if (isListening) {
                        val wave = sin((wave1 + i * 15f) * Math.PI.toFloat() / 180f)
                        (abs(wave) * (voiceLevel * 0.8f + 0.2f)).coerceIn(0.1f, 1f)
                    } else {
                        (sin((i + wave1 / 10f) * 0.5f) * 0.15f + 0.2f).coerceIn(0.05f, 0.4f)
                    }
                    val barHeight = size.height * heightFactor
                    drawRoundRect(
                        brush = Brush.verticalGradient(
                            colors = if (isListening) listOf(ERROR, ACCENT.copy(alpha = 0.7f))
                            else listOf(ACCENT.copy(alpha = 0.6f), ACCENT.copy(alpha = 0.3f)),
                            startY = centerY - barHeight / 2,
                            endY = centerY + barHeight / 2
                        ),
                        topLeft = Offset(x, centerY - barHeight / 2),
                        size = Size(barWidth, barHeight),
                        cornerRadius = CornerRadius(barWidth / 2)
                    )
                }
            }
        }
        Spacer(Modifier.height(8.dp))
        Box(modifier = Modifier.size(130.dp).clickable { onClick() }, contentAlignment = Alignment.Center) {
            if (isListening) {
                Canvas(modifier = Modifier.size(130.dp)) {
                    drawCircle(
                        color = ERROR.copy(alpha = pulseAlpha),
                        radius = (size.minDimension / 2) * pulse,
                        style = Stroke(width = 3.dp.toPx())
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(85.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(
                        if (isListening) listOf(ERROR, Color(0xFFC62828))
                        else listOf(ACCENT, ACCENT.copy(alpha = 0.75f))
                    )),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    if (isListening) Icons.Filled.Stop else Icons.Filled.Mic,
                    null, tint = Color.White, modifier = Modifier.size(40.dp)
                )
            }
        }
        if (isListening) {
            Text("🔴 در حال ضبط...", fontSize = 11.sp, color = ERROR, fontWeight = FontWeight.Bold)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SpeakingStartScreen(
    selectedLevel: SpeakingLevel?,
    selectedCategory: SpeakingCategory?,
    selectedDifficulty: SpeakingDifficulty?,
    practiceMode: PracticeMode,
    totalCount: Int,
    wrongCount: Int,
    sessionSize: Int,
    accent: String,
    strictness: String,
    onLevelChange: (SpeakingLevel?) -> Unit,
    onCategoryChange: (SpeakingCategory?) -> Unit,
    onDifficultyChange: (SpeakingDifficulty?) -> Unit,
    onModeChange: (PracticeMode) -> Unit,
    onStart: () -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("🎤 تمرین گفتار", fontWeight = FontWeight.Bold, color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, null, tint = Color.White)
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
                .padding(18.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Brush.linearGradient(listOf(ACCENT, Color(0xFFAB47BC))))
                        .padding(20.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                        Text("🎤", fontSize = 50.sp)
                        Spacer(Modifier.height(8.dp))
                        Text("Speaking", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        Spacer(Modifier.height(4.dp))
                        Text("تلفظت رو با AI بسنج", fontSize = 12.sp, color = Color.White.copy(alpha = 0.9f))

                        Spacer(Modifier.height(10.dp))

                        // نمایش تنظیمات فعلی
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            MiniBadge(if (accent == "UK") "🇬🇧 UK" else "🇺🇸 US")
                            MiniBadge(
                                when (strictness) {
                                    "EASY" -> "😊 راحت"
                                    "STRICT" -> "🎯 سخت‌گیر"
                                    else -> "⚖️ عادی"
                                }
                            )
                            MiniBadge("$sessionSize جمله")
                        }
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            SectionTitle("📊 سطح")
            Spacer(Modifier.height(6.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                item {
                    FilterChip(
                        selected = selectedLevel == null,
                        onClick = { onLevelChange(null) },
                        label = { Text("همه", fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT, selectedLabelColor = Color.White)
                    )
                }
                items(listOf(SpeakingLevel.BEGINNER, SpeakingLevel.INTERMEDIATE)) { lvl ->
                    FilterChip(
                        selected = selectedLevel == lvl,
                        onClick = { onLevelChange(lvl) },
                        label = { Text("${lvl.emoji} ${lvl.displayName}", fontSize = 12.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(lvl.color), selectedLabelColor = Color.White)
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            SectionTitle("🎭 حالت")
            Spacer(Modifier.height(6.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(PracticeMode.values().toList()) { mode ->
                    Card(
                        modifier = Modifier.width(90.dp).clickable { onModeChange(mode) },
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = if (practiceMode == mode) ACCENT else Color.White),
                        elevation = CardDefaults.cardElevation(if (practiceMode == mode) 6.dp else 2.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(mode.emoji, fontSize = 20.sp)
                            Spacer(Modifier.height(2.dp))
                            Text(
                                mode.title, fontSize = 10.sp, fontWeight = FontWeight.Bold,
                                color = if (practiceMode == mode) Color.White else Color(0xFF1A237E),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(12.dp))

            SectionTitle("📚 دسته")
            Spacer(Modifier.height(6.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                item {
                    FilterChip(
                        selected = selectedCategory == null,
                        onClick = { onCategoryChange(null) },
                        label = { Text("همه", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT, selectedLabelColor = Color.White)
                    )
                }
                items(SpeakingCategory.values().toList()) { cat ->
                    FilterChip(
                        selected = selectedCategory == cat,
                        onClick = { onCategoryChange(cat) },
                        label = { Text("${cat.emoji} ${cat.displayName}", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT, selectedLabelColor = Color.White)
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            SectionTitle("🎚️ طول جمله")
            Spacer(Modifier.height(6.dp))
            LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                item {
                    FilterChip(
                        selected = selectedDifficulty == null,
                        onClick = { onDifficultyChange(null) },
                        label = { Text("همه", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT, selectedLabelColor = Color.White)
                    )
                }
                items(SpeakingDifficulty.values().toList()) { d ->
                    FilterChip(
                        selected = selectedDifficulty == d,
                        onClick = { onDifficultyChange(d) },
                        label = { Text("${d.emoji} ${d.displayName}", fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ACCENT, selectedLabelColor = Color.White)
                    )
                }
            }

            Spacer(Modifier.height(18.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = ACCENT.copy(alpha = 0.1f))
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(14.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📊", fontSize = 22.sp)
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text("$totalCount جمله آماده", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = ACCENT)
                            if (wrongCount > 0) {
                                Text("🔄 $wrongCount اشتباه برای مرور", fontSize = 10.sp, color = WARNING)
                            } else {
                                Text("از کلمات، جملات و مکالمه", fontSize = 10.sp, color = Color.Gray)
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            Button(
                onClick = onStart,
                enabled = totalCount > 0,
                modifier = Modifier.fillMaxWidth().height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = ACCENT)
            ) {
                Text("🚀 شروع", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
private fun MiniBadge(text: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White.copy(alpha = 0.25f))
            .padding(horizontal = 8.dp, vertical = 3.dp)
    ) {
        Text(text, fontSize = 9.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun SectionTitle(text: String) {
    Text(text, fontSize = 13.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
}

@Composable
private fun MiniStat(modifier: Modifier = Modifier, emoji: String, value: String, label: String, color: Color) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(emoji, fontSize = 12.sp)
            Text(value, fontSize = 12.sp, fontWeight = FontWeight.Bold, color = color)
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
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.size(48.dp).clip(CircleShape).background(color.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) { Text(emoji, fontSize = 22.sp) }
            Spacer(Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(message, fontSize = 13.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                Text("امتیاز تلفظ", fontSize = 9.sp, color = Color.Gray)
            }
            Text("$score%", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = color)
        }
    }
}

@Composable
private fun ConfettiOverlay() {
    val particles = remember {
        List(60) {
            ConfettiParticle(
                x = Random.nextFloat(),
                color = listOf(
                    Color(0xFFE91E63), Color(0xFFFFA726), Color(0xFF43A047),
                    Color(0xFF1E88E5), Color(0xFF8E24AA), Color(0xFFFFEB3B)
                ).random(),
                size = Random.nextInt(5, 10),
                speed = Random.nextFloat() * 1.5f + 1f
            )
        }
    }
    val infiniteTransition = rememberInfiniteTransition(label = "confetti")
    val progress by infiniteTransition.animateFloat(
        initialValue = 0f, targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(2500, easing = LinearEasing)),
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

private data class ConfettiParticle(val x: Float, val color: Color, val size: Int, val speed: Float)

private fun buildColoredComparison(target: String, recognized: String) = buildAnnotatedString {
    val tWords = target.lowercase().replace(Regex("[^a-z0-9\\s']"), "").split(Regex("\\s+")).filter { it.isNotBlank() }
    val rWords = recognized.lowercase().replace(Regex("[^a-z0-9\\s']"), "").split(Regex("\\s+")).filter { it.isNotBlank() }
    tWords.forEachIndexed { i, w ->
        val ok = rWords.any { levenshtein(it, w) <= 1 }
        withStyle(SpanStyle(color = if (ok) SUCCESS else ERROR, fontWeight = FontWeight.Bold)) { append(w) }
        if (i < tWords.size - 1) append(" ")
    }
}

private fun buildHardWordHighlight(text: String, hardWords: Set<String>) = buildAnnotatedString {
    val words = text.split(Regex("\\s+"))
    words.forEachIndexed { i, w ->
        val clean = w.lowercase().trim('.', ',', '!', '?', ';', ':')
        if (hardWords.contains(clean)) {
            withStyle(SpanStyle(background = WARNING.copy(alpha = 0.2f), fontWeight = FontWeight.Bold)) { append(w) }
        } else append(w)
        if (i < words.size - 1) append(" ")
    }
}

private fun findHardWords(text: String): Set<String> {
    val words = text.lowercase().split(Regex("\\s+"))
    return words.filter { w ->
        val clean = w.trim('.', ',', '!', '?', ';', ':')
        clean.length >= 7 || clean.contains("th") || clean.contains("r")
    }.toSet()
}

private fun getPronunciationTips(text: String): List<String> {
    val tips = mutableListOf<String>()
    if (text.lowercase().contains("th")) tips.add("صدای /θ/ یا /ð/ با تماس زبان به دندان‌های بالا")
    if (text.lowercase().contains("r")) tips.add("صدای /r/ با برگرداندن زبان، بدون لمس سقف دهان")
    if (text.lowercase().contains("w")) tips.add("صدای /w/ با گرد کردن لب‌ها")
    if (text.lowercase().contains("ing")) tips.add("پسوند -ing با صدای nasal گفته می‌شه")
    if (tips.isEmpty()) tips.add("آروم شروع کن، بعد تدریجاً سریع‌تر")
    return tips.take(3)
}

/**
 * محاسبه امتیاز با اعمال حساسیت
 * - EASY: تحمل خطای بیشتر (levenshtein <= 2)
 * - NORMAL: تحمل خطای معمولی (levenshtein <= 1)
 * - STRICT: تحمل خطای کم (تطابق دقیق)
 */
private fun calculateScore(target: String, recognized: String, strictness: String): Int {
    if (recognized.isBlank()) return 0
    val t = target.lowercase().replace(Regex("[^a-z0-9\\s']"), "").split(Regex("\\s+")).filter { it.isNotBlank() }
    val r = recognized.lowercase().replace(Regex("[^a-z0-9\\s']"), "").split(Regex("\\s+")).filter { it.isNotBlank() }
    if (t.isEmpty()) return 0

    val tolerance = when (strictness) {
        "EASY" -> 2
        "STRICT" -> 0
        else -> 1
    }

    var m = 0
    t.forEach { tw -> if (r.any { rw -> levenshtein(rw, tw) <= tolerance }) m++ }
    return (m.toFloat() / t.size * 100).toInt().coerceIn(0, 100)
}

private fun levenshtein(a: String, b: String): Int {
    if (a == b) return 0
    if (a.isEmpty()) return b.length
    if (b.isEmpty()) return a.length
    val dp = Array(a.length + 1) { IntArray(b.length + 1) }
    for (i in 0..a.length) dp[i][0] = i
    for (j in 0..b.length) dp[0][j] = j
    for (i in 1..a.length) for (j in 1..b.length) {
        val c = if (a[i - 1] == b[j - 1]) 0 else 1
        dp[i][j] = minOf(dp[i - 1][j] + 1, dp[i][j - 1] + 1, dp[i - 1][j - 1] + c)
    }
    return dp[a.length][b.length]
}

private fun abs(value: Float): Float = if (value < 0) -value else value

private fun generateFeedback(score: Int): String = when {
    score < 30 -> "تلفظ خیلی فاصله داره. کلمه به کلمه تمرین کن."
    score < 50 -> "نزدیک شدی ولی چند کلمه اشتباهه. آرومتر بگو."
    score < 70 -> "خوب بود! فقط روی کلمات سخت تمرکز کن."
    else -> "تلفظت درسته، فقط روان‌تر بگو."
}