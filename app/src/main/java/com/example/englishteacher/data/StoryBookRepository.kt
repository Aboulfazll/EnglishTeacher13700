package com.example.englishteacher.data

object StoryBookRepository {

    fun getAllStories(): List<Story> = listOf(

        // ============================================================
        // ==================== BEGINNER با فصل ======================
        // ============================================================

        Story(
            id = "s_b1",
            title = "The Lost Cat",
            titlePersian = "گربه گمشده",
            level = Level.BEGINNER,
            text = "A little girl named Sara has a cat. The cat's name is Mimi. One day, Mimi goes out and doesn't come back. Sara is very sad. She looks everywhere. She asks her neighbors, but no one has seen Mimi. Finally, Sara finds Mimi under a big tree. She is sleeping. Sara is very happy!",
            moral = "Never give up hope.",
            moralPersian = "هرگز امید خود را از دست ندهید.",
            coverUrl = "",
            chapters = listOf(
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
        ),

        Story(
            id = "s_b2",
            title = "The Kind Baker",
            titlePersian = "نانوای مهربان",
            level = Level.BEGINNER,
            text = "There is a bakery in a small town. The baker is a kind old man. Every morning, he gives free bread to poor children. One day, a rich man comes to the bakery. He is surprised. He asks the baker: Why do you give free bread? The baker smiles and says: Because I love to help. The rich man gives the baker a lot of money. Now the baker can help more children.",
            moral = "Kindness is always rewarded.",
            moralPersian = "مهربانی همیشه پاداش داده می‌شود.",
            coverUrl = "",
            chapters = listOf(
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
        ),

        Story(
            id = "s_b3",
            title = "The Three Friends",
            titlePersian = "سه دوست",
            level = Level.BEGINNER,
            text = "Three friends live in a small village. Their names are Tom, Sam, and Max. They do everything together. They play, study, and work together. One day, a big storm comes. Their houses are in danger. Tom helps Sam fix his roof. Sam helps Max clean his yard. Max helps Tom with his garden. Together, they save all three houses.",
            moral = "Friends help each other in hard times.",
            moralPersian = "دوستان در سختی‌ها به هم کمک می‌کنند.",
            coverUrl = "",
            chapters = listOf(
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
        ),

        Story(
            id = "s_b4",
            title = "The Magic Garden",
            titlePersian = "باغ جادویی",
            level = Level.BEGINNER,
            text = "A poor farmer has a small garden. He plants seeds every spring. But nothing grows. One night, a fairy comes to his garden. She says: I will help you, but you must promise to share your food. The farmer says yes. The next morning, beautiful vegetables grow in the garden. The farmer shares his food with everyone. Everyone is happy.",
            moral = "Sharing brings happiness.",
            moralPersian = "بخشش شادی می‌آورد.",
            coverUrl = "",
            chapters = listOf(
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
        ),

        Story(
            id = "s_b5",
            title = "The Honest Boy",
            titlePersian = "پسر راستگو",
            level = Level.BEGINNER,
            text = "A boy named Ali finds a wallet on the street. There is a lot of money in it. Ali could keep the money, but he doesn't. He takes the wallet to the police. The police find the owner. The owner is a rich man. He is very happy. He gives Ali some money as a gift. Ali says: I only did what is right. Everyone praises Ali for his honesty.",
            moral = "Honesty is the best policy.",
            moralPersian = "صداقت بهترین سیاست است.",
            coverUrl = "",
            chapters = listOf(
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
        ),

        // ============================================================
        // ============ داستان‌های بعدی (بدون فصل) ============
        // ============================================================

        Story(
            id = "s_b6",
            title = "The Brave Dog",
            titlePersian = "سگ شجاع",
            level = Level.BEGINNER,
            text = "A dog named Rex lives with a family. One night, Rex hears a strange noise. He barks loudly. The family wakes up. They see a fire in the kitchen. They call the fire station. The firemen come and stop the fire. The family is safe because of Rex. Rex is a hero!",
            moral = "Bravery saves lives.",
            moralPersian = "شجاعت جان‌ها را نجات می‌دهد.",
            coverUrl = ""
        ),

        Story(
            id = "s_b7",
            title = "The Little Bird",
            titlePersian = "پرنده کوچک",
            level = Level.BEGINNER,
            text = "A little bird lives in a tree. One day, the bird falls from the tree. Her wing hurts. She cannot fly. A boy finds her. He takes her home. He gives her food and water. After one week, the bird is strong again. The boy lets her go. The bird flies away. But every morning, she comes back to sing for the boy.",
            moral = "Kindness creates friendship.",
            moralPersian = "مهربانی دوستی می‌سازد.",
            coverUrl = ""
        ),

        Story(
            id = "s_b8",
            title = "The Rainy Day",
            titlePersian = "روز بارانی",
            level = Level.BEGINNER,
            text = "It is raining hard. A boy named Ben is walking home. He has no umbrella. He gets very wet. An old woman sees him. She gives him her umbrella. Ben says thank you. He walks home dry. The next day, Ben buys a new umbrella. He gives it to the old woman. She smiles. They become friends.",
            moral = "Return kindness with kindness.",
            moralPersian = "مهربانی را با مهربانی پاسخ دهید.",
            coverUrl = ""
        ),

        Story(
            id = "s_b9",
            title = "My First Day at School",
            titlePersian = "اولین روز مدرسه من",
            level = Level.BEGINNER,
            text = "Today is my first day at school. I am very nervous. I don't know anyone. My mother says: Don't worry, you will make friends. In class, a girl sits next to me. Her name is Lily. She smiles at me. We eat lunch together. I am not nervous anymore. School is fun!",
            moral = "New beginnings bring new friends.",
            moralPersian = "شروع‌های جدید دوستان جدید می‌آورند.",
            coverUrl = ""
        ),

        Story(
            id = "s_b10",
            title = "The Red Balloon",
            titlePersian = "بادکنک قرمز",
            level = Level.BEGINNER,
            text = "A little girl has a red balloon. She loves it very much. One day, the wind takes the balloon away. The girl cries. A boy sees her. He has a blue balloon. He gives it to the girl. She smiles and says thank you. Now the girl has a blue balloon and a new friend.",
            moral = "A small gift can bring big joy.",
            moralPersian = "هدیه کوچک شادی بزرگ می‌آورد.",
            coverUrl = ""
        ),

        // ============ ادامه‌ی داستان‌ها بدون فصل ============
        // (همون ۹۰ داستان قبلی رو این‌جا نگه دار)

        Story(
            id = "s_b11",
            title = "The Thirsty Crow",
            titlePersian = "کلاغ تشنه",
            level = Level.BEGINNER,
            text = "A crow is very thirsty. He looks for water everywhere. Finally, he finds a pot with a little water. But the pot is deep. The crow cannot reach the water. He has an idea. He puts small stones in the pot. The water goes up. Now the crow can drink. He is very happy.",
            moral = "Where there is a will, there is a way.",
            moralPersian = "خواستن توانستن است.",
            coverUrl = ""
        ),

        // ... بقیه‌ی داستان‌ها (s_b12 تا s_b50, s_i1 تا s_i30, s_a1 تا s_a20)
        // همون‌طور که بودن، فقط بدون chapters

        Story(
            id = "s_b12",
            title = "The Hungry Fox",
            titlePersian = "روباه گرسنه",
            level = Level.BEGINNER,
            text = "A fox is very hungry. He looks for food in the forest. He sees a crow with a piece of cheese in her mouth. The fox says: Dear crow, you have a beautiful voice. Please sing for me. The crow opens her mouth to sing. The cheese falls down. The fox catches it and runs away. The crow learns a lesson.",
            moral = "Do not trust flatterers.",
            moralPersian = "به چاپلوسان اعتماد نکنید.",
            coverUrl = ""
        ),

        Story(
            id = "s_b13",
            title = "The Ant and the Grasshopper",
            titlePersian = "مورچه و ملخ",
            level = Level.BEGINNER,
            text = "In summer, an ant works hard. She collects food for winter. A grasshopper sings and plays all day. He laughs at the ant. He says: Why do you work so much? Come and play! The ant says: Winter is coming. But the grasshopper doesn't listen. When winter comes, the grasshopper has no food. The ant shares her food with him.",
            moral = "Prepare today for tomorrow.",
            moralPersian = "امروز برای فردا آماده شو.",
            coverUrl = ""
        ),

        Story(
            id = "s_b14",
            title = "The Lion and the Mouse",
            titlePersian = "شیر و موش",
            level = Level.BEGINNER,
            text = "A lion is sleeping. A little mouse runs over his nose. The lion wakes up and catches the mouse. The mouse says: Please let me go. One day I will help you. The lion laughs. How can a tiny mouse help a lion? But he lets the mouse go. Later, the lion is caught in a net. The mouse comes and cuts the net with her teeth. The lion is free.",
            moral = "Even the small can help the great.",
            moralPersian = "حتی کوچک‌ها می‌توانند به بزرگ‌ها کمک کنند.",
            coverUrl = ""
        ),

        Story(
            id = "s_b15",
            title = "The Turtle and the Rabbit",
            titlePersian = "لاک‌پشت و خرگوش",
            level = Level.BEGINNER,
            text = "A rabbit laughs at a slow turtle. The turtle says: Let's have a race. The rabbit agrees. The race begins. The rabbit runs very fast. He is far ahead. He decides to take a nap. The turtle walks slowly but never stops. While the rabbit sleeps, the turtle passes him. The turtle wins the race!",
            moral = "Slow and steady wins the race.",
            moralPersian = "آهسته و پیوسته برنده می‌شود.",
            coverUrl = ""
        ),

        Story(
            id = "s_b16",
            title = "The Clever Fox",
            titlePersian = "روباه باهوش",
            level = Level.BEGINNER,
            text = "A fox is very hungry. He sees grapes on a high branch. He jumps and jumps, but he cannot reach them. Finally, he gives up. He says: The grapes are probably sour anyway. He walks away. This is how we sometimes lie to ourselves when we cannot get what we want.",
            moral = "Do not hate what you cannot have.",
            moralPersian = "از آنچه نمی‌توانی داشته باشی متنفر نباش.",
            coverUrl = ""
        ),

        Story(
            id = "s_b17",
            title = "The Greedy Dog",
            titlePersian = "سگ حریص",
            level = Level.BEGINNER,
            text = "A dog has a piece of meat. He walks near a river. He sees his reflection in the water. He thinks it is another dog with a bigger piece of meat. He opens his mouth to bark. His meat falls into the river. Now he has nothing. He learns not to be greedy.",
            moral = "Greed loses what it has.",
            moralPersian = "حرص آنچه را دارد از دست می‌دهد.",
            coverUrl = ""
        ),

        Story(
            id = "s_b18",
            title = "The Woodcutter and the Axe",
            titlePersian = "چوب‌بر و تبر",
            level = Level.BEGINNER,
            text = "A woodcutter drops his old axe in a river. He is sad. A spirit appears. He shows a gold axe. Is this yours? No. He shows a silver axe. Is this yours? No. He shows the old axe. Yes! That is mine. The spirit is happy with the woodcutter's honesty. He gives him all three axes.",
            moral = "Honesty brings unexpected rewards.",
            moralPersian = "صداقت پاداش غیرمنتظره می‌آورد.",
            coverUrl = ""
        ),

        Story(
            id = "s_b19",
            title = "The Two Frogs",
            titlePersian = "دو قورباغه",
            level = Level.BEGINNER,
            text = "Two frogs fall into a bucket of milk. They try to jump out, but the sides are too high. One frog gives up and drowns. The other frog keeps kicking. He kicks and kicks. The milk turns into butter. He jumps on the butter and escapes. Never give up!",
            moral = "Keep trying and you will succeed.",
            moralPersian = "تلاش کن تا موفق شوی.",
            coverUrl = ""
        ),

        Story(
            id = "s_b20",
            title = "The Boy Who Cried Wolf",
            titlePersian = "پسرک چوپان و گرگ",
            level = Level.BEGINNER,
            text = "A boy takes care of sheep. He is bored. He shouts: Wolf! Wolf! The villagers run to help. There is no wolf. The boy laughs. He does it again. The villagers come again. No wolf. Then a real wolf comes. The boy shouts: Wolf! But no one comes. The wolf eats the sheep.",
            moral = "No one believes a liar.",
            moralPersian = "هیچ‌کس دروغگو را باور نمی‌کند.",
            coverUrl = ""
        ),

        // ⬇️ بقیه‌ی داستان‌های مبتدی (s_b21 تا s_b50) رو با همون ساختار قبلی ادامه بده
        
        // ⬇️ ۳۰ داستان متوسط (s_i1 تا s_i30)
        
        // ⬇️ ۲۰ داستان پیشرفته (s_a1 تا s_a20)
    )
}