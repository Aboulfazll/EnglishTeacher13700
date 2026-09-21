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
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Happy Reunion", titlePersian = "دیدار شاد",
                    text = "The next morning, Sara woke up very early. She decided she would look everywhere until she found Mimi. She asked her neighbors, but no one had seen the little white cat. Sara walked and walked, calling Mimi's name. Finally, tired and sad, she sat under a big oak tree at the edge of the park. Suddenly, she heard a soft sound. \"Meow... meow...\" Sara looked up. There, sleeping peacefully under the tree, was Mimi! She had fallen asleep while chasing the butterfly and gotten lost. Sara picked her up and hugged her tightly. Mimi purred happily. Sara ran home with Mimi in her arms, laughing and crying at the same time. Her mother was so happy to see them both. That night, Sara promised herself: \"I will never give up hope, no matter what.\"",
                    textPersian = "صبح روز بعد، سارا خیلی زود بیدار شد. تصمیم گرفت همه‌جا را بگردد تا میمی را پیدا کند. از همسایه‌ها پرسید، اما هیچ‌کس گربه سفید کوچک را ندیده بود. سارا راه رفت و راه رفت. در نهایت، خسته و غمگین، زیر یک درخت بلوط بزرگ نشست. ناگهان صدای ملایمی شنید. «میو... میو...» سارا به بالا نگاه کرد. آنجا، زیر درخت خوابیده بود، میمی! او هنگام دنبال کردن پروانه به خواب رفته و گم شده بود. سارا او را بغل کرد و محکم به سینه چسباند. میمی با خوشحالی خرخر کرد. سارا با میمی در آغوشش به خانه دوید، همزمان می‌خندید و گریه می‌کرد. آن شب، سارا به خودش قول داد: «هرگز امیدم را از دست نمی‌دهم.»",
                    vocabulary = listOf(
                        Word("neighbor", "همسایه", "ˈneɪbər"),
                        Word("oak", "بلوط", "oʊk"),
                        Word("peacefully", "در آرامش", "ˈpiːsfəli"),
                        Word("purr", "خرخر کردن", "pɜːr"),
                        Word("promise", "قول دادن", "ˈprɒmɪs")
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
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Rich Man", titlePersian = "مرد ثروتمند",
                    text = "One cold winter morning, a rich man named Mr. Karimi came to the bakery. He was wearing a fine coat and shiny shoes. He had heard about the kind baker who gave free bread to children. Mr. Karimi was surprised. \"Why do you give free bread?\" he asked. \"You will lose money.\" Mr. Hassan smiled and said, \"Because I love to help. When I see a hungry child smile, I feel rich. More rich than any money could make me.\" Mr. Karimi was silent for a moment. He had never met someone like Mr. Hassan.",
                    textPersian = "یک صبح سرد زمستانی، مرد ثروتمندی به نام آقای کریمی به نانوایی آمد. او کت خوب و کفش‌های براق پوشیده بود. «چرا نان مجانی می‌دی؟» پرسید. «پول از دست می‌دی.» آقای حسن لبخند زد و گفت: «چون دوست دارم کمک کنم. وقتی بچه‌ی گرسنه‌ای رو می‌بینم که لبخند می‌زنه، احساس ثروت می‌کنم.» آقای کریمی لحظه‌ای ساکت شد.",
                    vocabulary = listOf(
                        Word("rich", "ثروتمند", "rɪtʃ"),
                        Word("coat", "کت", "koʊt"),
                        Word("surprised", "شگفت‌زده", "sərˈpraɪzd"),
                        Word("hungry", "گرسنه", "ˈhʌŋɡri")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Reward of Kindness", titlePersian = "پاداش مهربانی",
                    text = "The next day, Mr. Karimi returned to the bakery with a big bag of gold coins. \"Mr. Hassan,\" he said, \"your kindness has changed my heart. Please take this money. Use it to help more people.\" Mr. Hassan was surprised. He did not want to take the money, but Mr. Karimi insisted. So Mr. Hassan used the money to buy flour, sugar, and butter. He baked even more bread and gave it to all the poor families. The bakery became famous. His story was told for generations — a story of a simple baker whose kindness changed an entire town.",
                    textPersian = "روز بعد، آقای کریمی با یک کیسه بزرگ سکه طلا برگشت. «مهربانی‌ات قلب منو تغییر داد. لطفاً این پول رو بگیر.» آقای حسن تعجب کرد، اما آقای کریمی اصرار کرد. آقای حسن با آن پول آرد، شکر و کره خرید. نان بیشتری پخت و به همه‌ی خانواده‌های فقیر داد. نانوایی معروف شد. داستانش برای نسل‌ها گفته شد — داستان یک نانوا‌ی ساده که مهربانی‌اش یک شهر را تغییر داد.",
                    vocabulary = listOf(
                        Word("amazing", "شگفت‌انگیز", "əˈmeɪzɪŋ"),
                        Word("gold", "طلا", "ɡoʊld"),
                        Word("insist", "اصرار کردن", "ɪnˈsɪst"),
                        Word("famous", "معروف", "ˈfeɪməs"),
                        Word("generation", "نسل", "ˌdʒenəˈreɪʃn")
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
                    textPersian = "در دهکده‌ای کوچک نزدیک کوه‌ها، سه دوست صمیمی زندگی می‌کردند. تام قدبلند و قوی بود. سام باهوش و بامزه بود. مکس آرام اما مهربان بود. هرچند خیلی متفاوت بودند، از هم جدا نمی‌شدند. هر روز با هم به مدرسه می‌رفتند، بعدازظهر فوتبال بازی می‌کردند. هر وقت یکی غمگین می‌شد، دو نفر دیگر دلش را شاد می‌کردند. تمام دهکده دوستی‌شان را می‌دانستند.",
                    vocabulary = listOf(
                        Word("village", "دهکده", "ˈvɪlɪdʒ"),
                        Word("strong", "قوی", "strɔːŋ"),
                        Word("inseparable", "جدانشدنی", "ɪnˈsepərəbl"),
                        Word("cheer up", "شاد کردن", "tʃɪr ʌp")
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
                    )
                ),
                StoryChapter(
                    number = 3, title = "Stronger Than Ever", titlePersian = "قوی‌تر از همیشه",
                    text = "The next day, the sun rose again. Tom, Sam, and Max sat together on the grass. \"You know what?\" said Sam. \"If we hadn't helped each other, our houses would still be broken.\" Tom nodded. \"That's what friends are for.\" Max said softly, \"True friends are those who show up when you need them most.\" From that day on, the people of the village told the story of the three friends who proved that together, nothing is impossible. Their friendship lasted a lifetime.",
                    textPersian = "روز بعد، خورشید دوباره طلوع کرد. سه دوست روی چمن نشستند. «اگه به هم کمک نمی‌کردیم، خانه‌هامون هنوز خراب بود،» سام گفت. تام سر تکان داد. «این برای چیه که دوست داریم.» مکس آرام گفت: «دوست‌های واقعی اون‌هایی هستن که وقتی بیشترین نیاز رو داری، سر می‌رسن.» از آن روز، مردم دهکده داستان سه دوست را تعریف می‌کردند که ثابت کردند با هم هیچ چیز غیرممکن نیست.",
                    vocabulary = listOf(
                        Word("silence", "سکوت", "ˈsaɪləns"),
                        Word("prove", "ثابت کردن", "pruːv"),
                        Word("impossible", "غیرممکن", "ɪmˈpɒsəbl"),
                        Word("lifetime", "یک عمر", "ˈlaɪftaɪm")
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
                    textPersian = "روزی روزگاری، کشاورز فقیری به نام رضا زندگی می‌کرد. رضا باغ کوچکی پشت خانه گلی‌اش داشت. هر بهار با امید زیاد دانه می‌کاشت. هر صبح و عصر آب می‌داد. اما هر سال چیزی رشد نمی‌کرد. خاک خشک بود. پرنده‌ها دانه‌ها را می‌خوردند. همسایه‌ها به او می‌خندیدند. اما رضا هرگز تسلیم نشد. باور داشت روزی باغش شکوفا خواهد شد.",
                    vocabulary = listOf(
                        Word("farmer", "کشاورز", "ˈfɑːrmər"),
                        Word("seed", "دانه", "siːd"),
                        Word("neighbor", "همسایه", "ˈneɪbər"),
                        Word("bloom", "شکوفا شدن", "bluːm")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Fairy's Promise", titlePersian = "قول پری",
                    text = "One quiet night, when the moon was full, Reza was sitting in his garden, feeling very sad. Suddenly, a soft light appeared. A beautiful fairy with silver wings stood before him. \"Do not be afraid, Reza,\" she said. \"I have watched you for many years. You work so hard and never give up. I will help you.\" Reza's eyes filled with tears of joy. The fairy continued, \"But you must promise me one thing. When your garden grows, you must share your food with everyone who is hungry.\" Reza nodded. \"I promise! I promise with all my heart!\" The fairy touched the ground with her wand, and a golden light covered the garden.",
                    textPersian = "یک شب آرام، وقتی ماه کامل بود، رضا در باغش نشسته بود. ناگهان نور ملایمی ظاهر شد. پری زیبایی با بال‌های نقره‌ای ایستاد. «نترس رضا،» گفت. «سال‌هاست تو را تماشا می‌کنم. سخت کار می‌کنی و تسلیم نمی‌شوی. به تو کمک خواهم کرد.» چشمان رضا پر از اشک شد. پری ادامه داد: «اما باید قول بدهی وقتی باغت رشد کرد، غذا را با همه قسمت کنی.» رضا سر تکان داد. «قول می‌دهم!» پری با عصایش زمین را لمس کرد و نور طلایی باغ را پوشاند.",
                    vocabulary = listOf(
                        Word("fairy", "پری", "ˈferi"),
                        Word("wing", "بال", "wɪŋ"),
                        Word("promise", "قول", "ˈprɑːmɪs"),
                        Word("wand", "عصای جادویی", "wɑːnd")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Garden Full of Joy", titlePersian = "باغی پر از شادی",
                    text = "The next morning, Reza woke up before sunrise. He ran to his garden. What he saw made him cry with happiness. Beautiful tomatoes, cucumbers, carrots, and melons were growing everywhere! Reza fell to his knees and thanked God. Then he remembered his promise. He ran to the village with a big basket of vegetables. He gave food to the old widow, to the hungry children, and even to the neighbors who had laughed at him. Everyone was amazed. The village became famous for its kindness, and Reza became the happiest man. Because he learned that true happiness comes not from having, but from giving.",
                    textPersian = "صبح روز بعد، رضا قبل از طلوع بیدار شد. به باغش دوید. گوجه‌فرنگی، خیار، هویج و خربزه همه‌جا رشد کرده بودند! رضا زانو زد و خدا را شکر کرد. بعد قولش را یادش آمد. با سبد بزرگی به دهکده دوید. به بیوه‌ی پیر، به بچه‌های گرسنه و حتی به همسایه‌هایی که به او خندیده بودند غذا داد. دهکده معروف شد و رضا شادترین مرد. چون یاد گرفت که شادی واقعی از داشتن نیست، از بخشیدن است.",
                    vocabulary = listOf(
                        Word("sunrise", "طلوع", "ˈsʌnraɪz"),
                        Word("vegetable", "سبزیجات", "ˈvedʒtəbl"),
                        Word("widow", "بیوه", "ˈwɪdoʊ"),
                        Word("giving", "بخشیدن", "ˈɡɪvɪŋ")
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
                    textPersian = "علی پسر ده ساله‌ای بود. هر روز بعد از مدرسه از خیابان بازار به خانه برمی‌گشت. یک بعدازظهر بارانی، روی زمین خیس کیف چرم مشکی دید. اطراف را نگاه کرد. هیچ‌کس نگاه نمی‌کرد. با دقت برداشت. کیف سنگین بود. بازش کرد و باور کرد. ده‌ها اسکناس داخلش بود. قلبش تند زد. با این پول می‌توانست کفش نو، کتاب، حتی دوچرخه بخرد! اما بعد حرف مادرش را یادش آمد: «همیشه کار درست را انجام بده، حتی وقتی هیچ‌کس نمی‌بیند.»",
                    vocabulary = listOf(
                        Word("wallet", "کیف پول", "ˈwɑːlɪt"),
                        Word("leather", "چرم", "ˈleðər"),
                        Word("bill", "اسکناس", "bɪl"),
                        Word("bicycle", "دوچرخه", "ˈbaɪsɪkl")
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
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Reward of Truth", titlePersian = "پاداش حقیقت",
                    text = "An hour later, Mr. Ahmadi rushed into the police station. \"My wallet!\" he cried. When he opened it, he started to cry. \"Everything is here. My whole month's salary. I was going to pay my daughter's hospital bill today.\" He walked to Ali and hugged the boy tightly. \"Thank you, my son. You are an honest boy.\" Mr. Ahmadi took out some money, but Ali shook his head. \"I only did what is right,\" he said. That night, Ali walked home slowly. He had no money, no new shoes. But his heart was full. When he told his mother, she hugged him and cried tears of pride.",
                    textPersian = "یک ساعت بعد، آقای احمدی با عجله وارد کلانتری شد. «کیفم!» گریه کرد. وقتی بازش کرد، شروع به گریه کرد. «همه چیز اینجاست. تمام حقوق یک ماهم. امروز می‌خواستم صورتحساب بیمارستان دخترم رو بدم.» به سمت علی رفت و او را در آغوش گرفت. «ممنون پسرم. تو پسر راستگویی هستی.» خواست پول بدهد، اما علی سر تکان داد. «من فقط کار درست را انجام دادم.» آن شب، علی آرام به خانه رفت. پولی نداشت. اما قلبش پر بود. مادرش از افتخار گریه کرد.",
                    vocabulary = listOf(
                        Word("rush", "با عجله رفتن", "rʌʃ"),
                        Word("salary", "حقوق", "ˈsæləri"),
                        Word("hug", "در آغوش گرفتن", "hʌɡ"),
                        Word("pride", "افتخار", "praɪd")
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
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Night of Fire", titlePersian = "شب آتش",
                    text = "It was a cold winter night. At 2 AM, Rex suddenly woke up. He smelled something strange — something burning. He walked to the kitchen. Smoke was coming from under the door! The stove had been left on, and something had caught fire. Rex ran to the children's room first. He barked loudly. \"Woof! Woof!\" The children woke up, terrified. Then Rex ran to the parents' room and barked even louder. \"Fire! Fire!\" Mr. Karimi shouted. In seconds, the whole family was awake. The house was filling with smoke. It was hard to breathe. They ran to the front door, but the fire was blocking the way!",
                    textPersian = "شب سرد زمستانی بود. ساعت دو بامداد، رکس ناگهان بیدار شد. بوی عجیبی حس کرد. به آشپزخانه رفت. دود از زیر در می‌آمد! اجاق روشن مانده بود. اول به اتاق بچه‌ها دوید. بلند پارس کرد. بچه‌ها وحشت‌زده بیدار شدند. بعد به اتاق والدین دوید. «آتش!» آقای کریمی فریاد زد. خانه داشت پر از دود می‌شد. نفس کشیدن سخت بود. به سمت در دویدند، اما آتش راه را بسته بود!",
                    vocabulary = listOf(
                        Word("smoke", "دود", "smoʊk"),
                        Word("stove", "اجاق", "stoʊv"),
                        Word("terrified", "وحشت‌زده", "ˈterɪfaɪd"),
                        Word("breathe", "نفس کشیدن", "briːð")
                    )
                ),
                StoryChapter(
                    number = 3, title = "Rex Saves the Day", titlePersian = "رکس روز را نجات می‌دهد",
                    text = "Mr. Karimi knew they could not use the front door. \"The back door!\" he shouted. But the smoke was so thick that no one could see. Rex, however, knew the house by heart. He barked and led the family through the dark hallway. He stopped at the back door and scratched at it. Mr. Karimi opened it and fresh air rushed in. The family escaped. The firefighters arrived and put out the fire. \"That dog saved your lives,\" the fire chief said. From that day on, Rex was known as \"The Brave Dog.\" He was given a golden medal and lived with the family for many happy years.",
                    textPersian = "آقای کریمی می‌دانست نمی‌توانند از در اصلی استفاده کنند. «در پشتی!» فریاد زد. اما دود غلیظ بود. رکس اما خانه را از بر بود. پارس کرد و خانواده را از راهروی تاریک هدایت کرد. کنار در پشتی ایستاد. آقای کریمی بازش کرد و هوای تازه وارد شد. خانواده فرار کردند. آتش‌نشانان آمدند و آتش را خاموش کردند. «آن سگ جان شما را نجات داد،» رئیس آتش‌نشانی گفت. از آن روز، رکس به «سگ شجاع» معروف شد. مدال طلا گرفت.",
                    vocabulary = listOf(
                        Word("hallway", "راهرو", "ˈhɔːlweɪ"),
                        Word("scratch", "خراشیدن", "skrætʃ"),
                        Word("escape", "فرار کردن", "ɪˈskeɪp"),
                        Word("medal", "مدال", "ˈmedl")
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
                    textPersian = "بالای یک درخت بلوط قدیمی، لانه کوچکی بود. پرنده کوچک زردی به نام چیک. چیک کوچکترین پرنده درخت بود. تازه پرواز یاد گرفته بود. یک صبح بادی، باد شدیدی او را پایین انداخت. بال کوچکش خیلی درد می‌کرد. سعی کرد دوباره پرواز کند، اما نتوانست. چیک شروع به جیک‌جیک آرام کرد، ترسیده و تنها.",
                    vocabulary = listOf(
                        Word("nest", "لانه", "nest"),
                        Word("branch", "شاخه", "bræntʃ"),
                        Word("gust", "وزش باد", "ɡʌst"),
                        Word("shiver", "لرزیدن", "ˈʃɪvər")
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Boy's Kindness", titlePersian = "مهربانی یک پسر",
                    text = "That afternoon, a boy named Omid was walking home from school. As he passed by the oak tree, he heard a soft sound. \"Cheep... cheep...\" Omid stopped. There, in the grass, was the little yellow bird. Omid knelt down. \"Oh, you poor thing,\" he whispered. \"Your wing is hurt.\" He gently picked up Cheep and held her in his warm hands. \"Don't be scared,\" he said. \"I'll take care of you.\" Omid carried Cheep home. His mother helped him make a small bed out of a shoebox. They gave Cheep water and small pieces of bread. Every day, Omid cleaned her wing. Slowly, the little bird began to trust the boy.",
                    textPersian = "آن بعدازظهر، پسری به نام امید از مدرسه برمی‌گشت. وقتی از کنار درخت گذشت، صدای ملایمی شنید. «جیک... جیک...» امید ایستاد. پرنده زرد کوچک در چمن بود. زانو زد. «بیچاره،» زمزمه کرد. «بالت آسیب دیده.» به آرامی چیک را برداشت. «نترس. من ازت مراقبت می‌کنم.» چیک را به خانه برد. مادرش کمک کرد تخت کوچکی درست کنند. هر روز بال او را تمیز می‌کرد. به آرامی، پرنده کوچک شروع به اعتماد کرد.",
                    vocabulary = listOf(
                        Word("kneel", "زانو زدن", "niːl"),
                        Word("whisper", "زمزمه کردن", "ˈwɪspər"),
                        Word("wrap", "پیچیدن", "ræp"),
                        Word("trust", "اعتماد کردن", "trʌst")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Friend Forever", titlePersian = "دوستی برای همیشه",
                    text = "After one week, Cheep's wing was healed. She could flap both wings now. Omid knew it was time to let her go. One sunny morning, he took Cheep to the garden. He opened his hands and said softly, \"Go, little friend. You're free now.\" Cheep looked at him. Then she flew up into the sky. Omid watched with tears in his eyes. But the next morning, he heard a familiar sound outside his window. \"Cheep! Cheep!\" It was Cheep! She was sitting on the windowsill with a small flower in her beak. Every morning after that, Cheep came to visit Omid. When you are kind to someone, they never forget you.",
                    textPersian = "بعد از یک هفته، بال چیک بهبود یافته بود. امید می‌دانست وقت رفتن است. یک صبح آفتابی، چیک را به باغ برد. دستانش را باز کرد و آرام گفت: «برو دوست کوچک. حالا آزادی.» چیک لحظه‌ای نگاه کرد. بعد در آسمان پرواز کرد. امید با چشمان پر از اشک تماشا کرد. اما صبح روز بعد، صدای آشنایی شنید. «جیک! جیک!» چیک بود! روی طاقچه با یک گل کوچک. هر صبح بعد از آن، چیک به دیدن امید می‌آمد. وقتی با کسی مهربان باشی، او هرگز تو را فراموش نمی‌کند.",
                    vocabulary = listOf(
                        Word("heal", "شفا یافتن", "hiːl"),
                        Word("flap", "بال زدن", "flæp"),
                        Word("windowsill", "طاقچه", "ˈwɪndoʊsɪl"),
                        Word("forget", "فراموش کردن", "fərˈɡet")
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
                    textPersian = "بعدازظهر خاکستری و دلگیری بود. بن از مدرسه به خانه برمی‌گشت که آسمان ناگهان تیره شد. باران شدید شروع به باریدن کرد. بن چتری نداشت. کاپشنش را روی سرش کشید و شروع به دویدن کرد. اما باران خیلی شدید بود. آب از صورتش، کفش‌هایش و لباس‌هایش می‌ریخت. زیر درخت کوچکی ایستاد، لرزان و خیس. بقیه مردم با چتر از کنارش رد می‌شدند و نگاهش نمی‌کردند.",
                    vocabulary = listOf(
                        Word("gloomy", "دلگیر", "ˈɡluːmi"),
                        Word("heavy rain", "باران شدید", "ˈhevi reɪn"),
                        Word("soaked", "خیس", "soʊkt"),
                        Word("hurry", "عجله کردن", "ˈhɜːri")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Old Woman's Gift", titlePersian = "هدیه‌ی زن پیر",
                    text = "Just as Ben was about to give up, he heard a soft voice. \"Young man!\" He turned around. An old woman was standing nearby, holding an umbrella. She had gray hair and a kind face. She smiled at Ben and walked over to him slowly. \"You are completely wet, my child,\" she said. \"Here, take my umbrella.\" Ben could not believe his ears. \"But... but what about you?\" he asked. The old woman laughed softly. \"Don't worry about me. I live right there.\" She pointed to a small house across the street. \"I only have a few steps to go. You have a long way home.\" Ben hesitated. Then he took the umbrella. \"Thank you so much,\" he said.",
                    textPersian = "همین که بن می‌خواست تسلیم شود، صدای ملایمی شنید. «جوان!» برگشت. زن پیری با چتر ایستاده بود. موهای خاکستری و صورت مهربانی داشت. «کاملاً خیس شدی پسرم،» گفت. «بیا، چتر من رو بگیر.» بن باورش نمی‌شد. «اما خودتون چی؟» زن پیر خندید. «نگران من نباش. من همین‌جا زندگی می‌کنم.» به خانه‌ی کوچکی اشاره کرد. «فقط چند قدم دارم. تو راه طولانی داری.» بن لحظه‌ای تردید کرد. بعد چتر را گرفت. «خیلی ممنون.»",
                    vocabulary = listOf(
                        Word("nearby", "نزدیک", "ˌnɪrˈbaɪ"),
                        Word("umbrella", "چتر", "ʌmˈbrelə"),
                        Word("hesitate", "تردید کردن", "ˈhezɪteɪt"),
                        Word("kind", "مهربان", "kaɪnd")
                    )
                ),
                StoryChapter(
                    number = 3, title = "Kindness Comes Back", titlePersian = "مهربانی برمی‌گردد",
                    text = "The next day, Ben bought a beautiful new umbrella. It was blue with yellow flowers. He also bought a small box of chocolates. Then he walked to the old woman's house and knocked on her door. When she opened the door, she was surprised. \"Hello, young man! You are the boy from yesterday.\" Ben smiled and held out the umbrella. \"This is for you. You gave me yours, so I bought you a new one.\" The old woman's eyes filled with tears. She hugged Ben. \"You are a wonderful boy.\" Ben shook his head. \"My mother always says: return kindness with kindness.\" From that day on, Ben visited the old woman every week. They became the best of friends.",
                    textPersian = "روز بعد، بن یک چتر نو زیبا خرید. آبی با گل‌های زرد. یک جعبه شکلات هم خرید. بعد به خانه زن پیر رفت. وقتی در را باز کرد، شگفت‌زده شد. «سلام جوان! تو همون پسری از دیروزی.» بن لبخند زد و چتر را دراز کرد. «این مال شماست. شما چترتان رو به من دادید، پس من یک چتر نو خریدم.» چشمان زن پیر پر از اشک شد. بن را در آغوش گرفت. «تو پسر فوق‌العاده‌ای هستی.» بن سر تکان داد. «مادرم می‌گه: مهربانی رو با مهربانی جواب بده.» از آن روز، بن هر هفته به دیدن زن پیر می‌رفت. بهترین دوست شدند.",
                    vocabulary = listOf(
                        Word("knock", "در زدن", "nɑːk"),
                        Word("gift", "هدیه", "ɡɪft"),
                        Word("act of kindness", "عمل مهربانی", ""),
                        Word("forever", "برای همیشه", "fərˈevər")
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
                    textPersian = "اسم من نیکاست. هفت ساله‌ام. امروز اولین روز مدرسه جدیدم است. صبح زود بیدار شدم. دلم درد می‌کرد. دستانم می‌لرزید. نمی‌خواستم بروم. «اگر بچه‌ها دوستم نداشته باشند چی؟» از مادرم پرسیدم. مادرم لبخند زد. «نگران نباش نیکا. تو باهوش و مهربانی. دوست پیدا می‌کنی. فقط خودت باش.» اما هنوز می‌ترسیدم. لباس آبی و کفش‌های براق مشکی‌ام را پوشیدم. صورتم رنگ‌پریده بود. قلبم تند می‌زد.",
                    vocabulary = listOf(
                        Word("nervous", "عصبی", "ˈnɜːrvəs"),
                        Word("scared", "ترسیده", "skerd"),
                        Word("stomach", "شکم", "ˈstʌmək"),
                        Word("breath", "نفس", "breθ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Girl Named Lily", titlePersian = "دختری به نام لیلی",
                    text = "My mother walked me to my classroom. The teacher, Miss Sara, welcomed me with a warm smile. \"Hello, Nika! Please sit here.\" She pointed to an empty seat. I walked slowly and sat down. All the other kids were talking and laughing. I felt so alone. Then I heard a soft voice next to me. \"Hi! I'm Lily.\" I turned and saw a girl with curly brown hair and a bright smile. \"You're new, right? Don't worry, I was new last year. It's not so bad.\" I smiled a little. \"I'm Nika.\" Lily laughed. \"You'll make lots of friends. I'll help you.\" During the break, Lily showed me around the school. By lunchtime, I didn't feel alone anymore.",
                    textPersian = "مادرم مرا تا کلاسم برد. معلم، خانم سارا، با لبخندی گرم خوش‌آمد گفت. «سلام نیکا! اینجا بنشین.» به صندلی خالی اشاره کرد. آرام رفتم و نشستم. همه بچه‌ها با دوستانشان حرف می‌زدند. خیلی تنها حس می‌کردم. بعد صدای ملایمی شنیدم. «سلام! من لیلی هستم.» دختری با موهای فر قهوه‌ای و لبخندی روشن. «تو جدیدی، درسته؟ نگران نباش. من پارسال جدید بودم. اونقدرا هم بد نیست.» کمی لبخند زدم. «من نیکا هستم.» لیلی خندید. «دوستان زیادی پیدا می‌کنی. من کمکت می‌کنم.» موقع زنگ تفریح، لیلی مدرسه را نشانم داد. تا وقت ناهار، دیگر تنها نبودم.",
                    vocabulary = listOf(
                        Word("welcomed", "خوش‌آمد گفت", "ˈwelkəmd"),
                        Word("curly", "فر", "ˈkɜːrli"),
                        Word("break", "زنگ تفریح", "breɪk"),
                        Word("share", "قسمت کردن", "ʃer")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Best First Day", titlePersian = "بهترین روز اول",
                    text = "When school ended, my mother was waiting outside. \"How was your day?\" she asked. I ran to her and hugged her. \"It was the best day ever!\" I said. \"I made a friend! Her name is Lily.\" I talked and talked all the way home. That evening, I called Lily on the phone. We talked for an hour. We promised to sit together at school every day. We promised to be best friends forever. That night, I thought about how scared I was that morning. And I realized something important. All my fears were just in my head. The world was not as scary as I thought. I smiled and closed my eyes, excited for tomorrow.",
                    textPersian = "وقتی مدرسه تمام شد، مادرم بیرون منتظر بود. «روزت چطور بود؟» پرسید. به سمتش دویدم و در آغوشش گرفتم. «بهترین روز عمرم بود! یه دوست پیدا کردم! اسمش لیلیه.» تمام راه خانه حرف زدم. آن عصر با لیلی تلفنی صحبت کردم. یک ساعت حرف زدیم. قول دادیم هر روز کنار هم بنشینیم. قول دادیم برای همیشه بهترین دوست باشیم. آن شب، به این فکر کردم که صبح چقدر ترسیده بودم. و فهمیدم تمام ترس‌هایم فقط در ذهنم بودند. دنیا آنقدرها ترسناک نبود. لبخند زدم و چشمانم را بستم، برای فردا هیجان‌زده.",
                    vocabulary = listOf(
                        Word("tightly", "محکم", "ˈtaɪtli"),
                        Word("favorite", "مورد علاقه", "ˈfeɪvərɪt"),
                        Word("fear", "ترس", "fɪr"),
                        Word("excited", "هیجان‌زده", "ɪkˈsaɪtɪd")
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
                    textPersian = "میا دختر کوچک شادی بود. چیز مورد علاقه‌اش بادکنک قرمزش بود. پدرش هفته گذشته در نمایشگاه خریده بود. قرمز روشن و براق بود و روی نخ سفید نازکی شناور بود. میا همه‌جا آن را می‌برد. به پارک. به خانه مادربزرگش. حتی به رختخواب. تمام بچه‌های محله میا و بادکنک قرمزش را می‌شناختند. بادکنک قرمز باعث می‌شد میا احساس خاص بودن کند.",
                    vocabulary = listOf(
                        Word("balloon", "بادکنک", "bəˈluːn"),
                        Word("shiny", "براق", "ˈʃaɪni"),
                        Word("float", "شناور بودن", "floʊt"),
                        Word("neighborhood", "محله", "ˈneɪbərhʊd")
                    )
                ),
                StoryChapter(
                    number = 2, title = "Gone with the Wind", titlePersian = "رفته با باد",
                    text = "One windy afternoon, Mia was playing in the park with her red balloon. The wind was strong. Suddenly, a big gust of wind blew through the park. The string slipped out of Mia's hand. \"No! No!\" Mia shouted. She jumped up, but it was too high. The red balloon floated up, up, up into the sky. It became smaller and smaller, until it was just a tiny red dot, and then it was gone. Mia stood in the park, looking at the empty sky. Her eyes filled with tears. She sat on the grass and cried. \"My balloon... my beautiful balloon...\" she sobbed. Other children played around her, but no one noticed the sad little girl.",
                    textPersian = "یک بعدازظهر بادی، میا با بادکنک قرمزش بازی می‌کرد. ناگهان وزش باد شدیدی از پارک گذشت. نخ از دست میا لیز خورد. «نه! نه!» میا فریاد زد. پرید، اما خیلی بالا بود. بادکنک قرمز بالا، بالا، بالا رفت. کوچک و کوچک‌تر شد تا فقط یک نقطه قرمز کوچک شد و ناپدید شد. میا در پارک ایستاد و به آسمان خالی نگاه کرد. چشمانش پر از اشک شد. روی چمن نشست و گریه کرد. «بادکنکم... بادکنک زیبایم...» هق‌هق کرد. هیچ‌کس دختر کوچک غمگین را ندید.",
                    vocabulary = listOf(
                        Word("gust", "وزش باد", "ɡʌst"),
                        Word("slip", "لیز خوردن", "slɪp"),
                        Word("sob", "هق‌هق کردن", "sɑːb"),
                        Word("broken heart", "قلب شکسته", "")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Blue Surprise", titlePersian = "سورپرایز آبی",
                    text = "A boy named Sam was playing nearby. He saw Mia crying. He walked over slowly. \"Are you okay?\" he asked. Mia looked up. \"My balloon flew away. The wind took it.\" Sam felt sad for her. He looked at his own hand. He was holding a blue balloon. He thought for a moment. Then he smiled and held out the balloon. \"Here. Take mine.\" Mia looked at him in surprise. \"But it's yours.\" Sam shook his head. \"It's okay. You look sad. I want you to be happy.\" Mia's eyes lit up. She took the blue balloon. \"Thank you. You're the nicest boy I've ever met.\" Sam smiled. \"What's your name?\" \"Mia.\" \"I'm Sam. Want to play together?\" Mia nodded. From that day on, Sam and Mia were best friends.",
                    textPersian = "پسری به نام سام نزدیک آنجا بازی می‌کرد. میا را در حال گریه دید. آرام به سمتش رفت. «حالت خوبه؟» پرسید. میا نگاه کرد. «بادکنکم پرواز کرد. باد بردش.» سام غمگین شد. به دست خودش نگاه کرد. بادکنک آبی داشت. لحظه‌ای فکر کرد. بعد لبخند زد و بادکنک را دراز کرد. «بیا. مال من رو بگیر.» میا با تعجب نگاه کرد. «اما مال خودته.» سام سر تکان داد. «اشکالی نداره. تو غمگین به نظر می‌رسی. می‌خوام خوشحال باشی.» چشمان میا برق زد. بادکنک آبی را گرفت. «ممنون. تو بهترین پسری هستی که دیدم.» سام لبخند زد. «اسمت چیه؟» «میا.» «من سام هستم. می‌خوای بازی کنیم؟» میا سر تکان داد. از آن روز، سام و میا بهترین دوست بودند.",
                    vocabulary = listOf(
                        Word("surprise", "سورپرایز", "sərˈpraɪz"),
                        Word("whisper", "زمزمه کردن", "ˈwɪspər"),
                        Word("lit up", "برق زد", ""),
                        Word("best friend", "بهترین دوست", "")
                    )
                )
            )
        )
    )
}