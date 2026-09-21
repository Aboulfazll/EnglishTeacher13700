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
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Judge's Clever Plan", titlePersian = "نقشه هوشمندانه قاضی",
                    text = "The judge thought for a long moment. He looked at the horse. He looked at the two men. Then he smiled and said, \"Bring the horse to the courtyard and release him. Let the horse decide.\" Everyone was confused. Release the horse? How could a horse decide? But the judge insisted. The guards brought the horse to the courtyard. The judge ordered both men to stand on opposite sides of the yard. Then he untied the horse. The horse stood still for a moment, looking around. Then, without hesitation, he walked slowly toward the poor farmer. He nuzzled the farmer's chest and made a soft sound. The farmer began to cry and hugged the horse. The judge declared, \"The horse knows his true master. The case is solved.\" The rich merchant was shocked. He tried to protest, but the judge silenced him with a single look.",
                    textPersian = "قاضی لحظه‌ای طولانی فکر کرد. به اسب نگاه کرد. به دو مرد نگاه کرد. بعد لبخند زد و گفت: «اسب را به حیاط بیاورید و آزادش کنید. بگذارید اسب تصمیم بگیرد.» همه گیج شدند. اسب آزاد؟ اسب چطور می‌تواند تصمیم بگیرد؟ اما قاضی اصرار کرد. نگهبانان اسب را به حیاط آوردند. قاضی دستور داد هر دو مرد در دو طرف مخالف حیاط بایستند. بعد اسب را باز کرد. اسب لحظه‌ای ایستاد و اطراف را نگاه کرد. بعد بدون تردید، آرام به سمت کشاورز فقیر راه رفت. سینه کشاورز را با پوزه لمس کرد و صدای ملایمی درآورد. کشاورز شروع به گریه کرد و اسب را در آغوش گرفت. قاضی اعلام کرد: «اسب ارباب واقعی‌اش را می‌شناسد. پرونده حل شد.» تاجر ثروتمند شوکه شد. سعی کرد اعتراض کند، اما قاضی با یک نگاه او را ساکت کرد.",
                    vocabulary = listOf(
                        Word("courtyard", "حیاط", "ˈkɔːrtjɑːrd"),
                        Word("release", "آزاد کردن", "rɪˈliːs"),
                        Word("hesitation", "تردید", "ˌhezɪˈteɪʃn"),
                        Word("nuzzle", "لمس کردن با پوزه", "ˈnʌzl"),
                        Word("declare", "اعلام کردن", "dɪˈkler")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Lesson of Wisdom", titlePersian = "درس خرد",
                    text = "After the case was closed, the rich merchant stormed out of the court angrily. The poor farmer thanked the judge with tears in his eyes. \"How did you know?\" he asked. The judge smiled. \"A horse does not care about money or power. He cares about love and care. You raised him. You fed him. You loved him. He remembers. Animals are wiser than many men.\" The crowd applauded. The story of the wise judge spread throughout the kingdom and beyond. Years later, when the judge was very old, he was asked the secret of his wisdom. He said simply, \"I listen more than I speak. I watch more than I judge. And I always trust the truth.\" His wisdom guided the kingdom for many generations, and his name became a symbol of justice itself.",
                    textPersian = "بعد از بسته شدن پرونده، تاجر ثروتمند با عصبانیت از دادگاه بیرون رفت. کشاورز فقیر با چشمان پر از اشک از قاضی تشکر کرد. «چطور فهمیدید؟» پرسید. قاضی لبخند زد. «اسب به پول و قدرت اهمیت نمی‌دهد. به عشق و مراقبت اهمیت می‌دهد. تو او را بزرگ کردی. به او غذا دادی. دوستش داشتی. او به یاد می‌آورد. حیوانات از بسیاری از انسان‌ها عاقل‌ترند.» جمعیت تشویق کردند. داستان قاضی دانا در سراسر پادشاهی و فراتر از آن پخش شد. سال‌ها بعد، وقتی قاضی خیلی پیر شده بود، از او راز خردش را پرسیدند. او به سادگی گفت: «بیشتر از آنچه حرف می‌زنم گوش می‌دهم. بیشتر از آنچه قضاوت می‌کنم تماشا می‌کنم. و همیشه به حقیقت اعتماد می‌کنم.» خرد او پادشاهی را برای نسل‌های بسیاری هدایت کرد و نامش نماد عدالت شد.",
                    vocabulary = listOf(
                        Word("storm out", "با عصبانیت بیرون رفتن", ""),
                        Word("applaud", "تشویق کردن", "əˈplɔːd"),
                        Word("symbol", "نماد", "ˈsɪmbl"),
                        Word("justice", "عدالت", "ˈdʒʌstɪs"),
                        Word("generation", "نسل", "ˌdʒenəˈreɪʃn")
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
                    text = "When their father passed away, two brothers inherited his farm. The older brother, Karim, was strong and hardworking but also greedy. The younger brother, Nader, was gentle and fair. Their father's will said the farm should be divided equally. But Karim was not happy with this. \"I worked harder than you,\" he told Nader. \"I deserve the bigger part.\" Nader was hurt by his brother's words. \"Father loved us equally,\" he replied. \"Why should we fight over what he left us?\" But Karim would not listen. Days turned into weeks, and weeks into months. The two brothers stopped speaking to each other. They divided the land with a fence and refused to cross it. The farm that had once been full of laughter now felt cold and empty.",
                    textPersian = "وقتی پدرشان فوت کرد، دو برادر مزرعه‌اش را به ارث بردند. برادر بزرگتر، کریم، قوی و سخت‌کوش بود اما حریص هم بود. برادر کوچکتر، نادر، ملایم و منصف بود. وصیت پدرشان می‌گفت مزرعه باید به‌طور مساوی تقسیم شود. اما کریم راضی نبود. «من سخت‌تر از تو کار کردم،» به نادر گفت. «سزاوار قسمت بزرگترم.» نادر از حرف برادرش آزرده شد. «پدر ما را به‌طور مساوی دوست داشت،» پاسخ داد. «چرا باید سر چیزی که برایمان گذاشته بجنگیم؟» اما کریم گوش نمی‌داد. روزها به هفته‌ها و هفته‌ها به ماه‌ها تبدیل شد. دو برادر از حرف زدن با هم دست کشیدند. زمین را با حصار تقسیم کردند و از عبور از آن خودداری کردند. مزرعه‌ای که روزی پر از خنده بود، حالا سرد و خالی حس می‌شد.",
                    vocabulary = listOf(
                        Word("inherit", "به ارث بردن", "ɪnˈherɪt"),
                        Word("greedy", "حریص", "ˈɡriːdi"),
                        Word("will", "وصیت‌نامه", "wɪl"),
                        Word("deserve", "سزاوار بودن", "dɪˈzɜːrv"),
                        Word("fence", "حصار", "fens")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Lonely Winter", titlePersian = "زمستان تنها",
                    text = "That winter was the coldest in many years. Snow covered the entire valley. One night, Karim heard a strange sound from his brother's side of the farm. He listened carefully. It was coughing. Nader was sick. Karim tried to ignore it. \"He has his own land and his own life,\" he told himself. But the coughing continued for hours. Karim could not sleep. His father's words came back to him: \"Brothers are like two hands — one cannot survive without the other.\" Karim lay awake all night, torn between his pride and his heart. The next morning, he saw that no smoke was coming from Nader's chimney. Nader was too weak to light the fire. Karim's heart sank. He realized how foolish he had been.",
                    textPersian = "آن زمستان سردترین زمستان سال‌های بسیاری بود. برف تمام دره را پوشاند. یک شب، کریم صدای عجیبی از طرف مزرعه‌ی برادرش شنید. با دقت گوش داد. سرفه بود. نادر بیمار بود. کریم سعی کرد نادیده بگیرد. «او زمین خودش و زندگی خودش را دارد،» به خودش گفت. اما سرفه‌ها ساعت‌ها ادامه یافت. کریم نمی‌توانست بخوابد. حرف پدرش به یادش آمد: «برادرها مثل دو دست هستند — یکی بدون دیگری نمی‌تواند زنده بماند.» کریم تمام شب بیدار ماند، بین غرور و قلبش گیر کرده بود. صبح روز بعد، دید که هیچ دودی از دودکش نادر نمی‌آید. نادر خیلی ضعیف بود که آتش روشن کند. قلب کریم فرو ریخت. فهمید چقدر احمق بوده.",
                    vocabulary = listOf(
                        Word("valley", "دره", "ˈvæli"),
                        Word("cough", "سرفه", "kɔːf"),
                        Word("chimney", "دودکش", "ˈtʃɪmni"),
                        Word("foolish", "احمقانه", "ˈfuːlɪʃ"),
                        Word("pride", "غرور", "praɪd")
                    )
                ),
                StoryChapter(
                    number = 3, title = "Two Hands Together", titlePersian = "دو دست با هم",
                    text = "Karim grabbed his coat and ran across the fence. He broke it down with his own hands. He ran to Nader's house and knocked. No answer. He pushed the door open. Nader was lying on the bed, pale and weak. Karim rushed to him. \"Nader! Nader! Wake up!\" Nader slowly opened his eyes. When he saw his brother, tears rolled down his cheeks. \"Karim... I thought you hated me.\" Karim shook his head and hugged his brother tightly. \"I was a fool,\" he whispered. \"I'm sorry. I'm so sorry.\" He built a fire, cooked hot soup, and stayed with Nader all week. Slowly, Nader recovered. The two brothers sat by the fire one evening. \"Let's tear down the fence,\" said Karim. \"The farm was never ours to divide. It was father's gift to us — both of us. Together.\" Nader smiled and nodded. They worked side by side from that day on. The farm flourished, and the brothers became inseparable. Because they learned that love is more valuable than any land, and family is more precious than any inheritance.",
                    textPersian = "کریم کاپشنش را برداشت و از روی حصار دوید. با دستان خودش خرابش کرد. به خانه نادر دوید و در زد. جوابی نیامد. در را باز کرد. نادر روی تخت دراز کشیده بود، رنگ‌پریده و ضعیف. کریم به سمتش دوید. «نادر! نادر! بیدار شو!» نادر آرام چشمانش را باز کرد. وقتی برادرش را دید، اشک روی گونه‌هایش غلتید. «کریم... فکر کردم از من متنفری.» کریم سر تکان داد و برادرش را محکم در آغوش گرفت. «احمق بودم،» زمزمه کرد. «متأسفم. خیلی متأسفم.» آتش روشن کرد، سوپ گرم پخت و تمام هفته با نادر ماند. آرام‌آرام، نادر بهبود یافت. یک شب دو برادر کنار آتش نشستند. «بیایید حصار را خراب کنیم،» کریم گفت. «مزرعه هرگز مال ما نبود که تقسیمش کنیم. هدیه پدر به ما بود — به هر دوی ما. با هم.» نادر لبخند زد و سر تکان داد. از آن روز به بعد کنار هم کار کردند. مزرعه شکوفا شد و دو برادر جدانشدنی شدند. چون یاد گرفتند عشق ارزشمندتر از هر زمینی است و خانواده از هر ارثی گرانبهاتر.",
                    vocabulary = listOf(
                        Word("grab", "قاپیدن", "ɡræb"),
                        Word("pale", "رنگ‌پریده", "peɪl"),
                        Word("recover", "بهبود یافتن", "rɪˈkʌvər"),
                        Word("flourish", "شکوفا شدن", "ˈflɜːrɪʃ"),
                        Word("precious", "گرانبها", "ˈpreʃəs")
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
                    text = "A young farmer named Behrouz lived in a small village. One day, an old traveler gave him a small bamboo seed. \"Plant this,\" the traveler said. \"Water it every day. But be patient — it will not grow quickly.\" Behrouz was curious. He had never grown bamboo before. He planted the seed in his garden and watered it every morning. After one month, nothing grew. His neighbors laughed. \"You're wasting your time!\" they said. But Behrouz kept watering. After six months, still nothing. After one year, still nothing. His wife began to worry. \"Maybe the seed is dead,\" she said. But Behrouz smiled and continued. \"The traveler said to be patient. I trust him.\"",
                    textPersian = "کشاورز جوانی به نام بهروز در دهکده‌ای کوچک زندگی می‌کرد. یک روز، مسافری پیر دانه‌ی کوچک بامبو به او داد. «این را بکار،» مسافر گفت. «هر روز آبش بده. اما صبور باش — سریع رشد نمی‌کند.» بهروز کنجکاو شد. هرگز بامبو نکاشته بود. دانه را در باغش کاشت و هر صبح آب داد. بعد از یک ماه، چیزی رشد نکرد. همسایه‌ها خندیدند. «داری وقتت رو تلف می‌کنی!» بعد از شش ماه، هنوز هیچی. بعد از یک سال، هنوز هیچی. همسرش نگران شد. «شاید دانه مرده،» گفت. اما بهروز لبخند زد و ادامه داد. «مسافر گفت صبور باشم. به او اعتماد دارم.»",
                    vocabulary = listOf(
                        Word("bamboo", "بامبو", "ˌbæmˈbuː"),
                        Word("curious", "کنجکاو", "ˈkjʊriəs"),
                        Word("patient", "صبور", "ˈpeɪʃnt"),
                        Word("waste", "تلف کردن", "weɪst"),
                        Word("trust", "اعتماد کردن", "trʌst")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Hidden Roots", titlePersian = "ریشه‌های پنهان",
                    text = "Five years passed. Behrouz continued to water the seed every single day. He talked to it. He protected it from birds and insects. His neighbors had stopped laughing — now they felt sorry for him. \"Poor Behrouz,\" they whispered. \"He has wasted five years of his life.\" Behrouz's beard had grown long. His hands were rough from work. But his eyes still held hope. Then one spring morning, Behrouz went to his garden as usual. And he stopped. A small green shoot was pushing through the soil! It was tiny, but it was alive. Behrouz fell to his knees with tears of joy. \"It's growing!\" he shouted. But what he did not know was that under the ground, something amazing had been happening all those years. The bamboo roots had been growing deeper and deeper, spreading wider and wider, preparing for the moment when the shoot would appear.",
                    textPersian = "پنج سال گذشت. بهروز هر روز دانه را آب داد. با آن حرف زد. از پرنده‌ها و حشرات محافظتش کرد. همسایه‌ها دیگر نمی‌خندیدند — حالا برایش دلسوزی می‌کردند. «بهروز بیچاره،» زمزمه می‌کردند. «پنج سال زندگیش رو تلف کرد.» ریش بهروز بلند شده بود. دستانش از کار زبر. اما چشمانش هنوز امید داشت. بعد یک صبح بهاری، بهروز طبق معمول به باغش رفت. و ایستاد. جوانه‌ی سبز کوچکی از خاک بیرون می‌آمد! کوچک بود، اما زنده بود. بهروز با اشک شوق زانو زد. «داره رشد می‌کنه!» فریاد زد. اما نمی‌دانست زیر زمین، اتفاق شگفت‌انگیزی تمام آن سال‌ها افتاده. ریشه‌های بامبو عمیق‌تر و عمیق‌تر رشد می‌کردند، عریض‌تر و عریض‌تر پخش می‌شدند، خود را برای لحظه‌ای آماده می‌کردند که جوانه ظاهر شود.",
                    vocabulary = listOf(
                        Word("rough", "زبر", "rʌf"),
                        Word("shoot", "جوانه", "ʃuːt"),
                        Word("soil", "خاک", "sɔɪl"),
                        Word("spread", "پخش شدن", "spred"),
                        Word("prepare", "آماده شدن", "prɪˈper")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Forest of Bamboo", titlePersian = "جنگلی از بامبو",
                    text = "In the weeks that followed, something incredible happened. The bamboo grew and grew — not slowly, but with astonishing speed. In six weeks, it reached thirty meters tall! Neighbors came from all over the village to see this miracle. They stood with open mouths, staring at the towering bamboo. \"How is this possible?\" they asked. Behrouz smiled. \"For five years, it was growing underground,\" he explained. \"The roots were preparing the way. When the time was right, it burst forth in just six weeks.\" An old wise man in the village nodded and said, \"This is the way of all great things. The most important growth happens invisibly, deep inside, before anyone can see it. That is what patience truly means.\" Behrouz's bamboo became famous throughout the region. He shared seeds with everyone. And whenever someone asked him the secret of success, he said only one word: \"Patience.\"",
                    textPersian = "در هفته‌های بعد، اتفاق باورنکردنی افتاد. بامبو رشد کرد و رشد کرد — نه آهسته، بلکه با سرعت حیرت‌انگیز. در شش هفته، به سی متر رسید! همسایه‌ها از سراسر دهکده آمدند تا این معجزه را ببینند. با دهان باز ایستادند و به بامبوی بلند خیره شدند. «چطور ممکنه؟» پرسیدند. بهروز لبخند زد. «پنج سال زیر زمین رشد می‌کرد،» توضیح داد. «ریشه‌ها راه را آماده می‌کردند. وقتی زمانش رسید، در شش هفته بیرون آمد.» پیرمرد دانایی در دهکده سر تکان داد و گفت: «این راه همه چیزهای بزرگ است. مهم‌ترین رشد نامرئی اتفاق می‌افتد، در عمق، قبل از اینکه کسی ببیند. این معنای واقعی صبر است.» بامبوی بهروز در تمام منطقه معروف شد. دانه‌ها را با همه قسمت کرد. و هر وقت کسی راز موفقیتش را می‌پرسید، فقط یک کلمه می‌گفت: «صبر.»",
                    vocabulary = listOf(
                        Word("incredible", "باورنکردنی", "ɪnˈkredəbl"),
                        Word("astonishing", "حیرت‌انگیز", "əˈstɑːnɪʃɪŋ"),
                        Word("miracle", "معجزه", "ˈmɪrəkl"),
                        Word("towering", "بلند", "ˈtaʊərɪŋ"),
                        Word("invisibly", "نامرئی", "ɪnˈvɪzəbli")
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
                    text = "Long ago, in a beautiful kingdom surrounded by mountains, there ruled a king named Arman. King Arman was unlike any king before him. He did not care for gold or jewels. He did not build grand palaces for himself. Instead, he used the kingdom's wealth to help the poor, feed the hungry, and educate the children. Every morning, he walked through the streets of his capital, talking to ordinary people. He listened to their problems and tried to solve them. His advisors were worried. \"Your Majesty,\" they said, \"if you keep giving away the royal treasury, the kingdom will run out of money!\" The king smiled gently and replied, \"The more I give, the more I will receive.\" The advisors shook their heads. They did not understand.",
                    textPersian = "زمان‌های دور، در پادشاهی زیبایی که توسط کوه‌ها احاطه شده بود، پادشاهی به نام آرمان حکومت می‌کرد. شاه آرمان با هیچ پادشاه قبلی فرق داشت. به طلا و جواهرات اهمیت نمی‌داد. کاخ‌های بزرگ برای خودش نمی‌ساخت. در عوض از ثروت پادشاهی برای کمک به فقرا، غذا دادن به گرسنه‌ها و آموزش کودکان استفاده می‌کرد. هر صبح از خیابان‌های پایتختش می‌گذشت و با مردم عادی حرف می‌زد. به مشکلاتشان گوش می‌داد و سعی می‌کرد حل کند. مشاورانش نگران بودند. «اعلیحضرت،» می‌گفتند، «اگر مدام خزانه سلطنتی را ببخشید، پادشاهی پول کم می‌آورد!» پادشاه آرام لبخند زد و پاسخ داد: «هر چه بیشتر بدهم، بیشتر دریافت خواهم کرد.» مشاوران سر تکان دادند. نمی‌فهمیدند.",
                    vocabulary = listOf(
                        Word("kingdom", "پادشاهی", "ˈkɪŋdəm"),
                        Word("treasury", "خزانه", "ˈtreʒəri"),
                        Word("advisor", "مشاور", "ədˈvaɪzər"),
                        Word("ordinary", "عادی", "ˈɔːrdneri")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Test of Time", titlePersian = "آزمون زمان",
                    text = "Years passed. King Arman continued to give generously. He built schools, hospitals, and libraries. He gave land to farmers and tools to craftsmen. He made sure no child went hungry. His advisors grew more and more worried. \"The treasury is getting smaller!\" they warned. But the king was not worried. He had noticed something they had not. The kingdom was changing. Children who had once been poor were now educated and working. Farmers who had once been struggling were now prosperous. Craftsmen who had once been idle were now busy. Crime had gone down. Laughter had gone up. The streets were cleaner. People were kinder to each other. And strange as it seemed, the kingdom's economy was thriving. New businesses had opened. Trade with other kingdoms had increased. The people were working harder and producing more. Without realizing it, the king had created a cycle of generosity that was making everyone richer.",
                    textPersian = "سال‌ها گذشت. شاه آرمان به بخشندگی ادامه داد. مدرسه، بیمارستان و کتابخانه ساخت. به کشاورزان زمین و به صنعتگران ابزار داد. مطمئن شد هیچ بچه‌ای گرسنه نمی‌ماند. مشاورانش بیشتر و بیشتر نگران شدند. «خزانه کوچک‌تر می‌شود!» هشدار دادند. اما پادشاه نگران نبود. چیزی را دیده بود که آن‌ها ندیده بودند. پادشاهی در حال تغییر بود. بچه‌هایی که روزی فقیر بودند حالا تحصیل‌کرده و مشغول کار بودند. کشاورزانی که روزی در تنگنا بودند حالا مرفه بودند. صنعتگرانی که روزی بیکار بودند حالا مشغول بودند. جنایت کم شده بود. خنده بیشتر شده بود. خیابان‌ها تمیزتر بودند. مردم با هم مهربان‌تر بودند. و هرچند عجیب به نظر می‌رسید، اقتصاد پادشاهی شکوفا بود. کسب‌وکارهای جدید باز شده بود. تجارت با پادشاهی‌های دیگر افزایش یافته بود. مردم سخت‌تر کار می‌کردند و بیشتر تولید می‌کردند. بدون اینکه خودش بداند، پادشاه چرخه‌ای از بخشندگی ساخته بود که همه را ثروتمندتر می‌کرد.",
                    vocabulary = listOf(
                        Word("generously", "بخشنده", "ˈdʒenərəsli"),
                        Word("prosperous", "مرفه", "ˈprɑːspərəs"),
                        Word("thrive", "شکوفا بودن", "θraɪv"),
                        Word("cycle", "چرخه", "ˈsaɪkl"),
                        Word("produce", "تولید کردن", "prəˈduːs")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Richer Kingdom", titlePersian = "پادشاهی ثروتمندتر",
                    text = "Twenty years after Arman became king, an ambassador from a neighboring kingdom visited. He was amazed by what he saw. \"Your kingdom is the wealthiest and happiest I have ever visited,\" he said. \"How did you do it?\" The king took the ambassador on a tour. He showed him the schools where children learned to read and write. The hospitals where the sick were healed for free. The workshops where craftsmen created beautiful things. The farms where farmers grew more than enough food. \"When people feel safe and cared for,\" the king explained, \"they work harder, they create more, and they help each other. Everyone benefits.\" The ambassador returned to his king with the news. That king, who had been stingy with his people, decided to change his ways. He began to give. And within a few years, his kingdom too began to flourish. King Arman lived to be a very old man. When he died, the entire kingdom mourned. The people built a statue of him in the center of the capital. Under it were written these words: \"The greatest wealth is not what you keep, but what you give.\"",
                    textPersian = "بیست سال پس از پادشاهی آرمان، سفیری از پادشاهی همسایه بازدید کرد. از دیدن آنچه دید شگفت‌زده شد. «پادشاهی شما ثروتمندترین و شادترین جایی است که تا حالا دیده‌ام،» گفت. «چطور این کار را کردید؟» پادشاه سفیر را به گشتی برد. مدرسه‌هایی که بچه‌ها خواندن و نوشتن یاد می‌گرفتند. بیمارستان‌هایی که بیماران مجانی درمان می‌شدند. کارگاه‌هایی که صنعتگران چیزهای زیبا می‌ساختند. مزارعی که کشاورزان بیشتر از نیازشان غذا تولید می‌کردند. «وقتی مردم احساس امنیت و مراقبت کنند،» پادشاه توضیح داد، «سخت‌تر کار می‌کنند، بیشتر می‌سازند و به هم کمک می‌کنند. همه سود می‌برند.» سفیر با این خبر به پادشاه خود بازگشت. آن پادشاه که با مردمش خسیس بود، تصمیم گرفت راهش را عوض کند. شروع به بخشیدن کرد. و در چند سال، پادشاهی او هم شکوفا شد. شاه آرمان تا پیری عمر کرد. وقتی فوت کرد، تمام پادشاهی عزادار شد. مردم مجسمه‌ای از او در مرکز پایتخت ساختند. زیر آن نوشته بودند: «بزرگ‌ترین ثروت آن چیزی نیست که نگه می‌داری، بلکه آن چیزی است که می‌بخشی.»",
                    vocabulary = listOf(
                        Word("ambassador", "سفیر", "æmˈbæsədər"),
                        Word("mourn", "عزاداری کردن", "mɔːrn"),
                        Word("stingy", "خسیس", "ˈstɪndʒi"),
                        Word("statue", "مجسمه", "ˈstætʃuː"),
                        Word("benefit", "سود بردن", "ˈbenɪfɪt")
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
                    textPersian = "خانم فاطمه معلم دانایی در مدرسه‌ای کوچک در تهران بود. دانش‌آموزانش دوستش داشتند چون به آن‌ها فکر کردن را یاد می‌داد. فقط حقایق را آموزش نمی‌داد — به آن‌ها می‌آموخت چطور سؤال کنند، چطور شگفت‌زده شوند و چطور دنیا را متفاوت ببینند. یک صبح، وارد کلاس شد و سؤالی روی تخته نوشت: «مهم‌ترین چیز در زندگی چیست؟» دانش‌آموزان به هم نگاه کردند. کلاس ساکت شد. «دفترهایتان را دربیاورید،» گفت خانم فاطمه، «و پاسخ را بنویسید. ده دقیقه وقت دارید.» دانش‌آموزان شروع به نوشتن کردند. بعضی سریع نوشتند. بعضی نشستند و عمیق فکر کردند. بعد از ده دقیقه، خانم فاطمه کاغذها را جمع کرد. یکی‌یکی با صدای بلند خواند.",
                    vocabulary = listOf(
                        Word("wise", "دانا", "waɪz"),
                        Word("question", "سؤال پرسیدن", "ˈkwestʃən"),
                        Word("wonder", "شگفت‌زده شدن", "ˈwʌndər"),
                        Word("collect", "جمع کردن", "kəˈlekt")
                    )
                ),
                StoryChapter(
                    number = 2, title = "Many Answers", titlePersian = "پاسخ‌های متفاوت",
                    text = "The first answer said, \"Money.\" Miss Fatima smiled and nodded. \"Money is useful,\" she said. \"It helps us live comfortably and care for our families.\" The second answer said, \"Health.\" Miss Fatima smiled again. \"Health is precious,\" she said. \"Without it, we cannot enjoy anything else.\" The third answer said, \"Family.\" Miss Fatima's eyes filled with warmth. \"Family is our foundation,\" she said softly. \"They love us when no one else will.\" Other answers followed: friendship, love, education, kindness, faith. Each answer was beautiful in its own way. The students felt proud of their answers. But then Miss Fatima picked up one last paper. It was from a quiet girl named Zara. Miss Fatima read it slowly: \"Time.\" The class grew silent. Everyone turned to look at Zara.",
                    textPersian = "پاسخ اول گفت: «پول.» خانم فاطمه لبخند زد و سر تکان داد. «پول مفید است،» گفت. «به ما کمک می‌کند راحت زندگی کنیم و از خانواده‌هایمان مراقبت کنیم.» پاسخ دوم گفت: «سلامتی.» خانم فاطمه دوباره لبخند زد. «سلامتی ارزشمند است،» گفت. «بدونش نمی‌توانیم از هیچ چیز دیگری لذت ببریم.» پاسخ سوم گفت: «خانواده.» چشمان خانم فاطمه از گرما پر شد. «خانواده پایه‌ی ماست،» آرام گفت. «آن‌ها ما را دوست دارند وقتی هیچ‌کس دیگری نمی‌خواهد.» پاسخ‌های دیگری آمد: دوستی، عشق، آموزش، مهربانی، ایمان. هر پاسخ به روش خودش زیبا بود. دانش‌آموزان از پاسخ‌هایشان افتخار کردند. اما بعد خانم فاطمه آخرین کاغذ را برداشت. از دختر ساکتی به نام زارا بود. خانم فاطمه آرام خواند: «زمان.» کلاس ساکت شد. همه به زارا نگاه کردند.",
                    vocabulary = listOf(
                        Word("comfortable", "راحت", "ˈkʌmftəbl"),
                        Word("foundation", "پایه", "faʊnˈdeɪʃn"),
                        Word("proud", "مفتخر", "praʊd"),
                        Word("silent", "ساکت", "ˈsaɪlənt")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Answer That Changed Everything", titlePersian = "پاسخی که همه چیز را تغییر داد",
                    text = "Miss Fatima looked at Zara. \"Explain your answer,\" she said gently. Zara stood up slowly. She had never spoken in front of the class before. \"Miss,\" she said, \"money can be lost. Health can fade. Family can pass away. But time is the one thing we can never get back. With time, we can earn money. With time, we can heal our bodies. With time, we can build families and friendships. Without time, we have nothing.\" She paused. \"The most important thing in life is how we use our time. Because time is the only thing that never comes back.\" The class was completely silent. Then Miss Fatima smiled — a smile that reached her eyes. \"Zara is right,\" she said. \"All the answers you gave are important. But time is the foundation of them all. Every second we have is a gift. The question is: what will you do with your gift?\" That day changed the whole class. The students began to pay attention to their time. They studied harder. They spent more time with their families. They stopped wasting hours on meaningless things. Zara became the top student in the class. And Miss Fatima's question became a legend in that school, asked to every new class of students.",
                    textPersian = "خانم فاطمه به زارا نگاه کرد. «پاسخت را توضیح بده،» آرام گفت. زارا آرام بلند شد. هرگز جلوی کلاس حرف نزده بود. «خانم،» گفت، «پول می‌تواند از دست برود. سلامتی می‌تواند تحلیل برود. خانواده می‌تواند فوت کند. اما زمان تنها چیزی است که هرگز نمی‌توانیم برگردانیم. با زمان می‌توانیم پول دربیاوریم. با زمان می‌توانیم بدن‌هایمان را درمان کنیم. با زمان می‌توانیم خانواده و دوستی بسازیم. بدون زمان هیچ چیز نداریم.» مکث کرد. «مهم‌ترین چیز در زندگی این است که چطور از زمانمان استفاده می‌کنیم. چون زمان تنها چیزی است که هرگز برنمی‌گردد.» کلاس کاملاً ساکت شد. بعد خانم فاطمه لبخند زد. «زارا درست می‌گوید،» گفت. «همه پاسخ‌هایی که دادید مهم هستند. اما زمان پایه‌ی همه‌ی آن‌هاست. هر ثانیه‌ای که داریم هدیه است. سؤال این است: با هدیه‌ات چه می‌کنی؟» آن روز تمام کلاس را تغییر داد. دانش‌آموزان شروع کردند به توجه به زمانشان. سخت‌تر درس خواندند. زمان بیشتری با خانواده‌هایشان گذراندند. از تلف کردن ساعت‌ها روی چیزهای بی‌معنی دست کشیدند. زارا بهترین دانش‌آموز کلاس شد. و سؤال خانم فاطمه به افسانه‌ای در آن مدرسه تبدیل شد.",
                    vocabulary = listOf(
                        Word("fade", "تحلیل رفتن", "feɪd"),
                        Word("pause", "مکث کردن", "pɔːz"),
                        Word("meaningless", "بی‌معنی", "ˈmiːnɪŋləs"),
                        Word("legend", "افسانه", "ˈledʒənd"),
                        Word("gift", "هدیه", "ɡɪft")
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
                    text = "In a small town divided by a wide, dangerous river, there lived a young architect named Kian. Every day, Kian watched people struggle to cross the river. There was only one old wooden bridge, and it was always crowded and often broken. People had drowned trying to swim across. Farmers lost their crops because they couldn't reach the market. Children couldn't go to school on the other side. Kian dreamed of building a grand bridge — a beautiful, strong bridge that would unite the two sides of the town forever. He drew sketches in his notebook. He studied bridge designs from around the world. He calculated stress, weight, and materials. When he showed his plans to the town council, they laughed. \"A bridge like that would cost a fortune!\" they said. \"It's impossible.\" But Kian did not give up.",
                    textPersian = "در شهر کوچکی که توسط رودخانه‌ای عریض و خطرناک تقسیم شده بود، معمار جوانی به نام کیان زندگی می‌کرد. هر روز، کیان تماشا می‌کرد که مردم برای عبور از رودخانه تقلا می‌کنند. فقط یک پل چوبی قدیمی بود که همیشه شلوغ بود و اغلب شکسته می‌شد. مردم با تلاش برای شنا کردن غرق شده بودند. کشاورزان محصولاتشان را از دست می‌دادند چون نمی‌توانستند به بازار برسند. بچه‌ها نمی‌توانستند به مدرسه در طرف دیگر بروند. کیان رویای ساختن پلی باشکوه را داشت — پلی زیبا و محکم که دو طرف شهر را برای همیشه متحد کند. طرح‌ها در دفترش می‌کشید. طرح‌های پل از سراسر جهان مطالعه می‌کرد. فشار، وزن و مصالح را محاسبه می‌کرد. وقتی نقشه‌هایش را به شورای شهر نشان داد، خندیدند. «پلی مثل این ثروت زیادی می‌خواهد!» گفتند. «غیرممکن است.» اما کیان تسلیم نشد.",
                    vocabulary = listOf(
                        Word("architect", "معمار", "ˈɑːrkɪtekt"),
                        Word("struggle", "تقلا کردن", "ˈstrʌɡl"),
                        Word("drown", "غرق شدن", "draʊn"),
                        Word("sketch", "طرح", "sketʃ"),
                        Word("council", "شورا", "ˈkaʊnsl")
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Struggle", titlePersian = "سال‌های تلاش",
                    text = "Kian spent years working on his bridge design. He worked during the day as a carpenter to earn money. At night, he studied engineering, physics, and mathematics by candlelight. He traveled to distant cities to see famous bridges. He wrote letters to engineers around the world asking for advice. Some ignored him. A few wrote back with encouragement. One old engineer from Germany wrote: \"Your design is ambitious, but not impossible. The secret is in the foundation. Build the foundation deep and strong, and the bridge will stand for centuries.\" These words inspired Kian deeply. He refined his design. He found a new way to anchor the bridge to the rock beneath the river. He calculated the exact materials needed and the precise cost. After seven years of work, he presented his new plan to the town council. This time, they did not laugh. They listened carefully.",
                    textPersian = "کیان سال‌ها روی طراحی پلش کار کرد. روزها به عنوان نجار کار می‌کرد تا پول دربیاورد. شب‌ها با نور شمع مهندسی، فیزیک و ریاضی می‌خواند. به شهرهای دوردست سفر می‌کرد تا پل‌های معروف را ببیند. به مهندسان سراسر جهان نامه می‌نوشت و مشاوره می‌خواست. بعضی نادیده گرفتند. چند نفر با تشویق پاسخ دادند. یک مهندس پیر آلمانی نوشت: «طرح تو بلندپروازانه است، اما غیرممکن نیست. راز در پایه است. پایه را عمیق و محکم بساز، پل قرن‌ها می‌ایستد.» این کلمات کیان را عمیقاً الهام بخشید. طرحش را اصلاح کرد. راه جدیدی برای لنگر انداختن پل به صخره زیر رودخانه پیدا کرد. مصالح دقیق و هزینه دقیق را محاسبه کرد. بعد از هفت سال کار، طرح جدیدش را به شورای شهر ارائه داد. این بار نخندیدند. با دقت گوش دادند.",
                    vocabulary = listOf(
                        Word("carpenter", "نجار", "ˈkɑːrpəntər"),
                        Word("encouragement", "تشویق", "ɪnˈkɜːrɪdʒmənt"),
                        Word("ambitious", "بلندپروازانه", "æmˈbɪʃəs"),
                        Word("anchor", "لنگر انداختن", "ˈæŋkər"),
                        Word("refine", "اصلاح کردن", "rɪˈfaɪn")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Bridge for Generations", titlePersian = "پلی برای نسل‌ها",
                    text = "The town council was impressed. They agreed to fund half the project if Kian could raise the other half. Kian organized events, sold his designs, and asked for donations. People who had once laughed now donated. Even the old engineer from Germany sent money. After two more years of fundraising and hard work, the bridge was finally ready to be built. It took three years to construct. There were storms and floods. There were injuries and setbacks. But Kian never gave up. On a bright spring morning, the last stone was placed. The town gathered at the river. Kian stood on the bridge with tears in his eyes. It was even more beautiful than he had imagined. It was strong enough for horses, carts, and hundreds of people. The mayor announced that the bridge would be named \"Kian's Bridge.\" Kian shook his head. \"No,\" he said. \"Call it 'The Bridge of Dreams.' Because this bridge proves that no dream is impossible — if you work hard enough, long enough, and believe in yourself.\" The bridge still stands today, more than a hundred years later. Generations have crossed it, not just physically, but symbolically. From one dream, a whole town was united.",
                    textPersian = "شورای شهر تحت تأثیر قرار گرفت. موافقت کردند نیمی از پروژه را تأمین کنند اگر کیان نیم دیگر را جمع کند. کیان رویدادها سازماندهی کرد، طرح‌هایش را فروخت و درخواست کمک کرد. کسانی که روزی خندیده بودند حالا کمک کردند. حتی مهندس پیر آلمانی پول فرستاد. بعد از دو سال دیگر تلاش و جمع‌آوری کمک، پل بالاخره آماده ساخت شد. سه سال طول کشید. طوفان و سیل بود. آسیب و شکست بود. اما کیان تسلیم نشد. یک صبح بهاری روشن، آخرین سنگ گذاشته شد. شهر کنار رودخانه جمع شد. کیان با چشمان پر از اشک روی پل ایستاد. از آنچه تصور می‌کرد زیباتر بود. برای اسب، گاری و صدها نفر به اندازه کافی محکم بود. شهردار اعلام کرد پل «پل کیان» نامیده می‌شود. کیان سر تکان داد. «نه،» گفت. «اسمش را بگذارید 'پل رویاها.' چون این پل ثابت می‌کند هیچ رویایی غیرممکن نیست — اگر به اندازه کافی سخت کار کنی، به اندازه کافی طولانی، و به خودت باور داشته باشی.» پل هنوز امروز، بیش از صد سال بعد، پابرجاست. نسل‌ها از آن گذشته‌اند، نه فقط فیزیکی، بلکه نمادین. از یک رویا، یک شهر کامل متحد شد.",
                    vocabulary = listOf(
                        Word("fund", "تأمین مالی کردن", "fʌnd"),
                        Word("donation", "کمک مالی", "doʊˈneɪʃn"),
                        Word("setback", "شکست", "ˈsetbæk"),
                        Word("construct", "ساختن", "kənˈstrʌkt"),
                        Word("symbolically", "نمادین", "sɪmˈbɑːlɪkli")
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
                    text = "Everyone in the village talked about the strange teacher who lived at the top of the hill. His name was Master Behzad. Students came from far away to learn from him. But when they arrived, they were confused. Master Behzad rarely spoke. When a student asked a question, he would not answer. Instead, he would ask another question. \"Why do you want to know that?\" he might ask. Or, \"What do you think the answer is?\" At first, many students were frustrated. They had come to receive answers. They wanted knowledge handed to them. Instead, they got more questions. Some students gave up and left. But the ones who stayed began to notice something strange. They were learning more than they ever had before — not from being told, but from discovering.",
                    textPersian = "همه در دهکده درباره معلم عجیبی که بالای تپه زندگی می‌کرد حرف می‌زدند. اسمش استاد بهزاد بود. دانش‌آموزان از دور می‌آمدند تا از او یاد بگیرند. اما وقتی می‌رسیدند، گیج می‌شدند. استاد بهزاد به‌ندرت حرف می‌زد. وقتی دانش‌آموزی سؤال می‌پرسید، پاسخ نمی‌داد. در عوض سؤال دیگری می‌پرسید. «چرا می‌خواهی این را بدانی؟» ممکن بود بپرسد. یا: «فکر می‌کنی پاسخ چیست؟» اولش خیلی از دانش‌آموزان کلافه می‌شدند. آمده بودند پاسخ بگیرند. می‌خواستند دانش به آن‌ها داده شود. در عوض سؤال بیشتری می‌گرفتند. بعضی تسلیم شدند و رفتند. اما آن‌هایی که ماندند شروع کردند به توجه به چیز عجیبی. بیشتر از هر وقت دیگری یاد می‌گرفتند — نه از گفتن، بلکه از کشف کردن.",
                    vocabulary = listOf(
                        Word("rarely", "به‌ندرت", "ˈreərli"),
                        Word("frustrated", "کلافه", "ˈfrʌstreɪtɪd"),
                        Word("knowledge", "دانش", "ˈnɑːlɪdʒ"),
                        Word("discover", "کشف کردن", "dɪˈskʌvər")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Lesson of the Empty Cup",
                    titlePersian = "درس فنجان خالی",
                    text = "One day, a wealthy young man came to learn from Master Behzad. He had studied at the best schools. He had read hundreds of books. He thought he knew almost everything. He spoke confidently about philosophy, science, and art. Master Behzad listened quietly. When the young man finished, Master Behzad poured tea into his cup. He kept pouring until the cup was full. Then he kept pouring. Tea spilled over the cup and onto the table. The young man jumped up. \"Stop! The cup is full! It can't hold any more!\" Master Behzad smiled and set down the teapot. \"You are like this cup,\" he said. \"You are so full of your own ideas that nothing new can enter. Come back when your cup is empty.\" The young man was stunned. He had never been challenged like this. He left the teacher's house that day feeling humiliated. But over the following weeks, he could not forget those words. Finally, he returned — humble and ready to truly learn.",
                    textPersian = "یک روز، مرد جوان ثروتمندی برای یادگیری از استاد بهزاد آمد. در بهترین مدارس درس خوانده بود. صدها کتاب خوانده بود. فکر می‌کرد تقریباً همه چیز را می‌داند. با اعتماد به نفس درباره فلسفه، علم و هنر حرف زد. استاد بهزاد آرام گوش داد. وقتی مرد جوان تمام کرد، استاد بهزاد چای در فنجانش ریخت. تا فنجان پر شد ریخت. بعد ادامه داد. چای از فنجان روی میز ریخت. مرد جوان پرید. «بایست! فنجان پر است! بیشتر جا نمی‌گیرد!» استاد بهزاد لبخند زد و قوری را گذاشت. «تو مثل این فنجانی،» گفت. «آنقدر از ایده‌های خودت پر هستی که هیچ چیز جدیدی نمی‌تواند وارد شود. وقتی فنجانت خالی شد برگرد.» مرد جوان شوکه شد. هرگز این‌طور به چالش کشیده نشده بود. آن روز خجالت‌زده رفت. اما در هفته‌های بعد نمی‌توانست آن کلمات را فراموش کند. در نهایت، فروتن و آماده یادگیری واقعی، بازگشت.",
                    vocabulary = listOf(
                        Word("confidently", "با اعتماد به نفس", "ˈkɑːnfɪdəntli"),
                        Word("pour", "ریختن", "pɔːr"),
                        Word("stunned", "شوکه", "stʌnd"),
                        Word("humiliated", "خجالت‌زده", "hjuːˈmɪlieɪtɪd"),
                        Word("humble", "فروتن", "ˈhʌmbl")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Teacher's Secret", titlePersian = "راز معلم",
                    text = "The young man studied with Master Behzad for five years. During those years, he never once received a direct answer. Every question led to more questions. Every problem led to deeper thought. He learned to sit with uncertainty. He learned to think from different angles. He learned to question his own assumptions. At the end of five years, the young man had become a wise teacher himself. On his last day, he asked Master Behzad one final question. \"Master, why did you never give me direct answers?\" Master Behzad looked at him with kind eyes and said, \"Because the answers you discover yourself are the ones you truly own. If I gave you answers, you would simply memorize them and forget them. But the truths you find through your own thinking — those become part of your soul.\" The young man bowed deeply. \"Thank you, Master. You have taught me the most important lesson of all.\" \"And what is that?\" asked Master Behzad with a smile. The young man replied, \"You taught me not what to think, but how to think. And that is the true mark of a great teacher.\"",
                    textPersian = "مرد جوان پنج سال با استاد بهزاد درس خواند. در آن سال‌ها، هرگز پاسخ مستقیمی نگرفت. هر سؤالی به سؤالات بیشتر منجر می‌شد. هر مشکلی به فکر عمیق‌تر. یاد گرفت با عدم قطعیت بنشیند. یاد گرفت از زوایای مختلف فکر کند. یاد گرفت فرضیات خودش را به چالش بکشد. در پایان پنج سال، خودش معلم دانایی شده بود. روز آخر، یک سؤال نهایی از استاد بهزاد پرسید. «استاد، چرا هرگز پاسخ مستقیم ندادید؟» استاد بهزاد با چشمان مهربان نگاهش کرد و گفت: «چون پاسخ‌هایی که خودت کشف می‌کنی، آن‌هایی هستند که واقعاً مالکشان می‌شوی. اگر پاسخ‌ها را به تو می‌دادم، فقط حفظ می‌کردی و فراموش می‌کردی. اما حقیقت‌هایی که از فکر خودت پیدا می‌کنی — آن‌ها بخشی از روحت می‌شوند.» مرد جوان عمیقاً تعظیم کرد. «ممنون استاد. مهم‌ترین درس را به من یاد دادید.» «و آن چیست؟» استاد بهزاد با لبخند پرسید. مرد جوان پاسخ داد: «به من یاد دادید چه فکر نکنم، بلکه چطور فکر کنم. و این نشانه واقعی یک معلم بزرگ است.»",
                    vocabulary = listOf(
                        Word("uncertainty", "عدم قطعیت", "ʌnˈsɜːrtnti"),
                        Word("assumption", "فرض", "əˈsʌmpʃn"),
                        Word("memorize", "حفظ کردن", "ˈmeməraɪz"),
                        Word("soul", "روح", "soʊl"),
                        Word("mark", "نشانه", "mɑːrk")
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
                    text = "Two friends, Amir and Kamran, were traveling across a vast desert. They were trying to reach a distant city on the other side. The journey was long and dangerous. They had prepared well — food, maps, and supplies. But they had made one mistake. They had brought only one bottle of water. They had planned to refill at a well halfway through, but when they reached it, the well was dry. Now they were in the middle of the desert, with a single bottle between them. The sun was burning. The sand was endless. They had to walk three more days to reach the city. Amir said, \"We should save the water. If we drink it now, we will have nothing later.\" Kamran said, \"We should drink it now. We are thirsty. We need energy to walk.\" The two friends argued back and forth. The sun was setting, and still they had not decided.",
                    textPersian = "دو دوست، امیر و کامران، در حال عبور از صحرایی وسیع بودند. تلاش می‌کردند به شهری دور در طرف دیگر برسند. سفر طولانی و خطرناک بود. خوب آماده شده بودند — غذا، نقشه و لوازم. اما یک اشتباه کرده بودند. فقط یک بطری آب آورده بودند. برنامه داشتند در نیمه راه از چاهی پر کنند، اما وقتی رسیدند، چاه خشک بود. حالا در وسط بیابان بودند، با یک بطری بینشان. خورشید می‌سوخت. شن بی‌پایان بود. باید سه روز دیگر راه می‌رفتند. امیر گفت: «باید آب را ذخیره کنیم. اگر حالا بنوشیم، بعداً چیزی نداریم.» کامران گفت: «باید حالا بنوشیم. تشنه‌ایم. برای راه رفتن انرژی لازم داریم.» دو دوست بحث کردند. خورشید در حال غروب بود و هنوز تصمیم نگرفته بودند.",
                    vocabulary = listOf(
                        Word("vast", "وسیع", "væst"),
                        Word("desert", "بیابان", "ˈdezərt"),
                        Word("supply", "لوازم", "səˈplaɪ"),
                        Word("endless", "بی‌پایان", "ˈendləs"),
                        Word("argue", "بحث کردن", "ˈɑːrɡjuː")
                    )
                ),
                StoryChapter(
                    number = 2, title = "A Long Night", titlePersian = "شبی طولانی",
                    text = "That night, as they sat under the stars, something unexpected happened. A young boy appeared out of nowhere. He looked tired and thirsty. His clothes were torn, and his lips were dry. \"Please,\" he said in a weak voice. \"I am lost. My family is in the next village. Please help me.\" Amir and Kamran looked at each other. They had only one bottle of water. Should they share it with a stranger? Amir hesitated. Kamran thought for a moment. Then Kamran said, \"We must help him. What is the point of saving water if we lose our humanity?\" Amir was not sure. \"But what about us? We need water too.\" Kamran replied, \"We give him a little. Just enough to help him reach the village. We can survive on less.\" Reluctantly, Amir agreed. They gave the boy some water and guided him to the next village, which was nearby. The boy thanked them and disappeared into the night. But something strange happened after that.",
                    textPersian = "آن شب، وقتی زیر ستاره‌ها نشسته بودند، اتفاق غیرمنتظره‌ای افتاد. پسری جوان از ناکجا ظاهر شد. خسته و تشنه به نظر می‌رسید. لباس‌هایش پاره و لب‌هایش خشک بود. «لطفاً،» با صدای ضعیف گفت. «گم شده‌ام. خانواده‌ام در دهکده بعدی‌اند. لطفاً کمکم کنید.» امیر و کامران به هم نگاه کردند. فقط یک بطری آب داشتند. باید با یک غریبه قسمت کنند؟ امیر تردید کرد. کامران لحظه‌ای فکر کرد. بعد گفت: «باید کمکش کنیم. چه فایده‌ای دارد آب را ذخیره کنیم اگر انسانیت را از دست بدهیم؟» امیر مطمئن نبود. «اما خودمان چی؟ ما هم آب لازم داریم.» کامران پاسخ داد: «کمی به او می‌دهیم. فقط به اندازه‌ای که به دهکده برسد. می‌توانیم با کمتر زنده بمانیم.» با اکراه، امیر موافقت کرد. کمی آب به پسر دادند و او را به دهکده بعدی راهنمایی کردند. پسر تشکر کرد و در شب ناپدید شد. اما بعد از آن اتفاق عجیبی افتاد.",
                    vocabulary = listOf(
                        Word("unexpected", "غیرمنتظره", "ˌʌnɪkˈspektɪd"),
                        Word("torn", "پاره", "tɔːrn"),
                        Word("hesitate", "تردید کردن", "ˈhezɪteɪt"),
                        Word("humanity", "انسانیت", "hjuːˈmænəti"),
                        Word("reluctantly", "با اکراه", "rɪˈlʌktəntli")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Balance of Life", titlePersian = "تعادل زندگی",
                    text = "The next morning, Kamran saw a small bag near where the boy had been sitting. He opened it. Inside were dates, nuts, and a small map. On the map was marked a well — one they had not known about. \"This boy was not a real boy,\" said Kamran. \"He was a test. And we passed.\" They followed the map and found the well. It was full of fresh, cool water. They drank and refilled their bottle. They reached the city safely. Years later, when telling the story, Kamran always said, \"We learned the true secret of balance that day. Saving for tomorrow is wise. But ignoring the need of today is foolish. The key is not to hoard everything or spend everything, but to give what is needed, when it is needed. Kindness does not waste resources — it multiplies them.\" And Amir, who had once wanted to save the water, nodded. \"I was wrong,\" he would say. \"The greatest wealth is not what we keep, but what we share.\" Their friendship grew even deeper after that journey. And every time they faced a difficult decision, they remembered the lesson of the desert: that balance, not extremes, is the path to a meaningful life.",
                    textPersian = "صبح روز بعد، کامران کیسه کوچکی نزدیک جایی که پسر نشسته بود دید. بازش کرد. داخلش خرما، آجیل و نقشه کوچکی بود. روی نقشه چاهی علامت‌گذاری شده بود — چاهی که نمی‌شناختند. «این پسر واقعی نبود،» کامران گفت. «آزمون بود. و موفق شدیم.» نقشه را دنبال کردند و چاه را پیدا کردند. پر از آب تازه و خنک بود. نوشیدند و بطری را پر کردند. با امنیت به شهر رسیدند. سال‌ها بعد، وقتی داستان را تعریف می‌کرد، کامران همیشه می‌گفت: «آن روز راز واقعی تعادل را یاد گرفتیم. ذخیره کردن برای فردا عاقلانه است. اما نادیده گرفتن نیاز امروز احمقانه است. کلید این است که همه چیز را ذخیره نکنیم یا همه را خرج نکنیم، بلکه آنچه لازم است را بدهیم، وقتی لازم است. مهربانی منابع را تلف نمی‌کند — آن‌ها را چند برابر می‌کند.» و امیر، که روزی می‌خواست آب را ذخیره کند، سر تکان می‌داد. «اشتباه کردم،» می‌گفت. «بزرگ‌ترین ثروت آن نیست که نگه می‌داریم، بلکه آن است که قسمت می‌کنیم.» دوستی‌شان بعد از آن سفر عمیق‌تر شد. و هر بار با تصمیم سختی روبرو می‌شدند، درس بیابان را به یاد می‌آوردند: تعادل، نه افراط، راه زندگی معنادار است.",
                    vocabulary = listOf(
                        Word("date", "خرما", "deɪt"),
                        Word("hoard", "ذخیره کردن", "hɔːrd"),
                        Word("multiply", "چند برابر کردن", "ˈmʌltɪplaɪ"),
                        Word("extreme", "افراط", "ɪkˈstriːm"),
                        Word("meaningful", "معنادار", "ˈmiːnɪŋfl")
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
                    textPersian = "زمان‌های دور، در امپراتوری بزرگی، امپراتور پیری به نام داریوش زندگی می‌کرد. یک پسر داشت، شاهزاده کاوه. امپراتور افسانه‌هایی درباره پادشاهی گمشده‌ای در کوه‌ها شنیده بود — پادشاهی که گفته می‌شد راز خوشبختی ابدی را در خود دارد. بسیاری جستجو کرده بودند. هیچ‌کدام برنگشته بودند. وقتی امپراتور پیرتر شد، پسرش را کنار خود خواند. «کاوه،» گفت، «پیر شده‌ام. قبل از مرگ می‌خواهم راز آن پادشاهی گمشده را بدانم. برو و پیدایش کن. خردش را برگردان.» شاهزاده کاوه، هرچند جوان و آزموده‌نشده، اطاعت کرد. گروه کوچکی از مردان وفادار جمع کرد و به کوه‌ها رفت. ماه‌ها از جنگل‌ها، رودخانه‌ها و بیابان‌ها گذشتند. با حیوانات وحشی، آب و هوای سخت و شکم‌های گرسنه روبرو شدند. اما پادشاهی نیافتند.",
                    vocabulary = listOf(
                        Word("emperor", "امپراتور", "ˈempərər"),
                        Word("legend", "افسانه", "ˈledʒənd"),
                        Word("eternal", "ابدی", "ɪˈtɜːrnl"),
                        Word("obey", "اطاعت کردن", "əˈbeɪ"),
                        Word("harsh", "سخت", "hɑːrʃ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Old Hermit", titlePersian = "زاهد پیر",
                    text = "After a year of searching, Prince Kaveh was exhausted. His men had given up and returned home. Only he remained. One evening, he came across a small hut in the mountains. Smoke rose from its chimney. He knocked. An old hermit opened the door. He had long white hair and eyes that seemed to see through everything. \"Welcome, Prince,\" the hermit said, \"I have been expecting you.\" Kaveh was shocked. \"You know me?\" The hermit smiled. \"I know many things. You seek the lost kingdom. But tell me — what do you truly seek?\" Kaveh thought for a moment. \"I seek its wisdom,\" he said. \"The secret of eternal happiness.\" The hermit nodded slowly. \"Then you have already found it.\" Kaveh was confused. \"What do you mean?\" The hermit gestured to the world around them. \"Look,\" he said, \"at the sunset, the mountains, the stars. Look at the journey you have taken. Look at the courage you have shown, the lessons you have learned, the man you have become.\" Kaveh was silent.",
                    textPersian = "بعد از یک سال جستجو، شاهزاده کاوه خسته بود. مردانش تسلیم شده و به خانه رفته بودند. فقط او مانده بود. یک عصر، کلبه کوچکی در کوه‌ها دید. دود از دودکشش بلند می‌شد. در زد. زاهد پیری در را باز کرد. موهای بلند سفید و چشمانی داشت که به نظر می‌رسید همه چیز را می‌بیند. «خوش آمدی شاهزاده،» زاهد گفت، «منتظرت بودم.» کاوه شوکه شد. «مرا می‌شناسی؟» زاهد لبخند زد. «چیزهای زیادی می‌دانم. به دنبال پادشاهی گمشده هستی. اما بگو — واقعاً چه می‌خواهی؟» کاوه لحظه‌ای فکر کرد. «خردش را می‌خواهم،» گفت. «راز خوشبختی ابدی.» زاهد آرام سر تکان داد. «پس قبلاً پیدایش کرده‌ای.» کاوه گیج شد. «منظورت چیست؟» زاهد به دنیای اطرافشان اشاره کرد. «نگاه کن،» گفت، «به غروب، کوه‌ها، ستاره‌ها. به سفری که کرده‌ای نگاه کن. به شجاعتی که نشان داده‌ای، درس‌هایی که یاد گرفته‌ای، مردی که شده‌ای.» کاوه ساکت شد.",
                    vocabulary = listOf(
                        Word("hermit", "زاهد", "ˈhɜːrmɪt"),
                        Word("exhausted", "خسته", "ɪɡˈzɔːstɪd"),
                        Word("gesture", "اشاره کردن", "ˈdʒestʃər"),
                        Word("courage", "شجاعت", "ˈkɜːrɪdʒ"),
                        Word("wisdom", "خرد", "ˈwɪzdəm")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Real Kingdom", titlePersian = "پادشاهی واقعی",
                    text = "The hermit continued, \"The lost kingdom is not a place on a map. It is a state of mind. It is found in the hearts of those who seek truth, who grow through struggle, who learn from every step of their journey. Every person who truly seeks finds it. But most look in the wrong place. They look for gold and palaces. They forget that the greatest treasure is within.\" Kaveh stood in silence. Tears filled his eyes. He realized that everything he had been looking for — peace, purpose, meaning — he had carried all along. He had just been too focused on a destination to see it. The hermit gave him a small book. \"This is my gift to you. But you already know what it contains.\" Kaveh traveled home slowly, savoring every step. When he arrived, his father was near death. The emperor whispered, \"Did you find it?\" Kaveh held his father's hand and said, \"Yes, Father. I found it. It was never lost. It was always within me — within all of us. The kingdom is not a place. It is the journey itself.\" The emperor smiled peacefully, and closed his eyes for the last time. Kaveh became a wise and beloved ruler. He never built a palace, but he built schools and libraries. He never sought treasure, but he sought justice and peace. And whenever young people came to him asking about the lost kingdom, he would smile and say: \"Begin your journey. Do not fear. Because the kingdom you seek is the person you are becoming.\"",
                    textPersian = "زاهد ادامه داد: «پادشاهی گمشده جایی روی نقشه نیست. حالتی از ذهن است. در قلب کسانی یافت می‌شود که حقیقت را می‌جویند، از سختی رشد می‌کنند، از هر قدم سفرشان یاد می‌گیرند. هر کسی که واقعاً بجوید پیدا می‌کند. اما بیشتر مردم جای اشتباه را نگاه می‌کنند. به دنبال طلا و کاخ می‌گردند. فراموش می‌کنند بزرگ‌ترین گنج در درون است.» کاوه در سکوت ایستاد. اشک چشمانش را پر کرد. فهمید هر چیزی که دنبالش بود — آرامش، هدف، معنا — همه را با خود داشت. فقط آنقدر روی مقصد متمرکز بود که نمی‌دید. زاهد کتاب کوچکی به او داد. «این هدیه من به تو است. اما می‌دانی چه دارد.» کاوه آرام به خانه سفر کرد و از هر قدم لذت برد. وقتی رسید، پدرش نزدیک مرگ بود. امپراتور زمزمه کرد: «پیدایش کردی؟» کاوه دست پدرش را گرفت و گفت: «بله پدر. پیدایش کردم. هرگز گم نشده بود. همیشه درون من بود — درون همه ما. پادشاهی یک مکان نیست. خود سفر است.» امپراتور با آرامش لبخند زد و چشمانش را برای آخرین بار بست. کاوه فرمانروایی دانا و محبوب شد. هرگز کاخی نساخت، اما مدرسه و کتابخانه ساخت. هرگز دنبال گنج نرفت، اما دنبال عدالت و صلح رفت. و هر وقت جوانان از او درباره پادشاهی گمشده می‌پرسیدند، لبخند می‌زد و می‌گفت: «سفرت را شروع کن. نترس. چون پادشاهی که می‌جویی، شخصی است که در حال شدنش هستی.»",
                    vocabulary = listOf(
                        Word("state of mind", "حالت ذهنی", ""),
                        Word("savor", "لذت بردن از", "ˈseɪvər"),
                        Word("purpose", "هدف", "ˈpɜːrpəs"),
                        Word("justice", "عدالت", "ˈdʒʌstɪs"),
                        Word("beloved", "محبوب", "bɪˈlʌvɪd")
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
                    textPersian = "روزی تاجر ثروتمندی به نام صادق بود. به کشورهای بسیاری سفر کرده و شگفتی‌های زیادی دیده بود. اما خوشحال نبود. همیشه حس می‌کرد جایی بیرون، گنجی هست که هنوز پیدا نکرده. یک روز، شایعه‌ای شنید. پیرزنی دانا در دهکده‌اش گفت: «گنج بزرگی در سرزمینی دور دفن شده. هر کس پیدا کند، دیگر هرگز به چیزی نیاز ندارد.» همین برای صادق کافی بود. زنش، فرزندانش و خانه‌اش را ترک کرد و برای پیدا کردن گنج رفت. زنش التماس کرد بماند. «به اندازه کافی داریم،» گفت. «خانه داریم. بچه داریم. عشق داریم.» اما صادق سر تکان داد. «نمی‌فهمی،» گفت. «این گنج زندگی‌مان را برای همیشه تغییر می‌دهد.» و رفت.",
                    vocabulary = listOf(
                        Word("merchant", "تاجر", "ˈmɜːrtʃənt"),
                        Word("wonder", "شگفتی", "ˈwʌndər"),
                        Word("rumor", "شایعه", "ˈruːmər"),
                        Word("buried", "دفن شده", "ˈberid"),
                        Word("beg", "التماس کردن", "beɡ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Searching", titlePersian = "سال‌های جستجو",
                    text = "Sadegh traveled for years. He crossed oceans. He climbed mountains. He walked through jungles and deserts. He visited ancient temples and forgotten ruins. He consulted with priests, scholars, and mystics. He dug holes in a hundred places. He found gold, yes. He found jewels. He found things that made him richer. But none of them were the treasure. None of them satisfied the deep ache in his heart. Years passed. His hair turned gray. His body grew tired. One night, he sat alone in an abandoned hut in a foreign land. He was cold, hungry, and alone. He thought of his wife, his children, his home. He thought of the warmth of their kitchen, the sound of his children laughing, the touch of his wife's hand. And suddenly, he understood. Tears rolled down his face. He had been searching the whole world for a treasure that he had left behind.",
                    textPersian = "صادق سال‌ها سفر کرد. از اقیانوس‌ها گذشت. از کوه‌ها بالا رفت. از جنگل‌ها و بیابان‌ها گذشت. از معابد باستانی و خرابه‌های فراموش‌شده بازدید کرد. با کشیشان، دانشمندان و عارفان مشورت کرد. صد جا چاله کند. طلا پیدا کرد، بله. جواهرات پیدا کرد. چیزهایی پیدا کرد که او را ثروتمندتر کردند. اما هیچ‌کدام گنج نبود. هیچ‌کدام درد عمیق قلبش را راضی نکرد. سال‌ها گذشت. موهایش خاکستری شد. بدنش خسته شد. یک شب، تنها در کلبه‌ای متروک در سرزمینی بیگانه نشست. سرد، گرسنه و تنها بود. به زنش فکر کرد، به فرزندانش، به خانه‌اش. به گرمای آشپزخانه‌شان فکر کرد، به صدای خنده بچه‌هایش، به لمس دست زنش. و ناگهان فهمید. اشک روی صورتش غلتید. تمام دنیا را برای گنجی جستجو کرده بود که پشت سر گذاشته بود.",
                    vocabulary = listOf(
                        Word("jungle", "جنگل", "ˈdʒʌŋɡl"),
                        Word("ruin", "خرابه", "ˈruːɪn"),
                        Word("mystic", "عارف", "ˈmɪstɪk"),
                        Word("abandoned", "متروک", "əˈbændənd"),
                        Word("ache", "درد", "eɪk")
                    )
                ),
                StoryChapter(
                    number = 3, title = "Home at Last", titlePersian = "بالاخره خانه",
                    text = "Sadegh turned around and walked home. It took him almost a year to return. When he finally reached his village, his heart was beating fast. What if his wife had married someone else? What if his children didn't remember him? What if the house was empty? He walked to his door slowly. He knocked. His wife opened it. She was older now, her face lined with worry and years. She stared at him for a long moment. Then she burst into tears and threw her arms around him. \"You came back,\" she whispered. \"You came back.\" His children — now young adults — ran out and hugged him. That night, they sat together around the kitchen table. Sadegh told them everything. He told them about his travels, his searches, and the emptiness he had felt. And then he said, \"I was looking for treasure. But I already had it. It was here, all along. The real treasure is not gold. It is not jewels. The real treasure is the people who love you, the home you come back to, the family that waits for you.\" His wife smiled through her tears. From that day on, Sadegh never left again. He spent the rest of his life with his family — the greatest treasure of all.",
                    textPersian = "صادق برگشت و به خانه رفت. تقریباً یک سال طول کشید تا برگردد. وقتی بالاخره به دهکده‌اش رسید، قلبش تند می‌زد. اگر زنش با کس دیگری ازدواج کرده بود؟ اگر بچه‌هایش او را به یاد نمی‌آوردند؟ اگر خانه خالی بود؟ آرام به در خانه‌اش رفت. در زد. زنش بازش کرد. حالا مسن‌تر بود، صورتش پر از نگرانی و سال‌ها. لحظه‌ای طولانی به او خیره شد. بعد اشک ریخت و دستانش را دور او پیچید. «برگشتی،» زمزمه کرد. «برگشتی.» فرزندانش — حالا بزرگسالان جوان — بیرون دویدند و او را در آغوش گرفتند. آن شب، دور میز آشپزخانه با هم نشستند. صادق همه چیز را گفت. از سفرهایش، جستجوهایش و خالی بودن حسش گفت. و بعد گفت: «دنبال گنج می‌گشتم. اما قبلاً داشتمش. اینجا بود، تمام مدت. گنج واقعی طلا نیست. جواهر نیست. گنج واقعی کسانی هستند که تو را دوست دارند، خانه‌ای که به آن برمی‌گردی، خانواده‌ای که منتظرت می‌ماند.» زنش از میان اشک لبخند زد. از آن روز، صادق دیگر هرگز نرفت. بقیه عمرش را با خانواده‌اش گذراند — بزرگ‌ترین گنج تمام.",
                    vocabulary = listOf(
                        Word("line", "چین و چروک", "laɪn"),
                        Word("burst into tears", "شروع به گریه کردن", ""),
                        Word("throw arms around", "در آغوش گرفتن", ""),
                        Word("emptiness", "خالی بودن", "ˈemptinəs"),
                        Word("wait for", "منتظر ماندن", "weɪt")
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
                    textPersian = "در دره‌ای بین دو کوه، رودخانه‌ای عریض و خروشان بود. سریع و سرد بود و صخره‌های زیر سطحش تیز. بسیاری در تلاش برای عبور غرق شده بودند. مسافران کاملاً از این مسیر اجتناب می‌کردند. دهکده‌های دو طرف رودخانه منزوی بودند و نمی‌توانستند تجارت یا دیدار کنند. یک روز، پیرمردی به نام مرتضی به رودخانه آمد. نجاری بود که بعد از عمری کار بازنشسته شده بود. درباره رودخانه و خطری که ایجاد می‌کرد شنیده بود. روی ساحل ایستاد و تماشا کرد. بعد آرام با خودش گفت: «یک نفر باید اینجا پل بسازد.» و بعد اضافه کرد: «شاید آن یک نفر من باشم.»",
                    vocabulary = listOf(
                        Word("rushing", "خروشان", "ˈrʌʃɪŋ"),
                        Word("drown", "غرق شدن", "draʊn"),
                        Word("isolated", "منزوی", "ˈaɪsəleɪtɪd"),
                        Word("carpenter", "نجار", "ˈkɑːrpəntər"),
                        Word("retired", "بازنشسته", "rɪˈtaɪərd")
                    )
                ),
                StoryChapter(
                    number = 2, title = "Years of Building", titlePersian = "سال‌های ساختن",
                    text = "Morteza began to plan. He studied the river, measuring its width and depth. He studied the rocks on both banks. He designed a bridge that could hold the weight of horses and carts. He began to gather wood and stone. Every day, he worked alone. He cut trees in the forest. He carried rocks from the mountainside. He built a wooden frame to support the bridge. The work was hard. The days were long. The winters were cold. But Morteza never stopped. Some people thought he was crazy. \"Why are you doing this?\" they asked. \"You are old. You will never use this bridge.\" Morteza smiled and replied, \"I am not building it for myself. I am building it for those who come after me.\" After five years of hard work, the bridge was finally complete. It was strong and beautiful. And for the first time in a hundred years, people could cross the river safely.",
                    textPersian = "مرتضی شروع به برنامه‌ریزی کرد. رودخانه را مطالعه کرد، عرض و عمقش را اندازه گرفت. صخره‌های دو طرف را بررسی کرد. پلی طراحی کرد که می‌توانست وزن اسب‌ها و گاری‌ها را تحمل کند. شروع به جمع کردن چوب و سنگ کرد. هر روز تنها کار می‌کرد. درخت‌ها را در جنگل می‌برید. سنگ‌ها را از دامنه کوه می‌آورد. اسکلت چوبی برای حمایت از پل ساخت. کار سخت بود. روزها طولانی بودند. زمستان‌ها سرد. اما مرتضی هرگز متوقف نشد. بعضی‌ها فکر می‌کردند دیوانه است. «چرا این کار را می‌کنی؟» می‌پرسیدند. «پیری. هرگز از این پل استفاده نخواهی کرد.» مرتضی لبخند می‌زد و پاسخ می‌داد: «آن را برای خودم نمی‌سازم. برای کسانی می‌سازم که بعد از من می‌آیند.» بعد از پنج سال کار سخت، پل بالاخره آماده شد. محکم و زیبا بود. و برای اولین بار در صد سال، مردم می‌توانستند با امنیت از رودخانه عبور کنند.",
                    vocabulary = listOf(
                        Word("measure", "اندازه گرفتن", "ˈmeʒər"),
                        Word("frame", "اسکلت", "freɪm"),
                        Word("support", "حمایت کردن", "səˈpɔːrt"),
                        Word("crazy", "دیوانه", "ˈkreɪzi"),
                        Word("complete", "کامل", "kəmˈpliːt")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Legacy", titlePersian = "میراث",
                    text = "A young traveler arrived at the bridge one day. He was amazed by its beauty and strength. \"Who built this?\" he asked a villager. \"An old man named Morteza,\" the villager replied. \"He is still alive. He lives over there.\" The traveler went to visit Morteza. He found the old man sitting on a bench, watching people cross the bridge. \"Why did you build this bridge, old man?\" the traveler asked. \"You will not cross it much longer. You will not live to see all the people who will use it.\" Morteza smiled — a peaceful, contented smile. \"No, I will not,\" he said. \"But they will. And their children will. And their children's children. That is enough.\" The traveler was deeply moved. He sat beside Morteza for a while, watching the traffic on the bridge. \"May I ask you something else?\" the traveler said. \"What is the greatest lesson you have learned in your long life?\" Morteza thought for a moment. Then he said, \"We are all just passing through this world. The real question is not what we take with us, but what we leave behind. Build something. Help someone. Plant a tree. Write a book. Teach a child. Do something that will last longer than you. That is what gives life meaning.\" The traveler never forgot those words. He went on to build schools in his own country. And on the wall of each school, he painted a picture of an old man building a bridge.",
                    textPersian = "یک روز مسافر جوانی به پل رسید. از زیبایی و استحکامش شگفت‌زده شد. «این را چه کسی ساخت؟» از یکی از اهالی پرسید. «پیرمردی به نام مرتضی،» روستایی پاسخ داد. «هنوز زنده است. آنجا زندگی می‌کند.» مسافر به دیدن مرتضی رفت. پیرمرد را دید که روی نیمکتی نشسته و تماشا می‌کند مردم از پل عبور می‌کنند. «چرا این پل را ساختی پیرمرد؟» مسافر پرسید. «زیاد از آن عبور نخواهی کرد. زنده نمی‌مانی تا همه مردمی که استفاده می‌کنند را ببینی.» مرتضی لبخند زد — لبخندی آرام و راضی. «نه، نمی‌مانم،» گفت. «اما آن‌ها می‌مانند. بچه‌هایشان می‌مانند. بچه‌های بچه‌هایشان. همین کافی است.» مسافر عمیقاً متأثر شد. مدتی کنار مرتضی نشست و ترافیک پل را تماشا کرد. «می‌توانم چیز دیگری بپرسم؟» مسافر گفت. «بزرگ‌ترین درسی که در عمر طولانی‌ات یاد گرفتی چیست؟» مرتضی لحظه‌ای فکر کرد. بعد گفت: «همه ما فقط از این دنیا می‌گذریم. سؤال واقعی این نیست که چه با خود می‌بریم، بلکه چه پشت سر می‌گذاریم. چیزی بساز. به کسی کمک کن. درختی بکار. کتابی بنویس. کودکی را آموزش بده. کاری کن که بیشتر از تو دوام بیاورد. این چیزی است که زندگی را معنا می‌بخشد.» مسافر هرگز آن کلمات را فراموش نکرد. در کشور خودش مدارسی ساخت. و روی دیوار هر مدرسه، تصویری از پیرمردی که پل می‌سازد کشید.",
                    vocabulary = listOf(
                        Word("contented", "راضی", "kənˈtentɪd"),
                        Word("moved", "متأثر", "muːvd"),
                        Word("legacy", "میراث", "ˈleɡəsi"),
                        Word("durable", "بادوام", "ˈdʊrəbl"),
                        Word("last", "دوام آوردن", "læst")
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
                    text = "In a small village in the mountains, there was a legend. At the top of the highest tower in the village square, there was a bell. But not just any bell. This bell, the elders said, was magical. It would only ring when a lie was spoken in the village. If someone told a lie, the bell would ring out loudly for all to hear. If the truth was spoken, it remained silent. For generations, the villagers had trusted this bell. It had exposed cheaters, liars, and deceivers. It had brought justice to the village. But in recent years, the bell had not rung at all. People had become more honest, or so they believed. The village was peaceful, and everyone trusted each other. Or so it seemed.",
                    textPersian = "در دهکده‌ای کوچک در کوه‌ها، افسانه‌ای بود. در بالای بلندترین برج در میدان دهکده، زنگی بود. اما نه هر زنگی. این زنگ، به گفته بزرگان، جادویی بود. فقط وقتی دروغی در دهکده گفته می‌شد به صدا درمی‌آمد. اگر کسی دروغ می‌گفت، زنگ با صدای بلند برای همه به صدا درمی‌آمد. اگر حقیقت گفته می‌شد، ساکت می‌ماند. نسل‌ها، اهالی به این زنگ اعتماد کرده بودند. کلاهبرداران، دروغگویان و فریبکاران را افشا کرده بود. عدالت را به دهکده آورده بود. اما در سال‌های اخیر، زنگ اصلاً به صدا درنیامده بود. مردم صادق‌تر شده بودند، یا حداقل این‌طور باور داشتند. دهکده آرام بود و همه به هم اعتماد داشتند. یا این‌طور به نظر می‌رسید.",
                    vocabulary = listOf(
                        Word("legend", "افسانه", "ˈledʒənd"),
                        Word("tower", "برج", "ˈtaʊər"),
                        Word("expose", "افشا کردن", "ɪkˈspoʊz"),
                        Word("deceiver", "فریبکار", "dɪˈsiːvər"),
                        Word("peaceful", "آرام", "ˈpiːsfl")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Rich Man's Claim", titlePersian = "ادعای مرد ثروتمند",
                    text = "One day, a rich man named Karim called the entire village to the square. He stood before them with a proud smile. \"My friends,\" he announced, \"I have given all of my wealth to the poor. I have kept nothing for myself. From this day forward, I am a poor man. But I am rich in spirit.\" The villagers were amazed. Some began to clap. Others cried tears of admiration. Karim had been the wealthiest man in the village. His house was huge. His fields were vast. His gold was legendary. But now, he claimed, he had given it all away. Everyone praised Karim. Some even began to call him a saint. But then, someone looked up at the tower. The bell had not rung. This surprised everyone. If Karim was telling the truth, the bell should be silent. And it was. So everyone believed him. Karim walked proudly through the crowd, accepting their praise. But an old woman named Zahra watched him closely. She said nothing. But she noticed something. The bell was silent. But it should have rung.",
                    textPersian = "یک روز، مرد ثروتمندی به نام کریم تمام دهکده را به میدان خواند. با لبخندی مغرور مقابلشان ایستاد. «دوستان،» اعلام کرد، «تمام ثروتم را به فقرا داده‌ام. چیزی برای خودم نگه نداشته‌ام. از امروز، مرد فقیری هستم. اما در روح ثروتمندم.» اهالی شگفت‌زده شدند. بعضی شروع به دست زدن کردند. بعضی از تحسین اشک ریختند. کریم ثروتمندترین مرد دهکده بود. خانه‌اش بزرگ بود. مزارعش وسیع. طلایش افسانه‌ای. اما حالا ادعا می‌کرد همه را بخشیده است. همه کریم را تحسین کردند. بعضی حتی شروع کردند او را قدیس بنامند. اما بعد، یک نفر به برج نگاه کرد. زنگ به صدا درنیامده بود. این همه را شگفت‌زده کرد. اگر کریم حقیقت می‌گفت، زنگ باید ساکت باشد. و بود. پس همه به او باور داشتند. کریم با افتخار از میان جمعیت گذشت. اما پیرزنی به نام زهرا با دقت تماشایش می‌کرد. چیزی نگفت. اما چیزی متوجه شد. زنگ ساکت بود. اما باید به صدا درمی‌آمد.",
                    vocabulary = listOf(
                        Word("announce", "اعلام کردن", "əˈnaʊns"),
                        Word("wealth", "ثروت", "welθ"),
                        Word("admiration", "تحسین", "ˌædməˈreɪʃn"),
                        Word("vast", "وسیع", "væst"),
                        Word("saint", "قدیس", "seɪnt")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Truth Within", titlePersian = "حقیقت درون",
                    text = "That night, Zahra could not sleep. She thought about the bell. She thought about Karim. Something was wrong. The next morning, she went to Karim's house. She found him in his garden, counting his gold. He had lied. He had never given away anything. He had lied to the whole village. Zahra approached him. \"Karim,\" she said softly, \"you did not tell the truth yesterday.\" Karim jumped up, his face turning red. \"How dare you!\" he shouted. \"The bell didn't ring! So it wasn't a lie!\" Zahra shook her head. \"The bell didn't ring,\" she said, \"because the bell only rings for lies people know are lies. But your lie was different. You convinced yourself it was true. You told yourself you had given everything away — in your heart. You didn't even realize you were lying to yourself.\" Karim stood frozen. Then, slowly, he sat down on the ground and began to cry. He had fooled himself so completely that even the magic bell could not detect it. From that day on, Karim truly gave his wealth to the poor. And when he finally told the truth — the real truth — the bell rang loud and clear. Because the deepest lies are not the ones we tell others. They are the ones we tell ourselves.",
                    textPersian = "آن شب، زهرا نتوانست بخوابد. به زنگ فکر کرد. به کریم فکر کرد. چیزی اشتباه بود. صبح روز بعد، به خانه کریم رفت. او را در باغش یافت که داشت طلایش را می‌شمرد. دروغ گفته بود. هرگز چیزی نبخشیده بود. به تمام دهکده دروغ گفته بود. زهرا به سمتش رفت. «کریم،» آرام گفت، «دیروز حقیقت را نگفتی.» کریم پرید، صورتش سرخ شد. «چه جراتی داری!» فریاد زد. «زنگ به صدا درنیامد! پس دروغ نبود!» زهرا سر تکان داد. «زنگ به صدا درنیامد،» گفت، «چون زنگ فقط برای دروغ‌هایی به صدا درمی‌آید که مردم می‌دانند دروغ هستند. اما دروغ تو فرق داشت. خودت را متقاعد کردی که حقیقت است. به خودت گفتی که همه چیز را بخشیده‌ای — در قلبت. حتی نفهمیدی که به خودت دروغ می‌گویی.» کریم یخ زد. بعد، آرام روی زمین نشست و شروع به گریه کرد. خودش را آنقدر کامل فریب داده بود که حتی زنگ جادویی نمی‌توانست تشخیص دهد. از آن روز، کریم واقعاً ثروتش را به فقرا داد. و وقتی بالاخره حقیقت را گفت — حقیقت واقعی — زنگ بلند و واضح به صدا درآمد. چون عمیق‌ترین دروغ‌ها آن‌هایی نیستند که به دیگران می‌گوییم. آن‌هایی هستند که به خودمان می‌گوییم.",
                    vocabulary = listOf(
                        Word("dare", "جرات کردن", "der"),
                        Word("convince", "متقاعد کردن", "kənˈvɪns"),
                        Word("frozen", "یخ‌زده", "ˈfroʊzn"),
                        Word("fool", "فریب دادن", "fuːl"),
                        Word("detect", "تشخیص دادن", "dɪˈtekt")
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
                    text = "At the edge of a village, there was an old man named Baba Reza. He was famous for his garden. But his garden was strange. It was full of young trees — trees that would not produce fruit for decades. He had planted them when he was already very old. A young man came to visit him one day. \"Baba Reza,\" he asked, \"why do you plant trees you will never see grow? You are old. You will not live to eat their fruit. You will not rest in their shade.\" Baba Reza smiled. He gestured to a large oak tree nearby. \"You see that tree?\" he asked. \"It was planted by my grandfather. He never ate its fruit. He never rested in its shade. But I did. Every summer of my childhood, I played under it. I ate its fruit. I rested in its shade. He planted for me.\" The young man was silent. Baba Reza continued, \"Now I plant for others. Not for myself. That is the way of life.\"",
                    textPersian = "در حاشیه یک دهکده، پیرمردی به نام بابا رضا بود. به خاطر باغش معروف بود. اما باغش عجیب بود. پر از درختان جوان — درختانی که دهه‌ها میوه نمی‌دادند. وقتی خودش خیلی پیر بود کاشته بودشان. یک روز مرد جوانی به دیدنش آمد. «بابا رضا،» پرسید، «چرا درختانی می‌کاری که هرگز رشدشان را نمی‌بینی؟ پیری. زنده نمی‌مانی که میوه‌شان را بخوری. در سایه‌شان استراحت نخواهی کرد.» بابا رضا لبخند زد. به درخت بلوط بزرگی اشاره کرد. «آن درخت را می‌بینی؟» پرسید. «پدربزرگم کاشته بود. هرگز میوه‌اش را نخورد. در سایه‌اش استراحت نکرد. اما من کردم. هر تابستان کودکی‌ام زیرش بازی کردم. میوه‌اش را خوردم. در سایه‌اش استراحت کردم. او برای من کاشت.» مرد جوان ساکت شد. بابا رضا ادامه داد: «حالا من برای دیگران می‌کارم. نه برای خودم. این راه زندگی است.»",
                    vocabulary = listOf(
                        Word("gardener", "باغبان", "ˈɡɑːrdnər"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("gesture", "اشاره کردن", "ˈdʒestʃər"),
                        Word("oak", "بلوط", "oʊk"),
                        Word("shade", "سایه", "ʃeɪd")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Young Man's Question", titlePersian = "سوال مرد جوان",
                    text = "The young man, whose name was Arash, sat down beside Baba Reza. \"But isn't it sad?\" he asked. \"To work so hard and never see the result?\" Baba Reza shook his head slowly. \"No, my son,\" he said. \"It is not sad. It is beautiful. Do you know why?\" Arash said no. \"Because I am not just planting trees,\" Baba Reza said. \"I am planting hope. I am planting a future I will never see. I am trusting that those who come after me will be grateful. I am giving a gift I will never receive thanks for.\" Arash was quiet for a long time. Then he asked, \"But what if no one appreciates it? What if the trees die? What if no one waters them after you're gone?\" Baba Reza laughed softly. \"Then I will have failed. But it doesn't matter. Because the act of planting itself is the reward. I plant because it is right. Not because I need to see the result. Faith is not about knowing. It is about trusting.\"",
                    textPersian = "مرد جوان، که اسمش آرش بود، کنار بابا رضا نشست. «اما غمگین نیست؟» پرسید. «اینقدر سخت کار کردن و هرگز نتیجه را ندیدن؟» بابا رضا آرام سر تکان داد. «نه پسرم،» گفت. «غمگین نیست. زیباست. می‌دانی چرا؟» آرش گفت نه. «چون فقط درخت نمی‌کارم،» بابا رضا گفت. «امید می‌کارم. آینده‌ای که هرگز نخواهم دید. اعتماد می‌کنم که کسانی که بعد از من می‌آیند سپاسگزار خواهند بود. هدیه‌ای می‌دهم که هرگز برایش تشکر نمی‌گیرم.» آرش مدت طولانی ساکت بود. بعد پرسید: «اما اگر کسی ارزشش را نداند؟ اگر درخت‌ها بمیرند؟ اگر بعد از تو کسی آبشان ندهد؟» بابا رضا آرام خندید. «پس شکست خورده‌ام. اما اهمیتی ندارد. چون خود عمل کاشتن پاداش است. می‌کارم چون درست است. نه چون نیاز دارم نتیجه را ببینم. ایمان درباره دانستن نیست. درباره اعتماد کردن است.»",
                    vocabulary = listOf(
                        Word("appreciate", "ارزش دانستن", "əˈpriːʃieɪt"),
                        Word("grateful", "سپاسگزار", "ˈɡreɪtfl"),
                        Word("faith", "ایمان", "feɪθ"),
                        Word("reward", "پاداش", "rɪˈwɔːrd"),
                        Word("trust", "اعتماد کردن", "trʌst")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Legacy of Forests", titlePersian = "میراثی از جنگل‌ها",
                    text = "Fifty years later, Arash was an old man himself. He had become a gardener, inspired by Baba Reza. He had planted hundreds of trees. Now he sat under a massive oak tree — one that Baba Reza had planted. The tree was enormous. Its branches stretched wide, offering shade to dozens of people. Children played beneath it. Birds nested in it. Its roots held the soil in place, preventing landslides. Arash looked up and saw his own grandchildren climbing its branches. He smiled and thought of Baba Reza. The old man had been right. The trees he had planted were not just trees. They were shadows for grandchildren he would never meet. Fruit for people who would never know his name. Shelter for birds whose ancestors had never existed. Arash looked at his own young trees — trees he had planted for the future. He knew he would never see them grow tall. But that was okay. Because he had learned the greatest secret of all: The best things in life are not for us. They are for those who come after us. And that is how civilization continues — not by what we take, but by what we leave behind. Arash closed his eyes under the shade of Baba Reza's tree and felt at peace.",
                    textPersian = "پنجاه سال بعد، آرش خودش پیرمردی بود. باغبان شده بود، با الهام از بابا رضا. صدها درخت کاشته بود. حالا زیر یک درخت بلوط عظیم نشسته بود — درختی که بابا رضا کاشته بود. درخت عظیم بود. شاخه‌هایش گسترده، سایه برای ده‌ها نفر. بچه‌ها زیرش بازی می‌کردند. پرندگان در آن لانه داشتند. ریشه‌هایش خاک را نگه می‌داشت. آرش به بالا نگاه کرد و نوه‌هایش را در حال بالا رفتن از شاخه‌ها دید. لبخند زد و به بابا رضا فکر کرد. پیرمرد درست گفته بود. درختانی که کاشته بود فقط درخت نبودند. سایه‌هایی برای نوه‌هایی که هرگز نمی‌دید بودند. میوه برای کسانی که هرگز اسمش را نمی‌دانستند. سرپناه برای پرندگانی که اجدادشان هرگز وجود نداشتند. آرش به درختان جوان خودش نگاه کرد — درختانی که برای آینده کاشته بود. می‌دانست هرگز نخواهد دید بلند شوند. اما اشکالی نداشت. چون بزرگ‌ترین راز را یاد گرفته بود: بهترین چیزهای زندگی برای ما نیستند. برای کسانی هستند که بعد از ما می‌آیند. و این‌طور تمدن ادامه می‌یابد — نه با آنچه می‌گیریم، بلکه با آنچه پشت سر می‌گذاریم. آرش زیر سایه درخت بابا رضا چشمانش را بست و احساس آرامش کرد.",
                    vocabulary = listOf(
                        Word("massive", "عظیم", "ˈmæsɪv"),
                        Word("nest", "لانه", "nest"),
                        Word("landslide", "رانش زمین", "ˈlændslaɪd"),
                        Word("ancestor", "اجداد", "ˈænsestər"),
                        Word("civilization", "تمدن", "ˌsɪvəlaɪˈzeɪʃn")
                    )
                )
            )
        ),

        Story(
            id = "s_i14", title = "The Letter That Changed Everything",
            titlePersian = "نامه‌ای که همه چیز را تغییر داد",
            level = Level.INTERMEDIATE,
            text = "A young woman finds an old letter in her grandmother's attic.",
            moral = "Words can outlive their writers.", moralPersian = "کلمات می‌توانند از نویسندگانشان عمر بیشتری کنند.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Attic Discovery", titlePersian = "کشف اتاق زیرشیروانی",
                    text = "Lila had just graduated from university with a degree in history. She was spending the summer at her grandmother's old house, cleaning out the attic. Her grandmother had passed away a year ago, and the family was preparing the house for sale. The attic was dusty and dark, filled with decades of memories. Old furniture. Boxes of photographs. Forgotten books. And in one corner, hidden behind a wooden chest, Lila found a small leather box. She opened it carefully. Inside was a single envelope, yellowed with age. On the front, in old-fashioned handwriting, were the words: \"To My Daughter, if I do not return.\" Lila's heart began to beat faster. She unfolded the letter with trembling hands.",
                    textPersian = "لیلا تازه از دانشگاه با مدرک تاریخ فارغ‌التحصیل شده بود. تابستان را در خانه‌ی قدیمی مادربزرگش می‌گذراند و اتاق زیرشیروانی را تمیز می‌کرد. مادربزرگش سال گذشته فوت کرده بود و خانواده خانه را برای فروش آماده می‌کرد. اتاق زیرشیروانی غبارآلود و تاریک بود، پر از خاطرات دهه‌ها. مبلمان قدیمی. جعبه‌های عکس. کتاب‌های فراموش‌شده. و در گوشه‌ای، پشت یک صندوق چوبی، لیلا جعبه‌ی چرمی کوچکی پیدا کرد. با دقت بازش کرد. داخلش یک پاکت بود که با گذشت زمان زرد شده بود. روی جلد، با دست‌خط قدیمی، نوشته شده بود: «به دخترم، اگر برنگشتم.» قلب لیلا شروع به تند زدن کرد. نامه را با دستان لرزان باز کرد.",
                    vocabulary = listOf(
                        Word("attic", "اتاق زیرشیروانی", "ˈætɪk"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("envelope", "پاکت", "ˈenvəloʊp"),
                        Word("unfold", "باز کردن", "ʌnˈfoʊld"),
                        Word("trembling", "لرزان", "ˈtremblɪŋ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Letter's Words", titlePersian = "کلمات نامه",
                    text = "The letter was from her grandfather, written during the war. Lila had never met him — he had died before she was born. But here, in his own handwriting, was his voice: \"My dearest daughter, if you are reading this, it means I did not come home. But I want you to know something important. The war is not what matters. What matters is what we fought for. We did not fight for territory. We did not fight for glory. We fought so that you could grow up in a world without fear. So that you could go to school, fall in love, and dream without limits. If I do not return, do not cry for me too long. Instead, live a life that honors what we sacrificed for. Be kind, even when it is difficult. Be brave, even when you are afraid. And love deeply, because love is the only thing that makes life worth living.\" Lila read the letter three times. Tears rolled down her cheeks. Her grandfather — a man she had never known — had just spoken to her across time.",
                    textPersian = "نامه از پدربزرگش بود، نوشته شده در زمان جنگ. لیلا هرگز او را ندیده بود — قبل از تولد او مرده بود. اما اینجا، با دست‌خط خودش، صدایش بود: «دختر عزیزم، اگر این را می‌خوانی، یعنی برنگشتم. اما می‌خواهم یک چیز مهم بدانی. جنگ چیزی نیست که مهم باشد. چیزی که مهم است هدفی است که برایش جنگیدیم. برای سرزمین نجنگیدیم. برای افتخار نجنگیدیم. جنگیدیم تا تو در دنیایی بدون ترس بزرگ شوی. تا به مدرسه بروی، عاشق شوی و بدون محدودیت رویا ببینی. اگر برنگشتم، زیاد برای من گریه نکن. در عوض زندگی‌ای کن که فداکاری ما را گرامی بدارد. مهربان باش، حتی وقتی سخت است. شجاع باش، حتی وقتی می‌ترسی. و عمیقاً عشق بورز، چون عشق تنها چیزی است که زندگی را ارزشمند می‌کند.» لیلا سه بار نامه را خواند. اشک روی گونه‌هایش غلتید. پدربزرگش — مردی که هرگز نمی‌شناخت — تازه از طریق زمان با او صحبت کرده بود.",
                    vocabulary = listOf(
                        Word("handwriting", "دست‌خط", "ˈhændraɪtɪŋ"),
                        Word("territory", "سرزمین", "ˈterətɔːri"),
                        Word("glory", "افتخار", "ˈɡlɔːri"),
                        Word("sacrifice", "فداکاری", "ˈsækrɪfaɪs"),
                        Word("honor", "گرامی داشتن", "ˈɑːnər")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Life in His Honor", titlePersian = "زندگی به افتخار او",
                    text = "Lila sat in the attic for a long time, holding the letter. She thought about her grandfather. She thought about all the soldiers who had died in wars. She thought about the world they had hoped for. Then she made a decision. She would not sell the house. She would keep it. She would restore it. She would make it a place where future generations could gather and learn. She would start a foundation in her grandfather's name, helping children affected by war. She would build schools, fund scholarships, and support families. She would write a book about her grandfather's letter and the lessons it contained. Over the next decade, Lila did exactly that. The old house became a center for peace education. The foundation helped hundreds of children. Her book was read around the world. People wrote to her from every continent, telling her how her grandfather's words had moved them. And every year on the anniversary of his death, Lila would sit in the attic where she found the letter. She would read it aloud. And she would say, \"You did come home, Grandfather. You came home through your words. And you are still here. In every child I help. In every heart I touch. You live on.\" The letter that changed everything had not just changed Lila's life. It had changed thousands of lives. Because some words, once written, never die.",
                    textPersian = "لیلا مدت طولانی در اتاق زیرشیروانی نشست و نامه را در دست داشت. به پدربزرگش فکر کرد. به همه سربازانی که در جنگ‌ها مرده بودند فکر کرد. به دنیایی که امید داشتند فکر کرد. بعد تصمیمی گرفت. خانه را نمی‌فروشد. نگهش می‌داشت. بازسازی‌اش می‌کرد. آن را جایی می‌کرد که نسل‌های آینده جمع شوند و یاد بگیرند. بنیادی به نام پدربزرگش راه‌اندازی می‌کرد که به بچه‌های آسیب‌دیده از جنگ کمک کند. مدرسه می‌ساخت، بورس تأمین می‌کرد، به خانواده‌ها کمک می‌کرد. کتابی درباره نامه پدربزرگش و درس‌هایش می‌نوشت. در دهه بعد، لیلا دقیقاً همین کار را کرد. خانه‌ی قدیمی مرکزی برای آموزش صلح شد. بنیاد به صدها کودک کمک کرد. کتابش در سراسر جهان خوانده شد. مردم از هر قاره‌ای به او نامه نوشتند که کلمات پدربزرگش چطور تحت تأثیرشان قرار داده بود. و هر سال در سالگرد مرگش، لیلا در اتاق زیرشیروانی که نامه را پیدا کرد می‌نشست. با صدای بلند می‌خواند. و می‌گفت: «برگشتی پدربزرگ. از طریق کلماتت برگشتی. و هنوز اینجایی. در هر کودکی که کمک می‌کنم. در هر قلبی که لمس می‌کنم. زنده می‌مانی.» نامه‌ای که همه چیز را تغییر داد، فقط زندگی لیلا را تغییر نداده بود. زندگی هزاران نفر را تغییر داده بود. چون بعضی کلمات، وقتی نوشته می‌شوند، هرگز نمی‌میرند.",
                    vocabulary = listOf(
                        Word("restore", "بازسازی کردن", "rɪˈstɔːr"),
                        Word("foundation", "بنیاد", "faʊnˈdeɪʃn"),
                        Word("scholarship", "بورس تحصیلی", "ˈskɑːlərʃɪp"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("anniversary", "سالگرد", "ˌænɪˈvɜːrsəri")
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
                    text = "On a rocky island far off the coast, there stood a lighthouse. It was old and weathered, but it still shone its light every night. Its keeper was an old man named Hossein. He had lived on the island for forty years. The island was tiny — just a few square kilometers of rock and grass. There were no trees, no other people, no shops. Just the lighthouse, a small cottage, and the endless sea. Hossein had been sent here as a young man. He had planned to stay only a few years. But the years had stretched on, and he had never left. Some people thought his life was terribly lonely. When supply ships came with food and letters, the sailors would ask him, \"Don't you miss the world? Don't you miss people?\" Hossein would smile and shake his head.",
                    textPersian = "روی جزیره‌ای سنگی دور از ساحل، فانوس دریایی بود. قدیمی و فرسوده، اما هنوز هر شب نور می‌داد. نگهبانش پیرمردی به نام حسین بود. چهل سال روی جزیره زندگی کرده بود. جزیره کوچک بود — فقط چند کیلومتر مربع سنگ و علف. درخت نبود، نه مردم دیگر، نه مغازه. فقط فانوس، کلبه‌ای کوچک و دریای بی‌پایان. حسین را در جوانی به اینجا فرستاده بودند. برنامه داشت فقط چند سال بماند. اما سال‌ها کش آمدند و هرگز نرفت. بعضی‌ها فکر می‌کردند زندگی‌اش بسیار تنهاست. وقتی کشتی‌های تدارکات با غذا و نامه می‌آمدند، ملوانان می‌پرسیدند: «دلت برای دنیا تنگ نمی‌شود؟ برای مردم؟» حسین لبخند می‌زد و سر تکان می‌داد.",
                    vocabulary = listOf(
                        Word("lighthouse", "فانوس دریایی", "ˈlaɪthaʊs"),
                        Word("weathered", "فرسوده", "ˈweðərd"),
                        Word("keeper", "نگهبان", "ˈkiːpər"),
                        Word("endless", "بی‌پایان", "ˈendləs"),
                        Word("supply", "تدارکات", "səˈplaɪ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Night of the Storm", titlePersian = "شب طوفان",
                    text = "One winter night, a terrible storm hit the coast. The wind howled. The waves crashed against the rocks with terrifying force. Hossein stood in the lighthouse, watching the storm. He knew what was coming. Ships would be in danger. Sailors would be trying to find their way home. His light would be their only guide. He climbed the stairs to the top of the lighthouse. His old bones ached. His hands were shaking. But he lit the lamp, as he did every night. The light shone brightly across the angry sea. For hours, Hossein stood there, tending the flame. He could not sleep. He could not rest. Every minute mattered. If the light went out, even for a moment, ships might crash into the rocks. In the morning, the storm finally passed. The sea was calm again. Hossein looked out and saw three ships anchored safely in the harbor. Three crews. Maybe twenty-five sailors. All alive. He smiled and went to bed, exhausted but content.",
                    textPersian = "یک شب زمستانی، طوفان وحشتناکی به ساحل رسید. باد زوزه می‌کشید. موج‌ها با نیروی وحشتناکی به صخره‌ها می‌کوبیدند. حسین در فانوس ایستاده بود و طوفان را تماشا می‌کرد. می‌دانست چه در پیش است. کشتی‌ها در خطر بودند. ملوانان سعی می‌کردند راه خانه را پیدا کنند. نور او تنها راهنما بود. از پله‌ها بالا رفت. استخوان‌های پیرش درد می‌کرد. دستانش می‌لرزیدند. اما چراغ را روشن کرد، مثل هر شب. نور به‌روشنی روی دریای خشمگین می‌درخشید. ساعت‌ها آنجا ایستاد و شعله را نگه داشت. نمی‌توانست بخوابد. نمی‌توانست استراحت کند. هر دقیقه مهم بود. اگر چراغ خاموش می‌شد، حتی برای لحظه‌ای، کشتی‌ها به صخره‌ها می‌خوردند. صبح، طوفان بالاخره گذشت. دریا آرام شد. حسین به بیرون نگاه کرد و سه کشتی دید که در بندر با امنیت لنگر انداخته بودند. سه خدمه. شاید بیست و پنج ملوان. همه زنده. لبخند زد و به تخت رفت، خسته اما راضی.",
                    vocabulary = listOf(
                        Word("howl", "زوزه کشیدن", "haʊl"),
                        Word("crash", "کوبیدن", "kræʃ"),
                        Word("terrifying", "وحشتناک", "ˈterɪfaɪɪŋ"),
                        Word("tend", "مراقبت کردن", "tend"),
                        Word("anchor", "لنگر انداختن", "ˈæŋkər")
                    )
                ),
                StoryChapter(
                    number = 3, title = "Purpose in Isolation", titlePersian = "هدف در انزوا",
                    text = "Years passed. Hossein grew older and weaker. Finally, the time came for him to retire. A young man named Farid arrived to take his place. Farid was nervous. \"I don't know if I can do this,\" he said. \"It's so lonely here. So isolated. How did you survive it for forty years?\" Hossein smiled. He led Farid to the top of the lighthouse. Below them, the sea stretched endlessly. The sun was setting, painting the sky in shades of orange and gold. \"Look,\" Hossein said. \"Every night, hundreds of ships pass this coast. Every night, thousands of people are traveling home, to their families, to their loved ones. They don't know me. They will never know me. But my light guides them. My work saves their lives.\" Farid looked at the sea. He felt something he had not felt before. \"How can I be lonely,\" Hossein continued, \"when I am saving lives every night? When I know that somewhere out there, a child is waiting for a father who will come home safely, because I did my job? How can I be lonely when I have purpose?\" Farid nodded slowly. He understood. Purpose is what gives life meaning. It does not matter how small your world is. What matters is the impact of your work. Hossein passed away a few years later, on the island, in his sleep. In his will, he left one request: \"Let my ashes be scattered from the top of the lighthouse — so that even in death, I can watch over the sailors.\" And so they did. And every night, the light still shines.",
                    textPersian = "سال‌ها گذشت. حسین پیرتر و ضعیف‌تر شد. سرانجام وقت بازنشستگی رسید. مرد جوانی به نام فرید آمد تا جایگزینش شود. فرید مضطرب بود. «نمی‌دانم می‌توانم این کار را بکنم،» گفت. «اینجا خیلی تنه است. خیلی منزوی. چطور چهل سال تحملش کردی؟» حسین لبخند زد. فرید را به بالای فانوس برد. زیرشان، دریا بی‌پایان کشیده شده بود. خورشید در حال غروب بود، آسمان را با رنگ‌های نارنجی و طلایی نقاشی می‌کرد. «نگاه کن،» حسین گفت. «هر شب، صدها کشتی از این ساحل می‌گذرند. هر شب، هزاران نفر به خانه سفر می‌کنند، به خانواده‌هایشان، به عزیزانشان. مرا نمی‌شناسند. هرگز نخواهند شناخت. اما نور من هدایتشان می‌کند. کار من زندگی‌شان را نجات می‌دهد.» فرید به دریا نگاه کرد. چیزی حس کرد که قبلاً حس نکرده بود. «چطور می‌توانم تنها باشم،» حسین ادامه داد، «وقتی هر شب زندگی نجات می‌دهم؟ وقتی می‌دانم جایی بیرون، کودکی منتظر پدری است که با امنیت به خانه برمی‌گردد چون من کارم را کردم؟ چطور تنها باشم وقتی هدف دارم؟» فرید آرام سر تکان داد. فهمید. هدف چیزی است که به زندگی معنا می‌دهد. مهم نیست دنیایت چقدر کوچک باشد. مهم تأثیر کار توست. حسین چند سال بعد، روی جزیره، در خواب، از دنیا رفت. در وصیتش یک درخواست کرد: «خاکسترم از بالای فانوس پخش شود — تا حتی در مرگ هم مراقب ملوانان باشم.» و همین کار را کردند. و هر شب، نور هنوز می‌درخشد.",
                    vocabulary = listOf(
                        Word("retire", "بازنشسته شدن", "rɪˈtaɪər"),
                        Word("isolated", "منزوی", "ˈaɪsəleɪtɪd"),
                        Word("impact", "تأثیر", "ˈɪmpækt"),
                        Word("will", "وصیت‌نامه", "wɪl"),
                        Word("scatter", "پخش کردن", "ˈskætər")
                    )
                )
            )
        )
    )
}