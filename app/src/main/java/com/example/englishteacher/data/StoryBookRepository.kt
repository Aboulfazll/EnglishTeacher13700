package com.example.englishteacher.data

object StoryBookRepository {

    fun getAllStories(): List<Story> =
        BeginnerStories.stories +
        IntermediateStories.stories +
        AdvancedStories.stories +
        remainingStories()

    /**
     * داستان‌های بدون فصل (s_b11 تا s_b50, s_i16 تا s_i30, s_a11 تا s_a20)
     */
    private fun remainingStories(): List<Story> = listOf(

        // ==================== BEGINNER (s_b11 - s_b50) ====================
        Story(
            id = "s_b11", title = "The Thirsty Crow", titlePersian = "کلاغ تشنه",
            level = Level.BEGINNER,
            text = "A crow is very thirsty. He looks for water everywhere. Finally, he finds a pot with a little water. But the pot is deep. The crow cannot reach the water. He has an idea. He puts small stones in the pot. The water goes up. Now the crow can drink. He is very happy.",
            moral = "Where there is a will, there is a way.", moralPersian = "خواستن توانستن است.",
            coverUrl = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=400"
        ),
        Story(
            id = "s_b12", title = "The Hungry Fox", titlePersian = "روباه گرسنه",
            level = Level.BEGINNER,
            text = "A fox is very hungry. He sees a crow with a piece of cheese in her mouth. The fox says: Dear crow, you have a beautiful voice. Please sing for me. The crow opens her mouth to sing. The cheese falls down. The fox catches it and runs away.",
            moral = "Do not trust flatterers.", moralPersian = "به چاپلوسان اعتماد نکنید.",
            coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
        ),
        Story(
            id = "s_b13", title = "The Ant and the Grasshopper", titlePersian = "مورچه و ملخ",
            level = Level.BEGINNER,
            text = "In summer, an ant works hard. She collects food for winter. A grasshopper sings and plays all day. When winter comes, the grasshopper has no food. The ant shares her food with him.",
            moral = "Prepare today for tomorrow.", moralPersian = "امروز برای فردا آماده شو.",
            coverUrl = "https://images.unsplash.com/photo-1557063673-0493c4f8f6c4?w=400"
        ),
        Story(
            id = "s_b14", title = "The Lion and the Mouse", titlePersian = "شیر و موش",
            level = Level.BEGINNER,
            text = "A lion is sleeping. A little mouse runs over his nose. The lion catches the mouse. The mouse says: Please let me go. One day I will help you. Later, the lion is caught in a net. The mouse cuts the net. The lion is free.",
            moral = "Even the small can help the great.", moralPersian = "حتی کوچک‌ها می‌توانند به بزرگ‌ها کمک کنند.",
            coverUrl = "https://images.unsplash.com/photo-1546182990-dffeafbe841d?w=400"
        ),
        Story(
            id = "s_b15", title = "The Turtle and the Rabbit", titlePersian = "لاک‌پشت و خرگوش",
            level = Level.BEGINNER,
            text = "A rabbit laughs at a slow turtle. The turtle says: Let's have a race. The rabbit runs fast, then naps. The turtle walks slowly but never stops. The turtle wins the race!",
            moral = "Slow and steady wins the race.", moralPersian = "آهسته و پیوسته برنده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1485968579580-b6d095142e6e?w=400"
        ),
        Story(
            id = "s_b16", title = "The Clever Fox", titlePersian = "روباه باهوش",
            level = Level.BEGINNER,
            text = "A fox is very hungry. He sees grapes on a high branch. He jumps and jumps, but cannot reach them. Finally, he gives up. He says: The grapes are probably sour anyway.",
            moral = "Do not hate what you cannot have.", moralPersian = "از آنچه نمی‌توانی داشته باشی متنفر نباش.",
            coverUrl = "https://images.unsplash.com/photo-1535581652167-3d6b98c9f7f8?w=400"
        ),
        Story(
            id = "s_b17", title = "The Greedy Dog", titlePersian = "سگ حریص",
            level = Level.BEGINNER,
            text = "A dog has a piece of meat. He walks near a river. He sees his reflection. He thinks it is another dog with a bigger piece. He barks. His meat falls into the river. Now he has nothing.",
            moral = "Greed loses what it has.", moralPersian = "حرص آنچه را دارد از دست می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?w=400"
        ),
        Story(
            id = "s_b18", title = "The Woodcutter and the Axe", titlePersian = "چوب‌بر و تبر",
            level = Level.BEGINNER,
            text = "A woodcutter drops his old axe in a river. A spirit appears. He shows a gold axe. No. A silver axe? No. The old axe? Yes! The spirit is happy with his honesty. He gives him all three axes.",
            moral = "Honesty brings unexpected rewards.", moralPersian = "صداقت پاداش غیرمنتظره می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1441974231531-c6227db76b6e?w=400"
        ),
        Story(
            id = "s_b19", title = "The Two Frogs", titlePersian = "دو قورباغه",
            level = Level.BEGINNER,
            text = "Two frogs fall into a bucket of milk. One gives up and drowns. The other keeps kicking. The milk turns into butter. He jumps on the butter and escapes. Never give up!",
            moral = "Keep trying and you will succeed.", moralPersian = "تلاش کن تا موفق شوی.",
            coverUrl = "https://images.unsplash.com/photo-1552566626-52f8b828add9?w=400"
        ),
        Story(
            id = "s_b20", title = "The Boy Who Cried Wolf", titlePersian = "پسرک چوپان و گرگ",
            level = Level.BEGINNER,
            text = "A boy takes care of sheep. He shouts: Wolf! Wolf! The villagers run to help. No wolf. He does it again. Then a real wolf comes. The boy shouts: Wolf! But no one comes. The wolf eats the sheep.",
            moral = "No one believes a liar.", moralPersian = "هیچ‌کس دروغگو را باور نمی‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1516467508483-a7212febe31a?w=400"
        ),
        Story(
            id = "s_b21", title = "The Golden Egg", titlePersian = "تخم طلا",
            level = Level.BEGINNER,
            text = "A farmer has a hen. The hen lays one golden egg every day. The farmer becomes rich. But he is greedy. He cuts open the hen. There is no gold inside. Now he has no hen and no golden eggs.",
            moral = "Patience is better than greed.", moralPersian = "صبر بهتر از حرص است.",
            coverUrl = "https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?w=400"
        ),
        Story(
            id = "s_b22", title = "The Bear and the Travelers", titlePersian = "خرس و دو مسافر",
            level = Level.BEGINNER,
            text = "Two men are walking in the forest. A bear appears. One climbs a tree. The other pretends to be dead. The bear sniffs him and leaves. The other says: Don't trust friends who leave you.",
            moral = "A true friend stays with you.", moralPersian = "دوست واقعی کنارت می‌ماند.",
            coverUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=400"
        ),
        Story(
            id = "s_b23", title = "The Milkmaid", titlePersian = "دختر شیرفروش",
            level = Level.BEGINNER,
            text = "A milkmaid carries a pot of milk on her head. She dreams of selling the milk and buying a new dress. She shakes her head with joy. The pot falls and the milk spills. All her dreams are gone.",
            moral = "Do not count your chickens before they hatch.", moralPersian = "جوجه را آخر پاییز می‌شمارند.",
            coverUrl = "https://images.unsplash.com/photo-1567527259232-3a7fdb5f2b1e?w=400"
        ),
        Story(
            id = "s_b24", title = "The Dog and His Shadow", titlePersian = "سگ و سایه‌اش",
            level = Level.BEGINNER,
            text = "A dog carries a bone in his mouth. He crosses a bridge. He sees his shadow in the water. He thinks it is another dog with a bigger bone. He opens his mouth to bark. The bone falls into the water.",
            moral = "Do not lose what you have by wanting more.", moralPersian = "با خواستن بیشتر، آنچه داری را از دست نده.",
            coverUrl = "https://images.unsplash.com/photo-1587300003388-59208cc962cb?w=400"
        ),
        Story(
            id = "s_b25", title = "The Farmer and His Sons", titlePersian = "کشاورز و پسرانش",
            level = Level.BEGINNER,
            text = "An old farmer has three lazy sons. Before he dies, he says: There is a treasure in the field. Dig for it. The sons dig and dig. They find no treasure. But they plant wheat and have a big harvest.",
            moral = "Hard work is the real treasure.", moralPersian = "کار سخت گنج واقعی است.",
            coverUrl = "https://images.unsplash.com/photo-1500937386664-56d1dfef3854?w=400"
        ),
        Story(
            id = "s_b26", title = "The Sun and the Wind", titlePersian = "خورشید و باد",
            level = Level.BEGINNER,
            text = "The sun and the wind argue who is stronger. They see a man with a coat. The wind blows hard. The man holds his coat tighter. The sun shines warm. The man takes off his coat. The sun wins.",
            moral = "Gentleness wins over force.", moralPersian = "ملایمت بر زور پیروز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1504608524841-42fe6f032b4b?w=400"
        ),
        Story(
            id = "s_b27", title = "The City Mouse and Country Mouse", titlePersian = "موش شهری و موش روستایی",
            level = Level.BEGINNER,
            text = "A city mouse visits his cousin. He says: Come to the city. The food is wonderful. But then a cat comes. They run and hide. The country mouse says: I prefer my simple food and peace.",
            moral = "Simple peace is better than rich fear.", moralPersian = "آرامش ساده بهتر از ترس ثروتمند است.",
            coverUrl = "https://images.unsplash.com/photo-1425082661705-1834bfd09dca?w=400"
        ),
        Story(
            id = "s_b28", title = "The Ugly Duckling", titlePersian = "جوجه اردک زشت",
            level = Level.BEGINNER,
            text = "A duckling is born different. The others laugh at him. He leaves the farm. Winter comes. Spring comes. He looks in the water. He is a beautiful white swan. The other swans welcome him.",
            moral = "True beauty comes from within.", moralPersian = "زیبایی واقعی از درون است.",
            coverUrl = "https://images.unsplash.com/photo-1508766206392-8bd5cf550d1c?w=400"
        ),
        Story(
            id = "s_b29", title = "The Three Little Pigs", titlePersian = "سه خوک کوچک",
            level = Level.BEGINNER,
            text = "Three pigs build houses. The first with straw. The second with wood. The third with bricks. A wolf blows down the straw and wood houses. But he cannot blow down the brick house.",
            moral = "Do work carefully and you will be safe.", moralPersian = "کار را محکم انجام بده تا در امان باشی.",
            coverUrl = "https://images.unsplash.com/photo-1516467508483-a7212febe31a?w=400"
        ),
        Story(
            id = "s_b30", title = "The Little Red Hen", titlePersian = "مرغ قرمز کوچک",
            level = Level.BEGINNER,
            text = "A hen finds wheat. She asks her friends to help. Not I, says the cat. Not I, says the dog. She does everything alone. When the bread is ready, they all want to eat it. No, says the hen. I will eat it alone.",
            moral = "Those who do not work do not eat.", moralPersian = "هرکه کار نکند، نخورد.",
            coverUrl = "https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?w=400"
        ),
        Story(
            id = "s_b31", title = "Goldilocks", titlePersian = "گلدیلکس",
            level = Level.BEGINNER,
            text = "A girl named Goldilocks finds a house. She enters and tastes three bowls of porridge. She sleeps in a bed. The bears come home. She wakes up and runs away!",
            moral = "Do not enter a stranger's home.", moralPersian = "به خانه غریبه وارد نشو.",
            coverUrl = "https://images.unsplash.com/photo-1481627834876-b7833e8f5570?w=400"
        ),
        Story(
            id = "s_b32", title = "The Gingerbread Man", titlePersian = "آدم شیرینی‌زنجبیلی",
            level = Level.BEGINNER,
            text = "An old woman makes a gingerbread man. He jumps out and runs away. He runs past everyone. Then he meets a fox. The fox offers to help him cross a river. The gingerbread man trusts him. The fox eats him!",
            moral = "Be careful who you trust.", moralPersian = "مراقب باش به چه کسی اعتماد می‌کنی.",
            coverUrl = "https://images.unsplash.com/photo-1568051243851-f9b136146e97?w=400"
        ),
        Story(
            id = "s_b33", title = "The Enormous Turnip", titlePersian = "شلغم غول‌پیکر",
            level = Level.BEGINNER,
            text = "An old man plants a turnip. It grows very big. He cannot pull it out. He calls his wife. Then the girl. Then the dog. Then the cat. Then the mouse. Together, they pull out the turnip!",
            moral = "Teamwork makes big tasks easy.", moralPersian = "کار گروهی کارهای بزرگ را آسان می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1592394533824-9440e5d68530?w=400"
        ),
        Story(
            id = "s_b34", title = "Stone Soup", titlePersian = "سوپ سنگی",
            level = Level.BEGINNER,
            text = "A hungry traveler puts a stone in a pot of water. He says: I am making stone soup, but it needs salt. Villagers bring salt, carrots, potatoes, onions. Soon there is a delicious soup. Everyone shares it.",
            moral = "Sharing makes everything better.", moralPersian = "بخشیدن همه چیز را بهتر می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1547592180-85f173990554?w=400"
        ),
        Story(
            id = "s_b35", title = "The Princess and the Pea", titlePersian = "شاهزاده و نخود",
            level = Level.BEGINNER,
            text = "A prince wants to marry a real princess. The queen puts a pea under twenty mattresses. In the morning, the girl says she could not sleep. Now they know she is a real princess.",
            moral = "True nature shows itself.", moralPersian = "طبیعت واقعی خود را نشان می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1522771739844-6a9f6d5f14af?w=400"
        ),
        Story(
            id = "s_b36", title = "The Elves and the Shoemaker", titlePersian = "جن‌ها و کفاش",
            level = Level.BEGINNER,
            text = "A poor shoemaker cuts leather and goes to bed. In the morning, the shoes are made. Every night, the shoes are made by little elves. He makes clothes for them. They are happy and leave.",
            moral = "Kindness is rewarded.", moralPersian = "مهربانی پاداش داده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1449505278894-297fdb3edbc1?w=400"
        ),
        Story(
            id = "s_b37", title = "The Little Red Riding Hood", titlePersian = "شنل قرمزی",
            level = Level.BEGINNER,
            text = "A girl visits her grandmother. She meets a wolf. The wolf goes first and eats the grandmother. Then he eats the girl. A woodcutter comes and saves them.",
            moral = "Always listen to good advice.", moralPersian = "همیشه به نصیحت خوب گوش کن.",
            coverUrl = "https://images.unsplash.com/photo-1509248961158-e54f6934749c?w=400"
        ),
        Story(
            id = "s_b38", title = "The Lion and the Slave", titlePersian = "شیر و برده",
            level = Level.BEGINNER,
            text = "A slave hides in a cave. A lion is there with a thorn in his paw. The slave takes it out. The lion becomes his friend. Later, the slave is thrown to the lions. The lion remembers him. The king sets him free.",
            moral = "Kindness is never forgotten.", moralPersian = "مهربانی هرگز فراموش نمی‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1546182990-dffeafbe841d?w=400"
        ),
        Story(
            id = "s_b39", title = "The Wolf and the Lamb", titlePersian = "گرگ و بره",
            level = Level.BEGINNER,
            text = "A wolf sees a lamb drinking from a river. He makes excuses to eat him. Some people just want an excuse.",
            moral = "The wicked find excuses for cruelty.", moralPersian = "بدکاران برای ظلم بهانه می‌سازند.",
            coverUrl = "https://images.unsplash.com/photo-1535930749574-1399327ce78f?w=400"
        ),
        Story(
            id = "s_b40", title = "The Fox and the Crow", titlePersian = "روباه و کلاغ",
            level = Level.BEGINNER,
            text = "A crow sits with a piece of cheese. A fox wants the cheese. He says: Your voice must be beautiful. Please sing. The crow opens her mouth. The cheese falls down. The fox eats it.",
            moral = "Beware of flatterers.", moralPersian = "از چاپلوسان بپرهیز.",
            coverUrl = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=400"
        ),
        Story(
            id = "s_b41", title = "The Hare and the Tortoise", titlePersian = "خرگوش و لاک‌پشت",
            level = Level.BEGINNER,
            text = "A hare laughs at a slow tortoise. The tortoise says: Let's race. The hare runs fast and naps. The tortoise walks slowly but never stops. The tortoise wins!",
            moral = "Slow and steady wins the race.", moralPersian = "آهسته و پیوسته برنده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1589656966895-2f33e7653819?w=400"
        ),
        Story(
            id = "s_b42", title = "The Blue Jackal", titlePersian = "شغال آبی",
            level = Level.BEGINNER,
            text = "A jackal falls into blue dye and becomes blue. Animals think he is a new king. One day he hears other jackals howling. He howls back. The animals know the truth.",
            moral = "Do not pretend to be what you are not.", moralPersian = "خودت را چیزی که نیستی نشان نده.",
            coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
        ),
        Story(
            id = "s_b43", title = "The Monkey and the Crocodile", titlePersian = "میمون و کروکودیل",
            level = Level.BEGINNER,
            text = "A crocodile wants to eat a monkey's heart. The monkey says: I left my heart in the tree. Let me get it. He climbs and stays there.",
            moral = "Quick thinking saves the day.", moralPersian = "تفکر سریع روز را نجات می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1540573133985-87b6da6d54a9?w=400"
        ),
        Story(
            id = "s_b44", title = "The Elephant and the Sparrow", titlePersian = "فیل و گنجشک",
            level = Level.BEGINNER,
            text = "An elephant breaks a sparrow's nest. The sparrow asks other birds for help. They fly into the elephant's eyes. He falls into a ditch.",
            moral = "Even the smallest can be dangerous.", moralPersian = "حتی کوچک‌ترین‌ها می‌توانند خطرناک باشند.",
            coverUrl = "https://images.unsplash.com/photo-1557050543-4d5f4e07ef46?w=400"
        ),
        Story(
            id = "s_b45", title = "The Brahmin and the Goat", titlePersian = "برهمن و بز",
            level = Level.BEGINNER,
            text = "A brahmin carries a goat. Three thieves say it is a dog. The brahmin believes them and leaves the goat. The thieves take it.",
            moral = "Repeated lies can fool anyone.", moralPersian = "دروغ‌های تکرارشده هرکسی را فریب می‌دهند.",
            coverUrl = "https://images.unsplash.com/photo-1535930749574-1399327ce78f?w=400"
        ),
        Story(
            id = "s_b46", title = "The Thirsty Cow", titlePersian = "گاو تشنه",
            level = Level.BEGINNER,
            text = "A cow cannot reach a small pool of water. She uses her horns to dig a path. Water comes to her. She drinks.",
            moral = "Think and you will find a way.", moralPersian = "فکر کن تا راه پیدا کنی.",
            coverUrl = "https://images.unsplash.com/photo-1500595046743-cd271d694d30?w=400"
        ),
        Story(
            id = "s_b47", title = "The Fox and the Stork", titlePersian = "روباه و لک‌لک",
            level = Level.BEGINNER,
            text = "A fox serves soup in a flat plate to a stork. The stork cannot eat. She serves soup in a long jar. Now the fox cannot eat.",
            moral = "Treat others as you want to be treated.", moralPersian = "با دیگران همان‌طور رفتار کن که می‌خواهی با تو رفتار کنند.",
            coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
        ),
        Story(
            id = "s_b48", title = "The Dog in the Manger", titlePersian = "سگ در آخور",
            level = Level.BEGINNER,
            text = "A dog lies in a manger full of hay. An ox comes to eat. The dog barks and growls. The ox says: You cannot eat hay. Why do you stop me?",
            moral = "Do not block others out of spite.", moralPersian = "از روی کینه جلوی دیگران را نگیر.",
            coverUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?w=400"
        ),
        Story(
            id = "s_b49", title = "The Bird and the Bat", titlePersian = "پرنده و خفاش",
            level = Level.BEGINNER,
            text = "A bird flies in the day. The bat flies at night. They never meet but leave messages for each other. They are still friends.",
            moral = "True friendship has no boundaries.", moralPersian = "دوستی واقعی مرز ندارد.",
            coverUrl = "https://images.unsplash.com/photo-1444464666168-49d633b86797?w=400"
        ),
        Story(
            id = "s_b50", title = "The Happy Farmer", titlePersian = "کشاورز خوشحال",
            level = Level.BEGINNER,
            text = "A farmer has a small field. He has enough food. He is happy. His neighbor has a big field but always wants more. He is not happy.",
            moral = "Happiness comes from contentment.", moralPersian = "شادی از قناعت می‌آید.",
            coverUrl = "https://images.unsplash.com/photo-1500937386664-56d1dfef3854?w=400"
        ),

        // ==================== INTERMEDIATE (s_i16 - s_i30) ====================
        Story(
            id = "s_i16", title = "The Two Wolves", titlePersian = "دو گرگ",
            level = Level.INTERMEDIATE,
            text = "An old Cherokee told his grandson: Inside every person, there is a battle between two wolves. One is evil. The other is good. The grandson asked: Which wolf wins? The grandfather replied: The one you feed.",
            moral = "You become what you nurture inside.", moralPersian = "تو همان می‌شوی که درون خود پرورش می‌دهی.",
            coverUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=400"
        ),
        Story(
            id = "s_i17", title = "The Perfect Cup", titlePersian = "فنجان بی‌نقص",
            level = Level.INTERMEDIATE,
            text = "A pottery teacher split her class into two groups. One made one perfect cup. The other made many cups. The second group made better cups. Quantity leads to quality.",
            moral = "Practice makes perfect, not intention.", moralPersian = "تمرین کامل می‌کند، نه نیت.",
            coverUrl = "https://images.unsplash.com/photo-1565193566173-7a0ee3dbe261?w=400"
        ),
        Story(
            id = "s_i18", title = "The Missing Puzzle Piece", titlePersian = "قطعه گمشده پازل",
            level = Level.INTERMEDIATE,
            text = "A man spent years searching for one missing puzzle piece. He found it in his own pocket. Sometimes what we search for is already within us.",
            moral = "What you seek is often within you.", moralPersian = "آنچه می‌جویی اغلب درون توست.",
            coverUrl = "https://images.unsplash.com/photo-1494059980473-813e73ee784b?w=400"
        ),
        Story(
            id = "s_i19", title = "The Prince and the Beggar", titlePersian = "شاهزاده و گدا",
            level = Level.INTERMEDIATE,
            text = "A prince and a beggar switched clothes for a day. The prince discovered hunger, cold, and humiliation. The beggar discovered boredom, loneliness, and pressure. Both agreed every life has its struggles.",
            moral = "Never judge another's life.", moralPersian = "هرگز زندگی دیگری را قضاوت نکن.",
            coverUrl = "https://images.unsplash.com/photo-1518495973542-4542c06a5843?w=400"
        ),
        Story(
            id = "s_i20", title = "The Book That Never Ended", titlePersian = "کتابی که تمام نشد",
            level = Level.INTERMEDIATE,
            text = "A writer spent his whole life writing a book. On his deathbed, the last page was empty. He said: Life is the story that never ends. Keep writing your own story.",
            moral = "Your story is always being written.", moralPersian = "داستان تو همیشه در حال نوشته شدن است.",
            coverUrl = "https://images.unsplash.com/photo-1544716278-ca5e3f4abd8c?w=400"
        ),
        Story(
            id = "s_i21", title = "The River and the Rock", titlePersian = "رودخانه و صخره",
            level = Level.INTERMEDIATE,
            text = "A river met a giant rock. The rock said: You cannot pass me. The river went around and wore the rock down with patience over centuries.",
            moral = "Flexibility overcomes brute force.", moralPersian = "انعطاف بر زور خالص پیروز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1439405326854-014607f694d7?w=400"
        ),
        Story(
            id = "s_i22", title = "The Father's Advice", titlePersian = "توصیه پدر",
            level = Level.INTERMEDIATE,
            text = "A father gave his son two pieces of advice: Keep your word, even when it's hard. Always be kinder than necessary. Two simple rules built a great life.",
            moral = "Simple virtues create great lives.", moralPersian = "فضیلت‌های ساده زندگی‌های بزرگ می‌سازند.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),
        Story(
            id = "s_i23", title = "The Blind Man and the Lantern", titlePersian = "مرد کور و فانوس",
            level = Level.INTERMEDIATE,
            text = "A blind man carried a lantern at night. People laughed. He replied: I carry it for others. So they can see me and not bump into me.",
            moral = "Wisdom is deeper than sight.", moralPersian = "خرد عمیق‌تر از بینایی است.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),
        Story(
            id = "s_i24", title = "The Tailor's Mistake", titlePersian = "اشتباه خیاط",
            level = Level.INTERMEDIATE,
            text = "A tailor cut the cloth too short. Instead of giving up, he redesigned the outfit. It became even more beautiful. Every mistake is an opportunity.",
            moral = "Mistakes can become masterpieces.", moralPersian = "اشتباهات می‌توانند به شاهکار تبدیل شوند.",
            coverUrl = "https://images.unsplash.com/photo-1520006403909-838d6b92c22e?w=400"
        ),
        Story(
            id = "s_i25", title = "The Sailor's Compass", titlePersian = "قطب‌نمای ملوان",
            level = Level.INTERMEDIATE,
            text = "A sailor lost his compass in a storm. He used the stars to guide him. When you lose one way, another appears.",
            moral = "When one door closes, another opens.", moralPersian = "وقتی دری بسته می‌شود، دری دیگر باز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1502933691298-84fc14542831?w=400"
        ),
        Story(
            id = "s_i26", title = "The Old Photograph", titlePersian = "عکس قدیمی",
            level = Level.INTERMEDIATE,
            text = "A woman found an old photograph of her great-grandmother. She realized: She was me. I am her. Our dreams are the same. We are connected across time.",
            moral = "We are connected across generations.", moralPersian = "ما در طول نسل‌ها به هم متصل هستیم.",
            coverUrl = "https://images.unsplash.com/photo-1516575334481-f85287c2c82d?w=400"
        ),
        Story(
            id = "s_i27", title = "The Power of One Voice", titlePersian = "قدرت یک صدا",
            level = Level.INTERMEDIATE,
            text = "One person wrote a letter about pollution. Others read it and joined. Soon, a whole movement started. One voice can change the world.",
            moral = "One voice can change the world.", moralPersian = "یک صدا می‌تواند دنیا را تغییر دهد.",
            coverUrl = "https://images.unsplash.com/photo-1591543620767-582b2e76369e?w=400"
        ),
        Story(
            id = "s_i28", title = "The Gift of Time", titlePersian = "هدیه زمان",
            level = Level.INTERMEDIATE,
            text = "A busy executive learned his son had only a few months to live. He dropped everything. He gave him his time — the most valuable gift.",
            moral = "Time is the greatest gift you can give.", moralPersian = "زمان بزرگ‌ترین هدیه‌ای است که می‌توانی بدهی.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),
        Story(
            id = "s_i29", title = "The Seven Wonders", titlePersian = "هفت عجایب",
            level = Level.INTERMEDIATE,
            text = "A teacher asked students to list the Seven Wonders of the World. One girl said: to see, to hear, to touch, to taste, to feel, to laugh, to love. Those are the real wonders.",
            moral = "The greatest wonders are within us.", moralPersian = "بزرگ‌ترین عجایب درون ما هستند.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),
        Story(
            id = "s_i30", title = "The Last Conversation", titlePersian = "آخرین گفتگو",
            level = Level.INTERMEDIATE,
            text = "A man called his father after years of silence. The next day, his father passed away. Never delay forgiveness. Say what you need to say today.",
            moral = "Never delay saying what matters.", moralPersian = "هرگز گفتن آنچه مهم است را به تأخیر نینداز.",
            coverUrl = "https://images.unsplash.com/photo-1516575334481-f85287c2c82d?w=400"
        ),

        // ==================== ADVANCED (s_a11 - s_a20) ====================
        Story(
            id = "s_a11", title = "The Paradox of Wisdom", titlePersian = "پارادوکس خرد",
            level = Level.ADVANCED,
            text = "The more you learn, the more you realize how little you know. Truly wise people are humble. Arrogance is the mark of shallow learning. Humility is the mark of deep wisdom.",
            moral = "Wisdom begins with humility.", moralPersian = "خرد با فروتنی آغاز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=400"
        ),
        Story(
            id = "s_a12", title = "The Discipline of Solitude", titlePersian = "انتظام تنهایی",
            level = Level.ADVANCED,
            text = "Many great thinkers intentionally sought solitude. In a world of constant noise, solitude is a revolutionary act. It allows you to hear your own thoughts.",
            moral = "Solitude brings clarity and strength.", moralPersian = "تنهایی روشنی و قدرت می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1506461883276-594a12b11cf3?w=400"
        ),
        Story(
            id = "s_a13", title = "The Cost of Convenience", titlePersian = "بهای راحتی",
            level = Level.ADVANCED,
            text = "Every convenience has a hidden cost. Fast food saves time but costs health. Smartphones save effort but cost attention. Choose your conveniences carefully.",
            moral = "Every convenience carries a cost.", moralPersian = "هر راحتی بهایی دارد.",
            coverUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400"
        ),
        Story(
            id = "s_a14", title = "The Beauty of Broken Things", titlePersian = "زیبایی چیزهای شکسته",
            level = Level.ADVANCED,
            text = "In Japan, there is an art called Kintsugi — repairing broken pottery with gold. Our wounds and scars are not flaws. The cracks in our lives are where the light enters.",
            moral = "Our wounds become our strength.", moralPersian = "زخم‌های ما به قدرت ما تبدیل می‌شوند.",
            coverUrl = "https://images.unsplash.com/photo-1578321272176-b7bbc0679853?w=400"
        ),
        Story(
            id = "s_a15", title = "The Silent Revolution", titlePersian = "انقلاب خاموش",
            level = Level.ADVANCED,
            text = "Real revolutions don't happen in the streets. They happen in kitchens, classrooms, and quiet moments of decision. Revolution begins within.",
            moral = "Change begins within each person.", moralPersian = "تغییر از درون هر فرد آغاز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400"
        ),
        Story(
            id = "s_a16", title = "The Illusion of Time", titlePersian = "توهم زمان",
            level = Level.ADVANCED,
            text = "Time feels slow in childhood and fast in old age. The reason is memory. To slow time, do new things. You cannot add years to your life, but you can add life to your years.",
            moral = "New experiences make life feel longer.", moralPersian = "تجربه‌های جدید زندگی را طولانی‌تر می‌کنند.",
            coverUrl = "https://images.unsplash.com/photo-1495364141860-b0d03eccd065?w=400"
        ),
        Story(
            id = "s_a17", title = "The Mirror of Relationship", titlePersian = "آینه رابطه",
            level = Level.ADVANCED,
            text = "Relationships are mirrors. They reflect back to us our fears, patterns, and deepest needs. If you want to know yourself, look at those you love, and those you struggle with.",
            moral = "Relationships reveal who we truly are.", moralPersian = "روابط نشان می‌دهد ما واقعاً کی هستیم.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),
        Story(
            id = "s_a18", title = "The Unopened Gift", titlePersian = "هدیه باز نشده",
            level = Level.ADVANCED,
            text = "Many people spend their lives waiting for permission to live. But no one is coming with that permission. The gift of life is already in your hands. Open it.",
            moral = "Give yourself permission to live fully.", moralPersian = "به خودت اجازه بده کامل زندگی کنی.",
            coverUrl = "https://images.unsplash.com/photo-1513885535751-8b9238bd345a?w=400"
        ),
        Story(
            id = "s_a19", title = "The Empty Room", titlePersian = "اتاق خالی",
            level = Level.ADVANCED,
            text = "A philosopher sat in an empty room for a year. At the end, he said: I learned more in this empty room than in all the libraries of the world.",
            moral = "Emptiness reveals our true nature.", moralPersian = "تهی بودن ماهیت واقعی ما را نشان می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1502672260266-1c1ef2d93688?w=400"
        ),
        Story(
            id = "s_a20", title = "The Final Lesson", titlePersian = "درس نهایی",
            level = Level.ADVANCED,
            text = "A wise master on his deathbed said: In the end, only three things matter — how much you loved, how gently you lived, and how gracefully you let go.",
            moral = "Love and kindness are all that matter.", moralPersian = "عشق و مهربانی تمام آن چیزی است که اهمیت دارد.",
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400"
        )
    )
}