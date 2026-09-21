package com.example.englishteacher.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// ==================== رنگ‌بندی روشن ====================
private val LightColors = lightColorScheme(
    primary = Color(0xFF1A237E),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE8EAF6),
    onPrimaryContainer = Color(0xFF1A237E),

    secondary = Color(0xFFE91E63),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFFCE4EC),
    onSecondaryContainer = Color(0xFFAD1457),

    tertiary = Color(0xFFEF6C00),
    onTertiary = Color.White,

    background = Color(0xFFF5F7FA),
    onBackground = Color(0xFF1A1A1A),

    surface = Color.White,
    onSurface = Color(0xFF1A1A1A),
    surfaceVariant = Color(0xFFF5F5F5),
    onSurfaceVariant = Color(0xFF616161),

    error = Color(0xFFD32F2F),
    onError = Color.White,

    outline = Color(0xFFBDBDBD)
)

// ==================== رنگ‌بندی تاریک ====================
private val DarkColors = darkColorScheme(
    primary = Color(0xFF9FA8DA),
    onPrimary = Color(0xFF1A237E),
    primaryContainer = Color(0xFF3949AB),
    onPrimaryContainer = Color(0xFFE8EAF6),

    secondary = Color(0xFFF48FB1),
    onSecondary = Color(0xFF880E4F),
    secondaryContainer = Color(0xFFAD1457),
    onSecondaryContainer = Color(0xFFFCE4EC),

    tertiary = Color(0xFFFFB74D),
    onTertiary = Color(0xFF4E342E),

    background = Color(0xFF121212),
    onBackground = Color(0xFFE0E0E0),

    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFE0E0E0),
    surfaceVariant = Color(0xFF2A2A2A),
    onSurfaceVariant = Color(0xFFB0B0B0),

    error = Color(0xFFEF5350),
    onError = Color.White,

    outline = Color(0xFF616161)
)

@Composable
fun EnglishTeacherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}