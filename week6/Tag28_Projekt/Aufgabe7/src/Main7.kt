

fun main(){

    var eagle: Eagle = Eagle(8000.00)
    var pinguin: Penguin =Penguin(12000.00)

    eagle.makeNoise()
    eagle.fly()
    println(eagle.canFly)
    println()
    pinguin.waddle()
    println(pinguin.canFly)
    pinguin.makeNoise()

}


// das Gewicht des Vogels in Gramm angibt.