fun main() {
    var liste: MutableList<Int> = mutableListOf(5, 4, 6, 7)
    // todo: erweitere ab hier den Code.
    liste.remove(liste.first())
    liste.remove(liste.last())
    println(liste)

}