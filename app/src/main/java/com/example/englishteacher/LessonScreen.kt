package com.example.englishteacher

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LessonScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Lesson 1",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Hello = سلام"
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Good morning = صبح بخیر"
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "How are you? = حالت چطوره؟"
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                // پخش صدای کلمه را بعداً اضافه می‌کنیم
            }
        ) {
            Text("🔊 شنیدن تلفظ")
        }
    }
}
