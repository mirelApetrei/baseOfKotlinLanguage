import kotlin.random.Random

fun main() {
    val computerGuess = Random.nextInt(1, 100)

    println("Please enter your number: ")
    var yourNumber = readln().toInt()

    do {
        if (yourNumber < computerGuess){
            println("Zu klein! ")
        } else if (yourNumber > computerGuess){
            println("Zu groß")
        } else {
            println("Du hast gewonnen!")
        }
    } while (yourNumber != computerGuess)

}