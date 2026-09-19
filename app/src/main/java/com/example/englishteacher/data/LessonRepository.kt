Lesson(
    id = "b4", unitNumber = 4, title = "Food and Drinks", titlePersian = "غذا و نوشیدنی", level = Level.BEGINNER,
    vocabulary = listOf(
        Word("Water", "آب", "ˈwɔtər"),
        Word("Bread", "نان", "brɛd"),
        Word("Rice", "برنج", "raɪs"),
        Word("Chicken", "مرغ", "ˈtʃɪkɪn"),
        Word("Apple", "سیب", "ˈæpəl"),
        Word("Delicious", "خوشمزه", "dɪˈlɪʃəs")
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
        Word("Teacher", "معلم", "ˈtitʃər"),
        Word("Student", "دانش‌آموز", "ˈstudənt"),
        Word("Classroom", "کلاس", "ˈklæsrum"),
        Word("Book", "کتاب", "bʊk"),
        Word("Homework", "تکلیف", "ˈhoʊmwɜrk"),
        Word("Library", "کتابخانه", "ˈlaɪbrɛri")
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
        Word("Reading", "کتاب خواندن", "ˈridɪŋ"),
        Word("Swimming", "شنا کردن", "ˈswɪmɪŋ"),
        Word("Drawing", "نقاشی", "ˈdrɔɪŋ"),
        Word("Cooking", "آشپزی", "ˈkʊkɪŋ"),
        Word("Music", "موسیقی", "ˈmjuzɪk"),
        Word("Enjoy", "لذت بردن", "ɪnˈdʒɔɪ")
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
