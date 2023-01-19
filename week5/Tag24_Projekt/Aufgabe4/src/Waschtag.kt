fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    var redShirts = mutableListOf<String>()
    var blueShirts = mutableListOf<String>()
    var redShirtsCounter: Int = 0
    var blueShirtsCounter: Int = 0

    for (shirt in shirts){
        if (shirt == "rot"){
            redShirts.add(shirt)
            redShirtsCounter++
        } else if (shirt == "blau"){
            blueShirts.add(shirt)
            blueShirtsCounter++
        }
    }
    println("Haben wir folgende sortierte Listen: \n" +
            "Rote T-Shirts liste: $redShirts, -> mit $redShirtsCounter drin \n" +
            "Blaue T-Shirts liste: $blueShirts, -> mit $blueShirtsCounter drin \n")

}