fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)
    println(taxesToPay(fees))
}

fun taxesToPay(list: List<Double>): Double{
    var totalOfPayment = 0.0

    for (sum in list){
        totalOfPayment += sum
    }
    return totalOfPayment
}