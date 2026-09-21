package com.example.englishteacher.data

object PodcastRepository {

    fun getAllPodcasts(): List<Podcast> = listOf(
        // ==================== 🌱 BEGINNER (۲۵ پادکست) ====================

        Podcast(
            id = "p_b1", title = "Greetings and Introductions", titlePersian = "سلام و معرفی",
            description = "Learn how to greet people and introduce yourself.",
            descriptionPersian = "یاد بگیرید چطور سلام کنید و خودتان را معرفی کنید.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/greetings.mp3", durationMinutes = 5,
            transcript = "Hello! My name is Sarah. Nice to meet you. What is your name? My name is Ali. How are you? I am fine, thank you.",
            transcriptPersian = "سلام! اسم من سارا است. از آشنایی خوشحالم. اسم شما چیست؟ اسم من علی است. حال شما چطور است؟ خوبم، ممنون.",
            vocabulary = listOf(Word("greeting", "سلام", "ˈɡriːtɪŋ"), Word("introduce", "معرفی کردن", "ˌɪntrəˈduːs")),
            coverUrl = "https://images.unsplash.com/photo-1543269865-cbf427effbad?w=400"
        ),
        Podcast(
            id = "p_b2", title = "Numbers and Counting", titlePersian = "اعداد و شمارش",
            description = "Learn to count from one to twenty.", descriptionPersian = "یاد بگیرید از یک تا بیست بشمارید.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/numbers.mp3", durationMinutes = 5,
            transcript = "One, two, three, four, five. I have five apples. Six, seven, eight, nine, ten.",
            transcriptPersian = "یک، دو، سه، چهار، پنج. من پنج تا سیب دارم. شش، هفت، هشت، نه، ده.",
            vocabulary = listOf(Word("count", "شمردن", "kaʊnt")), coverUrl = ""
        ),
        Podcast(
            id = "p_b3", title = "Colors Around Us", titlePersian = "رنگ‌های اطراف ما",
            description = "Learn the names of colors in English.", descriptionPersian = "نام رنگ‌ها را یاد بگیرید.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/colors.mp3", durationMinutes = 5,
            transcript = "The sky is blue. The sun is yellow. The grass is green. The rose is red.",
            transcriptPersian = "آسمان آبی است. خورشید زرد است. چمن سبز است. گل رز قرمز است.",
            vocabulary = listOf(Word("color", "رنگ", "ˈkʌlər")), coverUrl = ""
        ),
        Podcast(
            id = "p_b4", title = "Days of the Week", titlePersian = "روزهای هفته",
            description = "Learn the seven days of the week.", descriptionPersian = "هفت روز هفته را یاد بگیرید.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/days.mp3", durationMinutes = 5,
            transcript = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.",
            transcriptPersian = "دوشنبه، سه‌شنبه، چهارشنبه، پنجشنبه، جمعه، شنبه و یکشنبه.",
            vocabulary = listOf(Word("week", "هفته", "wiːk")), coverUrl = ""
        ),
        Podcast(
            id = "p_b5", title = "At the Supermarket", titlePersian = "در سوپرمارکت",
            description = "Learn useful phrases for shopping.", descriptionPersian = "جمله‌های کاربردی خرید.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/market.mp3", durationMinutes = 6,
            transcript = "Excuse me, where is the milk? It is in aisle five. How much is this bread? It is two dollars.",
            transcriptPersian = "ببخشید، شیر کجاست؟ در راهروی پنجم است. این نان چقدر است؟ دو دلار است.",
            vocabulary = listOf(Word("supermarket", "سوپرمارکت", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b6", title = "Family Members", titlePersian = "اعضای خانواده",
            description = "Learn the names of family members.", descriptionPersian = "نام اعضای خانواده.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/family.mp3", durationMinutes = 5,
            transcript = "This is my family. I have a mother and a father. I have one brother and two sisters.",
            transcriptPersian = "این خانواده من است. من یک مادر و یک پدر دارم. یک برادر و دو خواهر دارم.",
            vocabulary = listOf(Word("family", "خانواده", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b7", title = "Weather Talk", titlePersian = "صحبت از آب و هوا",
            description = "Learn to talk about weather.", descriptionPersian = "صحبت از آب و هوا.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/weather.mp3", durationMinutes = 5,
            transcript = "How is the weather today? It is sunny. It is hot outside. I like sunny days.",
            transcriptPersian = "امروز هوا چطور است؟ آفتابی است. بیرون گرم است. من روزهای آفتابی را دوست دارم.",
            vocabulary = listOf(Word("weather", "آب و هوا", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b8", title = "At the Restaurant", titlePersian = "در رستوران",
            description = "Learn to order food at a restaurant.", descriptionPersian = "سفارش غذا در رستوران.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/restaurant.mp3", durationMinutes = 6,
            transcript = "Welcome to our restaurant. A table for two, please. What would you like to order?",
            transcriptPersian = "به رستوران ما خوش آمدید. یک میز برای دو نفر. چه چیزی سفارش می‌دهید؟",
            vocabulary = listOf(Word("restaurant", "رستوران", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b9", title = "My Daily Routine", titlePersian = "روتین روزانه من",
            description = "Describe your daily activities.", descriptionPersian = "فعالیت‌های روزانه‌تان.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/routine.mp3", durationMinutes = 6,
            transcript = "I wake up at seven in the morning. I brush my teeth and take a shower. I eat breakfast at eight.",
            transcriptPersian = "ساعت هفت صبح بیدار می‌شوم. مسواک می‌زنم و دوش می‌گیرم. ساعت هشت صبحانه می‌خورم.",
            vocabulary = listOf(Word("routine", "روتین", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b10", title = "Telling Time", titlePersian = "گفتن ساعت",
            description = "Learn how to tell time.", descriptionPersian = "گفتن ساعت به انگلیسی.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/time.mp3", durationMinutes = 5,
            transcript = "What time is it? It is three o'clock. It is half past four.",
            transcriptPersian = "ساعت چند است؟ ساعت سه است. ساعت چهار و نیم است.",
            vocabulary = listOf(Word("time", "زمان", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b11", title = "My Hobbies", titlePersian = "سرگرمی‌های من",
            description = "Talk about hobbies and free time.", descriptionPersian = "صحبت از سرگرمی‌ها.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/hobbies.mp3", durationMinutes = 5,
            transcript = "What do you do in your free time? I like reading books. I also enjoy playing football.",
            transcriptPersian = "در وقت آزادت چه کار می‌کنی؟ کتاب خواندن را دوست دارم. فوتبال هم دوست دارم.",
            vocabulary = listOf(Word("hobby", "سرگرمی", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b12", title = "In the Classroom", titlePersian = "در کلاس درس",
            description = "Phrases used in the classroom.", descriptionPersian = "جملات کلاس درس.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/classroom.mp3", durationMinutes = 5,
            transcript = "Good morning, class. Open your books to page ten. Please read the first paragraph.",
            transcriptPersian = "صبح بخیر کلاس. کتاب‌هایتان را به صفحه ده باز کنید. لطفاً پاراگراف اول را بخوانید.",
            vocabulary = listOf(Word("classroom", "کلاس", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b13", title = "Transportation", titlePersian = "حمل و نقل",
            description = "Types of transportation.", descriptionPersian = "انواع وسایل نقلیه.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/transport.mp3", durationMinutes = 5,
            transcript = "How do you go to work? I take the bus. Sometimes I drive my car.",
            transcriptPersian = "چطور به سر کار می‌روی؟ اتوبوس می‌گیرم. گاهی ماشینم را می‌رانم.",
            vocabulary = listOf(Word("transportation", "حمل و نقل", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b14", title = "Food and Drinks", titlePersian = "غذا و نوشیدنی",
            description = "Names of common foods and drinks.", descriptionPersian = "نام غذاها و نوشیدنی‌ها.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/food.mp3", durationMinutes = 5,
            transcript = "I am hungry. I want to eat rice with chicken. My friend likes pizza and pasta.",
            transcriptPersian = "گرسنه‌ام. می‌خواهم برنج با مرغ بخورم. دوستم پیتزا و پاستا دوست دارد.",
            vocabulary = listOf(Word("food", "غذا", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b15", title = "Asking for Directions", titlePersian = "پرسیدن آدرس",
            description = "Ask for and give directions.", descriptionPersian = "پرسیدن و دادن آدرس.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/directions.mp3", durationMinutes = 6,
            transcript = "Excuse me, how do I get to the bank? Go straight for two blocks. Then turn left at the traffic light.",
            transcriptPersian = "ببخشید، چطور به بانک بروم؟ مستقیم دو بلوک. بعد در چراغ راهنما به چپ بپیچ.",
            vocabulary = listOf(Word("direction", "آدرس", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b16", title = "Months and Seasons", titlePersian = "ماه‌ها و فصل‌ها",
            description = "The twelve months and four seasons.", descriptionPersian = "دوازده ماه و چهار فصل.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/months.mp3", durationMinutes = 5,
            transcript = "January, February, March, April, May, June, July, August, September, October, November, December.",
            transcriptPersian = "ژانویه، فوریه، مارس، آوریل، مه، ژوئن، ژوئیه، آگوست، سپتامبر، اکتبر، نوامبر، دسامبر.",
            vocabulary = listOf(Word("month", "ماه", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b17", title = "Clothes and Shopping", titlePersian = "لباس و خرید",
            description = "Names of clothes and shopping.", descriptionPersian = "نام لباس‌ها و خرید.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/clothes.mp3", durationMinutes = 5,
            transcript = "I need new clothes. I like this blue shirt. How much does it cost?",
            transcriptPersian = "لباس جدید لازم دارم. این پیراهن آبی را دوست دارم. چقدر هزینه دارد؟",
            vocabulary = listOf(Word("clothes", "لباس", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b18", title = "The Alphabet", titlePersian = "الفبای انگلیسی",
            description = "Learn the English alphabet.", descriptionPersian = "الفبای انگلیسی.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.PRONUNCIATION,
            audioUrl = "https://example.com/alphabet.mp3", durationMinutes = 5,
            transcript = "A, B, C, D, E, F, G... There are twenty-six letters in the English alphabet.",
            transcriptPersian = "اِی، بی، سی، دی، ای... بیست و شش حرف در الفبای انگلیسی وجود دارد.",
            vocabulary = listOf(Word("alphabet", "الفبا", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b19", title = "At the Doctor", titlePersian = "پیش دکتر",
            description = "Useful phrases when visiting a doctor.", descriptionPersian = "جملات پیش دکتر.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/doctor.mp3", durationMinutes = 6,
            transcript = "Good morning, doctor. What is the problem? I have a headache and a fever.",
            transcriptPersian = "صبح بخیر دکتر. مشکل چیه؟ سردرد و تب دارم.",
            vocabulary = listOf(Word("doctor", "دکتر", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b20", title = "At the Hotel", titlePersian = "در هتل",
            description = "Check in and out of a hotel.", descriptionPersian = "چک‌این و چک‌اوت هتل.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/hotel.mp3", durationMinutes = 6,
            transcript = "Welcome to the Grand Hotel. I have a reservation. What is your name?",
            transcriptPersian = "به هتل گرند خوش آمدید. من رزرو دارم. اسم شما چیه؟",
            vocabulary = listOf(Word("hotel", "هتل", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b21", title = "Pets and Animals", titlePersian = "حیوانات خانگی",
            description = "Names of pets and animals.", descriptionPersian = "نام حیوانات.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/pets.mp3", durationMinutes = 5,
            transcript = "I have a pet cat. Her name is Mimi. My friend has a dog named Rex.",
            transcriptPersian = "من یک گربه دارم. اسمش میمی است. دوستم یک سگ به نام رکس دارد.",
            vocabulary = listOf(Word("pet", "حیوان خانگی", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b22", title = "Making a Phone Call", titlePersian = "تماس تلفنی",
            description = "Making and receiving phone calls.", descriptionPersian = "تماس تلفنی.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/phone.mp3", durationMinutes = 6,
            transcript = "Hello, this is Sara speaking. Hi Sara, this is Ali. Can I speak to Mr. Smith?",
            transcriptPersian = "سلام، سارا صحبت می‌کند. سلام سارا، علی هستم. می‌توانم با آقای اسمیت صحبت کنم؟",
            vocabulary = listOf(Word("phone", "تلفن", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b23", title = "The Body Parts", titlePersian = "اعضای بدن",
            description = "Names of body parts.", descriptionPersian = "نام اعضای بدن.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/body.mp3", durationMinutes = 5,
            transcript = "This is my head. These are my eyes, my nose, and my mouth.",
            transcriptPersian = "این سر من است. این‌ها چشم‌هایم، بینی‌ام و دهانم هستند.",
            vocabulary = listOf(Word("body", "بدن", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b24", title = "At the Bank", titlePersian = "در بانک",
            description = "Phrases for going to the bank.", descriptionPersian = "جملات بانکی.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/bank.mp3", durationMinutes = 6,
            transcript = "Good morning, how can I help you? I want to open a bank account.",
            transcriptPersian = "صبح بخیر، چطور کمکتان کنم؟ می‌خواهم یک حساب بانکی باز کنم.",
            vocabulary = listOf(Word("bank", "بانک", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_b25", title = "Happy Birthday!", titlePersian = "تولدت مبارک!",
            description = "Talking about birthdays.", descriptionPersian = "صحبت از تولد.",
            level = PodcastLevel.BEGINNER, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/birthday.mp3", durationMinutes = 5,
            transcript = "Happy birthday! Thank you so much! How old are you today? I am twenty years old.",
            transcriptPersian = "تولدت مبارک! خیلی ممنون! امروز چند ساله شدی؟ بیست ساله شدم.",
            vocabulary = listOf(Word("birthday", "تولد", "")), coverUrl = ""
        ),

        // ==================== 🚀 INTERMEDIATE (۱۵ پادکست) ====================

        Podcast(
            id = "p_i1", title = "Everyday Grammar: Present Simple", titlePersian = "گرامر روزمره: حال ساده",
            description = "How to use present simple correctly.", descriptionPersian = "استفاده صحیح از حال ساده.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.GRAMMAR,
            audioUrl = "https://example.com/present.mp3", durationMinutes = 8,
            transcript = "The present simple tense is used for habits, facts, and routines. For example: I wake up at seven every day.",
            transcriptPersian = "زمان حال ساده برای عادت‌ها، حقایق و روتین‌ها. مثلاً: من هر روز ساعت هفت بیدار می‌شوم.",
            vocabulary = listOf(Word("habit", "عادت", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i2", title = "Common English Idioms", titlePersian = "اصطلاحات رایج",
            description = "Popular idioms and meanings.", descriptionPersian = "اصطلاحات رایج و معانی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.IDIOMS,
            audioUrl = "https://example.com/idioms.mp3", durationMinutes = 9,
            transcript = "Break a leg means good luck. It is raining cats and dogs means raining very hard.",
            transcriptPersian = "Break a leg یعنی موفق باشی. It is raining cats and dogs یعنی باران شدید.",
            vocabulary = listOf(Word("idiom", "اصطلاح", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i3", title = "Words and Stories: Heart", titlePersian = "کلمات: قلب",
            description = "Expressions with the word heart.", descriptionPersian = "اصطلاحات با کلمه قلب.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/heart.mp3", durationMinutes = 8,
            transcript = "The word heart appears in many English expressions. If you wear your heart on your sleeve, you show feelings openly.",
            transcriptPersian = "کلمه قلب در بسیاری از اصطلاحات انگلیسی. اگر wear your heart on your sleeve کنید، احساسات را آشکارا نشان می‌دهید.",
            vocabulary = listOf(Word("heart", "قلب", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i4", title = "Making Small Talk", titlePersian = "گپ کوتاه",
            description = "How to make small talk.", descriptionPersian = "گپ کوتاه زدن.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.CONVERSATION,
            audioUrl = "https://example.com/smalltalk.mp3", durationMinutes = 9,
            transcript = "Small talk is important in English-speaking cultures. Good topics include weather, sports, and hobbies.",
            transcriptPersian = "گپ کوتاه در فرهنگ‌های انگلیسی‌زبان مهم است. موضوعات خوب: آب و هوا، ورزش و سرگرمی.",
            vocabulary = listOf(Word("small talk", "گپ کوتاه", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i5", title = "Technology in Education", titlePersian = "تکنولوژی در آموزش",
            description = "How tech changes education.", descriptionPersian = "تغییر آموزش با تکنولوژی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.NEWS,
            audioUrl = "https://example.com/tech.mp3", durationMinutes = 10,
            transcript = "Technology is changing education in many ways. Students now use tablets and laptops in classrooms.",
            transcriptPersian = "تکنولوژی آموزش را تغییر می‌دهد. دانش‌آموزان اکنون از تبلت و لپ‌تاپ استفاده می‌کنند.",
            vocabulary = listOf(Word("technology", "تکنولوژی", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i6", title = "Phrasal Verbs", titlePersian = "افعال عبارتی",
            description = "Common phrasal verbs in English.", descriptionPersian = "افعال عبارتی رایج.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.GRAMMAR,
            audioUrl = "https://example.com/phrasal.mp3", durationMinutes = 7,
            transcript = "Phrasal verbs are verbs combined with prepositions. For example: give up means to quit.",
            transcriptPersian = "افعال عبارتی ترکیب فعل با حرف اضافه. مثلاً give up یعنی تسلیم شدن.",
            vocabulary = listOf(Word("phrasal verb", "فعل عبارتی", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i7", title = "The Gift of the Magi", titlePersian = "هدیه مغ‌ها",
            description = "Classic American short story.", descriptionPersian = "داستان کوتاه آمریکایی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.STORY,
            audioUrl = "https://example.com/magi.mp3", durationMinutes = 12,
            transcript = "This is a story about a young couple, Jim and Della, who have very little money.",
            transcriptPersian = "داستانی درباره یک زوج جوان، جیم و دلا، که پول کمی دارند.",
            vocabulary = listOf(Word("couple", "زوج", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i8", title = "Past Tense", titlePersian = "زمان گذشته",
            description = "Past simple and continuous.", descriptionPersian = "گذشته ساده و استمراری.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.GRAMMAR,
            audioUrl = "https://example.com/past.mp3", durationMinutes = 9,
            transcript = "The past simple describes completed actions in the past. For example: I visited my grandmother yesterday.",
            transcriptPersian = "گذشته ساده اعمال کامل‌شده را توصیف می‌کند. مثلاً: دیروز به دیدن مادربزرگم رفتم.",
            vocabulary = listOf(Word("past tense", "زمان گذشته", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i9", title = "Expressions about Luck", titlePersian = "اصطلاحات شانس",
            description = "English expressions about luck.", descriptionPersian = "اصطلاحات درباره شانس.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.IDIOMS,
            audioUrl = "https://example.com/luck.mp3", durationMinutes = 8,
            transcript = "Lucky break means a fortunate opportunity. Down on your luck means experiencing bad times.",
            transcriptPersian = "Lucky break یعنی فرصت خوش‌شانسانه. Down on your luck یعنی دوران بدی را تجربه کردن.",
            vocabulary = listOf(Word("luck", "شانس", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i10", title = "Health and Fitness", titlePersian = "سلامتی و تناسب اندام",
            description = "Health and fitness vocabulary.", descriptionPersian = "لغات سلامتی و تناسب اندام.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.VOCABULARY,
            audioUrl = "https://example.com/health.mp3", durationMinutes = 8,
            transcript = "Staying healthy is important. Regular exercise helps you maintain a healthy weight.",
            transcriptPersian = "سالم ماندن مهم است. ورزش منظم وزن سالم را حفظ می‌کند.",
            vocabulary = listOf(Word("fitness", "تناسب اندام", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i11", title = "At the Airport", titlePersian = "در فرودگاه",
            description = "English for air travel.", descriptionPersian = "انگلیسی سفر هوایی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.TRAVEL,
            audioUrl = "https://example.com/airport.mp3", durationMinutes = 9,
            transcript = "At the airport, you will need to check in, go through security, and find your gate.",
            transcriptPersian = "در فرودگاه، باید چک‌این کنید، از امنیت رد شوید و گیت خود را پیدا کنید.",
            vocabulary = listOf(Word("airport", "فرودگاه", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i12", title = "History of English", titlePersian = "تاریخ زبان انگلیسی",
            description = "History of the English language.", descriptionPersian = "تاریخ زبان انگلیسی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.HISTORY,
            audioUrl = "https://example.com/hist.mp3", durationMinutes = 10,
            transcript = "English has a rich history. It began as a Germanic language brought to Britain.",
            transcriptPersian = "انگلیسی تاریخ غنی دارد. به عنوان یک زبان ژرمنی به بریتانیا آورده شد.",
            vocabulary = listOf(Word("history", "تاریخ", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i13", title = "Job Interview Tips", titlePersian = "نکات مصاحبه شغلی",
            description = "How to succeed in interviews.", descriptionPersian = "موفقیت در مصاحبه.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.BUSINESS,
            audioUrl = "https://example.com/interview.mp3", durationMinutes = 10,
            transcript = "Job interviews can be stressful. Preparation is key. Research the company before your interview.",
            transcriptPersian = "مصاحبه‌های شغلی پراسترس هستند. آماده‌سازی کلیدی است. قبل از مصاحبه شرکت را تحقیق کنید.",
            vocabulary = listOf(Word("interview", "مصاحبه", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i14", title = "English Around the World", titlePersian = "انگلیسی در جهان",
            description = "Different varieties of English.", descriptionPersian = "گویش‌های مختلف انگلیسی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.CULTURE,
            audioUrl = "https://example.com/world.mp3", durationMinutes = 9,
            transcript = "English is spoken differently around the world. American English and British English have different spellings.",
            transcriptPersian = "انگلیسی در سراسر جهان متفاوت صحبت می‌شود. انگلیسی آمریکایی و بریتانیایی تفاوت‌هایی دارند.",
            vocabulary = listOf(Word("variety", "تنوع", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_i15", title = "Problem Solving", titlePersian = "حل مسئله",
            description = "Discuss and solve problems in English.", descriptionPersian = "حل مسئله به انگلیسی.",
            level = PodcastLevel.INTERMEDIATE, category = PodcastCategory.BUSINESS,
            audioUrl = "https://example.com/problem.mp3", durationMinutes = 9,
            transcript = "When solving problems, clear communication is essential. First, define the problem.",
            transcriptPersian = "هنگام حل مسئله، ارتباط واضح ضروری است. اول، مسئله را تعریف کنید.",
            vocabulary = listOf(Word("problem", "مسئله", "")), coverUrl = ""
        ),

        // ==================== 🏆 ADVANCED (۱۰ پادکست) ====================

        Podcast(
            id = "p_a1", title = "Climate Change", titlePersian = "تغییرات اقلیمی",
            description = "Climate change and global impact.", descriptionPersian = "تغییرات اقلیمی و تأثیر جهانی.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.SCIENCE,
            audioUrl = "https://example.com/climate.mp3", durationMinutes = 12,
            transcript = "Climate change represents one of the most significant challenges facing humanity today.",
            transcriptPersian = "تغییرات اقلیمی یکی از مهم‌ترین چالش‌های بشریت امروز است.",
            vocabulary = listOf(Word("climate", "اقلیم", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a2", title = "The Tell-Tale Heart", titlePersian = "قلب افشاگر",
            description = "Edgar Allan Poe's horror story.", descriptionPersian = "داستان ترسناک ادگار آلن پو.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.STORY,
            audioUrl = "https://example.com/telltale.mp3", durationMinutes = 15,
            transcript = "True! Nervous, very, very dreadfully nervous I had been and am; but why will you say that I am mad?",
            transcriptPersian = "راست است! عصبی، بسیار به‌طور وحشتناکی عصبی بوده‌ام؛ اما چرا می‌گویید دیوانه‌ام؟",
            vocabulary = listOf(Word("dreadfully", "به‌طور وحشتناک", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a3", title = "Future of AI", titlePersian = "آینده هوش مصنوعی",
            description = "Opportunities and challenges of AI.", descriptionPersian = "فرصت‌ها و چالش‌های AI.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.SCIENCE,
            audioUrl = "https://example.com/ai.mp3", durationMinutes = 14,
            transcript = "Artificial intelligence is transforming every aspect of modern life.",
            transcriptPersian = "هوش مصنوعی در حال دگرگون کردن هر جنبه‌ای از زندگی مدرن است.",
            vocabulary = listOf(Word("artificial", "مصنوعی", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a4", title = "Public Speaking", titlePersian = "سخنرانی در جمع",
            description = "Skills for public speaking.", descriptionPersian = "مهارت‌های سخنرانی.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.BUSINESS,
            audioUrl = "https://example.com/speaking.mp3", durationMinutes = 11,
            transcript = "Public speaking is one of the most valuable skills you can develop.",
            transcriptPersian = "سخنرانی در جمع یکی از ارزشمندترین مهارت‌هاست.",
            vocabulary = listOf(Word("deliberate", "هدفمند", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a5", title = "US Diversity", titlePersian = "تنوع آمریکایی",
            description = "Cultural diversity in the US.", descriptionPersian = "تنوع فرهنگی در آمریکا.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.CULTURE,
            audioUrl = "https://example.com/diversity.mp3", durationMinutes = 13,
            transcript = "The United States is often described as a melting pot, but this metaphor has evolved.",
            transcriptPersian = "ایالات متحده به عنوان دیگ ذوب توصیف می‌شود، اما این استعاره تکامل یافته.",
            vocabulary = listOf(Word("metaphor", "استعاره", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a6", title = "Science of Learning Languages", titlePersian = "علم یادگیری زبان",
            description = "Scientific insights on language learning.", descriptionPersian = "بینش علمی یادگیری زبان.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.SCIENCE,
            audioUrl = "https://example.com/learning.mp3", durationMinutes = 12,
            transcript = "Neuroscience has revealed fascinating insights into language learning.",
            transcriptPersian = "علوم اعصاب بینش‌های جذابی درباره یادگیری زبان آشکار کرده است.",
            vocabulary = listOf(Word("neuroscience", "علوم اعصاب", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a7", title = "Rip Van Winkle", titlePersian = "ریپ ون وینکل",
            description = "Washington Irving's classic tale.", descriptionPersian = "داستان کلاسیک واشنگتن ایروینگ.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.STORY,
            audioUrl = "https://example.com/rip.mp3", durationMinutes = 14,
            transcript = "In a small village at the foot of the Catskill Mountains, there lived a man named Rip Van Winkle.",
            transcriptPersian = "در دهکده‌ای کوچک در دامنه کوه‌های کتسکیل، مردی به نام ریپ ون وینکل زندگی می‌کرد.",
            vocabulary = listOf(Word("obedient", "مطیع", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a8", title = "Global Economy", titlePersian = "اقتصاد جهانی",
            description = "How the global economy works.", descriptionPersian = "نحوه کار اقتصاد جهانی.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.BUSINESS,
            audioUrl = "https://example.com/economy.mp3", durationMinutes = 13,
            transcript = "The global economy is a complex web of interconnected markets, trade routes, and financial systems.",
            transcriptPersian = "اقتصاد جهانی شبکه پیچیده‌ای از بازارها، مسیرهای تجاری و سیستم‌های مالی است.",
            vocabulary = listOf(Word("economy", "اقتصاد", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a9", title = "Philosophy of Happiness", titlePersian = "فلسفه شادی",
            description = "What philosophers say about happiness.", descriptionPersian = "نظر فیلسوفان درباره شادی.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.CULTURE,
            audioUrl = "https://example.com/happiness.mp3", durationMinutes = 12,
            transcript = "What is happiness? This question has occupied philosophers for millennia.",
            transcriptPersian = "شادی چیست؟ این سؤال هزاران سال فیلسوفان را مشغول کرده است.",
            vocabulary = listOf(Word("philosophy", "فلسفه", "")), coverUrl = ""
        ),
        Podcast(
            id = "p_a10", title = "Future of Work", titlePersian = "آینده کار",
            description = "How technology reshapes employment.", descriptionPersian = "چگونه تکنولوژی اشتغال را تغییر می‌دهد.",
            level = PodcastLevel.ADVANCED, category = PodcastCategory.BUSINESS,
            audioUrl = "https://example.com/work.mp3", durationMinutes = 13,
            transcript = "The nature of work is undergoing a profound transformation. Remote work has become permanent for millions.",
            transcriptPersian = "ماهیت کار در حال دگرگونی عمیقی است. کار از راه دور برای میلیون‌ها نفر دائمی شده است.",
            vocabulary = listOf(Word("transformation", "دگرگونی", "")), coverUrl = ""
        )
    )

    // ==================== توابع کمکی ====================

    fun getPodcastsByLevel(level: PodcastLevel): List<Podcast> =
        getAllPodcasts().filter { it.level == level }

    fun getPodcastsByCategory(category: PodcastCategory): List<Podcast> =
        getAllPodcasts().filter { it.category == category }

    fun getPodcastById(id: String): Podcast? =
        getAllPodcasts().firstOrNull { it.id == id }

    fun getCountByLevel(level: PodcastLevel): Int =
        getAllPodcasts().count { it.level == level }
}