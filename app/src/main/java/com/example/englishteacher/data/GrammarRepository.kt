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

        // ============================================================
        // ==================== 🔤 ضمایر (Pronouns) ====================
        // ============================================================

        GrammarTopic(
            id = "g_pronouns_subject",
            title = "Subject Pronouns",
            titlePersian = "ضمایر فاعلی",
            category = "🔤 ضمایر",
            explanation = "ضمایر فاعلی جایگزین فاعل جمله می‌شوند و نشان می‌دهند چه کسی کار را انجام می‌دهد.\n\n👤 مفرد: I, You, He, She, It\n👥 جمع: We, You, They\n\n⚠️ نکته: در انگلیسی همیشه فاعل باید ذکر شود (برخلاف فارسی).",
            formula = "I / You / He / She / It / We / They + فعل",
            examples = listOf(
                GrammarExample("I am a student.", "من دانش‌آموز هستم."),
                GrammarExample("He works in a bank.", "او در بانک کار می‌کند."),
                GrammarExample("She is my sister.", "او خواهر من است."),
                GrammarExample("It is a beautiful day.", "روز زیبایی است."),
                GrammarExample("We are learning English.", "ما داریم انگلیسی یاد می‌گیریم."),
                GrammarExample("They live in Tehran.", "آن‌ها در تهران زندگی می‌کنند.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_object",
            title = "Object Pronouns",
            titlePersian = "ضمایر مفعولی",
            category = "🔤 ضمایر",
            explanation = "ضمایر مفعولی بعد از فعل یا حرف اضافه می‌آیند و مفعول جمله هستند.\n\n👤 مفرد: me, you, him, her, it\n👥 جمع: us, you, them",
            formula = "فعل/حرف اضافه + me / you / him / her / it / us / them",
            examples = listOf(
                GrammarExample("She loves me.", "او مرا دوست دارد."),
                GrammarExample("I saw him yesterday.", "دیروز او را دیدم."),
                GrammarExample("Can you help us?", "می‌توانی به ما کمک کنی؟"),
                GrammarExample("Give it to them.", "آن را به آن‌ها بده."),
                GrammarExample("This is for her.", "این برای اوست.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_possessive_adj",
            title = "Possessive Adjectives",
            titlePersian = "صفات ملکی",
            category = "🔤 ضمایر",
            explanation = "صفات ملکی قبل از اسم می‌آیند و مالکیت را نشان می‌دهند.\n\n⚠️ همیشه قبل از اسم قرار می‌گیرند و هیچ‌وقت تنها نمی‌آیند.",
            formula = "my / your / his / her / its / our / their + اسم",
            examples = listOf(
                GrammarExample("This is my book.", "این کتاب من است."),
                GrammarExample("Her car is red.", "ماشین او قرمز است."),
                GrammarExample("Their house is big.", "خانه‌ی آن‌ها بزرگ است."),
                GrammarExample("Our teacher is kind.", "معلم ما مهربان است.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_possessive",
            title = "Possessive Pronouns",
            titlePersian = "ضمایر ملکی",
            category = "🔤 ضمایر",
            explanation = "ضمایر ملکی جایگزین «صفت ملکی + اسم» می‌شوند و تنها می‌آیند.\n\nمثال: my book → mine\n\n⚠️ بعد از ضمایر ملکی هرگز اسم نمی‌آید.",
            formula = "mine / yours / his / hers / its / ours / theirs",
            examples = listOf(
                GrammarExample("This book is mine.", "این کتاب مال من است."),
                GrammarExample("That car is hers.", "آن ماشین مال اوست."),
                GrammarExample("Is this yours?", "آیا این مال توست؟"),
                GrammarExample("The red one is ours.", "قرمزه مال ماست.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_reflexive",
            title = "Reflexive Pronouns",
            titlePersian = "ضمایر انعکاسی",
            category = "🔤 ضمایر",
            explanation = "وقتی فاعل و مفعول یکی باشند از ضمایر انعکاسی استفاده می‌کنیم.\n\n✅ I hurt myself. (خودم را زخمی کردم)\n❌ I hurt me.\n\nکاربردهای رایج:\n• by myself = تنها\n• enjoy yourself = خوش بگذرون",
            formula = "myself / yourself / himself / herself / itself / ourselves / yourselves / themselves",
            examples = listOf(
                GrammarExample("I hurt myself.", "خودم را زخمی کردم."),
                GrammarExample("She taught herself English.", "او خودش انگلیسی یاد گرفت."),
                GrammarExample("They enjoyed themselves.", "آن‌ها به خودشان خوش گذراندند."),
                GrammarExample("I did it by myself.", "خودم به تنهایی انجامش دادم.")
            )
        ),

        GrammarTopic(
            id = "g_pronouns_demonstrative",
            title = "Demonstrative Pronouns",
            titlePersian = "ضمایر اشاره",
            category = "🔤 ضمایر",
            explanation = "برای اشاره به چیزها یا افراد استفاده می‌شود.\n\n🔹 نزدیک: this (مفرد), these (جمع)\n🔹 دور: that (مفرد), those (جمع)",
            formula = "this / that (مفرد)\nthese / those (جمع)",
            examples = listOf(
                GrammarExample("This is my pen.", "این خودکار من است."),
                GrammarExample("These are my friends.", "این‌ها دوستان من هستند."),
                GrammarExample("That is your car.", "آن ماشین توست."),
                GrammarExample("Those are my books.", "آن‌ها کتاب‌های من هستند.")
            )
        ),

        // ============================================================
        // ==================== ⏰ زمان‌ها (Tenses) ====================
        // ============================================================

        GrammarTopic(
            id = "g_present_simple",
            title = "Present Simple",
            titlePersian = "زمان حال ساده",
            category = "⏰ زمان‌ها",
            explanation = "برای بیان:\n✅ عادت‌ها (I wake up at 7)\n✅ حقایق کلی (Water boils at 100°C)\n✅ برنامه‌های ثابت (The train leaves at 8)\n\n⚠️ برای he/she/it به فعل s اضافه می‌شود.",
            formula = "✅ مثبت: فاعل + فعل (he/she/it + s)\n❌ منفی: don't/doesn't + فعل\n❓ سوال: Do/Does + فاعل + فعل؟",
            examples = listOf(
                GrammarExample("I study English every day.", "من هر روز انگلیسی می‌خوانم."),
                GrammarExample("She works in a school.", "او در مدرسه کار می‌کند."),
                GrammarExample("The sun rises in the east.", "خورشید از شرق طلوع می‌کند."),
                GrammarExample("They don't like coffee.", "آن‌ها قهوه دوست ندارند."),
                GrammarExample("Does he speak French?", "آیا او فرانسوی صحبت می‌کند؟")
            )
        ),

        GrammarTopic(
            id = "g_present_continuous",
            title = "Present Continuous",
            titlePersian = "زمان حال استمراری",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که:\n✅ همین الان در حال انجام است\n✅ در این دوره موقت ادامه دارد\n✅ برنامه‌ی آینده‌ی نزدیک (قطعی)\n\n⚠️ افعال حالتی (know, like, want) معمولاً ing نمی‌گیرند.",
            formula = "✅ am/is/are + فعل + ing\n❌ am/is/are + not + فعل + ing\n❓ Am/Is/Are + فاعل + فعل + ing؟",
            examples = listOf(
                GrammarExample("I am reading a book now.", "دارم الان یک کتاب می‌خوانم."),
                GrammarExample("She is cooking dinner.", "او دارد شام می‌پزد."),
                GrammarExample("They are not playing football.", "آن‌ها فوتبال بازی نمی‌کنند."),
                GrammarExample("I'm meeting Ali tomorrow.", "فردا با علی قرار دارم."),
                GrammarExample("Is she studying?", "آیا او دارد درس می‌خواند؟")
            )
        ),

        GrammarTopic(
            id = "g_present_perfect",
            title = "Present Perfect",
            titlePersian = "زمان حال کامل",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که:\n✅ در گذشته شروع شده و تا الان ادامه دارد\n✅ تجربه‌ی زندگی (بدون زمان مشخص)\n✅ نتیجه‌اش الان مهم است\n\n🚫 با زمان‌های مشخص گذشته (yesterday, last year) نمی‌آید.",
            formula = "✅ have/has + past participle\n❌ have/has + not + p.p.\n❓ Have/Has + فاعل + p.p.؟\n\nکلمات کلیدی: for, since, ever, never, just, already, yet",
            examples = listOf(
                GrammarExample("I have lived here for 10 years.", "من ۱۰ سال است اینجا زندگی می‌کنم."),
                GrammarExample("She has visited Paris.", "او پاریس را دیده است."),
                GrammarExample("Have you ever eaten sushi?", "آیا تا حالا سوشی خورده‌ای؟"),
                GrammarExample("I have just finished my homework.", "همین الان تکالیفم را تمام کردم."),
                GrammarExample("They haven't arrived yet.", "آن‌ها هنوز نرسیده‌اند.")
            )
        ),

        GrammarTopic(
            id = "g_present_perfect_continuous",
            title = "Present Perfect Continuous",
            titlePersian = "زمان حال کامل استمراری",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که در گذشته شروع شده و همچنان ادامه دارند و روی حال تأثیر دارند.\n\n⚠️ تفاوت با Present Perfect:\n• I have painted the room. (تمام شده)\n• I have been painting the room. (شاید هنوز تمام نشده)",
            formula = "have/has been + verb-ing",
            examples = listOf(
                GrammarExample("I have been studying English for 3 years.", "من ۳ سال است دارم انگلیسی می‌خوانم."),
                GrammarExample("She has been working here since 2020.", "او از سال ۲۰۲۰ اینجا کار می‌کند."),
                GrammarExample("How long have you been waiting?", "چه مدت است که منتظری؟"),
                GrammarExample("It has been raining all day.", "تمام روز باران می‌بارد.")
            )
        ),

        GrammarTopic(
            id = "g_past_simple",
            title = "Past Simple",
            titlePersian = "زمان گذشته ساده",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که در گذشته در زمان مشخصی انجام شده و تمام شدند.\n\n⚠️ افعال باقاعده + ed می‌گیرند\n⚠️ افعال بی‌قاعده شکل دوم دارند (go → went, see → saw)",
            formula = "✅ فاعل + فعل دوم (+ed یا بی‌قاعده)\n❌ didn't + فعل ساده\n❓ Did + فاعل + فعل ساده؟",
            examples = listOf(
                GrammarExample("I watched a movie yesterday.", "دیروز یک فیلم تماشا کردم."),
                GrammarExample("She went to the market.", "او به بازار رفت."),
                GrammarExample("They didn't come to the party.", "آن‌ها به مهمانی نیامدند."),
                GrammarExample("Did you see him last night?", "دیشب او را دیدی؟"),
                GrammarExample("We lived in London in 2015.", "ما در ۲۰۱۵ در لندن زندگی می‌کردیم.")
            )
        ),

        GrammarTopic(
            id = "g_past_continuous",
            title = "Past Continuous",
            titlePersian = "زمان گذشته استمراری",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که:\n✅ در گذشته در حال انجام بودند\n✅ با یه کار دیگه قطع شدند\n\nالگو: When + Past Simple, Past Continuous",
            formula = "was/were + verb-ing",
            examples = listOf(
                GrammarExample("I was watching TV at 8 PM.", "ساعت ۸ شب داشتم تلویزیون تماشا می‌کردم."),
                GrammarExample("She was cooking when I called.", "وقتی زنگ زدم، داشت غذا می‌پخت."),
                GrammarExample("They were playing football.", "آن‌ها داشتند فوتبال بازی می‌کردند."),
                GrammarExample("What were you doing?", "داشتی چیکار می‌کردی؟")
            )
        ),

        GrammarTopic(
            id = "g_past_perfect",
            title = "Past Perfect",
            titlePersian = "زمان گذشته کامل",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که قبل از یک کار دیگر در گذشته اتفاق افتاده بودند.\n\nالگو: Past Perfect + Past Simple\n• وقتی رسیدم، او رفته بود.\nWhen I arrived, he had left.",
            formula = "had + past participle",
            examples = listOf(
                GrammarExample("When I arrived, she had already left.", "وقتی رسیدم، او رفته بود."),
                GrammarExample("I had never seen the sea before that trip.", "قبل از آن سفر، هرگز دریا را ندیده بودم."),
                GrammarExample("They had finished dinner before 8.", "قبل از ساعت ۸ شام را تمام کرده بودند.")
            )
        ),

        GrammarTopic(
            id = "g_future_will",
            title = "Future Simple (Will)",
            titlePersian = "آینده ساده با will",
            category = "⏰ زمان‌ها",
            explanation = "برای:\n✅ تصمیم لحظه‌ای (I'll have coffee)\n✅ پیش‌بینی (It will rain)\n✅ وعده (I will help you)",
            formula = "will + فعل ساده\nمنفی: won't + فعل\nسوال: Will + فاعل + فعل؟",
            examples = listOf(
                GrammarExample("I will call you tomorrow.", "فردا بهت زنگ می‌زنم."),
                GrammarExample("She will be 30 next year.", "او سال آینده ۳۰ ساله می‌شود."),
                GrammarExample("It will probably rain tonight.", "احتمالاً امشب باران می‌بارد."),
                GrammarExample("I won't forget you.", "تو را فراموش نمی‌کنم.")
            )
        ),

        GrammarTopic(
            id = "g_future_going_to",
            title = "Be Going To",
            titlePersian = "آینده با going to",
            category = "⏰ زمان‌ها",
            explanation = "برای:\n✅ برنامه‌های قبلی (I'm going to travel)\n✅ پیش‌بینی بر اساس شواهد (Look at the clouds! It's going to rain)",
            formula = "am/is/are + going to + فعل",
            examples = listOf(
                GrammarExample("I am going to visit my family.", "قصد دارم به دیدن خانواده‌ام بروم."),
                GrammarExample("She is going to buy a new car.", "او می‌خواهد ماشین جدید بخرد."),
                GrammarExample("Look! It's going to rain.", "نگاه کن! داره بارون میاد.")
            )
        ),

        GrammarTopic(
            id = "g_future_continuous",
            title = "Future Continuous",
            titlePersian = "آینده استمراری",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که در یک زمان مشخص در آینده در حال انجام خواهند بود.",
            formula = "will be + verb-ing",
            examples = listOf(
                GrammarExample("At 8 PM, I will be studying.", "ساعت ۸ شب، در حال مطالعه خواهم بود."),
                GrammarExample("This time tomorrow, we will be flying to Paris.", "فردا این موقع، در حال پرواز به پاریس خواهیم بود."),
                GrammarExample("Don't call at 7, I'll be having dinner.", "ساعت ۷ زنگ نزن، شام می‌خورم.")
            )
        ),

        GrammarTopic(
            id = "g_future_perfect",
            title = "Future Perfect",
            titlePersian = "آینده کامل",
            category = "⏰ زمان‌ها",
            explanation = "برای کارهایی که تا زمان مشخصی در آینده تمام خواهند شد.",
            formula = "will have + past participle",
            examples = listOf(
                GrammarExample("By next year, I will have finished my degree.", "تا سال آینده، مدرکم را گرفته‌ام."),
                GrammarExample("By 2030, they will have built the bridge.", "تا ۲۰۳۰، پل را ساخته‌اند."),
                GrammarExample("By the time you arrive, I will have cooked dinner.", "تا وقتی برسی، شام را پخته‌ام.")
            )
        ),

        GrammarTopic(
            id = "g_mixed_tenses",
            title = "Mixed Tense Review",
            titlePersian = "مرور ترکیبی زمان‌ها",
            category = "⏰ زمان‌ها",
            explanation = "در مکالمات واقعی، زمان‌های مختلف با هم استفاده می‌شوند.\n\n🔹 عادت‌ها: Present Simple\n🔹 در حال انجام: Present Continuous\n🔹 تجربه: Present Perfect\n🔹 گذشته مشخص: Past Simple",
            formula = "ترکیب زمان‌ها بر اساس موقعیت",
            examples = listOf(
                GrammarExample("I usually get up at 7, but today I'm getting up late.", "معمولاً ساعت ۷ بیدار می‌شوم، اما امروز دیر بیدار شده‌ام."),
                GrammarExample("I've been to Paris. I went there in 2018.", "من پاریس بوده‌ام. سال ۲۰۱۸ رفتم."),
                GrammarExample("She was cooking when her husband came home.", "وقتی شوهرش به خانه آمد، داشت آشپزی می‌کرد.")
            )
        ),

        // ============================================================
        // ==================== 📝 حرف تعریف ====================
        // ============================================================

        GrammarTopic(
            id = "g_articles",
            title = "Articles (a / an / the)",
            titlePersian = "حرف تعریف",
            category = "📝 حرف تعریف",
            explanation = "🔹 a/an = یک (نامعین، برای اولین بار)\n🔹 the = آن (معین، مشخص)\n🔹 بدون حرف تعریف: اسم‌های عام و جمع\n\n⚠️ an قبل از صداهای a, e, i, o, u یا صدای مصوت.",
            formula = "a + اسم با حرف بی‌صدا\nan + اسم با حرف صدادار\nthe + اسم مشخص\n∅ بدون حرف تعریف: اسم‌های عام",
            examples = listOf(
                GrammarExample("I have a book.", "یک کتاب دارم."),
                GrammarExample("She is an engineer.", "او یک مهندس است."),
                GrammarExample("The book on the table is mine.", "کتاب روی میز مال من است."),
                GrammarExample("Cats are cute. (عمومی)", "گربه‌ها بامزه‌اند."),
                GrammarExample("I like music. (بدون a/the)", "من موسیقی دوست دارم.")
            )
        ),

        GrammarTopic(
            id = "g_zero_article",
            title = "Zero Article",
            titlePersian = "بدون حرف تعریف",
            category = "📝 حرف تعریف",
            explanation = "در این مواقع حرف تعریف نمی‌آید:\n🔹 اسم‌های عام و جمع (Cats are pets)\n🔹 وعده‌های غذایی (have breakfast)\n🔹 زبان‌ها (I speak English)\n🔹 ورزش‌ها (play football)\n🔹 کشورها (I live in Iran)",
            formula = "بدون a/an/the قبل از:\nجمع، غیرقابل شمارش، وعده‌ها، زبان، ورزش، کشور",
            examples = listOf(
                GrammarExample("I speak English and Persian.", "من انگلیسی و فارسی صحبت می‌کنم."),
                GrammarExample("We had lunch at 1.", "ساعت ۱ ناهار خوردیم."),
                GrammarExample("She plays tennis.", "او تنیس بازی می‌کند."),
                GrammarExample("Water is essential for life.", "آب برای زندگی ضروری است.")
            )
        ),

        GrammarTopic(
            id = "g_the_geography",
            title = "The with Places",
            titlePersian = "the با مکان‌ها",
            category = "📝 حرف تعریف",
            explanation = "the قبل از:\n✅ رودها: the Nile\n✅ دریاها: the Caspian Sea\n✅ کوه‌ها (رشته): the Alborz\n✅ کشورهای جمع: the USA, the Netherlands\n❌ بدون the: Lake, Mountain, کشورهای مفرد",
            formula = "the + رود/دریا/رشته‌کوه/کشورهای جمع",
            examples = listOf(
                GrammarExample("The Caspian Sea is the largest lake.", "دریای خزر بزرگترین دریاچه است."),
                GrammarExample("I live in Iran, but I've been to the USA.", "من در ایران زندگی می‌کنم، اما آمریکا بوده‌ام."),
                GrammarExample("The Alborz mountains are beautiful.", "کوه‌های البرز زیبا هستند.")
            )
        ),

        // ============================================================
        // ==================== 📍 حروف اضافه ====================
        // ============================================================

        GrammarTopic(
            id = "g_prepositions_place",
            title = "Prepositions of Place",
            titlePersian = "حروف اضافه مکان",
            category = "📍 حروف اضافه",
            explanation = "🔹 in = داخل چیزی (in the room)\n🔹 on = روی سطح (on the table)\n🔹 at = نقطه‌ی مشخص (at the door)\n🔹 under = زیر\n🔹 over = بالای (بدون تماس)\n🔹 next to = کنار\n🔹 between = بین دو چیز\n🔹 behind = پشت\n🔹 in front of = جلوی\n🔹 near = نزدیک",
            formula = "in / on / at / under / over / next to / between / behind / in front of / near",
            examples = listOf(
                GrammarExample("The book is on the table.", "کتاب روی میز است."),
                GrammarExample("She is at home.", "او در خانه است."),
                GrammarExample("The cat is under the chair.", "گربه زیر صندلی است."),
                GrammarExample("The bank is next to the market.", "بانک کنار بازار است."),
                GrammarExample("The keys are in my pocket.", "کلیدها در جیبم است."),
                GrammarExample("The car is in front of the house.", "ماشین جلوی خانه است.")
            )
        ),

        GrammarTopic(
            id = "g_prepositions_time",
            title = "Prepositions of Time",
            titlePersian = "حروف اضافه زمان",
            category = "📍 حروف اضافه",
            explanation = "🔹 in = ماه/سال/فصل/بخش روز (in May, in 2020, in summer, in the morning)\n🔹 on = روز و تاریخ (on Monday, on 5th May)\n🔹 at = ساعت و شب (at 7, at night, at noon)\n\n⚠️ استثناها:\n• at night (نه in night)\n• in the morning/evening",
            formula = "in (ماه/سال/فصل)\non (روز/تاریخ)\nat (ساعت/شب)",
            examples = listOf(
                GrammarExample("I was born in 1990.", "من در سال ۱۹۹۰ به دنیا آمدم."),
                GrammarExample("The meeting is on Monday.", "جلسه روز دوشنبه است."),
                GrammarExample("I wake up at 7 AM.", "ساعت ۷ صبح بیدار می‌شوم."),
                GrammarExample("We go on holiday in summer.", "ما در تابستان به تعطیلات می‌رویم."),
                GrammarExample("The test is on 15th June.", "امتحان ۱۵ ژوئن است.")
            )
        ),

        GrammarTopic(
            id = "g_prepositions_movement",
            title = "Prepositions of Movement",
            titlePersian = "حروف اضافه حرکت",
            category = "📍 حروف اضافه",
            explanation = "🔹 to = به سمت\n🔹 from = از\n🔹 into = به داخل\n🔹 out of = از داخل\n🔹 through = از میان\n🔹 across = از عرض\n🔹 along = در طول\n🔹 over = از روی\n🔹 past = از کنار",
            formula = "to / from / into / out of / through / across / along / over / past",
            examples = listOf(
                GrammarExample("I'm going to the market.", "دارم می‌روم به بازار."),
                GrammarExample("She walked across the street.", "او از خیابان عبور کرد."),
                GrammarExample("He jumped into the pool.", "او به داخل استخر پرید."),
                GrammarExample("We drove through the tunnel.", "از تونل عبور کردیم.")
            )
        ),

        GrammarTopic(
            id = "g_phrasal_verbs",
            title = "Common Phrasal Verbs",
            titlePersian = "افعال عبارتی رایج",
            category = "📍 حروف اضافه",
            explanation = "افعال عبارتی = فعل + حرف اضافه، معنی جدید می‌سازند:\n\n🔹 get up = بیدار شدن\n🔹 look for = دنبال گشتن\n🔹 give up = تسلیم شدن\n🔹 put on = پوشیدن\n🔹 take off = درآوردن\n🔹 turn on = روشن کردن\n🔹 turn off = خاموش کردن",
            formula = "verb + preposition = معنی جدید",
            examples = listOf(
                GrammarExample("I get up at 7 every morning.", "هر روز صبح ساعت ۷ بیدار می‌شوم."),
                GrammarExample("She is looking for her keys.", "او دارد دنبال کلیدهایش می‌گردد."),
                GrammarExample("Don't give up! Keep trying.", "تسلیم نشو! ادامه بده."),
                GrammarExample("Turn off the lights, please.", "لطفاً چراغ‌ها را خاموش کن.")
            )
        ),

        // ============================================================
        // ==================== 🎯 صفت‌ها ====================
        // ============================================================

        GrammarTopic(
            id = "g_comparative",
            title = "Comparatives",
            titlePersian = "صفت‌های تفضیلی",
            category = "🎯 صفت‌ها",
            explanation = "برای مقایسه دو چیز:\n\n🔹 صفت کوتاه (۱ سیلاب): + er → taller\n🔹 صفت بلند (۲+ سیلاب): more + adj → more beautiful\n🔹 بی‌قاعده: good → better, bad → worse, far → farther",
            formula = "صفت کوتاه + er + than\nmore + صفت بلند + than",
            examples = listOf(
                GrammarExample("Ali is taller than Reza.", "علی از رضا بلندتر است."),
                GrammarExample("This book is more interesting than that one.", "این کتاب از آن یکی جالب‌تر است."),
                GrammarExample("My English is better than before.", "انگلیسی من از قبل بهتر است."),
                GrammarExample("Tehran is bigger than Isfahan.", "تهران از اصفهان بزرگ‌تر است.")
            )
        ),

        GrammarTopic(
            id = "g_superlative",
            title = "Superlatives",
            titlePersian = "صفت‌های عالی",
            category = "🎯 صفت‌ها",
            explanation = "برای مقایسه یک چیز با تمام چیزهای دیگر.\n\n🔹 صفت کوتاه: the + adj + est → the tallest\n🔹 صفت بلند: the most + adj → the most beautiful\n🔹 بی‌قاعده: good → best, bad → worst",
            formula = "the + صفت کوتاه + est\nthe most + صفت بلند",
            examples = listOf(
                GrammarExample("He is the tallest in the class.", "او بلندترین در کلاس است."),
                GrammarExample("This is the most beautiful city.", "این زیباترین شهر است."),
                GrammarExample("She is the best student.", "او بهترین دانش‌آموز است."),
                GrammarExample("It's the worst movie I've ever seen.", "این بدترین فیلمی است که دیده‌ام.")
            )
        ),

        GrammarTopic(
            id = "g_as_as",
            title = "As... as",
            titlePersian = "به‌اندازه‌ی...",
            category = "🎯 صفت‌ها",
            explanation = "برای نشان دادن برابری:\n✅ as + adj + as\n\nبرای نشان دادن عدم برابری:\n❌ not as + adj + as",
            formula = "as + صفت + as\nnot as + صفت + as",
            examples = listOf(
                GrammarExample("He is as tall as his father.", "او به قد پدرش است."),
                GrammarExample("This book is as interesting as that one.", "این کتاب به اندازه‌ی آن یکی جالبه."),
                GrammarExample("She is not as fast as her sister.", "او به سرعت خواهرش نیست.")
            )
        ),

        GrammarTopic(
            id = "g_adjective_order",
            title = "Order of Adjectives",
            titlePersian = "ترتیب صفت‌ها",
            category = "🎯 صفت‌ها",
            explanation = "وقتی چند صفت داریم، ترتیب زیر رعایت می‌شود:\n1️⃣ نظر: beautiful\n2️⃣ اندازه: big\n3️⃣ سن: old\n4️⃣ شکل: round\n5️⃣ رنگ: red\n6️⃣ ملیت: Iranian\n7️⃣ جنس: wooden\n\nمثال: a beautiful big old round red Iranian wooden table",
            formula = "نظر → اندازه → سن → شکل → رنگ → ملیت → جنس + اسم",
            examples = listOf(
                GrammarExample("A beautiful small old house", "یک خانه‌ی کوچک قدیمی زیبا"),
                GrammarExample("A nice big red car", "یک ماشین بزرگ قرمز قشنگ"),
                GrammarExample("Some delicious Iranian food", "غذای ایرانی خوشمزه")
            )
        ),

        // ============================================================
        // ==================== ⚡ افعال Modal ====================
        // ============================================================

        GrammarTopic(
            id = "g_modal_verbs",
            title = "Modal Verbs (Basic)",
            titlePersian = "افعال Modal پایه",
            category = "⚡ افعال Modal",
            explanation = "🔹 can = توانستن (توانایی)\n🔹 could = می‌توانستم (گذشته/مؤدبانه)\n🔹 must = باید (اجبار قوی)\n🔹 should = بهتر است (توصیه)\n🔹 may = ممکن است (احتمال/اجازه)\n🔹 have to = مجبور بودن (اجبار بیرونی)\n\n⚠️ بعد از modal فعل ساده می‌آید (بدون to).",
            formula = "modal + فعل ساده",
            examples = listOf(
                GrammarExample("I can swim.", "من می‌توانم شنا کنم."),
                GrammarExample("You must wear a seatbelt.", "باید کمربند ایمنی ببندی."),
                GrammarExample("You should see a doctor.", "بهتر است دکتر ببینی."),
                GrammarExample("It may rain tomorrow.", "ممکن است فردا باران ببارد."),
                GrammarExample("I have to work tomorrow.", "فردا مجبورم کار کنم.")
            )
        ),

        GrammarTopic(
            id = "g_modal_deduction",
            title = "Modals of Deduction",
            titlePersian = "افعال Modal استنباطی",
            category = "⚡ افعال Modal",
            explanation = "برای بیان حدس و گمان:\n\n✅ must be = قطعاً هست (مطمئن)\n🤔 might be = ممکن است باشد\n🤔 could be = شاید باشد\n❌ can't be = غیرممکن است\n\nمثال: The lights are on. He must be home.",
            formula = "must / might / could / can't + فعل ساده",
            examples = listOf(
                GrammarExample("The lights are on. He must be home.", "چراغ‌ها روشنه. باید خونه باشه."),
                GrammarExample("She might be at the office.", "شاید توی دفتر باشه."),
                GrammarExample("That can't be true!", "این نمی‌تونه درست باشه!"),
                GrammarExample("He could be studying now.", "ممکنه الان مشغول درس باشه.")
            )
        ),

        GrammarTopic(
            id = "g_should_have",
            title = "Should have / Could have",
            titlePersian = "پشیمانی و فرصت‌های از دست رفته",
            category = "⚡ افعال Modal",
            explanation = "برای حرف زدن درباره‌ی گذشته:\n\n🔹 should have + pp = باید انجام می‌دادی (ولی ندادی)\n🔹 could have + pp = می‌توانستی (ولی نکردی)\n🔹 might have + pp = ممکن بود انجام داده باشی\n\n⚠️ بعد از این افعال، past participle (شکل سوم) می‌آید.",
            formula = "should/could/might + have + past participle",
            examples = listOf(
                GrammarExample("I should have studied harder.", "باید بیشتر درس می‌خواندم."),
                GrammarExample("You could have told me earlier.", "می‌توانستی زودتر به من بگویی."),
                GrammarExample("She might have missed the bus.", "ممکن است اتوبوس را از دست داده باشد."),
                GrammarExample("We shouldn't have left so early.", "نباید این‌قدر زود می‌رفتیم.")
            )
        ),

        GrammarTopic(
            id = "g_modals_ability_permission",
            title = "Ability & Permission",
            titlePersian = "توانایی و اجازه",
            category = "⚡ افعال Modal",
            explanation = "🔹 can = توانایی در حال\n🔹 could = توانایی در گذشته\n🔹 be able to = قادر بودن (در همه زمان‌ها)\n🔹 may/can I = اجازه خواستن\n🔹 be allowed to = اجازه داشتن",
            formula = "can / could / be able to / may / be allowed to",
            examples = listOf(
                GrammarExample("I can play piano.", "من می‌توانم پیانو بزنم."),
                GrammarExample("When I was young, I could run fast.", "وقتی جوان بودم، می‌توانستم سریع بدوم."),
                GrammarExample("May I come in?", "اجازه هست وارد شوم؟"),
                GrammarExample("You are not allowed to smoke here.", "اجازه نداری اینجا سیگار بکشی.")
            )
        ),

        // ============================================================
        // ==================== 🔀 جملات شرطی ====================
        // ============================================================

        GrammarTopic(
            id = "g_zero_conditional",
            title = "Zero Conditional",
            titlePersian = "شرطی نوع صفر (حقایق)",
            category = "🔀 جملات شرطی",
            explanation = "برای حقایق کلی و قوانین طبیعی.",
            formula = "If + present simple, present simple",
            examples = listOf(
                GrammarExample("If you heat water to 100°C, it boils.", "اگر آب را تا ۱۰۰ درجه گرم کنی، می‌جوشد."),
                GrammarExample("If I don't sleep, I feel tired.", "اگر نخوابم، خسته می‌شوم."),
                GrammarExample("If it rains, the ground gets wet.", "اگر باران ببارد، زمین خیس می‌شود.")
            )
        ),

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
                GrammarExample("If we leave now, we will catch the bus.", "اگر الان برویم، اتوبوس را می‌گیریم."),
                GrammarExample("She will call you if she has time.", "اگر وقت داشته باشد بهت زنگ می‌زند.")
            )
        ),

        GrammarTopic(
            id = "g_second_conditional",
            title = "Second Conditional",
            titlePersian = "شرطی نوع دوم (خیالی)",
            category = "🔀 جملات شرطی",
            explanation = "برای موقعیت‌های خیالی و غیرواقعی در حال.\n\n⚠️ با were (نه was) برای همه ضمایر:\nIf I were you...",
            formula = "If + past simple, would + verb",
            examples = listOf(
                GrammarExample("If I were rich, I would travel the world.", "اگر ثروتمند بودم، دور دنیا سفر می‌کردم."),
                GrammarExample("If I had time, I would help you.", "اگر وقت داشتم، کمکت می‌کردم."),
                GrammarExample("If I were you, I would apologize.", "جای تو بودم، عذرخواهی می‌کردم."),
                GrammarExample("What would you do if you won the lottery?", "اگر لاتاری برنده می‌شدی، چیکار می‌کردی؟")
            )
        ),

        GrammarTopic(
            id = "g_third_conditional",
            title = "Third Conditional",
            titlePersian = "شرطی نوع سوم (پشیمانی)",
            category = "🔀 جملات شرطی",
            explanation = "برای موقعیت‌های خیالی در گذشته که اتفاق نیفتادند.\n\nمعمولاً برای بیان پشیمانی استفاده می‌شود.",
            formula = "If + had + past participle, would have + past participle",
            examples = listOf(
                GrammarExample("If I had studied, I would have passed.", "اگر درس خوانده بودم، قبول شده بودم."),
                GrammarExample("If she had left earlier, she wouldn't have missed the train.", "اگر زودتر رفته بود، قطار را از دست نمی‌داد."),
                GrammarExample("If we had known, we would have helped.", "اگر می‌دانستیم، کمک می‌کردیم.")
            )
        ),

        // ============================================================
        // ==================== 🔄 مجهول ====================
        // ============================================================

        GrammarTopic(
            id = "g_passive_voice",
            title = "Passive Voice",
            titlePersian = "جملات مجهول",
            category = "🔄 مجهول",
            explanation = "وقتی فاعل مهم نیست یا نمی‌خواهیم ذکر کنیم.\n\n🔹 حال ساده: is/are + p.p.\n🔹 گذشته: was/were + p.p.\n🔹 حال کامل: has/have been + p.p.\n🔹 آینده: will be + p.p.",
            formula = "be + past participle",
            examples = listOf(
                GrammarExample("The book was written by a famous author.", "کتاب توسط یک نویسنده معروف نوشته شد."),
                GrammarExample("English is spoken all over the world.", "انگلیسی در سراسر جهان صحبت می‌شود."),
                GrammarExample("The bridge was built in 1990.", "پل در سال ۱۹۹۰ ساخته شد."),
                GrammarExample("The letter has been sent.", "نامه فرستاده شده است."),
                GrammarExample("The project will be finished next week.", "پروژه هفته‌ی آینده تمام می‌شود.")
            )
        ),

        GrammarTopic(
            id = "g_passive_all_tenses",
            title = "Passive in All Tenses",
            titlePersian = "مجهول در همه زمان‌ها",
            category = "🔄 مجهول",
            explanation = "🔹 Present Continuous: is/are being + p.p.\n🔹 Past Continuous: was/were being + p.p.\n🔹 Past Perfect: had been + p.p.\n🔹 Modal: modal + be + p.p.",
            formula = "be (به زمان مناسب) + p.p.",
            examples = listOf(
                GrammarExample("The road is being repaired.", "جاده دارد تعمیر می‌شود."),
                GrammarExample("The car was being washed.", "ماشین داشت شسته می‌شد."),
                GrammarExample("The work had been done before I arrived.", "کار قبل از رسیدن من انجام شده بود."),
                GrammarExample("The rules must be followed.", "قوانین باید رعایت شوند.")
            )
        ),

        GrammarTopic(
            id = "g_causative",
            title = "Causative (Have something done)",
            titlePersian = "مسبب (کاری را برایت انجام دهند)",
            category = "🔄 مجهول",
            explanation = "وقتی کسی برای ما کاری انجام می‌دهد:\n\n🔹 have + مفعول + p.p.\n🔹 get + مفعول + p.p.\n\nمثال: I had my hair cut. (آرایشگر موهایم را کوتاه کرد)",
            formula = "have/get + مفعول + past participle",
            examples = listOf(
                GrammarExample("I had my hair cut yesterday.", "دیروز موهایم را کوتاه کردم."),
                GrammarExample("She gets her nails done every week.", "هر هفته ناخن‌هایش را درست می‌کند."),
                GrammarExample("We had our house painted last month.", "ماه پیش خانه‌مان را رنگ کردیم."),
                GrammarExample("He needs to get his car fixed.", "او باید ماشینش را تعمیر کند.")
            )
        ),

        // ============================================================
        // ==================== 💬 نقل قول ====================
        // ============================================================

        GrammarTopic(
            id = "g_reported_speech",
            title = "Reported Speech",
            titlePersian = "نقل قول غیرمستقیم",
            category = "💬 نقل قول",
            explanation = "وقتی حرف کسی را برای نفر سوم نقل می‌کنیم.\n\nتغییر زمان:\npresent → past\npast → past perfect\nwill → would\ncan → could\n\nتغییر ضمایر:\nI → he/she\nmy → his/her",
            formula = "She said (that) + جمله با یک زمان عقب‌تر",
            examples = listOf(
                GrammarExample("Direct: She said, \"I am busy.\"", "او گفت: «من مشغولم.»"),
                GrammarExample("Reported: She said she was busy.", "او گفت که مشغول است."),
                GrammarExample("Direct: He said, \"I will come.\"", "او گفت: «خواهم آمد.»"),
                GrammarExample("Reported: He said he would come.", "او گفت که خواهد آمد.")
            )
        ),

        GrammarTopic(
            id = "g_say_tell",
            title = "Say vs Tell",
            titlePersian = "say و tell",
            category = "💬 نقل قول",
            explanation = "🔹 say = گفتن (بدون مفعول شخصی)\n🔹 tell = گفتن (با مفعول شخصی)\n\n✅ She said (that) she was tired.\n✅ She told me (that) she was tired.\n❌ She said me...",
            formula = "say + (that) + جمله\ntell + شخص + (that) + جمله",
            examples = listOf(
                GrammarExample("He said he was tired.", "او گفت خسته است."),
                GrammarExample("He told me he was tired.", "او به من گفت خسته است."),
                GrammarExample("She said, \"I love you.\"", "او گفت: «دوستت دارم.»"),
                GrammarExample("She told him to leave.", "او به او گفت برود.")
            )
        ),

        // ============================================================
        // ==================== 🔁 قیدها ====================
        // ============================================================

        GrammarTopic(
            id = "g_adverbs_frequency",
            title = "Adverbs of Frequency",
            titlePersian = "قیدهای تکرار",
            category = "🔁 قیدها",
            explanation = "always (همیشه ۱۰۰٪)\nusually (معمولاً ۹۰٪)\noften (غالباً ۷۰٪)\nsometimes (بعضی وقت‌ها ۵۰٪)\nrarely (به‌ندرت ۱۰٪)\nnever (هرگز ۰٪)\n\nجای قید:\n✅ قبل از فعل اصلی\n✅ بعد از فعل to be",
            formula = "subject + adverb + verb\nsubject + be + adverb",
            examples = listOf(
                GrammarExample("I always wake up at 7.", "همیشه ساعت ۷ بیدار می‌شوم."),
                GrammarExample("She is usually late.", "او معمولاً دیر می‌آید."),
                GrammarExample("They never eat fast food.", "آن‌ها هرگز فست‌فود نمی‌خورند."),
                GrammarExample("We sometimes go to the cinema.", "ما گاهی سینما می‌رویم.")
            )
        ),

        GrammarTopic(
            id = "g_adverbs_manner",
            title = "Adverbs of Manner",
            titlePersian = "قیدهای حالت",
            category = "🔁 قیدها",
            explanation = "چگونگی انجام کار را نشان می‌دهند:\n\n🔹 صفت + ly = قید\n• quick → quickly\n• careful → carefully\n• happy → happily\n\nاستثناها:\n• good → well\n• fast → fast\n• hard → hard",
            formula = "صفت + ly",
            examples = listOf(
                GrammarExample("She speaks English fluently.", "او روان انگلیسی صحبت می‌کند."),
                GrammarExample("He drives carefully.", "او با احتیاط رانندگی می‌کند."),
                GrammarExample("They worked hard all day.", "آن‌ها تمام روز سخت کار کردند."),
                GrammarExample("She sings beautifully.", "او زیبا آواز می‌خواند.")
            )
        ),

        GrammarTopic(
            id = "g_adverbs_time_place",
            title = "Adverbs of Time & Place",
            titlePersian = "قیدهای زمان و مکان",
            category = "🔁 قیدها",
            explanation = "🔹 زمان: now, then, today, yesterday, tomorrow, soon\n🔹 مکان: here, there, everywhere, nowhere, somewhere\n\nترتیب: manner → place → time\nShe sang beautifully here yesterday.",
            formula = "manner + place + time",
            examples = listOf(
                GrammarExample("I will see you tomorrow.", "فردا می‌بینمت."),
                GrammarExample("She is here now.", "او الان اینجاست."),
                GrammarExample("We looked everywhere.", "همه جا را گشتیم."),
                GrammarExample("They arrived late yesterday.", "آن‌ها دیروز دیر رسیدند.")
            )
        ),

        // ============================================================
        // ==================== 🏠 ساختار جمله ====================
        // ============================================================

        GrammarTopic(
            id = "g_there_is_are",
            title = "There is / There are",
            titlePersian = "وجود داشتن",
            category = "🏠 ساختار جمله",
            explanation = "برای گفتن اینکه چیزی وجود دارد.\n\n✅ There is + مفرد\n✅ There are + جمع\n\nسوال: Is there...? / Are there...?\nمنفی: isn't / aren't",
            formula = "There is + اسم مفرد\nThere are + اسم جمع",
            examples = listOf(
                GrammarExample("There is a book on the table.", "یک کتاب روی میز است."),
                GrammarExample("There are twenty students.", "بیست دانش‌آموز هستند."),
                GrammarExample("Is there a bank near here?", "بانکی این نزدیکی هست؟"),
                GrammarExample("There aren't any apples.", "هیچ سیبی نیست."),
                GrammarExample("How many people are there?", "چند نفر آنجا هستند؟")
            )
        ),

        GrammarTopic(
            id = "g_question_words",
            title = "Question Words (WH-)",
            titlePersian = "کلمات پرسشی",
            category = "🏠 ساختار جمله",
            explanation = "🔹 What = چه\n🔹 Where = کجا\n🔹 When = کِی\n🔹 Who = چه کسی\n🔹 Why = چرا\n🔹 How = چطور\n🔹 Which = کدام\n🔹 Whose = مال چه کسی",
            formula = "WH + auxiliary + فاعل + فعل?",
            examples = listOf(
                GrammarExample("What is your name?", "اسمت چیه؟"),
                GrammarExample("Where do you live?", "کجا زندگی می‌کنی؟"),
                GrammarExample("When does it start?", "کِی شروع می‌شه؟"),
                GrammarExample("Who is that man?", "آن مرد کیست؟"),
                GrammarExample("Why are you late?", "چرا دیر کردی؟")
            )
        ),

        GrammarTopic(
            id = "g_yes_no_questions",
            title = "Yes/No Questions",
            titlePersian = "سوالات بله/خیر",
            category = "🏠 ساختار جمله",
            explanation = "قاعده: فعل کمکی + فاعل + فعل اصلی؟\n\n🔹 be: Are you...? / Is she...?\n🔹 do: Do you...? / Does he...?\n🔹 have: Have you...? / Has she...?\n🔹 modal: Can you...? / Will you...?",
            formula = "Auxiliary + Subject + Verb?",
            examples = listOf(
                GrammarExample("Are you a teacher?", "آیا تو معلمی؟"),
                GrammarExample("Do you speak English?", "انگلیسی صحبت می‌کنی؟"),
                GrammarExample("Have you been to Paris?", "پاریس بوده‌ای؟"),
                GrammarExample("Can you help me?", "می‌توانی کمکم کنی؟")
            )
        ),

        GrammarTopic(
            id = "g_question_tags",
            title = "Question Tags",
            titlePersian = "سوالات تکمیلی",
            category = "🏠 ساختار جمله",
            explanation = "به انتهای جمله اضافه می‌شود:\n\n✅ جمله مثبت → tag منفی\nYou are tired, aren't you?\n\n✅ جمله منفی → tag مثبت\nShe isn't here, is she?",
            formula = "جمله مثبت + tag منفی\nجمله منفی + tag مثبت",
            examples = listOf(
                GrammarExample("You are tired, aren't you?", "خسته‌ای، نه؟"),
                GrammarExample("She isn't here, is she?", "او اینجا نیست، هست؟"),
                GrammarExample("They can swim, can't they?", "آن‌ها می‌توانند شنا کنند، نه؟"),
                GrammarExample("You didn't call, did you?", "زنگ نزدی، زدی؟")
            )
        ),

        GrammarTopic(
            id = "g_conjunctions",
            title = "Conjunctions",
            titlePersian = "حروف ربط",
            category = "🏠 ساختار جمله",
            explanation = "🔹 and = و\n🔹 but = اما\n🔹 or = یا\n🔹 so = بنابراین\n🔹 because = چون\n🔹 although = اگرچه\n🔹 while = در حالی که\n🔹 when = وقتی",
            formula = "جمله + conjunction + جمله",
            examples = listOf(
                GrammarExample("I like tea and coffee.", "چای و قهوه دوست دارم."),
                GrammarExample("She is smart but lazy.", "او باهوشه اما تنبل."),
                GrammarExample("I stayed home because it was raining.", "خانه ماندم چون باران می‌بارید."),
                GrammarExample("Although he was tired, he continued.", "اگرچه خسته بود، ادامه داد.")
            )
        ),

        GrammarTopic(
            id = "g_imperatives",
            title = "Imperatives",
            titlePersian = "جملات امری",
            category = "🏠 ساختار جمله",
            explanation = "برای دستور، درخواست یا راهنمایی:\n\n✅ مثبت: فعل ساده\n✅ منفی: Don't + فعل\n\n⚠️ فاعل (you) حذف می‌شود.",
            formula = "فعل ساده (بدون فاعل)\nDon't + فعل ساده",
            examples = listOf(
                GrammarExample("Close the door, please.", "لطفاً در را ببند."),
                GrammarExample("Don't touch that!", "به آن دست نزن!"),
                GrammarExample("Turn left at the corner.", "سر نبش بپیچ چپ."),
                GrammarExample("Be careful!", "مواظب باش!")
            )
        ),

        // ============================================================
        // ==================== 📅 عادت‌های گذشته ====================
        // ============================================================

        GrammarTopic(
            id = "g_used_to",
            title = "Used to",
            titlePersian = "عادت‌های گذشته",
            category = "📅 عادت‌های گذشته",
            explanation = "برای عادت‌ها یا حالاتی که در گذشته بود ولی الان نیست.\n\n🔹 used to + فعل ساده\n\nمنفی: didn't use to\nسوال: Did you use to...?",
            formula = "used to + فعل ساده",
            examples = listOf(
                GrammarExample("I used to play football.", "قبلاً فوتبال بازی می‌کردم."),
                GrammarExample("She used to live in London.", "او قبلاً در لندن زندگی می‌کرد."),
                GrammarExample("I didn't use to like coffee.", "قبلاً قهوه دوست نداشتم."),
                GrammarExample("Did you use to smoke?", "قبلاً سیگار می‌کشیدی؟")
            )
        ),

        GrammarTopic(
            id = "g_be_used_to",
            title = "Be used to / Get used to",
            titlePersian = "عادت داشتن به",
            category = "📅 عادت‌های گذشته",
            explanation = "🔹 be used to + ing = عادت داشتن (الان)\n🔹 get used to + ing = عادت کردن (روند)\n\n⚠️ با used to (بدون be) اشتباه نشود!",
            formula = "be/get used to + verb-ing",
            examples = listOf(
                GrammarExample("I am used to waking up early.", "عادت دارم زود بیدار شوم."),
                GrammarExample("She is getting used to the new job.", "او دارد به شغل جدید عادت می‌کند."),
                GrammarExample("They are used to living in cold weather.", "آن‌ها به زندگی در هوای سرد عادت دارند.")
            )
        ),

        // ============================================================
        // ==================== 🔤 ساختار فعل ====================
        // ============================================================

        GrammarTopic(
            id = "g_gerund_infinitive",
            title = "Gerunds and Infinitives",
            titlePersian = "gerund و infinitive",
            category = "🔤 ساختار فعل",
            explanation = "بعضی افعال با ing می‌آیند و بعضی با to:\n\n🔹 enjoy, avoid, finish, mind + ing\n🔹 want, decide, hope, plan + to\n🔹 like, love, hate + هر دو\n\nتفاوت معنی:\n• stop smoking = ترک سیگار\n• stop to smoke = ایستادن برای سیگار",
            formula = "verb + ing\nverb + to + فعل ساده",
            examples = listOf(
                GrammarExample("I enjoy reading books.", "از خواندن کتاب لذت می‌برم."),
                GrammarExample("She wants to learn English.", "او می‌خواهد انگلیسی یاد بگیرد."),
                GrammarExample("They decided to stay home.", "آن‌ها تصمیم گرفتند خانه بمانند."),
                GrammarExample("Avoid eating too much sugar.", "از خوردن شکر زیاد پرهیز کن."),
                GrammarExample("I hope to see you soon.", "امیدوارم به‌زودی ببینمت.")
            )
        ),

        GrammarTopic(
            id = "g_wish_if_only",
            title = "Wish / If only",
            titlePersian = "آرزو کردن",
            category = "🔤 ساختار فعل",
            explanation = "🔹 wish + past simple = آرزو در حال\n🔹 wish + past perfect = پشیمانی در گذشته\n🔹 wish + would = شکایت از رفتار\n\nIf only = ای کاش (تأکید بیشتر)",
            formula = "wish + past simple\nwish + past perfect\nwish + would",
            examples = listOf(
                GrammarExample("I wish I were rich.", "کاش ثروتمند بودم."),
                GrammarExample("I wish I had studied harder.", "کاش بیشتر درس خوانده بودم."),
                GrammarExample("I wish it would stop raining.", "کاش باران بند می‌آمد."),
                GrammarExample("If only I knew the answer!", "ای کاش جواب را می‌دانستم!")
            )
        ),

        GrammarTopic(
            id = "g_relative_clauses",
            title = "Relative Clauses",
            titlePersian = "جملات موصولی",
            category = "🔤 ساختار فعل",
            explanation = "🔹 who = برای افراد\n🔹 which = برای اشیا\n🔹 that = برای هر دو (غیررسمی)\n🔹 whose = مالکیت\n🔹 where = مکان\n\nمثال: The man who lives next door is a doctor.",
            formula = "اسم + who/which/that/whose/where + جمله",
            examples = listOf(
                GrammarExample("The man who lives next door is a doctor.", "مردی که کنار ما زندگی می‌کند دکتر است."),
                GrammarExample("This is the book which I told you about.", "این همان کتابی است که درباره‌اش بهت گفتم."),
                GrammarExample("That's the girl whose father is a pilot.", "این همان دختریه که پدرش خلبانه."),
                GrammarExample("The city where I was born is small.", "شهری که در آن به دنیا آمدم کوچک است.")
            )
        ),

        // ============================================================
        // ==================== 🎓 پیشرفته ====================
        // ============================================================

        GrammarTopic(
            id = "g_inversion",
            title = "Inversion (Advanced)",
            titlePersian = "وارونگی (پیشرفته)",
            category = "🎓 پیشرفته",
            explanation = "وقتی جمله با قید منفی شروع شود، فعل کمکی قبل از فاعل می‌آید:\n\n🔹 Never have I seen such a thing.\n🔹 Rarely does he speak.\n🔹 Not only did she sing, but she also danced.",
            formula = "قید منفی + auxiliary + subject + verb",
            examples = listOf(
                GrammarExample("Never have I seen such beauty.", "هرگز چنین زیبایی ندیده‌ام."),
                GrammarExample("Rarely does she make mistakes.", "به‌ندرت اشتباه می‌کند."),
                GrammarExample("Not only did he apologize, but he also paid.", "نه تنها عذرخواهی کرد، بلکه پول هم داد.")
            )
        ),

        GrammarTopic(
            id = "g_cleft_sentences",
            title = "Cleft Sentences",
            titlePersian = "جملات تأکیدی",
            category = "🎓 پیشرفته",
            explanation = "برای تأکید روی بخشی از جمله:\n\n🔹 It is/was + ... + that/who\n🔹 What + clause + is/was\n\nمثال: It was John who broke the window.",
            formula = "It + be + ... + that/who\nWhat + clause + be + ...",
            examples = listOf(
                GrammarExample("It was John who broke the window.", "این جان بود که پنجره را شکست."),
                GrammarExample("What I need is a vacation.", "چیزی که لازم دارم تعطیلاته."),
                GrammarExample("It is English that I want to learn.", "چیزی که می‌خوام یاد بگیرم انگلیسیه.")
            )
        ),

        GrammarTopic(
            id = "g_subjunctive",
            title = "Subjunctive",
            titlePersian = "وجه التزامی",
            category = "🎓 پیشرفته",
            explanation = "بعد از افعالی مثل suggest, recommend, insist, demand:\n\n🔹 I suggest that he be here.\n🔹 She insisted that he leave.\n\n⚠️ فعل بدون s و بدون to می‌آید.",
            formula = "verb (suggest/insist/etc) + that + subject + base verb",
            examples = listOf(
                GrammarExample("I suggest that he be more careful.", "پیشنهاد می‌کنم بیشتر مراقب باشد."),
                GrammarExample("She insisted that he leave immediately.", "اصرار کرد که فوراً برود."),
                GrammarExample("It's essential that everyone be present.", "ضروری است که همه حاضر باشند.")
            )
        ),

        GrammarTopic(
            id = "g_participle_clauses",
            title = "Participle Clauses",
            titlePersian = "جملات وجه وصفی",
            category = "🎓 پیشرفته",
            explanation = "برای کوتاه کردن جملات:\n\n🔹 Present participle (-ing):\nWalking home, I saw a friend.\n(= While I was walking home...)\n\n🔹 Past participle (-ed):\nWritten in 1990, the book is famous.",
            formula = "verb-ing/verb-ed + جمله اصلی",
            examples = listOf(
                GrammarExample("Walking home, I saw a friend.", "در راه خانه، دوستی را دیدم."),
                GrammarExample("Having finished dinner, we went out.", "بعد از تمام کردن شام، بیرون رفتیم."),
                GrammarExample("Written in 1990, the book is famous.", "کتاب که در ۱۹۹۰ نوشته شد، معروف است.")
            )
        ),

        GrammarTopic(
            id = "g_conditionals_mixed",
            title = "Mixed Conditionals",
            titlePersian = "شرطی‌های ترکیبی",
            category = "🎓 پیشرفته",
            explanation = "ترکیب شرطی نوع دوم و سوم:\n\n🔹 If + past perfect, would + verb (گذشته → حال)\n🔹 If + past simple, would have + pp (حال → گذشته)\n\nمثال: If I had studied medicine, I would be a doctor now.",
            formula = "شرطی نوع ۳ + نتیجه نوع ۲\nشرطی نوع ۲ + نتیجه نوع ۳",
            examples = listOf(
                GrammarExample("If I had studied medicine, I would be a doctor now.", "اگر پزشکی خوانده بودم، الان دکتر بودم."),
                GrammarExample("If I were rich, I would have bought that house.", "اگر ثروتمند بودم، آن خانه را خریده بودم.")
            )
        ),

        GrammarTopic(
            id = "g_ellipsis",
            title = "Ellipsis & Substitution",
            titlePersian = "حذف و جانشینی",
            category = "🎓 پیشرفته",
            explanation = "در مکالمات طبیعی، بخش‌هایی از جمله حذف می‌شود:\n\n🔹 (Have you) Seen this movie? — Yes, I have.\n🔹 I love pizza. — So do I.\n🔹 She's tired. — I am too.",
            formula = "حذف اجزای تکراری",
            examples = listOf(
                GrammarExample("Seen this movie? (Have you...)", "این فیلم رو دیدی؟"),
                GrammarExample("I love pizza. — So do I.", "پیتزا دوست دارم. — منم همینطور."),
                GrammarExample("She's tired. — I am too.", "خسته‌ست. — منم همینطور.")
            )
        ),

        GrammarTopic(
            id = "g_formal_informal",
            title = "Formal vs Informal",
            titlePersian = "رسمی و غیررسمی",
            category = "🎓 پیشرفته",
            explanation = "🔹 Informal: contractions (I'm, don't) + phrasal verbs\n🔹 Formal: no contractions + Latinate verbs\n\nمثال:\n• Informal: I'm gonna find out.\n• Formal: I will investigate.",
            formula = "Formal: ساختار رسمی\nInformal: ساختار ساده و محاوره‌ای",
            examples = listOf(
                GrammarExample("Informal: Hey, what's up?", "غیررسمی: سلام، چه خبر؟"),
                GrammarExample("Formal: Good morning, how are you?", "رسمی: صبح بخیر، حال شما چطور است؟"),
                GrammarExample("Informal: I wanna go.", "غیررسمی: می‌خوام برم."),
                GrammarExample("Formal: I would like to go.", "رسمی: مایلم بروم.")
            )
        ),

        GrammarTopic(
            id = "g_discourse_markers",
            title = "Discourse Markers",
            titlePersian = "نشانگرهای کلامی",
            category = "🎓 پیشرفته",
            explanation = "برای ربط منطقی بین ایده‌ها:\n\n🔹 However = با این حال\n🔹 Therefore = بنابراین\n🔹 Moreover = علاوه بر این\n🔹 Nevertheless = با این وجود\n🔹 In conclusion = در نتیجه\n🔹 On the other hand = از طرف دیگر",
            formula = "نشانگر + کاما + جمله",
            examples = listOf(
                GrammarExample("However, I disagree with your point.", "با این حال، با نظر شما مخالفم."),
                GrammarExample("Therefore, we must act now.", "بنابراین، باید الان اقدام کنیم."),
                GrammarExample("On the other hand, it could work.", "از طرف دیگر، ممکنه جواب بده."),
                GrammarExample("Moreover, the cost is reasonable.", "علاوه بر این، هزینه منطقیه.")
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