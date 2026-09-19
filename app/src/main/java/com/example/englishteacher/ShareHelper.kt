package com.example.englishteacher

import android.content.Context
import android.content.Intent

object ShareHelper {

    /**
     * اشتراک‌گذاری یک لغت
     */
    fun shareWord(context: Context, english: String, persian: String, pronunciation: String = "") {
        val text = buildString {
            append("📖 لغت انگلیسی\n\n")
            append("🔤 $english\n")
            if (pronunciation.isNotEmpty()) {
                append("🗣️ /$pronunciation/\n")
            }
            append("🇮🇷 $persian\n\n")
            append("--- از اپلیکیشن English Teacher ---")
        }
        shareText(context, text)
    }

    /**
     * اشتراک‌گذاری یک داستان
     */
    fun shareStory(
        context: Context,
        title: String,
        titlePersian: String,
        text: String,
        moral: String
    ) {
        val shareText = buildString {
            append("📚 داستان کوتاه\n\n")
            append("📖 $title\n")
            append("🇮🇷 $titlePersian\n\n")
            append("$text\n\n")
            append("💡 $moral\n\n")
            append("--- از اپلیکیشن English Teacher ---")
        }
        shareText(context, shareText)
    }

    /**
     * اشتراک‌گذاری یک درس
     */
    fun shareLesson(context: Context, title: String, titlePersian: String, lessonLevel: String) {
        val text = buildString {
            append("📚 درس جدید از English Teacher\n\n")
            append("📖 $title\n")
            append("🇮🇷 $titlePersian\n")
            append("🎯 سطح: $lessonLevel\n\n")
            append("--- از اپلیکیشن English Teacher ---")
        }
        shareText(context, text)
    }

    /**
     * اشتراک‌گذاری گرامر
     */
    fun shareGrammar(
        context: Context,
        title: String,
        titlePersian: String,
        explanation: String,
        examples: List<String>
    ) {
        val text = buildString {
            append("📖 گرامر انگلیسی\n\n")
            append("🔤 $title\n")
            append("🇮🇷 $titlePersian\n\n")
            append("$explanation\n\n")
            append("✏️ مثال‌ها:\n")
            examples.forEach { append("• $it\n") }
            append("\n--- از اپلیکیشن English Teacher ---")
        }
        shareText(context, text)
    }

    /**
     * اشتراک‌گذاری متن ساده
     */
    private fun shareText(context: Context, text: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }
        val chooser = Intent.createChooser(intent, "اشتراک‌گذاری با...")
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(chooser)
    }
}