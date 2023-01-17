fun main() {
    var numbers: List<Int> = listOf(2, 5, 3, 7)
    var number: Int = numbers[numbers.size]
    println(number)
//    IndexOutOfBoundsException -> weil numbers.size = 4, aber wir haben index nür bis 3(weil anfangen wir mit index[0]
}