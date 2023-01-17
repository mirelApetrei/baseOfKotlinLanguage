fun main() {
//    TODO: a)
    val personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to  "Fau"
    )
    println(personZuHaustier)

    personZuHaustier.set("Berta","Esel")
    personZuHaustier.set("Sylvia","Pferde")
    personZuHaustier.set("Frank","Spechte")
    personZuHaustier.set("Luis","Spechte")

    println(personZuHaustier)

//    TODO:b)
    // -> a map cannot contain 2X a key
    personZuHaustier.put("Berta", "Hunde")
    //personZuHaustier.put("Berta", "Chiuaua")
    personZuHaustier.put("Bertolo", "Hunde")
    println(personZuHaustier)

}