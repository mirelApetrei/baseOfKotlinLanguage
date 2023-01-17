
fun main(){
    // Kommentiere die fehlerhaften Zeilen mit der Tastenkombination aus und prüfe, ob das Programm läuft
    var text: String = "mega cooles Programm."
    val eingabeINT: Int = 10
    var test: Int = 10

    println("Bitte geben Sie etwas ein: ")
    val eingabe:String = readln()
    var eingabeInt: Int= eingabe.toInt()
    test = 20
    text += " Läuft 1a"

    println(eingabe + eingabeINT + test)
    println(text)
}