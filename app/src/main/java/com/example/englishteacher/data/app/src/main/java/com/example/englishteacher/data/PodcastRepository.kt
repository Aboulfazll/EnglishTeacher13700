package com.example.englishteacher.data

object PodcastRepository {

    fun getAllPodcasts(): List<Podcast> = listOf(
        // ==================== 🌱 BEGINNER (۲۵ پادکست) ====================

        Podcast(
            id = "p_b1",
            title = "Greetings and Introductions",
            titlePersian = "سلام و معرفی",
            description = "Learn how to greet people and introduce yourself in English.",
            descriptionPersian = "یاد بگیرید چطور به انگلیسی سلام کنید و خودتان را معرفی کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/01/Greetings.mp3",
            durationMinutes = 5,
            transcript = "Hello! My name is Sarah. Nice to meet you. What is your name? My name is Ali. How are you? I am fine, thank you. Where are you from? I am from Iran. Goodbye! See you later.",
            transcriptPersian = "سلام! اسم من سارا است. از آشنایی با شما خوشحالم. اسم شما چیست؟ اسم من علی است. حال شما چطور است؟ خوبم، ممنون. اهل کجا هستید؟ من اهل ایران هستم. خداحافظ! بعداً می‌بینمت.",
            vocabulary = listOf(
                Word("greeting", "سلام و احوال‌پرسی", "ˈɡriːtɪŋ"),
                Word("introduce", "معرفی کردن", "ˌɪntrəˈduːs"),
                Word("nice to meet you", "از آشنایی خوشحالم", "")
            ),
            coverUrl = "https://images.unsplash.com/photo-1543269865-cbf427effbad?w=400"
        ),

        Podcast(
            id = "p_b2",
            title = "Numbers and Counting",
            titlePersian = "اعداد و شمارش",
            description = "Learn to count from one to twenty and use numbers in daily life.",
            descriptionPersian = "یاد بگیرید از یک تا بیست بشمارید و اعداد را در زندگی روزمره استفاده کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/02/Numbers.mp3",
            durationMinutes = 5,
            transcript = "One, two, three, four, five. I have five apples. Six, seven, eight, nine, ten. There are ten students in the class. Eleven, twelve, thirteen. My brother is thirteen years old. Twenty. I have twenty dollars. Numbers are everywhere!",
            transcriptPersian = "یک، دو، سه، چهار، پنج. من پنج تا سیب دارم. شش، هفت، هشت، نه، ده. ده تا دانش‌آموز در کلاس است. یازده، دوازده، سیزده. برادرم سیزده ساله است. بیست. من بیست دلار دارم. اعداد همه‌جا هستند!",
            vocabulary = listOf(
                Word("count", "شمردن", "kaʊnt"),
                Word("number", "عدد", "ˈnʌmbər"),
                Word("dollar", "دلار", "ˈdɒlər")
            ),
            coverUrl = "https://images.unsplash.com/photo-1596495578065-6e0763fa1178?w=400"
        ),

        Podcast(
            id = "p_b3",
            title = "Colors Around Us",
            titlePersian = "رنگ‌های اطراف ما",
            description = "Learn the names of colors in English with simple examples.",
            descriptionPersian = "با مثال‌های ساده، نام رنگ‌ها را به انگلیسی یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/03/Colors.mp3",
            durationMinutes = 5,
            transcript = "The sky is blue. The sun is yellow. The grass is green. The rose is red. Snow is white. Night is black. An orange is orange. A grape is purple. Brown is the color of wood. Pink is the color of a flower. What is your favorite color?",
            transcriptPersian = "آسمان آبی است. خورشید زرد است. چمن سبز است. گل رز قرمز است. برف سفید است. شب سیاه است. پرتقال نارنجی است. انگور بنفش است. قهوه‌ای رنگ چوب است. صورتی رنگ یک گل است. رنگ مورد علاقه‌ات چیست؟",
            vocabulary = listOf(
                Word("color", "رنگ", "ˈkʌlər"),
                Word("favorite", "مورد علاقه", "ˈfeɪvərɪt"),
                Word("purple", "بنفش", "ˈpɜːrpəl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1502691876148-a84978e59af8?w=400"
        ),

        Podcast(
            id = "p_b4",
            title = "Days of the Week",
            titlePersian = "روزهای هفته",
            description = "Learn the seven days of the week and how to talk about your schedule.",
            descriptionPersian = "هفت روز هفته را یاد بگیرید و در مورد برنامه‌تان صحبت کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/04/Days.mp3",
            durationMinutes = 5,
            transcript = "There are seven days in a week. Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday. Monday is the first day of the work week. Friday is my favorite day. Saturday and Sunday are the weekend. I rest on the weekend.",
            transcriptPersian = "هفت روز در هفته وجود دارد. دوشنبه، سه‌شنبه، چهارشنبه، پنجشنبه، جمعه، شنبه و یکشنبه. دوشنبه اولین روز هفته کاری است. جمعه روز مورد علاقه من است. شنبه و یکشنبه آخر هفته هستند. من در آخر هفته استراحت می‌کنم.",
            vocabulary = listOf(
                Word("week", "هفته", "wiːk"),
                Word("weekend", "آخر هفته", "ˈwiːkend"),
                Word("schedule", "برنامه", "ˈskedʒuːl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1506784983877-45594efa4cbe?w=400"
        ),

        Podcast(
            id = "p_b5",
            title = "At the Supermarket",
            titlePersian = "در سوپرمارکت",
            description = "Learn useful phrases for shopping at the supermarket.",
            descriptionPersian = "یاد بگیرید در سوپرمارکت چطور خرید کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/05/Market.mp3",
            durationMinutes = 6,
            transcript = "Excuse me, where is the milk? It is in aisle five. How much is this bread? It is two dollars. Do you have fresh fruit? Yes, we have apples and bananas. Can I help you? Yes, I need a bag. Here you are. Thank you!",
            transcriptPersian = "ببخشید، شیر کجاست؟ در راهروی پنجم است. این نان چقدر است؟ دو دلار است. میوه تازه دارید؟ بله، سیب و موز داریم. کمکی می‌توانم بکنم؟ بله، یک کیسه نیاز دارم. بفرمایید. متشکرم!",
            vocabulary = listOf(
                Word("supermarket", "سوپرمارکت", "ˈsuːpərmɑːrkɪt"),
                Word("aisle", "راهرو", "aɪl"),
                Word("fresh", "تازه", "freʃ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1542838132-92c53300491e?w=400"
        ),

        Podcast(
            id = "p_b6",
            title = "Family Members",
            titlePersian = "اعضای خانواده",
            description = "Learn the names of family members in English.",
            descriptionPersian = "نام اعضای خانواده را به انگلیسی یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/06/Family.mp3",
            durationMinutes = 5,
            transcript = "This is my family. I have a mother and a father. I have one brother and two sisters. My grandmother lives with us. My grandfather is in the photo. My uncle and aunt visit us on holidays. My cousins are my best friends. Family is important.",
            transcriptPersian = "این خانواده من است. من یک مادر و یک پدر دارم. یک برادر و دو خواهر دارم. مادربزرگم با ما زندگی می‌کند. پدربزرگم در عکس است. عمو و خاله‌ام در تعطیلات به دیدن ما می‌آیند. پسرعموهایم بهترین دوستان من هستند. خانواده مهم است.",
            vocabulary = listOf(
                Word("family", "خانواده", "ˈfæməli"),
                Word("brother", "برادر", "ˈbrʌðər"),
                Word("grandmother", "مادربزرگ", "ˈɡrænmʌðər")
            ),
            coverUrl = "https://images.unsplash.com/photo-1511895426328-dc8714191300?w=400"
        ),

        Podcast(
            id = "p_b7",
            title = "Weather Talk",
            titlePersian = "صحبت از آب و هوا",
            description = "Learn how to talk about the weather in simple English.",
            descriptionPersian = "یاد بگیرید چطور از آب و هوا به انگلیسی ساده صحبت کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/07/Weather.mp3",
            durationMinutes = 5,
            transcript = "How is the weather today? It is sunny. It is hot outside. Yesterday it was cold and rainy. Tomorrow it will be cloudy. I like sunny days. I do not like rain. What is the weather like in your city?",
            transcriptPersian = "امروز هوا چطور است؟ آفتابی است. بیرون گرم است. دیروز سرد و بارانی بود. فردا ابری خواهد بود. من روزهای آفتابی را دوست دارم. باران را دوست ندارم. هوا در شهر شما چطور است؟",
            vocabulary = listOf(
                Word("weather", "آب و هوا", "ˈweðər"),
                Word("sunny", "آفتابی", "ˈsʌni"),
                Word("cloudy", "ابری", "ˈklaʊdi")
            ),
            coverUrl = "https://images.unsplash.com/photo-1504608524841-42fe6f032b4b?w=400"
        ),

        Podcast(
            id = "p_b8",
            title = "At the Restaurant",
            titlePersian = "در رستوران",
            description = "Learn how to order food at a restaurant.",
            descriptionPersian = "یاد بگیرید در رستوران چطور غذا سفارش دهید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/08/Restaurant.mp3",
            durationMinutes = 6,
            transcript = "Welcome to our restaurant. A table for two, please. Here is the menu. What would you like to order? I would like a chicken sandwich. And to drink? A glass of water, please. Is it spicy? No, it is not. The food was delicious. Thank you!",
            transcriptPersian = "به رستوران ما خوش آمدید. یک میز برای دو نفر، لطفاً. این منو. چه چیزی میل دارید سفارش دهید؟ یک ساندویچ مرغ می‌خواهم. و برای نوشیدن؟ یک لیوان آب، لطفاً. تند است؟ نه، نیست. غذا خوشمزه بود. متشکرم!",
            vocabulary = listOf(
                Word("restaurant", "رستوران", "ˈrestərɑːnt"),
                Word("menu", "منو", "ˈmenjuː"),
                Word("delicious", "خوشمزه", "dɪˈlɪʃəs")
            ),
            coverUrl = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=400"
        ),

        Podcast(
            id = "p_b9",
            title = "My Daily Routine",
            titlePersian = "روتین روزانه من",
            description = "Learn how to describe your daily activities in English.",
            descriptionPersian = "یاد بگیرید فعالیت‌های روزانه‌تان را به انگلیسی توصیف کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/09/Routine.mp3",
            durationMinutes = 6,
            transcript = "I wake up at seven in the morning. I brush my teeth and take a shower. I eat breakfast at eight. I go to work at nine. I have lunch at noon. I finish work at five. I go home and cook dinner. I watch TV and go to bed at eleven.",
            transcriptPersian = "صبح ساعت هفت بیدار می‌شوم. دندان‌هایم را مسواک می‌زنم و دوش می‌گیرم. ساعت هشت صبحانه می‌خورم. ساعت نه به سر کار می‌روم. ظهر ناهار می‌خورم. ساعت پنج کارم تمام می‌شود. به خانه می‌روم و شام می‌پزم. تلویزیون تماشا می‌کنم و ساعت یازده می‌خوابم.",
            vocabulary = listOf(
                Word("routine", "روتین", "ruːˈtiːn"),
                Word("breakfast", "صبحانه", "ˈbrekfəst"),
                Word("shower", "دوش", "ˈʃaʊər")
            ),
            coverUrl = "https://images.unsplash.com/photo-1506784983877-45594efa4cbe?w=400"
        ),

        Podcast(
            id = "p_b10",
            title = "Telling Time",
            titlePersian = "گفتن ساعت",
            description = "Learn how to tell time in English.",
            descriptionPersian = "یاد بگیرید چطور ساعت را به انگلیسی بگویید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/10/Time.mp3",
            durationMinutes = 5,
            transcript = "What time is it? It is three o'clock. It is half past four. It is quarter past five. It is quarter to six. It is seven thirty. The meeting is at nine. I will be there at eight forty-five. Do not be late!",
            transcriptPersian = "ساعت چند است؟ ساعت سه است. ساعت چهار و نیم است. ساعت پنج و ربع است. ساعت شش و ربع به شش است. ساعت هفت و نیم است. جلسه ساعت نه است. ساعت هشت و چهل و پنج دقیقه آنجا خواهم بود. دیر نکن!",
            vocabulary = listOf(
                Word("o'clock", "ساعت", "əˈklɒk"),
                Word("quarter", "ربع", "ˈkwɔːrtər"),
                Word("meeting", "جلسه", "ˈmiːtɪŋ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1495364141860-b0d03eccd065?w=400"
        ),

        Podcast(
            id = "p_b11",
            title = "My Hobbies",
            titlePersian = "سرگرمی‌های من",
            description = "Learn to talk about hobbies and free time activities.",
            descriptionPersian = "یاد بگیرید در مورد سرگرمی‌ها و اوقات فراغت صحبت کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/11/Hobbies.mp3",
            durationMinutes = 5,
            transcript = "What do you do in your free time? I like reading books. I also enjoy playing football. My sister loves painting. My brother likes video games. Do you like music? Yes, I listen to music every day. Hobbies make life fun!",
            transcriptPersian = "در وقت آزادت چه کار می‌کنی؟ کتاب خواندن را دوست دارم. فوتبال بازی کردن را هم دوست دارم. خواهرم عاشق نقاشی است. برادرم بازی‌های ویدیویی را دوست دارد. موسیقی دوست داری؟ بله، هر روز موسیقی گوش می‌دهم. سرگرمی‌ها زندگی را سرگرم‌کننده می‌کنند!",
            vocabulary = listOf(
                Word("hobby", "سرگرمی", "ˈhɒbi"),
                Word("free time", "وقت آزاد", "friː taɪm"),
                Word("enjoy", "لذت بردن", "ɪnˈdʒɔɪ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1519389950473-47ba0277781c?w=400"
        ),

        Podcast(
            id = "p_b12",
            title = "In the Classroom",
            titlePersian = "در کلاس درس",
            description = "Learn phrases used in the classroom.",
            descriptionPersian = "یاد بگیرید در کلاس درس از چه جملاتی استفاده کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/12/Classroom.mp3",
            durationMinutes = 5,
            transcript = "Good morning, class. Good morning, teacher. Open your books to page ten. Please read the first paragraph. I have a question. Yes, what is it? I do not understand this word. Can you explain it? Of course. The word means happy. Now, let us continue.",
            transcriptPersian = "صبح بخیر، کلاس. صبح بخیر، معلم. کتاب‌هایتان را به صفحه ده باز کنید. لطفاً پاراگراف اول را بخوانید. یک سؤال دارم. بله، چیه؟ این کلمه را نمی‌فهمم. می‌توانید توضیح دهید؟ البته. این کلمه یعنی خوشحال. حالا، بیایید ادامه دهیم.",
            vocabulary = listOf(
                Word("classroom", "کلاس درس", "ˈklæsruːm"),
                Word("paragraph", "پاراگراف", "ˈpærəɡræf"),
                Word("explain", "توضیح دادن", "ɪkˈspleɪn")
            ),
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Podcast(
            id = "p_b13",
            title = "Transportation",
            titlePersian = "حمل و نقل",
            description = "Learn about different types of transportation.",
            descriptionPersian = "با انواع وسایل نقلیه آشنا شوید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/13/Transport.mp3",
            durationMinutes = 5,
            transcript = "How do you go to work? I take the bus. Sometimes I drive my car. My friend takes the train. The subway is fast. Bicycles are good for health. Airplanes fly in the sky. Ships sail on the sea. What is your favorite way to travel?",
            transcriptPersian = "چطور به سر کار می‌روی؟ اتوبوس می‌گیرم. گاهی ماشینم را می‌رانم. دوستم قطار می‌گیرد. مترو سریع است. دوچرخه‌ها برای سلامتی خوب هستند. هواپیماها در آسمان پرواز می‌کنند. کشتی‌ها در دریا حرکت می‌کنند. راه مورد علاقه‌ات برای سفر چیست؟",
            vocabulary = listOf(
                Word("transportation", "حمل و نقل", "ˌtrænspɔːrˈteɪʃn"),
                Word("subway", "مترو", "ˈsʌbweɪ"),
                Word("airplane", "هواپیما", "ˈerpleɪn")
            ),
            coverUrl = "https://images.unsplash.com/photo-1544620347-c4fd4a3d5957?w=400"
        ),

        Podcast(
            id = "p_b14",
            title = "Food and Drinks",
            titlePersian = "غذا و نوشیدنی",
            description = "Learn the names of common foods and drinks.",
            descriptionPersian = "نام غذاها و نوشیدنی‌های رایج را یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/14/Food.mp3",
            durationMinutes = 5,
            transcript = "I am hungry. I want to eat rice with chicken. My friend likes pizza and pasta. For breakfast, I eat bread and cheese. I drink tea in the morning. My mother drinks coffee. Water is very healthy. Fruits and vegetables are good for you. What is your favorite food?",
            transcriptPersian = "گرسنه‌ام. می‌خواهم برنج با مرغ بخورم. دوستم پیتزا و پاستا دوست دارد. برای صبحانه، نان و پنیر می‌خورم. صبح چای می‌نوشم. مادرم قهوه می‌نوشد. آب خیلی سالم است. میوه‌ها و سبزیجات برای شما خوب هستند. غذای مورد علاقه‌ات چیست؟",
            vocabulary = listOf(
                Word("food", "غذا", "fuːd"),
                Word("breakfast", "صبحانه", "ˈbrekfəst"),
                Word("healthy", "سالم", "ˈhelθi")
            ),
            coverUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?w=400"
        ),

        Podcast(
            id = "p_b15",
            title = "Asking for Directions",
            titlePersian = "پرسیدن آدرس",
            description = "Learn how to ask for and give directions.",
            descriptionPersian = "یاد بگیرید چطور آدرس بپرسید و بدهید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/15/Directions.mp3",
            durationMinutes = 6,
            transcript = "Excuse me, how do I get to the bank? Go straight for two blocks. Then turn left at the traffic light. The bank is on your right. Is it far? No, it is about five minutes on foot. Thank you very much! You are welcome.",
            transcriptPersian = "ببخشید، چطور به بانک بروم؟ مستقیم دو بلوک برو. بعد در چراغ راهنما به چپ بپیچ. بانک سمت راستت است. دور است؟ نه، حدود پنج دقیقه پیاده است. خیلی ممنون! خواهش می‌کنم.",
            vocabulary = listOf(
                Word("direction", "جهت/آدرس", "dəˈrekʃn"),
                Word("straight", "مستقیم", "streɪt"),
                Word("traffic light", "چراغ راهنما", "ˈtræfɪk laɪt")
            ),
            coverUrl = "https://images.unsplash.com/photo-1524661135-423995f22d0b?w=400"
        ),

        Podcast(
            id = "p_b16",
            title = "Months and Seasons",
            titlePersian = "ماه‌ها و فصل‌ها",
            description = "Learn the twelve months and four seasons.",
            descriptionPersian = "دوازده ماه و چهار فصل را یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/16/Months.mp3",
            durationMinutes = 5,
            transcript = "There are twelve months in a year. January, February, March, April, May, June, July, August, September, October, November, December. There are four seasons: spring, summer, fall, and winter. My birthday is in June. What about yours?",
            transcriptPersian = "دوازده ماه در سال وجود دارد. ژانویه، فوریه، مارس، آوریل، مه، ژوئن، ژوئیه، آگوست، سپتامبر، اکتبر، نوامبر، دسامبر. چهار فصل وجود دارد: بهار، تابستان، پاییز و زمستان. تولد من در ژوئن است. مال تو چطور؟",
            vocabulary = listOf(
                Word("month", "ماه", "mʌnθ"),
                Word("season", "فصل", "ˈsiːzn"),
                Word("birthday", "تولد", "ˈbɜːrθdeɪ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1476820865390-c52aeebb9891?w=400"
        ),

        Podcast(
            id = "p_b17",
            title = "Clothes and Shopping",
            titlePersian = "لباس و خرید",
            description = "Learn names of clothes and how to shop for them.",
            descriptionPersian = "نام لباس‌ها را یاد بگیرید و چطور آن‌ها را بخرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/17/Clothes.mp3",
            durationMinutes = 5,
            transcript = "I need new clothes. I like this blue shirt. Do you have it in a larger size? Yes, here you are. How much does it cost? It is twenty dollars. I will take it. I also need shoes and a jacket. Thank you for your help.",
            transcriptPersian = "لباس جدید لازم دارم. این پیراهن آبی را دوست دارم. سایز بزرگ‌ترش را دارید؟ بله، بفرمایید. چقدر هزینه دارد؟ بیست دلار است. آن را می‌خرم. کفش و کاپشن هم لازم دارم. ممنون از کمکت.",
            vocabulary = listOf(
                Word("clothes", "لباس", "kloʊðz"),
                Word("shirt", "پیراهن", "ʃɜːrt"),
                Word("jacket", "کاپشن", "ˈdʒækɪt")
            ),
            coverUrl = "https://images.unsplash.com/photo-1445205170230-053b83016050?w=400"
        ),

        Podcast(
            id = "p_b18",
            title = "The Alphabet",
            titlePersian = "الفبای انگلیسی",
            description = "Learn the English alphabet from A to Z.",
            descriptionPersian = "الفبای انگلیسی را از A تا Z یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.PRONUNCIATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/18/Alphabet.mp3",
            durationMinutes = 5,
            transcript = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z. There are twenty-six letters in the English alphabet. Five of them are vowels: A, E, I, O, U. The rest are consonants. Spelling is important!",
            transcriptPersian = "اِی، بی، سی، دی، ای، اِف، جی، اِچ، آی، جِی، کِی، اِل، اِم، اِن، اُ، پی، کیو، آر، اِس، تی، یو، وی، دابلیو، اِکس، وای، زِد. بیست و شش حرف در الفبای انگلیسی وجود دارد. پنج تای آن‌ها حروف صدادار هستند: A، E، I، O، U. بقیه صامت هستند. هجی کردن مهم است!",
            vocabulary = listOf(
                Word("alphabet", "الفبا", "ˈælfəbet"),
                Word("letter", "حرف", "ˈletər"),
                Word("vowel", "حرف صدادار", "ˈvaʊəl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Podcast(
            id = "p_b19",
            title = "At the Doctor",
            titlePersian = "پیش دکتر",
            description = "Learn useful phrases when you visit a doctor.",
            descriptionPersian = "یاد بگیرید وقتی پیش دکتر می‌روید چه بگویید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/19/Doctor.mp3",
            durationMinutes = 6,
            transcript = "Good morning, doctor. What is the problem? I have a headache and a fever. How long have you had it? Since yesterday. Do you have a cough? Yes, a little. Take this medicine twice a day. Drink plenty of water and rest. Thank you, doctor.",
            transcriptPersian = "صبح بخیر، دکتر. مشکل چیه؟ سردرد و تب دارم. از چه زمانی داری؟ از دیروز. سرفه داری؟ بله، کمی. این دارو را روزی دو بار بخور. زیاد آب بنوش و استراحت کن. ممنون، دکتر.",
            vocabulary = listOf(
                Word("doctor", "دکتر", "ˈdɒktər"),
                Word("headache", "سردرد", "ˈhedeɪk"),
                Word("medicine", "دارو", "ˈmedsn")
            ),
            coverUrl = "https://images.unsplash.com/photo-1576091160399-112ba8d25d1d?w=400"
        ),

        Podcast(
            id = "p_b20",
            title = "At the Hotel",
            titlePersian = "در هتل",
            description = "Learn how to check in and out of a hotel.",
            descriptionPersian = "یاد بگیرید چطور در هتل چک‌این و چک‌اوت کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/20/Hotel.mp3",
            durationMinutes = 6,
            transcript = "Welcome to the Grand Hotel. I have a reservation. What is your name? Ali Ahmadi. Yes, we have your room. Room 305 on the third floor. Here is your key. Breakfast is from seven to ten. Enjoy your stay! Thank you very much.",
            transcriptPersian = "به هتل گرند خوش آمدید. من رزرو دارم. اسم شما چیه؟ علی احمدی. بله، اتاق شما را داریم. اتاق ۳۰۵ در طبقه سوم. این کلید شما. صبحانه از هفت تا ده است. از اقامتتان لذت ببرید! خیلی ممنون.",
            vocabulary = listOf(
                Word("hotel", "هتل", "hoʊˈtel"),
                Word("reservation", "رزرو", "ˌrezərˈveɪʃn"),
                Word("key", "کلید", "kiː")
            ),
            coverUrl = "https://images.unsplash.com/photo-1566073771259-6a8506099945?w=400"
        ),

        Podcast(
            id = "p_b21",
            title = "Pets and Animals",
            titlePersian = "حیوانات خانگی",
            description = "Learn the names of common pets and animals.",
            descriptionPersian = "نام حیوانات خانگی و رایج را یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/21/Pets.mp3",
            durationMinutes = 5,
            transcript = "I have a pet cat. Her name is Mimi. My friend has a dog named Rex. Dogs are loyal. Cats are independent. Some people have birds or fish. My neighbor has a rabbit. What pet do you have? I do not have a pet, but I love animals.",
            transcriptPersian = "من یک گربه خانگی دارم. اسمش میمی است. دوستم یک سگ به نام رکس دارد. سگ‌ها وفادار هستند. گربه‌ها مستقل هستند. بعضی‌ها پرنده یا ماهی دارند. همسایه‌ام یک خرگوش دارد. تو چه حیوان خانگی داری؟ من حیوان خانگی ندارم، ولی عاشق حیوانات هستم.",
            vocabulary = listOf(
                Word("pet", "حیوان خانگی", "pet"),
                Word("loyal", "وفادار", "ˈlɔɪəl"),
                Word("independent", "مستقل", "ˌɪndɪˈpendənt")
            ),
            coverUrl = "https://images.unsplash.com/photo-1425082661705-1834bfd09dca?w=400"
        ),

        Podcast(
            id = "p_b22",
            title = "Making a Phone Call",
            titlePersian = "تماس تلفنی",
            description = "Learn how to make and receive phone calls.",
            descriptionPersian = "یاد بگیرید چطور تماس تلفنی بگیرید و پاسخ دهید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/22/Phone.mp3",
            durationMinutes = 6,
            transcript = "Hello, this is Sara speaking. Hi Sara, this is Ali. How are you? I am fine, thanks. Can I speak to Mr. Smith, please? Hold on a moment, please. I am sorry, he is not available right now. Can I take a message? Yes, please tell him to call me back. Sure, goodbye!",
            transcriptPersian = "سلام، سارا صحبت می‌کند. سلام سارا، علی هستم. حالت چطوره؟ خوبم، ممنون. می‌توانم با آقای اسمیت صحبت کنم، لطفاً؟ یک لحظه صبر کنید، لطفاً. متأسفم، الان در دسترس نیست. پیغام بگذارم؟ بله، لطفاً بهش بگید بهم زنگ بزنه. حتماً، خداحافظ!",
            vocabulary = listOf(
                Word("phone call", "تماس تلفنی", "foʊn kɔːl"),
                Word("message", "پیغام", "ˈmesɪdʒ"),
                Word("available", "در دسترس", "əˈveɪləbl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1523474253046-8cd2748b5fd2?w=400"
        ),

        Podcast(
            id = "p_b23",
            title = "The Body Parts",
            titlePersian = "اعضای بدن",
            description = "Learn the names of body parts in English.",
            descriptionPersian = "نام اعضای بدن را به انگلیسی یاد بگیرید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/23/Body.mp3",
            durationMinutes = 5,
            transcript = "This is my head. These are my eyes, my nose, and my mouth. I have two ears to hear. My arms and hands help me work. My legs and feet help me walk. My heart is inside my chest. The body is amazing!",
            transcriptPersian = "این سر من است. این‌ها چشم‌هایم، بینی‌ام و دهانم هستند. دو گوش برای شنیدن دارم. دست‌ها و بازوهایم به من در کار کمک می‌کنند. پاهایم به من در راه رفتن کمک می‌کنند. قلبم داخل سینه‌ام است. بدن شگفت‌انگیز است!",
            vocabulary = listOf(
                Word("body", "بدن", "ˈbɒdi"),
                Word("head", "سر", "hed"),
                Word("hand", "دست", "hænd")
            ),
            coverUrl = "https://images.unsplash.com/photo-1571019613454-1cb2f99b2d8b?w=400"
        ),

        Podcast(
            id = "p_b24",
            title = "At the Bank",
            titlePersian = "در بانک",
            description = "Learn useful phrases for going to the bank.",
            descriptionPersian = "یاد بگیرید در بانک چه جملاتی استفاده کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/24/Bank.mp3",
            durationMinutes = 6,
            transcript = "Good morning, how can I help you? I want to open a bank account. Do you have your ID? Yes, here it is. Please fill out this form. How much do you want to deposit? Five hundred dollars. Here is your account number. Thank you!",
            transcriptPersian = "صبح بخیر، چطور می‌توانم کمکتان کنم؟ می‌خواهم یک حساب بانکی باز کنم. کارت شناسایی دارید؟ بله، بفرمایید. لطفاً این فرم را پر کنید. چقدر می‌خواهید واریز کنید؟ پانصد دلار. این شماره حساب شما. متشکرم!",
            vocabulary = listOf(
                Word("bank", "بانک", "bæŋk"),
                Word("account", "حساب", "əˈkaʊnt"),
                Word("deposit", "واریز کردن", "dɪˈpɒzɪt")
            ),
            coverUrl = "https://images.unsplash.com/photo-1541354329998-f4d9a9f9297f?w=400"
        ),

        Podcast(
            id = "p_b25",
            title = "Happy Birthday!",
            titlePersian = "تولدت مبارک!",
            description = "Learn how to talk about birthdays and celebrations.",
            descriptionPersian = "یاد بگیرید چطور در مورد تولد و جشن‌ها صحبت کنید.",
            level = PodcastLevel.BEGINNER,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/01/25/Birthday.mp3",
            durationMinutes = 5,
            transcript = "Happy birthday! Thank you so much! How old are you today? I am twenty years old. Here is your gift. Oh, thank you! I love it. Let us cut the cake. The cake is delicious. Did you make a wish? Yes, I did. This is the best birthday ever!",
            transcriptPersian = "تولدت مبارک! خیلی ممنون! امروز چند ساله شدی؟ بیست ساله شدم. این هدیه‌ات. اوه، ممنون! عاشقش شدم. بیا کیک رو ببریم. کیک خوشمزه است. آرزو کردی؟ بله، کردم. این بهترین تولد تا حالا بوده!",
            vocabulary = listOf(
                Word("birthday", "تولد", "ˈbɜːrθdeɪ"),
                Word("gift", "هدیه", "ɡɪft"),
                Word("wish", "آرزو", "wɪʃ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1530103862676-de8c9debad1d?w=400"
        )

        // ⚠️ ادامه پادکست‌ها (۱۵ متوسط + ۱۰ پیشرفته) در قسمت دوم ارسال می‌شود
    )
}        // ==================== 🚀 INTERMEDIATE (۱۵ پادکست) ====================

        Podcast(
            id = "p_i1",
            title = "Everyday Grammar: Present Simple",
            titlePersian = "گرامر روزمره: حال ساده",
            description = "Learn how to use the present simple tense correctly.",
            descriptionPersian = "یاد بگیرید چطور از زمان حال ساده درست استفاده کنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.GRAMMAR,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/01/PresentSimple.mp3",
            durationMinutes = 8,
            transcript = "The present simple tense is used for habits, facts, and routines. For example: I wake up at seven every day. She works in a hospital. They play football on weekends. Notice that we add 's' or 'es' to the verb for he, she, and it. He goes to school. She watches TV. Do you understand? Let us practice together.",
            transcriptPersian = "زمان حال ساده برای عادت‌ها، حقایق و روتین‌ها استفاده می‌شود. مثلاً: من هر روز ساعت هفت بیدار می‌شوم. او در بیمارستان کار می‌کند. آن‌ها آخر هفته‌ها فوتبال بازی می‌کنند. توجه کنید که برای he، she و it به فعل 's' یا 'es' اضافه می‌کنیم. او به مدرسه می‌رود. او تلویزیون تماشا می‌کند. متوجه شدید؟ بیایید با هم تمرین کنیم.",
            vocabulary = listOf(
                Word("habit", "عادت", "ˈhæbɪt"),
                Word("routine", "روتین", "ruːˈtiːn"),
                Word("tense", "زمان (دستور زبان)", "tens")
            ),
            coverUrl = "https://images.unsplash.com/photo-1456513080510-7bf3a84b82f8?w=400"
        ),

        Podcast(
            id = "p_i2",
            title = "Common English Idioms",
            titlePersian = "اصطلاحات رایج انگلیسی",
            description = "Learn popular English idioms and their meanings.",
            descriptionPersian = "اصطلاحات رایج انگلیسی و معانی آن‌ها را یاد بگیرید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.IDIOMS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/02/Idioms.mp3",
            durationMinutes = 9,
            transcript = "Today we will learn some common English idioms. 'Break a leg' means good luck. 'It is raining cats and dogs' means it is raining very hard. 'Once in a blue moon' means very rarely. 'Piece of cake' means something very easy. 'Hit the books' means to study hard. Using idioms makes your English sound more natural.",
            transcriptPersian = "امروز چند اصطلاح رایج انگلیسی یاد می‌گیریم. 'Break a leg' یعنی موفق باشی. 'It is raining cats and dogs' یعنی باران خیلی شدید می‌بارد. 'Once in a blue moon' یعنی خیلی به‌ندرت. 'Piece of cake' یعنی خیلی آسان. 'Hit the books' یعنی سخت درس خواندن. استفاده از اصطلاحات انگلیسی شما را طبیعی‌تر می‌کند.",
            vocabulary = listOf(
                Word("idiom", "اصطلاح", "ˈɪdiəm"),
                Word("rarely", "به‌ندرت", "ˈreərli"),
                Word("natural", "طبیعی", "ˈnætʃrəl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Podcast(
            id = "p_i3",
            title = "Words and Their Stories: Heart",
            titlePersian = "کلمات و داستان‌هایشان: قلب",
            description = "Explore English expressions that use the word 'heart'.",
            descriptionPersian = "اصطلاحات انگلیسی که از کلمه 'قلب' استفاده می‌کنند را بررسی کنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/03/Heart.mp3",
            durationMinutes = 8,
            transcript = "The word 'heart' appears in many English expressions. If you 'wear your heart on your sleeve', you show your feelings openly. If you 'have a heart of gold', you are very kind. If something 'breaks your heart', it makes you very sad. If you 'learn by heart', you memorize something completely. The heart is not just an organ; it is a symbol of emotion.",
            transcriptPersian = "کلمه 'heart' در بسیاری از اصطلاحات انگلیسی ظاهر می‌شود. اگر 'wear your heart on your sleeve' کنید، احساساتتان را آشکارا نشان می‌دهید. اگر 'have a heart of gold' داشته باشید، خیلی مهربان هستید. اگر چیزی 'قلبتان را بشکند'، شما را خیلی غمگین می‌کند. اگر چیزی را 'learn by heart' کنید، آن را کاملاً حفظ می‌کنید. قلب فقط یک اندام نیست؛ نماد احساسات است.",
            vocabulary = listOf(
                Word("expression", "اصطلاح/عبارت", "ɪkˈspreʃn"),
                Word("feelings", "احساسات", "ˈfiːlɪŋz"),
                Word("memorize", "حفظ کردن", "ˈmeməraɪz")
            ),
            coverUrl = "https://images.unsplash.com/photo-1518199266791-5375a83190b7?w=400"
        ),

        Podcast(
            id = "p_i4",
            title = "Making Small Talk",
            titlePersian = "گپ و گفت‌وگوی کوتاه",
            description = "Learn how to make small talk in English.",
            descriptionPersian = "یاد بگیرید چطور در انگلیسی گپ کوتاه بزنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.CONVERSATION,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/04/SmallTalk.mp3",
            durationMinutes = 9,
            transcript = "Small talk is important in English-speaking cultures. Good topics include weather, sports, and hobbies. Avoid topics like politics, religion, and money. Start with: 'How was your weekend?' or 'Did you watch the game last night?' Listen actively and ask follow-up questions. Small talk helps build relationships and makes people feel comfortable.",
            transcriptPersian = "گپ کوتاه در فرهنگ‌های انگلیسی‌زبان مهم است. موضوعات خوب شامل آب و هوا، ورزش و سرگرمی‌ها می‌شود. از موضوعاتی مثل سیاست، مذهب و پول اجتناب کنید. با این شروع کنید: 'آخر هفته‌ات چطور بود؟' یا 'دیشب بازی را دیدی؟' فعالانه گوش دهید و سؤال پیگیری بپرسید. گپ کوتاه به ساختن روابط کمک می‌کند و افراد را راحت می‌کند.",
            vocabulary = listOf(
                Word("small talk", "گپ کوتاه", "smɔːl tɔːk"),
                Word("topic", "موضوع", "ˈtɒpɪk"),
                Word("avoid", "اجتناب کردن", "əˈvɔɪd")
            ),
            coverUrl = "https://images.unsplash.com/photo-1543269865-cbf427effbad?w=400"
        ),

        Podcast(
            id = "p_i5",
            title = "As It Is: Technology in Education",
            titlePersian = "همان‌طور که هست: تکنولوژی در آموزش",
            description = "Read about how technology is changing education worldwide.",
            descriptionPersian = "درباره چگونگی تغییر آموزش توسط تکنولوژی در سراسر جهان بخوانید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.NEWS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/05/TechEdu.mp3",
            durationMinutes = 10,
            transcript = "Technology is changing education in many ways. Students now use tablets and laptops in classrooms. Online courses allow people to learn from anywhere in the world. Artificial intelligence helps teachers personalize lessons. However, not everyone has access to technology. The digital divide remains a challenge. Experts say we must ensure all students have equal opportunities to learn.",
            transcriptPersian = "تکنولوژی آموزش را از راه‌های زیادی تغییر می‌دهد. دانش‌آموزان اکنون از تبلت و لپ‌تاپ در کلاس استفاده می‌کنند. دوره‌های آنلاین به مردم اجازه می‌دهند از هر جای دنیا یاد بگیرند. هوش مصنوعی به معلمان کمک می‌کند درس‌ها را شخصی‌سازی کنند. با این حال، همه به تکنولوژی دسترسی ندارند. شکاف دیجیتال همچنان یک چالش است. کارشناسان می‌گویند باید اطمینان حاصل کنیم همه دانش‌آموزان فرصت‌های برابر برای یادگیری دارند.",
            vocabulary = listOf(
                Word("technology", "تکنولوژی", "tekˈnɒlədʒi"),
                Word("online", "آنلاین", "ˌɒnˈlaɪn"),
                Word("challenge", "چالش", "ˈtʃælɪndʒ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1509062522246-3755977927d7?w=400"
        ),

        Podcast(
            id = "p_i6",
            title = "English in a Minute: Phrasal Verbs",
            titlePersian = "انگلیسی در یک دقیقه: افعال عبارتی",
            description = "Learn common phrasal verbs in English.",
            descriptionPersian = "افعال عبارتی رایج انگلیسی را یاد بگیرید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.GRAMMAR,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/06/Phrasal.mp3",
            durationMinutes = 7,
            transcript = "Phrasal verbs are verbs combined with prepositions. They often have different meanings than the original verb. For example: 'Give up' means to quit. 'Look after' means to take care of. 'Turn on' means to start a device. 'Run into' means to meet by chance. Phrasal verbs are very common in everyday English. Learning them will improve your fluency.",
            transcriptPersian = "افعال عبارتی، افعالی هستند که با حروف اضافه ترکیب می‌شوند. آن‌ها اغلب معنای متفاوتی از فعل اصلی دارند. مثلاً: 'Give up' یعنی تسلیم شدن. 'Look after' یعنی مراقبت کردن. 'Turn on' یعنی روشن کردن دستگاه. 'Run into' یعنی تصادفی دیدن. افعال عبارتی در انگلیسی روزمره بسیار رایج هستند. یادگیری آن‌ها روانی شما را بهبود می‌بخشد.",
            vocabulary = listOf(
                Word("phrasal verb", "فعل عبارتی", "ˈfreɪzl vɜːrb"),
                Word("preposition", "حرف اضافه", "ˌprepəˈzɪʃn"),
                Word("fluency", "روانی", "ˈfluːənsi")
            ),
            coverUrl = "https://images.unsplash.com/photo-1456513080510-7bf3a84b82f8?w=400"
        ),

        Podcast(
            id = "p_i7",
            title = "American Stories: The Gift of the Magi",
            titlePersian = "داستان‌های آمریکایی: هدیه مغ‌ها",
            description = "Listen to a classic American short story by O. Henry.",
            descriptionPersian = "به یک داستان کوتاه کلاسیک آمریکایی از او. هنری گوش دهید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.STORY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/07/Magi.mp3",
            durationMinutes = 12,
            transcript = "This is a story about a young couple, Jim and Della, who have very little money. Christmas is coming, and each wants to buy a special gift for the other. Della sells her beautiful long hair to buy a chain for Jim's watch. Jim sells his watch to buy combs for Della's hair. On Christmas Eve, they discover what each has done. Their gifts are useless, but their love is priceless.",
            transcriptPersian = "این داستانی است درباره یک زوج جوان، جیم و دلا، که پول بسیار کمی دارند. کریسمس نزدیک است و هر کدام می‌خواهند هدیه‌ای خاص برای دیگری بخرند. دلا موهای بلند و زیبایش را می‌فروشد تا زنجیری برای ساعت جیم بخرد. جیم ساعتش را می‌فروشد تا شانه‌هایی برای موهای دلا بخرد. در شب کریسمس، آن‌ها متوجه می‌شوند هر کدام چه کرده‌اند. هدایایشان بی‌استفاده است، اما عشقشان بی‌قیمت است.",
            vocabulary = listOf(
                Word("couple", "زوج", "ˈkʌpl"),
                Word("priceless", "بی‌قیمت", "ˈpraɪsləs"),
                Word("discover", "کشف کردن", "dɪˈskʌvər")
            ),
            coverUrl = "https://images.unsplash.com/photo-1512389142860-9c449e58a543?w=400"
        ),

        Podcast(
            id = "p_i8",
            title = "Everyday Grammar: Past Tense",
            titlePersian = "گرامر روزمره: زمان گذشته",
            description = "Master the past simple and past continuous tenses.",
            descriptionPersian = "زمان گذشته ساده و گذشته استمراری را مسلط شوید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.GRAMMAR,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/08/PastTense.mp3",
            durationMinutes = 9,
            transcript = "The past simple describes completed actions in the past. For example: I visited my grandmother yesterday. The past continuous describes actions that were in progress. For example: I was reading when the phone rang. Regular verbs add 'ed' in the past, but irregular verbs change completely. Go becomes went. Eat becomes ate. See becomes saw. Do you know the past form of 'buy'? It is 'bought'.",
            transcriptPersian = "گذشته ساده اعمال کامل‌شده در گذشته را توصیف می‌کند. مثلاً: دیروز به دیدن مادربزرگم رفتم. گذشته استمراری اعمالی را توصیف می‌کند که در حال انجام بودند. مثلاً: وقتی تلفن زنگ زد، در حال خواندن بودم. افعال با قاعده در گذشته 'ed' می‌گیرند، اما افعال بی‌قاعده کاملاً تغییر می‌کنند. Go می‌شود went. Eat می‌شود ate. See می‌شود saw. شکل گذشته 'buy' را می‌دانید؟ می‌شود 'bought'.",
            vocabulary = listOf(
                Word("past tense", "زمان گذشته", "pæst tens"),
                Word("irregular", "بی‌قاعده", "ɪˈreɡjələr"),
                Word("complete", "کامل کردن", "kəmˈpliːt")
            ),
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Podcast(
            id = "p_i9",
            title = "Words and Their Stories: Luck",
            titlePersian = "کلمات و داستان‌هایشان: شانس",
            description = "Explore English expressions about luck and fortune.",
            descriptionPersian = "اصطلاحات انگلیسی درباره شانس و اقبال را بررسی کنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.IDIOMS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/09/Luck.mp3",
            durationMinutes = 8,
            transcript = "Many English expressions are about luck. 'Lucky break' means a fortunate opportunity. 'Down on your luck' means experiencing bad times. 'Beginner's luck' describes success on the first try. 'Push your luck' means to take unnecessary risks. 'Better luck next time' is a kind way to comfort someone after failure. In English-speaking cultures, luck is often associated with symbols like four-leaf clovers and horseshoes.",
            transcriptPersian = "بسیاری از اصطلاحات انگلیسی درباره شانس هستند. 'Lucky break' یعنی فرصت خوش‌شانسانه. 'Down on your luck' یعنی دوران بدی را تجربه کردن. 'Beginner's luck' موفقیت در اولین تلاش را توصیف می‌کند. 'Push your luck' یعنی ریسک‌های غیرضروری کردن. 'Better luck next time' روشی مهربانانه برای دلگرمی دادن به کسی بعد از شکست است. در فرهنگ‌های انگلیسی‌زبان، شانس اغلب با نمادهایی مثل شبدر چهارپر و نعل اسب مرتبط است.",
            vocabulary = listOf(
                Word("luck", "شانس", "lʌk"),
                Word("fortune", "اقبال", "ˈfɔːrtʃuːn"),
                Word("opportunity", "فرصت", "ˌɒpərˈtuːnəti")
            ),
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),

        Podcast(
            id = "p_i10",
            title = "Health and Fitness",
            titlePersian = "سلامتی و تناسب اندام",
            description = "Learn vocabulary about health, exercise, and fitness.",
            descriptionPersian = "لغات مربوط به سلامتی، ورزش و تناسب اندام را یاد بگیرید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.VOCABULARY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/10/Health.mp3",
            durationMinutes = 8,
            transcript = "Staying healthy is important. Regular exercise helps you maintain a healthy weight and reduces stress. Eat a balanced diet with fruits, vegetables, and whole grains. Drink plenty of water. Get enough sleep - at least seven hours a night. Avoid smoking and excessive alcohol. Visit your doctor for regular checkups. Small healthy habits add up to big results over time.",
            transcriptPersian = "سالم ماندن مهم است. ورزش منظم به شما کمک می‌کند وزن سالمی داشته باشید و استرس را کاهش دهید. رژیم متعادلی با میوه‌ها، سبزیجات و غلات کامل داشته باشید. به مقدار زیاد آب بنوشید. خواب کافی داشته باشید - حداقل هفت ساعت در شب. از سیگار و الکل زیاد اجتناب کنید. برای معاینات منظم به دکتر بروید. عادت‌های کوچک سالم در طول زمان به نتایج بزرگی تبدیل می‌شوند.",
            vocabulary = listOf(
                Word("fitness", "تناسب اندام", "ˈfɪtnəs"),
                Word("balanced diet", "رژیم متعادل", "ˈbælənst ˈdaɪət"),
                Word("checkup", "معاینه", "ˈtʃekʌp")
            ),
            coverUrl = "https://images.unsplash.com/photo-1571019613454-1cb2f99b2d8b?w=400"
        ),

        Podcast(
            id = "p_i11",
            title = "At the Airport",
            titlePersian = "در فرودگاه",
            description = "Learn useful English for air travel.",
            descriptionPersian = "انگلیسی کاربردی برای سفر هوایی یاد بگیرید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.TRAVEL,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/11/Airport.mp3",
            durationMinutes = 9,
            transcript = "At the airport, you will need to check in, go through security, and find your gate. Good morning, may I see your passport and ticket? Here you are. How many bags are you checking? Just one. Please place your items in the bin. Do you have any liquids? Yes, a small bottle. Boarding begins at three o'clock at gate twelve. Have a pleasant flight!",
            transcriptPersian = "در فرودگاه، باید چک‌این کنید، از امنیت رد شوید و گیت خود را پیدا کنید. صبح بخیر، می‌توانم پاسپورت و بلیطتان را ببینم؟ بفرمایید. چند چمدان تحویل می‌دهید؟ فقط یکی. لطفاً وسایلتان را در سینی قرار دهید. مایعات دارید؟ بله، یک بطری کوچک. سوار شدن ساعت سه در گیت دوازده شروع می‌شود. پرواز خوشی داشته باشید!",
            vocabulary = listOf(
                Word("airport", "فرودگاه", "ˈerpɔːrt"),
                Word("passport", "پاسپورت", "ˈpæspɔːrt"),
                Word("boarding", "سوار شدن", "ˈbɔːrdɪŋ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1436491865332-7a61a109cc05?w=400"
        ),

        Podcast(
            id = "p_i12",
            title = "The History of English",
            titlePersian = "تاریخ زبان انگلیسی",
            description = "Discover the fascinating history of the English language.",
            descriptionPersian = "تاریخ جذاب زبان انگلیسی را کشف کنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.HISTORY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/12/HistEnglish.mp3",
            durationMinutes = 10,
            transcript = "English has a rich history. It began as a Germanic language brought to Britain by Anglo-Saxon tribes. After the Norman Conquest in 1066, French words entered English. The Renaissance added Latin and Greek terms. British colonization spread English around the world. Today, American English has become dominant. English continues to evolve, borrowing words from many languages. It is now the global language of business, science, and technology.",
            transcriptPersian = "انگلیسی تاریخ غنی دارد. این زبان به عنوان یک زبان ژرمنی توسط قبایل آنگلوساکسون به بریتانیا آورده شد. پس از فتح نورمن در سال ۱۰۶۶، کلمات فرانسوی وارد انگلیسی شدند. رنسانس اصطلاحات لاتین و یونانی را اضافه کرد. استعمار بریتانیا انگلیسی را در سراسر جهان گسترش داد. امروزه، انگلیسی آمریکایی غالب شده است. انگلیسی به تکامل خود ادامه می‌دهد و کلمات را از زبان‌های بسیاری قرض می‌گیرد. این زبان اکنون زبان جهانی تجارت، علم و تکنولوژی است.",
            vocabulary = listOf(
                Word("history", "تاریخ", "ˈhɪstri"),
                Word("colonization", "استعمار", "ˌkɒlənaɪˈzeɪʃn"),
                Word("evolve", "تکامل یافتن", "ɪˈvɒlv")
            ),
            coverUrl = "https://images.unsplash.com/photo-1524995997946-a1c2e315a42f?w=400"
        ),

        Podcast(
            id = "p_i13",
            title = "Job Interview Tips",
            titlePersian = "نکات مصاحبه شغلی",
            description = "Learn how to succeed in English job interviews.",
            descriptionPersian = "یاد بگیرید چطور در مصاحبه‌های شغلی انگلیسی موفق شوید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.BUSINESS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/13/Interview.mp3",
            durationMinutes = 10,
            transcript = "Job interviews can be stressful. Preparation is key. Research the company before your interview. Practice common questions like 'Tell me about yourself' and 'Why do you want this job?' Use the STAR method: Situation, Task, Action, Result. Dress professionally. Arrive early. Make eye contact. Ask thoughtful questions. Send a thank-you email after. Remember, the interview is not just for the employer to evaluate you. It is also your chance to see if the company is right for you.",
            transcriptPersian = "مصاحبه‌های شغلی می‌توانند پراسترس باشند. آماده‌سازی کلیدی است. قبل از مصاحبه شرکت را تحقیق کنید. سؤالات رایج مثل 'درباره خودت بگو' و 'چرا این شغل را می‌خواهی؟' را تمرین کنید. از روش STAR استفاده کنید: موقعیت، وظیفه، اقدام، نتیجه. حرفه‌ای لباس بپوشید. زود برسید. تماس چشمی داشته باشید. سؤالات اندیشمندانه بپرسید. بعداً ایمیل تشکر بفرستید. به یاد داشته باشید، مصاحبه فقط برای ارزیابی شما توسط کارفرما نیست. فرصت شما برای دیدن اینکه آیا شرکت برایتان مناسب است هم هست.",
            vocabulary = listOf(
                Word("interview", "مصاحبه", "ˈɪntərvjuː"),
                Word("preparation", "آماده‌سازی", "ˌprepəˈreɪʃn"),
                Word("professional", "حرفه‌ای", "prəˈfeʃənl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1507679799987-c73779587ccf?w=400"
        ),

        Podcast(
            id = "p_i14",
            title = "English Around the World",
            titlePersian = "انگلیسی در سراسر جهان",
            description = "Explore the different varieties of English spoken worldwide.",
            descriptionPersian = "انواع مختلف انگلیسی صحبت‌شده در سراسر جهان را بررسی کنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.CULTURE,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/14/WorldEnglish.mp3",
            durationMinutes = 9,
            transcript = "English is spoken differently around the world. American English and British English have different spellings and vocabulary. In the US, people say 'apartment', but in the UK, they say 'flat'. Australian English has unique slang. Indian English has its own expressions. Singapore English, or Singlish, mixes English with local languages. There is no 'correct' English - each variety is valid. Understanding these differences helps you communicate with people from many countries.",
            transcriptPersian = "انگلیسی در سراسر جهان متفاوت صحبت می‌شود. انگلیسی آمریکایی و بریتانیایی هجی و لغات متفاوتی دارند. در آمریکا مردم 'apartment' می‌گویند، اما در بریتانیا 'flat'. انگلیسی استرالیایی عامیانه منحصربه‌فردی دارد. انگلیسی هندی اصطلاحات خودش را دارد. انگلیسی سنگاپوری یا Singlish، انگلیسی را با زبان‌های محلی مخلوط می‌کند. انگلیسی 'درست' وجود ندارد - هر گویشی معتبر است. درک این تفاوت‌ها به شما کمک می‌کند با مردم کشورهای بسیاری ارتباط برقرار کنید.",
            vocabulary = listOf(
                Word("variety", "تنوع/گویش", "vəˈraɪəti"),
                Word("slang", "عامیانه", "slæŋ"),
                Word("valid", "معتبر", "ˈvælɪd")
            ),
            coverUrl = "https://images.unsplash.com/photo-1526304640581-d334cdbbf45e?w=400"
        ),

        Podcast(
            id = "p_i15",
            title = "Problem Solving in English",
            titlePersian = "حل مسئله به انگلیسی",
            description = "Learn to discuss and solve problems in English.",
            descriptionPersian = "یاد بگیرید مسائل را به انگلیسی بحث و حل کنید.",
            level = PodcastLevel.INTERMEDIATE,
            category = PodcastCategory.BUSINESS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/02/15/Problem.mp3",
            durationMinutes = 9,
            transcript = "When solving problems, clear communication is essential. First, define the problem: 'The main issue is that our sales have decreased.' Next, analyze causes: 'This might be due to increased competition.' Then, propose solutions: 'We could improve our marketing strategy.' Finally, evaluate options: 'Let us consider the pros and cons of each approach.' Listen carefully to others, ask clarifying questions, and work toward a solution together. Good problem solvers are valuable in any workplace.",
            transcriptPersian = "هنگام حل مسائل، ارتباط واضح ضروری است. اول، مسئله را تعریف کنید: 'مسئله اصلی این است که فروش ما کاهش یافته.' بعد، علل را تحلیل کنید: 'این ممکن است به دلیل رقابت بیشتر باشد.' سپس، راه‌حل پیشنهاد دهید: 'می‌توانیم استراتژی بازاریابی‌مان را بهبود بخشیم.' در نهایت، گزینه‌ها را ارزیابی کنید: 'بیایید مزایا و معایب هر رویکرد را در نظر بگیریم.' با دقت به دیگران گوش دهید، سؤالات شفاف‌ساز بپرسید و با هم به سمت راه‌حل حرکت کنید. حل‌کنندگان خوب مسئله در هر محیط کاری ارزشمند هستند.",
            vocabulary = listOf(
                Word("problem", "مسئله", "ˈprɒbləm"),
                Word("solution", "راه‌حل", "səˈluːʃn"),
                Word("strategy", "استراتژی", "ˈstrætədʒi")
            ),
            coverUrl = "https://images.unsplash.com/photo-1521737604893-d14cc237f11d?w=400"
        ),

        // ==================== 🏆 ADVANCED (۱۰ پادکست) ====================

        Podcast(
            id = "p_a1",
            title = "Science in the News: Climate Change",
            titlePersian = "علم در اخبار: تغییرات اقلیمی",
            description = "An in-depth look at climate change and its global impact.",
            descriptionPersian = "نگاهی عمیق به تغییرات اقلیمی و تأثیر جهانی آن.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.SCIENCE,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/01/Climate.mp3",
            durationMinutes = 12,
            transcript = "Climate change represents one of the most significant challenges facing humanity today. Rising global temperatures, driven primarily by greenhouse gas emissions, are causing unprecedented changes to our planet. Polar ice caps are melting at alarming rates, sea levels are rising, and extreme weather events are becoming more frequent. Scientists warn that without immediate and drastic action, the consequences could be catastrophic. However, there is still hope. Renewable energy technologies are advancing rapidly, and many countries are committing to ambitious emission reduction targets. The question is not whether we can address climate change, but whether we have the political will to do so in time.",
            transcriptPersian = "تغییرات اقلیمی یکی از مهم‌ترین چالش‌های پیش روی بشریت امروز است. افزایش دمای جهانی که عمدتاً ناشی از انتشار گازهای گلخانه‌ای است، تغییرات بی‌سابقه‌ای در سیاره ما ایجاد می‌کند. کلاهک‌های یخی قطبی با سرعت هشداردهنده‌ای در حال ذوب شدن هستند، سطح دریاها بالا می‌رود و رویدادهای آب و هوایی شدید مکررتر می‌شوند. دانشمندان هشدار می‌دهند که بدون اقدام فوری و شدید، عواقب می‌تواند فاجعه‌بار باشد. با این حال، هنوز امید هست. فناوری‌های انرژی تجدیدپذیر به سرعت پیشرفت می‌کنند و بسیاری از کشورها به اهداف بلندپروازانه کاهش انتشار متعهد شده‌اند. سؤال این نیست که آیا می‌توانیم تغییرات اقلیمی را حل کنیم، بلکه آیا اراده سیاسی برای انجام آن به موقع را داریم.",
            vocabulary = listOf(
                Word("unprecedented", "بی‌سابقه", "ʌnˈpresɪdentɪd"),
                Word("catastrophic", "فاجعه‌بار", "ˌkætəˈstrɒfɪk"),
                Word("renewable", "تجدیدپذیر", "rɪˈnuːəbl")
            ),
            coverUrl = "https://images.unsplash.com/photo-1611273426858-450d8e3c9fce?w=400"
        ),

        Podcast(
            id = "p_a2",
            title = "American Stories: The Tell-Tale Heart",
            titlePersian = "داستان‌های آمریکایی: قلب افشاگر",
            description = "Edgar Allan Poe's classic psychological horror story.",
            descriptionPersian = "داستان ترسناک روانشناختی کلاسیک ادگار آلن پو.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.STORY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/02/TellTale.mp3",
            durationMinutes = 15,
            transcript = "True! Nervous, very, very dreadfully nervous I had been and am; but why will you say that I am mad? The disease had sharpened my senses, not destroyed, not dulled them. Above all was the sense of hearing acute. I heard all things in the heaven and in the earth. I heard many things in hell. How, then, am I mad? Hearken! and observe how healthily, how calmly I can tell you the whole story. It is impossible to say how first the idea entered my brain; but once conceived, it haunted me day and night. Object there was none. Passion there was none. I loved the old man. He had never wronged me. He had never given me insult. For his gold I had no desire. I think it was his eye! yes, it was this!",
            transcriptPersian = "راست است! عصبی، بسیار بسیار به‌طور وحشتناکی عصبی بوده‌ام و هستم؛ اما چرا می‌گویید دیوانه‌ام؟ بیماری حواسم را تیزتر کرده بود، نه نابود، نه کند. بیش از همه، حس شنوایی تیز بود. همه چیز را در آسمان و زمین می‌شنیدم. چیزهای زیادی در جهنم شنیدم. پس چطور دیوانه‌ام؟ گوش کن! و ببین چقدر سالم، چقدر آرام می‌توانم کل داستان را برایت بگویم. غیرممکن است بگویم این ایده چگونه اول وارد مغزم شد؛ اما به محض اینکه تصور شد، شب و روز مرا تسخیر کرد. هدفی نبود. شوری نبود. پیرمرد را دوست داشتم. هرگز به من ظلم نکرده بود. هرگز به من توهین نکرده بود. به طلاهایش هیچ میلی نداشتم. فکر می‌کنم چشمانش بود! بله، همین بود!",
            vocabulary = listOf(
                Word("dreadfully", "به‌طور وحشتناک", "ˈdredfəli"),
                Word("acute", "تیز", "əˈkjuːt"),
                Word("haunted", "تسخیر شده", "ˈhɔːntɪd")
            ),
            coverUrl = "https://images.unsplash.com/photo-1509248961158-e54f6934749c?w=400"
        ),

        Podcast(
            id = "p_a3",
            title = "The Future of Artificial Intelligence",
            titlePersian = "آینده هوش مصنوعی",
            description = "Exploring the opportunities and challenges of AI.",
            descriptionPersian = "بررسی فرصت‌ها و چالش‌های هوش مصنوعی.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.SCIENCE,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/03/AIFuture.mp3",
            durationMinutes = 14,
            transcript = "Artificial intelligence is transforming every aspect of modern life. From healthcare to transportation, from education to entertainment, AI systems are becoming increasingly capable. Large language models can write essays, generate art, and hold conversations. Autonomous vehicles promise to revolutionize how we move. Medical AI can detect diseases earlier than human doctors. Yet this progress raises profound questions. How do we ensure AI is used ethically? What happens to jobs displaced by automation? Can we control systems that may eventually surpass human intelligence? The decisions we make in the coming decade will shape the future of our civilization. We must approach AI development with both optimism and caution.",
            transcriptPersian = "هوش مصنوعی در حال دگرگون کردن هر جنبه‌ای از زندگی مدرن است. از مراقبت‌های بهداشتی تا حمل و نقل، از آموزش تا سرگرمی، سیستم‌های هوش مصنوعی به طور فزاینده‌ای توانمند می‌شوند. مدل‌های زبانی بزرگ می‌توانند مقاله بنویسند، هنر تولید کنند و گفتگو داشته باشند. وسایل نقلیه خودران وعده تغییر نحوه حرکت ما را می‌دهند. هوش مصنوعی پزشکی می‌تواند بیماری‌ها را زودتر از پزشکان انسانی تشخیص دهد. با این حال این پیشرفت سؤالات عمیقی ایجاد می‌کند. چگونه اطمینان حاصل کنیم هوش مصنوعی به‌طور اخلاقی استفاده می‌شود؟ چه اتفاقی برای مشاغلی که با اتوماسیون جابه‌جا می‌شوند می‌افتد؟ آیا می‌توانیم سیستم‌هایی را که ممکن است در نهایت از هوش انسانی پیشی بگیرند کنترل کنیم؟ تصمیماتی که در دهه آینده می‌گیریم آینده تمدن ما را شکل خواهد داد. باید به توسعه هوش مصنوعی هم با خوش‌بینی و هم با احتیاط نزدیک شویم.",
            vocabulary = listOf(
                Word("transform", "دگرگون کردن", "trænsˈfɔːrm"),
                Word("autonomous", "خودران/مستقل", "ɔːˈtɒnəməs"),
                Word("civilization", "تمدن", "ˌsɪvəlaɪˈzeɪʃn")
            ),
            coverUrl = "https://images.unsplash.com/photo-1677442136019-21780ecad995?w=400"
        ),

        Podcast(
            id = "p_a4",
            title = "The Art of Public Speaking",
            titlePersian = "هنر سخنرانی در جمع",
            description = "Master the skills needed for effective public speaking.",
            descriptionPersian = "مهارت‌های لازم برای سخنرانی مؤثر در جمع را مسلط شوید.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.BUSINESS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/04/Speaking.mp3",
            durationMinutes = 11,
            transcript = "Public speaking is one of the most valuable skills you can develop, yet it is also one of the most feared. Great speakers are not born; they are made through deliberate practice. The key principles include: thorough preparation, clear structure, and authentic delivery. Begin with a compelling hook that captures attention. Organize your content into three main points. Use stories and examples to illustrate abstract concepts. Maintain eye contact with your audience. Vary your tone and pace. Master the art of the pause. And most importantly, speak with genuine passion. When you truly believe in your message, your audience will too.",
            transcriptPersian = "سخنرانی در جمع یکی از ارزشمندترین مهارت‌هایی است که می‌توانید پرورش دهید، اما همچنین یکی از ترسناک‌ترین‌هاست. سخنرانان بزرگ متولد نمی‌شوند؛ از طریق تمرین هدفمند ساخته می‌شوند. اصول کلیدی شامل: آماده‌سازی کامل، ساختار واضح و ارائه اصیل است. با یک شروع جذاب که توجه را جلب می‌کند آغاز کنید. محتوایتان را در سه نکته اصلی سازماندهی کنید. از داستان‌ها و مثال‌ها برای نشان دادن مفاهیم انتزاعی استفاده کنید. تماس چشمی با مخاطبانتان را حفظ کنید. لحن و سرعتتان را متنوع کنید. هنر سکوت را مسلط شوید. و مهم‌تر از همه، با شور و شوق واقعی صحبت کنید. وقتی واقعاً به پیامتان باور دارید، مخاطبانتان هم باور خواهند کرد.",
            vocabulary = listOf(
                Word("deliberate", "هدفمند", "dɪˈlɪbərət"),
                Word("compelling", "جذاب", "kəmˈpelɪŋ"),
                Word("authentic", "اصیل", "ɔːˈθentɪk")
            ),
            coverUrl = "https://images.unsplash.com/photo-1475721027785-f74eccf877e2?w=400"
        ),

        Podcast(
            id = "p_a5",
            title = "This is America: The Diversity of US Culture",
            titlePersian = "این آمریکاست: تنوع فرهنگ آمریکایی",
            description = "Understanding the cultural diversity of the United States.",
            descriptionPersian = "درک تنوع فرهنگی ایالات متحده آمریکا.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.CULTURE,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/05/Diversity.mp3",
            durationMinutes = 13,
            transcript = "The United States is often described as a melting pot, but this metaphor has evolved. Today, many prefer the image of a salad bowl or mosaic, where each culture retains its distinct flavor while contributing to the whole. American culture has been shaped by waves of immigration from Europe, Africa, Asia, and Latin America. Each group brought its own traditions, languages, and foods. From jazz and hip-hop to Italian pasta and Mexican tacos, American culture is a fusion of global influences. Yet this diversity has also created tensions throughout history. The ongoing conversation about identity, inclusion, and equality is central to the American experience. Understanding this complexity is essential for anyone engaging with American society.",
            transcriptPersian = "ایالات متحده اغلب به عنوان یک دیگ ذوب توصیف می‌شود، اما این استعاره تکامل یافته است. امروزه بسیاری تصویر کاسه سالاد یا موزاییک را ترجیح می‌دهند، جایی که هر فرهنگ طعم متمایز خود را حفظ می‌کند در حالی که به کل کمک می‌کند. فرهنگ آمریکایی توسط موج‌های مهاجرت از اروپا، آفریقا، آسیا و آمریکای لاتین شکل گرفته است. هر گروه سنت‌ها، زبان‌ها و غذاهای خود را آورد. از جاز و هیپ‌هاپ تا پاستای ایتالیایی و تاکوهای مکزیکی، فرهنگ آمریکایی ترکیبی از تأثیرات جهانی است. با این حال این تنوع در طول تاریخ تنش‌هایی هم ایجاد کرده است. گفتگوی جاری درباره هویت، شمول و برابری برای تجربه آمریکایی مرکزی است. درک این پیچیدگی برای هر کسی که با جامعه آمریکایی درگیر است ضروری است.",
            vocabulary = listOf(
                Word("metaphor", "استعاره", "ˈmetəfər"),
                Word("immigration", "مهاجرت", "ˌɪmɪˈɡreɪʃn"),
                Word("inclusion", "شمول", "ɪnˈkluːʒn")
            ),
            coverUrl = "https://images.unsplash.com/photo-1526304640581-d334cdbbf45e?w=400"
        ),

        Podcast(
            id = "p_a6",
            title = "The Science of Learning Languages",
            titlePersian = "علم یادگیری زبان‌ها",
            description = "Scientific insights into how we learn languages best.",
            descriptionPersian = "بینش علمی در مورد بهترین روش یادگیری زبان‌ها.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.SCIENCE,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/06/LanguageScience.mp3",
            durationMinutes = 12,
            transcript = "Neuroscience has revealed fascinating insights into language learning. Contrary to popular belief, adults can learn languages effectively - they just learn differently than children. The key factors are: consistent practice, meaningful exposure, and emotional engagement. Research shows that spaced repetition is far more effective than cramming. Comprehensible input - material slightly above your current level - accelerates acquisition. Speaking from day one, even with mistakes, builds neural pathways. The brain's neuroplasticity allows us to learn throughout life. Learning a language is not just about memorizing words; it is about rewiring your brain to think in new ways. The most successful learners are those who enjoy the process and maintain curiosity.",
            transcriptPersian = "علوم اعصاب بینش‌های جذابی درباره یادگیری زبان آشکار کرده است. برخلاف باور رایج، بزرگسالان می‌توانند زبان‌ها را به‌طور مؤثر یاد بگیرند - آن‌ها فقط متفاوت از کودکان یاد می‌گیرند. عوامل کلیدی عبارتند از: تمرین مداوم، مواجهه معنادار و مشارکت احساسی. تحقیقات نشان می‌دهد که تکرار فاصله‌دار بسیار مؤثرتر از فشرده‌خوانی است. ورودی قابل‌فهم - مطالبی کمی بالاتر از سطح فعلی شما - کسب را تسریع می‌کند. از روز اول صحبت کردن، حتی با اشتباهات، مسیرهای عصبی می‌سازد. انعطاف‌پذیری عصبی مغز به ما اجازه می‌دهد در طول زندگی یاد بگیریم. یادگیری زبان فقط حفظ کلمات نیست؛ بازسیم‌کشی مغز برای فکر کردن به روش‌های جدید است. موفق‌ترین زبان‌آموزان کسانی هستند که از فرایند لذت می‌برند و کنجکاوی را حفظ می‌کنند.",
            vocabulary = listOf(
                Word("neuroscience", "علوم اعصاب", "ˈnjʊəroʊsaɪəns"),
                Word("acquisition", "کسب", "ˌækwɪˈzɪʃn"),
                Word("neuroplasticity", "انعطاف‌پذیری عصبی", "ˌnjʊəroʊplæˈstɪsəti")
            ),
            coverUrl = "https://images.unsplash.com/photo-1559757148-5c350d0d3c56?w=400"
        ),

        Podcast(
            id = "p_a7",
            title = "American Stories: Rip Van Winkle",
            titlePersian = "داستان‌های آمریکایی: ریپ ون وینکل",
            description = "Washington Irving's classic tale of a man who slept for twenty years.",
            descriptionPersian = "داستان کلاسیک واشنگتن ایروینگ درباره مردی که بیست سال خوابید.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.STORY,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/07/RipVanWinkle.mp3",
            durationMinutes = 14,
            transcript = "In a small village at the foot of the Catskill Mountains, there lived a man named Rip Van Winkle. He was a kind neighbor and an obedient husband, but he was also lazy. He would sit on a bench in front of the village inn, telling stories and avoiding work. One autumn day, he wandered into the mountains with his dog Wolf. There he met strange men playing nine-pins. They offered him a drink. He drank and fell into a deep sleep. When he awoke, his beard had grown a foot long. He returned to his village and found everything changed. His wife was dead, his children grown, and the American Revolution had occurred. He had slept for twenty years.",
            transcriptPersian = "در دهکده‌ای کوچک در دامنه کوه‌های کتسکیل، مردی به نام ریپ ون وینکل زندگی می‌کرد. او همسایه‌ای مهربان و شوهری مطیع بود، اما تنبل هم بود. روی نیمکتی جلوی مهمان‌خانه دهکده می‌نشست، داستان می‌گفت و از کار فرار می‌کرد. یک روز پاییزی، با سگش ولف به کوه‌ها سرگردان شد. آنجا با مردان عجیبی که نُه‌سنگ بازی می‌کردند ملاقات کرد. آن‌ها به او نوشیدنی تعارف کردند. نوشید و به خواب عمیقی فرو رفت. وقتی بیدار شد، ریشش یک پا بلند شده بود. به دهکده‌اش بازگشت و همه چیز را تغییر یافته یافت. همسرش مرده بود، فرزندانش بزرگ شده بودند و انقلاب آمریکا رخ داده بود. او بیست سال خوابیده بود.",
            vocabulary = listOf(
                Word("obedient", "مطیع", "əˈbiːdiənt"),
                Word("wander", "سرگردان شدن", "ˈwɒndər"),
                Word("revolution", "انقلاب", "ˌrevəˈluːʃn")
            ),
            coverUrl = "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?w=400"
        ),

        Podcast(
            id = "p_a8",
            title = "The Global Economy Explained",
            titlePersian = "اقتصاد جهانی توضیح داده شده",
            description = "Understanding how the global economy works.",
            descriptionPersian = "درک نحوه کار اقتصاد جهانی.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.BUSINESS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/08/GlobalEconomy.mp3",
            durationMinutes = 13,
            transcript = "The global economy is a complex web of interconnected markets, trade routes, and financial systems. When one major economy sneezes, others catch a cold. The 2008 financial crisis demonstrated this vividly. Today, globalization faces new challenges: rising protectionism, supply chain disruptions, and technological shifts. Central banks use interest rates to manage inflation and stimulate growth. International trade agreements shape the flow of goods and services. Emerging markets like China and India play increasingly important roles. Understanding these dynamics is crucial for anyone working in business, government, or international affairs. The decisions made in boardrooms and parliaments affect billions of lives worldwide.",
            transcriptPersian = "اقتصاد جهانی شبکه پیچیده‌ای از بازارها، مسیرهای تجاری و سیستم‌های مالی به هم پیوسته است. وقتی یک اقتصاد بزرگ عطسه می‌کند، دیگران سرما می‌خورند. بحران مالی ۲۰۰۸ این را به وضوح نشان داد. امروزه، جهانی‌سازی با چالش‌های جدیدی روبرو است: حمایت‌گرایی رو به افزایش، اختلالات زنجیره تأمین و تغییرات تکنولوژیک. بانک‌های مرکزی از نرخ بهره برای مدیریت تورم و تحریک رشد استفاده می‌کنند. توافق‌نامه‌های تجاری بین‌المللی جریان کالاها و خدمات را شکل می‌دهند. بازارهای نوظهور مانند چین و هند نقش‌های فزاینده مهمی ایفا می‌کنند. درک این پویایی‌ها برای هر کسی که در تجارت، دولت یا امور بین‌المللی کار می‌کند حیاتی است. تصمیماتی که در اتاق‌های هیئت مدیره و پارلمان‌ها گرفته می‌شود بر میلیاردها زندگی در سراسر جهان تأثیر می‌گذارد.",
            vocabulary = listOf(
                Word("interconnected", "به هم پیوسته", "ˌɪntərkəˈnektɪd"),
                Word("inflation", "تورم", "ɪnˈfleɪʃn"),
                Word("emerging", "نوظهور", "ɪˈmɜːrdʒɪŋ")
            ),
            coverUrl = "https://images.unsplash.com/photo-1611974789855-9c2a0a7236a3?w=400"
        ),

        Podcast(
            id = "p_a9",
            title = "The Philosophy of Happiness",
            titlePersian = "فلسفه شادی",
            description = "Exploring what philosophers and scientists say about happiness.",
            descriptionPersian = "بررسی آنچه فیلسوفان و دانشمندان درباره شادی می‌گویند.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.CULTURE,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/09/Happiness.mp3",
            durationMinutes = 12,
            transcript = "What is happiness? This question has occupied philosophers for millennia. Aristotle believed happiness is the ultimate goal of human existence, achieved through virtuous living. Epicurus taught that happiness comes from simple pleasures and freedom from anxiety. Modern psychology has identified three components: pleasure, engagement, and meaning. Research shows that relationships, not wealth, are the strongest predictors of long-term happiness. Acts of kindness boost our own well-being. Gratitude practices rewire our brains for positivity. The paradox is that pursuing happiness directly often leads to unhappiness; it emerges as a byproduct of living meaningfully. Perhaps the wisest approach is not to ask 'Am I happy?' but 'Am I living a life that matters?'",
            transcriptPersian = "شادی چیست؟ این سؤال هزاران سال فیلسوفان را مشغول کرده است. ارسطو معتقد بود شادی هدف نهایی وجود انسان است که از طریق زندگی فضیلت‌مندانه به دست می‌آید. اپیکور تعلیم داد که شادی از لذت‌های ساده و رهایی از اضطراب می‌آید. روانشناسی مدرن سه مؤلفه شناسایی کرده است: لذت، مشارکت و معنا. تحقیقات نشان می‌دهد روابط، نه ثروت، قوی‌ترین پیش‌بینی‌کننده شادی بلندمدت هستند. اعمال مهربانی رفاه خود ما را تقویت می‌کند. تمرین‌های شکرگزاری مغز ما را برای مثبت‌نگری بازسیم‌کشی می‌کنند. پارادوکس این است که دنبال شادی مستقیماً رفتن اغلب به ناشادی منجر می‌شود؛ به عنوان محصول جانبی زندگی معنادار پدیدار می‌شود. شاید عاقلانه‌ترین رویکرد این است که نپرسیم 'آیا شاد هستم؟' بلکه 'آیا زندگی‌ای می‌کنم که اهمیت دارد؟'",
            vocabulary = listOf(
                Word("philosophy", "فلسفه", "fɪˈlɒsəfi"),
                Word("virtuous", "فضیلت‌مند", "ˈvɜːrtʃuəs"),
                Word("byproduct", "محصول جانبی", "ˈbaɪprɒdʌkt")
            ),
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400"
        ),

        Podcast(
            id = "p_a10",
            title = "The Future of Work",
            titlePersian = "آینده کار",
            description = "How technology and society are reshaping employment.",
            descriptionPersian = "چگونه تکنولوژی و جامعه اشتغال را بازشکل می‌دهند.",
            level = PodcastLevel.ADVANCED,
            category = PodcastCategory.BUSINESS,
            audioUrl = "https://av.voanews.com/clips/VLE/2020/03/10/FutureWork.mp3",
            durationMinutes = 13,
            transcript = "The nature of work is undergoing a profound transformation. Remote work, accelerated by the pandemic, has become permanent for millions. Automation threatens routine jobs but creates new roles in AI, data science, and renewable energy. The gig economy offers flexibility but often lacks benefits and security. Lifelong learning is no longer optional - it is essential. Companies must adapt to attract talent: offering flexibility, purpose, and growth opportunities. Governments face pressure to update labor laws and social safety nets. The workforce of tomorrow will need skills in critical thinking, creativity, emotional intelligence, and digital literacy. The question is not whether work will change, but how we can ensure the changes benefit everyone, not just the privileged few.",
            transcriptPersian = "ماهیت کار در حال دگرگونی عمیقی است. کار از راه دور که با همه‌گیری تسریع شد، برای میلیون‌ها نفر دائمی شده است. اتوماسیون مشاغل روتین را تهدید می‌کند اما نقش‌های جدیدی در هوش مصنوعی، علم داده و انرژی تجدیدپذیر ایجاد می‌کند. اقتصاد گیگ انعطاف‌پذیری ارائه می‌دهد اما اغلب فاقد مزایا و امنیت است. یادگیری مادام‌العمر دیگر اختیاری نیست - ضروری است. شرکت‌ها باید برای جذب استعداد سازگار شوند: ارائه انعطاف‌پذیری، هدف و فرصت‌های رشد. دولت‌ها با فشار برای به‌روزرسانی قوانین کار و شبکه‌های ایمنی اجتماعی روبرو هستند. نیروی کار فردا به مهارت‌هایی در تفکر انتقادی، خلاقیت، هوش هیجانی و سواد دیجیتال نیاز خواهد داشت. سؤال این نیست که آیا کار تغییر خواهد کرد، بلکه چگونه می‌توانیم اطمینان حاصل کنیم تغییرات به همه سود می‌رساند، نه فقط عده‌ای ممتاز.",
            vocabulary = listOf(
                Word("transformation", "دگرگونی", "ˌtrænsfərˈmeɪʃn"),
                Word("automation", "اتوماسیون", "ˌɔːtəˈmeɪʃn"),
                Word("literacy", "سواد", "ˈlɪtərəsi")
            ),
            coverUrl = "https://images.unsplash.com/photo-1519389950473-47ba0277781c?w=400"
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
        getPodcastsByLevel(level).size
}package com.example.englishteacher.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.englishteacher.data.Podcast
import com.example.englishteacher.data.PodcastCategory
import com.example.englishteacher.data.PodcastLevel
import com.example.englishteacher.data.PodcastRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PodcastScreen(
    onPodcastClick: (url: String, title: String) -> Unit
) {
    val context = LocalContext.current
    val allPodcasts = remember { PodcastRepository.getAllPodcasts() }

    var selectedLevel by remember { mutableStateOf<PodcastLevel?>(null) }
    var selectedCategory by remember { mutableStateOf<PodcastCategory?>(null) }
    var searchQuery by remember { mutableStateOf("") }
    var showSearch by remember { mutableStateOf(false) }

    val filteredPodcasts = remember(selectedLevel, selectedCategory, searchQuery) {
        allPodcasts.filter { podcast ->
            val matchesLevel = selectedLevel == null || podcast.level == selectedLevel
            val matchesCategory = selectedCategory == null || podcast.category == selectedCategory
            val matchesSearch = searchQuery.isEmpty() ||
                    podcast.title.contains(searchQuery, ignoreCase = true) ||
                    podcast.titlePersian.contains(searchQuery) ||
                    podcast.description.contains(searchQuery, ignoreCase = true)
            matchesLevel && matchesCategory && matchesSearch
        }
    }

    val beginnerCount = remember { PodcastRepository.getCountByLevel(PodcastLevel.BEGINNER) }
    val intermediateCount = remember { PodcastRepository.getCountByLevel(PodcastLevel.INTERMEDIATE) }
    val advancedCount = remember { PodcastRepository.getCountByLevel(PodcastLevel.ADVANCED) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    if (showSearch) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = {
                                Text(
                                    "جستجوی پادکست...",
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontSize = 14.sp
                                )
                            },
                            singleLine = true,
                            shape = RoundedCornerShape(12.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.White,
                                unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                                cursorColor = Color.White
                            )
                        )
                    } else {
                        Column {
                            Text(
                                "🎧 پادکست‌ها",
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "${allPodcasts.size} پادکست در ۳ سطح",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.85f)
                            )
                        }
                    }
                },
                navigationIcon = {
                    AnimatedVisibility(
                        visible = showSearch,
                        enter = scaleIn(),
                        exit = scaleOut()
                    ) {
                        IconButton(onClick = {
                            showSearch = false
                            searchQuery = ""
                        }) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    }
                },
                actions = {
                    IconButton(onClick = { showSearch = !showSearch }) {
                        Icon(
                            if (showSearch) Icons.Filled.Close else Icons.Filled.Search,
                            contentDescription = "Search",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFEF6C00))
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            // ==================== کارت آمار ====================
            item {
                PodcastStatsCard(
                    total = allPodcasts.size,
                    beginner = beginnerCount,
                    intermediate = intermediateCount,
                    advanced = advancedCount
                )
            }

            // ==================== فیلتر سطوح ====================
            item {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(4.dp, 20.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(Color(0xFFEF6C00))
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "📊 انتخاب سطح",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item {
                            LevelChip(
                                emoji = "🎧",
                                label = "همه",
                                count = allPodcasts.size,
                                selected = selectedLevel == null,
                                color = Color(0xFFEF6C00)
                            ) { selectedLevel = null }
                        }
                        items(PodcastLevel.values().toList()) { level ->
                            LevelChip(
                                emoji = level.emoji,
                                label = level.persianName,
                                count = when (level) {
                                    PodcastLevel.BEGINNER -> beginnerCount
                                    PodcastLevel.INTERMEDIATE -> intermediateCount
                                    PodcastLevel.ADVANCED -> advancedCount
                                },
                                selected = selectedLevel == level,
                                color = Color(level.color)
                            ) { selectedLevel = level }
                        }
                    }
                }
            }

            // ==================== فیلتر دسته‌بندی ====================
            item {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(4.dp, 20.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(Color(0xFF6A1B9A))
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "🎯 دسته‌بندی",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A237E)
                        )
                    }

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        item {
                            CategoryChip(
                                emoji = "🌟",
                                label = "همه",
                                selected = selectedCategory == null
                            ) { selectedCategory = null }
                        }
                        items(PodcastCategory.values().toList()) { cat ->
                            CategoryChip(
                                emoji = cat.emoji,
                                label = cat.persianName,
                                selected = selectedCategory == cat
                            ) { selectedCategory = cat }
                        }
                    }
                }
            }

            // ==================== شمارنده نتایج ====================
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(4.dp, 20.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color(0xFF00897B))
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        "📻 ${filteredPodcasts.size} پادکست",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                }
            }

            // ==================== لیست پادکست‌ها ====================
            if (filteredPodcasts.isEmpty()) {
                item {
                    EmptyPodcastsState(searchQuery)
                }
            } else {
                items(filteredPodcasts, key = { it.id }) { podcast ->
                    PodcastCard(
                        podcast = podcast,
                        onClick = {
                            onPodcastClick(podcast.audioUrl, podcast.title)
                        }
                    )
                }
            }

            item { Spacer(Modifier.height(20.dp)) }
        }
    }
}

// ==================== کارت آمار ====================
@Composable
private fun PodcastStatsCard(
    total: Int,
    beginner: Int,
    intermediate: Int,
    advanced: Int
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        listOf(Color(0xFFEF6C00), Color(0xFFFFB74D))
                    )
                )
                .padding(20.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.Headphones,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Spacer(Modifier.width(14.dp))
                    Column {
                        Text(
                            "کتابخانه صوتی",
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                        Text(
                            "$total پادکست آموزشی",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    StatBox(
                        emoji = "🌱",
                        count = beginner,
                        label = "مبتدی",
                        modifier = Modifier.weight(1f)
                    )
                    StatBox(
                        emoji = "🚀",
                        count = intermediate,
                        label = "متوسط",
                        modifier = Modifier.weight(1f)
                    )
                    StatBox(
                        emoji = "🏆",
                        count = advanced,
                        label = "پیشرفته",
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
private fun StatBox(
    emoji: String,
    count: Int,
    label: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White.copy(alpha = 0.2f))
            .padding(vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(emoji, fontSize = 20.sp)
        Spacer(Modifier.height(2.dp))
        Text(
            "$count",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            label,
            fontSize = 10.sp,
            color = Color.White.copy(alpha = 0.9f)
        )
    }
}

// ==================== Level Chip ====================
@Composable
private fun LevelChip(
    emoji: String,
    label: String,
    count: Int,
    selected: Boolean,
    color: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .height(70.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(if (selected) 8.dp else 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selected) color else Color.White
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(emoji, fontSize = 16.sp)
                Spacer(Modifier.width(4.dp))
                Text(
                    label,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (selected) Color.White else Color(0xFF1A237E)
                )
            }
            Spacer(Modifier.height(2.dp))
            Text(
                "$count پادکست",
                fontSize = 10.sp,
                color = if (selected) Color.White.copy(alpha = 0.9f) else Color.Gray
            )
        }
    }
}

// ==================== Category Chip ====================
@Composable
private fun CategoryChip(
    emoji: String,
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(
                if (selected) Color(0xFF6A1B9A) else Color.White
            )
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(emoji, fontSize = 13.sp)
            Spacer(Modifier.width(4.dp))
            Text(
                label,
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
                color = if (selected) Color.White else Color(0xFF424242)
            )
        }
    }
}

// ==================== Podcast Card ====================
@Composable
private fun PodcastCard(
    podcast: Podcast,
    onClick: () -> Unit
) {
    val levelColor = Color(podcast.level.color)

    var pressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(
        targetValue = if (pressed) 0.97f else 1f,
        animationSpec = tween(150),
        label = "podcastScale"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                pressed = true
                onClick()
            },
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // کاور
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(14.dp))
            ) {
                if (podcast.coverUrl.isNotEmpty()) {
                    AsyncImage(
                        model = podcast.coverUrl,
                        contentDescription = podcast.title,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    listOf(levelColor, levelColor.copy(alpha = 0.6f))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(podcast.level.emoji, fontSize = 36.sp)
                    }
                }

                // دکمه Play روی کاور
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.95f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.PlayArrow,
                            contentDescription = "Play",
                            tint = levelColor,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }

            Spacer(Modifier.width(12.dp))

            // اطلاعات
            Column(modifier = Modifier.weight(1f)) {
                // ردیف سطح + دسته + زمان
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(levelColor.copy(alpha = 0.12f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            "${podcast.level.emoji} ${podcast.level.persianName}",
                            fontSize = 9.sp,
                            color = levelColor,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(4.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFFF5F5F5))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            "${podcast.category.emoji} ${podcast.category.persianName}",
                            fontSize = 9.sp,
                            color = Color(0xFF616161),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Spacer(Modifier.height(6.dp))

                Text(
                    podcast.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF1A237E),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    podcast.titlePersian,
                    fontSize = 11.sp,
                    color = Color.Gray,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(Modifier.height(6.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Filled.AccessTime,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        "${podcast.durationMinutes} دقیقه",
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        "• ${podcast.source}",
                        fontSize = 9.sp,
                        color = Color.Gray,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

// ==================== حالت خالی ====================
@Composable
private fun EmptyPodcastsState(searchQuery: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFFF3E0)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.Headphones,
                    contentDescription = null,
                    tint = Color(0xFFEF6C00),
                    modifier = Modifier.size(50.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                if (searchQuery.isEmpty()) "پادکستی پیدا نشد"
                else "نتیجه‌ای برای «$searchQuery» نیست",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E),
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "فیلترها رو تغییر بده یا عبارت دیگه‌ای جستجو کن",
                fontSize = 12.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}