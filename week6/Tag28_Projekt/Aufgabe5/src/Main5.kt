

fun main(){

    var page1: Page = Page("Das ist der Anfang des Buches.")
    var page2: Page = Page("Jetzt sind wir auf Seite 2.")
    var page3: Page = Page("Hier haben wir gerade Seite 3. erreicht.")
    var page4: Page = Page("Nun sind wir bei der letzten Seite angekommen.")

    var listOfPages: List<Page> = listOf(page1, page2, page3, page4)

    var book: Book = Book(page1, listOfPages )
    book.read()
    book.nextPage()
    book.nextPage()
    book.nextPage()
    book.nextPage()
    book.previosPage()
    book.previosPage()
    book.previosPage()
}