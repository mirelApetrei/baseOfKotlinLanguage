fun main() {
    /*var filme: MutableList<String> = mutableListOf(
        "Star Wars", "Hockeyschläger", "Herr der Ringe", "Deadpool",
        "Tastatur", "The Wolf of Wall Street", "Fluch der Karibik"
    )*/
    // todo: Erweitere ab hier den Code.

    var filme: MutableList<String> = mutableListOf(
        "Star Wars", "Hockeyschläger", "Herr der Ringe", "Deadpool",
        "Tastatur", "The Wolf of Wall Street", "Fluch der Karibik"
    )
    filme[1] = "Ironman"
    filme[4] = "James Bond"

    println(filme)
}