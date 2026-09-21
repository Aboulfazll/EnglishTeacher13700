package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.Level

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
    onSettingsClick: () -> Unit = {},
    onProfileClick: () -> Unit = {},
    onPodcastClick: () -> Unit = {},
    onDailyQuizClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7FA))
            .verticalScroll(rememberScrollState())
    ) {

        // ==================== هدر ====================
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
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

            // دکمه‌های بالا هدر
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .align(Alignment.TopCenter),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // پروفایل - چپ
                IconButton(
                    onClick = onProfileClick,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f))
                ) {
                    Text("👤", fontSize = 24.sp)
                }

                // تنظیمات - راست
                IconButton(
                    onClick = onSettingsClick,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f))
                ) {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "تنظیمات",
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
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

            // ==================== کارت AI ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(85.dp)
                    .clickable { onAiChatClick() },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0xFF1E88E5), Color(0xFF42A5F5))
                            )
                        )
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(52.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🤖", fontSize = 28.sp)
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "معلم هوشمند",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "هر سوالی داری بپرس",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                        Text("→", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(Modifier.height(14.dp))

            // ==================== تست سطح + دستاوردها ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "🎯",
                    title = "تست تعیین سطح",
                    subtitle = "سطح خودت رو بسنج",
                    gradient = listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC)),
                    onClick = onLevelTestClick
                )
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "🏆",
                    title = "دستاوردها",
                    subtitle = "مدال‌های خودت",
                    gradient = listOf(Color(0xFFFFA000), Color(0xFFFFD54F)),
                    onClick = onAchievementsClick
                )
            }

            Spacer(Modifier.height(14.dp))

            // ==================== تمرین گفتار ====================
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .clickable { onSpeakingClick() },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                listOf(Color(0xFF7B1FA2), Color(0xFFAB47BC), Color(0xFFBA68C8))
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
                            Text("🎤", fontSize = 34.sp)
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "تمرین گفتار",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
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
                        Text("→", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== سطوح ====================
            SectionTitle(emoji = "📚", title = "سطح خود را انتخاب کنید", accent = Color(0xFF1A237E))

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

            Spacer(Modifier.height(20.dp))

            // ==================== بخش‌های ویژه ====================
            SectionTitle(emoji = "✨", title = "بخش‌های ویژه", accent = Color(0xFFE91E63))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "📖",
                    title = "کتاب داستان",
                    subtitle = "۱۰۰+ داستان",
                    gradient = listOf(Color(0xFFE91E63), Color(0xFFF06292)),
                    onClick = onStoryBookClick
                )
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "📝",
                    title = "گرامر",
                    subtitle = "قواعد",
                    gradient = listOf(Color(0xFF00ACC1), Color(0xFF26C6DA)),
                    onClick = onGrammarClick
                )
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "📚",
                    title = "لغات",
                    subtitle = "بانک کلمات",
                    gradient = listOf(Color(0xFF00695C), Color(0xFF26A69A)),
                    onClick = onVocabularyBankClick
                )
            }

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "🎧",
                    title = "پادکست",
                    subtitle = "۵۰ پادکست",
                    gradient = listOf(Color(0xFFEF6C00), Color(0xFFFFB74D)),
                    onClick = onPodcastClick
                )
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "✏️",
                    title = "آزمون روزانه",
                    subtitle = "کوییز روز",
                    gradient = listOf(Color(0xFFD32F2F), Color(0xFFEF5350)),
                    onClick = onDailyQuizClick
                )
                HomeCard(
                    modifier = Modifier.weight(1f),
                    emoji = "💬",
                    title = "جملات روزمره",
                    subtitle = "۲۰۰+ جمله",
                    gradient = listOf(Color(0xFF00897B), Color(0xFF26A69A)),
                    onClick = onDailySentencesClick
                )
            }

            Spacer(Modifier.height(20.dp))

            // ==================== کتابخانه من ====================
            SectionTitle(emoji = "🔖", title = "کتابخانه من", accent = Color(0xFF00897B))

            LibraryItem(
                emoji = "📕",
                title = "داستان‌های ذخیره‌شده",
                subtitle = "داستان‌هایی که نشان کردی",
                gradient = listOf(Color(0xFFAD1457), Color(0xFFE91E63)),
                onClick = onBookmarkedStoriesClick
            )

            Spacer(Modifier.height(10.dp))

            LibraryItem(
                emoji = "🔖",
                title = "لغات ذخیره‌شده",
                subtitle = "کلمات مهمی که ذخیره کردی",
                gradient = listOf(Color(0xFFFFA000), Color(0xFFFFC107)),
                onClick = onBookmarkedWordsClick
            )

            Spacer(Modifier.height(20.dp))

            // ==================== ⚙️ تنظیمات ====================
            SectionTitle(emoji = "⚙️", title = "تنظیمات اپلیکیشن", accent = Color(0xFF546E7A))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .clickable { onSettingsClick() },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0xFF37474F), Color(0xFF546E7A), Color(0xFF78909C))
                            )
                        )
                        .padding(18.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(60.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.Settings,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(34.dp)
                            )
                        }
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "تنظیمات",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "کلید AI • سرعت صوت • پاک کردن پیشرفت",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                        Text("→", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(Modifier.height(30.dp))

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

// ==================== کامپوننت‌ها ====================

@Composable
private fun SectionTitle(emoji: String, title: String, accent: Color) {
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

@Composable
private fun HomeCard(
    modifier: Modifier = Modifier,
    emoji: String,
    title: String,
    subtitle: String,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .height(120.dp)
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
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(emoji, fontSize = 24.sp)
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = title,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1
                )
                Text(
                    text = subtitle,
                    fontSize = 9.sp,
                    color = Color.White.copy(alpha = 0.85f),
                    maxLines = 1
                )
            }
        }
    }
}

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
                            Icons.Filled.Star,
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

@Composable
private fun LibraryItem(
    emoji: String,
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
                    Text(emoji, fontSize = 24.sp)
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