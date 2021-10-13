fun main (){
    println("The football project")
    challengeOne()
}

fun challengeOne() {
    println("How much on a scale to 10 do you love football")
    var numberOfWorkouts = readLine()?.toInt()
    val notEnoughWorkouts = setOf(0,1,2,3,4,5)
    if (notEnoughWorkouts.contains(numberOfWorkouts)){
        println("How is this possible?! Game over!")
    } else  {
        println("Yes! Next level reached")
        challengeTwo()
    }
}

fun challengeTwo(){
    println("So you love football? ")
    println("Lets roll the dice on who is winning Real Madrid or Anderlecht? Choose low or high")
    var Challenge2Guess = readLine()
    rollDice(Challenge2Guess)
}

fun rollDice(Challenge2Guess:String?){
    val randomNumber = (1..6).random()
    val dice = "";
    when(randomNumber){
        1 -> {println("you rolled 1")
            dice == "low" }
        2 -> {println("you rolled 2")
            dice == "low" }
        3 -> {println("you rolled 3")
            dice == "low" }
        4 -> {println("you rolled 4")
            dice == "high" }
        5 -> {println("you rolled 5")
            dice == "high" }
        6 -> {println("you rolled 6")
            dice == "high" } }

    if (dice == Challenge2Guess ){
        println("Anderlecht wins!")
        println("That insane!")
    } else {
        println("Real Madrid wins!")
        println("This was expected...")
    }
}