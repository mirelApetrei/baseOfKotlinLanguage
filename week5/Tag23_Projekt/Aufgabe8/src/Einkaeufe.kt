fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    val listSize = shoppingList.size
    for(i in 0 until listSize){
        var lebensmiettel = shoppingList[i]
        //println("Der Lebensmiettel: $lebensmiettel findet Sie am index ${shoppingList.indexOf(lebensmiettel)}")
        println("${shoppingList.indexOf(lebensmiettel) + 1}. $lebensmiettel")
    }

}