
open class Page {
   open var text: String
    constructor(text: String){
        this.text = text
    }


    fun read(){
        println(text)
    }
}