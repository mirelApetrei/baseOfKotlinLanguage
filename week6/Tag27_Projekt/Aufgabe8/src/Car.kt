class Car {
    var ps: Int
    var color: String
    var seats: Int
    var freeSeats: Int = 0

    constructor(ps: Int, color: String, seats: Int){
        this.ps = ps
        this.color = color
        this.seats = seats

    }
    constructor(ps:Int ,color: String, seats: Int ,freeSeats: Int): this(ps, color, seats){
        this.freeSeats = this.seats

    }



    fun getIn(){
        if (this.freeSeats > 0){
            freeSeats--
        } else {
            println("You don`t have free seats anymore!")
        }
    }

    fun getOut(){
        if (this.freeSeats <= this.seats){
            freeSeats++
        } else {
            println("All seats are empty! You don`t have someone to kick off.")
        }
    }

    fun startEngine(){
        if (freeSeats < seats){
            println("wroom wroom!")
        } else {
            println("There is no one to start the engine!")
        }
    }


}