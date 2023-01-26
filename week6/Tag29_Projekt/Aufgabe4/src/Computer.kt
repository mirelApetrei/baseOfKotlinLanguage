class Computer(var on: Boolean) {

    fun pressOnButton() {
        if (this.on == false){
            this.on = true
        }
    }

    fun pressOffButton(){
        if (this.on){
            this.on = false
        }
    }

    fun sendEmail(){
        if (this.on){
            println("Email sent!")
        } else {
            println("The computer is for now off-line, do you want to open it?")
        }
    }
}