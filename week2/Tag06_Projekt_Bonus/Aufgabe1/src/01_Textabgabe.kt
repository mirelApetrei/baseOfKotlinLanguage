fun main() {
    val fruits: List<String> = listOf("Banane", "Apfel", "Birne")
    val fruit: String = fruits[fruits.size-3]
    println(fruit)
//    Banane -> fruits.size= 3, und 3-3=0 -> fruits[0] = Banane
}