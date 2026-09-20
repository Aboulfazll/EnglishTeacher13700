package com.example.englishteacher.data

data class SpeakingSentence(
    val id: String,
    val english: String,
    val persian: String,
    val category: SpeakingCategory,
    val difficulty: SpeakingDifficulty
)

enum class SpeakingCategory(
    val displayName: String,
    val emoji: String,
    val color: Long
) {
    BASIC("پایه و ساده", "🌱", 0xFF43A047),
    DAILY("جملات روزمره", "💬", 0xFF00897B),
    TRAVEL("سفر و گردش", "✈️", 0xFF3949AB),
    FOOD("غذا و رستوران", "🍽️", 0xFFE91E63),
    WORK("کار و اداری", "💼", 0xFF1565C0),
    EMOTIONS("احساسات", "❤️", 0xFFE91E63),
    QUESTIONS("سوالات", "❓", 0xFF7B1FA2),
    ADVANCED("پیشرفته", "🎓", 0xFF6A1B9A)
}

enum class SpeakingDifficulty(
    val displayName: String,
    val emoji: String,
    val minWords: Int,
    val maxWords: Int
) {
    WORD("کلمه", "🔤", 1, 2),
    SHORT("کوتاه", "📝", 3, 5),
    MEDIUM("متوسط", "📖", 6, 9),
    LONG("بلند", "📚", 10, 100)
}

object SpeakingRepository {

    private val allSentences: List<SpeakingSentence> = listOf(

        // ==================== 🌱 پایه و ساده ====================
        SpeakingSentence("b1", "Hello", "سلام", SpeakingCategory.BASIC, SpeakingDifficulty.WORD),
        SpeakingSentence("b2", "Thank you", "ممنون", SpeakingCategory.BASIC, SpeakingDifficulty.WORD),
        SpeakingSentence("b3", "Good morning", "صبح بخیر", SpeakingCategory.BASIC, SpeakingDifficulty.WORD),
        SpeakingSentence("b4", "Good night", "شب بخیر", SpeakingCategory.BASIC, SpeakingDifficulty.WORD),
        SpeakingSentence("b5", "Excuse me", "ببخشید", SpeakingCategory.BASIC, SpeakingDifficulty.WORD),
        SpeakingSentence("b6", "I'm sorry", "متأسفم", SpeakingCategory.BASIC, SpeakingDifficulty.WORD),
        SpeakingSentence("b7", "How are you?", "حالت چطوره؟", SpeakingCategory.BASIC, SpeakingDifficulty.SHORT),
        SpeakingSentence("b8", "I'm fine, thanks", "خوبم، ممنون", SpeakingCategory.BASIC, SpeakingDifficulty.SHORT),
        SpeakingSentence("b9", "Nice to meet you", "از آشنایی خوشحالم", SpeakingCategory.BASIC, SpeakingDifficulty.SHORT),
        SpeakingSentence("b10", "See you later", "بعداً می‌بینمت", SpeakingCategory.BASIC, SpeakingDifficulty.SHORT),
        SpeakingSentence("b11", "My name is Ali", "اسم من علیه", SpeakingCategory.BASIC, SpeakingDifficulty.SHORT),
        SpeakingSentence("b12", "I am from Iran", "من اهل ایرانم", SpeakingCategory.BASIC, SpeakingDifficulty.SHORT),

        // ==================== 💬 جملات روزمره ====================
        SpeakingSentence("d1", "What time is it?", "ساعت چنده؟", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d2", "How's the weather?", "هوا چطوره؟", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d3", "I'm hungry", "گرسنه‌ام", SpeakingCategory.DAILY, SpeakingDifficulty.WORD),
        SpeakingSentence("d4", "I'm tired", "خسته‌ام", SpeakingCategory.DAILY, SpeakingDifficulty.WORD),
        SpeakingSentence("d5", "Can you help me?", "می‌تونی کمکم کنی؟", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d6", "What does this mean?", "این یعنی چی؟", SpeakingCategory.DAILY, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("d7", "I don't understand", "متوجه نمی‌شم", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d8", "Could you repeat that?", "می‌تونی تکرار کنی؟", SpeakingCategory.DAILY, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("d9", "I'm running late", "دارم دیر می‌کنم", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d10", "Let me think about it", "بذار فکر کنم", SpeakingCategory.DAILY, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("d11", "It doesn't matter", "مهم نیست", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d12", "I'll be right back", "زودی برمی‌گردم", SpeakingCategory.DAILY, SpeakingDifficulty.SHORT),
        SpeakingSentence("d13", "Do you speak English?", "انگلیسی صحبت می‌کنی؟", SpeakingCategory.DAILY, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("d14", "I really appreciate it", "واقعاً قدردانی می‌کنم", SpeakingCategory.DAILY, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("d15", "Have a nice day", "روز خوبی داشته باشی", SpeakingCategory.DAILY, SpeakingDifficulty.MEDIUM),

        // ==================== ✈️ سفر و گردش ====================
        SpeakingSentence("t1", "Where is the airport?", "فرودگاه کجاست؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.SHORT),
        SpeakingSentence("t2", "I need a taxi", "تاکسی لازم دارم", SpeakingCategory.TRAVEL, SpeakingDifficulty.SHORT),
        SpeakingSentence("t3", "How much does it cost?", "چقدر هزینه داره؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t4", "Can I have a map?", "می‌تونم یه نقشه داشته باشم؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t5", "Where is the hotel?", "هتل کجاست؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.SHORT),
        SpeakingSentence("t6", "I have a reservation", "رزرو دارم", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t7", "What time is check out?", "ساعت تخلیه کیه؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t8", "Could you take a picture?", "می‌تونی عکس بگیری؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t9", "I'm here on vacation", "من برای تعطیلات اینجام", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t10", "Is breakfast included?", "صبحانه شامل می‌شه؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t11", "Where can I buy tickets?", "از کجا می‌تونم بلیط بخرم؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("t12", "The flight was delayed", "پرواز تأخیر داشت", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM),

        // ==================== 🍽️ غذا و رستوران ====================
        SpeakingSentence("f1", "A table for two, please", "یه میز برای دو نفر، لطفاً", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f2", "Can I see the menu?", "می‌تونم منو رو ببینم؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f3", "What do you recommend?", "چی پیشنهاد می‌کنید؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f4", "I'll have the chicken", "من مرغ می‌خورم", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f5", "Can I get the bill?", "می‌تونم صورت‌حساب رو داشته باشم؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f6", "It's delicious", "خوشمزه‌ست", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT),
        SpeakingSentence("f7", "I'm allergic to nuts", "به آجیل حساسیت دارم", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f8", "I'm vegetarian", "من گیاه‌خوار هستم", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT),
        SpeakingSentence("f9", "Could I have some water?", "می‌تونم یه کم آب داشته باشم؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f10", "Is this dish spicy?", "این غذا تنده؟", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT),
        SpeakingSentence("f11", "I'd like a coffee, please", "یه قهوه می‌خوام، لطفاً", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("f12", "Do you take credit cards?", "کارت اعتباری قبول می‌کنید؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM),

        // ==================== 💼 کار و اداری ====================
        SpeakingSentence("w1", "I have a meeting at ten", "ساعت ده جلسه دارم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("w2", "Can we schedule a call?", "می‌تونیم یه تماس بذاریم؟", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("w3", "I'll send you the report", "گزارش رو برات می‌فرستم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("w4", "Let me check my calendar", "بذار تقویمم رو چک کنم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("w5", "The deadline is tomorrow", "مهلت فرداست", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("w6", "I'm working from home", "از خونه کار می‌کنم", SpeakingCategory.WORK, SpeakingDifficulty.SHORT),
        SpeakingSentence("w7", "Could you review this document?", "می‌تونی این سند رو بررسی کنی؟", SpeakingCategory.WORK, SpeakingDifficulty.LONG),
        SpeakingSentence("w8", "That's a great idea", "ایده‌ی خوبیه", SpeakingCategory.WORK, SpeakingDifficulty.SHORT),
        SpeakingSentence("w9", "I'll get back to you", "بهت خبر می‌دم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("w10", "Let's discuss this later", "بذار بعداً در موردش صحبت کنیم", SpeakingCategory.WORK, SpeakingDifficulty.LONG),

        // ==================== ❤️ احساسات ====================
        SpeakingSentence("e1", "I love you", "دوستت دارم", SpeakingCategory.EMOTIONS, SpeakingDifficulty.WORD),
        SpeakingSentence("e2", "I miss you", "دلم برات تنگ شده", SpeakingCategory.EMOTIONS, SpeakingDifficulty.SHORT),
        SpeakingSentence("e3", "I'm so happy", "خیلی خوشحالم", SpeakingCategory.EMOTIONS, SpeakingDifficulty.SHORT),
        SpeakingSentence("e4", "I feel sad today", "امروز غمگینم", SpeakingCategory.EMOTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("e5", "I'm really excited", "خیلی هیجان‌زده‌ام", SpeakingCategory.EMOTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("e6", "You mean the world to me", "تو برای من همه دنیایی", SpeakingCategory.EMOTIONS, SpeakingDifficulty.LONG),
        SpeakingSentence("e7", "I'm proud of you", "بهت افتخار می‌کنم", SpeakingCategory.EMOTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("e8", "Don't worry, it's okay", "نگران نباش، خوبه", SpeakingCategory.EMOTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("e9", "Everything will be fine", "همه چیز خوب می‌شه", SpeakingCategory.EMOTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("e10", "You can do it", "تو می‌تونی", SpeakingCategory.EMOTIONS, SpeakingDifficulty.SHORT),

        // ==================== ❓ سوالات ====================
        SpeakingSentence("q1", "Where are you from?", "اهل کجایی؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.SHORT),
        SpeakingSentence("q2", "How old are you?", "چند سالته؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.SHORT),
        SpeakingSentence("q3", "What do you do?", "شغلت چیه؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.SHORT),
        SpeakingSentence("q4", "Why are you learning English?", "چرا داری انگلیسی یاد می‌گیری؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.LONG),
        SpeakingSentence("q5", "How long have you been here?", "چه مدت اینجایی؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.LONG),
        SpeakingSentence("q6", "Do you have any hobbies?", "سرگرمی داری؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("q7", "What's your favorite color?", "رنگ مورد علاقه‌ت چیه؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.LONG),
        SpeakingSentence("q8", "Can you speak more slowly?", "می‌تونی آروم‌تر صحبت کنی؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.LONG),
        SpeakingSentence("q9", "Where do you live?", "کجا زندگی می‌کنی؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("q10", "What are you doing?", "چیکار می‌کنی؟", SpeakingCategory.QUESTIONS, SpeakingDifficulty.MEDIUM),

        // ==================== 🎓 پیشرفته ====================
        SpeakingSentence("a1", "I really appreciate your help", "واقعاً از کمکت قدردانی می‌کنم", SpeakingCategory.ADVANCED, SpeakingDifficulty.LONG),
        SpeakingSentence("a2", "I couldn't agree more", "کاملاً موافقم", SpeakingCategory.ADVANCED, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("a3", "That's easier said than done", "گفتنش آسونه، انجامش سخته", SpeakingCategory.ADVANCED, SpeakingDifficulty.LONG),
        SpeakingSentence("a4", "Let's keep in touch", "در تماس باشیم", SpeakingCategory.ADVANCED, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("a5", "I'm looking forward to it", "منتظرشم", SpeakingCategory.ADVANCED, SpeakingDifficulty.LONG),
        SpeakingSentence("a6", "It's worth a try", "ارزش امتحان کردن رو داره", SpeakingCategory.ADVANCED, SpeakingDifficulty.MEDIUM),
        SpeakingSentence("a7", "Take your time", "عجله نکن", SpeakingCategory.ADVANCED, SpeakingDifficulty.SHORT),
        SpeakingSentence("a8", "Better late than never", "دیر رسیدن بهتر از هرگز نرسیدنه", SpeakingCategory.ADVANCED, SpeakingDifficulty.LONG),
        SpeakingSentence("a9", "That's beside the point", "این موضوع بحث نیست", SpeakingCategory.ADVANCED, SpeakingDifficulty.LONG),
        SpeakingSentence("a10", "I'm on the same page", "هم نظریم", SpeakingCategory.ADVANCED, SpeakingDifficulty.MEDIUM)
    )

    fun getAll(): List<SpeakingSentence> = allSentences

    fun getByCategory(category: SpeakingCategory): List<SpeakingSentence> =
        allSentences.filter { it.category == category }

    fun getByDifficulty(difficulty: SpeakingDifficulty): List<SpeakingSentence> =
        allSentences.filter { it.difficulty == difficulty }

    fun getFiltered(
        category: SpeakingCategory?,
        difficulty: SpeakingDifficulty?
    ): List<SpeakingSentence> {
        return allSentences.filter { s ->
            (category == null || s.category == category) &&
            (difficulty == null || s.difficulty == difficulty)
        }
    }
}