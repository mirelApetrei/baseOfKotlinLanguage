fun main() {
    val franz: Visitors = Visitors("Franz", 35)
    val sebi: Visitors = Visitors("Sebi", 15)
    val boris: Visitors = Visitors("Boris", 4)
    val sisi: Visitors = Visitors("Sisi", 4)


    var firstSheep: Sheep = Sheep("Shawn", 23.4, 5, "Female")
    var secondSheep: Sheep = Sheep("Bohnti", 27.5, 4, "Male")
    var firstChicken: Chicken = Chicken("Kikeri", 2.5, 2, "Female", 2)
    var secondChicken: Chicken = Chicken("Doodle", 3.5, 3, "Male", 0)
    var cow: Cow = Cow("Berta", 525.0, 7, "Female")
    var firstPony: Pony = Pony("Gustav", 315.0, 3, "Male", 30.5)
    var secondPony: Pony = Pony("Milka", 307.0, 4, "Female", 33.6)

    var pettListe =
        PettingZoo(mutableListOf(firstSheep, secondSheep, firstChicken, secondChicken, cow, firstPony, secondPony))

    println(sebi)
    sebi.sayHello()
    println(boris)
    boris.sayHello()
    firstChicken.makeSound()
    firstSheep.canBeFed(sebi)
    secondPony.canRide(boris)
    println()
    secondChicken.move()
    println()
    secondPony.isStroked(sebi)
    firstPony.canRide(sebi)
    println()
    firstPony.canRide(boris)
    println()
    cow.milking(boris)
    println()
    pettListe.allPettsSounds()
    println()
    pettListe.feedAllPetts(boris)
    pettListe.ponyRace(firstPony, secondPony)

}
