fun main(){

//    TODO: Task 2
    var visitor: Visitors = Visitors("Franz", 35)
    visitor.sayHello()

//    TODO: Task 3

    var pet: Animal = Animal("Helga", 35.3, 12, "Female")
    println(pet.name)
    println(pet.gender)
    println(pet.weight)
    println(pet.age)

}