package com.example.englishteacher.data

object LessonRepository {

    private val lessons: List<Lesson> = listOf(

        // ==================== BEGINNER (14 Lessons) ====================
        Lesson(
            id = "b1", unitNumber = 1, title = "Names and Occupations", titlePersian = "نام‌ها و شغل‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Teacher", "معلم", "ˈtiːtʃər"), Word("Student", "دانش‌آموز", "ˈstuːdənt"),
                Word("Doctor", "دکتر", "ˈdɑːktər"), Word("Nurse", "پرستار", "nɜːrs"),
                Word("Engineer", "مهندس", "ˌendʒɪˈnɪr"), Word("Architect", "معمار", "ˈɑːrkɪtekt"),
                Word("Actor", "بازیگر", "ˈæktər"), Word("Singer", "خواننده", "ˈsɪŋər"),
                Word("Chef", "سرآشپز", "ʃef"), Word("Pilot", "خلبان", "ˈpaɪlət"),
                Word("Police officer", "افسر پلیس", "pəˈliːs ˈɔːfɪsər"), Word("Firefighter", "آتش‌نشان", "ˈfaɪərfaɪtər"),
                Word("Farmer", "کشاورز", "ˈfɑːrmər"), Word("Driver", "راننده", "ˈdraɪvər"),
                Word("Waiter", "گارسون", "ˈweɪtər"), Word("Banker", "بانکدار", "ˈbæŋkər"),
                Word("Scientist", "دانشمند", "ˈsaɪəntɪst"), Word("Musician", "موسیقی‌دان", "mjuˈzɪʃən"),
                Word("Photographer", "عکاس", "fəˈtɑːɡrəfər"), Word("Manager", "مدیر", "ˈmænɪdʒər")
            ),
            spelling = listOf(
                SpellingExercise("Cherie", "C - H - E - R - I - E", "شری"),
                SpellingExercise("Browne", "B - R - O - W - N - E", "براون"),
                SpellingExercise("Marie", "M - A - R - I - E", "ماری"),
                SpellingExercise("Laura", "L - A - U - R - A", "لورا"),
                SpellingExercise("David", "D - A - V - I - D", "دیوید"),
                SpellingExercise("Sophie", "S - O - P - H - I - E", "سوفی")
            ),
            grammarTitle = "a / an + Occupations | do / does",
            grammarExplanation = "📌 قانون ۱: a و an\n• a قبل از حروف بی‌صدا: a teacher, a doctor\n• an قبل از حروف صدادار (a,e,i,o,u): an architect, an engineer\n• استثنا: an hour\n\n📌 قانون ۲: do یا does؟\n• I / You / We / They → do\n  What DO you do? → I'm a teacher.\n• He / She / It → does\n  What DOES he do? → He's a doctor.\n\n📌 قانون ۳: پاسخ کوتاه\n• Are you a teacher? → Yes, I am. / No, I'm not.\n• Is he a doctor? → Yes, he is. / No, he isn't.\n\n📌 اشتباهات رایج\n❌ What do he do? → ✅ What does he do?\n❌ She's a engineer. → ✅ She's an engineer.\n❌ I'm teacher. → ✅ I'm a teacher.",
            grammarExamples = listOf(
                "What do you do? — I'm a teacher.",
                "What does she do? — She's an architect.",
                "What does he do? — He's a doctor.",
                "What do they do? — They're students.",
                "Is she a nurse? — Yes, she is.",
                "Is he an engineer? — No, he isn't. He's a pilot."
            ),
            conversation = Conversation("At a Welcome Party", "در مهمانی خوش‌آمدگویی", listOf(
                ConversationLine("Sara", "Hi! I'm Sara. Nice to meet you.", "سلام! من سارا هستم. از آشنایی خوشحالم."),
                ConversationLine("Ali", "Nice to meet you too, Sara. I'm Ali.", "من هم خوشحالم سارا. من علی هستم."),
                ConversationLine("Sara", "Are you new here?", "اینجا تازه‌وارد هستی؟"),
                ConversationLine("Ali", "Yes, I just moved here last week.", "بله، هفته پیش اومدم."),
                ConversationLine("Sara", "Welcome! What do you do?", "خوش اومدی! شغلت چیه؟"),
                ConversationLine("Ali", "I'm an engineer. I work at a tech company.", "من مهندسم. توی یه شرکت فناوری کار می‌کنم."),
                ConversationLine("Sara", "That's interesting! And what does your wife do?", "جالبه! زنت چیکار می‌کنه؟"),
                ConversationLine("Ali", "She's a doctor. She works at the city hospital.", "اون دکتره. توی بیمارستان شهر کار می‌کنه."),
                ConversationLine("Sara", "Wow! So you're both professionals.", "واو! پس هر دوتون حرفه‌ای هستید."),
                ConversationLine("Ali", "Yes. And you? What do you do?", "بله. تو چطور؟ شغلت چیه؟"),
                ConversationLine("Sara", "I'm a teacher. I teach English at a high school.", "من معلمم. دبیرستان انگلیسی درس می‌دم."),
                ConversationLine("Ali", "That's great! Maybe you can teach me some English.", "عالیه! شاید بتونی یه کم انگلیسی به من یاد بدی.")
            )),
            storyTitle = "Meeting Your Classmates",
            storyText = "In the classroom, students introduce themselves. Marie is a teacher from France. Tom is an architect who loves designing buildings. Laura is a doctor at a big hospital. David is a student who wants to become an engineer. Each person has a different job, but they are all here to learn English together.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I'm a architect.", "I'm an architect.", "I'm architect.", "I am architect a."), 1),
                QuizQuestion("معنی «What do you do?» چیست؟", listOf("کجایی؟", "چیکار می‌کنی؟", "شغلت چیه؟", "چطوری؟"), 2),
                QuizQuestion("کدام درست است؟ (سوم شخص مفرد)", listOf("What do he do?", "What does he do?", "What he does?", "What do he does?"), 1),
                QuizQuestion("«او (مونث) یک معمار است.»", listOf("She's a architect.", "She's an architect.", "She's architect.", "She architect."), 1),
                QuizQuestion("پاسخ به «Is she a doctor?»", listOf("Yes, she does.", "Yes, she is.", "Yes, she do.", "Yes, she are."), 1),
                QuizQuestion("کدام با «an» می‌آید؟", listOf("teacher", "doctor", "engineer", "nurse"), 2),
                QuizQuestion("«What ___ they do?»", listOf("does", "do", "is", "are"), 1),
                QuizQuestion("معنی «Nurse» چیست؟", listOf("دکتر", "پرستار", "مهندس", "معلم"), 1),
                QuizQuestion("کدام درست است؟", listOf("She is a engineer.", "She is an engineer.", "She is engineer.", "She engineer is."), 1),
                QuizQuestion("«پدر من کشاورز است.»", listOf("My father is farmer.", "My father is a farmer.", "My father a farmer.", "My father are farmer."), 1)
            )
        ),

        Lesson(
            id = "b2", unitNumber = 2, title = "About People", titlePersian = "درباره مردم", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Tall", "قدبلند", "tɔːl"), Word("Short", "کوتاه", "ʃɔːrt"),
                Word("Young", "جوان", "jʌŋ"), Word("Old", "پیر", "oʊld"),
                Word("Nice", "مهربان", "naɪs"), Word("Funny", "بامزه", "ˈfʌni"),
                Word("Serious", "جدی", "ˈsɪriəs"), Word("Friendly", "خوش‌برخورد", "ˈfrendli"),
                Word("Quiet", "ساکت", "ˈkwaɪət"), Word("Talkative", "پرحرف", "ˈtɔːkətɪv"),
                Word("Smart", "باهوش", "smɑːrt"), Word("Kind", "مهربان", "kaɪnd"),
                Word("Shy", "خجالتی", "ʃaɪ"), Word("Confident", "با اعتماد به نفس", "ˈkɑːnfɪdənt"),
                Word("Patient", "صبور", "ˈpeɪʃənt"), Word("Generous", "بخشنده", "ˈdʒenərəs")
            ),
            spelling = listOf(
                SpellingExercise("Alice", "A - L - I - C - E", "آلیس"),
                SpellingExercise("Kevin", "K - E - V - I - N", "کوین"),
                SpellingExercise("Nancy", "N - A - N - C - Y", "نانسی")
            ),
            grammarTitle = "Adjectives + Be | What is he like?",
            grammarExplanation = "📌 قانون ۱: جای صفت\n• بعد از be: She is tall.\n• قبل از اسم: She is a tall girl.\n\n📌 قانون ۲: پرسیدن شخصیت\n• What is he like? → He's kind and funny. (شخصیت)\n• What does he look like? → He's tall and thin. (ظاهر)\n\n📌 قانون ۳: صفت‌های متضاد\ntall ↔ short | young ↔ old | nice ↔ mean\nquiet ↔ talkative\n\n📌 اشتباهات رایج\n❌ She very nice. → ✅ She is very nice.\n❌ He is a man tall. → ✅ He is a tall man.",
            grammarExamples = listOf(
                "She is tall and friendly.",
                "He is young and funny.",
                "They are nice and kind.",
                "What is she like? — She's very kind.",
                "What does he look like? — He's short and old.",
                "My best friend is quiet but very smart."
            ),
            conversation = Conversation("Describing People", "توصیف افراد", listOf(
                ConversationLine("A", "Who is your best friend?", "بهترین دوستت کیه؟"),
                ConversationLine("B", "Her name is Sara. She's my classmate.", "اسمش ساراست. همکلاسیمه."),
                ConversationLine("A", "What is she like?", "چه جوریه؟"),
                ConversationLine("B", "She is tall and very friendly.", "قدبلنده و خیلی خوش‌برخورد."),
                ConversationLine("A", "Is she funny?", "بامزه‌ست؟"),
                ConversationLine("B", "Yes! She makes everyone laugh.", "بله! همه رو می‌خندونه."),
                ConversationLine("A", "What does she look like?", "ظاهرش چطوره؟"),
                ConversationLine("B", "Long black hair and brown eyes.", "موهای بلند مشکی و چشم قهوه‌ای."),
                ConversationLine("A", "And what does she do?", "چیکار می‌کنه؟"),
                ConversationLine("B", "She's a student. She wants to be a doctor.", "دانش‌آموزه. می‌خواد دکتر بشه.")
            )),
            storyTitle = "My Best Friend",
            storyText = "My best friend is Ali. He is tall and funny. He is also very friendly and kind. He is not very talkative, but he is very smart. He studies hard and wants to be an engineer in the future. I am lucky to have a friend like him.",
            quiz = listOf(
                QuizQuestion("معنی Tall چیست؟", listOf("کوتاه", "قدبلند", "پیر", "جوان"), 1),
                QuizQuestion("کدام درست است؟", listOf("She tall.", "She is tall.", "She are tall.", "Tall she."), 1),
                QuizQuestion("«What is she like?» یعنی؟", listOf("ظاهرش چطوره؟", "چه جوریه؟", "کجاست؟", "چیکار می‌کنه؟"), 1),
                QuizQuestion("متضاد «young»؟", listOf("tall", "old", "short", "nice"), 1),
                QuizQuestion("کدام درست است؟", listOf("He is a man tall.", "He is a tall man.", "He tall is.", "Tall he is."), 1),
                QuizQuestion("معنی «Quiet»؟", listOf("پرحرف", "ساکت", "مهربان", "باهوش"), 1),
                QuizQuestion("کدام درست است؟", listOf("She very nice.", "She is very nice.", "She be nice.", "Nice she is."), 1),
                QuizQuestion("«او خجالتی است.»", listOf("He is shy.", "He are shy.", "He shy.", "Shy he."), 0)
            )
        ),

        Lesson(
            id = "b3", unitNumber = 3, title = "Places and Things", titlePersian = "مکان‌ها و اشیا", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Book", "کتاب", "bʊk"), Word("Table", "میز", "ˈteɪbəl"),
                Word("Chair", "صندلی", "tʃer"), Word("Window", "پنجره", "ˈwɪndoʊ"),
                Word("Door", "در", "dɔːr"), Word("Street", "خیابان", "striːt"),
                Word("City", "شهر", "ˈsɪti"), Word("Country", "کشور", "ˈkʌntri"),
                Word("Park", "پارک", "pɑːrk"), Word("School", "مدرسه", "skuːl"),
                Word("Hospital", "بیمارستان", "ˈhɑːspɪtəl"), Word("Market", "بازار", "ˈmɑːrkɪt"),
                Word("Library", "کتابخانه", "ˈlaɪbreri"), Word("Restaurant", "رستوران", "ˈrestərɑːnt"),
                Word("Bank", "بانک", "bæŋk"), Word("Museum", "موزه", "mjuˈziːəm")
            ),
            spelling = listOf(
                SpellingExercise("Tehran", "T - E - H - R - A - N", "تهران"),
                SpellingExercise("Paris", "P - A - R - I - S", "پاریس"),
                SpellingExercise("London", "L - O - N - D - O - N", "لندن")
            ),
            grammarTitle = "Plural Nouns + There is / There are",
            grammarExplanation = "📌 جمع اسم‌ها\n• +s: book → books\n• +es (بعد از s,x,ch,sh,o): box → boxes, watch → watches\n• y → ies: city → cities\n• بی‌قاعده: man → men, child → children, woman → women, foot → feet\n\n📌 There is / There are\n• There is + مفرد: There is a book.\n• There are + جمع: There are two books.\n• سوال: Is there...? / Are there...?\n• منفی: There isn't / There aren't\n\n📌 اشتباهات رایج\n❌ There is two books. → ✅ There are two books.\n❌ two childs → ✅ two children",
            grammarExamples = listOf(
                "There are two books on the table.",
                "There is a big park in my city.",
                "Are there any museums in your city?",
                "There aren't any hospitals near my house.",
                "My city has three libraries.",
                "The children are playing in the park."
            ),
            conversation = Conversation("Talking About My City", "صحبت درباره شهرم", listOf(
                ConversationLine("A", "Where are you from?", "اهل کجایی؟"),
                ConversationLine("B", "I'm from Tehran. It's the capital of Iran.", "اهل تهرام. پایتخت ایرانه."),
                ConversationLine("A", "Is it a big city?", "شهر بزرگیه؟"),
                ConversationLine("B", "Yes, very big. Many streets and buildings.", "بله، خیلی بزرگ. خیابان‌ها و ساختمان‌های زیادی داره."),
                ConversationLine("A", "Are there any parks?", "پارک هم داره؟"),
                ConversationLine("B", "Yes, several beautiful parks.", "بله، چند تا پارک زیبا."),
                ConversationLine("A", "What about museums?", "موزه چطور؟"),
                ConversationLine("B", "There are many. The National Museum is famous.", "موزه‌های زیادی داره. موزه ملی معروفه."),
                ConversationLine("A", "Is there a good restaurant near your home?", "رستوران خوبی نزدیک خونت هست؟"),
                ConversationLine("B", "Yes, an Italian restaurant on my street.", "بله، یه رستوران ایتالیایی توی خیابون ما.")
            )),
            storyTitle = "My City",
            storyText = "Tehran is a big city in Iran. It is the capital of the country. There are many streets, buildings, and parks. There is a famous museum and a big library. The people are friendly and kind. I love my city very much.",
            quiz = listOf(
                QuizQuestion("جمع book؟", listOf("bookes", "books", "book", "bookies"), 1),
                QuizQuestion("جمع child؟", listOf("childs", "childes", "children", "childrens"), 2),
                QuizQuestion("کدام درست است؟", listOf("There is two books.", "There are two books.", "There have two books.", "There has two books."), 1),
                QuizQuestion("جمع city؟", listOf("citys", "cities", "cityes", "city"), 1),
                QuizQuestion("«There ___ a park near my house.»", listOf("are", "is", "have", "has"), 1),
                QuizQuestion("جمع woman؟", listOf("womans", "womens", "women", "womanes"), 2),
                QuizQuestion("کدام درست است؟", listOf("There are a pen.", "There is a pen.", "There have a pen.", "There has a pen."), 1),
                QuizQuestion("جمع box؟", listOf("boxs", "box", "boxes", "boxies"), 2)
            )
        ),

        Lesson(
            id = "b4", unitNumber = 4, title = "Family", titlePersian = "خانواده", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Father", "پدر", "ˈfɑːðər"), Word("Mother", "مادر", "ˈmʌðər"),
                Word("Brother", "برادر", "ˈbrʌðər"), Word("Sister", "خواهر", "ˈsɪstər"),
                Word("Son", "پسر", "sʌn"), Word("Daughter", "دختر", "ˈdɔːtər"),
                Word("Grandfather", "پدربزرگ", "ˈɡrænfɑːðər"), Word("Grandmother", "مادربزرگ", "ˈɡrænmʌðər"),
                Word("Uncle", "عمو/دایی", "ˈʌŋkəl"), Word("Aunt", "عمه/خاله", "ænt"),
                Word("Cousin", "پسرعمو/دخترعمو", "ˈkʌzən"), Word("Husband", "شوهر", "ˈhʌzbənd"),
                Word("Wife", "همسر (زن)", "waɪf"), Word("Parents", "والدین", "ˈperənts"),
                Word("Children", "فرزندان", "ˈtʃɪldrən"), Word("Nephew", "برادرزاده", "ˈnefjuː")
            ),
            spelling = listOf(
                SpellingExercise("Fatima", "F - A - T - I - M - A", "فاطیما"),
                SpellingExercise("Hassan", "H - A - S - S - A - N", "حسن"),
                SpellingExercise("Zahra", "Z - A - H - R - A", "زهرا")
            ),
            grammarTitle = "Possessive 's | Have / Has",
            grammarExplanation = "📌 مالکیت با 's\n• Ali's book = کتاب علی\n• My father's car = ماشین پدرم\n• Sara's mother = مادر سارا\n\n📌 برای جمع که به s ختم می‌شه: فقط '\n• The students' classroom\n• My parents' house\n\n📌 Have / Has\n• I / You / We / They → have\n• He / She / It → has\n\n📌 اشتباهات رایج\n❌ Ali book → ✅ Ali's book\n❌ She have a brother. → ✅ She has a brother.",
            grammarExamples = listOf(
                "This is Ali's book.",
                "My father's car is red.",
                "Sara's mother is a teacher.",
                "I have two brothers and one sister.",
                "She has a big family.",
                "My parents' house is in the city."
            ),
            conversation = Conversation("Talking About My Family", "صحبت درباره خانواده‌ام", listOf(
                ConversationLine("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
                ConversationLine("B", "Yes, I have two brothers and one sister.", "بله، دو برادر و یه خواهر دارم."),
                ConversationLine("A", "What does your father do?", "پدرت چیکار می‌کنه؟"),
                ConversationLine("B", "He's a doctor. He works at a hospital.", "دکتره. توی بیمارستان کار می‌کنه."),
                ConversationLine("A", "And your mother?", "مادرت؟"),
                ConversationLine("B", "She's a teacher. She teaches at a school.", "معلمه. توی مدرسه درس می‌ده."),
                ConversationLine("A", "Do you have any grandparents?", "پدربزرگ و مادربزرگ داری؟"),
                ConversationLine("B", "Yes, my grandmother lives with us.", "بله، مادربزرگم با ما زندگی می‌کنه."),
                ConversationLine("A", "That's nice. What about your sister?", "چه خوب. خواهرت چطور؟"),
                ConversationLine("B", "She wants to be an engineer.", "می‌خواد مهندس بشه."),
                ConversationLine("A", "You have a wonderful family!", "خانواده فوق‌العاده‌ای داری!"),
                ConversationLine("B", "Thank you! I love them very much.", "ممنون! خیلی دوستشون دارم.")
            )),
            storyTitle = "My Family",
            storyText = "My family is not very big. There are five people: my father, my mother, my brother, my sister, and me. My father is a doctor and my mother is a teacher. My brother is a student and my sister is still a child. We live in a small house with a beautiful garden. We love each other very much.",
            quiz = listOf(
                QuizQuestion("معنی Daughter؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1),
                QuizQuestion("کدام درست است؟", listOf("Ali book", "Ali's book", "Alis book", "Book Ali"), 1),
                QuizQuestion("کدام درست است؟", listOf("She have a brother.", "She has a brother.", "She haves a brother.", "She having a brother."), 1),
                QuizQuestion("معنی Uncle؟", listOf("عمو/دایی", "عمه/خاله", "پدربزرگ", "پسرعمو"), 0),
                QuizQuestion("«خانه‌ی والدینم»؟", listOf("My parents house", "My parent's house", "My parents' house", "My parents's house"), 2),
                QuizQuestion("کدام درست است؟", listOf("I has a sister.", "I have a sister.", "I having a sister.", "I haves a sister."), 1),
                QuizQuestion("معنی Wife؟", listOf("شوهر", "همسر (زن)", "خواهر", "مادر"), 1),
                QuizQuestion("«The students' classroom»؟", listOf("کلاس یک دانش‌آموز", "کلاس دانش‌آموزان", "دانش‌آموز کلاس", "معلم کلاس"), 1)
            )
        ),

        Lesson(
            id = "b5", unitNumber = 5, title = "Events and Times", titlePersian = "رویدادها و زمان‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Today", "امروز", "təˈdeɪ"), Word("Tomorrow", "فردا", "təˈmɑːroʊ"),
                Word("Yesterday", "دیروز", "ˈjestərdeɪ"), Word("Morning", "صبح", "ˈmɔːrnɪŋ"),
                Word("Afternoon", "بعدازظهر", "ˌæftərˈnuːn"), Word("Evening", "عصر", "ˈiːvnɪŋ"),
                Word("Night", "شب", "naɪt"), Word("Week", "هفته", "wiːk"),
                Word("Month", "ماه", "mʌnθ"), Word("Year", "سال", "jɪr"),
                Word("Hour", "ساعت", "ˈaʊər"), Word("Minute", "دقیقه", "ˈmɪnɪt"),
                Word("Calendar", "تقویم", "ˈkælɪndər"), Word("Schedule", "برنامه", "ˈskedʒuːl"),
                Word("Meeting", "جلسه", "ˈmiːtɪŋ"), Word("Appointment", "قرار ملاقات", "əˈpɔɪntmənt")
            ),
            spelling = listOf(
                SpellingExercise("Monday", "M - O - N - D - A - Y", "دوشنبه"),
                SpellingExercise("Wednesday", "W - E - D - N - E - S - D - A - Y", "چهارشنبه"),
                SpellingExercise("February", "F - E - B - R - U - A - R - Y", "فوریه")
            ),
            grammarTitle = "Time Expressions: at / on / in",
            grammarExplanation = "📌 at + ساعت\n• at 7 AM, at 3 PM, at noon, at midnight\n\n📌 on + روز و تاریخ\n• on Monday, on my birthday, on July 5th\n\n📌 in + ماه/سال/فصل/بخش روز\n• in May, in 2024, in summer, in the morning\n\n📌 قیود زمان\n• today, tomorrow, yesterday, now, later, soon\n\n📌 اشتباهات رایج\n❌ in Monday → ✅ on Monday\n❌ at the morning → ✅ in the morning\n❌ on 2024 → ✅ in 2024",
            grammarExamples = listOf(
                "I wake up in the morning.",
                "The meeting is on Monday.",
                "We eat dinner at 7 PM.",
                "My birthday is in May.",
                "I'll see you tomorrow.",
                "The class starts at 9 o'clock."
            ),
            conversation = Conversation("What Time?", "چه ساعتی؟", listOf(
                ConversationLine("A", "What time is the meeting?", "جلسه چه ساعتیه؟"),
                ConversationLine("B", "It's at 3 PM on Tuesday.", "ساعت ۳ بعدازظهر سه‌شنبه."),
                ConversationLine("A", "Where is it?", "کجاست؟"),
                ConversationLine("B", "In the main conference room.", "توی اتاق کنفرانس اصلی."),
                ConversationLine("A", "How long will it take?", "چقدر طول می‌کشه؟"),
                ConversationLine("B", "About an hour.", "حدود یه ساعت."),
                ConversationLine("A", "Do I need to prepare anything?", "باید چیزی آماده کنم؟"),
                ConversationLine("B", "Yes, please bring your reports.", "بله، لطفاً گزارش‌هات رو بیار."),
                ConversationLine("A", "OK. See you on Tuesday.", "باشه. سه‌شنبه می‌بینمت."),
                ConversationLine("B", "See you! Don't be late.", "می‌بینمت! دیر نکن.")
            )),
            storyTitle = "A Busy Week",
            storyText = "Ali has a very busy week. On Monday, he has a meeting at 9 AM. On Tuesday, he visits his grandmother. On Wednesday, he goes to the gym in the evening. On Thursday, he has an English class. On Friday, he relaxes at home. On the weekend, he goes out with his friends. He always uses his calendar to remember everything.",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("in Monday", "on Monday", "at Monday", "Monday in"), 1),
                QuizQuestion("معنی Tomorrow؟", listOf("امروز", "دیروز", "فردا", "پریروز"), 2),
                QuizQuestion("«at» با کدام می‌آید؟", listOf("Monday", "May", "7 PM", "2024"), 2),
                QuizQuestion("«in» با کدام می‌آید؟", listOf("noon", "May", "Monday", "midnight"), 1),
                QuizQuestion("کدام درست است؟", listOf("at the morning", "in the morning", "on the morning", "the morning"), 1),
                QuizQuestion("معنی Week؟", listOf("روز", "ماه", "هفته", "سال"), 2),
                QuizQuestion("کدام درست است؟", listOf("on 2024", "at 2024", "in 2024", "2024 in"), 2),
                QuizQuestion("معنی Yesterday؟", listOf("امروز", "فردا", "دیروز", "پریروز"), 2)
            )
        ),

        Lesson(
            id = "b6", unitNumber = 6, title = "Cities and Countries", titlePersian = "شهرها و کشورها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Country", "کشور", "ˈkʌntri"), Word("City", "شهر", "ˈsɪti"),
                Word("Capital", "پایتخت", "ˈkæpɪtəl"), Word("Language", "زبان", "ˈlæŋɡwɪdʒ"),
                Word("Nationality", "ملیت", "ˌnæʃəˈnæləti"), Word("Continent", "قاره", "ˈkɑːntɪnənt"),
                Word("World", "جهان", "wɜːrld"), Word("Flag", "پرچم", "flæɡ"),
                Word("Border", "مرز", "ˈbɔːrdər"), Word("Population", "جمعیت", "ˌpɑːpjuˈleɪʃən"),
                Word("Tourist", "توریست", "ˈtʊrɪst"), Word("Citizen", "شهروند", "ˈsɪtɪzən"),
                Word("Foreign", "خارجی", "ˈfɔːrən"), Word("Native", "بومی", "ˈneɪtɪv"),
                Word("Map", "نقشه", "mæp"), Word("Travel", "سفر", "ˈtrævəl")
            ),
            spelling = listOf(
                SpellingExercise("Japan", "J - A - P - A - N", "ژاپن"),
                SpellingExercise("France", "F - R - A - N - C - E", "فرانسه"),
                SpellingExercise("Canada", "C - A - N - A - D - A", "کانادا")
            ),
            grammarTitle = "Where are you from? | Nationalities",
            grammarExplanation = "📌 پرسیدن مبدا\n• Where are you from? — I'm from Iran.\n• Where is she from? — She's from France.\n\n📌 پرسیدن ملیت\n• What nationality are you? — I'm Iranian.\n• What's your nationality? — I'm Iranian.\n\n📌 قواعد ساخت ملیت\n• Iran → Iranian\n• France → French\n• Japan → Japanese\n• China → Chinese\n• USA → American\n\n📌 اشتباهات رایج\n❌ Where you from? → ✅ Where are you from?\n❌ I from Iran. → ✅ I'm from Iran.",
            grammarExamples = listOf(
                "Where are you from? — I'm from Iran.",
                "What nationality are you? — I'm Iranian.",
                "Where is she from? — She's from France.",
                "What language do they speak? — They speak French.",
                "She's from Japan. She's Japanese."
            ),
            conversation = Conversation("Countries and Nationalities", "کشورها و ملیت‌ها", listOf(
                ConversationLine("A", "Where are you from?", "اهل کجایی؟"),
                ConversationLine("B", "I'm from Japan.", "اهل ژاپنم."),
                ConversationLine("A", "What nationality are you?", "ملیتت چیه؟"),
                ConversationLine("B", "I'm Japanese.", "ژاپنی‌ام."),
                ConversationLine("A", "What language do you speak?", "چه زبانی صحبت می‌کنی؟"),
                ConversationLine("B", "I speak Japanese and English.", "ژاپنی و انگلیسی صحبت می‌کنم."),
                ConversationLine("A", "What's the capital of Japan?", "پایتخت ژاپن کجاست؟"),
                ConversationLine("B", "Tokyo. It's a huge city.", "توکیو. شهر خیلی بزرگیه."),
                ConversationLine("A", "I'd love to visit Japan someday.", "دوست دارم یه روز ژاپن رو ببینم."),
                ConversationLine("B", "You should! It's a beautiful country.", "باید بیای! کشور زیباییه.")
            )),
            storyTitle = "Around the World",
            storyText = "There are 195 countries in the world. Each country has its own capital, flag, and language. Japan is an island country in Asia. Its capital is Tokyo. France is in Europe, and its capital is Paris. Iran is in the Middle East, and its capital is Tehran. People from different countries speak different languages, but English is a common language for everyone.",
            quiz = listOf(
                QuizQuestion("معنی Capital؟", listOf("شهر", "پایتخت", "کشور", "استان"), 1),
                QuizQuestion("کدام درست است؟", listOf("Where you from?", "Where are you from?", "From where you?", "You from?"), 1),
                QuizQuestion("ملیت France؟", listOf("Francian", "French", "Francean", "Franish"), 1),
                QuizQuestion("ملیت Japan؟", listOf("Japanian", "Japanish", "Japanese", "Japanes"), 2),
                QuizQuestion("معنی Flag؟", listOf("نقشه", "پرچم", "مرز", "کشور"), 1),
                QuizQuestion("پایتخت ایران؟", listOf("Tehran", "Isfahan", "Shiraz", "Tabriz"), 0),
                QuizQuestion("معنی Tourist؟", listOf("شهروند", "توریست", "بومی", "خارجی"), 1),
                QuizQuestion("کدام درست است؟", listOf("I from Iran.", "I'm from Iran.", "I is from Iran.", "From Iran I."), 1)
            )
        ),

        Lesson(
            id = "b7", unitNumber = 7, title = "Clothes", titlePersian = "لباس‌ها", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Shirt", "پیراهن", "ʃɜːrt"), Word("Pants", "شلوار", "pænts"),
                Word("Dress", "لباس زنانه", "dres"), Word("Jacket", "کاپشن", "ˈdʒækɪt"),
                Word("Shoes", "کفش", "ʃuːz"), Word("Hat", "کلاه", "hæt"),
                Word("Socks", "جوراب", "sɑːks"), Word("Coat", "پالتو", "koʊt"),
                Word("Skirt", "دامن", "skɜːrt"), Word("Sweater", "پلیور", "ˈswetər"),
                Word("Tie", "کراوات", "taɪ"), Word("Belt", "کمربند", "belt"),
                Word("Gloves", "دستکش", "ɡlʌvz"), Word("Scarf", "شال گردن", "skɑːrf"),
                Word("Jeans", "شلوار جین", "dʒiːnz"), Word("Suit", "کت و شلوار", "suːt")
            ),
            spelling = listOf(
                SpellingExercise("Shirt", "S - H - I - R - T", "پیراهن"),
                SpellingExercise("Jacket", "J - A - C - K - E - T", "کاپشن"),
                SpellingExercise("Sweater", "S - W - E - A - T - E - R", "پلیور")
            ),
            grammarTitle = "Colors + Clothes | This / These",
            grammarExplanation = "📌 ترتیب: رنگ + اسم\na red shirt | blue pants\n\n📌 This / These\n• This + مفرد: This is my shirt.\n• These + جمع: These are my shoes.\n• That + مفرد دور\n• Those + جمع دور\n\n📌 Colors\nred, blue, green, yellow, black, white, brown, pink, purple, orange, gray\n\n📌 اشتباهات رایج\n❌ a shirt red → ✅ a red shirt\n❌ This shoes → ✅ These shoes",
            grammarExamples = listOf(
                "She is wearing a red dress.",
                "He has a blue jacket.",
                "These shoes are black and white.",
                "This is my favorite shirt.",
                "I like that green sweater.",
                "Those gloves are too small."
            ),
            conversation = Conversation("Shopping for Clothes", "خرید لباس", listOf(
                ConversationLine("A", "What are you wearing today?", "امروز چی پوشیدی؟"),
                ConversationLine("B", "A blue shirt and black pants.", "پیراهن آبی و شلوار مشکی."),
                ConversationLine("A", "Nice shoes!", "کفش‌های قشنگی!"),
                ConversationLine("B", "Thanks! They're new.", "ممنون! جدیدن."),
                ConversationLine("A", "Where did you buy them?", "از کجا خریدی؟"),
                ConversationLine("B", "At the mall. There's a sale.", "از پاساژ. حراج داره."),
                ConversationLine("A", "I need a new jacket too.", "منم کاپشن جدید لازم دارم."),
                ConversationLine("B", "Let's go together!", "بیا با هم بریم!"),
                ConversationLine("A", "Great idea! What color?", "عالیه! چه رنگی؟"),
                ConversationLine("B", "A black one. It matches everything.", "مشکی. با همه چی هماهنگه.")
            )),
            storyTitle = "The New Outfit",
            storyText = "Sara goes to the mall. She wants to buy a new dress for her sister's wedding. She tries on a red dress, but it's too small. She tries a blue one, but it's too big. Finally, she finds a purple dress that fits perfectly. She also buys matching shoes and a small handbag. She can't wait to wear her new outfit!",
            quiz = listOf(
                QuizQuestion("معنی Jacket؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                QuizQuestion("کدام درست است؟", listOf("a shirt blue", "blue a shirt", "a blue shirt", "shirt blue"), 2),
                QuizQuestion("کدام درست است؟", listOf("This shoes", "These shoes", "This shoe are", "These shoe"), 1),
                QuizQuestion("معنی Skirt؟", listOf("شلوار", "دامن", "پیراهن", "کاپشن"), 1),
                QuizQuestion("«این پیراهن من است.»", listOf("This is my shirt.", "These is my shirt.", "This are my shirt.", "My shirt this is."), 0),
                QuizQuestion("معنی Gloves؟", listOf("جوراب", "دستکش", "کلاه", "شال"), 1),
                QuizQuestion("کدام درست است؟", listOf("These are my shoes.", "This are my shoes.", "These is my shoes.", "This is my shoes."), 0),
                QuizQuestion("معنی Sweater؟", listOf("پالتو", "پلیور", "کاپشن", "جلیقه"), 1)
            )
        ),

        Lesson(
            id = "b8", unitNumber = 8, title = "Daily Life", titlePersian = "زندگی روزمره", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Wake up", "بیدار شدن", "weɪk ʌp"), Word("Get dressed", "لباس پوشیدن", "ɡet drest"),
                Word("Brush teeth", "مسواک زدن", "brʌʃ tiːθ"), Word("Have breakfast", "صبحانه خوردن", "hæv ˈbrekfəst"),
                Word("Go to work", "به سر کار رفتن", "ɡoʊ tə wɜːrk"), Word("Come home", "به خانه آمدن", "kʌm hoʊm"),
                Word("Watch TV", "تلویزیون تماشا کردن", "wɑːtʃ ˌtiːˈviː"), Word("Go to bed", "به رختخواب رفتن", "ɡoʊ tə bed"),
                Word("Take a shower", "دوش گرفتن", "teɪk ə ˈʃaʊər"), Word("Have lunch", "ناهار خوردن", "hæv lʌntʃ"),
                Word("Have dinner", "شام خوردن", "hæv ˈdɪnər"), Word("Read a book", "کتاب خواندن", "riːd ə bʊk"),
                Word("Exercise", "ورزش کردن", "ˈeksərsaɪz"), Word("Study", "درس خواندن", "ˈstʌdi"),
                Word("Rest", "استراحت کردن", "rest"), Word("Sleep", "خوابیدن", "sliːp")
            ),
            spelling = listOf(
                SpellingExercise("routine", "R - O - U - T - I - N - E", "روتین"),
                SpellingExercise("breakfast", "B - R - E - A - K - F - A - S - T", "صبحانه"),
                SpellingExercise("dinner", "D - I - N - N - E - R", "شام")
            ),
            grammarTitle = "Daily Routine + Present Simple",
            grammarExplanation = "📌 زمان حال ساده برای عادت‌ها\n• I wake up at 7 every day.\n• She gets dressed after breakfast.\n\n📌 سوم شخص مفرد\n• He/She/It → فعل + s\n• I wake up → She wakes up\n• I go → He goes\n\n📌 قیود تکرار\n• always (همیشه), usually (معمولاً), often (غالباً)\n• sometimes (گاهی), rarely (به‌ندرت), never (هرگز)\n\n📌 اشتباهات رایج\n❌ I wake up 7. → ✅ I wake up at 7.\n❌ She wake up early. → ✅ She wakes up early.",
            grammarExamples = listOf(
                "I wake up at 7 AM every day.",
                "She gets dressed after breakfast.",
                "They go to bed late.",
                "He usually has lunch at noon.",
                "We always watch TV in the evening.",
                "I never drink coffee at night."
            ),
            conversation = Conversation("My Daily Routine", "روتین روزانه من", listOf(
                ConversationLine("A", "What time do you wake up?", "ساعت چند بیدار می‌شی؟"),
                ConversationLine("B", "At 6:30. I like to start early.", "۶:۳۰. دوست دارم زود شروع کنم."),
                ConversationLine("A", "When do you go to work?", "کِی می‌ری سر کار؟"),
                ConversationLine("B", "At 8 o'clock. I take the bus.", "ساعت ۸. اتوبوس می‌گیرم."),
                ConversationLine("A", "What do you do in the evening?", "عصرها چیکار می‌کنی؟"),
                ConversationLine("B", "I usually exercise, then have dinner.", "معمولاً ورزش می‌کنم، بعد شام می‌خورم."),
                ConversationLine("A", "What time do you go to bed?", "ساعت چند می‌خوابی؟"),
                ConversationLine("B", "Around 11. I read a book before sleeping.", "حدود ۱۱. قبل خواب کتاب می‌خونم."),
                ConversationLine("A", "That's a healthy routine!", "روتین سالمیه!"),
                ConversationLine("B", "Yes, it works for me.", "بله، برای من جواب می‌ده.")
            )),
            storyTitle = "A Typical Day",
            storyText = "This is my daily routine. I wake up at 6:30 and take a shower. I have breakfast at 7. Then I go to work at 8. I have lunch at noon with my colleagues. I come home at 5 PM. In the evening, I exercise for thirty minutes, then have dinner. After dinner, I usually read a book or watch TV. I go to bed at 11 PM.",
            quiz = listOf(
                QuizQuestion("معنی Brush teeth؟", listOf("شستن دست", "مسواک زدن", "شام خوردن", "خوابیدن"), 1),
                QuizQuestion("کدام درست است؟", listOf("I wake up 7.", "I wake up at 7.", "I wake at 7 up.", "Wake I up 7."), 1),
                QuizQuestion("سوم شخص مفرد درست؟", listOf("She wake up early.", "She wakes up early.", "She waking up early.", "She wake ups early."), 1),
                QuizQuestion("معنی Have dinner؟", listOf("صبحانه خوردن", "ناهار خوردن", "شام خوردن", "میان‌وعده"), 2),
                QuizQuestion("«همیشه» به انگلیسی؟", listOf("never", "always", "sometimes", "rarely"), 1),
                QuizQuestion("کدام درست است؟", listOf("He go to work.", "He goes to work.", "He going to work.", "He go work."), 1),
                QuizQuestion("معنی Exercise؟", listOf("خوابیدن", "ورزش کردن", "درس خواندن", "استراحت"), 1),
                QuizQuestion("«هرگز» به انگلیسی؟", listOf("always", "usually", "never", "often"), 2)
            )
        ),

        Lesson(
            id = "b9", unitNumber = 9, title = "Shopping", titlePersian = "خرید", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Store", "فروشگاه", "stɔːr"), Word("Price", "قیمت", "praɪs"),
                Word("Dollar", "دلار", "ˈdɑːlər"), Word("Credit card", "کارت اعتباری", "ˈkredɪt kɑːrd"),
                Word("Cash", "پول نقد", "kæʃ"), Word("Discount", "تخفیف", "ˈdɪskaʊnt"),
                Word("Receipt", "رسید", "rɪˈsiːt"), Word("Customer", "مشتری", "ˈkʌstəmər"),
                Word("Sale", "حراج", "seɪl"), Word("Shopping cart", "چرخ خرید", "ˈʃɑːpɪŋ kɑːrt"),
                Word("Cashier", "صندوق‌دار", "kæˈʃɪr"), Word("Change", "پول خرد", "tʃeɪndʒ"),
                Word("Expensive", "گران", "ɪkˈspensɪv"), Word("Cheap", "ارزان", "tʃiːp"),
                Word("Bag", "کیسه", "bæɡ"), Word("List", "لیست", "lɪst")
            ),
            spelling = listOf(
                SpellingExercise("cashier", "C - A - S - H - I - E - R", "صندوق‌دار"),
                SpellingExercise("receipt", "R - E - C - E - I - P - T", "رسید"),
                SpellingExercise("discount", "D - I - S - C - O - U - N - T", "تخفیف")
            ),
            grammarTitle = "How much? | This / That / These / Those",
            grammarExplanation = "📌 پرسیدن قیمت\n• How much is this? — It's 10 dollars.\n• How much are these? — They're 20 dollars.\n\n📌 تفاوت‌ها\n• This (این - نزدیک مفرد)\n• That (آن - دور مفرد)\n• These (این‌ها - نزدیک جمع)\n• Those (آنها - دور جمع)\n\n📌 اشتباهات رایج\n❌ How much these? → ✅ How much are these?\n❌ How many is this? → ✅ How much is this?",
            grammarExamples = listOf(
                "How much is this shirt?",
                "How much are these shoes?",
                "Do you accept credit cards?",
                "This is too expensive.",
                "That bag is on sale.",
                "Can I have a receipt, please?"
            ),
            conversation = Conversation("At the Store", "در فروشگاه", listOf(
                ConversationLine("A", "Excuse me, how much is this jacket?", "ببخشید، این کاپشن چنده؟"),
                ConversationLine("B", "It's sixty dollars.", "شصت دلار."),
                ConversationLine("A", "Any discount?", "تخفیف دارید؟"),
                ConversationLine("B", "Yes, 20% off today.", "بله، امروز ۲۰٪."),
                ConversationLine("A", "Great! Can I try it on?", "عالی! می‌تونم امتحانش کنم؟"),
                ConversationLine("B", "Sure. The fitting room is over there.", "حتماً. اتاق پرو اونجاست."),
                ConversationLine("A", "How do I pay?", "چطور پرداخت کنم؟"),
                ConversationLine("B", "Cash or credit card, both are fine.", "نقد یا کارت، هر دو."),
                ConversationLine("A", "Credit card, please.", "کارت، لطفاً."),
                ConversationLine("B", "Here's your receipt. Have a nice day!", "اینم رسیدت. روز خوبی داشته باشی!")
            )),
            storyTitle = "The Smart Shopper",
            storyText = "Maryam is a smart shopper. Before going to the store, she always makes a list. She compares prices online. She looks for sales and discounts. She never buys things she doesn't need. Last week, she bought a beautiful dress for only thirty dollars. It was 50% off! She always keeps her receipts in case she needs to return something.",
            quiz = listOf(
                QuizQuestion("معنی Discount؟", listOf("افزایش", "تخفیف", "رسید", "مالیات"), 1),
                QuizQuestion("کدام درست است؟", listOf("How much these?", "How much are these?", "How many are these?", "How these much?"), 1),
                QuizQuestion("معنی Receipt؟", listOf("قیمت", "رسید", "پول خرد", "کیسه"), 1),
                QuizQuestion("معنی Expensive؟", listOf("ارزان", "گران", "متوسط", "رایگان"), 1),
                QuizQuestion("کدام درست است؟", listOf("How much is this?", "How much are this?", "How many is this?", "How is this much?"), 0),
                QuizQuestion("معنی Cash؟", listOf("کارت", "چک", "پول نقد", "وام"), 2),
                QuizQuestion("«How much are these?» جواب؟", listOf("It's 10 dollars.", "They're 10 dollars.", "Is 10 dollars.", "Are 10 dollars."), 1),
                QuizQuestion("معنی Customer؟", listOf("فروشنده", "مشتری", "مدیر", "کارمند"), 1)
            )
        ),

        Lesson(
            id = "b10", unitNumber = 10, title = "Food", titlePersian = "غذا", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Bread", "نان", "bred"), Word("Cheese", "پنیر", "tʃiːz"),
                Word("Egg", "تخم‌مرغ", "eɡ"), Word("Milk", "شیر", "mɪlk"),
                Word("Meat", "گوشت", "miːt"), Word("Rice", "برنج", "raɪs"),
                Word("Fruit", "میوه", "fruːt"), Word("Vegetable", "سبزیجات", "ˈvedʒtəbəl"),
                Word("Chicken", "مرغ", "ˈtʃɪkɪn"), Word("Fish", "ماهی", "fɪʃ"),
                Word("Water", "آب", "ˈwɔːtər"), Word("Juice", "آبمیوه", "dʒuːs"),
                Word("Tea", "چای", "tiː"), Word("Coffee", "قهوه", "ˈkɔːfi"),
                Word("Sugar", "شکر", "ˈʃʊɡər"), Word("Salt", "نمک", "sɔːlt")
            ),
            spelling = listOf(
                SpellingExercise("cheese", "C - H - E - E - S - E", "پنیر"),
                SpellingExercise("vegetable", "V - E - G - E - T - A - B - L - E", "سبزیجات"),
                SpellingExercise("chicken", "C - H - I - C - K - E - N", "مرغ")
            ),
            grammarTitle = "Some / Any | Countable / Uncountable",
            grammarExplanation = "📌 Some در جملات مثبت\n• I have some cheese.\n\n📌 Any در منفی و سوال\n• I don't have any milk.\n• Do you have any eggs?\n\n📌 قابل شمارش و غیرقابل شمارش\n• Countable: egg → eggs / apple → apples\n• Uncountable: milk, water, rice, bread (بدون s)\n\n📌 اشتباهات رایج\n❌ I have any bread. → ✅ I have some bread.\n❌ two breads → ✅ two loaves of bread",
            grammarExamples = listOf(
                "I have some cheese.",
                "Do you have any eggs?",
                "I don't have any milk.",
                "There are some apples on the table.",
                "Would you like some tea?",
                "We need some rice and chicken."
            ),
            conversation = Conversation("At the Supermarket", "در سوپرمارکت", listOf(
                ConversationLine("A", "Do we have any bread?", "نان داریم؟"),
                ConversationLine("B", "No, we need to buy some.", "نه، باید بخریم."),
                ConversationLine("A", "What about eggs?", "تخم‌مرغ چطور؟"),
                ConversationLine("B", "We have some eggs. Maybe five or six.", "چند تا تخم‌مرغ داریم. شاید پنج شش تا."),
                ConversationLine("A", "Do we need milk?", "شیر لازم داریم؟"),
                ConversationLine("B", "Yes, and some cheese too.", "بله، پنیر هم."),
                ConversationLine("A", "Let me make a shopping list.", "بذار یه لیست خرید بنویسم."),
                ConversationLine("B", "Good idea. We also need vegetables.", "فکر خوبیه. سبزیجات هم لازم داریم."),
                ConversationLine("A", "Anything else?", "چیز دیگه‌ای هم هست؟"),
                ConversationLine("B", "No, that's all. Let's go!", "نه، همین. بریم!")
            )),
            storyTitle = "Shopping for Dinner",
            storyText = "Ali wants to make dinner for his family. He checks the fridge. There is some chicken, but there isn't any rice. There are some vegetables, but there aren't any eggs. He makes a list and goes to the supermarket. He buys rice, eggs, and some fresh fruit for dessert. Now he can make a delicious dinner!",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I have some bread.", "I have any bread.", "I have a bread.", "I have breads."), 0),
                QuizQuestion("معنی Vegetable؟", listOf("میوه", "گوشت", "سبزیجات", "نان"), 2),
                QuizQuestion("کدام غیرقابل شمارش است؟", listOf("apple", "egg", "milk", "book"), 2),
                QuizQuestion("در سوال از کدام استفاده می‌کنیم؟", listOf("some", "any", "a", "the"), 1),
                QuizQuestion("«I don't have ___ milk.»", listOf("some", "any", "a", "an"), 1),
                QuizQuestion("معنی Chicken؟", listOf("گوشت", "مرغ", "ماهی", "تخم‌مرغ"), 1),
                QuizQuestion("کدام درست است؟", listOf("two breads", "two bread", "two loaves of bread", "two breads"), 2),
                QuizQuestion("معنی Juice؟", listOf("آب", "چای", "آبمیوه", "شیر"), 2)
            )
        ),

        Lesson(
            id = "b11", unitNumber = 11, title = "Health", titlePersian = "سلامتی", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Headache", "سردرد", "ˈhedeɪk"), Word("Stomachache", "دل‌درد", "ˈstʌməkeɪk"),
                Word("Fever", "تب", "ˈfiːvər"), Word("Cough", "سرفه", "kɔːf"),
                Word("Cold", "سرماخوردگی", "koʊld"), Word("Medicine", "دارو", "ˈmedɪsɪn"),
                Word("Pharmacy", "داروخانه", "ˈfɑːrməsi"), Word("Rest", "استراحت", "rest"),
                Word("Doctor", "دکتر", "ˈdɑːktər"), Word("Patient", "بیمار", "ˈpeɪʃənt"),
                Word("Pain", "درد", "peɪn"), Word("Sore throat", "گلودرد", "sɔːr θroʊt"),
                Word("Sneeze", "عطسه", "sniːz"), Word("Healthy", "سالم", "ˈhelθi"),
                Word("Sick", "بیمار", "sɪk"), Word("Appointment", "قرار ملاقات", "əˈpɔɪntmənt")
            ),
            spelling = listOf(
                SpellingExercise("headache", "H - E - A - D - A - C - H - E", "سردرد"),
                SpellingExercise("medicine", "M - E - D - I - C - I - N - E", "دارو"),
                SpellingExercise("pharmacy", "P - H - A - R - M - A - C - Y", "داروخانه")
            ),
            grammarTitle = "Should / Shouldn't",
            grammarExplanation = "📌 Should = باید (توصیه)\n• You should rest.\n• You should drink water.\n\n📌 Shouldn't = نباید\n• You shouldn't eat too much.\n• You shouldn't skip breakfast.\n\n📌 ساختار\nSubject + should + verb (بدون to)\n\n📌 اشتباهات رایج\n❌ You should to rest. → ✅ You should rest.\n❌ You should resting. → ✅ You should rest.",
            grammarExamples = listOf(
                "You should drink water.",
                "You shouldn't skip breakfast.",
                "You should take your medicine.",
                "You should see a doctor.",
                "You shouldn't eat too much sugar."
            ),
            conversation = Conversation("At the Pharmacy", "در داروخانه", listOf(
                ConversationLine("A", "Good morning. How can I help you?", "صبح بخیر. چطور کمکتون کنم؟"),
                ConversationLine("B", "I have a headache and a fever.", "سردرد و تب دارم."),
                ConversationLine("A", "Do you have a cough too?", "سرفه هم دارید؟"),
                ConversationLine("B", "Yes, and a sore throat.", "بله، گلودرد هم دارم."),
                ConversationLine("A", "You should take this medicine.", "باید این دارو رو بخورید."),
                ConversationLine("B", "How often should I take it?", "هر چند وقت یه بار بخورم؟"),
                ConversationLine("A", "Three times a day after meals.", "روزی سه بار بعد از غذا."),
                ConversationLine("B", "Should I see a doctor?", "باید دکتر برم؟"),
                ConversationLine("A", "If it doesn't get better in 2 days, yes.", "اگه تا ۲ روز بهتر نشد، بله."),
                ConversationLine("B", "Thank you so much.", "خیلی ممنون.")
            )),
            storyTitle = "Feeling Sick",
            storyText = "Sara doesn't feel well today. She has a bad headache and a fever. Her mother tells her she should rest and drink water. She shouldn't go to work. Sara calls her boss and takes a sick day. She goes to the pharmacy and buys some medicine. After taking the medicine and sleeping for a few hours, she feels much better.",
            quiz = listOf(
                QuizQuestion("معنی Fever؟", listOf("سردرد", "تب", "سرفه", "دل‌درد"), 1),
                QuizQuestion("کدام درست است؟", listOf("You should rest.", "You should to rest.", "You should resting.", "Should you rest."), 0),
                QuizQuestion("معنی Sore throat؟", listOf("سردرد", "گلودرد", "دل‌درد", "دندان‌درد"), 1),
                QuizQuestion("«You ___ eat too much.»", listOf("should", "shouldn't", "must", "can"), 1),
                QuizQuestion("معنی Medicine؟", listOf("دارو", "دکتر", "بیمار", "بیماری"), 0),
                QuizQuestion("کدام درست است؟", listOf("You should take medicine.", "You should takes medicine.", "You should taking medicine.", "You should to take."), 0),
                QuizQuestion("معنی Pharmacy؟", listOf("بیمارستان", "داروخانه", "مطب", "آزمایشگاه"), 1),
                QuizQuestion("معنی Healthy؟", listOf("بیمار", "سالم", "خسته", "ضعیف"), 1)
            )
        ),

        Lesson(
            id = "b12", unitNumber = 12, title = "Weekend Activities", titlePersian = "آخر هفته", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Go out", "بیرون رفتن", "ɡoʊ aʊt"), Word("Stay home", "خونه موندن", "steɪ hoʊm"),
                Word("Visit friends", "دیدن دوستان", "ˈvɪzɪt frendz"), Word("Play sports", "ورزش کردن", "pleɪ spɔːrts"),
                Word("Watch movies", "فیلم دیدن", "wɑːtʃ ˈmuːviz"), Word("Go shopping", "خرید رفتن", "ɡoʊ ˈʃɑːpɪŋ"),
                Word("Read books", "کتاب خواندن", "riːd bʊks"), Word("Relax", "استراحت کردن", "rɪˈlæks"),
                Word("Travel", "سفر کردن", "ˈtrævəl"), Word("Picnic", "پیک‌نیک", "ˈpɪknɪk"),
                Word("Hiking", "کوه‌پیمایی", "ˈhaɪkɪŋ"), Word("Swimming", "شنا", "ˈswɪmɪŋ"),
                Word("Party", "مهمانی", "ˈpɑːrti"), Word("Barbecue", "کباب‌پزی", "ˈbɑːrbɪkjuː"),
                Word("Camping", "کمپینگ", "ˈkæmpɪŋ"), Word("Sightseeing", "گردش", "ˈsaɪtsiːɪŋ")
            ),
            spelling = listOf(
                SpellingExercise("weekend", "W - E - E - K - E - N - D", "آخر هفته"),
                SpellingExercise("picnic", "P - I - C - N - I - C", "پیک‌نیک"),
                SpellingExercise("hiking", "H - I - K - I - N - G", "کوه‌پیمایی")
            ),
            grammarTitle = "Going to (Future Plans)",
            grammarExplanation = "📌 ساختار\nam/is/are + going to + verb\n\n• I'm going to visit my family.\n• She's going to travel.\n• They're going to play sports.\n\n📌 سوال\n• What are you going to do?\n• Where is she going to go?\n\n📌 اشتباهات رایج\n❌ I going to stay. → ✅ I'm going to stay.\n❌ I'm go to stay. → ✅ I'm going to stay.",
            grammarExamples = listOf(
                "What are you going to do?",
                "I'm going to visit my family.",
                "We're going to watch a movie.",
                "She's going to travel to Turkey.",
                "They're going to have a picnic."
            ),
            conversation = Conversation("Weekend Plans", "برنامه آخر هفته", listOf(
                ConversationLine("A", "What are you going to do this weekend?", "این آخر هفته چیکار می‌کنی؟"),
                ConversationLine("B", "I'm going to visit my grandma.", "می‌خوام مادربزرگم رو ببینم."),
                ConversationLine("A", "That sounds nice. What about Sunday?", "چه خوب. یکشنبه چطور؟"),
                ConversationLine("B", "I'm going to relax at home.", "می‌خوام خونه استراحت کنم."),
                ConversationLine("A", "I'm going to go hiking with friends.", "من با دوستام می‌ریم کوه‌پیمایی."),
                ConversationLine("B", "That's a great idea! Where?", "فکر عالیه! کجا؟"),
                ConversationLine("A", "To the mountains north of the city.", "کوه‌های شمال شهر."),
                ConversationLine("B", "Have fun! Take lots of photos.", "خوش بگذره! عکس زیاد بگیر."),
                ConversationLine("A", "I will! See you Monday.", "حتماً! دوشنبه می‌بینمت."),
                ConversationLine("B", "See you!", "می‌بینمت!")
            )),
            storyTitle = "A Perfect Weekend",
            storyText = "Reza loves weekends. On Saturday morning, he's going to play football with his friends. In the afternoon, he's going to visit his parents. On Saturday evening, he's going to watch a movie with his wife. On Sunday, they're going to have a picnic in the park. Reza is very excited about the weekend!",
            quiz = listOf(
                QuizQuestion("معنی Relax؟", listOf("خسته شدن", "استراحت کردن", "کار کردن", "دویدن"), 1),
                QuizQuestion("کدام درست است؟", listOf("I going to stay.", "I'm going to stay.", "I'm go to stay.", "I going stay."), 1),
                QuizQuestion("معنی Picnic؟", listOf("سفر", "پیک‌نیک", "مهمانی", "کمپینگ"), 1),
                QuizQuestion("«او (مونث) می‌خواهد سفر کند.»", listOf("She going to travel.", "She's going to travel.", "She go to travel.", "She going travel."), 1),
                QuizQuestion("معنی Hiking؟", listOf("شنا", "کوه‌پیمایی", "سفر", "پیک‌نیک"), 1),
                QuizQuestion("کدام درست است؟", listOf("We going to watch.", "We're going to watch.", "We're go to watch.", "We going watch."), 1),
                QuizQuestion("معنی Sightseeing؟", listOf("خرید", "گردش", "ورزش", "استراحت"), 1),
                QuizQuestion("«What are you going to do?» یعنی؟", listOf("چیکار کردی؟", "چیکار می‌کنی؟", "چیکار می‌خوای بکنی؟", "چیکار نمی‌کنی؟"), 2)
            )
        ),

        Lesson(
            id = "b13", unitNumber = 13, title = "Home and Neighborhood", titlePersian = "خانه و محله", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("House", "خانه", "haʊs"), Word("Apartment", "آپارتمان", "əˈpɑːrtmənt"),
                Word("Kitchen", "آشپزخانه", "ˈkɪtʃɪn"), Word("Bedroom", "اتاق خواب", "ˈbedruːm"),
                Word("Bathroom", "حمام", "ˈbæθruːm"), Word("Living room", "اتاق نشیمن", "ˈlɪvɪŋ ruːm"),
                Word("Garden", "باغ", "ˈɡɑːrdən"), Word("Balcony", "بالکن", "ˈbælkəni"),
                Word("Garage", "گاراژ", "ɡəˈrɑːʒ"), Word("Furniture", "مبلمان", "ˈfɜːrnɪtʃər"),
                Word("Neighbor", "همسایه", "ˈneɪbər"), Word("Neighborhood", "محله", "ˈneɪbərhʊd"),
                Word("Floor", "طبقه", "flɔːr"), Word("Stairs", "پله", "sterz"),
                Word("Elevator", "آسانسور", "ˈelɪveɪtər"), Word("Roof", "پشت‌بام", "ruːf")
            ),
            spelling = listOf(
                SpellingExercise("apartment", "A - P - A - R - T - M - E - N - T", "آپارتمان"),
                SpellingExercise("neighborhood", "N - E - I - G - H - B - O - R - H - O - O - D", "محله"),
                SpellingExercise("elevator", "E - L - E - V - A - T - O - R", "آسانسور")
            ),
            grammarTitle = "There is / There are + Prepositions",
            grammarExplanation = "📌 There is + مفرد\n• There is a sofa in the living room.\n\n📌 There are + جمع\n• There are two bedrooms.\n\n📌 حروف اضافه مکان\n• in (داخل): in the kitchen\n• on (روی): on the table\n• under (زیر): under the bed\n• next to (کنار): next to the door\n• behind (پشت): behind the house\n• in front of (جلوی): in front of the school\n\n📌 اشتباهات رایج\n❌ There is two beds. → ✅ There are two beds.",
            grammarExamples = listOf(
                "My apartment has two bedrooms.",
                "There is a big kitchen.",
                "The living room is comfortable.",
                "There are flowers in the garden.",
                "The cat is under the table.",
                "The bank is next to the pharmacy."
            ),
            conversation = Conversation("My Home", "خانه من", listOf(
                ConversationLine("A", "Do you live in a house or an apartment?", "خونه زندگی می‌کنی یا آپارتمان؟"),
                ConversationLine("B", "An apartment on the fifth floor.", "آپارتمان توی طبقه پنجم."),
                ConversationLine("A", "How many rooms does it have?", "چند اتاق داره؟"),
                ConversationLine("B", "Three: two bedrooms and a living room.", "سه تا: دو تا اتاق خواب و یه نشیمن."),
                ConversationLine("A", "Is there a balcony?", "بالکن داره؟"),
                ConversationLine("B", "Yes, with a beautiful view.", "بله، با منظره زیبا."),
                ConversationLine("A", "What about the neighborhood?", "محله چطوره؟"),
                ConversationLine("B", "It's quiet and safe. There's a park nearby.", "ساکت و امنه. یه پارک هم نزدیکشه."),
                ConversationLine("A", "That sounds perfect!", "عالی به نظر می‌رسه!"),
                ConversationLine("B", "Yes, I love living there.", "بله، عاشق زندگی اونجام.")
            )),
            storyTitle = "My Dream House",
            storyText = "I want a big house in the future. My dream house has four bedrooms, two bathrooms, and a huge kitchen. There is a beautiful garden with flowers and trees. There is also a small swimming pool in the backyard. The living room is very spacious with big windows. I want my house to be a happy place for my family.",
            quiz = listOf(
                QuizQuestion("معنی Kitchen؟", listOf("اتاق خواب", "آشپزخانه", "حمام", "نشیمن"), 1),
                QuizQuestion("کدام درست است؟", listOf("There is two beds.", "There are two beds.", "There have two beds.", "There has two."), 1),
                QuizQuestion("معنی Balcony؟", listOf("حیاط", "بالکن", "گاراژ", "پشت‌بام"), 1),
                QuizQuestion("«زیر میز» کدام است؟", listOf("on the table", "in the table", "under the table", "next to the table"), 2),
                QuizQuestion("کدام درست است؟", listOf("There are a sofa.", "There is a sofa.", "There have a sofa.", "There has a sofa."), 1),
                QuizQuestion("معنی Neighbor؟", listOf("دوست", "همسایه", "فامیل", "همکار"), 1),
                QuizQuestion("«کنار در» کدام است؟", listOf("on the door", "under the door", "next to the door", "in the door"), 2),
                QuizQuestion("معنی Elevator؟", listOf("پله", "آسانسور", "راهرو", "بالکن"), 1)
            )
        ),

        Lesson(
            id = "b14", unitNumber = 14, title = "Review", titlePersian = "مرور", level = Level.BEGINNER,
            vocabulary = listOf(
                Word("Remember", "به یاد آوردن", "rɪˈmembər"), Word("Practice", "تمرین", "ˈpræktɪs"),
                Word("Learn", "یاد گرفتن", "lɜːrn"), Word("Teach", "یاد دادن", "tiːtʃ"),
                Word("Understand", "فهمیدن", "ˌʌndərˈstænd"), Word("Speak", "صحبت کردن", "spiːk"),
                Word("Listen", "گوش دادن", "ˈlɪsən"), Word("Write", "نوشتن", "raɪt"),
                Word("Read", "خواندن", "riːd"), Word("Study", "درس خواندن", "ˈstʌdi"),
                Word("Repeat", "تکرار کردن", "rɪˈpiːt"), Word("Ask", "پرسیدن", "æsk"),
                Word("Answer", "جواب دادن", "ˈænsər"), Word("Explain", "توضیح دادن", "ɪkˈspleɪn"),
                Word("Review", "مرور کردن", "rɪˈvjuː"), Word("Improve", "بهبود دادن", "ɪmˈpruːv")
            ),
            spelling = listOf(
                SpellingExercise("practice", "P - R - A - C - T - I - C - E", "تمرین"),
                SpellingExercise("understand", "U - N - D - E - R - S - T - A - N - D", "فهمیدن"),
                SpellingExercise("improve", "I - M - P - R - O - V - E", "بهبود دادن")
            ),
            grammarTitle = "Review of Beginner Fundamentals",
            grammarExplanation = "📌 مرور مهم‌ترین ساختارها\n\n۱. a / an + شغل\n• I'm a teacher. / She's an engineer.\n\n۲. do / does\n• What do you do? / What does he do?\n\n۳. جمع اسم‌ها\n• books, cities, children\n\n۴. 's مالکیت\n• Ali's book\n\n۵. at / on / in\n• at 7 AM / on Monday / in May\n\n۶. some / any\n• I have some bread. / Do you have any eggs?\n\n۷. There is / There are\n• There is a book. / There are books.\n\n۸. Going to\n• I'm going to study.",
            grammarExamples = listOf(
                "What do you do? — I'm a teacher.",
                "Where are you from? — I'm from Iran.",
                "How much is this? — It's 10 dollars.",
                "You should rest.",
                "There are two books on the table.",
                "I'm going to visit my family."
            ),
            conversation = Conversation("Review Session", "جلسه مرور", listOf(
                ConversationLine("A", "Hello! How are you?", "سلام! حالت چطوره؟"),
                ConversationLine("B", "I'm fine, thanks. And you?", "خوبم، ممنون. تو چطور؟"),
                ConversationLine("A", "Great! What do you do?", "عالی! شغلت چیه؟"),
                ConversationLine("B", "I'm a teacher. I teach English.", "معلمم. انگلیسی درس می‌دم."),
                ConversationLine("A", "That's nice! Where are you from?", "چه خوب! اهل کجایی؟"),
                ConversationLine("B", "I'm from Iran. And you?", "اهل ایرانم. تو چطور؟"),
                ConversationLine("A", "I'm from Turkey. I'm a student.", "من از ترکیه‌ام. دانش‌آموزم."),
                ConversationLine("B", "Do you speak English well?", "انگلیسی رو خوب صحبت می‌کنی؟"),
                ConversationLine("A", "I'm learning. I practice every day.", "دارم یاد می‌گیرم. هر روز تمرین می‌کنم."),
                ConversationLine("B", "That's the best way to improve!", "بهترین راه برای پیشرفت همینه!")
            )),
            storyTitle = "A Great Start",
            storyText = "You finished the first level! Congratulations! In this level, you learned how to introduce yourself, talk about your job, describe people, talk about your family, tell time, talk about countries, describe clothes, talk about your daily routine, go shopping, talk about food, talk about health, plan your weekend, and describe your home. You should be proud of yourself. Keep practicing every day!",
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."), 1),
                QuizQuestion("معنی Daughter؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1),
                QuizQuestion("What ___ she do?", listOf("do", "does", "is", "are"), 1),
                QuizQuestion("«You ___ rest.»", listOf("should", "shouldn't", "must not", "can't"), 0),
                QuizQuestion("جمع child؟", listOf("childs", "childes", "children", "childrens"), 2),
                QuizQuestion("کدام درست است؟", listOf("in Monday", "on Monday", "at Monday", "Monday in"), 1),
                QuizQuestion("«I have ___ bread.»", listOf("any", "some", "a", "an"), 1),
                QuizQuestion("کدام درست است؟", listOf("There is two books.", "There are two books.", "There have two books.", "There has two."), 1)
            )
        ),// ==================== INTERMEDIATE - TOP NOTCH 1 (10 Lessons) ====================
Lesson(
    id = "i1", unitNumber = 1, title = "Getting Acquainted", titlePersian = "آشنایی", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Introduce", "معرفی کردن", "ˌɪntrəˈduːs"), Word("Neighbor", "همسایه", "ˈneɪbər"),
        Word("Classmate", "همکلاسی", "ˈklæsmeɪt"), Word("Colleague", "همکار", "ˈkɑːliːɡ"),
        Word("Acquaintance", "آشنا", "əˈkweɪntəns"), Word("Nickname", "اسم مستعار", "ˈnɪkneɪm"),
        Word("Last name", "نام خانوادگی", "læst neɪm"), Word("First name", "نام کوچک", "fɜːrst neɪm"),
        Word("Background", "پیشینه", "ˈbækɡraʊnd"), Word("Impression", "تصور", "ɪmˈpreʃən"),
        Word("Similar", "مشابه", "ˈsɪmələr"), Word("Common", "مشترک", "ˈkɑːmən"),
        Word("Interests", "علایق", "ˈɪntrəsts"), Word("Personality", "شخصیت", "ˌpɜːrsəˈnæləti")
    ),
    spelling = listOf(
        SpellingExercise("acquaintance", "A - C - Q - U - A - I - N - T - A - N - C - E", "آشنا"),
        SpellingExercise("colleague", "C - O - L - L - E - A - G - U - E", "همکار"),
        SpellingExercise("personality", "P - E - R - S - O - N - A - L - I - T - Y", "شخصیت")
    ),
    grammarTitle = "Present Perfect with How long / For / Since",
    grammarExplanation = "📌 Present Perfect\nساختار: have/has + past participle (p.p.)\n\n📌 How long...?\n• How long have you known him?\n• I've known him for two years.\n• I've known her since 2020.\n\n📌 For vs Since\n• for + مدت زمان: for two years, for a month, for a long time\n• since + نقطه شروع: since 2020, since Monday, since I was a child\n\n📌 افعال بی‌قاعده مهم\nknow → known | be → been | have → had | see → seen\n\n📌 اشتباهات رایج\n❌ I've known him since 2 years. → ✅ I've known him for 2 years.\n❌ I know him since 2020. → ✅ I've known him since 2020.",
    grammarExamples = listOf(
        "How long have you known your best friend?",
        "I've known him for five years.",
        "She's been my neighbor since 2018.",
        "We've been colleagues for three months.",
        "How long have you lived here? — For two years.",
        "They've been married since 2015."
    ),
    conversation = Conversation("Meeting a New Neighbor", "آشنایی با همسایه جدید", listOf(
        ConversationLine("A", "Hi! Are you new here?", "سلام! تازه اومدی؟"),
        ConversationLine("B", "Yes, I just moved in last week.", "بله، هفته پیش اومدم."),
        ConversationLine("A", "Welcome! I'm Sarah. I live next door.", "خوش اومدی! من سارام. همسایه بغلی‌ام."),
        ConversationLine("B", "Nice to meet you. I'm David.", "از آشنایی خوشحالم. من دیویدم."),
        ConversationLine("A", "How long have you lived in this area?", "چقدره توی این منطقه زندگی می‌کنی؟"),
        ConversationLine("B", "Just a few days. But I've visited before.", "فقط چند روز. ولی قبلاً هم اومده بودم."),
        ConversationLine("A", "Where did you live before?", "قبلاً کجا زندگی می‌کردی؟"),
        ConversationLine("B", "In the city center. For five years.", "مرکز شهر. پنج سال."),
        ConversationLine("A", "Why did you move?", "چرا اومدی؟"),
        ConversationLine("B", "I wanted a quieter neighborhood.", "یه محله آروم‌تر می‌خواستم."),
        ConversationLine("A", "I'm sure you'll like it here.", "مطمئنم اینجا رو دوست داری."),
        ConversationLine("B", "I hope so. Thanks for the warm welcome!", "امیدوارم. ممنون از خوش‌آمدگویی!")
    )),
    storyTitle = "An Old Friendship",
    storyText = "Tom and Alex have been friends for twenty years. They met in college when they were both eighteen. Since then, they have shared many memories. They've traveled together, studied together, and supported each other through difficult times. Alex got married last year, and Tom was his best man. Their friendship is a beautiful example of loyalty and trust.",
    quiz = listOf(
        QuizQuestion("کدام درست است؟", listOf("I've known him since 2 years.", "I've known him for 2 years.", "I know him since 2 years.", "I knowing him for 2 years."), 1),
        QuizQuestion("معنی Colleague چیست؟", listOf("همکلاسی", "همسایه", "همکار", "دوست"), 2),
        QuizQuestion("«since» با کدام می‌آید؟", listOf("two years", "a month", "2020", "a long time"), 2),
        QuizQuestion("ساختار Present Perfect؟", listOf("have/has + verb", "have/has + p.p.", "am/is/are + verb-ing", "did + verb"), 1),
        QuizQuestion("«او دو سال است که اینجا زندگی می‌کند.»", listOf("She lives here since 2 years.", "She has lived here for 2 years.", "She lived here for 2 years.", "She is living here 2 years."), 1),
        QuizQuestion("معنی Acquaintance؟", listOf("دوست صمیمی", "آشنا", "همکار", "همسایه"), 1),
        QuizQuestion("«How long ___ you known her?»", listOf("do", "did", "have", "are"), 2),
        QuizQuestion("p.p. فعل know؟", listOf("knowed", "knew", "known", "knowing"), 2)
    )
),

Lesson(
    id = "i2", unitNumber = 2, title = "Going Shopping", titlePersian = "خرید کردن", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Receipt", "رسید", "rɪˈsiːt"), Word("Refund", "بازپرداخت", "ˈriːfʌnd"),
        Word("Exchange", "تعویض", "ɪksˈtʃeɪndʒ"), Word("Warranty", "گارانتی", "ˈwɔːrənti"),
        Word("Sale", "حراج", "seɪl"), Word("Bargain", "معامله خوب", "ˈbɑːrɡɪn"),
        Word("Fitting room", "اتاق پرو", "ˈfɪtɪŋ ruːm"), Word("Queue", "صف", "kjuː"),
        Word("Quality", "کیفیت", "ˈkwɑːləti"), Word("Brand", "برند", "brænd"),
        Word("Value", "ارزش", "ˈvæljuː"), Word("Overpriced", "گران‌تر از حد", "ˌoʊvərˈpraɪst"),
        Word("Affordable", "مقرون‌به‌صرفه", "əˈfɔːrdəbəl"), Word("Return policy", "قوانین مرجوعی", "rɪˈtɜːrn ˈpɑːləsi")
    ),
    spelling = listOf(
        SpellingExercise("receipt", "R - E - C - E - I - P - T", "رسید"),
        SpellingExercise("warranty", "W - A - R - R - A - N - T - Y", "گارانتی"),
        SpellingExercise("affordable", "A - F - F - O - R - D - A - B - L - E", "مقرون‌به‌صرفه")
    ),
    grammarTitle = "Comparative & Superlative",
    grammarExplanation = "📌 مقایسه بین دو چیز (Comparative)\n• صفت کوتاه: +er + than\n  cheap → cheaper than | tall → taller than\n• صفت بلند: more + صفت + than\n  expensive → more expensive than\n\n📌 بهترین بین چند چیز (Superlative)\n• صفت کوتاه: the + صفت + est\n  cheap → the cheapest\n• صفت بلند: the most + صفت\n  expensive → the most expensive\n\n📌 بی‌قاعده\ngood → better → the best\nbad → worse → the worst\nfar → farther → the farthest\n\n📌 اشتباهات رایج\n❌ This is more cheap. → ✅ This is cheaper.\n❌ She is the most tall. → ✅ She is the tallest.",
    grammarExamples = listOf(
        "This shirt is cheaper than that one.",
        "This is the most expensive jacket.",
        "She's the best customer.",
        "London is bigger than Paris.",
        "This is the worst restaurant in town.",
        "My new phone is better than my old one."
    ),
    conversation = Conversation("Exchanging a Product", "تعویض کالا", listOf(
        ConversationLine("A", "I'd like to exchange this shirt.", "می‌خوام این پیراهن رو تعویض کنم."),
        ConversationLine("B", "Sure. Do you have the receipt?", "حتماً. رسید داری؟"),
        ConversationLine("A", "Yes, here it is. It's too small.", "بله، بفرما. خیلی کوچیکه."),
        ConversationLine("B", "Would you like a larger size?", "سایز بزرگ‌تر می‌خوای؟"),
        ConversationLine("A", "Yes, please. Do you have it in blue?", "بله، لطفاً. آبی‌اش رو دارید؟"),
        ConversationLine("B", "Let me check. What size do you need?", "بذار چک کنم. چه سایزی لازم داری؟"),
        ConversationLine("A", "Medium, please.", "مدیوم، لطفاً."),
        ConversationLine("B", "Here you go. Try it on in the fitting room.", "بفرما. توی اتاق پرو امتحان کن."),
        ConversationLine("A", "It fits perfectly! Thank you.", "عالی اندازه‌ست! ممنون."),
        ConversationLine("B", "You're welcome. Sorry for the inconvenience.", "خواهش می‌کنم. بابت زحمت معذرت.")
    )),
    storyTitle = "The Best Bargain",
    storyText = "Last Saturday, Maria went shopping for a new coat. She visited five different stores. The first store was too expensive. The second had a limited selection. The third was closed for renovation. In the fourth, she found a beautiful coat, but it wasn't her size. Finally, in the fifth store, she found the perfect coat at 40% off. It was the best bargain she had ever found!",
    quiz = listOf(
        QuizQuestion("معنی Refund؟", listOf("تعویض", "بازپرداخت", "تخفیف", "گارانتی"), 1),
        QuizQuestion("کدام درست است؟", listOf("This is more cheap.", "This is cheaper.", "This is cheapest.", "This is the cheap."), 1),
        QuizQuestion("صفت تفضیلی good؟", listOf("gooder", "more good", "better", "best"), 2),
        QuizQuestion("معنی Affordable؟", listOf("گران", "مقرون‌به‌صرفه", "بی‌کیفیت", "قدیمی"), 1),
        QuizQuestion("کدام درست است؟", listOf("She is the most tall.", "She is the tallest.", "She is taller than all.", "She tallest."), 1),
        QuizQuestion("معنی Warranty؟", listOf("تخفیف", "گارانتی", "رسید", "برند"), 1),
        QuizQuestion("صفت برتر bad؟", listOf("bader", "more bad", "worse", "worst"), 2),
        QuizQuestion("کدام درست است؟", listOf("This is the most expensive.", "This is more expensive the.", "This is expensive most.", "This is most expensive than."), 0)
    )
),

Lesson(
    id = "i3", unitNumber = 3, title = "Planning a Trip", titlePersian = "برنامه‌ریزی سفر", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Reservation", "رزرو", "ˌrezərˈveɪʃən"), Word("Itinerary", "برنامه سفر", "aɪˈtɪnəreri"),
        Word("Destination", "مقصد", "ˌdestɪˈneɪʃən"), Word("Departure", "حرکت", "dɪˈpɑːrtʃər"),
        Word("Arrival", "ورود", "əˈraɪvəl"), Word("Luggage", "چمدان", "ˈlʌɡɪdʒ"),
        Word("Passport", "پاسپورت", "ˈpæspɔːrt"), Word("Boarding pass", "کارت پرواز", "ˈbɔːrdɪŋ pæs"),
        Word("Flight", "پرواز", "flaɪt"), Word("Delay", "تأخیر", "dɪˈleɪ"),
        Word("Customs", "گمرک", "ˈkʌstəmz"), Word("Souvenir", "سوغات", "ˌsuːvəˈnɪr"),
        Word("Accommodation", "اقامتگاه", "əˌkɑːməˈdeɪʃən"), Word("Sightseeing", "گردش", "ˈsaɪtsiːɪŋ")
    ),
    spelling = listOf(
        SpellingExercise("reservation", "R - E - S - E - R - V - A - T - I - O - N", "رزرو"),
        SpellingExercise("itinerary", "I - T - I - N - E - R - A - R - Y", "برنامه سفر"),
        SpellingExercise("accommodation", "A - C - C - O - M - M - O - D - A - T - I - O - N", "اقامتگاه")
    ),
    grammarTitle = "Future: Will vs Going to",
    grammarExplanation = "📌 Will: تصمیم لحظه‌ای / پیش‌بینی\n• I'll help you. (همین الان تصمیم گرفتم)\n• It will rain tomorrow. (پیش‌بینی)\n\n📌 Going to: برنامه قبلی\n• I'm going to travel to Turkey next summer.\n• She's going to visit her family.\n\n📌 سوال و منفی\n• Will you come? — No, I won't.\n• Are you going to come? — No, I'm not.\n\n📌 اشتباهات رایج\n❌ I will to travel. → ✅ I will travel.\n❌ She will travels. → ✅ She will travel.",
    grammarExamples = listOf(
        "I'm going to travel to Turkey next summer.",
        "We'll book the hotel tomorrow.",
        "She's going to visit her family.",
        "I think it will be sunny tomorrow.",
        "What are you going to do on your trip?",
        "I'll call you when I arrive."
    ),
    conversation = Conversation("At the Travel Agency", "در آژانس مسافرتی", listOf(
        ConversationLine("A", "Where are you going to travel this year?", "امسال کجا می‌خوای سفر کنی؟"),
        ConversationLine("B", "I'm going to visit Italy.", "می‌خوام ایتالیا برم."),
        ConversationLine("A", "How long will you stay?", "چقدر می‌مونی؟"),
        ConversationLine("B", "I'll stay for two weeks.", "دو هفته می‌مونم."),
        ConversationLine("A", "Have you booked your flight?", "پروازت رو رزرو کردی؟"),
        ConversationLine("B", "Not yet. I'm going to book it tomorrow.", "نه هنوز. فردا رزرو می‌کنم."),
        ConversationLine("A", "Do you need help with hotels?", "برای هتل‌ها کمک لازم داری؟"),
        ConversationLine("B", "Yes, please. Something affordable.", "بله، لطفاً. یه چیز مقرون‌به‌صرفه."),
        ConversationLine("A", "I'll send you some options today.", "امروز چند تا گزینه برات می‌فرستم."),
        ConversationLine("B", "Perfect. Thank you so much!", "عالی. خیلی ممنون!")
    )),
    storyTitle = "The Perfect Trip",
    storyText = "John is planning a trip to Spain. He's going to visit Barcelona and Madrid. He's going to stay for ten days. He has already booked his flight and hotel. He'll take a train between the two cities. He's going to visit many famous landmarks. He'll also try local food and buy souvenirs for his family. He can't wait for his trip!",
    quiz = listOf(
        QuizQuestion("معنی Luggage؟", listOf("پاسپورت", "چمدان", "بلیط", "مقصد"), 1),
        QuizQuestion("کدام برای برنامه قبلی درست است؟", listOf("I will travel.", "I'm going to travel.", "I travel.", "I traveling."), 1),
        QuizQuestion("معنی Departure؟", listOf("ورود", "حرکت", "تأخیر", "گمرک"), 1),
        QuizQuestion("کدام درست است؟", listOf("I will to travel.", "I will travel.", "I will traveling.", "I will travels."), 1),
        QuizQuestion("«I'll help you» یعنی؟", listOf("قبلاً تصمیم گرفتم", "تصمیم لحظه‌ای", "برنامه قبلی", "سوال"), 1),
        QuizQuestion("معنی Accommodation؟", listOf("حمل و نقل", "اقامتگاه", "بلیط", "گمرک"), 1),
        QuizQuestion("کدام درست است؟", listOf("She will visits.", "She will visit.", "She will to visit.", "She will visiting."), 1),
        QuizQuestion("معنی Souvenir؟", listOf("سوغات", "پاسپورت", "چمدان", "مقصد"), 0)
    )
),

Lesson(
    id = "i4", unitNumber = 4, title = "Food and Restaurants", titlePersian = "غذا و رستوران", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Appetizer", "پیش‌غذا", "ˈæpɪtaɪzər"), Word("Main course", "غذای اصلی", "meɪn kɔːrs"),
        Word("Dessert", "دسر", "dɪˈzɜːrt"), Word("Menu", "منو", "ˈmenjuː"),
        Word("Waiter", "گارسون", "ˈweɪtər"), Word("Bill", "صورت‌حساب", "bɪl"),
        Word("Tip", "انعام", "tɪp"), Word("Reservation", "رزرو", "ˌrezərˈveɪʃən"),
        Word("Recommend", "پیشنهاد کردن", "ˌrekəˈmend"), Word("Delicious", "خوشمزه", "dɪˈlɪʃəs"),
        Word("Spicy", "تند", "ˈspaɪsi"), Word("Vegetarian", "گیاه‌خوار", "ˌvedʒəˈteriən"),
        Word("Ingredient", "ماده اولیه", "ɪnˈɡriːdiənt"), Word("Recipe", "دستور پخت", "ˈresəpi")
    ),
    spelling = listOf(
        SpellingExercise("appetizer", "A - P - P - E - T - I - Z - E - R", "پیش‌غذا"),
        SpellingExercise("recommend", "R - E - C - O - M - M - E - N - D", "پیشنهاد کردن"),
        SpellingExercise("vegetarian", "V - E - G - E - T - A - R - I - A - N", "گیاه‌خوار")
    ),
    grammarTitle = "Would like + Infinitive | Polite Requests",
    grammarExplanation = "📌 درخواست مؤدبانه\nI would like (I'd like) a coffee.\nI'd like to make a reservation.\n\n📌 سوال مؤدبانه\nWould you like some dessert?\nWould you like to see the menu?\n\n📌 تفاوت want و would like\n• I want coffee. (مستقیم)\n• I'd like coffee. (مؤدبانه) ✅\n\n📌 Could / Would for requests\n• Could I have the bill, please?\n• Would you bring me some water?\n\n📌 اشتباهات رایج\n❌ I want to make reservation. → ✅ I'd like to make a reservation.",
    grammarExamples = listOf(
        "I'd like to make a reservation for two.",
        "Would you like to see the menu?",
        "We'd like the bill, please.",
        "Could I have some water, please?",
        "I'd like the chicken, please.",
        "Would you like dessert?"
    ),
    conversation = Conversation("At a Fancy Restaurant", "در رستوران شیک", listOf(
        ConversationLine("A", "Good evening. Do you have a reservation?", "شب بخیر. رزرو دارید؟"),
        ConversationLine("B", "Yes, a table for two under the name Sara.", "بله، میزی برای دو نفر به نام سارا."),
        ConversationLine("A", "This way, please. Here's your menu.", "از این طرف، لطفاً. بفرمایید منو."),
        ConversationLine("B", "Thank you. What do you recommend?", "ممنون. چی پیشنهاد می‌کنید؟"),
        ConversationLine("A", "The grilled chicken is excellent tonight.", "مرغ گریل امشب عالیه."),
        ConversationLine("B", "Sounds good. I'd like that, please.", "خوبه. اون رو می‌خوام، لطفاً."),
        ConversationLine("A", "Would you like an appetizer?", "پیش‌غذا می‌خواید؟"),
        ConversationLine("B", "Yes, a garden salad, please.", "بله، سالاد باغ، لطفاً."),
        ConversationLine("A", "And to drink?", "و برای نوشیدن؟"),
        ConversationLine("B", "Just water, please. And the bill later.", "فقط آب، لطفاً. و بعداً صورت‌حساب.")
    )),
    storyTitle = "A Memorable Dinner",
    storyText = "Last Friday, Anna went to an Italian restaurant for her anniversary. The atmosphere was romantic, with soft music and candlelight. The waiter recommended the seafood pasta. Anna ordered it and loved every bite. Her husband had a steak with vegetables. For dessert, they shared a tiramisu. The service was excellent, so they left a generous tip.",
    quiz = listOf(
        QuizQuestion("معنی Appetizer؟", listOf("غذای اصلی", "دسر", "پیش‌غذا", "نوشیدنی"), 2),
        QuizQuestion("کدام مؤدبانه‌تر است؟", listOf("I want coffee.", "I'd like coffee.", "Give me coffee.", "Coffee!"), 1),
        QuizQuestion("معنی Recommend؟", listOf("سفارش دادن", "پیشنهاد کردن", "پختن", "خوردن"), 1),
        QuizQuestion("«Could I have the bill?» یعنی؟", listOf("منو کجاست؟", "صورت‌حساب لطفاً", "غذا آماده‌ست؟", "میز خالیه؟"), 1),
        QuizQuestion("معنی Spicy؟", listOf("شیرین", "تند", "ترش", "شور"), 1),
        QuizQuestion("کدام درست است؟", listOf("I'd like make a reservation.", "I'd like to make a reservation.", "I would like make reservation.", "I like to make reservation."), 1),
        QuizQuestion("معنی Vegetarian؟", listOf("گوشت‌خوار", "گیاه‌خوار", "سرآشپز", "گارسون"), 1),
        QuizQuestion("«Would you like dessert?» یعنی؟", listOf("دسر داری؟", "دسر می‌خوای؟", "دسر خوردی؟", "دسر چیه؟"), 1)
    )
),

Lesson(
    id = "i5", unitNumber = 5, title = "Around Town", titlePersian = "گشت در شهر", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Downtown", "مرکز شهر", "ˌdaʊnˈtaʊn"), Word("Suburb", "حومه شهر", "ˈsʌbɜːrb"),
        Word("Intersection", "چهارراه", "ˌɪntərˈsekʃən"), Word("Traffic light", "چراغ راهنما", "ˈtræfɪk laɪt"),
        Word("Crosswalk", "خط عابر", "ˈkrɔːswɔːk"), Word("Sidewalk", "پیاده‌رو", "ˈsaɪdwɔːk"),
        Word("Landmark", "نقطه شاخص", "ˈlændmɑːrk"), Word("Neighborhood", "محله", "ˈneɪbərhʊd"),
        Word("Roundabout", "میدان", "ˈraʊndəbaʊt"), Word("Block", "بلوک", "blɑːk"),
        Word("Corner", "گوشه", "ˈkɔːrnər"), Word("Opposite", "روبروی", "ˈɑːpəzɪt"),
        Word("Nearby", "نزدیک", "ˌnɪrˈbaɪ"), Word("Distance", "فاصله", "ˈdɪstəns")
    ),
    spelling = listOf(
        SpellingExercise("intersection", "I - N - T - E - R - S - E - C - T - I - O - N", "چهارراه"),
        SpellingExercise("landmark", "L - A - N - D - M - A - R - K", "نقطه شاخص"),
        SpellingExercise("roundabout", "R - O - U - N - D - A - B - O - U - T", "میدان")
    ),
    grammarTitle = "Imperatives for Directions | Prepositions of Place",
    grammarExplanation = "📌 Imperatives (امری)\n• Turn left / Turn right\n• Go straight\n• Go past the bank\n• Take the second right\n• It's on your left / right\n\n📌 Prepositions of Place\n• on: on the corner, on Main Street\n• at: at the traffic light\n• in: in the neighborhood\n• next to: next to the bank\n• between: between the bank and the park\n• across from: across from the school\n• opposite: opposite the museum\n\n📌 اشتباهات رایج\n❌ Turn in the left. → ✅ Turn left.\n❌ It's in your right. → ✅ It's on your right.",
    grammarExamples = listOf(
        "Go straight for two blocks.",
        "Turn left at the traffic light.",
        "The museum is on your right.",
        "The bank is next to the pharmacy.",
        "The park is across from the school.",
        "Take the second right, then go straight."
    ),
    conversation = Conversation("Asking for Directions", "پرسیدن مسیر", listOf(
        ConversationLine("A", "Excuse me, how do I get to the museum?", "ببخشید، چطور به موزه برم؟"),
        ConversationLine("B", "Go straight for two blocks.", "دو بلوک مستقیم برو."),
        ConversationLine("A", "Then what?", "بعدش چی؟"),
        ConversationLine("B", "Turn left at the traffic light.", "سر چراغ راهنما بپیچ چپ."),
        ConversationLine("A", "Is it far?", "دوره؟"),
        ConversationLine("B", "About ten minutes on foot.", "حدود ده دقیقه پیاده."),
        ConversationLine("A", "Is there a landmark?", "نقطه شاخصی هست؟"),
        ConversationLine("B", "Yes, it's opposite the big park.", "بله، روبروی پارک بزرگه."),
        ConversationLine("A", "Thank you so much!", "خیلی ممنون!"),
        ConversationLine("B", "You're welcome. Enjoy your visit!", "خواهش می‌کنم. از بازدیدت لذت ببر!")
    )),
    storyTitle = "Lost in the City",
    storyText = "Sarah was new in the city. She wanted to visit the famous art museum but got lost. She stopped at a corner and asked a kind man for directions. He told her to go straight for three blocks, turn right at the roundabout, and then turn left at the second traffic light. The museum was across from a beautiful fountain. Sarah followed his directions and arrived in fifteen minutes.",
    quiz = listOf(
        QuizQuestion("معنی Intersection؟", listOf("پیاده‌رو", "چهارراه", "خیابان", "میدان"), 1),
        QuizQuestion("کدام درست است؟", listOf("Turn in the left.", "Turn left.", "Turn on left.", "Left turn on."), 1),
        QuizQuestion("معنی Landmark؟", listOf("فاصله", "نقطه شاخص", "بلوک", "گوشه"), 1),
        QuizQuestion("«روبروی» به انگلیسی؟", listOf("next to", "between", "opposite", "behind"), 2),
        QuizQuestion("کدام درست است؟", listOf("It's in your right.", "It's on your right.", "It's at your right.", "It's your right."), 1),
        QuizQuestion("معنی Roundabout؟", listOf("چهارراه", "میدان", "پل", "تونل"), 1),
        QuizQuestion("«Go straight» یعنی؟", listOf("بپیچ", "مستقیم برو", "بایست", "برگرد"), 1),
        QuizQuestion("معنی Nearby؟", listOf("دور", "نزدیک", "وسط", "کنار"), 1)
    )
),

Lesson(
    id = "i6", unitNumber = 6, title = "Shopping for Clothes", titlePersian = "خرید لباس", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Fit", "اندازه بودن", "fɪt"), Word("Suit", "مناسب بودن", "suːt"),
        Word("Match", "هماهنگ بودن", "mætʃ"), Word("Trend", "مد روز", "trend"),
        Word("Style", "سبک", "staɪl"), Word("Pattern", "طرح", "ˈpætərn"),
        Word("Fabric", "پارچه", "ˈfæbrɪk"), Word("Accessories", "اکسسوری", "əkˈsesəriz"),
        Word("Tailor", "خیاط", "ˈteɪlər"), Word("Alteration", "تغییر", "ˌɔːltəˈreɪʃən"),
        Word("Outfit", "ست لباس", "ˈaʊtfɪt"), Word("Formal", "رسمی", "ˈfɔːrməl"),
        Word("Casual", "غیررسمی", "ˈkæʒuəl"), Word("Vintage", "قدیمی و خاص", "ˈvɪntɪdʒ")
    ),
    spelling = listOf(
        SpellingExercise("accessories", "A - C - C - E - S - S - O - R - I - E - S", "اکسسوری"),
        SpellingExercise("tailor", "T - A - I - L - O - R", "خیاط"),
        SpellingExercise("casual", "C - A - S - U - A - L", "غیررسمی")
    ),
    grammarTitle = "Too / Enough | So / Such",
    grammarExplanation = "📌 too + صفت (خیلی زیاد - منفی)\n• This dress is too expensive.\n• These shoes are too tight.\n\n📌 صفت + enough (به اندازه کافی)\n• The shirt is big enough.\n\n📌 not + صفت + enough (کافی نیست)\n• The jacket is not warm enough.\n\n📌 So / Such\n• This dress is so beautiful!\n• It's such a beautiful dress!\n\n📌 اشتباهات رایج\n❌ This shirt is too much small. → ✅ This shirt is too small.\n❌ It's so a beautiful dress. → ✅ It's such a beautiful dress.",
    grammarExamples = listOf(
        "This dress is too expensive.",
        "These shoes are too tight.",
        "I don't have enough time.",
        "This coat is warm enough for winter.",
        "It's such a beautiful outfit!",
        "The dress is so elegant!"
    ),
    conversation = Conversation("At the Fitting Room", "در اتاق پرو", listOf(
        ConversationLine("A", "How does it fit?", "چطور اندازه‌ست؟"),
        ConversationLine("B", "It's too tight. Do you have a larger size?", "تنگه. سایز بزرگ‌تر دارید؟"),
        ConversationLine("A", "Sure. Which color?", "حتماً. چه رنگی؟"),
        ConversationLine("B", "Black. It matches everything.", "مشکی. با همه چی هماهنگه."),
        ConversationLine("A", "Here's the black one in large.", "اینم مشکی سایز لارج."),
        ConversationLine("B", "It fits perfectly! I'll take it.", "عالی اندازه‌ست! می‌خرمش."),
        ConversationLine("A", "Would you like to see any accessories?", "اکسسوری هم می‌خواید ببینید؟"),
        ConversationLine("B", "Yes, a matching belt, please.", "بله، یه کمربند هماهنگ، لطفاً."),
        ConversationLine("A", "This one suits you very well.", "این خیلی بهت میاد."),
        ConversationLine("B", "Perfect! I'll take both.", "عالی! هر دو رو می‌خرم.")
    )),
    storyTitle = "The Perfect Outfit",
    storyText = "It was Mary's first day at her new job. She wanted to look professional but also comfortable. She tried on five different outfits. The first was too formal. The second was too casual. The third was too colorful. The fourth was too plain. Finally, she chose a navy blue blazer with matching pants and a simple white blouse. It was the perfect balance between formal and comfortable.",
    quiz = listOf(
        QuizQuestion("معنی Fit؟", listOf("طرح", "اندازه بودن", "پارچه", "مد"), 1),
        QuizQuestion("کدام درست است؟", listOf("This shirt is too small.", "This shirt is small too.", "This shirt is very too small.", "This shirt is much small."), 0),
        QuizQuestion("«enough» بعد از کدام می‌آید؟", listOf("فعل", "صفت", "قید", "حرف اضافه"), 1),
        QuizQuestion("معنی Outfit؟", listOf("لباس زیر", "ست لباس", "کاپشن", "شلوار"), 1),
        QuizQuestion("کدام درست است؟", listOf("It's so a nice dress.", "It's such a nice dress.", "It's a such nice dress.", "It's nice so a dress."), 1),
        QuizQuestion("معنی Vintage؟", listOf("جدید", "قدیمی و خاص", "ارزان", "گران"), 1),
        QuizQuestion("«not enough» یعنی؟", listOf("بیش از حد", "به اندازه کافی", "کافی نیست", "خیلی زیاد"), 2),
        QuizQuestion("معنی Tailor؟", listOf("فروشنده", "خیاط", "طراح", "مشتری"), 1)
    )
),

Lesson(
    id = "i7", unitNumber = 7, title = "Having Fun", titlePersian = "تفریح", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Entertainment", "سرگرمی", "ˌentərˈteɪnmənt"), Word("Performance", "اجرا", "pərˈfɔːrməns"),
        Word("Concert", "کنسرت", "ˈkɑːnsərt"), Word("Audience", "تماشاگران", "ˈɔːdiəns"),
        Word("Ticket", "بلیط", "ˈtɪkɪt"), Word("Amusement park", "شهربازی", "əˈmjuːzmənt pɑːrk"),
        Word("Enjoyable", "لذت‌بخش", "ɪnˈdʒɔɪəbəl"), Word("Boring", "خسته‌کننده", "ˈbɔːrɪŋ"),
        Word("Exciting", "هیجان‌انگیز", "ɪkˈsaɪtɪŋ"), Word("Relaxing", "آرامش‌بخش", "rɪˈlæksɪŋ"),
        Word("Thrilling", "هیجان‌آور", "ˈθrɪlɪŋ"), Word("Crowded", "شلوغ", "ˈkraʊdɪd"),
        Word("Stand-up comedy", "استندآپ کمدی", "ˈstænd ʌp ˈkɑːmədi"), Word("Museum", "موزه", "mjuˈziːəm")
    ),
    spelling = listOf(
        SpellingExercise("entertainment", "E - N - T - E - R - T - A - I - N - M - E - N - T", "سرگرمی"),
        SpellingExercise("audience", "A - U - D - I - E - N - C - E", "تماشاگران"),
        SpellingExercise("performance", "P - E - R - F - O - R - M - A - N - C - E", "اجرا")
    ),
    grammarTitle = "Gerunds after Prepositions | Like / Enjoy + -ing",
    grammarExplanation = "📌 بعد از حرف اضافه، فعل + ing\n• interested in learning\n• good at singing\n• think about going\n• afraid of flying\n\n📌 افعالی که با -ing می‌آیند\n• like / love / enjoy / hate + verb-ing\n  I enjoy watching movies.\n  She loves playing the piano.\n\n📌 اشتباهات رایج\n❌ I'm interested in watch movies. → ✅ I'm interested in watching movies.\n❌ I enjoy to watch movies. → ✅ I enjoy watching movies.",
    grammarExamples = listOf(
        "I'm interested in watching movies.",
        "She's good at playing the piano.",
        "We're thinking about going to the concert.",
        "I enjoy reading books.",
        "He loves traveling to new places.",
        "They're afraid of flying."
    ),
    conversation = Conversation("Planning Entertainment", "برنامه‌ریزی تفریح", listOf(
        ConversationLine("A", "What do you do for fun?", "برای تفریح چیکار می‌کنی؟"),
        ConversationLine("B", "I'm interested in watching theater.", "به دیدن تئاتر علاقه دارم."),
        ConversationLine("A", "I love going to concerts.", "عاشق کنسرتم."),
        ConversationLine("B", "There's a concert this weekend.", "این آخر هفته یه کنسرت هست."),
        ConversationLine("A", "Really? What kind of music?", "واقعاً؟ چه نوع موسیقی؟"),
        ConversationLine("B", "Classical. Are you interested in that?", "کلاسیک. به اون علاقه داری؟"),
        ConversationLine("A", "Yes, I enjoy listening to classical music.", "بله، از گوش دادن به موسیقی کلاسیک لذت می‌برم."),
        ConversationLine("B", "Great! Let's go together.", "عالی! بیا با هم بریم."),
        ConversationLine("A", "Should we buy tickets in advance?", "باید بلیط رو از قبل بخریم؟"),
        ConversationLine("B", "Yes, it might be crowded.", "بله، ممکنه شلوغ بشه.")
    )),
    storyTitle = "A Night at the Theater",
    storyText = "Last Saturday, David went to the theater with his wife. They watched a famous play called Hamlet. The performance was thrilling and the audience loved it. The actors were incredibly talented. After the show, they went to a nearby restaurant for dinner. They discussed the play for hours. David said it was the most enjoyable evening he had had in months.",
    quiz = listOf(
        QuizQuestion("معنی Audience؟", listOf("بازیگر", "تماشاگران", "کارگردان", "نویسنده"), 1),
        QuizQuestion("کدام درست است؟", listOf("I'm interested in watch.", "I'm interested in watching.", "I'm interested to watching.", "I'm interested watching."), 1),
        QuizQuestion("بعد از «enjoy» چه شکلی می‌آید؟", listOf("to + verb", "verb-ing", "verb ساده", "p.p."), 1),
        QuizQuestion("معنی Thrilling؟", listOf("خسته‌کننده", "هیجان‌آور", "آرامش‌بخش", "غمگین"), 1),
        QuizQuestion("کدام درست است؟", listOf("I enjoy to read.", "I enjoy reading.", "I enjoy read.", "I enjoy to reading."), 1),
        QuizQuestion("معنی Crowded؟", listOf("خلوت", "شلوغ", "بزرگ", "کوچک"), 1),
        QuizQuestion("بعد از «good at» چه می‌آید؟", listOf("verb", "to verb", "verb-ing", "p.p."), 2),
        QuizQuestion("معنی Performance؟", listOf("تماشاگر", "اجرا", "بلیط", "سالن"), 1)
    )
),

Lesson(
    id = "i8", unitNumber = 8, title = "Health Matters", titlePersian = "مسائل سلامتی", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Symptom", "نشانه", "ˈsɪmptəm"), Word("Prescription", "نسخه", "prɪˈskrɪpʃən"),
        Word("Appointment", "قرار ملاقات", "əˈpɔɪntmənt"), Word("Emergency", "اورژانس", "ɪˈmɜːrdʒənsi"),
        Word("Allergy", "حساسیت", "ˈælərdʒi"), Word("Injury", "آسیب", "ˈɪndʒəri"),
        Word("Treatment", "درمان", "ˈtriːtmənt"), Word("Recovery", "بهبودی", "rɪˈkʌvəri"),
        Word("Diagnosis", "تشخیص", "ˌdaɪəɡˈnoʊsɪs"), Word("Surgery", "جراحی", "ˈsɜːrdʒəri"),
        Word("Vaccine", "واکسن", "vækˈsiːn"), Word("Chronic", "مزمن", "ˈkrɑːnɪk"),
        Word("Bleeding", "خونریزی", "ˈbliːdɪŋ"), Word("Fracture", "شکستگی", "ˈfræktʃər")
    ),
    spelling = listOf(
        SpellingExercise("prescription", "P - R - E - S - C - R - I - P - T - I - O - N", "نسخه"),
        SpellingExercise("emergency", "E - M - E - R - G - E - N - C - Y", "اورژانس"),
        SpellingExercise("diagnosis", "D - I - A - G - N - O - S - I - S", "تشخیص")
    ),
    grammarTitle = "Should have / Could have / Would have",
    grammarExplanation = "📌 Should have + p.p.\nباید (ولی انجام ندادی) - پشیمانی\n• You should have taken your medicine.\n• I should have gone to the doctor earlier.\n\n📌 Could have + p.p.\nمی‌توانستی (ولی نکردی) - امکان از دست رفته\n• She could have gone to the hospital earlier.\n• We could have prevented this.\n\n📌 Would have + p.p.\n(در شرطی نوع سوم)\n• I would have helped if you had called.\n\n📌 اشتباهات رایج\n❌ You should saw a doctor. → ✅ You should have seen a doctor.",
    grammarExamples = listOf(
        "You should have taken your medicine.",
        "She could have gone to the hospital earlier.",
        "I should have made an appointment sooner.",
        "We could have prevented the injury.",
        "He should have rested more after the surgery."
    ),
    conversation = Conversation("At the Doctor's Office", "در مطب دکتر", listOf(
        ConversationLine("A", "Good morning. What brings you here today?", "صبح بخیر. امروز چی شما رو آورد؟"),
        ConversationLine("B", "I've had a bad cough and a fever for a week.", "یه هفته‌ست سرفه شدید و تب دارم."),
        ConversationLine("A", "Any other symptoms?", "علائم دیگه‌ای هم داری؟"),
        ConversationLine("B", "Yes, a sore throat and a headache.", "بله، گلودرد و سردرد."),
        ConversationLine("A", "You should have come sooner.", "باید زودتر می‌اومدی."),
        ConversationLine("B", "I know. I thought it would go away.", "می‌دونم. فکر کردم خوب می‌شه."),
        ConversationLine("A", "I'll prescribe you some medicine.", "برات دارو تجویز می‌کنم."),
        ConversationLine("B", "Should I rest at home?", "باید خونه استراحت کنم؟"),
        ConversationLine("A", "Yes, for at least three days.", "بله، حداقل سه روز."),
        ConversationLine("B", "Thank you, doctor.", "ممنون دکتر.")
    )),
    storyTitle = "A Lesson Learned",
    storyText = "James ignored his symptoms for two weeks. He thought it was just a common cold. He should have seen a doctor earlier. By the time he went, the infection had gotten worse. He could have prevented the situation by taking better care of himself. He needed a stronger treatment and more recovery time. Now he always listens to his body.",
    quiz = listOf(
        QuizQuestion("معنی Prescription؟", listOf("نسخه", "قرار", "درمان", "علائم"), 0),
        QuizQuestion("کدام درست است؟", listOf("You should saw a doctor.", "You should have seen a doctor.", "You should have saw.", "You should seen."), 1),
        QuizQuestion("«Should have» یعنی؟", listOf("باید بکنم", "باید می‌کردم", "می‌توانستم", "می‌خواهم"), 1),
        QuizQuestion("معنی Surgery؟", listOf("درمان", "جراحی", "واکسن", "تشخیص"), 1),
        QuizQuestion("«Could have» یعنی؟", listOf("باید می‌کردم", "می‌توانستم بکنم", "می‌خواهم بکنم", "نمی‌توانم"), 1),
        QuizQuestion("معنی Chronic؟", listOf("حاد", "مزمن", "موقت", "خفیف"), 1),
        QuizQuestion("کدام درست است؟", listOf("I should went.", "I should have gone.", "I should have went.", "I should go have."), 1),
        QuizQuestion("معنی Recovery؟", listOf("بیماری", "بهبودی", "درمان", "جراحی"), 1)
    )
),

Lesson(
    id = "i9", unitNumber = 9, title = "Home and Away", titlePersian = "خانه و سفر", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Rent", "اجاره", "rent"), Word("Lease", "قرارداد اجاره", "liːs"),
        Word("Landlord", "صاحب‌خانه", "ˈlændlɔːrd"), Word("Furnished", "مبله", "ˈfɜːrnɪʃt"),
        Word("Utilities", "قبض‌های خانه", "juːˈtɪlətiz"), Word("Deposit", "ودیعه", "dɪˈpɑːzɪt"),
        Word("Roommate", "هم‌اتاقی", "ˈruːmmeɪt"), Word("Move in", "اسباب‌کشی کردن", "muːv ɪn"),
        Word("Tenant", "مستأجر", "ˈtenənt"), Word("Property", "ملک", "ˈprɑːpərti"),
        Word("Mortgage", "وام مسکن", "ˈmɔːrɡɪdʒ"), Word("Renovation", "بازسازی", "ˌrenəˈveɪʃən"),
        Word("Sublet", "اجاره دادن", "ˌsʌbˈlet"), Word("Vacant", "خالی", "ˈveɪkənt")
    ),
    spelling = listOf(
        SpellingExercise("furnished", "F - U - R - N - I - S - H - E - D", "مبله"),
        SpellingExercise("utilities", "U - T - I - L - I - T - I - E - S", "قبض‌های خانه"),
        SpellingExercise("renovation", "R - E - N - O - V - A - T - I - O - N", "بازسازی")
    ),
    grammarTitle = "Present Perfect vs Past Simple",
    grammarExplanation = "📌 Past Simple - زمان مشخص گذشته\n• I moved here last year.\n• When did you move in?\n• She bought a house in 2020.\n\n📌 Present Perfect - زمان نامشخص\n• I've lived here for two years.\n• Have you ever lived abroad?\n• She's just moved.\n\n📌 کلمات نشانه\n• Past Simple: yesterday, last week, in 2020, ago\n• Present Perfect: for, since, ever, never, just, already, yet\n\n📌 اشتباهات رایج\n❌ I've moved here in 2020. → ✅ I moved here in 2020.\n❌ When have you moved? → ✅ When did you move?",
    grammarExamples = listOf(
        "I moved here last year.",
        "I've lived in this apartment for two years.",
        "When did you move in?",
        "Have you ever lived abroad?",
        "She bought her house in 2020.",
        "They've been neighbors since 2018."
    ),
    conversation = Conversation("Looking for an Apartment", "دنبال آپارتمان", listOf(
        ConversationLine("A", "Hi, I'm calling about the apartment for rent.", "سلام، برای آپارتمان اجاره‌ای تماس گرفتم."),
        ConversationLine("B", "Sure! What would you like to know?", "حتماً! چی می‌خواید بدونید؟"),
        ConversationLine("A", "Is it furnished?", "مبله‌ست؟"),
        ConversationLine("B", "Yes, fully furnished.", "بله، کاملاً مبله."),
        ConversationLine("A", "How much is the deposit?", "ودیعه چقدره؟"),
        ConversationLine("B", "Two months' rent.", "دو ماه اجاره."),
        ConversationLine("A", "Are utilities included?", "قبض‌ها هم شامل می‌شه؟"),
        ConversationLine("B", "Water and electricity, yes.", "آب و برق، بله."),
        ConversationLine("A", "When can I see it?", "کِی می‌تونم ببینمش؟"),
        ConversationLine("B", "How about tomorrow at 5 PM?", "فردا ساعت ۵ چطوره؟")
    )),
    storyTitle = "A New Home",
    storyText = "Elena recently moved to a new city. She had lived in her old apartment for ten years. She sold most of her furniture and bought new things. She found a beautiful apartment with a view of the park. It's smaller than her old place, but it feels much cozier. She's been decorating it for weeks. She wants it to feel like home.",
    quiz = listOf(
        QuizQuestion("معنی Landlord؟", listOf("همسایه", "صاحب‌خانه", "هم‌اتاقی", "مستأجر"), 1),
        QuizQuestion("کدام درست است؟", listOf("I've moved here in 2020.", "I moved here in 2020.", "I have moved here 2020.", "I moving here."), 1),
        QuizQuestion("«for» با کدام می‌آید؟", listOf("Past Simple", "Present Perfect", "Future", "Past Continuous"), 1),
        QuizQuestion("معنی Furnished؟", listOf("خالی", "مبله", "بزرگ", "کوچک"), 1),
        QuizQuestion("«When ___ you move?»", listOf("have", "has", "did", "do"), 2),
        QuizQuestion("معنی Utilities؟", listOf("اجاره", "ودیعه", "قبض‌ها", "قرارداد"), 2),
        QuizQuestion("کدام درست است؟", listOf("I've lived here since 3 years.", "I've lived here for 3 years.", "I live here since 3 years.", "I'm living here 3 years."), 1),
        QuizQuestion("معنی Deposit؟", listOf("اجاره", "ودیعه", "قبض", "قرارداد"), 1)
    )
),

Lesson(
    id = "i10", unitNumber = 10, title = "Getting Along", titlePersian = "کنار آمدن", level = Level.INTERMEDIATE,
    vocabulary = listOf(
        Word("Argue", "بحث کردن", "ˈɑːrɡjuː"), Word("Agree", "موافق بودن", "əˈɡriː"),
        Word("Disagree", "مخالف بودن", "ˌdɪsəˈɡriː"), Word("Compromise", "سازش", "ˈkɑːmprəmaɪz"),
        Word("Apologize", "عذرخواهی", "əˈpɑːlədʒaɪz"), Word("Forgive", "بخشیدن", "fərˈɡɪv"),
        Word("Get along", "کنار آمدن", "ɡet əˈlɔːŋ"), Word("Misunderstanding", "سوءتفاهم", "ˌmɪsʌndərˈstændɪŋ"),
        Word("Respect", "احترام", "rɪˈspekt"), Word("Trust", "اعتماد", "trʌst"),
        Word("Patience", "صبر", "ˈpeɪʃəns"), Word("Negotiate", "مذاکره کردن", "nɪˈɡoʊʃieɪt"),
        Word("Reconcile", "آشتی کردن", "ˈrekənsaɪl"), Word("Conflict", "تعارض", "ˈkɑːnflɪkt")
    ),
    spelling = listOf(
        SpellingExercise("misunderstanding", "M - I - S - U - N - D - E - R - S - T - A - N - D - I - N - G", "سوءتفاهم"),
        SpellingExercise("apologize", "A - P - O - L - O - G - I - Z - E", "عذرخواهی"),
        SpellingExercise("negotiate", "N - E - G - O - T - I - A - T - E", "مذاکره کردن")
    ),
    grammarTitle = "Reported Speech with Say and Tell",
    grammarExplanation = "📌 Say + (that) + جمله\n• She said she was tired.\n• He said he would come.\n\n📌 Tell + شخص + (that) + جمله\n• She told me she was tired.\n• He told us he would come.\n\n📌 تغییر زمان در نقل قول غیرمستقیم\n• Present → Past\n  \"I am busy.\" → He said he was busy.\n• Will → Would\n  \"I will come.\" → She said she would come.\n\n📌 اشتباهات رایج\n❌ He said me he was tired. → ✅ He told me he was tired.\n❌ She told that she was tired. → ✅ She said she was tired.",
    grammarExamples = listOf(
        "He said he didn't agree with me.",
        "She told me she was sorry.",
        "They said they would compromise.",
        "He told us he needed more time.",
        "She said she was going to apologize.",
        "They told me they had forgiven each other."
    ),
    conversation = Conversation("Resolving a Disagreement", "حل اختلاف", listOf(
        ConversationLine("A", "I'm upset about yesterday.", "از دیروز ناراحتم."),
        ConversationLine("B", "I'm sorry. I didn't mean to hurt you.", "متأسفم. قصد نداشتم."),
        ConversationLine("A", "You said you would help me.", "گفتی کمکم می‌کنی."),
        ConversationLine("B", "You're right. I should have been there.", "حق داری. باید اونجا می‌بودم."),
        ConversationLine("A", "I felt really alone.", "واقعاً احساس تنهایی کردم."),
        ConversationLine("B", "I understand. Can we compromise?", "می‌فهمم. می‌تونیم سازش کنیم؟"),
        ConversationLine("A", "What do you suggest?", "چی پیشنهاد می‌کنی؟"),
        ConversationLine("B", "Let me make it up to you this weekend.", "بذار این آخر هفته جبران کنم."),
        ConversationLine("A", "Alright. I forgive you.", "باشه. می‌بخشمت."),
        ConversationLine("B", "Thank you. You're a good friend.", "ممنون. تو دوست خوبی هستی.")
    )),
    storyTitle = "Learning to Get Along",
    storyText = "Mark and Lisa are roommates. Last week, they had a big misunderstanding about cleaning. Mark said he had cleaned the kitchen, but Lisa told him she had cleaned it. They both argued for hours. Finally, they decided to compromise. They made a cleaning schedule. Now they take turns and respect each other's space. They've become better friends because of it.",
    quiz = listOf(
        QuizQuestion("معنی Compromise؟", listOf("بحث", "سازش", "عذرخواهی", "بخشش"), 1),
        QuizQuestion("کدام درست است؟", listOf("He said me he was tired.", "He told me he was tired.", "He said to me he tired.", "He told that tired."), 1),
        QuizQuestion("«Tell» با کدام می‌آید؟", listOf("جمله مستقیم", "شخص", "حرف اضافه", "زمان"), 1),
        QuizQuestion("معنی Apologize؟", listOf("بخشیدن", "عذرخواهی", "بحث کردن", "سازش"), 1),
        QuizQuestion("کدام درست است؟", listOf("She said she will come.", "She said she would come.", "She said she come.", "She says she would come."), 1),
        QuizQuestion("معنی Forgive؟", listOf("بخشیدن", "فراموش کردن", "ناراحت شدن", "عذرخواهی"), 0),
        QuizQuestion("«Get along» یعنی؟", listOf("دعوا کردن", "کنار آمدن", "جدا شدن", "سفر کردن"), 1),
        QuizQuestion("کدام درست است؟", listOf("She told that she was tired.", "She said she was tired.", "She said me she was tired.", "She told she was tired."), 1)
    )
),        // ==================== ADVANCED - TOP NOTCH 2 (10 Lessons) ====================
        Lesson(
            id = "a1", unitNumber = 1, title = "Cultural Literacy", titlePersian = "آگاهی فرهنگی", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Culture", "فرهنگ", "ˈkʌltʃər"), Word("Tradition", "سنت", "trəˈdɪʃən"),
                Word("Custom", "رسم و رسوم", "ˈkʌstəm"), Word("Society", "جامعه", "səˈsaɪəti"),
                Word("Diversity", "تنوع", "dɪˈvɜːrsəti"), Word("Heritage", "میراث", "ˈherɪtɪdʒ"),
                Word("Etiquette", "آداب معاشرت", "ˈetɪket"), Word("Taboo", "تابو", "təˈbuː"),
                Word("Ritual", "آیین", "ˈrɪtʃuəl"), Word("Values", "ارزش‌ها", "ˈvæljuːz"),
                Word("Identity", "هویت", "aɪˈdentəti"), Word("Multicultural", "چندفرهنگی", "ˌmʌltiˈkʌltʃərəl"),
                Word("Stereotype", "کلیشه", "ˈsteriətaɪp"), Word("Prejudice", "تعصب", "ˈpredʒədɪs")
            ),
            spelling = listOf(
                SpellingExercise("etiquette", "E - T - I - Q - U - E - T - T - E", "آداب معاشرت"),
                SpellingExercise("diversity", "D - I - V - E - R - S - I - T - Y", "تنوع"),
                SpellingExercise("heritage", "H - E - R - I - T - A - G - E", "میراث")
            ),
            grammarTitle = "Present Perfect Continuous",
            grammarExplanation = "📌 ساختار\nhave/has + been + verb-ing\n\n📌 کاربرد\nبرای کارهایی که در گذشته شروع شده و تا حالا ادامه دارند:\n• I've been studying English for three years.\n• She's been living in Tokyo since 2019.\n• How long have you been working here?\n\n📌 تفاوت با Present Perfect ساده\n• I've read the book. (تمام شد)\n• I've been reading the book. (ادامه دارد)\n\n📌 اشتباهات رایج\n❌ I've studying English. → ✅ I've been studying English.\n❌ I has been studying. → ✅ I have been studying.",
            grammarExamples = listOf(
                "I've been studying English for three years.",
                "She's been living in Tokyo since 2019.",
                "How long have you been working here?",
                "They've been traveling around Asia for months.",
                "He's been learning Japanese since last year.",
                "We've been waiting for two hours."
            ),
            conversation = Conversation("Discussing Cultural Differences", "بحث درباره تفاوت‌های فرهنگی", listOf(
                ConversationLine("A", "Have you noticed any cultural differences here?", "تفاوت‌های فرهنگی‌ای اینجا متوجه شدی؟"),
                ConversationLine("B", "Yes, I've been learning a lot.", "بله، دارم خیلی یاد می‌گیرم."),
                ConversationLine("A", "What surprised you most?", "چی بیشتر تعجبت کرد؟"),
                ConversationLine("B", "The food etiquette and table manners.", "آداب غذا خوردن و رفتار سر میز."),
                ConversationLine("A", "How long have you been living abroad?", "چقدره خارج زندگی می‌کنی؟"),
                ConversationLine("B", "For two years now.", "دو ساله."),
                ConversationLine("A", "Have you experienced any culture shock?", "شوک فرهنگی تجربه کردی؟"),
                ConversationLine("B", "Definitely. Especially in the beginning.", "قطعاً. مخصوصاً اولش."),
                ConversationLine("A", "What helped you adapt?", "چی به سازگاری‌ت کمک کرد؟"),
                ConversationLine("B", "Making local friends and being open-minded.", "دوست پیدا کردن با مردم محلی و ذهن باز.")
            )),
            storyTitle = "Bridging Cultures",
            storyText = "Maria has been working in Japan for three years. At first, she struggled with the language and customs. She's been learning Japanese since her arrival, and she's made many local friends. She's learned that bowing is a sign of respect, that shoes are removed indoors, and that gift-giving has many rules. She's been teaching her Japanese colleagues about her own culture too. She believes that understanding each other is the key to a peaceful world.",
            quiz = listOf(
                QuizQuestion("معنی Etiquette؟", listOf("فرهنگ", "آداب معاشرت", "سنت", "زبان"), 1),
                QuizQuestion("کدام درست است؟", listOf("I've studying English.", "I've been studying English.", "I has been studying.", "I have be studying."), 1),
                QuizQuestion("ساختار Present Perfect Continuous؟", listOf("have/has + p.p.", "have/has + been + verb-ing", "am/is/are + verb-ing", "did + verb"), 1),
                QuizQuestion("«since» با کدام می‌آید؟", listOf("three years", "two months", "2019", "a long time"), 2),
                QuizQuestion("معنی Diversity؟", listOf("یکنواختی", "تنوع", "اختلاف", "شباهت"), 1),
                QuizQuestion("کدام درست است؟", listOf("How long you been working?", "How long have you been working?", "How long you working?", "How long are you working?"), 1),
                QuizQuestion("معنی Stereotype؟", listOf("واقعیت", "کلیشه", "حقیقت", "داستان"), 1),
                QuizQuestion("تفاوت Present Perfect و Continuous؟", listOf("هیچ فرقی ندارند", "Continuous ادامه دارد", "Perfect ادامه دارد", "هر دو تمام شده"), 1),
                QuizQuestion("«He's been learning Japanese» یعنی؟", listOf("یاد گرفت و تمام", "دارد یاد می‌گیرد", "یاد نگرفت", "خواهد گرفت"), 1),
                QuizQuestion("معنی Heritage؟", listOf("میراث", "ثروت", "ساختمان", "کتاب"), 0)
            )
        ),

        Lesson(
            id = "a2", unitNumber = 2, title = "Shopping and Consumerism", titlePersian = "خرید و مصرف‌گرایی", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Consumer", "مصرف‌کننده", "kənˈsuːmər"), Word("Brand", "برند", "brænd"),
                Word("Advertisement", "تبلیغات", "ˌædvərˈtaɪzmənt"), Word("Budget", "بودجه", "ˈbʌdʒɪt"),
                Word("Impulse buying", "خرید لحظه‌ای", "ˈɪmpʌls ˈbaɪɪŋ"), Word("Quality", "کیفیت", "ˈkwɑːləti"),
                Word("Warranty", "گارانتی", "ˈwɔːrənti"), Word("Bargain hunter", "شکارچی تخفیف", "ˈbɑːrɡɪn ˈhʌntər"),
                Word("Marketing", "بازاریابی", "ˈmɑːrkɪtɪŋ"), Word("Loyalty", "وفاداری", "ˈlɔɪəlti"),
                Word("Sustainable", "پایدار", "səˈsteɪnəbəl"), Word("Ethical", "اخلاقی", "ˈeθɪkəl"),
                Word("Counterfeit", "تقلبی", "ˈkaʊntərfɪt"), Word("Luxury", "لوکس", "ˈlʌkʃəri")
            ),
            spelling = listOf(
                SpellingExercise("consumerism", "C - O - N - S - U - M - E - R - I - S - M", "مصرف‌گرایی"),
                SpellingExercise("advertisement", "A - D - V - E - R - T - I - S - E - M - E - N - T", "تبلیغات"),
                SpellingExercise("sustainable", "S - U - S - T - A - I - N - A - B - L - E", "پایدار")
            ),
            grammarTitle = "Too / Enough / Not enough",
            grammarExplanation = "📌 too + صفت/قید (خیلی زیاد - منفی)\n• This watch is too expensive.\n• He drives too fast.\n\n📌 صفت/قید + enough (به اندازه کافی)\n• The car is small enough for the city.\n• She speaks loudly enough.\n\n📌 not + صفت + enough (کافی نیست)\n• This apartment is not big enough.\n\n📌 تفاوت too و very\n• too = بیش از حد (منفی)\n• very = خیلی (خنثی)\n\n📌 اشتباهات رایج\n❌ It's too much expensive. → ✅ It's too expensive.\n❌ It's enough big. → ✅ It's big enough.",
            grammarExamples = listOf(
                "This watch is too expensive.",
                "The car is small enough for the city.",
                "This apartment is not big enough.",
                "She's too young to drive.",
                "The coffee is hot enough now.",
                "I don't have enough money to buy it."
            ),
            conversation = Conversation("Talking About Shopping Habits", "عادت‌های خرید", listOf(
                ConversationLine("A", "I've become a smart shopper recently.", "اخیراً خریدار باهوشی شده‌ام."),
                ConversationLine("B", "What changed?", "چی عوض شد؟"),
                ConversationLine("A", "I used to buy on impulse. Now I plan.", "قبلاً لحظه‌ای می‌خریدم. حالا برنامه‌ریزی می‌کنم."),
                ConversationLine("B", "That's a great habit!", "عادت عالیه!"),
                ConversationLine("A", "I've been tracking my expenses.", "هزینه‌هامو پیگیری می‌کنم."),
                ConversationLine("B", "Do you think advertising affects us too much?", "فکر می‌کنی تبلیغات زیاد روی ما اثر می‌ذاره؟"),
                ConversationLine("A", "Definitely. We're constantly being manipulated.", "قطعاً. مدام داریم دستکاری می‌شیم."),
                ConversationLine("B", "So how do you avoid it?", "پس چطور ازش دوری می‌کنی؟"),
                ConversationLine("A", "I ask myself: do I really need this?", "از خودم می‌پرسم: واقعاً لازمش دارم؟"),
                ConversationLine("B", "I should learn from you.", "باید از تو یاد بگیرم.")
            )),
            storyTitle = "The Impulse Purchase",
            storyText = "Sarah went to the mall for one item: a gift for her mother. She saw a big sale sign and entered the store. Everything was discounted and beautifully displayed. Without thinking, she bought three pairs of shoes, two handbags, and a dress she didn't need. When she got home, she realized she had spent her entire monthly budget. She felt guilty and decided to be more mindful of her spending in the future.",
            quiz = listOf(
                QuizQuestion("معنی Consumer؟", listOf("فروشنده", "مصرف‌کننده", "تولیدکننده", "برند"), 1),
                QuizQuestion("کدام درست است؟", listOf("It's expensive too.", "It's too expensive.", "It's very too expensive.", "It's much expensive."), 1),
                QuizQuestion("«enough» کجای جمله می‌آید؟", listOf("قبل از صفت", "بعد از صفت", "قبل از فعل", "بعد از حرف اضافه"), 1),
                QuizQuestion("معنی Impulse buying؟", listOf("خرید برنامه‌ریزی شده", "خرید لحظه‌ای", "خرید اقتصادی", "خرید آنلاین"), 1),
                QuizQuestion("تفاوت too و very؟", listOf("هیچ فرقی ندارند", "too منفی، very خنثی", "very منفی، too خنثی", "too برای فعل"), 1),
                QuizQuestion("کدام درست است؟", listOf("It's enough big.", "It's big enough.", "It's big too enough.", "Enough it's big."), 1),
                QuizQuestion("معنی Counterfeit؟", listOf("اصل", "تقلبی", "لوکس", "ارزان"), 1),
                QuizQuestion("کدام درست است؟", listOf("She's too young.", "She's young too.", "She's very too young.", "She's too much young."), 0)
            )
        ),

        Lesson(
            id = "a3", unitNumber = 3, title = "Personal Care and Appearance", titlePersian = "مراقبت شخصی و ظاهر", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Appearance", "ظاهر", "əˈpɪrəns"), Word("Cosmetic", "آرایشی", "kɑːzˈmetɪk"),
                Word("Grooming", "آراستگی", "ˈɡruːmɪŋ"), Word("Hygiene", "بهداشت", "ˈhaɪdʒiːn"),
                Word("Moisturizer", "مرطوب‌کننده", "ˈmɔɪstʃəraɪzər"), Word("Sunscreen", "ضد آفتاب", "ˈsʌnskriːn"),
                Word("Makeover", "تغییر چهره", "ˈmeɪkoʊvər"), Word("Confidence", "اعتماد به نفس", "ˈkɑːnfɪdəns"),
                Word("Wellness", "سلامتی", "ˈwelnəs"), Word("Skincare", "مراقبت پوست", "ˈskɪnker"),
                Word("Posture", "وضعیت بدن", "ˈpɑːstʃər"), Word("Groomed", "آراسته", "ɡruːmd"),
                Word("Effortless", "بی‌زحمت", "ˈefərtləs"), Word("Elegant", "شیک", "ˈeləɡənt")
            ),
            spelling = listOf(
                SpellingExercise("appearance", "A - P - P - E - A - R - A - N - C - E", "ظاهر"),
                SpellingExercise("moisturizer", "M - O - I - S - T - U - R - I - Z - E - R", "مرطوب‌کننده"),
                SpellingExercise("grooming", "G - R - O - O - M - I - N - G", "آراستگی")
            ),
            grammarTitle = "Causative: Have / Get Something Done",
            grammarExplanation = "📌 ساختار\nhave/get + مفعول + past participle\n\n📌 کاربرد\nوقتی کسی دیگر برای ما کاری انجام می‌دهد:\n• I had my hair cut yesterday. (آرایشگر موهام رو کوتاه کرد)\n• She gets her nails done every week.\n• We had our house painted last month.\n\n📌 تفاوت با ساختار عادی\n• I cut my hair. (خودم کوتاه کردم)\n• I had my hair cut. (کسی دیگر کوتاه کرد)\n\n📌 اشتباهات رایج\n❌ I had cut my hair. → ✅ I had my hair cut.",
            grammarExamples = listOf(
                "I had my hair cut yesterday.",
                "She gets her nails done every week.",
                "We had our house painted last month.",
                "He's having his suit dry-cleaned.",
                "They got their photos taken professionally.",
                "I need to get my eyes tested."
            ),
            conversation = Conversation("Talking About Self-Care", "مراقبت از خود", listOf(
                ConversationLine("A", "You look great today!", "امروز عالی به نظر می‌رسی!"),
                ConversationLine("B", "Thanks! I had my hair cut.", "ممنون! موهامو کوتاه کردم."),
                ConversationLine("A", "It really suits you!", "واقعاً بهت میاد!"),
                ConversationLine("B", "I also started a new skincare routine.", "یه روتین مراقبت پوست جدید هم شروع کردم."),
                ConversationLine("A", "What do you use?", "چی استفاده می‌کنی؟"),
                ConversationLine("B", "Just a gentle cleanser and moisturizer.", "فقط یه شوینده ملایم و مرطوب‌کننده."),
                ConversationLine("A", "Do you use sunscreen?", "ضدآفتاب هم استفاده می‌کنی؟"),
                ConversationLine("B", "Every single day. It's essential.", "هر روز. ضروریه."),
                ConversationLine("A", "I should take better care of myself.", "باید بهتر از خودم مراقبت کنم."),
                ConversationLine("B", "Small habits make a big difference.", "عادت‌های کوچک تفاوت بزرگی می‌سازن.")
            )),
            storyTitle = "A Change for the Better",
            storyText = "David used to neglect his appearance. He wore old clothes and never took care of his skin. One day, he decided to make a change. He got his hair cut by a professional stylist. He bought some quality skincare products. He started exercising regularly and improved his posture. Over time, his confidence grew. People noticed the difference, but most importantly, he felt better about himself.",
            quiz = listOf(
                QuizQuestion("معنی Confidence؟", listOf("خجالت", "اعتماد به نفس", "غرور", "ترس"), 1),
                QuizQuestion("کدام درست است؟", listOf("I cut my hair yesterday.", "I had my hair cut yesterday.", "I have cut hair yesterday.", "I had cut my hair."), 1),
                QuizQuestion("ساختار Causative؟", listOf("have + verb", "have + p.p.", "have + مفعول + p.p.", "have + to verb"), 2),
                QuizQuestion("معنی Skincare؟", listOf("مراقبت مو", "مراقبت پوست", "آرایش", "بهداشت"), 1),
                QuizQuestion("«She gets her nails done» یعنی؟", listOf("خودش ناخنهاش رو درست کرد", "کسی دیگر ناخنهاش رو درست کرد", "ناخن مصنوعی داره", "ناخن نداره"), 1),
                QuizQuestion("معنی Grooming؟", listOf("آراستگی", "بهداشت", "ورزش", "غذا"), 0),
                QuizQuestion("کدام درست است؟", listOf("I had paint my house.", "I had my house painted.", "I had painted my house.", "I my house had painted."), 1),
                QuizQuestion("معنی Posture؟", listOf("وضعیت بدن", "ظاهر", "آرایش", "لباس"), 0)
            )
        ),

        Lesson(
            id = "a4", unitNumber = 4, title = "Modern Technology", titlePersian = "تکنولوژی مدرن", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Artificial Intelligence", "هوش مصنوعی", "ˌɑːrtɪˈfɪʃəl ɪnˈtelɪdʒəns"),
                Word("Algorithm", "الگوریتم", "ˈælɡərɪðəm"),
                Word("Encryption", "رمزنگاری", "ɪnˈkrɪpʃən"),
                Word("Cybersecurity", "امنیت سایبری", "ˌsaɪbərsɪˈkjʊrəti"),
                Word("Cloud storage", "ذخیره ابری", "klaʊd ˈstɔːrɪdʒ"),
                Word("Bandwidth", "پهنای باند", "ˈbændwɪdθ"),
                Word("Interface", "رابط کاربری", "ˈɪntərfeɪs"),
                Word("Automation", "اتوماسیون", "ˌɔːtəˈmeɪʃən"),
                Word("Data breach", "نقض داده", "ˈdeɪtə briːtʃ"),
                Word("Malware", "بدافزار", "ˈmælwer"),
                Word("Innovation", "نوآوری", "ˌɪnəˈveɪʃən"),
                Word("Virtual", "مجازی", "ˈvɜːrtʃuəl"),
                Word("Network", "شبکه", "ˈnetwɜːrk"),
                Word("Device", "دستگاه", "dɪˈvaɪs")
            ),
            spelling = listOf(
                SpellingExercise("algorithm", "A - L - G - O - R - I - T - H - M", "الگوریتم"),
                SpellingExercise("cybersecurity", "C - Y - B - E - R - S - E - C - U - R - I - T - Y", "امنیت سایبری"),
                SpellingExercise("encryption", "E - N - C - R - Y - P - T - I - O - N", "رمزنگاری")
            ),
            grammarTitle = "Modals of Deduction | Must, Might, Can't",
            grammarExplanation = "📌 بیان حدس و گمان\n\n📌 must be = قطعاً هست (اطمینان بالا)\n• The data must be encrypted.\n• She must be tired after that trip.\n\n📌 might/may/could be = ممکنه باشه (احتمال)\n• AI might replace some jobs in the future.\n• He might be working from home today.\n\n📌 can't be = غیرممکنه (اطمینان منفی)\n• That can't be true!\n• She can't be serious.\n\n📌 اشتباهات رایج\n❌ That must to be true. → ✅ That must be true.\n❌ He can't be knows. → ✅ He can't know.",
            grammarExamples = listOf(
                "The data must be encrypted.",
                "AI might replace some jobs in the future.",
                "That can't be true!",
                "She must be very smart to solve this.",
                "The password could be compromised.",
                "He might not have received the message."
            ),
            conversation = Conversation("Discussing AI and Technology", "بحث درباره هوش مصنوعی و تکنولوژی", listOf(
                ConversationLine("A", "Will AI change our lives dramatically?", "آیا AI زندگی ما رو به‌شدت تغییر می‌ده؟"),
                ConversationLine("B", "It must be already happening.", "قطعاً همین الان داره اتفاق میفته."),
                ConversationLine("A", "I'm worried about cybersecurity.", "نگران امنیت سایبریم."),
                ConversationLine("B", "Encryption must be much stronger.", "رمزنگاری باید خیلی قوی‌تر باشه."),
                ConversationLine("A", "What about job automation?", "اتوماسیون شغل‌ها چطور؟"),
                ConversationLine("B", "It might create new opportunities.", "ممکنه فرصت‌های جدیدی هم ایجاد کنه."),
                ConversationLine("A", "Could AI be dangerous?", "آیا AI می‌تونه خطرناک باشه؟"),
                ConversationLine("B", "It depends on how we use it.", "بستگی داره چطور استفاده کنیم."),
                ConversationLine("A", "Should governments regulate it?", "دولت‌ها باید قانون‌گذاری کنن؟"),
                ConversationLine("B", "Absolutely. It can't be left unregulated.", "قطعاً. نمی‌شه بدون قانون ولش کرد.")
            )),
            storyTitle = "The AI Revolution",
            storyText = "Artificial intelligence has been transforming industries for years. It's changing how we work, communicate, and solve problems. Some people fear that AI might take their jobs, while others believe it will create new opportunities. Cybersecurity experts are working hard to protect our data from breaches. The future of technology must be shaped by responsible innovation and ethical guidelines.",
            quiz = listOf(
                QuizQuestion("معنی Encryption؟", listOf("رمزنگاری", "الگوریتم", "امنیت", "اتوماسیون"), 0),
                QuizQuestion("کدام درست است؟", listOf("That must to be true.", "That must be true.", "That musts be true.", "That be must true."), 1),
                QuizQuestion("«might» یعنی چه سطحی از احتمال؟", listOf("قطعاً", "ممکنه", "غیرممکن", "باید"), 1),
                QuizQuestion("معنی Cybersecurity؟", listOf("امنیت سایبری", "رمزنگاری", "شبکه", "الگوریتم"), 0),
                QuizQuestion("«can't be» یعنی؟", listOf("قطعاً هست", "ممکنه باشه", "غیرممکنه باشه", "باید باشه"), 2),
                QuizQuestion("معنی Innovation؟", listOf("اختراع", "نوآوری", "تخریب", "کپی"), 1),
                QuizQuestion("کدام درست است؟", listOf("He can't be knows.", "He can't know.", "He can't to know.", "He can't knowing."), 1),
                QuizQuestion("معنی Data breach؟", listOf("امنیت داده", "نقض داده", "ذخیره داده", "بازیابی داده"), 1)
            )
        ),

        Lesson(
            id = "a5", unitNumber = 5, title = "Holidays and Celebrations", titlePersian = "تعطیلات و جشن‌ها", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Celebration", "جشن", "ˌselɪˈbreɪʃən"), Word("Ceremony", "مراسم", "ˈserəmoʊni"),
                Word("Anniversary", "سالگرد", "ˌænɪˈvɜːrsəri"), Word("Festival", "فستیوال", "ˈfestɪvəl"),
                Word("Decoration", "تزئینات", "ˌdekəˈreɪʃən"), Word("Fireworks", "آتش‌بازی", "ˈfaɪərwɜːrks"),
                Word("Tradition", "سنت", "trəˈdɪʃən"), Word("Gathering", "گردهمایی", "ˈɡæðərɪŋ"),
                Word("Customary", "عرفی", "ˈkʌstəmeri"), Word("Commemorate", "گرامی داشتن", "kəˈmeməreɪt"),
                Word("Feast", "ضیافت", "fiːst"), Word("Parade", "رژه", "pəˈreɪd"),
                Word("Ritual", "آیین", "ˈrɪtʃuəl"), Word("Festive", "جشنی", "ˈfestɪv")
            ),
            spelling = listOf(
                SpellingExercise("celebration", "C - E - L - E - B - R - A - T - I - O - N", "جشن"),
                SpellingExercise("anniversary", "A - N - N - I - V - E - R - S - A - R - Y", "سالگرد"),
                SpellingExercise("commemorate", "C - O - M - M - E - M - O - R - A - T - E", "گرامی داشتن")
            ),
            grammarTitle = "Passive Voice (Present and Past)",
            grammarExplanation = "📌 ساختار مجهول\nbe + past participle (p.p.)\n\n📌 حال ساده مجهول\nis/are + p.p.\n• Nowruz is celebrated in many countries.\n• The gifts are opened on Christmas morning.\n\n📌 گذشته ساده مجهول\nwas/were + p.p.\n• The party was organized by my sister.\n• The fireworks were set off at midnight.\n\n📌 کاربرد\nوقتی فاعل مهم نیست یا مشخص نیست.\n\n📌 اشتباهات رایج\n❌ Nowruz celebrated in Iran. → ✅ Nowruz is celebrated in Iran.",
            grammarExamples = listOf(
                "Nowruz is celebrated in many countries.",
                "The party was organized by my sister.",
                "Fireworks are set off at midnight.",
                "The tradition has been passed down for centuries.",
                "Special food is prepared for the feast.",
                "Gifts were exchanged at the ceremony."
            ),
            conversation = Conversation("Discussing Celebrations", "بحث درباره جشن‌ها", listOf(
                ConversationLine("A", "How is Nowruz celebrated in Iran?", "نوروز در ایران چطور جشن گرفته می‌شه؟"),
                ConversationLine("B", "The house is cleaned before the new year.", "خونه قبل از سال نو تمیز می‌شه."),
                ConversationLine("A", "What special food is prepared?", "چه غذای خاصی آماده می‌شه؟"),
                ConversationLine("B", "Many dishes are cooked, like sabzi polo.", "غذاهای زیادی پخته می‌شه، مثل سبزی پلو."),
                ConversationLine("A", "Are gifts given?", "هدیه داده می‌شه؟"),
                ConversationLine("B", "Yes, money is usually given to children.", "بله، معمولاً به بچه‌ها پول داده می‌شه."),
                ConversationLine("A", "What about the Haft-Seen table?", "سفره هفت‌سین چطور؟"),
                ConversationLine("B", "It's beautifully decorated with seven symbolic items.", "با هفت آیتم نمادین زیبا تزئین می‌شه."),
                ConversationLine("A", "That sounds fascinating!", "چه جالب!"),
                ConversationLine("B", "It's my favorite tradition!", "محبوب‌ترین سنت منه!")
            )),
            storyTitle = "A Memorable Celebration",
            storyText = "Last year, Maria's wedding was held in a beautiful garden. The ceremony was attended by over a hundred guests. Elegant decorations were placed everywhere. Traditional music was played throughout the evening. A delicious feast was served, and the cake was cut at midnight. Photos were taken all night long. It was a celebration that will never be forgotten.",
            quiz = listOf(
                QuizQuestion("معنی Ceremony؟", listOf("جشن", "مراسم", "فستیوال", "سالگرد"), 1),
                QuizQuestion("کدام مجهول درست است؟", listOf("Nowruz celebrated in Iran.", "Nowruz is celebrated in Iran.", "Nowruz is celebrate in Iran.", "Nowruz celebrating in Iran."), 1),
                QuizQuestion("ساختار مجهول حال ساده؟", listOf("is/are + verb", "is/are + p.p.", "has/have + p.p.", "was/were + p.p."), 1),
                QuizQuestion("معنی Commemorate؟", listOf("جشن گرفتن", "گرامی داشتن", "فراموش کردن", "تزئین کردن"), 1),
                QuizQuestion("«The party was organized» یعنی؟", listOf("مهمانی برگزار کرد", "مهمانی برگزار شد", "مهمانی برگزار می‌شود", "مهمانی برگزار خواهد شد"), 1),
                QuizQuestion("معنی Feast؟", listOf("روزه", "ضیافت", "جشن", "رژه"), 1),
                QuizQuestion("کدام درست است؟", listOf("Gifts was exchanged.", "Gifts were exchanged.", "Gifts exchange.", "Gifts exchanging."), 1),
                QuizQuestion("معنی Parade؟", listOf("ضیافت", "رژه", "آتش‌بازی", "تزئین"), 1)
            )
        ),

        Lesson(
            id = "a6", unitNumber = 6, title = "Eating Well", titlePersian = "تغذیه سالم", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Nutrition", "تغذیه", "nuˈtrɪʃən"), Word("Calorie", "کالری", "ˈkæləri"),
                Word("Protein", "پروتئین", "ˈproʊtiːn"), Word("Carbohydrate", "کربوهیدرات", "ˌkɑːrboʊˈhaɪdreɪt"),
                Word("Balanced diet", "رژیم متعادل", "ˈbælənst ˈdaɪət"), Word("Organic", "ارگانیک", "ɔːrˈɡænɪk"),
                Word("Processed food", "غذای فرآوری‌شده", "ˈprɑːsest fuːd"), Word("Portion", "سهم", "ˈpɔːrʃən"),
                Word("Vitamin", "ویتامین", "ˈvaɪtəmɪn"), Word("Fiber", "فیبر", "ˈfaɪbər"),
                Word("Sugar-free", "بدون شکر", "ˈʃʊɡər friː"), Word("Whole grain", "غلات کامل", "hoʊl ɡreɪn"),
                Word("Supplements", "مکمل‌ها", "ˈsʌpləmənts"), Word("Metabolism", "سوخت‌وساز", "məˈtæbəlɪzəm")
            ),
            spelling = listOf(
                SpellingExercise("nutrition", "N - U - T - R - I - T - I - O - N", "تغذیه"),
                SpellingExercise("carbohydrate", "C - A - R - B - O - H - Y - D - R - A - T - E", "کربوهیدرات"),
                SpellingExercise("metabolism", "M - E - T - A - B - O - L - I - S - M", "سوخت‌وساز")
            ),
            grammarTitle = "Quantifiers | A few, A little, A lot of",
            grammarExplanation = "📌 a few + اسم قابل شمارش\n• I eat a few vegetables every day.\n\n📌 a little + اسم غیرقابل شمارش\n• She drinks a little coffee in the morning.\n\n📌 a lot of / lots of + هر دو\n• They consume a lot of processed food.\n\n📌 few / little (بدون a) = منفی (کم)\n• Few people eat a balanced diet. (تعداد کم - منفی)\n• He has little time. (زمان کم - منفی)\n\n📌 اشتباهات رایج\n❌ I eat a little vegetables. → ✅ I eat a few vegetables.",
            grammarExamples = listOf(
                "I eat a few vegetables every day.",
                "She drinks a little coffee in the morning.",
                "They consume a lot of processed food.",
                "Few people get enough exercise.",
                "There's a lot of sugar in that drink.",
                "I have very little time for cooking."
            ),
            conversation = Conversation("Talking About Diet", "رژیم غذایی", listOf(
                ConversationLine("A", "I'm trying to eat healthier these days.", "این روزها سعی می‌کنم سالم‌تر بخورم."),
                ConversationLine("B", "What changes have you made?", "چه تغییراتی دادی؟"),
                ConversationLine("A", "I eat a lot of vegetables and a little red meat.", "سبزیجات زیاد و کمی گوشت قرمز می‌خورم."),
                ConversationLine("B", "Do you count calories?", "کالری می‌شمری؟"),
                ConversationLine("A", "No, but I watch my portions.", "نه، ولی مراقب سهم‌هام هستم."),
                ConversationLine("B", "That's smart. Do you eat organic food?", "باهوشه. غذای ارگانیک می‌خوری؟"),
                ConversationLine("A", "When I can. It's expensive though.", "وقتی بتونم. ولی گرونه."),
                ConversationLine("B", "Do you take any supplements?", "مکمل مصرف می‌کنی؟"),
                ConversationLine("A", "Just vitamin D in winter.", "فقط ویتامین D در زمستان."),
                ConversationLine("B", "A balanced diet is the key.", "رژیم متعادل کلیدیه.")
            )),
            storyTitle = "A Healthy Transformation",
            storyText = "Peter used to eat fast food every day. He drank a lot of soda and ate very few vegetables. He felt tired and had little energy. One day, he decided to change. He started cooking at home with fresh ingredients. He ate a lot of fruits and a little sugar. He also began to exercise. Within six months, his metabolism improved and he felt like a new person.",
            quiz = listOf(
                QuizQuestion("معنی Balanced diet؟", listOf("رژیم سخت", "رژیم متعادل", "غذای ارگانیک", "کالری"), 1),
                QuizQuestion("کدام درست است؟", listOf("I eat a little vegetables.", "I eat a few vegetables.", "I eat few vegetables.", "I eat little vegetables."), 1),
                QuizQuestion("«a few» با کدام می‌آید؟", listOf("غیرقابل شمارش", "قابل شمارش", "فعل", "صفت"), 1),
                QuizQuestion("معنی Portion؟", listOf("کالری", "سهم", "ویتامین", "پروتئین"), 1),
                QuizQuestion("«a little» با کدام می‌آید؟", listOf("قابل شمارش", "غیرقابل شمارش", "فعل", "قید"), 1),
                QuizQuestion("معنی Metabolism؟", listOf("سوخت‌وساز", "هضم", "تنفس", "گردش خون"), 0),
                QuizQuestion("تفاوت few و a few؟", listOf("هیچ فرقی ندارند", "few منفی، a few مثبت", "a few منفی", "few برای غیرقابل شمارش"), 1),
                QuizQuestion("معنی Supplements؟", listOf("غذا", "مکمل‌ها", "دارو", "ویتامین"), 1)
            )
        ),

        Lesson(
            id = "a7", unitNumber = 7, title = "About the Environment", titlePersian = "محیط زیست", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Climate change", "تغییرات اقلیمی", "ˈklaɪmət tʃeɪndʒ"), Word("Carbon footprint", "ردپای کربنی", "ˈkɑːrbən ˈfʊtprɪnt"),
                Word("Renewable energy", "انرژی تجدیدپذیر", "rɪˈnuːəbəl ˈenərdʒi"), Word("Deforestation", "جنگل‌زدایی", "ˌdiːˌfɔːrɪˈsteɪʃən"),
                Word("Emissions", "انتشار گازها", "ɪˈmɪʃənz"), Word("Conservation", "حفاظت", "ˌkɑːnsərˈveɪʃən"),
                Word("Ecosystem", "اکوسیستم", "ˈiːkoʊsɪstəm"), Word("Biodiversity", "تنوع زیستی", "ˌbaɪoʊdaɪˈvɜːrsəti"),
                Word("Sustainable", "پایدار", "səˈsteɪnəbəl"), Word("Pollution", "آلودگی", "pəˈluːʃən"),
                Word("Recycling", "بازیافت", "riˈsaɪklɪŋ"), Word("Global warming", "گرمایش جهانی", "ˈɡloʊbəl ˈwɔːrmɪŋ"),
                Word("Fossil fuel", "سوخت فسیلی", "ˈfɑːsəl fjuːəl"), Word("Ozone layer", "لایه ازن", "ˈoʊzoʊn ˈleɪər")
            ),
            spelling = listOf(
                SpellingExercise("conservation", "C - O - N - S - E - R - V - A - T - I - O - N", "حفاظت"),
                SpellingExercise("biodiversity", "B - I - O - D - I - V - E - R - S - I - T - Y", "تنوع زیستی"),
                SpellingExercise("sustainable", "S - U - S - T - A - I - N - A - B - L - E", "پایدار")
            ),
            grammarTitle = "Third Conditional",
            grammarExplanation = "📌 ساختار\nIf + had + p.p., would have + p.p.\n\n📌 کاربرد\nبرای موقعیت‌های خیالی در گذشته که اتفاق نیفتادند.\n• If we had acted sooner, we would have prevented the damage.\n• If governments had invested in renewable energy, emissions would have decreased.\n\n📌 تفاوت شرطی‌ها\n• نوع ۱ (ممکن): If it rains, I will stay home.\n• نوع ۲ (خیالی حال): If I were rich, I would travel.\n• نوع ۳ (خیالی گذشته): If I had studied, I would have passed.\n\n📌 اشتباهات رایج\n❌ If I would have known, I would have helped. → ✅ If I had known, I would have helped.",
            grammarExamples = listOf(
                "If we had acted sooner, we would have prevented the damage.",
                "If governments had invested in renewable energy, emissions would have decreased.",
                "If people had recycled more, there would have been less pollution.",
                "If I had known about the protest, I would have joined.",
                "If they had protected the forests, biodiversity wouldn't have suffered."
            ),
            conversation = Conversation("Environmental Issues", "مسائل زیست‌محیطی", listOf(
                ConversationLine("A", "What's the biggest environmental challenge?", "بزرگ‌ترین چالش زیست‌محیطی چیه؟"),
                ConversationLine("B", "Climate change, without a doubt.", "تغییرات اقلیمی، بدون شک."),
                ConversationLine("A", "If we had started earlier, what would have happened?", "اگه زودتر شروع کرده بودیم، چی می‌شد؟"),
                ConversationLine("B", "We would have slowed it down significantly.", "خیلی کندش کرده بودیم."),
                ConversationLine("A", "What can we do now?", "الان چیکار می‌تونیم بکنیم؟"),
                ConversationLine("B", "Reduce our carbon footprint and use renewable energy.", "ردپای کربنیمون رو کم کنیم و از انرژی تجدیدپذیر استفاده کنیم."),
                ConversationLine("A", "Do you think it's too late?", "فکر می‌کنی خیلی دیره؟"),
                ConversationLine("B", "It's never too late to make a difference.", "هرگز برای ایجاد تفاوت دیر نیست."),
                ConversationLine("A", "I'll start recycling more.", "منم بازیافت رو بیشتر می‌کنم."),
                ConversationLine("B", "Every small action counts.", "هر اقدام کوچکی مهمه.")
            )),
            storyTitle = "A Planet in Danger",
            storyText = "Scientists have warned about climate change for decades. If governments had acted earlier, we would have prevented much of the damage. Deforestation has destroyed countless ecosystems. Pollution has damaged the ozone layer. But there is hope. If we invest in renewable energy and practice conservation, we can still protect our planet. Every individual can make a difference.",
            quiz = listOf(
                QuizQuestion("معنی Renewable energy؟", listOf("انرژی فسیلی", "انرژی تجدیدپذیر", "آلودگی", "حفاظت"), 1),
                QuizQuestion("کدام درست است؟", listOf("If we acted, we would have prevented.", "If we had acted, we would have prevented.", "If we had acted, we prevent.", "If we act, we would prevent."), 1),
                QuizQuestion("ساختار شرطی نوع سوم؟", listOf("If + present, will + verb", "If + past, would + verb", "If + had + p.p., would have + p.p.", "If + present, would + verb"), 2),
                QuizQuestion("معنی Deforestation؟", listOf("جنگل‌کاری", "جنگل‌زدایی", "کشاورزی", "آبیاری"), 1),
                QuizQuestion("کدام درست است؟", listOf("If I would have known, I would have helped.", "If I had known, I would have helped.", "If I knew, I would help.", "If I know, I will help."), 1),
                QuizQuestion("معنی Biodiversity؟", listOf("تنوع زیستی", "آلودگی", "جنگل‌زدایی", "گرمایش"), 0),
                QuizQuestion("معنی Carbon footprint؟", listOf("گاز کربن", "ردپای کربنی", "سوخت فسیلی", "آلودگی هوا"), 1),
                QuizQuestion("«If I had studied» یعنی چه زمانی؟", listOf("حال", "آینده", "گذشته", "همیشه"), 2)
            )
        ),

        Lesson(
            id = "a8", unitNumber = 8, title = "Education and Learning", titlePersian = "آموزش و یادگیری", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Curriculum", "برنامه درسی", "kəˈrɪkjələm"), Word("Scholarship", "بورسیه", "ˈskɑːlərʃɪp"),
                Word("Degree", "مدرک", "dɪˈɡriː"), Word("Lecture", "سخنرانی", "ˈlektʃər"),
                Word("Assignment", "تکلیف", "əˈsaɪnmənt"), Word("Seminar", "سمینار", "ˈsemɪnɑːr"),
                Word("Dissertation", "پایان‌نامه", "ˌdɪsərˈteɪʃən"), Word("Critical thinking", "تفکر انتقادی", "ˈkrɪtɪkəl ˈθɪŋkɪŋ"),
                Word("Enrollment", "ثبت‌نام", "ɪnˈroʊlmənt"), Word("Faculty", "هیئت علمی", "ˈfækəlti"),
                Word("Campus", "محوطه دانشگاه", "ˈkæmpəs"), Word("Tuition", "شهریه", "tuˈɪʃən"),
                Word("Undergraduate", "کارشناسی", "ˌʌndərˈɡrædʒuət"), Word("Postgraduate", "تحصیلات تکمیلی", "ˌpoʊstˈɡrædʒuət")
            ),
            spelling = listOf(
                SpellingExercise("curriculum", "C - U - R - R - I - C - U - L - U - M", "برنامه درسی"),
                SpellingExercise("dissertation", "D - I - S - S - E - R - T - A - T - I - O - N", "پایان‌نامه"),
                SpellingExercise("scholarship", "S - C - H - O - L - A - R - S - H - I - P", "بورسیه")
            ),
            grammarTitle = "Wish + Past Perfect | Expressing Regret",
            grammarExplanation = "📌 Wish + Past Perfect\nآرزو در مورد گذشته (پشیمانی):\n• I wish I had studied harder.\n• I wish I hadn't quit.\n\n📌 Wish + Past Simple\nآرزو در مورد حال:\n• I wish I spoke French.\n• I wish I were rich.\n\n📌 Wish + Would\nآرزو در مورد آینده یا شکایت:\n• I wish he would stop talking.\n\n📌 اشتباهات رایج\n❌ I wish I studied harder. → ✅ I wish I had studied harder. (گذشته)\n❌ I wish I would have studied. → ✅ I wish I had studied.",
            grammarExamples = listOf(
                "I wish I had learned a second language earlier.",
                "She wishes she hadn't dropped out.",
                "They wish they had applied for the scholarship.",
                "I wish I had taken that seminar.",
                "He wishes he had chosen a different major.",
                "We wish we had studied abroad."
            ),
            conversation = Conversation("Reflecting on Education", "تأمل در آموزش", listOf(
                ConversationLine("A", "Any regrets about your education?", "پشیمانی‌ای از تحصیلاتت داری؟"),
                ConversationLine("B", "I wish I had studied abroad.", "کاش خارج درس خوانده بودم."),
                ConversationLine("A", "Why didn't you?", "چرا نخوندی؟"),
                ConversationLine("B", "I didn't have enough money for tuition.", "شهریه‌اش رو نداشتم."),
                ConversationLine("A", "Could you have gotten a scholarship?", "می‌تونستی بورسیه بگیری؟"),
                ConversationLine("B", "I wish I had applied for one.", "کاش برای یکی درخواست داده بودم."),
                ConversationLine("A", "It's never too late to learn.", "هرگز برای یادگیری دیر نیست."),
                ConversationLine("B", "You're right. I could still take online courses.", "حق داری. هنوز می‌تونم دوره‌های آنلاین بگیرم."),
                ConversationLine("A", "That's the spirit!", "همین روحیه رو دوست دارم!"),
                ConversationLine("B", "Better late than never.", "دیر رسیدن بهتر از هرگز نرسیدنه.")
            )),
            storyTitle = "The Road Not Taken",
            storyText = "Emily had always dreamed of studying abroad. She had applied to several universities but was too afraid to leave her comfort zone. Years later, she wishes she had been braver. She wishes she had taken that scholarship to London. Now she encourages young people to take risks and follow their dreams. She believes that the biggest regrets come from the chances we didn't take.",
            quiz = listOf(
                QuizQuestion("معنی Critical thinking؟", listOf("تفکر ساده", "تفکر انتقادی", "حفظ کردن", "نوشتن"), 1),
                QuizQuestion("کدام درست است؟", listOf("I wish I studied harder.", "I wish I had studied harder.", "I wish I study harder.", "I wish I will study."), 1),
                QuizQuestion("«Wish + Past Perfect» برای چه زمانی؟", listOf("حال", "آینده", "گذشته", "همیشه"), 2),
                QuizQuestion("معنی Scholarship؟", listOf("شهریه", "بورسیه", "مدرک", "دانشگاه"), 1),
                QuizQuestion("کدام درست است؟", listOf("I wish I would have studied.", "I wish I had studied.", "I wish I study.", "I wish I will study."), 1),
                QuizQuestion("معنی Dissertation؟", listOf("تکلیف", "پایان‌نامه", "سخنرانی", "سمینار"), 1),
                QuizQuestion("«I wish I spoke French» یعنی؟", listOf("کاش فرانسه صحبت می‌کردم (حال)", "کاش فرانسه صحبت کرده بودم (گذشته)", "فرانسه صحبت می‌کنم", "فرانسه یاد خواهم گرفت"), 0),
                QuizQuestion("معنی Tuition؟", listOf("بورسیه", "شهریه", "مدرک", "کلاس"), 1)
            )
        ),

        Lesson(
            id = "a9", unitNumber = 9, title = "Jobs and Careers", titlePersian = "شغل‌ها و حرفه‌ها", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Entrepreneur", "کارآفرین", "ˌɑːntrəprəˈnɜːr"), Word("Freelancer", "فریلنسر", "ˈfriːlænsər"),
                Word("Networking", "شبکه‌سازی", "ˈnetwɜːrkɪŋ"), Word("Interview", "مصاحبه", "ˈɪntərvjuː"),
                Word("Resume", "رزومه", "ˈrezəmeɪ"), Word("Salary", "حقوق", "ˈsæləri"),
                Word("Promotion", "ترفیع", "prəˈmoʊʃən"), Word("Work-life balance", "تعادل کار و زندگی", "wɜːrk laɪf ˈbæləns"),
                Word("Mentor", "مربی", "ˈmentɔːr"), Word("Internship", "کارآموزی", "ˈɪntɜːrnʃɪp"),
                Word("Benefits", "مزایا", "ˈbenɪfɪts"), Word("Notice period", "مدت اطلاع‌رسانی", "ˈnoʊtɪs ˈpɪriəd"),
                Word("Negotiation", "مذاکره", "nɪˌɡoʊʃiˈeɪʃən"), Word("Burnout", "فرسودگی شغلی", "ˈbɜːrnaʊt")
            ),
            spelling = listOf(
                SpellingExercise("entrepreneur", "E - N - T - R - E - P - R - E - N - E - U - R", "کارآفرین"),
                SpellingExercise("internship", "I - N - T - E - R - N - S - H - I - P", "کارآموزی"),
                SpellingExercise("negotiation", "N - E - G - O - T - I - A - T - I - O - N", "مذاکره")
            ),
            grammarTitle = "Relative Clauses | Who, Which, Whose, That",
            grammarExplanation = "📌 who برای افراد\n• She's the manager who hired me.\n\n📌 which / that برای اشیا\n• That's the job which I applied for.\n• This is the company that I work for.\n\n📌 whose برای مالکیت\n• He's the colleague whose advice helped me.\n\n📌 Defining vs Non-defining\n• Defining (ضروری): The man who called is my boss.\n• Non-defining (اضافی، بین دو ویرگول): Mr. Smith, who is my boss, called.\n\n📌 اشتباهات رایج\n❌ She's the manager which hired me. → ✅ She's the manager who hired me.",
            grammarExamples = listOf(
                "She's the manager who hired me.",
                "That's the job which I applied for.",
                "He's the colleague whose advice helped me.",
                "The company that I work for is in London.",
                "This is the project which won the award.",
                "Anyone who wants to succeed must work hard."
            ),
            conversation = Conversation("Career Discussion", "بحث شغلی", listOf(
                ConversationLine("A", "What career path do you want to follow?", "چه مسیر شغلی می‌خوای دنبال کنی؟"),
                ConversationLine("B", "I want to be an entrepreneur who builds startups.", "می‌خوام کارآفرینی باشم که استارتاپ می‌سازه."),
                ConversationLine("A", "Do you have a mentor?", "مربی داری؟"),
                ConversationLine("B", "Yes, a businessman whose company went global.", "بله، تاجری که شرکتش جهانی شد."),
                ConversationLine("A", "How important is networking?", "شبکه‌سازی چقدر مهمه؟"),
                ConversationLine("B", "It's the key to success.", "کلید موفقیته."),
                ConversationLine("A", "What about work-life balance?", "تعادل کار و زندگی چطور؟"),
                ConversationLine("B", "It's essential to avoid burnout.", "برای جلوگیری از فرسودگی ضروریه."),
                ConversationLine("A", "Any advice for negotiation?", "برای مذاکره توصیه‌ای داری؟"),
                ConversationLine("B", "Know your value and don't be afraid to ask.", "ارزشت رو بدون و از پرسیدن نترس.")
            )),
            storyTitle = "From Employee to Entrepreneur",
            storyText = "Ahmed worked for a large corporation for ten years. The job which he had was secure but unfulfilling. One day, he met a mentor whose advice changed his life. He started his own company, which focuses on sustainable technology. It wasn't easy, but his hard work paid off. Today, Ahmed is a successful entrepreneur who employs over fifty people. He always tells young people to follow their passion.",
            quiz = listOf(
                QuizQuestion("معنی Entrepreneur؟", listOf("کارمند", "کارآفرین", "مدیر", "فریلنسر"), 1),
                QuizQuestion("کدام درست است؟", listOf("She's the manager who hired me.", "She's the manager which hired me.", "She's the manager whose hired me.", "She's the manager what hired me."), 0),
                QuizQuestion("«whose» برای چه استفاده می‌شود؟", listOf("افراد", "اشیا", "مالکیت", "زمان"), 2),
                QuizQuestion("معنی Mentor؟", listOf("شاگرد", "مربی", "مدیر", "همکار"), 1),
                QuizQuestion("کدام درست است؟", listOf("This is the job which I applied.", "This is the job which I applied for.", "This is the job who I applied.", "This is the job what I applied."), 1),
                QuizQuestion("معنی Work-life balance؟", listOf("تعادل کار و زندگی", "کار تمام وقت", "استراحت", "تعطیلات"), 0),
                QuizQuestion("«who» برای چه استفاده می‌شود؟", listOf("اشیا", "افراد", "مکان", "زمان"), 1),
                QuizQuestion("معنی Burnout؟", listOf("موفقیت", "فرسودگی شغلی", "ترفیع", "استعفا"), 1)
            )
        ),

        Lesson(
            id = "a10", unitNumber = 10, title = "Life Changes", titlePersian = "تغییرات زندگی", level = Level.ADVANCED,
            vocabulary = listOf(
                Word("Transition", "گذار", "trænˈzɪʃən"), Word("Milestone", "نقطه عطف", "ˈmaɪlstoʊn"),
                Word("Adapt", "سازگار شدن", "əˈdæpt"), Word("Overcome", "غلبه کردن", "ˌoʊvərˈkʌm"),
                Word("Significant", "قابل توجه", "sɪɡˈnɪfɪkənt"), Word("Challenge", "چالش", "ˈtʃælɪndʒ"),
                Word("Growth", "رشد", "ɡroʊθ"), Word("Perspective", "چشم‌انداز", "pərˈspektɪv"),
                Word("Resilience", "تاب‌آوری", "rɪˈzɪliəns"), Word("Transform", "دگرگون کردن", "trænsˈfɔːrm"),
                Word("Cope", "مقابله کردن", "koʊp"), Word("Adjust", "تطبیق دادن", "əˈdʒʌst"),
                Word("Embrace", "پذیرفتن", "ɪmˈbreɪs"), Word("Wisdom", "خرد", "ˈwɪzdəm")
            ),
            spelling = listOf(
                SpellingExercise("transition", "T - R - A - N - S - I - T - I - O - N", "گذار"),
                SpellingExercise("resilience", "R - E - S - I - L - I - E - N - C - E", "تاب‌آوری"),
                SpellingExercise("perspective", "P - E - R - S - P - E - C - T - I - V - E", "چشم‌انداز")
            ),
            grammarTitle = "Cleft Sentences for Emphasis",
            grammarExplanation = "📌 Cleft Sentences (جملات شکافته)\nبرای تأکید روی بخشی از جمله.\n\n📌 It-cleft\nIt is/was + ... that/who ...\n• It was the birth of my child that changed me.\n• It is challenges that make us stronger.\n\n📌 Wh-cleft\nWhat + clause + is/was ...\n• What I value most is family.\n• What matters is how you respond.\n\n📌 اشتباهات رایج\n❌ It challenges that make us stronger. → ✅ It is challenges that make us stronger.\n❌ What I value most family is. → ✅ What I value most is family.",
            grammarExamples = listOf(
                "It was the birth of my child that changed me.",
                "What I value most is family.",
                "It is challenges that make us stronger.",
                "What surprised me was his resilience.",
                "It was the loss of my job that led me to my true calling.",
                "What matters most is how you respond to adversity."
            ),
            conversation = Conversation("Life Changes", "تغییرات زندگی", listOf(
                ConversationLine("A", "What was a significant milestone in your life?", "نقطه عطف مهم زندگی‌ت چی بود؟"),
                ConversationLine("B", "It was moving abroad that changed my perspective.", "مهاجرت بود که چشم‌اندازم رو تغییر داد."),
                ConversationLine("A", "How did you adapt?", "چطور سازگار شدی؟"),
                ConversationLine("B", "I overcame it step by step.", "قدم به قدم غلبه کردم."),
                ConversationLine("A", "What would you tell others?", "به دیگران چی می‌گی؟"),
                ConversationLine("B", "What matters most is resilience.", "چیزی که مهمه تاب‌آوریه."),
                ConversationLine("A", "Did you ever feel like giving up?", "حس کردی می‌خوای تسلیم بشی؟"),
                ConversationLine("B", "Many times. But what kept me going was hope.", "خیلی وقت‌ها. ولی چیزی که منو جلو برد امید بود."),
                ConversationLine("A", "You've grown so much!", "خیلی رشد کردی!"),
                ConversationLine("B", "Growth comes from discomfort.", "رشد از ناراحتی میاد.")
            )),
            storyTitle = "A Life Transformed",
            storyText = "Layla's life changed completely when she moved to a new country. It was the loss of her job that pushed her to start her own business. What she discovered was that challenges often bring unexpected opportunities. She faced many difficulties, but her resilience helped her overcome them. Today, she has a successful company and a new perspective on life. What she values most is the wisdom she gained through her journey.",
            quiz = listOf(
                QuizQuestion("معنی Transition؟", listOf("توقف", "گذار", "شروع", "پایان"), 1),
                QuizQuestion("کدام cleft درست است؟", listOf("It challenges that make us stronger.", "It is challenges that make us stronger.", "Challenges is that make us stronger.", "It that challenges make us stronger."), 1),
                QuizQuestion("معنی Overcome؟", listOf("شکست خوردن", "غلبه کردن", "فرار کردن", "تسلیم شدن"), 1),
                QuizQuestion("ساختار It-cleft؟", listOf("It + is/was + ... + that/who", "What + verb + is", "It + verb + that", "That + it + is"), 0),
                QuizQuestion("معنی Resilience؟", listOf("ضعف", "تاب‌آوری", "ترس", "خستگی"), 1),
                QuizQuestion("«What I value most is family» یعنی؟", listOf("چیزی که بیشتر ارزشش رو دارم خانواده‌ست", "خانواده‌ام چیه؟", "خانواده ارزش داره", "من خانواده رو دوست دارم"), 0),
                QuizQuestion("معنی Embrace؟", listOf("رد کردن", "پذیرفتن", "ترک کردن", "فراموش کردن"), 1),
                QuizQuestion("معنی Wisdom؟", listOf("ثروت", "خرد", "قدرت", "جوانی"), 1)
            )
        )
    )

    fun getLessonsByLevel(level: Level): List<Lesson> =
        lessons.filter { it.level == level }

    fun getLessonById(id: String): Lesson? =
        lessons.firstOrNull { it.id == id }
}