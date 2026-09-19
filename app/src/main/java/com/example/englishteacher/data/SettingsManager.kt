package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "settings")

object SettingsManager {

    private val TEXT_SCALE_KEY = floatPreferencesKey("text_scale")
    private val TTS_SPEED_KEY = floatPreferencesKey("tts_speed")
    private val API_KEY = stringPreferencesKey("api_key")

    fun getTextScale(context: Context): Flow<Float> {
        return context.dataStore.data.map { prefs ->
            prefs[TEXT_SCALE_KEY] ?: 1.0f
        }
    }

    suspend fun setTextScale(context: Context, scale: Float) {
        context.dataStore.edit { prefs ->
            prefs[TEXT_SCALE_KEY] = scale
        }
    }

    fun getTtsSpeed(context: Context): Flow<Float> {
        return context.dataStore.data.map { prefs ->
            prefs[TTS_SPEED_KEY] ?: 0.85f
        }
    }

    suspend fun setTtsSpeed(context: Context, speed: Float) {
        context.dataStore.edit { prefs ->
            prefs[TTS_SPEED_KEY] = speed
        }
    }

    fun getApiKey(context: Context): Flow<String> {
        return context.dataStore.data.map { prefs ->
            prefs[API_KEY] ?: ""
        }
    }

    suspend fun setApiKey(context: Context, key: String) {
        context.dataStore.edit { prefs ->
            prefs[API_KEY] = key
        }
    }
}