class Mark(override val name: String): Person(name) {
    fun introduce() {
        println("Hello, i'm Mark")
    }
}