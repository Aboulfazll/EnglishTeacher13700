package com.example.englishteacher.data

data class StoryChapter(
    val title: String,
    val titlePersian: String,
    val text: String,
    val persianTranslation: String,
    val emoji: String = "📖"
)

object StoryChapters {

    fun getChaptersForStory(storyId: String): List<StoryChapter> {
        return when (storyId) {
            "s_b1" -> s_b1Chapters()
            "s_b2" -> s_b2Chapters()
            "s_b3" -> s_b3Chapters()
            "s_b4" -> s_b4Chapters()
            "s_b5" -> s_b5Chapters()
            "s_b6" -> s_b6Chapters()
            "s_b7" -> s_b7Chapters()
            "s_b8" -> s_b8Chapters()
            "s_b9" -> s_b9Chapters()
            "s_b10" -> s_b10Chapters()
            else -> emptyList()
        }
    }

    fun hasChapters(storyId: String): Boolean {
        return getChaptersForStory(storyId).isNotEmpty()
    }

    // ============================================================
    // ==================== داستان ۱: گربه گمشده =================
    // ============================================================
    private fun s_b1Chapters() = listOf(
        StoryChapter(
            title = "Sara and Mimi",
            titlePersian = "سارا و میمی",
            emoji = "🐱",
            text = "Sara is a little girl. She is seven years old. She lives in a small house with her parents. Sara has a beautiful cat. The cat's name is Mimi. Mimi is white and soft. She has big green eyes. Sara loves Mimi very much. Every day, they play together in the garden. Mimi likes to chase butterflies. Sara laughs and claps her hands. They are the best of friends.",
            persianTranslation = "سارا یه دختر کوچیکه. هفت سالشه. توی یه خونه‌ی کوچیک با پدر و مادرش زندگی می‌کنه. سارا یه گربه‌ی قشنگ داره. اسم گربه میمیه. میمی سفید و نرمه. چشم‌های سبز بزرگی داره. سارا خیلی میمی رو دوست داره. هر روز با هم توی باغ بازی می‌کنن. میمی دوست داره پروانه‌ها رو تعقیب کنه. سارا می‌خنده و دست می‌زنه. اون‌ها بهترین دوست هم هستن."
        ),
        StoryChapter(
            title = "Mimi Disappears",
            titlePersian = "میمی ناپدید می‌شه",
            emoji = "🚪",
            text = "One sunny morning, Mimi goes out to play. The door is open. Mimi walks into the street. She sees a butterfly. She follows it. The butterfly flies far away. Mimi runs and runs. Suddenly, she does not know where she is. She is lost! Back at home, Sara calls: Mimi! Mimi! But no one answers. Sara is worried. She starts to cry. Where is Mimi?",
            persianTranslation = "یه صبح آفتابی، میمی می‌ره بیرون که بازی کنه. در بازه. میمی می‌ره توی خیابون. یه پروانه می‌بینه. دنبالش می‌ره. پروانه خیلی دور پرواز می‌کنه. میمی می‌دوه و می‌دوه. یهو نمی‌دونه کجاست. گم شده! خونه، سارا صدا می‌زنه: میمی! میمی! ولی هیچ‌کس جواب نمی‌ده. سارا نگرانه. شروع می‌کنه به گریه. میمی کجاست؟"
        ),
        StoryChapter(
            title = "Looking Everywhere",
            titlePersian = "همه‌جا رو می‌گرده",
            emoji = "🔍",
            text = "Sara looks for Mimi everywhere. She looks under the bed. No Mimi. She looks in the kitchen. No Mimi. She looks behind the sofa. No Mimi. Sara asks her mother: Have you seen Mimi? Her mother says no. Sara asks her father. He says no too. Sara asks her neighbors. They have not seen Mimi. Sara feels very sad. Will she ever see her cat again?",
            persianTranslation = "سارا همه‌جا دنبال میمی می‌گرده. زیر تخت نگاه می‌کنه. میمی نیست. توی آشپزخونه نگاه می‌کنه. میمی نیست. پشت مبل نگاه می‌کنه. میمی نیست. سارا از مامانش می‌پرسه: میمی رو دیدی؟ مامانش می‌گه نه. از باباش می‌پرسه. اونم می‌گه نه. از همسایه‌ها می‌پرسه. اون‌ها میمی رو ندیدن. سارا خیلی ناراحت می‌شه. آیا دوباره گربش رو می‌بینه؟"
        ),
        StoryChapter(
            title = "A Happy Reunion",
            titlePersian = "دیدار شاد",
            emoji = "🎉",
            text = "Sara goes to the big park near her house. She looks under every tree. Then she hears a small sound. Meow! Meow! Sara runs to the sound. Under a big tree, she sees Mimi! Mimi is sleeping on a soft bed of leaves. Sara picks her up and hugs her. Mimi purrs happily. Sara says: Never run away again, Mimi! Let's go home. And they walk home together, very happy.",
            persianTranslation = "سارا می‌ره به پارک بزرگ نزدیک خونشون. زیر هر درختی نگاه می‌کنه. بعد یه صدای کوچیک می‌شنوه. میو! میو! سارا به سمت صدا می‌دوه. زیر یه درخت بزرگ، میمی رو می‌بینه! میمی روی یه بستر نرم از برگ‌ها خوابیده. سارا بلندش می‌کنه و بغلش می‌کنه. میمی با خوشحالی خرخر می‌کنه. سارا می‌گه: دیگه فرار نکن میمی! بیا بریم خونه. و با هم خونه می‌رن، خیلی خوشحال."
        )
    )

    // ============================================================
    // ==================== داستان ۲: نانوای مهربان ===============
    // ============================================================
    private fun s_b2Chapters() = listOf(
        StoryChapter(
            title = "The Little Bakery",
            titlePersian = "نانوایی کوچک",
            emoji = "🥖",
            text = "In a small town, there is a little bakery. The bakery is on a quiet street. Every morning, the smell of fresh bread fills the air. The baker is an old man. His name is Mr. Brown. He has white hair and a warm smile. He wakes up at four o'clock every morning. He makes bread, cakes, and cookies. Everyone in town loves his bread.",
            persianTranslation = "توی یه شهر کوچیک، یه نانوایی کوچیک هست. نانوایی توی یه خیابون آرومه. هر صبح، بوی نون تازه هوا رو پر می‌کنه. نانوا یه پیرمرده. اسمش آقای براونه. موهای سفید و لبخند گرمی داره. هر صبح ساعت چهار بیدار می‌شه. نون، کیک و کلوچه درست می‌کنه. همه‌ی شهر نونش رو دوست دارن."
        ),
        StoryChapter(
            title = "Bread for the Children",
            titlePersian = "نون برای بچه‌ها",
            emoji = "👦",
            text = "Every morning, some poor children come to the bakery. They have no money. Mr. Brown gives them free bread. The children smile and say: Thank you, Mr. Brown! He says: You are welcome, my dears. Eat well and grow strong. The children run to school with warm bread in their hands. They feel happy and loved. Mr. Brown feels happy too.",
            persianTranslation = "هر صبح، چند تا بچه‌ی فقیر می‌یان نانوایی. پول ندارن. آقای براون بهشون نون رایگان می‌ده. بچه‌ها لبخند می‌زنن و می‌گن: ممنون آقای براون! اون می‌گه: خواهش می‌کنم عزیزانم. خوب بخورید و قوی بشید. بچه‌ها با نون گرم توی دستشون به مدرسه می‌دون. احساس خوشحالی و دوست‌داشته شدن می‌کنن. آقای براون هم خوشحاله."
        ),
        StoryChapter(
            title = "The Rich Man's Visit",
            titlePersian = "دیدار مرد ثروتمند",
            emoji = "💰",
            text = "One day, a rich man comes to the bakery. He wears a fine suit and a gold watch. He buys some bread. Then he sees Mr. Brown giving bread to a poor girl. The rich man is surprised. He asks: Why do you give free bread? You will lose money! Mr. Brown smiles and says: I do not lose. I gain happiness. The rich man thinks about this. He feels something new in his heart.",
            persianTranslation = "یه روز، یه مرد ثروتمند میاد نانوایی. کت‌شلوار شیک و ساعت طلا داره. چند تا نون می‌خره. بعد می‌بینه آقای براون داره به یه دختر فقیر نون می‌ده. مرد ثروتمند تعجب می‌کنه. می‌پرسه: چرا نون رایگان می‌دی؟ پولت رو از دست می‌دی! آقای براون لبخند می‌زنه و می‌گه: من ضرر نمی‌کنم. من خوشحالی به دست می‌یارم. مرد ثروتمند در این باره فکر می‌کنه. چیز جدیدی توی قلبش حس می‌کنه."
        ),
        StoryChapter(
            title = "Kindness Comes Back",
            titlePersian = "مهربانی برمی‌گرده",
            emoji = "🎁",
            text = "The rich man thinks for a long time. Then he makes a decision. He gives Mr. Brown a big bag of gold coins. He says: Use this to help more children. Mr. Brown is very surprised. He says: Thank you, sir! You have a good heart. Now the bakery can help many more children. Every day, more children come. The whole town becomes kinder and happier. Kindness always comes back.",
            persianTranslation = "مرد ثروتمند مدت طولانی فکر می‌کنه. بعد تصمیم می‌گیره. یه کیسه‌ی بزرگ سکه‌ی طلا به آقای براون می‌ده. می‌گه: از این برای کمک به بچه‌های بیشتر استفاده کن. آقای براون خیلی تعجب می‌کنه. می‌گه: ممنون قربان! قلب خوبی داری. حالا نانوایی می‌تونه به خیلی بچه‌های بیشتر کمک کنه. هر روز بچه‌های بیشتری می‌یان. تمام شهر مهربون‌تر و شادتر می‌شه. مهربانی همیشه برمی‌گرده."
        )
    )

    // ============================================================
    // ==================== داستان ۳: سه دوست ====================
    // ============================================================
    private fun s_b3Chapters() = listOf(
        StoryChapter(
            title = "Three Good Friends",
            titlePersian = "سه دوست خوب",
            emoji = "👬",
            text = "Tom, Sam, and Max are best friends. They live in a small village. Tom is tall and strong. Sam is short and smart. Max is funny and kind. Every day, they walk to school together. They play football in the afternoon. They help each other with homework. Everyone in the village says: These three are true friends!",
            persianTranslation = "تام، سام و مکس بهترین دوست‌ها هستن. توی یه روستای کوچیک زندگی می‌کنن. تام قدبلند و قویه. سام کوتاه و باهوشه. مکس بامزه و مهربونه. هر روز با هم به مدرسه می‌رن. بعدازظهر با هم فوتبال بازی می‌کنن. توی تکالیف به هم کمک می‌کنن. همه‌ی اهالی روستا می‌گن: این سه تا دوستان واقعی هستن!"
        ),
        StoryChapter(
            title = "The Storm",
            titlePersian = "طوفان",
            emoji = "⛈️",
            text = "One night, a big storm comes to the village. The wind is strong. The rain is heavy. Trees fall down. Thunder is loud. Tom, Sam, and Max are scared. They look outside their windows. They see the damage. Sam's roof is broken. Max's yard is flooded. Tom's garden is destroyed. The three friends meet in the morning. What can they do?",
            persianTranslation = "یه شب، طوفان بزرگی به روستا میاد. باد شدیده. بارون سنگینه. درخت‌ها می‌افتن. رعد بلنده. تام، سام و مکس می‌ترسن. از پنجره بیرون رو نگاه می‌کنن. خرابی رو می‌بینن. سقف سام خرابه. حیاط مکس پر از آب شده. باغ تام نابود شده. سه دوست صبح با هم ملاقات می‌کنن. چی‌کار می‌تونن بکنن؟"
        ),
        StoryChapter(
            title = "Working Together",
            titlePersian = "با هم کار کردن",
            emoji = "🔨",
            text = "Tom says: Let's help each other. First, they fix Sam's roof. Tom climbs the ladder. Sam holds the hammer. Max brings the wood. Then they clean Max's yard. They pull out the water. They fix the fence. They plant new flowers. Then they work on Tom's garden. They plant new seeds. They fix the fence. By evening, all three houses look good again.",
            persianTranslation = "تام می‌گه: بیایید به هم کمک کنیم. اول سقف سام رو درست می‌کنن. تام از نردبون بالا می‌ره. سام چکش رو نگه می‌داره. مکس چوب میاره. بعد حیاط مکس رو تمیز می‌کنن. آب رو خالی می‌کنن. حصار رو درست می‌کنن. گل‌های جدید می‌کارن. بعد روی باغ تام کار می‌کنن. دانه‌های جدید می‌کارن. حصار رو درست می‌کنن. تا غروب، هر سه خونه دوباره خوب به نظر می‌رسن."
        ),
        StoryChapter(
            title = "Stronger Than Before",
            titlePersian = "قوی‌تر از قبل",
            emoji = "💪",
            text = "That night, the three friends sit together. They eat warm soup. They talk about the storm. Sam says: We could not fix everything alone. Tom says: But together, we did it! Max says: That's what friends are for. They laugh and share stories. The village is dark outside, but their hearts are full of light. They know that whatever happens, they will always help each other.",
            persianTranslation = "اون شب، سه دوست با هم می‌شینن. سوپ گرم می‌خورن. درباره‌ی طوفان صحبت می‌کنن. سام می‌گه: نمی‌تونستیم همه چیز رو تنهایی درست کنیم. تام می‌گه: ولی با هم، انجامش دادیم! مکس می‌گه: دوست‌ها برای همین هستن. می‌خندن و داستان‌ها رو به اشتراک می‌ذارن. بیرون روستا تاریکه، ولی قلب‌هاشون پر از نوره. می‌دونن هر اتفاقی بیفته، همیشه به هم کمک می‌کنن."
        )
    )

    // ============================================================
    // ==================== داستان ۴: باغ جادویی ==================
    // ============================================================
    private fun s_b4Chapters() = listOf(
        StoryChapter(
            title = "The Poor Farmer",
            titlePersian = "کشاورز فقیر",
            emoji = "👨‍🌾",
            text = "There is a poor farmer in a small village. His name is Amir. He has a small piece of land. Every spring, he plants seeds. He waters them every day. He waits and waits. But the plants never grow. The soil is dry. The sun is too hot. Amir is very sad. How will he feed his family? He prays every night. Please, help me.",
            persianTranslation = "توی یه روستای کوچیک یه کشاورز فقیر هست. اسمش امیره. یه تیکه زمین کوچیک داره. هر بهار دانه می‌کاره. هر روز آبشون می‌ده. صبر می‌کنه و صبر می‌کنه. ولی گیاه‌ها هیچ‌وقت رشد نمی‌کنن. خاک خشکه. خورشید خیلی داغه. امیر خیلی غمگینه. چطور به خانوادش غذا بده؟ هر شب دعا می‌کنه. لطفاً کمکم کن."
        ),
        StoryChapter(
            title = "The Kind Fairy",
            titlePersian = "پری مهربان",
            emoji = "🧚",
            text = "One night, something magical happens. A soft light fills the garden. A beautiful fairy appears. She has golden wings and a silver dress. She smiles at Amir. She says: I have seen your hard work. I will help you. But you must make a promise. When your garden grows, you must share the food with everyone. Can you do that? Amir says: Yes, I promise!",
            persianTranslation = "یه شب، یه چیز جادویی اتفاق میفته. یه نور ملایم باغ رو پر می‌کنه. یه پری زیبا ظاهر می‌شه. بال‌های طلایی و لباس نقره‌ای داره. به امیر لبخند می‌زنه. می‌گه: کار سختت رو دیدم. کمکت می‌کنم. ولی باید یه قول بدی. وقتی باغت رشد کرد، باید غذا رو با همه قسمت کنی. می‌تونی این کار رو بکنی؟ امیر می‌گه: بله، قول می‌دم!"
        ),
        StoryChapter(
            title = "A Wonderful Morning",
            titlePersian = "یه صبح فوق‌العاده",
            emoji = "🌱",
            text = "The next morning, Amir wakes up early. He goes to the garden. He cannot believe his eyes! Beautiful vegetables are everywhere. Red tomatoes. Green cucumbers. Orange carrots. Purple eggplants. Big watermelons. Amir runs to his family. Look! Look! The garden is full! His children dance with joy. His wife cries with happiness. Today is a wonderful day!",
            persianTranslation = "صبح بعد، امیر زود بیدار می‌شه. می‌ره باغ. باور چشماش نمی‌شه! سبزیجات زیبا همه‌جا هستن. گوجه‌ی قرمز. خیار سبز. هویج نارنجی. بادمجان بنفش. هندونه‌های بزرگ. امیر می‌دوه سمت خانوادش. نگاه کنید! نگاه کنید! باغ پره! بچه‌هاش از خوشحالی می‌رقصن. زنش از شادی گریه می‌کنه. امروز یه روز فوق‌العاده‌ست!"
        ),
        StoryChapter(
            title = "Sharing with Everyone",
            titlePersian = "قسمت کردن با همه",
            emoji = "🤝",
            text = "Amir remembers his promise. He fills baskets with vegetables. He goes to every house in the village. He gives food to the old, the sick, and the poor. Everyone smiles and says: Thank you, Amir! God bless you! The children get fruits. The old people get soft vegetables. Everyone has a warm meal that night. The village feels like one big family. Sharing truly brings happiness.",
            persianTranslation = "امیر قولش یادش میاد. سبدها رو با سبزیجات پر می‌کنه. به هر خونه‌ای توی روستا می‌ره. به پیرها، مریض‌ها و فقیرها غذا می‌ده. همه لبخند می‌زنن و می‌گن: ممنون امیر! خدا خیرت بده! بچه‌ها میوه می‌گیرن. پیرها سبزیجات نرم می‌گیرن. اون شب همه یه وعده‌ی گرم دارن. روستا مثل یه خانواده‌ی بزرگ می‌شه. بخشش واقعاً شادی می‌آره."
        )
    )

    // ============================================================
    // ==================== داستان ۵: پسر راستگو ==================
    // ============================================================
    private fun s_b5Chapters() = listOf(
        StoryChapter(
            title = "A Wallet on the Ground",
            titlePersian = "یه کیف روی زمین",
            emoji = "👝",
            text = "One afternoon, Ali walks home from school. He is ten years old. He has a small bag on his back. Suddenly, he sees something on the ground. It is a brown leather wallet. Ali picks it up. He opens it. There is a lot of money inside. Also some cards and a photo. Ali's eyes become big. What should he do?",
            persianTranslation = "یه بعدازظهر، علی از مدرسه به خونه می‌ره. ده سالشه. یه کیف کوچیک روی پشتشه. یهو یه چیزی روی زمین می‌بینه. یه کیف چرمی قهوه‌ای هست. علی برداشتش می‌کنه. بازش می‌کنه. کلی پول توش هست. همچنین چند تا کارت و یه عکس. چشم‌های علی بزرگ می‌شن. باید چیکار کنه؟"
        ),
        StoryChapter(
            title = "A Hard Choice",
            titlePersian = "یه انتخاب سخت",
            emoji = "🤔",
            text = "Ali thinks for a moment. The money is a lot. He could buy new shoes. He could buy a video game. He could help his mother. But then he thinks: This money is not mine. Someone lost it. They must be very sad. Ali remembers what his mother says: Always be honest. Ali makes a decision. He walks to the police station.",
            persianTranslation = "علی یه لحظه فکر می‌کنه. پول زیاده. می‌تونه کفش جدید بخره. می‌تونه یه بازی ویدیویی بخره. می‌تونه به مامانش کمک کنه. ولی بعد فکر می‌کنه: این پول مال من نیست. یه کسی گمش کرده. اون باید خیلی ناراحت باشه. علی یادش میاد مامانش چی می‌گه: همیشه صادق باش. علی تصمیم می‌گیره. به سمت کلانتری می‌ره."
        ),
        StoryChapter(
            title = "The Grateful Owner",
            titlePersian = "صاحب سپاسگزار",
            emoji = "👨‍💼",
            text = "At the police station, an officer calls the owner. A rich man comes quickly. He is very worried. He checks the wallet. Everything is there! He looks at Ali with big eyes. He says: You are an honest boy. Please take this money as a reward. Ali shakes his head. He says: No, sir. I only did what is right. But the man insists. Ali takes a small amount.",
            persianTranslation = "توی کلانتری، یه افسر به صاحبش زنگ می‌زنه. یه مرد ثروتمند سریع میاد. خیلی نگرانه. کیف رو چک می‌کنه. همه چیز اونجاست! با چشم‌های بزرگ به علی نگاه می‌کنه. می‌گه: تو یه پسر صادقی. لطفاً این پول رو به عنوان پاداش بگیر. علی سرش رو تکون می‌ده. می‌گه: نه قربان. من فقط کاری که درست بود انجام دادم. ولی مرد اصرار می‌کنه. علی یه مقدار کوچیک می‌گیره."
        ),
        StoryChapter(
            title = "A Hero in Town",
            titlePersian = "یه قهرمان در شهر",
            emoji = "🌟",
            text = "The next day, the rich man tells everyone about Ali. He says: This boy is a hero. He could keep my money, but he did not. The story spreads fast. Soon, everyone in town knows Ali. His teacher praises him. His friends respect him. His mother hugs him. Ali smiles. He did not become rich, but he became a hero. Honesty is the best reward.",
            persianTranslation = "روز بعد، مرد ثروتمند به همه درباره‌ی علی می‌گه. می‌گه: این پسر یه قهرمانه. می‌تونست پولم رو نگه داره، ولی این کار رو نکرد. داستان سریع پخش می‌شه. به‌زودی همه‌ی شهر علی رو می‌شناسن. معلمش تحسینش می‌کنه. دوستاش بهش احترام می‌ذارن. مامانش بغلش می‌کنه. علی لبخند می‌زنه. ثروتمند نشد، ولی قهرمان شد. صداقت بهترین پاداشه."
        )
    )

    // ============================================================
    // ========== بقیه داستان‌ها (b6-b10) - ادامه در پیام بعدی ==========
    // ============================================================
    private fun s_b6Chapters(): List<StoryChapter> = emptyList()
    private fun s_b7Chapters(): List<StoryChapter> = emptyList()
    private fun s_b8Chapters(): List<StoryChapter> = emptyList()
    private fun s_b9Chapters(): List<StoryChapter> = emptyList()
    private fun s_b10Chapters(): List<StoryChapter> = emptyList()
}