open class Pony(
    name: String,
    weight: Double,
    age: Int,
    gender: String,
    var speed: Double
) : Animal(name, weight, age, gender) {

    override fun makeSound() {
        super.makeSound()
        println("Wiehiehie....")
    }
    fun canRide(personWhoRide: Visitors){
        if(this.age >= 1 && personWhoRide.age >= 6){
            println("Hi ${personWhoRide.name}. You can ride this pony.")
        } else {
            println("Hi ${personWhoRide.name}, unfortunatelly you can`t ride this pony.")
        }
    }

}