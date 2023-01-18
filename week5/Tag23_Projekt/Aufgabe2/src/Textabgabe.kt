/*
Schreibe hier deine Antwort hin.
     TODO: Mit der for-Schleife wird die Liste der Bücher durchlaufen, wobei i den Buchindex und var book den Namen des Buches beibehält.
        dann wird angezeigt, wo sich jedes Buch befindet -> d.h. auf welchem Index jedes Buch zu finden ist
 */

fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}