

fun main() {
    println(doppelterWert())
    println(videothek())
    println(namesAndAges())
    println(diceRoll())
}

fun doppelterWert(): Int {
    var value: Int = 12
    return value * 3
}

fun videothek(){
    var filmenListe: MutableList<String> = mutableListOf("Star Wars", "Shrek", "Toy Story")
    println("Diese sind unsere Filme: $filmenListe")
    println("Welche Film wollen Sie mieten?... eine zahl wählen zwischen 1 und 3")
    var chosenMovie: Int = readln().toInt()
    var index: Int = chosenMovie - 1
    println("Sie haben gewählt der Film nr. $chosenMovie, -> ${filmenListe[index]}")


}

fun namesAndAges(): MutableMap<String, Int> {
    var personsList: MutableMap<String, Int> = mutableMapOf()
    println("Bitte geben Sie den Namen der Person ein: ")
    personsList.put(readln(), readln().toInt())
    personsList.put(readln(), readln().toInt())
    personsList.put(readln(), readln().toInt())
//    println(personsList)
    println("Das jüngste Person ist ${personsList.values.min()},  sowie die älteste Person ist ${personsList.values.max()} ")
    println("Das durchschnittliche Alter aller Personen ist : ${ personsList.values.average() }")
    println("Das summierte Alter aller Personen ist: ${ personsList.values.sum() }" )
    return personsList
}

fun diceRoll(): Int{
    var diceValue: Int = (1..6).random()
    return diceValue
}