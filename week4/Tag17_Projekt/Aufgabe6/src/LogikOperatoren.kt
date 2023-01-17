fun main() {
    if (
        trainSoftware(true, true).lowercase() == "Zug darf losfahren.".lowercase() &&
        trainSoftware(false, true).lowercase() == "Zug muss stehen bleiben.".lowercase() &&
        trainSoftware(true, false).lowercase() == "Zug muss stehen bleiben.".lowercase() &&
        trainSoftware(false, false).lowercase() == "Zug muss stehen bleiben.".lowercase()
    ) {
        println("Perfekt!")
    } else {
        println("Fehler.")
    }
}

fun trainSoftware(doorsAreClosed: Boolean, powerAvailable: Boolean): String {
    if (doorsAreClosed && powerAvailable)
        return "Zug darf losfahren."
            return "Zug muss stehen bleiben."
}