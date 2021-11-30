class Duolingo() {

    val words = mutableListOf<Word>(
        Word("Hallo", "Bonjour", "Frans"),
        Word("Ja", "Oui", "Frans"),
        Word("Nee", "Non", "Frans"),
        Word("Prijs", "prix", "Frans"),
        Word("Uur", "Heure", "Frans"),
        Word("Bank", "Banque", "Frans"),
        Word("Weg", "Route", "Frans"),
        Word("Danku", "Merci", "Frans"),
        Word("Dag", "Salut", "Frans"),
        Word("Eten", "Manger", "Frans")
    )
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
