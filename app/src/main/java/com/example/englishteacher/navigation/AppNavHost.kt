package com.example.englishteacher.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.englishteacher.data.Level
import com.example.englishteacher.ui.screens.AIChatScreen
import com.example.englishteacher.ui.screens.GrammarScreen
import com.example.englishteacher.ui.screens.HomeScreen
import com.example.englishteacher.ui.screens.LessonDetailScreen
import com.example.englishteacher.ui.screens.LessonListScreen
import com.example.englishteacher.ui.screens.PodcastPlayerScreen
import com.example.englishteacher.ui.screens.PodcastScreen
import com.example.englishteacher.ui.screens.ProgressScreen
import com.example.englishteacher.ui.screens.SettingsScreen

object Routes {
    const val HOME = "home"
    const val LESSON_LIST = "lessons/{level}"
    const val LESSON_DETAIL = "lesson/{lessonId}"
    const val PROGRESS = "progress"
    const val AI_CHAT = "ai_chat"
    const val SETTINGS = "settings"
    const val PODCAST = "podcast"
    const val PODCAST_PLAYER = "podcast_player/{url}/{title}"
    const val GRAMMAR = "grammar"

    fun lessonList(level: Level) = "lessons/${level.name}"
    fun lessonDetail(lessonId: String) = "lesson/$lessonId"
    fun podcastPlayer(url: String, title: String) = "podcast_player/$url/$title"
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME,
        modifier = modifier
    ) {
        // صفحه اصلی
        composable(Routes.HOME) {
            HomeScreen(
                onLevelClick = { level ->
                    navController.navigate(Routes.lessonList(level))
                },
                onGrammarClick = {
                    navController.navigate(Routes.GRAMMAR)
                }
            )
        }

        // لیست دروس
        composable(
            route = Routes.LESSON_LIST,
            arguments = listOf(navArgument("level") { type = NavType.StringType })
        ) { entry ->
            val levelName = entry.arguments?.getString("level") ?: Level.BEGINNER.name
            val level = Level.valueOf(levelName)
            LessonListScreen(
                level = level,
                onBack = { navController.popBackStack() },
                onLessonClick = { lessonId ->
                    navController.navigate(Routes.lessonDetail(lessonId))
                }
            )
        }

        // جزئیات درس
        composable(
            route = Routes.LESSON_DETAIL,
            arguments = listOf(navArgument("lessonId") { type = NavType.StringType })
        ) { entry ->
            val lessonId = entry.arguments?.getString("lessonId") ?: ""
            LessonDetailScreen(
                lessonId = lessonId,
                onBack = { navController.popBackStack() }
            )
        }

        // کتابخانه گرامر
        composable(Routes.GRAMMAR) {
            GrammarScreen()
        }

        // صفحه پیشرفت
        composable(Routes.PROGRESS) {
            ProgressScreen()
        }

        // صفحه چت هوش مصنوعی
        composable(Routes.AI_CHAT) {
            AIChatScreen()
        }

        // صفحه تنظیمات
        composable(Routes.SETTINGS) {
            SettingsScreen()
        }

        // صفحه پادکست
        composable(Routes.PODCAST) {
            PodcastScreen(
                onPodcastClick = { url, title ->
                    val encodedUrl = java.net.URLEncoder.encode(url, "UTF-8")
                    val encodedTitle = java.net.URLEncoder.encode(title, "UTF-8")
                    navController.navigate("podcast_player/$encodedUrl/$encodedTitle")
                }
            )
        }

        // پخش پادکست
        composable(
            route = Routes.PODCAST_PLAYER,
            arguments = listOf(
                navArgument("url") { type = NavType.StringType },
                navArgument("title") { type = NavType.StringType }
            )
        ) { entry ->
            val encodedUrl = entry.arguments?.getString("url") ?: ""
            val encodedTitle = entry.arguments?.getString("title") ?: ""
            val url = java.net.URLDecoder.decode(encodedUrl, "UTF-8")
            val title = java.net.URLDecoder.decode(encodedTitle, "UTF-8")
            PodcastPlayerScreen(
                podcastUrl = url,
                podcastTitle = title,
                onBack = { navController.popBackStack() }
            )
        }
    }
}