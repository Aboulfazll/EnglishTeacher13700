package com.example.englishteacher

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import java.util.Locale

class SpeechRecognitionHelper(
    private val context: Context,
    private val onResult: (String) -> Unit,
    private val onError: (String) -> Unit,
    private val onReady: () -> Unit,
    private val onEnd: () -> Unit
) {

    private var speechRecognizer: SpeechRecognizer? = null
    private var isListening = false

    init {
        if (SpeechRecognizer.isRecognitionAvailable(context)) {
            speechRecognizer = SpeechRecognizer.createSpeechRecognizer(context).apply {
                setRecognitionListener(object : RecognitionListener {

                    override fun onReadyForSpeech(params: Bundle?) {
                        isListening = true
                        onReady()
                    }

                    override fun onBeginningOfSpeech() {}

                    override fun onRmsChanged(rmsdB: Float) {}

                    override fun onBufferReceived(buffer: ByteArray?) {}

                    override fun onEndOfSpeech() {
                        isListening = false
                        onEnd()
                    }

                    override fun onError(error: Int) {
                        isListening = false
                        val message = when (error) {
                            SpeechRecognizer.ERROR_AUDIO -> "خطای صوتی"
                            SpeechRecognizer.ERROR_CLIENT -> "خطای کاربر"
                            SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS -> "دسترسی میکروفون داده نشده"
                            SpeechRecognizer.ERROR_NETWORK -> "خطای شبکه"
                            SpeechRecognizer.ERROR_NETWORK_TIMEOUT -> "اتمام زمان شبکه"
                            SpeechRecognizer.ERROR_NO_MATCH -> "چیزی تشخیص داده نشد. دوباره امتحان کن"
                            SpeechRecognizer.ERROR_RECOGNIZER_BUSY -> "سیستم مشغول است"
                            SpeechRecognizer.ERROR_SERVER -> "خطای سرور"
                            SpeechRecognizer.ERROR_SPEECH_TIMEOUT -> "زمان صحبت تمام شد"
                            else -> "خطای ناشناخته"
                        }
                        onError(message)
                    }

                    override fun onResults(results: Bundle?) {
                        isListening = false
                        val matches = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                        if (!matches.isNullOrEmpty()) {
                            onResult(matches[0])
                        } else {
                            onError("چیزی تشخیص داده نشد")
                        }
                    }

                    override fun onPartialResults(partialResults: Bundle?) {}

                    override fun onEvent(eventType: Int, params: Bundle?) {}
                })
            }
        } else {
            onError("سیستم تشخیص صدا در این دستگاه موجود نیست")
        }
    }

    fun startListening(languageTag: String = "en-US") {
        if (speechRecognizer == null) {
            onError("سیستم تشخیص صدا آماده نیست")
            return
        }
        if (isListening) return

        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
            )
            putExtra(RecognizerIntent.EXTRA_LANGUAGE, languageTag)
            putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, languageTag)
            putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE, languageTag)
            putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, false)
            putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1)
            putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, context.packageName)
        }
        speechRecognizer?.startListening(intent)
    }

    fun stopListening() {
        speechRecognizer?.stopListening()
        isListening = false
    }

    fun destroy() {
        speechRecognizer?.destroy()
        speechRecognizer = null
    }

    fun isAvailable(): Boolean = SpeechRecognizer.isRecognitionAvailable(context)

    fun isCurrentlyListening(): Boolean = isListening
}