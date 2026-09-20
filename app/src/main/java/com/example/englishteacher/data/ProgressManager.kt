package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import java.util.Calendar

object ProgressManager {

    private val COMPLETED_LESSONS_KEY = stringSetPreferencesKey("completed_lessons")
    private val QUIZ_SCORES_KEY = stringSetPreferencesKey("quiz_scores")
    private val GROUP_SCORES_KEY = stringSetPreferencesKey("group_scores")
    private val STORIES_READ_KEY = stringSetPreferencesKey("stories_read")
    private val GRAMMAR_VIEWED_KEY = stringSetPreferencesKey("grammar_viewed")
    private val SENTENCES_VIEWED_KEY = stringSetPreferencesKey("sentences_viewed")
    private val TOTAL_STARS_KEY = intPreferencesKey("total_stars")
    private val STREAK_COUNT_KEY = intPreferencesKey("streak_count")
    private val LAST_ACTIVE_KEY = longPreferencesKey("last_active_day")

    const val GROUP_SIZE = 3
    const val PASSING_SCORE = 90

    // ==================== Completed Lessons ====================
    fun getCompletedLessons(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs -> prefs[COMPLETED_LESSONS_KEY] ?: emptySet() }

    suspend fun markLessonCompleted(context: Context, lessonId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[COMPLETED_LESSONS_KEY] ?: emptySet()
            prefs[COMPLETED_LESSONS_KEY] = current + lessonId
        }
        updateStreak(context)
    }

    // ==================== Quiz Scores ====================
    fun getQuizScores(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs -> prefs[QUIZ_SCORES_KEY] ?: emptySet() }

    suspend fun saveQuizScore(context: Context, lessonId: String, score: Int) {
        context.dataStore.edit { prefs ->
            val current = prefs[QUIZ_SCORES_KEY] ?: emptySet()
            val filtered = current.filter { !it.startsWith("$lessonId:") }.toSet()
            prefs[QUIZ_SCORES_KEY] = filtered + "$lessonId:$score"
        }
        updateStreak(context)
    }

    // ==================== Group Scores ====================
    suspend fun saveGroupScore(context: Context, level: Level, groupIndex: Int, score: Int) {
        val key = "${level.name}_g$groupIndex"
        context.dataStore.edit { prefs ->
            val current = prefs[GROUP_SCORES_KEY] ?: emptySet()
            val filtered = current.filter { !it.startsWith("$key:") }.toSet()
            prefs[GROUP_SCORES_KEY] = filtered + "$key:$score"
        }
        updateStreak(context)
    }

    fun getGroupScore(context: Context, level: Level, groupIndex: Int): Flow<Int?> =
        context.dataStore.data.map { prefs ->
            val current = prefs[GROUP_SCORES_KEY] ?: emptySet()
            val key = "${level.name}_g$groupIndex"
            current.firstOrNull { it.startsWith("$key:") }
                ?.substringAfter(":")
                ?.toIntOrNull()
        }

    fun getAllGroupScores(context: Context): Flow<Map<String, Int>> =
        context.dataStore.data.map { prefs ->
            val raw = prefs[GROUP_SCORES_KEY] ?: emptySet()
            raw.mapNotNull { entry ->
                val parts = entry.split(":")
                if (parts.size == 2) {
                    val score = parts[1].toIntOrNull()
                    if (score != null) parts[0] to score else null
                } else null
            }.toMap()
        }

    fun isGroupPassed(context: Context, level: Level, groupIndex: Int): Flow<Boolean> =
        getGroupScore(context, level, groupIndex).map { (it ?: 0) >= PASSING_SCORE }

    fun isGroupUnlocked(context: Context, level: Level, groupIndex: Int): Flow<Boolean> {
        if (groupIndex == 0) return flowOf(true)
        return isGroupPassed(context, level, groupIndex - 1)
    }

    fun isLessonUnlocked(context: Context, level: Level, lessonIndex: Int): Flow<Boolean> {
        val groupIndex = lessonIndex / GROUP_SIZE
        return isGroupUnlocked(context, level, groupIndex)
    }

    // ==================== Stories Read ====================
    fun getStoriesRead(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs -> prefs[STORIES_READ_KEY] ?: emptySet() }

    suspend fun markStoryRead(context: Context, storyId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[STORIES_READ_KEY] ?: emptySet()
            prefs[STORIES_READ_KEY] = current + storyId
        }
        updateStreak(context)
    }

    // ==================== Grammar Viewed ====================
    fun getGrammarViewed(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs -> prefs[GRAMMAR_VIEWED_KEY] ?: emptySet() }

    suspend fun markGrammarViewed(context: Context, topicId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[GRAMMAR_VIEWED_KEY] ?: emptySet()
            prefs[GRAMMAR_VIEWED_KEY] = current + topicId
        }
        updateStreak(context)
    }

    // ==================== Sentences Viewed ====================
    fun getSentencesCategoriesViewed(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs -> prefs[SENTENCES_VIEWED_KEY] ?: emptySet() }

    suspend fun markSentencesCategoryViewed(context: Context, categoryId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[SENTENCES_VIEWED_KEY] ?: emptySet()
            prefs[SENTENCES_VIEWED_KEY] = current + categoryId
        }
        updateStreak(context)
    }

    // ==================== Total Stars ====================
    fun getTotalStars(context: Context): Flow<Int> =
        context.dataStore.data.map { prefs -> prefs[TOTAL_STARS_KEY] ?: 0 }

    suspend fun addStars(context: Context, stars: Int) {
        context.dataStore.edit { prefs ->
            val current = prefs[TOTAL_STARS_KEY] ?: 0
            prefs[TOTAL_STARS_KEY] = current + stars
        }
    }

    // ==================== Streak ====================
    fun getStreak(context: Context): Flow<Int> =
        context.dataStore.data.map { prefs -> prefs[STREAK_COUNT_KEY] ?: 0 }

    fun getLastActiveDay(context: Context): Flow<Long> =
        context.dataStore.data.map { prefs -> prefs[LAST_ACTIVE_KEY] ?: 0L }

    suspend fun updateStreak(context: Context) {
        val today = getTodayStart()
        context.dataStore.edit { prefs ->
            val lastDay = prefs[LAST_ACTIVE_KEY] ?: 0L
            val currentStreak = prefs[STREAK_COUNT_KEY] ?: 0

            when {
                lastDay == 0L -> {
                    prefs[STREAK_COUNT_KEY] = 1
                    prefs[LAST_ACTIVE_KEY] = today
                }
                lastDay == today -> { }
                lastDay == today - ONE_DAY_MS -> {
                    prefs[STREAK_COUNT_KEY] = currentStreak + 1
                    prefs[LAST_ACTIVE_KEY] = today
                }
                else -> {
                    prefs[STREAK_COUNT_KEY] = 1
                    prefs[LAST_ACTIVE_KEY] = today
                }
            }
        }
    }

    fun isActiveToday(context: Context): Flow<Boolean> =
        context.dataStore.data.map { prefs ->
            val lastDay = prefs[LAST_ACTIVE_KEY] ?: 0L
            lastDay == getTodayStart()
        }

    // ==================== Reset ====================
    suspend fun resetProgress(context: Context) {
        context.dataStore.edit { prefs ->
            prefs[COMPLETED_LESSONS_KEY] = emptySet()
            prefs[QUIZ_SCORES_KEY] = emptySet()
            prefs[GROUP_SCORES_KEY] = emptySet()
            prefs[STORIES_READ_KEY] = emptySet()
            prefs[GRAMMAR_VIEWED_KEY] = emptySet()
            prefs[SENTENCES_VIEWED_KEY] = emptySet()
            prefs[TOTAL_STARS_KEY] = 0
            prefs[STREAK_COUNT_KEY] = 0
            prefs[LAST_ACTIVE_KEY] = 0L
        }
    }

    // ==================== Helpers ====================
    private const val ONE_DAY_MS = 24L * 60 * 60 * 1000

    private fun getTodayStart(): Long {
        val cal = Calendar.getInstance()
        cal.set(Calendar.HOUR_OF_DAY, 0)
        cal.set(Calendar.MINUTE, 0)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        return cal.timeInMillis
    }
}