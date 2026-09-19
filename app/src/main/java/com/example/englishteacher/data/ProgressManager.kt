package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Calendar

object ProgressManager {

    private val COMPLETED_LESSONS_KEY = stringSetPreferencesKey("completed_lessons")
    private val QUIZ_SCORES_KEY = stringSetPreferencesKey("quiz_scores")
    private val TOTAL_STARS_KEY = intPreferencesKey("total_stars")
    private val STREAK_COUNT_KEY = intPreferencesKey("streak_count")
    private val LAST_ACTIVE_KEY = longPreferencesKey("last_active_day")

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

    /**
     * به‌روزرسانی استریک بر اساس روز جاری
     */
    suspend fun updateStreak(context: Context) {
        val today = getTodayStart()
        context.dataStore.edit { prefs ->
            val lastDay = prefs[LAST_ACTIVE_KEY] ?: 0L
            val currentStreak = prefs[STREAK_COUNT_KEY] ?: 0

            when {
                lastDay == 0L -> {
                    // اولین بار
                    prefs[STREAK_COUNT_KEY] = 1
                    prefs[LAST_ACTIVE_KEY] = today
                }
                lastDay == today -> {
                    // امروز قبلاً ثبت شده، کاری نکن
                }
                lastDay == today - ONE_DAY_MS -> {
                    // دیروز فعال بود → استریک +1
                    prefs[STREAK_COUNT_KEY] = currentStreak + 1
                    prefs[LAST_ACTIVE_KEY] = today
                }
                else -> {
                    // استریک قطع شده
                    prefs[STREAK_COUNT_KEY] = 1
                    prefs[LAST_ACTIVE_KEY] = today
                }
            }
        }
    }

    /**
     * چک کردن اینکه امروز فعال بوده یا نه
     */
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