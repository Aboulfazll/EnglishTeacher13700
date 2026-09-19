package com.example.englishteacher

import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.Locale

class SpeechHelper(context: Context) {

    private var isReady = false

    private val tts = TextToSpeech(context) { status ->
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale.US
            tts.setSpeechRate(0.85f)
            isReady = true
        }
    }

    fun speak(text: String) {
        if (!isReady) return
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "EnglishTeacher")
    }

    fun stop() {
        tts.stop()
    }

    fun close() {
        tts.stop()
        tts.shutdown()
    }
}