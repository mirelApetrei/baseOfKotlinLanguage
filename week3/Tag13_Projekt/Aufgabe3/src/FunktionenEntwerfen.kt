fun main() {
    println(addNumbers(123.45, 76.55))
    println(subsctractNumbers(7, 4))
    println(advancedFunction(25, 40, 100))
}

//TODO: a) Erstelle eine Funktion, die zwei Zahlen vom Typ Double als Parameter erhält,
//      die zwei Zahlen addiert und das Ergebnis zurückgibt.
fun addNumbers(number1: Double, number2: Double): Double{
    var result = number1 + number2
   return result
}

//TODO: b) Erstelle eine Funktion, die zwei Zahlen vom Typ Int als Parameter erhält,
//          die zweite Zahl von der ersten Zahl abzieht und das Ergebnis zurückgibt.

fun subsctractNumbers(number1: Int, number2: Int): Int{
    var result = number1 - number2
    return result
}

//TODO: c) Erstelle eine Funktion, bekommt drei Zahlen vom Typ Int,
// dann die ersten zwei Zahlen vom Typ Int und speichert das Ergebnis in einer Variable.
// Die Funktion zieht von dem Ergebnis die dritte Zahl ab.
// Die Funktion gibt dann das Ergebnis zurück.

fun advancedFunction(number1: Int, number2: Int, number3: Int): Int{
    var multipliedNumbers = number1 * number2
    var finalResult = multipliedNumbers - number3
    return finalResult
}
