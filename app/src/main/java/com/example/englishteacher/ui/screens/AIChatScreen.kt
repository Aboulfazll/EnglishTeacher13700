package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.SmartToy
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.ChatMessage
import com.example.englishteacher.data.GroqClient
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AIChatScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var apiKey by remember { mutableStateOf("") }
    var tempApiKey by remember { mutableStateOf("") }
    var showKeyInput by remember { mutableStateOf(true) }

    var messages = remember { mutableStateListOf<ChatMessage>() }
    var inputText by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    val listState = rememberLazyListState()

    // خواندن کلید ذخیره‌شده
    LaunchedEffect(Unit) {
        SettingsManager.getApiKey(context).collectLatest { savedKey ->
            if (savedKey.isNotEmpty()) {
                apiKey = savedKey
                GroqClient.apiKey = savedKey
                showKeyInput = false
            }
        }
    }

    // پیام خوش‌آمد
    LaunchedEffect(apiKey) {
        if (apiKey.isNotEmpty() && messages.isEmpty()) {
            messages.add(
                ChatMessage(
                    role = "assistant",
                    content = "سلام! 👋 من معلم هوش مصنوعی تو هستم.\nهر سوالی درباره گرامر، لغت یا تلفظ انگلیسی داری بپرس تا کمکت کنم."
                )
            )
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("معلم هوش مصنوعی 🤖", fontWeight = FontWeight.Bold)
                        Text("Groq Llama 3", fontSize = 12.sp, color = Color.White.copy(alpha = 0.8f))
                    }
                },
                actions = {
                    if (!showKeyInput && apiKey.isNotEmpty()) {
                        IconButton(onClick = {
                            showKeyInput = true
                            tempApiKey = apiKey
                        }) {
                            Icon(Icons.Filled.Key, contentDescription = "تغییر کلید", tint = Color.White)
                        }
                    }
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
        ) {

            // اگر کلید وارد نشده
            if (showKeyInput) {
                ApiKeyInputScreen(
                    tempApiKey = tempApiKey,
                    onKeyChange = { tempApiKey = it },
                    onSave = {
                        if (tempApiKey.isNotBlank()) {
                            scope.launch {
                                SettingsManager.setApiKey(context, tempApiKey.trim())
                                apiKey = tempApiKey.trim()
                                GroqClient.apiKey = tempApiKey.trim()
                                showKeyInput = false
                            }
                        }
                    }
                )
            } else {
                // صفحه چت
                ChatContent(
                    messages = messages,
                    inputText = inputText,
                    onInputChange = { inputText = it },
                    isLoading = isLoading,
                    onSend = {
                        val text = inputText.trim()
                        if (text.isEmpty() || isLoading) return@ChatContent

                        messages.add(ChatMessage(role = "user", content = text))
                        inputText = ""
                        isLoading = true

                        scope.launch {
                            try {
                                val history = messages.dropLast(1).drop(1)
                                val reply = GroqClient.askAI(text, history)
                                messages.add(ChatMessage(role = "assistant", content = reply))
                            } catch (e: Exception) {
                                messages.add(
                                    ChatMessage(role = "assistant", content = "خطا: ${e.message}")
                                )
                            } finally {
                                isLoading = false
                                if (messages.isNotEmpty()) {
                                    listState.animateScrollToItem(messages.size - 1)
                                }
                            }
                        }
                    },
                    listState = listState
                )
            }
        }
    }
}

@Composable
private fun ApiKeyInputScreen(
    tempApiKey: String,
    onKeyChange: (String) -> Unit,
    onSave: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            Icons.Filled.SmartToy,
            contentDescription = null,
            tint = Color(0xFF1A237E),
            modifier = Modifier.size(80.dp)
        )
        Spacer(Modifier.height(20.dp))
        Text(
            "معلم هوش مصنوعی",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            "برای استفاده از این قابلیت، کلید API خود را وارد کنید",
            fontSize = 14.sp,
            color = Color.Gray,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
        Spacer(Modifier.height(24.dp))

        OutlinedTextField(
            value = tempApiKey,
            onValueChange = onKeyChange,
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("gsk_...") },
            label = { Text("کلید API Groq") },
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF1A237E),
                focusedLabelColor = Color(0xFF1A237E)
            )
        )

        Spacer(Modifier.height(16.dp))

        Button(
            onClick = onSave,
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E)),
            enabled = tempApiKey.isNotBlank()
        ) {
            Text("ذخیره و شروع", color = Color.White, fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(20.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8EAF6)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    "📌 چطور کلید رایگان بگیرم؟",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "1. برو به console.groq.com\n" +
                    "2. ثبت‌نام رایگان کن\n" +
                    "3. از منوی API Keys کلید بساز\n" +
                    "4. کلید رو اینجا وارد کن",
                    fontSize = 12.sp,
                    color = Color(0xFF424242),
                    lineHeight = 20.sp
                )
            }
        }
    }
}

@Composable
private fun ChatContent(
    messages: List<ChatMessage>,
    inputText: String,
    onInputChange: (String) -> Unit,
    isLoading: Boolean,
    onSend: () -> Unit,
    listState: androidx.compose.foundation.lazy.LazyListState
) {
    Column(modifier = Modifier.fillMaxSize()) {

        LazyColumn(
            state = listState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 12.dp)
        ) {
            items(messages) { msg ->
                MessageBubble(msg)
            }

            if (isLoading) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Card(
                            shape = RoundedCornerShape(16.dp, 16.dp, 16.dp, 4.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8EAF6))
                        ) {
                            Text(
                                "در حال تایپ... ✍️",
                                modifier = Modifier.padding(12.dp),
                                fontSize = 13.sp,
                                color = Color(0xFF1A237E)
                            )
                        }
                    }
                }
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = inputText,
                    onValueChange = onInputChange,
                    modifier = Modifier.weight(1f),
                    placeholder = { Text("سوالت رو بنویس...") },
                    shape = RoundedCornerShape(24.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF1A237E),
                        unfocusedBorderColor = Color.LightGray
                    )
                )

                Spacer(Modifier.width(8.dp))

                IconButton(
                    onClick = onSend,
                    modifier = Modifier
                        .size(48.dp)
                        .background(Color(0xFF1A237E), RoundedCornerShape(50)),
                    enabled = !isLoading
                ) {
                    Icon(
                        Icons.AutoMirrored.Filled.Send,
                        contentDescription = "Send",
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Composable
private fun MessageBubble(message: ChatMessage) {
    val isUser = message.role == "user"

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (isUser) Arrangement.End else Arrangement.Start
    ) {
        Card(
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = if (isUser) 16.dp else 4.dp,
                bottomEnd = if (isUser) 4.dp else 16.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = if (isUser) Color(0xFF1A237E) else Color(0xFFE8EAF6)
            ),
            modifier = Modifier.widthIn(max = 280.dp)
        ) {
            Text(
                text = message.content,
                modifier = Modifier.padding(12.dp),
                fontSize = 14.sp,
                lineHeight = 20.sp,
                color = if (isUser) Color.White else Color.Black
            )
        }
    }
}