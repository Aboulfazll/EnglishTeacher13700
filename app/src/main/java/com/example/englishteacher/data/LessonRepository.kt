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
                Word("Evening", "عصر/شب", "ˈivnɪŋ")
            ),
            grammarTitle = "Adverbs of Frequency - قیدهای تکرار",
            grammarExplanation = "قیدهای تکرار نشان می‌دهند یک کار چند وقت یک بار انجام می‌شود.\n\nAlways (همیشه) - Usually (معمولاً) - Often (غالباً) - Sometimes (بعضی وقت‌ها) - Never (هرگز)\n\nجای قید: قبل از فعل اصلی، بعد از فعل to be",
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
                QuizQuestion(
                    question = "معنی \"Breakfast\" چیست؟",
                    options = listOf("ناهار", "شام", "صبحانه", "میان‌وعده"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "I always am happy.",
                        "I am always happy.",
                        "Always I am happy.",
                        "I happy always am."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "معنی \"Never\" چیست؟",
                    options = listOf("همیشه", "هرگز", "معمولاً", "گاهی"),
                    correctIndex = 1
                )
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
            grammarExplanation = "اسم‌های قابل شمارش (Countable): می‌شه شمردشون (apple, book, car)\nاسم‌های غیرقابل شمارش (Uncountable): نمی‌شه شمردشون (water, rice, bread)\n\nبرای قابل شمارش: a/an + اسم\nبرای غیرقابل شمارش: some + اسم",
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
                QuizQuestion(
                    question = "کدام کلمه غیرقابل شمارش است؟",
                    options = listOf("Apple", "Water", "Book", "Car"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "معنی \"Delicious\" چیست؟",
                    options = listOf("بد", "تند", "خوشمزه", "سرد"),
                    correctIndex = 2
                )
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
            grammarExplanation = "برای گفتن اینکه چیزی وجود دارد:\n\nThere is + اسم مفرد\nThere are + اسم جمع\n\nمنفی:\nThere isn't / There aren't\nسوال:\nIs there...? / Are there...?",
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
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "There is twenty students.",
                        "There are twenty students.",
                        "There have twenty students.",
                        "There has twenty students."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "معنی \"Homework\" چیست؟",
                    options = listOf("امتحان", "کتاب", "تکلیف", "معلم"),
                    correctIndex = 2
                )
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
            grammarExplanation = "برای بیان علاقه از like + فعل با ing استفاده می‌کنیم:\n\nI like swimming. (شنا کردن رو دوست دارم)\nI love reading. (کتاب خواندن رو عاشقانه دوست دارم)\nI don't like cooking. (آشپزی رو دوست ندارم)\n\nافعال علاقه: like, love, enjoy, hate",
            grammarExamples = listOf(
                "I like playing football. — فوتبال بازی کردن رو دوست دارم.",
                "She loves drawing pictures. — او کشیدن نقاشی رو عاشقانه دوست داره.",
                "They enjoy listening to music. — آن‌ها گوش دادن به موسیقی رو لذت می‌برند."
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
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "I like swim.",
                        "I like swimming.",
                        "I like to swiming.",
                        "I like swiming."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "معنی \"Enjoy\" چیست؟",
                    options = listOf("متنفر بودن", "لذت بردن", "خسته شدن", "ترسیدن"),
                    correctIndex = 1
                )
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
                Word("Market", "بازار/فروشگاه", "ˈmɑrkɪt"),
                Word("Hospital", "بیمارستان", "ˈhɑspɪtl"),
                Word("Restaurant", "رستوران", "ˈrɛstərɑnt"),
                Word("Bank", "بانک", "bæŋk"),
                Word("Near", "نزدیک", "nɪr")
            ),
            grammarTitle = "Prepositions of Place",
            grammarExplanation = "حروف اضافه مکان:\n\nIn = در (داخل چیزی)\nOn = روی\nNext to = کنارِ\nNear = نزدیکِ\nBetween = بینِ\nAcross from = مقابلِ",
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
                QuizQuestion(
                    question = "معنی \"Next to\" چیست؟",
                    options = listOf("دور از", "روی", "کنارِ", "زیرِ"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "The bank is on the market.",
                        "The bank is next to the market.",
                        "The bank is between the market.",
                        "The bank is near of the market."
                    ),
                    correctIndex = 1
                )
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
            grammarExplanation = "زمان حال استمراری برای کارهایی که الان در حال انجام شدن هستند.\n\nفرمول: am/is/are + verb-ing\n\nمثال:\nI am reading (دارم می‌خوانم)\nHe is playing (دارد بازی می‌کند)\nWe are studying (داریم درس می‌خوانیم)",
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
                QuizQuestion(
                    question = "معنی \"Sunny\" چیست؟",
                    options = listOf("بارانی", "برفی", "آفتابی", "بادی"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "کدام جمله در زمان حال استمراری درست است؟",
                    options = listOf(
                        "It is rain now.",
                        "It is raining now.",
                        "It raining now.",
                        "It rains now."
                    ),
                    correctIndex = 1
                )
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
            grammarTitle = "Possessive Adjectives - صفات ملکی",
            grammarExplanation = "صفات ملکی نشان می‌دهند چیزی مال کیه:\n\nMy (مال من)\nYour (مال تو)\nHis (مال او - مذکر)\nHer (مال او - مؤنث)\nOur (مال ما)\nTheir (مال آن‌ها)",
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
                QuizQuestion(
                    question = "معنی \"Jacket\" چیست؟",
                    options = listOf("پیراهن", "کاپشن", "شلوار", "کفش"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "This is me jacket.",
                        "This is my jacket.",
                        "This is I jacket.",
                        "This is mine jacket."
                    ),
                    correctIndex = 1
                )
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
            grammarExplanation = "Should برای توصیه و پیشنهاد استفاده می‌شود:\n\nYou should + verb (باید / بهتره)\nYou shouldn't + verb (نباید / بهتره نکنی)\n\nبرای گفتن کارهای خوب و بد:",
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
                QuizQuestion(
                    question = "معنی \"Healthy\" چیست؟",
                    options = listOf("بیمار", "خسته", "سالم", "دردناک"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "کدام جمله درست است؟",
                    options = listOf(
                        "You should to rest.",
                        "You should rest.",
                        "You should resting.",
                        "You should rests."
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