import jdk.jfr.DataAmount

class Airplane(var amountTurbines: Int, var flyingSpeed: Double) {
    var isAirborne: Boolean = false

    fun takeOff() {
        if (isAirborne) {
            println("The airplane is already flying.")
        } else {
            isAirborne = true
            println("The plane will take off immediatly.")
        }
    }

    fun land() {
        if (isAirborne){
            isAirborne = false
            println("The airplane will land immediatly.")
        }
    }
}

fun main() {

    var airplane: Airplane = Airplane(4, 890.00)
    airplane.takeOff()
    airplane.land()
}