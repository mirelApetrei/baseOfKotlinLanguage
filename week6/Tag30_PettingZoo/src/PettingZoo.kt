open class PettingZoo() {
    var animalsInZoo: MutableList<Animal> = mutableListOf()

    var firstSheep: Sheep = Sheep("Shawn", 23.4, 5, "Female")
    var secondSheep: Sheep = Sheep("Bohnti", 27.5, 4,"Male" )
    var firstChicken: Chicken = Chicken("Kikeri", 2.5, 2, "Female", 2)
    var secondChicken: Chicken = Chicken("Doodle", 3.5, 3, "Male", 0)
    var cow: Cow = Cow("Berta", 525.0, 7, "Female")
    var pony: Pony = Pony("Gustav", 315.0, 3, "Male", 30.5)
    constructor(animalsInZoo: MutableList<Animal>): this(){
        this.animalsInZoo = animalsInZoo
       animalsInZoo.add(0, firstSheep)
       animalsInZoo.add(1, secondSheep)
       animalsInZoo.add(2, firstChicken)
       animalsInZoo.add(3, secondChicken)
       animalsInZoo.add(4, cow)
       animalsInZoo.add(5, pony)

    }



}

var secondVisitor: Visitors = Visitors("Sisi", 4)
var thirdVisitor: Visitors = Visitors("Markus", 16)
var fourthVisitor: Visitors = Visitors("Lea", 24)