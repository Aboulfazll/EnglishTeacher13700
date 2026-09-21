package com.example.englishteacher.data

/**
 * یک سوال کوییز پایان فصل
 */
data class ChapterQuizQuestion(
    val question: String,
    val questionPersian: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String = ""
)

/**
 * مدل فصل داستان
 */
data class StoryChapter(
    val number: Int,
    val title: String,
    val titlePersian: String,
    val text: String,
    val textPersian: String,
    val vocabulary: List<Word> = emptyList(),
    val imageUrl: String? = null,
    val quiz: List<ChapterQuizQuestion> = emptyList()
)

/**
 * مدل داستان با پشتیبانی از فصل‌ها
 */
data class Story(
    val id: String,
    val title: String,
    val titlePersian: String,
    val level: Level,
    val coverUrl: String,
    val text: String,
    val moral: String,
    val moralPersian: String,
    val chapters: List<StoryChapter> = emptyList()
) {
    val totalWords: Int
        get() {
            if (chapters.isEmpty()) {
                return text.split(Regex("\\s+")).size
            }
            return chapters.sumOf { it.text.split(Regex("\\s+")).size }
        }

    val readingMinutes: Int
        get() = (totalWords / 150.0).toInt().coerceAtLeast(1)

    val hasChapters: Boolean
        get() = chapters.isNotEmpty()
}