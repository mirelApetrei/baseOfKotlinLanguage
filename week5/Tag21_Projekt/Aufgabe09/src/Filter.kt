fun main (){
    var exampleList = listOf(0, 1, 2, 3, 4, 5)
    println(everySecondElementOfTheList(exampleList))

}

fun everySecondElementOfTheList(list: List<Int>) : MutableList<Int>{
    var newListToReturn: MutableList<Int> = mutableListOf()
    var i = 1
    while (i < list.size){
        newListToReturn.add(list[i])
        i+=2
    }

    return newListToReturn
}

// tre sa iau list.element.index