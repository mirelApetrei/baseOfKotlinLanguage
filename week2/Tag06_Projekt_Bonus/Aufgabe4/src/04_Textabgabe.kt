fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val number1: Int = numbers[numbers.size - 2] + 5
    val number2: Int = numbers[numbers.size - 3]
    println(number1) // number1 = 4 (numbers[5-2]
    println(number2) // number2 = 3 (numbers[5-3]
}