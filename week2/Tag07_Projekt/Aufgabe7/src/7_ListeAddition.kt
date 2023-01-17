fun main() {
    // todo: Erstelle hier deinen Code.
    var ersteListe: MutableList<Int> = mutableListOf(4, 8, 3)
    var zweiteListe:MutableList<Int> = mutableListOf(2, 4, 9)

    ersteListe.add(3)
    zweiteListe.add(6)
    println(ersteListe.last() + zweiteListe.last())
}