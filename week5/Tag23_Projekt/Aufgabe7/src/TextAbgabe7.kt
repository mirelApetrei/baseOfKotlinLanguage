/*
Schreibe hier deine Antwort hin.

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