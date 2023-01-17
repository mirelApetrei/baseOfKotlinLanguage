fun main() {
    var numbersArray: List<Int> = arrayListOf(1, 2, 3, 4, 5, 6)
    var lettersArray: List<Char> = arrayListOf('A','B', 'C', 'D', 'E', 'F', 'G')
    var i = 0
    var j = 0

    while (i <= 6){
        while (j <= 6){
            println("$numbersArray[i] + $lettersArray[j]" )

            i++
            j++
        }
    }
}