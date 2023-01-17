

fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)
    var newNumbers: MutableList<Int> = mutableListOf()
    var newNumber: Int
    for (number: Int in numbers){
        newNumber = number + 5
        newNumbers.add(newNumber)
    }
    println(numbers)
    println(newNumbers)

}

//var newNumber = number + 5
//numbers.set(numbers[number], newNumber)
//println(numbers)