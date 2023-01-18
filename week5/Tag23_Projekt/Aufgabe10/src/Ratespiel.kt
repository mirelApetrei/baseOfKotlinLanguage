import kotlin.random.Random

    val computerGuess = Random.nextInt(1, 100)
fun main() {

   game()

}

fun game(){
    println("Please enter your number: ")
    var yourNumber = readln().toInt()

    do {
        if (yourNumber < computerGuess){
            println("Zu klein! ")
            game()
        } else if (yourNumber > computerGuess){
            println("Zu groß")
            game()
        } else {
            println("Du hast gewonnen!")
        }
    } while (yourNumber != computerGuess)

}