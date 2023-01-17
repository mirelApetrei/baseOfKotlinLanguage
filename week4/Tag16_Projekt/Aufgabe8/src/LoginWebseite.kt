fun main() {
    loginStatus(false, false, false)
    loginStatus(true, false, false)
    loginStatus(true, true, false)
    loginStatus(true, true, true)
}

fun loginStatus(userAccepted: Boolean, passwordOk: Boolean, connectionSercure: Boolean){
    if (!userAccepted) {
        println("User denied.")
    } else if (!passwordOk) {
        println("False password.")
    } else if (!connectionSercure){
        println("Unsafe connection.")
    } else {
        println("Ok.")
    }
}