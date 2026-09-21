package com.example.englishteacher.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage

/**
 * کامپوننت نمایش کاور با Placeholder و Error
 * - در حال لود: گرادیانت + انیمیشن چرخشی
 * - در صورت خطا: گرادیانت رنگی + ایموجی کتاب
 * - بعد از لود: عکس اصلی
 */
@Composable
fun StoryCover(
    coverUrl: String,
    title: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop
) {
    SubcomposeAsyncImage(
        model = coverUrl,
        contentDescription = title,
        modifier = modifier,
        contentScale = contentScale,
        loading = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(0xFF1A237E),
                                Color(0xFF3949AB),
                                Color(0xFF1A237E)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    color = Color.White.copy(alpha = 0.9f),
                    strokeWidth = 2.5.dp
                )
            }
        },
        error = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(0xFFE91E63),
                                Color(0xFFAD1457),
                                Color(0xFF6A1B9A)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text("📚", fontSize = 48.sp)
            }
        }
    )
}