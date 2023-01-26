package Aufgabe5.src

open class Hund2(): Tier() {

    final override fun makeNoise(){
        super.makeNoise()
        println("Woof!")
    }
}