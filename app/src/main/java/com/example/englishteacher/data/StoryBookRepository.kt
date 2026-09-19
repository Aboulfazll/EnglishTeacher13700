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

        // ==================== BEGINNER ====================
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

        // ==================== INTERMEDIATE ====================
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

        // ==================== ADVANCED ====================
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
        )
    )
}