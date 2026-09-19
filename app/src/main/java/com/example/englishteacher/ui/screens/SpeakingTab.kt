package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.SpeechRecognitionHelper
import com.example.englishteacher.data.Word

@Composable
fun SpeakingTab(
    words: List<Word>,
    speechHelper: SpeechHelper,
    accent: Color
) {
    val context = LocalContext.current
    var currentIndex by remember { mutableIntStateOf(0) }
    var isRecording by remember { mutableStateOf(false) }
    var isProcessing by remember { mutableStateOf(false) }
    var recognizedText by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }
    var score by remember { mutableIntStateOf(-1) }
    var currentTarget by remember { mutableStateOf(words.firstOrNull()?.english ?: "") }

    val recognitionHelper = remember {
        SpeechRecognitionHelper(
            context = context,
            onResult = { result ->
                recognizedText = result
                isRecording = false
                isProcessing = false
                score = calculateSimilarity(currentTarget, result)
            },
            onError = { error ->
                errorMessage = error
                isRecording = false
                isProcessing = false
            },
            onReady = {
                isRecording = true
                errorMessage = ""
                recognizedText = ""
                score = -1
            },
            onEnd = {
                isRecording = false
            }
        )
    }

    DisposableEffect(Unit) {
        onDispose { recognitionHelper.destroy() }
    }

    LaunchedEffect(currentIndex) {
        currentTarget = words.getOrNull(currentIndex)?.english ?: ""
        recognizedText = ""
        errorMessage = ""
        score = -1
    }

    if (words.isEmpty()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("لغتی برای تمرین وجود ندارد", color = Color.Gray)
        }
        return
    }

    val word = words[currentIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(accent.copy(alpha = 0.1f))
                .padding(14.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("🎤", fontSize = 26.sp)
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(
                        "تمرین تلفظ",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = accent
                    )
                    Text(
                        "کلمه رو گوش کن، بعد بگو",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Text(
            "کلمه ${currentIndex + 1} از ${words.size}",
            fontSize = 12.sp,
            color = Color.Gray
        )

        Spacer(Modifier.height(12.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    word.english,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E),
                    textAlign = TextAlign.Center
                )
                if (word.pronunciation.isNotEmpty()) {
                    Spacer(Modifier.height(6.dp))
                    Text(
                        "/${word.pronunciation}/",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
                Spacer(Modifier.height(8.dp))
                Text(
                    word.persian,
                    fontSize = 16.sp,
                    color = accent,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = { speechHelper.speak(word.english) },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
        ) {
            Icon(Icons.AutoMirrored.Filled.VolumeUp, contentDescription = null, tint = Color.White)
            Spacer(Modifier.width(8.dp))
            Text("گوش کن", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }

        Spacer(Modifier.height(12.dp))

        Button(
            onClick = {
                if (isRecording) {
                    recognitionHelper.stopListening()
                    isRecording = false
                } else {
                    if (!recognitionHelper.isAvailable()) {
                        errorMessage = "سیستم تشخیص صدا در این دستگاه موجود نیست"
                        return@Button
                    }
                    isProcessing = true
                    recognitionHelper.startListening("en-US")
                }
            },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isRecording) Color(0xFFD32F2F) else accent
            )
        ) {
            Icon(
                Icons.Filled.Mic,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(22.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                when {
                    isRecording -> "توقف ضبط"
                    isProcessing -> "در حال شنیدن..."
                    else -> "صحبت کن"
                },
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }

        Spacer(Modifier.height(20.dp))

        if (recognizedText.isNotEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = when {
                        score >= 80 -> Color(0xFFC8E6C9)
                        score >= 50 -> Color(0xFFFFF8E1)
                        else -> Color(0xFFFFCDD2)
                    }
                ),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            when {
                                score >= 80 -> "🎉"
                                score >= 50 -> "👍"
                                else -> "💪"
                            },
                            fontSize = 28.sp
                        )
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text("شنیده شد:", fontSize = 12.sp, color = Color.Gray)
                            Text(
                                recognizedText,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                        }
                    }
                    Spacer(Modifier.height(10.dp))
                    LinearProgressIndicator(
                        progress = { score.coerceAtLeast(0) / 100f },
                        modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                        color = when {
                            score >= 80 -> Color(0xFF43A047)
                            score >= 50 -> Color(0xFFF57C00)
                            else -> Color(0xFFD32F2F)
                        },
                        trackColor = Color.White.copy(alpha = 0.5f)
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = when {
                            score >= 80 -> "عالی! تلفظت خیلی خوبه ⭐"
                            score >= 50 -> "خوبه، ولی می‌تونی بهتر بگی"
                            else -> "دوباره امتحان کن"
                        },
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF424242)
                    )
                }
            }
        }

        if (errorMessage.isNotEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFEBEE)),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("⚠️", fontSize = 24.sp)
                    Spacer(Modifier.width(10.dp))
                    Text(errorMessage, fontSize = 13.sp, color = Color(0xFFD32F2F))
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedButton(
                onClick = { if (currentIndex > 0) currentIndex-- },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(12.dp),
                enabled = currentIndex > 0
            ) {
                Text("← قبلی", color = accent)
            }

            OutlinedButton(
                onClick = { if (currentIndex < words.size - 1) currentIndex++ },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(12.dp),
                enabled = currentIndex < words.size - 1
            ) {
                Text("بعدی →", color = accent)
            }
        }

        Spacer(Modifier.height(20.dp))
    }
}

private fun calculateSimilarity(target: String, spoken: String): Int {
    val t = target.lowercase().trim().replace(Regex("[^a-z0-9 ]"), "").replace(Regex("\\s+"), " ")
    val s = spoken.lowercase().trim().replace(Regex("[^a-z0-9 ]"), "").replace(Regex("\\s+"), " ")
    if (t == s) return 100
    if (t.isEmpty()) return 0
    val distance = levenshtein(t, s)
    val maxLen = maxOf(t.length, s.length)
    if (maxLen == 0) return 100
    return (((maxLen - distance).toFloat() / maxLen) * 100).toInt().coerceIn(0, 100)
}

private fun levenshtein(a: String, b: String): Int {
    val dp = Array(a.length + 1) { IntArray(b.length + 1) }
    for (i in 0..a.length) dp[i][0] = i
    for (j in 0..b.length) dp[0][j] = j
    for (i in 1..a.length) {
        for (j in 1..b.length) {
            val cost = if (a[i - 1] == b[j - 1]) 0 else 1
            dp[i][j] = minOf(dp[i - 1][j] + 1, dp[i][j - 1] + 1, dp[i - 1][j - 1] + cost)
        }
    }
    return dp[a.length][b.length]
}