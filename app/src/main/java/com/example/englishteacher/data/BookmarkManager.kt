package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object BookmarkManager {

    private val BOOKMARKED_WORDS_KEY = stringSetPreferencesKey("bookmarked_words")

    fun getBookmarkedWords(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs ->
            prefs[BOOKMARKED_WORDS_KEY] ?: emptySet()
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
}