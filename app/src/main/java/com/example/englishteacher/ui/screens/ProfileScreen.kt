package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.StoryBookRepository
import com.example.englishteacher.data.GrammarRepository
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    val context = LocalContext.current

    var completedLessons by remember { mutableStateOf<Set<String>>(emptySet()) }
    var quizScores by remember { mutableStateOf<Set<String>>(emptySet()) }
    var totalStars by remember { mutableIntStateOf(0) }
    var streak by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        ProgressManager.getCompletedLessons(context).collectLatest { completedLessons = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getQuizScores(context).collectLatest { quizScores = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getTotalStars(context).collectLatest { totalStars = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getStreak(context).collectLatest { streak = it }
    }

    val totalLessons = LessonRepository.getLessonsByLevel(Level.BEGINNER).size +
            LessonRepository.getLessonsByLevel(Level.INTERMEDIATE).size +
            LessonRepository.getLessonsByLevel(Level.ADVANCED).size

    val totalStories = StoryBookRepository.getAllStories().size
    val totalGrammar = GrammarRepository.getAllTopics().size

    val completedCount = completedLessons.size
    val progress = if (totalLessons > 0) completedCount.toFloat() / totalLessons else 0f

    val userLevel = when {
        completedCount >= 25 -> "پیشرفته"
        completedCount >= 15 -> "متوسط"
        completedCount >= 5 -> "در حال پیشرفت"
        else -> "تازه‌کار"
    }
    val userLevelEmoji = when {
        completedCount >= 25 -> "🏆"
        completedCount >= 15 -> "🚀"
        completedCount >= 5 -> "🌱"
        else -> "👋"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("👤 پروفایل من", fontWeight = FontWeight.Bold, color = Color.White)
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
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {

            // ==================== کارت پروفایل ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                listOf(Color(0xFF1A237E), Color(0xFF3949AB))
                            )
                        )
                        .padding(24.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape)
                                .background(
                                    Brush.linearGradient(
                                        listOf(Color(0xFFFFD54F), Color(0xFFFFA726))
                                    )
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(userLevelEmoji, fontSize = 56.sp)
                        }

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "زبان‌آموز",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Spacer(Modifier.height(6.dp))

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color.White.copy(alpha = 0.2f))
                                .padding(horizontal = 14.dp, vertical = 6.dp)
                        ) {
                            Text(
                                "سطح: $userLevel",
                                color = Color.White,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }

                        Spacer(Modifier.height(20.dp))

                        Text(
                            "پیشرفت کلی",
                            color = Color.White.copy(alpha = 0.9f),
                            fontSize = 12.sp
                        )
                        Spacer(Modifier.height(6.dp))
                        LinearProgressIndicator(
                            progress = { progress },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(10.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            color = Color(0xFFFFD54F),
                            trackColor = Color.White.copy(alpha = 0.25f)
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            "${(progress * 100).toInt()}% تکمیل شده",
                            color = Color.White.copy(alpha = 0.9f),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            // ==================== کارت استریک ====================
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
                                listOf(Color(0xFFF12711), Color(0xFFF5AF19))
                            )
                        )
                        .padding(20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🔥", fontSize = 34.sp)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "استریک روزانه",
                                fontSize = 13.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                            Text(
                                "$streak روز متوالی",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                when {
                                    streak == 0 -> "امروز شروع کن!"
                                    streak < 3 -> "ادامه بده! 💪"
                                    streak < 7 -> "عالی پیش می‌ری! ✨"
                                    streak < 30 -> "فوقالعاده‌ای! 🌟"
                                    else -> "افسانه‌ای! 👑"
                                },
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.9f),
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(4.dp))

            // ==================== آمار اصلی ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Star,
                    value = "$totalStars",
                    label = "امتیاز",
                    color = Color(0xFFFFA000)
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.MenuBook,
                    value = "$completedCount",
                    label = "درس کامل",
                    color = Color(0xFF43A047)
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Quiz,
                    value = "${quizScores.size}",
                    label = "کوییز",
                    color = Color(0xFF7B1FA2)
                )
            }

            Spacer(Modifier.height(4.dp))

            SectionTitle("📚 محتوای موجود")

            ContentStatCard(
                icon = Icons.Filled.Book,
                iconColor = Color(0xFF1A237E),
                title = "دروس",
                subtitle = "$totalLessons درس در ۳ سطح",
                value = "$totalLessons"
            )

            ContentStatCard(
                icon = Icons.Filled.AutoStories,
                iconColor = Color(0xFFE91E63),
                title = "داستان‌ها",
                subtitle = "داستان‌های کوتاه با صوت",
                value = "$totalStories"
            )

            ContentStatCard(
                icon = Icons.Filled.Translate,
                iconColor = Color(0xFF00695C),
                title = "گرامرها",
                subtitle = "موضوعات گرامری",
                value = "$totalGrammar"
            )

            Spacer(Modifier.height(4.dp))

            SectionTitle("🏆 دستاوردها")

            AchievementsGrid(
                completedCount = completedCount,
                totalStars = totalStars,
                quizCount = quizScores.size,
                streak = streak
            )

            Spacer(Modifier.height(20.dp))
        }
    }
}

// ==================== کارت آمار ====================
@Composable
private fun StatCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    value: String,
    label: String,
    color: Color
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, contentDescription = null, tint = color, modifier = Modifier.size(22.dp))
            }
            Spacer(Modifier.height(8.dp))
            Text(value, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
            Text(label, fontSize = 11.sp, color = Color.Gray)
        }
    }
}

// ==================== کارت محتوا ====================
@Composable
private fun ContentStatCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    subtitle: String,
    value: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(iconColor.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, contentDescription = null, tint = iconColor)
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(title, fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
                Text(subtitle, fontSize = 12.sp, color = Color.Gray)
            }
            Text(
                value,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = iconColor
            )
        }
    }
}

// ==================== عنوان بخش ====================
@Composable
private fun SectionTitle(text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(4.dp, 22.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(Color(0xFF1A237E))
        )
        Spacer(Modifier.width(10.dp))
        Text(text, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
    }
}

// ==================== دستاوردها ====================
@Composable
private fun AchievementsGrid(
    completedCount: Int,
    totalStars: Int,
    quizCount: Int,
    streak: Int
) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        AchievementRow("🌱", "شروع سفر", "اولین درس را کامل کن", completedCount >= 1)
        AchievementRow("📚", "کتاب‌خوان", "۵ درس را کامل کن", completedCount >= 5)
        AchievementRow("⭐", "ستاره‌جمع‌کن", "۱۰۰ امتیاز بگیر", totalStars >= 100)
        AchievementRow("🎯", "کوییزباز", "۵ کوییز را کامل کن", quizCount >= 5)
        AchievementRow("🔥", "۳ روز آتشین", "۳ روز متوالی فعال باش", streak >= 3)
        AchievementRow("💎", "هفت‌روزه", "۷ روز متوالی فعال باش", streak >= 7)
        AchievementRow("🏆", "قهرمان", "۲۵ درس را کامل کن", completedCount >= 25)
        AchievementRow("👑", "استاد", "همه ۳۴ درس را کامل کن", completedCount >= 34)
    }
}

@Composable
private fun AchievementRow(
    emoji: String,
    title: String,
    description: String,
    unlocked: Boolean
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        elevation = CardDefaults.cardElevation(if (unlocked) 3.dp else 1.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (unlocked) Color.White else Color(0xFFF5F5F5)
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(
                        if (unlocked) {
                            Brush.linearGradient(
                                listOf(Color(0xFFFFD54F), Color(0xFFFFA726))
                            )
                        } else {
                            Brush.linearGradient(
                                listOf(Color(0xFFE0E0E0), Color(0xFFBDBDBD))
                            )
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    if (unlocked) emoji else "🔒",
                    fontSize = 24.sp
                )
            }

            Spacer(Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (unlocked) Color(0xFF1A237E) else Color.Gray
                )
                Text(
                    description,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }

            if (unlocked) {
                Icon(
                    Icons.Filled.CheckCircle,
                    contentDescription = null,
                    tint = Color(0xFF43A047),
                    modifier = Modifier.size(26.dp)
                )
            }
        }
    }
}