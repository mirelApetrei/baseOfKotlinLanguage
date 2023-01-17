package main.kotlin

fun main(){
    // Wichtig: Der readln()-Befehl gibt einen Wert des Typen String zurück. Dieser muss mit dem
    // Anhang .toInt() erweitert werden, um in dem Fall unsere Eingabe in ein Int umzuwandeln.

    var laenge : Int
    laenge = readln().toInt()

    var breite : Int = 12  //TODO : Nimm eine Eingabe an, welche der Breite zugeordnet wird.

    var flaeche : Int = breite * laenge //TODO : Die Flaeche eines Vierecks wird wie folgt berechnet : Breite * Flaeche

    // bitte println wieder auskommentieren zum Testen
    //println("$flaeche")
}