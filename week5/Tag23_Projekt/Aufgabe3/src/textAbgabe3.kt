/*
Schreibe hier deine Antwort hin.
    TODO: Gehen Sie die Liste der Wochentage durch, und vergleichen Sie sie mit den beiden (Samstag und Sonntag).
        Wenn der zu prüfende Tag in der Liste mit einem der beiden übereinstimmt, wird Folgendes angezeigt: "am Samstag/Sonntag hab ich frei.", andernfalls wird etwas anderes angezeigt
 */

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}