

fun main() {
    var raceCar1: RaceCar = RaceCar("BMW", speed = (170..200).random())
    var raceCar2: RaceCar = RaceCar("Audi", speed = (170..200).random())
    var raceCar3: RaceCar = RaceCar("Opel", speed = (170..200).random())
    var raceCar4: RaceCar = RaceCar("Mercedes", speed = (170..200).random())
    var raceCar5: RaceCar = RaceCar("Fiat", speed = (170..200).random())
    var raceCar6: RaceCar = RaceCar("Ferrari", speed = (170..200).random())
    var raceCar7: RaceCar = RaceCar("Lambo", speed = (170..200).random())
    var raceCar8: RaceCar = RaceCar("Mitsubishi", speed = (170..200).random())

    //Hier drunter kannst du die listeVonAutos erstelen
    var carList: MutableList<RaceCar> = mutableListOf(raceCar1, raceCar2, raceCar3, raceCar4, raceCar5, raceCar6, raceCar7, raceCar8)
    //Hier drunter kannst du den Rest programmieren

    println("Das Rennen Nr: 1")
    var maximSpeed1 = maxOf(raceCar1.speed, raceCar2.speed)
    println("Rennen zwischen ${raceCar1.model} und ${raceCar2.model} hat gewonnen: ${maxOf(raceCar1.speed, raceCar2.speed)}")

}