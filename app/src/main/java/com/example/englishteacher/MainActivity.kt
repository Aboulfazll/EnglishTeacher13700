package com.example.englishteacher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EnglishTeacherApp()
        }
    }
}

@Composable
fun EnglishTeacherApp() {

    var message by remember {
        mutableStateOf("به English Teacher خوش آمدی! 🎓")
    }

    MaterialTheme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "English Teacher",
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = message
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {
                    message = "درس اول آماده است! 📚"
                }
            ) {
                Text("📚 شروع درس")
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    message = "بخش مکالمه به‌زودی فعال می‌شود! 🗣️"
                }
            ) {
                Text("🗣️ مکالمه")
            }
        }
    }
}
