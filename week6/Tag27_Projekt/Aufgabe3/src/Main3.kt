
fun main(){


    var dog1: Hund = Hund("Rex", 3, "Terrier", "Golden")
    var dog2: Hund = Hund("Luna", 5, "Labrador")
    var dog3: Hund = Hund("Titi", 1, "Chiuaua")
    var dog4: Hund = Hund()

    println(dog1.age)
    dog1.age()
    println(dog1.age)
    dog2.bark()
    println()
    println("this is the default dog.")
    println(dog4.name)
    dog4.color = "Gelb"


}