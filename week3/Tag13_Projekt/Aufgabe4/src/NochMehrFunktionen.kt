fun main() {
    println(printCity("Berlin"))
    println(printCity("Duisburg"))
    println(printCity("Frankfurt"))
}
//TODO: eigene funktion

fun printCity(cityToAdd: String, cityList: MutableList<String> = mutableListOf("Köln", "Hamburg")): List<String> {
    var finalListToShow = cityList.plus(cityToAdd)
    return finalListToShow
}