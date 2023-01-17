fun main(){
    var nameList: List<String> = listOf("Paul","Dieter", "Jannes", "Lukas", "Hans")
    var sortedList: MutableList<String> = mutableListOf("","", "", "", "")
    /*
        Hier könt ihr euren Code hinschreiben:
       */
    // Den Code hier drunter nicht ändern!!!

    for (name in nameList.indices.reversed()){
        var newName = nameList[name]
        sortedList.add(newName)
        sortedList.remove("")
//        println(sortedList)
    }



    var finishedlist: List<String> = listOf("Hans", "Lukas","Jannes", "Dieter", "Paul")
    if(sortedList == finishedlist){
        println("Du hast die Aufgabe gelöst")
    }else{
        println("Leider noch nicht richtig, versuchs weiter :D")
    }
}
//fun main() {
//    val list = listOf("One", "Two", "Three")
//
//    for (i in list.indices.reversed()) {
//        println(list[i])
//    }
//}
