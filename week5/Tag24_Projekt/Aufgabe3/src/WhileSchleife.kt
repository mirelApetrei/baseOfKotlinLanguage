fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)

//TODO:
    /*println(numbers)
        for (i in 0 until numbers.size){
            numbers[i] = numbers[i] * 3
        }
    println(numbers)*/

    /*var i = 0
    var listLength = numbers.size
    while (i <= listLength-1){
        numbers[i] = numbers[i] * 3
        i++
    }
    println(numbers)*/

    multiplyByAnyNumber(4, numbers)
}


//TODO: a)

fun multiplyByAnyNumber(multiplicator: Int, liste: MutableList<Double>){
    var i = 0
    var listLength = liste.size
    while (i <= listLength-1){
        liste[i] = liste[i] * multiplicator
        i++
    }
    println(liste)
}


