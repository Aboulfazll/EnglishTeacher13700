package com.example.englishteacher.data

data class DailySentence(
    val id: String,
    val english: String,
    val persian: String
)

data class SentenceCategory(
    val id: String,
    val title: String,
    val titlePersian: String,
    val emoji: String,
    val color: Long,
    val sentences: List<DailySentence>
)

object DailySentencesRepository {

    fun getAllCategories(): List<SentenceCategory> = listOf(

        // ==================== ۱. سلام و احوال‌پرسی ====================
        SentenceCategory(
            id = "greetings",
            title = "Greetings",
            titlePersian = "سلام و احوال‌پرسی",
            emoji = "👋",
            color = 0xFF11998E,
            sentences = listOf(
                DailySentence("g1", "Hello!", "سلام!"),
                DailySentence("g2", "Hi, how are you?", "سلام، حالت چطوره؟"),
                DailySentence("g3", "Good morning!", "صبح بخیر!"),
                DailySentence("g4", "Good afternoon!", "بعدازظهر بخیر!"),
                DailySentence("g5", "Good evening!", "عصر بخیر!"),
                DailySentence("g6", "Good night!", "شب بخیر!"),
                DailySentence("g7", "How have you been?", "چطور بودی این مدت؟"),
                DailySentence("g8", "Long time no see!", "خیلی وقت بود ندیدمت!"),
                DailySentence("g9", "What's up?", "چه خبر؟"),
                DailySentence("g10", "How's it going?", "اوضاع چطوره؟"),
                DailySentence("g11", "Nice to meet you.", "از آشنایی با شما خوشحالم."),
                DailySentence("g12", "It's a pleasure to meet you.", "افتخار آشنایی با شماست."),
                DailySentence("g13", "I'm fine, thanks.", "خوبم، ممنون."),
                DailySentence("g14", "Not bad, thanks.", "بد نیستم، ممنون."),
                DailySentence("g15", "How's your family?", "خانواده‌ات چطورن؟")
            )
        ),

        // ==================== ۲. تشکر و قدردانی ====================
        SentenceCategory(
            id = "thanks",
            title = "Thanks & Gratitude",
            titlePersian = "تشکر و قدردانی",
            emoji = "🙏",
            color = 0xFF8E2DE2,
            sentences = listOf(
                DailySentence("t1", "Thank you.", "متشکرم."),
                DailySentence("t2", "Thanks a lot.", "خیلی ممنون."),
                DailySentence("t3", "Thank you so much.", "بسیار سپاسگزارم."),
                DailySentence("t4", "Thanks a million.", "هزار ممنون."),
                DailySentence("t5", "I really appreciate it.", "واقعاً قدردانی می‌کنم."),
                DailySentence("t6", "That's so kind of you.", "این خیلی از شما لطفه."),
                DailySentence("t7", "You're so thoughtful.", "شما خیلی با ملاحظه‌اید."),
                DailySentence("t8", "I'm so grateful.", "خیلی سپاسگزارم."),
                DailySentence("t9", "You're the best.", "تو بهترینی."),
                DailySentence("t10", "Thanks for your help.", "ممنون از کمکت."),
                DailySentence("t11", "Thanks for everything.", "ممنون از همه چیز."),
                DailySentence("t12", "You saved my day.", "روزم را نجات دادی."),
                DailySentence("t13", "I owe you one.", "بهت مدیونم."),
                DailySentence("t14", "That means a lot to me.", "این برای من خیلی ارزشمنده."),
                DailySentence("t15", "You didn't have to do that.", "لازم نبود این کار را بکنی.")
            )
        ),

        // ==================== ۳. عذرخواهی ====================
        SentenceCategory(
            id = "apology",
            title = "Apology",
            titlePersian = "عذرخواهی",
            emoji = "😔",
            color = 0xFFF12711,
            sentences = listOf(
                DailySentence("a1", "I'm sorry.", "متأسفم."),
                DailySentence("a2", "I'm so sorry.", "خیلی متأسفم."),
                DailySentence("a3", "Please forgive me.", "لطفاً من را ببخش."),
                DailySentence("a4", "I apologize.", "عذرخواهی می‌کنم."),
                DailySentence("a5", "My apologies.", "پوزش می‌طلبم."),
                DailySentence("a6", "It was my fault.", "تقصیر من بود."),
                DailySentence("a7", "I didn't mean to.", "قصدی نداشتم."),
                DailySentence("a8", "I didn't mean to hurt you.", "قصد نداشتم ناراحتت کنم."),
                DailySentence("a9", "Please don't be angry.", "لطفاً عصبانی نشو."),
                DailySentence("a10", "It won't happen again.", "دوباره اتفاق نمی‌افته."),
                DailySentence("a11", "I feel terrible about it.", "خیلی از این بابت ناراحتم."),
                DailySentence("a12", "Can you forgive me?", "می‌تونی منو ببخشی؟"),
                DailySentence("a13", "I'm really sorry for the trouble.", "بابت زحمتی که دادم خیلی متأسفم."),
                DailySentence("a14", "Excuse me.", "ببخشید."),
                DailySentence("a15", "Sorry for being late.", "بابت تأخیر متأسفم.")
            )
        ),

        // ==================== ۴. خداحافظی ====================
        SentenceCategory(
            id = "goodbye",
            title = "Goodbye",
            titlePersian = "خداحافظی",
            emoji = "🖐️",
            color = 0xFF3949AB,
            sentences = listOf(
                DailySentence("gb1", "Goodbye!", "خداحافظ!"),
                DailySentence("gb2", "Bye!", "بای!"),
                DailySentence("gb3", "See you later.", "بعداً می‌بینمت."),
                DailySentence("gb4", "See you tomorrow.", "فردا می‌بینمت."),
                DailySentence("gb5", "See you soon.", "به‌زودی می‌بینمت."),
                DailySentence("gb6", "Take care.", "مواظب خودت باش."),
                DailySentence("gb7", "Have a nice day.", "روز خوبی داشته باشی."),
                DailySentence("gb8", "Have a good weekend.", "آخر هفته خوبی داشته باشی."),
                DailySentence("gb9", "Good luck!", "موفق باشی!"),
                DailySentence("gb10", "Take it easy.", "خودت رو زیاد سخت نگیر."),
                DailySentence("gb11", "It was nice talking to you.", "از صحبت با تو خوشحال شدم."),
                DailySentence("gb12", "Keep in touch.", "در تماس باش."),
                DailySentence("gb13", "Say hi to your family.", "به خانوادت سلام برسون."),
                DailySentence("gb14", "Have a safe trip.", "سفر بی‌خطری داشته باشی."),
                DailySentence("gb15", "I'll see you around.", "می‌بینمت.")
            )
        ),

        // ==================== ۵. در رستوران ====================
        SentenceCategory(
            id = "restaurant",
            title = "At the Restaurant",
            titlePersian = "در رستوران",
            emoji = "🍽️",
            color = 0xFFE91E63,
            sentences = listOf(
                DailySentence("r1", "A table for two, please.", "یه میز برای دو نفر، لطفاً."),
                DailySentence("r2", "Can I see the menu?", "می‌تونم منو رو ببینم؟"),
                DailySentence("r3", "What do you recommend?", "چی پیشنهاد می‌کنید؟"),
                DailySentence("r4", "I'll have the chicken.", "من مرغ می‌خورم."),
                DailySentence("r5", "I'd like a coffee, please.", "یه قهوه می‌خوام، لطفاً."),
                DailySentence("r6", "Could I have some water?", "می‌تونم یه کم آب داشته باشم؟"),
                DailySentence("r7", "Is this dish spicy?", "این غذا تنده؟"),
                DailySentence("r8", "I'm allergic to nuts.", "به آجیل حساسیت دارم."),
                DailySentence("r9", "I'm vegetarian.", "من گیاه‌خوار هستم."),
                DailySentence("r10", "This is delicious!", "این خیلی خوشمزه‌ست!"),
                DailySentence("r11", "Can I have the bill, please?", "می‌تونم صورت‌حساب رو داشته باشم؟"),
                DailySentence("r12", "Do you take credit cards?", "کارت اعتباری قبول می‌کنید؟"),
                DailySentence("r13", "Keep the change.", "بقیه‌اش برای شما."),
                DailySentence("r14", "Can I get this to go?", "می‌تونم این رو بیرون ببرم؟"),
                DailySentence("r15", "Excuse me, waiter!", "ببخشید، پیشخدمت!")
            )
        ),

        // ==================== ۶. خرید کردن ====================
        SentenceCategory(
            id = "shopping",
            title = "Shopping",
            titlePersian = "خرید کردن",
            emoji = "🛒",
            color = 0xFF00ACC1,
            sentences = listOf(
                DailySentence("sh1", "How much is this?", "این چنده؟"),
                DailySentence("sh2", "That's too expensive.", "این خیلی گرونه."),
                DailySentence("sh3", "Can you give me a discount?", "می‌تونید تخفیف بدید؟"),
                DailySentence("sh4", "Do you have this in a smaller size?", "سایز کوچیک‌ترش رو دارید؟"),
                DailySentence("sh5", "Do you have this in another color?", "رنگ دیگه‌ای از این دارید؟"),
                DailySentence("sh6", "Can I try it on?", "می‌تونم پروش کنم؟"),
                DailySentence("sh7", "Where is the fitting room?", "اتاق پرو کجاست؟"),
                DailySentence("sh8", "I'm just looking, thanks.", "فقط دارم نگاه می‌کنم، ممنون."),
                DailySentence("sh9", "I'll take it.", "این رو می‌خرم."),
                DailySentence("sh10", "Do you accept cash?", "پول نقد قبول می‌کنید؟"),
                DailySentence("sh11", "Can I get a receipt?", "می‌تونم فاکتور بگیرم؟"),
                DailySentence("sh12", "Is there a warranty?", "گارانتی داره؟"),
                DailySentence("sh13", "I'd like to return this.", "می‌خوام این رو پس بدم."),
                DailySentence("sh14", "Can I get a refund?", "می‌تونم پولم رو پس بگیرم؟"),
                DailySentence("sh15", "When does the store close?", "مغازه کی بسته می‌شه؟")
            )
        ),

        // ==================== ۷. سفر و فرودگاه ====================
        SentenceCategory(
            id = "travel",
            title = "Travel & Airport",
            titlePersian = "سفر و فرودگاه",
            emoji = "✈️",
            color = 0xFF3F51B5,
            sentences = listOf(
                DailySentence("tr1", "Where is the check-in counter?", "باجه‌ی پذیرش کجاست؟"),
                DailySentence("tr2", "Here is my passport.", "این پاسپورت منه."),
                DailySentence("tr3", "I have one suitcase.", "من یه چمدون دارم."),
                DailySentence("tr4", "Window seat, please.", "صندلی کنار پنجره، لطفاً."),
                DailySentence("tr5", "What's the gate number?", "شماره‌ی گیت چیه؟"),
                DailySentence("tr6", "What time is boarding?", "ساعت سوار شدن کی هست؟"),
                DailySentence("tr7", "Is the flight delayed?", "پرواز تأخیر داره؟"),
                DailySentence("tr8", "Where can I find a taxi?", "کجا می‌تونم تاکسی پیدا کنم؟"),
                DailySentence("tr9", "How do I get to the city center?", "چطور به مرکز شهر برم؟"),
                DailySentence("tr10", "I'm here on vacation.", "من برای تعطیلات اینجام."),
                DailySentence("tr11", "I'm here on business.", "من برای کار اینجام."),
                DailySentence("tr12", "I'll stay for a week.", "یه هفته می‌مونم."),
                DailySentence("tr13", "Where is the baggage claim?", "محل تحویل بار کجاست؟"),
                DailySentence("tr14", "My luggage is missing.", "چمدونم گم شده."),
                DailySentence("tr15", "Have a nice flight!", "پرواز خوبی داشته باشی!")
            )
        ),

        // ==================== ۸. هتل ====================
        SentenceCategory(
            id = "hotel",
            title = "Hotel",
            titlePersian = "هتل",
            emoji = "🏨",
            color = 0xFF00897B,
            sentences = listOf(
                DailySentence("h1", "I have a reservation.", "من رزرو دارم."),
                DailySentence("h2", "I'd like to check in.", "می‌خوام چک‌این کنم."),
                DailySentence("h3", "Do you have any rooms available?", "اتاق خالی دارید؟"),
                DailySentence("h4", "How much is a room per night?", "اتاق شبی چند؟"),
                DailySentence("h5", "Is breakfast included?", "صبحانه هم شامل می‌شه؟"),
                DailySentence("h6", "What time is check-out?", "ساعت تخلیه‌ی اتاق کیه؟"),
                DailySentence("h7", "Could I have the room key?", "می‌تونم کلید اتاق رو بگیرم؟"),
                DailySentence("h8", "The air conditioner isn't working.", "کولر کار نمی‌کنه."),
                DailySentence("h9", "Can I have extra towels?", "می‌تونم حوله اضافه بگیرم؟"),
                DailySentence("h10", "Is there Wi-Fi in the room?", "توی اتاق وای‌فای هست؟"),
                DailySentence("h11", "What's the Wi-Fi password?", "رمز وای‌فای چیه؟"),
                DailySentence("h12", "Can I extend my stay?", "می‌تونم اقامتم رو تمدید کنم؟"),
                DailySentence("h13", "I'd like to check out.", "می‌خوام چک‌اوت کنم."),
                DailySentence("h14", "Could you call a taxi for me?", "می‌تونید برام تاکسی بگیرید؟"),
                DailySentence("h15", "Thank you for your hospitality.", "ممنون از مهمان‌نوازی شما.")
            )
        ),

        // ==================== ۹. تاکسی و مسیریابی ====================
        SentenceCategory(
            id = "directions",
            title = "Taxi & Directions",
            titlePersian = "تاکسی و مسیریابی",
            emoji = "🚕",
            color = 0xFFFFA726,
            sentences = listOf(
                DailySentence("d1", "Can you take me to this address?", "می‌تونید منو به این آدرس ببرید؟"),
                DailySentence("d2", "How much will it cost?", "چقدر هزینه‌اش می‌شه؟"),
                DailySentence("d3", "Please turn right.", "لطفاً بپیچ راست."),
                DailySentence("d4", "Please turn left.", "لطفاً بپیچ چپ."),
                DailySentence("d5", "Go straight.", "مستقیم برو."),
                DailySentence("d6", "Stop here, please.", "همین‌جا نگه دار، لطفاً."),
                DailySentence("d7", "How long will it take?", "چقدر طول می‌کشه؟"),
                DailySentence("d8", "I'm in a hurry.", "عجله دارم."),
                DailySentence("d9", "Where are we now?", "الان کجاییم؟"),
                DailySentence("d10", "Excuse me, how do I get to the station?", "ببخشید، چطور به ایستگاه برم؟"),
                DailySentence("d11", "Is it far from here?", "از اینجا دوره؟"),
                DailySentence("d12", "Can you show me on the map?", "می‌تونید روی نقشه نشونم بدید؟"),
                DailySentence("d13", "I'm lost.", "گم شدم."),
                DailySentence("d14", "Which bus goes downtown?", "کدوم اتوبوس به مرکز شهر می‌ره؟"),
                DailySentence("d15", "Where is the nearest metro station?", "نزدیک‌ترین ایستگاه مترو کجاست؟")
            )
        ),

        // ==================== ۱۰. مکالمه تلفنی ====================
        SentenceCategory(
            id = "phone",
            title = "Phone Calls",
            titlePersian = "مکالمه تلفنی",
            emoji = "📞",
            color = 0xFF7B1FA2,
            sentences = listOf(
                DailySentence("p1", "Hello, this is Ali.", "سلام، من علی هستم."),
                DailySentence("p2", "May I speak to Sara?", "می‌تونم با سارا صحبت کنم؟"),
                DailySentence("p3", "Who's calling, please?", "ببخشید شما کی هستید؟"),
                DailySentence("p4", "Hold on a moment, please.", "یه لحظه گوشی رو نگه دارید، لطفاً."),
                DailySentence("p5", "I'll call you back.", "من بهت زنگ می‌زنم."),
                DailySentence("p6", "Can I leave a message?", "می‌تونم پیام بذارم؟"),
                DailySentence("p7", "Sorry, wrong number.", "ببخشید، شماره اشتباه بود."),
                DailySentence("p8", "Can you hear me?", "صدای منو می‌شنوی؟"),
                DailySentence("p9", "The line is busy.", "خط اشغاله."),
                DailySentence("p10", "I couldn't reach you.", "نتونستم بهت برسم."),
                DailySentence("p11", "Please call me later.", "لطفاً بعداً بهم زنگ بزن."),
                DailySentence("p12", "I'm on my way.", "در راهم."),
                DailySentence("p13", "I'll text you.", "بهت پیام می‌دم."),
                DailySentence("p14", "Send me the details.", "جزئیات رو برام بفرست."),
                DailySentence("p15", "Talk to you soon.", "به‌زودی باهات حرف می‌زنم.")
            )
        ),

        // ==================== ۱۱. محل کار ====================
        SentenceCategory(
            id = "work",
            title = "At Work",
            titlePersian = "محل کار",
            emoji = "💼",
            color = 0xFF1565C0,
            sentences = listOf(
                DailySentence("w1", "I have a meeting at ten.", "ساعت ده جلسه دارم."),
                DailySentence("w2", "Can we schedule a meeting?", "می‌تونیم یه جلسه بذاریم؟"),
                DailySentence("w3", "I'll send you the report.", "گزارش رو برات می‌فرستم."),
                DailySentence("w4", "Could you review this document?", "می‌تونی این سند رو بررسی کنی؟"),
                DailySentence("w5", "I'm working on it.", "دارم روش کار می‌کنم."),
                DailySentence("w6", "The deadline is tomorrow.", "مهلت فرداست."),
                DailySentence("w7", "Can I take a day off?", "می‌تونم یه روز مرخصی بگیرم؟"),
                DailySentence("w8", "I'll be working from home today.", "امروز از خونه کار می‌کنم."),
                DailySentence("w9", "Let's discuss this later.", "بذار بعداً در موردش صحبت کنیم."),
                DailySentence("w10", "That's a great idea.", "ایده‌ی خوبیه."),
                DailySentence("w11", "Let me think about it.", "بذار در موردش فکر کنم."),
                DailySentence("w12", "I'll get back to you.", "بهت خبر می‌دم."),
                DailySentence("w13", "Good job!", "کارت عالی بود!"),
                DailySentence("w14", "Could you help me with this?", "می‌تونی توی این مورد کمکم کنی؟"),
                DailySentence("w15", "Have a productive day!", "روز پرباری داشته باشی!")
            )
        ),

        // ==================== ۱۲. دکتر و بیمارستان ====================
        SentenceCategory(
            id = "doctor",
            title = "Doctor & Hospital",
            titlePersian = "دکتر و بیمارستان",
            emoji = "🏥",
            color = 0xFFD32F2F,
            sentences = listOf(
                DailySentence("dr1", "I don't feel well.", "حالم خوب نیست."),
                DailySentence("dr2", "I have a headache.", "سردرد دارم."),
                DailySentence("dr3", "I have a stomachache.", "دل‌درد دارم."),
                DailySentence("dr4", "I have a fever.", "تب دارم."),
                DailySentence("dr5", "I have a cold.", "سرماخوردگی دارم."),
                DailySentence("dr6", "My throat hurts.", "گلوم درد می‌کنه."),
                DailySentence("dr7", "I need a doctor.", "به دکتر نیاز دارم."),
                DailySentence("dr8", "Where is the nearest hospital?", "نزدیک‌ترین بیمارستان کجاست؟"),
                DailySentence("dr9", "It hurts here.", "اینجا درد می‌کنه."),
                DailySentence("dr10", "I'm allergic to penicillin.", "به پنی‌سیلین حساسیت دارم."),
                DailySentence("dr11", "Can you prescribe something?", "می‌تونید یه دارو تجویز کنید؟"),
                DailySentence("dr12", "How often should I take it?", "چند وقت یه بار بخورمش؟"),
                DailySentence("dr13", "I have insurance.", "من بیمه دارم."),
                DailySentence("dr14", "Call an ambulance, please!", "لطفاً آمبولانس خبر کنید!"),
                DailySentence("dr15", "Get well soon.", "زود خوب شو.")
            )
        ),

        // ==================== ۱۳. مکالمه روزمره ====================
        SentenceCategory(
            id = "daily",
            title = "Daily Conversation",
            titlePersian = "مکالمه روزمره",
            emoji = "💬",
            color = 0xFF00897B,
            sentences = listOf(
                DailySentence("dc1", "What time is it?", "ساعت چنده؟"),
                DailySentence("dc2", "What day is it today?", "امروز چه روزیه؟"),
                DailySentence("dc3", "How's the weather?", "هوا چطوره؟"),
                DailySentence("dc4", "It's a beautiful day.", "روز زیباییه."),
                DailySentence("dc5", "It's raining.", "داره بارون میاد."),
                DailySentence("dc6", "I'm hungry.", "گرسنه‌ام."),
                DailySentence("dc7", "I'm thirsty.", "تشنه‌ام."),
                DailySentence("dc8", "I'm tired.", "خسته‌ام."),
                DailySentence("dc9", "I'm busy right now.", "الان سرم شلوغه."),
                DailySentence("dc10", "I don't understand.", "متوجه نمی‌شم."),
                DailySentence("dc11", "Could you repeat that?", "می‌تونی تکرار کنی؟"),
                DailySentence("dc12", "Could you speak slowly?", "می‌تونی آروم‌تر حرف بزنی؟"),
                DailySentence("dc13", "What does this mean?", "این یعنی چی؟"),
                DailySentence("dc14", "How do you say this in English?", "این رو به انگلیسی چطور می‌گن؟"),
                DailySentence("dc15", "It doesn't matter.", "مهم نیست.")
            )
        ),

        // ==================== ۱۴. ابراز احساسات ====================
        SentenceCategory(
            id = "emotions",
            title = "Emotions",
            titlePersian = "ابراز احساسات",
            emoji = "❤️",
            color = 0xFFE91E63,
            sentences = listOf(
                DailySentence("e1", "I'm so happy!", "خیلی خوشحالم!"),
                DailySentence("e2", "I'm very sad.", "خیلی ناراحتم."),
                DailySentence("e3", "I'm so excited!", "خیلی هیجان‌زده‌ام!"),
                DailySentence("e4", "I'm worried.", "نگرانم."),
                DailySentence("e5", "I'm scared.", "می‌ترسم."),
                DailySentence("e6", "I'm angry.", "عصبانی‌ام."),
                DailySentence("e7", "I miss you.", "دلم برات تنگ شده."),
                DailySentence("e8", "I love you.", "دوستت دارم."),
                DailySentence("e9", "I care about you.", "برام مهمی."),
                DailySentence("e10", "You mean the world to me.", "تو برای من همه دنیایی."),
                DailySentence("e11", "I'm proud of you.", "بهت افتخار می‌کنم."),
                DailySentence("e12", "I believe in you.", "بهت ایمان دارم."),
                DailySentence("e13", "You can do it!", "تو می‌تونی!"),
                DailySentence("e14", "Don't worry, it's okay.", "نگران نباش، خوبه."),
                DailySentence("e15", "Everything will be fine.", "همه چیز خوب می‌شه.")
            )
        ),

        // ==================== ۱۵. دعوت و مهمانی ====================
        SentenceCategory(
            id = "invitation",
            title = "Invitation & Party",
            titlePersian = "دعوت و مهمانی",
            emoji = "🎉",
            color = 0xFFFF6F00,
            sentences = listOf(
                DailySentence("i1", "Would you like to come?", "می‌خوای بیای؟"),
                DailySentence("i2", "Are you free tonight?", "امشب آزادی؟"),
                DailySentence("i3", "Let's go out for dinner.", "بریم بیرون شام بخوریم."),
                DailySentence("i4", "I'm having a party.", "من یه مهمونی دارم."),
                DailySentence("i5", "Can you come to my birthday?", "می‌تونی به تولدم بیای؟"),
                DailySentence("i6", "I'd love to come!", "خیلی دوست دارم بیام!"),
                DailySentence("i7", "I'd love to, but I can't.", "خیلی دوست داشتم، ولی نمی‌تونم."),
                DailySentence("i8", "Sorry, I have plans.", "ببخشید، برنامه دارم."),
                DailySentence("i9", "What should I bring?", "چی بیارم؟"),
                DailySentence("i10", "Where is the party?", "مهمونی کجاست؟"),
                DailySentence("i11", "What time does it start?", "ساعت چند شروع می‌شه؟"),
                DailySentence("i12", "Thanks for the invitation.", "ممنون از دعوتت."),
                DailySentence("i13", "Let's celebrate!", "بیا جشن بگیریم!"),
                DailySentence("i14", "Congratulations!", "تبریک می‌گم!"),
                DailySentence("i15", "Happy birthday!", "تولدت مبارک!")
            )
        )
    )

    // جستجو در همه جملات
    fun searchSentences(query: String): List<DailySentence> {
        if (query.isBlank()) return emptyList()
        val lowerQuery = query.lowercase()
        return getAllCategories()
            .flatMap { it.sentences }
            .filter {
                it.english.lowercase().contains(lowerQuery) ||
                it.persian.contains(query)
            }
    }
}