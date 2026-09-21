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
                    text = "In a small kingdom long ago, there lived a wise judge named Farid. People came from far and wide to ask for his help. He was known for his fairness and his sharp mind. One morning, two men arrived at his court. Both claimed to own the same beautiful black horse. The first man, a rich merchant, said the horse had been stolen from him. The second man, a poor farmer, insisted that he had raised the horse from a foal. The judge listened carefully to both sides.",
                    textPersian = "در پادشاهی کوچک در زمان‌های دور، قاضی دانایی به نام فرید زندگی می‌کرد. مردم از دور و نزدیک برای کمک به او می‌آمدند. او به انصاف و ذهن تیزبینش معروف بود. یک صبح، دو مرد به دادگاهش آمدند. هر دو ادعا می‌کردند مالک همان اسب زیبای سیاه هستند. مرد اول تاجری ثروتمند بود و گفت اسب از او دزدیده شده. مرد دوم کشاورزی فقیر بود و اصرار داشت که اسب را از کره‌ای بزرگ کرده است.",
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
                    text = "The judge thought for a long moment. Then he smiled and said, \"Bring the horse to the courtyard and release him. Let the horse decide.\" Everyone was confused. The guards brought the horse to the courtyard. The judge ordered both men to stand on opposite sides of the yard. Then he untied the horse. The horse stood still for a moment, looking around. Then, without hesitation, he walked slowly toward the poor farmer. He nuzzled the farmer's chest. The judge declared, \"The horse knows his true master.\" The rich merchant was shocked.",
                    textPersian = "قاضی لحظه‌ای طولانی فکر کرد. بعد لبخند زد و گفت: «اسب را به حیاط بیاورید و آزادش کنید. بگذارید اسب تصمیم بگیرد.» همه گیج شدند. نگهبانان اسب را به حیاط آوردند. قاضی دستور داد هر دو مرد در دو طرف مخالف حیاط بایستند. اسب لحظه‌ای ایستاد و اطراف را نگاه کرد. بعد بدون تردید، آرام به سمت کشاورز فقیر راه رفت. قاضی اعلام کرد: «اسب ارباب واقعی‌اش را می‌شناسد.»",
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
                            options = listOf("Asked witnesses", "Let the horse choose", "Tossed a coin", "Divided the horse"),
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
                            options = listOf("That money wins", "That wisdom solves difficult problems", "That horses are dangerous", "That farmers are honest"),
                            correctIndex = 1,
                            explanation = "The judge's wisdom solved a difficult case."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Lesson of Wisdom", titlePersian = "درس خرد",
                    text = "After the case was closed, the poor farmer thanked the judge with tears in his eyes. \"How did you know?\" he asked. The judge smiled. \"A horse does not care about money or power. He cares about love and care. You raised him. You loved him. He remembers. Animals are wiser than many men.\" Years later, when the judge was very old, he was asked the secret of his wisdom. He said simply, \"I listen more than I speak. I watch more than I judge. And I always trust the truth.\"",
                    textPersian = "بعد از بسته شدن پرونده، کشاورز فقیر با چشمان پر از اشک از قاضی تشکر کرد. «چطور فهمیدید؟» پرسید. قاضی لبخند زد. «اسب به پول و قدرت اهمیت نمی‌دهد. به عشق و مراقبت اهمیت می‌دهد. تو او را بزرگ کردی. حیوانات از بسیاری از انسان‌ها عاقل‌ترند.» سال‌ها بعد، از او راز خردش را پرسیدند. گفت: «بیشتر از آنچه حرف می‌زنم گوش می‌دهم. و همیشه به حقیقت اعتماد می‌کنم.»",
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
                            options = listOf("Because of money", "Because he raised and loved him", "Because of the judge", "By coincidence"),
                            correctIndex = 1,
                            explanation = "The farmer had raised, fed, and loved the horse."
                        ),
                        ChapterQuizQuestion(
                            question = "What was the judge's secret of wisdom?",
                            questionPersian = "راز خرد قاضی چی بود؟",
                            options = listOf("To talk a lot", "To listen more than speak", "To be rich", "To be strong"),
                            correctIndex = 1,
                            explanation = "He said: 'I listen more than I speak. I watch more than I judge.'"
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
                    text = "When their father passed away, two brothers inherited his farm. The older brother, Karim, was strong and hardworking but also greedy. The younger brother, Nader, was gentle and fair. Their father's will said the farm should be divided equally. But Karim was not happy with this. \"I worked harder than you,\" he told Nader. \"I deserve the bigger part.\" Nader was hurt. \"Father loved us equally.\" But Karim would not listen. The two brothers stopped speaking. They divided the land with a fence and refused to cross it.",
                    textPersian = "وقتی پدرشان فوت کرد، دو برادر مزرعه‌اش را به ارث بردند. برادر بزرگتر، کریم، قوی و سخت‌کوش بود اما حریص هم بود. برادر کوچکتر، نادر، ملایم و منصف بود. وصیت پدرشان می‌گفت مزرعه باید به‌طور مساوی تقسیم شود. اما کریم راضی نبود. «من سخت‌تر از تو کار کردم.» نادر آزرده شد. اما کریم گوش نمی‌داد. دو برادر از حرف زدن با هم دست کشیدند.",
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
                            options = listOf("He sold the farm", "He said he deserved the bigger part", "He left home", "He broke the fence"),
                            correctIndex = 1,
                            explanation = "Karim said: 'I deserve the bigger part.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Lonely Winter", titlePersian = "زمستان تنها",
                    text = "That winter was the coldest in many years. One night, Karim heard a strange sound from his brother's side of the farm. It was coughing. Nader was sick. Karim tried to ignore it. But the coughing continued for hours. Karim could not sleep. His father's words came back to him: \"Brothers are like two hands — one cannot survive without the other.\" The next morning, he saw that no smoke was coming from Nader's chimney. Nader was too weak to light the fire. Karim's heart sank. He realized how foolish he had been.",
                    textPersian = "آن زمستان سردترین زمستان سال‌های بسیاری بود. یک شب، کریم صدای عجیبی از طرف برادرش شنید. سرفه بود. نادر بیمار بود. سرفه‌ها ساعت‌ها ادامه یافت. کریم نمی‌توانست بخوابد. حرف پدرش به یادش آمد: «برادرها مثل دو دست هستند — یکی بدون دیگری نمی‌تواند زنده بماند.» صبح روز بعد، دید که هیچ دودی از دودکش نادر نمی‌آید.",
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
                            options = listOf("It was too cold", "He was worried about his brother", "The noise was loud", "He was hungry"),
                            correctIndex = 1,
                            explanation = "Karim worried about his brother and thought about his father's words."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim notice the next morning?",
                            questionPersian = "کریم صبح روز بعد چی متوجه شد؟",
                            options = listOf("No smoke from Nader's chimney", "Nader went away", "Someone stole from the farm", "It was warmer"),
                            correctIndex = 0,
                            explanation = "No smoke was coming from Nader's chimney — Nader was too weak."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Two Hands Together", titlePersian = "دو دست با هم",
                    text = "Karim grabbed his coat and ran across the fence. He broke it down with his own hands. He ran to Nader's house. Nader was lying on the bed, pale and weak. Karim rushed to him. \"Nader! Wake up!\" Nader slowly opened his eyes. When he saw his brother, tears rolled down his cheeks. Karim hugged his brother tightly. \"I was a fool,\" he whispered. \"I'm so sorry.\" He built a fire, cooked hot soup, and stayed with Nader all week. Slowly, Nader recovered. \"Let's tear down the fence,\" said Karim. \"The farm was never ours to divide. It was father's gift to us — together.\"",
                    textPersian = "کریم کاپشنش را برداشت و از روی حصار دوید. با دستان خودش خرابش کرد. به خانه نادر دوید. نادر روی تخت دراز کشیده بود، رنگ‌پریده. کریم به سمتش دوید. «نادر! بیدار شو!» نادر آرام چشمانش را باز کرد. وقتی برادرش را دید، اشک روی گونه‌هایش غلتید. کریم برادرش را محکم در آغوش گرفت. «احمق بودم.» آتش روشن کرد، سوپ گرم پخت و تمام هفته با نادر ماند. «بیایید حصار را خراب کنیم. مزرعه هدیه پدر به ما بود — به هر دوی ما. با هم.»",
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
                            options = listOf("Called a doctor", "Broke the fence and helped him", "Sent food", "Ignored him"),
                            correctIndex = 1,
                            explanation = "Karim broke down the fence and rushed to help Nader."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim say to Nader?",
                            questionPersian = "کریم به نادر چی گفت؟",
                            options = listOf("I want the bigger part", "I was a fool. I'm sorry", "Leave the farm", "You should work harder"),
                            correctIndex = 1,
                            explanation = "Karim said: 'I was a fool. I'm sorry. I'm so sorry.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Karim suggest at the end?",
                            questionPersian = "کریم در پایان چی پیشنهاد داد؟",
                            options = listOf("To sell the farm", "To tear down the fence", "To move away", "To buy more land"),
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
                    text = "A young farmer named Behrouz lived in a small village. One day, an old traveler gave him a small bamboo seed. \"Plant this,\" the traveler said. \"Water it every day. But be patient — it will not grow quickly.\" Behrouz was curious. He had never grown bamboo before. He planted the seed in his garden and watered it every morning. After one month, nothing grew. His neighbors laughed. \"You're wasting your time!\" they said. But Behrouz kept watering. After one year, still nothing.",
                    textPersian = "کشاورز جوانی به نام بهروز در دهکده‌ای کوچک زندگی می‌کرد. یک روز، مسافری پیر دانه‌ی کوچک بامبو به او داد. «این را بکار. هر روز آبش بده. اما صبور باش.» بهروز دانه را در باغش کاشت و هر صبح آب داد. بعد از یک ماه، چیزی رشد نکرد. همسایه‌ها خندیدند. بعد از یک سال، هنوز هیچی.",
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
                            explanation = "He watered it every morning."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the neighbors say?",
                            questionPersian = "همسایه‌ها چی گفتند؟",
                            options = listOf("Great job!", "You're wasting your time", "Let's help", "Sell the seed"),
                            correctIndex = 1,
                            explanation = "His neighbors laughed and said: 'You're wasting your time!'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Hidden Roots", titlePersian = "ریشه‌های پنهان",
                    text = "Five years passed. Behrouz continued to water the seed every single day. He talked to it. He protected it from birds and insects. His neighbors had stopped laughing — now they felt sorry for him. Then one spring morning, Behrouz went to his garden as usual. And he stopped. A small green shoot was pushing through the soil! It was tiny, but it was alive. Behrouz fell to his knees with tears of joy. But what he did not know was that under the ground, the bamboo roots had been growing deeper and deeper all those years.",
                    textPersian = "پنج سال گذشت. بهروز هر روز دانه را آب داد. از پرنده‌ها و حشرات محافظتش کرد. همسایه‌ها دیگر نمی‌خندیدند. بعد یک صبح بهاری، جوانه‌ی سبز کوچکی از خاک بیرون آمد! بهروز با اشک شوق زانو زد. اما نمی‌دانست زیر زمین، ریشه‌های بامبو تمام آن سال‌ها عمیق‌تر رشد می‌کردند.",
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
                            options = listOf("Nothing", "The roots were growing", "Water collecting", "Animals digging"),
                            correctIndex = 1,
                            explanation = "The bamboo roots had been growing deeper and spreading wider."
                        ),
                        ChapterQuizQuestion(
                            question = "How did Behrouz react when he saw the shoot?",
                            questionPersian = "بهروز وقتی جوانه رو دید چطور واکنش نشون داد؟",
                            options = listOf("He cried with joy", "He got angry", "He was disappointed", "He ignored it"),
                            correctIndex = 0,
                            explanation = "Behrouz fell to his knees with tears of joy."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Forest of Bamboo", titlePersian = "جنگلی از بامبو",
                    text = "In the weeks that followed, something incredible happened. The bamboo grew and grew — not slowly, but with astonishing speed. In six weeks, it reached thirty meters tall! Neighbors came from all over the village to see this miracle. Behrouz smiled. \"For five years, it was growing underground,\" he explained. \"The roots were preparing the way.\" An old wise man in the village nodded and said, \"This is the way of all great things. The most important growth happens invisibly, deep inside, before anyone can see it.\"",
                    textPersian = "در هفته‌های بعد، اتفاق باورنکردنی افتاد. بامبو با سرعت حیرت‌انگیز رشد کرد. در شش هفته، به سی متر رسید! همسایه‌ها آمدند. بهروز لبخند زد: «پنج سال زیر زمین رشد می‌کرد. ریشه‌ها راه را آماده می‌کردند.» پیرمرد دانا گفت: «این راه همه چیزهای بزرگ است. مهم‌ترین رشد نامرئی اتفاق می‌افتد.»",
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
                            options = listOf("It's a waste of time", "The most important growth happens invisibly", "It's easy", "Only for plants"),
                            correctIndex = 1,
                            explanation = "He said: 'The most important growth happens invisibly, deep inside.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Behrouz do with the bamboo?",
                            questionPersian = "بهروز با بامبو چیکار کرد؟",
                            options = listOf("Sold it for gold", "Shared seeds with everyone", "Kept it secret", "Cut it down"),
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
                    text = "Long ago, in a beautiful kingdom surrounded by mountains, there ruled a king named Arman. King Arman was unlike any king before him. He did not care for gold or jewels. Instead, he used the kingdom's wealth to help the poor, feed the hungry, and educate the children. Every morning, he walked through the streets of his capital, talking to ordinary people. His advisors were worried. \"Your Majesty,\" they said, \"if you keep giving away the royal treasury, the kingdom will run out of money!\" The king smiled gently and replied, \"The more I give, the more I will receive.\"",
                    textPersian = "زمان‌های دور، پادشاهی به نام آرمان حکومت می‌کرد. به طلا و جواهرات اهمیت نمی‌داد. از ثروت پادشاهی برای کمک به فقرا استفاده می‌کرد. مشاورانش نگران بودند. «اگر مدام خزانه را ببخشید، پادشاهی پول کم می‌آورد!» پادشاه لبخند زد: «هر چه بیشتر بدهم، بیشتر دریافت خواهم کرد.»",
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
                            options = listOf("Built palaces", "Helped the poor and educated children", "Kept it", "Bought jewels"),
                            correctIndex = 1,
                            explanation = "He used the wealth to help the poor, feed the hungry, and educate children."
                        ),
                        ChapterQuizQuestion(
                            question = "What did his advisors warn him about?",
                            questionPersian = "مشاورانش درباره چی هشدار دادند؟",
                            options = listOf("Running out of money", "Losing the throne", "Bad weather", "Enemies"),
                            correctIndex = 0,
                            explanation = "They warned that the royal treasury would run out of money."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Test of Time", titlePersian = "آزمون زمان",
                    text = "Years passed. King Arman continued to give generously. He built schools, hospitals, and libraries. He gave land to farmers and tools to craftsmen. He made sure no child went hungry. His advisors grew more and more worried. \"The treasury is getting smaller!\" they warned. But the king was not worried. He had noticed something they had not. The kingdom was changing. Children who had once been poor were now educated. Farmers who had once been struggling were now prosperous. Crime had gone down. Laughter had gone up. And the kingdom's economy was thriving.",
                    textPersian = "سال‌ها گذشت. شاه آرمان به بخشندگی ادامه داد. مدرسه، بیمارستان و کتابخانه ساخت. مشاورانش نگران شدند. اما پادشاه نگران نبود. پادشاهی در حال تغییر بود. جنایت کم شده بود. خنده بیشتر شده بود. و اقتصاد پادشاهی شکوفا بود.",
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
                            options = listOf("It was getting poorer", "It was thriving and getting better", "Nothing changed", "It was at war"),
                            correctIndex = 1,
                            explanation = "The kingdom's economy was thriving, crime went down, and people were kinder."
                        ),
                        ChapterQuizQuestion(
                            question = "Why was the kingdom prospering?",
                            questionPersian = "چرا پادشاهی شکوفا بود؟",
                            options = listOf("Because of war", "Because educated and prosperous people worked harder", "Because of higher taxes", "By luck"),
                            correctIndex = 1,
                            explanation = "Children were educated, farmers prospered, and new businesses opened."
                        ),
                        ChapterQuizQuestion(
                            question = "What is the lesson here?",
                            questionPersian = "درس اینجا چیه؟",
                            options = listOf("Keep your money", "Generosity creates prosperity", "Trust no one", "War is good"),
                            correctIndex = 1,
                            explanation = "The king's generosity made the whole kingdom prosper."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Richer Kingdom", titlePersian = "پادشاهی ثروتمندتر",
                    text = "Twenty years after Arman became king, an ambassador from a neighboring kingdom visited. \"Your kingdom is the wealthiest and happiest I have ever visited,\" he said. The king took the ambassador on a tour. He showed him the schools, the hospitals, the farms where farmers grew more than enough food. \"When people feel safe and cared for,\" the king explained, \"they work harder, they create more, and they help each other. Everyone benefits.\" King Arman lived to be a very old man. The people built a statue of him with these words: \"The greatest wealth is not what you keep, but what you give.\"",
                    textPersian = "بیست سال پس از پادشاهی آرمان، سفیری از پادشاهی همسایه بازدید کرد. «پادشاهی شما ثروتمندترین جایی است که دیده‌ام.» پادشاه توضیح داد: «وقتی مردم احساس امنیت کنند، سخت‌تر کار می‌کنند و همه سود می‌برند.» مردم مجسمه‌ای از او ساختند: «بزرگ‌ترین ثروت آن چیزی نیست که نگه می‌داری، بلکه آن چیزی است که می‌بخشی.»",
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
                            options = listOf("It was luck", "When people feel safe and cared for, everyone benefits", "It was magic", "It was from war"),
                            correctIndex = 1,
                            explanation = "He said: 'When people feel safe and cared for, everyone benefits.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What was written on King Arman's statue?",
                            questionPersian = "روی مجسمه شاه آرمان چی نوشته شد؟",
                            options = listOf("Long live the king", "The greatest wealth is what you give", "King of kings", "Power and glory"),
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
                    text = "Miss Fatima was a wise teacher at a small school in Tehran. Her students loved her because she made them think. One morning, she walked into the classroom and wrote a question on the blackboard: \"What is the most important thing in life?\" The students looked at each other. \"Take out your notebooks,\" said Miss Fatima, \"and write your answer. You have ten minutes.\" The students began to write. After ten minutes, Miss Fatima collected the papers. She read them one by one aloud.",
                    textPersian = "خانم فاطمه معلم دانایی در مدرسه‌ای کوچک در تهران بود. دانش‌آموزانش دوستش داشتند چون به آن‌ها فکر کردن را یاد می‌داد. یک صبح، سؤالی روی تخته نوشت: «مهم‌ترین چیز در زندگی چیست؟» «دفترهایتان را دربیاورید و پاسخ را بنویسید. ده دقیقه وقت دارید.»",
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
                            options = listOf("What is love?", "What is the most important thing in life?", "What is success?", "What is happiness?"),
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
                    text = "The first answer said, \"Money.\" Miss Fatima smiled. \"Money is useful.\" The second answer said, \"Health.\" \"Health is precious.\" The third answer said, \"Family.\" Miss Fatima's eyes filled with warmth. Other answers followed: friendship, love, education, kindness, faith. But then Miss Fatima picked up one last paper. It was from a quiet girl named Zara. Miss Fatima read it slowly: \"Time.\" The class grew silent.",
                    textPersian = "پاسخ اول: «پول.» پاسخ دوم: «سلامتی.» پاسخ سوم: «خانواده.» پاسخ‌های دیگری: دوستی، عشق، آموزش، مهربانی. اما بعد آخرین کاغذ را برداشت. از دختر ساکتی به نام زارا بود. آرام خواند: «زمان.» کلاس ساکت شد.",
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
                            options = listOf("Money, Health, Family", "Love, Peace, Joy", "Time, Money, Family", "Health, Wealth, Love"),
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
                    text = "Miss Fatima looked at Zara. \"Explain your answer,\" she said gently. Zara stood up slowly. \"Money can be lost. Health can fade. Family can pass away. But time is the one thing we can never get back. With time, we can earn money. With time, we can heal our bodies. With time, we can build families and friendships. Without time, we have nothing. The most important thing in life is how we use our time.\" The class was completely silent. Then Miss Fatima smiled. \"Zara is right. Every second we have is a gift.\"",
                    textPersian = "خانم فاطمه به زارا نگاه کرد. «پاسخت را توضیح بده.» زارا آرام بلند شد. «پول می‌تواند از دست برود. سلامتی می‌تواند تحلیل برود. خانواده می‌تواند فوت کند. اما زمان تنها چیزی است که هرگز نمی‌توانیم برگردانیم. مهم‌ترین چیز در زندگی این است که چطور از زمانمان استفاده می‌کنیم.» کلاس ساکت شد. بعد خانم فاطمه لبخند زد. «زارا درست می‌گوید. هر ثانیه‌ای که داریم هدیه است.»",
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
                            options = listOf("It can be bought", "It never comes back", "It's free", "It's short"),
                            correctIndex = 1,
                            explanation = "Zara said: 'Time is the only thing that never comes back.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What can we do with time according to Zara?",
                            questionPersian = "طبق گفته زارا با زمان چی می‌تونیم بکنیم؟",
                            options = listOf("Nothing", "Earn money, heal bodies, build relationships", "Only sleep", "Only work"),
                            correctIndex = 1,
                            explanation = "With time we can earn money, heal our bodies, and build relationships."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Miss Fatima say about every second?",
                            questionPersian = "خانم فاطمه درباره هر ثانیه چی گفت؟",
                            options = listOf("It's useless", "It's a gift", "It's long", "It's slow"),
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
                    text = "In a small town divided by a wide, dangerous river, there lived a young architect named Kian. Every day, Kian watched people struggle to cross the river. There was only one old wooden bridge, and it was always crowded and often broken. People had drowned trying to swim across. Kian dreamed of building a grand bridge. He drew sketches in his notebook. When he showed his plans to the town council, they laughed. \"It's impossible,\" they said. But Kian did not give up.",
                    textPersian = "در شهر کوچکی که توسط رودخانه‌ای خطرناک تقسیم شده بود، معمار جوانی به نام کیان زندگی می‌کرد. فقط یک پل چوبی قدیمی بود که همیشه شلوغ و اغلب شکسته بود. کیان رویای ساختن پلی باشکوه را داشت. وقتی نقشه‌هایش را به شورای شهر نشان داد، خندیدند. «غیرممکن است.» اما کیان تسلیم نشد.",
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
                            options = listOf("There was no water", "The river was dangerous to cross", "There was no school", "There were no roads"),
                            correctIndex = 1,
                            explanation = "The river was dangerous, and only one old wooden bridge existed."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kian dream of building?",
                            questionPersian = "کیان رویای ساخت چی رو داشت؟",
                            options = listOf("A palace", "A grand bridge", "A tower", "A school"),
                            correctIndex = 1,
                            explanation = "He dreamed of building a grand bridge."
                        ),
                        ChapterQuizQuestion(
                            question = "How did the town council react?",
                            questionPersian = "شورای شهر چطور واکنش نشون داد؟",
                            options = listOf("They agreed immediately", "They laughed and said it was impossible", "They gave him money", "They ignored him"),
                            correctIndex = 1,
                            explanation = "The town council laughed and said: 'It's impossible.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Struggle", titlePersian = "سال‌های تلاش",
                    text = "Kian spent years working on his bridge design. He worked during the day as a carpenter to earn money. At night, he studied engineering and mathematics by candlelight. He wrote letters to engineers around the world asking for advice. One old engineer from Germany wrote: \"Your design is ambitious, but not impossible. The secret is in the foundation.\" These words inspired Kian. He refined his design. After seven years of work, he presented his new plan to the town council. This time, they did not laugh.",
                    textPersian = "کیان سال‌ها روی طراحی پلش کار کرد. روزها نجار بود. شب‌ها مهندسی می‌خواند. یک مهندس پیر آلمانی نوشت: «راز در پایه است.» این کلمات کیان را الهام بخشید. بعد از هفت سال کار، طرح جدیدش را به شورا ارائه داد. این بار نخندیدند.",
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
                            options = listOf("Studied engineering", "Worked as a carpenter", "Slept", "Traveled"),
                            correctIndex = 1,
                            explanation = "He worked as a carpenter during the day."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the German engineer advise Kian?",
                            questionPersian = "مهندس آلمانی به کیان چی توصیه کرد؟",
                            options = listOf("To give up", "To build a strong foundation", "To move to Germany", "To find investors"),
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
                    text = "The town council was impressed. They agreed to fund half the project if Kian could raise the other half. Kian organized events and asked for donations. Even the old engineer from Germany sent money. After two more years, the bridge was ready to be built. It took three years to construct. There were storms and floods. But Kian never gave up. On a bright spring morning, the last stone was placed. Kian stood on the bridge with tears in his eyes. The mayor announced that the bridge would be named \"Kian's Bridge.\" Kian shook his head. \"No,\" he said. \"Call it 'The Bridge of Dreams.' Because this bridge proves that no dream is impossible.\"",
                    textPersian = "شورای شهر تحت تأثیر قرار گرفت. کیان رویدادها سازماندهی کرد. حتی مهندس پیر آلمانی پول فرستاد. بعد از دو سال دیگر، پل آماده ساخت شد. سه سال طول کشید. اما کیان تسلیم نشد. کیان سر تکان داد. «نه، اسمش را بگذارید 'پل رویاها.' چون این پل ثابت می‌کند هیچ رویایی غیرممکن نیست.»",
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
                            options = listOf("From the government", "Through donations and events", "From a bank loan", "By selling his house"),
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
                            options = listOf("Kian's Bridge", "The Bridge of Dreams", "Freedom Bridge", "Hope Bridge"),
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
                    text = "Everyone in the village talked about the strange teacher who lived at the top of the hill. His name was Master Behzad. Students came from far away to learn from him. But when they arrived, they were confused. Master Behzad rarely spoke. When a student asked a question, he would not answer. Instead, he would ask another question. \"Why do you want to know that?\" he might ask. Or, \"What do you think the answer is?\" At first, many students were frustrated. Some students gave up and left. But the ones who stayed began to notice something strange. They were learning more than they ever had before.",
                    textPersian = "همه در دهکده درباره معلم عجیبی که بالای تپه زندگی می‌کرد حرف می‌زدند. اسمش استاد بهزاد بود. وقتی دانش‌آموزی سؤال می‌پرسید، پاسخ نمی‌داد. در عوض سؤال دیگری می‌پرسید. اولش خیلی از دانش‌آموزان کلافه می‌شدند. اما آن‌هایی که ماندند شروع کردند به توجه به چیز عجیبی. بیشتر از هر وقت دیگری یاد می‌گرفتند.",
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
                            options = listOf("With direct answers", "By asking another question", "By ignoring them", "By giving them books"),
                            correctIndex = 1,
                            explanation = "Instead of answering, he would ask another question."
                        ),
                        ChapterQuizQuestion(
                            question = "What happened to the students who stayed?",
                            questionPersian = "برای دانش‌آموزانی که ماندند چی اتفاق افتاد؟",
                            options = listOf("They got bored", "They learned more than ever before", "They became rich", "They became teachers"),
                            correctIndex = 1,
                            explanation = "They were learning more than they ever had before."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Lesson of the Empty Cup", titlePersian = "درس فنجان خالی",
                    text = "One day, a wealthy young man came to learn from Master Behzad. He had studied at the best schools. He thought he knew almost everything. When the young man finished, Master Behzad poured tea into his cup. He kept pouring until the cup was full. Then he kept pouring. Tea spilled over the cup and onto the table. The young man jumped up. \"Stop! The cup is full!\" Master Behzad smiled. \"You are like this cup. You are so full of your own ideas that nothing new can enter. Come back when your cup is empty.\"",
                    textPersian = "یک روز، مرد جوان ثروتمندی برای یادگیری از استاد بهزاد آمد. استاد چای در فنجانش ریخت. تا فنجان پر شد ریخت. بعد ادامه داد. چای از فنجان روی میز ریخت. استاد لبخند زد. «تو مثل این فنجانی. آنقدر از ایده‌های خودت پر هستی که هیچ چیز جدیدی نمی‌تواند وارد شود. وقتی فنجانت خالی شد برگرد.»",
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
                            options = listOf("He was rich", "He had studied at the best schools", "He was old", "He was famous"),
                            correctIndex = 1,
                            explanation = "He had studied at the best schools and read hundreds of books."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Master Behzad do with the tea?",
                            questionPersian = "استاد بهزاد با چای چیکار کرد؟",
                            options = listOf("Drank it", "Kept pouring until it spilled", "Gave it away", "Threw it away"),
                            correctIndex = 1,
                            explanation = "He kept pouring tea until it spilled over the cup."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Master Behzad mean by 'the empty cup'?",
                            questionPersian = "استاد بهزاد از «فنجان خالی» چی منظورش بود؟",
                            options = listOf("To buy a new cup", "To be open to new ideas", "To drink more tea", "To leave"),
                            correctIndex = 1,
                            explanation = "The young man was so full of his own ideas that nothing new could enter."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Teacher's Secret", titlePersian = "راز معلم",
                    text = "The young man studied with Master Behzad for five years. Every question led to more questions. At the end of five years, the young man had become a wise teacher himself. On his last day, he asked Master Behzad one final question. \"Master, why did you never give me direct answers?\" Master Behzad said, \"Because the answers you discover yourself are the ones you truly own. If I gave you answers, you would simply memorize them and forget them. But the truths you find through your own thinking — those become part of your soul.\" The young man bowed deeply. \"You taught me not what to think, but how to think.\"",
                    textPersian = "مرد جوان پنج سال با استاد بهزاد درس خواند. در پایان پنج سال، خودش معلم دانایی شده بود. روز آخر پرسید: «استاد، چرا هرگز پاسخ مستقیم ندادید؟» استاد گفت: «چون پاسخ‌هایی که خودت کشف می‌کنی، آن‌هایی هستند که واقعاً مالکشان می‌شوی. اما حقیقت‌هایی که از فکر خودت پیدا می‌کنی، بخشی از روحت می‌شوند.» مرد جوان گفت: «به من یاد دادید چه فکر نکنم، بلکه چطور فکر کنم.»",
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
                            options = listOf("He didn't know", "Answers you discover yourself are the ones you truly own", "He was lazy", "It was a rule"),
                            correctIndex = 1,
                            explanation = "The master said: 'The answers you discover yourself are the ones you truly own.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did the young man learn from the master?",
                            questionPersian = "مرد جوان از استاد چی یاد گرفت؟",
                            options = listOf("What to think", "How to think", "To be quiet", "To become rich"),
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
                    text = "Two friends, Amir and Kamran, were traveling across a vast desert. The journey was long and dangerous. They had prepared well — food, maps, and supplies. But they had made one mistake. They had brought only one bottle of water. They had planned to refill at a well halfway through, but when they reached it, the well was dry. Amir said, \"We should save the water.\" Kamran said, \"We should drink it now.\" The two friends argued back and forth.",
                    textPersian = "دو دوست، امیر و کامران، در حال عبور از صحرایی وسیع بودند. فقط یک بطری آب آورده بودند. برنامه داشتند از چاهی پر کنند، اما چاه خشک بود. امیر گفت: «باید آب را ذخیره کنیم.» کامران گفت: «باید حالا بنوشیم.» دو دوست بحث کردند.",
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
                            options = listOf("Drink all the water", "Save the water", "Throw the water away", "Go back home"),
                            correctIndex = 1,
                            explanation = "Amir said: 'We should save the water.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Long Night", titlePersian = "شبی طولانی",
                    text = "That night, as they sat under the stars, a young boy appeared out of nowhere. He looked tired and thirsty. \"Please,\" he said. \"I am lost. My family is in the next village. Please help me.\" Kamran said, \"We must help him. What is the point of saving water if we lose our humanity?\" Amir was not sure. But Kamran replied, \"We give him a little. Just enough to help him reach the village.\" Reluctantly, Amir agreed. The boy thanked them and disappeared into the night.",
                    textPersian = "آن شب، پسری جوان ظاهر شد. خسته و تشنه. «لطفاً، گم شده‌ام. خانواده‌ام در دهکده بعدی‌اند.» کامران گفت: «باید کمکش کنیم. چه فایده‌ای دارد آب را ذخیره کنیم اگر انسانیت را از دست بدهیم؟» با اکراه، امیر موافقت کرد.",
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
                            options = listOf("Ignore the boy", "Help the boy", "Take the boy's things", "Continue without water"),
                            correctIndex = 1,
                            explanation = "Kamran said: 'We must help him.'"
                        ),
                        ChapterQuizQuestion(
                            question = "Why did Kamran want to help the boy?",
                            questionPersian = "چرا کامران می‌خواست به پسر کمک کند؟",
                            options = listOf("For a reward", "To not lose his humanity", "Because they had extra water", "To guide them"),
                            correctIndex = 1,
                            explanation = "Kamran said: 'What is the point of saving water if we lose our humanity?'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Balance of Life", titlePersian = "تعادل زندگی",
                    text = "The next morning, Kamran saw a small bag near where the boy had been sitting. Inside were dates, nuts, and a small map. On the map was marked a well — one they had not known about. \"This boy was not a real boy,\" said Kamran. \"He was a test. And we passed.\" They followed the map and found the well. It was full of fresh, cool water. Years later, Kamran always said, \"Saving for tomorrow is wise. But ignoring the need of today is foolish. Kindness does not waste resources — it multiplies them.\"",
                    textPersian = "صبح روز بعد، کامران کیسه کوچکی دید. داخلش خرما، آجیل و نقشه کوچکی بود. روی نقشه چاهی علامت‌گذاری شده بود. «این پسر واقعی نبود. آزمون بود. و موفق شدیم.» نقشه را دنبال کردند و چاه را پیدا کردند. سال‌ها بعد، کامران می‌گفت: «مهربانی منابع را تلف نمی‌کند — آن‌ها را چند برابر می‌کند.»",
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
                            options = listOf("Never help strangers", "Kindness multiplies resources", "Always save everything", "Only think of yourself"),
                            correctIndex = 1,
                            explanation = "Kamran said: 'Kindness does not waste resources — it multiplies them.'"
                        )
                    )
                )
            )
        )        ,

        Story(
            id = "s_i9", title = "The Lost Kingdom", titlePersian = "پادشاهی گمشده",
            level = Level.INTERMEDIATE,
            text = "A prince searches for a lost kingdom and finds wisdom instead.",
            moral = "The journey teaches more than the destination.", moralPersian = "سفر بیشتر از مقصد می‌آموزد.",
            coverUrl = "https://images.unsplash.com/photo-1533105079780-92b9be482077?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Emperor's Command", titlePersian = "فرمان امپراتور",
                    text = "Long ago, in a great empire, there lived an old emperor named Darius. He had one son, Prince Kaveh. The emperor had heard legends of a lost kingdom hidden somewhere in the mountains. As the emperor grew older, he called his son. \"Kaveh,\" he said, \"I am old. Before I die, I want to know the secret of that lost kingdom. Go and find it.\" Prince Kaveh obeyed. He gathered a small company of loyal men and set off into the mountains. For months, they traveled through forests, rivers, and deserts. But they found no kingdom.",
                    textPersian = "زمان‌های دور، امپراتور پیری به نام داریوش زندگی می‌کرد. یک پسر داشت، شاهزاده کاوه. امپراتور افسانه‌هایی درباره پادشاهی گمشده‌ای در کوه‌ها شنیده بود. «کاوه، پیر شده‌ام. قبل از مرگ می‌خواهم راز آن پادشاهی گمشده را بدانم. برو و پیدایش کن.» شاهزاده کاوه اطاعت کرد. ماه‌ها از جنگل‌ها گذشتند. اما پادشاهی نیافتند.",
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
                            options = listOf("A treasure", "A lost kingdom", "A weapon", "A princess"),
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
                    text = "After a year of searching, Prince Kaveh was exhausted. His men had given up and returned home. Only he remained. One evening, he came across a small hut in the mountains. An old hermit opened the door. \"Welcome, Prince,\" the hermit said, \"I have been expecting you.\" Kaveh was shocked. \"You know me?\" The hermit smiled. \"I know many things. You seek the lost kingdom. But tell me — what do you truly seek?\" Kaveh thought for a moment. \"I seek its wisdom,\" he said. The hermit nodded slowly. \"Then you have already found it.\" Kaveh was confused. The hermit gestured to the world around them. \"Look at the journey you have taken. Look at the courage you have shown, the lessons you have learned, the man you have become.\"",
                    textPersian = "بعد از یک سال جستجو، شاهزاده کاوه خسته بود. یک عصر، کلبه کوچکی دید. زاهد پیری در را باز کرد. «خوش آمدی شاهزاده، منتظرت بودم.» کاوه شوکه شد. «مرا می‌شناسی؟» زاهد لبخند زد. «به دنبال پادشاهی گمشده هستی. اما بگو — واقعاً چه می‌خواهی؟» کاوه فکر کرد. «خردش را می‌خواهم.» زاهد سر تکان داد. «پس قبلاً پیدایش کرده‌ای.»",
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
                            options = listOf("Go away", "I have been expecting you", "Who are you?", "You are lost"),
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
                    text = "The hermit continued, \"The lost kingdom is not a place on a map. It is a state of mind. It is found in the hearts of those who seek truth. Every person who truly seeks finds it. But most look in the wrong place. They look for gold and palaces. They forget that the greatest treasure is within.\" Kaveh stood in silence. He realized that everything he had been looking for — peace, purpose, meaning — he had carried all along. When he arrived home, his father was near death. The emperor whispered, \"Did you find it?\" Kaveh held his father's hand and said, \"Yes, Father. It was never lost. It was always within me. The kingdom is not a place. It is the journey itself.\"",
                    textPersian = "زاهد ادامه داد: «پادشاهی گمشده جایی روی نقشه نیست. حالتی از ذهن است. در قلب کسانی یافت می‌شود که حقیقت را می‌جویند. بزرگ‌ترین گنج در درون است.» کاوه در سکوت ایستاد. فهمید هر چیزی که دنبالش بود — آرامش، هدف، معنا — همه را با خود داشت. وقتی به خانه رسید، پدرش نزدیک مرگ بود. «بله پدر. پیدایش کردم. هرگز گم نشده بود. همیشه درون من بود. پادشاهی یک مکان نیست. خود سفر است.»",
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
                            options = listOf("A place on a map", "A state of mind", "A hidden treasure", "A palace"),
                            correctIndex = 1,
                            explanation = "The hermit said: 'It is a state of mind.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kaveh realize?",
                            questionPersian = "کاوه چی رو فهمید؟",
                            options = listOf("That he wasted his time", "That he had carried everything within him all along", "That the kingdom was far away", "That his father was wrong"),
                            correctIndex = 1,
                            explanation = "He realized he had carried everything within him all along."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Kaveh tell his father?",
                            questionPersian = "کاوه به پدرش چی گفت؟",
                            options = listOf("The kingdom is a place", "The kingdom is not a place. It is the journey itself", "I couldn't find it", "It doesn't exist"),
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
                    text = "Once there was a wealthy merchant named Sadegh. He had traveled to many countries. But he was not happy. One day, he heard a rumor. An old wise woman said, \"There is a great treasure buried in a distant land. Whoever finds it will never want for anything again.\" Sadegh left his wife, his children, and his home. His wife begged him to stay. \"We have enough,\" she said. \"We have a home. We have children. We have love.\" But Sadegh shook his head and walked away.",
                    textPersian = "روزی تاجر ثروتمندی به نام صادق بود. به کشورهای بسیاری سفر کرده بود. اما خوشحال نبود. یک روز شایعه‌ای شنید. پیرزنی دانا گفت: «گنج بزرگی در سرزمینی دور دفن شده.» صادق زنش و فرزندانش را ترک کرد. زنش التماس کرد بماند. «به اندازه کافی داریم.» اما صادق سر تکان داد و رفت.",
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
                            options = listOf("He was poor", "He felt there was a treasure he hadn't found", "He was sick", "He had no family"),
                            correctIndex = 1,
                            explanation = "He always felt there was a treasure he hadn't found."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the wise woman say?",
                            questionPersian = "پیرزن دانا چی گفت؟",
                            options = listOf("Stay home", "There is a great treasure in a distant land", "Give up", "Your wife is right"),
                            correctIndex = 1,
                            explanation = "She said there was a great treasure buried in a distant land."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh's wife say?",
                            questionPersian = "همسر صادق چی گفت؟",
                            options = listOf("Go find the treasure", "We have enough — home, children, love", "Take me with you", "You will fail"),
                            correctIndex = 1,
                            explanation = "She said: 'We have enough. We have a home. We have children. We have love.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Searching", titlePersian = "سال‌های جستجو",
                    text = "Sadegh traveled for years. He crossed oceans. He climbed mountains. He visited ancient temples. He consulted with priests, scholars, and mystics. He dug holes in a hundred places. He found gold, yes. He found jewels. But none of them were the treasure. Years passed. His hair turned gray. One night, he sat alone in an abandoned hut in a foreign land. He thought of his wife, his children, his home. And suddenly, he understood. Tears rolled down his face. He had been searching the whole world for a treasure that he had left behind.",
                    textPersian = "صادق سال‌ها سفر کرد. از اقیانوس‌ها گذشت. از کوه‌ها بالا رفت. صد جا چاله کند. طلا پیدا کرد. جواهرات پیدا کرد. اما هیچ‌کدام گنج نبود. سال‌ها گذشت. یک شب، تنها در کلبه‌ای متروک نشست. به زنش فکر کرد، به فرزندانش، به خانه‌اش. و ناگهان فهمید. تمام دنیا را برای گنجی جستجو کرده بود که پشت سر گذاشته بود.",
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
                            options = listOf("Nothing", "Gold and jewels, but not the treasure", "The treasure", "His family"),
                            correctIndex = 1,
                            explanation = "He found gold and jewels, but none were the treasure he sought."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh realize one night?",
                            questionPersian = "صادق یک شب چی فهمید؟",
                            options = listOf("He needed more money", "He had left behind the real treasure", "He should dig deeper", "He was lost"),
                            correctIndex = 1,
                            explanation = "He realized he had been searching the world for a treasure he had left behind."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh think about?",
                            questionPersian = "صادق به چی فکر کرد؟",
                            options = listOf("His gold", "His wife, children, and home", "His rivals", "His next journey"),
                            correctIndex = 1,
                            explanation = "He thought of his wife, his children, his home, and their warmth."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Home at Last", titlePersian = "بالاخره خانه",
                    text = "Sadegh turned around and walked home. It took him almost a year to return. When he finally reached his village, his heart was beating fast. He knocked. His wife opened it. She was older now. She stared at him for a long moment. Then she burst into tears and threw her arms around him. His children — now young adults — ran out and hugged him. That night, they sat together around the kitchen table. And then he said, \"I was looking for treasure. But I already had it. It was here, all along. The real treasure is the people who love you, the home you come back to, the family that waits for you.\"",
                    textPersian = "صادق برگشت و به خانه رفت. تقریباً یک سال طول کشید تا برگردد. در زد. زنش بازش کرد. حالا مسن‌تر بود. لحظه‌ای به او خیره شد. بعد اشک ریخت و دستانش را دور او پیچید. صادق گفت: «دنبال گنج می‌گشتم. اما قبلاً داشتمش. گنج واقعی کسانی هستند که تو را دوست دارند، خانه‌ای که به آن برمی‌گردی، خانواده‌ای که منتظرت می‌ماند.»",
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
                            options = listOf("She was angry", "She burst into tears and hugged him", "She ignored him", "She left"),
                            correctIndex = 1,
                            explanation = "She burst into tears and threw her arms around him."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Sadegh say was the real treasure?",
                            questionPersian = "صادق گفت گنج واقعی چیه؟",
                            options = listOf("Gold coins", "The people who love you and the family that waits for you", "Fame", "Power"),
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
                    text = "In a valley between two mountains, there was a wide, rushing river. It was fast and cold, and the rocks beneath its surface were sharp. Many people had drowned trying to cross it. Villages on either side of the river were isolated, unable to trade or visit each other. One day, an old man named Morteza came to the river. He was a carpenter, retired after a long life of work. He stood on the bank and watched the water rush by. Then he said quietly to himself, \"Someone should build a bridge here.\" And then he added, \"Perhaps that someone should be me.\"",
                    textPersian = "در دره‌ای بین دو کوه، رودخانه‌ای خطرناک بود. بسیاری در تلاش برای عبور غرق شده بودند. یک روز، پیرمردی به نام مرتضی به رودخانه آمد. نجاری بود که بازنشسته شده بود. روی ساحل ایستاد و تماشا کرد. بعد آرام با خودش گفت: «یک نفر باید اینجا پل بسازد. شاید آن یک نفر من باشم.»",
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
                            options = listOf("There were no mountains", "The river was dangerous to cross", "There were no people", "The weather was bad"),
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
                            options = listOf("Leave the valley", "Build a bridge", "Swim across", "Find help"),
                            correctIndex = 1,
                            explanation = "He decided to build the bridge himself."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Building", titlePersian = "سال‌های ساختن",
                    text = "Morteza began to plan. He studied the river, measuring its width and depth. He designed a bridge that could hold the weight of horses and carts. Every day, he worked alone. He cut trees in the forest. He carried rocks from the mountainside. The work was hard. Some people thought he was crazy. \"Why are you doing this?\" they asked. \"You are old. You will never use this bridge.\" Morteza smiled and replied, \"I am not building it for myself. I am building it for those who come after me.\" After five years of hard work, the bridge was finally complete.",
                    textPersian = "مرتضی شروع به برنامه‌ریزی کرد. هر روز تنها کار می‌کرد. بعضی‌ها فکر می‌کردند دیوانه است. «چرا این کار را می‌کنی؟ پیری.» مرتضی لبخند می‌زد: «آن را برای خودم نمی‌سازم. برای کسانی می‌سازم که بعد از من می‌آیند.» بعد از پنج سال کار سخت، پل بالاخره آماده شد.",
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
                            options = listOf("He was old and would never use the bridge", "He talked to himself", "He left home", "He was alone"),
                            correctIndex = 0,
                            explanation = "They said: 'You are old. You will never use this bridge.'"
                        ),
                        ChapterQuizQuestion(
                            question = "Why did Morteza build the bridge?",
                            questionPersian = "چرا مرتضی پل رو ساخت؟",
                            options = listOf("For money", "For fame", "For those who come after him", "For himself"),
                            correctIndex = 2,
                            explanation = "He said: 'I am not building it for myself. I am building it for those who come after me.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Legacy", titlePersian = "میراث",
                    text = "A young traveler arrived at the bridge one day. \"Who built this?\" he asked a villager. \"An old man named Morteza,\" the villager replied. The traveler went to visit Morteza. \"Why did you build this bridge, old man?\" the traveler asked. \"You will not cross it much longer.\" Morteza smiled. \"No, I will not,\" he said. \"But they will. And their children will. That is enough.\" The traveler asked, \"What is the greatest lesson you have learned?\" Morteza thought for a moment. \"We are all just passing through this world. The real question is not what we take with us, but what we leave behind.\"",
                    textPersian = "یک روز مسافر جوانی به پل رسید. «این را چه کسی ساخت؟» «پیرمردی به نام مرتضی.» مسافر به دیدن مرتضی رفت. «چرا این پل را ساختی پیرمرد؟ زیاد از آن عبور نخواهی کرد.» مرتضی لبخند زد. «نه، نمی‌مانم. اما آن‌ها می‌مانند. بچه‌هایشان می‌مانند. همین کافی است.»",
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
                            options = listOf("How much money you make", "What we leave behind", "Where you travel", "Who you know"),
                            correctIndex = 1,
                            explanation = "He said: 'The real question is not what we take with us, but what we leave behind.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What was Morteza's legacy?",
                            questionPersian = "میراث مرتضی چی بود؟",
                            options = listOf("His gold", "The bridge he built", "His house", "His books"),
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
                    text = "In a small village in the mountains, there was a legend. At the top of the highest tower, there was a bell. This bell, the elders said, was magical. It would only ring when a lie was spoken in the village. For generations, the villagers had trusted this bell. It had exposed cheaters, liars, and deceivers. But in recent years, the bell had not rung at all. People had become more honest, or so they believed. The village was peaceful, and everyone trusted each other.",
                    textPersian = "در دهکده‌ای کوچک، افسانه‌ای بود. در بالای بلندترین برج، زنگی بود که جادویی بود. فقط وقتی دروغی گفته می‌شد به صدا درمی‌آمد. نسل‌ها، اهالی به این زنگ اعتماد کرده بودند. اما در سال‌های اخیر، زنگ اصلاً به صدا درنیامده بود. مردم صادق‌تر شده بودند، یا حداقل این‌طور باور داشتند.",
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
                            options = listOf("It rang every hour", "It rang when someone told a lie", "It brought rain", "It called people to prayer"),
                            correctIndex = 1,
                            explanation = "The bell would ring when a lie was spoken in the village."
                        ),
                        ChapterQuizQuestion(
                            question = "Why had the bell not rung recently?",
                            questionPersian = "چرا زنگ اخیراً به صدا درنیامده بود؟",
                            options = listOf("It was broken", "People had become more honest", "Nobody spoke", "It was removed"),
                            correctIndex = 1,
                            explanation = "People had become more honest, or so they believed."
                        ),
                        ChapterQuizQuestion(
                            question = "What had the bell done for generations?",
                            questionPersian = "زنگ برای نسل‌ها چیکار کرده بود؟",
                            options = listOf("Nothing", "Exposed cheaters and liars", "Rang constantly", "Kept time"),
                            correctIndex = 1,
                            explanation = "It had exposed cheaters, liars, and deceivers."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Rich Man's Claim", titlePersian = "ادعای مرد ثروتمند",
                    text = "One day, a rich man named Karim called the entire village to the square. \"My friends,\" he announced, \"I have given all of my wealth to the poor.\" The villagers were amazed. Everyone praised Karim. Some even began to call him a saint. But then, someone looked up at the tower. The bell had not rung. This surprised everyone. If Karim was telling the truth, the bell should be silent. And it was. So everyone believed him. But an old woman named Zahra watched him closely. She noticed something. The bell was silent. But it should have rung.",
                    textPersian = "یک روز، مرد ثروتمندی به نام کریم تمام دهکده را به میدان خواند. «تمام ثروتم را به فقرا داده‌ام.» همه کریم را تحسین کردند. اما بعد، یک نفر به برج نگاه کرد. زنگ به صدا درنیامده بود. اگر کریم حقیقت می‌گفت، زنگ باید ساکت باشد. و بود. اما پیرزنی به نام زهرا با دقت تماشایش می‌کرد.",
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
                            options = listOf("He was leaving the village", "He had given all his wealth to the poor", "He was building a house", "He had found treasure"),
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
                    text = "That night, Zahra could not sleep. The next morning, she went to Karim's house. She found him in his garden, counting his gold. He had lied. Zahra approached him. \"Karim,\" she said softly, \"you did not tell the truth yesterday.\" Karim jumped up. \"How dare you!\" he shouted. \"The bell didn't ring! So it wasn't a lie!\" Zahra shook her head. \"The bell only rings for lies people know are lies. But your lie was different. You convinced yourself it was true.\" Karim stood frozen. Then, slowly, he sat down on the ground and began to cry. Because the deepest lies are not the ones we tell others. They are the ones we tell ourselves.",
                    textPersian = "آن شب، زهرا نتوانست بخوابد. صبح روز بعد، به خانه کریم رفت. او را در باغش یافت که طلایش را می‌شمرد. دروغ گفته بود. «کریم، دیروز حقیقت را نگفتی.» کریم پرید. «چه جراتی داری! زنگ به صدا درنیامد!» زهرا سر تکان داد. «زنگ فقط برای دروغ‌هایی به صدا درمی‌آید که مردم می‌دانند دروغ هستند. اما تو خودت را متقاعد کردی که حقیقت است.» کریم یخ زد. بعد روی زمین نشست و شروع به گریه کرد.",
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
                            options = listOf("Nothing", "Karim counting his gold", "Karim crying", "Karim was gone"),
                            correctIndex = 1,
                            explanation = "She found him in his garden, counting his gold."
                        ),
                        ChapterQuizQuestion(
                            question = "Why hadn't the bell rung?",
                            questionPersian = "چرا زنگ به صدا درنیامده بود؟",
                            options = listOf("It was broken", "Karim believed his own lie", "No one was listening", "It was too far"),
                            correctIndex = 1,
                            explanation = "The bell only rings for lies people know are lies. Karim had convinced himself it was true."
                        ),
                        ChapterQuizQuestion(
                            question = "What is the moral of this story?",
                            questionPersian = "درس اخلاقی این داستان چیه؟",
                            options = listOf("Never lie to others", "Self-deception is the deepest lie", "Don't be greedy", "Always tell the truth"),
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
                    text = "At the edge of a village, there was an old man named Baba Reza. He was famous for his garden. But his garden was strange. It was full of young trees — trees that would not produce fruit for decades. He had planted them when he was already very old. A young man came to visit him one day. \"Baba Reza,\" he asked, \"why do you plant trees you will never see grow?\" Baba Reza smiled. He gestured to a large oak tree nearby. \"You see that tree? It was planted by my grandfather. He never ate its fruit. But I did. Every summer of my childhood, I played under it. He planted for me.\"",
                    textPersian = "در حاشیه یک دهکده، پیرمردی به نام بابا رضا بود. باغش پر از درختان جوان بود. مرد جوانی به دیدنش آمد. «بابا رضا، چرا درختانی می‌کاری که هرگز رشدشان را نمی‌بینی؟» بابا رضا به درخت بلوط بزرگی اشاره کرد. «آن درخت را می‌بینی؟ پدربزرگم کاشته بود. اما من کردم. او برای من کاشت.»",
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
                            options = listOf("It had no trees", "It was full of young trees that wouldn't produce fruit for decades", "It was abandoned", "It had only flowers"),
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
                            options = listOf("For money", "For others, like his grandfather did for him", "By accident", "For fun"),
                            correctIndex = 1,
                            explanation = "His grandfather had planted for him, so he planted for others."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Young Man's Question", titlePersian = "سوال مرد جوان",
                    text = "The young man, whose name was Arash, sat down beside Baba Reza. \"But isn't it sad?\" he asked. \"To work so hard and never see the result?\" Baba Reza shook his head slowly. \"No, my son,\" he said. \"It is not sad. It is beautiful. I am planting hope. I am planting a future I will never see. I am trusting that those who come after me will be grateful.\" Arash asked, \"But what if no one appreciates it?\" Baba Reza laughed softly. \"Then I will have failed. But it doesn't matter. Because the act of planting itself is the reward. Faith is not about knowing. It is about trusting.\"",
                    textPersian = "مرد جوان، که اسمش آرش بود، کنار بابا رضا نشست. «اما غمگین نیست؟» بابا رضا سر تکان داد. «نه پسرم. زیباست. امید می‌کارم. اعتماد می‌کنم که کسانی که بعد از من می‌آیند سپاسگزار خواهند بود.» آرش پرسید: «اما اگر کسی ارزشش را نداند؟» بابا رضا خندید. «خود عمل کاشتن پاداش است. ایمان درباره دانستن نیست. درباره اعتماد کردن است.»",
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
                            options = listOf("It's about knowing", "It's about trusting", "It's easy", "It's unnecessary"),
                            correctIndex = 1,
                            explanation = "He said: 'Faith is not about knowing. It is about trusting.'"
                        ),
                        ChapterQuizQuestion(
                            question = "What is the reward according to Baba Reza?",
                            questionPersian = "طبق گفته بابا رضا پاداش چیه؟",
                            options = listOf("Money", "The act of planting itself", "Recognition", "Fruit"),
                            correctIndex = 1,
                            explanation = "He said: 'The act of planting itself is the reward.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Legacy of Forests", titlePersian = "میراثی از جنگل‌ها",
                    text = "Fifty years later, Arash was an old man himself. He had become a gardener, inspired by Baba Reza. Now he sat under a massive oak tree — one that Baba Reza had planted. The tree was enormous. Children played beneath it. Birds nested in it. Arash looked up and saw his own grandchildren climbing its branches. He smiled and thought of Baba Reza. The trees he had planted were not just trees. They were shadows for grandchildren he would never meet. Arash looked at his own young trees. He knew he would never see them grow tall. But that was okay. Because the best things in life are not for us. They are for those who come after us.",
                    textPersian = "پنجاه سال بعد، آرش خودش پیرمردی بود. باغبان شده بود. زیر یک درخت بلوط عظیم نشسته بود — درختی که بابا رضا کاشته بود. بچه‌ها زیرش بازی می‌کردند. پرندگان در آن لانه داشتند. آرش نوه‌هایش را در حال بالا رفتن از شاخه‌ها دید. بهترین چیزهای زندگی برای ما نیستند. برای کسانی هستند که بعد از ما می‌آیند.",
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
                            options = listOf("A doctor", "A gardener", "A teacher", "A builder"),
                            correctIndex = 1,
                            explanation = "Arash became a gardener, inspired by Baba Reza."
                        ),
                        ChapterQuizQuestion(
                            question = "Where did Arash sit?",
                            questionPersian = "آرش کجا نشست؟",
                            options = listOf("In his house", "Under an oak tree Baba Reza had planted", "In a garden", "On a hill"),
                            correctIndex = 1,
                            explanation = "He sat under a massive oak tree that Baba Reza had planted."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Arash learn from Baba Reza?",
                            questionPersian = "آرش از بابا رضا چی یاد گرفت؟",
                            options = listOf("Money is everything", "The best things in life are for those who come after us", "Trees are useless", "Work is tiring"),
                            correctIndex = 1,
                            explanation = "He learned that the best things in life are for those who come after us."
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i14", title = "The Letter That Changed Everything", titlePersian = "نامه‌ای که همه چیز را تغییر داد",
            level = Level.INTERMEDIATE,
            text = "A young woman finds an old letter in her grandmother's attic.",
            moral = "Words can outlive their writers.", moralPersian = "کلمات می‌توانند از نویسندگانشان عمر بیشتری کنند.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Attic Discovery", titlePersian = "کشف اتاق زیرشیروانی",
                    text = "Lila had just graduated from university with a degree in history. She was spending the summer at her grandmother's old house, cleaning out the attic. The attic was dusty and dark, filled with decades of memories. In one corner, hidden behind a wooden chest, Lila found a small leather box. Inside was a single envelope, yellowed with age. On the front were the words: \"To My Daughter, if I do not return.\" Lila's heart began to beat faster. She unfolded the letter with trembling hands.",
                    textPersian = "لیلا تازه از دانشگاه با مدرک تاریخ فارغ‌التحصیل شده بود. در گوشه‌ای از اتاق زیرشیروانی، پشت یک صندوق چوبی، جعبه‌ی چرمی کوچکی پیدا کرد. داخلش یک پاکت بود. روی جلد نوشته شده بود: «به دخترم، اگر برنگشتم.» قلب لیلا تند زد.",
                    vocabulary = listOf(
                        Word("attic", "اتاق زیرشیروانی", "ˈætɪk"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("envelope", "پاکت", "ˈenvəloʊp"),
                        Word("unfold", "باز کردن", "ʌnˈfoʊld"),
                        Word("trembling", "لرزان", "ˈtremblɪŋ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What was Lila's degree in?",
                            questionPersian = "مدرک لیلا در چه رشته‌ای بود؟",
                            options = listOf("Medicine", "History", "Art", "Science"),
                            correctIndex = 1,
                            explanation = "Lila graduated with a degree in history."
                        ),
                        ChapterQuizQuestion(
                            question = "Where did Lila find the leather box?",
                            questionPersian = "لیلا جعبه چرمی رو کجا پیدا کرد؟",
                            options = listOf("In the kitchen", "In the attic behind a chest", "In the garden", "In the basement"),
                            correctIndex = 1,
                            explanation = "She found it in the attic, hidden behind a wooden chest."
                        ),
                        ChapterQuizQuestion(
                            question = "What was written on the envelope?",
                            questionPersian = "روی پاکت چی نوشته شده بود؟",
                            options = listOf("To my husband", "To My Daughter, if I do not return", "For my son", "Open later"),
                            correctIndex = 1,
                            explanation = "It read: 'To My Daughter, if I do not return.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Letter's Words", titlePersian = "کلمات نامه",
                    text = "The letter was from her grandfather, written during the war. Lila had never met him. But here, in his own handwriting, was his voice: \"My dearest daughter, if you are reading this, it means I did not come home. But I want you to know something important. The war is not what matters. What matters is what we fought for. We fought so that you could grow up in a world without fear. If I do not return, do not cry for me too long. Instead, live a life that honors what we sacrificed for. Be kind, even when it is difficult. Be brave, even when you are afraid. And love deeply, because love is the only thing that makes life worth living.\" Lila read the letter three times. Tears rolled down her cheeks.",
                    textPersian = "نامه از پدربزرگش بود، نوشته شده در زمان جنگ. لیلا هرگز او را ندیده بود. اما اینجا، با دست‌خط خودش، صدایش بود: «دختر عزیزم، اگر برنگشتم، برای من زیاد گریه نکن. در عوض زندگی‌ای کن که فداکاری ما را گرامی بدارد. مهربان باش، حتی وقتی سخت است. شجاع باش، حتی وقتی می‌ترسی. و عمیقاً عشق بورز، چون عشق تنها چیزی است که زندگی را ارزشمند می‌کند.»",
                    vocabulary = listOf(
                        Word("handwriting", "دست‌خط", "ˈhændraɪtɪŋ"),
                        Word("territory", "سرزمین", "ˈterətɔːri"),
                        Word("glory", "افتخار", "ˈɡlɔːri"),
                        Word("sacrifice", "فداکاری", "ˈsækrɪfaɪs"),
                        Word("honor", "گرامی داشتن", "ˈɑːnər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who wrote the letter?",
                            questionPersian = "نامه رو کی نوشت؟",
                            options = listOf("Her father", "Her grandfather", "Her uncle", "Her brother"),
                            correctIndex = 1,
                            explanation = "The letter was from her grandfather, written during the war."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the letter say they fought for?",
                            questionPersian = "نامه گفت برای چی جنگیدند؟",
                            options = listOf("Territory", "Glory", "A world without fear", "Money"),
                            correctIndex = 2,
                            explanation = "They fought so future generations could grow up in a world without fear."
                        ),
                        ChapterQuizQuestion(
                            question = "What did the letter say makes life worth living?",
                            questionPersian = "نامه گفت چی زندگی رو ارزشمند می‌کنه؟",
                            options = listOf("Money", "Love", "Fame", "Power"),
                            correctIndex = 1,
                            explanation = "The letter said: 'Love is the only thing that makes life worth living.'"
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Life in His Honor", titlePersian = "زندگی به افتخار او",
                    text = "Lila sat in the attic for a long time, holding the letter. Then she made a decision. She would not sell the house. She would keep it. She would make it a place where future generations could gather and learn. She would start a foundation in her grandfather's name, helping children affected by war. She would write a book about her grandfather's letter. Over the next decade, Lila did exactly that. The old house became a center for peace education. The foundation helped hundreds of children. Her book was read around the world. And every year on the anniversary of his death, Lila would sit in the attic. She would read it aloud and say, \"You did come home, Grandfather. You came home through your words.\"",
                    textPersian = "لیلا مدت طولانی در اتاق زیرشیروانی نشست. بعد تصمیمی گرفت. خانه را نمی‌فروشد. آن را مرکزی برای آموزش صلح می‌کرد. بنیادی به نام پدربزرگش راه‌اندازی می‌کرد. کتابی می‌نوشت. لیلا دقیقاً همین کار را کرد. بنیاد به صدها کودک کمک کرد. کتابش در سراسر جهان خوانده شد. «برگشتی پدربزرگ. از طریق کلماتت برگشتی.»",
                    vocabulary = listOf(
                        Word("restore", "بازسازی کردن", "rɪˈstɔːr"),
                        Word("foundation", "بنیاد", "faʊnˈdeɪʃn"),
                        Word("scholarship", "بورس تحصیلی", "ˈskɑːlərʃɪp"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("anniversary", "سالگرد", "ˌænɪˈvɜːrsəri")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Lila decide to do with the house?",
                            questionPersian = "لیلا تصمیم گرفت با خانه چیکار کنه؟",
                            options = listOf("Sell it", "Keep and restore it", "Destroy it", "Rent it"),
                            correctIndex = 1,
                            explanation = "She decided to keep and restore the house."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Lila do in her grandfather's honor?",
                            questionPersian = "لیلا به افتخار پدربزرگش چیکار کرد؟",
                            options = listOf("Wrote a book and started a foundation", "Moved away", "Sold his belongings", "Did nothing"),
                            correctIndex = 0,
                            explanation = "She started a foundation and wrote a book about his letter."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Lila say to her grandfather?",
                            questionPersian = "لیلا به پدربزرگش چی گفت؟",
                            options = listOf("You forgot us", "You did come home through your words", "I miss you", "Goodbye"),
                            correctIndex = 1,
                            explanation = "She said: 'You did come home, Grandfather. You came home through your words.'"
                        )
                    )
                )
            )
        ),

        Story(
            id = "s_i15", title = "The Lonely Lighthouse", titlePersian = "فانوس دریایی تنها",
            level = Level.INTERMEDIATE,
            text = "A lighthouse keeper saves lives every night from a rocky island.",
            moral = "Purpose cures loneliness.", moralPersian = "هدف تنهایی را درمان می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Lonely Island", titlePersian = "جزیره تنها",
                    text = "On a rocky island far off the coast, there stood a lighthouse. Its keeper was an old man named Hossein. He had lived on the island for forty years. The island was tiny. There were no trees, no other people, no shops. Just the lighthouse, a small cottage, and the endless sea. When supply ships came, the sailors would ask him, \"Don't you miss the world? Don't you miss people?\" Hossein would smile and shake his head.",
                    textPersian = "روی جزیره‌ای سنگی دور از ساحل، فانوس دریایی بود. نگهبانش پیرمردی به نام حسین بود. چهل سال روی جزیره زندگی کرده بود. جزیره کوچک بود. فقط فانوس، کلبه‌ای کوچک و دریای بی‌پایان. وقتی کشتی‌ها می‌آمدند، ملوانان می‌پرسیدند: «دلت برای دنیا تنگ نمی‌شود؟» حسین لبخند می‌زد و سر تکان می‌داد.",
                    vocabulary = listOf(
                        Word("lighthouse", "فانوس دریایی", "ˈlaɪthaʊs"),
                        Word("weathered", "فرسوده", "ˈweðərd"),
                        Word("keeper", "نگهبان", "ˈkiːpər"),
                        Word("endless", "بی‌پایان", "ˈendləs"),
                        Word("supply", "تدارکات", "səˈplaɪ")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "How long had Hossein lived on the island?",
                            questionPersian = "حسین چقدر روی جزیره زندگی کرده بود؟",
                            options = listOf("10 years", "20 years", "40 years", "50 years"),
                            correctIndex = 2,
                            explanation = "He had lived on the island for forty years."
                        ),
                        ChapterQuizQuestion(
                            question = "What was on the island?",
                            questionPersian = "روی جزیره چی بود؟",
                            options = listOf("Trees and shops", "Only lighthouse, cottage, and sea", "A village", "Nothing"),
                            correctIndex = 1,
                            explanation = "Just the lighthouse, a small cottage, and the endless sea."
                        ),
                        ChapterQuizQuestion(
                            question = "How did Hossein respond to questions about loneliness?",
                            questionPersian = "حسین به سؤالات درباره تنهایی چطور پاسخ می‌داد؟",
                            options = listOf("He complained", "He smiled and shook his head", "He cried", "He left"),
                            correctIndex = 1,
                            explanation = "Hossein would smile and shake his head."
                        )
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Night of the Storm", titlePersian = "شب طوفان",
                    text = "One winter night, a terrible storm hit the coast. The wind howled. The waves crashed against the rocks with terrifying force. Hossein knew what was coming. Ships would be in danger. His light would be their only guide. He climbed the stairs to the top. His old bones ached. But he lit the lamp, as he did every night. For hours, Hossein stood there, tending the flame. He could not sleep. He could not rest. Every minute mattered. If the light went out, ships might crash into the rocks. In the morning, the storm finally passed. Hossein looked out and saw three ships anchored safely in the harbor.",
                    textPersian = "یک شب زمستانی، طوفان وحشتناکی به ساحل رسید. حسین می‌دانست چه در پیش است. نور او تنها راهنما بود. از پله‌ها بالا رفت. چراغ را روشن کرد. ساعت‌ها ایستاد و شعله را نگه داشت. اگر چراغ خاموش می‌شد، کشتی‌ها به صخره‌ها می‌خوردند. صبح، طوفان گذشت. حسین سه کشتی دید که با امنیت لنگر انداخته بودند.",
                    vocabulary = listOf(
                        Word("howl", "زوزه کشیدن", "haʊl"),
                        Word("crash", "کوبیدن", "kræʃ"),
                        Word("terrifying", "وحشتناک", "ˈterɪfaɪɪŋ"),
                        Word("tend", "مراقبت کردن", "tend"),
                        Word("anchor", "لنگر انداختن", "ˈæŋkər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "What did Hossein do during the storm?",
                            questionPersian = "حسین در طول طوفان چیکار کرد؟",
                            options = listOf("Slept", "Lit the lamp and tended the flame", "Left the island", "Called for help"),
                            correctIndex = 1,
                            explanation = "He lit the lamp and tended the flame all night."
                        ),
                        ChapterQuizQuestion(
                            question = "Why was the light so important?",
                            questionPersian = "چرا نور اینقدر مهم بود؟",
                            options = listOf("For decoration", "It was the only guide for ships", "To keep him warm", "For visitors"),
                            correctIndex = 1,
                            explanation = "His light would be the only guide for the ships."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Hossein see in the morning?",
                            questionPersian = "حسین صبح چی دید؟",
                            options = listOf("Three ships anchored safely", "A wrecked ship", "Nothing", "More storm"),
                            correctIndex = 0,
                            explanation = "He saw three ships anchored safely in the harbor."
                        )
                    )
                ),
                StoryChapter(
                    number = 3, title = "Purpose in Isolation", titlePersian = "هدف در انزوا",
                    text = "Years passed. Hossein grew older and weaker. Finally, the time came for him to retire. A young man named Farid arrived to take his place. Farid was nervous. \"How did you survive it for forty years?\" he asked. Hossein smiled. He led Farid to the top of the lighthouse. \"Look,\" Hossein said. \"Every night, hundreds of ships pass this coast. Every night, thousands of people are traveling home. They don't know me. But my light guides them. My work saves their lives.\" Farid looked at the sea. \"How can I be lonely,\" Hossein continued, \"when I am saving lives every night?\" Farid nodded slowly. He understood. Purpose is what gives life meaning. It does not matter how small your world is. What matters is the impact of your work. Hossein passed away a few years later, on the island, in his sleep. In his will, he asked that his ashes be scattered from the top of the lighthouse.",
                    textPersian = "سال‌ها گذشت. حسین پیرتر و ضعیف‌تر شد. وقت بازنشستگی رسید. مرد جوانی به نام فرید آمد. فرید مضطرب بود. «چطور چهل سال تحملش کردی؟» حسین لبخند زد. فرید را به بالای فانوس برد. «نگاه کن. هر شب، صدها کشتی از این ساحل می‌گذرند. هزاران نفر به خانه سفر می‌کنند. مرا نمی‌شناسند. اما نور من هدایتشان می‌کند. کار من زندگی‌شان را نجات می‌دهد.» فرید آرام سر تکان داد. فهمید. هدف چیزی است که به زندگی معنا می‌دهد. حسین چند سال بعد در خواب از دنیا رفت.",
                    vocabulary = listOf(
                        Word("retire", "بازنشسته شدن", "rɪˈtaɪər"),
                        Word("isolated", "منزوی", "ˈaɪsəleɪtɪd"),
                        Word("impact", "تأثیر", "ˈɪmpækt"),
                        Word("will", "وصیت‌نامه", "wɪl"),
                        Word("scatter", "پخش کردن", "ˈskætər")
                    ),
                    quiz = listOf(
                        ChapterQuizQuestion(
                            question = "Who came to replace Hossein?",
                            questionPersian = "کی آمد تا جایگزین حسین بشه؟",
                            options = listOf("A captain", "A young man named Farid", "A sailor", "A priest"),
                            correctIndex = 1,
                            explanation = "A young man named Farid arrived to take his place."
                        ),
                        ChapterQuizQuestion(
                            question = "What did Hossein say about loneliness?",
                            questionPersian = "حسین درباره تنهایی چی گفت؟",
                            options = listOf("It was unbearable", "How can I be lonely when I am saving lives every night", "He missed people", "It was hard"),
                            correctIndex = 1,
                            explanation = "He said: 'How can I be lonely when I am saving lives every night?'"
                        ),
                        ChapterQuizQuestion(
                            question = "What did Hossein ask in his will?",
                            questionPersian = "حسین در وصیتش چی خواست؟",
                            options = listOf("To be buried on the mainland", "His ashes be scattered from the lighthouse", "To give the lighthouse away", "Nothing"),
                            correctIndex = 1,
                            explanation = "He asked that his ashes be scattered from the top of the lighthouse."
                        )
                    )
                )
            )
        ),

        // ==================== داستان‌های بدون فصل (s_i16 تا s_i30) ====================

        Story(
            id = "s_i16", title = "The Two Wolves", titlePersian = "دو گرگ",
            level = Level.INTERMEDIATE,
            text = "An old Cherokee told his grandson: Inside every person, there is a battle between two wolves. One is evil — anger, greed, jealousy. The other is good — love, kindness, compassion. The grandson asked: Which wolf wins? The grandfather replied: The one you feed.",
            moral = "You become what you nurture inside.", moralPersian = "تو همان می‌شوی که درون خود پرورش می‌دهی.",
            coverUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=400"
        ),
        Story(
            id = "s_i17", title = "The Perfect Cup", titlePersian = "فنجان بی‌نقص",
            level = Level.INTERMEDIATE,
            text = "A pottery teacher split her class into two groups. The first group had to make one perfect cup. The second group had to make as many cups as possible. At the end, the second group made better cups. Perfection came through practice, not through aiming for perfection. Quantity leads to quality.",
            moral = "Practice makes perfect, not intention.", moralPersian = "تمرین کامل می‌کند، نه نیت.",
            coverUrl = "https://images.unsplash.com/photo-1565193566173-7a0ee3dbe261?w=400"
        ),
        Story(
            id = "s_i18", title = "The Missing Puzzle Piece", titlePersian = "قطعه گمشده پازل",
            level = Level.INTERMEDIATE,
            text = "A man spent years searching for one missing puzzle piece. He found it in his own pocket. He had carried it with him all along. The lesson: Sometimes what we search for is already within us. The answer to our questions lives in our own hearts.",
            moral = "What you seek is often within you.", moralPersian = "آنچه می‌جویی اغلب درون توست.",
            coverUrl = "https://images.unsplash.com/photo-1494059980473-813e73ee784b?w=400"
        ),
        Story(
            id = "s_i19", title = "The Prince and the Beggar", titlePersian = "شاهزاده و گدا",
            level = Level.INTERMEDIATE,
            text = "A prince and a beggar switched clothes for a day. The prince lived as a beggar and discovered hunger, cold, and humiliation. The beggar lived as a prince and discovered boredom, loneliness, and pressure. That night, they met again. Both agreed that every life has its own struggles. You cannot judge what you have not lived.",
            moral = "Never judge another's life.", moralPersian = "هرگز زندگی دیگری را قضاوت نکن.",
            coverUrl = "https://images.unsplash.com/photo-1518495973542-4542c06a5843?w=400"
        ),
        Story(
            id = "s_i20", title = "The Book That Never Ended", titlePersian = "کتابی که تمام نشد",
            level = Level.INTERMEDIATE,
            text = "A writer spent his whole life writing a book. On his deathbed, he asked his daughter to read the last page. It was empty. He said: I never finished because life is the story that never ends. There is always a new page waiting to be written. Keep writing your own story.",
            moral = "Your story is always being written.", moralPersian = "داستان تو همیشه در حال نوشته شدن است.",
            coverUrl = "https://images.unsplash.com/photo-1544716278-ca5e3f4abd8c?w=400"
        ),
        Story(
            id = "s_i21", title = "The River and the Rock", titlePersian = "رودخانه و صخره",
            level = Level.INTERMEDIATE,
            text = "A river flowed gently. It met a giant rock in its path. The rock said: You cannot pass me. I am strong. The river did not fight. It went around. It wore the rock down with patience over centuries. Finally, the rock became sand. The river continued to the sea. Flexibility beats rigidity.",
            moral = "Flexibility overcomes brute force.", moralPersian = "انعطاف بر زور خالص پیروز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1439405326854-014607f694d7?w=400"
        ),
        Story(
            id = "s_i22", title = "The Father's Advice", titlePersian = "توصیه پدر",
            level = Level.INTERMEDIATE,
            text = "Before a young man left home, his father gave him two pieces of advice. First: Keep your word, even when it's hard. Second: Always be kinder than necessary. Years later, the son was known as the most trusted and loved man in his city. Two simple rules built a great life.",
            moral = "Simple virtues create great lives.", moralPersian = "فضیلت‌های ساده زندگی‌های بزرگ می‌سازند.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),
        Story(
            id = "s_i23", title = "The Blind Man and the Lantern", titlePersian = "مرد کور و فانوس",
            level = Level.INTERMEDIATE,
            text = "A blind man carried a lantern at night. People laughed: Why do you carry a lantern when you cannot see? He replied: I carry it for others. So they can see me and not bump into me. Wisdom sees what eyes cannot.",
            moral = "Wisdom is deeper than sight.", moralPersian = "خرد عمیق‌تر از بینایی است.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),
        Story(
            id = "s_i24", title = "The Tailor's Mistake", titlePersian = "اشتباه خیاط",
            level = Level.INTERMEDIATE,
            text = "A tailor cut the cloth too short. Instead of giving up, he redesigned the outfit. It became even more beautiful than the original plan. He realized: Every mistake is an opportunity to create something new. Creativity turns failures into masterpieces.",
            moral = "Mistakes can become masterpieces.", moralPersian = "اشتباهات می‌توانند به شاهکار تبدیل شوند.",
            coverUrl = "https://images.unsplash.com/photo-1520006403909-838d6b92c22e?w=400"
        ),
        Story(
            id = "s_i25", title = "The Sailor's Compass", titlePersian = "قطب‌نمای ملوان",
            level = Level.INTERMEDIATE,
            text = "A sailor lost his compass in a storm. He panicked at first, but then he used the stars to guide him. He realized: When you lose one way, another appears. Life always gives alternatives. Trust the universe to show you the way.",
            moral = "When one door closes, another opens.", moralPersian = "وقتی دری بسته می‌شود، دری دیگر باز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1502933691298-84fc14542831?w=400"
        ),
        Story(
            id = "s_i26", title = "The Old Photograph", titlePersian = "عکس قدیمی",
            level = Level.INTERMEDIATE,
            text = "A woman found an old photograph of her great-grandmother. She was young, smiling, and full of dreams. The woman realized: She was me. I am her. Our dreams are the same. Our hopes are the same. We are connected across time by the thread of humanity.",
            moral = "We are connected across generations.", moralPersian = "ما در طول نسل‌ها به هم متصل هستیم.",
            coverUrl = "https://images.unsplash.com/photo-1516575334481-f85287c2c82d?w=400"
        ),
        Story(
            id = "s_i27", title = "The Power of One Voice", titlePersian = "قدرت یک صدا",
            level = Level.INTERMEDIATE,
            text = "One person wrote a letter to a newspaper about pollution. Others read it and joined. Soon, a whole movement started. One voice became many. The world changed because one person refused to stay silent. Never underestimate the power of your voice.",
            moral = "One voice can change the world.", moralPersian = "یک صدا می‌تواند دنیا را تغییر دهد.",
            coverUrl = "https://images.unsplash.com/photo-1591543620767-582b2e76369e?w=400"
        ),
        Story(
            id = "s_i28", title = "The Gift of Time", titlePersian = "هدیه زمان",
            level = Level.INTERMEDIATE,
            text = "A busy executive learned his son had only a few months to live. He dropped everything to be with him. In those months, he discovered the son he never knew. After his son passed, he said: I gave him my time — the most valuable gift I ever gave. Time is the greatest gift.",
            moral = "Time is the greatest gift you can give.", moralPersian = "زمان بزرگ‌ترین هدیه‌ای است که می‌توانی بدهی.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),
        Story(
            id = "s_i29", title = "The Seven Wonders", titlePersian = "هفت عجایب",
            level = Level.INTERMEDIATE,
            text = "A teacher asked her students to list the Seven Wonders of the World. One girl hesitated. The teacher asked: What's wrong? She said: I can't decide — to see, to hear, to touch, to taste, to feel, to laugh, to love. The class fell silent. Those are the real wonders.",
            moral = "The greatest wonders are within us.", moralPersian = "بزرگ‌ترین عجایب درون ما هستند.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),
        Story(
            id = "s_i30", title = "The Last Conversation", titlePersian = "آخرین گفتگو",
            level = Level.INTERMEDIATE,
            text = "A man called his father after years of silence. They talked for hours about everything. The next day, his father passed away. The man realized: That phone call was a gift from fate. Never delay forgiveness. Never assume there is more time. Say what you need to say today.",
            moral = "Never delay saying what matters.", moralPersian = "هرگز گفتن آنچه مهم است را به تأخیر نینداز.",
            coverUrl = "https://images.unsplash.com/photo-1516575334481-f85287c2c82d?w=400"
        )
    )
}