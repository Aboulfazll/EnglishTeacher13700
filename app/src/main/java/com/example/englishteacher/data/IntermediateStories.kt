package com.example.englishteacher.data

object IntermediateStories {
    val stories: List<Story> = listOf(

        Story(
            id = "s_i1", title = "The Wise Judge", titlePersian = "قاضی دانا",
            level = Level.INTERMEDIATE,
            text = "A wise judge solves a difficult case in a small kingdom.",
            moral = "Wisdom solves difficult problems.", moralPersian = "خرد مشکلات دشوار را حل می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1589829545856-d10d557cf95f?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "A Difficult Case", titlePersian = "پرونده دشوار",
                    text = "In a small kingdom long ago, there lived a wise judge named Farid. People came from far and wide to ask for his help. He was known for his fairness and his sharp mind. One morning, two men arrived at his court. Both claimed to own the same beautiful black horse. The first man, a rich merchant, said the horse had been stolen from him. The second man, a poor farmer, insisted that he had raised the horse from a foal. The judge listened carefully to both sides. The court was crowded with people who had come to watch. Everyone whispered to each other, wondering how the judge would solve this impossible case.",
                    textPersian = "در پادشاهی کوچک در زمان‌های دور، قاضی دانایی به نام فرید زندگی می‌کرد. مردم از دور و نزدیک برای کمک به او می‌آمدند. او به انصاف و ذهن تیزبینش معروف بود. یک صبح، دو مرد به دادگاهش آمدند. هر دو ادعا می‌کردند مالک همان اسب زیبای سیاه هستند. مرد اول، تاجری ثروتمند، گفت اسب از او دزدیده شده. مرد دوم، کشاورزی فقیر، اصرار داشت که اسب را از کره‌ای بزرگ کرده است. قاضی به دقت به هر دو طرف گوش داد. دادگاه پر از مردمی بود که برای تماشا آمده بودند. همه پچ‌پچ می‌کردند و می‌پرسیدند قاضی چطور این پرونده غیرممکن را حل می‌کند.",
                    vocabulary = listOf(
                        Word("judge", "قاضی", "dʒʌdʒ"),
                        Word("kingdom", "پادشاهی", "ˈkɪŋdəm"),
                        Word("fairness", "انصاف", "ˈfernəs"),
                        Word("merchant", "تاجر", "ˈmɜːrtʃənt"),
                        Word("foal", "کره اسب", "foʊl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the judge's name?",
                            questionPersian = "اسم قاضی چیه؟",
                            options = listOf("Hassan", "Farid", "Ali", "Karim"),
                            correctIndex = 1,
                            explanation = "The wise judge's name was Farid."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the two men argue about?",
                            questionPersian = "دو مرد سر چی دعوا داشتند؟",
                            options = listOf("A house", "A horse", "A gold coin", "A farm"),
                            correctIndex = 1,
                            explanation = "Both claimed to own the same beautiful black horse."
                        ),
                        ChapterQuizQuestion(
                            question = "What was the second man's profession?",
                            questionPersian = "شغل مرد دوم چه بود؟",
                            options = listOf("Rich merchant", "Poor farmer", "Soldier", "Teacher"),
                            correctIndex = 1,
                            explanation = "The second man was a poor farmer."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Judge's Clever Plan", titlePersian = "نقشه هوشمندانه قاضی",
                    text = "The judge thought for a long moment. He looked at the horse. He looked at the two men. Then he smiled and said, \"Bring the horse to the courtyard and release him. Let the horse decide.\" Everyone was confused. Release the horse? How could a horse decide? But the judge insisted. The guards brought the horse to the courtyard. The judge ordered both men to stand on opposite sides of the yard. Then he untied the horse. The horse stood still for a moment, looking around. Then, without hesitation, he walked slowly toward the poor farmer. He nuzzled the farmer's chest and made a soft sound. The farmer began to cry and hugged the horse. The judge declared, \"The horse knows his true master. The case is solved.\" The rich merchant was shocked. He tried to protest, but the judge silenced him with a single look.",
                    textPersian = "قاضی لحظه‌ای طولانی فکر کرد. به اسب نگاه کرد. به دو مرد نگاه کرد. بعد لبخند زد و گفت: «اسب را به حیاط بیاورید و آزادش کنید. بگذارید اسب تصمیم بگیرد.» همه گیج شدند. اسب آزاد؟ اسب چطور می‌تواند تصمیم بگیرد؟ اما قاضی اصرار کرد. نگهبانان اسب را به حیاط آوردند. قاضی دستور داد هر دو مرد در دو طرف مخالف حیاط بایستند. بعد اسب را باز کرد. اسب لحظه‌ای ایستاد و اطراف را نگاه کرد. بعد بدون تردید، آرام به سمت کشاورز فقیر راه رفت. سینه کشاورز را با پوزه لمس کرد و صدای ملایمی درآورد. کشاورز شروع به گریه کرد و اسب را در آغوش گرفت. قاضی اعلام کرد: «اسب ارباب واقعی‌اش را می‌شناسد. پرونده حل شد.» تاجر ثروتمند شوکه شد.",
                    vocabulary = listOf(
                        Word("courtyard", "حیاط", "ˈkɔːrtjɑːrd"),
                        Word("release", "آزاد کردن", "rɪˈliːs"),
                        Word("hesitation", "تردید", "ˌhezɪˈteɪʃn"),
                        Word("nuzzle", "لمس کردن با پوزه", "ˈnʌzl"),
                        Word("declare", "اعلام کردن", "dɪˈkler")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How did the judge decide the case?",
                            questionPersian = "قاضی چطور پرونده رو حل کرد؟",
                            options = listOf(
                                "Asked witnesses",
                                "Let the horse choose",
                                "Tossed a coin",
                                "Divided the horse"
                            ),
                            correctIndex = 1,
                            explanation = "The judge released the horse and let it choose its true master."
                        ),
                        ChapterQuizQuestion(
                            question = "Whose side did the horse go to?",
                            questionPersian = "اسب به سمت کی رفت؟",
                            options = listOf("The rich merchant", "The poor farmer", "The judge", "The guards"),
                            correctIndex = 1,
                            explanation = "The horse walked to the poor farmer and nuzzled his chest."
                        ),
                        ChapterQuizQuestion(
                            question = "What does the judge's decision show?",
                            questionPersian = "تصمیم قاضی چی رو نشون می‌ده؟",
                            options = listOf(
                                "That money wins",
                                "That wisdom solves difficult problems",
                                "That horses are dangerous",
                                "That farmers are honest"
                            ),
                            correctIndex = 1,
                            explanation = "The judge's wisdom solved a difficult case."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Lesson of Wisdom", titlePersian = "درس خرد",
                    text = "After the case was closed, the rich merchant stormed out of the court angrily. The poor farmer thanked the judge with tears in his eyes. \"How did you know?\" he asked. The judge smiled. \"A horse does not care about money or power. He cares about love and care. You raised him. You fed him. You loved him. He remembers. Animals are wiser than many men.\" The crowd applauded. The story of the wise judge spread throughout the kingdom and beyond. Years later, when the judge was very old, he was asked the secret of his wisdom. He said simply, \"I listen more than I speak. I watch more than I judge. And I always trust the truth.\" His wisdom guided the kingdom for many generations, and his name became a symbol of justice itself.",
                    textPersian = "بعد از بسته شدن پرونده، تاجر ثروتمند با عصبانیت از دادگاه بیرون رفت. کشاورز فقیر با چشمان پر از اشک از قاضی تشکر کرد. «چطور فهمیدید؟» پرسید. قاضی لبخند زد. «اسب به پول و قدرت اهمیت نمی‌دهد. به عشق و مراقبت اهمیت می‌دهد. تو او را بزرگ کردی. به او غذا دادی. دوستش داشتی. او به یاد می‌آورد. حیوانات از بسیاری از انسان‌ها عاقل‌ترند.» جمعیت تشویق کردند. داستان قاضی دانا در سراسر پادشاهی پخش شد. سال‌ها بعد، وقتی قاضی خیلی پیر شده بود، از او راز خردش را پرسیدند. او به سادگی گفت: «بیشتر از آنچه حرف می‌زنم گوش می‌دهم. بیشتر از آنچه قضاوت می‌کنم تماشا می‌کنم. و همیشه به حقیقت اعتماد می‌کنم.»",
                    vocabulary = listOf(
                        Word("storm out", "با عصبانیت بیرون رفتن", ""),
                        Word("applaud", "تشویق کردن", "əˈplɔːd"),
                        Word("symbol", "نماد", "ˈsɪmbl"),
                        Word("justice", "عدالت", "ˈdʒʌstɪs"),
                        Word("generation", "نسل", "ˌdʒenəˈreɪʃn")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why did the horse choose the poor farmer?",
                            questionPersian = "چرا اسب کشاورز فقیر رو انتخاب کرد؟",
                            options = listOf(
                                "Because of money",
                                "Because he raised and loved him",
                                "Because of the judge",
                                "By coincidence"
                            ),
                            correctIndex = 1,
                            explanation = "The farmer had raised, fed, and loved the horse."
                        ),
                        ChapterQuizQuestion(
                            question = "What was the judge's secret of wisdom?",
                            questionPersian = "راز خرد قاضی چی بود؟",
                            options = listOf(
                                "To talk a lot",
                                "To listen more than speak",
                                "To be rich",
                                "To be strong"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'I listen more than I speak. I watch more than I judge. And I always trust the truth.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did the judge's name become a symbol of?",
                            questionPersian = "نام قاضی نماد چی شد؟",
                            options = listOf("Wealth", "Justice", "Power", "Beauty"),
                            correctIndex = 1,
                            explanation = "His name became a symbol of justice itself."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i2", title = "The Two Brothers", titlePersian = "دو برادر",
            level = Level.INTERMEDIATE,
            text = "Two brothers argue over their inheritance. They learn a valuable lesson.",
            moral = "Family is more valuable than possessions.", moralPersian = "خانواده از دارایی ارزشمندتر است.",
            coverUrl = "https://images.unsplash.com/photo-1609220136736-443140cffec6?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Inheritance", titlePersian = "ارث",
                    text = "When their father passed away, two brothers inherited his farm. The older brother, Karim, was strong and hardworking but also greedy. The younger brother, Nader, was gentle and fair. Their father's will said the farm should be divided equally. But Karim was not happy with this. \"I worked harder than you,\" he told Nader. \"I deserve the bigger part.\" Nader was hurt by his brother's words. \"Father loved us equally,\" he replied. \"Why should we fight over what he left us?\" But Karim would not listen. Days turned into weeks, and weeks into months. The two brothers stopped speaking to each other. They divided the land with a fence and refused to cross it.",
                    textPersian = "وقتی پدرشان فوت کرد، دو برادر مزرعه‌اش را به ارث بردند. برادر بزرگتر، کریم، قوی و سخت‌کوش بود اما حریص هم بود. برادر کوچکتر، نادر، ملایم و منصف بود. وصیت پدرشان می‌گفت مزرعه باید به‌طور مساوی تقسیم شود. اما کریم راضی نبود. «من سخت‌تر از تو کار کردم،» به نادر گفت. نادر آزرده شد. «پدر ما را به‌طور مساوی دوست داشت.» اما کریم گوش نمی‌داد. دو برادر از حرف زدن با هم دست کشیدند. زمین را با حصار تقسیم کردند.",
                    vocabulary = listOf(
                        Word("inherit", "به ارث بردن", "ɪnˈherɪt"),
                        Word("greedy", "حریص", "ˈɡriːdi"),
                        Word("will", "وصیت‌نامه", "wɪl"),
                        Word("deserve", "سزاوار بودن", "dɪˈzɜːrv"),
                        Word("fence", "حصار", "fens")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did the two brothers inherit?",
                            questionPersian = "دو برادر چی به ارث بردند؟",
                            options = listOf("A house", "A farm", "A shop", "Gold"),
                            correctIndex = 1,
                            explanation = "They inherited their father's farm."
                        ),
                        ChapterQuizQuestion(
                            question = "How did the father want the farm divided?",
                            questionPersian = "پدر می‌خواست مزرعه چطور تقسیم شود؟",
                            options = listOf("Unequally", "Equally", "Given to older son", "Sold"),
                            correctIndex = 1,
                            explanation = "Their father's will said the farm should be divided equally."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim do that hurt Nader?",
                            questionPersian = "کریم چیکار کرد که نادر رو آزرد؟",
                            options = listOf(
                                "He sold the farm",
                                "He said he deserved the bigger part",
                                "He left home",
                                "He broke the fence"
                            ),
                            correctIndex = 1,
                            explanation = "Karim said: 'I worked harder than you. I deserve the bigger part.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Lonely Winter", titlePersian = "زمستان تنها",
                    text = "That winter was the coldest in many years. Snow covered the entire valley. One night, Karim heard a strange sound from his brother's side of the farm. He listened carefully. It was coughing. Nader was sick. Karim tried to ignore it. \"He has his own land and his own life,\" he told himself. But the coughing continued for hours. Karim could not sleep. His father's words came back to him: \"Brothers are like two hands — one cannot survive without the other.\" Karim lay awake all night, torn between his pride and his heart. The next morning, he saw that no smoke was coming from Nader's chimney. Nader was too weak to light the fire. Karim's heart sank. He realized how foolish he had been.",
                    textPersian = "آن زمستان سردترین زمستان سال‌های بسیاری بود. برف تمام دره را پوشاند. یک شب، کریم صدای عجیبی از طرف مزرعه‌ی برادرش شنید. سرفه بود. نادر بیمار بود. کریم سعی کرد نادیده بگیرد. «او زمین خودش و زندگی خودش را دارد.» اما سرفه‌ها ساعت‌ها ادامه یافت. کریم نمی‌توانست بخوابد. حرف پدرش به یادش آمد: «برادرها مثل دو دست هستند — یکی بدون دیگری نمی‌تواند زنده بماند.» صبح روز بعد، دید که هیچ دودی از دودکش نادر نمی‌آید. قلب کریم فرو ریخت.",
                    vocabulary = listOf(
                        Word("valley", "دره", "ˈvæli"),
                        Word("cough", "سرفه", "kɔːf"),
                        Word("chimney", "دودکش", "ˈtʃɪmni"),
                        Word("foolish", "احمقانه", "ˈfuːlɪʃ"),
                        Word("pride", "غرور", "praɪd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Karim hear one night?",
                            questionPersian = "کریم یک شب چی شنید؟",
                            options = listOf("Laughter", "Coughing", "Music", "Crying"),
                            correctIndex = 1,
                            explanation = "Karim heard coughing from his brother's side of the farm."
                        ),
                        ChapterQuizQuestion(
                            question = "Why couldn't Karim sleep?",
                            questionPersian = "چرا کریم نمی‌توانست بخوابد؟",
                            options = listOf(
                                "It was too cold",
                                "He was worried about his brother",
                                "The noise was loud",
                                "He was hungry"
                            ),
                            correctIndex = 1,
                            explanation = "Karim worried about his brother and thought about his father's words."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim notice the next morning?",
                            questionPersian = "کریم صبح روز بعد چی متوجه شد؟",
                            options = listOf(
                                "No smoke from Nader's chimney",
                                "Nader went away",
                                "Someone stole from the farm",
                                "It was warmer"
                            ),
                            correctIndex = 0,
                            explanation = "No smoke was coming from Nader's chimney — Nader was too weak to light the fire."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Two Hands Together", titlePersian = "دو دست با هم",
                    text = "Karim grabbed his coat and ran across the fence. He broke it down with his own hands. He ran to Nader's house and knocked. No answer. He pushed the door open. Nader was lying on the bed, pale and weak. Karim rushed to him. \"Nader! Nader! Wake up!\" Nader slowly opened his eyes. When he saw his brother, tears rolled down his cheeks. \"Karim... I thought you hated me.\" Karim shook his head and hugged his brother tightly. \"I was a fool,\" he whispered. \"I'm sorry. I'm so sorry.\" He built a fire, cooked hot soup, and stayed with Nader all week. Slowly, Nader recovered. The two brothers sat by the fire one evening. \"Let's tear down the fence,\" said Karim. \"The farm was never ours to divide. It was father's gift to us — both of us. Together.\" Nader smiled and nodded. They worked side by side from that day on. The farm flourished, and the brothers became inseparable.",
                    textPersian = "کریم کاپشنش را برداشت و از روی حصار دوید. با دستان خودش خرابش کرد. به خانه نادر دوید. نادر روی تخت دراز کشیده بود، رنگ‌پریده و ضعیف. کریم به سمتش دوید. «نادر! بیدار شو!» نادر آرام چشمانش را باز کرد. وقتی برادرش را دید، اشک روی گونه‌هایش غلتید. «کریم... فکر کردم از من متنفری.» کریم سر تکان داد و برادرش را محکم در آغوش گرفت. «احمق بودم.» آتش روشن کرد، سوپ گرم پخت و تمام هفته با نادر ماند. از آن روز، کنار هم کار کردند. مزرعه شکوفا شد.",
                    vocabulary = listOf(
                        Word("grab", "قاپیدن", "ɡræb"),
                        Word("pale", "رنگ‌پریده", "peɪl"),
                        Word("recover", "بهبود یافتن", "rɪˈkʌvər"),
                        Word("flourish", "شکوفا شدن", "ˈflɜːrɪʃ"),
                        Word("precious", "گرانبها", "ˈpreʃəs")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Karim do when he saw Nader was sick?",
                            questionPersian = "کریم وقتی دید نادر مریضه چیکار کرد؟",
                            options = listOf(
                                "Called a doctor",
                                "Broke the fence and helped him",
                                "Sent food",
                                "Ignored him"
                            ),
                            correctIndex = 1,
                            explanation = "Karim broke down the fence and rushed to help Nader."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim say to Nader?",
                            questionPersian = "کریم به نادر چی گفت؟",
                            options = listOf(
                                "I want the bigger part",
                                "I was a fool. I'm sorry",
                                "Leave the farm",
                                "You should work harder"
                            ),
                            correctIndex = 1,
                            explanation = "Karim said: 'I was a fool. I'm sorry. I'm so sorry.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim suggest at the end?",
                            questionPersian = "کریم در پایان چی پیشنهاد داد؟",
                            options = listOf(
                                "To sell the farm",
                                "To tear down the fence",
                                "To move away",
                                "To buy more land"
                            ),
                            correctIndex = 1,
                            explanation = "Karim suggested: 'Let's tear down the fence.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i3", title = "The Patient Farmer", titlePersian = "کشاورز صبور",
            level = Level.INTERMEDIATE,
            text = "A farmer plants a bamboo seed and waits patiently for years.",
            moral = "Patience is the key to success.", moralPersian = "صبر کلید موفقیت است.",
            coverUrl = "https://images.unsplash.com/photo-1500382017468-9049fed747ef?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "A Strange Seed", titlePersian = "دانه‌ای عجیب",
                    text = "A young farmer named Behrouz lived in a small village. One day, an old traveler gave him a small bamboo seed. \"Plant this,\" the traveler said. \"Water it every day. But be patient — it will not grow quickly.\" Behrouz was curious. He had never grown bamboo before. He planted the seed in his garden and watered it every morning. After one month, nothing grew. His neighbors laughed. \"You're wasting your time!\" they said. But Behrouz kept watering. After six months, still nothing. After one year, still nothing. His wife began to worry. \"Maybe the seed is dead,\" she said. But Behrouz smiled and continued.",
                    textPersian = "کشاورز جوانی به نام بهروز در دهکده‌ای کوچک زندگی می‌کرد. یک روز، مسافری پیر دانه‌ی کوچک بامبو به او داد. «این را بکار،» مسافر گفت. «هر روز آبش بده. اما صبور باش.» بهروز دانه را در باغش کاشت و هر صبح آب داد. بعد از یک ماه، چیزی رشد نکرد. همسایه‌ها خندیدند. بعد از شش ماه، هنوز هیچی. بعد از یک سال، هنوز هیچی. همسرش نگران شد. اما بهروز لبخند زد و ادامه داد.",
                    vocabulary = listOf(
                        Word("bamboo", "بامبو", "ˌbæmˈbuː"),
                        Word("curious", "کنجکاو", "ˈkjʊriəs"),
                        Word("patient", "صبور", "ˈpeɪʃnt"),
                        Word("waste", "تلف کردن", "weɪst"),
                        Word("trust", "اعتماد کردن", "trʌst")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did the traveler give Behrouz?",
                            questionPersian = "مسافر چی به بهروز داد؟",
                            options = listOf("Gold", "A bamboo seed", "A book", "Food"),
                            correctIndex = 1,
                            explanation = "The traveler gave him a small bamboo seed."
                        ),
                        ChapterQuizQuestion(
                            question = "How often did Behrouz water the seed?",
                            questionPersian = "بهروز چند وقت یکبار دانه رو آب می‌داد؟",
                            options = listOf("Once a week", "Every morning", "Once a month", "Never"),
                            correctIndex = 1,
                            explanation = "He planted the seed and watered it every morning."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the neighbors say?",
                            questionPersian = "همسایه‌ها چی گفتند؟",
                            options = listOf(
                                "Great job!",
                                "You're wasting your time",
                                "Let's help",
                                "Sell the seed"
                            ),
                            correctIndex = 1,
                            explanation = "His neighbors laughed and said: 'You're wasting your time!'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Hidden Roots", titlePersian = "ریشه‌های پنهان",
                    text = "Five years passed. Behrouz continued to water the seed every single day. He talked to it. He protected it from birds and insects. His neighbors had stopped laughing — now they felt sorry for him. \"Poor Behrouz,\" they whispered. \"He has wasted five years of his life.\" Behrouz's beard had grown long. His hands were rough from work. But his eyes still held hope. Then one spring morning, Behrouz went to his garden as usual. And he stopped. A small green shoot was pushing through the soil! It was tiny, but it was alive. Behrouz fell to his knees with tears of joy. \"It's growing!\" he shouted. But what he did not know was that under the ground, something amazing had been happening all those years. The bamboo roots had been growing deeper and deeper, spreading wider and wider, preparing for the moment when the shoot would appear.",
                    textPersian = "پنج سال گذشت. بهروز هر روز دانه را آب داد. با آن حرف زد. از پرنده‌ها و حشرات محافظتش کرد. همسایه‌ها دیگر نمی‌خندیدند — حالا برایش دلسوزی می‌کردند. بعد یک صبح بهاری، بهروز طبق معمول به باغش رفت. جوانه‌ی سبز کوچکی از خاک بیرون می‌آمد! کوچک بود، اما زنده بود. بهروز با اشک شوق زانو زد. اما نمی‌دانست زیر زمین، اتفاق شگفت‌انگیزی تمام آن سال‌ها افتاده.",
                    vocabulary = listOf(
                        Word("rough", "زبر", "rʌf"),
                        Word("shoot", "جوانه", "ʃuːt"),
                        Word("soil", "خاک", "sɔɪl"),
                        Word("spread", "پخش شدن", "spred"),
                        Word("prepare", "آماده شدن", "prɪˈper")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How long did Behrouz wait before seeing any growth?",
                            questionPersian = "بهروز چند سال صبر کرد تا رشدی ببینه؟",
                            options = listOf("One year", "Two years", "Five years", "Ten years"),
                            correctIndex = 2,
                            explanation = "Five years passed before a small green shoot appeared."
                        ),
                        ChapterQuizQuestion(
                            question = "What was happening under the ground?",
                            questionPersian = "زیر زمین چی داشت اتفاق می‌افتاد؟",
                            options = listOf(
                                "Nothing",
                                "The roots were growing",
                                "Water collecting",
                                "Animals digging"
                            ),
                            correctIndex = 1,
                            explanation = "The bamboo roots had been growing deeper and spreading wider."
                        ),
                        ChapterQuizQuestion(
                            question = "How did Behrouz react when he saw the shoot?",
                            questionPersian = "بهروز وقتی جوانه رو دید چطور واکنش نشون داد؟",
                            options = listOf(
                                "He cried with joy",
                                "He got angry",
                                "He was disappointed",
                                "He ignored it"
                            ),
                            correctIndex = 0,
                            explanation = "Behrouz fell to his knees with tears of joy."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Forest of Bamboo", titlePersian = "جنگلی از بامبو",
                    text = "In the weeks that followed, something incredible happened. The bamboo grew and grew — not slowly, but with astonishing speed. In six weeks, it reached thirty meters tall! Neighbors came from all over the village to see this miracle. They stood with open mouths, staring at the towering bamboo. \"How is this possible?\" they asked. Behrouz smiled. \"For five years, it was growing underground,\" he explained. \"The roots were preparing the way. When the time was right, it burst forth in just six weeks.\" An old wise man in the village nodded and said, \"This is the way of all great things. The most important growth happens invisibly, deep inside, before anyone can see it. That is what patience truly means.\" Behrouz's bamboo became famous throughout the region. He shared seeds with everyone.",
                    textPersian = "در هفته‌های بعد، اتفاق باورنکردنی افتاد. بامبو رشد کرد و رشد کرد — نه آهسته، بلکه با سرعت حیرت‌انگیز. در شش هفته، به سی متر رسید! همسایه‌ها از سراسر دهکده آمدند تا این معجزه را ببینند. بهروز لبخند زد. «پنج سال زیر زمین رشد می‌کرد،» توضیح داد. «ریشه‌ها راه را آماده می‌کردند.» پیرمرد دانایی در دهکده سر تکان داد و گفت: «این راه همه چیزهای بزرگ است. مهم‌ترین رشد نامرئی اتفاق می‌افتد، در عمق، قبل از اینکه کسی ببیند. این معنای واقعی صبر است.»",
                    vocabulary = listOf(
                        Word("incredible", "باورنکردنی", "ɪnˈkredəbl"),
                        Word("astonishing", "حیرت‌انگیز", "əˈstɑːnɪʃɪŋ"),
                        Word("miracle", "معجزه", "ˈmɪrəkl"),
                        Word("towering", "بلند", "ˈtaʊərɪŋ"),
                        Word("invisibly", "نامرئی", "ɪnˈvɪzəbli")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How tall did the bamboo grow in six weeks?",
                            questionPersian = "بامبو در شش هفته چقدر بلند شد؟",
                            options = listOf("5 meters", "10 meters", "30 meters", "50 meters"),
                            correctIndex = 2,
                            explanation = "In six weeks, the bamboo reached thirty meters tall."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the wise man say about patience?",
                            questionPersian = "پیرمرد دانا درباره صبر چی گفت؟",
                            options = listOf(
                                "It's a waste of time",
                                "The most important growth happens invisibly",
                                "It's easy",
                                "Only for plants"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'The most important growth happens invisibly, deep inside, before anyone can see it.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Behrouz do with the bamboo?",
                            questionPersian = "بهروز با بامبو چیکار کرد؟",
                            options = listOf(
                                "Sold it for gold",
                                "Shared seeds with everyone",
                                "Kept it secret",
                                "Cut it down"
                            ),
                            correctIndex = 1,
                            explanation = "Behrouz shared seeds with everyone."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i4", title = "The Generous King", titlePersian = "پادشاه بخشنده",
            level = Level.INTERMEDIATE,
            text = "A king gives freely to his people and his kingdom prospers.",
            moral = "Giving is more rewarding than receiving.", moralPersian = "بخشیدن پاداش بیشتری از گرفتن دارد.",
            coverUrl = "https://images.unsplash.com/photo-1599694230276-3ea3b20d5b1e?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Kind King", titlePersian = "پادشاه مهربان",
                    text = "Long ago, in a beautiful kingdom surrounded by mountains, there ruled a king named Arman. King Arman was unlike any king before him. He did not care for gold or jewels. He did not build grand palaces for himself. Instead, he used the kingdom's wealth to help the poor, feed the hungry, and educate the children. Every morning, he walked through the streets of his capital, talking to ordinary people. He listened to their problems and tried to solve them. His advisors were worried. \"Your Majesty,\" they said, \"if you keep giving away the royal treasury, the kingdom will run out of money!\" The king smiled gently and replied, \"The more I give, the more I will receive.\"",
                    textPersian = "زمان‌های دور، در پادشاهی زیبایی که توسط کوه‌ها احاطه شده بود، پادشاهی به نام آرمان حکومت می‌کرد. شاه آرمان با هیچ پادشاه قبلی فرق داشت. به طلا و جواهرات اهمیت نمی‌داد. از ثروت پادشاهی برای کمک به فقرا، غذا دادن به گرسنه‌ها و آموزش کودکان استفاده می‌کرد. هر صبح از خیابان‌های پایتختش می‌گذشت و با مردم عادی حرف می‌زد. مشاورانش نگران بودند. «اگر مدام خزانه سلطنتی را ببخشید، پادشاهی پول کم می‌آورد!» پادشاه آرام لبخند زد و پاسخ داد: «هر چه بیشتر بدهم، بیشتر دریافت خواهم کرد.»",
                    vocabulary = listOf(
                        Word("kingdom", "پادشاهی", "ˈkɪŋdəm"),
                        Word("treasury", "خزانه", "ˈtreʒəri"),
                        Word("advisor", "مشاور", "ədˈvaɪzər"),
                        Word("ordinary", "عادی", "ˈɔːrdneri"),
                        Word("majesty", "اعلیحضرت", "ˈmædʒəsti")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the king's name?",
                            questionPersian = "اسم پادشاه چیه؟",
                            options = listOf("Cyrus", "Arman", "Darius", "Farid"),
                            correctIndex = 1,
                            explanation = "The king's name was Arman."
                        ),
                        ChapterQuizQuestion(
                            question = "What did King Arman do with the kingdom's wealth?",
                            questionPersian = "شاه آرمان با ثروت پادشاهی چیکار کرد؟",
                            options = listOf(
                                "Built palaces",
                                "Helped the poor and educated children",
                                "Kept it",
                                "Bought jewels"
                            ),
                            correctIndex = 1,
                            explanation = "He used the wealth to help the poor, feed the hungry, and educate children."
                        ),
                        ChapterQuizQuestion(
                            question = "What did his advisors warn him about?",
                            questionPersian = "مشاورانش درباره چی هشدار دادند؟",
                            options = listOf(
                                "Running out of money",
                                "Losing the throne",
                                "Bad weather",
                                "Enemies"
                            ),
                            correctIndex = 0,
                            explanation = "They warned that the royal treasury would run out of money."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Test of Time", titlePersian = "آزمون زمان",
                    text = "Years passed. King Arman continued to give generously. He built schools, hospitals, and libraries. He gave land to farmers and tools to craftsmen. He made sure no child went hungry. His advisors grew more and more worried. \"The treasury is getting smaller!\" they warned. But the king was not worried. He had noticed something they had not. The kingdom was changing. Children who had once been poor were now educated and working. Farmers who had once been struggling were now prosperous. Crime had gone down. Laughter had gone up. The streets were cleaner. People were kinder to each other. And strange as it seemed, the kingdom's economy was thriving. New businesses had opened. Trade with other kingdoms had increased.",
                    textPersian = "سال‌ها گذشت. شاه آرمان به بخشندگی ادامه داد. مدرسه، بیمارستان و کتابخانه ساخت. به کشاورزان زمین و به صنعتگران ابزار داد. مشاورانش بیشتر و بیشتر نگران شدند. «خزانه کوچک‌تر می‌شود!» هشدار دادند. اما پادشاه نگران نبود. چیزی را دیده بود که آن‌ها ندیده بودند. پادشاهی در حال تغییر بود. جنایت کم شده بود. خنده بیشتر شده بود. مردم با هم مهربان‌تر بودند. و هرچند عجیب به نظر می‌رسید، اقتصاد پادشاهی شکوفا بود.",
                    vocabulary = listOf(
                        Word("generously", "بخشنده", "ˈdʒenərəsli"),
                        Word("prosperous", "مرفه", "ˈprɑːspərəs"),
                        Word("thrive", "شکوفا بودن", "θraɪv"),
                        Word("cycle", "چرخه", "ˈsaɪkl"),
                        Word("produce", "تولید کردن", "prəˈduːs")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was happening to the kingdom over the years?",
                            questionPersian = "در طول سال‌ها در پادشاهی چه اتفاقی می‌افتاد؟",
                            options = listOf(
                                "It was getting poorer",
                                "It was thriving and getting better",
                                "Nothing changed",
                                "It was at war"
                            ),
                            correctIndex = 1,
                            explanation = "The kingdom's economy was thriving, crime went down, and people were kinder."
                        ),
                        ChapterQuizQuestion(
                            question = "Why was the kingdom prospering?",
                            questionPersian = "چرا پادشاهی شکوفا بود؟",
                            options = listOf(
                                "Because of war",
                                "Because educated and prosperous people worked harder",
                                "Because of higher taxes",
                                "By luck"
                            ),
                            correctIndex = 1,
                            explanation = "Children were educated, farmers prospered, and new businesses opened."
                        ),
                        ChapterQuizQuestion(
                            question = "What is the lesson here?",
                            questionPersian = "درس اینجا چیه؟",
                            options = listOf(
                                "Keep your money",
                                "Generosity creates prosperity",
                                "Trust no one",
                                "War is good"
                            ),
                            correctIndex = 1,
                            explanation = "The king's generosity made the whole kingdom prosper."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Richer Kingdom", titlePersian = "پادشاهی ثروتمندتر",
                    text = "Twenty years after Arman became king, an ambassador from a neighboring kingdom visited. He was amazed by what he saw. \"Your kingdom is the wealthiest and happiest I have ever visited,\" he said. \"How did you do it?\" The king took the ambassador on a tour. He showed him the schools where children learned to read and write. The hospitals where the sick were healed for free. The workshops where craftsmen created beautiful things. The farms where farmers grew more than enough food. \"When people feel safe and cared for,\" the king explained, \"they work harder, they create more, and they help each other. Everyone benefits.\" The ambassador returned to his king with the news. That king, who had been stingy with his people, decided to change his ways. King Arman lived to be a very old man. The people built a statue of him with these words: \"The greatest wealth is not what you keep, but what you give.\"",
                    textPersian = "بیست سال پس از پادشاهی آرمان، سفیری از پادشاهی همسایه بازدید کرد. از دیدن آنچه دید شگفت‌زده شد. «پادشاهی شما ثروتمندترین و شادترین جایی است که تا حالا دیده‌ام،» گفت. «چطور این کار را کردید؟» پادشاه سفیر را به گشتی برد. «وقتی مردم احساس امنیت و مراقبت کنند،» پادشاه توضیح داد، «سخت‌تر کار می‌کنند، بیشتر می‌سازند و به هم کمک می‌کنند. همه سود می‌برند.» مردم مجسمه‌ای از او ساختند با این کلمات: «بزرگ‌ترین ثروت آن چیزی نیست که نگه می‌داری، بلکه آن چیزی است که می‌بخشی.»",
                    vocabulary = listOf(
                        Word("ambassador", "سفیر", "æmˈbæsədər"),
                        Word("mourn", "عزاداری کردن", "mɔːrn"),
                        Word("stingy", "خسیس", "ˈstɪndʒi"),
                        Word("statue", "مجسمه", "ˈstætʃuː"),
                        Word("benefit", "سود بردن", "ˈbenɪfɪt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who visited King Arman's kingdom?",
                            questionPersian = "کی به پادشاهی شاه آرمان آمد؟",
                            options = listOf("A merchant", "An ambassador", "A soldier", "A teacher"),
                            correctIndex = 1,
                            explanation = "An ambassador from a neighboring kingdom visited."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the king explain about his success?",
                            questionPersian = "پادشاه درباره موفقیتش چی توضیح داد؟",
                            options = listOf(
                                "It was luck",
                                "When people feel safe and cared for, everyone benefits",
                                "It was magic",
                                "It was from war"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'When people feel safe and cared for, they work harder and everyone benefits.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What was written on King Arman's statue?",
                            questionPersian = "روی مجسمه شاه آرمان چی نوشته شد؟",
                            options = listOf(
                                "Long live the king",
                                "The greatest wealth is what you give",
                                "King of kings",
                                "Power and glory"
                            ),
                            correctIndex = 1,
                            explanation = "It read: 'The greatest wealth is not what you keep, but what you give.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i5", title = "The Clever Student", titlePersian = "دانش‌آموز باهوش",
            level = Level.INTERMEDIATE,
            text = "A teacher asks about the most important thing in life.",
            moral = "Time is the most valuable resource.", moralPersian = "زمان باارزش‌ترین منبع است.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Teacher's Question", titlePersian = "سوال معلم",
                    text = "Miss Fatima was a wise teacher at a small school in Tehran. Her students loved her because she made them think. She did not just teach facts — she taught them how to question, how to wonder, and how to see the world differently. One morning, she walked into the classroom and wrote a question on the blackboard: \"What is the most important thing in life?\" The students looked at each other. The class was silent. \"Take out your notebooks,\" said Miss Fatima, \"and write your answer. You have ten minutes.\" The students began to write. Some wrote quickly. Others sat and thought deeply. After ten minutes, Miss Fatima collected the papers. She read them one by one aloud.",
                    textPersian = "خانم فاطمه معلم دانایی در مدرسه‌ای کوچک در تهران بود. دانش‌آموزانش دوستش داشتند چون به آن‌ها فکر کردن را یاد می‌داد. یک صبح، وارد کلاس شد و سؤالی روی تخته نوشت: «مهم‌ترین چیز در زندگی چیست؟» دانش‌آموزان به هم نگاه کردند. «دفترهایتان را دربیاورید،» گفت خانم فاطمه، «و پاسخ را بنویسید. ده دقیقه وقت دارید.» بعد از ده دقیقه، کاغذها را جمع کرد و یکی‌یکی با صدای بلند خواند.",
                    vocabulary = listOf(
                        Word("wise", "دانا", "waɪz"),
                        Word("question", "سؤال پرسیدن", "ˈkwestʃən"),
                        Word("wonder", "شگفت‌زده شدن", "ˈwʌndər"),
                        Word("collect", "جمع کردن", "kəˈlekt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was Miss Fatima's job?",
                            questionPersian = "شغل خانم فاطمه چی بود؟",
                            options = listOf("Doctor", "Teacher", "Engineer", "Artist"),
                            correctIndex = 1,
                            explanation = "Miss Fatima was a wise teacher."
                        ),
                        ChapterQuizQuestion(
                            question = "What question did she write on the blackboard?",
                            questionPersian = "چه سؤالی روی تخته نوشت؟",
                            options = listOf(
                                "What is love?",
                                "What is the most important thing in life?",
                                "What is success?",
                                "What is happiness?"
                            ),
                            correctIndex = 1,
                            explanation = "She wrote: 'What is the most important thing in life?'"
                        ),
                        ChapterQuizQuestion(
                            question = "How long did students have to answer?",
                            questionPersian = "دانش‌آموزان چقدر وقت داشتند؟",
                            options = listOf("Five minutes", "Ten minutes", "Fifteen minutes", "One hour"),
                            correctIndex = 1,
                            explanation = "They had ten minutes to write their answers."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Many Answers", titlePersian = "پاسخ‌های متفاوت",
                    text = "The first answer said, \"Money.\" Miss Fatima smiled and nodded. \"Money is useful,\" she said. \"It helps us live comfortably and care for our families.\" The second answer said, \"Health.\" Miss Fatima smiled again. \"Health is precious,\" she said. \"Without it, we cannot enjoy anything else.\" The third answer said, \"Family.\" Miss Fatima's eyes filled with warmth. \"Family is our foundation,\" she said softly. \"They love us when no one else will.\" Other answers followed: friendship, love, education, kindness, faith. Each answer was beautiful in its own way. The students felt proud of their answers. But then Miss Fatima picked up one last paper. It was from a quiet girl named Zara. Miss Fatima read it slowly: \"Time.\" The class grew silent.",
                    textPersian = "پاسخ اول گفت: «پول.» خانم فاطمه لبخند زد. «پول مفید است.» پاسخ دوم گفت: «سلامتی.» «سلامتی ارزشمند است.» پاسخ سوم گفت: «خانواده.» چشمان خانم فاطمه از گرما پر شد. «خانواده پایه‌ی ماست.» پاسخ‌های دیگری آمد: دوستی، عشق، آموزش، مهربانی، ایمان. هر پاسخ زیبا بود. اما بعد خانم فاطمه آخرین کاغذ را برداشت. از دختر ساکتی به نام زارا بود. آرام خواند: «زمان.» کلاس ساکت شد.",
                    vocabulary = listOf(
                        Word("comfortable", "راحت", "ˈkʌmftəbl"),
                        Word("foundation", "پایه", "faʊnˈdeɪʃn"),
                        Word("proud", "مفتخر", "praʊd"),
                        Word("silent", "ساکت", "ˈsaɪlənt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What were the first three answers?",
                            questionPersian = "سه پاسخ اول چی بودند؟",
                            options = listOf(
                                "Money, Health, Family",
                                "Love, Peace, Joy",
                                "Time, Money, Family",
                                "Health, Wealth, Love"
                            ),
                            correctIndex = 0,
                            explanation = "The first three answers were money, health, and family."
                        ),
                        ChapterQuizQuestion(
                            question = "Who wrote 'Time'?",
                            questionPersian = "کی نوشت «زمان»؟",
                            options = listOf("Miss Fatima", "Zara", "The first student", "A boy"),
                            correctIndex = 1,
                            explanation = "Zara, a quiet girl, wrote 'Time'."
                        ),
                        ChapterQuizQuestion(
                            question = "How did the class react to Zara's answer?",
                            questionPersian = "کلاس به پاسخ زارا چطور واکنش نشون داد؟",
                            options = listOf("Laughed", "Grew silent", "Applauded", "Ignored"),
                            correctIndex = 1,
                            explanation = "The class grew silent."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Answer That Changed Everything", titlePersian = "پاسخی که همه چیز را تغییر داد",
                    text = "Miss Fatima looked at Zara. \"Explain your answer,\" she said gently. Zara stood up slowly. She had never spoken in front of the class before. \"Miss,\" she said, \"money can be lost. Health can fade. Family can pass away. But time is the one thing we can never get back. With time, we can earn money. With time, we can heal our bodies. With time, we can build families and friendships. Without time, we have nothing.\" She paused. \"The most important thing in life is how we use our time. Because time is the only thing that never comes back.\" The class was completely silent. Then Miss Fatima smiled. \"Zara is right,\" she said. \"All the answers you gave are important. But time is the foundation of them all. Every second we have is a gift.\"",
                    textPersian = "خانم فاطمه به زارا نگاه کرد. «پاسخت را توضیح بده.» زارا آرام بلند شد. «خانم،» گفت، «پول می‌تواند از دست برود. سلامتی می‌تواند تحلیل برود. خانواده می‌تواند فوت کند. اما زمان تنها چیزی است که هرگز نمی‌توانیم برگردانیم. با زمان می‌توانیم پول دربیاوریم. بدون زمان هیچ چیز نداریم.» کلاس کاملاً ساکت شد. بعد خانم فاطمه لبخند زد. «زارا درست می‌گوید. زمان پایه‌ی همه‌ی آن‌هاست. هر ثانیه‌ای که داریم هدیه است.»",
                    vocabulary = listOf(
                        Word("fade", "تحلیل رفتن", "feɪd"),
                        Word("pause", "مکث کردن", "pɔːz"),
                        Word("meaningless", "بی‌معنی", "ˈmiːnɪŋləs"),
                        Word("legend", "افسانه", "ˈledʒənd"),
                        Word("gift", "هدیه", "ɡɪft")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why did Zara say time is the most important?",
                            questionPersian = "چرا زارا گفت زمان مهم‌ترینه؟",
                            options = listOf(
                                "It can be bought",
                                "It never comes back",
                                "It's free",
                                "It's short"
                            ),
                            correctIndex = 1,
                            explanation = "Zara said: 'Time is the only thing that never comes back.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What can we do with time according to Zara?",
                            questionPersian = "طبق گفته زارا با زمان چی می‌تونیم بکنیم؟",
                            options = listOf(
                                "Nothing",
                                "Earn money, heal bodies, build relationships",
                                "Only sleep",
                                "Only work"
                            ),
                            correctIndex = 1,
                            explanation = "With time we can earn money, heal our bodies, and build relationships."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Miss Fatima say about every second?",
                            questionPersian = "خانم فاطمه درباره هر ثانیه چی گفت؟",
                            options = listOf(
                                "It's useless",
                                "It's a gift",
                                "It's long",
                                "It's slow"
                            ),
                            correctIndex = 1,
                            explanation = "She said: 'Every second we have is a gift.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i6", title = "The Architect's Dream", titlePersian = "رویای معمار",
            level = Level.INTERMEDIATE,
            text = "A young architect dreams of building an impossible bridge.",
            moral = "Dreams require determination to become reality.", moralPersian = "رویاها برای واقعی شدن به اراده نیاز دارند.",
            coverUrl = "https://images.unsplash.com/photo-1545558014-8692077e9b5c?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "An Impossible Dream", titlePersian = "رویایی غیرممکن",
                    text = "In a small town divided by a wide, dangerous river, there lived a young architect named Kian. Every day, Kian watched people struggle to cross the river. There was only one old wooden bridge, and it was always crowded and often broken. People had drowned trying to swim across. Farmers lost their crops because they couldn't reach the market. Children couldn't go to school on the other side. Kian dreamed of building a grand bridge — a beautiful, strong bridge that would unite the two sides of the town forever. He drew sketches in his notebook. He studied bridge designs from around the world. When he showed his plans to the town council, they laughed. \"It's impossible,\" they said. But Kian did not give up.",
                    textPersian = "در شهر کوچکی که توسط رودخانه‌ای عریض و خطرناک تقسیم شده بود، معمار جوانی به نام کیان زندگی می‌کرد. هر روز تماشا می‌کرد که مردم برای عبور از رودخانه تقلا می‌کنند. فقط یک پل چوبی قدیمی بود که همیشه شلوغ و اغلب شکسته بود. مردم با تلاش برای شنا کردن غرق شده بودند. کیان رویای ساختن پلی باشکوه را داشت — پلی زیبا و محکم که دو طرف شهر را برای همیشه متحد کند. وقتی نقشه‌هایش را به شورای شهر نشان داد، خندیدند. «غیرممکن است.» اما کیان تسلیم نشد.",
                    vocabulary = listOf(
                        Word("architect", "معمار", "ˈɑːrkɪtekt"),
                        Word("struggle", "تقلا کردن", "ˈstrʌɡl"),
                        Word("drown", "غرق شدن", "draʊn"),
                        Word("sketch", "طرح", "sketʃ"),
                        Word("council", "شورا", "ˈkaʊnsl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the problem in the town?",
                            questionPersian = "مشکل شهر چی بود؟",
                            options = listOf(
                                "There was no water",
                                "The river was dangerous to cross",
                                "There was no school",
                                "There were no roads"
                            ),
                            correctIndex = 1,
                            explanation = "The river was dangerous, and only one old wooden bridge existed."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kian dream of building?",
                            questionPersian = "کیان رویای ساخت چی رو داشت؟",
                            options = listOf("A palace", "A grand bridge", "A tower", "A school"),
                            correctIndex = 1,
                            explanation = "He dreamed of building a grand bridge that would unite the two sides of the town."
                        ),
                        ChapterQuizQuestion(
                            question = "How did the town council react?",
                            questionPersian = "شورای شهر چطور واکنش نشون داد؟",
                            options = listOf(
                                "They agreed immediately",
                                "They laughed and said it was impossible",
                                "They gave him money",
                                "They ignored him"
                            ),
                            correctIndex = 1,
                            explanation = "The town council laughed and said: 'It's impossible.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Struggle", titlePersian = "سال‌های تلاش",
                    text = "Kian spent years working on his bridge design. He worked during the day as a carpenter to earn money. At night, he studied engineering, physics, and mathematics by candlelight. He traveled to distant cities to see famous bridges. He wrote letters to engineers around the world asking for advice. Some ignored him. A few wrote back with encouragement. One old engineer from Germany wrote: \"Your design is ambitious, but not impossible. The secret is in the foundation. Build the foundation deep and strong, and the bridge will stand for centuries.\" These words inspired Kian deeply. He refined his design. He found a new way to anchor the bridge to the rock beneath the river. After seven years of work, he presented his new plan to the town council. This time, they did not laugh. They listened carefully.",
                    textPersian = "کیان سال‌ها روی طراحی پلش کار کرد. روزها به عنوان نجار کار می‌کرد. شب‌ها با نور شمع مهندسی، فیزیک و ریاضی می‌خواند. به شهرهای دوردست سفر می‌کرد. یک مهندس پیر آلمانی نوشت: «طرح تو بلندپروازانه است، اما غیرممکن نیست. راز در پایه است. پایه را عمیق و محکم بساز، پل قرن‌ها می‌ایستد.» این کلمات کیان را عمیقاً الهام بخشید. بعد از هفت سال کار، طرح جدیدش را به شورا ارائه داد. این بار نخندیدند. با دقت گوش دادند.",
                    vocabulary = listOf(
                        Word("carpenter", "نجار", "ˈkɑːrpəntər"),
                        Word("encouragement", "تشویق", "ɪnˈkɜːrɪdʒmənt"),
                        Word("ambitious", "بلندپروازانه", "æmˈbɪʃəs"),
                        Word("anchor", "لنگر انداختن", "ˈæŋkər"),
                        Word("refine", "اصلاح کردن", "rɪˈfaɪn")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Kian do during the day?",
                            questionPersian = "کیان روزها چیکار می‌کرد؟",
                            options = listOf(
                                "Studied engineering",
                                "Worked as a carpenter",
                                "Slept",
                                "Traveled"
                            ),
                            correctIndex = 1,
                            explanation = "He worked as a carpenter during the day to earn money."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the German engineer advise Kian?",
                            questionPersian = "مهندس آلمانی به کیان چی توصیه کرد؟",
                            options = listOf(
                                "To give up",
                                "To build a strong foundation",
                                "To move to Germany",
                                "To find investors"
                            ),
                            correctIndex = 1,
                            explanation = "The engineer said: 'The secret is in the foundation.'"
                        ),
                        ChapterQuizQuestion(
                            question = "How long did it take Kian to present a new plan?",
                            questionPersian = "چند سال طول کشید تا کیان طرح جدید رو ارائه بده؟",
                            options = listOf("One year", "Three years", "Seven years", "Ten years"),
                            correctIndex = 2,
                            explanation = "After seven years of work, he presented his new plan."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Bridge for Generations", titlePersian = "پلی برای نسل‌ها",
                    text = "The town council was impressed. They agreed to fund half the project if Kian could raise the other half. Kian organized events and asked for donations. People who had once laughed now donated. Even the old engineer from Germany sent money. After two more years of fundraising and hard work, the bridge was finally ready to be built. It took three years to construct. There were storms and floods. There were injuries and setbacks. But Kian never gave up. On a bright spring morning, the last stone was placed. The town gathered at the river. Kian stood on the bridge with tears in his eyes. It was even more beautiful than he had imagined. The mayor announced that the bridge would be named \"Kian's Bridge.\" Kian shook his head. \"No,\" he said. \"Call it 'The Bridge of Dreams.' Because this bridge proves that no dream is impossible.\"",
                    textPersian = "شورای شهر تحت تأثیر قرار گرفت. موافقت کردند نیمی از پروژه را تأمین کنند اگر کیان نیم دیگر را جمع کند. کیان رویدادها سازماندهی کرد. حتی مهندس پیر آلمانی پول فرستاد. بعد از دو سال دیگر تلاش، پل بالاخره آماده ساخت شد. سه سال طول کشید. طوفان و سیل بود. اما کیان تسلیم نشد. یک صبح بهاری روشن، آخرین سنگ گذاشته شد. شهردار اعلام کرد پل «پل کیان» نامیده می‌شود. کیان سر تکان داد. «نه، اسمش را بگذارید 'پل رویاها.' چون این پل ثابت می‌کند هیچ رویایی غیرممکن نیست.»",
                    vocabulary = listOf(
                        Word("fund", "تأمین مالی کردن", "fʌnd"),
                        Word("donation", "کمک مالی", "doʊˈneɪʃn"),
                        Word("setback", "شکست", "ˈsetbæk"),
                        Word("construct", "ساختن", "kənˈstrʌkt"),
                        Word("symbolically", "نمادین", "sɪmˈbɑːlɪkli")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How did Kian raise the second half of the money?",
                            questionPersian = "کیان نیمه دوم پول رو چطور جمع کرد؟",
                            options = listOf(
                                "From the government",
                                "Through donations and events",
                                "From a bank loan",
                                "By selling his house"
                            ),
                            correctIndex = 1,
                            explanation = "Kian organized events and asked for donations."
                        ),
                        ChapterQuizQuestion(
                            question = "How long did it take to construct the bridge?",
                            questionPersian = "ساخت پل چقدر طول کشید؟",
                            options = listOf("One year", "Two years", "Three years", "Five years"),
                            correctIndex = 2,
                            explanation = "It took three years to construct the bridge."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kian want the bridge to be called?",
                            questionPersian = "کیان می‌خواست پل چی نامیده بشه؟",
                            options = listOf(
                                "Kian's Bridge",
                                "The Bridge of Dreams",
                                "Freedom Bridge",
                                "Hope Bridge"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'Call it The Bridge of Dreams.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i7", title = "The Silent Teacher", titlePersian = "معلم خاموش",
            level = Level.INTERMEDIATE,
            text = "A teacher never gives direct answers — he asks questions instead.",
            moral = "Good teachers teach you how to think.", moralPersian = "معلمان خوب به تو یاد می‌دهند چطور فکر کنی.",
            coverUrl = "https://images.unsplash.com/photo-1509062522246-3755977927d7?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Strange Teacher", titlePersian = "معلم عجیب",
                    text = "Everyone in the village talked about the strange teacher who lived at the top of the hill. His name was Master Behzad. Students came from far away to learn from him. But when they arrived, they were confused. Master Behzad rarely spoke. When a student asked a question, he would not answer. Instead, he would ask another question. \"Why do you want to know that?\" he might ask. Or, \"What do you think the answer is?\" At first, many students were frustrated. They had come to receive answers. Instead, they got more questions. Some students gave up and left. But the ones who stayed began to notice something strange. They were learning more than they ever had before — not from being told, but from discovering.",
                    textPersian = "همه در دهکده درباره معلم عجیبی که بالای تپه زندگی می‌کرد حرف می‌زدند. اسمش استاد بهزاد بود. دانش‌آموزان از دور می‌آمدند تا از او یاد بگیرند. اما وقتی می‌رسیدند، گیج می‌شدند. استاد بهزاد به‌ندرت حرف می‌زد. وقتی دانش‌آموزی سؤال می‌پرسید، پاسخ نمی‌داد. در عوض سؤال دیگری می‌پرسید. اولش خیلی از دانش‌آموزان کلافه می‌شدند. اما آن‌هایی که ماندند شروع کردند به توجه به چیز عجیبی. بیشتر از هر وقت دیگری یاد می‌گرفتند — نه از گفتن، بلکه از کشف کردن.",
                    vocabulary = listOf(
                        Word("rarely", "به‌ندرت", "ˈreərli"),
                        Word("frustrated", "کلافه", "ˈfrʌstreɪtɪd"),
                        Word("knowledge", "دانش", "ˈnɑːlɪdʒ"),
                        Word("discover", "کشف کردن", "dɪˈskʌvər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the strange teacher's name?",
                            questionPersian = "اسم معلم عجیب چی بود؟",
                            options = listOf("Master Farid", "Master Behzad", "Master Hassan", "Master Ali"),
                            correctIndex = 1,
                            explanation = "The strange teacher's name was Master Behzad."
                        ),
                        ChapterQuizQuestion(
                            question = "How did he respond to his students' questions?",
                            questionPersian = "او به سؤالات دانش‌آموزان چطور پاسخ می‌داد؟",
                            options = listOf(
                                "With direct answers",
                                "By asking another question",
                                "By ignoring them",
                                "By giving them books"
                            ),
                            correctIndex = 1,
                            explanation = "Instead of answering, he would ask another question."
                        ),
                        ChapterQuizQuestion(
                            question = "What happened to the students who stayed?",
                            questionPersian = "برای دانش‌آموزانی که ماندند چی اتفاق افتاد؟",
                            options = listOf(
                                "They got bored",
                                "They learned more than ever before",
                                "They became rich",
                                "They became teachers"
                            ),
                            correctIndex = 1,
                            explanation = "They were learning more than they ever had before."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Lesson of the Empty Cup", titlePersian = "درس فنجان خالی",
                    text = "One day, a wealthy young man came to learn from Master Behzad. He had studied at the best schools. He had read hundreds of books. He thought he knew almost everything. He spoke confidently about philosophy, science, and art. Master Behzad listened quietly. When the young man finished, Master Behzad poured tea into his cup. He kept pouring until the cup was full. Then he kept pouring. Tea spilled over the cup and onto the table. The young man jumped up. \"Stop! The cup is full!\" Master Behzad smiled and set down the teapot. \"You are like this cup,\" he said. \"You are so full of your own ideas that nothing new can enter. Come back when your cup is empty.\" The young man was stunned. He left that day feeling humiliated. But over the following weeks, he could not forget those words. Finally, he returned — humble and ready to truly learn.",
                    textPersian = "یک روز، مرد جوان ثروتمندی برای یادگیری از استاد بهزاد آمد. در بهترین مدارس درس خوانده بود. صدها کتاب خوانده بود. با اعتماد به نفس درباره فلسفه، علم و هنر حرف زد. استاد بهزاد آرام گوش داد. وقتی مرد جوان تمام کرد، استاد چای در فنجانش ریخت. تا فنجان پر شد ریخت. بعد ادامه داد. چای از فنجان روی میز ریخت. مرد جوان پرید. «بایست! فنجان پر است!» استاد لبخند زد. «تو مثل این فنجانی. آنقدر از ایده‌های خودت پر هستی که هیچ چیز جدیدی نمی‌تواند وارد شود. وقتی فنجانت خالی شد برگرد.»",
                    vocabulary = listOf(
                        Word("confidently", "با اعتماد به نفس", "ˈkɑːnfɪdəntli"),
                        Word("pour", "ریختن", "pɔːr"),
                        Word("stunned", "شوکه", "stʌnd"),
                        Word("humiliated", "خجالت‌زده", "hjuːˈmɪlieɪtɪd"),
                        Word("humble", "فروتن", "ˈhʌmbl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why did the young man think he knew everything?",
                            questionPersian = "چرا مرد جوان فکر می‌کرد همه چیز را می‌داند؟",
                            options = listOf(
                                "He was rich",
                                "He had studied at the best schools",
                                "He was old",
                                "He was famous"
                            ),
                            correctIndex = 1,
                            explanation = "He had studied at the best schools and read hundreds of books."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Master Behzad do with the tea?",
                            questionPersian = "استاد بهزاد با چای چیکار کرد؟",
                            options = listOf(
                                "Drank it",
                                "Kept pouring until it spilled",
                                "Gave it away",
                                "Threw it away"
                            ),
                            correctIndex = 1,
                            explanation = "He kept pouring tea until it spilled over the cup."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Master Behzad mean by 'the empty cup'?",
                            questionPersian = "استاد بهزاد از «فنجان خالی» چی منظورش بود؟",
                            options = listOf(
                                "To buy a new cup",
                                "To be open to new ideas",
                                "To drink more tea",
                                "To leave"
                            ),
                            correctIndex = 1,
                            explanation = "The young man was so full of his own ideas that nothing new could enter."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Teacher's Secret", titlePersian = "راز معلم",
                    text = "The young man studied with Master Behzad for five years. During those years, he never once received a direct answer. Every question led to more questions. Every problem led to deeper thought. He learned to sit with uncertainty. He learned to think from different angles. He learned to question his own assumptions. At the end of five years, the young man had become a wise teacher himself. On his last day, he asked Master Behzad one final question. \"Master, why did you never give me direct answers?\" Master Behzad looked at him with kind eyes and said, \"Because the answers you discover yourself are the ones you truly own. If I gave you answers, you would simply memorize them and forget them. But the truths you find through your own thinking — those become part of your soul.\" The young man bowed deeply. \"You taught me not what to think, but how to think.\"",
                    textPersian = "مرد جوان پنج سال با استاد بهزاد درس خواند. در آن سال‌ها، هرگز پاسخ مستقیمی نگرفت. یاد گرفت با عدم قطعیت بنشیند. یاد گرفت از زوایای مختلف فکر کند. در پایان پنج سال، خودش معلم دانایی شده بود. روز آخر، یک سؤال نهایی پرسید. «استاد، چرا هرگز پاسخ مستقیم ندادید؟» استاد با چشمان مهربان نگاهش کرد و گفت: «چون پاسخ‌هایی که خودت کشف می‌کنی، آن‌هایی هستند که واقعاً مالکشان می‌شوی. اگر پاسخ‌ها را به تو می‌دادم، فقط حفظ می‌کردی و فراموش می‌کردی. اما حقیقت‌هایی که از فکر خودت پیدا می‌کنی، بخشی از روحت می‌شوند.»",
                    vocabulary = listOf(
                        Word("uncertainty", "عدم قطعیت", "ʌnˈsɜːrtnti"),
                        Word("assumption", "فرض", "əˈsʌmpʃn"),
                        Word("memorize", "حفظ کردن", "ˈmeməraɪz"),
                        Word("soul", "روح", "soʊl"),
                        Word("mark", "نشانه", "mɑːrk")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How long did the young man study with Master Behzad?",
                            questionPersian = "مرد جوان چند سال با استاد بهزاد درس خواند؟",
                            options = listOf("One year", "Three years", "Five years", "Ten years"),
                            correctIndex = 2,
                            explanation = "He studied with Master Behzad for five years."
                        ),
                        ChapterQuizQuestion(
                            question = "Why did the master never give direct answers?",
                            questionPersian = "چرا استاد هرگز پاسخ مستقیم نمی‌داد؟",
                            options = listOf(
                                "He didn't know",
                                "Answers you discover yourself are the ones you truly own",
                                "He was lazy",
                                "It was a rule"
                            ),
                            correctIndex = 1,
                            explanation = "The master said: 'The answers you discover yourself are the ones you truly own.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did the young man learn from the master?",
                            questionPersian = "مرد جوان از استاد چی یاد گرفت؟",
                            options = listOf(
                                "What to think",
                                "How to think",
                                "To be quiet",
                                "To become rich"
                            ),
                            correctIndex = 1,
                            explanation = "The young man said: 'You taught me not what to think, but how to think.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i8", title = "The Two Travelers", titlePersian = "دو مسافر",
            level = Level.INTERMEDIATE,
            text = "Two travelers cross a desert with one bottle of water.",
            moral = "Balance is important in every decision.", moralPersian = "تعادل در هر تصمیمی مهم است.",
            coverUrl = "https://images.unsplash.com/photo-1509316785289-025f5b846b35?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "One Bottle of Water", titlePersian = "یک بطری آب",
                    text = "Two friends, Amir and Kamran, were traveling across a vast desert. They were trying to reach a distant city on the other side. The journey was long and dangerous. They had prepared well — food, maps, and supplies. But they had made one mistake. They had brought only one bottle of water. They had planned to refill at a well halfway through, but when they reached it, the well was dry. Now they were in the middle of the desert, with a single bottle between them. Amir said, \"We should save the water. If we drink it now, we will have nothing later.\" Kamran said, \"We should drink it now. We are thirsty. We need energy to walk.\" The two friends argued back and forth.",
                    textPersian = "دو دوست، امیر و کامران، در حال عبور از صحرایی وسیع بودند. تلاش می‌کردند به شهری دور در طرف دیگر برسند. سفر طولانی و خطرناک بود. خوب آماده شده بودند. اما یک اشتباه کرده بودند. فقط یک بطری آب آورده بودند. برنامه داشتند در نیمه راه از چاهی پر کنند، اما وقتی رسیدند، چاه خشک بود. امیر گفت: «باید آب را ذخیره کنیم.» کامران گفت: «باید حالا بنوشیم. تشنه‌ایم.» دو دوست بحث کردند.",
                    vocabulary = listOf(
                        Word("vast", "وسیع", "væst"),
                        Word("desert", "بیابان", "ˈdezərt"),
                        Word("supply", "لوازم", "səˈplaɪ"),
                        Word("endless", "بی‌پایان", "ˈendləs"),
                        Word("argue", "بحث کردن", "ˈɑːrɡjuː")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did the two friends bring with them?",
                            questionPersian = "دو دوست چی با خودشان آوردند؟",
                            options = listOf("Two bottles of water", "One bottle of water", "A well", "Only food"),
                            correctIndex = 1,
                            explanation = "They had brought only one bottle of water."
                        ),
                        ChapterQuizQuestion(
                            question = "What was wrong with the well they reached?",
                            questionPersian = "چاه که رسیدند چه مشکلی داشت؟",
                            options = listOf("It was full", "It was dry", "It was locked", "It was poisoned"),
                            correctIndex = 1,
                            explanation = "When they reached it, the well was dry."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Amir suggest?",
                            questionPersian = "امیر چی پیشنهاد داد؟",
                            options = listOf(
                                "Drink all the water",
                                "Save the water",
                                "Throw the water away",
                                "Go back home"
                            ),
                            correctIndex = 1,
                            explanation = "Amir said: 'We should save the water.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Long Night", titlePersian = "شبی طولانی",
                    text = "That night, as they sat under the stars, something unexpected happened. A young boy appeared out of nowhere. He looked tired and thirsty. His clothes were torn, and his lips were dry. \"Please,\" he said in a weak voice. \"I am lost. My family is in the next village. Please help me.\" Amir and Kamran looked at each other. They had only one bottle of water. Should they share it with a stranger? Amir hesitated. Kamran thought for a moment. Then Kamran said, \"We must help him. What is the point of saving water if we lose our humanity?\" Amir was not sure. \"But what about us? We need water too.\" Kamran replied, \"We give him a little. Just enough to help him reach the village. We can survive on less.\" Reluctantly, Amir agreed. The boy thanked them and disappeared into the night.",
                    textPersian = "آن شب، وقتی زیر ستاره‌ها نشسته بودند، پسری جوان ظاهر شد. خسته و تشنه به نظر می‌رسید. «لطفاً،» با صدای ضعیف گفت. «گم شده‌ام. خانواده‌ام در دهکده بعدی‌اند.» امیر و کامران به هم نگاه کردند. فقط یک بطری آب داشتند. کامران گفت: «باید کمکش کنیم. چه فایده‌ای دارد آب را ذخیره کنیم اگر انسانیت را از دست بدهیم؟» با اکراه، امیر موافقت کرد. پسر تشکر کرد و ناپدید شد.",
                    vocabulary = listOf(
                        Word("unexpected", "غیرمنتظره", "ˌʌnɪkˈspektɪd"),
                        Word("torn", "پاره", "tɔːrn"),
                        Word("hesitate", "تردید کردن", "ˈhezɪteɪt"),
                        Word("humanity", "انسانیت", "hjuːˈmænəti"),
                        Word("reluctantly", "با اکراه", "rɪˈlʌktəntli")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who appeared to them during the night?",
                            questionPersian = "شب کی به آن‌ها ظاهر شد؟",
                            options = listOf("An old man", "A young boy", "A woman", "A soldier"),
                            correctIndex = 1,
                            explanation = "A young boy appeared out of nowhere."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kamran want to do?",
                            questionPersian = "کامران می‌خواست چیکار کند؟",
                            options = listOf(
                                "Ignore the boy",
                                "Help the boy",
                                "Take the boy's things",
                                "Continue without water"
                            ),
                            correctIndex = 1,
                            explanation = "Kamran said: 'We must help him.'"
                        ),
                        ChapterQuizQuestion(
                            question = "Why did Kamran want to help the boy?",
                            questionPersian = "چرا کامران می‌خواست به پسر کمک کند؟",
                            options = listOf(
                                "For a reward",
                                "To not lose his humanity",
                                "Because they had extra water",
                                "To guide them"
                            ),
                            correctIndex = 1,
                            explanation = "Kamran said: 'What is the point of saving water if we lose our humanity?'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Balance of Life", titlePersian = "تعادل زندگی",
                    text = "The next morning, Kamran saw a small bag near where the boy had been sitting. He opened it. Inside were dates, nuts, and a small map. On the map was marked a well — one they had not known about. \"This boy was not a real boy,\" said Kamran. \"He was a test. And we passed.\" They followed the map and found the well. It was full of fresh, cool water. They drank and refilled their bottle. Years later, when telling the story, Kamran always said, \"Saving for tomorrow is wise. But ignoring the need of today is foolish. The key is not to hoard everything or spend everything, but to give what is needed, when it is needed. Kindness does not waste resources — it multiplies them.\"",
                    textPersian = "صبح روز بعد، کامران کیسه کوچکی دید. بازش کرد. داخلش خرما، آجیل و نقشه کوچکی بود. روی نقشه چاهی علامت‌گذاری شده بود. «این پسر واقعی نبود،» کامران گفت. «آزمون بود. و موفق شدیم.» نقشه را دنبال کردند و چاه را پیدا کردند. پر از آب تازه بود. سال‌ها بعد، کامران می‌گفت: «ذخیره کردن برای فردا عاقلانه است. اما نادیده گرفتن نیاز امروز احمقانه است. مهربانی منابع را تلف نمی‌کند — آن‌ها را چند برابر می‌کند.»",
                    vocabulary = listOf(
                        Word("date", "خرما", "deɪt"),
                        Word("hoard", "ذخیره کردن", "hɔːrd"),
                        Word("multiply", "چند برابر کردن", "ˈmʌltɪplaɪ"),
                        Word("extreme", "افراط", "ɪkˈstriːm"),
                        Word("meaningful", "معنادار", "ˈmiːnɪŋfl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Kamran find in the bag?",
                            questionPersian = "کامران چی توی کیسه پیدا کرد؟",
                            options = listOf("Gold coins", "Dates, nuts, and a map", "Water", "Books"),
                            correctIndex = 1,
                            explanation = "Inside were dates, nuts, and a small map."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the map show?",
                            questionPersian = "نقشه چی نشون می‌داد؟",
                            options = listOf("A city", "A well", "A village", "A tree"),
                            correctIndex = 1,
                            explanation = "On the map was marked a well they had not known about."
                        ),
                        ChapterQuizQuestion(
                            question = "What was the lesson?",
                            questionPersian = "درس این ماجرا چی بود؟",
                            options = listOf(
                                "Never help strangers",
                                "Kindness multiplies resources",
                                "Always save everything",
                                "Only think of yourself"
                            ),
                            correctIndex = 1,
                            explanation = "Kamran said: 'Kindness does not waste resources — it multiplies them.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i9", title = "The Lost Kingdom", titlePersian = "پادشاهی گمشده",
            level = Level.INTERMEDIATE,
            text = "A prince searches for a lost kingdom and finds wisdom instead.",
            moral = "The journey teaches more than the destination.", moralPersian = "سفر بیشتر از مقصد می‌آموزد.",
            coverUrl = "https://images.unsplash.com/photo-1533105079780-92b9be482077?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Emperor's Command", titlePersian = "فرمان امپراتور",
                    text = "Long ago, in a great empire, there lived an old emperor named Darius. He had one son, Prince Kaveh. The emperor had heard legends of a lost kingdom hidden somewhere in the mountains — a kingdom said to hold the secret of eternal happiness. Many had searched for it. None had returned. As the emperor grew older, he called his son to his side. \"Kaveh,\" he said, \"I am old. Before I die, I want to know the secret of that lost kingdom. Go and find it. Bring back its wisdom.\" Prince Kaveh, though young and untested, obeyed. He gathered a small company of loyal men and set off into the mountains. For months, they traveled through forests, rivers, and deserts. They faced wild animals, harsh weather, and empty stomachs. But they found no kingdom.",
                    textPersian = "زمان‌های دور، در امپراتوری بزرگی، امپراتور پیری به نام داریوش زندگی می‌کرد. یک پسر داشت، شاهزاده کاوه. امپراتور افسانه‌هایی درباره پادشاهی گمشده‌ای در کوه‌ها شنیده بود — پادشاهی که گفته می‌شد راز خوشبختی ابدی را در خود دارد. وقتی امپراتور پیرتر شد، پسرش را خواند. «کاوه، پیر شده‌ام. قبل از مرگ می‌خواهم راز آن پادشاهی گمشده را بدانم. برو و پیدایش کن. خردش را برگردان.» شاهزاده کاوه اطاعت کرد. ماه‌ها از جنگل‌ها، رودخانه‌ها و بیابان‌ها گذشتند. اما پادشاهی نیافتند.",
                    vocabulary = listOf(
                        Word("emperor", "امپراتور", "ˈempərər"),
                        Word("legend", "افسانه", "ˈledʒənd"),
                        Word("eternal", "ابدی", "ɪˈtɜːrnl"),
                        Word("obey", "اطاعت کردن", "əˈbeɪ"),
                        Word("harsh", "سخت", "hɑːrʃ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the emperor's name?",
                            questionPersian = "اسم امپراتور چی بود؟",
                            options = listOf("Cyrus", "Darius", "Arman", "Kaveh"),
                            correctIndex = 1,
                            explanation = "The old emperor's name was Darius."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the emperor ask his son to find?",
                            questionPersian = "امپراتور از پسرش خواست چی رو پیدا کنه؟",
                            options = listOf(
                                "A treasure",
                                "A lost kingdom",
                                "A weapon",
                                "A princess"
                            ),
                            correctIndex = 1,
                            explanation = "He asked his son to find the lost kingdom."
                        ),
                        ChapterQuizQuestion(
                            question = "Did Kaveh find the kingdom?",
                            questionPersian = "کاوه پادشاهی رو پیدا کرد؟",
                            options = listOf("Yes, quickly", "No, they found no kingdom", "Yes, after a year", "Only his men did"),
                            correctIndex = 1,
                            explanation = "They traveled for months but found no kingdom."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Old Hermit", titlePersian = "زاهد پیر",
                    text = "After a year of searching, Prince Kaveh was exhausted. His men had given up and returned home. Only he remained. One evening, he came across a small hut in the mountains. Smoke rose from its chimney. He knocked. An old hermit opened the door. He had long white hair and eyes that seemed to see through everything. \"Welcome, Prince,\" the hermit said, \"I have been expecting you.\" Kaveh was shocked. \"You know me?\" The hermit smiled. \"I know many things. You seek the lost kingdom. But tell me — what do you truly seek?\" Kaveh thought for a moment. \"I seek its wisdom,\" he said. \"The secret of eternal happiness.\" The hermit nodded slowly. \"Then you have already found it.\" Kaveh was confused. \"What do you mean?\" The hermit gestured to the world around them. \"Look,\" he said, \"at the sunset, the mountains, the stars. Look at the journey you have taken. Look at the courage you have shown, the lessons you have learned, the man you have become.\"",
                    textPersian = "بعد از یک سال جستجو، شاهزاده کاوه خسته بود. مردانش تسلیم شده و رفته بودند. فقط او مانده بود. یک عصر، کلبه کوچکی در کوه‌ها دید. در زد. زاهد پیری در را باز کرد. موهای بلند سفید داشت. «خوش آمدی شاهزاده،» زاهد گفت، «منتظرت بودم.» کاوه شوکه شد. «مرا می‌شناسی؟» زاهد لبخند زد. «چیزهای زیادی می‌دانم. به دنبال پادشاهی گمشده هستی. اما بگو — واقعاً چه می‌خواهی؟» کاوه فکر کرد. «خردش را می‌خواهم. راز خوشبختی ابدی.» زاهد آرام سر تکان داد. «پس قبلاً پیدایش کرده‌ای.»",
                    vocabulary = listOf(
                        Word("hermit", "زاهد", "ˈhɜːrmɪt"),
                        Word("exhausted", "خسته", "ɪɡˈzɔːstɪd"),
                        Word("gesture", "اشاره کردن", "ˈdʒestʃər"),
                        Word("courage", "شجاعت", "ˈkɜːrɪdʒ"),
                        Word("wisdom", "خرد", "ˈwɪzdəm")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who did Kaveh meet in the mountains?",
                            questionPersian = "کاوه در کوه‌ها با کی ملاقات کرد؟",
                            options = listOf("A soldier", "An old hermit", "A merchant", "A farmer"),
                            correctIndex = 1,
                            explanation = "He met an old hermit in a small hut."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the hermit say when Kaveh arrived?",
                            questionPersian = "زاهد وقتی کاوه رسید چی گفت؟",
                            options = listOf(
                                "Go away",
                                "I have been expecting you",
                                "Who are you?",
                                "You are lost"
                            ),
                            correctIndex = 1,
                            explanation = "The hermit said: 'Welcome, Prince. I have been expecting you.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did the hermit say Kaveh had already found?",
                            questionPersian = "زاهد گفت کاوه قبلاً چی رو پیدا کرده؟",
                            options = listOf("The kingdom", "Its wisdom", "The treasure", "His way home"),
                            correctIndex = 1,
                            explanation = "The hermit said: 'Then you have already found it' — referring to the wisdom."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Real Kingdom", titlePersian = "پادشاهی واقعی",
                    text = "The hermit continued, \"The lost kingdom is not a place on a map. It is a state of mind. It is found in the hearts of those who seek truth, who grow through struggle, who learn from every step of their journey. Every person who truly seeks finds it. But most look in the wrong place. They look for gold and palaces. They forget that the greatest treasure is within.\" Kaveh stood in silence. Tears filled his eyes. He realized that everything he had been looking for — peace, purpose, meaning — he had carried all along. When he arrived home, his father was near death. The emperor whispered, \"Did you find it?\" Kaveh held his father's hand and said, \"Yes, Father. I found it. It was never lost. It was always within me. The kingdom is not a place. It is the journey itself.\"",
                    textPersian = "زاهد ادامه داد: «پادشاهی گمشده جایی روی نقشه نیست. حالتی از ذهن است. در قلب کسانی یافت می‌شود که حقیقت را می‌جویند. بیشتر مردم جای اشتباه را نگاه می‌کنند. بزرگ‌ترین گنج در درون است.» کاوه در سکوت ایستاد. اشک چشمانش را پر کرد. فهمید هر چیزی که دنبالش بود — آرامش، هدف، معنا — همه را با خود داشت. وقتی به خانه رسید، پدرش نزدیک مرگ بود. امپراتور زمزمه کرد: «پیدایش کردی؟» کاوه دست پدرش را گرفت و گفت: «بله پدر. پیدایش کردم. هرگز گم نشده بود. همیشه درون من بود. پادشاهی یک مکان نیست. خود سفر است.»",
                    vocabulary = listOf(
                        Word("state of mind", "حالت ذهنی", ""),
                        Word("savor", "لذت بردن از", "ˈseɪvər"),
                        Word("purpose", "هدف", "ˈpɜːrpəs"),
                        Word("justice", "عدالت", "ˈdʒʌstɪs"),
                        Word("beloved", "محبوب", "bɪˈlʌvɪd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "According to the hermit, what is the lost kingdom?",
                            questionPersian = "طبق گفته زاهد، پادشاهی گمشده چیه؟",
                            options = listOf(
                                "A place on a map",
                                "A state of mind",
                                "A hidden treasure",
                                "A palace"
                            ),
                            correctIndex = 1,
                            explanation = "The hermit said: 'It is a state of mind.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kaveh realize?",
                            questionPersian = "کاوه چی رو فهمید؟",
                            options = listOf(
                                "That he wasted his time",
                                "That he had carried everything within him all along",
                                "That the kingdom was far away",
                                "That his father was wrong"
                            ),
                            correctIndex = 1,
                            explanation = "He realized that everything he was looking for — peace, purpose, meaning — he had carried all along."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kaveh tell his father?",
                            questionPersian = "کاوه به پدرش چی گفت؟",
                            options = listOf(
                                "The kingdom is a place",
                                "The kingdom is not a place. It is the journey itself",
                                "I couldn't find it",
                                "It doesn't exist"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'The kingdom is not a place. It is the journey itself.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i10", title = "The Real Treasure", titlePersian = "گنج واقعی",
            level = Level.INTERMEDIATE,
            text = "A merchant searches the world for treasure and finds it at home.",
            moral = "The greatest treasure is often at home.", moralPersian = "بزرگ‌ترین گنج اغلب در خانه است.",
            coverUrl = "https://images.unsplash.com/photo-1609220136736-443140cffec6?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Merchant's Quest", titlePersian = "جستجوی تاجر",
                    text = "Once there was a wealthy merchant named Sadegh. He had traveled to many countries and seen many wonders. But he was not happy. He always felt that somewhere out there, there was a treasure he had not yet found. One day, he heard a rumor. An old wise woman in his village said, \"There is a great treasure buried in a distant land. Whoever finds it will never want for anything again.\" That was all Sadegh needed to hear. He left his wife, his children, and his home, and set out to find this treasure. His wife begged him to stay. \"We have enough,\" she said. \"We have a home. We have children. We have love.\" But Sadegh shook his head. \"You don't understand,\" he said. \"This treasure will change our lives forever.\" And he walked away.",
                    textPersian = "روزی تاجر ثروتمندی به نام صادق بود. به کشورهای بسیاری سفر کرده بود. اما خوشحال نبود. یک روز، شایعه‌ای شنید. پیرزنی دانا گفت: «گنج بزرگی در سرزمینی دور دفن شده. هر کس پیدا کند، دیگر هرگز به چیزی نیاز ندارد.» صادق زنش و فرزندانش را ترک کرد و رفت. زنش التماس کرد بماند. «به اندازه کافی داریم.» اما صادق سر تکان داد. «نمی‌فهمی. این گنج زندگی‌مان را برای همیشه تغییر می‌دهد.»",
                    vocabulary = listOf(
                        Word("merchant", "تاجر", "ˈmɜːrtʃənt"),
                        Word("wonder", "شگفتی", "ˈwʌndər"),
                        Word("rumor", "شایعه", "ˈruːmər"),
                        Word("buried", "دفن شده", "ˈberid"),
                        Word("beg", "التماس کردن", "beɡ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why was Sadegh unhappy?",
                            questionPersian = "چرا صادق ناراضی بود؟",
                            options = listOf(
                                "He was poor",
                                "He felt there was a treasure he hadn't found",
                                "He was sick",
                                "He had no family"
                            ),
                            correctIndex = 1,
                            explanation = "He always felt there was a treasure he hadn't found."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the wise woman say?",
                            questionPersian = "پیرزن دانا چی گفت؟",
                            options = listOf(
                                "Stay home",
                                "There is a great treasure in a distant land",
                                "Give up",
                                "Your wife is right"
                            ),
                            correctIndex = 1,
                            explanation = "She said there was a great treasure buried in a distant land."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh's wife say?",
                            questionPersian = "همسر صادق چی گفت؟",
                            options = listOf(
                                "Go find the treasure",
                                "We have enough — home, children, love",
                                "Take me with you",
                                "You will fail"
                            ),
                            correctIndex = 1,
                            explanation = "She said: 'We have enough. We have a home. We have children. We have love.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Searching", titlePersian = "سال‌های جستجو",
                    text = "Sadegh traveled for years. He crossed oceans. He climbed mountains. He walked through jungles and deserts. He visited ancient temples and forgotten ruins. He consulted with priests, scholars, and mystics. He dug holes in a hundred places. He found gold, yes. He found jewels. He found things that made him richer. But none of them were the treasure. None of them satisfied the deep ache in his heart. Years passed. His hair turned gray. His body grew tired. One night, he sat alone in an abandoned hut in a foreign land. He was cold, hungry, and alone. He thought of his wife, his children, his home. He thought of the warmth of their kitchen, the sound of his children laughing, the touch of his wife's hand. And suddenly, he understood. Tears rolled down his face. He had been searching the whole world for a treasure that he had left behind.",
                    textPersian = "صادق سال‌ها سفر کرد. از اقیانوس‌ها گذشت. از کوه‌ها بالا رفت. از معابد باستانی بازدید کرد. صد جا چاله کند. طلا پیدا کرد. جواهرات پیدا کرد. اما هیچ‌کدام گنج نبود. سال‌ها گذشت. موهایش خاکستری شد. یک شب، تنها در کلبه‌ای متروک نشست. به زنش فکر کرد، به فرزندانش، به خانه‌اش. و ناگهان فهمید. اشک روی صورتش غلتید. تمام دنیا را برای گنجی جستجو کرده بود که پشت سر گذاشته بود.",
                    vocabulary = listOf(
                        Word("jungle", "جنگل", "ˈdʒʌŋɡl"),
                        Word("ruin", "خرابه", "ˈruːɪn"),
                        Word("mystic", "عارف", "ˈmɪstɪk"),
                        Word("abandoned", "متروک", "əˈbændənd"),
                        Word("ache", "درد", "eɪk")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Sadegh find during his travels?",
                            questionPersian = "صادق در طول سفرهایش چی پیدا کرد؟",
                            options = listOf(
                                "Nothing",
                                "Gold and jewels, but not the treasure",
                                "The treasure",
                                "His family"
                            ),
                            correctIndex = 1,
                            explanation = "He found gold and jewels, but none were the treasure he sought."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh realize one night?",
                            questionPersian = "صادق یک شب چی فهمید؟",
                            options = listOf(
                                "He needed more money",
                                "He had left behind the real treasure",
                                "He should dig deeper",
                                "He was lost"
                            ),
                            correctIndex = 1,
                            explanation = "He realized he had been searching the world for a treasure he had left behind."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh think about?",
                            questionPersian = "صادق به چی فکر کرد؟",
                            options = listOf(
                                "His gold",
                                "His wife, children, and home",
                                "His rivals",
                                "His next journey"
                            ),
                            correctIndex = 1,
                            explanation = "He thought of his wife, his children, his home, and their warmth."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Home at Last", titlePersian = "بالاخره خانه",
                    text = "Sadegh turned around and walked home. It took him almost a year to return. When he finally reached his village, his heart was beating fast. He walked to his door slowly. He knocked. His wife opened it. She was older now, her face lined with worry and years. She stared at him for a long moment. Then she burst into tears and threw her arms around him. \"You came back,\" she whispered. \"You came back.\" His children — now young adults — ran out and hugged him. That night, they sat together around the kitchen table. Sadegh told them everything. And then he said, \"I was looking for treasure. But I already had it. It was here, all along. The real treasure is the people who love you, the home you come back to, the family that waits for you.\" From that day on, Sadegh never left again.",
                    textPersian = "صادق برگشت و به خانه رفت. تقریباً یک سال طول کشید تا برگردد. وقتی به دهکده‌اش رسید، قلبش تند می‌زد. در زد. زنش بازش کرد. حالا مسن‌تر بود. لحظه‌ای طولانی به او خیره شد. بعد اشک ریخت و دستانش را دور او پیچید. «برگشتی.» بچه‌هایش — حالا بزرگسالان جوان — بیرون دویدند. آن شب، دور میز آشپزخانه نشستند. صادق گفت: «دنبال گنج می‌گشتم. اما قبلاً داشتمش. اینجا بود. گنج واقعی کسانی هستند که تو را دوست دارند، خانه‌ای که به آن برمی‌گردی، خانواده‌ای که منتظرت می‌ماند.»",
                    vocabulary = listOf(
                        Word("line", "چین و چروک", "laɪn"),
                        Word("burst into tears", "شروع به گریه کردن", ""),
                        Word("throw arms around", "در آغوش گرفتن", ""),
                        Word("emptiness", "خالی بودن", "ˈemptinəs"),
                        Word("wait for", "منتظر ماندن", "weɪt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How long did it take Sadegh to return home?",
                            questionPersian = "چقدر طول کشید تا صادق به خانه برگرده؟",
                            options = listOf("One month", "Six months", "Almost a year", "Five years"),
                            correctIndex = 2,
                            explanation = "It took him almost a year to return."
                        ),
                        ChapterQuizQuestion(
                            question = "How did Sadegh's wife react?",
                            questionPersian = "همسر صادق چطور واکنش نشون داد؟",
                            options = listOf(
                                "She was angry",
                                "She burst into tears and hugged him",
                                "She ignored him",
                                "She left"
                            ),
                            correctIndex = 1,
                            explanation = "She burst into tears and threw her arms around him."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh say was the real treasure?",
                            questionPersian = "صادق گفت گنج واقعی چیه؟",
                            options = listOf(
                                "Gold coins",
                                "The people who love you and the family that waits for you",
                                "Fame",
                                "Power"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'The real treasure is the people who love you, the home you come back to, the family that waits for you.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i11", title = "The Bridge Builder", titlePersian = "سازنده پل",
            level = Level.INTERMEDIATE,
            text = "An old man builds a bridge across a dangerous river.",
            moral = "Build for those who come after you.", moralPersian = "برای کسانی که بعد از تو می‌آیند بساز.",
            coverUrl = "https://images.unsplash.com/photo-1476514525535-07fb3b4ae5f1?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Dangerous River", titlePersian = "رودخانه خطرناک",
                    text = "In a valley between two mountains, there was a wide, rushing river. It was fast and cold, and the rocks beneath its surface were sharp. Many people had drowned trying to cross it. Travelers avoided this route entirely. Villages on either side of the river were isolated, unable to trade or visit each other. One day, an old man named Morteza came to the river. He was a carpenter, retired after a long life of work. He had heard about the river and the danger it caused. He stood on the bank and watched the water rush by. Then he said quietly to himself, \"Someone should build a bridge here.\" And then he added, \"Perhaps that someone should be me.\"",
                    textPersian = "در دره‌ای بین دو کوه، رودخانه‌ای عریض و خروشان بود. سریع و سرد بود و صخره‌های زیر سطحش تیز. بسیاری در تلاش برای عبور غرق شده بودند. یک روز، پیرمردی به نام مرتضی به رودخانه آمد. نجاری بود که بازنشسته شده بود. روی ساحل ایستاد و تماشا کرد. بعد آرام با خودش گفت: «یک نفر باید اینجا پل بسازد.» و بعد اضافه کرد: «شاید آن یک نفر من باشم.»",
                    vocabulary = listOf(
                        Word("rushing", "خروشان", "ˈrʌʃɪŋ"),
                        Word("drown", "غرق شدن", "draʊn"),
                        Word("isolated", "منزوی", "ˈaɪsəleɪtɪd"),
                        Word("carpenter", "نجار", "ˈkɑːrpəntər"),
                        Word("retired", "بازنشسته", "rɪˈtaɪərd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the problem in the valley?",
                            questionPersian = "مشکل دره چی بود؟",
                            options = listOf(
                                "There were no mountains",
                                "The river was dangerous to cross",
                                "There were no people",
                                "The weather was bad"
                            ),
                            correctIndex = 1,
                            explanation = "The river was fast, cold, and dangerous. Many had drowned."
                        ),
                        ChapterQuizQuestion(
                            question = "What was Morteza's profession?",
                            questionPersian = "شغل مرتضی چی بود؟",
                            options = listOf("Farmer", "Carpenter", "Blacksmith", "Teacher"),
                            correctIndex = 1,
                            explanation = "Morteza was a retired carpenter."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Morteza decide to do?",
                            questionPersian = "مرتضی تصمیم گرفت چیکار کنه؟",
                            options = listOf(
                                "Leave the valley",
                                "Build a bridge",
                                "Swim across",
                                "Find help"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'Perhaps that someone should be me' — meaning he would build the bridge."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Building", titlePersian = "سال‌های ساختن",
                    text = "Morteza began to plan. He studied the river, measuring its width and depth. He studied the rocks on both banks. He designed a bridge that could hold the weight of horses and carts. He began to gather wood and stone. Every day, he worked alone. He cut trees in the forest. He carried rocks from the mountainside. He built a wooden frame to support the bridge. The work was hard. The days were long. The winters were cold. But Morteza never stopped. Some people thought he was crazy. \"Why are you doing this?\" they asked. \"You are old. You will never use this bridge.\" Morteza smiled and replied, \"I am not building it for myself. I am building it for those who come after me.\" After five years of hard work, the bridge was finally complete.",
                    textPersian = "مرتضی شروع به برنامه‌ریزی کرد. رودخانه را مطالعه کرد. پلی طراحی کرد که می‌توانست وزن اسب‌ها و گاری‌ها را تحمل کند. هر روز تنها کار می‌کرد. درخت‌ها را می‌برید. سنگ‌ها را می‌آورد. کار سخت بود. اما مرتضی هرگز متوقف نشد. بعضی‌ها فکر می‌کردند دیوانه است. «چرا این کار را می‌کنی؟ پیری.» مرتضی لبخند می‌زد و پاسخ می‌داد: «آن را برای خودم نمی‌سازم. برای کسانی می‌سازم که بعد از من می‌آیند.» بعد از پنج سال کار سخت، پل بالاخره آماده شد.",
                    vocabulary = listOf(
                        Word("measure", "اندازه گرفتن", "ˈmeʒər"),
                        Word("frame", "اسکلت", "freɪm"),
                        Word("support", "حمایت کردن", "səˈpɔːrt"),
                        Word("crazy", "دیوانه", "ˈkreɪzi"),
                        Word("complete", "کامل", "kəmˈpliːt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How long did it take Morteza to build the bridge?",
                            questionPersian = "چقدر طول کشید تا مرتضی پل رو بسازه؟",
                            options = listOf("One year", "Three years", "Five years", "Ten years"),
                            correctIndex = 2,
                            explanation = "After five years of hard work, the bridge was complete."
                        ),
                        ChapterQuizQuestion(
                            question = "Why did people think Morteza was crazy?",
                            questionPersian = "چرا مردم فکر می‌کردند مرتضی دیوانه است؟",
                            options = listOf(
                                "He was old and would never use the bridge",
                                "He talked to himself",
                                "He left home",
                                "He was alone"
                            ),
                            correctIndex = 0,
                            explanation = "They said: 'You are old. You will never use this bridge.'"
                        ),
                        ChapterQuizQuestion(
                            question = "Why did Morteza build the bridge?",
                            questionPersian = "چرا مرتضی پل رو ساخت؟",
                            options = listOf(
                                "For money",
                                "For fame",
                                "For those who come after him",
                                "For himself"
                            ),
                            correctIndex = 2,
                            explanation = "He said: 'I am not building it for myself. I am building it for those who come after me.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Legacy", titlePersian = "میراث",
                    text = "A young traveler arrived at the bridge one day. He was amazed by its beauty and strength. \"Who built this?\" he asked a villager. \"An old man named Morteza,\" the villager replied. \"He is still alive. He lives over there.\" The traveler went to visit Morteza. He found the old man sitting on a bench, watching people cross the bridge. \"Why did you build this bridge, old man?\" the traveler asked. \"You will not cross it much longer.\" Morteza smiled. \"No, I will not,\" he said. \"But they will. And their children will. That is enough.\" The traveler asked, \"What is the greatest lesson you have learned?\" Morteza thought for a moment. \"We are all just passing through this world. The real question is not what we take with us, but what we leave behind.\"",
                    textPersian = "یک روز مسافر جوانی به پل رسید. از زیبایی و استحکامش شگفت‌زده شد. «این را چه کسی ساخت؟» پرسید. «پیرمردی به نام مرتضی.» مسافر به دیدن مرتضی رفت. پیرمرد را دید که روی نیمکتی نشسته و تماشا می‌کند. «چرا این پل را ساختی پیرمرد؟» مسافر پرسید. «زیاد از آن عبور نخواهی کرد.» مرتضی لبخند زد. «نه، نمی‌مانم. اما آن‌ها می‌مانند. بچه‌هایشان می‌مانند. همین کافی است.»",
                    vocabulary = listOf(
                        Word("contented", "راضی", "kənˈtentɪd"),
                        Word("moved", "متأثر", "muːvd"),
                        Word("legacy", "میراث", "ˈleɡəsi"),
                        Word("durable", "بادوام", "ˈdʊrəbl"),
                        Word("last", "دوام آوردن", "læst")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who came to visit Morteza?",
                            questionPersian = "کی به دیدن مرتضی آمد؟",
                            options = listOf("A soldier", "A young traveler", "A priest", "A merchant"),
                            correctIndex = 1,
                            explanation = "A young traveler came to visit Morteza."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Morteza say was the real question in life?",
                            questionPersian = "مرتضی گفت سؤال واقعی زندگی چیه؟",
                            options = listOf(
                                "How much money you make",
                                "What we leave behind",
                                "Where you travel",
                                "Who you know"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'The real question is not what we take with us, but what we leave behind.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What was Morteza's legacy?",
                            questionPersian = "میراث مرتضی چی بود؟",
                            options = listOf(
                                "His gold",
                                "The bridge he built",
                                "His house",
                                "His books"
                            ),
                            correctIndex = 1,
                            explanation = "His legacy was the bridge that would serve generations."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i12", title = "The Silent Bell", titlePersian = "زنگ خاموش",
            level = Level.INTERMEDIATE,
            text = "A village has a bell that only rings when someone tells a lie.",
            moral = "Self-deception is the deepest lie.", moralPersian = "خودفریبی عمیق‌ترین دروغ است.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Magic Bell", titlePersian = "زنگ جادویی",
                    text = "In a small village in the mountains, there was a legend. At the top of the highest tower in the village square, there was a bell. But not just any bell. This bell, the elders said, was magical. It would only ring when a lie was spoken in the village. If someone told a lie, the bell would ring out loudly for all to hear. For generations, the villagers had trusted this bell. It had exposed cheaters, liars, and deceivers. But in recent years, the bell had not rung at all. People had become more honest, or so they believed. The village was peaceful, and everyone trusted each other.",
                    textPersian = "در دهکده‌ای کوچک در کوه‌ها، افسانه‌ای بود. در بالای بلندترین برج، زنگی بود. اما نه هر زنگی. این زنگ، به گفته بزرگان، جادویی بود. فقط وقتی دروغی گفته می‌شد به صدا درمی‌آمد. نسل‌ها، اهالی به این زنگ اعتماد کرده بودند. اما در سال‌های اخیر، زنگ اصلاً به صدا درنیامده بود. مردم صادق‌تر شده بودند، یا حداقل این‌طور باور داشتند.",
                    vocabulary = listOf(
                        Word("legend", "افسانه", "ˈledʒənd"),
                        Word("tower", "برج", "ˈtaʊər"),
                        Word("expose", "افشا کردن", "ɪkˈspoʊz"),
                        Word("deceiver", "فریبکار", "dɪˈsiːvər"),
                        Word("peaceful", "آرام", "ˈpiːsfl")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was the legend about the bell?",
                            questionPersian = "افسانه درباره زنگ چی بود؟",
                            options = listOf(
                                "It rang every hour",
                                "It rang when someone told a lie",
                                "It brought rain",
                                "It called people to prayer"
                            ),
                            correctIndex = 1,
                            explanation = "The bell would ring when a lie was spoken in the village."
                        ),
                        ChapterQuizQuestion(
                            question = "Why had the bell not rung recently?",
                            questionPersian = "چرا زنگ اخیراً به صدا درنیامده بود؟",
                            options = listOf(
                                "It was broken",
                                "People had become more honest",
                                "Nobody spoke",
                                "It was removed"
                            ),
                            correctIndex = 1,
                            explanation = "People had become more honest, or so they believed."
                        ),
                        ChapterQuizQuestion(
                            question = "What had the bell done for generations?",
                            questionPersian = "زنگ برای نسل‌ها چیکار کرده بود؟",
                            options = listOf(
                                "Nothing",
                                "Exposed cheaters and liars",
                                "Rang constantly",
                                "Kept time"
                            ),
                            correctIndex = 1,
                            explanation = "It had exposed cheaters, liars, and deceivers."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Rich Man's Claim", titlePersian = "ادعای مرد ثروتمند",
                    text = "One day, a rich man named Karim called the entire village to the square. He stood before them with a proud smile. \"My friends,\" he announced, \"I have given all of my wealth to the poor. I have kept nothing for myself.\" The villagers were amazed. Some began to clap. Others cried tears of admiration. Everyone praised Karim. Some even began to call him a saint. But then, someone looked up at the tower. The bell had not rung. This surprised everyone. If Karim was telling the truth, the bell should be silent. And it was. So everyone believed him. But an old woman named Zahra watched him closely. She said nothing. But she noticed something. The bell was silent. But it should have rung.",
                    textPersian = "یک روز، مرد ثروتمندی به نام کریم تمام دهکده را به میدان خواند. «دوستان،» اعلام کرد، «تمام ثروتم را به فقرا داده‌ام.» اهالی شگفت‌زده شدند. همه کریم را تحسین کردند. اما بعد، یک نفر به برج نگاه کرد. زنگ به صدا درنیامده بود. اگر کریم حقیقت می‌گفت، زنگ باید ساکت باشد. و بود. اما پیرزنی به نام زهرا با دقت تماشایش می‌کرد. زنگ ساکت بود. اما باید به صدا درمی‌آمد.",
                    vocabulary = listOf(
                        Word("announce", "اعلام کردن", "əˈnaʊns"),
                        Word("wealth", "ثروت", "welθ"),
                        Word("admiration", "تحسین", "ˌædməˈreɪʃn"),
                        Word("vast", "وسیع", "væst"),
                        Word("saint", "قدیس", "seɪnt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Karim announce?",
                            questionPersian = "کریم چی اعلام کرد؟",
                            options = listOf(
                                "He was leaving the village",
                                "He had given all his wealth to the poor",
                                "He was building a house",
                                "He had found treasure"
                            ),
                            correctIndex = 1,
                            explanation = "Karim announced: 'I have given all of my wealth to the poor.'"
                        ),
                        ChapterQuizQuestion(
                            question = "Did the bell ring?",
                            questionPersian = "زنگ به صدا درآمد؟",
                            options = listOf("Yes", "No", "Only once", "It broke"),
                            correctIndex = 1,
                            explanation = "The bell had not rung."
                        ),
                        ChapterQuizQuestion(
                            question = "Who noticed something was wrong?",
                            questionPersian = "کی متوجه شد چیزی اشتباهه؟",
                            options = listOf("A young boy", "An old woman named Zahra", "The elders", "The priest"),
                            correctIndex = 1,
                            explanation = "An old woman named Zahra noticed something was wrong."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Truth Within", titlePersian = "حقیقت درون",
                    text = "That night, Zahra could not sleep. Something was wrong. The next morning, she went to Karim's house. She found him in his garden, counting his gold. He had lied. He had never given away anything. Zahra approached him. \"Karim,\" she said softly, \"you did not tell the truth yesterday.\" Karim jumped up, his face turning red. \"How dare you!\" he shouted. \"The bell didn't ring! So it wasn't a lie!\" Zahra shook her head. \"The bell didn't ring because the bell only rings for lies people know are lies. But your lie was different. You convinced yourself it was true. You told yourself you had given everything away — in your heart.\" Karim stood frozen. Then, slowly, he sat down on the ground and began to cry. He had fooled himself so completely that even the magic bell could not detect it. Because the deepest lies are not the ones we tell others. They are the ones we tell ourselves.",
                    textPersian = "آن شب، زهرا نتوانست بخوابد. صبح روز بعد، به خانه کریم رفت. او را در باغش یافت که داشت طلایش را می‌شمرد. دروغ گفته بود. زهرا به سمتش رفت. «کریم،» آرام گفت، «دیروز حقیقت را نگفتی.» کریم پرید. «چه جراتی داری! زنگ به صدا درنیامد!» زهرا سر تکان داد. «زنگ فقط برای دروغ‌هایی به صدا درمی‌آید که مردم می‌دانند دروغ هستند. اما تو خودت را متقاعد کردی که حقیقت است.» کریم یخ زد. بعد آرام روی زمین نشست و شروع به گریه کرد. چون عمیق‌ترین دروغ‌ها آن‌هایی هستند که به خودمان می‌گوییم.",
                    vocabulary = listOf(
                        Word("dare", "جرات کردن", "der"),
                        Word("convince", "متقاعد کردن", "kənˈvɪns"),
                        Word("frozen", "یخ‌زده", "ˈfroʊzn"),
                        Word("fool", "فریب دادن", "fuːl"),
                        Word("detect", "تشخیص دادن", "dɪˈtekt")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Zahra find at Karim's house?",
                            questionPersian = "زهرا در خانه کریم چی پیدا کرد؟",
                            options = listOf(
                                "Nothing",
                                "Karim counting his gold",
                                "Karim crying",
                                "Karim was gone"
                            ),
                            correctIndex = 1,
                            explanation = "She found him in his garden, counting his gold."
                        ),
                        ChapterQuizQuestion(
                            question = "Why hadn't the bell rung?",
                            questionPersian = "چرا زنگ به صدا درنیامده بود؟",
                            options = listOf(
                                "It was broken",
                                "Karim believed his own lie",
                                "No one was listening",
                                "It was too far"
                            ),
                            correctIndex = 1,
                            explanation = "The bell only rings for lies people know are lies. Karim had convinced himself it was true."
                        ),
                        ChapterQuizQuestion(
                            question = "What is the moral of this story?",
                            questionPersian = "درس اخلاقی این داستان چیه؟",
                            options = listOf(
                                "Never lie to others",
                                "Self-deception is the deepest lie",
                                "Don't be greedy",
                                "Always tell the truth"
                            ),
                            correctIndex = 1,
                            explanation = "Self-deception is the deepest lie — you can fool even yourself."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i13", title = "The Garden of Time", titlePersian = "باغ زمان",
            level = Level.INTERMEDIATE,
            text = "An old gardener plants trees he will never see grow.",
            moral = "We inherit and pass on the future.", moralPersian = "ما آینده را به ارث می‌بریم و منتقل می‌کنیم.",
            coverUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Old Gardener", titlePersian = "باغبان پیر",
                    text = "At the edge of a village, there was an old man named Baba Reza. He was famous for his garden. But his garden was strange. It was full of young trees — trees that would not produce fruit for decades. He had planted them when he was already very old. A young man came to visit him one day. \"Baba Reza,\" he asked, \"why do you plant trees you will never see grow? You are old. You will not live to eat their fruit. You will not rest in their shade.\" Baba Reza smiled. He gestured to a large oak tree nearby. \"You see that tree?\" he asked. \"It was planted by my grandfather. He never ate its fruit. He never rested in its shade. But I did. Every summer of my childhood, I played under it. He planted for me.\"",
                    textPersian = "در حاشیه یک دهکده، پیرمردی به نام بابا رضا بود. باغش عجیب بود. پر از درختان جوان — درختانی که دهه‌ها میوه نمی‌دادند. وقتی خودش خیلی پیر بود کاشته بودشان. مرد جوانی به دیدنش آمد. «بابا رضا، چرا درختانی می‌کاری که هرگز رشدشان را نمی‌بینی؟» بابا رضا به درخت بلوط بزرگی اشاره کرد. «آن درخت را می‌بینی؟ پدربزرگم کاشته بود. اما من کردم. هر تابستان کودکی‌ام زیرش بازی کردم. او برای من کاشت.»",
                    vocabulary = listOf(
                        Word("gardener", "باغبان", "ˈɡɑːrdnər"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("gesture", "اشاره کردن", "ˈdʒestʃər"),
                        Word("oak", "بلوط", "oʊk"),
                        Word("shade", "سایه", "ʃeɪd")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Why was Baba Reza's garden strange?",
                            questionPersian = "چرا باغ بابا رضا عجیب بود؟",
                            options = listOf(
                                "It had no trees",
                                "It was full of young trees that wouldn't produce fruit for decades",
                                "It was abandoned",
                                "It had only flowers"
                            ),
                            correctIndex = 1,
                            explanation = "His garden was full of young trees that would not produce fruit for decades."
                        ),
                        ChapterQuizQuestion(
                            question = "Who planted the oak tree in the story?",
                            questionPersian = "چه کسی درخت بلوط را کاشت؟",
                            options = listOf("Baba Reza", "His father", "His grandfather", "His son"),
                            correctIndex = 2,
                            explanation = "The oak tree was planted by Baba Reza's grandfather."
                        ),
                        ChapterQuizQuestion(
                            question = "Why did Baba Reza plant trees he would never see?",
                            questionPersian = "چرا بابا رضا درختانی کاشت که هرگز نمی‌دید؟",
                            options = listOf(
                                "For money",
                                "For others, like his grandfather did for him",
                                "By accident",
                                "For fun"
                            ),
                            correctIndex = 1,
                            explanation = "His grandfather had planted for him, so he planted for others."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Young Man's Question", titlePersian = "سوال مرد جوان",
                    text = "The young man, whose name was Arash, sat down beside Baba Reza. \"But isn't it sad?\" he asked. \"To work so hard and never see the result?\" Baba Reza shook his head slowly. \"No, my son,\" he said. \"It is not sad. It is beautiful. Do you know why?\" Arash said no. \"Because I am not just planting trees,\" Baba Reza said. \"I am planting hope. I am planting a future I will never see. I am trusting that those who come after me will be grateful.\" Arash asked, \"But what if no one appreciates it? What if the trees die?\" Baba Reza laughed softly. \"Then I will have failed. But it doesn't matter. Because the act of planting itself is the reward. I plant because it is right. Not because I need to see the result. Faith is not about knowing. It is about trusting.\"",
                    textPersian = "مرد جوان، که اسمش آرش بود، کنار بابا رضا نشست. «اما غمگین نیست؟» پرسید. «اینقدر سخت کار کردن و هرگز نتیجه را ندیدن؟» بابا رضا سر تکان داد. «نه پسرم. غمگین نیست. زیباست. چون فقط درخت نمی‌کارم. امید می‌کارم. اعتماد می‌کنم که کسانی که بعد از من می‌آیند سپاسگزار خواهند بود.» آرش پرسید: «اما اگر کسی ارزشش را نداند؟» بابا رضا خندید. «پس شکست خورده‌ام. اما اهمیتی ندارد. چون خود عمل کاشتن پاداش است. ایمان درباره دانستن نیست. درباره اعتماد کردن است.»",
                    vocabulary = listOf(
                        Word("appreciate", "ارزش دانستن", "əˈpriːʃieɪt"),
                        Word("grateful", "سپاسگزار", "ˈɡreɪtfl"),
                        Word("faith", "ایمان", "feɪθ"),
                        Word("reward", "پاداش", "rɪˈwɔːrd"),
                        Word("trust", "اعتماد کردن", "trʌst")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Baba Reza say he was planting?",
                            questionPersian = "بابا رضا گفت چی می‌کاره؟",
                            options = listOf("Trees only", "Hope and a future", "Flowers", "Food"),
                            correctIndex = 1,
                            explanation = "He said: 'I am planting hope. I am planting a future I will never see.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Baba Reza say about faith?",
                            questionPersian = "بابا رضا درباره ایمان چی گفت؟",
                            options = listOf(
                                "It's about knowing",
                                "It's about trusting",
                                "It's easy",
                                "It's unnecessary"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'Faith is not about knowing. It is about trusting.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What is the reward according to Baba Reza?",
                            questionPersian = "طبق گفته بابا رضا پاداش چیه؟",
                            options = listOf(
                                "Money",
                                "The act of planting itself",
                                "Recognition",
                                "Fruit"
                            ),
                            correctIndex = 1,
                            explanation = "He said: 'The act of planting itself is the reward.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Legacy of Forests", titlePersian = "میراثی از جنگل‌ها",
                    text = "Fifty years later, Arash was an old man himself. He had become a gardener, inspired by Baba Reza. He had planted hundreds of trees. Now he sat under a massive oak tree — one that Baba Reza had planted. The tree was enormous. Its branches stretched wide, offering shade to dozens of people. Children played beneath it. Birds nested in it. Arash looked up and saw his own grandchildren climbing its branches. He smiled and thought of Baba Reza. The old man had been right. The trees he had planted were not just trees. They were shadows for grandchildren he would never meet. Arash looked at his own young trees — trees he had planted for the future. He knew he would never see them grow tall. But that was okay. Because he had learned the greatest secret of all: The best things in life are not for us. They are for those who come after us.",
                    textPersian = "پنجاه سال بعد، آرش خودش پیرمردی بود. باغبان شده بود، با الهام از بابا رضا. صدها درخت کاشته بود. حالا زیر یک درخت بلوط عظیم نشسته بود — درختی که بابا رضا کاشته بود. بچه‌ها زیرش بازی می‌کردند. پرندگان در آن لانه داشتند. آرش به بالا نگاه کرد و نوه‌هایش را در حال بالا رفتن از شاخه‌ها دید. لبخند زد و به بابا رضا فکر کرد. درختانی که کاشته بود فقط درخت نبودند. سایه‌هایی برای نوه‌هایی که هرگز نمی‌دید بودند. بهترین چیزهای زندگی برای ما نیستند. برای کسانی هستند که بعد از ما می‌آیند.",
                    vocabulary = listOf(
                        Word("massive", "عظیم", "ˈmæsɪv"),
                        Word("nest", "لانه", "nest"),
                        Word("landslide", "رانش زمین", "ˈlændslaɪd"),
                        Word("ancestor", "اجداد", "ˈænsestər"),
                        Word("civilization", "تمدن", "ˌsɪvəlaɪˈzeɪʃn")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What had Arash become?",
                            questionPersian = "آرش چی شده بود؟",
                            options = listOf("A doctor", "A gardener", "A teacher",