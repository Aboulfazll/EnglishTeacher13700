package com.example.englishteacher.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.englishteacher.data.Level
import com.example.englishteacher.data.LessonRepository
import com.example.englishteacher.data.ProgressManager
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProgressScreen() {
    val context = LocalContext.current

    var completedLessons by remember { mutableStateOf<Set<String>>(emptySet()) }
    var quizScores by remember { mutableStateOf<Set<String>>(emptySet()) }
    var totalStars by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        ProgressManager.getCompletedLessons(context).collectLatest { completedLessons = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getQuizScores(context).collectLatest { quizScores = it }
    }
    LaunchedEffect(Unit) {
        ProgressManager.getTotalStars(context).collectLatest { totalStars = it }
    }

    // محاسبه پیشرفت هر سطح
    val beginnerLessons = LessonRepository.getLessonsByLevel(Level.BEGINNER)
    val intermediateLessons = LessonRepository.getLessonsByLevel(Level.INTERMEDIATE)
    val advancedLessons = LessonRepository.getLessonsByLevel(Level.ADVANCED)

    val beginnerDone = beginnerLessons.count { it.id in completedLessons }
    val intermediateDone = intermediateLessons.count { it.id in completedLessons }
    val advancedDone = advancedLessons.count { it.id in completedLessons }

    val totalDone = beginnerDone + intermediateDone + advancedDone
    val totalLessons = beginnerLessons.size + intermediateLessons.size + advancedLessons.size
    val overallProgress = if (totalLessons > 0) totalDone.toFloat() / totalLessons else 0f

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("پیشرفت من", fontWeight = FontWeight.Bold, color = Color.White)
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

            // 🎯 کارت پیشرفت کلی
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1A237E)),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        Icons.Filled.BarChart,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(48.dp)
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "پیشرفت کلی",
                        fontSize = 16.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "${(overallProgress * 100).toInt()}%",
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        "$totalDone از $totalLessons درس",
                        fontSize = 14.sp,
                        color = Color.White.copy(alpha = 0.8f)
                    )
                    Spacer(Modifier.height(16.dp))
                    LinearProgressIndicator(
                        progress = { overallProgress },
                        modifier = Modifier.fillMaxWidth().height(8.dp),
                        color = Color(0xFFFFD54F),
                        trackColor = Color.White.copy(alpha = 0.3f)
                    )
                }
            }

            // ⭐ امتیاز و آمار
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
                    icon = Icons.Filled.EmojiEvents,
                    value = "$totalDone",
                    label = "درس کامل",
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

            // 📊 پیشرفت هر سطح
            Text(
                "پیشرفت هر سطح",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )

            LevelProgressCard(
                title = "مبتدی",
                subtitle = "Top Notch 1",
                done = beginnerDone,
                total = beginnerLessons.size,
                color = Color(0xFF43A047)
            )

            LevelProgressCard(
                title = "متوسط",
                subtitle = "Top Notch 2",
                done = intermediateDone,
                total = intermediateLessons.size,
                color = Color(0xFF7B1FA2)
            )

            LevelProgressCard(
                title = "پیشرفته",
                subtitle = "Top Notch 3",
                done = advancedDone,
                total = advancedLessons.size,
                color = Color(0xFFE65100)
            )

            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
private fun StatCard(
    modifier: Modifier = Modifier,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    value: String,
    label: String,
    color: Color
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(icon, contentDescription = null, tint = color, modifier = Modifier.size(28.dp))
            Spacer(Modifier.height(8.dp))
            Text(value, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
            Text(label, fontSize = 11.sp, color = Color.Gray)
        }
    }
}

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
                    Text(title, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1A237E))
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
                modifier = Modifier.fillMaxWidth().height(8.dp),
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