class Jason(override val name: String): Person(name) {
    fun introduce() {
        println("Hello, i'm Jason")
    }
}