

fun main(){

    var car1: Car = Car(150,"Black", 5, 5)
    var car2: Car = Car(180,"White", 7, 3)
    car1.getIn()
    car1.getIn()
    println(car1.freeSeats)

    println()
    car1.startEngine()
    car1.getOut()
    car1.getOut()
    println(car1.freeSeats)
    car1.startEngine()
}