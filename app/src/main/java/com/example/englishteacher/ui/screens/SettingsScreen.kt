package com.example.englishteacher.ui.screens

import android.Manifest
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.NotificationHelper
import com.example.englishteacher.NotificationScheduler
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
    var darkMode by remember { mutableStateOf(false) }
    var wordsPerDay by remember { mutableIntStateOf(10) }
    var apiKey by remember { mutableStateOf("") }
    var totalStars by remember { mutableIntStateOf(0) }
    var notificationsEnabled by remember { mutableStateOf(false) }
    var notificationHour by remember { mutableIntStateOf(20) }
    var notificationMinute by remember { mutableIntStateOf(0) }

    var showResetDialog by remember { mutableStateOf(false) }
    var showApiDialog by remember { mutableStateOf(false) }
    var showTimeDialog by remember { mutableStateOf(false) }
    var tempApiKey by remember { mutableStateOf("") }

    // Permission Launcher
    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            notificationsEnabled = true
            scope.launch {
                SettingsManager.setNotificationsEnabled(context, true)
                NotificationScheduler.scheduleDailyNotification(context, notificationHour, notificationMinute)
            }
        }
    }

    LaunchedEffect(Unit) {
        NotificationHelper.createNotificationChannel(context)
        SettingsManager.getTextScale(context).collectLatest { textScale = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getTtsSpeed(context).collectLatest { ttsSpeed = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getDarkMode(context).collectLatest { darkMode = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getWordsPerDay(context).collectLatest { wordsPerDay = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getApiKey(context).collectLatest { apiKey = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getTotalStars(context).collectLatest { totalStars = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getNotificationsEnabled(context).collectLatest { notificationsEnabled = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getNotificationHour(context).collectLatest { notificationHour = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getNotificationMinute(context).collectLatest { notificationMinute = it }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("تنظیمات", fontWeight = FontWeight.Bold, color = Color.White)
                        Text(
                            "شخصی‌سازی اپلیکیشن",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1A237E))
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            // ==================== کارت امتیاز ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0xFFFFA726), Color(0xFFFFD54F))
                            )
                        )
                        .padding(20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.3f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(32.dp)
                            )
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(
                                "امتیاز کل شما",
                                fontSize = 13.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                            Text(
                                "$totalStars ⭐",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // ==================== ظاهر ====================
            SectionTitle("🎨 ظاهر و نمایش")

            SettingsSliderCard(
                icon = Icons.Filled.TextFields,
                iconColor = Color(0xFF1A237E),
                title = "اندازه متن",
                subtitle = when {
                    textScale < 0.9f -> "کوچک"
                    textScale < 1.1f -> "معمولی"
                    textScale < 1.3f -> "بزرگ"
                    else -> "خیلی بزرگ"
                },
                value = textScale,
                valueRange = 0.8f..1.5f,
                steps = 6,
                onValueChange = { newValue ->
                    textScale = newValue
                    scope.launch { SettingsManager.setTextScale(context, newValue) }
                }
            )

            SettingsSwitchCard(
                icon = Icons.Filled.DarkMode,
                iconColor = Color(0xFF4527A0),
                title = "حالت شب",
                subtitle = if (darkMode) "فعال" else "غیرفعال",
                checked = darkMode,
                onCheckedChange = { enabled ->
                    darkMode = enabled
                    scope.launch { SettingsManager.setDarkMode(context, enabled) }
                }
            )

            Spacer(Modifier.height(8.dp))

            // ==================== صدا ====================
            SectionTitle("🔊 صدا و تلفظ")

            SettingsSliderCard(
                icon = Icons.AutoMirrored.Filled.VolumeUp,
                iconColor = Color(0xFF00695C),
                title = "سرعت تلفظ کلمات",
                subtitle = when {
                    ttsSpeed < 0.7f -> "خیلی کند"
                    ttsSpeed < 0.95f -> "کند (پیشنهادی)"
                    ttsSpeed < 1.15f -> "معمولی"
                    else -> "سریع"
                },
                value = ttsSpeed,
                valueRange = 0.5f..1.5f,
                steps = 9,
                onValueChange = { newValue ->
                    ttsSpeed = newValue
                    scope.launch { SettingsManager.setTtsSpeed(context, newValue) }
                }
            )

            Spacer(Modifier.height(8.dp))

            // ==================== اعلان ====================
            SectionTitle("🔔 اعلان‌ها")

            SettingsSwitchCard(
                icon = Icons.Filled.Notifications,
                iconColor = Color(0xFFE91E63),
                title = "اعلان روزانه",
                subtitle = if (notificationsEnabled)
                    "فعال - ساعت ${String.format("%02d:%02d", notificationHour, notificationMinute)}"
                else "غیرفعال",
                checked = notificationsEnabled,
                onCheckedChange = { enabled ->
                    if (enabled) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                            permissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                        } else {
                            notificationsEnabled = true
                            scope.launch {
                                SettingsManager.setNotificationsEnabled(context, true)
                                NotificationScheduler.scheduleDailyNotification(context, notificationHour, notificationMinute)
                            }
                        }
                    } else {
                        notificationsEnabled = false
                        scope.launch {
                            SettingsManager.setNotificationsEnabled(context, false)
                            NotificationScheduler.cancelDailyNotification(context)
                        }
                    }
                }
            )

            if (notificationsEnabled) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { showTimeDialog = true },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFE91E63).copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Filled.Schedule, contentDescription = null, tint = Color(0xFFE91E63))
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "ساعت یادآوری",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                            Text(
                                String.format("%02d:%02d", notificationHour, notificationMinute),
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                        Icon(Icons.Filled.ChevronLeft, contentDescription = null, tint = Color.Gray)
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // ==================== یادگیری ====================
            SectionTitle("📚 یادگیری")

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF1A237E).copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Filled.Translate, contentDescription = null, tint = Color(0xFF1A237E))
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "تعداد کلمات روزانه",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                            Text("هدف یادگیری روزانه", fontSize = 12.sp, color = Color.Gray)
                        }
                        Text(
                            "$wordsPerDay",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        listOf(5, 10, 15, 20, 30).forEach { count ->
                            FilterChip(
                                selected = wordsPerDay == count,
                                onClick = {
                                    wordsPerDay = count
                                    scope.launch { SettingsManager.setWordsPerDay(context, count) }
                                },
                                label = { Text("$count", fontSize = 12.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = Color(0xFF1A237E),
                                    selectedLabelColor = Color.White
                                ),
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // ==================== هوش مصنوعی ====================
            SectionTitle("🤖 هوش مصنوعی")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        tempApiKey = apiKey
                        showApiDialog = true
                    },
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF00838F).copy(alpha = 0.1f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Key, contentDescription = null, tint = Color(0xFF00838F))
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "کلید API هوش مصنوعی",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Text(
                            if (apiKey.isEmpty()) "تنظیم نشده" else "✓ تنظیم شده",
                            fontSize = 12.sp,
                            color = if (apiKey.isEmpty()) Color(0xFFD32F2F) else Color(0xFF43A047)
                        )
                    }
                    Icon(Icons.Filled.ChevronLeft, contentDescription = null, tint = Color.Gray)
                }
            }

            Spacer(Modifier.height(8.dp))

            // ==================== مدیریت داده ====================
            SectionTitle("⚠️ مدیریت داده")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showResetDialog = true },
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFEBEE)),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFD32F2F).copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Delete, contentDescription = null, tint = Color(0xFFD32F2F))
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "ریست کردن پیشرفت",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFD32F2F)
                        )
                        Text("تمام پیشرفت و امتیازات پاک می‌شود", fontSize = 12.sp, color = Color.Gray)
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            // ==================== درباره ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Info, contentDescription = null, tint = Color(0xFF1A237E))
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "درباره اپلیکیشن",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    Text("English Teacher", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                    Text("نسخه ۱.۰", fontSize = 12.sp, color = Color.Gray)
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "اپلیکیشن جامع آموزش زبان انگلیسی\n۳۴ درس، ۳ سطح، بانک لغات، کتاب داستان، گرامر، پادکست و AI",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        lineHeight = 18.sp
                    )
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }

    // ==================== دیالوگ ریست ====================
    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            icon = { Icon(Icons.Filled.Warning, contentDescription = null, tint = Color(0xFFD32F2F)) },
            title = { Text("ریست کردن پیشرفت؟") },
            text = { Text("آیا مطمئن هستی؟ تمام پیشرفت، امتیازات و نمرات کوییز پاک می‌شود.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch { ProgressManager.resetProgress(context) }
                        showResetDialog = false
                    }
                ) {
                    Text("بله، ریست کن", color = Color(0xFFD32F2F), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetDialog = false }) { Text("لغو") }
            }
        )
    }

    // ==================== دیالوگ API ====================
    if (showApiDialog) {
        AlertDialog(
            onDismissRequest = { showApiDialog = false },
            title = { Text("کلید API هوش مصنوعی") },
            text = {
                Column {
                    Text("کلید API خود را از Groq دریافت کنید (رایگان):", fontSize = 13.sp, color = Color.Gray)
                    Spacer(Modifier.height(12.dp))
                    OutlinedTextField(
                        value = tempApiKey,
                        onValueChange = { tempApiKey = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = { Text("gsk_...") },
                        label = { Text("کلید API") },
                        shape = RoundedCornerShape(12.dp),
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Spacer(Modifier.height(8.dp))
                    Text("console.groq.com", fontSize = 11.sp, color = Color(0xFF00838F), fontWeight = FontWeight.SemiBold)
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch { SettingsManager.setApiKey(context, tempApiKey.trim()) }
                        showApiDialog = false
                    }
                ) {
                    Text("ذخیره", color = Color(0xFF1A237E), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showApiDialog = false }) { Text("لغو") }
            }
        )
    }

    // ==================== دیالوگ ساعت ====================
    if (showTimeDialog) {
        val hours = (0..23).toList()
        AlertDialog(
            onDismissRequest = { showTimeDialog = false },
            title = { Text("ساعت یادآوری") },
            text = {
                Column(
                    modifier = Modifier.height(300.dp)
                ) {
                    Text("ساعت مناسب برای یادآوری روزانه:", fontSize = 13.sp, color = Color.Gray)
                    Spacer(Modifier.height(12.dp))
                    androidx.compose.foundation.lazy.LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        androidx.compose.foundation.lazy.items(hours) { h ->
                            val isSelected = notificationHour == h
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        notificationHour = h
                                        scope.launch {
                                            SettingsManager.setNotificationHour(context, h)
                                            if (notificationsEnabled) {
                                                NotificationScheduler.cancelDailyNotification(context)
                                                NotificationScheduler.scheduleDailyNotification(context, h, notificationMinute)
                                            }
                                        }
                                    },
                                colors = CardDefaults.cardColors(
                                    containerColor = if (isSelected) Color(0xFFE91E63).copy(alpha = 0.15f)
                                    else Color.White
                                ),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth().padding(12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = {
                                            notificationHour = h
                                            scope.launch {
                                                SettingsManager.setNotificationHour(context, h)
                                                if (notificationsEnabled) {
                                                    NotificationScheduler.cancelDailyNotification(context)
                                                    NotificationScheduler.scheduleDailyNotification(context, h, notificationMinute)
                                                }
                                            }
                                        },
                                        colors = RadioButtonDefaults.colors(selectedColor = Color(0xFFE91E63))
                                    )
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        String.format("%02d:00", h),
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                                    )
                                }
                            }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showTimeDialog = false }) {
                    Text("تأیید", color = Color(0xFF1A237E), fontWeight = FontWeight.Bold)
                }
            }
        )
    }
}

// ==================== عنوان بخش ====================
@Composable
private fun SectionTitle(text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(4.dp, 20.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(Color(0xFF1A237E))
        )
        Spacer(Modifier.width(10.dp))
        Text(text, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
    }
}

@Composable
private fun SettingsSliderCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    subtitle: String,
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    steps: Int,
    onValueChange: (Float) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(iconColor.copy(alpha = 0.1f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(icon, contentDescription = null, tint = iconColor)
                }
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(title, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                    Text(subtitle, fontSize = 12.sp, color = Color.Gray)
                }
            }
            Spacer(Modifier.height(12.dp))
            Slider(
                value = value,
                onValueChange = onValueChange,
                valueRange = valueRange,
                steps = steps,
                colors = SliderDefaults.colors(thumbColor = iconColor, activeTrackColor = iconColor)
            )
        }
    }
}

@Composable
private fun SettingsSwitchCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(iconColor.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, contentDescription = null, tint = iconColor)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(title, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                Text(subtitle, fontSize = 12.sp, color = Color.Gray)
            }
            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    checkedTrackColor = iconColor
                )
            )
        }
    }
}