/*
Schreibe hier deine Antwort hin.
    TODO: die Liste der Geschwindigkeitsbegrenzungen von Anfang bis Ende durchgehen, und wenn sie eine der 3 Geschwindigkeiten finden,
      mit denen sie sie vergleichen, sie warnen, dass sie auf der Straße mit dem Index[i] nur mit der verglichenen Geschwindigkeit fahren dürfen
 */

fun main() {
    val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)
    for (i in 0..speedLimits.size - 1) {
        if (speedLimits[i] == 30) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 80) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 120) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        }
    }
}