package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "settings")

object SettingsManager {

    private val TEXT_SCALE_KEY = floatPreferencesKey("text_scale")
    private val TTS_SPEED_KEY = floatPreferencesKey("tts_speed")
    private val API_KEY = stringPreferencesKey("api_key")
    private val DARK_MODE_KEY = booleanPreferencesKey("dark_mode")
    private val WORDS_PER_DAY_KEY = intPreferencesKey("words_per_day")
    private val NOTIFICATIONS_ENABLED_KEY = booleanPreferencesKey("notifications_enabled")
    private val NOTIFICATION_HOUR_KEY = intPreferencesKey("notification_hour")
    private val NOTIFICATION_MINUTE_KEY = intPreferencesKey("notification_minute")
    private val VIBRATION_KEY = booleanPreferencesKey("vibration")
    private val SOUND_EFFECTS_KEY = booleanPreferencesKey("sound_effects")
    private val LANGUAGE_KEY = stringPreferencesKey("language")

    // ==================== Text Scale ====================
    fun getTextScale(context: Context): Flow<Float> =
        context.dataStore.data.map { prefs -> prefs[TEXT_SCALE_KEY] ?: 1.0f }

    suspend fun setTextScale(context: Context, scale: Float) {
        context.dataStore.edit { prefs -> prefs[TEXT_SCALE_KEY] = scale }
    }

    // ==================== TTS Speed ====================
    fun getTtsSpeed(context: Context): Flow<Float> =
        context.dataStore.data.map { prefs -> prefs[TTS_SPEED_KEY] ?: 0.85f }

    suspend fun setTtsSpeed(context: Context, speed: Float) {
        context.dataStore.edit { prefs -> prefs[TTS_SPEED_KEY] = speed }
    }

    // ==================== API Key ====================
    fun getApiKey(context: Context): Flow<String> =
        context.dataStore.data.map { prefs -> prefs[API_KEY] ?: "" }

    suspend fun setApiKey(context: Context, key: String) {
        context.dataStore.edit { prefs -> prefs[API_KEY] = key }
    }

    suspend fun clearApiKey(context: Context) {
        context.dataStore.edit { prefs -> prefs.remove(API_KEY) }
    }

    // ==================== Dark Mode ====================
    fun getDarkMode(context: Context): Flow<Boolean> =
        context.dataStore.data.map { prefs -> prefs[DARK_MODE_KEY] ?: false }

    suspend fun setDarkMode(context: Context, enabled: Boolean) {
        context.dataStore.edit { prefs -> prefs[DARK_MODE_KEY] = enabled }
    }

    // ==================== Words Per Day ====================
    fun getWordsPerDay(context: Context): Flow<Int> =
        context.dataStore.data.map { prefs -> prefs[WORDS_PER_DAY_KEY] ?: 10 }

    suspend fun setWordsPerDay(context: Context, count: Int) {
        context.dataStore.edit { prefs -> prefs[WORDS_PER_DAY_KEY] = count }
    }

    // ==================== Notifications ====================
    fun getNotificationsEnabled(context: Context): Flow<Boolean> =
        context.dataStore.data.map { prefs -> prefs[NOTIFICATIONS_ENABLED_KEY] ?: false }

    suspend fun setNotificationsEnabled(context: Context, enabled: Boolean) {
        context.dataStore.edit { prefs -> prefs[NOTIFICATIONS_ENABLED_KEY] = enabled }
    }

    fun getNotificationHour(context: Context): Flow<Int> =
        context.dataStore.data.map { prefs -> prefs[NOTIFICATION_HOUR_KEY] ?: 20 }

    suspend fun setNotificationHour(context: Context, hour: Int) {
        context.dataStore.edit { prefs -> prefs[NOTIFICATION_HOUR_KEY] = hour }
    }

    fun getNotificationMinute(context: Context): Flow<Int> =
        context.dataStore.data.map { prefs -> prefs[NOTIFICATION_MINUTE_KEY] ?: 0 }

    suspend fun setNotificationMinute(context: Context, minute: Int) {
        context.dataStore.edit { prefs -> prefs[NOTIFICATION_MINUTE_KEY] = minute }
    }

    // ==================== Vibration ====================
    fun getVibration(context: Context): Flow<Boolean> =
        context.dataStore.data.map { prefs -> prefs[VIBRATION_KEY] ?: true }

    suspend fun setVibration(context: Context, enabled: Boolean) {
        context.dataStore.edit { prefs -> prefs[VIBRATION_KEY] = enabled }
    }

    // ==================== Sound Effects ====================
    fun getSoundEffects(context: Context): Flow<Boolean> =
        context.dataStore.data.map { prefs -> prefs[SOUND_EFFECTS_KEY] ?: true }

    suspend fun setSoundEffects(context: Context, enabled: Boolean) {
        context.dataStore.edit { prefs -> prefs[SOUND_EFFECTS_KEY] = enabled }
    }

    // ==================== Language ====================
    fun getLanguage(context: Context): Flow<String> =
        context.dataStore.data.map { prefs -> prefs[LANGUAGE_KEY] ?: "fa" }

    suspend fun setLanguage(context: Context, lang: String) {
        context.dataStore.edit { prefs -> prefs[LANGUAGE_KEY] = lang }
    }
}