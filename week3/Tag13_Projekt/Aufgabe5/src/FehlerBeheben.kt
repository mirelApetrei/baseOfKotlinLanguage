// Behebe die Compiler-Fehler, sodass der Code ausgeführt werden kann und die Ergebnisse ausgegeben werden.
// Achte darauf, wie die Funktionen geschrieben sind.
fun main() {
    fehler1(4)
    fehler2(5)
    fehler3(5)
    fehler4(5, "Hallo Welt")
}

fun fehler1(zahl2: Int) {     //TODO: <- hier fehlt eine parameter
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 * zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 40 ausgegeben werden.
}

fun fehler2(zahl2: Int) {           //TODO: <- falsche parameter name ,war zahl3
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 / zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 2 ausgegeben werden.
}

fun fehler3(zahl2: Int) {       //TODO: <- falsche datentyp , war Boolean
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 / zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 2 ausgegeben werden.
}

/*fun fehler4(zahl2: Int, text: String, text2: Boolean) {     //TODO:
    var zahl1: Int = 10             // Diese Zeile darf nicht verändert werden.
    println(text + (zahl1 / zahl2)) // Diese Zeile darf nicht verändert werden. Hier sollte "Hallo Welt 2" ausgegeben werden.
}*/
//TODO:
fun fehler4(zahl2: Int, text: String) {
    var zahl1: Int = 10
    println(text + (zahl1 / zahl2))
}