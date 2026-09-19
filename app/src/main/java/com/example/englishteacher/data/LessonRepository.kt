package com.example.englishteacher.data

object LessonRepository {

    private val lessons: List<Lesson> = listOf(

        // ==================== BEGINNER ====================
        Lesson(
            id = "b1", unitNumber = 1, title = "Getting Acquainted", titlePersian = "آشنایی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Hello", "سلام", "həˈloʊ"),
                Word("Hi", "سلام (خودمانی)", "haɪ"),
                Word("Name", "نام", "neɪm"),
                Word("Nice to meet you", "از آشنایی خوشحالم", "naɪs tə mit ju"),
                Word("Friend", "دوست", "frɛnd"),
                Word("How are you?", "حالت چطوره؟", "haʊ ɑr ju")
            ),
            grammarTitle = "Present Simple - حال ساده",
            grammarExplanation = "زمان حال ساده برای کارهای روزمره، عادت‌ها و حقایق کلی.\n\nفرمول: فاعل + فعل ساده",
            grammarExamples = listOf(
                "I study English. — من انگلیسی می‌خوانم.",
                "She works in a school. — او در مدرسه کار می‌کند.",
                "They live in Tehran. — آن‌ها در تهران زندگی می‌کنند."
            ),
            conversation = Conversation("Meeting for the first time", "اولین آشنایی", listOf(
                ConversationLine("A", "Hello! My name is Tom.", "سلام! اسم من تام هست."),
                ConversationLine("B", "Hi Tom! I'm Lily. Nice to meet you.", "سلام تام! من لی‌لی هستم."),
                ConversationLine("A", "Nice to meet you too. How are you?", "من هم خوشحالم. حالت چطوره؟"),
                ConversationLine("B", "I'm fine, thank you. And you?", "خوبم، ممنون. تو چطوری؟"),
                ConversationLine("A", "I'm great! Where are you from?", "عالی‌ام! اهل کجایی؟"),
                ConversationLine("B", "I'm from Iran. And you?", "اهل ایرانم. تو چطور؟")
            )),
            storyTitle = "A New Friend",
            storyText = "Tom is a new student. He is shy, but he wants to make friends. One day, he meets a girl named Lily. They talk, and soon they become friends.",
            quiz = listOf(
                QuizQuestion("What does \"Hello\" mean?", listOf("سلام", "خداحافظ", "نام", "ممنون"), 0),
                QuizQuestion("کدام جمله درست است؟", listOf("She work.", "She works.", "She working.", "She worked."), 1)
            )
        ),

        Lesson(
            id = "b2", unitNumber = 2, title = "Going Shopping", titlePersian = "خرید کردن", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shop", "مغازه", "ʃɑp"),
                Word("Buy", "خریدن", "baɪ"),
                Word("Price", "قیمت", "praɪs"),
                Word("Money", "پول", "ˈmʌni"),
                Word("Cheap", "ارزان", "tʃip"),
                Word("Expensive", "گران", "ɪkˈspɛnsɪv")
            ),
            grammarTitle = "This / That / These / Those",
            grammarExplanation = "This = این (نزدیک)\nThat = آن (دور)\nThese = این‌ها\nThose = آن‌ها",
            grammarExamples = listOf(
                "This book is cheap. — این کتاب ارزان است.",
                "That car is expensive. — آن ماشین گران است.",
                "These shoes are new. — این کفش‌ها نو هستند."
            ),
            conversation = Conversation("At the store", "در فروشگاه", listOf(
                ConversationLine("A", "How much is this shirt?", "این پیراهن چنده؟"),
                ConversationLine("B", "It's twenty dollars.", "بیست دلار است."),
                ConversationLine("A", "That's a good price. Is it new?", "قیمت خوبیه. جدیده؟"),
                ConversationLine("B", "Yes, it is. We have it in blue.", "بله. آبی‌اش رو داریم."),
                ConversationLine("A", "I'll take the blue one.", "آبی رو می‌خرم."),
                ConversationLine("B", "Great choice!", "انتخاب عالی!")
            )),
            storyTitle = "Shopping with Mom",
            storyText = "Sara goes shopping with her mom. She wants to buy a new dress. The dress is blue and pretty. It is not expensive. Sara is very happy.",
            quiz = listOf(
                QuizQuestion("معنی Expensive چیست؟", listOf("ارزان", "گران", "زیبا", "جدید"), 1),
                QuizQuestion("کدام درست است؟", listOf("This books are new.", "This book is new.", "These book is new.", "This book are new."), 1)
            )
        ),

        Lesson(
            id = "b3", unitNumber = 3, title = "Daily Routine", titlePersian = "برنامه روزانه", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Wake up", "بیدار شدن", "weɪk ʌp"),
                Word("Breakfast", "صبحانه", "ˈbrɛkfəst"),
                Word("Work", "کار", "wɜrk"),
                Word("Lunch", "ناهار", "lʌntʃ"),
                Word("Dinner", "شام", "ˈdɪnər"),
                Word("Sleep", "خوابیدن", "slip")
            ),
            grammarTitle = "Adverbs of Frequency",
            grammarExplanation = "Always, Usually, Often, Sometimes, Never\n\nجای قید: قبل از فعل اصلی",
            grammarExamples = listOf(
                "I always wake up at 7 AM. — همیشه ساعت ۷ بیدار می‌شوم.",
                "She usually has breakfast. — معمولاً صبحانه می‌خورد.",
                "They never work on Fridays. — هرگز جمعه‌ها کار نمی‌کنند."
            ),
            conversation = Conversation("Daily routine", "برنامه روزانه", listOf(
                ConversationLine("A", "What time do you wake up?", "ساعت چند بیدار می‌شی؟"),
                ConversationLine("B", "I usually wake up at six thirty.", "شش و نیم."),
                ConversationLine("A", "Do you have breakfast?", "صبحانه می‌خوری؟"),
                ConversationLine("B", "Yes, I always have breakfast.", "بله، همیشه می‌خورم."),
                ConversationLine("A", "Sometimes I skip breakfast.", "بعضی وقت‌ها حذف می‌کنم."),
                ConversationLine("B", "You should never skip breakfast!", "هرگز نباید حذف کنی!")
            )),
            storyTitle = "A Busy Day",
            storyText = "Anna is a teacher. She always wakes up at six. She has breakfast with her family. She goes to school at seven thirty. In the evening, she reads books.",
            quiz = listOf(
                QuizQuestion("معنی Breakfast چیست؟", listOf("ناهار", "شام", "صبحانه", "میان‌وعده"), 2),
                QuizQuestion("کدام درست است؟", listOf("I always am happy.", "I am always happy.", "Always I am happy.", "I happy always."), 1)
            )
        ),

        // ==================== INTERMEDIATE ====================
        Lesson(
            id = "i1", unitNumber = 1, title = "Cultural Literacy", titlePersian = "آگاهی فرهنگی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Culture", "فرهنگ", "ˈkʌltʃər"),
                Word("Tradition", "سنت", "trəˈdɪʃən"),
                Word("Custom", "رسم", "ˈkʌstəm"),
                Word("Society", "جامعه", "səˈsaɪəti"),
                Word("Diversity", "تنوع", "dɪˈvɜrsəti")
            ),
            grammarTitle = "Present Perfect",
            grammarExplanation = "have/has + past participle\n\nبرای کارهایی که در گذشته شروع شده و ادامه دارند.",
            grammarExamples = listOf(
                "I have lived here for ten years. — ده سال است اینجا زندگی می‌کنم.",
                "She has visited many countries. — کشورهای زیادی دیده است.",
                "They have finished their homework. — تکالیفشان را تمام کرده‌اند."
            ),
            conversation = Conversation("Talking about travel", "صحبت درباره سفر", listOf(
                ConversationLine("A", "Have you ever traveled abroad?", "خارج سفر کرده‌ای؟"),
                ConversationLine("B", "Yes, I've been to Japan twice.", "بله، دو بار ژاپن بوده‌ام."),
                ConversationLine("A", "What did you like most?", "چی بیشتر دوست داشتی؟"),
                ConversationLine("B", "The culture and food.", "فرهنگ و غذا."),
                ConversationLine("A", "How long did you stay?", "چقدر موندی؟"),
                ConversationLine("B", "Two weeks each time.", "هر بار دو هفته.")
            )),
            storyTitle = "A Trip to Remember",
            storyText = "Last summer, Emma traveled to Japan. She has never seen such a beautiful culture. She learned about tea ceremonies and traditional clothing. It has been the best trip of her life.",
            quiz = listOf(
                QuizQuestion("معنی Diversity چیست؟", listOf("یکنواختی", "تنوع", "فرهنگ", "جامعه"), 1),
                QuizQuestion("کدام درست است؟", listOf("I have went to Paris.", "I have been to Paris.", "I has been to Paris.", "I have go to Paris."), 1)
            )
        ),

        Lesson(
            id = "i2", unitNumber = 2, title = "Modern Technology", titlePersian = "تکنولوژی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Technology", "تکنولوژی", "tɛkˈnɑlədʒi"),
                Word("Device", "دستگاه", "dɪˈvaɪs"),
                Word("App", "اپلیکیشن", "æp"),
                Word("Download", "دانلود", "ˈdaʊnloʊd"),
                Word("Software", "نرم‌افزار", "ˈsɔftwɛr"),
                Word("Innovation", "نوآوری", "ˌɪnəˈveɪʃən")
            ),
            grammarTitle = "Present Perfect Continuous",
            grammarExplanation = "have/has been + verb-ing",
            grammarExamples = listOf(
                "I have been using this app for a year. — یک سال است استفاده می‌کنم.",
                "She has been working all morning. — تمام صبح کار کرده.",
                "They have been developing software. — در حال توسعه نرم‌افزارند."
            ),
            conversation = Conversation("Technology talk", "صحبت درباره تکنولوژی", listOf(
                ConversationLine("A", "Have you tried the new app?", "اپ جدید رو امتحان کردی؟"),
                ConversationLine("B", "Yes, I've been using it for a month.", "بله، یک ماهه استفاده می‌کنم."),
                ConversationLine("A", "Is it useful?", "مفیده؟"),
                ConversationLine("B", "It's amazing!", "عالیه!"),
                ConversationLine("A", "We spend too much time on devices.", "وقت زیادی روی دستگاه‌ها می‌گذرونیم."),
                ConversationLine("B", "We need balance.", "به تعادل نیاز داریم.")
            )),
            storyTitle = "The Digital Age",
            storyText = "Technology has transformed our lives. We have been communicating through smartphones for years. New innovations appear every day. But technology should serve us, not control us.",
            quiz = listOf(
                QuizQuestion("معنی Innovation چیست؟", listOf("تکرار", "نوآوری", "تخریب", "سکون"), 1),
                QuizQuestion("کدام درست است؟", listOf("I have using it.", "I have been using it.", "I has been using it.", "I have be using."), 1)
            )
        ),

        // ==================== ADVANCED ====================
        Lesson(
            id = "a1", unitNumber = 1, title = "Friends and Family", titlePersian = "دوستان و خانواده", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Relationship", "رابطه", "rɪˈleɪʃənʃɪp"),
                Word("Supportive", "حمایت‌گر", "səˈpɔrtɪv"),
                Word("Trust", "اعتماد", "trʌst"),
                Word("Bond", "پیوند", "bɑnd"),
                Word("Loyalty", "وفاداری", "ˈlɔɪəlti")
            ),
            grammarTitle = "Passive Voice",
            grammarExplanation = "be + past participle",
            grammarExamples = listOf(
                "The book was written by a famous author. — کتاب توسط نویسنده معروف نوشته شد.",
                "English is spoken worldwide. — انگلیسی در سراسر جهان صحبت می‌شود.",
                "The bridge was built in 1990. — پل در سال ۱۹۹۰ ساخته شد."
            ),
            conversation = Conversation("Family values", "ارزش‌های خانوادگی", listOf(
                ConversationLine("A", "Family is most important.", "خانواده مهم‌ترینه."),
                ConversationLine("B", "Bond built on trust and loyalty.", "پیوند بر پایه اعتماد و وفاداری."),
                ConversationLine("A", "Relationships are taken for granted.", "روابط بدیهی فرض می‌شن."),
                ConversationLine("B", "People should be supportive.", "آدما باید حامی باشن."),
                ConversationLine("A", "Quality time matters.", "وقت باکیفیت مهمه."),
                ConversationLine("B", "Money can't buy that.", "پول نمی‌تونه بخره.")
            )),
            storyTitle = "Value of Friendship",
            storyText = "True friendship is built on trust and loyalty. It is not measured by time, but by depth. A supportive friend can be found in the darkest moments, and such bonds are never broken.",
            quiz = listOf(
                QuizQuestion("معنی Supportive چیست؟", listOf("بی‌تفاوت", "حمایت‌گر", "خشن", "تنها"), 1),
                QuizQuestion("کدام مجهول درست است؟", listOf("The book wrote by...", "The book was written by...", "The book is wrote by...", "The book written by..."), 1)
            )
        )
    )

    fun getLessonsByLevel(level: Level): List<Lesson> =
        lessons.filter { it.level == level }

    fun getLessonById(id: String): Lesson? =
        lessons.firstOrNull { it.id == id }
}