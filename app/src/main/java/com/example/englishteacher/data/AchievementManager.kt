package com.example.englishteacher.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Achievement(
    val id: String,
    val title: String,
    val titlePersian: String,
    val description: String,
    val emoji: String,
    val category: AchievementCategory,
    val target: Int,
    val color: Long
)

enum class AchievementCategory(
    val displayName: String,
    val emoji: String
) {
    PROGRESS("پیشرفت", "📈"),
    STREAK("استمرار", "🔥"),
    CONTENT("محتوا", "📚"),
    SKILL("مهارت", "⭐"),
    SPECIAL("ویژه", "💎")
}

data class AchievementProgress(
    val achievement: Achievement,
    val current: Int,
    val isUnlocked: Boolean,
    val unlockedDate: String? = null
)

object AchievementManager {

    private val UNLOCKED_KEY = stringSetPreferencesKey("achievements_unlocked")
    private val UNLOCK_DATES_KEY = stringSetPreferencesKey("achievements_dates")

    // ==================== لیست دستاوردها ====================

    fun getAllAchievements(): List<Achievement> = listOf(

        // ==================== 📈 پیشرفت ====================
        Achievement(
            id = "first_lesson",
            title = "First Step",
            titlePersian = "اولین قدم",
            description = "اولین درس رو کامل کن",
            emoji = "🎯",
            category = AchievementCategory.PROGRESS,
            target = 1,
            color = 0xFF43A047
        ),
        Achievement(
            id = "lessons_5",
            title = "Getting Started",
            titlePersian = "شروع جدی",
            description = "۵ درس رو کامل کن",
            emoji = "🚀",
            category = AchievementCategory.PROGRESS,
            target = 5,
            color = 0xFF43A047
        ),
        Achievement(
            id = "lessons_10",
            title = "Dedicated Learner",
            titlePersian = "یادگیرنده مصمم",
            description = "۱۰ درس رو کامل کن",
            emoji = "💪",
            category = AchievementCategory.PROGRESS,
            target = 10,
            color = 0xFF43A047
        ),
        Achievement(
            id = "lessons_20",
            title = "Half Way There",
            titlePersian = "نیمه راه",
            description = "۲۰ درس رو کامل کن",
            emoji = "🔥",
            category = AchievementCategory.PROGRESS,
            target = 20,
            color = 0xFF43A047
        ),
        Achievement(
            id = "lessons_all",
            title = "Master of All",
            titlePersian = "استاد همه",
            description = "همه‌ی درس‌ها رو کامل کن",
            emoji = "👑",
            category = AchievementCategory.PROGRESS,
            target = 34,
            color = 0xFF43A047
        ),

        // ==================== 🔥 استمرار ====================
        Achievement(
            id = "streak_3",
            title = "Warming Up",
            titlePersian = "گرم شدن",
            description = "۳ روز پیوسته تمرین کن",
            emoji = "🔥",
            category = AchievementCategory.STREAK,
            target = 3,
            color = 0xFFE53935
        ),
        Achievement(
            id = "streak_7",
            title = "One Week Strong",
            titlePersian = "یه هفته قوی",
            description = "۷ روز پیوسته تمرین کن",
            emoji = "⚡",
            category = AchievementCategory.STREAK,
            target = 7,
            color = 0xFFE53935
        ),
        Achievement(
            id = "streak_14",
            title = "Two Weeks",
            titlePersian = "دو هفته",
            description = "۱۴ روز پیوسته تمرین کن",
            emoji = "💥",
            category = AchievementCategory.STREAK,
            target = 14,
            color = 0xFFE53935
        ),
        Achievement(
            id = "streak_30",
            title = "Monthly Master",
            titlePersian = "قهرمان ماه",
            description = "۳۰ روز پیوسته تمرین کن",
            emoji = "🏅",
            category = AchievementCategory.STREAK,
            target = 30,
            color = 0xFFE53935
        ),
        Achievement(
            id = "streak_100",
            title = "Centurion",
            titlePersian = "صدتایی",
            description = "۱۰۰ روز پیوسته تمرین کن",
            emoji = "💎",
            category = AchievementCategory.STREAK,
            target = 100,
            color = 0xFFE53935
        ),

        // ==================== 📚 محتوا ====================
        Achievement(
            id = "stories_5",
            title = "Story Explorer",
            titlePersian = "کاوشگر داستان",
            description = "۵ داستان بخون",
            emoji = "📖",
            category = AchievementCategory.CONTENT,
            target = 5,
            color = 0xFFE91E63
        ),
        Achievement(
            id = "stories_15",
            title = "Bookworm",
            titlePersian = "کتاب‌خوان",
            description = "۱۵ داستان بخون",
            emoji = "📚",
            category = AchievementCategory.CONTENT,
            target = 15,
            color = 0xFFE91E63
        ),
        Achievement(
            id = "stories_30",
            title = "Story Lover",
            titlePersian = "عاشق داستان",
            description = "۳۰ داستان بخون",
            emoji = "🌟",
            category = AchievementCategory.CONTENT,
            target = 30,
            color = 0xFFE91E63
        ),
        Achievement(
            id = "stories_50",
            title = "Half Library",
            titlePersian = "نیمی از کتابخانه",
            description = "۵۰ داستان بخون",
            emoji = "🏆",
            category = AchievementCategory.CONTENT,
            target = 50,
            color = 0xFFE91E63
        ),
        Achievement(
            id = "stories_all",
            title = "Complete Library",
            titlePersian = "کتابخانه کامل",
            description = "همه‌ی ۱۰۰ داستان رو بخون",
            emoji = "👑",
            category = AchievementCategory.CONTENT,
            target = 100,
            color = 0xFFE91E63
        ),
        Achievement(
            id = "grammar_10",
            title = "Grammar Starter",
            titlePersian = "شروع گرامر",
            description = "۱۰ موضوع گرامری رو ببین",
            emoji = "📝",
            category = AchievementCategory.CONTENT,
            target = 10,
            color = 0xFF00ACC1
        ),
        Achievement(
            id = "grammar_30",
            title = "Grammar Fan",
            titlePersian = "طرفدار گرامر",
            description = "۳۰ موضوع گرامری رو ببین",
            emoji = "🎓",
            category = AchievementCategory.CONTENT,
            target = 30,
            color = 0xFF00ACC1
        ),
        Achievement(
            id = "grammar_all",
            title = "Grammar Master",
            titlePersian = "استاد گرامر",
            description = "همه‌ی موضوعات گرامری رو ببین",
            emoji = "👑",
            category = AchievementCategory.CONTENT,
            target = 60,
            color = 0xFF00ACC1
        ),
        Achievement(
            id = "sentences_5",
            title = "Chatterbox",
            titlePersian = "خوش‌صحبت",
            description = "۵ دسته از جملات روزمره رو ببین",
            emoji = "💬",
            category = AchievementCategory.CONTENT,
            target = 5,
            color = 0xFF00897B
        ),
        Achievement(
            id = "sentences_all",
            title = "Conversation King",
            titlePersian = "پادشاه مکالمه",
            description = "همه‌ی دسته‌های جملات رو ببین",
            emoji = "🎭",
            category = AchievementCategory.CONTENT,
            target = 15,
            color = 0xFF00897B
        ),

        // ==================== ⭐ مهارت ====================
        Achievement(
            id = "stars_100",
            title = "Star Collector",
            titlePersian = "جمع‌کننده ستاره",
            description = "۱۰۰ ستاره جمع کن",
            emoji = "⭐",
            category = AchievementCategory.SKILL,
            target = 100,
            color = 0xFFFFA000
        ),
        Achievement(
            id = "stars_500",
            title = "Star Hoarder",
            titlePersian = "گنجینه‌دار",
            description = "۵۰۰ ستاره جمع کن",
            emoji = "🌟",
            category = AchievementCategory.SKILL,
            target = 500,
            color = 0xFFFFA000
        ),
        Achievement(
            id = "stars_1000",
            title = "Star Legend",
            titlePersian = "افسانه‌ی ستاره",
            description = "۱۰۰۰ ستاره جمع کن",
            emoji = "✨",
            category = AchievementCategory.SKILL,
            target = 1000,
            color = 0xFFFFA000
        ),
        Achievement(
            id = "perfect_quiz",
            title = "Perfect Score",
            titlePersian = "امتیاز کامل",
            description = "یه کوییز رو کامل جواب بده",
            emoji = "🎯",
            category = AchievementCategory.SKILL,
            target = 1,
            color = 0xFF7B1FA2
        ),
        Achievement(
            id = "quizzes_10",
            title = "Quiz Enthusiast",
            titlePersian = "علاقه‌مند کوییز",
            description = "۱۰ کوییز انجام بده",
            emoji = "🧠",
            category = AchievementCategory.SKILL,
            target = 10,
            color = 0xFF7B1FA2
        ),

        // ==================== 💎 ویژه ====================
        Achievement(
            id = "groups_5",
            title = "Group Passer",
            titlePersian = "پاس‌کننده گروه",
            description = "۵ گروه امتحانی رو پاس کن",
            emoji = "🎖️",
            category = AchievementCategory.SPECIAL,
            target = 5,
            color = 0xFF6A1B9A
        ),
        Achievement(
            id = "groups_all",
            title = "Champion",
            titlePersian = "قهرمان",
            description = "همه‌ی گروه‌های امتحانی رو پاس کن",
            emoji = "🏆",
            category = AchievementCategory.SPECIAL,
            target = 13,
            color = 0xFF6A1B9A
        ),
        Achievement(
            id = "bookmarks_10",
            title = "Saver",
            titlePersian = "ذخیره‌کننده",
            description = "۱۰ مورد رو بوکمارک کن",
            emoji = "🔖",
            category = AchievementCategory.SPECIAL,
            target = 10,
            color = 0xFF6A1B9A
        ),
        Achievement(
            id = "perfect_streak_week",
            title = "Perfect Week",
            titlePersian = "هفته کامل",
            description = "۷ روز پیوسته و ۱۰۰ ستاره",
            emoji = "💯",
            category = AchievementCategory.SPECIAL,
            target = 7,
            color = 0xFF6A1B9A
        )
    )

    // ==================== گرفتن پیشرفت ====================

    fun getAchievementProgress(
        context: Context,
        achievement: Achievement,
        unlockedIds: Set<String>,
        unlockedDates: Map<String, String>
    ): AchievementProgress {
        return AchievementProgress(
            achievement = achievement,
            current = 0, // بعداً از ProgressManager پر می‌شه
            isUnlocked = unlockedIds.contains(achievement.id),
            unlockedDate = unlockedDates[achievement.id]
        )
    }

    // ==================== ذخیره/بازیابی ====================

    fun getUnlockedIds(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs ->
            prefs[UNLOCKED_KEY] ?: emptySet()
        }

    fun getUnlockedDates(context: Context): Flow<Map<String, String>> =
        context.dataStore.data.map { prefs ->
            val raw = prefs[UNLOCK_DATES_KEY] ?: emptySet()
            raw.mapNotNull { entry ->
                val parts = entry.split("|")
                if (parts.size == 2) parts[0] to parts[1] else null
            }.toMap()
        }

    suspend fun unlock(context: Context, achievementId: String) {
        val today = SimpleDateFormat("yyyy/MM/dd", Locale.US).format(Date())
        context.dataStore.edit { prefs ->
            val current = prefs[UNLOCKED_KEY] ?: emptySet()
            prefs[UNLOCKED_KEY] = current + achievementId

            val dates = prefs[UNLOCK_DATES_KEY] ?: emptySet()
            val filtered = dates.filter { !it.startsWith("$achievementId|") }.toSet()
            prefs[UNLOCK_DATES_KEY] = filtered + "$achievementId|$today"
        }
    }

    suspend fun resetAll(context: Context) {
        context.dataStore.edit { prefs ->
            prefs[UNLOCKED_KEY] = emptySet()
            prefs[UNLOCK_DATES_KEY] = emptySet()
        }
    }
}