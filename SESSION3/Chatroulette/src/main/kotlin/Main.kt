fun main() {
    val persons = arrayOf(Student("Sam"), Teacher("Jason"), Comedian("Mark"), Chatbot("Bot"))

    val person = persons.random()
    person.introduce()
    person.talk()
}