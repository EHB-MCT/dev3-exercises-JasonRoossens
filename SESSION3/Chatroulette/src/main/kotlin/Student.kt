class Student(override val name: String): Person(name) {
    override fun talk(){
        funFact()
    }
    fun funFact(){
        println("No funny fact sorry im student")
    }

}