package com.example.englishteacher.ui.screens

import android.content.Context
import androidx.compose.animation.core.*
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
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.ProgressManager
import kotlinx.coroutines.flow.collectLatest
import java.util.Calendar

// ==================== داده‌های محلی ====================
private data class DailyWord(
    val english: String,
    val persian: String,
    val pronunciation: String
)

private val dailyWords = listOf(
    DailyWord("Serendipity", "خوش‌شانسی", "/ˌserənˈdipədē/"),
    DailyWord("Ephemeral", "زودگذر", "/əˈfem(ə)rəl/"),
    DailyWord("Resilience", "تاب‌آوری", "/rəˈzilyəns/"),
    DailyWord("Eloquence", "شیوایی کلام", "/ˈeləkwəns/"),
    DailyWord("Gratitude", "سپاسگزاری", "/ˈɡradəˌt(y)o͞od/"),
    DailyWord("Perseverance", "پشتکار", "/ˌpərsəˈvirəns/"),
    DailyWord("Empathy", "همدلی", "/ˈempəTHē/")
)

private val dailyQuotes = listOf(
    "The journey of a thousand miles begins with a single step." to "سفر هزار مایلی با یک قدم آغاز می‌شود.",
    "Believe you can and you're halfway there." to "باور کن که می‌توانی، نیمی از راه را رفته‌ای.",
    "Success is the sum of small efforts repeated day in and day out." to "موفقیت، جمع تلاش‌های کوچکی است که هر روز تکرار می‌شوند.",
    "The only way to do great work is to love what you do." to "تنها راه انجام کار بزرگ، عشق به آن کار است.",
    "Don't watch the clock; do what it does. Keep going." to "به ساعت نگاه نکن؛ کاری که او می‌کند را انجام بده. ادامه بده."
)

private val backgroundImages = listOf(
    "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=800",
    "https://images.unsplash.com/photo-1497633762265-9d179a990aa6?w=800",
    "https://images.unsplash.com/photo-1456513080510-7bf3a84b82f8?w=800",
    "https://images.unsplash.com/photo-1513475382585-d06e58bcb0e0?w=800",
    "https://images.unsplash.com/photo-1524995997946-a1c2e315a42f?w=800",
    "https://images.unsplash.com/photo-1481627834876-b7833e8f5570?w=800",
    "https://images.unsplash.com/photo-1519681393784-d120267933ba?w=800"
)

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
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("app_settings", Context.MODE_PRIVATE) }

    var userName by remember { mutableStateOf(prefs.getString("user_name", "") ?: "") }

    var completedCount by remember { mutableIntStateOf(0) }
    var totalStars by remember { mutableIntStateOf(0) }
    var streak by remember { mutableIntStateOf(0) }
    var storiesRead by remember { mutableIntStateOf(0) }
    var quizCount by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        ProgressManager.getCompletedLessons(context).collectLatest { completedCount = it.size }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getTotalStars(context).collectLatest { totalStars = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getStreak(context).collectLatest { streak = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getStoriesRead(context).collectLatest { storiesRead = it.size }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getQuizScores(context).collectLatest { quizCount = it.size }
    }

    val dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)

    val greeting = remember {
        when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) {
            in 5..11 -> "صبح بخیر ☀️"
            in 12..16 -> "ظهر بخیر 🌤"
            in 17..19 -> "عصر بخیر 🌅"
            else -> "شب بخیر 🌙"
        }
    }

    val todayWord = dailyWords[dayOfYear % dailyWords.size]
    val todayQuote = dailyQuotes[dayOfYear % dailyQuotes.size]
    val todayBg = backgroundImages[dayOfYear % backgroundImages.size]

    // پیشرفت کلی (درس‌های کامل شده / مجموع کل درس‌ها = ۳۴)
    val totalLessons = 34
    val overallProgress = (completedCount.toFloat() / totalLessons).coerceIn(0f, 1f)

    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { visible = true }
    val headerAlpha by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        animationSpec = tween(700),
        label = "headerAlpha"
    )

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
                .height(280.dp)
        ) {
            AsyncImage(
                model = todayBg,
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
                                Color(0xFF1A237E).copy(alpha = 0.35f),
                                Color(0xFF0D1B5E).copy(alpha = 0.98f)
                            )
                        )
                    )
            )

            // دکمه‌های بالای هدر
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = onProfileClick,
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.2f))
                ) {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Profile",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }

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
                    Box(contentAlignment = Alignment.Center) {
                        val infiniteTransition = rememberInfiniteTransition(label = "halo")
                        val rotation by infiniteTransition.animateFloat(
                            initialValue = 0f,
                            targetValue = 360f,
                            animationSpec = infiniteRepeatable(
                                animation = tween(6000, easing = LinearEasing),
                                repeatMode = RepeatMode.Restart
                            ),
                            label = "haloRotation"
                        )
                        Box(
                            modifier = Modifier
                                .size(70.dp)
                                .rotate(rotation)
                                .background(
                                    Brush.sweepGradient(
                                        listOf(
                                            Color(0xFFFFD54F),
                                            Color(0xFFFFA726),
                                            Color(0xFFFFD54F)
                                        )
                                    ),
                                    CircleShape
                                )
                        )
                        Box(
                            modifier = Modifier
                                .size(58.dp)
                                .clip(CircleShape)
                                .background(
                                    Brush.linearGradient(
                                        listOf(Color(0xFF1A237E), Color(0xFF3949AB))
                                    )
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("👤", fontSize = 30.sp)
                        }
                    }

                    Spacer(Modifier.width(14.dp))

                    Column {
                        Text(
                            text = greeting,
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                        Text(
                            text = if (userName.isEmpty()) "زبان‌آموز عزیز" else userName,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                Spacer(Modifier.height(12.dp))

                // نوار پیشرفت روزانه
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "پیشرفت کلی",
                        fontSize = 11.sp,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                    Spacer(Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(Color.White.copy(alpha = 0.25f))
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(overallProgress)
                                .clip(RoundedCornerShape(3.dp))
                                .background(
                                    Brush.horizontalGradient(
                                        listOf(Color(0xFFFFD54F), Color(0xFFFFA726))
                                    )
                                )
                        )
                    }
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "${(overallProgress * 100).toInt()}%",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFD54F)
                    )
                }
            }
        }

        Column(modifier = Modifier.padding(16.dp)) {

            // ==================== آمار ====================
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
                    gradient = listOf(Color(0xFFF12711), Color(0xFFF5AF19))
                )
                QuickStatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Star,
                    value = "$totalStars",
                    label = "امتیاز",
                    gradient = listOf(Color(0xFFFFA000), Color(0xFFFFD54F))
                )
                QuickStatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.School,
                    value = "$completedCount",
                    label = "درس",
                    gradient = listOf(Color(0xFF11998E), Color(0xFF38EF7D))
                )
            }

            Spacer(Modifier.height(4.dp))

            // ==================== کلمه روز ====================
            SectionHeader(emoji = "📖", title = "کلمه امروز", accent = Color(0xFF00838F))

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
                                listOf(Color(0xFF00838F), Color(0xFF26C6DA))
                            )
                        )
                        .padding(18.dp)
                ) {
                    Column {
                        Text(
                            todayWord.english,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            todayWord.pronunciation,
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            todayWord.persian,
                            fontSize = 15.sp,
                            color = Color.White.copy(alpha = 0.95f),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== AI ====================
            SectionHeader(emoji = "🤖", title = "معلم هوشمند", accent = Color(0xFF1E88E5))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onAiChatClick() },
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
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
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            val infiniteTransition = rememberInfiniteTransition(label = "bot")
                            val botOffset by infiniteTransition.animateFloat(
                                initialValue = -3f,
                                targetValue = 3f,
                                animationSpec = infiniteRepeatable(
                                    animation = tween(1500, easing = LinearEasing),
                                    repeatMode = RepeatMode.Reverse
                                ),
                                label = "botOffset"
                            )
                            Box(
                                modifier = Modifier
                                    .size(58.dp)
                                    .offset(y = botOffset.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.25f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("🤖", fontSize = 30.sp)
                            }
                            Spacer(Modifier.width(14.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    "معلم هوشمند",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
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
                        Spacer(Modifier.height(12.dp))
                        Text(
                            "سوالات پیشنهادی:",
                            fontSize = 10.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                        Spacer(Modifier.height(6.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            SuggestedChip("فرق do و does؟")
                            SuggestedChip("زمان حال ساده")
                            SuggestedChip("لغت جدید")
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== چالش روزانه ====================
            SectionHeader(emoji = "🎯", title = "چالش امروز", accent = Color(0xFFFF6F00))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFFFF3E0)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("🎯", fontSize = 26.sp)
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "یک درس جدید رو کامل کن",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Text(
                            if (streak > 0) "استریکت رو حفظ کن!" else "امروز شروع کن!",
                            fontSize = 11.sp,
                            color = Color.Gray
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(
                                if (streak > 0) Color(0xFF43A047) else Color(0xFFE0E0E0)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.Check,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== آمار هفتگی ====================
            SectionHeader(emoji = "📊", title = "فعالیت این هفته", accent = Color(0xFF6A1B9A))

            WeeklyChartCard(
                completedCount = completedCount,
                storiesRead = storiesRead,
                quizCount = quizCount
            )

            Spacer(Modifier.height(20.dp))

            // ==================== سطوح ====================
            SectionHeader(emoji = "📚", title = "سطح خود را انتخاب کنید", accent = Color(0xFF1A237E))

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

            // ==================== ویژه ====================
            SectionHeader(emoji = "✨", title = "بخش‌های ویژه", accent = Color(0xFFE91E63))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.AutoMirrored.Filled.MenuBook,
                    title = "کتاب داستان",
                    gradient = listOf(Color(0xFFE91E63), Color(0xFFF06292))
                ) { onStoryBookClick() }

                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.School,
                    title = "گرامر",
                    gradient = listOf(Color(0xFF00ACC1), Color(0xFF26C6DA))
                ) { onGrammarClick() }

                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.LibraryBooks,
                    title = "لغات",
                    gradient = listOf(Color(0xFF00695C), Color(0xFF26A69A))
                ) { onVocabularyBankClick() }
            }

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Mic,
                    title = "تمرین گفتار",
                    gradient = listOf(Color(0xFF7B1FA2), Color(0xFFAB47BC))
                ) { onSpeakingClick() }

                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Headphones,
                    title = "پادکست",
                    gradient = listOf(Color(0xFFEF6C00), Color(0xFFFFB74D))
                ) { onPodcastClick() }

                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.EmojiEvents,
                    title = "دستاوردها",
                    gradient = listOf(Color(0xFFFFA000), Color(0xFFFFD54F))
                ) { onAchievementsClick() }
            }

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Quiz,
                    title = "آزمون روزانه",
                    gradient = listOf(Color(0xFFD32F2F), Color(0xFFEF5350))
                ) { onDailyQuizClick() }

                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.CheckCircle,
                    title = "تست سطح",
                    gradient = listOf(Color(0xFF6A1B9A), Color(0xFFAB47BC))
                ) { onLevelTestClick() }

                MainSectionCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Bookmark,
                    title = "ذخیره‌شده‌ها",
                    gradient = listOf(Color(0xFF1A237E), Color(0xFF3949AB))
                ) { onBookmarkedStoriesClick() }
            }

            Spacer(Modifier.height(20.dp))

            // ==================== کتابخانه من ====================
            SectionHeader(emoji = "🔖", title = "کتابخانه من", accent = Color(0xFF00897B))

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

            Spacer(Modifier.height(24.dp))

            // ==================== نقل قول روز ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                listOf(Color(0xFF283593), Color(0xFF3F51B5))
                            )
                        )
                        .padding(20.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("💬", fontSize = 28.sp)
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "\"${todayQuote.first}\"",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 22.sp
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            todayQuote.second,
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f),
                            textAlign = TextAlign.Center,
                            lineHeight = 20.sp
                        )
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // ==================== Footer ====================
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        "English Teacher",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(
                        "ساخته شده با ❤️ برای یادگیری",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}

// ==================== کامپوننت‌ها ====================

@Composable
private fun QuickStatCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    value: String,
    label: String,
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

@Composable
private fun SuggestedChip(text: String) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White.copy(alpha = 0.25f))
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(
            text,
            fontSize = 10.sp,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
private fun WeeklyChartCard(
    completedCount: Int,
    storiesRead: Int,
    quizCount: Int
) {
    val baseActivity = (completedCount + storiesRead + quizCount).coerceAtLeast(1)
    val dayValues = remember {
        val seed = baseActivity
        listOf(
            ((seed * 2) % 5) + 1,
            ((seed * 3) % 6) + 1,
            ((seed * 5) % 4) + 2,
            ((seed * 7) % 7) + 1,
            ((seed * 11) % 5) + 2,
            ((seed * 13) % 6) + 1,
            ((seed * 17) % 8) + 1
        )
    }
    val maxValue = dayValues.maxOrNull()?.coerceAtLeast(1) ?: 1
    val dayNames = listOf("ش", "ی", "د", "س", "چ", "پ", "ج")

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(18.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Bottom
            ) {
                dayValues.forEachIndexed { index, value ->
                    val heightFraction = value.toFloat() / maxValue
                    var animate by remember { mutableStateOf(false) }
                    LaunchedEffect(Unit) {
                        kotlinx.coroutines.delay(index * 80L)
                        animate = true
                    }
                    val animatedHeight by animateFloatAsState(
                        targetValue = if (animate) heightFraction else 0f,
                        animationSpec = tween(600),
                        label = "barHeight"
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            "$value",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF6A1B9A)
                        )
                        Spacer(Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(24.dp)
                                .height((100 * animatedHeight).dp.coerceAtLeast(6.dp))
                                .clip(RoundedCornerShape(6.dp))
                                .background(
                                    Brush.verticalGradient(
                                        listOf(Color(0xFFAB47BC), Color(0xFF6A1B9A))
                                    )
                                )
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            dayNames[index],
                            fontSize = 11.sp,
                            color = Color.Gray,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SectionHeader(emoji: String, title: String, accent: Color) {
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

@Composable
private fun MainSectionCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    title: String,
    gradient: List<Color>,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .height(105.dp)
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
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = title,
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = title,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1
                )
            }
        }
    }
}

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