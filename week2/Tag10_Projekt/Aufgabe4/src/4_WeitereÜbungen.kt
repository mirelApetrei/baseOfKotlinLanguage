fun main() {
    var fahrzeugeGeschwindigkeit: Map<String, Double> = mapOf(
        "Auto" to 120.5,
        "Flugzeug" to 755.2,
        "Fahrrad" to 22.0,
        "Tretroller" to 15.7
    )
//    a)
    var keysOfTheMap: List<String> = fahrzeugeGeschwindigkeit.keys.toList().sorted()
    println(keysOfTheMap)
//    b)
    var valuesOfTheMap: List<Double> = fahrzeugeGeschwindigkeit.values.toList().sorted()
    println(valuesOfTheMap)
//    c) // wir können klassisch machen, oder mit average() function
    var valuesAverage = valuesOfTheMap.average()
    println(valuesAverage)



}