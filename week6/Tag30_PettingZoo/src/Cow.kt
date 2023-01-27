class Cow(
    name: String,
    weight: Double,
    age: Int,
    gender: String
) : Animal(name, weight, age, gender) {

    var givesmilk: Boolean = false


   init {
       this.givesmilk = this.age >= 3 && gender == "Female"

   }


    override fun makeSound() {
        super.makeSound()
        println("Muuuuuuu!")
    }

    fun milking(visitor: Visitors){
        if (givesmilk){
            println("This cow, $name, is giving milk to ${visitor.name}")
        } else {
            println("The cow is too young for milking.")
        }
    }
}