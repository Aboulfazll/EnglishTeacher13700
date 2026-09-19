package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.SettingsManager
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var textScale by remember { mutableFloatStateOf(1.0f) }
    var ttsSpeed by remember { mutableFloatStateOf(0.85f) }
    var totalStars by remember { mutableIntStateOf(0) }
    var showResetDialog by remember { mutableStateOf(false) }

    // خواندن تنظیمات
    LaunchedEffect(Unit) {
        SettingsManager.getTextScale(context).collectLatest { textScale = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getTtsSpeed(context).collectLatest { ttsSpeed = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getTotalStars(context).collectLatest { totalStars = it }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("تنظیمات", fontWeight = FontWeight.Bold, color = Color.White)
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1A237E))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // ⭐ امتیاز کل
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF8E1))
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Star,
                        contentDescription = null,
                        tint = Color(0xFFFFA000),
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(Modifier.width(16.dp))
                    Column {
                        Text("امتیاز کل شما", fontSize = 14.sp, color = Color.Gray)
                        Text(
                            "$totalStars ⭐",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFE65100)
                        )
                    }
                }
            }

            // 🔤 اندازه متن
            SettingsCard(
                icon = Icons.Filled.TextFields,
                title = "اندازه متن",
                subtitle = when {
                    textScale < 0.9f -> "کوچک"
                    textScale < 1.1f -> "معمولی"
                    textScale < 1.3f -> "بزرگ"
                    else -> "خیلی بزرگ"
                }
            ) {
                Slider(
                    value = textScale,
                    onValueChange = { newValue ->
                        textScale = newValue
                        scope.launch {
                            SettingsManager.setTextScale(context, newValue)
                        }
                    },
                    valueRange = 0.8f..1.5f,
                    steps = 6,
                    colors = SliderDefaults.colors(
                        thumbColor = Color(0xFF1A237E),
                        activeTrackColor = Color(0xFF1A237E)
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("A", fontSize = 12.sp, color = Color.Gray)
                    Text("A", fontSize = 20.sp, color = Color.Gray)
                }
            }

            // 🔊 سرعت تلفظ
            SettingsCard(
                icon = Icons.Filled.VolumeUp,
                title = "سرعت تلفظ کلمات",
                subtitle = when {
                    ttsSpeed < 0.7f -> "خیلی کند"
                    ttsSpeed < 0.95f -> "کند (پیشنهادی)"
                    ttsSpeed < 1.15f -> "معمولی"
                    else -> "سریع"
                }
            ) {
                Slider(
                    value = ttsSpeed,
                    onValueChange = { newValue ->
                        ttsSpeed = newValue
                        scope.launch {
                            SettingsManager.setTtsSpeed(context, newValue)
                        }
                    },
                    valueRange = 0.5f..1.5f,
                    steps = 9,
                    colors = SliderDefaults.colors(
                        thumbColor = Color(0xFF1A237E),
                        activeTrackColor = Color(0xFF1A237E)
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("🐢 کند", fontSize = 12.sp, color = Color.Gray)
                    Text("سریع 🐇", fontSize = 12.sp, color = Color.Gray)
                }
            }

            // 🗑️ ریست کردن پیشرفت
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFEBEE)),
                onClick = { showResetDialog = true }
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Delete,
                        contentDescription = null,
                        tint = Color(0xFFD32F2F),
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(Modifier.width(16.dp))
                    Column {
                        Text(
                            "ریست کردن پیشرفت",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFD32F2F)
                        )
                        Text(
                            "تمام پیشرفت و امتیازات پاک می‌شود",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            // ℹ️ درباره اپلیکیشن
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.Info,
                            contentDescription = null,
                            tint = Color(0xFF1A237E)
                        )
                        Spacer(Modifier.width(12.dp))
                        Text(
                            "درباره اپلیکیشن",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "English Teacher",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text("نسخه ۱.۰", fontSize = 12.sp, color = Color.Gray)
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "اپلیکیشن آموزش زبان انگلیسی بر پایه کتاب Top Notch\n۳۰ درس، ۳ سطح، مکالمه، داستان و کوییز",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        lineHeight = 18.sp
                    )
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }

    // دیالوگ تأیید ریست
    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            title = { Text("ریست کردن پیشرفت؟") },
            text = {
                Text("آیا مطمئن هستی؟ تمام پیشرفت، امتیازات و نمرات کوییز پاک می‌شود.")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch {
                            ProgressManager.resetProgress(context)
                        }
                        showResetDialog = false
                    }
                ) {
                    Text("بله، ریست کن", color = Color(0xFFD32F2F))
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetDialog = false }) {
                    Text("لغو")
                }
            }
        )
    }
}

@Composable
private fun SettingsCard(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(icon, contentDescription = null, tint = Color(0xFF1A237E))
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(
                        title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(subtitle, fontSize = 12.sp, color = Color.Gray)
                }
            }
            Spacer(Modifier.height(16.dp))
            content()
        }
    }
}