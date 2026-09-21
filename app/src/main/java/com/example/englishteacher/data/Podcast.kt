package com.example.englishteacher.data

enum class PodcastLevel(
    val displayName: String,
    val persianName: String,
    val emoji: String,
    val color: Long
) {
    BEGINNER("Beginner", "مبتدی", "🌱", 0xFF11998E),
    INTERMEDIATE("Intermediate", "متوسط", "🚀", 0xFF8E2DE2),
    ADVANCED("Advanced", "پیشرفته", "🏆", 0xFFF12711)
}

enum class PodcastCategory(
    val displayName: String,
    val persianName: String,
    val emoji: String
) {
    CONVERSATION("Conversation", "مکالمه", "💬"),
    GRAMMAR("Grammar", "گرامر", "📝"),
    VOCABULARY("Vocabulary", "لغات", "📚"),
    STORY("Story", "داستان", "📖"),
    NEWS("News", "اخبار", "📰"),
    CULTURE("Culture", "فرهنگ", "🎭"),
    SCIENCE("Science", "علم", "🔬"),
    IDIOMS("Idioms", "اصطلاحات", "💡"),
    PRONUNCIATION("Pronunciation", "تلفظ", "🗣"),
    HISTORY("History", "تاریخ", "🏛"),
    BUSINESS("Business", "تجاری", "💼"),
    TRAVEL("Travel", "سفر", "✈️")
}

data class Podcast(
    val id: String,
    val title: String,
    val titlePersian: String,
    val description: String,
    val descriptionPersian: String,
    val level: PodcastLevel,
    val category: PodcastCategory,
    val audioUrl: String,
    val durationMinutes: Int,
    val transcript: String = "",
    val transcriptPersian: String = "",
    val vocabulary: List<Word> = emptyList(),
    val coverUrl: String = "",
    val source: String = "VOA Learning English"
)