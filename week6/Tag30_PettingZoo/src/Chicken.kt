open class Chicken(name: String,
                   weight: Double,
                   age: Int,
                   gender: String,
                   var eggProTag: Int) : Animal(name, weight, age, gender) {

  /*  init {
        this.eggProTag = eggProTag
    }*/
    override fun makeSound() {
        super.makeSound()
        println("ga-gack, -> made by chicken.")
    }
}