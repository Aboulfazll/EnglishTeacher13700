package com.example.englishteacher.data

object LessonRepository {

    private val lessons: List<Lesson> = listOf(

        // ==================== BEGINNER (14 Lessons) ====================

        Lesson(
            id = "b1", unitNumber = 1, title = "Names and Occupations", titlePersian = "نام‌ها و شغل‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Teacher", "معلم", "ˈtiːtʃər"), Word("Student", "دانش‌آموز", "ˈstuːdənt"),
                Word("Architect", "معمار", "ˈɑːrkɪtekt"), Word("Actor", "بازیگر", "ˈæktər"),
                Word("Athlete", "ورزشکار", "ˈæθliːt"), Word("Musician", "موسیقی‌دان", "mjuˈzɪʃən"),
                Word("Artist", "هنرمند", "ˈɑːrtɪst"), Word("Banker", "بانکدار", "ˈbæŋkər"),
                Word("Singer", "خواننده", "ˈsɪŋər"), Word("Flight attendant", "مهماندار پرواز", "flaɪt əˈtendənt"),
                Word("Chef", "سرآشپز", "ʃef"), Word("Writer", "نویسنده", "ˈraɪtər"),
                Word("Manager", "مدیر", "ˈmænɪdʒər"), Word("Scientist", "دانشمند", "ˈsaɪəntɪst"),
                Word("Doctor", "دکتر", "ˈdɑːktər"), Word("Engineer", "مهندس", "ˌendʒɪˈnɪr"),
                Word("Photographer", "عکاس", "fəˈtɑːɡrəfər"), Word("Pilot", "خلبان", "ˈpaɪlət")
            ),
            spelling = listOf(
                SpellingExercise("Cherie", "C - H - E - R - I - E", "شری"),
                SpellingExercise("Browne", "B - R - O - W - N - E", "براون"),
                SpellingExercise("Marie", "M - A - R - I - E", "ماری"),
                SpellingExercise("Laura", "L - A - U - R - A", "لورا")
            ),
            grammarTitle = "a / an + Occupations",
            grammarExplanation = "برای شغل‌ها از a یا an استفاده می‌کنیم.\n\n• a قبل از حرف بی‌صدا: a teacher\n• an قبل از حرف صدادار (a, e, i, o, u): an architect\n\nسوال: What do you do?",
            grammarExamples = listOf(
                "What do you do? — I'm a teacher.",
                "What does she do? — She's an architect.",
                "What does he do? — He's a doctor.",
                "Is she a singer? — Yes, she is.",
                "Is he an actor? — No, he's a banker."
            ),
            conversation = Conversation("Conversation Model", "مدل مکالمه", listOf(
                ConversationLine("A", "What do you do?", "شغلت چیه؟"),
                ConversationLine("B", "I'm an architect. And you?", "من معمارم. تو چطور؟"),
                ConversationLine("A", "I'm a banker.", "من بانکدارم."),
                ConversationLine("B", "Nice to meet you.", "از آشنایی با تو خوشحالم."),
                ConversationLine("A", "Nice to meet you too.", "من هم خوشحالم.")
            )),
            storyTitle = "Meeting Your Classmates",
            storyText = "In the classroom, students introduce themselves. Marie is a teacher. Tom is an architect. Laura is a doctor. They ask each other: What do you do? and share their occupations.",
            quiz = listOf(
                QuizQuestion("کدام جمله درست است؟", listOf("I'm a architect.", "I'm an architect.", "I'm architect.", "I am architect a."), 1),
                QuizQuestion("معنی \"What do you do?\" چیست؟", listOf("کجایی؟", "چیکار می‌کنی؟", "شغلت چیه؟", "چطوری؟"), 2),
                QuizQuestion("کدام درست است؟", listOf("She's a engineer.", "She's an engineer.", "She's engineer.", "She engineer is."), 1),
                QuizQuestion("معنی Flight attendant چیست؟", listOf("خلبان", "مهماندار پرواز", "راننده", "مسافر"), 1)
            )
        ),

        Lesson(
            id = "b2", unitNumber = 2, title = "About People", titlePersian = "درباره مردم", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Tall", "قدبلند", "tɔːl"), Word("Short", "کوتاه", "ʃɔːrt"),
                Word("Young", "جوان", "jʌŋ"), Word("Old", "پیر", "oʊld"),
                Word("Nice", "مهربان", "naɪs"), Word("Funny", "بامزه", "ˈfʌni"),
                Word("Serious", "جدی", "ˈsɪriəs"), Word("Friendly", "خوش‌برخورد", "ˈfrendli")
            ),
            grammarTitle = "Adjectives",
            grammarExplanation = "صفت‌ها برای توصیف افراد و اشیا:\n\nSubject + be + adjective\nShe is tall. He is funny.",
            grammarExamples = listOf(
                "She is tall and nice.",
                "He is young and friendly.",
                "They are funny and serious."
            ),
            conversation = Conversation("Describing people", "توصیف افراد", listOf(
                ConversationLine("A", "Who is your best friend?", "بهترین دوستت کیه؟"),
                ConversationLine("B", "Her name is Sara.", "اسمش ساراست."),
                ConversationLine("A", "What is she like?", "چه جوریه؟"),
                ConversationLine("B", "She is tall and very friendly.", "قدبلنده و خیلی خوش‌برخورد."),
                ConversationLine("A", "Is she funny?", "بامزه‌ست؟"),
                ConversationLine("B", "Yes, she is. She makes me laugh.", "بله. من رو می‌خندونه.")
            )),
            storyTitle = "My Best Friend",
            storyText = "My best friend is Ali. He is tall and funny. He is also very friendly. Everyone likes him. He is a great person.",
            quiz = listOf(
                QuizQuestion("معنی Tall چیست؟", listOf("کوتاه", "قدبلند", "پیر", "جوان"), 1),
                QuizQuestion("کدام جمله درست است؟", listOf("She tall.", "She is tall.", "She are tall.", "Tall she is."), 1)
            )
        ),

        Lesson(
            id = "b3", unitNumber = 3, title = "Places and Things", titlePersian = "مکان‌ها و اشیا", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Book", "کتاب", "bʊk"), Word("Table", "میز", "ˈteɪbəl"),
                Word("Chair", "صندلی", "tʃer"), Word("Window", "پنجره", "ˈwɪndoʊ"),
                Word("Door", "در", "dɔːr"), Word("Street", "خیابان", "striːt"),
                Word("City", "شهر", "ˈsɪti"), Word("Country", "کشور", "ˈkʌntri")
            ),
            grammarTitle = "Plural Nouns",
            grammarExplanation = "برای جمع اسم‌ها:\n\n• + s: book → books\n• + es (بعد از s, x, ch, sh): box → boxes\n• بی‌قاعده: man → men, woman → women, child → children",
            grammarExamples = listOf(
                "There are two books on the table.",
                "The city has many streets.",
                "The children are playing."
            ),
            conversation = Conversation("Places", "مکان‌ها", listOf(
                ConversationLine("A", "Where are you from?", "اهل کجایی؟"),
                ConversationLine("B", "I'm from Tehran. It's a big city.", "اهل تهرام. شهر بزرگیه."),
                ConversationLine("A", "Is it beautiful?", "زیباست؟"),
                ConversationLine("B", "Yes, there are many parks.", "بله، پارک‌های زیادی داره."),
                ConversationLine("A", "I want to visit someday.", "می‌خوام یه روز بیام."),
                ConversationLine("B", "You should! It's great.", "باید بیای! عالیه.")
            )),
            storyTitle = "My City",
            storyText = "Tehran is a big city in Iran. There are many streets and parks. There is a famous tower called Milad. Millions of people live there.",
            quiz = listOf(
                QuizQuestion("جمع \"book\" چیست؟", listOf("bookes", "books", "book", "bookies"), 1),
                QuizQuestion("جمع \"child\" چیست؟", listOf("childs", "childes", "children", "childrens"), 2)
            )
        ),

        Lesson(
            id = "b4", unitNumber = 4, title = "Family", titlePersian = "خانواده", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Father", "پدر", "ˈfɑːðər"), Word("Mother", "مادر", "ˈmʌðər"),
                Word("Brother", "برادر", "ˈbrʌðər"), Word("Sister", "خواهر", "ˈsɪstər"),
                Word("Son", "پسر", "sʌn"), Word("Daughter", "دختر", "ˈdɔːtər"),
                Word("Grandfather", "پدربزرگ", "ˈɡrænfɑːðər"), Word("Grandmother", "مادربزرگ", "ˈɡrænmʌðər")
            ),
            grammarTitle = "Possessive 's",
            grammarExplanation = "برای نشان دادن مالکیت:\n\nAli's book = کتاب علی\nMy father's car = ماشین پدرم\n\nبرای جمع: students' books",
            grammarExamples = listOf(
                "This is Ali's book.",
                "My father's car is red.",
                "The students' classroom is big."
            ),
            conversation = Conversation("My family", "خانواده من", listOf(
                ConversationLine("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
                ConversationLine("B", "Yes, I have two brothers and one sister.", "بله، دو برادر و یه خواهر دارم."),
                ConversationLine("A", "What does your father do?", "پدرت چیکار می‌کنه؟"),
                ConversationLine("B", "He's a doctor.", "دکتره."),
                ConversationLine("A", "And your mother?", "مادرت؟"),
                ConversationLine("B", "She's a teacher.", "معلمه.")
            )),
            storyTitle = "My Family",
            storyText = "My family is not very big. There are five people: my father, my mother, my brother, my sister, and me. My father is a doctor. My mother is a teacher. We are very happy together.",
            quiz = listOf(
                QuizQuestion("معنی Daughter چیست؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1),
                QuizQuestion("کدام درست است؟", listOf("Ali book", "Ali's book", "Alis book", "Book Ali"), 1)
            )
        ),

        Lesson(
            id = "b5", unitNumber = 5, title = "Events and Times", titlePersian = "رویدادها و زمان‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Today", "امروز", "təˈdeɪ"), Word("Tomorrow", "فردا", "təˈmɑːroʊ"),
                Word("Yesterday", "دیروز", "ˈjestərdeɪ"), Word("Morning", "صبح", "ˈmɔːrnɪŋ"),
                Word("Afternoon", "بعدازظهر", "ˌæftərˈnuːn"), Word("Evening", "عصر", "ˈiːvnɪŋ"),
                Word("Night", "شب", "naɪt"), Word("Week", "هفته", "wiːk")
            ),
            grammarTitle = "Time Expressions",
            grammarExplanation = "قیدهای زمان:\n\n• in the morning / afternoon / evening\n• at night\n• on Monday\n• in 2024\n\nحروف اضافه:\n• at + ساعت (at 5 o'clock)\n• on + روز (on Monday)\n• in + ماه/سال (in May)",
            grammarExamples = listOf(
                "I wake up in the morning.",
                "The meeting is on Monday.",
                "We eat dinner at 7 PM."
            ),
            conversation = Conversation("What time?", "چه ساعتی؟", listOf(
                ConversationLine("A", "What time is the meeting?", "جلسه چه ساعتیه؟"),
                ConversationLine("B", "It's at 3 PM.", "ساعت ۳ بعدازظهر."),
                ConversationLine("A", "On which day?", "چه روزی؟"),
                ConversationLine("B", "On Tuesday.", "روز سه‌شنبه."),
                ConversationLine("A", "Where is it?", "کجاست؟"),
                ConversationLine("B", "In the main office.", "توی دفتر اصلی.")
            )),
            storyTitle = "A Busy Week",
            storyText = "Ali has a busy week. On Monday, he has a meeting. On Tuesday, he goes to the gym. On Wednesday, he visits his family. On Thursday, he studies English. On Friday, he relaxes at home.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("in Monday", "on Monday", "at Monday", "Monday in"), 1),
                QuizQuestion("معنی Tomorrow چیست؟", listOf("امروز", "دیروز", "فردا", "پریروز"), 2)
            )
        ),

        Lesson(
            id = "b6", unitNumber = 6, title = "Cities and Countries", titlePersian = "شهرها و کشورها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Country", "کشور", "ˈkʌntri"), Word("City", "شهر", "ˈsɪti"),
                Word("Capital", "پایتخت", "ˈkæpɪtəl"), Word("Language", "زبان", "ˈlæŋɡwɪdʒ"),
                Word("Nationality", "ملیت", "ˌnæʃəˈnæləti"), Word("Continent", "قاره", "ˈkɑːntɪnənt"),
                Word("World", "جهان", "wɜːrld"), Word("Flag", "پرچم", "flæɡ")
            ),
            grammarTitle = "Where are you from?",
            grammarExplanation = "پرسیدن درباره ملیت:\n\n• Where are you from? — I'm from Iran.\n• What nationality are you? — I'm Iranian.\n• What language do you speak? — I speak Persian.",
            grammarExamples = listOf(
                "Where is she from? — She's from France.",
                "What nationality is he? — He's French.",
                "What language do they speak? — They speak English."
            ),
            conversation = Conversation("Countries", "کشورها", listOf(
                ConversationLine("A", "Where are you from?", "اهل کجایی؟"),
                ConversationLine("B", "I'm from Japan. And you?", "اهل ژاپنم. تو چطور؟"),
                ConversationLine("A", "I'm from Iran.", "من اهل ایرانم."),
                ConversationLine("B", "What language do you speak?", "چه زبانی صحبت می‌کنی؟"),
                ConversationLine("A", "I speak Persian and a little English.", "فارسی و کمی انگلیسی صحبت می‌کنم."),
                ConversationLine("B", "Your English is good!", "انگلیسی‌ات خوبه!")
            )),
            storyTitle = "Around the World",
            storyText = "There are 195 countries in the world. Each country has its own culture and language. Japan has Mount Fuji. France has the Eiffel Tower. Iran has beautiful mosques. The world is full of wonders.",
            quiz = listOf(
                QuizQuestion("معنی Capital چیست؟", listOf("شهر", "پایتخت", "کشور", "استان"), 1),
                QuizQuestion("کدام درست است؟", listOf("Where you from?", "Where are you from?", "From where you?", "You from where?"), 1)
            )
        ),

        Lesson(
            id = "b7", unitNumber = 7, title = "Clothes", titlePersian = "لباس‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shirt", "پیراهن", "ʃɜːrt"), Word("Pants", "شلوار", "pænts"),
                Word("Dress", "لباس زنانه", "dres"), Word("Jacket", "کاپشن", "ˈdʒækɪt"),
                Word("Shoes", "کفش", "ʃuːz"), Word("Hat", "کلاه", "hæt"),
                Word("Socks", "جوراب", "sɑːks"), Word("Coat", "پالتو", "koʊt")
            ),
            grammarTitle = "Colors + Clothes",
            grammarExplanation = "ترتیب: رنگ + اسم\n\n• a red shirt\n• blue pants\n• a black jacket\n\nسوال:\n• What color is it?\n• What is he wearing?",
            grammarExamples = listOf(
                "She is wearing a red dress.",
                "He has a blue jacket.",
                "My shoes are black and white."
            ),
            conversation = Conversation("What are you wearing?", "چی پوشیدی؟", listOf(
                ConversationLine("A", "What are you wearing today?", "امروز چی پوشیدی؟"),
                ConversationLine("B", "I'm wearing a blue shirt and black pants.", "یه پیراهن آبی و شلوار مشکی."),
                ConversationLine("A", "Nice! Are those new shoes?", "قشنگه! اون کفش‌ها جدیده؟"),
                ConversationLine("B", "Yes, I bought them yesterday.", "بله، دیروز خریدمشون."),
                ConversationLine("A", "They look great!", "عالی به نظر می‌رسن!"),
                ConversationLine("B", "Thank you!", "ممنون!")
            )),
            storyTitle = "Shopping for Clothes",
            storyText = "Sara goes to the mall. She wants to buy a new dress for her friend's party. She tries on a red dress. It looks beautiful. She buys it and goes home happy.",
            quiz = listOf(
                QuizQuestion("معنی Jacket چیست؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                QuizQuestion("کدام درست است؟", listOf("a shirt blue", "blue a shirt", "a blue shirt", "shirt a blue"), 2)
            )
        ),

        Lesson(
            id = "b8", unitNumber = 8, title = "Daily Life", titlePersian = "زندگی روزمره", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Wake up", "بیدار شدن", "weɪk ʌp"), Word("Get dressed", "لباس پوشیدن", "ɡet drest"),
                Word("Brush teeth", "مسواک زدن", "brʌʃ tiːθ"), Word("Have breakfast", "صبحانه خوردن", "hæv ˈbrekfəst"),
                Word("Go to work", "به سر کار رفتن", "ɡoʊ tə wɜːrk"), Word("Come home", "به خانه آمدن", "kʌm hoʊm"),
                Word("Watch TV", "تلویزیون تماشا کردن", "wɑːtʃ ˌtiːˈviː"), Word("Go to bed", "به رختخواب رفتن", "ɡoʊ tə bed")
            ),
            grammarTitle = "Daily Routine Verbs",
            grammarExplanation = "افعال روتین روزانه:\n\n• I wake up at 7.\n• I get dressed.\n• I have breakfast.\n• I go to work.\n• I come home at 6.\n• I go to bed at 11.",
            grammarExamples = listOf(
                "I wake up at 7 AM every day.",
                "She gets dressed after breakfast.",
                "They go to bed late."
            ),
            conversation = Conversation("My daily routine", "روتین روزانه من", listOf(
                ConversationLine("A", "What time do you wake up?", "ساعت چند بیدار می‌شی؟"),
                ConversationLine("B", "I usually wake up at 6:30.", "معمولاً ۶:۳۰."),
                ConversationLine("A", "What do you do after that?", "بعدش چیکار می‌کنی؟"),
                ConversationLine("B", "I brush my teeth and have breakfast.", "مسواک می‌زنم و صبحانه می‌خورم."),
                ConversationLine("A", "When do you go to work?", "کِی می‌ری سر کار؟"),
                ConversationLine("B", "At 8 o'clock.", "ساعت ۸.")
            )),
            storyTitle = "A Typical Day",
            storyText = "This is my daily routine. I wake up at 6:30. I brush my teeth and get dressed. I have breakfast at 7. Then I go to work. I come home at 6 PM. In the evening, I watch TV. I go to bed at 11.",
            quiz = listOf(
                QuizQuestion("معنی Brush teeth چیست؟", listOf("شستن دست", "مسواک زدن", "شام خوردن", "خوابیدن"), 1),
                QuizQuestion("کدام درست است؟", listOf("I wake up 7.", "I wake up at 7.", "I wake at 7 up.", "Wake I up 7."), 1)
            )
        ),

        Lesson(
            id = "b9", unitNumber = 9, title = "Shopping", titlePersian = "خرید", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Store", "فروشگاه", "stɔːr"), Word("Price", "قیمت", "praɪs"),
                Word("Dollar", "دلار", "ˈdɑːlər"), Word("Credit card", "کارت اعتباری", "ˈkredɪt kɑːrd"),
                Word("Cash", "پول نقد", "kæʃ"), Word("Discount", "تخفیف", "ˈdɪskaʊnt"),
                Word("Receipt", "رسید", "rɪˈsiːt"), Word("Customer", "مشتری", "ˈkʌstəmər")
            ),
            grammarTitle = "How much...?",
            grammarExplanation = "پرسیدن قیمت:\n\n• How much is this? — It's 10 dollars.\n• How much are these? — They're 20 dollars.\n\nبرای مفرد: is\nبرای جمع: are",
            grammarExamples = listOf(
                "How much is this shirt? — It's twenty dollars.",
                "How much are these shoes? — They're fifty dollars.",
                "Do you accept credit cards? — Yes, we do."
            ),
            conversation = Conversation("At the store", "در فروشگاه", listOf(
                ConversationLine("A", "How much is this jacket?", "این کاپشن چنده؟"),
                ConversationLine("B", "It's sixty dollars.", "شصت دلار."),
                ConversationLine("A", "That's expensive. Any discount?", "گرونه. تخفیف دارید؟"),
                ConversationLine("B", "Yes, we have 20% off today.", "بله، امروز ۲۰٪ تخفیف داریم."),
                ConversationLine("A", "Great! I'll take it.", "عالیه! همین رو می‌خرم."),
                ConversationLine("B", "Would you like a receipt?", "رسید می‌خواید؟")
            )),
            storyTitle = "Buying a Gift",
            storyText = "It's Maryam's mother's birthday. She goes to the store to buy a gift. She finds a beautiful scarf. It costs thirty dollars. She pays with her credit card. Her mother loves the gift.",
            quiz = listOf(
                QuizQuestion("معنی Discount چیست؟", listOf("افزایش قیمت", "تخفیف", "رسید", "مالیات"), 1),
                QuizQuestion("کدام درست است؟", listOf("How much these?", "How much are these?", "How many are these?", "How these much?"), 1)
            )
        ),

        Lesson(
            id = "b10", unitNumber = 10, title = "Food", titlePersian = "غذا", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Bread", "نان", "bred"), Word("Cheese", "پنیر", "tʃiːz"),
                Word("Egg", "تخم‌مرغ", "eɡ"), Word("Milk", "شیر", "mɪlk"),
                Word("Meat", "گوشت", "miːt"), Word("Rice", "برنج", "raɪs"),
                Word("Fruit", "میوه", "fruːt"), Word("Vegetable", "سبزیجات", "ˈvedʒtəbəl")
            ),
            grammarTitle = "Some / Any",
            grammarExplanation = "some در جملات مثبت: I have some bread.\nany در جملات منفی و سوال: I don't have any milk. Do you have any cheese?",
            grammarExamples = listOf(
                "I have some cheese.",
                "Do you have any eggs?",
                "I don't have any milk.",
                "She wants some fruit."
            ),
            conversation = Conversation("At the supermarket", "در سوپرمارکت", listOf(
                ConversationLine("A", "Do we have any bread?", "نان داریم؟"),
                ConversationLine("B", "No, we don't. We need to buy some.", "نه نداریم. باید بخریم."),
                ConversationLine("A", "What about eggs?", "تخم‌مرغ چطور؟"),
                ConversationLine("B", "We have some eggs.", "چند تا تخم‌مرغ داریم."),
                ConversationLine("A", "And milk?", "شیر؟"),
                ConversationLine("B", "Yes, there's some in the fridge.", "بله، توی یخچال هست.")
            )),
            storyTitle = "Shopping for Dinner",
            storyText = "Ali wants to make dinner. He checks the fridge. He has some rice and meat. He doesn't have any vegetables. He goes to the store and buys some tomatoes and onions. Now he can cook.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I have some bread.", "I have any bread.", "I have a bread.", "I have breads."), 0),
                QuizQuestion("معنی Vegetable چیست؟", listOf("میوه", "گوشت", "سبزیجات", "نان"), 2)
            )
        ),

        Lesson(
            id = "b11", unitNumber = 11, title = "Health", titlePersian = "سلامتی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Headache", "سردرد", "ˈhedeɪk"), Word("Stomachache", "دل‌درد", "ˈstʌməkeɪk"),
                Word("Fever", "تب", "ˈfiːvər"), Word("Cough", "سرفه", "kɔːf"),
                Word("Cold", "سرماخوردگی", "koʊld"), Word("Medicine", "دارو", "ˈmedɪsɪn"),
                Word("Pharmacy", "داروخانه", "ˈfɑːrməsi"), Word("Rest", "استراحت", "rest")
            ),
            grammarTitle = "Should / Shouldn't for Health",
            grammarExplanation = "توصیه‌های سلامتی:\n\n• You should rest. (باید استراحت کنی)\n• You shouldn't eat too much. (نباید زیاد بخوری)\n• You should see a doctor.",
            grammarExamples = listOf(
                "You should drink water.",
                "You shouldn't skip breakfast.",
                "You should take your medicine."
            ),
            conversation = Conversation("At the pharmacy", "در داروخانه", listOf(
                ConversationLine("A", "I have a bad headache.", "سردرد بدی دارم."),
                ConversationLine("B", "Do you have a fever?", "تب داری؟"),
                ConversationLine("A", "Yes, a little.", "بله، یه کم."),
                ConversationLine("B", "You should take this medicine.", "باید این دارو رو بخوری."),
                ConversationLine("A", "How often?", "هر چند وقت؟"),
                ConversationLine("B", "Three times a day after meals.", "روزی سه بار بعد از غذا.")
            )),
            storyTitle = "Feeling Sick",
            storyText = "Sara doesn't feel well today. She has a headache and a fever. She goes to the doctor. The doctor says she should rest and drink water. Sara stays in bed and takes her medicine. She feels better the next day.",
            quiz = listOf(
                QuizQuestion("معنی Fever چیست؟", listOf("سردرد", "تب", "سرفه", "دل‌درد"), 1),
                QuizQuestion("کدام درست است؟", listOf("You should rest.", "You should to rest.", "You should resting.", "Should you rest."), 0)
            )
        ),

        Lesson(
            id = "b12", unitNumber = 12, title = "Weekend Activities", titlePersian = "فعالیت‌های آخر هفته", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Go out", "بیرون رفتن", "ɡoʊ aʊt"), Word("Stay home", "خونه موندن", "steɪ hoʊm"),
                Word("Visit friends", "دیدن دوستان", "ˈvɪzɪt frendz"), Word("Play sports", "ورزش کردن", "pleɪ spɔːrts"),
                Word("Watch movies", "فیلم دیدن", "wɑːtʃ ˈmuːviz"), Word("Go shopping", "خرید رفتن", "ɡoʊ ˈʃɑːpɪŋ"),
                Word("Read books", "کتاب خواندن", "riːd bʊks"), Word("Relax", "استراحت کردن", "rɪˈlæks")
            ),
            grammarTitle = "Future with 'going to'",
            grammarExplanation = "برنامه‌های آینده:\n\nam/is/are + going to + verb\n\n• I'm going to visit my friends.\n• She's going to stay home.\n• They're going to play football.",
            grammarExamples = listOf(
                "What are you going to do this weekend?",
                "I'm going to visit my family.",
                "We're going to watch a movie."
            ),
            conversation = Conversation("Weekend plans", "برنامه آخر هفته", listOf(
                ConversationLine("A", "What are you going to do this weekend?", "این آخر هفته چیکار می‌کنی؟"),
                ConversationLine("B", "I'm going to visit my grandmother.", "قصد دارم مادربزرگم رو ببینم."),
                ConversationLine("A", "That's nice! What about Sunday?", "قشنگه! یکشنبه چطور؟"),
                ConversationLine("B", "I'm going to stay home and relax.", "می‌خوام خونه بمونم و استراحت کنم."),
                ConversationLine("A", "Sounds great. Have fun!", "عالی به نظر میاد. خوش بگذره!"),
                ConversationLine("B", "Thanks! You too.", "ممنون! تو هم همینطور.")
            )),
            storyTitle = "A Perfect Weekend",
            storyText = "Reza loves weekends. On Saturday, he's going to play football with his friends. On Sunday, he's going to visit his parents. In the evening, he's going to watch a movie. He's going to have a great weekend.",
            quiz = listOf(
                QuizQuestion("معنی Relax چیست؟", listOf("خسته شدن", "استراحت کردن", "کار کردن", "دویدن"), 1),
                QuizQuestion("کدام درست است؟", listOf("I going to stay.", "I'm going to stay.", "I'm go to stay.", "I going stay."), 1)
            )
        ),

        Lesson(
            id = "b13", unitNumber = 13, title = "Home and Neighborhood", titlePersian = "خانه و محله", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("House", "خانه", "haʊs"), Word("Apartment", "آپارتمان", "əˈpɑːrtmənt"),
                Word("Kitchen", "آشپزخانه", "ˈkɪtʃɪn"), Word("Bedroom", "اتاق خواب", "ˈbedruːm"),
                Word("Bathroom", "حمام", "ˈbæθruːm"), Word("Living room", "اتاق نشیمن", "ˈlɪvɪŋ ruːm"),
                Word("Garden", "باغ", "ˈɡɑːrdən"), Word("Balcony", "بالکن", "ˈbælkəni")
            ),
            grammarTitle = "Rooms and Furniture",
            grammarExplanation = "توصیف خانه:\n\n• There is a sofa in the living room.\n• There are two beds in the bedroom.\n• The kitchen has a fridge.",
            grammarExamples = listOf(
                "My apartment has two bedrooms.",
                "There is a big kitchen.",
                "The living room is very comfortable."
            ),
            conversation = Conversation("My home", "خانه من", listOf(
                ConversationLine("A", "Do you live in a house or apartment?", "خونه زندگی می‌کنی یا آپارتمان؟"),
                ConversationLine("B", "I live in an apartment.", "توی آپارتمان."),
                ConversationLine("A", "How many rooms?", "چند اتاق؟"),
                ConversationLine("B", "Three: a bedroom, a living room, and a kitchen.", "سه تا: یه اتاق خواب، یه نشیمن و یه آشپزخانه."),
                ConversationLine("A", "Do you have a balcony?", "بالکن داری؟"),
                ConversationLine("B", "Yes, a small one with flowers.", "بله، یه بالکن کوچیک با گل.")
            )),
            storyTitle = "My Dream House",
            storyText = "I want a big house in the future. It will have four bedrooms, a large kitchen, and a beautiful garden. There will be a big living room for my family. It will be my dream home.",
            quiz = listOf(
                QuizQuestion("معنی Kitchen چیست؟", listOf("اتاق خواب", "آشپزخانه", "حمام", "نشیمن"), 1),
                QuizQuestion("کدام درست است؟", listOf("There is two beds.", "There are two beds.", "There have two beds.", "There has two beds."), 1)
            )
        ),

        Lesson(
            id = "b14", unitNumber = 14, title = "Review", titlePersian = "مرور", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Remember", "به یاد آوردن", "rɪˈmembər"), Word("Practice", "تمرین", "ˈpræktɪs"),
                Word("Learn", "یاد گرفتن", "lɜːrn"), Word("Teach", "یاد دادن", "tiːtʃ"),
                Word("Understand", "فهمیدن", "ˌʌndərˈstænd"), Word("Speak", "صحبت کردن", "spiːk"),
                Word("Listen", "گوش دادن", "ˈlɪsən"), Word("Write", "نوشتن", "raɪt")
            ),
            grammarTitle = "Review of Fundamentals",
            grammarExplanation = "مرور مهم‌ترین ساختارها:\n\n• a/an + occupations\n• Adjectives\n• Plural nouns\n• Possessive 's\n• Time expressions\n• Where are you from?\n• Colors + Clothes\n• Daily routine\n• How much...?\n• Some / Any\n• Should / Shouldn't\n• Going to (future)",
            grammarExamples = listOf(
                "What do you do? — I'm a teacher.",
                "Where are you from? — I'm from Iran.",
                "How much is this? — It's 10 dollars.",
                "I'm going to study English."
            ),
            conversation = Conversation("Review conversation", "مکالمه مروری", listOf(
                ConversationLine("A", "Hello! How are you?", "سلام! حالت چطوره؟"),
                ConversationLine("B", "I'm fine, thanks. And you?", "خوبم، ممنون. تو چطور؟"),
                ConversationLine("A", "I'm great! What do you do?", "عالی‌ام! شغلت چیه؟"),
                ConversationLine("B", "I'm a teacher. What about you?", "معلمم. تو چطور؟"),
                ConversationLine("A", "I'm a student. I'm learning English.", "دانش‌آموزم. دارم انگلیسی یاد می‌گیرم."),
                ConversationLine("B", "That's great! Keep practicing!", "عالیه! به تمرین ادامه بده!")
            )),
            storyTitle = "A Great Start",
            storyText = "You finished the first level! You learned about names and occupations, describing people, places and things, family, events and times, cities and countries, clothes, daily life, shopping, food, health, weekend activities, and home. Now you can introduce yourself, describe people, talk about your routine, and much more. Congratulations!",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."), 1),
                QuizQuestion("معنی Daughter چیست؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1),
                QuizQuestion("کدام درست است؟", listOf("How much is this?", "How much this is?", "How many is this?", "How is this much?"), 0),
                QuizQuestion("معنی Relax چیست؟", listOf("خسته شدن", "استراحت کردن", "کار کردن", "دویدن"), 1)
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
            grammarExplanation = "have/has + past participle",
            grammarExamples = listOf(
                "I have lived here for ten years.",
                "She has visited many countries.",
                "They have finished their homework."
            ),
            conversation = Conversation("Travel", "سفر", listOf(
                ConversationLine("A", "Have you ever traveled abroad?", "خارج سفر کرده‌ای؟"),
                ConversationLine("B", "Yes, I've been to Japan.", "بله، ژاپن رفته‌ام."),
                ConversationLine("A", "What did you like?", "چی دوست داشتی؟"),
                ConversationLine("B", "The culture and food.", "فرهنگ و غذا.")
            )),
            storyTitle = "A Trip to Remember",
            storyText = "Last summer, Emma traveled to Japan. She has never seen such a beautiful culture.",
            quiz = listOf(
                QuizQuestion("معنی Diversity چیست؟", listOf("یکنواختی", "تنوع", "فرهنگ", "جامعه"), 1)
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
                "I have been using this app for a year.",
                "She has been working all morning.",
                "They have been developing software."
            ),
            conversation = Conversation("Technology", "تکنولوژی", listOf(
                ConversationLine("A", "Have you tried the new app?", "اپ جدید رو امتحان کردی؟"),
                ConversationLine("B", "Yes, I've been using it for a month.", "بله، یک ماهه استفاده می‌کنم."),
                ConversationLine("A", "Is it useful?", "مفیده؟"),
                ConversationLine("B", "It's amazing!", "عالیه!")
            )),
            storyTitle = "The Digital Age",
            storyText = "Technology has transformed our lives.",
            quiz = listOf(
                QuizQuestion("معنی Innovation چیست؟", listOf("تکرار", "نوآوری", "تخریب", "سکون"), 1)
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
                "The book was written by a famous author.",
                "English is spoken worldwide.",
                "The bridge was built in 1990."
            ),
            conversation = Conversation("Family values", "ارزش‌های خانوادگی", listOf(
                ConversationLine("A", "Family is most important.", "خانواده مهم‌ترینه."),
                ConversationLine("B", "Bond built on trust.", "پیوند بر پایه اعتماد."),
                ConversationLine("A", "Quality time matters.", "وقت باکیفیت مهمه."),
                ConversationLine("B", "Money can't buy that.", "پول نمی‌تونه بخره.")
            )),
            storyTitle = "Value of Friendship",
            storyText = "True friendship is built on trust and loyalty.",
            quiz = listOf(
                QuizQuestion("معنی Supportive چیست؟", listOf("بی‌تفاوت", "حمایت‌گر", "خشن", "تنها"), 1)
            )
        )
    )

    fun getLessonsByLevel(level: Level): List<Lesson> =
        lessons.filter { it.level == level }

    fun getLessonById(id: String): Lesson? =
        lessons.firstOrNull { it.id == id }
}