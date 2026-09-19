package com.example.englishteacher.data

object LessonRepository {

    private val lessons: List<Lesson> = listOf(

        // ==================== BEGINNER ====================
        Lesson(
            id = "b1", unitNumber = 1, title = "Getting Acquainted", titlePersian = "آشنایی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Hello", "سلام", "həˈloʊ"), Word("Hi", "سلام (خودمانی)", "haɪ"),
                Word("Name", "نام", "neɪm"), Word("Nice to meet you", "از آشنایی خوشحالم", "naɪs tə mit ju"),
                Word("Friend", "دوست", "frɛnd"), Word("How are you?", "حالت چطوره؟", "haʊ ɑr ju")
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
                Word("Shop", "مغازه", "ʃɑp"), Word("Buy", "خریدن", "baɪ"),
                Word("Price", "قیمت", "praɪs"), Word("Money", "پول", "ˈmʌni"),
                Word("Cheap", "ارزان", "tʃip"), Word("Expensive", "گران", "ɪkˈspɛnsɪv")
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
                Word("Wake up", "بیدار شدن", "weɪk ʌp"), Word("Breakfast", "صبحانه", "ˈbrɛkfəst"),
                Word("Work", "کار", "wɜrk"), Word("Lunch", "ناهار", "lʌntʃ"),
                Word("Dinner", "شام", "ˈdɪnər"), Word("Sleep", "خوابیدن", "slip")
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

        Lesson(
            id = "b4", unitNumber = 4, title = "Food and Drinks", titlePersian = "غذا و نوشیدنی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Water", "آب", "ˈwɔtər"), Word("Bread", "نان", "brɛd"),
                Word("Rice", "برنج", "raɪs"), Word("Chicken", "مرغ", "ˈtʃɪkɪn"),
                Word("Apple", "سیب", "ˈæpəl"), Word("Delicious", "خوشمزه", "dɪˈlɪʃəs")
            ),
            grammarTitle = "Countable & Uncountable Nouns",
            grammarExplanation = "قابل شمارش: a/an + اسم (apple, book)\nغیرقابل شمارش: some + اسم (water, rice)",
            grammarExamples = listOf(
                "I want an apple. — یک سیب می‌خواهم.",
                "Can I have some water? — کمی آب؟",
                "There are three oranges. — سه پرتقال است."
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
                QuizQuestion("معنی Delicious چیست؟", listOf("بد", "تند", "خوشمزه", "سرد"), 2)
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
                "Is there a library? — کتابخانه‌ای هست؟"
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
                QuizQuestion("معنی Homework چیست؟", listOf("امتحان", "کتاب", "تکلیف", "معلم"), 2)
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
                QuizQuestion("معنی Enjoy چیست؟", listOf("متنفر بودن", "لذت بردن", "خسته شدن", "ترسیدن"), 1)
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
                "The bank is next to the market. — بانک کنار بازار است.",
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
                QuizQuestion("معنی Next to چیست؟", listOf("دور از", "روی", "کنارِ", "زیرِ"), 2),
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
                QuizQuestion("معنی Sunny چیست؟", listOf("بارانی", "برفی", "آفتابی", "بادی"), 2),
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
                QuizQuestion("معنی Jacket چیست؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
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
                QuizQuestion("معنی Healthy چیست؟", listOf("بیمار", "خسته", "سالم", "دردناک"), 2),
                QuizQuestion("کدام درست است؟", listOf("You should to rest.", "You should rest.", "You should resting.", "You should rests."), 1)
            )
        ),

        // ==================== INTERMEDIATE ====================
        Lesson(
            id = "i1", unitNumber = 1, title = "Cultural Literacy", titlePersian = "آگاهی فرهنگی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Culture", "فرهنگ", "ˈkʌltʃər"), Word("Tradition", "سنت", "trəˈdɪʃən"),
                Word("Custom", "رسم", "ˈkʌstəm"), Word("Society", "جامعه", "səˈsaɪəti"),
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
                QuizQuestion("معنی Wellness چیست؟", listOf("بیماری", "سلامتی", "خستگی", "استرس"), 1),
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
                QuizQuestion("معنی Destination چیست؟", listOf("مسیر", "مقصد", "وسیله", "بلیط"), 1),
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
                QuizQuestion("معنی Promotion چیست؟", listOf("اخراج", "ترفیع", "استعفا", "استخدام"), 1),
                QuizQuestion("کدام درست است؟", listOf("He said he is busy.", "He said he was busy.", "He said he will be busy.", "He said he be busy."), 1)
            )
        ),

        // ==================== ADVANCED ====================
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