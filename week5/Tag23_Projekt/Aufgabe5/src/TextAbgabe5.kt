/*
Schreibe hier deine Antwort hin.
  TODO:  durchläuft die Liste der Früchte vom index 3(ende) bis zum Anfang (downTo), und wenn es eine Frucht=Bananen findet,
    ändert es den Wert der Variablen lieblingsFrucht in "Bananen" und zeigt ihn dann in der Konsole an
 */

fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}