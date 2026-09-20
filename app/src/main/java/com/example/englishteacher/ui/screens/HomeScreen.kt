fun HomeScreen(
    onLevelClick: (Level) -> Unit,
    onGrammarClick: () -> Unit = {},
    onStoryBookClick: () -> Unit = {},
    onVocabularyBankClick: () -> Unit = {},
    onLevelTestClick: () -> Unit = {},
    onBookmarkedWordsClick: () -> Unit = {},
    onVideoClick: () -> Unit = {},
    onDailySentencesClick: () -> Unit = {}   // ← این خط باید باشه
)