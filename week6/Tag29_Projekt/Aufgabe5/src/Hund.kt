package Aufgabe5.src

open class Hund(): Tier() {

    final override fun makeNoise(){
        super.makeNoise()
        println("Woof!")
    }
}