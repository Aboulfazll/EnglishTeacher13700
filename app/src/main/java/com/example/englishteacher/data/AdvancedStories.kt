package com.example.englishteacher.data

object AdvancedStories {
    val stories: List<Story> = listOf(

        Story(
            id = "s_a1", title = "The Power of Persistence", titlePersian = "قدرت پشتکار",
            level = Level.ADVANCED,
            text = "Thomas Edison failed thousands of times before inventing the light bulb.",
            moral = "Persistence turns failure into success.", moralPersian = "پشتکار شکست را به موفقیت تبدیل می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1552664730-d307ca884978?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The First Failure", titlePersian = "اولین شکست",
                    text = "In a small laboratory in Menlo Park, New Jersey, a young inventor named Thomas Edison sat staring at a burned-out filament. It was his two hundredth attempt at creating an electric light bulb — and like the one hundred ninety-nine before it, it had failed. His assistant, a young man named Charles, looked at the smoking glass with despair. \"Mr. Edison,\" he said, \"we have failed again. Two hundred times. Perhaps this is impossible.\" Edison did not look up. He was already writing notes in his journal, recording exactly what had happened. After a long moment, he spoke: \"I have not failed two hundred times. I have successfully discovered two hundred ways that do not work. Now we are closer to the way that does.\" Charles stared at him in disbelief. He had never met anyone so stubborn — or so optimistic.",
                    textPersian = "در آزمایشگاه کوچکی در منه‌لو پارک، نیوجرسی، مخترع جوانی به نام توماس ادیسون نشسته بود و به یک فیلامان سوخته خیره شده بود. این دویستمین تلاشش برای ساختن لامپ برقی بود — و مثل صد و نود و نه تای قبل، شکست خورده بود. دستیارش، مرد جوانی به نام چارلز، با ناامیدی به شیشه دودی نگاه کرد. «آقای ادیسون،» گفت، «باز هم شکست خوردیم. دویست بار. شاید این غیرممکن است.» ادیسون سر بلند نکرد. داشت یادداشت می‌نوشت و دقیقاً ثبت می‌کرد چه اتفاقی افتاده. بعد از لحظه‌ای طولانی گفت: «من دویست بار شکست نخورده‌ام. من با موفقیت دویست راه را کشف کرده‌ام که کار نمی‌کنند. حالا به راهی که کار می‌کند نزدیک‌تریم.» چارلز با ناباوری نگاهش کرد. هرگز کسی را اینقدر سرسخت — یا اینقدر خوش‌بین — ندیده بود.",
                    vocabulary = listOf(
                        Word("persistence", "پشتکار", "pərˈsɪstəns"),
                        Word("filament", "فیلامان", "ˈfɪləmənt"),
                        Word("despair", "ناامیدی", "dɪˈsper"),
                        Word("stubborn", "سرسخت", "ˈstʌbərn"),
                        Word("optimistic", "خوش‌بین", "ˌɑːptɪˈmɪstɪk")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Years of Trial", titlePersian = "سال‌های آزمون",
                    text = "Edison and his team worked for years. They tested thousands of materials — cotton, paper, wood, metal, even bamboo from Japan. Every day brought new failures. Every night brought new challenges. Investors threatened to withdraw their money. Newspapers mocked him, calling him \"the mad inventor.\" His competitors laughed. His friends worried. His own health deteriorated. He barely slept, eating only when reminded. But Edison did not stop. He believed that somewhere in the vast world of materials, there was something that would work. He wrote in his journal: \"Many of life's failures are people who did not realize how close they were to success when they gave up.\" His persistence was not blind hope. It was based on careful reasoning. He knew that every failed attempt eliminated one possibility. He knew that the answer existed — he just had to find it.",
                    textPersian = "ادیسون و تیمش سال‌ها کار کردند. هزاران ماده را آزمایش کردند — پنبه، کاغذ، چوب، فلز، حتی بامبو از ژاپن. هر روز شکست‌های جدید می‌آورد. هر شب چالش‌های جدید. سرمایه‌گذاران تهدید می‌کردند پولشان را بردارند. روزنامه‌ها مسخره‌اش می‌کردند و او را «مخترع دیوانه» می‌نامیدند. رقبایش می‌خندیدند. دوستانش نگران بودند. سلامتی خودش هم تحلیل رفت. به‌سختی می‌خوابید و فقط وقتی یادش می‌انداختند غذا می‌خورد. اما ادیسون متوقف نشد. باور داشت جایی در دنیای وسیع مواد، چیزی هست که کار می‌کند. در دفترش نوشت: «بسیاری از شکست‌های زندگی مربوط به کسانی است که نمی‌دانستند چقدر به موفقیت نزدیک بودند وقتی تسلیم شدند.» پشتکارش امید کورکورانه نبود. بر استدلال دقیق بنا بود. می‌دانست هر تلاش شکست‌خورده یک احتمال را حذف می‌کند. می‌دانست پاسخ وجود دارد — فقط باید پیدایش کند.",
                    vocabulary = listOf(
                        Word("investor", "سرمایه‌گذار", "ɪnˈvestər"),
                        Word("mock", "مسخره کردن", "mɑːk"),
                        Word("deteriorate", "تحلیل رفتن", "dɪˈtɪriəreɪt"),
                        Word("eliminate", "حذف کردن", "ɪˈlɪmɪneɪt"),
                        Word("possibility", "احتمال", "ˌpɑːsəˈbɪləti")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Light That Changed the World", titlePersian = "نوری که جهان را تغییر داد",
                    text = "On October 21, 1879, in the middle of the night, Edison and his team finally succeeded. A carbonized cotton thread glowed brightly inside a glass bulb — and it stayed glowing. For thirteen and a half hours. Edison stared at it, then began to laugh. His assistants joined in. Some of them cried. They had done it. They had created the first practical electric light. But Edison's work was not done. He had to make it last longer. He had to make it affordable. He had to build power stations, wiring, and infrastructure to bring electricity to every home. It took him years more. But he did it. When asked about his thousands of failures, Edison said: \"I have not failed. I've just found 10,000 ways that won't work.\" His persistence changed the world. Today, his light bulbs still inspire inventors, dreamers, and anyone who has ever been told that something is impossible. Because Edison taught us: failure is not the opposite of success. It is part of success.",
                    textPersian = "در ۲۱ اکتبر ۱۸۷۹، در میانه شب، ادیسون و تیمش بالاخره موفق شدند. نخی از پنبه زغالی شده درون لامپ شیشه‌ای به‌روشنی می‌درخشید — و در حال درخشیدن ماند. سیزده ساعت و نیم. ادیسون نگاهش کرد، بعد شروع به خندیدن کرد. دستیارانش هم خندیدند. بعضی گریه کردند. موفق شده بودند. اولین نور برق عملی را ساخته بودند. اما کار ادیسون تمام نشده بود. باید مدت بیشتری دوام می‌آورد. باید مقرون به صرفه می‌شد. باید نیروگاه، سیم‌کشی و زیرساخت می‌ساخت تا برق به هر خانه برسد. سال‌های بیشتری طول کشید. اما انجامش داد. وقتی از هزاران شکستش پرسیدند، ادیسون گفت: «شکست نخورده‌ام. فقط ۱۰٬۰۰۰ راه پیدا کردم که کار نمی‌کنند.» پشتکارش جهان را تغییر داد. امروز، لامپ‌هایش هنوز مخترعان، رویاپردازان و هر کسی را که به او گفته‌اند چیزی غیرممکن است الهام می‌بخشد. چون ادیسون به ما آموخت: شکست نقطه مقابل موفقیت نیست. بخشی از موفقیت است.",
                    vocabulary = listOf(
                        Word("carbonized", "زغالی شده", "ˈkɑːrbənaɪzd"),
                        Word("glow", "درخشیدن", "ɡloʊ"),
                        Word("affordable", "مقرون به صرفه", "əˈfɔːrdəbl"),
                        Word("infrastructure", "زیرساخت", "ˈɪnfrəstrʌktʃər"),
                        Word("inspire", "الهام بخشیدن", "ɪnˈspaɪər")
                    )
                )
            )
        ),

        Story(
            id = "s_a2", title = "The Art of Listening", titlePersian = "هنر گوش دادن",
            level = Level.ADVANCED,
            text = "A wise old man solves conflicts by listening more than speaking.",
            moral = "Listening is more powerful than speaking.", moralPersian = "گوش دادن از صحبت کردن قدرتمندتر است.",
            coverUrl = "https://images.unsplash.com/photo-1499728603263-13726abce5fd?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Silent Sage", titlePersian = "دانای خاموش",
                    text = "In a bustling city in ancient Persia, there lived a man named Hakim Samad. He was not rich. He was not powerful. He held no official position. But whenever there was conflict in the city, the people came to him. Kings consulted him. Judges sought his advice. Merchants, farmers, scholars — all came to his small, simple home at the edge of the bazaar. What was his secret? He was a great listener. When someone spoke to him, he gave them his complete attention. He did not interrupt. He did not judge. He did not offer solutions before the story was finished. He simply listened — with his eyes, his ears, and his heart. He listened so deeply that people often solved their own problems while talking to him. He did not need to give advice. He only needed to understand.",
                    textPersian = "در شهری پرجنب‌وجوش در ایران باستان، مردی به نام حکیم صمد زندگی می‌کرد. ثروتمند نبود. قدرتمند نبود. منصب رسمی نداشت. اما هر وقت در شهر اختلافی بود، مردم به او مراجعه می‌کردند. پادشاهان با او مشورت می‌کردند. قاضیان راهنمایی‌اش را می‌خواستند. تاجران، کشاورزان، دانشمندان — همه به خانه‌ی کوچک و ساده‌اش در حاشیه بازار می‌آمدند. رازش چه بود؟ او شنونده‌ی بزرگی بود. وقتی کسی با او حرف می‌زد، توجه کاملش را می‌داد. حرف نمی‌زد. قضاوت نمی‌کرد. قبل از اینکه داستان تمام شود راه‌حل پیشنهاد نمی‌کرد. فقط گوش می‌داد — با چشمانش، گوش‌هایش و قلبش. آنقدر عمیق گوش می‌داد که مردم اغلب هنگام صحبت با او مشکلات خودشان را حل می‌کردند. نیازی به نصیحت نداشت. فقط نیاز به درک کردن داشت.",
                    vocabulary = listOf(
                        Word("sage", "دانا", "seɪdʒ"),
                        Word("bustling", "پرجنب‌وجوش", "ˈbʌslɪŋ"),
                        Word("consult", "مشورت کردن", "kənˈsʌlt"),
                        Word("interrupt", "وقفه انداختن", "ˌɪntəˈrʌpt"),
                        Word("attention", "توجه", "əˈtenʃn")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The King's Dilemma", titlePersian = "معضل پادشاه",
                    text = "One day, the king himself came to Hakim Samad. He had a problem he could not solve. Two of his most trusted advisors had fallen into a bitter dispute. Each accused the other of betrayal. Each claimed to have proof. The king did not know who to believe. If he punished the wrong man, he would lose a loyal servant. If he trusted the wrong man, the kingdom was in danger. Hakim Samad listened quietly as the king explained. He asked no questions. He made no comments. When the king finished, Hakim said only, \"Bring both men to me. Let them speak — one at a time — in my presence.\" The king was surprised. He had expected advice. But he obeyed. The next day, the two advisors came to Hakim's home. He sat them down on opposite sides of his small room. And he listened.",
                    textPersian = "یک روز، خود پادشاه به دیدن حکیم صمد آمد. مشکلی داشت که نمی‌توانست حل کند. دو نفر از معتمدترین مشاورانش درگیر اختلافی تلخ شده بودند. هر یک دیگری را به خیانت متهم می‌کرد. هر یک ادعا می‌کرد مدرک دارد. پادشاه نمی‌دانست به کدام باور کند. اگر مرد اشتباه را مجازات می‌کرد، خادم وفاداری را از دست می‌داد. اگر به مرد اشتباه اعتماد می‌کرد، پادشاهی در خطر بود. حکیم صمد آرام گوش داد وقتی پادشاه توضیح داد. سؤالی نپرسید. نظری نداد. وقتی پادشاه تمام کرد، حکیم فقط گفت: «هر دو را نزد من بیاور. بگذار حرف بزنند — یکی‌یکی — در حضور من.» پادشاه شگفت‌زده شد. انتظار نصیحت داشت. اما اطاعت کرد. روز بعد، دو مشاور به خانه حکیم آمدند. آن‌ها را در دو طرف اتاق کوچکش نشاند. و گوش داد.",
                    vocabulary = listOf(
                        Word("trusted", "معتمد", "ˈtrʌstɪd"),
                        Word("dispute", "اختلاف", "dɪˈspjuːt"),
                        Word("betrayal", "خیانت", "bɪˈtreɪəl"),
                        Word("loyal", "وفادار", "ˈlɔɪəl"),
                        Word("obey", "اطاعت کردن", "əˈbeɪ")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Truth Emerges", titlePersian = "حقیقت آشکار می‌شود",
                    text = "The first advisor spoke for three hours. He told his story with passion, with details, with evidence. Hakim Samad listened without moving. Then the second advisor spoke. He also spoke for hours. He told a completely different story — one that contradicted the first in almost every detail. When he finished, Hakim Samad sat in silence for a long time. Then he spoke. \"One of you is lying,\" he said calmly. \"I do not know which. But I noticed something.\" He turned to the first advisor. \"When you spoke of your loyalty to the king, your eyes looked at me. But when you spoke of the accusation, your eyes looked away. That is the sign of a man repeating a lie he has rehearsed. But you spoke with the pain of a man truly betrayed.\" He turned to the second advisor. \"You spoke smoothly. Your story was perfect. But there was no emotion. There was no anger. There was only calculation. A truly innocent man would be angry. You are not angry. You are careful.\" The second advisor's face turned pale. He had been exposed — not by evidence, but by his own lack of feeling. That day, the king learned a lesson he never forgot: the truth has a voice. And only those who truly listen can hear it.",
                    textPersian = "مشاور اول سه ساعت حرف زد. داستانش را با شور، با جزئیات، با مدرک گفت. حکیم صمد بدون حرکت گوش داد. بعد مشاور دوم حرف زد. او هم ساعت‌ها حرف زد. داستان کاملاً متفاوتی گفت — که در تقریباً هر جزئیاتی متناقض با اولی بود. وقتی تمام کرد، حکیم صمد مدت طولانی در سکوت نشست. بعد حرف زد. «یکی از شما دروغ می‌گوید،» آرام گفت. «نمی‌دانم کدام. اما چیزی متوجه شدم.» به مشاور اول روی آورد. «وقتی از وفاداری‌ات به پادشاه گفتی، چشمانت به من نگاه کرد. اما وقتی از اتهام گفتی، چشمانت کنار رفت. این نشانه مردی است که دروغی را که تمرین کرده تکرار می‌کند. اما با درد مردی حرف زدی که واقعاً خیانت دیده.» به مشاور دوم روی آورد. «روان حرف زدی. داستانت کامل بود. اما احساسی نبود. خشمی نبود. فقط محاسبه بود. مرد واقعاً بی‌گناه عصبانی می‌شد. تو عصبانی نیستی. تو مراقبی.» صورت مشاور دوم رنگ‌پریده شد. افشا شده بود — نه با مدرک، بلکه با نبود احساسش. آن روز پادشاه درسی آموخت که هرگز فراموش نکرد: حقیقت صدایی دارد. و فقط کسانی که واقعاً گوش می‌دهند می‌توانند بشنوند.",
                    vocabulary = listOf(
                        Word("passion", "شور", "ˈpæʃn"),
                        Word("contradict", "متناقض بودن", "ˌkɑːntrəˈdɪkt"),
                        Word("rehearse", "تمرین کردن", "rɪˈhɜːrs"),
                        Word("calculation", "محاسبه", "ˌkælkjuˈleɪʃn"),
                        Word("expose", "افشا کردن", "ɪkˈspoʊz")
                    )
                )
            )
        ),

        Story(
            id = "s_a3", title = "The Journey Within", titlePersian = "سفر درونی",
            level = Level.ADVANCED,
            text = "A young man travels the world searching for happiness.",
            moral = "True happiness comes from within.", moralPersian = "شادی واقعی از درون می‌آید.",
            coverUrl = "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Endless Search", titlePersian = "جستجوی بی‌پایان",
                    text = "Arman was a young man with a restless soul. From the moment he could think, he had been searching for happiness. He read books about it. He attended lectures. He asked philosophers, priests, and ordinary people. Everyone gave him a different answer, and none of them satisfied him. So he decided to find happiness himself. He traveled the world. He climbed the highest mountains to meditate with monks. He sailed across oceans to visit sacred temples. He walked through deserts to reach forgotten holy sites. He studied with gurus, shamans, and mystics. He fasted. He prayed. He did everything he could think of. Years passed. He grew older. His hair turned gray. He became stronger in body and mind — but happiness still eluded him. It was always just out of reach, like a butterfly that could not be caught.",
                    textPersian = "آرمان جوانی با روحی بی‌قرار بود. از لحظه‌ای که توانست فکر کند، دنبال شادی بود. درباره‌اش کتاب خواند. در سخنرانی‌ها شرکت کرد. از فیلسوفان، کشیشان و مردم عادی پرسید. هر کس پاسخ متفاوتی داد و هیچ‌کدام او را راضی نکرد. پس تصمیم گرفت خودش شادی را پیدا کند. دنیا را گشت. از بالاترین کوه‌ها بالا رفت تا با راهبان مدیتیشن کند. از اقیانوس‌ها گذشت تا معابد مقدس را ببیند. از بیابان‌ها گذشت تا مکان‌های مقدس فراموش‌شده را بیابد. با گوروها، شمن‌ها و عارفان درس خواند. روزه گرفت. دعا کرد. هر کاری که می‌توانست انجام داد. سال‌ها گذشت. پیرتر شد. موهایش خاکستری شد. در جسم و ذهن قوی‌تر شد — اما شادی هنوز از او فرار می‌کرد. همیشه کمی دور از دسترس بود، مثل پروانه‌ای که نمی‌توان گرفت.",
                    vocabulary = listOf(
                        Word("restless", "بی‌قرار", "ˈrestləs"),
                        Word("meditate", "مدیتیشن کردن", "ˈmedɪteɪt"),
                        Word("sacred", "مقدس", "ˈseɪkrɪd"),
                        Word("elude", "فرار کردن", "ɪˈluːd"),
                        Word("satisfy", "راضی کردن", "ˈsætɪsfaɪ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Return", titlePersian = "بازگشت",
                    text = "After twenty years, Arman gave up. He was exhausted. He was disillusioned. He had searched the entire world, and happiness was still not his. He decided to return home. He did not expect anything. He only wanted to rest. The journey back was long. He traveled through countries he had once crossed with so much hope. Now he saw only emptiness. When he finally arrived at his home village, he stopped at the top of a hill. Below, he saw his childhood home — small, humble, unchanged. His mother was in the garden. His father was sitting on the porch. The sun was setting, and the whole village was bathed in golden light. Arman stood there for a long moment. Then, unexpectedly, something happened. His heart began to glow. A warmth spread through his body — a warmth he had never felt in all his years of searching. Tears came to his eyes. He had been searching the world for happiness. And happiness had been waiting for him here. In this simple place. In this simple moment.",
                    textPersian = "بعد از بیست سال، آرمان تسلیم شد. خسته بود. دلسرد بود. تمام دنیا را جستجو کرده بود و شادی هنوز مال او نبود. تصمیم گرفت به خانه برگردد. انتظار چیزی نداشت. فقط می‌خواست استراحت کند. سفر بازگشت طولانی بود. از کشورهایی گذشت که روزی با امید زیادی پشت سر گذاشته بود. حالا فقط خالی می‌دید. وقتی بالاخره به دهکده‌اش رسید، بالای تپه‌ای ایستاد. زیر، خانه‌ی کودکی‌اش را دید — کوچک، فروتن، بی‌تغییر. مادرش در باغ بود. پدرش روی ایوان نشسته بود. خورشید در حال غروب بود و تمام دهکده در نور طلایی غرق شده بود. آرمان لحظه‌ای طولانی آنجا ایستاد. بعد، غیرمنتظره، چیزی اتفاق افتاد. قلبش شروع به درخشیدن کرد. گرمایی در بدنش پخش شد — گرمایی که در تمام سال‌های جستجو هرگز حس نکرده بود. اشک به چشمانش آمد. تمام دنیا را دنبال شادی گشته بود. و شادی اینجا منتظرش بود. در این مکان ساده. در این لحظه ساده.",
                    vocabulary = listOf(
                        Word("disillusioned", "دلسرد", "ˌdɪsɪˈluːʒnd"),
                        Word("humble", "فروتن", "ˈhʌmbl"),
                        Word("porch", "ایوان", "pɔːrtʃ"),
                        Word("bathe", "غرق کردن", "beɪð"),
                        Word("spread", "پخش شدن", "spred")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Truth He Had Missed", titlePersian = "حقیقتی که از دست داده بود",
                    text = "Arman ran down the hill. He embraced his mother. He shook his father's hand. They cried together. They laughed together. That night, they sat around the table and shared simple food. Bread. Cheese. Tea. Nothing fancy. Nothing exotic. And Arman realized that this — this simple meal, with these simple people — was the most delicious thing he had ever eaten. He said to his father, \"I traveled the world searching for happiness. I climbed mountains. I crossed oceans. I sat with holy men. And I found nothing. How is it that happiness was here all along?\" His father looked at him with gentle eyes and said: \"Because, my son, happiness is not something you find. It is something you notice. You spent your life looking in the distance. You never stopped to look at what was already in front of you. Happiness does not live in temples or mountains or oceans. Happiness lives in the heart that is present. It lives in the person who is grateful. It lives in the moment that is fully experienced.\" Arman listened with tears in his eyes. He had walked ten thousand miles to find a truth that had been sitting on his own doorstep. That night, he slept in his childhood bed. And for the first time in twenty years, he slept in peace.",
                    textPersian = "آرمان از تپه پایین دوید. مادرش را در آغوش گرفت. دست پدرش را فشرد. با هم گریه کردند. با هم خندیدند. آن شب، دور میز نشستند و غذای ساده قسمت کردند. نان. پنیر. چای. هیچ چیز مجللی. هیچ چیز عجیبی. و آرمان فهمید این — این غذای ساده، با این مردم ساده — خوشمزه‌ترین چیزی است که تا حالا خورده. به پدرش گفت: «دنیا را گشتم دنبال شادی. از کوه‌ها بالا رفتم. از اقیانوس‌ها گذشتم. با مردان مقدس نشستم. و چیزی نیافتم. چطور ممکن است شادی همیشه همین‌جا بوده؟» پدرش با چشمان مهربان نگاهش کرد و گفت: «چون پسرم، شادی چیزی نیست که پیدا کنی. چیزی است که متوجه شوی. عمرت را به دور نگاه کردن گذراندی. هرگز توقف نکردی که به آنچه قبلاً مقابلت بود نگاه کنی. شادی در معابد یا کوه‌ها یا اقیانوس‌ها زندگی نمی‌کند. شادی در قلبی زندگی می‌کند که حضور دارد. در شخصی که سپاسگزار است. در لحظه‌ای که کاملاً تجربه می‌شود.» آرمان با چشمان پر از اشک گوش داد. ده هزار مایل راه رفته بود تا حقیقتی را پیدا کند که دم در خانه‌اش نشسته بود. آن شب، در تخت کودکی‌اش خوابید. و برای اولین بار در بیست سال، در آرامش خوابید.",
                    vocabulary = listOf(
                        Word("embrace", "در آغوش گرفتن", "ɪmˈbreɪs"),
                        Word("exotic", "عجیب", "ɪɡˈzɑːtɪk"),
                        Word("grateful", "سپاسگزار", "ˈɡreɪtfl"),
                        Word("doorstep", "دم در", "ˈdɔːrstep"),
                        Word("present", "حاضر", "ˈpreznt")
                    )
                )
            )
        ),

        Story(
            id = "s_a4", title = "The Cost of Pride", titlePersian = "بهای غرور",
            level = Level.ADVANCED,
            text = "A powerful emperor loses everything because of his pride.",
            moral = "Pride leads to downfall.", moralPersian = "غرور به سقوط منجر می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1564419320461-6870880221ad?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Emperor's Glory", titlePersian = "شکوه امپراتور",
                    text = "The Emperor Cyrus was the most powerful ruler in the known world. His empire stretched from the eastern mountains to the western seas. His armies were undefeated. His treasury overflowed with gold. His palaces touched the clouds. Kings bowed before him. Nations feared him. And Cyrus — Cyrus believed he was invincible. He had won so many battles that he no longer remembered what defeat felt like. He had conquered so many lands that he no longer respected his enemies. His counselors warned him. \"Majesty,\" they said, \"pride comes before the fall. Even the strongest empire can crumble.\" But Cyrus laughed. \"Let them try,\" he said. \"There is no force on earth that can challenge me.\" He ignored their warnings. He dismissed their concerns. He believed his own legend. And that was the beginning of his end.",
                    textPersian = "امپراتور کوروش قدرتمندترین فرمانروای دنیای شناخته‌شده بود. امپراتوری‌اش از کوه‌های شرقی تا دریاهای غربی کشیده شده بود. ارتش‌هایش شکست‌ناپذیر بودند. خزانه‌اش پر از طلا. کاخ‌هایش به ابرها می‌رسیدند. پادشاهان مقابلش سر خم می‌کردند. ملت‌ها از او می‌ترسیدند. و کوروش — کوروش باور داشت شکست‌ناپذیر است. آنقدر جنگ برده بود که دیگر نمی‌دانست شکست چه حسی دارد. آنقدر سرزمین فتح کرده بود که دیگر به دشمنانش احترام نمی‌گذاشت. مشاورانش هشدار دادند. «اعلیحضرت،» گفتند، «غرور پیش از سقوط است. حتی قوی‌ترین امپراتوری هم می‌تواند فروبپاشد.» اما کوروش خندید. «بگذارید تلاش کنند،» گفت. «هیچ نیرویی روی زمین نیست که مرا به چالش بکشد.» هشدارهایشان را نادیده گرفت. نگرانی‌هایشان را رد کرد. به افسانه‌ی خودش باور داشت. و آن آغاز پایانش بود.",
                    vocabulary = listOf(
                        Word("invincible", "شکست‌ناپذیر", "ɪnˈvɪnsəbl"),
                        Word("conquer", "فتح کردن", "ˈkɑːŋkər"),
                        Word("counselor", "مشاور", "ˈkaʊnsələr"),
                        Word("crumble", "فروپاشیدن", "ˈkrʌmbl"),
                        Word("dismiss", "رد کردن", "dɪsˈmɪs")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Silent Rebellion", titlePersian = "شورش خاموش",
                    text = "While Cyrus celebrated his victories, something was happening in the shadows. His conquered peoples were growing restless. They had been treated harshly. Their cultures had been disrespected. Their gods had been mocked. Their wealth had been stolen. In every province of the empire, small groups began to meet in secret. They whispered about freedom. They planned resistance. They waited for the right moment. Cyrus did not see any of this. He was too busy expanding his empire. He ignored the reports of unrest. He dismissed them as minor complaints. \"They are conquered,\" he said. \"They will obey.\" His counselors tried again to warn him. \"Majesty, the people are suffering. If we do not treat them with respect, they will rise.\" Cyrus grew angry. \"I am the emperor!\" he shouted. \"They exist because I allow it! They will not rise.\" His pride had made him blind. And in his blindness, he did not see that the entire empire was a powder keg, waiting to explode.",
                    textPersian = "وقتی کوروش پیروزی‌هایش را جشن می‌گرفت، چیزی در سایه‌ها می‌گذشت. ملت‌های فتح‌شده‌اش بی‌قرار می‌شدند. با آن‌ها بدرفتاری شده بود. فرهنگ‌هایشان نادیده گرفته شده بود. خدایانشان مسخره شده بودند. ثروتشان دزدیده شده بود. در هر استان امپراتوری، گروه‌های کوچک در خفا جلسه داشتند. از آزادی زمزمه می‌کردند. مقاومت برنامه‌ریزی می‌کردند. منتظر لحظه مناسب بودند. کوروش هیچ‌کدام را ندید. آنقدر مشغول گسترش امپراتوری‌اش بود. گزارش‌های نارضایتی را نادیده گرفت. آن‌ها را شکایات کوچک تلقی کرد. «فتح شده‌اند،» گفت. «اطاعت می‌کنند.» مشاورانش دوباره تلاش کردند هشدار دهند. «اعلیحضرت، مردم در رنجند. اگر با احترام رفتار نکنیم، قیام می‌کنند.» کوروش خشمگین شد. «من امپراتورم!» فریاد زد. «آن‌ها به خاطر من وجود دارند که اجازه می‌دهم! قیام نمی‌کنند.» غرورش او را کور کرده بود. و در کوری‌اش ندید که تمام امپراتوری بشکه باروتی است که منتظر انفجار است.",
                    vocabulary = listOf(
                        Word("rebellion", "شورش", "rɪˈbeljən"),
                        Word("restless", "بی‌قرار", "ˈrestləs"),
                        Word("resistance", "مقاومت", "rɪˈzɪstəns"),
                        Word("unrest", "نارضایتی", "ʌnˈrest"),
                        Word("powder keg", "بشکه باروت", "")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Fall of the Proud", titlePersian = "سقوط مغرور",
                    text = "The rebellion began in the smallest province — the one Cyrus had neglected the most. Within a week, it spread to three more. Within a month, half the empire was in revolt. Cyrus gathered his armies and marched to crush the uprising. But his soldiers were tired. His generals were divided. His people had lost faith. In the decisive battle, three of his own generals betrayed him. They joined the rebels. Cyrus found himself surrounded. He fought bravely, but it was hopeless. He was captured and brought before the rebel leader. \"So,\" the leader said, \"you are the invincible emperor.\" Cyrus looked at him and said nothing. He had no words. He was no longer the man he had been. That moment of capture stripped away every illusion he had held. He had believed that power came from armies. He had believed that respect came from fear. He had believed that his position made him untouchable. He had been wrong about all of it. He was exiled to a small island, where he lived the rest of his life alone. On that island, he wrote his memoir. And in it, he wrote one sentence that he hoped would save others from his fate: \"The enemy that destroyed me was not the armies outside my walls. It was the pride inside my heart.\"",
                    textPersian = "شورش در کوچک‌ترین استان شروع شد — همان که کوروش بیشتر از همه نادیده گرفته بود. در یک هفته به سه استان دیگر پخش شد. در یک ماه، نیمی از امپراتوری در حال شورش بود. کوروش ارتش‌هایش را جمع کرد و برای سرکوب قیام راه افتاد. اما سربازانش خسته بودند. ژنرال‌هایش دودسته بودند. مردمش ایمان را از دست داده بودند. در نبرد تعیین‌کننده، سه تن از ژنرال‌های خودش به او خیانت کردند. به شورشیان پیوستند. کوروش خود را محاصره‌شده یافت. شجاعانه جنگید، اما ناامیدکننده بود. اسیر شد و به حضور رهبر شورشیان آوردند. «پس،» رهبر گفت، «تو همان امپراتور شکست‌ناپذیری.» کوروش نگاهش کرد و چیزی نگفت. کلمه‌ای نداشت. دیگر مردی نبود که بود. آن لحظه‌ی اسارت هر توهمی که داشت را پاره کرد. باور داشت قدرت از ارتش می‌آید. باور داشت احترام از ترس می‌آید. باور داشت موقعیتش او را لمس‌ناپذیر می‌کند. در همه‌چیز اشتباه کرده بود. به جزیره‌ی کوچکی تبعید شد و بقیه عمرش را تنها زندگی کرد. روی آن جزیره، خاطراتش را نوشت. و در آن، یک جمله نوشت که امیدوار بود دیگران را از سرنوشت او نجات دهد: «دشمنی که مرا نابود کرد ارتش‌های بیرون دیوارهایم نبود. غرور درون قلبم بود.»",
                    vocabulary = listOf(
                        Word("uprising", "قیام", "ˈʌpraɪzɪŋ"),
                        Word("decisive", "تعیین‌کننده", "dɪˈsaɪsɪv"),
                        Word("betray", "خیانت کردن", "bɪˈtreɪ"),
                        Word("illusion", "توهم", "ɪˈluːʒn"),
                        Word("exile", "تبعید کردن", "ˈeksaɪl")
                    )
                )
            )
        ),

        Story(
            id = "s_a5", title = "The Gift of Gratitude", titlePersian = "هدیه سپاسگزاری",
            level = Level.ADVANCED,
            text = "Research reveals how gratitude transforms human lives.",
            moral = "Gratitude transforms your life.", moralPersian = "سپاسگزاری زندگی شما را دگرگون می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Experiment", titlePersian = "آزمایش",
                    text = "In 2003, a psychologist named Dr. Robert Emmons conducted a groundbreaking study at the University of California. He divided hundreds of participants into three groups. The first group was asked to write down, every week, five things they were grateful for. The second group wrote down five hassles or annoyances. The third group wrote down five neutral events — things that had simply happened. The study lasted ten weeks. At the end, the results were astonishing. The gratitude group reported feeling twenty-five percent happier than the other two groups. They exercised more. They slept better. They had fewer health complaints. They felt more optimistic about the future. But the most surprising finding was yet to come. The gratitude group also reported stronger relationships. They were more likely to help others. They were more likely to forgive. They were more likely to feel connected to their communities.",
                    textPersian = "در سال ۲۰۰۳، روانشناسی به نام دکتر رابرت اِمونز مطالعه‌ی پیشگامانه‌ای در دانشگاه کالیفرنیا انجام داد. صدها شرکت‌کننده را به سه گروه تقسیم کرد. گروه اول موظف بودند هر هفته پنج چیزی که برایشان سپاسگزارند را بنویسند. گروه دوم پنج مشکل یا مزاحمت. گروه سوم پنج رویداد بی‌طرف — چیزهایی که فقط اتفاق افتاده بودند. مطالعه ده هفته طول کشید. در پایان، نتایج حیرت‌انگیز بود. گروه سپاسگزاری بیست و پنج درصد شادتر از دو گروه دیگر حس کردند. بیشتر ورزش می‌کردند. بهتر می‌خوابیدند. شکایات سلامتی کمتری داشتند. نسبت به آینده خوش‌بین‌تر بودند. اما شگفت‌انگیزترین یافته هنوز در راه بود. گروه سپاسگزاری روابط قوی‌تری هم گزارش کردند. بیشتر احتمال داشت به دیگران کمک کنند. بیشتر احتمال داشت ببخشند. بیشتر احتمال داشت با جوامعشان احساس ارتباط کنند.",
                    vocabulary = listOf(
                        Word("groundbreaking", "پیشگامانه", "ˈɡraʊndbreɪkɪŋ"),
                        Word("participant", "شرکت‌کننده", "pɑːrˈtɪsɪpənt"),
                        Word("grateful", "سپاسگزار", "ˈɡreɪtfl"),
                        Word("hassle", "مزاحمت", "ˈhæsl"),
                        Word("astonishing", "حیرت‌انگیز", "əˈstɑːnɪʃɪŋ")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Neuroscience of Thankfulness", titlePersian = "علوم اعصاب سپاسگزاری",
                    text = "Later research using brain imaging revealed why gratitude is so powerful. When people practice gratitude, the brain releases dopamine and serotonin — chemicals associated with pleasure and well-being. But more importantly, gratitude activates the prefrontal cortex — the part of the brain responsible for decision-making, empathy, and social connection. Over time, gratitude literally rewires the brain. The neural pathways associated with gratitude become stronger. The pathways associated with complaining and negativity become weaker. In other words, gratitude is not just a nice feeling. It is a form of mental exercise. And like any exercise, the more you practice it, the stronger you become. One study found that people who practiced gratitude for just eight weeks showed measurable changes in brain structure. Another study found that gratitude practices reduced symptoms of depression and anxiety as effectively as medication — without any side effects. The science is clear: gratitude is medicine for the mind.",
                    textPersian = "پژوهش‌های بعدی با تصویربرداری مغزی نشان داد چرا سپاسگزاری اینقدر قدرتمند است. وقتی مردم سپاسگزاری می‌کنند، مغز دوپامین و سروتونین آزاد می‌کند — مواد شیمیایی مرتبط با لذت و رفاه. اما مهم‌تر، سپاسگزاری قشر پیش‌پیشانی را فعال می‌کند — بخشی از مغز که مسئول تصمیم‌گیری، همدلی و ارتباط اجتماعی است. در طول زمان، سپاسگزاری به معنای واقعی کلمه مغز را بازسیم‌کشی می‌کند. مسیرهای عصبی مرتبط با سپاسگزاری قوی‌تر می‌شوند. مسیرهای مرتبط با شکایت و منفی‌بافی ضعیف‌تر. به عبارت دیگر، سپاسگزاری فقط یک حس خوشایند نیست. نوعی ورزش ذهنی است. و مثل هر ورزشی، هرچه بیشتر تمرین کنی، قوی‌تر می‌شوی. یک مطالعه نشان داد افرادی که فقط هشت هفته سپاسگزاری کردند، تغییرات قابل‌اندازه‌گیری در ساختار مغز نشان دادند. مطالعه‌ای دیگر نشان داد تمرین‌های سپاسگزاری علائم افسردگی و اضطراب را به همان اندازه دارو کاهش می‌دهد — بدون عوارض جانبی. علم واضح است: سپاسگزاری داروی ذهن است.",
                    vocabulary = listOf(
                        Word("dopamine", "دوپامین", "ˈdoʊpəmiːn"),
                        Word("serotonin", "سروتونین", "ˌserəˈtoʊnɪn"),
                        Word("prefrontal cortex", "قشر پیش‌پیشانی", ""),
                        Word("rewire", "بازسیم‌کشی کردن", "riːˈwaɪər"),
                        Word("measurable", "قابل اندازه‌گیری", "ˈmeʒərəbl")
                    )
                ),
                StoryChapter(
                    number = 3, title = "A Simple Practice, A Transformed Life",
                    titlePersian = "تمرینی ساده، زندگی دگرگون",
                    text = "Dr. Emmons's research inspired thousands of studies, books, and practices. Today, gratitude journaling is used in schools, hospitals, businesses, and homes around the world. But the most powerful example is always personal. Consider Maryam, a young woman who suffered from chronic depression for years. She tried therapy. She tried medication. Nothing worked completely. Then a friend suggested she try gratitude journaling. Maryam was skeptical. But she was desperate. So she bought a small notebook and started writing in it every night. At first, it was hard. She struggled to find even one thing to be grateful for. But she forced herself. Slowly, week by week, it became easier. She started to notice small things — the taste of good coffee, the smile of a stranger, the warmth of sunlight. Within six months, her depression had lifted. Not completely — but enough that she could function, that she could see beauty again. Within a year, she was a different person. She wrote in her journal one day: \"Gratitude didn't change my circumstances. It changed my eyes. And when my eyes changed, everything looked different. I had been living in darkness, thinking I had no light. But the light was always there. I just had to learn to see it.\" That is the gift of gratitude. It is free. It is simple. And it can transform your life.",
                    textPersian = "پژوهش دکتر اِمونز هزاران مطالعه، کتاب و تمرین را الهام بخشید. امروز، دفتر خاطرات سپاسگزاری در مدارس، بیمارستان‌ها، کسب‌وکارها و خانه‌ها در سراسر جهان استفاده می‌شود. اما قدرتمندترین مثال همیشه شخصی است. مریم را در نظر بگیر، زن جوانی که سال‌ها از افسردگی مزمن رنج می‌برد. درمان امتحان کرد. دارو امتحان کرد. هیچ‌کدام کاملاً کار نکرد. بعد دوستی پیشنهاد کرد دفتر سپاسگزاری امتحان کند. مریم شک داشت. اما ناامید بود. پس دفترچه کوچکی خرید و هر شب شروع به نوشتن کرد. اولش سخت بود. حتی برای پیدا کردن یک چیز برای سپاسگزاری تلاش می‌کرد. اما خودش را مجبور کرد. آرام‌آرام، هفته به هفته، آسان‌تر شد. شروع کرد به توجه به چیزهای کوچک — طعم قهوه‌ی خوب، لبخند یک غریبه، گرمای نور خورشید. در شش ماه، افسردگی‌اش کم شد. کاملاً نه — اما به اندازه‌ای که بتواند کار کند، که بتواند دوباره زیبایی را ببیند. در یک سال، شخص دیگری بود. یک روز در دفترش نوشت: «سپاسگزاری شرایطم را تغییر نداد. چشمانم را تغییر داد. و وقتی چشمانم تغییر کرد، همه چیز متفاوت شد. در تاریکی زندگی کرده بودم و فکر می‌کردم نوری ندارم. اما نور همیشه آنجا بود. فقط باید یاد می‌گرفتم ببینمش.» این هدیه سپاسگزاری است. رایگان است. ساده است. و می‌تواند زندگی‌ات را دگرگون کند.",
                    vocabulary = listOf(
                        Word("chronic", "مزمن", "ˈkrɑːnɪk"),
                        Word("skeptical", "شک‌گرا", "ˈskeptɪkl"),
                        Word("desperate", "ناامید", "ˈdespərət"),
                        Word("circumstance", "شرایط", "ˈsɜːrkəmstæns"),
                        Word("transform", "دگرگون کردن", "trænsˈfɔːrm")
                    )
                )
            )
        ),

        Story(
            id = "s_a6", title = "The Paradox of Choice", titlePersian = "پارادوکس انتخاب",
            level = Level.ADVANCED,
            text = "Why having too many options can make us unhappy.",
            moral = "Too many choices can trap us.", moralPersian = "انتخاب‌های بیش از حد می‌تواند ما را گرفتار کند.",
            coverUrl = "https://images.unsplash.com/photo-1484480974693-6ca0a78fb36b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Supermarket Experiment", titlePersian = "آزمایش سوپرمارکت",
                    text = "In 2000, two psychologists — Sheena Iyengar and Mark Lepper — conducted an experiment that would become famous. They set up a tasting booth in a high-end supermarket. On some days, they displayed six varieties of jam. On other days, they displayed twenty-four. The results were striking. When there were twenty-four jams, sixty percent of shoppers stopped to look. When there were only six, only forty percent stopped. So far, it seemed that more choice attracted more interest. But then came the twist. Of the shoppers who saw the twenty-four-jam display, only three percent bought a jar. Of the shoppers who saw the six-jam display, thirty percent bought. In other words, fewer choices led to ten times more purchases. The reason was simple: with six options, it was easy to decide. With twenty-four, the decision became overwhelming. This study launched a whole field of research on what has come to be called \"the paradox of choice.\"",
                    textPersian = "در سال ۲۰۰۰، دو روانشناس — شینا آیینگار و مارک لپر — آزمایشی انجام دادند که مشهور شد. غرفه چشایی در یک سوپرمارکت سطح بالا راه‌اندازی کردند. بعضی روزها شش نوع مربا نمایش می‌دادند. بعضی روزها بیست و چهار نوع. نتایج قابل توجه بود. وقتی بیست و چهار مربا بود، شصت درصد خریداران برای دیدن توقف می‌کردند. وقتی فقط شش تا بود، فقط چهل درصد. تا اینجا به نظر می‌رسید انتخاب بیشتر توجه بیشتری جلب می‌کند. اما پیچش ماجرا اینجا بود. از خریدارانی که نمایش بیست و چهار مربا را دیدند، فقط سه درصد یک شیشه خریدند. از خریدارانی که نمایش شش مربا را دیدند، سی درصد خریدند. به عبارت دیگر، انتخاب کمتر به ده برابر خرید بیشتر منجر شد. دلیل ساده بود: با شش گزینه، تصمیم آسان بود. با بیست و چهار، تصمیم طاقت‌فرسا شد. این مطالعه زمینه‌ی تحقیقاتی کاملی در مورد چیزی که «پارادوکس انتخاب» نامیده می‌شود راه‌اندازی کرد.",
                    vocabulary = listOf(
                        Word("psychologist", "روانشناس", "saɪˈkɑːlədʒɪst"),
                        Word("tasting", "چشایی", "ˈteɪstɪŋ"),
                        Word("striking", "قابل توجه", "ˈstraɪkɪŋ"),
                        Word("overwhelming", "طاقت‌فرسا", "ˌoʊvərˈwelmɪŋ"),
                        Word("paradox", "پارادوکس", "ˈpærədɑːks")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Cost of Freedom", titlePersian = "بهای آزادی",
                    text = "Modern society celebrates choice. We are told that freedom means having options. The more options, the more freedom, right? Not necessarily. Research has shown that an abundance of choice can lead to anxiety, paralysis, and regret. When we have too many options, we worry about making the wrong choice. We worry that a better option exists that we haven't considered. We spend so much time choosing that we enjoy the chosen thing less. And if the choice turns out poorly, we blame ourselves. \"I should have chosen differently,\" we think. \"If only I had picked the other one.\" Studies have found that people who maximize — who always try to make the absolute best choice — are less happy than people who satisfice — who choose what is good enough. Maximizers spend more time choosing, feel more regret, and are less satisfied with the outcome. They have more freedom, but less joy.",
                    textPersian = "جامعه مدرن انتخاب را جشن می‌گیرد. به ما گفته می‌شود آزادی یعنی داشتن گزینه. هر گزینه بیشتر، آزادی بیشتر، درست است؟ نه لزوماً. تحقیقات نشان داده فراوانی انتخاب می‌تواند به اضطراب، فلج و پشیمانی منجر شود. وقتی گزینه‌های زیادی داریم، نگران انتخاب اشتباه می‌شویم. نگران این هستیم که گزینه بهتری وجود دارد که در نظر نگرفته‌ایم. آنقدر وقت صرف انتخاب می‌کنیم که از انتخاب‌شده کمتر لذت می‌بریم. و اگر انتخاب بد از آب دربیاید، خودمان را سرزنش می‌کنیم. «باید جور دیگری انتخاب می‌کردم،» فکر می‌کنیم. «ای کاش آن یکی را برمی‌داشتم.» مطالعات نشان داده افرادی که حداکثرساز هستند — که همیشه تلاش می‌کنند بهترین انتخاب را بکنند — کمتر از افرادی شادند که قانع‌کننده هستند — که آنچه به اندازه کافی خوب است انتخاب می‌کنند. حداکثرسازها وقت بیشتری صرف انتخاب می‌کنند، پشیمانی بیشتری حس می‌کنند و از نتیجه راضی‌تر نیستند. آزادی بیشتری دارند، اما شادی کمتری.",
                    vocabulary = listOf(
                        Word("abundance", "فراوانی", "əˈbʌndəns"),
                        Word("paralysis", "فلج", "pəˈræləsɪs"),
                        Word("regret", "پشیمانی", "rɪˈɡret"),
                        Word("maximize", "حداکثر ساختن", "ˈmæksɪmaɪz"),
                        Word("satisfice", "قانع بودن", "ˈsætɪsfaɪs")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Secret of Contentment", titlePersian = "راز رضایت",
                    text = "So what is the solution? Should we remove all choices from our lives? Not exactly. The solution is not fewer options — it is a different relationship with choice. The key insight is this: happiness does not come from having the best option. It comes from being content with the option you have. Consider the story of an old farmer. He had a small farm with a few animals — a cow, two chickens, a dog, and a horse. He was content. One day, a merchant offered him a large sum for his farm and enough land to start a bigger one. The farmer said no. \"Why not?\" asked the merchant. \"You could have so much more.\" The farmer smiled. \"I have enough,\" he said. \"I have my animals. I have my land. I have my health. I have my family. I do not need more. I need only to appreciate what I have.\" The merchant did not understand. But years later, after losing his wealth and his land, he returned to the old farmer. The farmer was still there, still content. \"How do you do it?\" asked the merchant. \"You lost everything and I lost everything, but you are happy and I am not.\" The farmer replied, \"I did not lose what you lost. You lost your possessions. I never possessed more than I needed. The secret of happiness is not having more. It is needing less.\"",
                    textPersian = "پس راه‌حل چیست؟ آیا باید همه‌ی انتخاب‌ها را از زندگی‌مان حذف کنیم؟ نه دقیقاً. راه‌حل گزینه کمتر نیست — رابطه‌ی متفاوت با انتخاب است. بینش کلیدی این است: شادی از داشتن بهترین گزینه نمی‌آید. از راضی بودن با گزینه‌ای که داری می‌آید. داستان یک کشاورز پیر را در نظر بگیر. مزرعه‌ی کوچکی با چند حیوان داشت — یک گاو، دو مرغ، یک سگ و یک اسب. راضی بود. یک روز، تاجری مبلغ زیادی برای مزرعه‌اش پیشنهاد داد و زمین کافی برای شروع مزرعه‌ای بزرگ‌تر. کشاورز نه گفت. «چرا نه؟» تاجر پرسید. «می‌توانی خیلی بیشتر داشته باشی.» کشاورز لبخند زد. «به اندازه کافی دارم،» گفت. «حیواناتم را دارم. زمینم را دارم. سلامتی‌ام را دارم. خانواده‌ام را دارم. بیشتر نمی‌خواهم. فقط می‌خواهم آنچه دارم را قدر بدانم.» تاجر نفهمید. اما سال‌ها بعد، بعد از از دست دادن ثروت و زمینش، به کشاورز پیر بازگشت. کشاورز هنوز آنجا بود، هنوز راضی. «چطور می‌کنی؟» تاجر پرسید. «تو همه چیز را از دست دادی و من همه چیز را از دست دادم، اما تو شادی و من نه.» کشاورز پاسخ داد: «آنچه تو از دست دادی را از دست ندادم. تو دارایی‌هایت را از دست دادی. من هرگز بیشتر از نیازم نداشتم. راز شادی داشتن بیشتر نیست. کمتر نیاز داشتن است.»",
                    vocabulary = listOf(
                        Word("contentment", "رضایت", "kənˈtentmənt"),
                        Word("insight", "بینش", "ˈɪnsaɪt"),
                        Word("merchant", "تاجر", "ˈmɜːrtʃənt"),
                        Word("appreciate", "قدر دانستن", "əˈpriːʃieɪt"),
                        Word("possess", "داشتن", "pəˈzes")
                    )
                )
            )
        ),

        Story(
            id = "s_a7", title = "The Illusion of Control", titlePersian = "توهم کنترل",
            level = Level.ADVANCED,
            text = "A businessman learns that true control is self-mastery.",
            moral = "True control is self-mastery.", moralPersian = "کنترل واقعی تسلط بر خویشتن است.",
            coverUrl = "https://images.unsplash.com/photo-1499750310107-5fef28a66643?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Master of His Life", titlePersian = "ارباب زندگی خود",
                    text = "Reza was a man who planned everything. Every minute of his day was scheduled. Every project was managed with military precision. Every relationship was analyzed for its strategic value. He woke at five. He exercised at five-thirty. He read the news at six. He arrived at his office at seven. His colleagues admired him. His family obeyed him. His business partners feared him. Reza believed he was in complete control. And for many years, it seemed he was. His business grew. His wealth multiplied. His reputation soared. But there was one thing Reza could not control — and it was the most important thing of all. He could not control the accident that took his wife. He could not control the illness that struck his son. He could not control the betrayal of his closest partner. One by one, the pillars of his carefully constructed life crumbled. And Reza, the man who had controlled everything, found himself controlling nothing.",
                    textPersian = "رضا مردی بود که همه چیز را برنامه‌ریزی می‌کرد. هر دقیقه روزش زمان‌بندی شده بود. هر پروژه با دقت نظامی مدیریت می‌شد. هر رابطه از نظر ارزش استراتژیک تحلیل می‌شد. ساعت پنج بیدار می‌شد. پنج و نیم ورزش. شش اخبار می‌خواند. هفت به دفترش می‌رسید. همکارانش تحسینش می‌کردند. خانواده‌اش اطاعتش می‌کردند. شرکای تجاری‌اش از او می‌ترسیدند. رضا باور داشت کنترل کامل دارد. و سال‌های زیادی، به نظر می‌رسید داشت. کسب‌وکارش رشد کرد. ثروتش چند برابر شد. شهرتش اوج گرفت. اما یک چیز بود که رضا نمی‌توانست کنترل کند — و مهم‌ترین چیز بود. نمی‌توانست تصادفی را که همسرش را گرفت کنترل کند. نمی‌توانست بیماری‌ای که پسرش را گرفت کنترل کند. نمی‌توانست خیانت نزدیک‌ترین شریکش را کنترل کند. یکی‌یکی، ستون‌های زندگی ساخته‌شده‌ی دقیقش فرو ریختند. و رضا، مردی که همه چیز را کنترل کرده بود، خود را در حال کنترل هیچ چیز یافت.",
                    vocabulary = listOf(
                        Word("precision", "دقت", "prɪˈsɪʒn"),
                        Word("strategic", "استراتژیک", "strəˈtiːdʒɪk"),
                        Word("reputation", "شهرت", "ˌrepjuˈteɪʃn"),
                        Word("pillar", "ستون", "ˈpɪlər"),
                        Word("crumble", "فرو ریختن", "ˈkrʌmbl")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Breaking Point", titlePersian = "نقطه شکست",
                    text = "After his wife's death and his son's illness, Reza retreated from the world. He stopped going to his office. He stopped answering his phone. He sat alone in his empty house, staring at the walls. Everything he had built meant nothing now. All his planning, all his success, all his control — none of it had protected the people he loved. He began to drink. He stopped eating. He stopped showering. His friends worried. His doctor warned him. But Reza did not care. One night, as he sat on the floor surrounded by empty bottles, something broke inside him. He started to cry. Not just a few tears. A flood. He cried for his wife. He cried for his son. He cried for himself. He cried for all the years he had wasted trying to control the uncontrollable. When the tears finally stopped, he felt something he had not felt in decades: empty. Not the empty of loss. The empty of a cup that had been washed clean. And in that emptiness, something new began to grow.",
                    textPersian = "بعد از مرگ همسرش و بیماری پسرش، رضا از دنیا کناره گرفت. از رفتن به دفترش دست کشید. از جواب دادن به تلفن دست کشید. تنها در خانه‌ی خالی‌اش نشست و به دیوارها خیره شد. هر چیزی که ساخته بود الان بی‌معنی بود. تمام برنامه‌ریزی‌هایش، تمام موفقیتش، تمام کنترلش — هیچ‌کدام از آن‌ها عزیزانش را محافظت نکرده بود. شروع به نوشیدن کرد. غذا خوردن را متوقف کرد. دوش گرفتن را متوقف کرد. دوستانش نگران شدند. دکترش هشدار داد. اما رضا اهمیتی نمی‌داد. یک شب، وقتی روی زمین احاطه‌شده با بطری‌های خالی نشسته بود، چیزی درونش شکست. شروع به گریه کرد. نه فقط چند قطره اشک. سیلابی. برای همسرش گریه کرد. برای پسرش. برای خودش. برای تمام سال‌هایی که صرف کنترل چیزهایی کرده بود که قابل کنترل نبودند. وقتی اشک‌ها بالاخره تمام شد، چیزی حس کرد که دهه‌ها حس نکرده بود: خالی. نه خالی از دست دادن. خالی از فنجانی که شسته شده. و در آن خالی بودن، چیز جدیدی شروع به رشد کرد.",
                    vocabulary = listOf(
                        Word("retreat", "کناره گرفتن", "rɪˈtriːt"),
                        Word("warning", "هشدار", "ˈwɔːrnɪŋ"),
                        Word("decade", "دهه", "ˈdekeɪd"),
                        Word("emptiness", "خالی بودن", "ˈemptinəs"),
                        Word("flood", "سیل", "flʌd")
                    )
                ),
                StoryChapter(
                    number: 3, title = "Mastering the Only Thing You Can", titlePersian = "تسلط بر تنها چیزی که می‌توانی",
                    text = "Reza did not rebuild his business. He did not reclaim his wealth. He did not restore his reputation. Instead, he did something much more important. He started to learn. He studied philosophy and psychology. He talked to monks, therapists, and wise elders. He read books about acceptance, mindfulness, and the ancient wisdom of Stoic philosophers. He began to understand something he had never understood before: he had spent his life trying to control the outside world. But the only thing anyone can control is their own response to the world. The Stoics called this the \"dichotomy of control.\" Some things are within our power — our thoughts, our actions, our judgments. Other things are not — the weather, other people, illness, death. Wisdom comes from knowing the difference. And peace comes from focusing only on what we can control. Reza opened a small school where he taught these lessons to young people. He shared his story openly, including his failures. He became known not for his wealth, but for his wisdom. And at the end of his life, he wrote: \"I spent forty years trying to control the world. I failed. I spent the last twenty years learning to control myself. I succeeded. The only throne worth sitting on is the one within your own mind.\"",
                    textPersian = "رضا کسب‌وکارش را بازسازی نکرد. ثروتش را بازنگرداند. شهرتش را احیا نکرد. در عوض، کار مهم‌تری انجام داد. شروع به یادگیری کرد. فلسفه و روانشناسی خواند. با راهبان، درمانگران و بزرگان دانا صحبت کرد. کتاب‌هایی درباره پذیرش، ذهن‌آگاهی و حکمت باستانی فیلسوفان رواقی خواند. شروع به فهم چیزی کرد که قبلاً نفهمیده بود: عمرش را صرف تلاش برای کنترل دنیای بیرون کرده بود. اما تنها چیزی که هر کس می‌تواند کنترل کند، پاسخ خودش به دنیاست. رواقیون این را «دوگانگی کنترل» نامیدند. بعضی چیزها در قدرت ما هستند — افکار، اعمال، قضاوت‌هایمان. چیزهای دیگر نیستند — آب و هوا، دیگران، بیماری، مرگ. حکمت از دانستن تفاوت می‌آید. و آرامش از تمرکز فقط بر آنچه می‌توانیم کنترل کنیم. رضا مدرسه کوچکی باز کرد که در آن این درس‌ها را به جوانان آموزش می‌داد. داستانش را آشکارا، از جمله شکست‌هایش، به اشتراک گذاشت. نه به خاطر ثروتش، بلکه به خاطر حکمتش شناخته شد. و در پایان زندگی‌اش نوشت: «چهل سال صرف تلاش برای کنترل دنیا کردم. شکست خوردم. بیست سال آخر صرف یادگیری کنترل خودم کردم. موفق شدم. تنها تخت شایسته نشستن، تخت درون ذهن خودت است.»",
                    vocabulary = listOf(
                        Word("reclaim", "بازگرداندن", "rɪˈkleɪm"),
                        Word("philosophy", "فلسفه", "fəˈlɑːsəfi"),
                        Word("mindfulness", "ذهن‌آگاهی", "ˈmaɪndflnəs"),
                        Word("dichotomy", "دوگانگی", "daɪˈkɑːtəmi"),
                        Word("throne", "تخت پادشاهی", "θroʊn")
                    )
                )
            )
        ),

        Story(
            id = "s_a8", title = "The Long Game", titlePersian = "بازی بلندمدت",
            level = Level.ADVANCED,
            text = "Two chess players show the power of patience and strategic thinking.",
            moral = "Think long-term and time works for you.", moralPersian = "بلندمدت فکر کن تا زمان برایت کار کند.",
            coverUrl = "https://images.unsplash.com/photo-1529699211952-734e80c4d42b?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Two Players", titlePersian = "دو بازیکن",
                    text = "In the world of competitive chess, two names stood above all others: Viktor and Hassan. Viktor was a prodigy. He had learned to play at four and won his first tournament at six. He played with aggression and brilliance. His games were quick, decisive, and devastating. He could see ten moves ahead. He sacrificed pieces fearlessly for positional advantage. He lived for the checkmate. Hassan was different. He had learned chess late, at fourteen, from an old man in his village. He played slowly. Deliberately. He rarely made brilliant moves. He rarely made mistakes either. He did not try to win quickly. He tried to win eventually. He had one guiding principle: \"Play the position, not the opponent.\" In other words, focus on what the board tells you, not on what your opponent might do.",
                    textPersian = "در دنیای شطرنج رقابتی، دو نام از همه بالاتر بودند: ویکتور و حسن. ویکتور نابغه بود. چهار سالگی شطرنج یاد گرفته و شش سالگی اولین مسابقه را برده بود. با تهاجم و درخشش بازی می‌کرد. بازی‌هایش سریع، قاطع و ویرانگر بودند. ده حرکت جلوتر را می‌دید. بی‌باکانه مهره فدا می‌کرد. برای کیش‌ومات زندگی می‌کرد. حسن فرق داشت. دیر شطرنج یاد گرفته بود، چهارده سالگی، از پیرمردی در دهکده‌اش. آهسته بازی می‌کرد. با تعمق. به‌ندرت حرکت درخشان می‌کرد. به‌ندرت هم اشتباه می‌کرد. تلاش نمی‌کرد سریع ببرد. تلاش می‌کرد در نهایت ببرد. یک اصل راهنما داشت: «موقعیت را بازی کن، نه حریف را.» یعنی روی آنچه تخته می‌گوید تمرکز کن، نه روی آنچه حریف ممکن است بکند.",
                    vocabulary = listOf(
                        Word("prodigy", "نابغه", "ˈprɑːdədʒi"),
                        Word("aggression", "تهاجم", "əˈɡreʃn"),
                        Word("devastating", "ویرانگر", "ˈdevəsteɪtɪŋ"),
                        Word("sacrifice", "فدا کردن", "ˈsækrɪfaɪs"),
                        Word("deliberately", "با تعمق", "dɪˈlɪbərətli")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Championship Match", titlePersian = "مسابقه قهرمانی",
                    text = "When Viktor and Hassan finally met in a world championship, the world watched with bated breath. Viktor was the favorite. He had won more games, beaten more opponents, and risen faster. Hassan was the underdog — quiet, methodical, almost invisible in the world of chess celebrities. The match would consist of twelve games. Viktor won the first three. Decisively. The world was ready to declare him the winner. But Hassan did not panic. He simply played the fourth game. And the fifth. And the sixth. He did not try to win. He tried to draw. He played each move with the same calm he always had. He made no mistakes. He did not give Viktor any opportunities. He simply stayed alive. By the end of the sixth game, the score was three wins to Viktor, zero to Hassan, and three draws. The world was confused. What was Hassan doing?",
                    textPersian = "وقتی ویکتور و حسن بالاخره در مسابقات قهرمانی جهان به هم رسیدند، دنیا با نفس بند آمده تماشا کرد. ویکتور مورد علاقه بود. بازی‌های بیشتری برده بود، حریفان بیشتری شکست داده بود و سریع‌تر بالا آمده بود. حسن outsider بود — ساکت، روشمند، تقریباً نامرئی در دنیای مشاهیر شطرنج. مسابقه شامل دوازده بازی بود. ویکتور سه بازی اول را برد. قاطعانه. دنیا آماده بود او را برنده اعلام کند. اما حسن وحشت نکرد. فقط بازی چهارم را کرد. و پنجم. و ششم. تلاش نمی‌کرد ببرد. تلاش می‌کرد مساوی کند. هر حرکت را با همان آرامش همیشگی‌اش بازی می‌کرد. اشتباه نمی‌کرد. به ویکتور هیچ فرصتی نمی‌داد. فقط زنده می‌ماند. پایان بازی ششم، امتیاز سه برد ویکتور، صفر حسن، سه مساوی بود. دنیا گیج شد. حسن چه کار می‌کرد؟",
                    vocabulary = listOf(
                        Word("championship", "قهرمانی", "ˈtʃæmpiənʃɪp"),
                        Word("underdog", "outsider", "ˈʌndərdɔːɡ"),
                        Word("methodical", "روشمند", "məˈθɑːdɪkl"),
                        Word("decisively", "قاطعانه", "dɪˈsaɪsɪvli"),
                        Word("draw", "مساوی", "drɔː")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Power of the Long Game", titlePersian = "قدرت بازی بلندمدت",
                    text = "The seventh game began. This time, something was different. Viktor, used to winning quickly, was frustrated by Hassan's patience. He began to take risks. He played aggressively, hoping to force a win. But Hassan had anticipated this. He had studied Viktor for years. He knew that when Viktor was frustrated, he would make mistakes. And he did. In the seventh game, Viktor blundered. Hassan won. Then in the eighth, Viktor made another mistake. Hassan won again. Ninth game. Another win for Hassan. Suddenly, the score was tied — three wins each, three draws, and Hassan was gaining momentum. Viktor was desperate. He pushed harder. He tried to force a win. And in his desperation, he made the mistake that would cost him the championship. In the twelfth and final game, Viktor lost again. Hassan had won the world championship. In the press conference afterward, Hassan was asked his secret. \"I did not try to win the championship in the first game,\" he said. \"I tried to win it in the twelfth game. Most players play to win today. I play to win tomorrow. That is the long game.\" Viktor, in his own press conference, said something remarkable. \"I played better chess than Hassan,\" he admitted. \"But he played better life. He understood something I did not: patience, not brilliance, wins championships. He taught me more in twelve games than I learned in twenty years.\"",
                    textPersian = "بازی هفتم شروع شد. این بار چیزی متفاوت بود. ویکتور که به برد سریع عادت داشت، از صبر حسن کلافه شد. شروع به ریسک کرد. تهاجمی بازی کرد، به امید اینکه برد را تحمیل کند. اما حسن پیش‌بینی کرده بود. سال‌ها ویکتور را مطالعه کرده بود. می‌دانست وقتی ویکتور کلافه می‌شود، اشتباه می‌کند. و کرد. در بازی هفتم، ویکتور اشتباه بزرگی کرد. حسن برد. بعد در هشتم، ویکتور اشتباه دیگری کرد. حسن دوباره برد. نهم. برد دیگر برای حسن. ناگهان امتیاز مساوی شد — سه برد برای هر کدام، سه مساوی، و حسن در حال افزایش بود. ویکتور ناامید بود. سخت‌تر فشار آورد. تلاش کرد بردی را تحمیل کند. و در ناامیدی، اشتباهی کرد که قهرمانی را به او واگذار کرد. در بازی دوازدهم و آخر، ویکتور دوباره باخت. حسن قهرمان جهان شده بود. در کنفرانس مطبوعاتی بعد، از حسن رازش را پرسیدند. «تلاش نکردم قهرمانی را در بازی اول ببرم،» گفت. «تلاش کردم در بازی دوازدهم ببرم. بیشتر بازیکنان برای بردن امروز بازی می‌کنند. من برای بردن فردا بازی می‌کنم. این بازی بلندمدت است.» ویکتور در کنفرانس خودش چیز قابل توجهی گفت. «من شطرنج بهتری از حسن بازی کردم،» اعتراف کرد. «اما او زندگی بهتری بازی کرد. چیزی را فهمید که من نفهمیدم: صبر، نه استعداد، قهرمانی‌ها را می‌برد. او در دوازده بازی بیشتر از بیست سال به من آموخت.»",
                    vocabulary = listOf(
                        Word("anticipate", "پیش‌بینی کردن", "ænˈtɪsɪpeɪt"),
                        Word("blunder", "اشتباه بزرگ", "ˈblʌndər"),
                        Word("momentum", "تکان", "moʊˈmentəm"),
                        Word("desperation", "ناامیدی", "ˌdespəˈreɪʃn"),
                        Word("remarkable", "قابل توجه", "rɪˈmɑːrkəbl")
                    )
                )
            )
        ),

        Story(
            id = "s_a9", title = "The Silent Epidemic", titlePersian = "همه‌گیری خاموش",
            level = Level.ADVANCED,
            text = "Loneliness is a hidden crisis of the modern world.",
            moral = "Connection is the antidote to modern loneliness.", moralPersian = "ارتباط پادزهر تنهایی مدرن است.",
            coverUrl = "https://images.unsplash.com/photo-1499728603263-13726abce5fd?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "A Modern Paradox", titlePersian = "پارادوکس مدرن",
                    text = "In 2018, the British government appointed a Minister for Loneliness. This was the first such position in history. Why? Because research had revealed something shocking. Loneliness was killing people. Not metaphorically — literally. A major meta-analysis found that loneliness increases the risk of premature death by twenty-six percent. It is as dangerous as smoking fifteen cigarettes a day. Worse than obesity. Worse than lack of exercise. In the United States, another study found that more than one in three adults reported feeling lonely. In Japan, there is a word for people who die alone and unnoticed — \"kodokushi.\" Thousands of such deaths occur every year. The modern world has more means of communication than ever before. Smartphones. Social media. Video calls. Instant messaging. And yet, paradoxically, people feel more isolated than ever.",
                    textPersian = "در سال ۲۰۱۸، دولت بریتانیا وزیری برای تنهایی منصوب کرد. این اولین چنین سمتی در تاریخ بود. چرا؟ چون تحقیقات چیز شوکه‌کننده‌ای نشان داده بود. تنهایی داشت مردم را می‌کشت. نه استعاری — واقعاً. یک فراتحلیل بزرگ نشان داد تنهایی خطر مرگ زودرس را بیست و شش درصد افزایش می‌دهد. به خطرناکی کشیدن پانزده سیگار در روز است. بدتر از چاقی. بدتر از کم‌تحرکی. در آمریکا، مطالعه‌ای دیگر نشان داد بیش از یک در سه بزرگسال احساس تنهایی می‌کند. در ژاپن، واژه‌ای برای کسانی که تنها و نادیده می‌میرند وجود دارد — «کودوکوشی.» سالانه هزاران چنین مرگی رخ می‌دهد. دنیای مدرن بیش از هر وقت دیگری ابزار ارتباطی دارد. گوشی‌های هوشمند. شبکه‌های اجتماعی. تماس‌های ویدیویی. پیام‌رسانی فوری. و با این حال، پارادوکس‌وار، مردم بیش از همیشه منزوی حس می‌کنند.",
                    vocabulary = listOf(
                        Word("loneliness", "تنهایی", "ˈloʊnlinəs"),
                        Word("premature", "زودرس", "ˌpriːməˈtʃʊr"),
                        Word("obesity", "چاقی", "oʊˈbiːsəti"),
                        Word("paradoxically", "پارادوکس‌وار", "ˌpærəˈdɑːksɪkli"),
                        Word("isolated", "منزوی", "ˈaɪsəleɪtɪd")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Illusion of Connection", titlePersian = "توهم ارتباط",
                    text = "Why is this happening? Why, in an age of unprecedented connectivity, are we more alone than ever? Researchers have several theories. The first is the difference between connection and meaningful connection. Social media allows us to \"connect\" with hundreds or thousands of people. But these connections are often shallow. They are based on likes and brief comments, not on real conversations or shared experiences. Second, the modern world is transient. People move frequently. They change jobs. They leave their hometowns. Traditional communities — neighborhoods, churches, extended families — have weakened. Third, technology often replaces face-to-face contact with digital communication. But the human brain is wired for physical presence. We are social animals who evolved in small groups. We need to see faces, hear voices, share meals, touch hands. No amount of emojis or video calls can fully substitute for this. A study at UCLA found that even just holding hands with a loved one can reduce stress hormones significantly. The body knows the difference between connection and simulation.",
                    textPersian = "چرا این اتفاق می‌افتد؟ چرا در عصر ارتباط بی‌سابقه، بیش از همیشه تنها هستیم؟ محققان چندین نظریه دارند. اولی تفاوت بین ارتباط و ارتباط معنادار است. شبکه‌های اجتماعی به ما اجازه می‌دهند با صدها یا هزاران نفر «ارتباط» برقرار کنیم. اما این ارتباطات اغلب سطحی‌اند. بر لایک و نظرات کوتاه بنا هستند، نه بر گفتگوهای واقعی یا تجربیات مشترک. دوم، دنیای مدرن گذراست. مردم مکرراً جابه‌جا می‌شوند. شغل عوض می‌کنند. شهرشان را ترک می‌کنند. جوامع سنتی — محله‌ها، کلیساها، خانواده‌های گسترده — ضعیف شده‌اند. سوم، تکنولوژی اغلب تماس رو در رو را با ارتباط دیجیتالی جایگزین می‌کند. اما مغز انسان برای حضور فیزیکی ساخته شده. ما حیوانات اجتماعی هستیم که در گروه‌های کوچک تکامل یافتیم. نیاز به دیدن چهره‌ها، شنیدن صداها، قسمت کردن غذا و لمس دست‌ها داریم. هیچ مقدار ایموجی یا تماس ویدیویی نمی‌تواند کاملاً جایگزین این شود. مطالعه‌ای در UCLA نشان داد حتی فقط گرفتن دست یک عزیز می‌تواند هورمون‌های استرس را به‌طور قابل توجهی کاهش دهد. بدن تفاوت بین ارتباط و شبیه‌سازی را می‌داند.",
                    vocabulary = listOf(
                        Word("unprecedented", "بی‌سابقه", "ʌnˈpresɪdentɪd"),
                        Word("shallow", "سطحی", "ˈʃæloʊ"),
                        Word("transient", "گذرا", "ˈtrænʃənt"),
                        Word("substitute", "جایگزین کردن", "ˈsʌbstɪtuːt"),
                        Word("simulation", "شبیه‌سازی", "ˌsɪmjuˈleɪʃn")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Cure Is Within Reach", titlePersian = "درمان در دسترس است",
                    text = "The good news is that loneliness has a cure. And it is simpler than most people think. It is not more social media. It is not more virtual meetings. It is authentic human connection. A study by Harvard University — the longest study on human happiness ever conducted — followed men for over eighty years. Its conclusion was stunning. The single greatest predictor of happiness and health was not wealth, not fame, not intelligence. It was the quality of relationships. People with strong relationships were happier, healthier, and lived longer. People who were isolated were more likely to be unhappy, unhealthy, and die young. The cure for loneliness is small actions repeated consistently. It is calling a friend instead of texting. It is visiting a family member instead of following them on Instagram. It is joining a book club, a sports team, a volunteer group. It is eating dinner with someone instead of watching TV alone. It is saying hello to your neighbor. It is asking a coworker how they really are — and waiting to hear the answer. Loneliness is a silent epidemic, but silence can be broken. One authentic conversation at a time. One genuine connection. One human being reaching out to another. Because in the end, the greatest gift we can give each other is presence. Not presence on a screen. Presence in the room. Presence in the heart. And that is something every single one of us can do — starting today.",
                    textPersian = "خبر خوب این است که تنهایی درمان دارد. و از آنچه بیشتر مردم فکر می‌کنند ساده‌تر است. شبکه اجتماعی بیشتر نیست. جلسه‌های مجازی بیشتر نیست. ارتباط انسانی اصیل است. مطالعه‌ای در دانشگاه هاروارد — طولانی‌ترین مطالعه درباره شادی انسان که تا حالا انجام شده — مردان را بیش از هشتاد سال دنبال کرد. نتیجه‌اش حیرت‌انگیز بود. تنها قوی‌ترین پیش‌بینی‌کننده شادی و سلامتی ثروت نبود، شهرت نبود، هوش نبود. کیفیت روابط بود. افرادی با روابط قوی‌تر شادتر، سالم‌تر و عمر طولانی‌تر داشتند. افرادی که منزوی بودند بیشتر احتمال داشت ناراضی، ناسالم و با مرگ زودرس مواجه شوند. درمان تنهایی اعمال کوچک تکرارشده است. زنگ زدن به دوستی به جای پیام دادن. دیدار یک عضو خانواده به جای دنبال کردنش در اینستاگرام. پیوستن به باشگاه کتاب، تیم ورزشی، گروه داوطلب. شام خوردن با کسی به جای تماشای تنهای تلویزیون. سلام کردن به همسایه. پرسیدن حال واقعی همکاری — و منتظر ماندن برای شنیدن پاسخ. تنهایی همه‌گیری خاموشی است، اما سکوت را می‌توان شکست. یک گفتگوی اصیل در یک زمان. یک ارتباط واقعی. یک انسان که به سوی دیگری دست دراز می‌کند. چون در نهایت، بزرگ‌ترین هدیه‌ای که می‌توانیم به هم بدهیم حضور است. نه حضور روی صفحه. حضور در اتاق. حضور در قلب. و این چیزی است که هر کدام از ما می‌تواند انجام دهد — از همین امروز شروع کن.",
                    vocabulary = listOf(
                        Word("authentic", "اصیل", "ɔːˈθentɪk"),
                        Word("predictor", "پیش‌بینی‌کننده", "prɪˈdɪktər"),
                        Word("consistently", "به‌طور مداوم", "kənˈsɪstəntli"),
                        Word("epidemic", "همه‌گیری", "ˌepɪˈdemɪk"),
                        Word("genuine", "واقعی", "ˈdʒenjuɪn")
                    )
                )
            )
        ),

        Story(
            id = "s_a10", title = "The Weight of Words", titlePersian = "وزن کلمات",
            level = Level.ADVANCED,
            text = "Words have power to build and destroy — use them wisely.",
            moral = "Words carry immense power.", moralPersian = "کلمات قدرت عظیمی دارند.",
            coverUrl = "https://images.unsplash.com/photo-1455390582262-044cdead277a?w=400",
            chapters = listOf(
                StoryChapter(
                    number = 1, title = "The Writer's Confession", titlePersian = "اعتراف نویسنده",
                    text = "In his final interview before his death, a famous writer named Ahmad made a confession that shocked the world. \"I have written millions of words in my life,\" he said. \"Millions. But there is one sentence I wrote fifty years ago that I cannot forget. I was young. I was angry. I told my brother that he would never amount to anything. I said it casually. I said it in a moment of irritation. I forgot it by the next day. But he did not. My brother, who was kind and smart and full of potential, believed me. He dropped out of school. He stopped trying. He spent his life believing he would never amount to anything. He died alone and poor. And I know — I know — that my words killed his soul long before his body died.\" The interviewer was silent. Ahmad continued. \"I have won awards. I have been praised by presidents. But none of it matters. Because I broke my brother with a single sentence. And no words I have written since can undo what that sentence did.\"",
                    textPersian = "در آخرین مصاحبه قبل از مرگش، نویسنده‌ی مشهوری به نام احمد اعترافی کرد که دنیا را شوکه کرد. «میلیون‌ها کلمه در عمرم نوشته‌ام،» گفت. «میلیون‌ها. اما یک جمله هست که پنجاه سال پیش نوشتم و نمی‌توانم فراموش کنم. جوان بودم. عصبانی بودم. به برادرم گفتم که هرگز به جایی نمی‌رسد. عادی گفتم. در لحظه‌ای از دلخوری. فردا فراموشش کردم. اما او نکرد. برادرم که مهربان و باهوش و پر از استعداد بود، به من باور کرد. ترک تحصیل کرد. از تلاش دست کشید. عمرش را با باور اینکه هرگز به جایی نمی‌رسد گذراند. تنها و فقیر مرد. و می‌دانم — می‌دانم — که کلماتم روحش را مدتها قبل از بدنش کشتند.» مصاحبه‌گر ساکت شد. احمد ادامه داد: «جایزه برده‌ام. رؤسای جمهور تحسینم کرده‌اند. اما هیچ‌کدام مهم نیست. چون برادرم را با یک جمله شکستم. و هیچ کلمه‌ای که از آن به بعد نوشته‌ام نمی‌تواند کاری که آن جمله کرد را خنثی کند.»",
                    vocabulary = listOf(
                        Word("confession", "اعتراف", "kənˈfeʃn"),
                        Word("casually", "عادی", "ˈkæʒuəli"),
                        Word("irritation", "دلخوری", "ˌɪrɪˈteɪʃn"),
                        Word("potential", "استعداد", "pəˈtenʃl"),
                        Word("undo", "خنثی کردن", "ʌnˈduː")
                    )
                ),
                StoryChapter(
                    number = 2, title = "The Science of Words", titlePersian = "علم کلمات",
                    text = "Modern science has confirmed what Ahmad understood too late. Words are not just sounds. They physically alter the brain. When we hear positive words, our brains release oxytocin — the bonding hormone. When we hear negative words, our brains release cortisol — the stress hormone. A single criticism can raise cortisol levels for hours. Constant criticism can literally change the structure of the brain, shrinking the areas responsible for memory and emotional regulation. But the impact goes deeper. Words shape reality. When a child is repeatedly told she is stupid, she begins to believe it. Her brain, over time, adjusts to match the label. Her performance drops. She avoids challenges. She fails — not because she is stupid, but because she was told she was. Conversely, when a child is told she is capable, her brain responds differently. She takes more risks. She works harder. She succeeds — not because she was born capable, but because she was told she was. This is called the \"self-fulfilling prophecy.\" We become what others tell us we are. And we make others become what we tell them they are.",
                    textPersian = "علم مدرن چیزی را که احمد خیلی دیر فهمید تأیید کرده است. کلمات فقط صدا نیستند. مغز را فیزیکی تغییر می‌دهند. وقتی کلمات مثبت می‌شنویم، مغزمان اکسی‌توسین آزاد می‌کند — هورمون پیوند. وقتی کلمات منفی می‌شنویم، مغزمان کورتیزول آزاد می‌کند — هورمون استرس. یک انتقاد می‌تواند سطح کورتیزول را ساعت‌ها بالا نگه دارد. انتقاد دائمی می‌تواند به معنای واقعی کلمه ساختار مغز را تغییر دهد و مناطقی که مسئول حافظه و تنظیم احساسات هستند را کوچک کند. اما تأثیر عمیق‌تر است. کلمات واقعیت را شکل می‌دهند. وقتی به کودک بارها گفته می‌شود که احمق است، شروع به باور می‌کند. مغزش در طول زمان با برچسب هم‌ساز می‌شود. عملکردش پایین می‌آید. از چالش‌ها اجتناب می‌کند. شکست می‌خورد — نه چون احمق است، بلکه چون به او گفته شد که هست. برعکس، وقتی به کودک گفته می‌شود که توانمند است، مغزش متفاوت پاسخ می‌دهد. ریسک بیشتری می‌کند. سخت‌تر کار می‌کند. موفق می‌شود — نه چون توانمند به دنیا آمده بود، بلکه چون به او گفته شد که هست. این «پیشگویی خودشکوفا» نامیده می‌شود. ما همان می‌شویم که دیگران به ما می‌گویند هستیم. و دیگران را همان می‌کنیم که به آن‌ها می‌گوییم هستند.",
                    vocabulary = listOf(
                        Word("oxytocin", "اکسی‌توسین", "ˌɑːksɪˈtoʊsɪn"),
                        Word("cortisol", "کورتیزول", "ˈkɔːrtɪsɔːl"),
                        Word("criticism", "انتقاد", "ˈkrɪtɪsɪzəm"),
                        Word("regulation", "تنظیم", "ˌreɡjuˈleɪʃn"),
                        Word("prophecy", "پیشگویی", "ˈprɑːfəsi")
                    )
                ),
                StoryChapter(
                    number = 3, title = "The Responsibility of Speech", titlePersian = "مسئولیت گفتار",
                    text = "If words are this powerful, then speaking is not a casual activity. It is a moral act. Every word we say enters someone's mind and leaves a mark. Sometimes a temporary mark. Sometimes a permanent one. The ancient teachers understood this. In many traditions, silence was considered a virtue — not because words are useless, but because they are so powerful. Better to say nothing than to say something harmful. Better to think carefully before speaking. Better to ask: is this true? Is this necessary? Is this kind? Modern psychology agrees. Studies show that couples who criticize each other constantly are far more likely to divorce than those who express appreciation regularly. Workplaces with positive communication have happier, more productive employees. Children whose parents speak to them with respect grow up with higher self-esteem. The lesson is simple but profound: We are all writers. Every day, we write on the souls of those around us. We do not use pen and paper. We use our words. And what we write cannot always be erased. So write carefully. Write with love. Write with intention. Because the story you are writing in someone else's heart may be the story they carry for the rest of their life. Ahmad, in his final years, became an advocate for mindful speech. He spoke at schools and universities. He wrote one last book — a small one — called \"The Words We Regret.\" In it, he told his brother's story. Not to excuse himself. But to warn others. \"I was a great writer,\" he said in his last interview. \"But I was not a wise man. Wisdom is not about having the right words. It is about knowing when not to use them.\"",
                    textPersian = "اگر کلمات اینقدر قدرتمند هستند، پس حرف زدن فعالیتی معمولی نیست. یک عمل اخلاقی است. هر کلمه‌ای که می‌گوییم وارد ذهن کسی می‌شود و ردی باقی می‌گذارد. گاهی ردی موقت. گاهی ردی دائمی. معلمان باستانی این را می‌فهمیدند. در بسیاری سنت‌ها، سکوت فضیلت شمرده می‌شد — نه چون کلمات بی‌فایده‌اند، بلکه چون بسیار قدرتمندند. بهتر است چیزی نگوییم تا چیز زیانباری بگوییم. بهتر است قبل از حرف زدن با دقت فکر کنیم. بهتر است بپرسیم: آیا این درست است؟ آیا لازم است؟ آیا مهربانانه است؟ روانشناسی مدرن موافق است. مطالعات نشان می‌دهد زوج‌هایی که مدام از هم انتقاد می‌کنند خیلی بیشتر احتمال طلاق دارند از کسانی که مرتب قدردانی نشان می‌دهند. محیط‌های کاری با ارتباط مثبت، کارمندان شادتر و پربازده‌تر دارند. کودکانی که والدینشان با احترام صحبت می‌کنند، با عزت نفس بالاتری بزرگ می‌شوند. درس ساده اما عمیق است: همه ما نویسنده‌ایم. هر روز روی روح اطرافیان می‌نویسیم. از قلم و کاغذ استفاده نمی‌کنیم. از کلماتمان استفاده می‌کنیم. و آنچه می‌نویسیم همیشه قابل پاک کردن نیست. پس با دقت بنویس. با عشق بنویس. با نیت بنویس. چون داستانی که در قلب دیگری می‌نویسی ممکن است داستانی باشد که تا آخر عمر حمل می‌کند. احمد در سال‌های آخر، مدافع گفتار ذهن‌آگاهانه شد. در مدارس و دانشگاه‌ها صحبت کرد. یک کتاب آخر نوشت — کوچک — به نام «کلماتی که پشیمانیم.» در آن، داستان برادرش را گفت. نه برای توجیه خودش. بلکه برای هشدار دادن به دیگران. «نویسنده‌ی بزرگی بودم،» در آخرین مصاحبه‌اش گفت. «اما مرد دانایی نبودم. حکمت داشتن کلمات درست نیست. دانستن اینکه چه زمانی از آن‌ها استفاده نکنیم است.»",
                    vocabulary = listOf(
                        Word("virtue", "فضیلت", "ˈvɜːrtʃuː"),
                        Word("profound", "عمیق", "prəˈfaʊnd"),
                        Word("self-esteem", "عزت نفس", ""),
                        Word("advocate", "مدافع", "ˈædvəkeɪt"),
                        Word("intention", "نیت", "ɪnˈtenʃn")
                    )
                )
            )
        )
    )
}