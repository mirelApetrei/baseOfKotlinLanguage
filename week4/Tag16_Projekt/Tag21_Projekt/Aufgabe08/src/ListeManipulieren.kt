fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)
    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife

    // In this way we can iterate over a list in Kotlin -> listIterator()
    val iterator: MutableListIterator<Int> = list.listIterator()

    // while there is a next element in the list, than do that...
    while (iterator.hasNext()){
       val oldValue = iterator.next()
        iterator.set(oldValue * 2)

    }
    println(list)
}

/*
* var index = 0
*
* while(index < list.size){
* var newValue = list[index] * 2
* list[index] = newValue
* }
* println(list)
* */