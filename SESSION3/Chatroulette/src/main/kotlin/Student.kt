class Student(override val name: String): Person(name) {
    override fun talk(){
        funFact()
    }
    fun funFact(){
        println("did you know Kotlin was name  after an island")
    }

}