fun main() {
    val temperaturZuTag: Map<Double, String> = mapOf(
        12.2 to "Montag",
        9.8 to "Dienstag",
        14.4 to "Mittwoch"
    )
    println(temperaturZuTag)
    
    var wochenTage: MutableMap<String, Boolean> = mutableMapOf(
        "Ist heute Freitag?" to true,
        "War gestern Mittwoch?" to false
    )
    wochenTage.put("Ist morgen Sonntag?", false)
    wochenTage.put("War gestern Donnerstag?", true)

    wochenTage["War vorgestern Montag?"] = false
    wochenTage["Ist Übermorgen Dienstag?"] = false

    println(wochenTage)
     val removalDays = mutableMapOf<String, Boolean>(
             "War gestern Mittwoch?" to false,
            "War gestern Donnerstag?" to true,
            "Ist Übermorgen Dienstag?" to true
             )
    wochenTage.remove("War gestern Mittwoch?", false)
    wochenTage.remove( "War gestern Donnerstag?", true)
    wochenTage.remove("Ist Übermorgen Dienstag?", true)

    println(wochenTage)
}