package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.TrendingUp
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
import com.example.englishteacher.data.DailySentencesRepository
import com.example.englishteacher.data.GrammarRepository
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.ProgressManager
import com.example.englishteacher.data.StoryBookRepository
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProgressScreen() {
    val context = LocalContext.current

    var completedLessons by remember { mutableStateOf<Set<String>>(emptySet()) }
    var quizScores by remember { mutableStateOf<Set<String>>(emptySet()) }
    var totalStars by remember { mutableIntStateOf(0) }
    var streak by remember { mutableIntStateOf(0) }
    var storiesRead by remember { mutableStateOf<Set<String>>(emptySet()) }
    var grammarViewed by remember { mutableStateOf<Set<String>>(emptySet()) }
    var sentencesViewed by remember { mutableStateOf<Set<String>>(emptySet()) }
    var groupScores by remember { mutableStateOf<Map<String, Int>>(emptyMap()) }

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
    LaunchedEffect(Unit) {
        ProgressManager.getStoriesRead(context).collectLatest { storiesRead = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getGrammarViewed(context).collectLatest { grammarViewed = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getSentencesCategoriesViewed(context).collectLatest { sentencesViewed = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getAllGroupScores(context).collectLatest { groupScores = it }
    }

    // ==================== محاسبه پیشرفت ====================
    val beginnerLessons = LessonRepository.getLessonsByLevel(Level.BEGINNER)
    val intermediateLessons = LessonRepository.getLessonsByLevel(Level.INTERMEDIATE)
    val advancedLessons = LessonRepository.getLessonsByLevel(Level.ADVANCED)

    val beginnerDone = beginnerLessons.count { it.id in completedLessons }
    val intermediateDone = intermediateLessons.count { it.id in completedLessons }
    val advancedDone = advancedLessons.count { it.id in completedLessons }

    val totalDone = beginnerDone + intermediateDone + advancedDone
    val totalLessons = beginnerLessons.size + intermediateLessons.size + advancedLessons.size
    val overallProgress = if (totalLessons > 0) totalDone.toFloat() / totalLessons else 0f

    val totalStories = StoryBookRepository.getAllStories().size
    val totalGrammar = GrammarRepository.getAllTopics().size
    val totalSentenceCategories = DailySentencesRepository.getAllCategories().size
    val passedGroups = groupScores.count { it.value >= ProgressManager.PASSING_SCORE }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "📊 پیشرفت من",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "آمار و دستاوردها",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
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
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // ==================== کارت پیشرفت کلی ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                listOf(Color(0xFF1A237E), Color(0xFF3949AB))
                            )
                        )
                        .padding(24.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Filled.BarChart,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(34.dp)
                            )
                        }
                        Spacer(Modifier.height(14.dp))
                        Text(
                            "پیشرفت کلی",
                            fontSize = 15.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            "${(overallProgress * 100).toInt()}%",
                            fontSize = 52.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "$totalDone از $totalLessons درس",
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.8f)
                        )
                        Spacer(Modifier.height(16.dp))
                        LinearProgressIndicator(
                            progress = { overallProgress },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            color = Color(0xFFFFD54F),
                            trackColor = Color.White.copy(alpha = 0.25f)
                        )
                    }
                }
            }

            // ==================== ۴ کارت آماری ====================
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.Star,
                    value = "$totalStars",
                    label = "ستاره",
                    color = Color(0xFFFFA000)
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.LocalFireDepartment,
                    value = "$streak",
                    label = "روز پیوسته",
                    color = Color(0xFFE53935)
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.EmojiEvents,
                    value = "$passedGroups",
                    label = "امتحان پاس",
                    color = Color(0xFF43A047)
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Filled.TrendingUp,
                    value = "${quizScores.size}",
                    label = "کوییز",
                    color = Color(0xFF7B1FA2)
                )
            }

            Spacer(Modifier.height(8.dp))

            // ==================== پیشرفت محتوایی ====================
            Text(
                "📚 محتوای مطالعه‌شده",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )

            ContentProgressCard(
                icon = Icons.Filled.MenuBook,
                title = "داستان‌ها",
                done = storiesRead.size,
                total = totalStories,
                color = Color(0xFFE91E63)
            )

            ContentProgressCard(
                icon = Icons.Filled.School,
                title = "موضوعات گرامری",
                done = grammarViewed.size,
                total = totalGrammar,
                color = Color(0xFF00ACC1)
            )

            ContentProgressCard(
                icon = Icons.Filled.ChatBubble,
                title = "دسته‌های جملات روزمره",
                done = sentencesViewed.size,
                total = totalSentenceCategories,
                color = Color(0xFF00897B)
            )

            Spacer(Modifier.height(8.dp))

            // ==================== پیشرفت هر سطح ====================
            Text(
                "🎯 پیشرفت هر سطح",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )

            LevelProgressCard(
                title = "مبتدی",
                subtitle = "Top Notch Fundamentals",
                done = beginnerDone,
                total = beginnerLessons.size,
                color = Color(0xFF43A047)
            )

            LevelProgressCard(
                title = "متوسط",
                subtitle = "Top Notch 1",
                done = intermediateDone,
                total = intermediateLessons.size,
                color = Color(0xFF7B1FA2)
            )

            LevelProgressCard(
                title = "پیشرفته",
                subtitle = "Top Notch 2",
                done = advancedDone,
                total = advancedLessons.size,
                color = Color(0xFFE65100)
            )

            Spacer(Modifier.height(20.dp))
        }
    }
}

// ==================== کارت آماری کوچک ====================
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
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(3.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 14.dp, horizontal = 6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                icon,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(26.dp)
            )
            Spacer(Modifier.height(6.dp))
            Text(
                value,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )
            Text(
                label,
                fontSize = 10.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

// ==================== کارت پیشرفت محتوا ====================
@Composable
private fun ContentProgressCard(
    icon: ImageVector,
    title: String,
    done: Int,
    total: Int,
    color: Color
) {
    val progress = if (total > 0) done.toFloat() / total else 0f
    val percent = (progress * 100).toInt()

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(color.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            icon,
                            contentDescription = null,
                            tint = color,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            title,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                        Text(
                            "$done از $total",
                            fontSize = 11.sp,
                            color = Color.Gray
                        )
                    }
                }
                Text(
                    "$percent%",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = color
                )
            }
            Spacer(Modifier.height(12.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier.fillMaxWidth().height(7.dp).clip(RoundedCornerShape(4.dp)),
                color = color,
                trackColor = color.copy(alpha = 0.15f)
            )
        }
    }
}

// ==================== کارت پیشرفت سطح ====================
@Composable
private fun LevelProgressCard(
    title: String,
    subtitle: String,
    done: Int,
    total: Int,
    color: Color
) {
    val progress = if (total > 0) done.toFloat() / total else 0f
    val percent = (progress * 100).toInt()

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(subtitle, fontSize = 12.sp, color = Color.Gray)
                }
                Text(
                    "$percent%",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = color
                )
            }
            Spacer(Modifier.height(12.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                color = color,
                trackColor = color.copy(alpha = 0.15f)
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "$done از $total درس کامل شده",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}