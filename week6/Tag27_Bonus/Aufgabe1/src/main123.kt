fun main () {
    //Hier werden 3 Bücher instanziiert und danach in eine veränderbare Liste hinterlegt
    var buch1: Book = Book("Harry Potter", 350)
    var buch2: Book = Book("Ergaon", 700)
    var buch3: Book = Book("Legende von Aang", 300)
    var listeBuecher: MutableList<Book> = mutableListOf(buch1, buch2, buch3)

    //dieser Codeblock gibt die vorhandene Liste aus
    println("Ausgangsliste:")
    for (i in 0..listeBuecher.size - 1) {  // die For Schleife geht vom nullten Index bis zum letzten Index der Liste durch
        println(listeBuecher[i].titel + " " + listeBuecher[i].seitenzahl) //Mit diesem Statement schauen wir jedes Element der Liste, also jedes Buch in der Liste durch und geben daraufhin den Titel und die Seitenzahl aus
    }
    println()
    //dieser Codeblock gibt die nach Seitenzahl sortierte Liste zurück
    listeBuecher.sortBy { it.seitenzahl } // mit diesem Befehl können wir die Bücherliste nach ihrer Seitenzahl sortieren
    println("Sortiert nach Seitenzahl:")
    for (i in 0..listeBuecher.size - 1) { //die gleiche Schleife wie oben
        println(listeBuecher[i].titel + " " + listeBuecher[i].seitenzahl)
    }

    //Sortiere die Liste nun nicht nach ihrer Seitenzahl sondern nach dem Titel und gebe dann die ganze Liste und die einzelnen Bücher aus
    //Hier drunter kannst du coden:
    println()
    listeBuecher.sortBy { it.titel } // mit diesem Befehl können wir die Bücherliste nach ihrer Seitenzahl sortieren
    println("Sortiert nach Title:")
    for (i in 0..listeBuecher.size - 1) { //die gleiche Schleife wie oben
        println(listeBuecher[i].titel + " " + listeBuecher[i].seitenzahl)
    }
}