fun main() {
//    TODO: a)
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to  "Hunde",
        "Frank" to  "Katzen",
        "Luis" to  "Mäuse",
        "Sylvia" to  "Eulen",
        "Hans" to  "Fau"
    )
//    Was ist das Lieblingstier von Frank?
    val lieblingstiereFrank: String? = personZuHaustier["Frank"]
    println(lieblingstiereFrank)

//    Was ist das Lieblingstier von Sylvia?
    println(personZuHaustier["Sylvia"])

//    Was ist das Lieblingstier von Hans?
    println(personZuHaustier["Hans"])

//    TODO: b)
    //    Erstelle eine geeignete Map mit den genannten Paaren.
    var hausnummernUndFarben: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
        36 to "Lila",
        92 to "Rosa"
    )

//Lese den Wert aus der Map aus und weise ihn einer Variable zu,
//gib dann die Variable in der Konsole aus.
    var valuesOfTheMap: List<Collection<String>> = listOf(hausnummernUndFarben.values)
    println(valuesOfTheMap)

//    Verwende in deiner Lösung die Funktion get() oder die Index[] Schreibweise
//    Welche Hausfarbe hat das Haus mit der Nummer 28?
     println(hausnummernUndFarben[28])
//    Welche Hausfarbe hat das Haus mit der Nummer 45?
    println(hausnummernUndFarben.get(45))
//Welche Hausfarbe hat das Haus mit der Nummer 12?
    println(hausnummernUndFarben[12])
}