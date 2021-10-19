class Chatbot(override val name: String): Person(name) {
    override fun talk(){
        funFact()
    }
    fun funFact(){
        println("This is an usefull fact from the bot")
    }

}