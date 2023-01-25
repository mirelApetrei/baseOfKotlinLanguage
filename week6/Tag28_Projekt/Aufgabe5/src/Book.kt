
class Book(var pages: List<Page>): Page(text = " "){


    var page: Page = pages[0]



    fun nextPage() {
        var pageNr = pages.listIterator()
        if (pageNr.hasNext()){
            this.page = pageNr.next()
        } else {
            println("There are no more pages.you finished the book.")
        }
    }

    fun previosPage(){

        var pageNr = pages.listIterator()
        if (pageNr.hasPrevious()){
            this.page = pageNr.previous()
        } else {
            println("There are no more pages previosly, you are at the first page")
        }
    }
}
//
//println("There are no more pages.you finished the book.")