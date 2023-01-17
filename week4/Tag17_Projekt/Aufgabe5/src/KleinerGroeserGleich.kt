fun main() {
    compareFunction(2, 5)
    compareFunction(2, 5)
    compareFunction(6, 5)

    otherCompareFunction(7, 5)
    otherCompareFunction(5, 5)
    otherCompareFunction(2, 5)
}

fun compareFunction(number1: Int, number2: Int) {
    if (number1 <= number2) {
        println("true")
    } else {
        println("false")
    }
}
fun otherCompareFunction(value1: Int, value2: Int) {
        if (value1 >= value2) {
            println("true")
        } else {
            println("false")
        }
    }
