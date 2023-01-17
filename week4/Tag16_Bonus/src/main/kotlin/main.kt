
//bonus
fun main() {

    var shopListe: MutableMap<String, Double> = mutableMapOf(
        "Bananen" to 1.99,
        "Kartofel" to 0.79,
        "Tomatoes" to 1.09,
        "Ingwer" to 0.78,
        "Apfel" to 1.75,
        "Birnen" to 2.15,
    )

    println("Do you have the product I search for? and how much costs?")
    var answer = readln()
    if(shopListe.containsKey(answer)){
        println("Your chosen product is in our shop list and costs ${shopListe.getValue(answer)}")
    } else {
        println("We are sorry to inform that the product you want isn`t in our shop list.")
    }

    var myShopingList: MutableList<String> = mutableListOf<String>()

    println("Do you want to add at your shoping Cart list?" + "\n 1.Add to my cart" + "\n 2.Later add" + "\n 3.Remove from your list")
    var chosenAction = readln().toInt()

    when(chosenAction){
       1 -> {
           myShopingList.add(answer)
           println("Your shoping list contains the following products:")
           println(myShopingList.toList())
       }
        2 -> {
            println("You will be redirected on main page with products")
            println(shopListe)

        }
        3 -> {
            myShopingList.remove(answer)
            println("Your shoping list contains the following products:")
            println(myShopingList.toList())
        }
    }
}


