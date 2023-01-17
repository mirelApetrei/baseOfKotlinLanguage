fun main() {
    println(convertFromKMToMeter(12.5))
    println(convertFromMeterToKM(1500.5))

}

fun convertFromMeterToKM(valueToConvert: Double): Double {
    return valueToConvert / 1000
}

fun convertFromKMToMeter(valueToConvert: Double): Double {
    return valueToConvert * 1000
}