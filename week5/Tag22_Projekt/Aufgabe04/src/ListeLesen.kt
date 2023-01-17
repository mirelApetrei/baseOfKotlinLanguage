
fun main() {
    var fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")

//    TODO: mit for-loop
    for(fruit in fruits){
        println(fruit)
    }

//    TODO: mit do-while loop
    var i = 0
    do {
        println(fruits[i])
        i++
    } while (i <=fruits.size-1)
}