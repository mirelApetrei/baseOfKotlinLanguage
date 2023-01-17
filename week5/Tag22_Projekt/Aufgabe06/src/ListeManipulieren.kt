

fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)


    println(numbers)
    for (number: Int in 0..numbers.size-1){
       numbers[number] += 5
    }
    println(numbers)


}

//var newNumber = number + 5
//numbers.set(numbers[number], newNumber)
//println(numbers)
