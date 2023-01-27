fun main(){

//    TODO: Task 2
    var visitor: Visitors = Visitors("Franz", 35)
    visitor.sayHello()
    println(visitor.name)
    println()
//    TODO: Task 3

    var pet: Animal = Animal("Helga", 35.3, 12, "Female",)
    println(pet.name)
    println(pet.gender)
    println(pet.weight)
    println(pet.age)
    println()
//    TODO: Task 4
    println("Task 4")
    pet.move()
    pet.isStroked(visitor)
    pet.makeSound()
    pet.canBeFed(visitor)
//   TODO: task 5
    println()
    println("task 5 -> sheep")
    var sheep: Sheep = Sheep("Shawn", 23.4, 5, "Female")
    sheep.makeSound()

//    TODO: task 6
    println()
    println("Task 6 -> Chicken")
    // cannot be a "male"-gender, because only female makes eggs.
    var chicken: Chicken = Chicken("Kikeri", 2.5, 2, "Female", 2)
    chicken.makeSound()
    println(" This chicken makes ${chicken.eggProTag} eggs every day")

//    TODO: task 7
    println()
    println("Task 7 -> Cow")
    var cow: Cow = Cow("Berta",525.0, 7, "Female")
    cow.milking(visitor)


}