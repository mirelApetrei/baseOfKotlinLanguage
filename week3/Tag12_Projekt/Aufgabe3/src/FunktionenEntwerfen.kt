fun main() {
    println(integerFunction())
    println(doubleFunction())
    println(greetingFunction())
    println(listsWithGreeating())
    println(mapWithGreeating())
    println(nullFunction())

}

fun integerFunction(): Int {
    val value = 5
    return value
}

fun doubleFunction(): Double {
    val value = 6.234

    return value
}

fun greetingFunction(): String{
    val value = "Hallo"
    return value
}

fun listsWithGreeating(): List<String>{
    val list: List<String> = listOf("Hallo", "Welt", "!")
    return list
}

fun mapWithGreeating(): MutableMap<String, Boolean>{
    val mapList: MutableMap<String, Boolean> = mutableMapOf("Lernen wir die Sprache Französisch?" to false,
                                                            "Lernen wir die Sprache Kotlin?" to true)
    return mapList
}

fun nullFunction() {

}