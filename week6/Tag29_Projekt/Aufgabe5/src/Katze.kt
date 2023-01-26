package Aufgabe5.src

class Katze(): Tier() {

    override fun makeNoise() {
        super.makeNoise()
        println("Miau.")
    }
}