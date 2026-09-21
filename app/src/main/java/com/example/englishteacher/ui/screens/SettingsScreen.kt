package com.example.englishteacher.ui.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Key
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    var apiKey by remember {
        mutableStateOf(prefs.getString("groq_api_key", "") ?: "")
    }
    var showApiDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }
    var showClearDialog by remember { mutableStateOf(false) }

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

            SettingsSection(title = "هوش مصنوعی (AI)")

            SettingsItem(
                icon = Icons.Filled.Key,
                title = "کلید API گروک",
                subtitle = if (apiKey.isEmpty()) "تنظیم نشده — برای استفاده از AI وارد کنید"
                else "تنظیم شده ✓",
                subtitleColor = if (apiKey.isEmpty()) Color(0xFFD32F2F) else Color(0xFF2E7D32),
                onClick = { showApiDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            SettingsSection(title = "داده‌ها")

            SettingsItem(
                icon = Icons.Filled.Delete,
                title = "پاک کردن پیشرفت",
                subtitle = "تمام پیشرفت مطالعه و داستان‌های خوانده‌شده پاک می‌شود",
                subtitleColor = Color.Gray,
                onClick = { showClearDialog = true }
            )

            Spacer(Modifier.height(20.dp))

            SettingsSection(title = "درباره")

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
                Text(
                    "ساخته شده با ❤️ برای یادگیری انگلیسی",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
        }

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

        if (showClearDialog) {
            AlertDialog(
                onDismissRequest = { showClearDialog = false },
                title = { Text("⚠️ پاک کردن پیشرفت", fontWeight = FontWeight.Bold) },
                text = { Text("آیا مطمئن هستید؟ این کار قابل بازگشت نیست.") },
                confirmButton = {
                    TextButton(onClick = {
                        prefs.edit().clear().apply()
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

@Composable
private fun SettingsSection(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(4.dp, 18.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(Color(0xFF37474F))
        )
        Spacer(Modifier.width(8.dp))
        Text(
            title,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF37474F)
        )
    }
}

@Composable
private fun SettingsItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
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
                    .size(42.dp)
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
                    color = subtitleColor
                )
            }
        }
    }
}