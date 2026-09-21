package com.example.englishteacher.data

data class Story(
    val id: Int,
    val title: String,
    val titlePersian: String,
    val level: String, // اگر در کدهایتان level را عددی (Int) تعریف کرده‌اید، این را به Int تغییر دهید
    val coverUrl: String,
    val text: String,
    val moral: String,
    val moralPersian: String
)