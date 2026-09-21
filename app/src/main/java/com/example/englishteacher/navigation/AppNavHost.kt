package com.example.englishteacher.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.englishteacher.data.Level
import com.example.englishteacher.ui.screens.AchievementsScreen
import com.example.englishteacher.ui.screens.AIChatScreen
import com.example.englishteacher.ui.screens.BookmarkedStoriesScreen
import com.example.englishteacher.ui.screens.BookmarkedWordsScreen
import com.example.englishteacher.ui.screens.DailyQuizScreen
import com.example.englishteacher.ui.screens.DailySentencesScreen
import com.example.englishteacher.ui.screens.FlashcardScreen
import com.example.englishteacher.ui.screens.GrammarQuizScreen
import com.example.englishteacher.ui.screens.GrammarScreen
import com.example.englishteacher.ui.screens.GroupQuizScreen
import com.example.englishteacher.ui.screens.HomeScreen
import com.example.englishteacher.ui.screens.LessonDetailScreen
import com.example.englishteacher.ui.screens.LessonListScreen
import com.example.englishteacher.ui.screens.LevelTestScreen
import com.example.englishteacher.ui.screens.PodcastPlayerScreen
import com.example.englishteacher.ui.screens.PodcastScreen
import com.example.englishteacher.ui.screens.ProfileScreen
import com.example.englishteacher.ui.screens.ProgressScreen
import com.example.englishteacher.ui.screens.ReadingModeScreen
import com.example.englishteacher.ui.screens.SettingsScreen
import com.example.englishteacher.ui.screens.SpeakingPracticeScreen
import com.example.englishteacher.ui.screens.StoryBookScreen
import com.example.englishteacher.ui.screens.StoryDetailScreen
import com.example.englishteacher.ui.screens.VocabularyBankScreen

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
    const val GRAMMAR_QUIZ = "grammar_quiz"
    const val STORY_BOOK = "story_book"
    const val STORY_DETAIL = "story_detail/{storyId}"
    const val VOCABULARY_BANK = "vocabulary_bank"
    const val LEVEL_TEST = "level_test"
    const val PROFILE = "profile"
    const val BOOKMARKED_WORDS = "bookmarked_words"
    const val BOOKMARKED_STORIES = "bookmarked_stories"
    const val DAILY_SENTENCES = "daily_sentences"
    const val DAILY_QUIZ = "daily_quiz"
    const val FLASHCARD = "flashcard/{mode}"
    const val ACHIEVEMENTS = "achievements"
    const val READING_MODE = "reading_mode/{lessonId}/{categoryId}"
    const val GROUP_QUIZ = "group_quiz/{level}/{groupIndex}"
    const val SPEAKING_PRACTICE = "speaking_practice"

    fun lessonList(level: Level) = "lessons/${level.name}"
    fun lessonDetail(lessonId: String) = "lesson/$lessonId"
    fun podcastPlayer(url: String, title: String) = "podcast_player/$url/$title"
    fun storyDetail(storyId: String) = "story_detail/$storyId"
    fun groupQuiz(level: Level, groupIndex: Int) = "group_quiz/${level.name}/$groupIndex"
    fun flashcard(mode: String) = "flashcard/$mode"
    fun readingMode(lessonId: String = "", categoryId: String = "") =
        "reading_mode/$lessonId/$categoryId"
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
        composable(Routes.HOME) {
            HomeScreen(
                onLevelClick = { level ->
                    navController.navigate(Routes.lessonList(level))
                },
                onGrammarClick = {
                    navController.navigate(Routes.GRAMMAR)
                },
                onStoryBookClick = {
                    navController.navigate(Routes.STORY_BOOK)
                },
                onVocabularyBankClick = {
                    navController.navigate(Routes.VOCABULARY_BANK)
                },
                onLevelTestClick = {
                    navController.navigate(Routes.LEVEL_TEST)
                },
                onBookmarkedWordsClick = {
                    navController.navigate(Routes.BOOKMARKED_WORDS)
                },
                onDailySentencesClick = {
                    navController.navigate(Routes.DAILY_SENTENCES)
                },
                onBookmarkedStoriesClick = {
                    navController.navigate(Routes.BOOKMARKED_STORIES)
                },
                onAchievementsClick = {
                    navController.navigate(Routes.ACHIEVEMENTS)
                },
                onSpeakingClick = {
                    navController.navigate(Routes.SPEAKING_PRACTICE)
                },
                onAiChatClick = {
                    navController.navigate(Routes.AI_CHAT)
                },
                onSettingsClick = {
                    navController.navigate(Routes.SETTINGS)
                },
                onProfileClick = {
                    navController.navigate(Routes.PROFILE)
                },
                onPodcastClick = {
                    navController.navigate(Routes.PODCAST)
                },
                onDailyQuizClick = {
                    navController.navigate(Routes.DAILY_QUIZ)
                }
            )
        }

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
                },
                onGroupQuizClick = { groupIndex ->
                    navController.navigate(Routes.groupQuiz(level, groupIndex))
                }
            )
        }

        composable(
            route = Routes.LESSON_DETAIL,
            arguments = listOf(navArgument("lessonId") { type = NavType.StringType })
        ) { entry ->
            val lessonId = entry.arguments?.getString("lessonId") ?: ""
            LessonDetailScreen(
                lessonId = lessonId,
                onBack = { navController.popBackStack() },
                onStartReading = {
                    navController.navigate(Routes.readingMode(lessonId = lessonId))
                }
            )
        }

        composable(
            route = Routes.GROUP_QUIZ,
            arguments = listOf(
                navArgument("level") { type = NavType.StringType },
                navArgument("groupIndex") { type = NavType.IntType }
            )
        ) { entry ->
            val levelName = entry.arguments?.getString("level") ?: Level.BEGINNER.name
            val level = Level.valueOf(levelName)
            val groupIndex = entry.arguments?.getInt("groupIndex") ?: 0
            GroupQuizScreen(
                level = level,
                groupIndex = groupIndex,
                onBack = { navController.popBackStack() },
                onPassed = { navController.popBackStack() }
            )
        }

        composable(Routes.GRAMMAR) {
            GrammarScreen(
                onStartQuiz = {
                    navController.navigate(Routes.GRAMMAR_QUIZ)
                }
            )
        }

        composable(Routes.GRAMMAR_QUIZ) {
            GrammarQuizScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.VOCABULARY_BANK) {
            VocabularyBankScreen(
                onStartFlashcard = { mode ->
                    navController.navigate(Routes.flashcard(mode))
                }
            )
        }

        composable(
            route = Routes.FLASHCARD,
            arguments = listOf(navArgument("mode") { type = NavType.StringType })
        ) { entry ->
            val mode = entry.arguments?.getString("mode") ?: "all"
            FlashcardScreen(
                mode = mode,
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.LEVEL_TEST) {
            LevelTestScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.STORY_BOOK) {
            StoryBookScreen(
                onStoryClick = { storyId ->
                    navController.navigate(Routes.storyDetail(storyId))
                }
            )
        }

        composable(
            route = Routes.STORY_DETAIL,
            arguments = listOf(navArgument("storyId") { type = NavType.StringType })
        ) { entry ->
            val storyId = entry.arguments?.getString("storyId") ?: ""
            StoryDetailScreen(
                storyId = storyId,
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.PROGRESS) {
            ProgressScreen()
        }

        composable(Routes.PROFILE) {
            ProfileScreen()
        }

        composable(Routes.BOOKMARKED_WORDS) {
            BookmarkedWordsScreen()
        }

        composable(Routes.BOOKMARKED_STORIES) {
            BookmarkedStoriesScreen(
                onStoryClick = { storyId ->
                    navController.navigate(Routes.storyDetail(storyId))
                }
            )
        }

        composable(Routes.ACHIEVEMENTS) {
            AchievementsScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.AI_CHAT) {
            AIChatScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.SETTINGS) {
            SettingsScreen(onBack = { navController.popBackStack() })
        }

        composable(Routes.PODCAST) {
            PodcastScreen(
                onPodcastClick = { url, title ->
                    val encodedUrl = java.net.URLEncoder.encode(url, "UTF-8")
                    val encodedTitle = java.net.URLEncoder.encode(title, "UTF-8")
                    navController.navigate("podcast_player/$encodedUrl/$encodedTitle")
                }
            )
        }

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

        composable(Routes.DAILY_SENTENCES) {
            DailySentencesScreen(
                onStartQuiz = {
                    navController.navigate(Routes.DAILY_QUIZ)
                },
                onStartReading = { categoryId ->
                    navController.navigate(Routes.readingMode(categoryId = categoryId))
                }
            )
        }

        composable(Routes.DAILY_QUIZ) {
            DailyQuizScreen(onBack = { navController.popBackStack() })
        }

        composable(
            route = Routes.READING_MODE,
            arguments = listOf(
                navArgument("lessonId") { type = NavType.StringType },
                navArgument("categoryId") { type = NavType.StringType }
            )
        ) { entry ->
            val lessonId = entry.arguments?.getString("lessonId") ?: ""
            val categoryId = entry.arguments?.getString("categoryId") ?: ""
            ReadingModeScreen(
                lessonId = lessonId,
                categoryId = categoryId,
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.SPEAKING_PRACTICE) {
            SpeakingPracticeScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}