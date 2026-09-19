composable(Routes.HOME) {
    HomeScreen(
        onLevelClick = { level ->
            navController.navigate(Routes.lessonList(level))
        },
        onGrammarClick = {
            navController.navigate(Routes.GRAMMAR)
        },
        onStoryBookClick = {
            navController.navigate(Routes.STORY_BOOK)
        },
        onVocabularyBankClick = {
            navController.navigate(Routes.VOCABULARY_BANK)
        },
        onLevelTestClick = {
            navController.navigate(Routes.LEVEL_TEST)
        }
    )
}