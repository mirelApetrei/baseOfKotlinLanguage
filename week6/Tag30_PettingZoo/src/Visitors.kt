// auf deutsch == Besuchers
open class Visitors {

    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return name
    }
    fun sayHello() {
        println("Hello there, my name is ${this.name}, and I am ${this.age} old.")
    }

}