open class Sheep(name: String,
                 weight: Double,
                 age: Int,
                 gender: String) : Animal(name, weight, age, gender ) {

    override fun makeSound() {
        super.makeSound()
        println("meow, maked by the sheep")
    }
}