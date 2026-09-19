package com.example.englishteacher.data

object LessonRepository {

    private val lessons: List<Lesson> = listOf(

        // ==================== BEGINNER (Top Notch 1) ====================
        Lesson(
            id = "b1",
            unitNumber = 1,
            title = "Getting Acquainted",
            titlePersian = "آشنایی",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Hello", "سلام", "həˈloʊ"),
                Word("Hi", "سلام (خودمانی)", "haɪ"),
                Word("Name", "نام", "neɪm"),
                Word("Nice to meet you", "از آشنایی با شما خوشحالم", "naɪs tə mit ju"),
                Word("Friend", "دوست", "frɛnd"),
                Word("How are you?", "حالت چطوره؟", "haʊ ɑr ju")
            ),
            grammarTitle = "Present Simple - حال ساده",
            grammarExplanation = "زمان حال ساده برای بیان کارهای روزمره، عادت‌ها و حقایق کلی استفاده می‌شود.\n\nفرمول: فاعل + فعل ساده + مفعول",
            grammarExamples = listOf(
                "I study English. — من انگلیسی می‌خوانم.",
                "She works in a school. — او در یک مدرسه کار می‌کند.",
                "They live in Tehran. — آن‌ها در تهران زندگی می‌کنند."
            ),
            conversation = Conversation(
                title = "Meeting for the first time",
                titlePersian = "اولین آشنایی",
                lines = listOf(
                    ConversationLine("A", "Hello! My name is Tom.", "سلام! اسم من تام هست."),
                    ConversationLine("B", "Hi Tom! I'm Lily. Nice to meet you.", "سلام تام! من لی‌لی هستم. از آشنایی با تو خوشحالم."),
                    ConversationLine("A", "Nice to meet you too, Lily. How are you?", "من هم از آشنایی با تو خوشحالم لی‌لی. حالت چطوره؟"),
                    ConversationLine("B", "I'm fine, thank you. And you?", "خوبم، ممنون. تو چطوری؟"),
                    ConversationLine("A", "I'm great! Where are you from?", "من عالی‌ام! اهل کجایی؟"),
                    ConversationLine("B", "I'm from Iran. And you?", "من اهل ایرانم. تو چطور؟")
                )
            ),
            storyTitle = "A New Friend",
            storyText = "Tom is a new student at school. He is shy, but he wants to make friends. One day, he meets a girl named Lily. They talk, and soon they become friends.",
            quiz = listOf(
                QuizQuestion(
                    question = "What does \"Hello\" mean?",
                    options = listOf("سلام", "خداحافظ", "نام", "ممنون"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "\"Nice to meet you\" یعنی چه؟",
                    options = listOf("حالت چطوره؟", "از آشنایی با شما خوشحالم", "اسمت چیه؟", "کجایی؟"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "She work in a school.",
                        "She works in a school.",
                        "She working in a school.",
                        "She worked in a school."
                    ),
                    correctIndex = 1
                )
            )
        ),

        Lesson(
            id = "b2",
            unitNumber = 2,
            title = "Going Shopping",
            titlePersian = "خرید کردن",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shop", "مغازه", "ʃɑp"),
                Word("Buy", "خریدن", "baɪ"),
                Word("Price", "قیمت", "praɪs"),
                Word("Money", "پول", "ˈmʌni"),
                Word("Cheap", "ارزان", "tʃip"),
                Word("Expensive", "گران", "ɪkˈspɛnsɪv")
            ),
            grammarTitle = "This / That / These / Those",
            grammarExplanation = "برای اشاره به اشیا استفاده می‌شود.\n\nThis = این (نزدیک، مفرد)\nThat = آن (دور، مفرد)\nThese = این‌ها (نزدیک، جمع)\nThose = آن‌ها (دور، جمع)",
            grammarExamples = listOf(
                "This book is cheap. — این کتاب ارزان است.",
                "That car is expensive. — آن ماشین گران است.",
                "These shoes are new. — این کفش‌ها نو هستند."
            ),
            conversation = Conversation(
                title = "At the clothing store",
                titlePersian = "در فروشگاه لباس",
                lines = listOf(
                    ConversationLine("A", "Excuse me, how much is this shirt?", "ببخشید، این پیراهن چنده؟"),
                    ConversationLine("B", "It's twenty dollars.", "بیست دلار است."),
                    ConversationLine("A", "That's a good price. Is it new?", "قیمت خوبیه. جدیده؟"),
                    ConversationLine("B", "Yes, it is. We have it in blue and white.", "بله، جدیده. آبی و سفیدش رو داریم."),
                    ConversationLine("A", "I like the blue one. I'll take it.", "آبی رو دوست دارم. همین رو می‌خرم."),
                    ConversationLine("B", "Great choice! That will be twenty dollars.", "انتخاب عالی! بیست دلار می‌شه.")
                )
            ),
            storyTitle = "Shopping with Mom",
            storyText = "Sara goes shopping with her mom. She wants to buy a new dress. The dress is blue and pretty. It is not expensive. Sara is very happy.",
            quiz = listOf(
                QuizQuestion(
                    question = "معنی \"Expensive\" چیست؟",
                    options = listOf("ارزان", "گران", "زیبا", "جدید"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "This books are new.",
                        "This book is new.",
                        "These book is new.",
                        "This book are new."
                    ),
                    correctIndex = 1
                )
            )
        ),

        // ==================== INTERMEDIATE (Top Notch 2) ====================
        Lesson(
            id = "i1",
            unitNumber = 1,
            title = "Cultural Literacy",
            titlePersian = "آگاهی فرهنگی",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Culture", "فرهنگ", "ˈkʌltʃər"),
                Word("Tradition", "سنت", "trəˈdɪʃən"),
                Word("Custom", "رسم و رسوم", "ˈkʌstəm"),
                Word("Society", "جامعه", "səˈsaɪəti"),
                Word("Diversity", "تنوع", "dɪˈvɜrsəti")
            ),
            grammarTitle = "Present Perfect - حال کامل",
            grammarExplanation = "زمان حال کامل برای بیان کارهایی که در گذشته شروع شده و تا حالا ادامه دارند یا اثرشان باقی است.\n\nفرمول: have/has + past participle",
            grammarExamples = listOf(
                "I have lived here for ten years. — من ده سال است اینجا زندگی می‌کنم.",
                "She has visited many countries. — او کشورهای زیادی را دیده است.",
                "They have finished their homework. — آن‌ها تکالیفشان را تمام کرده‌اند."
            ),
            conversation = Conversation(
                title = "Talking about travel",
                titlePersian = "صحبت درباره سفر",
                lines = listOf(
                    ConversationLine("A", "Have you ever traveled to another country?", "آیا تا حالا به کشور دیگه‌ای سفر کرده‌ای؟"),
                    ConversationLine("B", "Yes, I have. I've been to Japan twice.", "بله، رفته‌ام. دو بار ژاپن بوده‌ام."),
                    ConversationLine("A", "That's amazing! What did you like most?", "عالیه! بیشتر از همه چی خوشت اومد؟"),
                    ConversationLine("B", "The culture and the food. Everything is so different there.", "فرهنگ و غذا. همه چیز اونجا خیلی متفاوته."),
                    ConversationLine("A", "I've always wanted to go there. How long did you stay?", "من همیشه می‌خواستم اونجا برم. چقدر موندی؟"),
                    ConversationLine("B", "I stayed for two weeks each time.", "هر بار دو هفته موندم.")
                )
            ),
            storyTitle = "A Trip to Remember",
            storyText = "Last summer, Emma traveled to Japan. She has never seen such a beautiful culture before. She learned about tea ceremonies, traditional clothing, and the kindness of the people. It has been the best trip of her life.",
            quiz = listOf(
                QuizQuestion(
                    question = "معنی \"Diversity\" چیست؟",
                    options = listOf("یکنواختی", "تنوع", "فرهنگ", "جامعه"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "کدام جمله در زمان حال کامل درست است؟",
                    options = listOf(
                        "I have went to Paris.",
                        "I have been to Paris.",
                        "I has been to Paris.",
                        "I have go to Paris."
                    ),
                    correctIndex = 1
                )
            )
        ),

        // ==================== ADVANCED (Top Notch 3) ====================
        Lesson(
            id = "a1",
            unitNumber = 1,
            title = "Friends and Family",
            titlePersian = "دوستان و خانواده",
            level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Relationship", "رابطه", "rɪˈleɪʃənʃɪp"),
                Word("Supportive", "حمایت‌گر", "səˈpɔrtɪv"),
                Word("Trust", "اعتماد", "trʌst"),
                Word("Bond", "پیوند", "bɑnd"),
                Word("Loyalty", "وفاداری", "ˈlɔɪəlti")
            ),
            grammarTitle = "Passive Voice - مجهول",
            grammarExplanation = "مجهول برای زمانی که فاعل مهم نیست یا نمی‌خواهیم ذکر کنیم.\n\nفرمول: be + past participle",
            grammarExamples = listOf(
                "The book was written by a famous author. — کتاب توسط یک نویسنده معروف نوشته شد.",
                "English is spoken all over the world. — انگلیسی در سراسر جهان صحبت می‌شود.",
                "The bridge was built in 1990. — پل در سال ۱۹۹۰ ساخته شد."
            ),
            conversation = Conversation(
                title = "Discussing family values",
                titlePersian = "بحث درباره ارزش‌های خانوادگی",
                lines = listOf(
                    ConversationLine("A", "In my opinion, family is the most important thing in life.", "به نظر من، خانواده مهم‌ترین چیز در زندگیه."),
                    ConversationLine("B", "I agree. A strong family bond is built on trust and loyalty.", "موافقم. یه پیوند خانوادگی قوی بر پایه اعتماد و وفاداری ساخته می‌شه."),
                    ConversationLine("A", "That's true. But nowadays, relationships are often taken for granted.", "درسته. ولی امروزه، روابط اغلب بدیهی فرض می‌شن."),
                    ConversationLine("B", "You're right. People should be more supportive of each other.", "حق داری. آدما باید بیشتر حامی همدیگه باشن."),
                    ConversationLine("A", "Couldn't agree more. Quality time is what matters.", "کاملاً موافقم. وقت باکیفیت چیزیه که اهمیت داره."),
                    ConversationLine("B", "Exactly. Money can't buy that.", "دقیقاً. پول نمی‌تونه اون رو بخره.")
                )
            ),
            storyTitle = "The Value of Friendship",
            storyText = "True friendship is built on trust and loyalty. It is not measured by the time spent together, but by the depth of the connection. A supportive friend can be found in the darkest moments, and such bonds are never broken.",
            quiz = listOf(
                QuizQuestion(
                    question = "معنی \"Supportive\" چیست؟",
                    options = listOf("بی‌تفاوت", "حمایت‌گر", "خشن", "تنها"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "کدام جمله مجهول درست است؟",
                    options = listOf(
                        "The book wrote by Shakespeare.",
                        "The book was written by Shakespeare.",
                        "The book is wrote by Shakespeare.",
                        "The book written by Shakespeare."
                    ),
                    correctIndex = 1
                )
            )
        )
    )

    fun getLessonsByLevel(level: Level): List<Lesson> =
        lessons.filter { it.level == level }

    fun getLessonById(id: String): Lesson? =
        lessons.firstOrNull { it.id == id }
}