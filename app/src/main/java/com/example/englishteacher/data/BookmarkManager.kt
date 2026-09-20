package com.example.englishteacher

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object BookmarkManager {

    private val BOOKMARKED_WORDS_KEY = stringSetPreferencesKey("bookmarked_words")
    private val BOOKMARKED_STORIES_KEY = stringSetPreferencesKey("bookmarked_stories")

    // ==================== کلمات ====================

    fun getBookmarkedWords(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs ->
            prefs[BOOKMARKED_WORDS_KEY] ?: emptySet()
        }

    fun isWordBookmarked(context: Context, wordEnglish: String): Flow<Boolean> =
        context.dataStore.data.map { prefs ->
            (prefs[BOOKMARKED_WORDS_KEY] ?: emptySet()).contains(wordEnglish)
        }

    suspend fun toggleBookmark(context: Context, wordEnglish: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[BOOKMARKED_WORDS_KEY] ?: emptySet()
            prefs[BOOKMARKED_WORDS_KEY] = if (current.contains(wordEnglish)) {
                current - wordEnglish
            } else {
                current + wordEnglish
            }
        }
    }

    suspend fun removeBookmark(context: Context, wordEnglish: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[BOOKMARKED_WORDS_KEY] ?: emptySet()
            prefs[BOOKMARKED_WORDS_KEY] = current - wordEnglish
        }
    }

    suspend fun clearAll(context: Context) {
        context.dataStore.edit { prefs ->
            prefs[BOOKMARKED_WORDS_KEY] = emptySet()
        }
    }

    // ==================== داستان‌ها ====================

    fun getBookmarkedStories(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs ->
            prefs[BOOKMARKED_STORIES_KEY] ?: emptySet()
        }

    fun isStoryBookmarked(context: Context, storyId: String): Flow<Boolean> =
        context.dataStore.data.map { prefs ->
            (prefs[BOOKMARKED_STORIES_KEY] ?: emptySet()).contains(storyId)
        }

    suspend fun toggleStoryBookmark(context: Context, storyId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[BOOKMARKED_STORIES_KEY] ?: emptySet()
            prefs[BOOKMARKED_STORIES_KEY] = if (current.contains(storyId)) {
                current - storyId
            } else {
                current + storyId
            }
        }
    }

    suspend fun removeStoryBookmark(context: Context, storyId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[BOOKMARKED_STORIES_KEY] ?: emptySet()
            prefs[BOOKMARKED_STORIES_KEY] = current - storyId
        }
    }

    suspend fun clearAllStories(context: Context) {
        context.dataStore.edit { prefs ->
            prefs[BOOKMARKED_STORIES_KEY] = emptySet()
        }
    }
}