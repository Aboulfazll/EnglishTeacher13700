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
                QuizQuestion("What does \"Hello\" mean?", listOf("سلام", "خداحافظ", "نام", "ممنون"), 0),
                QuizQuestion("\"Nice to meet you\" یعنی چه؟", listOf("حالت چطوره؟", "از آشنایی با شما خوشحالم", "اسمت چیه؟", "کجایی؟"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("She work in a school.", "She works in a school.", "She working in a school.", "She worked in a school."), 1)
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
            grammarExplanation = "برای اشاره به اشیا:\n\nThis = این (نزدیک، مفرد)\nThat = آن (دور، مفرد)\nThese = این‌ها (نزدیک، جمع)\nThose = آن‌ها (دور، جمع)",
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
                QuizQuestion("معنی \"Expensive\" چیست؟", listOf("ارزان", "گران", "زیبا", "جدید"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("This books are new.", "This book is new.", "These book is new.", "This book are new."), 1)
            )
        ),

        Lesson(
            id = "b3",
            unitNumber = 3,
            title = "Daily Routine",
            titlePersian = "برنامه روزانه",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Wake up", "بیدار شدن", "weɪk ʌp"),
                Word("Breakfast", "صبحانه", "ˈbrɛkfəst"),
                Word("Work", "کار", "wɜrk"),
                Word("Lunch", "ناهار", "lʌntʃ"),
                Word("Dinner", "شام", "ˈdɪnər"),
                Word("Sleep", "خوابیدن", "slip"),
                Word("Morning", "صبح", "ˈmɔrnɪŋ"),
                Word("Evening", "عصر", "ˈivnɪŋ")
            ),
            grammarTitle = "Adverbs of Frequency - قیدهای تکرار",
            grammarExplanation = "قیدهای تکرار: Always (همیشه) - Usually (معمولاً) - Often (غالباً) - Sometimes (بعضی وقت‌ها) - Never (هرگز)\n\nجای قید: قبل از فعل اصلی، بعد از فعل to be",
            grammarExamples = listOf(
                "I always wake up at 7 AM. — من همیشه ساعت ۷ بیدار می‌شوم.",
                "She usually has breakfast at home. — او معمولاً صبحانه در خانه می‌خورد.",
                "They never work on Fridays. — آن‌ها هرگز جمعه‌ها کار نمی‌کنند."
            ),
            conversation = Conversation(
                title = "Talking about daily routine",
                titlePersian = "صحبت درباره برنامه روزانه",
                lines = listOf(
                    ConversationLine("A", "What time do you usually wake up?", "معمولاً ساعت چند بیدار می‌شی؟"),
                    ConversationLine("B", "I usually wake up at six thirty.", "معمولاً ساعت شش و نیم بیدار می‌شم."),
                    ConversationLine("A", "Do you have breakfast every morning?", "هر روز صبح صبحانه می‌خوری؟"),
                    ConversationLine("B", "Yes, I always have breakfast. And you?", "بله، همیشه صبحانه می‌خورم. تو چطور؟"),
                    ConversationLine("A", "Sometimes I skip breakfast when I'm late.", "بعضی وقت‌ها وقتی دیرم می‌شه صبحانه رو حذف می‌کنم."),
                    ConversationLine("B", "You should never skip breakfast. It's important!", "هرگز نباید صبحانه رو حذف کنی. مهمه!")
                )
            ),
            storyTitle = "A Busy Day",
            storyText = "Anna is a teacher. She always wakes up at six o'clock. She has breakfast with her family. She goes to school at seven thirty. She teaches English to children. In the evening, she reads books and goes to bed at ten.",
            quiz = listOf(
                QuizQuestion("معنی \"Breakfast\" چیست؟", listOf("ناهار", "شام", "صبحانه", "میان‌وعده"), 2),
                QuizQuestion("کدام جمله درست است؟", listOf("I always am happy.", "I am always happy.", "Always I am happy.", "I happy always am."), 1)
            )
        ),

        Lesson(
            id = "b4",
            unitNumber = 4,
            title = "Food and Drinks",
            titlePersian = "غذا و نوشیدنی",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Water", "آب", "ˈwɔtər"),
                Word("Bread", "نان", "brɛd"),
                Word("Rice", "برنج", "raɪs"),
                Word("Chicken", "مرغ", "ˈtʃɪkɪn"),
                Word("Apple", "سیب", "ˈæpəl"),
                Word("Tea", "چای", "ti"),
                Word("Juice", "آبمیوه", "dʒus"),
                Word("Delicious", "خوشمزه", "dɪˈlɪʃəs")
            ),
            grammarTitle = "Countable & Uncountable Nouns",
            grammarExplanation = "قابل شمارش: apple, book, car (a/an + اسم)\nغیرقابل شمارش: water, rice, bread (some + اسم)",
            grammarExamples = listOf(
                "I want an apple. — یک سیب می‌خواهم.",
                "Can I have some water? — می‌تونم کمی آب داشته باشم؟",
                "There are three oranges on the table. — سه پرتقال روی میز است."
            ),
            conversation = Conversation(
                title = "At a restaurant",
                titlePersian = "در رستوران",
                lines = listOf(
                    ConversationLine("A", "Good evening! What would you like to eat?", "عصر بخیر! چی میل دارید بخورید؟"),
                    ConversationLine("B", "I would like some chicken and rice, please.", "لطفاً کمی مرغ و برنج می‌خواهم."),
                    ConversationLine("A", "Would you like something to drink?", "نوشیدنی هم میل دارید؟"),
                    ConversationLine("B", "Yes, some water, please.", "بله، لطفاً کمی آب."),
                    ConversationLine("A", "Anything else?", "چیز دیگه‌ای هم هست؟"),
                    ConversationLine("B", "No, thank you. That's all.", "نه، ممنون. همین کافیه.")
                )
            ),
            storyTitle = "Lunch with Friends",
            storyText = "It is lunch time. Sara and her friends are in a restaurant. Sara orders chicken and rice. Her friend orders pizza. They share an apple for dessert. The food is delicious and they are very happy.",
            quiz = listOf(
                QuizQuestion("کدام کلمه غیرقابل شمارش است؟", listOf("Apple", "Water", "Book", "Car"), 1),
                QuizQuestion("معنی \"Delicious\" چیست؟", listOf("بد", "تند", "خوشمزه", "سرد"), 2)
            )
        ),

        Lesson(
            id = "b5",
            unitNumber = 5,
            title = "At School",
            titlePersian = "در مدرسه",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Teacher", "معلم", "ˈtitʃər"),
                Word("Student", "دانش‌آموز", "ˈstudənt"),
                Word("Classroom", "کلاس درس", "ˈklæsrum"),
                Word("Book", "کتاب", "bʊk"),
                Word("Pen", "خودکار", "pɛn"),
                Word("Homework", "تکلیف", "ˈhoʊmwɜrk"),
                Word("Exam", "امتحان", "ɪɡˈzæm"),
                Word("Library", "کتابخانه", "ˈlaɪbrɛri")
            ),
            grammarTitle = "There is / There are",
            grammarExplanation = "There is + اسم مفرد\nThere are + اسم جمع\n\nمنفی: There isn't / There aren't\nسوال: Is there...? / Are there...?",
            grammarExamples = listOf(
                "There is a book on the desk. — یک کتاب روی میز هست.",
                "There are twenty students in the classroom. — بیست دانش‌آموز در کلاس هستند.",
                "Is there a library in your school? — آیا کتابخانه‌ای در مدرسه‌ات هست؟"
            ),
            conversation = Conversation(
                title = "Asking about school",
                titlePersian = "سوال درباره مدرسه",
                lines = listOf(
                    ConversationLine("A", "Is there a library in your school?", "آیا کتابخانه‌ای در مدرسه‌ت هست؟"),
                    ConversationLine("B", "Yes, there is. It's next to the classroom.", "بله، هست. کنار کلاس درسه."),
                    ConversationLine("A", "How many students are in your class?", "چند دانش‌آموز در کلاس شما هستند؟"),
                    ConversationLine("B", "There are twenty-five students.", "بیست و پنج دانش‌آموز."),
                    ConversationLine("A", "Do you have a lot of homework?", "تکلیف زیاد داری؟"),
                    ConversationLine("B", "Yes, we have homework every day.", "بله، هر روز تکلیف داریم.")
                )
            ),
            storyTitle = "The First Day of School",
            storyText = "It is Ali's first day of school. There are many students in his classroom. His teacher is very kind. There is a big library near his class. Ali is a little nervous, but he is also excited.",
            quiz = listOf(
                QuizQuestion("کدام جمله درست است؟", listOf("There is twenty students.", "There are twenty students.", "There have twenty students.", "There has twenty students."), 1),
                QuizQuestion("معنی \"Homework\" چیست؟", listOf("امتحان", "کتاب", "تکلیف", "معلم"), 2)
            )
        ),

        Lesson(
            id = "b6",
            unitNumber = 6,
            title = "Hobbies",
            titlePersian = "سرگرمی‌ها",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Reading", "کتاب خواندن", "ˈridɪŋ"),
                Word("Swimming", "شنا کردن", "ˈswɪmɪŋ"),
                Word("Drawing", "نقاشی کشیدن", "ˈdrɔɪŋ"),
                Word("Cooking", "آشپزی کردن", "ˈkʊkɪŋ"),
                Word("Music", "موسیقی", "ˈmjuzɪk"),
                Word("Sport", "ورزش", "spɔrt"),
                Word("Hobby", "سرگرمی", "ˈhɑbi"),
                Word("Enjoy", "لذت بردن", "ɪnˈdʒɔɪ")
            ),
            grammarTitle = "Like + Verb-ing",
            grammarExplanation = "برای بیان علاقه:\n\nI like swimming.\nI love reading.\nI don't like cooking.\n\nافعال علاقه: like, love, enjoy, hate",
            grammarExamples = listOf(
                "I like playing football. — فوتبال بازی کردن رو دوست دارم.",
                "She loves drawing pictures. — او کشیدن نقاشی رو دوست داره.",
                "They enjoy listening to music. — آن‌ها موسیقی گوش دادن رو لذت می‌برند."
            ),
            conversation = Conversation(
                title = "Talking about hobbies",
                titlePersian = "صحبت درباره سرگرمی‌ها",
                lines = listOf(
                    ConversationLine("A", "What do you like doing in your free time?", "توی اوقات فراغتت چی دوست داری بکنی؟"),
                    ConversationLine("B", "I love reading books and drawing.", "من عاشق کتاب خواندن و نقاشی کشیدن هستم."),
                    ConversationLine("A", "That's nice! Do you like sports?", "قشنگه! ورزش دوست داری؟"),
                    ConversationLine("B", "Yes, I enjoy swimming. What about you?", "بله، شنا کردن رو دوست دارم. تو چطور؟"),
                    ConversationLine("A", "I like playing music. I play the guitar.", "من موسیقی دوست دارم. گیتار می‌زنم."),
                    ConversationLine("B", "That's cool! Music is a great hobby.", "باحاله! موسیقی سرگرمی عالیه.")
                )
            ),
            storyTitle = "A Weekend Full of Fun",
            storyText = "On weekends, Reza loves doing his hobbies. He likes reading books in the morning. In the afternoon, he enjoys swimming with his friends. In the evening, he listens to music. His hobbies make him very happy.",
            quiz = listOf(
                QuizQuestion("کدام جمله درست است؟", listOf("I like swim.", "I like swimming.", "I like to swiming.", "I like swiming."), 1),
                QuizQuestion("معنی \"Enjoy\" چیست؟", listOf("متنفر بودن", "لذت بردن", "خسته شدن", "ترسیدن"), 1)
            )
        ),

        Lesson(
            id = "b7",
            unitNumber = 7,
            title = "My Neighborhood",
            titlePersian = "محله من",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Neighborhood", "محله", "ˈneɪbərhʊd"),
                Word("Street", "خیابان", "strit"),
                Word("Park", "پارک", "pɑrk"),
                Word("Market", "بازار", "ˈmɑrkɪt"),
                Word("Hospital", "بیمارستان", "ˈhɑspɪtl"),
                Word("Restaurant", "رستوران", "ˈrɛstərɑnt"),
                Word("Bank", "بانک", "bæŋk"),
                Word("Near", "نزدیک", "nɪr")
            ),
            grammarTitle = "Prepositions of Place",
            grammarExplanation = "In = در\nOn = روی\nNext to = کنارِ\nNear = نزدیکِ\nBetween = بینِ\nAcross from = مقابلِ",
            grammarExamples = listOf(
                "The bank is next to the market. — بانک کنار بازار است.",
                "There is a park across from my house. — پارکی مقابل خانه من است.",
                "The hospital is between the school and the restaurant. — بیمارستان بین مدرسه و رستوران است."
            ),
            conversation = Conversation(
                title = "Asking for directions",
                titlePersian = "پرسیدن آدرس",
                lines = listOf(
                    ConversationLine("A", "Excuse me, is there a bank near here?", "ببخشید، بانکی این نزدیکی هست؟"),
                    ConversationLine("B", "Yes, the bank is next to the market.", "بله، بانک کنار بازار است."),
                    ConversationLine("A", "Is it far from here?", "از اینجا دوره؟"),
                    ConversationLine("B", "No, it's very near. About 5 minutes on foot.", "نه، خیلی نزدیکه. حدود ۵ دقیقه پیاده."),
                    ConversationLine("A", "Great! Is there a park in this neighborhood?", "عالی! پارکی در این محله هست؟"),
                    ConversationLine("B", "Yes, there's a big park across from the hospital.", "بله، یه پارک بزرگ مقابل بیمارستان هست.")
                )
            ),
            storyTitle = "My New Neighborhood",
            storyText = "Maryam moved to a new neighborhood last week. Her new house is near a big park. There is a market next to her building. The bank is across from the hospital. She likes her new neighborhood very much.",
            quiz = listOf(
                QuizQuestion("معنی \"Next to\" چیست؟", listOf("دور از", "روی", "کنارِ", "زیرِ"), 2),
                QuizQuestion("کدام جمله درست است؟", listOf("The bank is on the market.", "The bank is next to the market.", "The bank is between the market.", "The bank is near of the market."), 1)
            )
        ),

        Lesson(
            id = "b8",
            unitNumber = 8,
            title = "Weather and Seasons",
            titlePersian = "آب و هوا و فصل‌ها",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Weather", "آب و هوا", "ˈwɛðər"),
                Word("Sunny", "آفتابی", "ˈsʌni"),
                Word("Rainy", "بارانی", "ˈreɪni"),
                Word("Snowy", "برفی", "ˈsnoʊi"),
                Word("Windy", "بادی", "ˈwɪndi"),
                Word("Spring", "بهار", "sprɪŋ"),
                Word("Summer", "تابستان", "ˈsʌmər"),
                Word("Winter", "زمستان", "ˈwɪntər")
            ),
            grammarTitle = "Present Continuous - حال استمراری",
            grammarExplanation = "برای کارهایی که الان در حال انجام هستن.\n\nفرمول: am/is/are + verb-ing",
            grammarExamples = listOf(
                "It is raining right now. — الان داره بارون میاد.",
                "The sun is shining today. — امروز خورشید داره می‌تابه.",
                "We are wearing coats because it's cold. — ما کاپشن پوشیدیم چون سرده."
            ),
            conversation = Conversation(
                title = "Talking about weather",
                titlePersian = "صحبت درباره آب و هوا",
                lines = listOf(
                    ConversationLine("A", "What's the weather like today?", "امروز هوا چطوره؟"),
                    ConversationLine("B", "It's sunny and warm.", "آفتابیه و گرمه."),
                    ConversationLine("A", "What's your favorite season?", "فصل مورد علاقه‌ات کدومه؟"),
                    ConversationLine("B", "I love spring. The flowers are beautiful.", "بهار رو دوست دارم. گل‌ها زیبا هستن."),
                    ConversationLine("A", "I prefer winter because I like snow.", "من زمستان رو ترجیح می‌دم چون برف رو دوست دارم."),
                    ConversationLine("B", "But it's too cold in winter!", "ولی زمستان خیلی سرده!")
                )
            ),
            storyTitle = "A Rainy Day",
            storyText = "Today is a rainy day. Tom is looking out the window. The rain is falling softly. He is drinking hot tea and reading a book. His cat is sleeping on the sofa. Tom likes rainy days because they are calm and peaceful.",
            quiz = listOf(
                QuizQuestion("معنی \"Sunny\" چیست؟", listOf("بارانی", "برفی", "آفتابی", "بادی"), 2),
                QuizQuestion("کدام جمله درست است؟", listOf("It is rain now.", "It is raining now.", "It raining now.", "It rains now."), 1)
            )
        ),

        Lesson(
            id = "b9",
            unitNumber = 9,
            title = "Clothes and Fashion",
            titlePersian = "لباس و مد",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shirt", "پیراهن", "ʃɜrt"),
                Word("Pants", "شلوار", "pænts"),
                Word("Shoes", "کفش", "ʃuz"),
                Word("Dress", "لباس زنانه", "drɛs"),
                Word("Jacket", "کاپشن", "ˈdʒækɪt"),
                Word("Size", "اندازه", "saɪz"),
                Word("Wear", "پوشیدن", "wɛr"),
                Word("Beautiful", "زیبا", "ˈbjutəfəl")
            ),
            grammarTitle = "Possessive Adjectives",
            grammarExplanation = "My (مال من)\nYour (مال تو)\nHis (مال او)\nHer (مال او)\nOur (مال ما)\nTheir (مال آن‌ها)",
            grammarExamples = listOf(
                "This is my jacket. — این کاپشن منه.",
                "Her dress is very beautiful. — لباسش خیلی زیباست.",
                "Their shoes are new. — کفش‌هاشون نو هستند."
            ),
            conversation = Conversation(
                title = "Shopping for clothes",
                titlePersian = "خرید لباس",
                lines = listOf(
                    ConversationLine("A", "Can I help you?", "می‌تونم کمکت کنم؟"),
                    ConversationLine("B", "Yes, I'm looking for a jacket.", "بله، دنبال یه کاپشن می‌گردم."),
                    ConversationLine("A", "What size do you wear?", "چه سایزی می‌پوشی؟"),
                    ConversationLine("B", "Medium, please. Do you have it in blue?", "سایز متوسط، لطفاً. آبی‌اش رو دارید؟"),
                    ConversationLine("A", "Yes, we have. Would you like to try it on?", "بله، داریم. می‌خوای پرو کنی؟"),
                    ConversationLine("B", "Yes, please. Where is the fitting room?", "بله، لطفاً. اتاق پرو کجاست؟")
                )
            ),
            storyTitle = "Sara's New Dress",
            storyText = "Sara is going to a party. She wants a new dress. Her mother takes her to a shop. Sara tries on a red dress. It fits her very well. She looks beautiful. She is very happy with her new dress.",
            quiz = listOf(
                QuizQuestion("معنی \"Jacket\" چیست؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("This is me jacket.", "This is my jacket.", "This is I jacket.", "This is mine jacket."), 1)
            )
        ),

        Lesson(
            id = "b10",
            unitNumber = 10,
            title = "Health and Body",
            titlePersian = "سلامتی و بدن",
            level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Head", "سر", "hɛd"),
                Word("Stomach", "شکم", "ˈstʌmək"),
                Word("Doctor", "دکتر", "ˈdɑktər"),
                Word("Medicine", "دارو", "ˈmɛdəsɪn"),
                Word("Sick", "بیمار", "sɪk"),
                Word("Pain", "درد", "peɪn"),
                Word("Tired", "خسته", "ˈtaɪərd"),
                Word("Healthy", "سالم", "ˈhɛlθi")
            ),
            grammarTitle = "Should / Shouldn't",
            grammarExplanation = "You should + verb (باید / بهتره)\nYou shouldn't + verb (نباید / بهتره نکنی)",
            grammarExamples = listOf(
                "You should see a doctor. — بهتره یه دکتر ببینی.",
                "You shouldn't eat too much sugar. — نباید زیاد شکر بخوری.",
                "You should get more sleep. — بهتره بیشتر بخوابی."
            ),
            conversation = Conversation(
                title = "At the doctor's office",
                titlePersian = "در مطب دکتر",
                lines = listOf(
                    ConversationLine("A", "What's the matter?", "چی شده؟"),
                    ConversationLine("B", "I have a headache and I feel tired.", "سردرد دارم و خسته‌ام."),
                    ConversationLine("A", "How long have you felt this way?", "چقدره که این‌طوری هستی؟"),
                    ConversationLine("B", "Since yesterday.", "از دیروز."),
                    ConversationLine("A", "You should rest and take this medicine.", "باید استراحت کنی و این دارو رو بخوری."),
                    ConversationLine("B", "Thank you, doctor. I'll take it.", "ممنون دکتر. مصرفش می‌کنم.")
                )
            ),
            storyTitle = "Feeling Sick",
            storyText = "Ali feels sick today. He has a stomachache and a headache. His mother takes him to the doctor. The doctor says he should rest and drink a lot of water. Ali stays in bed all day. The next morning, he feels much better.",
            quiz = listOf(
                QuizQuestion("معنی \"Healthy\" چیست؟", listOf("بیمار", "خسته", "سالم", "دردناک"), 2),
                QuizQuestion("کدام جمله درست است؟", listOf("You should to rest.", "You should rest.", "You should resting.", "You should rests."), 1)
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
            grammarExplanation = "فرمول: have/has + past participle",
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
                QuizQuestion("معنی \"Diversity\" چیست؟", listOf("یکنواختی", "تنوع", "فرهنگ", "جامعه"), 1),
                QuizQuestion("کدام جمله در حال کامل درست است؟", listOf("I have went to Paris.", "I have been to Paris.", "I has been to Paris.", "I have go to Paris."), 1)
            )
        ),

        Lesson(
            id = "i2",
            unitNumber = 2,
            title = "Modern Technology",
            titlePersian = "تکنولوژی مدرن",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Technology", "تکنولوژی", "tɛkˈnɑlədʒi"),
                Word("Device", "دستگاه", "dɪˈvaɪs"),
                Word("Smartphone", "گوشی هوشمند", "ˈsmɑrtfoʊn"),
                Word("App", "اپلیکیشن", "æp"),
                Word("Download", "دانلود کردن", "ˈdaʊnloʊd"),
                Word("Software", "نرم‌افزار", "ˈsɔftwɛr"),
                Word("Update", "به‌روزرسانی", "ˈʌpdeɪt"),
                Word("Innovation", "نوآوری", "ˌɪnəˈveɪʃən")
            ),
            grammarTitle = "Present Perfect Continuous",
            grammarExplanation = "فرمول: have/has been + verb-ing",
            grammarExamples = listOf(
                "I have been using this app for a year. — یک سال است که از این اپ استفاده می‌کنم.",
                "She has been working on this project all morning. — او تمام صبح روی این پروژه کار کرده است.",
                "They have been developing new software. — آن‌ها در حال توسعه نرم‌افزار جدید بوده‌اند."
            ),
            conversation = Conversation(
                title = "Discussing technology",
                titlePersian = "بحث درباره تکنولوژی",
                lines = listOf(
                    ConversationLine("A", "Have you tried the new app for learning English?", "اپ جدید یادگیری انگلیسی رو امتحان کردی؟"),
                    ConversationLine("B", "Yes, I've been using it for a month now.", "بله، یک ماهه که دارم ازش استفاده می‌کنم."),
                    ConversationLine("A", "How is it? Is it useful?", "چطوره؟ مفیده؟"),
                    ConversationLine("B", "It's amazing! Technology has changed the way we learn.", "عالیه! تکنولوژی روش یادگیری ما رو تغییر داده."),
                    ConversationLine("A", "I agree. But sometimes we spend too much time on our devices.", "موافقم. ولی بعضی وقت‌ها وقت زیادی روی دستگاه‌هامون می‌گذرونیم."),
                    ConversationLine("B", "That's true. We need a healthy balance.", "درسته. ما به تعادل سالم نیاز داریم.")
                )
            ),
            storyTitle = "The Digital Age",
            storyText = "Technology has transformed every aspect of our lives. We have been communicating through smartphones and computers for many years. New innovations appear every day. However, we must remember that technology should serve us, not control us.",
            quiz = listOf(
                QuizQuestion("معنی \"Innovation\" چیست؟", listOf("تکرار", "نوآوری", "تخریب", "سکون"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("I have using this app.", "I have been using this app.", "I has been using this app.", "I have be using this app."), 1)
            )
        ),

        Lesson(
            id = "i3",
            unitNumber = 3,
            title = "Healthy Lifestyle",
            titlePersian = "سبک زندگی سالم",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Exercise", "ورزش", "ˈɛksərsaɪz"),
                Word("Nutrition", "تغذیه", "nuˈtrɪʃən"),
                Word("Stress", "استرس", "strɛs"),
                Word("Balance", "تعادل", "ˈbæləns"),
                Word("Habit", "عادت", "ˈhæbɪt"),
                Word("Wellness", "سلامتی", "ˈwɛlnəs"),
                Word("Meditation", "مدیتیشن", "ˌmɛdɪˈteɪʃən"),
                Word("Lifestyle", "سبک زندگی", "ˈlaɪfstaɪl")
            ),
            grammarTitle = "Modal Verbs: Must, Have to, Should",
            grammarExplanation = "Must = باید\nHave to = مجبور بودن\nShould = بهتره",
            grammarExamples = listOf(
                "You must drink enough water every day. — باید هر روز آب کافی بنوشی.",
                "I have to wake up early for work. — مجبورم برای کار زود بیدار شم.",
                "She should reduce her stress levels. — بهتره سطح استرسش رو کم کنه."
            ),
            conversation = Conversation(
                title = "Talking about healthy habits",
                titlePersian = "صحبت درباره عادات سالم",
                lines = listOf(
                    ConversationLine("A", "I've been trying to live a healthier lifestyle.", "سعی می‌کنم سبک زندگی سالم‌تری داشته باشم."),
                    ConversationLine("B", "That's great! What changes have you made?", "عالیه! چه تغییراتی دادی؟"),
                    ConversationLine("A", "I exercise three times a week and I eat more vegetables.", "هفته‌ای سه بار ورزش می‌کنم و سبزیجات بیشتری می‌خورم."),
                    ConversationLine("B", "Good for you! How do you manage stress?", "آفرین به تو! استرس رو چطور مدیریت می‌کنی؟"),
                    ConversationLine("A", "I practice meditation every morning. It really helps.", "هر صبح مدیتیشن تمرین می‌کنم. واقعاً کمک می‌کنه."),
                    ConversationLine("B", "I should try that too. Balance is so important.", "من هم باید امتحان کنم. تعادل خیلی مهمه.")
                )
            ),
            storyTitle = "A Journey to Wellness",
            storyText = "Sarah used to have unhealthy habits. She never exercised and ate fast food every day. One day, she decided to change. She started to exercise regularly and cook healthy meals. Now she feels more energetic and happier than ever before.",
            quiz = listOf(
                QuizQuestion("معنی \"Wellness\" چیست؟", listOf("بیماری", "سلامتی", "خستگی", "استرس"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("You must to exercise daily.", "You must exercise daily.", "You must exercising daily.", "You must exercises daily."), 1)
            )
        ),

        Lesson(
            id = "i4",
            unitNumber = 4,
            title = "Travel and Adventure",
            titlePersian = "سفر و ماجراجویی",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Adventure", "ماجراجویی", "ædˈvɛntʃər"),
                Word("Destination", "مقصد", "ˌdɛstɪˈneɪʃən"),
                Word("Journey", "سفر", "ˈdʒɜrni"),
                Word("Explore", "کاوش کردن", "ɪkˈsplɔr"),
                Word("Landscape", "منظره", "ˈlændskeɪp"),
                Word("Culture", "فرهنگ", "ˈkʌltʃər"),
                Word("Souvenir", "سوغات", "ˌsuvəˈnɪr"),
                Word("Itinerary", "برنامه سفر", "aɪˈtɪnərɛri")
            ),
            grammarTitle = "Past Perfect",
            grammarExplanation = "فرمول: had + past participle",
            grammarExamples = listOf(
                "By the time we arrived, the tour had started. — تا ما رسیدیم، تور شروع شده بود.",
                "She had never seen such beautiful landscapes before. — او قبلاً هرگز چنین مناظر زیبایی ندیده بود.",
                "They had booked the hotel before the trip. — آن‌ها قبل از سفر هتل را رزرو کرده بودند."
            ),
            conversation = Conversation(
                title = "Planning a trip",
                titlePersian = "برنامه‌ریزی سفر",
                lines = listOf(
                    ConversationLine("A", "I'm planning an adventure trip to South America.", "دارم یه سفر ماجراجویانه به آمریکای جنوبی برنامه‌ریزی می‌کنم."),
                    ConversationLine("B", "Wow! Have you decided on your destination?", "واو! مقصدت رو مشخص کردی؟"),
                    ConversationLine("A", "Yes, I've chosen Peru. I want to explore Machu Picchu.", "بله، پرو رو انتخاب کردم. می‌خوام ماچو پیچو رو ببینم."),
                    ConversationLine("B", "That sounds amazing! Have you made an itinerary?", "عالی به نظر میاد! برنامه سفر نوشتی؟"),
                    ConversationLine("A", "Not yet, but I had researched it before I booked the flight.", "نه هنوز، ولی قبل از اینکه بلیط بگیرم تحقیق کرده بودم."),
                    ConversationLine("B", "You should definitely try the local food and buy some souvenirs.", "حتماً باید غذای محلی امتحان کنی و سوغات بخری.")
                )
            ),
            storyTitle = "The Adventure of a Lifetime",
            storyText = "James had dreamed of traveling to Nepal since childhood. When he finally arrived in Kathmandu, he felt like his dream had come true. He had prepared for this journey for years. The landscapes were breathtaking, and the local culture amazed him. It was truly the adventure of a lifetime.",
            quiz = listOf(
                QuizQuestion("معنی \"Destination\" چیست؟", listOf("مسیر", "مقصد", "وسیله", "بلیط"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("She had see the pyramids.", "She had seen the pyramids.", "She has seen the pyramids.", "She had saw the pyramids."), 1)
            )
        ),

        Lesson(
            id = "i5",
            unitNumber = 5,
            title = "Work and Career",
            titlePersian = "کار و حرفه",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Career", "حرفه", "kəˈrɪr"),
                Word("Interview", "مصاحبه", "ˈɪntərvju"),
                Word("Resume", "رزومه", "ˈrɛzəmeɪ"),
                Word("Salary", "حقوق", "ˈsæləri"),
                Word("Promotion", "ترفیع", "prəˈmoʊʃən"),
                Word("Colleague", "همکار", "ˈkɑliɡ"),
                Word("Experience", "تجربه", "ɪkˈspɪriəns"),
                Word("Skill", "مهارت", "skɪl")
            ),
            grammarTitle = "Reported Speech",
            grammarExplanation = "گفتار غیرمستقیم:\n\nمستقیم: She said, \"I am busy.\"\nغیرمستقیم: She said (that) she was busy.",
            grammarExamples = listOf(
                "He said he was looking for a new job. — او گفت که دنبال شغل جدیدی می‌گردد.",
                "She told me she had applied for the position. — او به من گفت که برای آن موقعیت درخواست داده است.",
                "They said they would call me back. — آن‌ها گفتند که به من زنگ می‌زنند."
            ),
            conversation = Conversation(
                title = "Job interview",
                titlePersian = "مصاحبه شغلی",
                lines = listOf(
                    ConversationLine("A", "Tell me about your previous experience.", "از تجربه قبلی‌ت بگو."),
                    ConversationLine("B", "I worked as a marketing manager for three years.", "سه سال به‌عنوان مدیر بازاریابی کار کردم."),
                    ConversationLine("A", "What skills do you think are important for this role?", "چه مهارت‌هایی فکر می‌کنی برای این نقش مهمه؟"),
                    ConversationLine("B", "Communication, teamwork, and problem-solving.", "ارتباطات، کار تیمی، و حل مسئله."),
                    ConversationLine("A", "Why do you want to leave your current job?", "چرا می‌خوای شغل فعلی‌ت رو ترک کنی؟"),
                    ConversationLine("B", "I'm looking for new challenges and a better salary.", "دنبال چالش‌های جدید و حقوق بهتر هستم.")
                )
            ),
            storyTitle = "The Promotion",
            storyText = "Daniel had been working at the company for five years. He had always been hardworking and dedicated. When the manager position opened, he applied immediately. After a difficult interview, he was offered the promotion. His colleagues congratulated him warmly.",
            quiz = listOf(
                QuizQuestion("معنی \"Promotion\" چیست؟", listOf("اخراج", "ترفیع", "استعفا", "استخدام"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("He said he is busy.", "He said he was busy.", "He said he will be busy.", "He said he be busy."), 1)
            )
        ),

        Lesson(
            id = "i6",
            unitNumber = 6,
            title = "Environmental Issues",
            titlePersian = "مسائل زیست‌محیطی",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Environment", "محیط زیست", "ɪnˈvaɪrənmənt"),
                Word("Pollution", "آلودگی", "pəˈluʃən"),
                Word("Recycle", "بازیافت کردن", "riˈsaɪkəl"),
                Word("Climate", "آب و هوا", "ˈklaɪmət"),
                Word("Energy", "انرژی", "ˈɛnərdʒi"),
                Word("Waste", "زباله", "weɪst"),
                Word("Sustainable", "پایدار", "səˈsteɪnəbəl"),
                Word("Protect", "محافظت کردن", "prəˈtɛkt")
            ),
            grammarTitle = "First Conditional",
            grammarExplanation = "فرمول: If + present simple, will + verb",
            grammarExamples = listOf(
                "If we don't recycle, pollution will increase. — اگر بازیافت نکنیم، آلودگی افزایش می‌یابد.",
                "If you use less energy, you will save money. — اگر انرژی کمتری مصرف کنی، پول صرفه‌جویی می‌کنی.",
                "If everyone helps, we will protect the environment. — اگر همه کمک کنند، محیط زیست را محافظت خواهیم کرد."
            ),
            conversation = Conversation(
                title = "Discussing climate change",
                titlePersian = "بحث درباره تغییرات اقلیمی",
                lines = listOf(
                    ConversationLine("A", "Do you think climate change is a serious problem?", "فکر می‌کنی تغییرات اقلیمی مشکل جدی‌ایه؟"),
                    ConversationLine("B", "Absolutely. If we don't act now, it will get worse.", "قطعاً. اگر الان اقدام نکنیم، بدتر می‌شه."),
                    ConversationLine("A", "What can we do as individuals?", "ما به‌عنوان افراد چی می‌تونیم بکنیم؟"),
                    ConversationLine("B", "We should recycle more and use less energy.", "باید بیشتر بازیافت کنیم و انرژی کمتری مصرف کنیم."),
                    ConversationLine("A", "I've started using public transportation.", "من شروع کردم به استفاده از حمل و نقل عمومی."),
                    ConversationLine("B", "That's great! Every small action matters.", "عالیه! هر اقدام کوچیکی مهمه.")
                )
            ),
            storyTitle = "Our Planet, Our Responsibility",
            storyText = "The Earth is facing serious environmental challenges. Pollution has increased dramatically over the past decades. Many species have become endangered. If we continue this path, future generations will suffer. However, we still have time to make a difference.",
            quiz = listOf(
                QuizQuestion("معنی \"Sustainable\" چیست؟", listOf("موقت", "پایدار", "خطرناک", "آلوده"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("If it rains, I would stay home.", "If it rains, I will stay home.", "If it will rain, I stay home.", "If it rained, I will stay home."), 1)
            )
        ),

        Lesson(
            id = "i7",
            unitNumber = 7,
            title = "Education and Learning",
            titlePersian = "آموزش و یادگیری",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Education", "آموزش", "ˌɛdʒuˈkeɪʃən"),
                Word("Knowledge", "دانش", "ˈnɑlɪdʒ"),
                Word("Degree", "مدرک", "dɪˈɡri"),
                Word("Scholarship", "بورسیه", "ˈskɑlərʃɪp"),
                Word("Research", "تحقیق", "rɪˈsɜrtʃ"),
                Word("Graduate", "فارغ‌التحصیل شدن", "ˈɡrædʒuˌeɪt"),
                Word("University", "دانشگاه", "ˌjunəˈvɜrsəti"),
                Word("Skill", "مهارت", "skɪl")
            ),
            grammarTitle = "Used to / Be used to",
            grammarExplanation = "Used to: عادت در گذشته\nBe used to: عادت داشتن به چیزی",
            grammarExamples = listOf(
                "I used to study at the library. — قبلاً در کتابخانه درس می‌خواندم.",
                "She is used to taking online classes. — او به شرکت در کلاس‌های آنلاین عادت دارد.",
                "They used to live in London. — آن‌ها قبلاً در لندن زندگی می‌کردند."
            ),
            conversation = Conversation(
                title = "Talking about studies",
                titlePersian = "صحبت درباره تحصیلات",
                lines = listOf(
                    ConversationLine("A", "What are you studying at university?", "چی در دانشگاه می‌خونی؟"),
                    ConversationLine("B", "I'm studying computer science. I love it!", "علوم کامپیوتر می‌خونم. عاشقشم!"),
                    ConversationLine("A", "That's a great field. Why did you choose it?", "رشته عالیه. چرا انتخابش کردی؟"),
                    ConversationLine("B", "I used to play video games a lot, so I got interested in programming.", "قبلاً زیاد بازی می‌کردم، برای همین به برنامه‌نویسی علاقه‌مند شدم."),
                    ConversationLine("A", "Have you applied for any scholarships?", "برای بورسیه‌ای درخواست دادی؟"),
                    ConversationLine("B", "Yes, I have. I hope I'll graduate with honors.", "بله، دادم. امیدوارم با افتخار فارغ‌التحصیل بشم.")
                )
            ),
            storyTitle = "The Power of Education",
            storyText = "Maria grew up in a small village where education was rare. She used to walk two hours to school every day. Her family couldn't afford books, so she borrowed them from the library. Years later, she graduated from a top university. Now she helps other children get an education.",
            quiz = listOf(
                QuizQuestion("معنی \"Scholarship\" چیست؟", listOf("شهریه", "بورسیه", "امتحان", "مدرک"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("I used to playing football.", "I used to play football.", "I use to play football.", "I used playing football."), 1)
            )
        ),

        Lesson(
            id = "i8",
            unitNumber = 8,
            title = "Media and News",
            titlePersian = "رسانه و اخبار",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Media", "رسانه", "ˈmidiə"),
                Word("News", "اخبار", "nuz"),
                Word("Article", "مقاله", "ˈɑrtɪkəl"),
                Word("Journalist", "روزنامه‌نگار", "ˈdʒɜrnəlɪst"),
                Word("Report", "گزارش", "rɪˈpɔrt"),
                Word("Source", "منبع", "sɔrs"),
                Word("Headline", "تیتر", "ˈhɛdlaɪn"),
                Word("Broadcast", "پخش کردن", "ˈbrɔdkæst")
            ),
            grammarTitle = "Gerunds and Infinitives",
            grammarExplanation = "بعضی افعال با ing و بعضی با to:\n\nEnjoy + ing\nWant + to\nDecide + to\nAvoid + ing",
            grammarExamples = listOf(
                "I enjoy reading the news online. — از خواندن اخبار آنلاین لذت می‌برم.",
                "She decided to become a journalist. — او تصمیم گرفت روزنامه‌نگار شود.",
                "They avoid watching too much TV. — آن‌ها از تماشای زیاد تلویزیون پرهیز می‌کنند."
            ),
            conversation = Conversation(
                title = "Discussing news sources",
                titlePersian = "بحث درباره منابع خبری",
                lines = listOf(
                    ConversationLine("A", "Where do you usually get your news from?", "معمولاً اخبار رو از کجا می‌گیری؟"),
                    ConversationLine("B", "I prefer reading articles from reliable sources.", "ترجیح می‌دم مقالات رو از منابع معتبر بخونم."),
                    ConversationLine("A", "Do you think all news is accurate?", "فکر می‌کنی همه اخبار دقیقن؟"),
                    ConversationLine("B", "Not always. We should always check the source.", "نه همیشه. باید همیشه منبع رو چک کنیم."),
                    ConversationLine("A", "I agree. Fake news is a big problem today.", "موافقم. اخبار جعلی امروز مشکل بزرگیه."),
                    ConversationLine("B", "Journalists should be more responsible.", "روزنامه‌نگارها باید مسئول‌تر باشن.")
                )
            ),
            storyTitle = "The Truth Behind the Story",
            storyText = "A young journalist was assigned to report on a local event. She decided to research thoroughly before writing. She interviewed many witnesses and checked every fact. Her article became famous because of its accuracy. She had proven that good journalism still exists.",
            quiz = listOf(
                QuizQuestion("معنی \"Source\" چیست؟", listOf("خبر", "منبع", "تیتر", "گزارش"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("I enjoy to read books.", "I enjoy reading books.", "I enjoy read books.", "I enjoy reads books."), 1)
            )
        ),

        Lesson(
            id = "i9",
            unitNumber = 9,
            title = "Money and Banking",
            titlePersian = "پول و بانکداری",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Account", "حساب", "əˈkaʊnt"),
                Word("Deposit", "واریز", "dɪˈpɑzɪt"),
                Word("Withdraw", "برداشت", "wɪðˈdrɔ"),
                Word("Currency", "ارز", "ˈkɜrənsi"),
                Word("Budget", "بودجه", "ˈbʌdʒɪt"),
                Word("Loan", "وام", "loʊn"),
                Word("Interest", "سود", "ˈɪntrəst"),
                Word("Investment", "سرمایه‌گذاری", "ɪnˈvɛstmənt")
            ),
            grammarTitle = "Second Conditional",
            grammarExplanation = "فرمول: If + past simple, would + verb",
            grammarExamples = listOf(
                "If I saved more, I would buy a house. — اگر بیشتر پس‌انداز کنم، خانه می‌خرم.",
                "If I were rich, I would invest in stocks. — اگر ثروتمند بودم، در سهام سرمایه‌گذاری می‌کردم.",
                "She would open a bank account if she had an ID. — اگر کارت شناسایی داشت، حساب بانکی باز می‌کرد."
            ),
            conversation = Conversation(
                title = "Talking about finances",
                titlePersian = "صحبت درباره امور مالی",
                lines = listOf(
                    ConversationLine("A", "Do you have a savings account?", "حساب پس‌انداز داری؟"),
                    ConversationLine("B", "Yes, I try to deposit money every month.", "بله، سعی می‌کنم هر ماه پول واریز کنم."),
                    ConversationLine("A", "That's smart. Do you have a budget?", "هوشمندانه‌ست. بودجه داری؟"),
                    ConversationLine("B", "Yes, I use an app to track my expenses.", "بله، از یه اپ برای پیگیری هزینه‌هام استفاده می‌کنم."),
                    ConversationLine("A", "What would you do if you won the lottery?", "اگه لاتاری برنده می‌شدی چی می‌کردی؟"),
                    ConversationLine("B", "If I won, I would invest in real estate.", "اگه برنده می‌شدم، در املاک سرمایه‌گذاری می‌کردم.")
                )
            ),
            storyTitle = "Smart Financial Decisions",
            storyText = "Michael used to spend all his salary every month. He had no savings and no budget. One day, he realized he needed to change. He opened a savings account and started investing. Five years later, he bought his first apartment. It was the best decision of his life.",
            quiz = listOf(
                QuizQuestion("معنی \"Investment\" چیست؟", listOf("هزینه", "سرمایه‌گذاری", "وام", "سود"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("If I have money, I would travel.", "If I had money, I would travel.", "If I had money, I will travel.", "If I have money, I will would travel."), 1)
            )
        ),

        Lesson(
            id = "i10",
            unitNumber = 10,
            title = "Relationships and Communication",
            titlePersian = "روابط و ارتباطات",
            level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Relationship", "رابطه", "rɪˈleɪʃənʃɪp"),
                Word("Communication", "ارتباط", "kəˌmjunɪˈkeɪʃən"),
                Word("Trust", "اعتماد", "trʌst"),
                Word("Argument", "بحث", "ˈɑrɡjəmənt"),
                Word("Apologize", "عذرخواهی کردن", "əˈpɑlədʒaɪz"),
                Word("Forgive", "بخشیدن", "fərˈɡɪv"),
                Word("Honest", "صادق", "ˈɑnɪst"),
                Word("Understanding", "تفاهم", "ˌʌndərˈstændɪŋ")
            ),
            grammarTitle = "Reflexive Pronouns",
            grammarExplanation = "Myself, Yourself, Himself, Herself, Ourselves, Themselves",
            grammarExamples = listOf(
                "I taught myself English. — خودم انگلیسی یاد گرفتم.",
                "She blamed herself for the mistake. — او خودش را برای اشتباه سرزنش کرد.",
                "We should respect ourselves and others. — ما باید به خودمون و دیگران احترام بگذاریم."
            ),
            conversation = Conversation(
                title = "Resolving a conflict",
                titlePersian = "حل کردن یک تعارض",
                lines = listOf(
                    ConversationLine("A", "I'm sorry for what I said yesterday.", "برای چیزی که دیروز گفتم متأسفم."),
                    ConversationLine("B", "Thank you for apologizing. I was really hurt.", "ممنون که عذرخواهی کردی. واقعاً ناراحت شدم."),
                    ConversationLine("A", "I know, and I feel terrible about it.", "می‌دونم، و واقعاً احساس بدی دارم."),
                    ConversationLine("B", "Communication is key in any relationship.", "ارتباط در هر رابطه‌ای کلیدیه."),
                    ConversationLine("A", "You're right. From now on, I'll be more honest.", "حق داری. از این به بعد صادق‌تر خواهم بود."),
                    ConversationLine("B", "And I'll try to understand your side too.", "من هم سعی می‌کنم طرف تو رو بفهمم.")
                )
            ),
            storyTitle = "The Art of Understanding",
            storyText = "Every relationship has its challenges. Misunderstandings can create distance between people. However, honest communication can heal any wound. When we learn to forgive ourselves and others, we build stronger bonds. Trust is the foundation of every meaningful relationship.",
            quiz = listOf(
                QuizQuestion("معنی \"Apologize\" چیست؟", listOf("تشکر کردن", "عذرخواهی کردن", "جواب دادن", "بحث کردن"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("She hurt sheself.", "She hurt herself.", "She hurt hisself.", "She hurt therself."), 1)
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
            grammarExplanation = "فرمول: be + past participle",
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
                QuizQuestion("معنی \"Supportive\" چیست؟", listOf("بی‌تفاوت", "حمایت‌گر", "خشن", "تنها"), 1),
                QuizQuestion("کدام جمله مجهول درست است؟", listOf("The book wrote by Shakespeare.", "The book was written by Shakespeare.", "The book is wrote by Shakespeare.", "The book written by Shakespeare."), 1)
            )
        )
    )

    fun getLessonsByLevel(level: Level): List<Lesson> =
        lessons.filter { it.level == level }

    fun getLessonById(id: String): Lesson? =
        lessons.firstOrNull { it.id == id }
}