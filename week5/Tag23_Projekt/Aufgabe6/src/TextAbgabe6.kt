/*
Schreibe hier deine Antwort hin.
    TODO: durchläuft die Liste der Namen von Anfang bis Ende, und wenn es einen der 3 Namen findet, begrüßt es ihn auf eine andere Weise
 */

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}