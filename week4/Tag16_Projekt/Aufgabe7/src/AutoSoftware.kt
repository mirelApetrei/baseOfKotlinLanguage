 fun main() {
    start(true, true)
}

// Die Funktionen start() und closeDoors() sind vorgegeben.
fun start(isMotorRunning: Boolean, doorsAreClosed: Boolean) {
    if (isMotorRunning and doorsAreClosed) {
        println("Software gestartet.")
    } else {
        closeDoors()
    }


}

fun closeDoors() {
    println("Bitte alle Türen schließen.")
}
