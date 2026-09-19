package com.example.englishteacher.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.englishteacher.data.Level
import com.example.englishteacher.ui.screens.AIChatScreen
import com.example.englishteacher.ui.screens.HomeScreen
import com.example.englishteacher.ui.screens.LessonDetailScreen
import com.example.englishteacher.ui.screens.LessonListScreen
import com.example.englishteacher.ui.screens.ProgressScreen
import com.example.englishteacher.ui.screens.SettingsScreen

object Routes {
    const val HOME = "home"
    const val LESSON_LIST = "lessons/{level}"
    const val LESSON_DETAIL = "lesson/{lessonId}"
    const val PROGRESS = "progress"
    const val AI_CHAT = "ai_chat"
    const val SETTINGS = "settings"

    fun lessonList(level: Level) = "lessons/${level.name}"
    fun lessonDetail(lessonId: String) = "lesson/$lessonId"
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
            HomeScreen(onLevelClick = { level ->
                navController.navigate(Routes.lessonList(level))
            })
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
    }
}