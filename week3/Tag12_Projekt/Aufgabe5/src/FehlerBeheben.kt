// Behebe die Fehler.
// Du darfst nicht den Code löschen, um die Fehler zu beheben! :^)
fun addieren(): Int {
    var zahl1: Int = 70
    var zahl2: Int = 10
    return zahl1 + zahl2
}

fun subtrahieren(): Int {
    var zahl1: Int = 70
    var zahl2: Int = 10
    return zahl1 - zahl2
}

fun dividieren(): Int {
    var zahl1: Int = 70
    var zahl2: Int = 10
    return zahl1 / zahl2
}

fun multiplizieren(): Int {
    var zahl1: Int = 70
    var zahl2: Int = 10
    return zahl1 * zahl2
}

fun sagHallo() {
    println("Hallo!")
}
// Verbesser die Funktion, sodass sie wieder einen Integer im Wert von 5 zurück gibt.
fun jdafnjoqr(): Int {
    val value: Int = 5
    return  value
}


fun main() {
    // Du darfst hier die gewollten Ergebnisse nicht direkt in die println Funktion reinschreiben.
    // Also das darfst du NICHT tun: println("Addieren: Wird hier 80 ausgegeben? 80")
    println("Addieren: Wird hier 80 ausgegeben? ${addieren()}") // Hier soll 80 ausgegeben werden.
    println("Subtrahieren: Wird hier 60 ausgegeben? ${subtrahieren()}") // Hier soll 60 ausgegeben werden.
    println("Dividieren: Wird hier 7 ausgegeben? ${dividieren()}") // Hier soll 7 ausgegeben werden.
    println("Multiplizieren: Wird hier 700 ausgegeben? ${multiplizieren()}") // Hier soll 700 ausgegeben werden.
    sagHallo()
    println("Wird hier 5 ausgegeben? ${jdafnjoqr()}") // Hier soll 5 ausgegeben werden.
}