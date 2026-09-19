package com.example.englishteacher.data

data class Podcast(
    val id: String,
    val title: String,
    val titlePersian: String,
    val category: String,
    val url: String,
    val episodeCount: Int,
    val color1: Long,
    val color2: Long
)

object PodcastRepository {

    fun getAllPodcasts(): List<Podcast> = listOf(

        Podcast(
            id = "bbc_6min",
            title = "BBC 6 Minute English",
            titlePersian = "انگلیسی ۶ دقیقه‌ای BBC",
            category = "📚 آموزش زبان",
            url = "https://www.bbc.co.uk/learningenglish/english/features/6-minute-english",
            episodeCount = 200,
            color1 = 0xFFB71C1C,
            color2 = 0xFFE53935
        ),
        Podcast(
            id = "eslpod",
            title = "ESL Pod",
            titlePersian = "پادکست آموزش انگلیسی",
            category = "📚 آموزش زبان",
            url = "https://www.eslpod.com/website/index_new.html",
            episodeCount = 1500,
            color1 = 0xFF00838F,
            color2 = 0xFF00ACC1
        ),
        Podcast(
            id = "all_ears",
            title = "All Ears English",
            titlePersian = "انگلیسی با تمام گوش",
            category = "📚 آموزش زبان",
            url = "https://www.allearsenglish.com/episodes/",
            episodeCount = 1000,
            color1 = 0xFFF9A825,
            color2 = 0xFFFBC02D
        ),
        Podcast(
            id = "english_conversation",
            title = "English Conversation",
            titlePersian = "مکالمه انگلیسی روزمره",
            category = "💬 مکالمه",
            url = "https://www.bbc.co.uk/learningenglish/english/features/english-at-work",
            episodeCount = 100,
            color1 = 0xFF7B1FA2,
            color2 = 0xFF9C27B0
        ),
        Podcast(
            id = "culips",
            title = "Culips ESL Podcast",
            titlePersian = "کولیپس",
            category = "💬 مکالمه",
            url = "https://culips.com/",
            episodeCount = 800,
            color1 = 0xFF283593,
            color2 = 0xFF3F51B5
        ),
        Podcast(
            id = "ielts_energy",
            title = "IELTS Energy 7+",
            titlePersian = "انرژی آیلتس ۷+",
            category = "🎓 آمادگی آیلتس",
            url = "https://www.allearsenglish.com/category/ielts-energy/",
            episodeCount = 500,
            color1 = 0xFF000000,
            color2 = 0xFF424242
        ),
        Podcast(
            id = "ielts_speaking",
            title = "IELTS Speaking",
            titlePersian = "مکالمه آیلتس",
            category = "🎓 آمادگی آیلتس",
            url = "https://www.ieltsspeaking.co.uk/ielts-speaking-podcast/",
            episodeCount = 200,
            color1 = 0xFFD84315,
            color2 = 0xFFF4511E
        ),
        Podcast(
            id = "effortless_english",
            title = "Effortless English",
            titlePersian = "انگلیسی بدون زحمت",
            category = "🎬 سرگرمی و داستان",
            url = "https://effortlessenglishclub.com/",
            episodeCount = 300,
            color1 = 0xFF2E7D32,
            color2 = 0xFF43A047
        ),
        Podcast(
            id = "english_class_101",
            title = "EnglishClass101",
            titlePersian = "انگلیسی ۱۰۱",
            category = "🎬 سرگرمی و داستان",
            url = "https://www.englishclass101.com/",
            episodeCount = 1000,
            color1 = 0xFF3949AB,
            color2 = 0xFF5C6BC0
        ),
        Podcast(
            id = "voa_learning",
            title = "VOA Learning English",
            titlePersian = "یادگیری انگلیسی VOA",
            category = "🎬 سرگرمی و داستان",
            url = "https://learningenglish.voanews.com/",
            episodeCount = 2000,
            color1 = 0xFF00695C,
            color2 = 0xFF00897B
        )
    )
}