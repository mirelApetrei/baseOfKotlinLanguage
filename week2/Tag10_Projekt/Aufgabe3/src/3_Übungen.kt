fun main() {
    var fahrzeugeGeschwindigkeit: Map<String, Double> = mapOf(
        "Auto" to 120.5,
        "Flugzeug" to 755.2,
        "Fahrrad" to 22.0,
        "Tretroller" to 15.7
    )
    var Schluesseln: List<String> = fahrzeugeGeschwindigkeit.keys.toList()
//    println(fahrzeugeGeschwindigkeit.containsKey("Flugzeug"))
//    println(fahrzeugeGeschwindigkeit.containsKey("Moped"))
//    println(fahrzeugeGeschwindigkeit.containsKey("Tretroller"))

    val werten: List<Double> = fahrzeugeGeschwindigkeit.values.toList()
    println(fahrzeugeGeschwindigkeit.containsValue(755.2))
    println(fahrzeugeGeschwindigkeit.containsValue(2.0))
    println(fahrzeugeGeschwindigkeit.containsValue(120.5))

}