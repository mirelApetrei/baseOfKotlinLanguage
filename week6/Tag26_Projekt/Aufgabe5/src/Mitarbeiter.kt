class Mitarbeiter(id: Int) {

    var name = "Georg"
    var position = "Manager"
    var gehalt = 3500.00
    var artDerBeschäftigung = "Unbefristet"
    var muttershaftsUrlaub : Boolean = true

    fun gehaltAusgeben(){
        println(this.gehalt)
        println(this.position)
        println(this.name)
    }

    fun befoerdern(wishedPosition: String, wishedSalary: Double ){
        println("${this.name} has this goal to achieve: ")
        this.position = wishedPosition
        this.gehalt = wishedSalary
        println(this.artDerBeschäftigung)
    }

    fun istVerfuegbar(isOrNotThere: Boolean){
        this.muttershaftsUrlaub = isOrNotThere
        if (isOrNotThere){
            println("This person can`t work, because is on maternity leave.")
        } else
            println("This person can work!")
    }
}