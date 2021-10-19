class Comedian(override val name: String): Person(name) {
   override fun talk(){
        funFact()
    }
    fun funFact(){
        println("haha funny joke")
    }

}