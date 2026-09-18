package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.Level

@Composable
fun HomeScreen(onLevelClick: (Level) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FA))
            .verticalScroll(rememberScrollState())
    ) {

        // 🎨 بنر بالای صفحه با عکس آنلاین
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            // عکس از اینترنت (Coil)
            AsyncImage(
                model = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=800",
                contentDescription = "Banner",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            // گرادیانت تیره روی عکس برای خوانایی متن
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF1A237E).copy(alpha = 0.3f),
                                Color(0xFF1A237E).copy(alpha = 0.9f)
                            )
                        )
                    )
            )

            // متن روی بنر
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(24.dp)
            ) {
                Text(
                    text = "English Teacher",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Learn English, Build Your Future",
                    fontSize = 14.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }

        // بخش انتخاب سطح
        Column(modifier = Modifier.padding(20.dp)) {
            Spacer(Modifier.height(10.dp))

            Text(
                text = "سطح خود را انتخاب کنید:",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1A237E)
            )

            Spacer(Modifier.height(20.dp))

            LevelCard(
                title = "مبتدی",
                subtitle = "Top Notch 1 - سطح A1",
                gradient = listOf(Color(0xFF43A047), Color(0xFF66BB6A))
            ) { onLevelClick(Level.BEGINNER) }

            Spacer(Modifier.height(16.dp))

            LevelCard(
                title = "متوسط",
                subtitle = "Top Notch 2 - سطح A2",
                gradient = listOf(Color(0xFF7B1FA2), Color(0xFF9C27B0))
            ) { onLevelClick(Level.INTERMEDIATE) }

            Spacer(Modifier.height(16.dp))

            LevelCard(
                title = "پیشرفته",
                subtitle = "Top Notch 3 - سطح B1",
                gradient = listOf(Color(0xFFE65100), Color(0xFFF57C00))
            ) { onLevelClick(Level.ADVANCED) }

            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
private fun LevelCard(
    title: String,
    subtitle: String,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.horizontalGradient(gradient))
                .padding(20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.School,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(Modifier.width(16.dp))
                Column {
                    Text(
                        text = title,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = subtitle,
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                    Spacer(Modifier.height(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = null,
                            tint = Color(0xFFFFD54F),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            text = "شروع یادگیری",
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}