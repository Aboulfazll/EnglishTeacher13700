package com.example.englishteacher.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.ProgressManager
import kotlinx.coroutines.flow.collectLatest

@Composable
fun HomeScreen(
    onLevelClick: (Level) -> Unit,
    onGrammarClick: () -> Unit = {},
    onStoryBookClick: () -> Unit = {},
    onVocabularyBankClick: () -> Unit = {},
    onLevelTestClick: () -> Unit = {},
    onBookmarkedWordsClick: () -> Unit = {},
    onDailySentencesClick: () -> Unit = {},
    onBookmarkedStoriesClick: () -> Unit = {},
    onAchievementsClick: () -> Unit = {},
    onSpeakingClick: () -> Unit = {},
    onAiChatClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    val context = LocalContext.current

    var completedCount by remember { mutableIntStateOf(0) }
    var totalStars by remember { mutableIntStateOf(0) }
    var streak by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        ProgressManager.getCompletedLessons(context).collectLatest { completedCount = it.size }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getTotalStars(context).collectLatest { totalStars = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getStreak(context).collectLatest { streak = it }
    }

    // انیمیشن ورود
    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        visible = true
    }
    val headerAlpha by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        animationSpec = tween(600),
        label = "headerAlpha"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7FA))
            .verticalScroll(rememberScrollState())
    ) {

        // ==================== هدر پیشرفته ====================
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            AsyncImage(
                model = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=800",
                contentDescription = "Banner",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF1A237E).copy(alpha = 0.3f),
                                Color(0xFF0D1B5E).copy(alpha = 0.98f)
                            )
                        )
                    )
            )

            // دکمه تنظیمات بالا سمت راست
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    onClick = onSettingsClick,
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.2f))
                ) {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Settings",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(24.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(
                                Brush.linearGradient(
                                    listOf(Color(0xFFFFD54F), Color(0xFFFFA726))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.School,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "خوش برگشتی! 👋",
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                        Text(
                            text = "English Teacher",
                            fontSize = 26.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
                Spacer(Modifier.height(8.dp))
                Text(
                    text = "Learn English, Build Your Future",
                    fontSize = 13.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }

        Column(modifier = Modifier.padding(16.dp)) {

            // ==================== نوار آمار سریع ====================
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-30).dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                QuickStatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.LocalFireDepartment,
                    value = "$streak",
                    label = "روز",
                    color = Color(0xFFF12711),
                    gradient = listOf(Color(0xFFF12711), Color(0xFFF5AF19))
                )
                QuickStatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Star,
                    value = "$totalStars",
                    label = "امتیاز",
                    color = Color(0xFFFFA000),
                    gradient = listOf(Color(0xFFFFA000), Color(0xFFFFD54F))
                )
                QuickStatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.School,
                    value = "$completedCount",
                    label = "درس",
                    color = Color(0xFF11998E),
                    gradient = listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                )
            }

            Spacer(Modifier.height(4.dp))

            // ==================== کارت AI معلم هوشمند ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .clickable { onAiChatClick() },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                listOf(
                                    Color(0xFF1E88E5),
                                    Color(0xFF42A5F5),
                                    Color(0xFF64B5F6)
                                )
                            )
                        )
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(58.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🤖", fontSize = 30.sp)
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "معلم هوشمند",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Spacer(Modifier.width(6.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(6.dp))
                                        .background(Color.White.copy(alpha = 0.3f))
                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Text(
                                        "AI",
                                        fontSize = 9.sp,
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                            Text(
                                "هر سوالی داری بپرس",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(14.dp))

            // ==================== تست تعیین سطح + دستاوردها ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // تست تعیین سطح
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(130.dp)
                        .clickable { onLevelTestClick() },
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC))
                                )
                            )
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(46.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.25f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Filled.Quiz,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            Column {
                                Text(
                                    "تست سطح",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    "سطحت رو بسنج",
                                    fontSize = 10.sp,
                                    color = Color.White.copy(alpha = 0.9f)
                                )
                            }
                        }
                    }
                }

                // دستاوردها
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(130.dp)
                        .clickable { onAchievementsClick() },
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    listOf(Color(0xFFFFA000), Color(0xFFFFD54F))
                                )
                            )
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(46.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.3f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("🏆", fontSize = 24.sp)
                            }
                            Column {
                                Text(
                                    "دستاوردها",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    "مدال‌های تو",
                                    fontSize = 10.sp,
                                    color = Color.White.copy(alpha = 0.95f)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(14.dp))

            // ==================== تمرین گفتار ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(115.dp)
                    .clickable { onSpeakingClick() },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                listOf(
                                    Color(0xFF7B1FA2),
                                    Color(0xFFAB47BC),
                                    Color(0xFFBA68C8)
                                )
                            )
                        )
                        .padding(18.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.28f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Mic,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(34.dp)
                            )
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    "🎤 تمرین گفتار",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Spacer(Modifier.width(6.dp))
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(6.dp))
                                        .background(Color.White.copy(alpha = 0.3f))
                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Text(
                                        "جدید",
                                        fontSize = 9.sp,
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                            Text(
                                "با میکروفن تلفظت رو بسنج",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                "✨ ۲۵۰+ جمله در ۲ سطح",
                                fontSize = 10.sp,
                                color = Color.White.copy(alpha = 0.85f),
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "→",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // ==================== عنوان سطوح ====================
            SectionHeader(
                emoji = "📚",
                title = "سطح خود را انتخاب کنید",
                accent = Color(0xFF1A237E)
            )

            LevelCard(
                emoji = "🌱",
                title = "مبتدی",
                subtitle = "Top Notch Fundamentals",
                lessonCount = "۱۴ درس",
                gradient = listOf(Color(0xFF11998E), Color(0xFF38EF7D))
            ) { onLevelClick(Level.BEGINNER) }

            Spacer(Modifier.height(12.dp))

            LevelCard(
                emoji = "🚀",
                title = "متوسط",
                subtitle = "Top Notch 1",
                lessonCount = "۱۰ درس",
                gradient = listOf(Color(0xFF8E2DE2), Color(0xFFB621FE))
            ) { onLevelClick(Level.INTERMEDIATE) }

            Spacer(Modifier.height(12.dp))

            LevelCard(
                emoji = "🏆",
                title = "پیشرفته",
                subtitle = "Top Notch 2",
                lessonCount = "۱۰ درس",
                gradient = listOf(Color(0xFFF12711), Color(0xFFF5AF19))
            ) { onLevelClick(Level.ADVANCED) }

            Spacer(Modifier.height(24.dp))

            // ==================== بخش ویژه ====================
            SectionHeader(
                emoji = "✨",
                title = "بخش‌های ویژه",
                accent = Color(0xFFE91E63)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                SpecialCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.AutoMirrored.Filled.MenuBook,
                    title = "کتاب داستان",
                    gradient = listOf(Color(0xFFE91E63), Color(0xFFF06292))
                ) { onStoryBookClick() }

                SpecialCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.School,
                    title = "گرامر",
                    gradient = listOf(Color(0xFF00ACC1), Color(0xFF26C6DA))
                ) { onGrammarClick() }

                SpecialCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.LibraryBooks,
                    title = "لغات",
                    gradient = listOf(Color(0xFF00695C), Color(0xFF26A69A))
                ) { onVocabularyBankClick() }
            }

            Spacer(Modifier.height(14.dp))

            // ==================== بخش کتابخانه من ====================
            SectionHeader(
                emoji = "🔖",
                title = "کتابخانه من",
                accent = Color(0xFF00897B)
            )

            // داستان‌های ذخیره‌شده
            LibraryItem(
                icon = Icons.Filled.Bookmark,
                title = "داستان‌های ذخیره‌شده",
                subtitle = "داستان‌هایی که نشان کردی",
                gradient = listOf(Color(0xFFAD1457), Color(0xFFE91E63)),
                onClick = onBookmarkedStoriesClick
            )

            Spacer(Modifier.height(10.dp))

            LibraryItem(
                icon = Icons.Filled.Bookmark,
                title = "لغات ذخیره‌شده",
                subtitle = "کلمات مهمی که ذخیره کردی",
                gradient = listOf(Color(0xFFFFA000), Color(0xFFFFC107)),
                onClick = onBookmarkedWordsClick
            )

            Spacer(Modifier.height(10.dp))

            LibraryItem(
                icon = Icons.Filled.ChatBubble,
                title = "جملات روزمره",
                subtitle = "۲۰۰+ جمله پرکاربرد با تلفظ",
                gradient = listOf(Color(0xFF00897B), Color(0xFF26A69A)),
                onClick = onDailySentencesClick
            )

            Spacer(Modifier.height(30.dp))

            // فوتر
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "ساخته شده با ❤️ برای یادگیری انگلیسی",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}

// ==================== کارت آمار سریع ====================
@Composable
private fun QuickStatCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    value: String,
    label: String,
    color: Color,
    gradient: List<Color>
) {
    Card(
        modifier = modifier.height(85.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(gradient)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(22.dp)
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    value,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    label,
                    fontSize = 10.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }
    }
}

// ==================== هدر بخش ====================
@Composable
private fun SectionHeader(
    emoji: String,
    title: String,
    accent: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 14.dp)
    ) {
        Box(
            modifier = Modifier
                .size(4.dp, 22.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(accent)
        )
        Spacer(Modifier.width(10.dp))
        Text(
            text = "$emoji $title",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
    }
}

// ==================== کارت سطح ====================
@Composable
private fun LevelCard(
    emoji: String,
    title: String,
    subtitle: String,
    lessonCount: String,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(115.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(22.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.horizontalGradient(gradient))
                .padding(18.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(58.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(emoji, fontSize = 28.sp)
                }

                Spacer(Modifier.width(14.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = subtitle,
                        fontSize = 11.sp,
                        color = Color.White.copy(alpha = 0.95f)
                    )
                    Spacer(Modifier.height(6.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.White.copy(alpha = 0.25f))
                                .padding(horizontal = 8.dp, vertical = 2.dp)
                        ) {
                            Text(
                                text = lessonCount,
                                color = Color.White,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Spacer(Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = null,
                            tint = Color(0xFFFFD54F),
                            modifier = Modifier.size(13.dp)
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .size(34.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("→", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

// ==================== کارت ویژه ====================
@Composable
private fun SpecialCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    title: String,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .height(115.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(gradient)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = title,
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = title,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1
                )
            }
        }
    }
}

// ==================== آیتم کتابخانه ====================
@Composable
private fun LibraryItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.horizontalGradient(gradient))
                .padding(14.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        icon,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(
                        title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        subtitle,
                        fontSize = 10.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }
        }
    }
}