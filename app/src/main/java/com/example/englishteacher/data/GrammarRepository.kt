package com.example.englishteacher.data

data class GrammarTopic(
    val id: String,
    val title: String,
    val titlePersian: String,
    val category: String,
    val explanation: String,
    val formula: String,
    val examples: List<GrammarExample>
)

data class GrammarExample(
    val english: String,
    val persian: String,
    val isCorrect: Boolean = true
)

object GrammarRepository {

    fun getAllTopics(): List<GrammarTopic> = listOf(

        // ==================== ضمایر ====================
        GrammarTopic(
            id = "g_pronouns_subject",
            title = "Subject Pronouns",
            titlePersian = "ضمایر فاعلی",
            category = "🔤 ضمایر",
            explanation = "ضمایر فاعلی به جای فاعل جمله می‌نشینند و نشان می‌دهند چه کسی کار را انجام می‌دهد.",
            formula = "I, You, He, She, It, We, They",
            examples = listOf(
                GrammarExample("I am a student.", "من دانش‌آموز هستم."),
                GrammarExample("He works in a bank.", "او در بانک کار می‌کند."),
                GrammarExample("They are my friends.", "آن‌ها دوستان من هستند.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_object",
            title = "Object Pronouns",
            titlePersian = "ضمایر مفعولی",
            category = "🔤 ضمایر",
            explanation = "ضمایر مفعولی بعد از فعل یا حرف اضافه می‌آیند.",
            formula = "me, you, him, her, it, us, them",
            examples = listOf(
                GrammarExample("She loves me.", "او مرا دوست دارد."),
                GrammarExample("I saw him yesterday.", "دیروز او را دیدم."),
                GrammarExample("Give it to them.", "آن را به آن‌ها بده.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_possessive_adj",
            title = "Possessive Adjectives",
            titlePersian = "صفات ملکی",
            category = "🔤 ضمایر",
            explanation = "صفات ملکی قبل از اسم می‌آیند و مالکیت را نشان می‌دهند.",
            formula = "my, your, his, her, its, our, their",
            examples = listOf(
                GrammarExample("This is my book.", "این کتاب من است."),
                GrammarExample("Her car is red.", "ماشین او قرمز است."),
                GrammarExample("Their house is big.", "خانه‌ی آن‌ها بزرگ است.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_possessive",
            title = "Possessive Pronouns",
            titlePersian = "ضمایر ملکی",
            category = "🔤 ضمایر",
            explanation = "ضمایر ملکی به جای اسم می‌آیند و مالکیت را نشان می‌دهند.",
            formula = "mine, yours, his, hers, its, ours, theirs",
            examples = listOf(
                GrammarExample("This book is mine.", "این کتاب مال من است."),
                GrammarExample("That car is hers.", "آن ماشین مال اوست."),
                GrammarExample("Is this yours?", "آیا این مال توست؟"),
                GrammarExample("This is my car. The red one is mine.", "این ماشین من است. قرمز مال منه.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_reflexive",
            title = "Reflexive Pronouns",
            titlePersian = "ضمایر انعکاسی",
            category = "🔤 ضمایر",
            explanation = "ضمایر انعکاسی وقتی استفاده می‌شوند که فاعل و مفعول یکی باشند.",
            formula = "myself, yourself, himself, herself, itself, ourselves, yourselves, themselves",
            examples = listOf(
                GrammarExample("I hurt myself.", "خودم را زخمی کردم."),
                GrammarExample("She taught herself English.", "او خودش انگلیسی یاد گرفت."),
                GrammarExample("They enjoyed themselves.", "آن‌ها به خودشان خوش گذراندند.")
            )
        ),

        // ==================== زمان‌ها ====================
        GrammarTopic(
            id = "g_present_simple",
            title = "Present Simple",
            titlePersian = "زمان حال ساده",
            category = "⏰ زمان‌ها",
            explanation = "برای بیان کارهای روزمره، عادت‌ها و حقایق کلی استفاده می‌شود.",
            formula = "فاعل + فعل ساده (برای he/she/it + s)\nمنفی: don't/doesn't + فعل\nسوال: Do/Does + فاعل + فعل",
            examples = listOf(
                GrammarExample("I study English every day.", "من هر روز انگلیسی می‌خوانم."),
                GrammarExample("She works in a school.", "او در مدرسه کار می‌کند."),
                GrammarExample("They don't like coffee.", "آن‌ها قهوه دوست ندارند."),
                GrammarExample("Does he speak French?", "آیا او فرانسوی صحبت می‌کند؟")
            )
        ),

        GrammarTopic(
            id = "g_present_continuous",
            title = "Present Continuous",
            titlePersian = "زمان حال استمراری",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که همین الان در حال انجام شدن هستند.",
            formula = "am/is/are + فعل + ing\nمنفی: am/is/are + not + فعل + ing",
            examples = listOf(
                GrammarExample("I am reading a book.", "دارم یک کتاب می‌خوانم."),
                GrammarExample("She is cooking dinner.", "او دارد شام می‌پزد."),
                GrammarExample("They are not playing football.", "آن‌ها فوتبال بازی نمی‌کنند.")
            )
        ),

        GrammarTopic(
            id = "g_present_perfect",
            title = "Present Perfect",
            titlePersian = "زمان حال کامل",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که در گذشته شروع شده و تا حالا ادامه دارند یا اثرشان باقی است. همچنین برای تجربیات.",
            formula = "have/has + past participle (قسمت سوم فعل)",
            examples = listOf(
                GrammarExample("I have lived here for 10 years.", "من ۱۰ سال است اینجا زندگی می‌کنم."),
                GrammarExample("She has visited Paris.", "او پاریس را دیده است."),
                GrammarExample("Have you ever eaten sushi?", "آیا تا حالا سوشی خورده‌ای؟"),
                GrammarExample("I have just finished my homework.", "من همین الان تکالیفم را تمام کردم.")
            )
        ),

        GrammarTopic(
            id = "g_past_simple",
            title = "Past Simple",
            titlePersian = "زمان گذشته ساده",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که در گذشته در زمان مشخصی انجام شده و تمام شدند.",
            formula = "فعل + ed (یا شکل دوم فعل)\nمنفی: didn't + فعل ساده\nسوال: Did + فاعل + فعل ساده",
            examples = listOf(
                GrammarExample("I watched a movie yesterday.", "دیروز یک فیلم تماشا کردم."),
                GrammarExample("She went to the market.", "او به بازار رفت."),
                GrammarExample("They didn't come to the party.", "آن‌ها به مهمانی نیامدند."),
                GrammarExample("Did you see him?", "او را دیدی؟")
            )
        ),

        GrammarTopic(
            id = "g_future",
            title = "Future (Will / Going to)",
            titlePersian = "آینده (will / going to)",
            category = "⏰ زمان‌ها",
            explanation = "Will برای تصمیم‌های لحظه‌ای و پیش‌بینی. Going to برای برنامه‌های قبلی.",
            formula = "will + فعل ساده\nam/is/are + going to + فعل ساده",
            examples = listOf(
                GrammarExample("I will call you tomorrow.", "فردا بهت زنگ می‌زنم."),
                GrammarExample("She is going to travel next week.", "او هفته آینده قصد سفر دارد."),
                GrammarExample("It will rain tomorrow.", "فردا باران خواهد بارید.")
            )
        ),

        // ==================== حرف تعریف ====================
        GrammarTopic(
            id = "g_articles",
            title = "Articles (a / an / the)",
            titlePersian = "حرف تعریف",
            category = "📝 حرف تعریف",
            explanation = "a/an برای اسم‌های نامعین و مفرد. the برای اسم‌های معین و مشخص.\n\na قبل از حرف بی‌صدا\nan قبل از حرف صدادار (a, e, i, o, u)",
            formula = "a + اسم با حرف بی‌صدا\nan + اسم با حرف صدادار\nthe + اسم مشخص",
            examples = listOf(
                GrammarExample("I have a book.", "یک کتاب دارم."),
                GrammarExample("She is an engineer.", "او یک مهندس است."),
                GrammarExample("The book on the table is mine.", "کتاب روی میز مال من است.")
            )
        ),

        // ==================== حروف اضافه ====================
        GrammarTopic(
            id = "g_prepositions_place",
            title = "Prepositions of Place",
            titlePersian = "حروف اضافه مکان",
            category = "📍 حروف اضافه",
            explanation = "in = در\non = روی\nat = در (نقطه مشخص)\nnext to = کنار\nbetween = بین\nbehind = پشت\nin front of = جلوی\nunder = زیر",
            formula = "in, on, at, next to, between, behind, in front of, under",
            examples = listOf(
                GrammarExample("The book is on the table.", "کتاب روی میز است."),
                GrammarExample("She is at home.", "او در خانه است."),
                GrammarExample("The cat is under the chair.", "گربه زیر صندلی است."),
                GrammarExample("The bank is next to the market.", "بانک کنار بازار است.")
            )
        ),

        GrammarTopic(
            id = "g_prepositions_time",
            title = "Prepositions of Time",
            titlePersian = "حروف اضافه زمان",
            category = "📍 حروف اضافه",
            explanation = "in = برای ماه، سال، فصل\non = برای روز و تاریخ\nat = برای ساعت و شب",
            formula = "in (month/year), on (day/date), at (time/night)",
            examples = listOf(
                GrammarExample("I was born in 1990.", "من در سال ۱۹۹۰ به دنیا آمدم."),
                GrammarExample("The meeting is on Monday.", "جلسه روز دوشنبه است."),
                GrammarExample("I wake up at 7 AM.", "ساعت ۷ صبح بیدار می‌شوم."),
                GrammarExample("We go on holiday in summer.", "ما در تابستان به تعطیلات می‌رویم.")
            )
        ),

        // ==================== صفت‌ها ====================
        GrammarTopic(
            id = "g_comparative",
            title = "Comparatives",
            titlePersian = "صفت‌های تفضیلی (مقایسه دو چیز)",
            category = "🎯 صفت‌ها",
            explanation = "برای مقایسه دو چیز استفاده می‌شود.\n\nصفت‌های کوتاه: + er\nصفت‌های بلند: more + صفت\nبی‌قاعده: good → better, bad → worse",
            formula = "صفت کوتاه + er + than\nmore + صفت بلند + than",
            examples = listOf(
                GrammarExample("Ali is taller than Reza.", "علی از رضا بلندتر است."),
                GrammarExample("This book is more interesting than that one.", "این کتاب از آن یکی جالب‌تر است."),
                GrammarExample("My English is better than before.", "انگلیسی من از قبل بهتر است.")
            )
        ),

        GrammarTopic(
            id = "g_superlative",
            title = "Superlatives",
            titlePersian = "صفت‌های عالی (بهترین)",
            category = "🎯 صفت‌ها",
            explanation = "برای مقایسه یک چیز با تمام چیزهای دیگر.\n\nصفت کوتاه: the + صفت + est\nصفت بلند: the most + صفت\nبی‌قاعده: good → best, bad → worst",
            formula = "the + صفت کوتاه + est\nthe most + صفت بلند",
            examples = listOf(
                GrammarExample("He is the tallest in the class.", "او بلندترین در کلاس است."),
                GrammarExample("This is the most beautiful city.", "این زیباترین شهر است."),
                GrammarExample("She is the best student.", "او بهترین دانش‌آموز است.")
            )
        ),

        // ==================== افعال modal ====================
        GrammarTopic(
            id = "g_modal_verbs",
            title = "Modal Verbs",
            titlePersian = "افعال Modal (can, must, should)",
            category = "⚡ افعال Modal",
            explanation = "can = توانستن\nmust = باید (اجبار قوی)\nshould = باید (توصیه)\nmay/might = ممکن است\nhave to = مجبور بودن",
            formula = "modal + فعل ساده (بدون to)",
            examples = listOf(
                GrammarExample("I can swim.", "من می‌توانم شنا کنم."),
                GrammarExample("You must wear a seatbelt.", "باید کمربند ایمنی ببندی."),
                GrammarExample("You should see a doctor.", "بهتر است دکتر ببینی."),
                GrammarExample("It may rain tomorrow.", "ممکن است فردا باران ببارد.")
            )
        ),

        // ==================== شرطی‌ها ====================
        GrammarTopic(
            id = "g_first_conditional",
            title = "First Conditional",
            titlePersian = "شرطی نوع اول (احتمال واقعی)",
            category = "🔀 جملات شرطی",
            explanation = "برای موقعیت‌های واقعی در آینده که احتمال وقوع دارند.",
            formula = "If + present simple, will + verb",
            examples = listOf(
                GrammarExample("If it rains, I will stay home.", "اگر باران ببارد، خانه می‌مانم."),
                GrammarExample("If you study hard, you will pass.", "اگر سخت درس بخوانی، قبول می‌شوی."),
                GrammarExample("If we leave now, we will catch the bus.", "اگر الان برویم، اتوبوس را می‌گیریم.")
            )
        ),

        GrammarTopic(
            id = "g_second_conditional",
            title = "Second Conditional",
            titlePersian = "شرطی نوع دوم (خیالی)",
            category = "🔀 جملات شرطی",
            explanation = "برای موقعیت‌های خیالی و غیرواقعی در زمان حال.",
            formula = "If + past simple, would + verb",
            examples = listOf(
                GrammarExample("If I were rich, I would travel the world.", "اگر ثروتمند بودم، دور دنیا سفر می‌کردم."),
                GrammarExample("If I had time, I would help you.", "اگر وقت داشتم، کمکت می‌کردم.")
            )
        ),

        // ==================== مجهول ====================
        GrammarTopic(
            id = "g_passive_voice",
            title = "Passive Voice",
            titlePersian = "جملات مجهول",
            category = "🔄 مجهول",
            explanation = "وقتی فاعل مهم نیست یا نمی‌خواهیم ذکر کنیم.",
            formula = "be + past participle\n\nحال ساده: is/are + pp\nگذشته: was/were + pp",
            examples = listOf(
                GrammarExample("The book was written by a famous author.", "کتاب توسط یک نویسنده معروف نوشته شد."),
                GrammarExample("English is spoken all over the world.", "انگلیسی در سراسر جهان صحبت می‌شود."),
                GrammarExample("The bridge was built in 1990.", "پل در سال ۱۹۹۰ ساخته شد.")
            )
        ),

        // ==================== نقل قول ====================
        GrammarTopic(
            id = "g_reported_speech",
            title = "Reported Speech",
            titlePersian = "نقل قول غیرمستقیم",
            category = "💬 نقل قول",
            explanation = "وقتی حرف کسی را برای نفر سوم نقل می‌کنیم.\n\nتغییر زمان:\npresent → past\nwill → would\ncan → could",
            formula = "She said (that) + جمله با یک زمان عقب‌تر",
            examples = listOf(
                GrammarExample("Direct: She said, \"I am busy.\"", "او گفت: «من مشغولم.»"),
                GrammarExample("Reported: She said she was busy.", "او گفت که مشغول است."),
                GrammarExample("He said he would come.", "او گفت که خواهد آمد.")
            )
        ),

        // ==================== قید تکرار ====================
        GrammarTopic(
            id = "g_adverbs_frequency",
            title = "Adverbs of Frequency",
            titlePersian = "قیدهای تکرار",
            category = "🔁 قیدها",
            explanation = "always (همیشه ۱۰۰٪)\nusually (معمولاً ۹۰٪)\noften (غالباً ۷۰٪)\nsometimes (بعضی وقت‌ها ۵۰٪)\nrarely (به‌ندرت ۱۰٪)\nnever (هرگز ۰٪)\n\nجای قید: قبل از فعل اصلی، بعد از to be",
            formula = "subject + adverb + verb\nsubject + be + adverb",
            examples = listOf(
                GrammarExample("I always wake up at 7.", "همیشه ساعت ۷ بیدار می‌شوم."),
                GrammarExample("She is usually late.", "او معمولاً دیر می‌آید."),
                GrammarExample("They never eat fast food.", "آن‌ها هرگز فست‌فود نمی‌خورند.")
            )
        ),

        // ==================== There is/are ====================
        GrammarTopic(
            id = "g_there_is_are",
            title = "There is / There are",
            titlePersian = "وجود داشتن",
            category = "🏠 ساختار جمله",
            explanation = "برای گفتن اینکه چیزی وجود دارد.\n\nThere is + مفرد\nThere are + جمع",
            formula = "There is + اسم مفرد\nThere are + اسم جمع\nمنفی: isn't / aren't\nسوال: Is there...? / Are there...?",
            examples = listOf(
                GrammarExample("There is a book on the table.", "یک کتاب روی میز است."),
                GrammarExample("There are twenty students.", "بیست دانش‌آموز هستند."),
                GrammarExample("Is there a bank near here?", "بانکی این نزدیکی هست؟"),
                GrammarExample("There aren't any apples.", "هیچ سیبی نیست.")
            )
        ),

        // ==================== Used to ====================
        GrammarTopic(
            id = "g_used_to",
            title = "Used to / Be used to",
            titlePersian = "used to / be used to",
            category = "📅 گذشته",
            explanation = "used to + فعل: عادت در گذشته (الان دیگر نیست)\nbe used to + فعل ing: عادت داشتن به چیزی (الان هست)",
            formula = "used to + verb (بدون to)\nbe used to + verb-ing",
            examples = listOf(
                GrammarExample("I used to play football.", "قبلاً فوتبال بازی می‌کردم."),
                GrammarExample("She used to live in London.", "او قبلاً در لندن زندگی می‌کرد."),
                GrammarExample("I am used to waking up early.", "عادت دارم زود بیدار شوم.")
            )
        ),

        // ==================== Gerund/Infinitive ====================
        GrammarTopic(
            id = "g_gerund_infinitive",
            title = "Gerunds and Infinitives",
            titlePersian = "فعل + ing / to + فعل",
            category = "🔤 ساختار فعل",
            explanation = "بعضی افعال با ing میان و بعضی با to:\n\nEnjoy + ing\nWant + to\nDecide + to\nAvoid + ing\nLike + ing یا to",
            formula = "enjoy + verb-ing\nwant + to + verb",
            examples = listOf(
                GrammarExample("I enjoy reading books.", "از خواندن کتاب لذت می‌برم."),
                GrammarExample("She wants to learn English.", "او می‌خواهد انگلیسی یاد بگیرد."),
                GrammarExample("They decided to stay home.", "آن‌ها تصمیم گرفتند خانه بمانند."),
                GrammarExample("Avoid eating too much sugar.", "از خوردن شکر زیاد پرهیز کن.")
            )
        )
    )

    fun getTopicsByCategory(): Map<String, List<GrammarTopic>> {
        return getAllTopics().groupBy { it.category }
    }

    fun getTopicById(id: String): GrammarTopic? {
        return getAllTopics().firstOrNull { it.id == id }
    }
}