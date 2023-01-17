fun main() {
//    TODO:a)

    var personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau"
    )
//    Füge der MutableMap die folgenden Paare hinzu, verwendet dazu eine Funktion oder Schreibweise aus der Vorlesung.
//"Tim" -> "Schildkröte"
//"Fabian" -> "Papagei"
//"Jannik" -> "Schlange"
    var zweiteMape: MutableMap<String, String> = mutableMapOf(
        "Tim" to "Schildkröte",
        "Fabian" to "Papagei",
        "Jannik" to "Schlange"
    )

    var neuePersonZuHaustier = personZuHaustier.plus(zweiteMape).toMutableMap()
    println(neuePersonZuHaustier)
// TODO:b)
//    Was passiert, wenn du der MutableMap das Paar "Luis" -> "Mäuse" hinzufügst?
    neuePersonZuHaustier.put("Luis", "Mäuse")
    println(neuePersonZuHaustier) // <- passiert nichts
//    Was passiert, wenn du der MutableMap das Paar "Bernd" -> "Igel" hinzufügst?
    neuePersonZuHaustier.put("Bernd", "Igel")
    println(neuePersonZuHaustier) // <-"Bernd" to "Igel" will be added to the map


//TODO: c)
//Erstelle eine passende MutableMap. Die MutableMap hat initial (zu Begin) folgende Paare:

    var dritteMap: MutableMap<Int, Double> = mutableMapOf(
        1 to 2.5,
        2 to 5.0,
        3 to 7.5,
        4 to 10.0
    )
//Füge dann der Map folgende weitere Paare hinzu:
    dritteMap.put(10, 10.1)
    dritteMap.put(25, 45.23)
    dritteMap.put(99, 259.46)
    println(dritteMap)


}