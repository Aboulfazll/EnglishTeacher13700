package com.example.englishteacher

import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.Locale

class SpeechHelper(context: Context) : TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null
    private var isReady = false

    private var speed: Float = 1.0f
    private var pitch: Float = 1.0f
    private var gender: String = "female"

    init {
        tts = TextToSpeech(context, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts?.language = Locale.US
            isReady = true
            applySettings()
        }
    }

    fun setSpeedAndPitch(speed: Float, pitch: Float) {
        this.speed = speed.coerceIn(0.5f, 2.0f)
        this.pitch = pitch.coerceIn(0.5f, 1.5f)
        applySettings()
    }

    fun setVoiceGender(gender: String) {
        this.gender = gender
        applySettings()
    }

    private fun applySettings() {
        if (!isReady) return
        tts?.setSpeechRate(speed)
        tts?.setPitch(
            when (gender) {
                "female" -> pitch + 0.15f
                "male" -> (pitch - 0.2f).coerceAtLeast(0.5f)
                else -> pitch
            }
        )
    }

    fun speak(text: String) {
        if (!isReady) return
        tts?.stop()
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "utt_${System.currentTimeMillis()}")
    }

    fun stop() {
        tts?.stop()
    }

    fun isSpeaking(): Boolean = tts?.isSpeaking == true

    fun close() {
        tts?.stop()
        tts?.shutdown()
        tts = null
        isReady = false
    }
}