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
                StoryChapter(1, "The First Failure", "اولین شکست",
                    "In a small laboratory in Menlo Park, a young inventor named Thomas Edison sat staring at a burned-out filament. It was his two hundredth attempt at creating an electric light bulb — and like the one hundred ninety-nine before it, it had failed. His assistant looked at the smoking glass with despair. \"Mr. Edison, we have failed again. Two hundred times. Perhaps this is impossible.\" Edison did not look up. He was already writing notes, recording exactly what had happened. After a long moment, he spoke: \"I have not failed two hundred times. I have successfully discovered two hundred ways that do not work. Now we are closer to the way that does.\"",
                    "در آزمایشگاه کوچکی در منه‌لو پارک، مخترع جوانی به نام توماس ادیسون نشسته بود و به یک فیلامان سوخته خیره شده بود. این دویستمین تلاشش برای ساختن لامپ برقی بود — و مثل صد و نود و نه تای قبل، شکست خورده بود. دستیارش با ناامیدی به شیشه دودی نگاه کرد. «آقای ادیسون، باز هم شکست خوردیم. دویست بار. شاید این غیرممکن است.» ادیسون سر بلند نکرد. داشت یادداشت می‌نوشت. بعد از لحظه‌ای طولانی گفت: «من دویست بار شکست نخورده‌ام. من با موفقیت دویست راه را کشف کرده‌ام که کار نمی‌کنند. حالا به راهی که کار می‌کند نزدیک‌تریم.»",
                    listOf(Word("persistence", "پشتکار", "pərˈsɪstəns"), Word("filament", "فیلامان", "ˈfɪləmənt"))
                ),
                StoryChapter(2, "The Years of Trial", "سال‌های آزمون",
                    "Edison and his team worked for years. They tested thousands of materials. Every day brought new failures. Investors threatened to withdraw their money. Newspapers mocked him. His competitors laughed. But Edison did not stop. He believed that somewhere in the vast world of materials, there was something that would work. He wrote in his journal: \"Many of life's failures are people who did not realize how close they were to success when they gave up.\"",
                    "ادیسون و تیمش سال‌ها کار کردند. هزاران ماده را آزمایش کردند. هر روز شکست‌های جدید می‌آورد. سرمایه‌گذاران تهدید می‌کردند پولشان را بردارند. روزنامه‌ها مسخره‌اش می‌کردند. اما ادیسون متوقف نشد. باور داشت جایی در دنیای وسیع مواد، چیزی هست که کار می‌کند. در دفترش نوشت: «بسیاری از شکست‌های زندگی مربوط به کسانی است که نمی‌دانستند چقدر به موفقیت نزدیک بودند وقتی تسلیم شدند.»",
                    listOf(Word("investor", "سرمایه‌گذار", "ɪnˈvestər"), Word("mock", "مسخره کردن", "mɑːk"))
                ),
                StoryChapter(3, "The Light That Changed the World", "نوری که جهان را تغییر داد",
                    "On October 21, 1879, Edison and his team finally succeeded. A carbonized cotton thread glowed brightly inside a glass bulb — and it stayed glowing for thirteen and a half hours. Edison stared at it, then began to laugh. His assistants joined in. Some of them cried. They had done it. When asked about his thousands of failures, Edison said: \"I have not failed. I've just found 10,000 ways that won't work.\" His persistence changed the world.",
                    "در ۲۱ اکتبر ۱۸۷۹، ادیسون و تیمش بالاخره موفق شدند. نخی از پنبه زغالی شده درون لامپ شیشه‌ای به‌روشنی می‌درخشید — و سیزده ساعت و نیم در حال درخشیدن ماند. ادیسون نگاهش کرد، بعد شروع به خندیدن کرد. دستیارانش هم خندیدند. بعضی گریه کردند. موفق شده بودند. وقتی از هزاران شکستش پرسیدند، ادیسون گفت: «شکست نخورده‌ام. فقط ۱۰٬۰۰۰ راه پیدا کردم که کار نمی‌کنند.» پشتکارش جهان را تغییر داد.",
                    listOf(Word("carbonized", "زغالی شده", "ˈkɑːrbənaɪzd"), Word("glow", "درخشیدن", "ɡloʊ"))
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
                StoryChapter(1, "The Silent Sage", "دانای خاموش",
                    "In a bustling city in ancient Persia, there lived a man named Hakim Samad. He was not rich. He was not powerful. But whenever there was conflict, the people came to him. What was his secret? He was a great listener. When someone spoke to him, he gave them his complete attention. He did not interrupt. He did not judge. He simply listened — with his eyes, his ears, and his heart.",
                    "در شهری پرجنب‌وجوش در ایران باستان، مردی به نام حکیم صمد زندگی می‌کرد. ثروتمند نبود. قدرتمند نبود. اما هر وقت در شهر اختلافی بود، مردم به او مراجعه می‌کردند. رازش چه بود؟ او شنونده‌ی بزرگی بود. وقتی کسی با او حرف می‌زد، توجه کاملش را می‌داد. حرف نمی‌زد. قضاوت نمی‌کرد. فقط گوش می‌داد — با چشمانش، گوش‌هایش و قلبش.",
                    listOf(Word("sage", "دانا", "seɪdʒ"), Word("bustling", "پرجنب‌وجوش", "ˈbʌslɪŋ"))
                ),
                StoryChapter(2, "The King's Dilemma", "معضل پادشاه",
                    "One day, the king himself came to Hakim Samad. Two of his most trusted advisors had fallen into a bitter dispute. Each accused the other of betrayal. Hakim Samad listened quietly. When the king finished, Hakim said only, \"Bring both men to me. Let them speak — one at a time — in my presence.\" The next day, the two advisors came. He sat them down on opposite sides of his small room. And he listened.",
                    "یک روز، خود پادشاه به دیدن حکیم صمد آمد. دو نفر از معتمدترین مشاورانش درگیر اختلافی تلخ شده بودند. هر یک دیگری را به خیانت متهم می‌کرد. حکیم صمد آرام گوش داد. وقتی پادشاه تمام کرد، حکیم فقط گفت: «هر دو را نزد من بیاور. بگذار حرف بزنند — یکی‌یکی — در حضور من.» روز بعد، دو مشاور آمدند. آن‌ها را در دو طرف اتاق کوچکش نشاند. و گوش داد.",
                    listOf(Word("trusted", "معتمد", "ˈtrʌstɪd"), Word("betrayal", "خیانت", "bɪˈtreɪəl"))
                ),
                StoryChapter(3, "The Truth Emerges", "حقیقت آشکار می‌شود",
                    "The first advisor spoke for three hours. Then the second advisor spoke. Hakim Samad sat in silence for a long time. Then he spoke. \"One of you is lying. I noticed something. When you spoke of your loyalty, your eyes looked at me. But when you spoke of the accusation, your eyes looked away. That is the sign of a man repeating a lie. A truly innocent man would be angry. You are not angry. You are careful.\" The second advisor's face turned pale. He had been exposed — not by evidence, but by his own lack of feeling.",
                    "مشاور اول سه ساعت حرف زد. بعد مشاور دوم حرف زد. حکیم صمد مدت طولانی در سکوت نشست. بعد حرف زد. «یکی از شما دروغ می‌گوید. چیزی متوجه شدم. وقتی از وفاداری‌ات گفتی، چشمانت به من نگاه کرد. اما وقتی از اتهام گفتی، چشمانت کنار رفت. این نشانه مردی است که دروغ تمرین‌شده را تکرار می‌کند. مرد واقعاً بی‌گناه عصبانی می‌شد. تو عصبانی نیستی. تو مراقبی.» صورت مشاور دوم رنگ‌پریده شد. افشا شده بود — نه با مدرک، بلکه با نبود احساسش.",
                    listOf(Word("passion", "شور", "ˈpæʃn"), Word("expose", "افشا کردن", "ɪkˈspoʊz"))
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
                StoryChapter(1, "The Endless Search", "جستجوی بی‌پایان",
                    "Arman was a young man with a restless soul. He traveled the world searching for happiness. He climbed the highest mountains. He sailed across oceans. He studied with gurus and mystics. Years passed. His hair turned gray. But happiness still eluded him. It was always just out of reach, like a butterfly that could not be caught.",
                    "آرمان جوانی با روحی بی‌قرار بود. دنیا را گشت دنبال شادی. از بالاترین کوه‌ها بالا رفت. از اقیانوس‌ها گذشت. با گوروها و عارفان درس خواند. سال‌ها گذشت. موهایش خاکستری شد. اما شادی هنوز از او فرار می‌کرد. همیشه کمی دور از دسترس بود، مثل پروانه‌ای که نمی‌توان گرفت.",
                    listOf(Word("restless", "بی‌قرار", "ˈrestləs"), Word("elude", "فرار کردن", "ɪˈluːd"))
                ),
                StoryChapter(2, "The Return", "بازگشت",
                    "After twenty years, Arman gave up. He decided to return home. When he finally arrived at his village, he stopped at the top of a hill. Below, he saw his childhood home. His mother was in the garden. His father was on the porch. The sun was setting. Suddenly, his heart began to glow. A warmth spread through his body. He had been searching the world for happiness. And happiness had been waiting here. In this simple moment.",
                    "بعد از بیست سال، آرمان تسلیم شد. تصمیم گرفت به خانه برگردد. وقتی بالاخره به دهکده‌اش رسید، بالای تپه‌ای ایستاد. زیر، خانه‌ی کودکی‌اش را دید. مادرش در باغ بود. پدرش روی ایوان نشسته بود. ناگهان، قلبش شروع به درخشیدن کرد. گرمایی در بدنش پخش شد. تمام دنیا را دنبال شادی گشته بود. و شادی اینجا منتظرش بود. در این لحظه ساده.",
                    listOf(Word("disillusioned", "دلسرد", "ˌdɪsɪˈluːʒnd"), Word("humble", "فروتن", "ˈhʌmbl"))
                ),
                StoryChapter(3, "The Truth He Had Missed", "حقیقتی که از دست داده بود",
                    "Arman ran down the hill. He embraced his mother. He shook his father's hand. His father said: \"Happiness is not something you find. It is something you notice. You spent your life looking in the distance. You never stopped to look at what was already in front of you. Happiness lives in the heart that is present. It lives in the person who is grateful.\" Arman listened with tears in his eyes. He had walked ten thousand miles to find a truth that had been sitting on his own doorstep.",
                    "آرمان از تپه پایین دوید. مادرش را در آغوش گرفت. دست پدرش را فشرد. پدرش گفت: «شادی چیزی نیست که پیدا کنی. چیزی است که متوجه شوی. عمرت را به دور نگاه کردن گذراندی. هرگز توقف نکردی که به آنچه قبلاً مقابلت بود نگاه کنی. شادی در قلبی زندگی می‌کند که حضور دارد. در شخصی که سپاسگزار است.» آرمان با چشمان پر از اشک گوش داد. ده هزار مایل راه رفته بود تا حقیقتی را پیدا کند که دم در خانه‌اش نشسته بود.",
                    listOf(Word("embrace", "در آغوش گرفتن", "ɪmˈbreɪs"), Word("grateful", "سپاسگزار", "ˈɡreɪtfl"))
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
                StoryChapter(1, "The Emperor's Glory", "شکوه امپراتور",
                    "The Emperor Cyrus was the most powerful ruler in the known world. His empire stretched from eastern mountains to western seas. Kings bowed before him. Nations feared him. And Cyrus believed he was invincible. His counselors warned him. \"Majesty, pride comes before the fall. Even the strongest empire can crumble.\" But Cyrus laughed. \"There is no force on earth that can challenge me.\" He believed his own legend. And that was the beginning of his end.",
                    "امپراتور کوروش قدرتمندترین فرمانروای دنیا بود. پادشاهان مقابلش سر خم می‌کردند. ملت‌ها از او می‌ترسیدند. و کوروش باور داشت شکست‌ناپذیر است. مشاورانش هشدار دادند. «اعلیحضرت، غرور پیش از سقوط است. حتی قوی‌ترین امپراتوری هم می‌تواند فروبپاشد.» اما کوروش خندید. «هیچ نیرویی روی زمین نیست که مرا به چالش بکشد.» به افسانه‌ی خودش باور داشت. و آن آغاز پایانش بود.",
                    listOf(Word("invincible", "شکست‌ناپذیر", "ɪnˈvɪnsəbl"), Word("crumble", "فروپاشیدن", "ˈkrʌmbl"))
                ),
                StoryChapter(2, "The Silent Rebellion", "شورش خاموش",
                    "While Cyrus celebrated his victories, his conquered peoples grew restless. They had been treated harshly. In every province, small groups began to meet in secret. Cyrus did not see any of this. He was too busy expanding his empire. His counselors tried again to warn him. Cyrus grew angry. \"I am the emperor! They will not rise!\" His pride had made him blind. And in his blindness, he did not see that the entire empire was a powder keg, waiting to explode.",
                    "وقتی کوروش پیروزی‌هایش را جشن می‌گرفت، ملت‌های فتح‌شده‌اش بی‌قرار می‌شدند. در هر استان، گروه‌های کوچک در خفا جلسه داشتند. کوروش هیچ‌کدام را ندید. مشاورانش دوباره تلاش کردند هشدار دهند. کوروش خشمگین شد. «من امپراتورم! قیام نمی‌کنند!» غرورش او را کور کرده بود. و در کوری‌اش ندید که تمام امپراتوری بشکه باروتی است که منتظر انفجار است.",
                    listOf(Word("rebellion", "شورش", "rɪˈbeljən"), Word("powder keg", "بشکه باروت", ""))
                ),
                StoryChapter(3, "The Fall of the Proud", "سقوط مغرور",
                    "The rebellion spread to half the empire. Cyrus found himself surrounded. Three of his own generals betrayed him. He was captured and exiled. On the island of his exile, he wrote his memoir. In it, he wrote one sentence: \"The enemy that destroyed me was not the armies outside my walls. It was the pride inside my heart.\"",
                    "شورش به نیمی از امپراتوری پخش شد. کوروش خود را محاصره‌شده یافت. سه تن از ژنرال‌های خودش به او خیانت کردند. اسیر و تبعید شد. روی جزیره‌ی تبعیدش، خاطراتش را نوشت. در آن، یک جمله نوشت: «دشمنی که مرا نابود کرد ارتش‌های بیرون دیوارهایم نبود. غرور درون قلبم بود.»",
                    listOf(Word("betray", "خیانت کردن", "bɪˈtreɪ"), Word("exile", "تبعید کردن", "ˈeksaɪl"))
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
                StoryChapter(1, "The Experiment", "آزمایش",
                    "In 2003, a psychologist named Dr. Robert Emmons conducted a groundbreaking study. He divided hundreds of participants into three groups. The first group wrote down five things they were grateful for. The second group wrote down hassles. The third wrote neutral events. At the end, the gratitude group reported feeling twenty-five percent happier. They exercised more. They slept better. They felt more optimistic. But the most surprising finding was yet to come. They also reported stronger relationships.",
                    "در سال ۲۰۰۳، روانشناسی به نام دکتر رابرت اِمونز مطالعه‌ی پیشگامانه‌ای انجام داد. صدها شرکت‌کننده را به سه گروه تقسیم کرد. گروه اول پنج چیز که برایشان سپاسگزارند را می‌نوشتند. گروه دوم مشکلات. گروه سوم رویدادهای بی‌طرف. در پایان، گروه سپاسگزاری بیست و پنج درصد شادتر حس کردند. بیشتر ورزش می‌کردند. بهتر می‌خوابیدند. خوش‌بین‌تر بودند. اما شگفت‌انگیزترین یافته هنوز در راه بود. روابط قوی‌تری هم گزارش کردند.",
                    listOf(Word("groundbreaking", "پیشگامانه", "ˈɡraʊndbreɪkɪŋ"), Word("participant", "شرکت‌کننده", "pɑːrˈtɪsɪpənt"))
                ),
                StoryChapter(2, "The Neuroscience of Thankfulness", "علوم اعصاب سپاسگزاری",
                    "Later research using brain imaging revealed why gratitude is so powerful. When people practice gratitude, the brain releases dopamine and serotonin. But more importantly, gratitude activates the prefrontal cortex — the part responsible for decision-making, empathy, and social connection. Over time, gratitude literally rewires the brain. One study found that gratitude practices reduced symptoms of depression as effectively as medication — without side effects.",
                    "پژوهش‌های بعدی با تصویربرداری مغزی نشان داد چرا سپاسگزاری اینقدر قدرتمند است. وقتی مردم سپاسگزاری می‌کنند، مغز دوپامین و سروتونین آزاد می‌کند. اما مهم‌تر، سپاسگزاری قشر پیش‌پیشانی را فعال می‌کند — بخشی مسئول تصمیم‌گیری، همدلی و ارتباط اجتماعی. در طول زمان، سپاسگزاری به معنای واقعی کلمه مغز را بازسیم‌کشی می‌کند. یک مطالعه نشان داد تمرین‌های سپاسگزاری علائم افسردگی را به همان اندازه دارو کاهش می‌دهد — بدون عوارض جانبی.",
                    listOf(Word("dopamine", "دوپامین", "ˈdoʊpəmiːn"), Word("rewire", "بازسیم‌کشی کردن", "riːˈwaɪər"))
                ),
                StoryChapter(3, "A Simple Practice, A Transformed Life", "تمرینی ساده، زندگی دگرگون",
                    "Consider Maryam, a young woman who suffered from chronic depression. She tried therapy. She tried medication. Nothing worked completely. Then she started gratitude journaling. At first, it was hard. But she forced herself. Within six months, her depression had lifted. She wrote: \"Gratitude didn't change my circumstances. It changed my eyes. When my eyes changed, everything looked different.\" That is the gift of gratitude. It is free. It is simple. And it can transform your life.",
                    "مریم را در نظر بگیر، زن جوانی که سال‌ها از افسردگی مزمن رنج می‌برد. درمان امتحان کرد. دارو امتحان کرد. هیچ‌کدام کاملاً کار نکرد. بعد دفتر سپاسگزاری را شروع کرد. اولش سخت بود. اما خودش را مجبور کرد. در شش ماه، افسردگی‌اش کم شد. نوشت: «سپاسگزاری شرایطم را تغییر نداد. چشمانم را تغییر داد. وقتی چشمانم تغییر کرد، همه چیز متفاوت شد.» این هدیه سپاسگزاری است. رایگان است. ساده است. و می‌تواند زندگی‌ات را دگرگون کند.",
                    listOf(Word("chronic", "مزمن", "ˈkrɑːnɪk"), Word("transform", "دگرگون کردن", "trænsˈfɔːrm"))
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
                StoryChapter(1, "The Supermarket Experiment", "آزمایش سوپرمارکت",
                    "In 2000, two psychologists set up a tasting booth in a supermarket. On some days, they displayed six varieties of jam. On others, twenty-four. When there were twenty-four jams, sixty percent of shoppers stopped. When there were six, only forty percent. But of those who saw twenty-four, only three percent bought. Of those who saw six, thirty percent bought. Fewer choices led to ten times more purchases. This study launched a field of research on \"the paradox of choice.\"",
                    "در سال ۲۰۰۰، دو روانشناس غرفه چشایی در یک سوپرمارکت راه‌اندازی کردند. بعضی روزها شش نوع مربا نمایش می‌دادند. بعضی روزها بیست و چهار نوع. وقتی بیست و چهار مربا بود، شصت درصد خریداران توقف می‌کردند. وقتی شش تا بود، فقط چهل درصد. اما از خریدارانی که بیست و چهار تا دیدند، فقط سه درصد خریدند. از آن‌هایی که شش تا دیدند، سی درصد خریدند. انتخاب کمتر به ده برابر خرید بیشتر منجر شد. این مطالعه زمینه‌ی تحقیقاتی «پارادوکس انتخاب» را راه‌اندازی کرد.",
                    listOf(Word("tasting", "چشایی", "ˈteɪstɪŋ"), Word("paradox", "پارادوکس", "ˈpærədɑːks"))
                ),
                StoryChapter(2, "The Cost of Freedom", "بهای آزادی",
                    "Modern society celebrates choice. We are told freedom means having options. But abundance of choice can lead to anxiety, paralysis, and regret. When we have too many options, we worry about making the wrong choice. Studies found that people who maximize — who always try to make the absolute best choice — are less happy than people who satisfice — who choose what is good enough. Maximizers have more freedom, but less joy.",
                    "جامعه مدرن انتخاب را جشن می‌گیرد. به ما گفته می‌شود آزادی یعنی داشتن گزینه. اما فراوانی انتخاب می‌تواند به اضطراب، فلج و پشیمانی منجر شود. وقتی گزینه‌های زیادی داریم، نگران انتخاب اشتباه می‌شویم. مطالعات نشان داد افرادی که حداکثرساز هستند — که همیشه تلاش می‌کنند بهترین انتخاب را بکنند — کمتر از افرادی شادند که قانع‌کننده هستند. حداکثرسازها آزادی بیشتری دارند، اما شادی کمتری.",
                    listOf(Word("abundance", "فراوانی", "əˈbʌndəns"), Word("maximize", "حداکثر ساختن", "ˈmæksɪmaɪz"))
                ),
                StoryChapter(3, "The Secret of Contentment", "راز رضایت",
                    "So what is the solution? Not fewer options — but a different relationship with choice. Happiness does not come from having the best option. It comes from being content with the option you have. An old farmer once said: \"I have enough. I have my animals. I have my land. I do not need more. The secret of happiness is not having more. It is needing less.\"",
                    "پس راه‌حل چیست؟ گزینه کمتر نیست — رابطه‌ی متفاوت با انتخاب است. شادی از داشتن بهترین گزینه نمی‌آید. از راضی بودن با گزینه‌ای که داری می‌آید. کشاورز پیری یک بار گفت: «به اندازه کافی دارم. حیواناتم را دارم. زمینم را دارم. بیشتر نمی‌خواهم. راز شادی داشتن بیشتر نیست. کمتر نیاز داشتن است.»",
                    listOf(Word("contentment", "رضایت", "kənˈtentmənt"), Word("possess", "داشتن", "pəˈzes"))
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
                StoryChapter(1, "The Master of His Life", "ارباب زندگی خود",
                    "Reza planned everything. Every minute was scheduled. He believed he was in complete control. His business grew. His wealth multiplied. But there was one thing he could not control — the accident that took his wife. The illness that struck his son. The betrayal of his partner. One by one, the pillars of his life crumbled. And Reza found himself controlling nothing.",
                    "رضا همه چیز را برنامه‌ریزی می‌کرد. هر دقیقه زمان‌بندی شده بود. باور داشت کنترل کامل دارد. کسب‌وکارش رشد کرد. ثروتش چند برابر شد. اما یک چیز بود که نمی‌توانست کنترل کند — تصادفی که همسرش را گرفت. بیماری‌ای که پسرش را گرفت. خیانت شریکش. یکی‌یکی، ستون‌های زندگی‌اش فرو ریختند. و رضا خود را در حال کنترل هیچ چیز یافت.",
                    listOf(Word("pillar", "ستون", "ˈpɪlər"), Word("crumble", "فرو ریختن", "ˈkrʌmbl"))
                ),
                StoryChapter(2, "The Breaking Point", "نقطه شکست",
                    "After his wife's death and his son's illness, Reza retreated from the world. He began to drink. His friends worried. One night, as he sat on the floor surrounded by empty bottles, something broke inside him. He started to cry. A flood. When the tears finally stopped, he felt empty. Not the empty of loss. The empty of a cup washed clean. And in that emptiness, something new began to grow.",
                    "بعد از مرگ همسرش و بیماری پسرش، رضا از دنیا کناره گرفت. شروع به نوشیدن کرد. دوستانش نگران شدند. یک شب، وقتی روی زمین احاطه‌شده با بطری‌های خالی نشسته بود، چیزی درونش شکست. شروع به گریه کرد. سیلابی. وقتی اشک‌ها بالاخره تمام شد، خالی حس کرد. نه خالی از دست دادن. خالی از فنجانی که شسته شده. و در آن خالی بودن، چیز جدیدی شروع به رشد کرد.",
                    listOf(Word("retreat", "کناره گرفتن", "rɪˈtriːt"), Word("emptiness", "خالی بودن", "ˈemptinəs"))
                ),
                StoryChapter(3, "Mastering the Only Thing You Can", "تسلط بر تنها چیزی که می‌توانی",
                    "Reza began to learn. He studied Stoic philosophy. He understood: the only thing anyone can control is their own response to the world. Wisdom comes from knowing the difference. Peace comes from focusing only on what we can control. At the end of his life, he wrote: \"I spent forty years trying to control the world. I failed. I spent the last twenty years learning to control myself. I succeeded.\"",
                    "رضا شروع به یادگیری کرد. فلسفه رواقی را مطالعه کرد. فهمید: تنها چیزی که هر کس می‌تواند کنترل کند، پاسخ خودش به دنیاست. حکمت از دانستن تفاوت می‌آید. آرامش از تمرکز فقط بر آنچه می‌توانیم کنترل کنیم. در پایان عمرش نوشت: «چهل سال صرف تلاش برای کنترل دنیا کردم. شکست خوردم. بیست سال آخر صرف یادگیری کنترل خودم کردم. موفق شدم.»",
                    listOf(Word("philosophy", "فلسفه", "fəˈlɑːsəfi"), Word("throne", "تخت پادشاهی", "θroʊn"))
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
                StoryChapter(1, "The Two Players", "دو بازیکن",
                    "Viktor was a chess prodigy. He played with aggression and brilliance. His games were quick and devastating. Hassan was different. He played slowly. Deliberately. He had one guiding principle: \"Play the position, not the opponent.\" Focus on what the board tells you, not on what your opponent might do.",
                    "ویکتور نابغه‌ی شطرنج بود. با تهاجم و درخشش بازی می‌کرد. بازی‌هایش سریع و ویرانگر بودند. حسن فرق داشت. آهسته بازی می‌کرد. با تعمق. یک اصل راهنما داشت: «موقعیت را بازی کن، نه حریف را.»",
                    listOf(Word("prodigy", "نابغه", "ˈprɑːdədʒi"), Word("devastating", "ویرانگر", "ˈdevəsteɪtɪŋ"))
                ),
                StoryChapter(2, "The Championship Match", "مسابقه قهرمانی",
                    "Viktor won the first three games. But Hassan did not panic. He did not try to win. He tried to draw. He made no mistakes. By the sixth game, the score was three wins to Viktor, zero to Hassan, and three draws. The world was confused. What was Hassan doing?",
                    "ویکتور سه بازی اول را برد. اما حسن وحشت نکرد. تلاش نمی‌کرد ببرد. تلاش می‌کرد مساوی کند. اشتباه نمی‌کرد. پایان بازی ششم، امتیاز سه برد ویکتور، صفر حسن، سه مساوی بود. دنیا گیج شد. حسن چه کار می‌کرد؟",
                    listOf(Word("championship", "قهرمانی", "ˈtʃæmpiənʃɪp"), Word("draw", "مساوی", "drɔː"))
                ),
                StoryChapter(3, "The Power of the Long Game", "قدرت بازی بلندمدت",
                    "In the seventh game, Viktor began to take risks. He made mistakes. Hassan won. Then the eighth. Then the ninth. In the twelfth and final game, Viktor lost again. Hassan had won the championship. \"I did not try to win in the first game,\" Hassan said. \"I tried to win in the twelfth. Most players play to win today. I play to win tomorrow. That is the long game.\"",
                    "در بازی هفتم، ویکتور شروع به ریسک کرد. اشتباه کرد. حسن برد. بعد هشتم. بعد نهم. در بازی دوازدهم و آخر، ویکتور دوباره باخت. حسن قهرمان جهان شده بود. «تلاش نکردم در بازی اول ببرم،» حسن گفت. «تلاش کردم در بازی دوازدهم ببرم. بیشتر بازیکنان برای بردن امروز بازی می‌کنند. من برای بردن فردا بازی می‌کنم. این بازی بلندمدت است.»",
                    listOf(Word("momentum", "تکان", "moʊˈmentəm"), Word("blunder", "اشتباه بزرگ", "ˈblʌndər"))
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
                StoryChapter(1, "A Modern Paradox", "پارادوکس مدرن",
                    "In 2018, the British government appointed a Minister for Loneliness. Why? Because research revealed that loneliness was killing people. A major study found that loneliness increases the risk of premature death by twenty-six percent. It is as dangerous as smoking fifteen cigarettes a day. In the modern world, we have more means of communication than ever. And yet, people feel more isolated than ever.",
                    "در سال ۲۰۱۸، دولت بریتانیا وزیری برای تنهایی منصوب کرد. چرا؟ چون تحقیقات نشان داد تنهایی مردم را می‌کشت. یک مطالعه بزرگ نشان داد تنهایی خطر مرگ زودرس را بیست و شش درصد افزایش می‌دهد. به خطرناکی کشیدن پانزده سیگار در روز است. در دنیای مدرن، بیش از هر وقت دیگری ابزار ارتباطی داریم. و با این حال، مردم بیش از همیشه منزوی حس می‌کنند.",
                    listOf(Word("loneliness", "تنهایی", "ˈloʊnlinəs"), Word("premature", "زودرس", "ˌpriːməˈtʃʊr"))
                ),
                StoryChapter(2, "The Illusion of Connection", "توهم ارتباط",
                    "Why is this happening? The first reason is the difference between connection and meaningful connection. Social media allows us to connect with hundreds of people. But these connections are shallow. Second, the modern world is transient. People move frequently. Third, technology often replaces face-to-face contact. But the human brain is wired for physical presence. We need to see faces, hear voices, share meals, touch hands.",
                    "چرا این اتفاق می‌افتد؟ دلیل اول تفاوت بین ارتباط و ارتباط معنادار است. شبکه‌های اجتماعی به ما اجازه می‌دهند با صدها نفر ارتباط برقرار کنیم. اما این ارتباطات سطحی‌اند. دوم، دنیای مدرن گذراست. مردم مکرراً جابه‌جا می‌شوند. سوم، تکنولوژی اغلب تماس رو در رو را جایگزین می‌کند. اما مغز انسان برای حضور فیزیکی ساخته شده. نیاز به دیدن چهره‌ها، شنیدن صداها، قسمت کردن غذا و لمس دست‌ها داریم.",
                    listOf(Word("shallow", "سطحی", "ˈʃæloʊ"), Word("transient", "گذرا", "ˈtrænʃənt"))
                ),
                StoryChapter(3, "The Cure Is Within Reach", "درمان در دسترس است",
                    "The good news is that loneliness has a cure. And it is simpler than most people think. A Harvard study followed men for over eighty years. Its conclusion: the single greatest predictor of happiness was not wealth or fame. It was the quality of relationships. The cure for loneliness is small actions repeated consistently. Calling a friend. Visiting a family member. Eating dinner with someone. Loneliness is a silent epidemic, but silence can be broken.",
                    "خبر خوب این است که تنهایی درمان دارد. و از آنچه بیشتر مردم فکر می‌کنند ساده‌تر است. مطالعه‌ای در هاروارد مردان را بیش از هشتاد سال دنبال کرد. نتیجه‌اش: تنها قوی‌ترین پیش‌بینی‌کننده شادی ثروت یا شهرت نبود. کیفیت روابط بود. درمان تنهایی اعمال کوچک تکرارشده است. زنگ زدن به دوستی. دیدار یک عضو خانواده. شام خوردن با کسی. تنهایی همه‌گیری خاموشی است، اما سکوت را می‌توان شکست.",
                    listOf(Word("predictor", "پیش‌بینی‌کننده", "prɪˈdɪktər"), Word("epidemic", "همه‌گیری", "ˌepɪˈdemɪk"))
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
                StoryChapter(1, "The Writer's Confession", "اعتراف نویسنده",
                    "In his final interview, a famous writer named Ahmad made a confession. \"I wrote millions of words. But there is one sentence from fifty years ago that I cannot forget. I told my brother he would never amount to anything. He believed me. He dropped out of school. He died alone. I broke my brother with a single sentence. And no words I have written since can undo what that sentence did.\"",
                    "در آخرین مصاحبه‌اش، نویسنده‌ی مشهوری به نام احمد اعترافی کرد. «میلیون‌ها کلمه نوشتم. اما یک جمله از پنجاه سال پیش هست که نمی‌توانم فراموش کنم. به برادرم گفتم که هرگز به جایی نمی‌رسد. او به من باور کرد. ترک تحصیل کرد. تنها مرد. برادرم را با یک جمله شکستم. و هیچ کلمه‌ای که از آن به بعد نوشته‌ام نمی‌تواند کاری که آن جمله کرد را خنثی کند.»",
                    listOf(Word("confession", "اعتراف", "kənˈfeʃn"), Word("undo", "خنثی کردن", "ʌnˈduː"))
                ),
                StoryChapter(2, "The Science of Words", "علم کلمات",
                    "Modern science has confirmed what Ahmad understood too late. Words are not just sounds. They physically alter the brain. Positive words release oxytocin. Negative words release cortisol. Constant criticism can change the structure of the brain. And words shape reality. When a child is told she is stupid, she begins to believe it. This is called the \"self-fulfilling prophecy.\" We become what others tell us we are.",
                    "علم مدرن چیزی را که احمد خیلی دیر فهمید تأیید کرده است. کلمات فقط صدا نیستند. مغز را فیزیکی تغییر می‌دهند. کلمات مثبت اکسی‌توسین آزاد می‌کنند. کلمات منفی کورتیزول. انتقاد دائمی می‌تواند ساختار مغز را تغییر دهد. و کلمات واقعیت را شکل می‌دهند. وقتی به کودک گفته می‌شود احمق است، شروع به باور می‌کند. این «پیشگویی خودشکوفا» نامیده می‌شود. ما همان می‌شویم که دیگران به ما می‌گویند هستیم.",
                    listOf(Word("oxytocin", "اکسی‌توسین", "ˌɑːksɪˈtoʊsɪn"), Word("prophecy", "پیشگویی", "ˈprɑːfəsi"))
                ),
                StoryChapter(3, "The Responsibility of Speech", "مسئولیت گفتار",
                    "If words are this powerful, then speaking is a moral act. Every word enters someone's mind and leaves a mark. Better to ask: is this true? Is this necessary? Is this kind? We are all writers. Every day, we write on the souls of those around us. We do not use pen and paper. We use our words. And what we write cannot always be erased.",
                    "اگر کلمات اینقدر قدرتمند هستند، پس حرف زدن یک عمل اخلاقی است. هر کلمه وارد ذهن کسی می‌شود و ردی باقی می‌گذارد. بهتر است بپرسیم: آیا این درست است؟ آیا لازم است؟ آیا مهربانانه است؟ همه ما نویسنده‌ایم. هر روز روی روح اطرافیان می‌نویسیم. از قلم و کاغذ استفاده نمی‌کنیم. از کلماتمان استفاده می‌کنیم. و آنچه می‌نویسیم همیشه قابل پاک کردن نیست.",
                    listOf(Word("virtue", "فضیلت", "ˈvɜːrtʃuː"), Word("intention", "نیت", "ɪnˈtenʃn"))
                )
            )
        )
    )
}