fun main () {
    val list : List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag", "!")
    //Erstelle unter diesem Kommentar eine Schleife, die die Liste oben auslesen kann
    val it: ListIterator<String> = list.listIterator()

    while (it.hasNext()) {
        val elementOfTheList = it.next()
        println("$elementOfTheList ")
    }


}

/*
* while(i < list.size){
* println(liste[i]
* i++
* }
*
* */