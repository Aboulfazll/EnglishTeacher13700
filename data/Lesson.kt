package com.example.englishteacher.data

// مدل یک کلمه (برای بخش لغات)
data class Word(
    val english: String,
    val persian: String,
    val pronunciation: String = ""
)

// مدل یک سوال کوییز
data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int
)

// سطح‌های آموزشی
enum class Level(
    val displayName: String,
    val persianName: String,
    val bookName: String
) {
    BEGINNER("Beginner", "مبتدی", "Top Notch 1"),
    INTERMEDIATE("Intermediate", "متوسط", "Top Notch 2"),
    ADVANCED("Advanced", "پیشرفته", "Top Notch 3")
}

// مدل اصلی یک درس
data class Lesson(
    val id: String,
    val unitNumber: Int,
    val title: String,
    val titlePersian: String,
    val level: Level,
    val vocabulary: List<Word>,
    val grammarTitle: String,
    val grammarExplanation: String,
    val grammarExamples: List<String>,
    val storyTitle: String,
    val storyText: String,
    val quiz: List<QuizQuestion>
)