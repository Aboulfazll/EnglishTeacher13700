package com.example.englishteacher.data

data class VideoLesson(
    val id: String,
    val title: String,
    val titlePersian: String,
    val description: String,
    val fileName: String,
    val duration: String,
    val level: String
)

object VideoRepository {

    private val videos = listOf(
        VideoLesson(
            id = "v1",
            title = "Greetings",
            titlePersian = "سلام و احوال‌پرسی",
            description = "یاد بگیر چطور به انگلیسی سلام کنی و احوال‌پرسی کنی.",
            fileName = "lesson_greetings.mp4",
            duration = "4:20",
            level = "Beginner"
        ),
        VideoLesson(
            id = "v2",
            title = "Introductions",
            titlePersian = "معرفی کردن خود",
            description = "چطور خودت رو به دیگران معرفی کنی.",
            fileName = "lesson_introductions.mp4",
            duration = "5:10",
            level = "Beginner"
        ),
        VideoLesson(
            id = "v3",
            title = "Food & Drinks",
            titlePersian = "غذا و نوشیدنی",
            description = "لغات و جملات مربوط به غذا و نوشیدنی.",
            fileName = "lesson_food.mp4",
            duration = "6:00",
            level = "Beginner"
        )
        // 👉 بقیه ویدیوها رو با همین الگو اضافه کن
    )

    fun getAllVideos(): List<VideoLesson> = videos

    fun getVideoById(id: String): VideoLesson? = videos.find { it.id == id }

    fun getVideosByLevel(level: String): List<VideoLesson> =
        videos.filter { it.level.equals(level, ignoreCase = true) }
}