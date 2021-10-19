class Teacher(override val name: String): Person(name) {
    fun talk(){
        funFact()
    }
    fun funFact(){
        println("did you know Kotlin was name  after an island")
    }

}