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
            grammarExplanation = "برای شغل‌ها از a یا an استفاده می‌کنیم.\n\n• a قبل از حرف بی‌صدا: a teacher\n• an قبل از حرف صدادار: an architect\n\nسوال: What do you do?",
            grammarExamples = listOf(
                "What do you do? — I'm a teacher.",
                "What does she do? — She's an architect.",
                "What does he do? — He's a doctor."
            ),
            conversation = Conversation("Conversation Model", "مدل مکالمه", listOf(
                ConversationLine("A", "What do you do?", "شغلت چیه؟"),
                ConversationLine("B", "I'm an architect. And you?", "من معمارم. تو چطور؟"),
                ConversationLine("A", "I'm a banker.", "من بانکدارم."),
                ConversationLine("B", "Nice to meet you.", "از آشنایی با تو خوشحالم."),
                ConversationLine("A", "Nice to meet you too.", "من هم خوشحالم.")
            )),
            storyTitle = "Meeting Your Classmates",
            storyText = "In the classroom, students introduce themselves. Marie is a teacher. Tom is an architect. Laura is a doctor.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I'm a architect.", "I'm an architect.", "I'm architect.", "I am architect a."), 1),
                QuizQuestion("معنی \"What do you do?\" چیست؟", listOf("کجایی؟", "چیکار می‌کنی؟", "شغلت چیه؟", "چطوری؟"), 2),
                QuizQuestion("کدام درست است؟", listOf("She's a engineer.", "She's an engineer.", "She's engineer.", "She engineer."), 1)
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
            grammarExplanation = "صفت‌ها برای توصیف:\n\nSubject + be + adjective",
            grammarExamples = listOf("She is tall and nice.", "He is young and friendly.", "They are funny."),
            conversation = Conversation("Describing people", "توصیف افراد", listOf(
                ConversationLine("A", "Who is your best friend?", "بهترین دوستت کیه؟"),
                ConversationLine("B", "Her name is Sara.", "اسمش ساراست."),
                ConversationLine("A", "What is she like?", "چه جوریه؟"),
                ConversationLine("B", "She is tall and very friendly.", "قدبلنده و خیلی خوش‌برخورد."),
                ConversationLine("A", "Is she funny?", "بامزه‌ست؟"),
                ConversationLine("B", "Yes, she is.", "بله.")
            )),
            storyTitle = "My Best Friend",
            storyText = "My best friend is Ali. He is tall and funny. He is also very friendly.",
            quiz = listOf(
                QuizQuestion("معنی Tall چیست؟", listOf("کوتاه", "قدبلند", "پیر", "جوان"), 1),
                QuizQuestion("کدام درست است؟", listOf("She tall.", "She is tall.", "She are tall.", "Tall she."), 1)
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
            grammarExplanation = "جمع اسم‌ها:\n\n• + s: book → books\n• + es: box → boxes\n• بی‌قاعده: man → men",
            grammarExamples = listOf("There are two books.", "The city has many streets.", "The children are playing."),
            conversation = Conversation("Places", "مکان‌ها", listOf(
                ConversationLine("A", "Where are you from?", "اهل کجایی؟"),
                ConversationLine("B", "I'm from Tehran.", "اهل تهرام."),
                ConversationLine("A", "Is it beautiful?", "زیباست؟"),
                ConversationLine("B", "Yes, there are many parks.", "بله، پارک‌های زیادی داره.")
            )),
            storyTitle = "My City",
            storyText = "Tehran is a big city in Iran. There are many streets and parks.",
            quiz = listOf(
                QuizQuestion("جمع book چیست؟", listOf("bookes", "books", "book", "bookies"), 1),
                QuizQuestion("جمع child چیست؟", listOf("childs", "childes", "children", "childrens"), 2)
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
            grammarExplanation = "نشان دادن مالکیت:\n\nAli's book = کتاب علی\nMy father's car",
            grammarExamples = listOf("This is Ali's book.", "My father's car is red.", "The students' classroom is big."),
            conversation = Conversation("My family", "خانواده من", listOf(
                ConversationLine("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
                ConversationLine("B", "Yes, two brothers and one sister.", "بله، دو برادر و یه خواهر."),
                ConversationLine("A", "What does your father do?", "پدرت چیکار می‌کنه؟"),
                ConversationLine("B", "He's a doctor.", "دکتره.")
            )),
            storyTitle = "My Family",
            storyText = "My family is not very big. There are five people.",
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
            grammarExplanation = "at + ساعت\non + روز\nin + ماه/سال",
            grammarExamples = listOf("I wake up in the morning.", "The meeting is on Monday.", "We eat dinner at 7 PM."),
            conversation = Conversation("What time?", "چه ساعتی؟", listOf(
                ConversationLine("A", "What time is the meeting?", "جلسه چه ساعتیه؟"),
                ConversationLine("B", "It's at 3 PM.", "ساعت ۳ بعدازظهر."),
                ConversationLine("A", "On which day?", "چه روزی؟"),
                ConversationLine("B", "On Tuesday.", "روز سه‌شنبه.")
            )),
            storyTitle = "A Busy Week",
            storyText = "Ali has a busy week. On Monday, he has a meeting.",
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
            grammarExplanation = "Where are you from? — I'm from Iran.\nWhat nationality are you? — I'm Iranian.",
            grammarExamples = listOf("Where is she from?", "What language do they speak?", "She's from France."),
            conversation = Conversation("Countries", "کشورها", listOf(
                ConversationLine("A", "Where are you from?", "اهل کجایی؟"),
                ConversationLine("B", "I'm from Japan.", "اهل ژاپنم."),
                ConversationLine("A", "What language do you speak?", "چه زبانی صحبت می‌کنی؟"),
                ConversationLine("B", "I speak Japanese and English.", "ژاپنی و انگلیسی.")
            )),
            storyTitle = "Around the World",
            storyText = "There are 195 countries in the world.",
            quiz = listOf(
                QuizQuestion("معنی Capital چیست؟", listOf("شهر", "پایتخت", "کشور", "استان"), 1),
                QuizQuestion("کدام درست است؟", listOf("Where you from?", "Where are you from?", "From where you?", "You from?"), 1)
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
            grammarExplanation = "ترتیب: رنگ + اسم\n\na red shirt\nblue pants",
            grammarExamples = listOf("She is wearing a red dress.", "He has a blue jacket.", "My shoes are black and white."),
            conversation = Conversation("What are you wearing?", "چی پوشیدی؟", listOf(
                ConversationLine("A", "What are you wearing?", "چی پوشیدی؟"),
                ConversationLine("B", "A blue shirt and black pants.", "پیراهن آبی و شلوار مشکی."),
                ConversationLine("A", "Nice shoes!", "کفش‌های قشنگی!"),
                ConversationLine("B", "Thank you!", "ممنون!")
            )),
            storyTitle = "Shopping for Clothes",
            storyText = "Sara goes to the mall. She wants to buy a new dress.",
            quiz = listOf(
                QuizQuestion("معنی Jacket چیست؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                QuizQuestion("کدام درست است؟", listOf("a shirt blue", "blue a shirt", "a blue shirt", "shirt blue"), 2)
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
            grammarExplanation = "افعال روتین:\n\nI wake up at 7. I get dressed. I have breakfast.",
            grammarExamples = listOf("I wake up at 7 AM every day.", "She gets dressed after breakfast.", "They go to bed late."),
            conversation = Conversation("My daily routine", "روتین روزانه من", listOf(
                ConversationLine("A", "What time do you wake up?", "ساعت چند بیدار می‌شی؟"),
                ConversationLine("B", "At 6:30.", "۶:۳۰."),
                ConversationLine("A", "When do you go to work?", "کِی می‌ری سر کار؟"),
                ConversationLine("B", "At 8 o'clock.", "ساعت ۸.")
            )),
            storyTitle = "A Typical Day",
            storyText = "This is my daily routine. I wake up at 6:30.",
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
            grammarExplanation = "How much is this? — It's 10 dollars.\nHow much are these? — They're 20 dollars.",
            grammarExamples = listOf("How much is this shirt?", "How much are these shoes?", "Do you accept credit cards?"),
            conversation = Conversation("At the store", "در فروشگاه", listOf(
                ConversationLine("A", "How much is this jacket?", "این کاپشن چنده؟"),
                ConversationLine("B", "It's sixty dollars.", "شصت دلار."),
                ConversationLine("A", "Any discount?", "تخفیف دارید؟"),
                ConversationLine("B", "Yes, 20% off today.", "بله، امروز ۲۰٪.")
            )),
            storyTitle = "Buying a Gift",
            storyText = "It's Maryam's mother's birthday.",
            quiz = listOf(
                QuizQuestion("معنی Discount چیست؟", listOf("افزایش", "تخفیف", "رسید", "مالیات"), 1),
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
            grammarExplanation = "some در جملات مثبت\nany در منفی و سوال",
            grammarExamples = listOf("I have some cheese.", "Do you have any eggs?", "I don't have any milk."),
            conversation = Conversation("At the supermarket", "در سوپرمارکت", listOf(
                ConversationLine("A", "Do we have any bread?", "نان داریم؟"),
                ConversationLine("B", "No, we need to buy some.", "نه، باید بخریم."),
                ConversationLine("A", "What about eggs?", "تخم‌مرغ چطور؟"),
                ConversationLine("B", "We have some eggs.", "چند تا داریم.")
            )),
            storyTitle = "Shopping for Dinner",
            storyText = "Ali wants to make dinner. He checks the fridge.",
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
            grammarTitle = "Should / Shouldn't",
            grammarExplanation = "You should rest.\nYou shouldn't eat too much.",
            grammarExamples = listOf("You should drink water.", "You shouldn't skip breakfast.", "You should take your medicine."),
            conversation = Conversation("At the pharmacy", "در داروخانه", listOf(
                ConversationLine("A", "I have a headache.", "سردرد دارم."),
                ConversationLine("B", "Do you have a fever?", "تب داری؟"),
                ConversationLine("A", "Yes, a little.", "بله، یه کم."),
                ConversationLine("B", "Take this medicine.", "این دارو رو بخور.")
            )),
            storyTitle = "Feeling Sick",
            storyText = "Sara doesn't feel well today.",
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
            grammarTitle = "Going to (Future)",
            grammarExplanation = "am/is/are + going to + verb",
            grammarExamples = listOf("What are you going to do?", "I'm going to visit my family.", "We're going to watch a movie."),
            conversation = Conversation("Weekend plans", "برنامه آخر هفته", listOf(
                ConversationLine("A", "What are you going to do?", "چیکار می‌کنی؟"),
                ConversationLine("B", "I'm going to visit grandma.", "مادربزرگم رو می‌بینم."),
                ConversationLine("A", "What about Sunday?", "یکشنبه چطور؟"),
                ConversationLine("B", "I'm going to relax.", "استراحت می‌کنم.")
            )),
            storyTitle = "A Perfect Weekend",
            storyText = "Reza loves weekends.",
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
            grammarTitle = "There is / There are",
            grammarExplanation = "There is a sofa in the living room.\nThere are two beds.",
            grammarExamples = listOf("My apartment has two bedrooms.", "There is a big kitchen.", "The living room is comfortable."),
            conversation = Conversation("My home", "خانه من", listOf(
                ConversationLine("A", "House or apartment?", "خونه یا آپارتمان؟"),
                ConversationLine("B", "An apartment.", "آپارتمان."),
                ConversationLine("A", "How many rooms?", "چند اتاق؟"),
                ConversationLine("B", "Three.", "سه تا.")
            )),
            storyTitle = "My Dream House",
            storyText = "I want a big house in the future.",
            quiz = listOf(
                QuizQuestion("معنی Kitchen چیست؟", listOf("اتاق خواب", "آشپزخانه", "حمام", "نشیمن"), 1),
                QuizQuestion("کدام درست است؟", listOf("There is two beds.", "There are two beds.", "There have two beds.", "There has two."), 1)
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
            grammarExplanation = "مرور مهم‌ترین ساختارهای Beginner",
            grammarExamples = listOf("What do you do? — I'm a teacher.", "Where are you from? — I'm from Iran.", "How much is this? — It's 10 dollars."),
            conversation = Conversation("Review", "مرور", listOf(
                ConversationLine("A", "Hello! How are you?", "سلام! حالت چطوره؟"),
                ConversationLine("B", "I'm fine, thanks.", "خوبم، ممنون."),
                ConversationLine("A", "What do you do?", "شغلت چیه؟"),
                ConversationLine("B", "I'm a teacher.", "معلمم.")
            )),
            storyTitle = "A Great Start",
            storyText = "You finished the first level! Congratulations!",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."), 1),
                QuizQuestion("معنی Daughter چیست؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1)
            )
        ),

        // ==================== INTERMEDIATE - TOP NOTCH 1 (10 Lessons) ====================
        Lesson(
            id = "i1", unitNumber = 1, title = "Getting Acquainted", titlePersian = "آشنایی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Introduce", "معرفی کردن", "ˌɪntrəˈduːs"),
                Word("Neighbor", "همسایه", "ˈneɪbər"),
                Word("Classmate", "همکلاسی", "ˈklæsmeɪt"),
                Word("Colleague", "همکار", "ˈkɑːliːɡ"),
                Word("Acquaintance", "آشنا", "əˈkweɪntəns"),
                Word("Nickname", "اسم مستعار", "ˈnɪkneɪm"),
                Word("Last name", "نام خانوادگی", "læst neɪm"),
                Word("First name", "نام کوچک", "fɜːrst neɪm")
            ),
            grammarTitle = "Present Perfect with 'How long'",
            grammarExplanation = "پرسیدن مدت زمان آشنایی:\n\nHow long have you known him?\nI've known him for two years.\nI've known her since 2020.\n\n• for + مدت زمان (for 2 years)\n• since + نقطه شروع (since 2020)",
            grammarExamples = listOf(
                "How long have you known your best friend?",
                "I've known him for five years.",
                "She's been my neighbor since 2018.",
                "We've been classmates for one year."
            ),
            conversation = Conversation("Meeting a new neighbor", "آشنایی با همسایه جدید", listOf(
                ConversationLine("A", "Hi! Are you new here?", "سلام! تازه اومدی؟"),
                ConversationLine("B", "Yes, I just moved in last week.", "بله، هفته پیش اومدم."),
                ConversationLine("A", "Welcome! I'm Sarah. I live next door.", "خوش اومدی! من سارام. کنارت زندگی می‌کنم."),
                ConversationLine("B", "Nice to meet you, Sarah. I'm David.", "از آشنایی خوشحالم سارا. من دیویدم."),
                ConversationLine("A", "How long have you lived in this city?", "چقدره توی این شهر زندگی می‌کنی؟"),
                ConversationLine("B", "I've lived here for just a few days.", "فقط چند روزه که اینجام.")
            )),
            storyTitle = "An Old Friendship",
            storyText = "Tom and Alex have been friends for twenty years. They met in elementary school. Tom has known Alex's family since childhood. They still see each other every weekend.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I've known him since 2 years.", "I've known him for 2 years.", "I know him since 2 years.", "I knowing him for 2 years."), 1),
                QuizQuestion("معنی Colleague چیست؟", listOf("همکلاسی", "همسایه", "همکار", "دوست"), 2),
                QuizQuestion("کدام درست است؟", listOf("How long you have known him?", "How long have you known him?", "How long do you know him?", "How long you know him?"), 1)
            )
        ),

        Lesson(
            id = "i2", unitNumber = 2, title = "Going Shopping", titlePersian = "خرید کردن", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Receipt", "رسید", "rɪˈsiːt"),
                Word("Refund", "بازپرداخت", "ˈriːfʌnd"),
                Word("Exchange", "تعویض", "ɪksˈtʃeɪndʒ"),
                Word("Warranty", "گارانتی", "ˈwɔːrənti"),
                Word("Sale", "حراج", "seɪl"),
                Word("Bargain", "معامله خوب", "ˈbɑːrɡɪn"),
                Word("Fitting room", "اتاق پرو", "ˈfɪtɪŋ ruːm"),
                Word("Queue", "صف", "kjuː")
            ),
            grammarTitle = "Comparative and Superlative",
            grammarExplanation = "مقایسه:\n\nصفت کوتاه: cheap → cheaper → the cheapest\nصفت بلند: expensive → more expensive → the most expensive\n\nبی‌قاعده: good → better → the best",
            grammarExamples = listOf(
                "This shirt is cheaper than that one.",
                "This is the most expensive jacket in the store.",
                "She's the best customer in this shop."
            ),
            conversation = Conversation("Exchanging a product", "تعویض کالا", listOf(
                ConversationLine("A", "Hi, I'd like to exchange this shirt.", "سلام، می‌خوام این پیراهن رو تعویض کنم."),
                ConversationLine("B", "Sure, do you have the receipt?", "حتماً، رسید داری؟"),
                ConversationLine("A", "Yes, here it is. It's too small.", "بله، بفرمایید. خیلی کوچیکه."),
                ConversationLine("B", "Would you like a larger size?", "سایز بزرگ‌تر می‌خوای؟"),
                ConversationLine("A", "Yes, please. Do you have it in blue?", "بله لطفاً. آبی‌اش رو دارید؟"),
                ConversationLine("B", "Let me check. Please wait a moment.", "بذار چک کنم. یه لحظه صبر کن.")
            )),
            storyTitle = "The Best Bargain",
            storyText = "Last Saturday, Maria went shopping. She compared prices at three different stores. The first store was expensive. The second was cheaper. But the third had the best bargains. She bought a beautiful coat for half the price.",
            quiz = listOf(
                QuizQuestion("معنی Refund چیست؟", listOf("تعویض", "بازپرداخت", "تخفیف", "گارانتی"), 1),
                QuizQuestion("کدام درست است؟", listOf("This is more cheap.", "This is cheaper.", "This is cheapest.", "This is the cheap."), 1),
                QuizQuestion("معنی Queue چیست؟", listOf("کفش", "صف", "پرونده", "سوال"), 1)
            )
        ),

        Lesson(
            id = "i3", unitNumber = 3, title = "Planning a Trip", titlePersian = "برنامه‌ریزی سفر", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Reservation", "رزرو", "ˌrezərˈveɪʃən"),
                Word("Itinerary", "برنامه سفر", "aɪˈtɪnəreri"),
                Word("Destination", "مقصد", "ˌdestɪˈneɪʃən"),
                Word("Departure", "حرکت", "dɪˈpɑːrtʃər"),
                Word("Arrival", "ورود", "əˈraɪvəl"),
                Word("Luggage", "چمدان", "ˈlʌɡɪdʒ"),
                Word("Passport", "پاسپورت", "ˈpæspɔːrt"),
                Word("Boarding pass", "کارت پرواز", "ˈbɔːrdɪŋ pæs")
            ),
            grammarTitle = "Future: Will vs Going to",
            grammarExplanation = "Will: تصمیم لحظه‌ای / پیش‌بینی\nI'll call you later.\n\nGoing to: برنامه قبلی\nI'm going to visit Paris next month.",
            grammarExamples = listOf(
                "I'm going to travel to Turkey next summer.",
                "We'll book the hotel tomorrow.",
                "She's going to visit her family in Isfahan."
            ),
            conversation = Conversation("At the travel agency", "در آژانس مسافرتی", listOf(
                ConversationLine("A", "Where are you going to travel?", "کجا می‌خوای سفر کنی؟"),
                ConversationLine("B", "I'm going to visit Italy next month.", "می‌خوام ماه بعد ایتالیا برم."),
                ConversationLine("A", "How long will you stay?", "چقدر می‌مونی؟"),
                ConversationLine("B", "I'll stay for two weeks.", "دو هفته می‌مونم."),
                ConversationLine("A", "Have you made a reservation?", "رزرو کردی؟"),
                ConversationLine("B", "Not yet. I'll do it tomorrow.", "نه هنوز. فردا می‌کنم.")
            )),
            storyTitle = "The Perfect Trip",
            storyText = "John is planning a trip to Spain. He's going to visit Madrid and Barcelona. He'll stay for ten days. He's already booked his hotel and made an itinerary. He can't wait to explore the beautiful country.",
            quiz = listOf(
                QuizQuestion("معنی Luggage چیست؟", listOf("پاسپورت", "چمدان", "بلیط", "مقصد"), 1),
                QuizQuestion("کدام برای برنامه قبلی درست است؟", listOf("I will travel tomorrow.", "I'm going to travel tomorrow.", "I travel tomorrow.", "I traveling tomorrow."), 1),
                QuizQuestion("معنی Destination چیست؟", listOf("مقصد", "حرکت", "ورود", "چمدان"), 0)
            )
        ),

        Lesson(
            id = "i4", unitNumber = 4, title = "Food and Restaurants", titlePersian = "غذا و رستوران", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Appetizer", "پیش‌غذا", "ˈæpɪtaɪzər"),
                Word("Main course", "غذای اصلی", "meɪn kɔːrs"),
                Word("Dessert", "دسر", "dɪˈzɜːrt"),
                Word("Menu", "منو", "ˈmenjuː"),
                Word("Waiter", "گارسون", "ˈweɪtər"),
                Word("Bill", "صورت‌حساب", "bɪl"),
                Word("Tip", "انعام", "tɪp"),
                Word("Reservation", "رزرو", "ˌrezərˈveɪʃən")
            ),
            grammarTitle = "Would like + Infinitive",
            grammarExplanation = "درخواست مؤدبانه:\n\nI would like (I'd like) a coffee.\nWould you like some dessert?\n\nمخفف: I'd, you'd, he'd, she'd",
            grammarExamples = listOf(
                "I'd like to make a reservation for two.",
                "Would you like to see the menu?",
                "We'd like the bill, please."
            ),
            conversation = Conversation("At a fancy restaurant", "در رستوران شیک", listOf(
                ConversationLine("A", "Good evening. Do you have a reservation?", "عصر بخیر. رزرو دارید؟"),
                ConversationLine("B", "Yes, I'd like a table for two.", "بله، میزی برای دو نفر می‌خوام."),
                ConversationLine("A", "Right this way. Would you like to see the menu?", "بفرمایید. منو رو می‌خواید ببینید؟"),
                ConversationLine("B", "Yes, please. What do you recommend?", "بله لطفاً. چی پیشنهاد می‌کنید؟"),
                ConversationLine("A", "The grilled chicken is excellent tonight.", "مرغ گریل امشب عالیه."),
                ConversationLine("B", "Sounds great. We'll have that, please.", "خوبه. همون رو می‌خوایم لطفاً.")
            )),
            storyTitle = "A Memorable Dinner",
            storyText = "Last Friday, Anna and her friends went to an Italian restaurant. They ordered pasta and pizza as main courses. The appetizers were delicious. For dessert, they had tiramisu. The waiter was very friendly. They left a generous tip.",
            quiz = listOf(
                QuizQuestion("معنی Appetizer چیست؟", listOf("غذای اصلی", "دسر", "پیش‌غذا", "نوشیدنی"), 2),
                QuizQuestion("کدام مؤدبانه‌تر است؟", listOf("I want a coffee.", "I'd like a coffee.", "Give me coffee.", "Coffee!"), 1)
            )
        ),

        Lesson(
            id = "i5", unitNumber = 5, title = "Around Town", titlePersian = "گشت در شهر", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Downtown", "مرکز شهر", "ˌdaʊnˈtaʊn"),
                Word("Suburb", "حومه شهر", "ˈsʌbɜːrb"),
                Word("Intersection", "چهارراه", "ˌɪntərˈsekʃən"),
                Word("Traffic light", "چراغ راهنما", "ˈtræfɪk laɪt"),
                Word("Crosswalk", "خط عابر پیاده", "ˈkrɔːswɔːk"),
                Word("Sidewalk", "پیاده‌رو", "ˈsaɪdwɔːk"),
                Word("Landmark", "نقطه شاخص", "ˈlændmɑːrk"),
                Word("Neighborhood", "محله", "ˈneɪbərhʊd")
            ),
            grammarTitle = "Imperatives for Directions",
            grammarExplanation = "دستور برای مسیر دادن:\n\nTurn left / Turn right\nGo straight\nGo past the bank\nIt's on your left / right",
            grammarExamples = listOf(
                "Go straight for two blocks.",
                "Turn left at the traffic light.",
                "The museum is on your right."
            ),
            conversation = Conversation("Asking for directions", "پرسیدن مسیر", listOf(
                ConversationLine("A", "Excuse me, how do I get to the museum?", "ببخشید، چطور به موزه برم؟"),
                ConversationLine("B", "Go straight for two blocks.", "دو بلوک مستقیم برو."),
                ConversationLine("A", "Then what?", "بعدش چی؟"),
                ConversationLine("B", "Turn left at the traffic light.", "سر چراغ راهنما بپیچ چپ."),
                ConversationLine("A", "Is it far?", "دوره؟"),
                ConversationLine("B", "No, about five minutes on foot.", "نه، حدود ۵ دقیقه پیاده.")
            )),
            storyTitle = "Lost in the City",
            storyText = "Sarah was new in the city. She got lost while looking for a famous landmark. She asked a friendly stranger for directions. He told her to go straight and turn right at the intersection. After ten minutes, she found the place.",
            quiz = listOf(
                QuizQuestion("معنی Intersection چیست؟", listOf("پیاده‌رو", "چهارراه", "خیابان", "میدان"), 1),
                QuizQuestion("کدام درست است؟", listOf("Turn in the left.", "Turn left.", "Turn on left.", "Left turn on."), 1)
            )
        ),

        Lesson(
            id = "i6", unitNumber = 6, title = "Shopping for Clothes", titlePersian = "خرید لباس", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Fit", "اندازه بودن", "fɪt"),
                Word("Suit", "مناسب بودن", "suːt"),
                Word("Match", "هماهنگ بودن", "mætʃ"),
                Word("Trend", "مد روز", "trend"),
                Word("Style", "سبک", "staɪl"),
                Word("Pattern", "طرح", "ˈpætərn"),
                Word("Fabric", "پارچه", "ˈfæbrɪk"),
                Word("Accessories", "اکسسوری", "əkˈsesəriz")
            ),
            grammarTitle = "Too / Enough",
            grammarExplanation = "too + صفت = خیلی زیاد (منفی)\nenough + اسم = کافی\n\nThis shirt is too small.\nI don't have enough money.",
            grammarExamples = listOf(
                "This dress is too expensive.",
                "These shoes are too tight.",
                "I don't have enough time to shop."
            ),
            conversation = Conversation("At the fitting room", "در اتاق پرو", listOf(
                ConversationLine("A", "How does it fit?", "چطور اندازه‌ست؟"),
                ConversationLine("B", "It's a bit too tight. Do you have a larger size?", "یه کم تنگه. سایز بزرگ‌تر دارید؟"),
                ConversationLine("A", "Sure, let me get it for you.", "حتماً، بذار بیارم."),
                ConversationLine("B", "Also, this color doesn't suit me.", "رنگش هم بهم نمیاد."),
                ConversationLine("A", "Would you prefer it in black?", "مشکی رو ترجیح می‌دی؟"),
                ConversationLine("B", "Yes, black matches everything.", "بله، مشکی با همه چی هماهنگه.")
            )),
            storyTitle = "The Perfect Outfit",
            storyText = "It was Mary's first day at her new job. She wanted to look professional. She tried on many outfits but none of them fit properly. Finally, she found a dark blue suit that matched her style. It was perfect for the occasion.",
            quiz = listOf(
                QuizQuestion("معنی Fit چیست؟", listOf("طرح", "اندازه بودن", "پارچه", "مد"), 1),
                QuizQuestion("کدام درست است؟", listOf("This shirt is too small.", "This shirt is small too.", "This shirt is very too small.", "This shirt is much small."), 0)
            )
        ),

        Lesson(
            id = "i7", unitNumber = 7, title = "Having Fun", titlePersian = "تفریح", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Entertainment", "سرگرمی", "ˌentərˈteɪnmənt"),
                Word("Performance", "اجرا", "pərˈfɔːrməns"),
                Word("Concert", "کنسرت", "ˈkɑːnsərt"),
                Word("Audience", "تماشاگران", "ˈɔːdiəns"),
                Word("Ticket", "بلیط", "ˈtɪkɪt"),
                Word("Amusement park", "شهربازی", "əˈmjuːzmənt pɑːrk"),
                Word("Enjoyable", "لذت‌بخش", "ɪnˈdʒɔɪəbəl"),
                Word("Boring", "خسته‌کننده", "ˈbɔːrɪŋ")
            ),
            grammarTitle = "Gerunds after Prepositions",
            grammarExplanation = "بعد از حرف اضافه، فعل + ing می‌گیرد:\n\ninterested in learning\nGood at singing\nTired of waiting\nThink about going",
            grammarExamples = listOf(
                "I'm interested in watching movies.",
                "She's good at playing the piano.",
                "We're thinking about going to the concert."
            ),
            conversation = Conversation("Planning entertainment", "برنامه‌ریزی تفریح", listOf(
                ConversationLine("A", "What do you do for fun?", "برای تفریح چیکار می‌کنی؟"),
                ConversationLine("B", "I'm interested in watching theater performances.", "به دیدن نمایش‌های تئاتر علاقه دارم."),
                ConversationLine("A", "Really? I'm good at singing, but I hate watching plays.", "واقعاً؟ من توی خواندن خوبم، ولی از دیدن نمایش متنفرم."),
                ConversationLine("B", "That's funny! What about concerts?", "جالبه! کنسرت چطور؟"),
                ConversationLine("A", "I love going to concerts. They're never boring.", "عاشق رفتن به کنسرتم. هرگز خسته‌کننده نیستن."),
                ConversationLine("B", "Great! There's a concert this weekend.", "عالیه! این آخر هفته یه کنسرت هست.")
            )),
            storyTitle = "A Night at the Theater",
            storyText = "Last Saturday, David and his friends went to the theater. They watched a comedy performance. The audience laughed all night. After the show, they discussed how enjoyable it was. They decided to go again next month.",
            quiz = listOf(
                QuizQuestion("معنی Audience چیست؟", listOf("بازیگر", "تماشاگران", "کارگردان", "نویسنده"), 1),
                QuizQuestion("کدام درست است؟", listOf("I'm interested in watch movies.", "I'm interested in watching movies.", "I'm interested to watching.", "I'm interested watching."), 1)
            )
        ),

        Lesson(
            id = "i8", unitNumber = 8, title = "Health Matters", titlePersian = "مسائل سلامتی", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Symptom", "نشانه", "ˈsɪmptəm"),
                Word("Prescription", "نسخه", "prɪˈskrɪpʃən"),
                Word("Appointment", "قرار ملاقات", "əˈpɔɪntmənt"),
                Word("Emergency", "اورژانس", "ɪˈmɜːrdʒənsi"),
                Word("Allergy", "حساسیت", "ˈælərdʒi"),
                Word("Injury", "آسیب", "ˈɪndʒəri"),
                Word("Treatment", "درمان", "ˈtriːtmənt"),
                Word("Recovery", "بهبودی", "rɪˈkʌvəri")
            ),
            grammarTitle = "Should have / Could have",
            grammarExplanation = "توصیه در گذشته:\n\nShould have + p.p. = باید (ولی نکردی)\nCould have + p.p. = می‌توانستی (ولی نکردی)\n\nYou should have seen a doctor earlier.\nYou could have avoided this problem.",
            grammarExamples = listOf(
                "You should have taken your medicine.",
                "She could have gone to the hospital earlier.",
                "I should have made an appointment sooner."
            ),
            conversation = Conversation("At the doctor's office", "در مطب دکتر", listOf(
                ConversationLine("A", "What are your symptoms?", "علائمت چیه؟"),
                ConversationLine("B", "I have a bad cough and a fever.", "سرفه شدید و تب دارم."),
                ConversationLine("A", "How long have you had these symptoms?", "چقدره این علائم رو داری؟"),
                ConversationLine("B", "For about a week.", "حدود یه هفته."),
                ConversationLine("A", "You should have come sooner.", "باید زودتر می‌اومدی."),
                ConversationLine("B", "You're right. I didn't think it was serious.", "حق داری. فکر نمی‌کردم جدی باشه.")
            )),
            storyTitle = "A Lesson Learned",
            storyText = "James ignored his symptoms for two weeks. He thought they would go away. But his condition got worse. When he finally saw a doctor, he was told he should have come sooner. The doctor prescribed medicine, and James made a full recovery.",
            quiz = listOf(
                QuizQuestion("معنی Prescription چیست؟", listOf("نسخه", "قرار", "درمان", "علائم"), 0),
                QuizQuestion("کدام درست است؟", listOf("You should saw a doctor.", "You should have seen a doctor.", "You should have saw a doctor.", "You should seen a doctor."), 1)
            )
        ),

        Lesson(
            id = "i9", unitNumber = 9, title = "Home and Away", titlePersian = "خانه و سفر", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Rent", "اجاره", "rent"),
                Word("Lease", "قرارداد اجاره", "liːs"),
                Word("Landlord", "صاحب‌خانه", "ˈlændlɔːrd"),
                Word("Furnished", "مبله", "ˈfɜːrnɪʃt"),
                Word("Utilities", "قبض‌های خانه", "juːˈtɪlətiz"),
                Word("Deposit", "ودیعه", "dɪˈpɑːzɪt"),
                Word("Roommate", "هم‌اتاقی", "ˈruːmmeɪt"),
                Word("Move in", "اسباب‌کشی کردن", "muːv ɪn")
            ),
            grammarTitle = "Present Perfect vs Past Simple",
            grammarExplanation = "Past Simple: زمان مشخص\nI moved to Tehran in 2020.\n\nPresent Perfect: زمان نامشخص\nI have lived in three cities.",
            grammarExamples = listOf(
                "I moved here last year.",
                "I've lived in this apartment for two years.",
                "When did you move in?"
            ),
            conversation = Conversation("Looking for an apartment", "دنبال آپارتمان", listOf(
                ConversationLine("A", "Are you looking for an apartment?", "دنبال آپارتمان می‌گردی؟"),
                ConversationLine("B", "Yes, I need a furnished one.", "بله، مبله می‌خوام."),
                ConversationLine("A", "How long have you been searching?", "چقدره که داری می‌گردی؟"),
                ConversationLine("B", "For about a month.", "حدود یه ماه."),
                ConversationLine("A", "I moved into my new place last week.", "من هفته پیش اسباب‌کشی کردم."),
                ConversationLine("B", "Lucky you! Was it expensive?", "خوش به حالت! گرون بود؟")
            )),
            storyTitle = "A New Home",
            storyText = "Elena recently moved to a new city for work. She found a furnished apartment near her office. The rent was reasonable, but she had to pay a large deposit. She loves her new home. She has already made friends with her neighbors.",
            quiz = listOf(
                QuizQuestion("معنی Landlord چیست؟", listOf("همسایه", "صاحب‌خانه", "هم‌اتاقی", "مستأجر"), 1),
                QuizQuestion("کدام درست است؟", listOf("I've moved here in 2020.", "I moved here in 2020.", "I have moved here in 2020.", "I moving here 2020."), 1)
            )
        ),

        Lesson(
            id = "i10", unitNumber = 10, title = "Getting Along", titlePersian = "کنار آمدن", level = Level.INTERMEDIATE,
            vocabulary = listOf(
                Word("Argue", "بحث کردن", "ˈɑːrɡjuː"),
                Word("Agree", "موافق بودن", "əˈɡriː"),
                Word("Disagree", "مخالف بودن", "ˌdɪsəˈɡriː"),
                Word("Compromise", "سازش کردن", "ˈkɑːmprəmaɪz"),
                Word("Apologize", "عذرخواهی کردن", "əˈpɑːlədʒaɪz"),
                Word("Forgive", "بخشیدن", "fərˈɡɪv"),
                Word("Get along", "کنار آمدن", "ɡet əˈlɔːŋ"),
                Word("Misunderstanding", "سوءتفاهم", "ˌmɪsʌndərˈstændɪŋ")
            ),
            grammarTitle = "Reported Speech with Say and Tell",
            grammarExplanation = "Say + (that) + جمله\nShe said she was tired.\n\nTell + شخص + (that) + جمله\nShe told me she was tired.",
            grammarExamples = listOf(
                "He said he didn't agree with me.",
                "She told me she was sorry.",
                "They said they would compromise."
            ),
            conversation = Conversation("Resolving a disagreement", "حل اختلاف", listOf(
                ConversationLine("A", "I'm upset about what happened yesterday.", "از دیروز ناراحتم."),
                ConversationLine("B", "I'm sorry. I didn't mean to hurt you.", "متأسفم. قصد نداشتم ناراحتت کنم."),
                ConversationLine("A", "You said you would help me, but you didn't.", "گفتی کمکم می‌کنی، ولی نکردی."),
                ConversationLine("B", "You're right. I apologize. Let's compromise.", "حق داری. عذرخواهی می‌کنم. بیا سازش کنیم."),
                ConversationLine("A", "OK. But next time, tell me in advance.", "باشه. ولی دفعه بعد، از قبل بهم بگو."),
                ConversationLine("B", "I will. Thanks for understanding.", "حتماً. ممنون که درک می‌کنی.")
            )),
            storyTitle = "Learning to Get Along",
            storyText = "Mark and Lisa are roommates. Last week, they had a big argument about cleaning. Mark said Lisa never helped with chores. Lisa disagreed and said Mark was too strict. After a long conversation, they compromised. Now they take turns cleaning.",
            quiz = listOf(
                QuizQuestion("معنی Compromise چیست؟", listOf("بحث", "سازش", "عذرخواهی", "بخشش"), 1),
                QuizQuestion("کدام درست است؟", listOf("He said me he was tired.", "He told me he was tired.", "He said to me he tired.", "He told that he was tired."), 1)
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