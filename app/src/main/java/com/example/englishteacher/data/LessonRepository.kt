package com.example.englishteacher.data

object LessonRepository {

    private val lessons: List<Lesson> = listOf(

        // ==================== BEGINNER (Top Notch 1) - 10 Lessons ====================
        Lesson(
            id = "b1", unitNumber = 1, title = "Getting Acquainted", titlePersian = "آشنایی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Hello", "سلام", "həˈloʊ"), Word("Hi", "سلام (خودمانی)", "haɪ"),
                Word("Name", "نام", "neɪm"), Word("Nice to meet you", "از آشنایی خوشحالم", "naɪs tə mit ju"),
                Word("Friend", "دوست", "frɛnd"), Word("How are you?", "حالت چطوره؟", "haʊ ɑr ju")
            ),
            grammarTitle = "Present Simple - حال ساده",
            grammarExplanation = "زمان حال ساده برای کارهای روزمره، عادت‌ها و حقایق کلی.\n\nفرمول: فاعل + فعل ساده + مفعول",
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
                QuizQuestion("\"Nice to meet you\" یعنی چه؟", listOf("حالت چطوره؟", "از آشنایی خوشحالم", "اسمت چیه؟", "کجایی؟"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("She work in a school.", "She works in a school.", "She working.", "She worked."), 1)
            )
        ),

        Lesson(
            id = "b2", unitNumber = 2, title = "Going Shopping", titlePersian = "خرید کردن", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shop", "مغازه", "ʃɑp"), Word("Buy", "خریدن", "baɪ"),
                Word("Price", "قیمت", "praɪs"), Word("Money", "پول", "ˈmʌni"),
                Word("Cheap", "ارزان", "tʃip"), Word("Expensive", "گران", "ɪkˈspɛnsɪv")
            ),
            grammarTitle = "This / That / These / Those",
            grammarExplanation = "This = این (نزدیک، مفرد)\nThat = آن (دور، مفرد)\nThese = این‌ها (جمع)\nThose = آن‌ها (جمع)",
            grammarExamples = listOf(
                "This book is cheap. — این کتاب ارزان است.",
                "That car is expensive. — آن ماشین گران است.",
                "These shoes are new. — این کفش‌ها نو هستند."
            ),
            conversation = Conversation("At the clothing store", "در فروشگاه لباس", listOf(
                ConversationLine("A", "Excuse me, how much is this shirt?", "ببخشید، این پیراهن چنده؟"),
                ConversationLine("B", "It's twenty dollars.", "بیست دلار است."),
                ConversationLine("A", "That's a good price. Is it new?", "قیمت خوبیه. جدیده؟"),
                ConversationLine("B", "Yes, it is. We have it in blue.", "بله. آبی‌اش رو داریم."),
                ConversationLine("A", "I'll take the blue one.", "آبی رو می‌خرم."),
                ConversationLine("B", "Great choice!", "انتخاب عالی!")
            )),
            storyTitle = "Shopping with Mom",
            storyText = "Sara goes shopping with her mom. She wants to buy a new dress. The dress is blue and pretty. It is not expensive. Sara is very happy.",
            quiz = listOf(
                QuizQuestion("معنی \"Expensive\" چیست؟", listOf("ارزان", "گران", "زیبا", "جدید"), 1),
                QuizQuestion("کدام درست است؟", listOf("This books are new.", "This book is new.", "These book is new.", "This book are new."), 1)
            )
        ),

        Lesson(
            id = "b3", unitNumber = 3, title = "Daily Routine", titlePersian = "برنامه روزانه", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Wake up", "بیدار شدن", "weɪk ʌp"), Word("Breakfast", "صبحانه", "ˈbrɛkfəst"),
                Word("Work", "کار", "wɜrk"), Word("Lunch", "ناهار", "lʌntʃ"),
                Word("Dinner", "شام", "ˈdɪnər"), Word("Sleep", "خوابیدن", "slip")
            ),
            grammarTitle = "Adverbs of Frequency",
            grammarExplanation = "Always, Usually, Often, Sometimes, Never\n\nجای قید: قبل از فعل اصلی، بعد از to be",
            grammarExamples = listOf(
                "I always wake up at 7 AM. — همیشه ساعت ۷ بیدار می‌شوم.",
                "She usually has breakfast at home. — معمولاً در خانه صبحانه می‌خورد.",
                "They never work on Fridays. — هرگز جمعه‌ها کار نمی‌کنند."
            ),
            conversation = Conversation("Talking about daily routine", "برنامه روزانه", listOf(
                ConversationLine("A", "What time do you usually wake up?", "ساعت چند بیدار می‌شی؟"),
                ConversationLine("B", "I usually wake up at six thirty.", "ساعت شش و نیم."),
                ConversationLine("A", "Do you have breakfast every morning?", "هر روز صبحانه می‌خوری؟"),
                ConversationLine("B", "Yes, I always have breakfast.", "بله، همیشه می‌خورم."),
                ConversationLine("A", "Sometimes I skip breakfast when I'm late.", "بعضی وقت‌ها حذف می‌کنم."),
                ConversationLine("B", "You should never skip breakfast!", "هرگز نباید حذف کنی!")
            )),
            storyTitle = "A Busy Day",
            storyText = "Anna is a teacher. She always wakes up at six o'clock. She has breakfast with her family. She goes to school at seven thirty. In the evening, she reads books and goes to bed at ten.",
            quiz = listOf(
                QuizQuestion("معنی \"Breakfast\" چیست؟", listOf("ناهار", "شام", "صبحانه", "میان‌وعده"), 2),
                QuizQuestion("کدام درست است؟", listOf("I always am happy.", "I am always happy.", "Always I am happy.", "I happy am."), 1)
            )
        ),

        Lesson(
            id = "b4", unitNumber = 4, title = "Food and Drinks", titlePersian = "غذا و نوشیدنی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Water", "آب", "ˈwɔtər"), Word("Bread", "نان", "brɛd"),
                Word("Rice", "برنج", "raɪs"), Word("Chicken", "مرغ", "ˈtʃɪkɪn"),
                Word("Apple", "سیب", "ˈæpəl"), Word("Delicious", "خوشمزه", "dɪˈlɪʃəs")
            ),
            grammarTitle = "Countable & Uncountable Nouns",
            grammarExplanation = "قابل شمارش: a/an + اسم\nغیرقابل شمارش: some + اسم",
            grammarExamples = listOf(
                "I want an apple. — یک سیب می‌خواهم.",
                "Can I have some water? — کمی آب می‌خواهم؟",
                "There are three oranges." — سه پرتقال هست."
            ),
            conversation = Conversation("At a restaurant", "در رستوران", listOf(
                ConversationLine("A", "What would you like to eat?", "چی می‌خواهید بخورید؟"),
                ConversationLine("B", "Some chicken and rice, please.", "کمی مرغ و برنج لطفاً."),
                ConversationLine("A", "Something to drink?", "نوشیدنی؟"),
                ConversationLine("B", "Some water, please.", "کمی آب لطفاً."),
                ConversationLine("A", "Anything else?", "چیز دیگه‌ای؟"),
                ConversationLine("B", "No, thank you.", "نه، ممنون.")
            )),
            storyTitle = "Lunch with Friends",
            storyText = "Sara and her friends are in a restaurant. Sara orders chicken and rice. Her friend orders pizza. They share an apple for dessert. The food is delicious.",
            quiz = listOf(
                QuizQuestion("کدام غیرقابل شمارش است؟", listOf("Apple", "Water", "Book", "Car"), 1),
                QuizQuestion("معنی \"Delicious\" چیست؟", listOf("بد", "تند", "خوشمزه", "سرد"), 2)
            )
        ),

        Lesson(
            id = "b5", unitNumber = 5, title = "At School", titlePersian = "در مدرسه", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Teacher", "معلم", "ˈtitʃər"), Word("Student", "دانش‌آموز", "ˈstudənt"),
                Word("Classroom", "کلاس", "ˈklæsrum"), Word("Book", "کتاب", "bʊk"),
                Word("Homework", "تکلیف", "ˈhoʊmwɜrk"), Word("Library", "کتابخانه", "ˈlaɪbrɛri")
            ),
            grammarTitle = "There is / There are",
            grammarExplanation = "There is + مفرد\nThere are + جمع",
            grammarExamples = listOf(
                "There is a book on the desk. — یک کتاب روی میز است.",
                "There are twenty students. — بیست دانش‌آموز هستند.",
                "Is there a library? — آیا کتابخانه‌ای هست؟"
            ),
            conversation = Conversation("Asking about school", "سوال درباره مدرسه", listOf(
                ConversationLine("A", "Is there a library in your school?", "کتابخانه‌ای در مدرسه‌ت هست؟"),
                ConversationLine("B", "Yes, there is.", "بله."),
                ConversationLine("A", "How many students are in your class?", "چند دانش‌آموز در کلاس؟"),
                ConversationLine("B", "There are twenty-five.", "بیست و پنج."),
                ConversationLine("A", "Do you have a lot of homework?", "تکلیف زیاد داری؟"),
                ConversationLine("B", "Yes, every day.", "بله، هر روز.")
            )),
            storyTitle = "The First Day of School",
            storyText = "It is Ali's first day of school. There are many students in his classroom. His teacher is very kind. There is a big library near his class. Ali is excited.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("There is twenty students.", "There are twenty students.", "There have twenty.", "There has twenty."), 1),
                QuizQuestion("معنی \"Homework\" چیست؟", listOf("امتحان", "کتاب", "تکلیف", "معلم"), 2)
            )
        ),

        Lesson(
            id = "b6", unitNumber = 6, title = "Hobbies", titlePersian = "سرگرمی‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Reading", "کتاب خواندن", "ˈridɪŋ"), Word("Swimming", "شنا کردن", "ˈswɪmɪŋ"),
                Word("Drawing", "نقاشی", "ˈdrɔɪŋ"), Word("Cooking", "آشپزی", "ˈkʊkɪŋ"),
                Word("Music", "موسیقی", "ˈmjuzɪk"), Word("Enjoy", "لذت بردن", "ɪnˈdʒɔɪ")
            ),
            grammarTitle = "Like + Verb-ing",
            grammarExplanation = "I like swimming. — شنا دوست دارم.\nI love reading. — عاشق خواندنم.",
            grammarExamples = listOf(
                "I like playing football. — فوتبال دوست دارم.",
                "She loves drawing. — عاشق نقاشی است.",
                "They enjoy music. — موسیقی را لذت می‌برند."
            ),
            conversation = Conversation("Talking about hobbies", "سرگرمی‌ها", listOf(
                ConversationLine("A", "What do you like doing in your free time?", "وقت آزادت چی دوست داری بکنی؟"),
                ConversationLine("B", "I love reading and drawing.", "عاشق خواندن و نقاشی هستم."),
                ConversationLine("A", "Do you like sports?", "ورزش دوست داری؟"),
                ConversationLine("B", "Yes, I enjoy swimming.", "بله، شنا دوست دارم."),
                ConversationLine("A", "I like playing music.", "من موسیقی دوست دارم."),
                ConversationLine("B", "Music is a great hobby.", "موسیقی سرگرمی عالیه.")
            )),
            storyTitle = "A Weekend Full of Fun",
            storyText = "On weekends, Reza loves his hobbies. He reads books in the morning. In the afternoon, he swims with friends. In the evening, he listens to music.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I like swim.", "I like swimming.", "I like to swiming.", "I like swiming."), 1),
                QuizQuestion("معنی \"Enjoy\" چیست؟", listOf("متنفر بودن", "لذت بردن", "خسته شدن", "ترسیدن"), 1)
            )
        ),

        Lesson(
            id = "b7", unitNumber = 7, title = "My Neighborhood", titlePersian = "محله من", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Neighborhood", "محله", "ˈneɪbərhʊd"), Word("Street", "خیابان", "strit"),
                Word("Park", "پارک", "pɑrk"), Word("Market", "بازار", "ˈmɑrkɪt"),
                Word("Hospital", "بیمارستان", "ˈhɑspɪtl"), Word("Bank", "بانک", "bæŋk")
            ),
            grammarTitle = "Prepositions of Place",
            grammarExplanation = "In, On, Next to, Near, Between, Across from",
            grammarExamples = listOf(
                "The bank is next to the market. — بانک کنار بازار.",
                "A park across from my house. — پارکی مقابل خانه‌ام.",
                "Between school and restaurant. — بین مدرسه و رستوران."
            ),
            conversation = Conversation("Asking for directions", "پرسیدن آدرس", listOf(
                ConversationLine("A", "Is there a bank near here?", "بانکی این نزدیکی هست؟"),
                ConversationLine("B", "Yes, next to the market.", "بله، کنار بازار."),
                ConversationLine("A", "Is it far?", "دوره؟"),
                ConversationLine("B", "No, 5 minutes on foot.", "نه، ۵ دقیقه پیاده."),
                ConversationLine("A", "Is there a park?", "پارکی هست؟"),
                ConversationLine("B", "Yes, across from the hospital.", "بله، مقابل بیمارستان.")
            )),
            storyTitle = "My New Neighborhood",
            storyText = "Maryam moved to a new neighborhood. Her house is near a big park. There is a market next to her building. The bank is across from the hospital.",
            quiz = listOf(
                QuizQuestion("معنی \"Next to\" چیست؟", listOf("دور از", "روی", "کنارِ", "زیرِ"), 2),
                QuizQuestion("کدام درست است؟", listOf("Bank is on market.", "Bank is next to market.", "Bank is between market.", "Bank is near of market."), 1)
            )
        ),

        Lesson(
            id = "b8", unitNumber = 8, title = "Weather and Seasons", titlePersian = "آب و هوا", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Weather", "آب و هوا", "ˈwɛðər"), Word("Sunny", "آفتابی", "ˈsʌni"),
                Word("Rainy", "بارانی", "ˈreɪni"), Word("Snowy", "برفی", "ˈsnoʊi"),
                Word("Spring", "بهار", "sprɪŋ"), Word("Winter", "زمستان", "ˈwɪntər")
            ),
            grammarTitle = "Present Continuous",
            grammarExplanation = "am/is/are + verb-ing",
            grammarExamples = listOf(
                "It is raining now. — داره بارون میاد.",
                "The sun is shining. — خورشید می‌تابه.",
                "We are wearing coats. — کاپشن پوشیدیم."
            ),
            conversation = Conversation("Weather talk", "صحبت درباره هوا", listOf(
                ConversationLine("A", "What's the weather like?", "هوا چطوره؟"),
                ConversationLine("B", "Sunny and warm.", "آفتابی و گرم."),
                ConversationLine("A", "Favorite season?", "فصل مورد علاقه؟"),
                ConversationLine("B", "Spring. Flowers are beautiful.", "بهار. گل‌ها زیبا هستن."),
                ConversationLine("A", "I prefer winter.", "من زمستان را ترجیح می‌دهم."),
                ConversationLine("B", "But it's too cold!", "ولی خیلی سرده!")
            )),
            storyTitle = "A Rainy Day",
            storyText = "Today is a rainy day. Tom is looking out the window. The rain is falling softly. He is drinking hot tea. His cat is sleeping on the sofa.",
            quiz = listOf(
                QuizQuestion("معنی \"Sunny\" چیست؟", listOf("بارانی", "برفی", "آفتابی", "بادی"), 2),
                QuizQuestion("کدام درست است؟", listOf("It is rain.", "It is raining.", "It raining.", "It rains."), 1)
            )
        ),

        Lesson(
            id = "b9", unitNumber = 9, title = "Clothes and Fashion", titlePersian = "لباس و مد", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shirt", "پیراهن", "ʃɜrt"), Word("Pants", "شلوار", "pænts"),
                Word("Shoes", "کفش", "ʃuz"), Word("Jacket", "کاپشن", "ˈdʒækɪt"),
                Word("Size", "اندازه", "saɪz"), Word("Beautiful", "زیبا", "ˈbjutəfəl")
            ),
            grammarTitle = "Possessive Adjectives",
            grammarExplanation = "My, Your, His, Her, Our, Their",
            grammarExamples = listOf(
                "This is my jacket. — کاپشن من.",
                "Her dress is beautiful. — لباسش زیباست.",
                "Their shoes are new. — کفش‌هاشون نو هستن."
            ),
            conversation = Conversation("Shopping for clothes", "خرید لباس", listOf(
                ConversationLine("A", "Can I help you?", "کمک کنم؟"),
                ConversationLine("B", "I'm looking for a jacket.", "دنبال کاپشنم."),
                ConversationLine("A", "What size?", "چه سایزی؟"),
                ConversationLine("B", "Medium. In blue?", "متوسط. آبی؟"),
                ConversationLine("A", "Yes. Try it on?", "بله. پرو می‌کنی؟"),
                ConversationLine("B", "Yes, please.", "بله، لطفاً.")
            )),
            storyTitle = "Sara's New Dress",
            storyText = "Sara is going to a party. She wants a new dress. Her mother takes her to a shop. Sara tries on a red dress. It fits her very well. She looks beautiful.",
            quiz = listOf(
                QuizQuestion("معنی \"Jacket\" چیست؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                QuizQuestion("کدام درست است؟", listOf("This is me jacket.", "This is my jacket.", "This is I jacket.", "This is mine jacket."), 1)
            )
        ),

        Lesson(
            id = "b10", unitNumber = 10, title = "Health and Body", titlePersian = "سلامتی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Head", "سر", "hɛd"), Word("Stomach", "شکم", "ˈstʌmək"),
                Word("Doctor", "دکتر", "ˈdɑktər"), Word("Medicine", "دارو", "ˈmɛdəsɪn"),
                Word("Sick", "بیمار", "sɪk"), Word("Healthy", "سالم", "ˈhɛlθi")
            ),
            grammarTitle = "Should / Shouldn't",
            grammarExplanation = "You should + verb (باید)\nYou shouldn't + verb (نباید)",
            grammarExamples = listOf(
                "You should see a doctor. — باید دکتر ببینی.",
                "You shouldn't eat sugar. — نباید شکر بخوری.",
                "You should sleep more. — باید بیشتر بخوابی."
            ),
            conversation = Conversation("At the doctor's office", "مطب دکتر", listOf(
                ConversationLine("A", "What's the matter?", "چی شده؟"),
                ConversationLine("B", "I have a headache.", "سردرد دارم."),
                ConversationLine("A", "How long?", "چقدره؟"),
                ConversationLine("B", "Since yesterday.", "از دیروز."),
                ConversationLine("A", "Rest and take this medicine.", "استراحت کن و این دارو رو بخور."),
                ConversationLine("B", "Thank you, doctor.", "ممنون دکتر.")
            )),
            storyTitle = "Feeling Sick",
            storyText = "Ali feels sick today. He has a stomachache and a headache. His mother takes him to the doctor. The doctor says he should rest. The next morning, he feels better.",
            quiz = listOf(
                QuizQuestion("معنی \"Healthy\" چیست؟", listOf("بیمار", "خسته", "سالم", "دردناک"), 2),
                QuizQuestion("کدام درست است؟", listOf("You should to rest.", "You should rest.", "You should resting.", "You should rests."), 1)
            )
        ),

        // ==================== INTERMEDIATE (Top Notch 2) - 10 Lessons ====================
        Lesson(
            id = "i1", unitNumber = 1, title = "Cultural Literacy", titlePersian = "آگاهی فرهنگی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Culture", "فرهنگ", "ˈkʌltʃər"), Word("Tradition", "سنت", "trəˈdɪʃən"),
                Word("Custom", "رسم", "ˈkʌstəm"), Word("Society", "جامعه", "səˈsaɪəti"),
                Word("Diversity", "تنوع", "dɪˈvɜrsəti")
            ),
            grammarTitle = "Present Perfect",
            grammarExplanation = "have/has + past participle",
            grammarExamples = listOf(
                "I have lived here for ten years. — ده سال است اینجا زندگی می‌کنم.",
                "She has visited many countries. — کشورهای زیادی دیده.",
                "They have finished their homework. — تکالیف را تمام کرده‌اند."
            ),
            conversation = Conversation("Talking about travel", "سفر", listOf(
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
                QuizQuestion("معنی \"Diversity\" چیست؟", listOf("یکنواختی", "تنوع", "فرهنگ", "جامعه"), 1),
                QuizQuestion("کدام درست است؟", listOf("I have went to Paris.", "I have been to Paris.", "I has been to Paris.", "I have go to Paris."), 1)
            )
        ),

        Lesson(
            id = "i2", unitNumber = 2, title = "Modern Technology", titlePersian = "تکنولوژی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Technology", "تکنولوژی", "tɛkˈnɑlədʒi"), Word("Device", "دستگاه", "dɪˈvaɪs"),
                Word("App", "اپلیکیشن", "æp"), Word("Download", "دانلود", "ˈdaʊnloʊd"),
                Word("Software", "نرم‌افزار", "ˈsɔftwɛr"), Word("Innovation", "نوآوری", "ˌɪnəˈveɪʃən")
            ),
            grammarTitle = "Present Perfect Continuous",
            grammarExplanation = "have/has been + verb-ing",
            grammarExamples = listOf(
                "I have been using this app for a year. — یک سال است استفاده می‌کنم.",
                "She has been working all morning. — تمام صبح کار کرده.",
                "They have been developing software. — در حال توسعه نرم‌افزارند."
            ),
            conversation = Conversation("Discussing technology", "تکنولوژی", listOf(
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
                QuizQuestion("معنی \"Innovation\" چیست؟", listOf("تکرار", "نوآوری", "تخریب", "سکون"), 1),
                QuizQuestion("کدام درست است؟", listOf("I have using it.", "I have been using it.", "I has been using it.", "I have be using it."), 1)
            )
        ),

        Lesson(
            id = "i3", unitNumber = 3, title = "Healthy Lifestyle", titlePersian = "زندگی سالم", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Exercise", "ورزش", "ˈɛksərsaɪz"), Word("Nutrition", "تغذیه", "nuˈtrɪʃən"),
                Word("Stress", "استرس", "strɛs"), Word("Balance", "تعادل", "ˈbæləns"),
                Word("Habit", "عادت", "ˈhæbɪt"), Word("Lifestyle", "سبک زندگی", "ˈlaɪfstaɪl")
            ),
            grammarTitle = "Modal Verbs",
            grammarExplanation = "Must = باید\nHave to = مجبور بودن\nShould = بهتره",
            grammarExamples = listOf(
                "You must drink water. — باید آب بنوشی.",
                "I have to wake up early. — مجبورم زود بیدار شم.",
                "She should reduce stress. — بهتره استرس را کم کنه."
            ),
            conversation = Conversation("Healthy habits", "عادات سالم", listOf(
                ConversationLine("A", "I've been trying to live healthier.", "سعی می‌کنم سالم‌تر زندگی کنم."),
                ConversationLine("B", "What changes did you make?", "چه تغییراتی دادی؟"),
                ConversationLine("A", "I exercise 3 times a week.", "هفته‌ای ۳ بار ورزش می‌کنم."),
                ConversationLine("B", "How do you manage stress?", "استرس رو چطور مدیریت می‌کنی؟"),
                ConversationLine("A", "I practice meditation.", "مدیتیشن تمرین می‌کنم."),
                ConversationLine("B", "Balance is important.", "تعادل مهمه.")
            )),
            storyTitle = "A Journey to Wellness",
            storyText = "Sarah used to have unhealthy habits. She never exercised and ate fast food. One day, she decided to change. Now she feels more energetic and happier than ever.",
            quiz = listOf(
                QuizQuestion("معنی \"Wellness\" چیست؟", listOf("بیماری", "سلامتی", "خستگی", "استرس"), 1),
                QuizQuestion("کدام درست است؟", listOf("You must to exercise.", "You must exercise.", "You must exercising.", "You must exercises."), 1)
            )
        ),

        Lesson(
            id = "i4", unitNumber = 4, title = "Travel and Adventure", titlePersian = "سفر و ماجراجویی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Adventure", "ماجراجویی", "ædˈvɛntʃər"), Word("Destination", "مقصد", "ˌdɛstɪˈneɪʃən"),
                Word("Journey", "سفر", "ˈdʒɜrni"), Word("Explore", "کاوش کردن", "ɪkˈsplɔr"),
                Word("Landscape", "منظره", "ˈlændskeɪp"), Word("Souvenir", "سوغات", "ˌsuvəˈnɪr")
            ),
            grammarTitle = "Past Perfect",
            grammarExplanation = "had + past participle",
            grammarExamples = listOf(
                "The tour had started when we arrived. — تور شروع شده بود.",
                "She had never seen such views. — هرگز چنین منظره‌هایی ندیده بود.",
                "They had booked the hotel. — هتل را رزرو کرده بودند."
            ),
            conversation = Conversation("Planning a trip", "برنامه سفر", listOf(
                ConversationLine("A", "I'm planning an adventure trip.", "دارم سفر ماجراجویی برنامه‌ریزی می‌کنم."),
                ConversationLine("B", "Have you decided the destination?", "مقصد رو مشخص کردی؟"),
                ConversationLine("A", "Yes, Peru. I want to explore Machu Picchu.", "بله، پرو. ماچو پیچو رو ببینم."),
                ConversationLine("B", "Have you made an itinerary?", "برنامه سفر نوشتی؟"),
                ConversationLine("A", "I had researched it before booking.", "قبل از بلیط تحقیق کرده بودم."),
                ConversationLine("B", "Try the local food!", "غذای محلی رو امتحان کن!")
            )),
            storyTitle = "Adventure of a Lifetime",
            storyText = "James had dreamed of traveling to Nepal. When he arrived in Kathmandu, his dream had come true. He had prepared for years. The landscapes were breathtaking. It was the adventure of a lifetime.",
            quiz = listOf(
                QuizQuestion("معنی \"Destination\" چیست؟", listOf("مسیر", "مقصد", "وسیله", "بلیط"), 1),
                QuizQuestion("کدام درست است؟", listOf("She had see it.", "She had seen it.", "She has seen it.", "She had saw it."), 1)
            )
        ),

        Lesson(
            id = "i5", unitNumber = 5, title = "Work and Career", titlePersian = "کار و حرفه", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Career", "حرفه", "kəˈrɪr"), Word("Interview", "مصاحبه", "ˈɪntərvju"),
                Word("Resume", "رزومه", "ˈrɛzəmeɪ"), Word("Salary", "حقوق", "ˈsæləri"),
                Word("Promotion", "ترفیع", "prəˈmoʊʃən"), Word("Colleague", "همکار", "ˈkɑliɡ")
            ),
            grammarTitle = "Reported Speech",
            grammarExplanation = "She said, \"I am busy.\" → She said she was busy.",
            grammarExamples = listOf(
                "He said he was looking for a job. — گفت دنبال کار می‌گردد.",
                "She told me she had applied. — گفت درخواست داده.",
                "They said they would call. — گفتند زنگ می‌زنند."
            ),
            conversation = Conversation("Job interview", "مصاحبه شغلی", listOf(
                ConversationLine("A", "Tell me about your experience.", "از تجربه‌ت بگو."),
                ConversationLine("B", "I worked as a manager for 3 years.", "۳ سال مدیر بودم."),
                ConversationLine("A", "What skills are important?", "چه مهارت‌هایی مهمه؟"),
                ConversationLine("B", "Communication and teamwork.", "ارتباطات و کار تیمی."),
                ConversationLine("A", "Why leave your job?", "چرا ترک می‌کنی؟"),
                ConversationLine("B", "New challenges and better salary.", "چالش‌های جدید و حقوق بهتر.")
            )),
            storyTitle = "The Promotion",
            storyText = "Daniel had been working at the company for five years. When the manager position opened, he applied. After a difficult interview, he was offered the promotion. His colleagues congratulated him.",
            quiz = listOf(
                QuizQuestion("معنی \"Promotion\" چیست؟", listOf("اخراج", "ترفیع", "استعفا", "استخدام"), 1),
                QuizQuestion("کدام درست است؟", listOf("He said he is busy.", "He said he was busy.", "He said he will be busy.", "He said he be busy."), 1)
            )
        ),

        Lesson(
            id = "i6", unitNumber = 6, title = "Environmental Issues", titlePersian = "محیط زیست", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Environment", "محیط زیست", "ɪnˈvaɪrənmənt"), Word("Pollution", "آلودگی", "pəˈluʃən"),
                Word("Recycle", "بازیافت", "riˈsaɪkəl"), Word("Climate", "آب و هوا", "ˈklaɪmət"),
                Word("Energy", "انرژی", "ˈɛnərdʒi"), Word("Sustainable", "پایدار", "səˈsteɪnəbəl")
            ),
            grammarTitle = "First Conditional",
            grammarExplanation = "If + present simple, will + verb",
            grammarExamples = listOf(
                "If we don't recycle, pollution will increase. — اگر بازیافت نکنیم، آلودگی زیاد می‌شود.",
                "If you save energy, you will help. — اگر انرژی ذخیره کنی، کمک می‌کنی.",
                "If everyone helps, we will succeed. — اگر همه کمک کنند، موفق می‌شویم."
            ),
            conversation = Conversation("Climate change", "تغییرات اقلیمی", listOf(
                ConversationLine("A", "Is climate change serious?", "تغییرات اقلیمی جدیه؟"),
                ConversationLine("B", "If we don't act, it will get worse.", "اگر اقدام نکنیم، بدتر می‌شه."),
                ConversationLine("A", "What can we do?", "چی می‌تونیم بکنیم؟"),
                ConversationLine("B", "Recycle and use less energy.", "بازیافت و انرژی کمتر."),
                ConversationLine("A", "I use public transport.", "من حمل و نقل عمومی استفاده می‌کنم."),
                ConversationLine("B", "Every action matters.", "هر اقدامی مهمه.")
            )),
            storyTitle = "Our Planet",
            storyText = "The Earth faces serious challenges. Pollution has increased. Many species are endangered. If we continue this path, future generations will suffer. But we still have time to make a difference.",
            quiz = listOf(
                QuizQuestion("معنی \"Sustainable\" چیست؟", listOf("موقت", "پایدار", "خطرناک", "آلوده"), 1),
                QuizQuestion("کدام درست است؟", listOf("If it rains, I would stay.", "If it rains, I will stay.", "If it will rain, I stay.", "If it rained, I will stay."), 1)
            )
        ),

        Lesson(
            id = "i7", unitNumber = 7, title = "Education and Learning", titlePersian = "آموزش", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Education", "آموزش", "ˌɛdʒuˈkeɪʃən"), Word("Knowledge", "دانش", "ˈnɑlɪdʒ"),
                Word("Degree", "مدرک", "dɪˈɡri"), Word("Scholarship", "بورسیه", "ˈskɑlərʃɪp"),
                Word("Research", "تحقیق", "rɪˈsɜrtʃ"), Word("Graduate", "فارغ‌التحصیل", "ˈɡrædʒuˌeɪt")
            ),
            grammarTitle = "Used to / Be used to",
            grammarExplanation = "Used to: عادت گذشته\nBe used to: عادت فعلی",
            grammarExamples = listOf(
                "I used to study at the library. — قبلاً کتابخانه درس می‌خواندم.",
                "She is used to online classes. — به کلاس آنلاین عادت دارد.",
                "They used to live in London. — قبلاً لندن زندگی می‌کردند."
            ),
            conversation = Conversation("Studies", "تحصیلات", listOf(
                ConversationLine("A", "What are you studying?", "چی می‌خونی؟"),
                ConversationLine("B", "Computer science.", "علوم کامپیوتر."),
                ConversationLine("A", "Why did you choose it?", "چرا انتخابش کردی؟"),
                ConversationLine("B", "I used to play games, got interested.", "قبلاً بازی می‌کردم، علاقه‌مند شدم."),
                ConversationLine("A", "Scholarship?", "بورسیه؟"),
                ConversationLine("B", "Yes, hope to graduate with honors.", "بله، امیدوارم با افتخار فارغ‌التحصیل شم.")
            )),
            storyTitle = "Power of Education",
            storyText = "Maria grew up in a small village. She used to walk two hours to school. Her family couldn't afford books. Years later, she graduated from a top university. Now she helps other children.",
            quiz = listOf(
                QuizQuestion("معنی \"Scholarship\" چیست؟", listOf("شهریه", "بورسیه", "امتحان", "مدرک"), 1),
                QuizQuestion("کدام درست است؟", listOf("I used to playing.", "I used to play.", "I use to play.", "I used playing."), 1)
            )
        ),

        Lesson(
            id = "i8", unitNumber = 8, title = "Media and News", titlePersian = "رسانه", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Media", "رسانه", "ˈmidiə"), Word("News", "اخبار", "nuz"),
                Word("Article", "مقاله", "ˈɑrtɪkəl"), Word("Journalist", "روزنامه‌نگار", "ˈdʒɜrnəlɪst"),
                Word("Source", "منبع", "sɔrs"), Word("Headline", "تیتر", "ˈhɛdlaɪn")
            ),
            grammarTitle = "Gerunds and Infinitives",
            grammarExplanation = "Enjoy + ing, Want + to, Decide + to, Avoid + ing",
            grammarExamples = listOf(
                "I enjoy reading news. — از خواندن اخبار لذت می‌برم.",
                "She decided to become a journalist. — تصمیم گرفت روزنامه‌نگار شود.",
                "They avoid watching too much TV. — از تماشای زیاد پرهیز می‌کنند."
            ),
            conversation = Conversation("News sources", "منابع خبری", listOf(
                ConversationLine("A", "Where do you get news?", "اخبار رو از کجا می‌گیری؟"),
                ConversationLine("B", "Reliable sources.", "منابع معتبر."),
                ConversationLine("A", "Is all news accurate?", "همه اخبار دقیقن؟"),
                ConversationLine("B", "Not always. Check the source.", "نه همیشه. منبع رو چک کن."),
                ConversationLine("A", "Fake news is a problem.", "اخبار جعلی مشکله."),
                ConversationLine("B", "Journalists should be responsible.", "روزنامه‌نگارها باید مسئول باشن.")
            )),
            storyTitle = "Behind the Story",
            storyText = "A young journalist was assigned to report on an event. She decided to research thoroughly. She interviewed witnesses and checked facts. Her article became famous for its accuracy.",
            quiz = listOf(
                QuizQuestion("معنی \"Source\" چیست؟", listOf("خبر", "منبع", "تیتر", "گزارش"), 1),
                QuizQuestion("کدام درست است؟", listOf("I enjoy to read.", "I enjoy reading.", "I enjoy read.", "I enjoy reads."), 1)
            )
        ),

        Lesson(
            id = "i9", unitNumber = 9, title = "Money and Banking", titlePersian = "پول و بانک", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Account", "حساب", "əˈkaʊnt"), Word("Deposit", "واریز", "dɪˈpɑzɪt"),
                Word("Withdraw", "برداشت", "wɪðˈdrɔ"), Word("Budget", "بودجه", "ˈbʌdʒɪt"),
                Word("Loan", "وام", "loʊn"), Word("Investment", "سرمایه‌گذاری", "ɪnˈvɛstmənt")
            ),
            grammarTitle = "Second Conditional",
            grammarExplanation = "If + past simple, would + verb",
            grammarExamples = listOf(
                "If I saved more, I would buy a house. — اگر بیشتر پس‌انداز کنم، خانه می‌خرم.",
                "If I were rich, I would invest. — اگر ثروتمند بودم، سرمایه‌گذاری می‌کردم.",
                "She would open an account if she had ID. — اگر کارت داشت، حساب باز می‌کرد."
            ),
            conversation = Conversation("Finances", "امور مالی", listOf(
                ConversationLine("A", "Do you have savings?", "پس‌انداز داری؟"),
                ConversationLine("B", "Yes, I deposit monthly.", "بله، ماهانه واریز می‌کنم."),
                ConversationLine("A", "Budget?", "بودجه؟"),
                ConversationLine("B", "Yes, I track expenses.", "بله، هزینه‌ها رو پیگیری می‌کنم."),
                ConversationLine("A", "If you won the lottery?", "اگه لاتاری برنده می‌شدی؟"),
                ConversationLine("B", "I would invest in real estate.", "در املاک سرمایه‌گذاری می‌کردم.")
            )),
            storyTitle = "Smart Decisions",
            storyText = "Michael used to spend his entire salary. He had no savings. One day, he changed. He opened a savings account and started investing. Five years later, he bought his first apartment.",
            quiz = listOf(
                QuizQuestion("معنی \"Investment\" چیست؟", listOf("هزینه", "سرمایه‌گذاری", "وام", "سود"), 1),
                QuizQuestion("کدام درست است؟", listOf("If I have money, I would travel.", "If I had money, I would travel.", "If I had money, I will travel.", "If I have, I would."), 1)
            )
        ),

        Lesson(
            id = "i10", unitNumber = 10, title = "Relationships", titlePersian = "روابط", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Relationship", "رابطه", "rɪˈleɪʃənʃɪp"), Word("Communication", "ارتباط", "kəˌmjunɪˈkeɪʃən"),
                Word("Trust", "اعتماد", "trʌst"), Word("Argument", "بحث", "ˈɑrɡjəmənt"),
                Word("Apologize", "عذرخواهی", "əˈpɑlədʒaɪz"), Word("Forgive", "بخشیدن", "fərˈɡɪv")
            ),
            grammarTitle = "Reflexive Pronouns",
            grammarExplanation = "Myself, Yourself, Himself, Herself, Ourselves, Themselves",
            grammarExamples = listOf(
                "I taught myself English. — خودم انگلیسی یاد گرفتم.",
                "She blamed herself. — خودش را سرزنش کرد.",
                "We should respect ourselves. — باید به خودمان احترام بگذاریم."
            ),
            conversation = Conversation("Resolving conflict", "حل تعارض", listOf(
                ConversationLine("A", "I'm sorry for yesterday.", "برای دیروز متأسفم."),
                ConversationLine("B", "Thank you for apologizing.", "ممنون که عذرخواهی کردی."),
                ConversationLine("A", "I feel terrible.", "احساس بدی دارم."),
                ConversationLine("B", "Communication is key.", "ارتباط کلیدیه."),
                ConversationLine("A", "I'll be more honest.", "صادق‌تر خواهم بود."),
                ConversationLine("B", "I'll try to understand.", "سعی می‌کنم بفهمم.")
            )),
            storyTitle = "Art of Understanding",
            storyText = "Every relationship has challenges. Misunderstandings create distance. But honest communication can heal. When we forgive ourselves and others, we build stronger bonds.",
            quiz = listOf(
                QuizQuestion("معنی \"Apologize\" چیست؟", listOf("تشکر", "عذرخواهی", "جواب", "بحث"), 1),
                QuizQuestion("کدام درست است؟", listOf("She hurt sheself.", "She hurt herself.", "She hurt hisself.", "She hurt therself."), 1)
            )
        ),

        // ==================== ADVANCED (Top Notch 3) - 10 Lessons ====================
        Lesson(
            id = "a1", unitNumber = 1, title = "Friends and Family", titlePersian = "دوستان و خانواده", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Relationship", "رابطه", "rɪˈleɪʃənʃɪp"), Word("Supportive", "حمایت‌گر", "səˈpɔrtɪv"),
                Word("Trust", "اعتماد", "trʌst"), Word("Bond", "پیوند", "bɑnd"),
                Word("Loyalty", "وفاداری", "ˈlɔɪəlti")
            ),
            grammarTitle = "Passive Voice",
            grammarExplanation = "be + past participle",
            grammarExamples = listOf(
                "The book was written by a famous author. — کتاب نوشته شد.",
                "English is spoken worldwide. — انگلیسی صحبت می‌شود.",
                "The bridge was built in 1990. — پل ساخته شد."
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
                QuizQuestion("معنی \"Supportive\" چیست؟", listOf("بی‌تفاوت", "حمایت‌گر", "خشن", "تنها"), 1),
                QuizQuestion("کدام مجهول درست است؟", listOf("The book wrote by...", "The book was written by...", "The book is wrote by...", "The book written by..."), 1)
            )
        ),

        Lesson(
            id = "a2", unitNumber = 2, title = "Success and Goals", titlePersian = "موفقیت و اهداف", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Success", "موفقیت", "səkˈsɛs"), Word("Goal", "هدف", "ɡoʊl"),
                Word("Achieve", "دست یافتن", "əˈtʃiv"), Word("Motivation", "انگیزه", "ˌmoʊtəˈveɪʃən"),
                Word("Perseverance", "پشتکار", "ˌpɜrsəˈvɪrəns"), Word("Ambition", "جاه‌طلبی", "æmˈbɪʃən")
            ),
            grammarTitle = "Third Conditional",
            grammarExplanation = "If + had + pp, would have + pp",
            grammarExamples = listOf(
                "If I had studied harder, I would have passed. — اگر بیشتر درس خوانده بودم، قبول می‌شدم.",
                "If she had known, she would have come. — اگر می‌دانست، می‌آمد.",
                "If we had left earlier, we would have caught the train. — اگر زودتر رفته بودیم، قطار را می‌گرفتیم."
            ),
            conversation = Conversation("Setting goals", "تعیین اهداف", listOf(
                ConversationLine("A", "What's your biggest goal?", "بزرگ‌ترین هدفت چیه؟"),
                ConversationLine("B", "To start my own company.", "راه‌اندازی شرکت خودم."),
                ConversationLine("A", "What motivates you?", "چی بهت انگیزه می‌ده؟"),
                ConversationLine("B", "My family and dreams.", "خانواده و رویاهام."),
                ConversationLine("A", "Perseverance is key.", "پشتکار کلیدیه."),
                ConversationLine("B", "I never give up.", "هرگز تسلیم نمی‌شم.")
            )),
            storyTitle = "Path to Success",
            storyText = "Success does not happen overnight. It requires perseverance and dedication. If Thomas Edison had given up, we would not have electric lights. Every successful person faced failure first. The key is to never give up.",
            quiz = listOf(
                QuizQuestion("معنی \"Perseverance\" چیست؟", listOf("تسلیم", "پشتکار", "شکست", "خستگی"), 1),
                QuizQuestion("کدام شرطی نوع سوم درست است؟", listOf("If I had studied, I would pass.", "If I had studied, I would have passed.", "If I studied, I would have passed.", "If I had study, I would pass."), 1)
            )
        ),

        Lesson(
            id = "a3", unitNumber = 3, title = "Media and Communication", titlePersian = "رسانه و ارتباطات", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Journalism", "روزنامه‌نگاری", "ˈdʒɜrnəˌlɪzəm"), Word("Broadcast", "پخش", "ˈbrɔdkæst"),
                Word("Propaganda", "تبلیغات سیاسی", "ˌprɑpəˈɡændə"), Word("Credibility", "اعتبار", "ˌkrɛdəˈbɪləti"),
                Word("Censorship", "سانسور", "ˈsɛnsərʃɪp"), Word("Objectivity", "بی‌طرفی", "ˌɑbdʒɛkˈtɪvəti")
            ),
            grammarTitle = "Reported Questions",
            grammarExplanation = "Direct: \"Where do you live?\"\nReported: He asked where I lived.",
            grammarExamples = listOf(
                "She asked what time it was. — پرسید ساعت چنده.",
                "He asked if I had finished. — پرسید آیا تمام کرده‌ام.",
                "They asked why I was late. — پرسیدند چرا دیر کردم."
            ),
            conversation = Conversation("Media ethics", "اخلاق رسانه", listOf(
                ConversationLine("A", "Do you trust the media?", "به رسانه اعتماد داری؟"),
                ConversationLine("B", "Only credible sources.", "فقط منابع معتبر."),
                ConversationLine("A", "What about censorship?", "سانسور چطور؟"),
                ConversationLine("B", "It damages credibility.", "به اعتبار آسیب می‌زند."),
                ConversationLine("A", "Objectivity is essential.", "بی‌طرفی ضروریه."),
                ConversationLine("B", "Journalists must stay neutral.", "روزنامه‌نگارها باید بی‌طرف بمانند.")
            )),
            storyTitle = "The Credible Journalist",
            storyText = "A journalist's greatest asset is credibility. She asked difficult questions and reported objectively. She refused propaganda and censorship. Her readers trusted her because she always told the truth.",
            quiz = listOf(
                QuizQuestion("معنی \"Objectivity\" چیست؟", listOf("تعصب", "بی‌طرفی", "سانسور", "تبلیغ"), 1),
                QuizQuestion("کدام reported question درست است؟", listOf("He asked where do I live.", "He asked where I lived.", "He asked where I live.", "He asked where did I live."), 1)
            )
        ),

        Lesson(
            id = "a4", unitNumber = 4, title = "Global Challenges", titlePersian = "چالش‌های جهانی", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Poverty", "فقر", "ˈpɑvərti"), Word("Inequality", "نابرابری", "ˌɪnɪˈkwɑləti"),
                Word("Conflict", "درگیری", "ˈkɑnflɪkt"), Word("Humanitarian", "بشردوستانه", "hjuˌmænɪˈtɛriən"),
                Word("Crisis", "بحران", "ˈkraɪsɪs"), Word("Sustainable", "پایدار", "səˈsteɪnəbəl")
            ),
            grammarTitle = "Wish + Past Simple",
            grammarExplanation = "I wish I were rich. (آرزو می‌کنم ثروتمند بودم)",
            grammarExamples = listOf(
                "I wish there were no poverty. — کاش فقری نبود.",
                "She wishes she could help. — آرزو می‌کند می‌توانست کمک کند.",
                "We wish the war would end. — کاش جنگ تمام می‌شد."
            ),
            conversation = Conversation("Global issues", "مسائل جهانی", listOf(
                ConversationLine("A", "What's the biggest global challenge?", "بزرگ‌ترین چالش جهانی چیه؟"),
                ConversationLine("B", "Poverty and inequality.", "فقر و نابرابری."),
                ConversationLine("A", "How can we help?", "چطور می‌تونیم کمک کنیم؟"),
                ConversationLine("B", "Support humanitarian efforts.", "حمایت از تلاش‌های بشردوستانه."),
                ConversationLine("A", "Sustainable solutions needed.", "راه‌حل‌های پایدار لازمه."),
                ConversationLine("B", "Every contribution helps.", "هر کمکی کمک می‌کنه.")
            )),
            storyTitle = "A World in Crisis",
            storyText = "The world faces many challenges today. Poverty and inequality affect millions. Conflicts force people to flee their homes. Humanitarian organizations provide essential aid. Sustainable solutions are needed for lasting change.",
            quiz = listOf(
                QuizQuestion("معنی \"Poverty\" چیست؟", listOf("ثروت", "فقر", "سلامتی", "آموزش"), 1),
                QuizQuestion("کدام جمله با wish درست است؟", listOf("I wish I am rich.", "I wish I were rich.", "I wish I will be rich.", "I wish I be rich."), 1)
            )
        ),

        Lesson(
            id = "a5", unitNumber = 5, title = "Art and Culture", titlePersian = "هنر و فرهنگ", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Aesthetic", "زیبایی‌شناسی", "ɛsˈθɛtɪk"), Word("Masterpiece", "شاهکار", "ˈmæstərpis"),
                Word("Heritage", "میراث", "ˈhɛrɪtɪdʒ"), Word("Contemporary", "معاصر", "kənˈtɛmpərɛri"),
                Word("Expression", "بیان", "ɪkˈsprɛʃən"), Word("Appreciation", "قدردانی", "əˌpriʃiˈeɪʃən")
            ),
            grammarTitle = "Cleft Sentences",
            grammarExplanation = "It is X that... / What I love is...\nبرای تأکید",
            grammarExamples = listOf(
                "It is art that connects us. — این هنر است که ما را وصل می‌کند.",
                "What I admire is her creativity. — آنچه تحسین می‌کنم خلاقیت اوست.",
                "It was Picasso who painted Guernica. — پیکاسو بود که گرنیکا را کشید."
            ),
            conversation = Conversation("Art appreciation", "قدردانی هنری", listOf(
                ConversationLine("A", "Do you enjoy art?", "هنر دوست داری؟"),
                ConversationLine("B", "Yes, especially contemporary art.", "بله، خصوصاً هنر معاصر."),
                ConversationLine("A", "What's your favorite masterpiece?", "شاهکار مورد علاقه‌ات؟"),
                ConversationLine("B", "Guernica by Picasso.", "گرنیکا از پیکاسو."),
                ConversationLine("A", "Cultural heritage matters.", "میراث فرهنگی مهمه."),
                ConversationLine("B", "Art is essential expression.", "هنر بیانی ضروریه.")
            )),
            storyTitle = "The Power of Art",
            storyText = "Art has the power to move us deeply. It is creativity that makes us human. Great masterpieces survive centuries. Cultural heritage connects us to our past. Contemporary art challenges our perspectives.",
            quiz = listOf(
                QuizQuestion("معنی \"Heritage\" چیست؟", listOf("آینده", "میراث", "حال", "خیال"), 1),
                QuizQuestion("کدام cleft sentence درست است؟", listOf("It is art connects us.", "It is art that connects us.", "It art that connects us.", "Art is that connects us."), 1)
            )
        ),

        Lesson(
            id = "a6", unitNumber = 6, title = "Personal Growth", titlePersian = "رشد شخصی", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Resilience", "تاب‌آوری", "rɪˈzɪliəns"), Word("Mindfulness", "ذهن‌آگاهی", "ˈmaɪndfəlnəs"),
                Word("Self-awareness", "خودآگاهی", "sɛlf əˈwɛrnəs"), Word("Growth", "رشد", "ɡroʊθ"),
                Word("Potential", "پتانسیل", "pəˈtɛnʃəl"), Word("Fulfillment", "رضایت", "fʊlˈfɪlmənt")
            ),
            grammarTitle = "Participle Clauses",
            grammarExplanation = "Having finished work, she went home. (پس از تمام کردن کار، به خانه رفت)",
            grammarExamples = listOf(
                "Having learned English, he traveled abroad. — پس از یادگیری انگلیسی، خارج سفر کرد.",
                "Feeling tired, she went to bed early. — چون خسته بود، زود خوابید.",
                "Encouraged by friends, he continued. — با تشویق دوستان، ادامه داد."
            ),
            conversation = Conversation("Personal development", "توسعه فردی", listOf(
                ConversationLine("A", "How do you grow personally?", "چطور شخصاً رشد می‌کنی؟"),
                ConversationLine("B", "Through mindfulness and reflection.", "از طریق ذهن‌آگاهی و تأمل."),
                ConversationLine("A", "Resilience is important.", "تاب‌آوری مهمه."),
                ConversationLine("B", "Facing challenges makes us stronger.", "مواجهه با چالش‌ها ما را قوی‌تر می‌کند."),
                ConversationLine("A", "Self-awareness is key.", "خودآگاهی کلیدیه."),
                ConversationLine("B", "True fulfillment comes from within.", "رضایت واقعی از درون میاد.")
            )),
            storyTitle = "Journey Within",
            storyText = "Personal growth is a lifelong journey. Having faced many challenges, Maria developed great resilience. She practiced mindfulness daily. Her self-awareness grew, and she discovered her true potential.",
            quiz = listOf(
                QuizQuestion("معنی \"Resilience\" چیست؟", listOf("ضعف", "تاب‌آوری", "ترس", "شکست"), 1),
                QuizQuestion("کدام participle clause درست است؟", listOf("Having finish work, she left.", "Having finished work, she left.", "Have finished work, she left.", "Finished having work, she left."), 1)
            )
        ),

        Lesson(
            id = "a7", unitNumber = 7, title = "Innovation and Change", titlePersian = "نوآوری و تغییر", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Innovation", "نوآوری", "ˌɪnəˈveɪʃən"), Word("Disruption", "اختلال", "dɪsˈrʌpʃən"),
                Word("Breakthrough", "پیشرفت بزرگ", "ˈbreɪkθru"), Word("Transformation", "دگرگونی", "ˌtrænsfərˈmeɪʃən"),
                Word("Visionary", "آینده‌نگر", "ˈvɪʒəˌnɛri"), Word("Revolutionize", "انقلابی کردن", "ˌrɛvəˈluʃəˌnaɪz")
            ),
            grammarTitle = "Inversion",
            grammarExplanation = "Never have I seen such beauty.\nRarely does he speak.",
            grammarExamples = listOf(
                "Never have I seen such innovation. — هرگز چنین نوآوری ندیده‌ام.",
                "Rarely does technology change so fast. — به‌ندرت تکنولوژی این‌قدر سریع تغییر می‌کند.",
                "Not only did he invent it, but he also improved it. — نه تنها اختراع کرد، بلکه بهبودش داد."
            ),
            conversation = Conversation("Innovation", "نوآوری", listOf(
                ConversationLine("A", "What drives innovation?", "چه چیزی نوآوری را هدایت می‌کند؟"),
                ConversationLine("B", "Visionary thinking and courage.", "تفکر آینده‌نگر و شجاعت."),
                ConversationLine("A", "Disruption is inevitable.", "اختلال اجتناب‌ناپذیره."),
                ConversationLine("B", "It transforms industries.", "صنایع را متحول می‌کند."),
                ConversationLine("A", "Breakthroughs change everything.", "پیشرفت‌های بزرگ همه چیز را تغییر می‌دهند."),
                ConversationLine("B", "We must embrace change.", "باید تغییر را بپذیریم.")
            )),
            storyTitle = "The Innovator's Mind",
            storyText = "Never have we lived in such transformative times. Innovation disrupts traditional industries. Visionary thinkers revolutionize the world. Breakthroughs happen when we embrace change.",
            quiz = listOf(
                QuizQuestion("معنی \"Breakthrough\" چیست؟", listOf("شکست", "پیشرفت بزرگ", "توقف", "عقب‌گرد"), 1),
                QuizQuestion("کدام inversion درست است؟", listOf("Never I have seen.", "Never have I seen.", "Never I seen have.", "Have never I seen."), 1)
            )
        ),

        Lesson(
            id = "a8", unitNumber = 8, title = "Ethics and Morality", titlePersian = "اخلاق", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Ethics", "اخلاق", "ˈɛθɪks"), Word("Morality", "اخلاقیات", "məˈræləti"),
                Word("Integrity", "درستکاری", "ɪnˈtɛɡrəti"), Word("Dilemma", "دوراهی", "dɪˈlɛmə"),
                Word("Conscience", "وجدان", "ˈkɑnʃəns"), Word("Principle", "اصل", "ˈprɪnsəpəl")
            ),
            grammarTitle = "Subjunctive Mood",
            grammarExplanation = "It is essential that he be present.\nI suggest that she study harder.",
            grammarExamples = listOf(
                "It is important that everyone be treated fairly. — مهم است که با همه منصفانه رفتار شود.",
                "I suggest that he reconsider his decision. — پیشنهاد می‌کنم تصمیمش را بازنگری کند.",
                "It is vital that we maintain integrity. — حیاتی است که درستکاری را حفظ کنیم."
            ),
            conversation = Conversation("Moral dilemma", "دوراهی اخلاقی", listOf(
                ConversationLine("A", "What would you do in this dilemma?", "در این دوراهی چی می‌کردی؟"),
                ConversationLine("B", "I would follow my conscience.", "از وجدانم پیروی می‌کردم."),
                ConversationLine("A", "Integrity is essential.", "درستکاری ضروریه."),
                ConversationLine("B", "It is important that we stay principled.", "مهمه که اصولی بمونیم."),
                ConversationLine("A", "Ethics guide our decisions.", "اخلاق تصمیمات ما رو هدایت می‌کنه."),
                ConversationLine("B", "Morality shapes society.", "اخلاقیات جامعه رو شکل می‌ده.")
            )),
            storyTitle = "The Ethical Choice",
            storyText = "Life often presents moral dilemmas. It is essential that we maintain our integrity. Our conscience guides us through difficult decisions. Ethical principles should never be compromised for personal gain.",
            quiz = listOf(
                QuizQuestion("معنی \"Integrity\" چیست؟", listOf("فریب", "درستکاری", "ضعف", "ترس"), 1),
                QuizQuestion("کدام subjunctive درست است؟", listOf("It is essential that he is present.", "It is essential that he be present.", "It is essential that he was present.", "It is essential that he will be present."), 1)
            )
        ),

        Lesson(
            id = "a9", unitNumber = 9, title = "Leadership", titlePersian = "رهبری", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Leadership", "رهبری", "ˈlidərʃɪp"), Word("Vision", "چشم‌انداز", "ˈvɪʒən"),
                Word("Empower", "توانمند کردن", "ɪmˈpaʊər"), Word("Delegate", "واگذار کردن", "ˈdɛlɪɡeɪt"),
                Word("Accountability", "پاسخگویی", "əˌkaʊntəˈbɪləti"), Word("Influence", "تأثیر", "ˈɪnfluəns")
            ),
            grammarTitle = "Nominalization",
            grammarExplanation = "تبدیل فعل/صفت به اسم:\nDecide → decision\nPerform → performance\nInnovate → innovation",
            grammarExamples = listOf(
                "His decision was widely respected. — تصمیمش محترم بود.",
                "The performance exceeded expectations. — عملکرد فراتر از انتظارات بود.",
                "Innovation requires courage. — نوآوری شجاعت می‌خواهد."
            ),
            conversation = Conversation("Leadership qualities", "کیفیت‌های رهبری", listOf(
                ConversationLine("A", "What makes a great leader?", "رهبر بزرگ رو چی می‌سازه؟"),
                ConversationLine("B", "Vision and empowerment.", "چشم‌انداز و توانمندسازی."),
                ConversationLine("A", "Accountability is crucial.", "پاسخگویی حیاتیه."),
                ConversationLine("B", "Leaders must delegate wisely.", "رهبران باید عاقلانه واگذار کنند."),
                ConversationLine("A", "Influence comes from trust.", "تأثیر از اعتماد میاد."),
                ConversationLine("B", "True leaders serve others.", "رهبران واقعی به دیگران خدمت می‌کنند.")
            )),
            storyTitle = "The True Leader",
            storyText = "Great leadership is not about power. It is about vision and empowerment. Effective leaders delegate wisely and maintain accountability. Their influence comes from trust. True leaders serve others before themselves.",
            quiz = listOf(
                QuizQuestion("معنی \"Empower\" چیست؟", listOf("ضعیف کردن", "توانمند کردن", "کنترل", "محدود کردن"), 1),
                QuizQuestion("کدام nominalization درست است؟", listOf("His decide was respected.", "His decision was respected.", "His deciding was respected.", "His decides was respected."), 1)
            )
        ),

        Lesson(
            id = "a10", unitNumber = 10, title = "Life and Philosophy", titlePersian = "زندگی و فلسفه", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Philosophy", "فلسفه", "fəˈlɑsəfi"), Word("Existential", "وجودی", "ˌɛɡzɪˈstɛnʃəl"),
                Word("Wisdom", "خرد", "ˈwɪzdəm"), Word("Purpose", "هدف", "ˈpɜrpəs"),
                Word("Meaning", "معنا", "ˈminɪŋ"), Word("Reflection", "تأمل", "rɪˈflɛkʃən")
            ),
            grammarTitle = "Mixed Conditionals",
            grammarExplanation = "ترکیب شرطی‌ها:\nIf I had studied (past), I would be successful (present).",
            grammarExamples = listOf(
                "If I had studied philosophy, I would think differently now. — اگر فلسفه خوانده بودم، الان متفاوت فکر می‌کردم.",
                "If she were wiser, she would have avoided that mistake. — اگر عاقل‌تر بود، آن اشتباه را نمی‌کرد.",
                "If we had more time, we would reflect more often. — اگر وقت بیشتری داشتیم، بیشتر تأمل می‌کردیم."
            ),
            conversation = Conversation("Meaning of life", "معنای زندگی", listOf(
                ConversationLine("A", "What gives life meaning?", "چی به زندگی معنا می‌ده؟"),
                ConversationLine("B", "Purpose and connection.", "هدف و ارتباط."),
                ConversationLine("A", "Philosophy helps us reflect.", "فلسفه به تأمل کمک می‌کند."),
                ConversationLine("B", "Wisdom comes from experience.", "خرد از تجربه میاد."),
                ConversationLine("A", "Existential questions matter.", "سوالات وجودی مهمه."),
                ConversationLine("B", "Reflection brings clarity.", "تأمل شفافیت میاره.")
            )),
            storyTitle = "The Examined Life",
            storyText = "Socrates said the unexamined life is not worth living. Philosophy encourages deep reflection. It asks existential questions about purpose and meaning. Wisdom is not just knowledge, but understanding. A reflective life brings clarity and fulfillment.",
            quiz = listOf(
                QuizQuestion("معنی \"Wisdom\" چیست؟", listOf("جهل", "خرد", "قدرت", "ثروت"), 1),
                QuizQuestion("کدام mixed conditional درست است؟", listOf("If I had studied, I would think differently.", "If I studied, I would have thought.", "If I study, I would think.", "If I had study, I would think."), 0)
            )
        )
    )

    fun getLessonsByLevel(level: Level): List<Lesson> =
        lessons.filter { it.level == level }

    fun getLessonById(id: String): Lesson? =
        lessons.firstOrNull { it.id == id }
}