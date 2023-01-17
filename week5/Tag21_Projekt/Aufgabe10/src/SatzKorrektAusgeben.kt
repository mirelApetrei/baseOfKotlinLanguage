fun main(){
    var umgedrehterSatz = listOf(".", "rückwärts ", "mehr", "nicht", "ist ", "Satz ", "Dieser ")
    println(satzAusgabe(umgedrehterSatz))
}

fun satzAusgabe(list: List<String>): MutableList<String> {
    // hier dein code
  /*  println("Original Sentence: $list")
    var readablerecord: MutableList<String> = mutableListOf()
    var  reversedList = list.reversed()
    val iterate: ListIterator<String> = reversedList.listIterator()

    while (iterate.hasNext()) {
       val word = iterate.next()
        readablerecord.add(word)
    }
    //readablerecord.remove(",")
        println("Correct record: $readablerecord")
*/
    var i = list.size-1
    val list2: MutableList<String> = mutableListOf()

    while (i >= 0){
        list2.add(list[i])
        i--
    }
    return list2
}

