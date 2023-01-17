package week4
import kotlin.random.Random.Default.nextInt

fun main() {
    rollDice()
}

fun rollDice(){
    println("Player one , please enter your name: ")
    var player1 = readln()
    println("Player two , please enter your name: ")
    var player2 = readln()
    var player1Roll = nextInt(1, 7)
    var player2Roll = nextInt(1, 7)

    if (player1Roll > player2Roll) {
        println("$player1 has won with a dice equal $player1Roll, againts $player2Roll of $player2")
    } else if (player1Roll < player2Roll){
        println("$player2 has won with a dice equal $player2Roll, againts $player1Roll of $player1")
    } else {
        println("There has been a tie between $player1 an $player2. Results war: $player1Roll and $player2Roll")
            println("That`s why, we will roll again: ")
            rollDice()
    }
}