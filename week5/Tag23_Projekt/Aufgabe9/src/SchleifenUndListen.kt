fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")

    val listSize = satz.size
    // TODO: a)
    for (i in satz.reversed())
        println(i)


//    TODO: b)
    var newList = satz.reversed()
    for (i in 1..newList.size step 2) {
       // println(newList[i])
    }

// TODO: c)
    for (i in satz.reversed().size-1 downTo 3){
        println(satz[i])
    }

}
