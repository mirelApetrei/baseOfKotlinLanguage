fun main() {

    val personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to  "Fau"
    )
        // println(personZuHaustier)
//    TODO: a)
    personZuHaustier.remove("Frank")

        // println(personZuHaustier)
    personZuHaustier.remove("Hans")
    println(personZuHaustier)

//    TODO: b)
    var deletedPerson = personZuHaustier.remove("Luis", "Mäuse") // <- diese ist eine boolean operation(mit zwei dinge)
    println(deletedPerson) // <- true


    var deletedPerson2 = personZuHaustier.remove("Frank", "Mice")

    println(deletedPerson2) //<- false , weil können wir die Paare einer Map nicht verändern.
}