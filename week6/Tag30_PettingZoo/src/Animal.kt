/*
bewegen = move
stroken = gestreichelt
fed = gefüttert
*/


open class Animal(var name: String,
                  var weight: Double,
                  var age: Int,
                  var gender: String) {

    fun move(){
        println("This animal has moved.")
    }

    open fun makeSound(){
        println("This animal has made a noise: ...?")
    }

    fun isStroked(visitor: Visitors){
        println("This animal, ${this.name}, was stroked by the $visitor.")
    }

    fun canBeFed(visitor: Visitors){
        var animalToFed: String = this.name
        var newWeight = this.weight + (0.02 * this.weight)

        println("This animal, $animalToFed, was feded by $visitor.")
        println("THe weight of $animalToFed was $weight, but after the fed, was increased by 2% and now is $newWeight")

    }
}