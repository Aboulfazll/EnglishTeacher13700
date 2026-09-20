package com.example.englishteacher.data

data class SpeakingSentence(
    val id: String,
    val english: String,
    val persian: String,
    val category: SpeakingCategory,
    val difficulty: SpeakingDifficulty,
    val level: SpeakingLevel,
    val lesson: String = ""
)

enum class SpeakingLevel(val displayName: String, val emoji: String, val color: Long) {
    BEGINNER("مبتدی", "🌱", 0xFF43A047),
    INTERMEDIATE("متوسط", "🚀", 0xFF7B1FA2),
    ADVANCED("پیشرفته", "🏆", 0xFFE65100)
}

enum class SpeakingCategory(
    val displayName: String,
    val emoji: String,
    val color: Long
) {
    GREETING("احوال‌پرسی", "👋", 0xFF43A047),
    INTRODUCE("معرفی خود", "🙋", 0xFF7B1FA2),
    FAMILY("خانواده", "👨‍👩‍👧", 0xFFE91E63),
    FOOD("غذا و رستوران", "🍽️", 0xFFFF6F00),
    SHOPPING("خرید", "🛒", 0xFF00897B),
    DIRECTIONS("مسیریابی", "🗺️", 0xFF1565C0),
    TRAVEL("سفر", "✈️", 0xFF3949AB),
    TIME("زمان و تاریخ", "🕐", 0xFF6A1B9A),
    WORK("کار و اداری", "💼", 0xFF00695C),
    FEELINGS("احساسات", "❤️", 0xFFD81B60),
    WEATHER("آب و هوا", "☀️", 0xFF0288D1),
    OPINIONS("نظرات", "💭", 0xFF5E35B1),
    ADVANCED("پیشرفته", "🎓", 0xFFBF360C)
}

enum class SpeakingDifficulty(
    val displayName: String,
    val emoji: String
) {
    WORD("کلمه", "🔤"),
    PHRASE("عبارت", "📝"),
    SHORT("کوتاه", "📄"),
    MEDIUM("متوسط", "📖"),
    LONG("بلند", "📚"),
    PARAGRAPH("پاراگراف", "📕")
}

object SpeakingRepository {

    private val sentences: List<SpeakingSentence> = listOf(

        // ============================================================
        // ========== 🌱 سطح مبتدی - احوال‌پرسی ==========
        // ============================================================
        SpeakingSentence("b_gr_1", "Hello", "سلام", SpeakingCategory.GREETING, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_2", "Hi", "سلام (دوستانه)", SpeakingCategory.GREETING, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_3", "Good morning", "صبح بخیر", SpeakingCategory.GREETING, SpeakingDifficulty.PHRASE, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_4", "Good afternoon", "بعدازظهر بخیر", SpeakingCategory.GREETING, SpeakingDifficulty.PHRASE, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_5", "Good evening", "عصر بخیر", SpeakingCategory.GREETING, SpeakingDifficulty.PHRASE, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_6", "Good night", "شب بخیر", SpeakingCategory.GREETING, SpeakingDifficulty.PHRASE, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_7", "How are you?", "حالت چطوره؟", SpeakingCategory.GREETING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_8", "I'm fine, thank you", "خوبم، ممنون", SpeakingCategory.GREETING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_9", "Nice to meet you", "از آشنایی خوشحالم", SpeakingCategory.GREETING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_10", "See you later", "بعداً می‌بینمت", SpeakingCategory.GREETING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_11", "Have a nice day", "روز خوبی داشته باشی", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_12", "It's nice to see you again", "خوشحالم دوباره می‌بینمت", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_13", "Long time no see", "خیلی وقت بود ندیدمت", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_14", "How have you been?", "چطور بودی این مدت؟", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 1"),
        SpeakingSentence("b_gr_15", "Take care", "مواظب خودت باش", SpeakingCategory.GREETING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 1"),

        // ========== 🌱 معرفی خود ==========
        SpeakingSentence("b_int_1", "My name is Ali", "اسم من علیه", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_2", "I'm from Iran", "من اهل ایرانم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_3", "I am a student", "من دانش‌آموزم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_4", "I'm twenty years old", "بیست سالمه", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_5", "What's your name?", "اسمت چیه؟", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_6", "Where are you from?", "اهل کجایی؟", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_7", "How old are you?", "چند سالته؟", SpeakingCategory.INTRODUCE, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_8", "I work as a teacher", "من به عنوان معلم کار می‌کنم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_9", "I live in Tehran", "من در تهران زندگی می‌کنم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_10", "I'm learning English", "دارم انگلیسی یاد می‌گیرم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_11", "I have two brothers and one sister", "من دو برادر و یه خواهر دارم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 2"),
        SpeakingSentence("b_int_12", "This is my first English class", "این اولین کلاس انگلیسی منه", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 2"),

        // ========== 🌱 خانواده ==========
        SpeakingSentence("b_fam_1", "This is my mother", "این مادر منه", SpeakingCategory.FAMILY, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_2", "This is my father", "این پدر منه", SpeakingCategory.FAMILY, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_3", "I have a big family", "من یه خانواده‌ی بزرگ دارم", SpeakingCategory.FAMILY, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_4", "My brother is a doctor", "برادرم دکتره", SpeakingCategory.FAMILY, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_5", "My sister is younger than me", "خواهرم از من کوچیک‌تره", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_6", "We are a family of five", "ما یه خانواده‌ی پنج نفره هستیم", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_7", "My parents live in Shiraz", "پدر و مادرم در شیراز زندگی می‌کنند", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_8", "I love spending time with my family", "عاشق گذروندن وقت با خانواده‌ام هستم", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_9", "My grandmother is eighty years old", "مادربزرگم هشتاد سالشه", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_10", "I have a very kind family", "من یه خانواده‌ی خیلی مهربون دارم", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_11", "We always eat dinner together", "ما همیشه با هم شام می‌خوریم", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 3"),
        SpeakingSentence("b_fam_12", "Family is the most important thing", "خانواده مهم‌ترین چیزه", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 3"),

        // ========== 🌱 غذا و رستوران ==========
        SpeakingSentence("b_food_1", "I'm hungry", "گرسنه‌ام", SpeakingCategory.FOOD, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_2", "I'm thirsty", "تشنه‌ام", SpeakingCategory.FOOD, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_3", "I want some water", "یه کم آب می‌خوام", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_4", "I like pizza", "پیتزا دوست دارم", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_5", "This food is delicious", "این غذا خوشمزه‌ست", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_6", "Can I have the menu?", "می‌تونم منو رو ببینم؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_7", "I'd like a cup of tea", "یه فنجون چای می‌خوام", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_8", "The bill, please", "صورت‌حساب، لطفاً", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_9", "What do you recommend?", "چی پیشنهاد می‌کنید؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_10", "I don't eat meat", "من گوشت نمی‌خورم", SpeakingCategory.FOOD, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_11", "Could I have a glass of water?", "می‌تونم یه لیوان آب داشته باشم؟", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_12", "A table for two, please", "یه میز برای دو نفر، لطفاً", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_13", "I'm allergic to nuts", "به آجیل حساسیت دارم", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_14", "Can I get this to go?", "می‌تونم این رو بیرون ببرم؟", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),
        SpeakingSentence("b_food_15", "Breakfast is my favorite meal", "صبحانه وعده‌ی مورد علاقه‌مه", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 4"),

        // ========== 🌱 خرید ==========
        SpeakingSentence("b_sh_1", "How much is this?", "این چنده؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_2", "That's too expensive", "این خیلی گرونه", SpeakingCategory.SHOPPING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_3", "Do you have a smaller size?", "سایز کوچیک‌تر دارید؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_4", "Can I try it on?", "می‌تونم پروش کنم؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_5", "I'll take it", "این رو می‌خرم", SpeakingCategory.SHOPPING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_6", "Can I get a receipt?", "می‌تونم فاکتور بگیرم؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_7", "Do you accept credit cards?", "کارت اعتباری قبول می‌کنید؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_8", "I'm just looking, thanks", "فقط دارم نگاه می‌کنم، ممنون", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_9", "Where is the fitting room?", "اتاق پرو کجاست؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_10", "Is there a discount?", "تخفیف داره؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_11", "I need to buy some shoes", "باید کفش بخرم", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),
        SpeakingSentence("b_sh_12", "This color doesn't suit me", "این رنگ بهم نمیاد", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 5"),

        // ========== 🌱 مسیریابی ==========
        SpeakingSentence("b_dir_1", "Where is the bank?", "بانک کجاست؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_2", "Turn left", "بپیچ چپ", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_3", "Turn right", "بپیچ راست", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_4", "Go straight", "مستقیم برو", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_5", "Is it far from here?", "از اینجا دوره؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_6", "How do I get there?", "چطور برم اونجا؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_7", "It's next to the park", "کنار پارکه", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_8", "Can you show me on the map?", "می‌تونی روی نقشه نشونم بدی؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_9", "I think I'm lost", "فکر می‌کنم گم شدم", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_10", "Is there a bus stop nearby?", "نزدیک اینجا ایستگاه اتوبوس هست؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_11", "Take the second street on the right", "از خیابون دوم سمت راست برو", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 6"),
        SpeakingSentence("b_dir_12", "The station is across from the mall", "ایستگاه روبروی مال‌ه", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 6"),

        // ========== 🌱 سفر ==========
        SpeakingSentence("b_tr_1", "I have a reservation", "رزرو دارم", SpeakingCategory.TRAVEL, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_2", "Where is the airport?", "فرودگاه کجاست؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_3", "I need a taxi", "تاکسی لازم دارم", SpeakingCategory.TRAVEL, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_4", "What time is check-out?", "ساعت تخلیه کیه؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_5", "The flight was delayed", "پرواز تأخیر داشت", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_6", "Here is my passport", "این پاسپورت منه", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_7", "Is breakfast included?", "صبحانه شامل می‌شه؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_8", "I'm here on vacation", "من برای تعطیلات اینجام", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_9", "Can I have a window seat?", "می‌تونم صندلی کنار پنجره داشته باشم؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_10", "Where can I buy tickets?", "از کجا می‌تونم بلیط بخرم؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_11", "I would like to extend my stay", "می‌خوام اقامتم رو تمدید کنم", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 7"),
        SpeakingSentence("b_tr_12", "My luggage is missing", "چمدونم گم شده", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 7"),

        // ========== 🌱 زمان و تاریخ ==========
        SpeakingSentence("b_tm_1", "What time is it?", "ساعت چنده؟", SpeakingCategory.TIME, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_2", "It's three o'clock", "ساعت سه‌ست", SpeakingCategory.TIME, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_3", "Today is Monday", "امروز دوشنبه‌ست", SpeakingCategory.TIME, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_4", "I wake up at seven", "ساعت هفت بیدار می‌شم", SpeakingCategory.TIME, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_5", "See you tomorrow", "فردا می‌بینمت", SpeakingCategory.TIME, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_6", "What day is it today?", "امروز چه روزیه؟", SpeakingCategory.TIME, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_7", "I was born in 1990", "من در سال ۱۹۹۰ به دنیا آمدم", SpeakingCategory.TIME, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_8", "The meeting is at two", "جلسه ساعت دوئه", SpeakingCategory.TIME, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_9", "I usually go to bed at eleven", "معمولاً ساعت یازده می‌خوابم", SpeakingCategory.TIME, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 8"),
        SpeakingSentence("b_tm_10", "My birthday is in May", "تولدم در ماه مه‌ست", SpeakingCategory.TIME, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 8"),

        // ========== 🌱 آب و هوا ==========
        SpeakingSentence("b_w_1", "It's hot today", "امروز گرمه", SpeakingCategory.WEATHER, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_2", "It's cold outside", "بیرون سرده", SpeakingCategory.WEATHER, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_3", "It's raining", "داره بارون میاد", SpeakingCategory.WEATHER, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_4", "The weather is nice today", "امروز هوا خوبه", SpeakingCategory.WEATHER, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_5", "I like sunny days", "روزهای آفتابی رو دوست دارم", SpeakingCategory.WEATHER, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_6", "Take an umbrella with you", "چتر با خودت ببر", SpeakingCategory.WEATHER, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_7", "It's snowing in the mountains", "توی کوه‌ها داره برف میاد", SpeakingCategory.WEATHER, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_8", "What's the weather like tomorrow?", "هوای فردا چطوره؟", SpeakingCategory.WEATHER, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_9", "It's too windy to go out", "خیلی بادیه که بیرون بریم", SpeakingCategory.WEATHER, SpeakingDifficulty.LONG, SpeakingLevel.BEGINNER, "Lesson 9"),
        SpeakingSentence("b_w_10", "Spring is my favorite season", "بهار فصل مورد علاقه‌مه", SpeakingCategory.WEATHER, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 9"),

        // ========== 🌱 احساسات ==========
        SpeakingSentence("b_f_1", "I'm happy", "خوشحالم", SpeakingCategory.FEELINGS, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_2", "I'm sad", "غمگینم", SpeakingCategory.FEELINGS, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_3", "I'm tired", "خسته‌ام", SpeakingCategory.FEELINGS, SpeakingDifficulty.WORD, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_4", "I'm so excited", "خیلی هیجان‌زده‌ام", SpeakingCategory.FEELINGS, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_5", "I love you", "دوستت دارم", SpeakingCategory.FEELINGS, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_6", "I miss you", "دلم برات تنگ شده", SpeakingCategory.FEELINGS, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_7", "Don't worry, it's okay", "نگران نباش، خوبه", SpeakingCategory.FEELINGS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_8", "I'm so proud of you", "خیلی بهت افتخار می‌کنم", SpeakingCategory.FEELINGS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_9", "You can do it", "تو می‌تونی", SpeakingCategory.FEELINGS, SpeakingDifficulty.SHORT, SpeakingLevel.BEGINNER, "Lesson 10"),
        SpeakingSentence("b_f_10", "Everything will be fine", "همه چیز خوب می‌شه", SpeakingCategory.FEELINGS, SpeakingDifficulty.MEDIUM, SpeakingLevel.BEGINNER, "Lesson 10"),

        // ============================================================
        // ========== 🚀 سطح متوسط ==========
        // ============================================================

        // ========== 🚀 احوال‌پرسی ==========
        SpeakingSentence("i_gr_1", "How's everything going?", "اوضاع چطور پیش می‌ره؟", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_2", "What have you been up to?", "چه خبر؟ (این مدت چیکار می‌کردی؟)", SpeakingCategory.GREETING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_3", "I hope you're doing well", "امیدوارم حالت خوب باشه", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_4", "It's been a while, hasn't it?", "خیلی وقت گذشته، مگه نه؟", SpeakingCategory.GREETING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_5", "Please send my regards to your family", "لطفاً به خانوادت سلام برسون", SpeakingCategory.GREETING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_6", "I've heard so much about you", "درباره‌ت خیلی شنیدم", SpeakingCategory.GREETING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_7", "What a pleasant surprise!", "چه سورپرایز دلنشینی!", SpeakingCategory.GREETING, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 1"),
        SpeakingSentence("i_gr_8", "I'd love to catch up sometime", "خیلی دوست دارم یه وقت ببینمت", SpeakingCategory.GREETING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 1"),

        // ========== 🚀 معرفی خود ==========
        SpeakingSentence("i_int_1", "I'm currently working as a software engineer", "الان به عنوان مهندس نرم‌افزار کار می‌کنم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_2", "I've been living here for three years", "سه ساله اینجا زندگی می‌کنم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_3", "I graduated from Tehran University", "از دانشگاه تهران فارغ‌التحصیل شدم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_4", "I'm really passionate about learning languages", "واقعاً به یادگیری زبان‌ها علاقه دارم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_5", "In my free time, I enjoy reading books", "توی وقت آزادم از کتاب خوندن لذت می‌برم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_6", "I've been learning English for two years", "دو ساله دارم انگلیسی یاد می‌گیرم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_7", "My goal is to become fluent in English", "هدفم تسلط کامل به انگلیسیه", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_8", "I come from a small town near Isfahan", "من از یه شهر کوچیک نزدیک اصفهان میام", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_9", "I consider myself a hardworking person", "خودمو آدم سخت‌کوشی می‌دونم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),
        SpeakingSentence("i_int_10", "One day I hope to travel around the world", "یه روز امیدوارم دور دنیا سفر کنم", SpeakingCategory.INTRODUCE, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 2"),

        // ========== 🚀 خانواده ==========
        SpeakingSentence("i_fam_1", "My family has always been very supportive", "خانواده‌ام همیشه خیلی حمایتگر بوده", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_2", "I get along really well with my siblings", "با خواهر و برادرام خیلی خوب کنار میام", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_3", "Family traditions are important to us", "سنت‌های خانوادگی برای ما مهمه", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_4", "We try to have dinner together every weekend", "سعی می‌کنیم هر آخر هفته با هم شام بخوریم", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_5", "My parents taught me to be honest", "پدر و مادرم بهم یاد دادن که صادق باشم", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_6", "My grandmother is the heart of our family", "مادربزرگم قلب خونواده‌مونه", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_7", "I value the time I spend with my family", "برای وقتی که با خانوادم می‌گذرونم ارزش قائلم", SpeakingCategory.FAMILY, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 3"),
        SpeakingSentence("i_fam_8", "Family means everything to me", "خانواده برای من همه چیزه", SpeakingCategory.FAMILY, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 3"),

        // ========== 🚀 غذا و رستوران ==========
        SpeakingSentence("i_food_1", "I'd like to make a reservation for tonight", "می‌خوام برای امشب رزرو کنم", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_2", "Could you recommend something vegetarian?", "می‌تونی یه غذای گیاهی پیشنهاد کنی؟", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_3", "This dish is absolutely delicious", "این غذا کاملاً خوشمزه‌ست", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_4", "I'm on a special diet", "من رژیم خاصی دارم", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_5", "Could we split the bill, please?", "می‌تونیم صورت‌حساب رو نصف کنیم؟", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_6", "I've never tried this before", "تا حالا این رو امتحان نکرده‌ام", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_7", "The service here is excellent", "خدمات اینجا عالیه", SpeakingCategory.FOOD, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_8", "Could I get this without onions?", "می‌تونم این رو بدون پیاز بگیرم؟", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_9", "I'm really in the mood for Italian food", "خیلی هوس غذای ایتالیایی کردم", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 4"),
        SpeakingSentence("i_food_10", "I'll have the same as him", "منم همون رو می‌خورم که اون خورد", SpeakingCategory.FOOD, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 4"),

        // ========== 🚀 خرید ==========
        SpeakingSentence("i_sh_1", "I'm looking for a gift for my friend", "دنبال یه هدیه برای دوستم می‌گردم", SpeakingCategory.SHOPPING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_2", "Could you gift-wrap this for me?", "می‌تونی این رو کادوپیچ کنی؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_3", "I'd like to return this item", "می‌خوام این کالا رو برگردونم", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_4", "Do you have this in a different color?", "این رو رنگ دیگه‌ای دارید؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_5", "I'm comparing prices before I decide", "قبل از تصمیم‌گیری قیمت‌ها رو مقایسه می‌کنم", SpeakingCategory.SHOPPING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_6", "Is there a warranty on this product?", "این محصول گارانتی داره؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_7", "That's a bit more than I wanted to spend", "این یه کم بیشتر از اونیه که می‌خواستم خرج کنم", SpeakingCategory.SHOPPING, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 5"),
        SpeakingSentence("i_sh_8", "Could you give me a discount?", "می‌تونی تخفیف بدی؟", SpeakingCategory.SHOPPING, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 5"),

        // ========== 🚀 مسیریابی ==========
        SpeakingSentence("i_dir_1", "Could you tell me how to get to the museum?", "می‌تونی بگی چطور به موزه برم؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_2", "It's about a ten-minute walk from here", "از اینجا حدود ده دقیقه پیاده‌ست", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_3", "You can't miss it, it's a big building", "نمی‌تونی از دستش بدی، ساختمون بزرگیه", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_4", "Take the subway and get off at the third stop", "مترو سوار شو و ایستگاه سوم پیاده شو", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_5", "Is this the right way to the train station?", "این راه به ایستگاه قطاره؟", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_6", "The building is just around the corner", "ساختمون درست سر نبشه", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_7", "I'll walk you to the bus stop", "تا ایستگاه اتوبوس همراهیت می‌کنم", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 6"),
        SpeakingSentence("i_dir_8", "Follow this road until you reach the traffic light", "این جاده رو تا چراغ راهنما ادامه بده", SpeakingCategory.DIRECTIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 6"),

        // ========== 🚀 سفر ==========
        SpeakingSentence("i_tr_1", "I'd like to book a room for three nights", "می‌خوام یه اتاق برای سه شب رزرو کنم", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_2", "Is there Wi-Fi in the room?", "توی اتاق وای‌فای هست؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_3", "Could you call a taxi for me?", "می‌تونی برام تاکسی بگیری؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_4", "What's the best way to get to the airport?", "بهترین راه رفتن به فرودگاه چیه؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_5", "I've never been abroad before", "تا حالا خارج از کشور نبوده‌ام", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_6", "Could I have a wake-up call at seven?", "می‌تونم ساعت هفت بیدارم کنید؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_7", "Do you have any recommendations for sightseeing?", "چیزی برای بازدید پیشنهاد می‌کنید؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_8", "The hotel is centrally located", "هتل در مرکز شهر قرار داره", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_9", "I'm traveling with my family", "من با خانواده‌ام سفر می‌کنم", SpeakingCategory.TRAVEL, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 7"),
        SpeakingSentence("i_tr_10", "Is there a shuttle service to the airport?", "سرویس رفتن به فرودگاه دارید؟", SpeakingCategory.TRAVEL, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 7"),

        // ========== 🚀 کار ==========
        SpeakingSentence("i_w_1", "Could we schedule a meeting for tomorrow?", "می‌تونیم برای فردا جلسه بذاریم؟", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_2", "I'll send you the report by the end of the day", "گزارش رو تا آخر امروز برات می‌فرستم", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_3", "Let me check my calendar and get back to you", "بذار تقویمم رو چک کنم و بهت خبر بدم", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_4", "We need to meet the deadline", "باید مهلت رو رعایت کنیم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_5", "I appreciate your hard work on this project", "از تلاش سختت روی این پروژه قدردانی می‌کنم", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_6", "Could you review this document before Friday?", "می‌تونی این سند رو قبل از جمعه بررسی کنی؟", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_7", "I'm working from home today", "امروز از خونه کار می‌کنم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_8", "Let's discuss the details in the meeting", "بذار جزئیات رو توی جلسه بحث کنیم", SpeakingCategory.WORK, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_9", "I'm afraid I can't make it to the meeting", "متأسفانه نمی‌تونم توی جلسه باشم", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),
        SpeakingSentence("i_w_10", "That's an excellent idea, let's implement it", "ایده‌ی عالیه، بیا اجراش کنیم", SpeakingCategory.WORK, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 8"),

        // ========== 🚀 احساسات ==========
        SpeakingSentence("i_f_1", "I couldn't be happier right now", "الان نمی‌تونم خوشحال‌تر باشم", SpeakingCategory.FEELINGS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_2", "I'm really looking forward to the trip", "خیلی منتظر سفرم", SpeakingCategory.FEELINGS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_3", "I feel a bit under the weather today", "امروز یه کم حالم خوب نیست", SpeakingCategory.FEELINGS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_4", "That really made my day", "واقعاً روزمو ساخت (خوشحالم کرد)", SpeakingCategory.FEELINGS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_5", "I'm over the moon about the news", "از این خبر خیلی خوشحالم", SpeakingCategory.FEELINGS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_6", "I can't thank you enough", "نمی‌تونم به اندازه کافی ازت تشکر کنم", SpeakingCategory.FEELINGS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_7", "I'm really stressed about the exam", "خیلی برای امتحان استرس دارم", SpeakingCategory.FEELINGS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 9"),
        SpeakingSentence("i_f_8", "That's a huge relief", "این یه آرامش بزرگه", SpeakingCategory.FEELINGS, SpeakingDifficulty.SHORT, SpeakingLevel.INTERMEDIATE, "Lesson 9"),

        // ========== 🚀 نظرات ==========
        SpeakingSentence("i_op_1", "In my opinion, this is the best solution", "به نظر من، این بهترین راه‌حله", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_2", "I couldn't agree more with you", "کاملاً با تو موافقم", SpeakingCategory.OPINIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_3", "I see your point, but I disagree", "نظرت رو می‌فهمم، ولی مخالفم", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_4", "That's a good point, actually", "این واقعاً نکته‌ی خوبیه", SpeakingCategory.OPINIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_5", "From my perspective, it's worth trying", "از دید من، ارزش امتحان کردن رو داره", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_6", "I'm not sure I follow your reasoning", "مطمئن نیستم استدلالت رو بفهمم", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_7", "Let me see if I understand correctly", "بذار ببینم درست فهمیدم", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_8", "That makes perfect sense to me", "این برای من کاملاً منطقیه", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_9", "I have mixed feelings about this", "درباره‌ی این احساسات متناقضی دارم", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_10", "We'll have to agree to disagree", "باید بپذیریم که نظر متفاوتی داریم", SpeakingCategory.OPINIONS, SpeakingDifficulty.LONG, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_11", "It depends on the situation", "بستگی به موقعیت داره", SpeakingCategory.OPINIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 10"),
        SpeakingSentence("i_op_12", "On the one hand... on the other hand", "از یه طرف... از طرف دیگه", SpeakingCategory.OPINIONS, SpeakingDifficulty.MEDIUM, SpeakingLevel.INTERMEDIATE, "Lesson 10")
    )

    fun getAll(): List<SpeakingSentence> = sentences

    fun getByCategory(category: SpeakingCategory): List<SpeakingSentence> =
        sentences.filter { it.category == category }

    fun getByLevel(level: SpeakingLevel): List<SpeakingSentence> =
        sentences.filter { it.level == level }

    fun getByDifficulty(difficulty: SpeakingDifficulty): List<SpeakingSentence> =
        sentences.filter { it.difficulty == difficulty }

    fun getFiltered(
        category: SpeakingCategory?,
        difficulty: SpeakingDifficulty?,
        level: SpeakingLevel?
    ): List<SpeakingSentence> {
        return sentences.filter { s ->
            (category == null || s.category == category) &&
            (difficulty == null || s.difficulty == difficulty) &&
            (level == null || s.level == level)
        }
    }
}