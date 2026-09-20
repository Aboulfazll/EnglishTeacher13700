package com.example.englishteacher.data

data class Story(
    val id: String,
    val title: String,
    val titlePersian: String,
    val level: Level,
    val text: String,
    val moral: String,
    val moralPersian: String,
    val coverUrl: String
)

object StoryBookRepository {

    fun getAllStories(): List<Story> = listOf(

        // ============================================================
        // ==================== BEGINNER (50) =========================
        // ============================================================

        Story(
            id = "s_b1",
            title = "The Lost Cat",
            titlePersian = "گربه گمشده",
            level = Level.BEGINNER,
            text = "A little girl named Sara has a cat. The cat's name is Mimi. One day, Mimi goes out and doesn't come back. Sara is very sad. She looks everywhere. She asks her neighbors, but no one has seen Mimi. Finally, Sara finds Mimi under a big tree. She is sleeping. Sara is very happy!",
            moral = "Never give up hope.",
            moralPersian = "هرگز امید خود را از دست ندهید.",
            coverUrl = "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=400"
        ),

        Story(
            id = "s_b2",
            title = "The Kind Baker",
            titlePersian = "نانوای مهربان",
            level = Level.BEGINNER,
            text = "There is a bakery in a small town. The baker is a kind old man. Every morning, he gives free bread to poor children. One day, a rich man comes to the bakery. He is surprised. He asks the baker: Why do you give free bread? The baker smiles and says: Because I love to help. The rich man gives the baker a lot of money. Now the baker can help more children.",
            moral = "Kindness is always rewarded.",
            moralPersian = "مهربانی همیشه پاداش داده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=400"
        ),

        Story(
            id = "s_b3",
            title = "The Three Friends",
            titlePersian = "سه دوست",
            level = Level.BEGINNER,
            text = "Three friends live in a small village. Their names are Tom, Sam, and Max. They do everything together. They play, study, and work together. One day, a big storm comes. Their houses are in danger. Tom helps Sam fix his roof. Sam helps Max clean his yard. Max helps Tom with his garden. Together, they save all three houses.",
            moral = "Friends help each other in hard times.",
            moralPersian = "دوستان در سختی‌ها به هم کمک می‌کنند.",
            coverUrl = "https://images.unsplash.com/photo-1529156069898-49953e39b3ac?w=400"
        ),

        Story(
            id = "s_b4",
            title = "The Magic Garden",
            titlePersian = "باغ جادویی",
            level = Level.BEGINNER,
            text = "A poor farmer has a small garden. He plants seeds every spring. But nothing grows. One night, a fairy comes to his garden. She says: I will help you, but you must promise to share your food. The farmer says yes. The next morning, beautiful vegetables grow in the garden. The farmer shares his food with everyone. Everyone is happy.",
            moral = "Sharing brings happiness.",
            moralPersian = "بخشش شادی می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400"
        ),

        Story(
            id = "s_b5",
            title = "The Honest Boy",
            titlePersian = "پسر راستگو",
            level = Level.BEGINNER,
            text = "A boy named Ali finds a wallet on the street. There is a lot of money in it. Ali could keep the money, but he doesn't. He takes the wallet to the police. The police find the owner. The owner is a rich man. He is very happy. He gives Ali some money as a gift. Ali says: I only did what is right. Everyone praises Ali for his honesty.",
            moral = "Honesty is the best policy.",
            moralPersian = "صداقت بهترین سیاست است.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),

        Story(
            id = "s_b6",
            title = "The Brave Dog",
            titlePersian = "سگ شجاع",
            level = Level.BEGINNER,
            text = "A dog named Rex lives with a family. One night, Rex hears a strange noise. He barks loudly. The family wakes up. They see a fire in the kitchen. They call the fire station. The firemen come and stop the fire. The family is safe because of Rex. Rex is a hero!",
            moral = "Bravery saves lives.",
            moralPersian = "شجاعت جان‌ها را نجات می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1552053831-71594a27632d?w=400"
        ),

        Story(
            id = "s_b7",
            title = "The Little Bird",
            titlePersian = "پرنده کوچک",
            level = Level.BEGINNER,
            text = "A little bird lives in a tree. One day, the bird falls from the tree. Her wing hurts. She cannot fly. A boy finds her. He takes her home. He gives her food and water. After one week, the bird is strong again. The boy lets her go. The bird flies away. But every morning, she comes back to sing for the boy.",
            moral = "Kindness creates friendship.",
            moralPersian = "مهربانی دوستی می‌سازد.",
            coverUrl = "https://images.unsplash.com/photo-1444464666168-49d633b86797?w=400"
        ),

        Story(
            id = "s_b8",
            title = "The Rainy Day",
            titlePersian = "روز بارانی",
            level = Level.BEGINNER,
            text = "It is raining hard. A boy named Ben is walking home. He has no umbrella. He gets very wet. An old woman sees him. She gives him her umbrella. Ben says thank you. He walks home dry. The next day, Ben buys a new umbrella. He gives it to the old woman. She smiles. They become friends.",
            moral = "Return kindness with kindness.",
            moralPersian = "مهربانی را با مهربانی پاسخ دهید.",
            coverUrl = "https://images.unsplash.com/photo-1519692933481-e162a57d6721?w=400"
        ),

        Story(
            id = "s_b9",
            title = "My First Day at School",
            titlePersian = "اولین روز مدرسه من",
            level = Level.BEGINNER,
            text = "Today is my first day at school. I am very nervous. I don't know anyone. My mother says: Don't worry, you will make friends. In class, a girl sits next to me. Her name is Lily. She smiles at me. We eat lunch together. I am not nervous anymore. School is fun!",
            moral = "New beginnings bring new friends.",
            moralPersian = "شروع‌های جدید دوستان جدید می‌آورند.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Story(
            id = "s_b10",
            title = "The Red Balloon",
            titlePersian = "بادکنک قرمز",
            level = Level.BEGINNER,
            text = "A little girl has a red balloon. She loves it very much. One day, the wind takes the balloon away. The girl cries. A boy sees her. He has a blue balloon. He gives it to the girl. She smiles and says thank you. Now the girl has a blue balloon and a new friend.",
            moral = "A small gift can bring big joy.",
            moralPersian = "هدیه کوچک شادی بزرگ می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1530103862676-de8c9debad1d?w=400"
        ),

        Story(
            id = "s_b11",
            title = "The Thirsty Crow",
            titlePersian = "کلاغ تشنه",
            level = Level.BEGINNER,
            text = "A crow is very thirsty. He looks for water everywhere. Finally, he finds a pot with a little water. But the pot is deep. The crow cannot reach the water. He has an idea. He puts small stones in the pot. The water goes up. Now the crow can drink. He is very happy.",
            moral = "Where there is a will, there is a way.",
            moralPersian = "خواستن توانستن است.",
            coverUrl = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=400"
        ),

        Story(
            id = "s_b12",
            title = "The Hungry Fox",
            titlePersian = "روباه گرسنه",
            level = Level.BEGINNER,
            text = "A fox is very hungry. He looks for food in the forest. He sees a crow with a piece of cheese in her mouth. The fox says: Dear crow, you have a beautiful voice. Please sing for me. The crow opens her mouth to sing. The cheese falls down. The fox catches it and runs away. The crow learns a lesson.",
            moral = "Do not trust flatterers.",
            moralPersian = "به چاپلوسان اعتماد نکنید.",
            coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
        ),

        Story(
            id = "s_b13",
            title = "The Ant and the Grasshopper",
            titlePersian = "مورچه و ملخ",
            level = Level.BEGINNER,
            text = "In summer, an ant works hard. She collects food for winter. A grasshopper sings and plays all day. He laughs at the ant. He says: Why do you work so much? Come and play! The ant says: Winter is coming. But the grasshopper doesn't listen. When winter comes, the grasshopper has no food. The ant shares her food with him.",
            moral = "Prepare today for tomorrow.",
            moralPersian = "امروز برای فردا آماده شو.",
            coverUrl = "https://images.unsplash.com/photo-1557063673-0493c4f8f6c4?w=400"
        ),

        Story(
            id = "s_b14",
            title = "The Lion and the Mouse",
            titlePersian = "شیر و موش",
            level = Level.BEGINNER,
            text = "A lion is sleeping. A little mouse runs over his nose. The lion wakes up and catches the mouse. The mouse says: Please let me go. One day I will help you. The lion laughs. How can a tiny mouse help a lion? But he lets the mouse go. Later, the lion is caught in a net. The mouse comes and cuts the net with her teeth. The lion is free.",
            moral = "Even the small can help the great.",
            moralPersian = "حتی کوچک‌ها می‌توانند به بزرگ‌ها کمک کنند.",
            coverUrl = "https://images.unsplash.com/photo-1546182990-dffeafbe841d?w=400"
        ),

        Story(
            id = "s_b15",
            title = "The Turtle and the Rabbit",
            titlePersian = "لاک‌پشت و خرگوش",
            level = Level.BEGINNER,
            text = "A rabbit laughs at a slow turtle. The turtle says: Let's have a race. The rabbit agrees. The race begins. The rabbit runs very fast. He is far ahead. He decides to take a nap. The turtle walks slowly but never stops. While the rabbit sleeps, the turtle passes him. The turtle wins the race!",
            moral = "Slow and steady wins the race.",
            moralPersian = "آهسته و پیوسته برنده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1485968579580-b6d095142e6e?w=400"
        ),

        Story(
            id = "s_b16",
            title = "The Clever Fox",
            titlePersian = "روباه باهوش",
            level = Level.BEGINNER,
            text = "A fox is very hungry. He sees grapes on a high branch. He jumps and jumps, but he cannot reach them. Finally, he gives up. He says: The grapes are probably sour anyway. He walks away. This is how we sometimes lie to ourselves when we cannot get what we want.",
            moral = "Do not hate what you cannot have.",
            moralPersian = "از آنچه نمی‌توانی داشته باشی متنفر نباش.",
            coverUrl = "https://images.unsplash.com/photo-1535581652167-3d6b98c9f7f8?w=400"
        ),

        Story(
            id = "s_b17",
            title = "The Greedy Dog",
            titlePersian = "سگ حریص",
            level = Level.BEGINNER,
            text = "A dog has a piece of meat. He walks near a river. He sees his reflection in the water. He thinks it is another dog with a bigger piece of meat. He opens his mouth to bark. His meat falls into the river. Now he has nothing. He learns not to be greedy.",
            moral = "Greed loses what it has.",
            moralPersian = "حرص آنچه را دارد از دست می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?w=400"
        ),

        Story(
            id = "s_b18",
            title = "The Woodcutter and the Axe",
            titlePersian = "چوب‌بر و تبر",
            level = Level.BEGINNER,
            text = "A woodcutter drops his old axe in a river. He is sad. A spirit appears. He shows a gold axe. Is this yours? No. He shows a silver axe. Is this yours? No. He shows the old axe. Yes! That is mine. The spirit is happy with the woodcutter's honesty. He gives him all three axes.",
            moral = "Honesty brings unexpected rewards.",
            moralPersian = "صداقت پاداش غیرمنتظره می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1441974231531-c6227db76b6e?w=400"
        ),

        Story(
            id = "s_b19",
            title = "The Two Frogs",
            titlePersian = "دو قورباغه",
            level = Level.BEGINNER,
            text = "Two frogs fall into a bucket of milk. They try to jump out, but the sides are too high. One frog gives up and drowns. The other frog keeps kicking. He kicks and kicks. The milk turns into butter. He jumps on the butter and escapes. Never give up!",
            moral = "Keep trying and you will succeed.",
            moralPersian = "تلاش کن تا موفق شوی.",
            coverUrl = "https://images.unsplash.com/photo-1552566626-52f8b828add9?w=400"
        ),

        Story(
            id = "s_b20",
            title = "The Boy Who Cried Wolf",
            titlePersian = "پسرک چوپان و گرگ",
            level = Level.BEGINNER,
            text = "A boy takes care of sheep. He is bored. He shouts: Wolf! Wolf! The villagers run to help. There is no wolf. The boy laughs. He does it again. The villagers come again. No wolf. Then a real wolf comes. The boy shouts: Wolf! But no one comes. The wolf eats the sheep.",
            moral = "No one believes a liar.",
            moralPersian = "هیچ‌کس دروغگو را باور نمی‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1516467508483-a7212febe31a?w=400"
        ),

        Story(
            id = "s_b21",
            title = "The Golden Egg",
            titlePersian = "تخم طلا",
            level = Level.BEGINNER,
            text = "A farmer has a hen. The hen lays one golden egg every day. The farmer becomes rich. But he is greedy. He wants all the gold at once. He cuts open the hen. There is no gold inside. Now he has no hen and no golden eggs. He is very sad.",
            moral = "Patience is better than greed.",
            moralPersian = "صبر بهتر از حرص است.",
            coverUrl = "https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?w=400"
        ),

        Story(
            id = "s_b22",
            title = "The Bear and the Travelers",
            titlePersian = "خرس و دو مسافر",
            level = Level.BEGINNER,
            text = "Two men are walking in the forest. A bear appears. One man climbs a tree. The other falls to the ground and pretends to be dead. The bear comes close and sniffs him. He does not move. The bear thinks he is dead and leaves. The first man comes down and asks: What did the bear say? The other says: He said, don't trust friends who leave you.",
            moral = "A true friend stays with you.",
            moralPersian = "دوست واقعی کنارت می‌ماند.",
            coverUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=400"
        ),

        Story(
            id = "s_b23",
            title = "The Milkmaid",
            titlePersian = "دختر شیرفروش",
            level = Level.BEGINNER,
            text = "A milkmaid carries a pot of milk on her head. She dreams of selling the milk. She will buy eggs. The eggs will become chickens. The chickens will lay more eggs. She will buy a new dress. She will go to the dance. She is so happy she shakes her head. The pot falls and the milk spills. All her dreams are gone.",
            moral = "Do not count your chickens before they hatch.",
            moralPersian = "جوجه را آخر پاییز می‌شمارند.",
            coverUrl = "https://images.unsplash.com/photo-1567527259232-3a7fdb5f2b1e?w=400"
        ),

        Story(
            id = "s_b24",
            title = "The Dog and His Shadow",
            titlePersian = "سگ و سایه‌اش",
            level = Level.BEGINNER,
            text = "A dog carries a bone in his mouth. He crosses a bridge. He looks down and sees his shadow in the water. He thinks it is another dog with a bigger bone. He opens his mouth to bark. The bone falls into the water. Now he has nothing. Be happy with what you have.",
            moral = "Do not lose what you have by wanting more.",
            moralPersian = "با خواستن بیشتر، آنچه داری را از دست نده.",
            coverUrl = "https://images.unsplash.com/photo-1587300003388-59208cc962cb?w=400"
        ),

        Story(
            id = "s_b25",
            title = "The Farmer and His Sons",
            titlePersian = "کشاورز و پسرانش",
            level = Level.BEGINNER,
            text = "An old farmer has three lazy sons. He wants to teach them to work. Before he dies, he says: There is a treasure in the field. Dig for it. After he dies, the sons dig and dig. They find no treasure. But the digging makes the soil good. They plant wheat. They have a big harvest. They understand now.",
            moral = "Hard work is the real treasure.",
            moralPersian = "کار سخت گنج واقعی است.",
            coverUrl = "https://images.unsplash.com/photo-1500937386664-56d1dfef3854?w=400"
        ),

        Story(
            id = "s_b26",
            title = "The Sun and the Wind",
            titlePersian = "خورشید و باد",
            level = Level.BEGINNER,
            text = "The sun and the wind argue. Who is stronger? They see a man with a coat. The wind says: I can make him take off his coat. The wind blows hard. The man holds his coat tighter. The sun shines warm. The man takes off his coat. The sun wins. Gentleness is stronger than force.",
            moral = "Gentleness wins over force.",
            moralPersian = "ملایمت بر زور پیروز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1504608524841-42fe6f032b4b?w=400"
        ),

        Story(
            id = "s_b27",
            title = "The City Mouse and Country Mouse",
            titlePersian = "موش شهری و موش روستایی",
            level = Level.BEGINNER,
            text = "A city mouse visits his cousin in the country. He eats simple food. He says: Come to the city. There is delicious food. The country mouse goes. The food is wonderful. But then a cat comes. They run and hide. The country mouse says: I prefer my simple food and peace.",
            moral = "Simple peace is better than rich fear.",
            moralPersian = "آرامش ساده بهتر از ترس ثروتمند است.",
            coverUrl = "https://images.unsplash.com/photo-1425082661705-1834bfd09dca?w=400"
        ),

        Story(
            id = "s_b28",
            title = "The Ugly Duckling",
            titlePersian = "جوجه اردک زشت",
            level = Level.BEGINNER,
            text = "A duckling is born different. He is grey and big. The other ducklings laugh at him. He is very sad. He leaves the farm. Winter comes. He feels lonely. Spring comes. He looks in the water. He is not a duckling anymore. He is a beautiful white swan. The other swans welcome him.",
            moral = "True beauty comes from within.",
            moralPersian = "زیبایی واقعی از درون است.",
            coverUrl = "https://images.unsplash.com/photo-1508766206392-8bd5cf550d1c?w=400"
        ),

        Story(
            id = "s_b29",
            title = "The Three Little Pigs",
            titlePersian = "سه خوک کوچک",
            level = Level.BEGINNER,
            text = "Three little pigs build houses. The first builds with straw. The second builds with wood. The third builds with bricks. A wolf comes. He blows down the straw house. He blows down the wood house. But he cannot blow down the brick house. The three pigs live together safely.",
            moral = "Do work carefully and you will be safe.",
            moralPersian = "کار را محکم انجام بده تا در امان باشی.",
            coverUrl = "https://images.unsplash.com/photo-1516467508483-a7212febe31a?w=400"
        ),

        Story(
            id = "s_b30",
            title = "The Little Red Hen",
            titlePersian = "مرغ قرمز کوچک",
            level = Level.BEGINNER,
            text = "A little red hen finds some wheat. She asks her friends to help plant it. Not I, says the cat. Not I, says the dog. Not I, says the duck. She plants it alone. She cuts it alone. She makes bread alone. Now, who will help me eat it? I will! say her friends. No, says the hen. I will eat it alone.",
            moral = "Those who do not work do not eat.",
            moralPersian = "هرکه کار نکند، نخورد.",
            coverUrl = "https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?w=400"
        ),

        Story(
            id = "s_b31",
            title = "Goldilocks",
            titlePersian = "گلدیلکس",
            level = Level.BEGINNER,
            text = "A girl named Goldilocks walks in the forest. She finds a house. The door is open. She goes in. There are three bowls of porridge. She tastes them. The first is too hot. The second is too cold. The third is just right. She eats it. Then she sleeps in a bed. The bears come home. She wakes up and runs away!",
            moral = "Do not enter a stranger's home.",
            moralPersian = "به خانه غریبه وارد نشو.",
            coverUrl = "https://images.unsplash.com/photo-1481627834876-b7833e8f5570?w=400"
        ),

        Story(
            id = "s_b32",
            title = "The Gingerbread Man",
            titlePersian = "آدم شیرینی‌زنجبیلی",
            level = Level.BEGINNER,
            text = "An old woman makes a gingerbread man. He jumps out of the oven and runs away. He runs past a cow, a horse, and a farmer. He says: Run, run as fast as you can! You can't catch me, I'm the Gingerbread Man! Then he meets a fox. The fox offers to help him cross a river. The gingerbread man trusts him. The fox eats him!",
            moral = "Be careful who you trust.",
            moralPersian = "مراقب باش به چه کسی اعتماد می‌کنی.",
            coverUrl = "https://images.unsplash.com/photo-1568051243851-f9b136146e97?w=400"
        ),

        Story(
            id = "s_b33",
            title = "The Enormous Turnip",
            titlePersian = "شلغم غول‌پیکر",
            level = Level.BEGINNER,
            text = "An old man plants a turnip. It grows very big. He tries to pull it out. He cannot. He calls his wife. They pull together. They cannot. They call the girl. They pull. They cannot. They call the dog. They pull. They cannot. They call the cat. They pull. They call the mouse. Together, they pull out the turnip!",
            moral = "Teamwork makes big tasks easy.",
            moralPersian = "کار گروهی کارهای بزرگ را آسان می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1592394533824-9440e5d68530?w=400"
        ),

        Story(
            id = "s_b34",
            title = "Stone Soup",
            titlePersian = "سوپ سنگی",
            level = Level.BEGINNER,
            text = "A hungry traveler comes to a village. He has no food. He puts a stone in a pot of water. He says: I am making stone soup, but it needs a little salt. A villager brings salt. Then he says it needs carrots. Someone brings carrots. Then potatoes. Then onions. Soon there is a big pot of delicious soup. Everyone shares it.",
            moral = "Sharing makes everything better.",
            moralPersian = "بخشیدن همه چیز را بهتر می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1547592180-85f173990554?w=400"
        ),

        Story(
            id = "s_b35",
            title = "The Princess and the Pea",
            titlePersian = "شاهزاده و نخود",
            level = Level.BEGINNER,
            text = "A prince wants to marry a real princess. One night, a girl comes to the castle. She says she is a princess. The queen puts a pea under twenty mattresses. The girl sleeps on top. In the morning, she says she could not sleep. Something hard was in her bed. Now they know she is a real princess. They get married.",
            moral = "True nature shows itself.",
            moralPersian = "طبیعت واقعی خود را نشان می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1522771739844-6a9f6d5f14af?w=400"
        ),

        Story(
            id = "s_b36",
            title = "The Elves and the Shoemaker",
            titlePersian = "جن‌ها و کفاش",
            level = Level.BEGINNER,
            text = "A poor shoemaker has only enough leather for one pair of shoes. He cuts the leather and goes to bed. In the morning, the shoes are made. They are beautiful. He sells them for a good price. Every night, the shoes are made. He stays awake and sees little elves. They are making the shoes. He makes clothes for them. They are happy and leave.",
            moral = "Kindness is rewarded.",
            moralPersian = "مهربانی پاداش داده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1449505278894-297fdb3edbc1?w=400"
        ),

        Story(
            id = "s_b37",
            title = "The Little Red Riding Hood",
            titlePersian = "شنل قرمزی",
            level = Level.BEGINNER,
            text = "A girl visits her grandmother. Her mother says: Do not talk to strangers. On the way, she meets a wolf. The wolf goes to grandmother's house. He eats the grandmother. He waits for the girl. The girl comes. She sees big eyes and big teeth. The wolf eats her too. A woodcutter comes and saves them. Always listen to your mother!",
            moral = "Always listen to good advice.",
            moralPersian = "همیشه به نصیحت خوب گوش کن.",
            coverUrl = "https://images.unsplash.com/photo-1509248961158-e54f6934749c?w=400"
        ),

        Story(
            id = "s_b38",
            title = "The Lion and the Slave",
            titlePersian = "شیر و برده",
            level = Level.BEGINNER,
            text = "A slave runs away from his master. He hides in a cave. A lion is there. The lion has a thorn in his paw. The slave takes it out. The lion becomes his friend. Later, the slave is caught. He is thrown to the lions. But the lion remembers him. He does not hurt him. The king is amazed. He sets the slave free.",
            moral = "Kindness is never forgotten.",
            moralPersian = "مهربانی هرگز فراموش نمی‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1546182990-dffeafbe841d?w=400"
        ),

        Story(
            id = "s_b39",
            title = "The Wolf and the Lamb",
            titlePersian = "گرگ و بره",
            level = Level.BEGINNER,
            text = "A wolf sees a lamb drinking from a river. The wolf wants to eat him. He says: You are making the water dirty! The lamb says: But I am downstream. The wolf says: You said bad things about me last year. The lamb says: I was not born last year. The wolf says: Then it was your father! He eats the lamb. Some people just want an excuse.",
            moral = "The wicked find excuses for cruelty.",
            moralPersian = "بدکاران برای ظلم بهانه می‌سازند.",
            coverUrl = "https://images.unsplash.com/photo-1535930749574-1399327ce78f?w=400"
        ),

        Story(
            id = "s_b40",
            title = "The Fox and the Crow",
            titlePersian = "روباه و کلاغ",
            level = Level.BEGINNER,
            text = "A crow sits on a branch with a piece of cheese. A fox wants the cheese. He says: Your feathers are so beautiful. Your voice must be beautiful too. Please sing. The crow is happy. She opens her mouth to sing. The cheese falls down. The fox eats it. Never trust a flatterer.",
            moral = "Beware of flatterers.",
            moralPersian = "از چاپلوسان بپرهیز.",
            coverUrl = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=400"
        ),

        Story(
            id = "s_b41",
            title = "The Hare and the Tortoise",
            titlePersian = "خرگوش و لاک‌پشت",
            level = Level.BEGINNER,
            text = "A hare laughs at a slow tortoise. The tortoise says: Let's race. The hare agrees. The race starts. The hare runs fast. He is far ahead. He decides to rest. He falls asleep. The tortoise walks slowly but never stops. He passes the hare. The tortoise wins. Slow and steady wins!",
            moral = "Slow and steady wins the race.",
            moralPersian = "آهسته و پیوسته برنده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1589656966895-2f33e7653819?w=400"
        ),

        Story(
            id = "s_b42",
            title = "The Blue Jackal",
            titlePersian = "شغال آبی",
            level = Level.BEGINNER,
            text = "A jackal falls into a pot of blue dye. He becomes blue. All animals are afraid. They think he is a new king. He becomes their king. One day, he hears other jackals howling. He howls back. The animals know the truth. They chase him away. Never pretend to be someone you are not.",
            moral = "Do not pretend to be what you are not.",
            moralPersian = "خودت را چیزی که نیستی نشان نده.",
            coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
        ),

        Story(
            id = "s_b43",
            title = "The Monkey and the Crocodile",
            titlePersian = "میمون و کروکودیل",
            level = Level.BEGINNER,
            text = "A monkey lives in a tree by a river. A crocodile wants to eat the monkey's heart. He tells the monkey: Come to my house. My wife is sick and needs a monkey's heart. The monkey says: Oh! I left my heart in the tree. Let me get it. He climbs the tree and stays there. The crocodile waits forever.",
            moral = "Quick thinking saves the day.",
            moralPersian = "تفکر سریع روز را نجات می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1540573133985-87b6da6d54a9?w=400"
        ),

        Story(
            id = "s_b44",
            title = "The Elephant and the Sparrow",
            titlePersian = "فیل و گنجشک",
            level = Level.BEGINNER,
            text = "A sparrow builds a nest in a tree. An elephant breaks the branch. The eggs fall and break. The sparrow is very sad. She asks other birds for help. They all come together. They fly into the elephant's eyes. The elephant cannot see. He falls into a ditch. The sparrow has her revenge.",
            moral = "Even the smallest can be dangerous.",
            moralPersian = "حتی کوچک‌ترین‌ها می‌توانند خطرناک باشند.",
            coverUrl = "https://images.unsplash.com/photo-1557050543-4d5f4e07ef46?w=400"
        ),

        Story(
            id = "s_b45",
            title = "The Brahmin and the Goat",
            titlePersian = "برهمن و بز",
            level = Level.BEGINNER,
            text = "A brahmin is carrying a goat. Three thieves want to steal it. One thief says: What a strange dog you have. The brahmin says: It is a goat. The second thief says: Why carry a dog? The brahmin doubts. The third thief says: Please leave that dog. The brahmin believes them. He leaves the goat. The thieves take it.",
            moral = "Repeated lies can fool anyone.",
            moralPersian = "دروغ‌های تکرارشده هرکسی را فریب می‌دهند.",
            coverUrl = "https://images.unsplash.com/photo-1535930749574-1399327ce78f?w=400"
        ),

        Story(
            id = "s_b46",
            title = "The Thirsty Cow",
            titlePersian = "گاو تشنه",
            level = Level.BEGINNER,
            text = "A cow is very thirsty. She finds a small pool of water. But she cannot reach it. She thinks. She uses her horns to dig a small path. Water comes to her. She drinks. Where there is a will, there is a way.",
            moral = "Think and you will find a way.",
            moralPersian = "فکر کن تا راه پیدا کنی.",
            coverUrl = "https://images.unsplash.com/photo-1500595046743-cd271d694d30?w=400"
        ),

        Story(
            id = "s_b47",
            title = "The Fox and the Stork",
            titlePersian = "روباه و لک‌لک",
            level = Level.BEGINNER,
            text = "A fox invites a stork to dinner. He serves soup in a flat plate. The stork cannot eat with her long beak. She goes home hungry. She invites the fox to dinner. She serves soup in a long-necked jar. Now the fox cannot eat. Treat others as you want to be treated.",
            moral = "Treat others as you want to be treated.",
            moralPersian = "با دیگران همان‌طور رفتار کن که می‌خواهی با تو رفتار کنند.",
            coverUrl = "https://images.unsplash.com/photo-1474511320723-9a56873867b5?w=400"
        ),

        Story(
            id = "s_b48",
            title = "The Dog in the Manger",
            titlePersian = "سگ در آخور",
            level = Level.BEGINNER,
            text = "A dog lies in a manger full of hay. An ox comes to eat. The dog barks and growls. The ox says: You cannot eat hay. Why do you stop me from eating? Do not stop others from enjoying what you cannot use.",
            moral = "Do not block others out of spite.",
            moralPersian = "از روی کینه جلوی دیگران را نگیر.",
            coverUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee?w=400"
        ),

        Story(
            id = "s_b49",
            title = "The Bird and the Bat",
            titlePersian = "پرنده و خفاش",
            level = Level.BEGINNER,
            text = "A bird and a bat are friends. The bird flies in the day. The bat flies at night. They never meet. They leave messages for each other. They are still friends. Friendship does not need to be always together.",
            moral = "True friendship has no boundaries.",
            moralPersian = "دوستی واقعی مرز ندارد.",
            coverUrl = "https://images.unsplash.com/photo-1444464666168-49d633b86797?w=400"
        ),

        Story(
            id = "s_b50",
            title = "The Happy Farmer",
            titlePersian = "کشاورز خوشحال",
            level = Level.BEGINNER,
            text = "A farmer has a small field. He works hard. He has enough food for his family. He is happy. His neighbor has a big field. He always wants more. He is not happy. The poor farmer says: I have enough. That is why I am happy. Happiness is being content.",
            moral = "Happiness comes from contentment.",
            moralPersian = "شادی از قناعت می‌آید.",
            coverUrl = "https://images.unsplash.com/photo-1500937386664-56d1dfef3854?w=400"
        ),

        // ============================================================
        // ==================== INTERMEDIATE (30) =====================
        // ============================================================

        Story(
            id = "s_i1",
            title = "The Wise Judge",
            titlePersian = "قاضی دانا",
            level = Level.INTERMEDIATE,
            text = "Long ago, there was a wise judge in a small kingdom. One day, two men came to him. Both claimed to own the same horse. The judge thought for a moment. He said: Release the horse and see whose call it follows. The horse ran to the second man. The judge declared that the horse belonged to him. Everyone was amazed by the judge's wisdom.",
            moral = "Wisdom solves difficult problems.",
            moralPersian = "خرد مشکلات دشوار را حل می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1589829545856-d10d557cf95f?w=400"
        ),

        Story(
            id = "s_i2",
            title = "The Two Brothers",
            titlePersian = "دو برادر",
            level = Level.INTERMEDIATE,
            text = "Two brothers inherited a farm from their father. They argued about how to divide the land. The older brother wanted the bigger part. The younger brother wanted the same. They didn't speak to each other for months. One day, the older brother fell ill. The younger brother came to help. Together, they realized that family is more important than land. They divided the farm equally.",
            moral = "Family is more valuable than possessions.",
            moralPersian = "خانواده از دارایی ارزشمندتر است.",
            coverUrl = "https://images.unsplash.com/photo-1609220136736-443140cffec6?w=400"
        ),

        Story(
            id = "s_i3",
            title = "The Patient Farmer",
            titlePersian = "کشاورز صبور",
            level = Level.INTERMEDIATE,
            text = "A young farmer planted a bamboo seed. He watered it every day. After a year, nothing grew. His neighbors laughed at him. They said: You are wasting your time! But the farmer kept watering. In the fifth year, a bamboo shoot appeared. In just six weeks, it grew thirty meters tall. The roots had been growing underground all along.",
            moral = "Patience is the key to success.",
            moralPersian = "صبر کلید موفقیت است.",
            coverUrl = "https://images.unsplash.com/photo-1500382017468-9049fed747ef?w=400"
        ),

        Story(
            id = "s_i4",
            title = "The Generous King",
            titlePersian = "پادشاه بخشنده",
            level = Level.INTERMEDIATE,
            text = "A king was very generous to his people. He gave food to the poor and gold to the needy. His advisors worried that he would run out of money. But the king said: The more I give, the more I receive. Years later, his kingdom was the richest and happiest in the world. People from other lands came to live there.",
            moral = "Giving is more rewarding than receiving.",
            moralPersian = "بخشیدن پاداش بیشتری از گرفتن دارد.",
            coverUrl = "https://images.unsplash.com/photo-1599694230276-3ea3b20d5b1e?w=400"
        ),

        Story(
            id = "s_i5",
            title = "The Clever Student",
            titlePersian = "دانش‌آموز باهوش",
            level = Level.INTERMEDIATE,
            text = "A teacher asked her students: What is the most important thing in life? One student said: Money. Another said: Health. A third said: Family. The teacher smiled and said: You are all right. But the most important thing is time. With time, you can earn money, improve your health, and build a family. Use your time wisely.",
            moral = "Time is the most valuable resource.",
            moralPersian = "زمان باارزش‌ترین منبع است.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Story(
            id = "s_i6",
            title = "The Architect's Dream",
            titlePersian = "رویای معمار",
            level = Level.INTERMEDIATE,
            text = "A young architect dreamed of building a beautiful bridge. Everyone said it was impossible. The river was too wide, the rocks too hard. But he spent years studying and planning. Finally, he presented his design. It was brilliant. The bridge was built and still stands today. His name is remembered forever.",
            moral = "Dreams require determination to become reality.",
            moralPersian = "رویاها برای واقعی شدن به اراده نیاز دارند.",
            coverUrl = "https://images.unsplash.com/photo-1545558014-8692077e9b5c?w=400"
        ),

        Story(
            id = "s_i7",
            title = "The Silent Teacher",
            titlePersian = "معلم خاموش",
            level = Level.INTERMEDIATE,
            text = "A wise teacher never gave direct answers. When students asked questions, he asked questions back. Some students were frustrated. But over time, they learned to think for themselves. Years later, they realized the greatest lesson he taught was not what to think, but how to think. That is the mark of a true teacher.",
            moral = "Good teachers teach you how to think.",
            moralPersian = "معلمان خوب به تو یاد می‌دهند چطور فکر کنی.",
            coverUrl = "https://images.unsplash.com/photo-1509062522246-3755977927d7?w=400"
        ),

        Story(
            id = "s_i8",
            title = "The Two Travelers",
            titlePersian = "دو مسافر",
            level = Level.INTERMEDIATE,
            text = "Two travelers were walking through a desert. They had one bottle of water. One said: We should save it for later. The other said: We should drink it now. They argued for hours. Finally, they agreed to save it. But by the time they found a village, they were too weak to drink. Sometimes, caution can be dangerous too.",
            moral = "Balance is important in every decision.",
            moralPersian = "تعادل در هر تصمیمی مهم است.",
            coverUrl = "https://images.unsplash.com/photo-1509316785289-025f5b846b35?w=400"
        ),

        Story(
            id = "s_i9",
            title = "The Lost Kingdom",
            titlePersian = "پادشاهی گمشده",
            level = Level.INTERMEDIATE,
            text = "An emperor sent his son to find a lost kingdom. The prince traveled for years. He found no kingdom. Frustrated, he returned home. His father asked: Did you find it? The prince said no. The emperor smiled and said: The kingdom you were looking for was the wisdom you gained on the journey. That is more valuable than any land.",
            moral = "The journey teaches more than the destination.",
            moralPersian = "سفر بیشتر از مقصد می‌آموزد.",
            coverUrl = "https://images.unsplash.com/photo-1533105079780-92b9be482077?w=400"
        ),

        Story(
            id = "s_i10",
            title = "The Real Treasure",
            titlePersian = "گنج واقعی",
            level = Level.INTERMEDIATE,
            text = "A merchant spent his life searching for treasure. He traveled to many countries. He crossed oceans and climbed mountains. When he was old, he returned home empty-handed. His wife asked: Did you find treasure? He said: No. But then he looked at his children and grandchildren. He said: I found the real treasure — family.",
            moral = "The greatest treasure is often at home.",
            moralPersian = "بزرگ‌ترین گنج اغلب در خانه است.",
            coverUrl = "https://images.unsplash.com/photo-1609220136736-443140cffec6?w=400"
        ),

        Story(
            id = "s_i11",
            title = "The Bridge Builder",
            titlePersian = "سازنده پل",
            level = Level.INTERMEDIATE,
            text = "An old man built a bridge across a dangerous river. A young traveler asked: Why build a bridge? You will not cross it again. The old man replied: Someone will. And that someone might be you, or your children. That is why we build bridges — for those who come after us.",
            moral = "Build for those who come after you.",
            moralPersian = "برای کسانی که بعد از تو می‌آیند بساز.",
            coverUrl = "https://images.unsplash.com/photo-1476514525535-07fb3b4ae5f1?w=400"
        ),

        Story(
            id = "s_i12",
            title = "The Silent Bell",
            titlePersian = "زنگ خاموش",
            level = Level.INTERMEDIATE,
            text = "A village had a bell that only rang when someone told a lie. One day, a rich man claimed he had given all his wealth to the poor. The bell did not ring. Everyone was confused. Then they realized — the bell rang not for lies, but for truths people refused to admit. The rich man believed his own lie.",
            moral = "Self-deception is the deepest lie.",
            moralPersian = "خودفریبی عمیق‌ترین دروغ است.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),

        Story(
            id = "s_i13",
            title = "The Garden of Time",
            titlePersian = "باغ زمان",
            level = Level.INTERMEDIATE,
            text = "An old gardener planted trees that would take a hundred years to grow. A young man asked: Why plant trees you will never see? The gardener replied: I am eating fruit from trees planted by those before me. This garden is not mine — it belongs to those who come next. This is how civilization grows.",
            moral = "We inherit and pass on the future.",
            moralPersian = "ما آینده را به ارث می‌بریم و منتقل می‌کنیم.",
            coverUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400"
        ),

        Story(
            id = "s_i14",
            title = "The Letter That Changed Everything",
            titlePersian = "نامه‌ای که همه چیز را تغییر داد",
            level = Level.INTERMEDIATE,
            text = "A young woman found an old letter in her grandmother's attic. It was written by her grandfather during a war. It said: If I don't return, tell my children that love is the only thing worth fighting for. That letter changed her life. She became a peace activist. One letter written decades ago shaped an entire generation.",
            moral = "Words can outlive their writers.",
            moralPersian = "کلمات می‌توانند از نویسندگانشان عمر بیشتری کنند.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),

        Story(
            id = "s_i15",
            title = "The Lonely Lighthouse",
            titlePersian = "فانوس دریایی تنها",
            level = Level.INTERMEDIATE,
            text = "A lighthouse stood alone on a rocky island. Every night, it shone its light across the sea, saving ships from the rocks. The keeper was an old man who lived there for forty years. When asked if he was lonely, he said: How can I be lonely when I am saving lives every night?",
            moral = "Purpose cures loneliness.",
            moralPersian = "هدف تنهایی را درمان می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?w=400"
        ),

        Story(
            id = "s_i16",
            title = "The Two Wolves",
            titlePersian = "دو گرگ",
            level = Level.INTERMEDIATE,
            text = "An old Cherokee told his grandson: Inside every person, there is a battle between two wolves. One is evil — anger, greed, jealousy. The other is good — love, kindness, compassion. The grandson asked: Which wolf wins? The grandfather replied: The one you feed.",
            moral = "You become what you nurture inside.",
            moralPersian = "تو همان می‌شوی که درون خود پرورش می‌دهی.",
            coverUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=400"
        ),

        Story(
            id = "s_i17",
            title = "The Perfect Cup",
            titlePersian = "فنجان بی‌نقص",
            level = Level.INTERMEDIATE,
            text = "A pottery teacher split her class into two groups. The first group had to make one perfect cup. The second group had to make as many cups as possible. At the end, the second group made better cups. Perfection came through practice, not through aiming for perfection. Quantity leads to quality.",
            moral = "Practice makes perfect, not intention.",
            moralPersian = "تمرین کامل می‌کند، نه نیت.",
            coverUrl = "https://images.unsplash.com/photo-1565193566173-7a0ee3dbe261?w=400"
        ),

        Story(
            id = "s_i18",
            title = "The Missing Puzzle Piece",
            titlePersian = "قطعه گمشده پازل",
            level = Level.INTERMEDIATE,
            text = "A man spent years searching for one missing puzzle piece. He found it in his own pocket. He had carried it with him all along. The lesson: Sometimes what we search for is already within us. The answer to our questions lives in our own hearts.",
            moral = "What you seek is often within you.",
            moralPersian = "آنچه می‌جویی اغلب درون توست.",
            coverUrl = "https://images.unsplash.com/photo-1494059980473-813e73ee784b?w=400"
        ),

        Story(
            id = "s_i19",
            title = "The Prince and the Beggar",
            titlePersian = "شاهزاده و گدا",
            level = Level.INTERMEDIATE,
            text = "A prince and a beggar switched clothes for a day. The prince lived as a beggar and discovered hunger, cold, and humiliation. The beggar lived as a prince and discovered boredom, loneliness, and pressure. That night, they met again. Both agreed that every life has its own struggles. You cannot judge what you have not lived.",
            moral = "Never judge another's life.",
            moralPersian = "هرگز زندگی دیگری را قضاوت نکن.",
            coverUrl = "https://images.unsplash.com/photo-1518495973542-4542c06a5843?w=400"
        ),

        Story(
            id = "s_i20",
            title = "The Book That Never Ended",
            titlePersian = "کتابی که تمام نشد",
            level = Level.INTERMEDIATE,
            text = "A writer spent his whole life writing a book. On his deathbed, he asked his daughter to read the last page. It was empty. He said: I never finished because life is the story that never ends. There is always a new page waiting to be written. Keep writing your own story.",
            moral = "Your story is always being written.",
            moralPersian = "داستان تو همیشه در حال نوشته شدن است.",
            coverUrl = "https://images.unsplash.com/photo-1544716278-ca5e3f4abd8c?w=400"
        ),

        Story(
            id = "s_i21",
            title = "The River and the Rock",
            titlePersian = "رودخانه و صخره",
            level = Level.INTERMEDIATE,
            text = "A river flowed gently. It met a giant rock in its path. The rock said: You cannot pass me. I am strong. The river did not fight. It went around. It wore the rock down with patience over centuries. Finally, the rock became sand. The river continued to the sea. Flexibility beats rigidity.",
            moral = "Flexibility overcomes brute force.",
            moralPersian = "انعطاف بر زور خالص پیروز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1439405326854-014607f694d7?w=400"
        ),

        Story(
            id = "s_i22",
            title = "The Father's Advice",
            titlePersian = "توصیه پدر",
            level = Level.INTERMEDIATE,
            text = "Before a young man left home, his father gave him two pieces of advice. First: Keep your word, even when it's hard. Second: Always be kinder than necessary. Years later, the son was known as the most trusted and loved man in his city. Two simple rules built a great life.",
            moral = "Simple virtues create great lives.",
            moralPersian = "فضیلت‌های ساده زندگی‌های بزرگ می‌سازند.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),

        Story(
            id = "s_i23",
            title = "The Blind Man and the Lantern",
            titlePersian = "مرد کور و فانوس",
            level = Level.INTERMEDIATE,
            text = "A blind man carried a lantern at night. People laughed: Why do you carry a lantern when you cannot see? He replied: I carry it for others. So they can see me and not bump into me. Wisdom sees what eyes cannot.",
            moral = "Wisdom is deeper than sight.",
            moralPersian = "خرد عمیق‌تر از بینایی است.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),

        Story(
            id = "s_i24",
            title = "The Tailor's Mistake",
            titlePersian = "اشتباه خیاط",
            level = Level.INTERMEDIATE,
            text = "A tailor cut the cloth too short. Instead of giving up, he redesigned the outfit. It became even more beautiful than the original plan. He realized: Every mistake is an opportunity to create something new. Creativity turns failures into masterpieces.",
            moral = "Mistakes can become masterpieces.",
            moralPersian = "اشتباهات می‌توانند به شاهکار تبدیل شوند.",
            coverUrl = "https://images.unsplash.com/photo-1520006403909-838d6b92c22e?w=400"
        ),

        Story(
            id = "s_i25",
            title = "The Sailor's Compass",
            titlePersian = "قطب‌نمای ملوان",
            level = Level.INTERMEDIATE,
            text = "A sailor lost his compass in a storm. He panicked at first, but then he used the stars to guide him. He realized: When you lose one way, another appears. Life always gives alternatives. Trust the universe to show you the way.",
            moral = "When one door closes, another opens.",
            moralPersian = "وقتی دری بسته می‌شود، دری دیگر باز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1502933691298-84fc14542831?w=400"
        ),

        Story(
            id = "s_i26",
            title = "The Old Photograph",
            titlePersian = "عکس قدیمی",
            level = Level.INTERMEDIATE,
            text = "A woman found an old photograph of her great-grandmother. She was young, smiling, and full of dreams. The woman realized: She was me. I am her. Our dreams are the same. Our hopes are the same. We are connected across time by the thread of humanity.",
            moral = "We are connected across generations.",
            moralPersian = "ما در طول نسل‌ها به هم متصل هستیم.",
            coverUrl = "https://images.unsplash.com/photo-1516575334481-f85287c2c82d?w=400"
        ),

        Story(
            id = "s_i27",
            title = "The Power of One Voice",
            titlePersian = "قدرت یک صدا",
            level = Level.INTERMEDIATE,
            text = "One person wrote a letter to a newspaper about pollution. Others read it and joined. Soon, a whole movement started. One voice became many. The world changed because one person refused to stay silent. Never underestimate the power of your voice.",
            moral = "One voice can change the world.",
            moralPersian = "یک صدا می‌تواند دنیا را تغییر دهد.",
            coverUrl = "https://images.unsplash.com/photo-1591543620767-582b2e76369e?w=400"
        ),

        Story(
            id = "s_i28",
            title = "The Gift of Time",
            titlePersian = "هدیه زمان",
            level = Level.INTERMEDIATE,
            text = "A busy executive learned his son had only a few months to live. He dropped everything to be with him. In those months, he discovered the son he never knew. After his son passed, he said: I gave him my time — the most valuable gift I ever gave. Time is the greatest gift.",
            moral = "Time is the greatest gift you can give.",
            moralPersian = "زمان بزرگ‌ترین هدیه‌ای است که می‌توانی بدهی.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),

        Story(
            id = "s_i29",
            title = "The Seven Wonders",
            titlePersian = "هفت عجایب",
            level = Level.INTERMEDIATE,
            text = "A teacher asked her students to list the Seven Wonders of the World. One girl hesitated. The teacher asked: What's wrong? She said: I can't decide — to see, to hear, to touch, to taste, to feel, to laugh, to love. The class fell silent. Those are the real wonders.",
            moral = "The greatest wonders are within us.",
            moralPersian = "بزرگ‌ترین عجایب درون ما هستند.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Story(
            id = "s_i30",
            title = "The Last Conversation",
            titlePersian = "آخرین گفتگو",
            level = Level.INTERMEDIATE,
            text = "A man called his father after years of silence. They talked for hours about everything. The next day, his father passed away. The man realized: That phone call was a gift from fate. Never delay forgiveness. Never assume there is more time. Say what you need to say today.",
            moral = "Never delay saying what matters.",
            moralPersian = "هرگز گفتن آنچه مهم است را به تأخیر نینداز.",
            coverUrl = "https://images.unsplash.com/photo-1516575334481-f85287c2c82d?w=400"
        ),

        // ============================================================
        // ==================== ADVANCED (20) =========================
        // ============================================================

        Story(
            id = "s_a1",
            title = "The Power of Persistence",
            titlePersian = "قدرت پشتکار",
            level = Level.ADVANCED,
            text = "Thomas Edison failed thousands of times before inventing the light bulb. When asked about his failures, he replied: I have not failed. I've just found 10,000 ways that won't work. His persistence changed the world. Every great achievement in human history has been built on the foundation of persistence. When you face obstacles, remember that failure is not the opposite of success — it's part of success.",
            moral = "Persistence turns failure into success.",
            moralPersian = "پشتکار شکست را به موفقیت تبدیل می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1552664730-d307ca884978?w=400"
        ),

        Story(
            id = "s_a2",
            title = "The Art of Listening",
            titlePersian = "هنر گوش دادن",
            level = Level.ADVANCED,
            text = "A wise old man was known for his ability to solve conflicts. People came from far away to seek his advice. When asked about his secret, he said: I listen more than I speak. Most problems are solved when people feel heard. His wisdom lay not in his words, but in his silence. He understood that true communication begins with genuine listening.",
            moral = "Listening is more powerful than speaking.",
            moralPersian = "گوش دادن از صحبت کردن قدرتمندتر است.",
            coverUrl = "https://images.unsplash.com/photo-1499728603263-13726abce5fd?w=400"
        ),

        Story(
            id = "s_a3",
            title = "The Journey Within",
            titlePersian = "سفر درونی",
            level = Level.ADVANCED,
            text = "A young man traveled the world searching for happiness. He climbed mountains, crossed oceans, and visited ancient temples. Yet happiness always seemed out of reach. One day, exhausted, he sat by a river and looked at his reflection. In that moment, he realized that happiness had been within him all along. The journey outward had taught him that the most important journey is the one inward.",
            moral = "True happiness comes from within.",
            moralPersian = "شادی واقعی از درون می‌آید.",
            coverUrl = "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?w=400"
        ),

        Story(
            id = "s_a4",
            title = "The Cost of Pride",
            titlePersian = "بهای غرور",
            level = Level.ADVANCED,
            text = "A powerful emperor conquered many lands. His pride grew with each victory. He ignored the advice of his wise counselors. Eventually, his empire collapsed from within. As he sat in exile, he realized that his greatest enemy had not been other kingdoms — it had been his own pride. Humility, he learned too late, is the foundation of lasting power.",
            moral = "Pride leads to downfall.",
            moralPersian = "غرور به سقوط منجر می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1564419320461-6870880221ad?w=400"
        ),

        Story(
            id = "s_a5",
            title = "The Gift of Gratitude",
            titlePersian = "هدیه سپاسگزاری",
            level = Level.ADVANCED,
            text = "A study at a major university revealed something remarkable: people who practiced gratitude daily reported higher levels of happiness, better health, and stronger relationships. Gratitude, it turns out, is not just a polite gesture — it's a powerful practice that reshapes the brain. Those who appreciate what they have, rather than focusing on what they lack, live richer and more meaningful lives.",
            moral = "Gratitude transforms your life.",
            moralPersian = "سپاسگزاری زندگی شما را دگرگون می‌کند.",
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400"
        ),

        Story(
            id = "s_a6",
            title = "The Paradox of Choice",
            titlePersian = "پارادوکس انتخاب",
            level = Level.ADVANCED,
            text = "Modern society offers more choices than ever before. Yet studies show that people are less happy than when they had fewer options. This is the paradox of choice: too many decisions create anxiety and paralysis. True freedom is not having infinite options — it's having the wisdom to choose what matters and let the rest go.",
            moral = "Too many choices can trap us.",
            moralPersian = "انتخاب‌های بیش از حد می‌تواند ما را گرفتار کند.",
            coverUrl = "https://images.unsplash.com/photo-1484480974693-6ca0a78fb36b?w=400"
        ),

        Story(
            id = "s_a7",
            title = "The Illusion of Control",
            titlePersian = "توهم کنترل",
            level = Level.ADVANCED,
            text = "A control-obsessed businessman tried to plan every minute of his life. But life kept surprising him — accidents, illness, loss, love. Eventually, he understood: The only thing we truly control is our response to what happens. Peace comes not from controlling circumstances, but from mastering ourselves.",
            moral = "True control is self-mastery.",
            moralPersian = "کنترل واقعی تسلط بر خویشتن است.",
            coverUrl = "https://images.unsplash.com/photo-1499750310107-5fef28a66643?w=400"
        ),

        Story(
            id = "s_a8",
            title = "The Long Game",
            titlePersian = "بازی بلندمدت",
            level = Level.ADVANCED,
            text = "Two chess players competed for decades. One always played for immediate wins. The other played for long-term position. The first won many games — the second won the championship. In life, patience and strategic thinking often outperform short-term brilliance. Play the long game and let time work for you.",
            moral = "Think long-term and time works for you.",
            moralPersian = "بلندمدت فکر کن تا زمان برایت کار کند.",
            coverUrl = "https://images.unsplash.com/photo-1529699211952-734e80c4d42b?w=400"
        ),

        Story(
            id = "s_a9",
            title = "The Silent Epidemic",
            titlePersian = "همه‌گیری خاموش",
            level = Level.ADVANCED,
            text = "Loneliness is now considered a public health crisis in many countries. Research shows it's as damaging as smoking. Yet few talk about it. In a world of hyper-connection, millions feel invisible. The cure is not more technology — it's authentic connection. Reach out to someone today. You may save a life.",
            moral = "Connection is the antidote to modern loneliness.",
            moralPersian = "ارتباط پادزهر تنهایی مدرن است.",
            coverUrl = "https://images.unsplash.com/photo-1499728603263-13726abce5fd?w=400"
        ),

        Story(
            id = "s_a10",
            title = "The Weight of Words",
            titlePersian = "وزن کلمات",
            level = Level.ADVANCED,
            text = "A writer once said: Words are the most powerful weapon in the world. They can start wars or end them. They can break hearts or heal them. They can build or destroy. The words you speak today will echo for years. Speak with intention. Your words carry weight beyond what you can imagine.",
            moral = "Words carry immense power.",
            moralPersian = "کلمات قدرت عظیمی دارند.",
            coverUrl = "https://images.unsplash.com/photo-1455390582262-044cdead277a?w=400"
        ),

        Story(
            id = "s_a11",
            title = "The Paradox of Wisdom",
            titlePersian = "پارادوکس خرد",
            level = Level.ADVANCED,
            text = "The more you learn, the more you realize how little you know. This is the paradox of wisdom: knowledge reveals the vastness of our ignorance. Truly wise people are humble because they've glimpsed the infinite ocean of what remains unknown. Arrogance is the mark of shallow learning. Humility is the mark of deep wisdom.",
            moral = "Wisdom begins with humility.",
            moralPersian = "خرد با فروتنی آغاز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=400"
        ),

        Story(
            id = "s_a12",
            title = "The Discipline of Solitude",
            titlePersian = "انتظام تنهایی",
            level = Level.ADVANCED,
            text = "Many great thinkers intentionally sought solitude. Not because they hated people, but because clarity requires silence. In a world of constant noise, solitude is a revolutionary act. It allows you to hear your own thoughts, to know yourself deeply, and to return to the world with purpose. Solitude is not isolation — it's preparation.",
            moral = "Solitude brings clarity and strength.",
            moralPersian = "تنهایی روشنی و قدرت می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1506461883276-594a12b11cf3?w=400"
        ),

        Story(
            id = "s_a13",
            title = "The Cost of Convenience",
            titlePersian = "بهای راحتی",
            level = Level.ADVANCED,
            text = "Every convenience has a hidden cost. Fast food saves time but costs health. Smartphones save effort but cost attention. Passive entertainment saves energy but costs growth. Life is a series of trade-offs. Choose your conveniences carefully, because what feels easy today often becomes difficult tomorrow.",
            moral = "Every convenience carries a cost.",
            moralPersian = "هر راحتی بهایی دارد.",
            coverUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400"
        ),

        Story(
            id = "s_a14",
            title = "The Beauty of Broken Things",
            titlePersian = "زیبایی چیزهای شکسته",
            level = Level.ADVANCED,
            text = "In Japan, there is an art called Kintsugi — repairing broken pottery with gold. The broken places become more beautiful than before. This teaches a profound lesson: Our wounds and scars are not flaws. They are the marks of survival. The cracks in our lives are where the light enters. Do not hide your brokenness — decorate it with gold.",
            moral = "Our wounds become our strength.",
            moralPersian = "زخم‌های ما به قدرت ما تبدیل می‌شوند.",
            coverUrl = "https://images.unsplash.com/photo-1578321272176-b7bbc0679853?w=400"
        ),

        Story(
            id = "s_a15",
            title = "The Silent Revolution",
            titlePersian = "انقلاب خاموش",
            level = Level.ADVANCED,
            text = "Real revolutions don't happen in the streets. They happen in kitchens, classrooms, and quiet moments of decision. When one person decides to be kinder, to forgive, to break a cycle of pain — the world shifts subtly. Millions of small choices create the world we live in. Revolution begins within.",
            moral = "Change begins within each person.",
            moralPersian = "تغییر از درون هر فرد آغاز می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400"
        ),

        Story(
            id = "s_a16",
            title = "The Illusion of Time",
            titlePersian = "توهم زمان",
            level = Level.ADVANCED,
            text = "Time feels slow in childhood and fast in old age. The reason is memory. New experiences create dense memories, making time feel full. Routine creates few memories, making time fly. To slow time, do new things. Explore, learn, travel, create. You cannot add years to your life, but you can add life to your years.",
            moral = "New experiences make life feel longer.",
            moralPersian = "تجربه‌های جدید زندگی را طولانی‌تر می‌کنند.",
            coverUrl = "https://images.unsplash.com/photo-1495364141860-b0d03eccd065?w=400"
        ),

        Story(
            id = "s_a17",
            title = "The Mirror of Relationship",
            titlePersian = "آینه رابطه",
            level = Level.ADVANCED,
            text = "Relationships are mirrors. They reflect back to us our fears, patterns, and deepest needs. When someone triggers us, it's often a sign that something inside us needs healing. Difficult relationships are not obstacles — they are invitations to grow. If you want to know yourself, look at those you love, and those you struggle with.",
            moral = "Relationships reveal who we truly are.",
            moralPersian = "روابط نشان می‌دهد ما واقعاً کی هستیم.",
            coverUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af2176?w=400"
        ),

        Story(
            id = "s_a18",
            title = "The Unopened Gift",
            titlePersian = "هدیه باز نشده",
            level = Level.ADVANCED,
            text = "Many people spend their lives waiting for permission to live — permission to be happy, to pursue dreams, to love fully. But no one is coming with that permission. The gift of life is already in your hands. Open it. The only approval you truly need is your own.",
            moral = "Give yourself permission to live fully.",
            moralPersian = "به خودت اجازه بده کامل زندگی کنی.",
            coverUrl = "https://images.unsplash.com/photo-1513885535751-8b9238bd345a?w=400"
        ),

        Story(
            id = "s_a19",
            title = "The Empty Room",
            titlePersian = "اتاق خالی",
            level = Level.ADVANCED,
            text = "A philosopher sat in an empty room for a year. No books, no distractions, no company. At the end, he said: I learned more in this empty room than in all the libraries of the world. Because in emptiness, we meet ourselves. Everything you need is already within you — you just need the space to see it.",
            moral = "Emptiness reveals our true nature.",
            moralPersian = "تهی بودن ماهیت واقعی ما را نشان می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1502672260266-1c1ef2d93688?w=400"
        ),

        Story(
            id = "s_a20",
            title = "The Final Lesson",
            titlePersian = "درس نهایی",
            level = Level.ADVANCED,
            text = "A wise master was asked, on his deathbed, for his final words. He smiled and said: In the end, only three things matter — how much you loved, how gently you lived, and how gracefully you let go. Wealth, fame, and power are forgotten. But love and kindness echo through eternity. Live so that your ending is peaceful.",
            moral = "Love and kindness are all that matter.",
            moralPersian = "عشق و مهربانی تمام آن چیزی است که اهمیت دارد.",
            coverUrl = "https://images.unsplash.com/photo-1499209974431-9dddcece7f88?w=400"
        )
    )
}