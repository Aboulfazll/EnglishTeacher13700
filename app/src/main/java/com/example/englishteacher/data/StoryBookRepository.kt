package com.example.englishteacher.data

object StoryBookRepository {

    fun getAllStories(): List<Story> = listOf(

        // ==================== BEGINNER ====================
        Story(
            id = "s_b1", title = "The Lost Cat", titlePersian = "گربه گمشده",
            level = Level.BEGINNER,
            text = "A little girl named Sara has a cat. The cat's name is Mimi. One day, Mimi goes out and doesn't come back. Sara is very sad. She looks everywhere. She asks her neighbors, but no one has seen Mimi. Finally, Sara finds Mimi under a big tree. She is sleeping. Sara is very happy!",
            moral = "Never give up hope.", moralPersian = "هرگز امید خود را از دست ندهید.",
            coverUrl = "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=400"
        ),

        Story(
            id = "s_b2", title = "The Kind Baker", titlePersian = "نانوای مهربان",
            level = Level.BEGINNER,
            text = "There is a bakery in a small town. The baker is a kind old man. Every morning, he gives free bread to poor children. One day, a rich man comes to the bakery. He is surprised. He asks the baker: Why do you give free bread? The baker smiles and says: Because I love to help. The rich man gives the baker a lot of money. Now the baker can help more children.",
            moral = "Kindness is always rewarded.", moralPersian = "مهربانی همیشه پاداش داده می‌شود.",
            coverUrl = "https://images.unsplash.com/photo-1509440159596-0249088772ff?w=400"
        ),

        Story(
            id = "s_b3", title = "The Three Friends", titlePersian = "سه دوست",
            level = Level.BEGINNER,
            text = "Three friends live in a small village. Their names are Tom, Sam, and Max. They do everything together. They play, study, and work together. One day, a big storm comes. Their houses are in danger. Tom helps Sam fix his roof. Sam helps Max clean his yard. Max helps Tom with his garden. Together, they save all three houses.",
            moral = "Friends help each other in hard times.", moralPersian = "دوستان در سختی‌ها به هم کمک می‌کنند.",
            coverUrl = "https://images.unsplash.com/photo-1529156069898-49953e39b3ac?w=400"
        ),

        Story(
            id = "s_b4", title = "The Magic Garden", titlePersian = "باغ جادویی",
            level = Level.BEGINNER,
            text = "A poor farmer has a small garden. He plants seeds every spring. But nothing grows. One night, a fairy comes to his garden. She says: I will help you, but you must promise to share your food. The farmer says yes. The next morning, beautiful vegetables grow in the garden. The farmer shares his food with everyone. Everyone is happy.",
            moral = "Sharing brings happiness.", moralPersian = "بخشش شادی می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400"
        ),

        Story(
            id = "s_b5", title = "The Honest Boy", titlePersian = "پسر راستگو",
            level = Level.BEGINNER,
            text = "A boy named Ali finds a wallet on the street. There is a lot of money in it. Ali could keep the money, but he doesn't. He takes the wallet to the police. The police find the owner. The owner is a rich man. He is very happy. He gives Ali some money as a gift. Ali says: I only did what is right. Everyone praises Ali for his honesty.",
            moral = "Honesty is the best policy.", moralPersian = "صداقت بهترین سیاست است.",
            coverUrl = "https://images.unsplash.com/photo-1503454537195-1dcabb73ffb9?w=400"
        ),

        Story(
            id = "s_b6", title = "The Brave Dog", titlePersian = "سگ شجاع",
            level = Level.BEGINNER,
            text = "A dog named Rex lives with a family. One night, Rex hears a strange noise. He barks loudly. The family wakes up. They see a fire in the kitchen. They call the fire station. The firemen come and stop the fire. The family is safe because of Rex. Rex is a hero!",
            moral = "Bravery saves lives.", moralPersian = "شجاعت جان‌ها را نجات می‌دهد.",
            coverUrl = "https://images.unsplash.com/photo-1552053831-71594a27632d?w=400"
        ),

        Story(
            id = "s_b7", title = "The Little Bird", titlePersian = "پرنده کوچک",
            level = Level.BEGINNER,
            text = "A little bird lives in a tree. One day, the bird falls from the tree. Her wing hurts. She cannot fly. A boy finds her. He takes her home. He gives her food and water. After one week, the bird is strong again. The boy lets her go. The bird flies away. But every morning, she comes back to sing for the boy.",
            moral = "Kindness creates friendship.", moralPersian = "مهربانی دوستی می‌سازد.",
            coverUrl = "https://images.unsplash.com/photo-1444464666168-49d633b86797?w=400"
        ),

        Story(
            id = "s_b8", title = "The Rainy Day", titlePersian = "روز بارانی",
            level = Level.BEGINNER,
            text = "It is raining hard. A boy named Ben is walking home. He has no umbrella. He gets very wet. An old woman sees him. She gives him her umbrella. Ben says thank you. He walks home dry. The next day, Ben buys a new umbrella. He gives it to the old woman. She smiles. They become friends.",
            moral = "Return kindness with kindness.", moralPersian = "مهربانی را با مهربانی پاسخ دهید.",
            coverUrl = "https://images.unsplash.com/photo-1519692933481-e162a57d6721?w=400"
        ),

        Story(
            id = "s_b9", title = "My First Day at School", titlePersian = "اولین روز مدرسه من",
            level = Level.BEGINNER,
            text = "Today is my first day at school. I am very nervous. I don't know anyone. My mother says: Don't worry, you will make friends. In class, a girl sits next to me. Her name is Lily. She smiles at me. We eat lunch together. I am not nervous anymore. School is fun!",
            moral = "New beginnings bring new friends.", moralPersian = "شروع‌های جدید دوستان جدید می‌آورند.",
            coverUrl = "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400"
        ),

        Story(
            id = "s_b10", title = "The Red Balloon", titlePersian = "بادکنک قرمز",
            level = Level.BEGINNER,
            text = "A little girl has a red balloon. She loves it very much. One day, the wind takes the balloon away. The girl cries. A boy sees her. He has a blue balloon. He gives it to the girl. She smiles and says thank you. Now the girl has a blue balloon and a new friend.",
            moral = "A small gift can bring big joy.", moralPersian = "هدیه کوچک شادی بزرگ می‌آورد.",
            coverUrl = "https://images.unsplash.com/photo-1530103862676-de8c9debad1d?w=400"
        ),