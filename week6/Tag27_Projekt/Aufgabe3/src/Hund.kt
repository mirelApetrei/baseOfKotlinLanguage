class Hund(
    var name: String = "Todi",
    var age: Int = 4,
    var breed: String = "Golden Retriever"
){

     var color: String  = ""

    constructor(name: String, age: Int, breed: String, color: String): this(name, age, breed){
        this.name = name
        this.age = age
        this.breed = breed
        this.color = color
    }

    fun bark(){
        println("woooof!")
    }

    fun age(){
        this.age++
    }
}