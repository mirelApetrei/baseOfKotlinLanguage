
class Book(): Page(text = ""){
     lateinit var page: Page
     lateinit var pages: List<Page>
    constructor(page: Page, pages: List<Page>) : this() {
        this.page = page
        this.pages = pages
    }


    fun nextPage(){
        this.page = pages[0]
        for (page in pages){


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