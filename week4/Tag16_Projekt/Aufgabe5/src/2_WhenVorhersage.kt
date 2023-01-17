/*
    Schreibe hier deine Lösung für die Aufgabe hin:
    a) "Nationalitaet: Japanisch"
    b) when nationality: String = "canadian" ==> "Nationalitaet nicht in Datenbank"
 */

fun main() {
    val nationality: String = "canadian"

    when (nationality) {
        "german" -> println("Nationalitaet: Deutsch")
        "italian" -> println("Nationalitaet: Italienisch")
        "japanese" -> println("Nationalitaet: Japanisch")
        "namibian" -> println("Nationalitaet: Namibisch")
        "brazilian" -> println("Nationalitaet: Brasilianisch")
        else -> println("Nationalitaet nicht in Datenbank")
    }
}