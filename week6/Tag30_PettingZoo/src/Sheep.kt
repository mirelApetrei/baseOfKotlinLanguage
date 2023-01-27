class Sheep(name: String,
                 weight: Double,
                 age: Int,
                 gender: String) : Animal(name, weight, age, gender ) {

    override fun makeSound() {
        super.makeSound()
        println("määäähhh.., maked by the sheep")
    }
}