class Cow(
    name: String,
    weight: Double,
    age: Int,
    gender: String
) : Animal(name, weight, age, gender) {

    var givesmilk: Boolean = false

   init {
       if (this.age >= 3){
           this.givesmilk = true
       }
   }


    override fun makeSound() {
        super.makeSound()
        println("Moooooooo!")
    }

    fun milking(visitor: Visitors){
        if (givesmilk){
            println("This cow, $name, is giving milk to ${visitor.name}")
        } else {
            println("The cow is too young for milking.")
        }
    }
}