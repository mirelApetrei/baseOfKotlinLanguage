// auf deutsch == Besuchers
class Visitors(var name: String,
               var age: Int) {

    fun sayHello(){
        println("Hello there, my name is ${this.name}, and I am ${this.age} old.")
    }

}