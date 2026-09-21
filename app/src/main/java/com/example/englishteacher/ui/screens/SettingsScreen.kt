package com.example.englishteacher.ui.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.SpeechHelper
import com.example.englishteacher.data.GroqClient

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onBack: () -> Unit = {}
) {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("app_settings", Context.MODE_PRIVATE) }

    // ==================== وضعیت‌ها ====================
    var userName by remember { mutableStateOf(prefs.getString("user_name", "") ?: "") }
    var apiKey by remember { mutableStateOf(prefs.getString("groq_api_key", "") ?: "") }
    var aiModel by remember { mutableStateOf(prefs.getString("ai_model", "llama-3.1-8b-instant") ?: "llama-3.1-8b-instant") }
    var aiTemperature by remember { mutableFloatStateOf(prefs.getFloat("ai_temperature", 0.7f)) }

    // صوت
    var speechRate by remember { mutableFloatStateOf(prefs.getFloat("speech_rate", 1.0f)) }
    var speechPitch by remember { mutableFloatStateOf(prefs.getFloat("speech_pitch", 1.0f)) }
    var voiceGender by remember { mutableStateOf(prefs.getString("voice_gender", "female") ?: "female") }
    var autoPlayNextStory by remember { mutableStateOf(prefs.getBoolean("auto_play_next_story", false)) }

    // ظاهر
    var vibrationEnabled by remember { mutableStateOf(prefs.getBoolean("vibration_enabled", true)) }
    var animationsEnabled by remember { mutableStateOf(prefs.getBoolean("animations_enabled", true)) }

    // تمرین گفتار
    var speakingMode by remember { mutableStateOf(prefs.getString("speaking_mode", "PRACTICE") ?: "PRACTICE") }
    var speakingLevel by remember { mutableStateOf(prefs.getString("speaking_level", "ALL") ?: "ALL") }
    var speakingSessionSize by remember { mutableIntStateOf(prefs.getInt("speaking_session_size", 25)) }
    var speakingAccent by remember { mutableStateOf(prefs.getString("speaking_accent", "US") ?: "US") }
    var speakingAutoPlay by remember { mutableStateOf(prefs.getBoolean("speaking_auto_play", false)) }
    var speakingShowTips by remember { mutableStateOf(prefs.getBoolean("speaking_show_tips", false)) }
    var speakingConfetti by remember { mutableStateOf(prefs.getBoolean("speaking_confetti", true)) }
    var speakingStrictness by remember { mutableStateOf(prefs.getString("speaking_strictness", "NORMAL") ?: "NORMAL") }
    var speakingSaveHistory by remember { mutableStateOf(prefs.getBoolean("speaking_save_history", true)) }

    // ==================== دیالوگ‌ها ====================
    var showApiDialog by remember { mutableStateOf(false) }
    var showNameDialog by remember { mutableStateOf(false) }
    var showModelDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }
    var showClearDialog by remember { mutableStateOf(false) }

    // ==================== Speech Helper ====================
    val speechHelper = remember { SpeechHelper(context) }
    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    LaunchedEffect(apiKey) {
        GroqClient.apiKey = apiKey
    }

    LaunchedEffect(Unit) {
        speechHelper.setVoiceGender(voiceGender)
        speechHelper.setSpeedAndPitch(speechRate, speechPitch)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "⚙️ تنظیمات",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
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
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF37474F)
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {

            // ==================== پروفایل ====================
            SettingsSection(emoji = "👤", title = "پروفایل", accent = Color(0xFF1A237E))

            SettingsItem(
                icon = Icons.Filled.Person,
                title = "نام شما",
                subtitle = if (userName.isEmpty()) "وارد نشده" else userName,
                subtitleColor = if (userName.isEmpty()) Color(0xFFD32F2F) else Color(0xFF2E7D32),
                onClick = { showNameDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== صوت ====================
            SettingsSection(emoji = "🔊", title = "تنظیمات صوت", accent = Color(0xFF00838F))

            SpeechSpeedCard(
                speechRate = speechRate,
                onRateChange = { newRate ->
                    speechRate = newRate
                    prefs.edit().putFloat("speech_rate", newRate).apply()
                    speechHelper.setSpeedAndPitch(newRate, speechPitch)
                },
                onTestClick = {
                    speechHelper.setSpeedAndPitch(speechRate, speechPitch)
                    speechHelper.speak("Hello! This is a test of the speech speed setting.")
                }
            )

            Spacer(Modifier.height(12.dp))

            SpeechPitchCard(
                speechPitch = speechPitch,
                onPitchChange = { newPitch ->
                    speechPitch = newPitch
                    prefs.edit().putFloat("speech_pitch", newPitch).apply()
                    speechHelper.setSpeedAndPitch(speechRate, newPitch)
                },
                onTestClick = {
                    speechHelper.setSpeedAndPitch(speechRate, speechPitch)
                    speechHelper.speak("Testing pitch. How does this sound?")
                }
            )

            Spacer(Modifier.height(12.dp))

            VoiceGenderCard(
                selected = voiceGender,
                onSelect = { gender ->
                    voiceGender = gender
                    prefs.edit().putString("voice_gender", gender).apply()
                    speechHelper.setVoiceGender(gender)
                    speechHelper.setSpeedAndPitch(speechRate, speechPitch)
                    speechHelper.speak(
                        if (gender == "female") "Hello! I am a female voice."
                        else "Hello! I am a male voice."
                    )
                }
            )

            Spacer(Modifier.height(12.dp))

            ToggleSettingsItem(
                icon = Icons.Filled.PlayArrow,
                title = "پخش خودکار داستان بعدی",
                subtitle = "بعد از اتمام داستان، داستان بعدی پخش شود",
                checked = autoPlayNextStory,
                onCheckedChange = {
                    autoPlayNextStory = it
                    prefs.edit().putBoolean("auto_play_next_story", it).apply()
                }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== تمرین گفتار ====================
            SettingsSection(emoji = "🎤", title = "تمرین گفتار", accent = Color(0xFF7B1FA2))

            // حالت پیش‌فرض
            SpeakingModeCard(
                selected = speakingMode,
                onSelect = { mode ->
                    speakingMode = mode
                    prefs.edit().putString("speaking_mode", mode).apply()
                }
            )

            Spacer(Modifier.height(12.dp))

            // سطح پیش‌فرض
            ChoiceChipsCard(
                icon = Icons.Filled.SignalCellularAlt,
                title = "سطح پیش‌فرض",
                subtitle = "سطح شروع هر جلسه",
                options = listOf(
                    "ALL" to "همه",
                    "BEGINNER" to "🌱 مبتدی",
                    "INTERMEDIATE" to "🚀 متوسط"
                ),
                selected = speakingLevel,
                onSelect = { level ->
                    speakingLevel = level
                    prefs.edit().putString("speaking_level", level).apply()
                }
            )

            Spacer(Modifier.height(12.dp))

            // تعداد جملات در هر جلسه
            SessionSizeCard(
                size = speakingSessionSize,
                onSizeChange = { newSize ->
                    speakingSessionSize = newSize
                    prefs.edit().putInt("speaking_session_size", newSize).apply()
                }
            )

            Spacer(Modifier.height(12.dp))

            // لهجه
            ChoiceChipsCard(
                icon = Icons.Filled.Language,
                title = "لهجه انگلیسی",
                subtitle = "لهجه‌ی تشخیص و تلفظ",
                options = listOf(
                    "US" to "🇺🇸 آمریکایی",
                    "UK" to "🇬🇧 بریتانیایی"
                ),
                selected = speakingAccent,
                onSelect = { accent ->
                    speakingAccent = accent
                    prefs.edit().putString("speaking_accent", accent).apply()
                }
            )

            Spacer(Modifier.height(12.dp))

            // حساسیت تشخیص
            ChoiceChipsCard(
                icon = Icons.Filled.Tune,
                title = "حساسیت تشخیص",
                subtitle = "چقدر سخت‌گیرانه تلفظت رو بسنجه",
                options = listOf(
                    "EASY" to "😊 راحت",
                    "NORMAL" to "⚖️ عادی",
                    "STRICT" to "🎯 سخت‌گیرانه"
                ),
                selected = speakingStrictness,
                onSelect = { strictness ->
                    speakingStrictness = strictness
                    prefs.edit().putString("speaking_strictness", strictness).apply()
                }
            )

            Spacer(Modifier.height(12.dp))

            // Toggle ها
            ToggleSettingsItem(
                icon = Icons.Filled.VolumeUp,
                title = "پخش خودکار تلفظ",
                subtitle = "قبل از ضبط، جمله به صورت خودکار پخش شود",
                checked = speakingAutoPlay,
                onCheckedChange = {
                    speakingAutoPlay = it
                    prefs.edit().putBoolean("speaking_auto_play", it).apply()
                }
            )

            Spacer(Modifier.height(10.dp))

            ToggleSettingsItem(
                icon = Icons.Filled.Lightbulb,
                title = "نمایش خودکار نکات تلفظ",
                subtitle = "نکات تلفظ هر جمله به صورت خودکار باز شود",
                checked = speakingShowTips,
                onCheckedChange = {
                    speakingShowTips = it
                    prefs.edit().putBoolean("speaking_show_tips", it).apply()
                }
            )

            Spacer(Modifier.height(10.dp))

            ToggleSettingsItem(
                icon = Icons.Filled.Celebration,
                title = "جلوه‌های جشن 🎉",
                subtitle = "نمایش Confetti در امتیاز بالای ۹۰",
                checked = speakingConfetti,
                onCheckedChange = {
                    speakingConfetti = it
                    prefs.edit().putBoolean("speaking_confetti", it).apply()
                }
            )

            Spacer(Modifier.height(10.dp))

            ToggleSettingsItem(
                icon = Icons.Filled.History,
                title = "ذخیره تاریخچه جلسات",
                subtitle = "نگه داشتن تاریخچه امتیازها",
                checked = speakingSaveHistory,
                onCheckedChange = {
                    speakingSaveHistory = it
                    prefs.edit().putBoolean("speaking_save_history", it).apply()
                }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== ظاهر ====================
            SettingsSection(emoji = "🎨", title = "ظاهر و رفتار", accent = Color(0xFF6A1B9A))

            ToggleSettingsItem(
                icon = Icons.Filled.Vibration,
                title = "لرزش",
                subtitle = "لرزش در تلفظ اشتباه و تعاملات",
                checked = vibrationEnabled,
                onCheckedChange = {
                    vibrationEnabled = it
                    prefs.edit().putBoolean("vibration_enabled", it).apply()
                }
            )

            Spacer(Modifier.height(10.dp))

            ToggleSettingsItem(
                icon = Icons.Filled.Animation,
                title = "انیمیشن‌ها",
                subtitle = "خاموش کردن انیمیشن‌های سنگین",
                checked = animationsEnabled,
                onCheckedChange = {
                    animationsEnabled = it
                    prefs.edit().putBoolean("animations_enabled", it).apply()
                }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== AI ====================
            SettingsSection(emoji = "🤖", title = "هوش مصنوعی", accent = Color(0xFF1E88E5))

            SettingsItem(
                icon = Icons.Filled.Key,
                title = "کلید API گروک",
                subtitle = if (apiKey.isEmpty()) "تنظیم نشده" else "تنظیم شده ✓",
                subtitleColor = if (apiKey.isEmpty()) Color(0xFFD32F2F) else Color(0xFF2E7D32),
                onClick = { showApiDialog = true }
            )

            Spacer(Modifier.height(10.dp))

            SettingsItem(
                icon = Icons.Filled.Memory,
                title = "مدل هوش مصنوعی",
                subtitle = when (aiModel) {
                    "llama-3.1-8b-instant" -> "Llama 3.1 (سریع)"
                    "llama-3.3-70b-versatile" -> "Llama 3.3 (دقیق)"
                    "mixtral-8x7b-32768" -> "Mixtral (تخصصی)"
                    else -> aiModel
                },
                subtitleColor = Color.Gray,
                onClick = { showModelDialog = true }
            )

            Spacer(Modifier.height(12.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color(0xFF1E88E5).copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Thermostat,
                                contentDescription = null,
                                tint = Color(0xFF1E88E5),
                                modifier = Modifier.size(22.dp)
                            )
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "خلاقیت پاسخ‌ها",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                            Text(
                                "پایین: دقیق‌تر | بالا: خلاق‌تر",
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFF1E88E5).copy(alpha = 0.12f))
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                "${"%.1f".format(aiTemperature)}",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1E88E5)
                            )
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    Slider(
                        value = aiTemperature,
                        onValueChange = {
                            aiTemperature = it
                            prefs.edit().putFloat("ai_temperature", it).apply()
                        },
                        valueRange = 0f..1.5f,
                        steps = 5,
                        colors = SliderDefaults.colors(
                            thumbColor = Color(0xFF1E88E5),
                            activeTrackColor = Color(0xFF1E88E5)
                        )
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== داده‌ها ====================
            SettingsSection(emoji = "📊", title = "داده‌ها", accent = Color(0xFFD32F2F))

            SettingsItem(
                icon = Icons.Filled.Delete,
                title = "پاک کردن پیشرفت",
                subtitle = "تمام پیشرفت مطالعه، داستان‌های خوانده‌شده و تنظیمات",
                subtitleColor = Color.Gray,
                onClick = { showClearDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== درباره ====================
            SettingsSection(emoji = "ℹ️", title = "درباره", accent = Color(0xFF6A1B9A))

            SettingsItem(
                icon = Icons.Filled.Info,
                title = "درباره اپلیکیشن",
                subtitle = "English Teacher v1.0",
                subtitleColor = Color.Gray,
                onClick = { showAboutDialog = true }
            )

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        "English Teacher",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        "ساخته شده با ❤️ برای یادگیری",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(20.dp))
        }

        // ==================== دیالوگ‌ها ====================

        if (showApiDialog) {
            var tempKey by remember { mutableStateOf(apiKey) }
            AlertDialog(
                onDismissRequest = { showApiDialog = false },
                title = { Text("🔑 کلید API", fontWeight = FontWeight.Bold) },
                text = {
                    Column {
                        Text(
                            "از console.groq.com یک کلید رایگان بگیرید.",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                        Spacer(Modifier.height(12.dp))
                        OutlinedTextField(
                            value = tempKey,
                            onValueChange = { tempKey = it },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text("gsk_...", fontSize = 13.sp) },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp)
                        )
                    }
                },
                confirmButton = {
                    TextButton(onClick = {
                        apiKey = tempKey.trim()
                        prefs.edit().putString("groq_api_key", apiKey).apply()
                        GroqClient.apiKey = apiKey
                        showApiDialog = false
                    }) {
                        Text("ذخیره", fontWeight = FontWeight.Bold)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showApiDialog = false }) {
                        Text("انصراف")
                    }
                }
            )
        }

        if (showNameDialog) {
            var tempName by remember { mutableStateOf(userName) }
            AlertDialog(
                onDismissRequest = { showNameDialog = false },
                title = { Text("👤 نام شما", fontWeight = FontWeight.Bold) },
                text = {
                    OutlinedTextField(
                        value = tempName,
                        onValueChange = { tempName = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = { Text("مثلاً: علی", fontSize = 13.sp) },
                        singleLine = true,
                        shape = RoundedCornerShape(12.dp)
                    )
                },
                confirmButton = {
                    TextButton(onClick = {
                        userName = tempName.trim()
                        prefs.edit().putString("user_name", userName).apply()
                        showNameDialog = false
                    }) {
                        Text("ذخیره", fontWeight = FontWeight.Bold)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showNameDialog = false }) {
                        Text("انصراف")
                    }
                }
            )
        }

        if (showModelDialog) {
            AlertDialog(
                onDismissRequest = { showModelDialog = false },
                title = { Text("🧠 انتخاب مدل AI", fontWeight = FontWeight.Bold) },
                text = {
                    Column {
                        ModelOption("llama-3.1-8b-instant", "Llama 3.1 - سریع", aiModel) {
                            aiModel = it
                            prefs.edit().putString("ai_model", it).apply()
                            showModelDialog = false
                        }
                        Spacer(Modifier.height(8.dp))
                        ModelOption("llama-3.3-70b-versatile", "Llama 3.3 - دقیق‌تر", aiModel) {
                            aiModel = it
                            prefs.edit().putString("ai_model", it).apply()
                            showModelDialog = false
                        }
                        Spacer(Modifier.height(8.dp))
                        ModelOption("mixtral-8x7b-32768", "Mixtral - تخصصی", aiModel) {
                            aiModel = it
                            prefs.edit().putString("ai_model", it).apply()
                            showModelDialog = false
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = { showModelDialog = false }) {
                        Text("بستن")
                    }
                }
            )
        }

        if (showClearDialog) {
            AlertDialog(
                onDismissRequest = { showClearDialog = false },
                title = { Text("⚠️ پاک کردن همه چیز", fontWeight = FontWeight.Bold) },
                text = { Text("آیا مطمئن هستید؟ تمام پیشرفت و تنظیمات پاک می‌شود.") },
                confirmButton = {
                    TextButton(onClick = {
                        prefs.edit().clear().apply()
                        apiKey = ""
                        speechRate = 1.0f
                        speechPitch = 1.0f
                        voiceGender = "female"
                        userName = ""
                        speakingMode = "PRACTICE"
                        speakingLevel = "ALL"
                        speakingSessionSize = 25
                        speakingAccent = "US"
                        speakingStrictness = "NORMAL"
                        showClearDialog = false
                    }) {
                        Text("بله", color = Color(0xFFD32F2F), fontWeight = FontWeight.Bold)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showClearDialog = false }) {
                        Text("انصراف")
                    }
                }
            )
        }

        if (showAboutDialog) {
            AlertDialog(
                onDismissRequest = { showAboutDialog = false },
                title = { Text("📱 English Teacher", fontWeight = FontWeight.Bold) },
                text = {
                    Column {
                        Text("نسخه ۱.۰", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "اپلیکیشن جامع یادگیری انگلیسی:\n" +
                                    "• درس‌های Top Notch\n" +
                                    "• کتاب داستان\n" +
                                    "• گرامر و کوییز\n" +
                                    "• تمرین گفتار\n" +
                                    "• پادکست\n" +
                                    "• معلم هوشمند AI",
                            fontSize = 13.sp,
                            lineHeight = 20.sp,
                            color = Color.Gray
                        )
                    }
                },
                confirmButton = {
                    TextButton(onClick = { showAboutDialog = false }) {
                        Text("باشه")
                    }
                }
            )
        }
    }
}

// ==================== کامپوننت‌های عمومی ====================

@Composable
private fun SettingsSection(emoji: String, title: String, accent: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(4.dp, 20.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(accent)
        )
        Spacer(Modifier.width(10.dp))
        Text(
            "$emoji $title",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
    }
}

@Composable
private fun SettingsItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    subtitleColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF37474F).copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    icon,
                    contentDescription = null,
                    tint = Color(0xFF37474F),
                    modifier = Modifier.size(22.dp)
                )
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    subtitle,
                    fontSize = 12.sp,
                    color = subtitleColor,
                    maxLines = 2
                )
            }
            Icon(
                Icons.Filled.ChevronRight,
                contentDescription = null,
                tint = Color.LightGray,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
private fun ToggleSettingsItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF37474F).copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    icon,
                    contentDescription = null,
                    tint = Color(0xFF37474F),
                    modifier = Modifier.size(22.dp)
                )
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    subtitle,
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }
            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    checkedTrackColor = Color(0xFF6A1B9A)
                )
            )
        }
    }
}

@Composable
private fun SpeechSpeedCard(
    speechRate: Float,
    onRateChange: (Float) -> Unit,
    onTestClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        listOf(Color(0xFF00838F), Color(0xFF26C6DA))
                    )
                )
                .padding(16.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("⏩", fontSize = 20.sp)
                    }
                    Spacer(Modifier.width(10.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "سرعت پخش صوت",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "سرعت خواندن متن‌ها",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color.White.copy(alpha = 0.25f))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            "${"%.1f".format(speechRate)}x",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
                Spacer(Modifier.height(10.dp))
                Slider(
                    value = speechRate,
                    onValueChange = onRateChange,
                    valueRange = 0.5f..2.0f,
                    steps = 5,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = Color.White,
                        inactiveTrackColor = Color.White.copy(alpha = 0.3f)
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("آهسته ۰.۵x", fontSize = 10.sp, color = Color.White.copy(alpha = 0.8f))
                    Text("۱.۰x", fontSize = 10.sp, color = Color.White.copy(alpha = 0.8f))
                    Text("سریع ۲.۰x", fontSize = 10.sp, color = Color.White.copy(alpha = 0.8f))
                }
                Spacer(Modifier.height(10.dp))
                Button(
                    onClick = onTestClick,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White.copy(alpha = 0.25f)
                    )
                ) {
                    Icon(
                        Icons.Filled.PlayArrow,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text("تست صدا", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }
    }
}

@Composable
private fun SpeechPitchCard(
    speechPitch: Float,
    onPitchChange: (Float) -> Unit,
    onTestClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC))
                    )
                )
                .padding(16.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("🎵", fontSize = 20.sp)
                    }
                    Spacer(Modifier.width(10.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "زیر و بمی صدا",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "تنظیم صدای گوینده",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color.White.copy(alpha = 0.25f))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            "${"%.1f".format(speechPitch)}x",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
                Spacer(Modifier.height(10.dp))
                Slider(
                    value = speechPitch,
                    onValueChange = onPitchChange,
                    valueRange = 0.5f..1.5f,
                    steps = 4,
                    colors = SliderDefaults.colors(
                        thumbColor = Color.White,
                        activeTrackColor = Color.White,
                        inactiveTrackColor = Color.White.copy(alpha = 0.3f)
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("بم ۰.۵", fontSize = 10.sp, color = Color.White.copy(alpha = 0.8f))
                    Text("معمولی ۱.۰", fontSize = 10.sp, color = Color.White.copy(alpha = 0.8f))
                    Text("تیز ۱.۵", fontSize = 10.sp, color = Color.White.copy(alpha = 0.8f))
                }
                Spacer(Modifier.height(10.dp))
                Button(
                    onClick = onTestClick,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White.copy(alpha = 0.25f)
                    )
                ) {
                    Icon(
                        Icons.Filled.PlayArrow,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text("تست صدا", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }
    }
}

@Composable
private fun VoiceGenderCard(
    selected: String,
    onSelect: (String) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFE8EAF6)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("🎭", fontSize = 22.sp)
                }
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(
                        "نوع صدای گوینده",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        "انتخاب بین صدای مرد و زن",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                VoiceGenderButton(
                    modifier = Modifier.weight(1f),
                    emoji = "👩",
                    label = "زن",
                    selected = selected == "female",
                    onClick = { onSelect("female") }
                )
                VoiceGenderButton(
                    modifier = Modifier.weight(1f),
                    emoji = "👨",
                    label = "مرد",
                    selected = selected == "male",
                    onClick = { onSelect("male") }
                )
            }
        }
    }
}

@Composable
private fun VoiceGenderButton(
    modifier: Modifier = Modifier,
    emoji: String,
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .height(75.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(if (selected) 6.dp else 1.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selected) Color(0xFF6A1B9A) else Color(0xFFF5F5F5)
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(emoji, fontSize = 26.sp)
            Spacer(Modifier.height(2.dp))
            Text(
                label,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = if (selected) Color.White else Color(0xFF1A237E)
            )
        }
    }
}

// ==================== کامپوننت‌های Speaking ====================

@Composable
private fun SpeakingModeCard(
    selected: String,
    onSelect: (String) -> Unit
) {
    val modes = listOf(
        "PRACTICE" to Triple("🎯", "عادی", "تمرکز روی هر جمله"),
        "SHADOW" to Triple("🎭", "سایه", "تکرار بعد گوینده"),
        "FREESTYLE" to Triple("⚡", "آزاد", "سریع برو جلو"),
        "REVIEW" to Triple("🔄", "مرور", "جملات اشتباه")
    )
    val current = modes.firstOrNull { it.first == selected }?.second ?: modes[0].second

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        listOf(Color(0xFF7B1FA2), Color(0xFFAB47BC))
                    )
                )
                .padding(16.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(current.first, fontSize = 20.sp)
                    }
                    Spacer(Modifier.width(10.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "حالت پیش‌فرض تمرین",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "حالت شروع هر جلسه",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                }

                Spacer(Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    modes.forEach { (key, triple) ->
                        val isSelected = selected == key
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(
                                    if (isSelected) Color.White.copy(alpha = 0.35f)
                                    else Color.White.copy(alpha = 0.15f)
                                )
                                .clickable { onSelect(key) }
                                .padding(vertical = 8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(triple.first, fontSize = 18.sp)
                            Spacer(Modifier.height(2.dp))
                            Text(
                                triple.second,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ChoiceChipsCard(
    icon: ImageVector,
    title: String,
    subtitle: String,
    options: List<Pair<String, String>>,
    selected: String,
    onSelect: (String) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFF7B1FA2).copy(alpha = 0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        icon,
                        contentDescription = null,
                        tint = Color(0xFF7B1FA2),
                        modifier = Modifier.size(22.dp)
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(
                        title,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        subtitle,
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                options.forEach { (key, label) ->
                    val isSelected = selected == key
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(10.dp))
                            .background(
                                if (isSelected) Color(0xFF7B1FA2) else Color(0xFFF5F5F5)
                            )
                            .clickable { onSelect(key) }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            label,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isSelected) Color.White else Color(0xFF424242),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SessionSizeCard(
    size: Int,
    onSizeChange: (Int) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFF7B1FA2).copy(alpha = 0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Filled.FormatListNumbered,
                        contentDescription = null,
                        tint = Color(0xFF7B1FA2),
                        modifier = Modifier.size(22.dp)
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        "تعداد جملات هر جلسه",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        "چند جمله در هر جلسه تمرین کنی",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF7B1FA2).copy(alpha = 0.12f))
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                ) {
                    Text(
                        "$size",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF7B1FA2)
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Slider(
                value = size.toFloat(),
                onValueChange = { onSizeChange(it.toInt()) },
                valueRange = 10f..50f,
                steps = 3,
                colors = SliderDefaults.colors(
                    thumbColor = Color(0xFF7B1FA2),
                    activeTrackColor = Color(0xFF7B1FA2)
                )
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("۱۰ کوتاه", fontSize = 10.sp, color = Color.Gray)
                Text("۲۵", fontSize = 10.sp, color = Color.Gray)
                Text("۵۰ طولانی", fontSize = 10.sp, color = Color.Gray)
            }
        }
    }
}

@Composable
private fun ModelOption(
    value: String,
    label: String,
    currentModel: String,
    onSelect: (String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onSelect(value) },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (currentModel == value) Color(0xFF1E88E5).copy(alpha = 0.15f) else Color(0xFFF5F5F5)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = currentModel == value,
                onClick = { onSelect(value) },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color(0xFF1E88E5)
                )
            )
            Spacer(Modifier.width(8.dp))
            Text(
                label,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1A237E)
            )
        }
    }
}