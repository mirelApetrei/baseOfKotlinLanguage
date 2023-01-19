

fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )
    // jeder Jahreszeiten deffiniert
    var seasons: MutableMap<String, List<String>> = mutableMapOf(
        "Winter" to listOf("Dezember", "Januar", "Februar"),
        "Frühling" to listOf("März", "April", "Mai"),
        "Sommer" to listOf("Juni", "Juli", "August"),
        "Herbst" to listOf("September", "Oktober", "November")
    )

//    TODO: a)
    //println(findSeason(seasons, "September"))

//    TODO: b) Schreibe jetzt in der main()-Funktion eine Schleife, die alle Monate mit ihrer Jahreszeit in der Konsole ausgibt.
   /* for ((key, value) in seasons) {
        for (entry in value) {
            println("Der $entry ist im $key")
        }
    }*/

//    TODO: c) Schreibe zusätzlich eine Schleife deiner Wahl, die nur die Sommermonate in der Konsole ausgibt.
    /*for ((key, value) in seasons){
        if (key == "Sommer"){
            println(value)
        }
    }*/

//    TODO: d) Schreibe zusätzlich eine Schleife deiner Wahl, die alle Monate außer den Juni und den September ausgibt.
    /*for (month in monate){
        if (month == "Juni" || month == "September") {
            continue
        }
        println(month)
    }*/

//    TODO: e) Schreibe zusätzlich eine Schleife deiner Wahl, die ab dem März jeden zweiten Monat ausgibt.
    for (i in monate.indexOf("März") + 1..monate.size - 1){
        println(monate[i])
    }

}

    //TODO: a)
fun findSeason(map: Map<String, List<String>>, month: String): String? {

        for ((key, value) in map) {
            if (value.contains(month)) {
                return key
            }
        }
        return null
    }


