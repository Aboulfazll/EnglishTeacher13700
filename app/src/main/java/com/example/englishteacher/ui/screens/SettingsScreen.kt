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
    val prefs = remember {
        context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    }

    // ==================== وضعیت‌ها ====================
    var apiKey by remember {
        mutableStateOf(prefs.getString("groq_api_key", "") ?: "")
    }
    var speechRate by remember {
        mutableFloatStateOf(prefs.getFloat("speech_rate", 1.0f))
    }
    var speechPitch by remember {
        mutableFloatStateOf(prefs.getFloat("speech_pitch", 1.0f))
    }
    var voiceGender by remember {
        mutableStateOf(prefs.getString("voice_gender", "female") ?: "female")
    }
    var userName by remember {
        mutableStateOf(prefs.getString("user_name", "") ?: "")
    }

    // ==================== دیالوگ‌ها ====================
    var showApiDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }
    var showClearDialog by remember { mutableStateOf(false) }
    var showNameDialog by remember { mutableStateOf(false) }

    // ==================== Speech Helper برای تست ====================
    val speechHelper = remember { SpeechHelper(context) }
    DisposableEffect(Unit) {
        onDispose { speechHelper.close() }
    }

    LaunchedEffect(apiKey) {
        GroqClient.apiKey = apiKey
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

            // ==================== بخش کاربر ====================
            SettingsSection(
                emoji = "👤",
                title = "پروفایل",
                accent = Color(0xFF1A237E)
            )

            SettingsItem(
                icon = Icons.Filled.Person,
                title = "نام شما",
                subtitle = if (userName.isEmpty()) "وارد نشده — برای شخصی‌سازی وارد کنید"
                else userName,
                subtitleColor = if (userName.isEmpty()) Color(0xFFD32F2F) else Color(0xFF2E7D32),
                onClick = { showNameDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== بخش صوت ====================
            SettingsSection(
                emoji = "🔊",
                title = "تنظیمات صوت",
                accent = Color(0xFF00838F)
            )

            // کارت سرعت پخش
            SpeechSpeedCard(
                speechRate = speechRate,
                onRateChange = { newRate ->
                    speechRate = newRate
                    prefs.edit().putFloat("speech_rate", newRate).apply()
                },
                onTestClick = {
                    speechHelper.setSpeedAndPitch(speechRate, speechPitch)
                    speechHelper.speak("Hello! This is a test of the speech speed setting.")
                }
            )

            Spacer(Modifier.height(12.dp))

            // کارت زیر و بمی صدا
            SpeechPitchCard(
                speechPitch = speechPitch,
                onPitchChange = { newPitch ->
                    speechPitch = newPitch
                    prefs.edit().putFloat("speech_pitch", newPitch).apply()
                },
                onTestClick = {
                    speechHelper.setSpeedAndPitch(speechRate, speechPitch)
                    speechHelper.speak("Testing pitch. How does this sound?")
                }
            )

            Spacer(Modifier.height(12.dp))

            // کارت انتخاب جنسیت صدا
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

            Spacer(Modifier.height(20.dp))

            // ==================== بخش AI ====================
            SettingsSection(
                emoji = "🤖",
                title = "هوش مصنوعی (AI)",
                accent = Color(0xFF1E88E5)
            )

            SettingsItem(
                icon = Icons.Filled.Key,
                title = "کلید API گروک",
                subtitle = if (apiKey.isEmpty()) "تنظیم نشده — برای استفاده از AI وارد کنید"
                else "تنظیم شده ✓",
                subtitleColor = if (apiKey.isEmpty()) Color(0xFFD32F2F) else Color(0xFF2E7D32),
                onClick = { showApiDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== بخش داده‌ها ====================
            SettingsSection(
                emoji = "📊",
                title = "داده‌ها",
                accent = Color(0xFFD32F2F)
            )

            SettingsItem(
                icon = Icons.Filled.Delete,
                title = "پاک کردن پیشرفت",
                subtitle = "تمام پیشرفت مطالعه و داستان‌های خوانده‌شده پاک می‌شود",
                subtitleColor = Color.Gray,
                onClick = { showClearDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            // ==================== بخش درباره ====================
            SettingsSection(
                emoji = "ℹ️",
                title = "درباره",
                accent = Color(0xFF6A1B9A)
            )

            SettingsItem(
                icon = Icons.Filled.Info,
                title = "درباره اپلیکیشن",
                subtitle = "English Teacher v1.0",
                subtitleColor = Color.Gray,
                onClick = { showAboutDialog = true }
            )

            Spacer(Modifier.height(30.dp))

            // ==================== Footer ====================
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

        // ==================== دیالوگ API Key ====================
        if (showApiDialog) {
            var tempKey by remember { mutableStateOf(apiKey) }
            AlertDialog(
                onDismissRequest = { showApiDialog = false },
                title = { Text("🔑 کلید API گروک", fontWeight = FontWeight.Bold) },
                text = {
                    Column {
                        Text(
                            "برای استفاده از AI، یک کلید رایگان از console.groq.com بگیرید و اینجا وارد کنید.",
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

        // ==================== دیالوگ نام ====================
        if (showNameDialog) {
            var tempName by remember { mutableStateOf(userName) }
            AlertDialog(
                onDismissRequest = { showNameDialog = false },
                title = { Text("👤 نام شما", fontWeight = FontWeight.Bold) },
                text = {
                    Column {
                        Text(
                            "اسمت رو وارد کن تا توی صفحه اصلی بهت خوش‌آمد بگیم.",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                        Spacer(Modifier.height(12.dp))
                        OutlinedTextField(
                            value = tempName,
                            onValueChange = { tempName = it },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text("مثلاً: علی", fontSize = 13.sp) },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp)
                        )
                    }
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

        // ==================== دیالوگ پاک کردن ====================
        if (showClearDialog) {
            AlertDialog(
                onDismissRequest = { showClearDialog = false },
                title = { Text("⚠️ پاک کردن پیشرفت", fontWeight = FontWeight.Bold) },
                text = { Text("آیا مطمئن هستید؟ این کار قابل بازگشت نیست.") },
                confirmButton = {
                    TextButton(onClick = {
                        prefs.edit().apply {
                            remove("groq_api_key")
                            remove("speech_rate")
                            remove("speech_pitch")
                            remove("voice_gender")
                            apply()
                        }
                        apiKey = ""
                        speechRate = 1.0f
                        speechPitch = 1.0f
                        voiceGender = "female"
                        showClearDialog = false
                    }) {
                        Text("بله، پاک کن", color = Color(0xFFD32F2F), fontWeight = FontWeight.Bold)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showClearDialog = false }) {
                        Text("انصراف")
                    }
                }
            )
        }

        // ==================== دیالوگ درباره ====================
        if (showAboutDialog) {
            AlertDialog(
                onDismissRequest = { showAboutDialog = false },
                title = { Text("📱 English Teacher", fontWeight = FontWeight.Bold) },
                text = {
                    Column {
                        Text("نسخه ۱.۰", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "اپلیکیشن یادگیری زبان انگلیسی شامل:\n" +
                                    "• درس‌های Top Notch\n" +
                                    "• کتاب داستان\n" +
                                    "• گرامر و کوییز\n" +
                                    "• تمرین گفتار\n" +
                                    "• معلم هوشمند AI\n" +
                                    "• تنظیمات صوت پیشرفته",
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

// ==================== کامپوننت‌ها ====================

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
                    Text(
                        "تست صدا",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
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
                    Text(
                        "تست صدا",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
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