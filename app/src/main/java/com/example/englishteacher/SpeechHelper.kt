package com.example.englishteacher

import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.Locale

class SpeechHelper(context: Context) : TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var currentSpeed = 0.9f
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
                tts?.setPitch(1.0f)
            }
        }
    }

    fun speak(text: String) {
        if (isReady && text.isNotBlank()) {
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }

    fun setSpeed(speed: Float) {
        currentSpeed = speed
        tts?.setSpeechRate(speed)
    }

    fun setAccent(uk: Boolean) {
        isUK = uk
        val locale = if (uk) Locale.UK else Locale.US
        tts?.setLanguage(locale)
    }

    fun close() {
        tts?.stop()
        tts?.shutdown()
    }
}