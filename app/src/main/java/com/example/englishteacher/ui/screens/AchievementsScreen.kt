package com.example.englishteacher.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.AchievementCategory
import com.example.englishteacher.data.AchievementManager
import com.example.englishteacher.data.BookmarkManager
import com.example.englishteacher.data.ProgressManager
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementsScreen(onBack: () -> Unit) {
    val context = LocalContext.current

    var completedLessons by remember { mutableStateOf<Set<String>>(emptySet()) }
    var quizScores by remember { mutableStateOf<Set<String>>(emptySet()) }
    var totalStars by remember { mutableIntStateOf(0) }
    var streak by remember { mutableIntStateOf(0) }
    var storiesRead by remember { mutableStateOf<Set<String>>(emptySet()) }
    var grammarViewed by remember { mutableStateOf<Set<String>>(emptySet()) }
    var sentencesViewed by remember { mutableStateOf<Set<String>>(emptySet()) }
    var groupScores by remember { mutableStateOf<Map<String, Int>>(emptyMap()) }
    var bookmarkedWords by remember { mutableStateOf<Set<String>>(emptySet()) }
    var bookmarkedStories by remember { mutableStateOf<Set<String>>(emptySet()) }
    var unlockedIds by remember { mutableStateOf<Set<String>>(emptySet()) }
    var unlockedDates by remember { mutableStateOf<Map<String, String>>(emptyMap()) }

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
    LaunchedEffect(Unit) {
        BookmarkManager.getBookmarkedWords(context).collectLatest { bookmarkedWords = it }
    }
    LaunchedEffect(Unit) {
        BookmarkManager.getBookmarkedStories(context).collectLatest { bookmarkedStories = it }
    }
    LaunchedEffect(Unit) {
        AchievementManager.getUnlockedIds(context).collectLatest { unlockedIds = it }
    }
    LaunchedEffect(Unit) {
        AchievementManager.getUnlockedDates(context).collectLatest { unlockedDates = it }
    }

    val allAchievements = AchievementManager.getAllAchievements()

    fun getCurrentValue(achievementId: String): Int {
        return when (achievementId) {
            "first_lesson", "lessons_5", "lessons_10", "lessons_20", "lessons_all" -> completedLessons.size
            "streak_3", "streak_7", "streak_14", "streak_30", "streak_100", "perfect_streak_week" -> streak
            "stories_5", "stories_15", "stories_30", "stories_50", "stories_all" -> storiesRead.size
            "grammar_10", "grammar_30", "grammar_all" -> grammarViewed.size
            "sentences_5", "sentences_all" -> sentencesViewed.size
            "stars_100", "stars_500", "stars_1000" -> totalStars
            "perfect_quiz" -> if (quizScores.any { it.substringAfter(":").toIntOrNull() == 100 }) 1 else 0
            "quizzes_10" -> quizScores.size
            "groups_5", "groups_all" -> groupScores.count { it.value >= ProgressManager.PASSING_SCORE }
            "bookmarks_10" -> bookmarkedWords.size + bookmarkedStories.size
            else -> 0
        }
    }

    LaunchedEffect(
        completedLessons, streak, storiesRead, grammarViewed, sentencesViewed,
        totalStars, quizScores, groupScores, bookmarkedWords, bookmarkedStories
    ) {
        allAchievements.forEach { achievement ->
            if (!unlockedIds.contains(achievement.id)) {
                val current = getCurrentValue(achievement.id)
                if (current >= achievement.target) {
                    AchievementManager.unlock(context, achievement.id)
                }
            }
        }
    }

    val progressList = allAchievements.map { a ->
        Triple(a, getCurrentValue(a.id), unlockedIds.contains(a.id))
    }
    val unlockedCount = progressList.count { it.third }
    val totalCount = allAchievements.size
    val overallProgress = if (totalCount > 0) unlockedCount.toFloat() / totalCount else 0f

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "🏆 دستاوردها",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "$unlockedCount از $totalCount باز شده",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1A237E))
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {

            item {
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
                                    listOf(
                                        Color(0xFF1A237E),
                                        Color(0xFF6A1B9A)
                                    )
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
                                    .size(90.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.2f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text("🏆", fontSize = 34.sp)
                                    Text(
                                        "${(overallProgress * 100).toInt()}%",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }
                            }
                            Spacer(Modifier.height(16.dp))
                            Text(
                                "پیشرفت دستاوردها",
                                fontSize = 15.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                            Spacer(Modifier.height(6.dp))
                            Text(
                                "$unlockedCount از $totalCount",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(Modifier.height(14.dp))
                            LinearProgressIndicator(
                                progress = { overallProgress },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(10.dp)
                                    .clip(RoundedCornerShape(5.dp)),
                                color = Color(0xFFFFD54F),
                                trackColor = Color.White.copy(alpha = 0.25f)
                            )
                        }
                    }
                }
            }

            AchievementCategory.values().forEach { category ->
                val categoryList = progressList.filter { it.first.category == category }
                if (categoryList.isEmpty()) return@forEach

                val categoryUnlocked = categoryList.count { it.third }
                val categoryTotal = categoryList.size

                item {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(
                                    Color(categoryList.first().first.color).copy(alpha = 0.15f)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(category.emoji, fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                category.displayName,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1A237E)
                            )
                            Text(
                                "$categoryUnlocked از $categoryTotal",
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    if (categoryUnlocked == categoryTotal)
                                        Color(0xFF43A047)
                                    else
                                        Color(categoryList.first().first.color).copy(alpha = 0.15f)
                                )
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                        ) {
                            Text(
                                if (categoryUnlocked == categoryTotal) "✅ کامل"
                                else "${((categoryUnlocked.toFloat() / categoryTotal) * 100).toInt()}%",
                                fontSize = 11.sp,
                                color = if (categoryUnlocked == categoryTotal)
                                    Color.White
                                else
                                    Color(categoryList.first().first.color),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                items(categoryList, key = { it.first.id }) { (achievement, current, isUnlocked) ->
                    AchievementCard(
                        achievement = achievement,
                        current = current,
                        isUnlocked = isUnlocked,
                        unlockedDate = unlockedDates[achievement.id]
                    )
                }
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

@Composable
private fun AchievementCard(
    achievement: com.example.englishteacher.data.Achievement,
    current: Int,
    isUnlocked: Boolean,
    unlockedDate: String?
) {
    val progress = if (achievement.target > 0)
        (current.toFloat() / achievement.target).coerceIn(0f, 1f)
    else 0f

    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(durationMillis = 800),
        label = "achievementProgress"
    )

    val achievementColor = Color(achievement.color)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                if (!isUnlocked) alpha = 0.85f
            },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(if (isUnlocked) 5.dp else 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isUnlocked) Color.White else Color(0xFFF5F5F5)
        )
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(5.dp)
                    .background(
                        if (isUnlocked) achievementColor
                        else Color(0xFFBDBDBD)
                    )
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            if (isUnlocked) {
                                Brush.linearGradient(
                                    listOf(
                                        achievementColor,
                                        achievementColor.copy(alpha = 0.7f)
                                    )
                                )
                            } else {
                                Brush.linearGradient(
                                    listOf(
                                        Color(0xFFBDBDBD),
                                        Color(0xFF9E9E9E)
                                    )
                                )
                            }
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    if (isUnlocked) {
                        Text(achievement.emoji, fontSize = 30.sp)
                    } else {
                        Icon(
                            Icons.Filled.Lock,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                }

                Spacer(Modifier.width(14.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            achievement.titlePersian,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = if (isUnlocked) Color(0xFF1A237E) else Color.Gray
                        )
                        if (isUnlocked) {
                            Spacer(Modifier.width(6.dp))
                            Text("✅", fontSize = 12.sp)
                        }
                    }
                    Spacer(Modifier.height(2.dp))
                    Text(
                        achievement.description,
                        fontSize = 11.sp,
                        color = Color.Gray,
                        lineHeight = 16.sp
                    )

                    if (isUnlocked && unlockedDate != null) {
                        Spacer(Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(achievementColor.copy(alpha = 0.12f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                "📅 $unlockedDate",
                                fontSize = 9.sp,
                                color = achievementColor,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    } else if (!isUnlocked) {
                        Spacer(Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            LinearProgressIndicator(
                                progress = { animatedProgress },
                                modifier = Modifier
                                    .weight(1f)
                                    .height(6.dp)
                                    .clip(RoundedCornerShape(3.dp)),
                                color = achievementColor,
                                trackColor = achievementColor.copy(alpha = 0.15f)
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "$current/${achievement.target}",
                                fontSize = 10.sp,
                                color = achievementColor,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}