fun main() {
    squareAreaAndPerimeter(5)
    rectangleAreaAndPerimeter(2, 3)
    circleAreaAndPerimeter(5)
}



//TODO: a)
fun squareAreaAndPerimeter(value: Int){
    println("Die flächeninhalt eines Quadrats, dessen Seitenlänge gleich $value, ist => ${value * value}")
    println("Und der Umfang desselben Quadrats ist: ${value * 4}")
}

fun rectangleAreaAndPerimeter(firstParameter: Int, secondParameter: Int){
    println("Die flächeninhalt eines Rechtecks, dessen Seitenlänge gleich $firstParameter und $secondParameter, ist => ${firstParameter * secondParameter}")
    println("Und der Umfang desselben Rechtecks ist: ${(firstParameter * 2 + (secondParameter * 2))}")
}

fun circleAreaAndPerimeter(value: Int, PI: Double = 3.14159 ){
    println("Die flächeninhalt eines Kreises, mit dieser Bereich gleich $value , ist => ${(value * value) * PI}")
    println("Und der Umfang desselben Kreise ist: ${value * 2 * PI}")
}