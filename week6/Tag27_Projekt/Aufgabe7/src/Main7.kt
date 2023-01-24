fun main() {
    var fruit: Fruit = Fruit("strawberry", "sweet", "red") // <- color parameter added
    println("The ${fruit.name} is very ${fruit.taste}. It's color is ${fruit.color}")
}