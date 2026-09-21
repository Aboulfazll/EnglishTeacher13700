package com.example.englishteacher.data

object BeginnerStories {
    val stories: List<Story> = listOf(

        Story(
            id = "s_b1", title = "The Lost Cat", titlePersian = "گربه گمشده",
            level = Level.BEGINNER,
            text = "A little girl named Sara has a cat. The cat's name is Mimi.",
            moral = "Never give up hope.", moralPersian = "هرگز امید خود را از دست ندهید.",
            coverUrl = "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "A Cat Named Mimi", titlePersian = "گربه‌ای به نام میمی",
                    text = "In a small yellow house at the end of Maple Street, there lived a little girl named Sara. Sara was seven years old, and she had the most beautiful cat in the world. The cat's name was Mimi. Mimi had soft white fur and bright green eyes. Every morning, Sara would wake up early just to play with Mimi. They would run in the garden together, chase butterflies, and lie on the grass watching the clouds. Mimi was not just a pet — she was Sara's best friend.",
                    textPersian = "در یک خانه کوچک زرد در انتهای خیابان میپل، دختر کوچکی به نام سارا زندگی می‌کرد. سارا هفت ساله بود و زیباترین گربه دنیا را داشت. اسم گربه میمی بود. میمی خز سفید نرم و چشمان سبز روشنی داشت. هر صبح، سارا زود بیدار می‌شد تا با میمی بازی کند. آن‌ها با هم در باغ می‌دویدند، پروانه‌ها را دنبال می‌کردند و روی چمن دراز می‌کشیدند. میمی فقط یک حیوان خانگی نبود — او بهترین دوست سارا بود.",
                    vocabulary = listOf(
                        Word("beautiful", "زیبا", "ˈbjuːtɪfl"),
                        Word("fur", "خز", "fɜːr"),
                        Word("chase", "دنبال کردن", "tʃeɪs"),
                        Word("butterfly", "پروانه", "ˈbʌtərflaɪ"),
                        Word("imagine", "تصور کردن", "ɪˈmædʒɪn")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What is the name of the little girl?",
                            questionPersian = "اسم دختر کوچک چیه؟",
                            options = listOf("Mimi", "Sara", "Lily", "Nika"),
                            correctIndex = 1,
                            explanation = "Sara is the little girl who lives in the yellow house."
                        ),
                        ChapterQuizQuestion(
                            question = "What color are Mimi's eyes?",
                            questionPersian = "چشمان میمی چه رنگی هستن؟",
                            options = listOf("Blue", "Brown", "Green", "Black"),
                            correctIndex = 2,
                            explanation = "Mimi has bright green eyes."
                        ),
                        ChapterQuizQuestion(
                            question = "What does Sara do every morning?",
                            questionPersian = "سارا هر صبح چیکار می‌کنه؟",
                            options = listOf("Goes to school", "Plays with Mimi", "Eats breakfast", "Reads a book"),
                            correctIndex = 1,
                            explanation = "Every morning Sara wakes up early just to play with Mimi."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Mimi Disappears", titlePersian = "میمی ناپدید می‌شود",
                    text = "One sunny afternoon, Sara opened the back door to let Mimi play in the garden. Mimi ran outside happily, chasing a little red butterfly. Sara went back inside to help her mother bake cookies. After an hour, Sara went to the garden to call Mimi. But Mimi was not there. Sara called her name again and again. She looked under the bushes, behind the fence, and even in the tall tree. But Mimi was gone. Sara's heart began to beat fast. She ran to her mother with tears in her eyes. \"Mama, Mimi is gone!\" she cried. That night, Sara could not sleep. She kept looking at the window, hoping to see Mimi come back.",
                    textPersian = "یک بعدازظهر آفتابی، سارا در پشتی را باز کرد تا میمی در باغ بازی کند. میمی با خوشحالی بیرون دوید و یک پروانه قرمز کوچک را دنبال کرد. سارا به داخل برگشت تا به مادرش کمک کند. بعد از یک ساعت، سارا به باغ رفت تا میمی را صدا کند. اما میمی آنجا نبود. سارا اسمش را دوباره و دوباره صدا زد. زیر بوته‌ها، پشت حصار و حتی بالای درخت بلند را نگاه کرد. اما میمی رفته بود. قلب سارا شروع به تند زدن کرد. با چشمان پر از اشک به سمت مادرش دوید. «مامان، میمی رفته!» گریه کرد. آن شب، سارا نتوانست بخوابد. مدام به پنجره نگاه می‌کرد.",
                    vocabulary = listOf(
                        Word("disappear", "ناپدید شدن", "ˌdɪsəˈpɪər"),
                        Word("bush", "بوته", "bʊʃ"),
                        Word("fence", "حصار", "fens"),
                        Word("tears", "اشک‌ها", "tɪərz"),
                        Word("hope", "امید", "hoʊp")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Where did Mimi run to play?",
                            questionPersian = "میمی کجا رفت تا بازی کنه؟",
                            options = listOf("The kitchen", "The garden", "The street", "The school"),
                            correctIndex = 1,
                            explanation = "Sara opened the back door and let Mimi play in the garden."
                        ),
                        ChapterQuizQuestion(
                            question = "What was Mimi chasing?",
                            questionPersian = "میمی داشت چی رو دنبال می‌کرد؟",
                            options = listOf("A bird", "A mouse", "A butterfly", "A leaf"),
                            correctIndex = 2,
                            explanation = "Mimi was chasing a little red butterfly."
                        ),
                        ChapterQuizQuestion(
                            question = "Where did Sara look for Mimi?",
                            questionPersian = "سارا کجا دنبال میمی گشت؟",
                            options = listOf("Under bushes and behind the fence", "In the house", "In the car", "Next door"),
                            correctIndex = 0,
                            explanation = "Sara looked under the bushes, behind the fence, and in the tall tree."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Happy Reunion", titlePersian = "دیدار شاد",
                    text = "The next morning, Sara woke up very early. She decided she would look everywhere until she found Mimi. She asked her neighbors, but no one had seen the little white cat. Sara walked and walked, calling Mimi's name. Finally, tired and sad, she sat under a big oak tree at the edge of the park. Suddenly, she heard a soft sound. \"Meow... meow...\" Sara looked up. There, sleeping peacefully under the tree, was Mimi! She had fallen asleep while chasing the butterfly and gotten lost. Sara picked her up and hugged her tightly. Mimi purred happily. Sara ran home with Mimi in her arms, laughing and crying at the same time. That night, Sara promised herself: \"I will never give up hope, no matter what.\"",
                    textPersian = "صبح روز بعد، سارا خیلی زود بیدار شد. تصمیم گرفت همه‌جا را بگردد تا میمی را پیدا کند. از همسایه‌ها پرسید، اما هیچ‌کس گربه سفید کوچک را ندیده بود. سارا راه رفت و راه رفت. در نهایت، خسته و غمگین، زیر یک درخت بلوط بزرگ نشست. ناگهان صدای ملایمی شنید. «میو... میو...» سارا به بالا نگاه کرد. آنجا، زیر درخت خوابیده بود، میمی! او هنگام دنبال کردن پروانه به خواب رفته و گم شده بود. سارا او را بغل کرد و محکم به سینه چسباند. میمی با خوشحالی خرخر کرد. سارا با میمی در آغوشش به خانه دوید. آن شب، سارا به خودش قول داد: «هرگز امیدم را از دست نمی‌دهم.»",
                    vocabulary = listOf(
                        Word("neighbor", "همسایه", "ˈneɪbər"),
                        Word("oak", "بلوط", "oʊk"),
                        Word("peacefully", "در آرامش", "ˈpiːsfəli"),
                        Word("purr", "خرخر کردن", "pɜːr"),
                        Word("promise", "قول دادن", "ˈprɒmɪs")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Where did Sara finally find Mimi?",
                            questionPersian = "سارا در نهایت میمی رو کجا پیدا کرد؟",
                            options = listOf("In the house", "Under a big oak tree", "On the street", "At the neighbor's"),
                            correctIndex = 1,
                            explanation = "Sara found Mimi sleeping peacefully under a big oak tree."
                        ),
                        ChapterQuizQuestion(
                            question = "What was Mimi doing when Sara found her?",
                            questionPersian = "وقتی سارا میمی رو پیدا کرد، میمی داشت چیکار می‌کرد؟",
                            options = listOf("Playing", "Eating", "Sleeping", "Running"),
                            correctIndex = 2,
                            explanation = "Mimi had fallen asleep while chasing the butterfly."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sara promise herself?",
                            questionPersian = "سارا به خودش چه قولی داد؟",
                            options = listOf("To never get a cat", "To never give up hope", "To stay home", "To buy a new cat"),
                            correctIndex = 1,
                            explanation = "Sara promised: 'I will never give up hope, no matter what.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b2", title = "The Kind Baker", titlePersian = "نانوای مهربان",
            level = Level.BEGINNER,
            text = "There is a bakery in a small town. The baker is a kind old man.",
            moral = "Kindness is always rewarded.", moralPersian = "مهربانی همیشه پاداش داده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Little Bakery", titlePersian = "نانوایی کوچک",
                    text = "On the corner of Rose Street, in a small quiet town, there was a little bakery. The bakery was old, with a wooden sign that said \"Mr. Hassan's Bakery.\" Every morning at four o'clock, the smell of fresh bread filled the entire street. Mr. Hassan was an old man with white hair and kind eyes. He had been baking bread for forty years. All the children in the town loved Mr. Hassan because he always smiled and gave them a small piece of warm bread on their way to school.",
                    textPersian = "در گوشه‌ی خیابان رز، در شهری کوچک و آرام، یک نانوایی کوچک بود. نانوایی قدیمی بود با تابلوی چوبی «نانوایی آقای حسن». هر صبح ساعت چهار، بوی نان تازه تمام خیابان را پر می‌کرد. آقای حسن پیرمردی با موهای سفید و چشمان مهربان بود. چهل سال نان می‌پخت. همه بچه‌های شهر او را دوست داشتند.",
                    vocabulary = listOf(
                        Word("bakery", "نانوایی", "ˈbeɪkəri"),
                        Word("fresh", "تازه", "freʃ"),
                        Word("kind", "مهربان", "kaɪnd"),
                        Word("wooden", "چوبی", "ˈwʊdn")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What time does the bakery open?",
                            questionPersian = "نانوایی ساعت چند باز می‌شه؟",
                            options = listOf("6 o'clock", "4 o'clock", "5 o'clock", "7 o'clock"),
                            correctIndex = 1,
                            explanation = "Every morning at four o'clock, the smell of fresh bread filled the street."
                        ),
                        ChapterQuizQuestion(
                            question = "How long has Mr. Hassan been baking bread?",
                            questionPersian = "آقای حسن چند سال نان می‌پزه؟",
                            options = listOf("10 years", "20 years", "40 years", "50 years"),
                            correctIndex = 2,
                            explanation = "Mr. Hassan had been baking bread for forty years."
                        ),
                        ChapterQuizQuestion(
                            question = "What does Mr. Hassan give to children?",
                            questionPersian = "آقای حسن به بچه‌ها چی می‌ده؟",
                            options = listOf("Money", "Warm bread", "Candy", "Milk"),
                            correctIndex = 1,
                            explanation = "He always gave them a small piece of warm bread."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Rich Man", titlePersian = "مرد ثروتمند",
                    text = "One cold winter morning, a rich man named Mr. Karimi came to the bakery. He was wearing a fine coat and shiny shoes. He had heard about the kind baker who gave free bread to children. Mr. Karimi was surprised. \"Why do you give free bread?\" he asked. \"You will lose money.\" Mr. Hassan smiled and said, \"Because I love to help. When I see a hungry child smile, I feel rich. More rich than any money could make me.\" Mr. Karimi was silent for a moment. He had never met someone like Mr. Hassan.",
                    textPersian = "یک صبح سرد زمستانی، مرد ثروتمندی به نام آقای کریمی به نانوایی آمد. «چرا نان مجانی می‌دی؟» پرسید. «پول از دست می‌دی.» آقای حسن لبخند زد و گفت: «چون دوست دارم کمک کنم. وقتی بچه‌ی گرسنه‌ای رو می‌بینم که لبخند می‌زنه، احساس ثروت می‌کنم.» آقای کریمی لحظه‌ای ساکت شد.",
                    vocabulary = listOf(
                        Word("rich", "ثروتمند", "rɪtʃ"),
                        Word("coat", "کت", "koʊt"),
                        Word("surprised", "شگفت‌زده", "sərˈpraɪzd"),
                        Word("hungry", "گرسنه", "ˈhʌŋɡri")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why did Mr. Karimi come to the bakery?",
                            questionPersian = "چرا آقای کریمی به نانوایی آمد؟",
                            options = listOf("To buy bread", "To meet the kind baker", "To sell bread", "To work"),
                            correctIndex = 1,
                            explanation = "He had heard about the kind baker who gave free bread to children."
                        ),
                        ChapterQuizQuestion(
                            question = "Why does Mr. Hassan give free bread?",
                            questionPersian = "چرا آقای حسن نان مجانی می‌ده؟",
                            options = listOf("For money", "Because he loves to help", "For fame", "For business"),
                            correctIndex = 1,
                            explanation = "Mr. Hassan said: 'Because I love to help.'"
                        ),
                        ChapterQuizQuestion(
                            question = "How does Mr. Hassan feel when he helps others?",
                            questionPersian = "آقای حسن وقتی به دیگران کمک می‌کنه چه حسی داره؟",
                            options = listOf("Tired", "Rich", "Sad", "Angry"),
                            correctIndex = 1,
                            explanation = "He said he feels rich — more rich than money could make him."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Reward of Kindness", titlePersian = "پاداش مهربانی",
                    text = "The next day, Mr. Karimi returned to the bakery with a big bag of gold coins. \"Mr. Hassan,\" he said, \"your kindness has changed my heart. Please take this money. Use it to help more people.\" Mr. Hassan was surprised. He did not want to take the money, but Mr. Karimi insisted. So Mr. Hassan used the money to buy flour, sugar, and butter. He baked even more bread and gave it to all the poor families. The bakery became famous. His story was told for generations — a story of a simple baker whose kindness changed an entire town.",
                    textPersian = "روز بعد، آقای کریمی با یک کیسه بزرگ سکه طلا برگشت. «مهربانی‌ات قلب منو تغییر داد. لطفاً این پول رو بگیر.» آقای حسن تعجب کرد، اما آقای کریمی اصرار کرد. آقای حسن با آن پول آرد، شکر و کره خرید. نان بیشتری پخت و به همه‌ی خانواده‌های فقیر داد. نانوایی معروف شد. داستانش برای نسل‌ها گفته شد.",
                    vocabulary = listOf(
                        Word("amazing", "شگفت‌انگیز", "əˈmeɪzɪŋ"),
                        Word("gold", "طلا", "ɡoʊld"),
                        Word("insist", "اصرار کردن", "ɪnˈsɪst"),
                        Word("famous", "معروف", "ˈfeɪməs")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Mr. Karimi bring to the bakery?",
                            questionPersian = "آقای کریمی چی به نانوایی آورد؟",
                            options = listOf("Flour", "Gold coins", "Bread", "Sugar"),
                            correctIndex = 1,
                            explanation = "He brought a big bag of gold coins."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Mr. Hassan do with the money?",
                            questionPersian = "آقای حسن با پول چیکار کرد؟",
                            options = listOf("Bought a house", "Bought flour, sugar, and butter", "Kept it", "Gave it back"),
                            correctIndex = 1,
                            explanation = "He bought flour, sugar, and butter and baked more bread."
                        ),
                        ChapterQuizQuestion(
                            question = "Why did the bakery become famous?",
                            questionPersian = "چرا نانوایی معروف شد؟",
                            options = listOf("For the bread quality", "For the baker's kindness", "For the location", "For the price"),
                            correctIndex = 1,
                            explanation = "Because of the baker's kindness that changed an entire town."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b3", title = "The Three Friends", titlePersian = "سه دوست",
            level = Level.BEGINNER,
            text = "Three friends live in a small village. Their names are Tom, Sam, and Max.",
            moral = "Friends help each other in hard times.", moralPersian = "دوستان در سختی‌ها به هم کمک می‌کنند.",
            coverUrl = "https://images.unsplash.com/photo-1529156069898-49953e39b3ac?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "Three Best Friends", titlePersian = "سه دوست صمیمی",
                    text = "In a small village near the mountains, there lived three best friends. Their names were Tom, Sam, and Max. Tom was tall and strong. Sam was smart and funny. Max was quiet but kind. Even though they were very different, they were inseparable. Every day, they walked to school together, played football in the afternoon, and helped each other with homework. Whenever one of them was sad, the other two would cheer him up. The whole village knew about their friendship.",
                    textPersian = "در دهکده‌ای کوچک نزدیک کوه‌ها، سه دوست صمیمی زندگی می‌کردند. تام قدبلند و قوی بود. سام باهوش و بامزه بود. مکس آرام اما مهربان بود. هرچند خیلی متفاوت بودند، از هم جدا نمی‌شدند. هر روز با هم به مدرسه می‌رفتند، فوتبال بازی می‌کردند. هر وقت یکی غمگین می‌شد، دو نفر دیگر دلش را شاد می‌کردند.",
                    vocabulary = listOf(
                        Word("village", "دهکده", "ˈvɪlɪdʒ"),
                        Word("strong", "قوی", "strɔːŋ"),
                        Word("inseparable", "جدانشدنی", "ɪnˈsepərəbl"),
                        Word("cheer up", "شاد کردن", "tʃɪr ʌp")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who was tall and strong?",
                            questionPersian = "کی قدبلند و قوی بود؟",
                            options = listOf("Sam", "Max", "Tom", "None"),
                            correctIndex = 2,
                            explanation = "Tom was tall and strong."
                        ),
                        ChapterQuizQuestion(
                            question = "Where did the three friends live?",
                            questionPersian = "سه دوست کجا زندگی می‌کردند؟",
                            options = listOf("In a city", "In a village near mountains", "In a forest", "By a lake"),
                            correctIndex = 1,
                            explanation = "In a small village near the mountains."
                        ),
                        ChapterQuizQuestion(
                            question = "What did they do in the afternoon?",
                            questionPersian = "بعدازظهرها چیکار می‌کردند؟",
                            options = listOf("Studied", "Played football", "Slept", "Watched TV"),
                            correctIndex = 1,
                            explanation = "They played football in the afternoon."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Big Storm", titlePersian = "طوفان بزرگ",
                    text = "One night, a terrible storm came to the village. The wind blew hard, the rain poured down, and thunder shook the houses. In the morning, they went outside to see the damage. Tom's roof had been damaged. Sam's garden was full of broken branches. Max's fence had fallen down. All three houses needed work. \"We can fix this,\" said Tom. \"But it will take too long alone,\" said Sam. \"So let's help each other,\" said Max. First, they fixed Tom's roof. Then, they cleaned Sam's garden. Finally, they rebuilt Max's fence. By the end of the day, all three houses were safe again.",
                    textPersian = "یک شب، طوفان وحشتناکی به دهکده آمد. باد شدید می‌وزید و رعد خانه‌ها را می‌لرزاند. صبح، خرابی‌ها را دیدند. سقف تام آسیب دیده بود. باغ سام پر از شاخه‌های شکسته بود. حصار مکس افتاده بود. «می‌تونیم درستش کنیم،» تام گفت. «اما تنها خیلی طول می‌کشه،» سام گفت. «پس بیایید به هم کمک کنیم،» مکس گفت. اول سقف تام، بعد باغ سام، بعد حصار مکس. تا آخر روز، هر سه خانه دوباره امن بودند.",
                    vocabulary = listOf(
                        Word("storm", "طوفان", "stɔːrm"),
                        Word("thunder", "رعد", "ˈθʌndər"),
                        Word("damage", "آسیب", "ˈdæmɪdʒ"),
                        Word("branch", "شاخه", "bræntʃ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What happened one night?",
                            questionPersian = "یک شب چه اتفاقی افتاد؟",
                            options = listOf("A fire", "A flood", "A storm", "An earthquake"),
                            correctIndex = 2,
                            explanation = "A terrible storm came to the village."
                        ),
                        ChapterQuizQuestion(
                            question = "What was damaged in Tom's house?",
                            questionPersian = "چی توی خانه تام آسیب دید؟",
                            options = listOf("The garden", "The roof", "The fence", "The door"),
                            correctIndex = 1,
                            explanation = "Tom's roof had been damaged."
                        ),
                        ChapterQuizQuestion(
                            question = "How did they fix all three houses?",
                            questionPersian = "چطور هر سه خانه رو درست کردند؟",
                            options = listOf("Hired workers", "Helped each other", "Called the government", "Waited"),
                            correctIndex = 1,
                            explanation = "They helped each other to fix all three houses."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Stronger Than Ever", titlePersian = "قوی‌تر از همیشه",
                    text = "The next day, the sun rose again. Tom, Sam, and Max sat together on the grass. \"You know what?\" said Sam. \"If we hadn't helped each other, our houses would still be broken.\" Tom nodded. \"That's what friends are for.\" Max said softly, \"True friends are those who show up when you need them most.\" From that day on, the people of the village told the story of the three friends who proved that together, nothing is impossible. Their friendship lasted a lifetime.",
                    textPersian = "روز بعد، خورشید دوباره طلوع کرد. سه دوست روی چمن نشستند. «اگه به هم کمک نمی‌کردیم، خانه‌هامون هنوز خراب بود،» سام گفت. تام سر تکان داد. «این برای چیه که دوست داریم.» مکس آرام گفت: «دوست‌های واقعی اون‌هایی هستن که وقتی بیشترین نیاز رو داری، سر می‌رسن.» از آن روز، مردم دهکده داستان سه دوست را تعریف می‌کردند.",
                    vocabulary = listOf(
                        Word("silence", "سکوت", "ˈsaɪləns"),
                        Word("prove", "ثابت کردن", "pruːv"),
                        Word("impossible", "غیرممکن", "ɪmˈpɒsəbl"),
                        Word("lifetime", "یک عمر", "ˈlaɪftaɪm")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Sam say about helping each other?",
                            questionPersian = "سام درباره کمک به هم چی گفت؟",
                            options = listOf(
                                "It was a waste of time",
                                "Their houses would still be broken",
                                "It was easy",
                                "They should have hired workers"
                            ),
                            correctIndex = 1,
                            explanation = "Sam said if they hadn't helped each other, their houses would still be broken."
                        ),
                        ChapterQuizQuestion(
                            question = "According to Max, who are true friends?",
                            questionPersian = "از نظر مکس، دوست‌های واقعی کی هستن؟",
                            options = listOf(
                                "Those who give gifts",
                                "Those who show up when you need them",
                                "Those who are rich",
                                "Those who are funny"
                            ),
                            correctIndex = 1,
                            explanation = "Max said: 'True friends are those who show up when you need them most.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did the village people learn from the three friends?",
                            questionPersian = "مردم دهکده از سه دوست چی یاد گرفتند؟",
                            options = listOf(
                                "Money is important",
                                "Together, nothing is impossible",
                                "Storms are dangerous",
                                "Houses are expensive"
                            ),
                            correctIndex = 1,
                            explanation = "The three friends proved that together, nothing is impossible."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b4", title = "The Magic Garden", titlePersian = "باغ جادویی",
            level = Level.BEGINNER,
            text = "A poor farmer has a small garden. One night, a fairy comes and helps him.",
            moral = "Sharing brings happiness.", moralPersian = "بخشش شادی می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Poor Farmer", titlePersian = "کشاورز فقیر",
                    text = "Once upon a time, in a small village, there lived a poor farmer named Reza. Reza had a tiny garden behind his small mud house. Every spring, he planted seeds with great hope. He watered them every morning and every evening. But every year, nothing grew. The soil was dry. The birds ate the seeds. Reza's neighbors laughed at him. \"Why do you keep trying?\" they asked. But Reza never gave up. He believed that one day, his garden would bloom.",
                    textPersian = "روزی روزگاری، کشاورز فقیری به نام رضا زندگی می‌کرد. رضا باغ کوچکی پشت خانه گلی‌اش داشت. هر بهار با امید زیاد دانه می‌کاشت. هر صبح و عصر آب می‌داد. اما هر سال چیزی رشد نمی‌کرد. همسایه‌ها به او می‌خندیدند. اما رضا هرگز تسلیم نشد.",
                    vocabulary = listOf(
                        Word("farmer", "کشاورز", "ˈfɑːrmər"),
                        Word("seed", "دانه", "siːd"),
                        Word("neighbor", "همسایه", "ˈneɪbər"),
                        Word("bloom", "شکوفا شدن", "bluːm")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What is the farmer's name?",
                            questionPersian = "اسم کشاورز چیه؟",
                            options = listOf("Hassan", "Reza", "Ali", "Karim"),
                            correctIndex = 1,
                            explanation = "The poor farmer's name was Reza."
                        ),
                        ChapterQuizQuestion(
                            question = "What happened every year to Reza's garden?",
                            questionPersian = "هر سال برای باغ رضا چی اتفاق می‌افتاد؟",
                            options = listOf("It bloomed beautifully", "Nothing grew", "It was destroyed", "It was stolen"),
                            correctIndex = 1,
                            explanation = "Every year, nothing grew in Reza's garden."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Reza believe?",
                            questionPersian = "رضا به چی باور داشت؟",
                            options = listOf(
                                "That nothing would grow",
                                "That one day his garden would bloom",
                                "That he should give up",
                                "That neighbors were right"
                            ),
                            correctIndex = 1,
                            explanation = "Reza believed that one day his garden would bloom."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Fairy's Promise", titlePersian = "قول پری",
                    text = "One quiet night, when the moon was full, Reza was sitting in his garden, feeling very sad. Suddenly, a soft light appeared. A beautiful fairy with silver wings stood before him. \"Do not be afraid, Reza,\" she said. \"I have watched you for many years. You work so hard and never give up. I will help you.\" Reza's eyes filled with tears of joy. The fairy continued, \"But you must promise me one thing. When your garden grows, you must share your food with everyone who is hungry.\" Reza nodded. \"I promise!\" The fairy touched the ground with her wand, and a golden light covered the garden.",
                    textPersian = "یک شب آرام، وقتی ماه کامل بود، رضا در باغش نشسته بود. ناگهان نور ملایمی ظاهر شد. پری زیبایی با بال‌های نقره‌ای ایستاد. «نترس رضا،» گفت. «سال‌هاست تو را تماشا می‌کنم. سخت کار می‌کنی. به تو کمک خواهم کرد.» پری ادامه داد: «اما باید قول بدهی وقتی باغت رشد کرد، غذا را با همه قسمت کنی.» رضا سر تکان داد. «قول می‌دهم!» پری با عصایش زمین را لمس کرد.",
                    vocabulary = listOf(
                        Word("fairy", "پری", "ˈferi"),
                        Word("wing", "بال", "wɪŋ"),
                        Word("promise", "قول", "ˈprɑːmɪs"),
                        Word("wand", "عصای جادویی", "wɑːnd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "When did the fairy appear?",
                            questionPersian = "پری کِی ظاهر شد؟",
                            options = listOf("Morning", "Noon", "A quiet night with full moon", "Evening"),
                            correctIndex = 2,
                            explanation = "The fairy appeared on a quiet night when the moon was full."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the fairy ask Reza to promise?",
                            questionPersian = "پری از رضا خواست چه قولی بده؟",
                            options = listOf(
                                "To work harder",
                                "To share food with hungry people",
                                "To keep the garden for himself",
                                "To sell the food"
                            ),
                            correctIndex = 1,
                            explanation = "The fairy asked Reza to share his food with everyone who is hungry."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the fairy have?",
                            questionPersian = "پری چی داشت؟",
                            options = listOf("Golden hair", "Silver wings", "Red dress", "Blue eyes"),
                            correctIndex = 1,
                            explanation = "The fairy had silver wings."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Garden Full of Joy", titlePersian = "باغی پر از شادی",
                    text = "The next morning, Reza woke up before sunrise. He ran to his garden. What he saw made him cry with happiness. Beautiful tomatoes, cucumbers, carrots, and melons were growing everywhere! Reza fell to his knees and thanked God. Then he remembered his promise. He ran to the village with a big basket of vegetables. He gave food to the old widow, to the hungry children, and even to the neighbors who had laughed at him. Everyone was amazed. The village became famous for its kindness, and Reza became the happiest man. Because he learned that true happiness comes not from having, but from giving.",
                    textPersian = "صبح روز بعد، رضا قبل از طلوع بیدار شد. به باغش دوید. گوجه‌فرنگی، خیار، هویج و خربزه همه‌جا رشد کرده بودند! رضا زانو زد و خدا را شکر کرد. بعد قولش را یادش آمد. با سبد بزرگی به دهکده دوید. به بیوه‌ی پیر، بچه‌های گرسنه و حتی همسایه‌هایی که به او خندیده بودند غذا داد. دهکده معروف شد و رضا شادترین مرد.",
                    vocabulary = listOf(
                        Word("sunrise", "طلوع", "ˈsʌnraɪz"),
                        Word("vegetable", "سبزیجات", "ˈvedʒtəbl"),
                        Word("widow", "بیوه", "ˈwɪdoʊ"),
                        Word("giving", "بخشیدن", "ˈɡɪvɪŋ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What grew in Reza's garden?",
                            questionPersian = "چی توی باغ رضا رشد کرد؟",
                            options = listOf("Only flowers", "Tomatoes, cucumbers, and more", "Only trees", "Nothing"),
                            correctIndex = 1,
                            explanation = "Tomatoes, cucumbers, carrots, and melons grew everywhere!"
                        ),
                        ChapterQuizQuestion(
                            question = "Who did Reza share his food with?",
                            questionPersian = "رضا غذایش رو با کی قسمت کرد؟",
                            options = listOf("Only his family", "Only friends", "Everyone including neighbors", "Nobody"),
                            correctIndex = 2,
                            explanation = "He gave food to the old widow, hungry children, and even the neighbors who laughed at him."
                        ),
                        ChapterQuizQuestion(
                            question = "What lesson did Reza learn?",
                            questionPersian = "رضا چه درسی یاد گرفت؟",
                            options = listOf(
                                "Money is everything",
                                "True happiness comes from giving",
                                "Neighbors are bad",
                                "Farming is hard"
                            ),
                            correctIndex = 1,
                            explanation = "He learned that true happiness comes not from having, but from giving."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b5", title = "The Honest Boy", titlePersian = "پسر راستگو",
            level = Level.BEGINNER,
            text = "A boy named Ali finds a wallet on the street with a lot of money.",
            moral = "Honesty is the best policy.", moralPersian = "صداقت بهترین سیاست است.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "A Wallet in the Street", titlePersian = "کیف پولی در خیابان",
                    text = "Ali was a ten-year-old boy. Every day after school, he walked home through the busy market street. One rainy afternoon, he noticed something on the wet ground. It was a black leather wallet. He looked around. No one was watching. Ali picked it up carefully. The wallet was heavy. He opened it and could not believe his eyes. Inside were dozens of bills — more money than he had ever seen. His heart started to beat fast. With this money, he could buy new shoes, books, even a bicycle! But then he remembered his mother's words: \"Always do the right thing, even when no one is watching.\"",
                    textPersian = "علی پسر ده ساله‌ای بود. هر روز بعد از مدرسه از خیابان بازار به خانه برمی‌گشت. یک بعدازظهر بارانی، روی زمین خیس کیف چرم مشکی دید. اطراف را نگاه کرد. هیچ‌کس نگاه نمی‌کرد. با دقت برداشت. کیف سنگین بود. بازش کرد و باور کرد. ده‌ها اسکناس داخلش بود. قلبش تند زد. با این پول می‌توانست کفش نو، کتاب، حتی دوچرخه بخرد! اما بعد حرف مادرش را یادش آمد.",
                    vocabulary = listOf(
                        Word("wallet", "کیف پول", "ˈwɑːlɪt"),
                        Word("leather", "چرم", "ˈleðər"),
                        Word("bill", "اسکناس", "bɪl"),
                        Word("bicycle", "دوچرخه", "ˈbaɪsɪkl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Ali find on the street?",
                            questionPersian = "علی چی توی خیابان پیدا کرد؟",
                            options = listOf("A bag", "A wallet", "A phone", "A book"),
                            correctIndex = 1,
                            explanation = "Ali found a black leather wallet on the wet ground."
                        ),
                        ChapterQuizQuestion(
                            question = "What was inside the wallet?",
                            questionPersian = "داخل کیف چی بود؟",
                            options = listOf("Photos", "Dozens of bills", "A card", "A key"),
                            correctIndex = 1,
                            explanation = "Inside were dozens of bills — more money than he had ever seen."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Ali's mother teach him?",
                            questionPersian = "مادر علی به او چی یاد داده بود؟",
                            options = listOf(
                                "To take money when found",
                                "To always do the right thing",
                                "To be fast",
                                "To hide things"
                            ),
                            correctIndex = 1,
                            explanation = "His mother said: 'Always do the right thing, even when no one is watching.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Test of Honesty", titlePersian = "آزمون صداقت",
                    text = "Ali stood in the rain for a long moment. He thought about his old shoes. He thought about the math book he needed. He thought about how happy his mother would be. But he also thought about the person who lost the wallet. Maybe it was their life savings. Maybe they had a sick child. Ali made a decision. He walked straight to the police station. The officer was surprised to see a wet, tired boy. \"I found this on the street,\" Ali said. \"Someone must be very worried.\" The officer opened the wallet and found an ID card. The owner was Mr. Ahmadi.",
                    textPersian = "علی لحظه‌ای در باران ایستاد. به کفش‌های کهنه‌اش فکر کرد. به کتاب ریاضی. به اینکه مادرش چقدر خوشحال می‌شود. اما به کسی هم فکر کرد که کیف را گم کرده بود. شاید تمام پس‌انداز زندگی‌اش بود. علی تصمیم گرفت. مستقیم به کلانتری رفت. افسر از دیدن پسری خیس تعجب کرد. «این را در خیابان پیدا کردم،» علی گفت. افسر کیف را باز کرد و کارت شناسایی پیدا کرد. صاحبش آقای احمدی بود.",
                    vocabulary = listOf(
                        Word("worn-out", "کهنه", "wɔːrn aʊt"),
                        Word("saving", "پس‌انداز", "ˈseɪvɪŋ"),
                        Word("precious", "ارزشمند", "ˈpreʃəs"),
                        Word("officer", "افسر", "ˈɔːfɪsər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Where did Ali take the wallet?",
                            questionPersian = "علی کیف رو کجا برد؟",
                            options = listOf("Home", "School", "Police station", "Market"),
                            correctIndex = 2,
                            explanation = "Ali walked straight to the police station."
                        ),
                        ChapterQuizQuestion(
                            question = "What was found inside the wallet?",
                            questionPersian = "داخل کیف چی پیدا شد؟",
                            options = listOf("A letter", "An ID card", "A photo", "A receipt"),
                            correctIndex = 1,
                            explanation = "The officer found an ID card inside the wallet."
                        ),
                        ChapterQuizQuestion(
                            question = "Who was the owner of the wallet?",
                            questionPersian = "صاحب کیف کی بود؟",
                            options = listOf("Mr. Hassan", "Mr. Karimi", "Mr. Ahmadi", "Mr. Reza"),
                            correctIndex = 2,
                            explanation = "The owner was Mr. Ahmadi."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Reward of Truth", titlePersian = "پاداش حقیقت",
                    text = "An hour later, Mr. Ahmadi rushed into the police station. \"My wallet!\" he cried. When he opened it, he started to cry. \"Everything is here. My whole month's salary. I was going to pay my daughter's hospital bill today.\" He walked to Ali and hugged the boy tightly. \"Thank you, my son. You are an honest boy.\" Mr. Ahmadi took out some money, but Ali shook his head. \"I only did what is right,\" he said. That night, Ali walked home slowly. He had no money, no new shoes. But his heart was full. When he told his mother, she hugged him and cried tears of pride.",
                    textPersian = "یک ساعت بعد، آقای احمدی با عجله وارد کلانتری شد. «کیفم!» گریه کرد. وقتی بازش کرد، شروع به گریه کرد. «همه چیز اینجاست. تمام حقوق یک ماهم. امروز می‌خواستم صورتحساب بیمارستان دخترم رو بدم.» به سمت علی رفت و او را در آغوش گرفت. «ممنون پسرم. تو پسر راستگویی هستی.» خواست پول بدهد، اما علی سر تکان داد. «من فقط کار درست را انجام دادم.» آن شب، علی آرام به خانه رفت. پولی نداشت. اما قلبش پر بود.",
                    vocabulary = listOf(
                        Word("rush", "با عجله رفتن", "rʌʃ"),
                        Word("salary", "حقوق", "ˈsæləri"),
                        Word("hug", "در آغوش گرفتن", "hʌɡ"),
                        Word("pride", "افتخار", "praɪd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why did Mr. Ahmadi need the money?",
                            questionPersian = "چرا آقای احمدی به پول نیاز داشت؟",
                            options = listOf(
                                "To buy a car",
                                "To pay his daughter's hospital bill",
                                "To buy a house",
                                "To travel"
                            ),
                            correctIndex = 1,
                            explanation = "He was going to pay his daughter's hospital bill that day."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Ali say when Mr. Ahmadi offered money?",
                            questionPersian = "وقتی آقای احمدی پول تعارف کرد، علی چی گفت؟",
                            options = listOf(
                                "He took the money",
                                "He said 'I only did what is right'",
                                "He asked for more",
                                "He got angry"
                            ),
                            correctIndex = 1,
                            explanation = "Ali said: 'I only did what is right.'"
                        ),
                        ChapterQuizQuestion(
                            question = "How did Ali feel when he got home?",
                            questionPersian = "وقتی علی به خانه رسید چه حسی داشت؟",
                            options = listOf("Sad and tired", "Rich and happy", "His heart was full", "Regretful"),
                            correctIndex = 2,
                            explanation = "He had no money, but his heart was full."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b6", title = "The Brave Dog", titlePersian = "سگ شجاع",
            level = Level.BEGINNER,
            text = "A dog named Rex lives with a family. One night, Rex hears a strange noise.",
            moral = "Bravery saves lives.", moralPersian = "شجاعت جان‌ها را نجات می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1552053831-71594a27632d?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "A Loyal Friend", titlePersian = "دوستی وفادار",
                    text = "Rex was a large brown dog with bright eyes and a loud bark. He lived with the Karimi family in a small house near the forest. There was Mr. Karimi, Mrs. Karimi, and their two children, Sara and Reza. Rex loved them all very much. Every morning, he walked Sara and Reza to school. Every evening, he waited by the door for Mr. Karimi to come home. He slept at the foot of the children's beds. Rex was more than a pet — he was a member of the family.",
                    textPersian = "رکس سگ قهوه‌ای بزرگی بود. با خانواده کریمی در خانه‌ای نزدیک جنگل زندگی می‌کرد. آقای کریمی، خانم کریمی و فرزندانشان سارا و رضا. رکس همه را خیلی دوست داشت. هر صبح سارا و رضا را تا مدرسه همراهی می‌کرد. هر عصر کنار در منتظر می‌ماند. رکس بیشتر از یک حیوان خانگی بود — عضوی از خانواده بود.",
                    vocabulary = listOf(
                        Word("bark", "پارس", "bɑːrk"),
                        Word("loyal", "وفادار", "ˈlɔɪəl"),
                        Word("forest", "جنگل", "ˈfɔːrɪst"),
                        Word("wag", "تکان دادن", "wæɡ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What kind of dog is Rex?",
                            questionPersian = "رکس چه نوع سگی هست؟",
                            options = listOf("Small white", "Large brown", "Medium black", "Tiny golden"),
                            correctIndex = 1,
                            explanation = "Rex was a large brown dog with bright eyes."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Rex do every morning?",
                            questionPersian = "رکس هر صبح چیکار می‌کرد؟",
                            options = listOf("Slept", "Walked children to school", "Ate food", "Played alone"),
                            correctIndex = 1,
                            explanation = "Every morning, Rex walked Sara and Reza to school."
                        ),
                        ChapterQuizQuestion(
                            question = "Where did Rex sleep?",
                            questionPersian = "رکس کجا می‌خوابید؟",
                            options = listOf("Outside", "In the kitchen", "At the foot of children's beds", "In the garden"),
                            correctIndex = 2,
                            explanation = "He slept at the foot of the children's beds."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Night of Fire", titlePersian = "شب آتش",
                    text = "It was a cold winter night. At 2 AM, Rex suddenly woke up. He smelled something strange — something burning. He walked to the kitchen. Smoke was coming from under the door! The stove had been left on, and something had caught fire. Rex ran to the children's room first. He barked loudly. \"Woof! Woof!\" The children woke up, terrified. Then Rex ran to the parents' room and barked even louder. \"Fire! Fire!\" Mr. Karimi shouted. In seconds, the whole family was awake. The house was filling with smoke. They ran to the front door, but the fire was blocking the way!",
                    textPersian = "شب سرد زمستانی بود. ساعت دو بامداد، رکس ناگهان بیدار شد. بوی عجیبی حس کرد. به آشپزخانه رفت. دود از زیر در می‌آمد! اجاق روشن مانده بود. اول به اتاق بچه‌ها دوید. بلند پارس کرد. بچه‌ها وحشت‌زده بیدار شدند. بعد به اتاق والدین دوید. «آتش!» آقای کریمی فریاد زد. خانه داشت پر از دود می‌شد. به سمت در دویدند، اما آتش راه را بسته بود!",
                    vocabulary = listOf(
                        Word("smoke", "دود", "smoʊk"),
                        Word("stove", "اجاق", "stoʊv"),
                        Word("terrified", "وحشت‌زده", "ˈterɪfaɪd"),
                        Word("breathe", "نفس کشیدن", "briːð")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What time did Rex wake up?",
                            questionPersian = "رکس ساعت چند بیدار شد؟",
                            options = listOf("12 AM", "2 AM", "4 AM", "6 AM"),
                            correctIndex = 1,
                            explanation = "Rex woke up at 2 AM."
                        ),
                        ChapterQuizQuestion(
                            question = "Where was the fire?",
                            questionPersian = "آتش کجا بود؟",
                            options = listOf("In the bedroom", "In the kitchen", "In the garden", "On the roof"),
                            correctIndex = 1,
                            explanation = "Smoke was coming from the kitchen — the stove had caught fire."
                        ),
                        ChapterQuizQuestion(
                            question = "What problem did the family face?",
                            questionPersian = "خانواده با چه مشکلی روبرو شدند؟",
                            options = listOf(
                                "The fire blocked the front door",
                                "They couldn't find Rex",
                                "The children were missing",
                                "The phone didn't work"
                            ),
                            correctIndex = 0,
                            explanation = "The fire was blocking the way to the front door."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Rex Saves the Day", titlePersian = "رکس روز را نجات می‌دهد",
                    text = "Mr. Karimi knew they could not use the front door. \"The back door!\" he shouted. But the smoke was so thick that no one could see. Rex, however, knew the house by heart. He barked and led the family through the dark hallway. He stopped at the back door and scratched at it. Mr. Karimi opened it and fresh air rushed in. The family escaped. The firefighters arrived and put out the fire. \"That dog saved your lives,\" the fire chief said. From that day on, Rex was known as \"The Brave Dog.\" He was given a golden medal and lived with the family for many happy years.",
                    textPersian = "آقای کریمی می‌دانست نمی‌توانند از در اصلی استفاده کنند. «در پشتی!» فریاد زد. اما دود غلیظ بود. رکس اما خانه را از بر بود. پارس کرد و خانواده را از راهروی تاریک هدایت کرد. کنار در پشتی ایستاد. آقای کریمی بازش کرد و هوای تازه وارد شد. خانواده فرار کردند. آتش‌نشانان آمدند و آتش را خاموش کردند. «آن سگ جان شما را نجات داد،» رئیس آتش‌نشانی گفت. از آن روز، رکس به «سگ شجاع» معروف شد.",
                    vocabulary = listOf(
                        Word("hallway", "راهرو", "ˈhɔːlweɪ"),
                        Word("scratch", "خراشیدن", "skrætʃ"),
                        Word("escape", "فرار کردن", "ɪˈskeɪp"),
                        Word("medal", "مدال", "ˈmedl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Which door did Rex lead the family to?",
                            questionPersian = "رکس خانواده رو به کدوم در هدایت کرد؟",
                            options = listOf("Front door", "Back door", "Side door", "Window"),
                            correctIndex = 1,
                            explanation = "Rex led the family to the back door."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the fire chief say about Rex?",
                            questionPersian = "رئیس آتش‌نشانی درباره رکس چی گفت؟",
                            options = listOf(
                                "He was a troublemaker",
                                "He was just a dog",
                                "That dog saved your lives",
                                "He was hungry"
                            ),
                            correctIndex = 2,
                            explanation = "The fire chief said: 'That dog saved your lives.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What was Rex known as after that day?",
                            questionPersian = "رکس بعد از آن روز به چی معروف شد؟",
                            options = listOf("The Fast Dog", "The Brave Dog", "The Big Dog", "The Smart Dog"),
                            correctIndex = 1,
                            explanation = "Rex was known as 'The Brave Dog.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b7", title = "The Little Bird", titlePersian = "پرنده کوچک",
            level = Level.BEGINNER,
            text = "A little bird falls from the tree. A boy helps her.",
            moral = "Kindness creates friendship.", moralPersian = "مهربانی دوستی می‌سازد.",
            coverUrl = "https://images.unsplash.com/photo-1444464666168-49d633b86797?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Fall", titlePersian = "سقوط",
                    text = "High up in an old oak tree, there was a small nest. Inside lived a tiny yellow bird named Cheep. Cheep was the smallest bird in the tree. She had just learned to fly. One windy morning, while Cheep was trying to fly from branch to branch, a strong gust of wind blew her off. She tumbled through the air and landed hard on the ground. Her little wing hurt very much. She tried to fly again, but she could not. Cheep began to chirp softly, afraid and alone.",
                    textPersian = "بالای یک درخت بلوط قدیمی، لانه کوچکی بود. پرنده کوچک زردی به نام چیک. چیک کوچکترین پرنده درخت بود. تازه پرواز یاد گرفته بود. یک صبح بادی، باد شدیدی او را پایین انداخت. بال کوچکش خیلی درد می‌کرد. سعی کرد دوباره پرواز کند، اما نتوانست.",
                    vocabulary = listOf(
                        Word("nest", "لانه", "nest"),
                        Word("branch", "شاخه", "bræntʃ"),
                        Word("gust", "وزش باد", "ɡʌst"),
                        Word("shiver", "لرزیدن", "ˈʃɪvər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the little bird's name?",
                            questionPersian = "اسم پرنده کوچک چی بود؟",
                            options = listOf("Tweet", "Cheep", "Chirp", "Pip"),
                            correctIndex = 1,
                            explanation = "The little bird's name was Cheep."
                        ),
                        ChapterQuizQuestion(
                            question = "What happened to Cheep?",
                            questionPersian = "برای چیک چه اتفاقی افتاد؟",
                            options = listOf(
                                "She found food",
                                "A strong wind blew her off a branch",
                                "She made new friends",
                                "She sang a song"
                            ),
                            correctIndex = 1,
                            explanation = "A strong gust of wind blew her off the branch."
                        ),
                        ChapterQuizQuestion(
                            question = "What hurt Cheep?",
                            questionPersian = "چی چیک رو زخمی کرد؟",
                            options = listOf("Her wing", "Her leg", "Her head", "Her beak"),
                            correctIndex = 0,
                            explanation = "Her little wing hurt very much."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Boy's Kindness", titlePersian = "مهربانی یک پسر",
                    text = "That afternoon, a boy named Omid was walking home from school. As he passed by the oak tree, he heard a soft sound. \"Cheep... cheep...\" Omid stopped. There, in the grass, was the little yellow bird. Omid knelt down. \"Oh, you poor thing,\" he whispered. \"Your wing is hurt.\" He gently picked up Cheep and held her in his warm hands. \"Don't be scared,\" he said. \"I'll take care of you.\" Omid carried Cheep home. His mother helped him make a small bed out of a shoebox. They gave Cheep water and small pieces of bread. Every day, Omid cleaned her wing. Slowly, the little bird began to trust the boy.",
                    textPersian = "آن بعدازظهر، پسری به نام امید از مدرسه برمی‌گشت. وقتی از کنار درخت گذشت، صدای ملایمی شنید. «جیک... جیک...» امید ایستاد. پرنده زرد کوچک در چمن بود. زانو زد. «بیچاره،» زمزمه کرد. «بالت آسیب دیده.» به آرامی چیک را برداشت. «نترس. من ازت مراقبت می‌کنم.» چیک را به خانه برد. مادرش کمک کرد تخت کوچکی درست کنند. هر روز بال او را تمیز می‌کرد.",
                    vocabulary = listOf(
                        Word("kneel", "زانو زدن", "niːl"),
                        Word("whisper", "زمزمه کردن", "ˈwɪspər"),
                        Word("wrap", "پیچیدن", "ræp"),
                        Word("trust", "اعتماد کردن", "trʌst")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who found Cheep?",
                            questionPersian = "کی چیک رو پیدا کرد؟",
                            options = listOf("A girl", "A boy named Omid", "An old man", "A cat"),
                            correctIndex = 1,
                            explanation = "A boy named Omid found the little bird."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Omid use to make a bed for Cheep?",
                            questionPersian = "امید برای تخت چیک از چی استفاده کرد؟",
                            options = listOf("A basket", "A shoebox", "A pillow", "A cup"),
                            correctIndex = 1,
                            explanation = "His mother helped him make a small bed out of a shoebox."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Omid do every day?",
                            questionPersian = "امید هر روز چیکار می‌کرد؟",
                            options = listOf(
                                "Played with Cheep",
                                "Cleaned her wing",
                                "Fed her cake",
                                "Took her for a walk"
                            ),
                            correctIndex = 1,
                            explanation = "Every day, Omid cleaned her wing."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Friend Forever", titlePersian = "دوستی برای همیشه",
                    text = "After one week, Cheep's wing was healed. She could flap both wings now. Omid knew it was time to let her go. One sunny morning, he took Cheep to the garden. He opened his hands and said softly, \"Go, little friend. You're free now.\" Cheep looked at him. Then she flew up into the sky. Omid watched with tears in his eyes. But the next morning, he heard a familiar sound outside his window. \"Cheep! Cheep!\" It was Cheep! She was sitting on the windowsill with a small flower in her beak. Every morning after that, Cheep came to visit Omid. When you are kind to someone, they never forget you.",
                    textPersian = "بعد از یک هفته، بال چیک بهبود یافته بود. امید می‌دانست وقت رفتن است. یک صبح آفتابی، چیک را به باغ برد. دستانش را باز کرد و آرام گفت: «برو دوست کوچک. حالا آزادی.» چیک لحظه‌ای نگاه کرد. بعد در آسمان پرواز کرد. اما صبح روز بعد، صدای آشنایی شنید. «جیک! جیک!» چیک بود! هر صبح بعد از آن، چیک به دیدن امید می‌آمد. وقتی با کسی مهربان باشی، او هرگز تو را فراموش نمی‌کند.",
                    vocabulary = listOf(
                        Word("heal", "شفا یافتن", "hiːl"),
                        Word("flap", "بال زدن", "flæp"),
                        Word("windowsill", "طاقچه", "ˈwɪndoʊsɪl"),
                        Word("forget", "فراموش کردن", "fərˈɡet")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How long did it take for Cheep's wing to heal?",
                            questionPersian = "چند وقت طول کشید تا بال چیک خوب بشه؟",
                            options = listOf("One day", "One week", "One month", "One year"),
                            correctIndex = 1,
                            explanation = "After one week, Cheep's wing was healed."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Omid do when Cheep was healed?",
                            questionPersian = "وقتی چیک خوب شد، امید چیکار کرد؟",
                            options = listOf(
                                "Kept her in a cage",
                                "Let her go free",
                                "Gave her to a friend",
                                "Sold her"
                            ),
                            correctIndex = 1,
                            explanation = "Omid let her go free because birds belong in the sky."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Cheep do every morning after that?",
                            questionPersian = "چیک بعد از آن هر صبح چیکار می‌کرد؟",
                            options = listOf(
                                "Flew away forever",
                                "Came to visit Omid",
                                "Sang with other birds",
                                "Slept all day"
                            ),
                            correctIndex = 1,
                            explanation = "Every morning after that, Cheep came to visit Omid."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b8", title = "The Rainy Day", titlePersian = "روز بارانی",
            level = Level.BEGINNER,
            text = "A boy named Ben walks in the rain. An old woman gives him her umbrella.",
            moral = "Return kindness with kindness.", moralPersian = "مهربانی را با مهربانی پاسخ دهید.",
            coverUrl = "https://images.unsplash.com/photo-1519692933481-e162a57d6721?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "Caught in the Rain", titlePersian = "گرفتار در باران",
                    text = "It was a gray, gloomy afternoon. Ben was walking home from school when the sky suddenly turned dark. Within seconds, heavy rain began to fall. Ben had no umbrella. He pulled his jacket over his head and started to run. But the rain was too strong. Water dripped down his face, into his shoes, and through his clothes. Within minutes, he was completely soaked. He stopped under a small tree, shivering and wet. Other people hurried past him with umbrellas, not even looking at him. Ben felt cold, tired, and a little sorry for himself.",
                    textPersian = "بعدازظهر خاکستری و دلگیری بود. بن از مدرسه به خانه برمی‌گشت که آسمان ناگهان تیره شد. باران شدید شروع به باریدن کرد. بن چتری نداشت. کاپشنش را روی سرش کشید و شروع به دویدن کرد. اما باران خیلی شدید بود. زیر درخت کوچکی ایستاد، لرزان و خیس. بقیه مردم با چتر از کنارش رد می‌شدند.",
                    vocabulary = listOf(
                        Word("gloomy", "دلگیر", "ˈɡluːmi"),
                        Word("heavy rain", "باران شدید", "ˈhevi reɪn"),
                        Word("soaked", "خیس", "soʊkt"),
                        Word("hurry", "عجله کردن", "ˈhɜːri")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why was Ben wet?",
                            questionPersian = "چرا بن خیس شد؟",
                            options = listOf(
                                "He jumped in a pool",
                                "He had no umbrella in heavy rain",
                                "He fell in a river",
                                "He played with water"
                            ),
                            correctIndex = 1,
                            explanation = "Ben had no umbrella when the heavy rain began."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Ben do to protect himself?",
                            questionPersian = "بن برای محافظت از خودش چیکار کرد؟",
                            options = listOf(
                                "Found a shelter",
                                "Pulled his jacket over his head",
                                "Borrowed an umbrella",
                                "Stayed at school"
                            ),
                            correctIndex = 1,
                            explanation = "He pulled his jacket over his head and started to run."
                        ),
                        ChapterQuizQuestion(
                            question = "Did other people help Ben?",
                            questionPersian = "آیا بقیه مردم به بن کمک کردند؟",
                            options = listOf("Yes", "No, they hurried past", "Some did", "Only one person"),
                            correctIndex = 1,
                            explanation = "Other people hurried past him with umbrellas, not even looking at him."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Old Woman's Gift", titlePersian = "هدیه‌ی زن پیر",
                    text = "Just as Ben was about to give up, he heard a soft voice. \"Young man!\" He turned around. An old woman was standing nearby, holding an umbrella. She had gray hair and a kind face. She smiled at Ben and walked over to him slowly. \"You are completely wet, my child,\" she said. \"Here, take my umbrella.\" Ben could not believe his ears. \"But... but what about you?\" he asked. The old woman laughed softly. \"Don't worry about me. I live right there.\" She pointed to a small house across the street. \"I only have a few steps to go. You have a long way home.\" Ben hesitated. Then he took the umbrella. \"Thank you so much,\" he said.",
                    textPersian = "همین که بن می‌خواست تسلیم شود، صدای ملایمی شنید. «جوان!» برگشت. زن پیری با چتر ایستاده بود. موهای خاکستری و صورت مهربانی داشت. «کاملاً خیس شدی پسرم،» گفت. «بیا، چتر من رو بگیر.» بن باورش نمی‌شد. «اما خودتون چی؟» زن پیر خندید. «نگران من نباش. من همین‌جا زندگی می‌کنم.» بن لحظه‌ای تردید کرد. بعد چتر را گرفت.",
                    vocabulary = listOf(
                        Word("nearby", "نزدیک", "ˌnɪrˈbaɪ"),
                        Word("umbrella", "چتر", "ʌmˈbrelə"),
                        Word("hesitate", "تردید کردن", "ˈhezɪteɪt"),
                        Word("kind", "مهربان", "kaɪnd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who helped Ben?",
                            questionPersian = "کی به بن کمک کرد؟",
                            options = listOf("A teacher", "An old woman", "A friend", "A police officer"),
                            correctIndex = 1,
                            explanation = "An old woman with gray hair and a kind face helped Ben."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the old woman give Ben?",
                            questionPersian = "زن پیر چی به بن داد؟",
                            options = listOf("Money", "An umbrella", "A jacket", "Food"),
                            correctIndex = 1,
                            explanation = "She gave Ben her umbrella."
                        ),
                        ChapterQuizQuestion(
                            question = "Why did the old woman not need her umbrella?",
                            questionPersian = "چرا زن پیر به چترش نیاز نداشت؟",
                            options = listOf(
                                "She liked the rain",
                                "She lived right there",
                                "She had another one",
                                "She wanted to get wet"
                            ),
                            correctIndex = 1,
                            explanation = "She said: 'I live right there. I only have a few steps to go.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Kindness Comes Back", titlePersian = "مهربانی برمی‌گردد",
                    text = "The next day, Ben bought a beautiful new umbrella. It was blue with yellow flowers. He also bought a small box of chocolates. Then he walked to the old woman's house and knocked on her door. When she opened the door, she was surprised. \"Hello, young man! You are the boy from yesterday.\" Ben smiled and held out the umbrella. \"This is for you. You gave me yours, so I bought you a new one.\" The old woman's eyes filled with tears. She hugged Ben. \"You are a wonderful boy.\" Ben shook his head. \"My mother always says: return kindness with kindness.\" From that day on, Ben visited the old woman every week. They became the best of friends.",
                    textPersian = "روز بعد، بن یک چتر نو زیبا خرید. آبی با گل‌های زرد. یک جعبه شکلات هم خرید. بعد به خانه زن پیر رفت. وقتی در را باز کرد، شگفت‌زده شد. «سلام جوان! تو همون پسری از دیروزی.» بن لبخند زد و چتر را دراز کرد. «این مال شماست. شما چترتان رو به من دادید، پس من یک چتر نو خریدم.» چشمان زن پیر پر از اشک شد. از آن روز، بن هر هفته به دیدن زن پیر می‌رفت. بهترین دوست شدند.",
                    vocabulary = listOf(
                        Word("knock", "در زدن", "nɑːk"),
                        Word("gift", "هدیه", "ɡɪft"),
                        Word("act of kindness", "عمل مهربانی", ""),
                        Word("forever", "برای همیشه", "fərˈevər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Ben buy the next day?",
                            questionPersian = "بن روز بعد چی خرید؟",
                            options = listOf(
                                "A new jacket",
                                "A new umbrella and chocolates",
                                "A new pair of shoes",
                                "A book"
                            ),
                            correctIndex = 1,
                            explanation = "Ben bought a beautiful new umbrella and a small box of chocolates."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Ben's mother always say?",
                            questionPersian = "مادر بن همیشه چی می‌گفت؟",
                            options = listOf(
                                "Be careful in the rain",
                                "Return kindness with kindness",
                                "Never trust strangers",
                                "Stay home when it rains"
                            ),
                            correctIndex = 1,
                            explanation = "His mother always said: 'Return kindness with kindness.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What happened between Ben and the old woman?",
                            questionPersian = "بین بن و زن پیر چی اتفاق افتاد؟",
                            options = listOf(
                                "They never met again",
                                "They became best of friends",
                                "She moved away",
                                "He forgot about her"
                            ),
                            correctIndex = 1,
                            explanation = "From that day on, Ben visited the old woman every week and they became the best of friends."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b9", title = "My First Day at School", titlePersian = "اولین روز مدرسه من",
            level = Level.BEGINNER,
            text = "A girl is nervous on her first day. She makes a new friend named Lily.",
            moral = "New beginnings bring new friends.", moralPersian = "شروع‌های جدید دوستان جدید می‌آورند.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Scary Morning", titlePersian = "صبح ترسناک",
                    text = "My name is Nika. I am seven years old. Today is my first day at a new school. I woke up very early. My stomach hurt. My hands were shaking. I did not want to go. \"What if the other kids don't like me?\" I asked my mother. \"What if I get lost? What if the teacher is mean?\" My mother smiled and hugged me. \"Don't worry, Nika,\" she said. \"You are smart and kind. You will make friends. Just be yourself.\" But I was still scared. I put on my new blue dress and my shiny black shoes. My face was pale. My heart was beating very fast.",
                    textPersian = "اسم من نیکاست. هفت ساله‌ام. امروز اولین روز مدرسه جدیدم است. صبح زود بیدار شدم. دلم درد می‌کرد. دستانم می‌لرزید. نمی‌خواستم بروم. «اگر بچه‌ها دوستم نداشته باشند چی؟» از مادرم پرسیدم. مادرم لبخند زد. «نگران نباش نیکا. تو باهوش و مهربانی. دوست پیدا می‌کنی.» اما هنوز می‌ترسیدم. لباس آبی و کفش‌های براق مشکی‌ام را پوشیدم. قلبم تند می‌زد.",
                    vocabulary = listOf(
                        Word("nervous", "عصبی", "ˈnɜːrvəs"),
                        Word("scared", "ترسیده", "skerd"),
                        Word("stomach", "شکم", "ˈstʌmək"),
                        Word("breath", "نفس", "breθ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How old is Nika?",
                            questionPersian = "نیکا چند ساله است؟",
                            options = listOf("6 years", "7 years", "8 years", "9 years"),
                            correctIndex = 1,
                            explanation = "Nika is seven years old."
                        ),
                        ChapterQuizQuestion(
                            question = "Why was Nika scared?",
                            questionPersian = "چرا نیکا می‌ترسید؟",
                            options = listOf(
                                "She didn't have a dress",
                                "It was her first day at a new school",
                                "She was hungry",
                                "She missed her father"
                            ),
                            correctIndex = 1,
                            explanation = "It was her first day at a new school, and she was worried about making friends."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Nika's mother tell her?",
                            questionPersian = "مادر نیکا به او چی گفت؟",
                            options = listOf(
                                "To stay home",
                                "To be herself",
                                "To be quiet",
                                "To run fast"
                            ),
                            correctIndex = 1,
                            explanation = "Her mother said: 'You are smart and kind. You will make friends. Just be yourself.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Girl Named Lily", titlePersian = "دختری به نام لیلی",
                    text = "My mother walked me to my classroom. The teacher, Miss Sara, welcomed me with a warm smile. \"Hello, Nika! Please sit here.\" She pointed to an empty seat. I walked slowly and sat down. All the other kids were talking and laughing. I felt so alone. Then I heard a soft voice next to me. \"Hi! I'm Lily.\" I turned and saw a girl with curly brown hair and a bright smile. \"You're new, right? Don't worry, I was new last year. It's not so bad.\" I smiled a little. \"I'm Nika.\" Lily laughed. \"You'll make lots of friends. I'll help you.\" During the break, Lily showed me around the school. By lunchtime, I didn't feel alone anymore.",
                    textPersian = "مادرم مرا تا کلاسم برد. معلم، خانم سارا، با لبخندی گرم خوش‌آمد گفت. «سلام نیکا! اینجا بنشین.» آرام رفتم و نشستم. همه بچه‌ها با دوستانشان حرف می‌زدند. خیلی تنها حس می‌کردم. بعد صدای ملایمی شنیدم. «سلام! من لیلی هستم.» دختری با موهای فر قهوه‌ای. «تو جدیدی، درسته؟ نگران نباش. من پارسال جدید بودم.» کمی لبخند زدم. «من نیکا هستم.» لیلی خندید. «دوستان زیادی پیدا می‌کنی. من کمکت می‌کنم.» موقع زنگ تفریح، لیلی مدرسه را نشانم داد.",
                    vocabulary = listOf(
                        Word("welcomed", "خوش‌آمد گفت", "ˈwelkəmd"),
                        Word("curly", "فر", "ˈkɜːrli"),
                        Word("break", "زنگ تفریح", "breɪk"),
                        Word("share", "قسمت کردن", "ʃer")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What is the teacher's name?",
                            questionPersian = "اسم معلم چیه؟",
                            options = listOf("Miss Lily", "Miss Sara", "Miss Nika", "Miss Fatima"),
                            correctIndex = 1,
                            explanation = "The teacher's name is Miss Sara."
                        ),
                        ChapterQuizQuestion(
                            question = "What does Lily look like?",
                            questionPersian = "لیلی چه شکلیه؟",
                            options = listOf(
                                "Tall with blonde hair",
                                "Curly brown hair and bright smile",
                                "Short with black hair",
                                "Blue eyes and red hair"
                            ),
                            correctIndex = 1,
                            explanation = "Lily has curly brown hair and a bright smile."
                        ),
                        ChapterQuizQuestion(
                            question = "How did Lily help Nika?",
                            questionPersian = "لیلی چطور به نیکا کمک کرد؟",
                            options = listOf(
                                "She gave her food",
                                "She showed her around the school",
                                "She did her homework",
                                "She gave her a gift"
                            ),
                            correctIndex = 1,
                            explanation = "During the break, Lily showed Nika around the school."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Best First Day", titlePersian = "بهترین روز اول",
                    text = "When school ended, my mother was waiting outside. \"How was your day?\" she asked. I ran to her and hugged her. \"It was the best day ever!\" I said. \"I made a friend! Her name is Lily.\" I talked and talked all the way home. That evening, I called Lily on the phone. We talked for an hour. We promised to sit together at school every day. We promised to be best friends forever. That night, I thought about how scared I was that morning. And I realized something important. All my fears were just in my head. The world was not as scary as I thought. I smiled and closed my eyes, excited for tomorrow.",
                    textPersian = "وقتی مدرسه تمام شد، مادرم بیرون منتظر بود. «روزت چطور بود؟» پرسید. به سمتش دویدم و در آغوشش گرفتم. «بهترین روز عمرم بود! یه دوست پیدا کردم! اسمش لیلیه.» تمام راه خانه حرف زدم. آن عصر با لیلی تلفنی صحبت کردم. قول دادیم هر روز کنار هم بنشینیم. آن شب فهمیدم تمام ترس‌هایم فقط در ذهنم بودند. دنیا آنقدرها ترسناک نبود.",
                    vocabulary = listOf(
                        Word("tightly", "محکم", "ˈtaɪtli"),
                        Word("favorite", "مورد علاقه", "ˈfeɪvərɪt"),
                        Word("fear", "ترس", "fɪr"),
                        Word("excited", "هیجان‌زده", "ɪkˈsaɪtɪd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How did Nika describe her first day?",
                            questionPersian = "نیکا روز اولش رو چطور توصیف کرد؟",
                            options = listOf("Boring", "The best day ever", "Scary", "Tiring"),
                            correctIndex = 1,
                            explanation = "Nika said: 'It was the best day ever!'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Nika and Lily promise?",
                            questionPersian = "نیکا و لیلی چه قولی دادند؟",
                            options = listOf(
                                "To play every day",
                                "To sit together at school every day",
                                "To call every night",
                                "To do homework together"
                            ),
                            correctIndex = 1,
                            explanation = "They promised to sit together at school every day and be best friends forever."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Nika learn from her first day?",
                            questionPersian = "نیکا از روز اولش چی یاد گرفت؟",
                            options = listOf(
                                "School is boring",
                                "All her fears were just in her head",
                                "Teachers are strict",
                                "Friends are hard to find"
                            ),
                            correctIndex = 1,
                            explanation = "She realized all her fears were just in her head. The world was not as scary as she thought."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_b10", title = "The Red Balloon", titlePersian = "بادکنک قرمز",
            level = Level.BEGINNER,
            text = "A girl's red balloon flies away. A boy gives her his blue balloon.",
            moral = "A small gift can bring big joy.", moralPersian = "هدیه کوچک شادی بزرگ می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1530103862676-de8c9debad1d?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Red Balloon", titlePersian = "بادکنک قرمز",
                    text = "Mia was a happy little girl with big brown eyes and a big smile. Her favorite thing in the whole world was her red balloon. Her father had bought it for her at the fair last week. It was bright red and shiny, and it floated above her head on a thin white string. Mia carried it everywhere. She took it to the park. She took it to her grandmother's house. She even took it to bed. All the children in the neighborhood knew Mia and her red balloon. The red balloon made Mia feel special.",
                    textPersian = "میا دختر کوچک شادی بود. چیز مورد علاقه‌اش بادکنک قرمزش بود. پدرش هفته گذشته در نمایشگاه خریده بود. قرمز روشن و براق بود. میا همه‌جا آن را می‌برد. به پارک. به خانه مادربزرگش. حتی به رختخواب. تمام بچه‌های محله میا و بادکنک قرمزش را می‌شناختند.",
                    vocabulary = listOf(
                        Word("balloon", "بادکنک", "bəˈluːn"),
                        Word("shiny", "براق", "ˈʃaɪni"),
                        Word("float", "شناور بودن", "floʊt"),
                        Word("neighborhood", "محله", "ˈneɪbərhʊd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was Mia's favorite thing?",
                            questionPersian = "چیز مورد علاقه میا چی بود؟",
                            options = listOf("A doll", "A red balloon", "A book", "A cat"),
                            correctIndex = 1,
                            explanation = "Her favorite thing in the whole world was her red balloon."
                        ),
                        ChapterQuizQuestion(
                            question = "Who bought the balloon for Mia?",
                            questionPersian = "کی بادکنک رو برای میا خرید؟",
                            options = listOf("Her mother", "Her father", "Her grandmother", "Her friend"),
                            correctIndex = 1,
                            explanation = "Her father had bought it for her at the fair last week."
                        ),
                        ChapterQuizQuestion(
                            question = "Where did Mia take the balloon?",
                            questionPersian = "میا بادکنک رو کجاها می‌برد؟",
                            options = listOf(
                                "Only to school",
                                "Only to the park",
                                "To the park, grandmother's house, and even to bed",
                                "Nowhere"
                            ),
                            correctIndex = 2,
                            explanation = "Mia carried it everywhere — to the park, to her grandmother's house, and even to bed."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Gone with the Wind", titlePersian = "رفته با باد",
                    text = "One windy afternoon, Mia was playing in the park with her red balloon. The wind was strong. Suddenly, a big gust of wind blew through the park. The string slipped out of Mia's hand. \"No! No!\" Mia shouted. She jumped up, but it was too high. The red balloon floated up, up, up into the sky. It became smaller and smaller, until it was just a tiny red dot, and then it was gone. Mia stood in the park, looking at the empty sky. Her eyes filled with tears. She sat on the grass and cried. \"My balloon... my beautiful balloon...\" she sobbed. Other children played around her, but no one noticed the sad little girl.",
                    textPersian = "یک بعدازظهر بادی، میا با بادکنک قرمزش بازی می‌کرد. ناگهان وزش باد شدیدی از پارک گذشت. نخ از دست میا لیز خورد. «نه! نه!» میا فریاد زد. پرید، اما خیلی بالا بود. بادکنک قرمز بالا، بالا، بالا رفت. میا در پارک ایستاد و به آسمان خالی نگاه کرد. چشمانش پر از اشک شد. روی چمن نشست و گریه کرد. هیچ‌کس دختر کوچک غمگین را ندید.",
                    vocabulary = listOf(
                        Word("gust", "وزش باد", "ɡʌst"),
                        Word("slip", "لیز خوردن", "slɪp"),
                        Word("sob", "هق‌هق کردن", "sɑːb"),
                        Word("broken heart", "قلب شکسته", "")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What happened to Mia's balloon?",
                            questionPersian = "برای بادکنک میا چی اتفاق افتاد؟",
                            options = listOf(
                                "It popped",
                                "It flew away in the wind",
                                "She gave it away",
                                "It got lost"
                            ),
                            correctIndex = 1,
                            explanation = "A gust of wind blew the balloon into the sky."
                        ),
                        ChapterQuizQuestion(
                            question = "Why couldn't Mia catch the balloon?",
                            questionPersian = "چرا میا نتوانست بادکنک رو بگیره؟",
                            options = listOf(
                                "She didn't try",
                                "It was too high",
                                "Someone else caught it",
                                "She was tired"
                            ),
                            correctIndex = 1,
                            explanation = "She jumped up, but it was too high."
                        ),
                        ChapterQuizQuestion(
                            question = "How did Mia feel?",
                            questionPersian = "میا چه حسی داشت؟",
                            options = listOf("Happy", "Angry", "Sad and crying", "Tired"),
                            correctIndex = 2,
                            explanation = "Mia sat on the grass and cried. She was very sad."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Blue Surprise", titlePersian = "سورپرایز آبی",
                    text = "A boy named Sam was playing nearby. He saw Mia crying. He walked over slowly. \"Are you okay?\" he asked. Mia looked up. \"My balloon flew away. The wind took it.\" Sam felt sad for her. He looked at his own hand. He was holding a blue balloon. He thought for a moment. Then he smiled and held out the balloon. \"Here. Take mine.\" Mia looked at him in surprise. \"But it's yours.\" Sam shook his head. \"It's okay. You look sad. I want you to be happy.\" Mia's eyes lit up. She took the blue balloon. \"Thank you. You're the nicest boy I've ever met.\" Sam smiled. \"What's your name?\" \"Mia.\" \"I'm Sam. Want to play together?\" Mia nodded. From that day on, Sam and Mia were best friends.",
                    textPersian = "پسری به نام سام نزدیک آنجا بازی می‌کرد. میا را در حال گریه دید. آرام به سمتش رفت. «حالت خوبه؟» پرسید. میا نگاه کرد. «بادکنکم پرواز کرد.» سام غمگین شد. به دست خودش نگاه کرد. بادکنک آبی داشت. لحظه‌ای فکر کرد. بعد لبخند زد و بادکنک را دراز کرد. «بیا. مال من رو بگیر.» میا با تعجب نگاه کرد. سام سر تکان داد. «اشکالی نداره. تو غمگین به نظر می‌رسی. می‌خوام خوشحال باشی.» چشمان میا برق زد. بادکنک آبی را گرفت. از آن روز، سام و میا بهترین دوست بودند.",
                    vocabulary = listOf(
                        Word("surprise", "سورپرایز", "sərˈpraɪz"),
                        Word("whisper", "زمزمه کردن", "ˈwɪspər"),
                        Word("lit up", "برق زد", ""),
                        Word("best friend", "بهترین دوست", "")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who was the boy who helped Mia?",
                            questionPersian = "پسری که به میا کمک کرد کی بود؟",
                            options = listOf("Ali", "Sam", "Reza", "Tom"),
                            correctIndex = 1,
                            explanation = "A boy named Sam was playing nearby."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sam do for Mia?",
                            questionPersian = "سام برای میا چیکار کرد؟",
                            options = listOf(
                                "Bought her a new balloon",
                                "Gave her his blue balloon",
                                "Helped her find the red one",
                                "Called her parents"
                            ),
                            correctIndex = 1,
                            explanation = "Sam gave Mia his blue balloon."
                        ),
                        ChapterQuizQuestion(
                            question = "What happened between Sam and Mia?",
                            questionPersian = "بین سام و میا چی اتفاق افتاد؟",
                            options = listOf(
                                "They became best friends",
                                "They never met again",
                                "They fought",
                                "They forgot each other"
                            ),
                            correctIndex = 0,
                            explanation = "From that day on, Sam and Mia were best friends."
                        )
                    )
                )
            )
        )
    )
},

// ==================== داستان‌های بدون فصل (s_b11 تا s_b50) ====================

Story(
    id = "s_b11", title = "The Thirsty Crow", titlePersian = "کلاغ تشنه",
    level = Level.BEGINNER,
    text = "A crow is very thirsty. He looks for water everywhere. Finally, he finds a pot with a little water. But the pot is deep. The crow cannot reach the water. He has an idea. He puts small stones in the pot. The water goes up. Now the crow can drink. He is very happy.",
    moral = "Where there is a will, there is a way.", moralPersian = "خواستن توانستن است.",
    coverUrl = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=400"
),
Story(
    id = "s_b12", title = "The Hungry Fox", titlePersian = "روباه گرسنه",
    level = Level.BEGINNER,
    text = "A fox is very hungry. He sees a crow with a piece of cheese in her mouth. The fox says: Dear crow, you have a beautiful voice. Please sing for me. The crow opens her mouth to sing. The cheese falls down. The fox catches it and runs away.",
    moral = "Do not trust flatterers.", moralPersian = "به چاپلوسان اعتماد نکنید.",
    coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
),
Story(
    id = "s_b13", title = "The Ant and the Grasshopper", titlePersian = "مورچه و ملخ",
    level = Level.BEGINNER,
    text = "In summer, an ant works hard. She collects food for winter. A grasshopper sings and plays all day. When winter comes, the grasshopper has no food. The ant shares her food with him.",
    moral = "Prepare today for tomorrow.", moralPersian = "امروز برای فردا آماده شو.",
    coverUrl = "https://images.unsplash.com/photo-1557063673-0493c4f8f6c4?w=400"
),
Story(
    id = "s_b14", title = "The Lion and the Mouse", titlePersian = "شیر و موش",
    level = Level.BEGINNER,
    text = "A lion is sleeping. A little mouse runs over his nose. The lion catches the mouse. The mouse says: Please let me go. One day I will help you. Later, the lion is caught in a net. The mouse cuts the net. The lion is free.",
    moral = "Even the small can help the great.", moralPersian = "حتی کوچک‌ها می‌توانند به بزرگ‌ها کمک کنند.",
    coverUrl = "https://images.unsplash.com/photo-1546182990-dffeafbe841d?w=400"
),
Story(
    id = "s_b15", title = "The Turtle and the Rabbit", titlePersian = "لاک‌پشت و خرگوش",
    level = Level.BEGINNER,
    text = "A rabbit laughs at a slow turtle. The turtle says: Let's have a race. The rabbit runs fast, then naps. The turtle walks slowly but never stops. The turtle wins the race!",
    moral = "Slow and steady wins the race.", moralPersian = "آهسته و پیوسته برنده می‌شود.",
    coverUrl = "https://images.unsplash.com/photo-1485968579580-b6d095142e6e?w=400"
),
Story(
    id = "s_b16", title = "The Clever Fox", titlePersian = "روباه باهوش",
    level = Level.BEGINNER,
    text = "A fox is very hungry. He sees grapes on a high branch. He jumps and jumps, but cannot reach them. Finally, he gives up. He says: The grapes are probably sour anyway.",
    moral = "Do not hate what you cannot have.", moralPersian = "از آنچه نمی‌توانی داشته باشی متنفر نباش.",
    coverUrl = "https://images.unsplash.com/photo-1535581652167-3d6b98c9f7f8?w=400"
),
Story(
    id = "s_b17", title = "The Greedy Dog", titlePersian = "سگ حریص",
    level = Level.BEGINNER,
    text = "A dog has a piece of meat. He walks near a river. He sees his reflection. He thinks it is another dog with a bigger piece. He barks. His meat falls into the river. Now he has nothing.",
    moral = "Greed loses what it has.", moralPersian = "حرص آنچه را دارد از دست می‌دهد.",
    coverUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?w=400"
),
Story(
    id = "s_b18", title = "The Woodcutter and the Axe", titlePersian = "چوب‌بر و تبر",
    level = Level.BEGINNER,
    text = "A woodcutter drops his old axe in a river. A spirit appears. He shows a gold axe. No. A silver axe? No. The old axe? Yes! The spirit is happy with his honesty. He gives him all three axes.",
    moral = "Honesty brings unexpected rewards.", moralPersian = "صداقت پاداش غیرمنتظره می‌آورد.",
    coverUrl = "https://images.unsplash.com/photo-1441974231531-c6227db76b6e?w=400"
),
Story(
    id = "s_b19", title = "The Two Frogs", titlePersian = "دو قورباغه",
    level = Level.BEGINNER,
    text = "Two frogs fall into a bucket of milk. One gives up and drowns. The other keeps kicking. The milk turns into butter. He jumps on the butter and escapes. Never give up!",
    moral = "Keep trying and you will succeed.", moralPersian = "تلاش کن تا موفق شوی.",
    coverUrl = "https://images.unsplash.com/photo-1552566626-52f8b828add9?w=400"
),
Story(
    id = "s_b20", title = "The Boy Who Cried Wolf", titlePersian = "پسرک چوپان و گرگ",
    level = Level.BEGINNER,
    text = "A boy takes care of sheep. He shouts: Wolf! Wolf! The villagers run to help. No wolf. He does it again. Then a real wolf comes. The boy shouts: Wolf! But no one comes. The wolf eats the sheep.",
    moral = "No one believes a liar.", moralPersian = "هیچ‌کس دروغگو را باور نمی‌کند.",
    coverUrl = "https://images.unsplash.com/photo-1516467508483-a7212febe31a?w=400"
),
Story(
    id = "s_b21", title = "The Golden Egg", titlePersian = "تخم طلا",
    level = Level.BEGINNER,
    text = "A farmer has a hen. The hen lays one golden egg every day. The farmer becomes rich. But he is greedy. He cuts open the hen. There is no gold inside. Now he has no hen and no golden eggs.",
    moral = "Patience is better than greed.", moralPersian = "صبر بهتر از حرص است.",
    coverUrl = "https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?w=400"
),
Story(
    id = "s_b22", title = "The Bear and the Travelers", titlePersian = "خرس و دو مسافر",
    level = Level.BEGINNER,
    text = "Two men are walking in the forest. A bear appears. One climbs a tree. The other pretends to be dead. The bear sniffs him and leaves. The other says: Don't trust friends who leave you.",
    moral = "A true friend stays with you.", moralPersian = "دوست واقعی کنارت می‌ماند.",
    coverUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=400"
),
Story(
    id = "s_b23", title = "The Milkmaid", titlePersian = "دختر شیرفروش",
    level = Level.BEGINNER,
    text = "A milkmaid carries a pot of milk on her head. She dreams of selling the milk and buying a new dress. She shakes her head with joy. The pot falls and the milk spills. All her dreams are gone.",
    moral = "Do not count your chickens before they hatch.", moralPersian = "جوجه را آخر پاییز می‌شمارند.",
    coverUrl = "https://images.unsplash.com/photo-1567527259232-3a7fdb5f2b1e?w=400"
),
Story(
    id = "s_b24", title = "The Dog and His Shadow", titlePersian = "سگ و سایه‌اش",
    level = Level.BEGINNER,
    text = "A dog carries a bone in his mouth. He crosses a bridge. He sees his shadow in the water. He thinks it is another dog with a bigger bone. He opens his mouth to bark. The bone falls into the water.",
    moral = "Do not lose what you have by wanting more.", moralPersian = "با خواستن بیشتر، آنچه داری را از دست نده.",
    coverUrl = "https://images.unsplash.com/photo-1587300003388-59208cc962cb?w=400"
),
Story(
    id = "s_b25", title = "The Farmer and His Sons", titlePersian = "کشاورز و پسرانش",
    level = Level.BEGINNER,
    text = "An old farmer has three lazy sons. Before he dies, he says: There is a treasure in the field. Dig for it. The sons dig and dig. They find no treasure. But they plant wheat and have a big harvest.",
    moral = "Hard work is the real treasure.", moralPersian = "کار سخت گنج واقعی است.",
    coverUrl = "https://images.unsplash.com/photo-1500937386664-56d1dfef3854?w=400"
),
Story(
    id = "s_b26", title = "The Sun and the Wind", titlePersian = "خورشید و باد",
    level = Level.BEGINNER,
    text = "The sun and the wind argue who is stronger. They see a man with a coat. The wind blows hard. The man holds his coat tighter. The sun shines warm. The man takes off his coat. The sun wins.",
    moral = "Gentleness wins over force.", moralPersian = "ملایمت بر زور پیروز می‌شود.",
    coverUrl = "https://images.unsplash.com/photo-1504608524841-42fe6f032b4b?w=400"
),
Story(
    id = "s_b27", title = "The City Mouse and Country Mouse", titlePersian = "موش شهری و موش روستایی",
    level = Level.BEGINNER,
    text = "A city mouse visits his cousin. He says: Come to the city. The food is wonderful. But then a cat comes. They run and hide. The country mouse says: I prefer my simple food and peace.",
    moral = "Simple peace is better than rich fear.", moralPersian = "آرامش ساده بهتر از ترس ثروتمند است.",
    coverUrl = "https://images.unsplash.com/photo-1425082661705-1834bfd09dca?w=400"
),
Story(
    id = "s_b28", title = "The Ugly Duckling", titlePersian = "جوجه اردک زشت",
    level = Level.BEGINNER,
    text = "A duckling is born different. The others laugh at him. He leaves the farm. Winter comes. Spring comes. He looks in the water. He is a beautiful white swan. The other swans welcome him.",
    moral = "True beauty comes from within.", moralPersian = "زیبایی واقعی از درون است.",
    coverUrl = "https://images.unsplash.com/photo-1508766206392-8bd5cf550d1c?w=400"
),
Story(
    id = "s_b29", title = "The Three Little Pigs", titlePersian = "سه خوک کوچک",
    level = Level.BEGINNER,
    text = "Three pigs build houses. The first with straw. The second with wood. The third with bricks. A wolf blows down the straw and wood houses. But he cannot blow down the brick house.",
    moral = "Do work carefully and you will be safe.", moralPersian = "کار را محکم انجام بده تا در امان باشی.",
    coverUrl = "https://images.unsplash.com/photo-1516467508483-a7212febe31a?w=400"
),
Story(
    id = "s_b30", title = "The Little Red Hen", titlePersian = "مرغ قرمز کوچک",
    level = Level.BEGINNER,
    text = "A hen finds wheat. She asks her friends to help. Not I, says the cat. Not I, says the dog. She does everything alone. When the bread is ready, they all want to eat it. No, says the hen. I will eat it alone.",
    moral = "Those who do not work do not eat.", moralPersian = "هرکه کار نکند، نخورد.",
    coverUrl = "https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?w=400"
),

Story(
    id = "s_b31", title = "Goldilocks", titlePersian = "گلدیلکس",
    level = Level.BEGINNER,
    text = "A girl named Goldilocks finds a house. She enters and tastes three bowls of porridge. She sleeps in a bed. The bears come home. She wakes up and runs away!",
    moral = "Do not enter a stranger's home.", moralPersian = "به خانه غریبه وارد نشو.",
    coverUrl = "https://images.unsplash.com/photo-1481627834876-b7833e8f5570?w=400"
),
Story(
    id = "s_b32", title = "The Gingerbread Man", titlePersian = "آدم شیرینی‌زنجبیلی",
    level = Level.BEGINNER,
    text = "An old woman makes a gingerbread man. He jumps out and runs away. He runs past everyone. Then he meets a fox. The fox offers to help him cross a river. The gingerbread man trusts him. The fox eats him!",
    moral = "Be careful who you trust.", moralPersian = "مراقب باش به چه کسی اعتماد می‌کنی.",
    coverUrl = "https://images.unsplash.com/photo-1568051243851-f9b136146e97?w=400"
),
Story(
    id = "s_b33", title = "The Enormous Turnip", titlePersian = "شلغم غول‌پیکر",
    level = Level.BEGINNER,
    text = "An old man plants a turnip. It grows very big. He cannot pull it out. He calls his wife. Then the girl. Then the dog. Then the cat. Then the mouse. Together, they pull out the turnip!",
    moral = "Teamwork makes big tasks easy.", moralPersian = "کار گروهی کارهای بزرگ را آسان می‌کند.",
    coverUrl = "https://images.unsplash.com/photo-1592394533824-9440e5d68530?w=400"
),
Story(
    id = "s_b34", title = "Stone Soup", titlePersian = "سوپ سنگی",
    level = Level.BEGINNER,
    text = "A hungry traveler puts a stone in a pot of water. He says: I am making stone soup, but it needs salt. Villagers bring salt, carrots, potatoes, onions. Soon there is a delicious soup. Everyone shares it.",
    moral = "Sharing makes everything better.", moralPersian = "بخشیدن همه چیز را بهتر می‌کند.",
    coverUrl = "https://images.unsplash.com/photo-1547592180-85f173990554?w=400"
),
Story(
    id = "s_b35", title = "The Princess and the Pea", titlePersian = "شاهزاده و نخود",
    level = Level.BEGINNER,
    text = "A prince wants to marry a real princess. The queen puts a pea under twenty mattresses. In the morning, the girl says she could not sleep. Now they know she is a real princess.",
    moral = "True nature shows itself.", moralPersian = "طبیعت واقعی خود را نشان می‌دهد.",
    coverUrl = "https://images.unsplash.com/photo-1522771739844-6a9f6d5f14af?w=400"
),
Story(
    id = "s_b36", title = "The Elves and the Shoemaker", titlePersian = "جن‌ها و کفاش",
    level = Level.BEGINNER,
    text = "A poor shoemaker cuts leather and goes to bed. In the morning, the shoes are made. Every night, the shoes are made by little elves. He makes clothes for them. They are happy and leave.",
    moral = "Kindness is rewarded.", moralPersian = "مهربانی پاداش داده می‌شود.",
    coverUrl = "https://images.unsplash.com/photo-1449505278894-297fdb3edbc1?w=400"
),
Story(
    id = "s_b37", title = "The Little Red Riding Hood", titlePersian = "شنل قرمزی",
    level = Level.BEGINNER,
    text = "A girl visits her grandmother. She meets a wolf. The wolf goes first and eats the grandmother. Then he eats the girl. A woodcutter comes and saves them.",
    moral = "Always listen to good advice.", moralPersian = "همیشه به نصیحت خوب گوش کن.",
    coverUrl = "https://images.unsplash.com/photo-1509248961158-e54f6934749c?w=400"
),
Story(
    id = "s_b38", title = "The Lion and the Slave", titlePersian = "شیر و برده",
    level = Level.BEGINNER,
    text = "A slave hides in a cave. A lion is there with a thorn in his paw. The slave takes it out. The lion becomes his friend. Later, the slave is thrown to the lions. The lion remembers him. The king sets him free.",
    moral = "Kindness is never forgotten.", moralPersian = "مهربانی هرگز فراموش نمی‌شود.",
    coverUrl = "https://images.unsplash.com/photo-1546182990-dffeafbe841d?w=400"
),
Story(
    id = "s_b39", title = "The Wolf and the Lamb", titlePersian = "گرگ و بره",
    level = Level.BEGINNER,
    text = "A wolf sees a lamb drinking from a river. He makes excuses to eat him. Some people just want an excuse.",
    moral = "The wicked find excuses for cruelty.", moralPersian = "بدکاران برای ظلم بهانه می‌سازند.",
    coverUrl = "https://images.unsplash.com/photo-1535930749574-1399327ce78f?w=400"
),
Story(
    id = "s_b40", title = "The Fox and the Crow", titlePersian = "روباه و کلاغ",
    level = Level.BEGINNER,
    text = "A crow sits with a piece of cheese. A fox wants the cheese. He says: Your voice must be beautiful. Please sing. The crow opens her mouth. The cheese falls down. The fox eats it.",
    moral = "Beware of flatterers.", moralPersian = "از چاپلوسان بپرهیز.",
    coverUrl = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=400"
),
Story(
    id = "s_b41", title = "The Hare and the Tortoise", titlePersian = "خرگوش و لاک‌پشت",
    level = Level.BEGINNER,
    text = "A hare laughs at a slow tortoise. The tortoise says: Let's race. The hare runs fast and naps. The tortoise walks slowly but never stops. The tortoise wins!",
    moral = "Slow and steady wins the race.", moralPersian = "آهسته و پیوسته برنده می‌شود.",
    coverUrl = "https://images.unsplash.com/photo-1589656966895-2f33e7653819?w=400"
),
Story(
    id = "s_b42", title = "The Blue Jackal", titlePersian = "شغال آبی",
    level = Level.BEGINNER,
    text = "A jackal falls into blue dye and becomes blue. Animals think he is a new king. One day he hears other jackals howling. He howls back. The animals know the truth.",
    moral = "Do not pretend to be what you are not.", moralPersian = "خودت را چیزی که نیستی نشان نده.",
    coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
),
Story(
    id = "s_b43", title = "The Monkey and the Crocodile", titlePersian = "میمون و کروکودیل",
    level = Level.BEGINNER,
    text = "A crocodile wants to eat a monkey's heart. The monkey says: I left my heart in the tree. Let me get it. He climbs and stays there.",
    moral = "Quick thinking saves the day.", moralPersian = "تفکر سریع روز را نجات می‌دهد.",
    coverUrl = "https://images.unsplash.com/photo-1540573133985-87b6da6d54a9?w=400"
),
Story(
    id = "s_b44", title = "The Elephant and the Sparrow", titlePersian = "فیل و گنجشک",
    level = Level.BEGINNER,
    text = "An elephant breaks a sparrow's nest. The sparrow asks other birds for help. They fly into the elephant's eyes. He falls into a ditch.",
    moral = "Even the smallest can be dangerous.", moralPersian = "حتی کوچک‌ترین‌ها می‌توانند خطرناک باشند.",
    coverUrl = "https://images.unsplash.com/photo-1557050543-4d5f4e07ef46?w=400"
),
Story(
    id = "s_b45", title = "The Brahmin and the Goat", titlePersian = "برهمن و بز",
    level = Level.BEGINNER,
    text = "A brahmin carries a goat. Three thieves say it is a dog. The brahmin believes them and leaves the goat. The thieves take it.",
    moral = "Repeated lies can fool anyone.", moralPersian = "دروغ‌های تکرارشده هرکسی را فریب می‌دهند.",
    coverUrl = "https://images.unsplash.com/photo-1535930749574-1399327ce78f?w=400"
),
Story(
    id = "s_b46", title = "The Thirsty Cow", titlePersian = "گاو تشنه",
    level = Level.BEGINNER,
    text = "A cow cannot reach a small pool of water. She uses her horns to dig a path. Water comes to her. She drinks.",
    moral = "Think and you will find a way.", moralPersian = "فکر کن تا راه پیدا کنی.",
    coverUrl = "https://images.unsplash.com/photo-1500595046743-cd271d694d30?w=400"
),
Story(
    id = "s_b47", title = "The Fox and the Stork", titlePersian = "روباه و لک‌لک",
    level = Level.BEGINNER,
    text = "A fox serves soup in a flat plate to a stork. The stork cannot eat. She serves soup in a long jar. Now the fox cannot eat.",
    moral = "Treat others as you want to be treated.", moralPersian = "با دیگران همان‌طور رفتار کن که می‌خواهی با تو رفتار کنند.",
    coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
),
Story(
    id = "s_b48", title = "The Dog in the Manger", titlePersian = "سگ در آخور",
    level = Level.BEGINNER,
    text = "A dog lies in a manger full of hay. An ox comes to eat. The dog barks and growls. The ox says: You cannot eat hay. Why do you stop me?",
    moral = "Do not block others out of spite.", moralPersian = "از روی کینه جلوی دیگران را نگیر.",
    coverUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?w=400"
),
Story(
    id = "s_b49", title = "The Bird and the Bat", titlePersian = "پرنده و خفاش",
    level = Level.BEGINNER,
    text = "A bird flies in the day. The bat flies at night. They never meet but leave messages for each other. They are still friends.",
    moral = "True friendship has no boundaries.", moralPersian = "دوستی واقعی مرز ندارد.",
    coverUrl = "https://images.unsplash.com/photo-1444464666168-49d633b86797?w=400"
),
Story(
    id = "s_b50", title = "The Happy Farmer", titlePersian = "کشاورز خوشحال",
    level = Level.BEGINNER,
    text = "A farmer has a small field. He has enough food. He is happy. His neighbor has a big field but always wants more. He is not happy.",
    moral = "Happiness comes from contentment.", moralPersian = "شادی از قناعت می‌آید.",
    coverUrl = "https://images.unsplash.com/photo-1500937386664-56d1dfef3854?w=400"
)