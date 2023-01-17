package week4


fun main() {
    calculateVoucherValue("Mirel", 80)
    calculateVoucherValue("Mirel", 20)
    calculateVoucherValue("Mirel", 100)
}

fun calculateVoucherValue(name: String, valueSpent: Int){
    println("Hello $name, I see that you have spent some money on our shop\n"+
    "We have a surprise for our fidel customers,  ")

    if (valueSpent >= 0){
        when(valueSpent){
            in 0..49 -> {
                println("Unfortunatelly, your amount of money, $valueSpent euro, doesn`t fit to our vouchers.")
            }
            in 50..100 -> { println("Your voucher for the amount of $valueSpent spent, is 10€.")}
        }
    } else if(valueSpent >= 100){
        println("Your voucher for the amount of $valueSpent spent, is 20€.")
    } else {
        println("something went whrong")
    }

}