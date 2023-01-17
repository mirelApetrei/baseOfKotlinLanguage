fun main() {
    val duration: Int = 35


     if (duration >= 12 && duration < 24){
        println("5€ Amazon-Gutschein")
    } else if (duration >= 24 && duration < 36) {
        println("15€ Amazon Gutschein")
    } else if (duration >= 36 && duration < 48) {
        println("25€ Amazon Gutschein")
     } else if (duration >= 48){
         println("50€ Amazon Gutschein")
     } else {
         println("Keine Praemie.")
     }
}

