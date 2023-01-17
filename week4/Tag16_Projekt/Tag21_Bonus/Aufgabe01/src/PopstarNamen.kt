fun main(){

    var vornamen: List<String> = listOf("Britney", "Ariana", "Bruno", "Ed")
    var nachnamen: List<String> = listOf("Spears", "Grande", "Mars", "Sheeran")

    var indexVorname = 0
    var indexNachname = 0

    while (indexVorname <= vornamen.size - 1 && indexNachname <= nachnamen.size -1){
        println(vornamen[indexVorname] + " " + nachnamen[indexNachname])

        indexVorname++
        indexNachname++
    }
}