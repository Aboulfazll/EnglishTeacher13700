package com.example.englishteacher

import android.content.Context
import android.os.Bundle
import android.speech.tts.TextToSpeech
import java.util.Locale

class SpeechHelper(context: Context) : TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var currentSpeed = 0.9f
    private var currentPitch = 1.0f
    private var isUK = false

    init {
        tts = TextToSpeech(context, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val locale = if (isUK) Locale.UK else Locale.US
            val result = tts?.setLanguage(locale)
            if (result != TextToSpeech.LANG_MISSING_DATA && result != TextToSpeech.LANG_NOT_SUPPORTED) {
                isReady = true
                tts?.setSpeechRate(currentSpeed)
                tts?.setPitch(currentPitch)
            }
        }
    }

    fun speak(text: String) {
        if (isReady && text.isNotBlank()) {
            // 🔑 استفاده از Bundle برای اعمال قطعی سرعت و زیر و بمی
            val params = Bundle()
            params.putFloat(TextToSpeech.Engine.KEY_PARAM_RATE, currentSpeed)
            params.putFloat(TextToSpeech.Engine.KEY_PARAM_PITCH, currentPitch)
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, params, null)
        }
    }

    // برای StoryDetail, ReadingMode, LessonDetail
    fun stop() {
        tts?.stop()
    }

    fun setSpeed(speed: Float) {
        currentSpeed = speed
        if (isReady) {
            tts?.setSpeechRate(speed)
        }
    }

    fun setAccent(uk: Boolean) {
        isUK = uk
        val locale = if (uk) Locale.UK else Locale.US
        tts?.setLanguage(locale)
    }

    // برای SettingsScreen و SpeakingPracticeScreen
    fun setVoiceGender(gender: String) {
        val pitch = if (gender.lowercase() == "male") 0.8f else 1.2f
        currentPitch = pitch
        if (isReady) {
            tts?.setPitch(pitch)
        }
    }

    // برای SettingsScreen و SpeakingPracticeScreen
    fun setSpeedAndPitch(speed: Float, pitch: Float) {
        currentSpeed = speed
        currentPitch = pitch
        if (isReady) {
            tts?.setSpeechRate(speed)
            tts?.setPitch(pitch)
        }
    }

    fun close() {
        tts?.stop()
        tts?.shutdown()
    }
}