package com.example.englishteacher.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.englishteacher.data.Level
import com.example.englishteacher.ui.screens.HomeScreen
import com.example.englishteacher.ui.screens.LessonDetailScreen
import com.example.englishteacher.ui.screens.LessonListScreen

object Routes {
    const val HOME = "home"
    const val LESSON_LIST = "lessons/{level}"
    const val LESSON_DETAIL = "lesson/{lessonId}"

    fun lessonList(level: Level) = "lessons/${level.name}"
    fun lessonDetail(lessonId: String) = "lesson/$lessonId"
}

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.HOME) {

        // صفحه اصلی - انتخاب سطح
        composable(Routes.HOME) {
            HomeScreen(onLevelClick = { level ->
                navController.navigate(Routes.lessonList(level))
            })
        }

        // صفحه لیست دروس یک سطح
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

        // صفحه جزئیات درس (لغات، گرامر، داستان، کوییز)
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
    }
}