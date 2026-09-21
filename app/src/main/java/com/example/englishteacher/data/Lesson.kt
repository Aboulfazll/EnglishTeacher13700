package com.example.englishteacher.data

data class Word(
    val english: String,
    val persian: String,
    val pronunciation: String = ""
)

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int
)

data class ConversationLine(
    val speaker: String,
    val english: String,
    val persian: String
)

data class Conversation(
    val title: String,
    val titlePersian: String,
    val lines: List<ConversationLine>
)

// 🆕 بخش هجی کردن (Spelling)
data class SpellingExercise(
    val name: String,
    val spelling: String,
    val persian: String
)

// ⚠️ توجه: کلاس Level از این فایل حذف شد و به فایل Level.kt منتقل شد.

data class Lesson(
    val id: String,
    val unitNumber: Int,
    val title: String,
    val titlePersian: String,
    val level: Level,
    val vocabulary: List<Word>,
    val spelling: List<SpellingExercise> = emptyList(),
    val grammarTitle: String,
    val grammarExplanation: String,
    val grammarExamples: List<String>,
    val conversation: Conversation,
    val storyTitle: String,
    val storyText: String,
    val quiz: List<QuizQuestion>
)