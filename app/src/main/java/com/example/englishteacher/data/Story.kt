package com.example.englishteacher.data

data class Story(
    val id: String, // تغییر از Int به String
    val title: String,
    val titlePersian: String,
    val level: Level, // تغییر از String به Level
    val coverUrl: String,
    val text: String,
    val moral: String,
    val moralPersian: String
)