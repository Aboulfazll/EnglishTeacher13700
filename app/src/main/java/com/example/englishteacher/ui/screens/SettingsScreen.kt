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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.AchievementManager
import com.example.englishteacher.BookmarkManager
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
    var vibrationEnabled by remember { mutableStateOf(true) }
    var soundEffects by remember { mutableStateOf(true) }
    var language by remember { mutableStateOf("fa") }

    var showResetDialog by remember { mutableStateOf(false) }
    var showResetAchievementsDialog by remember { mutableStateOf(false) }
    var showResetBookmarksDialog by remember { mutableStateOf(false) }
    var showApiDialog by remember { mutableStateOf(false) }
    var showTimeDialog by remember { mutableStateOf(false) }
    var tempApiKey by remember { mutableStateOf("") }
    var showAboutDialog by remember { mutableStateOf(false) }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            notificationsEnabled = true
            scope.launch {
                SettingsManager.setNotificationsEnabled(context, true)
                NotificationScheduler.scheduleDailyNotification(context, notificationHour, 0)
            }
        }
    }

    LaunchedEffect(Unit) {
        NotificationHelper.createNotificationChannel(context)
    }
    LaunchedEffect(Unit) {
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
        SettingsManager.getVibration(context).collectLatest { vibrationEnabled = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getSoundEffects(context).collectLatest { soundEffects = it }
    }
    LaunchedEffect(Unit) {
        SettingsManager.getLanguage(context).collectLatest { language = it }
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

            // ==================== ظاهر و نمایش ====================
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

            // ==================== صدا و تلفظ ====================
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

            SettingsSwitchCard(
                icon = Icons.Filled.MusicNote,
                iconColor = Color(0xFF7B1FA2),
                title = "افکت صوتی",
                subtitle = if (soundEffects) "صداهای اپ فعال" else "بی‌صدا",
                checked = soundEffects,
                onCheckedChange = { enabled ->
                    soundEffects = enabled
                    scope.launch { SettingsManager.setSoundEffects(context, enabled) }
                }
            )

            // ==================== لرزش ====================
            SectionTitle("📳 لرزش و بازخورد")

            SettingsSwitchCard(
                icon = Icons.Filled.Vibration,
                iconColor = Color(0xFF00838F),
                title = "لرزش",
                subtitle = if (vibrationEnabled) "در تعاملات فعال" else "غیرفعال",
                checked = vibrationEnabled,
                onCheckedChange = { enabled ->
                    vibrationEnabled = enabled
                    scope.launch { SettingsManager.setVibration(context, enabled) }
                }
            )

            // ==================== اعلان‌ها ====================
            SectionTitle("🔔 اعلان‌ها")

            SettingsSwitchCard(
                icon = Icons.Filled.Notifications,
                iconColor = Color(0xFFE91E63),
                title = "اعلان روزانه",
                subtitle = if (notificationsEnabled)
                    "فعال - ساعت $notificationHour:00"
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
                                NotificationScheduler.scheduleDailyNotification(
                                    context, notificationHour, 0
                                )
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
                            Icon(
                                Icons.Filled.Schedule,
                                contentDescription = null,
                                tint = Color(0xFFE91E63)
                            )
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
                                "${String.format("%02d:00", notificationHour)}",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                        Icon(
                            Icons.Filled.ChevronLeft,
                            contentDescription = null,
                            tint = Color.Gray
                        )
                    }
                }
            }

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
                            Icon(
                                Icons.Filled.Translate,
                                contentDescription = null,
                                tint = Color(0xFF1A237E)
                            )
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "تعداد کلمات روزانه",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                            Text(
                                "هدف یادگیری روزانه",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
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
                                    scope.launch {
                                        SettingsManager.setWordsPerDay(context, count)
                                    }
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

            // ==================== زبان ====================
            SectionTitle("🌐 زبان")

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
                                .background(Color(0xFF00695C).copy(alpha = 0.1f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Language,
                                contentDescription = null,
                                tint = Color(0xFF00695C)
                            )
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "زبان اپلیکیشن",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                            Text(
                                if (language == "fa") "فارسی" else "English",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf(
                            "fa" to "🇮🇷 فارسی",
                            "en" to "🇬🇧 English"
                        ).forEach { (code, label) ->
                            FilterChip(
                                selected = language == code,
                                onClick = {
                                    language = code
                                    scope.launch {
                                        SettingsManager.setLanguage(context, code)
                                    }
                                },
                                label = { Text(label, fontSize = 12.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = Color(0xFF00695C),
                                    selectedLabelColor = Color.White
                                ),
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }

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
                        Icon(
                            Icons.Filled.Key,
                            contentDescription = null,
                            tint = Color(0xFF00838F)
                        )
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
                    Icon(
                        Icons.Filled.ChevronLeft,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                }
            }

            // ==================== مدیریت داده ====================
            SectionTitle("⚠️ مدیریت داده")

            // ریست پیشرفت
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
                        Icon(
                            Icons.Filled.Delete,
                            contentDescription = null,
                            tint = Color(0xFFD32F2F)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "ریست کردن پیشرفت",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
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

            // ریست دستاوردها
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showResetAchievementsDialog = true },
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0)),
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
                            .background(Color(0xFFE65100).copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.EmojiEvents,
                            contentDescription = null,
                            tint = Color(0xFFE65100)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "ریست دستاوردها",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFE65100)
                        )
                        Text(
                            "همه‌ی مدال‌ها پاک می‌شود",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            // پاک کردن بوکمارک‌ها
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showResetBookmarksDialog = true },
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFCE4EC)),
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
                            .background(Color(0xFFC2185B).copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.BookmarkRemove,
                            contentDescription = null,
                            tint = Color(0xFFC2185B)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "پاک کردن بوکمارک‌ها",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFC2185B)
                        )
                        Text(
                            "لغات و داستان‌های ذخیره‌شده پاک می‌شود",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            // ==================== درباره ====================
            SectionTitle("ℹ️ درباره اپلیکیشن")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showAboutDialog = true },
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
                            .background(Color(0xFF1A237E).copy(alpha = 0.1f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.Info,
                            contentDescription = null,
                            tint = Color(0xFF1A237E)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "English Teacher",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Text(
                            "نسخه ۱.۰",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                    Icon(
                        Icons.Filled.ChevronLeft,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(30.dp))

            Text(
                "ساخته شده با ❤️ برای یادگیری بهتر",
                fontSize = 11.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(Modifier.height(20.dp))
        }
    }

    // ==================== دیالوگ‌ها ====================

    // ریست پیشرفت
    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            icon = {
                Icon(
                    Icons.Filled.Warning,
                    contentDescription = null,
                    tint = Color(0xFFD32F2F)
                )
            },
            title = { Text("ریست کردن پیشرفت؟") },
            text = {
                Text("آیا مطمئن هستی؟ تمام پیشرفت، امتیازات و نمرات کوییز پاک می‌شود.")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch { ProgressManager.resetProgress(context) }
                        showResetDialog = false
                    }
                ) {
                    Text(
                        "بله، ریست کن",
                        color = Color(0xFFD32F2F),
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetDialog = false }) { Text("لغو") }
            }
        )
    }

    // ریست دستاوردها
    if (showResetAchievementsDialog) {
        AlertDialog(
            onDismissRequest = { showResetAchievementsDialog = false },
            icon = {
                Icon(
                    Icons.Filled.EmojiEvents,
                    contentDescription = null,
                    tint = Color(0xFFE65100)
                )
            },
            title = { Text("ریست دستاوردها؟") },
            text = { Text("همه‌ی مدال‌ها و دستاوردهای باز شده پاک می‌شود.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch { AchievementManager.resetAll(context) }
                        showResetAchievementsDialog = false
                    }
                ) {
                    Text(
                        "بله، ریست کن",
                        color = Color(0xFFE65100),
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetAchievementsDialog = false }) { Text("لغو") }
            }
        )
    }

    // پاک کردن بوکمارک‌ها
    if (showResetBookmarksDialog) {
        AlertDialog(
            onDismissRequest = { showResetBookmarksDialog = false },
            icon = {
                Icon(
                    Icons.Filled.BookmarkRemove,
                    contentDescription = null,
                    tint = Color(0xFFC2185B)
                )
            },
            title = { Text("پاک کردن بوکمارک‌ها؟") },
            text = { Text("تمام لغات و داستان‌های ذخیره‌شده پاک می‌شود.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch {
                            BookmarkManager.clearAll(context)
                            BookmarkManager.clearAllStories(context)
                        }
                        showResetBookmarksDialog = false
                    }
                ) {
                    Text(
                        "بله، پاک کن",
                        color = Color(0xFFC2185B),
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetBookmarksDialog = false }) { Text("لغو") }
            }
        )
    }

    // API
    if (showApiDialog) {
        AlertDialog(
            onDismissRequest = { showApiDialog = false },
            title = { Text("کلید API هوش مصنوعی") },
            text = {
                Column {
                    Text(
                        "کلید API خود را از Groq دریافت کنید (رایگان):",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
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
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        scope.launch {
                            SettingsManager.setApiKey(context, tempApiKey.trim())
                        }
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

    // ساعت
    if (showTimeDialog) {
        val hours = (0..23).toList()
        var tempHour by remember { mutableIntStateOf(notificationHour) }
        AlertDialog(
            onDismissRequest = { showTimeDialog = false },
            title = { Text("ساعت یادآوری") },
            text = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 300.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    hours.forEach { h ->
                        val isSelected = tempHour == h
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { tempHour = h }
                                .padding(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = isSelected,
                                onClick = { tempHour = h },
                                colors = RadioButtonDefaults.colors(
                                    selectedColor = Color(0xFFE91E63)
                                )
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                String.format("%02d:00", h),
                                fontWeight = if (isSelected) FontWeight.Bold
                                else FontWeight.Normal
                            )
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = {
                    notificationHour = tempHour
                    scope.launch {
                        SettingsManager.setNotificationHour(context, tempHour)
                        if (notificationsEnabled) {
                            NotificationScheduler.cancelDailyNotification(context)
                            NotificationScheduler.scheduleDailyNotification(
                                context, tempHour, 0
                            )
                        }
                    }
                    showTimeDialog = false
                }) {
                    Text("تأیید", color = Color(0xFF1A237E), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showTimeDialog = false }) { Text("لغو") }
            }
        )
    }

    // درباره
    if (showAboutDialog) {
        AlertDialog(
            onDismissRequest = { showAboutDialog = false },
            icon = {
                Text("🎓", fontSize = 48.sp)
            },
            title = {
                Text(
                    "English Teacher",
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Column {
                    Text(
                        "اپلیکیشن یادگیری زبان انگلیسی با محتوای فارسی",
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(Modifier.height(16.dp))
                    InfoRow("📖", "۳۴ درس در ۳ سطح")
                    InfoRow("📚", "۱۰۰ داستان")
                    InfoRow("📝", "۶۰ موضوع گرامری")
                    InfoRow("💬", "۲۰۰+ جمله روزمره")
                    InfoRow("🎴", "فلش‌کارت پیشرفته")
                    InfoRow("🏆", "۲۷ دستاورد")
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "نسخه ۱.۰",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                TextButton(onClick = { showAboutDialog = false }) {
                    Text("بستن", color = Color(0xFF1A237E), fontWeight = FontWeight.Bold)
                }
            }
        )
    }
}

// ==================== کامپوننت‌های کمکی ====================

@Composable
private fun InfoRow(emoji: String, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(emoji, fontSize = 16.sp)
        Spacer(Modifier.width(10.dp))
        Text(text, fontSize = 13.sp, color = Color(0xFF1A237E))
    }
}

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
        Text(
            text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
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
                    Text(
                        title,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(subtitle, fontSize = 12.sp, color = Color.Gray)
                }
            }
            Spacer(Modifier.height(12.dp))
            Slider(
                value = value,
                onValueChange = onValueChange,
                valueRange = valueRange,
                steps = steps,
                colors = SliderDefaults.colors(
                    thumbColor = iconColor,
                    activeTrackColor = iconColor
                )
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
                Text(
                    title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
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