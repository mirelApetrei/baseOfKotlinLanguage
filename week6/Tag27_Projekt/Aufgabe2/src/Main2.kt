

fun main(){

    var vogel1: Vogel = Vogel("Amsel", "Meisen", 2)
    var vogel2: Vogel = Vogel("Amsel", "Meisen", 1)
    var vogel3: Vogel = Vogel("Amsel", "Meisen", 5, false)
    vogel2.zwischern()
    println(vogel1.vogelTypen)
    println(vogel3.alter)
}

/*
var vogelTypenListe: List<String> = listOf("Amsel", "Bachstelze", "Blaumeise", "Buchfink", "Buntspecht", "Dohle", "Eichelhäher", "Elster")
var futterTypenListe: List<String> = listOf("Meisen", "Finken", "Ammern", "Drosseln", "Kleiber", "Stare", "Spechte")*/
