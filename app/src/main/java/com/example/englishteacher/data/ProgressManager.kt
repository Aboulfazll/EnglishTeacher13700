package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object ProgressManager {

    private val COMPLETED_LESSONS_KEY = stringSetPreferencesKey("completed_lessons")
    private val QUIZ_SCORES_KEY = stringSetPreferencesKey("quiz_scores")
    private val TOTAL_STARS_KEY = intPreferencesKey("total_stars")

    fun getCompletedLessons(context: Context): Flow<Set<String>> {
        return context.dataStore.data.map { prefs ->
            prefs[COMPLETED_LESSONS_KEY] ?: emptySet()
        }
    }

    suspend fun markLessonCompleted(context: Context, lessonId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[COMPLETED_LESSONS_KEY] ?: emptySet()
            prefs[COMPLETED_LESSONS_KEY] = current + lessonId
        }
    }

    fun getQuizScores(context: Context): Flow<Set<String>> {
        return context.dataStore.data.map { prefs ->
            prefs[QUIZ_SCORES_KEY] ?: emptySet()
        }
    }

    suspend fun saveQuizScore(context: Context, lessonId: String, score: Int) {
        context.dataStore.edit { prefs ->
            val current = prefs[QUIZ_SCORES_KEY] ?: emptySet()
            val filtered = current.filter { !it.startsWith("$lessonId:") }.toSet()
            prefs[QUIZ_SCORES_KEY] = filtered + "$lessonId:$score"
        }
    }

    fun getTotalStars(context: Context): Flow<Int> {
        return context.dataStore.data.map { prefs ->
            prefs[TOTAL_STARS_KEY] ?: 0
        }
    }

    suspend fun addStars(context: Context, stars: Int) {
        context.dataStore.edit { prefs ->
            val current = prefs[TOTAL_STARS_KEY] ?: 0
            prefs[TOTAL_STARS_KEY] = current + stars
        }
    }

    suspend fun resetProgress(context: Context) {
        context.dataStore.edit { prefs ->
            prefs[COMPLETED_LESSONS_KEY] = emptySet()
            prefs[QUIZ_SCORES_KEY] = emptySet()
            prefs[TOTAL_STARS_KEY] = 0
        }
    }
}