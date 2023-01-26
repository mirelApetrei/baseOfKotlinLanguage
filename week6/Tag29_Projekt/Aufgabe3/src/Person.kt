class Person {
    var name: String
    var phoneNumber: Int
    var age: Int

    constructor(name: String, phoneNumber: Int, age: Int) {
        this.name = name
        this.phoneNumber = phoneNumber
        this.age = age
    }

    fun sayHello(){
        println("Hallo an alle! Meine name ist ${this.name}")
    }
}

