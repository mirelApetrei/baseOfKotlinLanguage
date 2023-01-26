
class Book(pages: List<Page>, currentPage: Page) {

    var pages: List<Page> = pages
    var currentPage: Page


    init {
        this.currentPage = pages[0]
    }


    fun nextPage() {
        var pageNr = pages.listIterator()
        if (pageNr.hasNext()){
            this.currentPage = pageNr.next()
        } else {
            println("There are no more pages.you finished the book.")
        }
    }

    fun previosPage(){

        var pageNr = pages.listIterator()
        if (pageNr.hasPrevious()){
            this.currentPage = pageNr.previous()
        } else {
            println("There are no more pages previosly, you are at the first page")
        }
    }
}
//
//println("There are no more pages.you finished the book.")