package com.example.englishteacher.data

enum class Level(
    val displayName: String,
    val persianName: String,
    val bookName: String
) {
    BEGINNER("Beginner", "مبتدی", "Top Notch Fundamentals"),
    INTERMEDIATE("Intermediate", "متوسط", "Top Notch 1"),
    ADVANCED("Advanced", "پیشرفته", "Top Notch 2")
}