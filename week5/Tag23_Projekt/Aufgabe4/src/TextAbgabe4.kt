/*
Schreibe hier deine Antwort hin.
    Die Liste der Marken mit einer for-Schleife abrufen, aber mit index=2(PH) beginnen und
    dann in der Konsole die verbleibenden Werte bis zum Ende der Liste anzeigen => d.h. "PH" und "Microsoft"
 */
fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}