class Duolingo(val roundSize: Int = 5, val language : String) {

    var words = mutableListOf<Word>(
        FrenchWord("Hallo", "Bonjour"),
        FrenchWord("Ja", "Oui"),
        FrenchWord("Nee", "Non"),
        FrenchWord("Prijs", "Prix"),
        FrenchWord("Uur", "Heure"),
        EnglishWord("Bank", "Banque"),
        EnglishWord("Weg", "Route"),
        EnglishWord("Danku", "Merci"),
        EnglishWord("Dag", "Salut"),
        EnglishWord("Eten", "Manger")
    )

    init {
        words = words.filter { it.language == language }.toMutableList()
    }

    fun play() {
        val currentWords = words.shuffled().take(5).toMutableSet()
        println(currentWords.count())

        while (currentWords.count() > 0) {
            val selectedword = currentWords.random()

            println("whats the translation of ${selectedword.original}")

            val userAnswer = readLine()

            if (selectedword.translated == userAnswer){
                println("Correct!")
                currentWords.remove(selectedword)
                println(currentWords.count())
            }else{
                println("False!")
                println(currentWords.count())
            }
        }
        println("Done! Good job!")

    }
}