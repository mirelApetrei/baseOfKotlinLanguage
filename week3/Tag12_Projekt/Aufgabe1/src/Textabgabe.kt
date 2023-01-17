// Teilaufgabe a) => 15
fun subtrahieren(): Int {
    var zahl1 = 28
    var zahl2 = 13
    return zahl1 - zahl2
}



// Teilaufgabe b) => Gelb

fun lieblingsFarbe(): String {
    val farben: List<String> = listOf("Rot", "Blau", "Gelb", "GrÃ¼n", "Lila", "Pink")
    var meineFarbe: String = farben[farben.size-4]
    return meineFarbe
}

// Teilaufgabe c) => 60

fun ersteZahl(): Int {      // => 12
    return (20 - 18) * 6
}

fun zweiteZahl(): Int {     // => 5
    return 25 / 5
}


fun main() {
    println(subtrahieren())
    println(lieblingsFarbe())

    val ergebnis = ersteZahl() * zweiteZahl()
    println(ergebnis)
}