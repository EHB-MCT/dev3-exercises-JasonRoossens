import kotlin.math.sin
import kotlin.random.Random
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    val randomValues = List(1) { Random.nextInt(1, 4) }
    // prints new sequence every time
    println(randomValues)

}