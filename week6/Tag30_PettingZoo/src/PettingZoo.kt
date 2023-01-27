class PettingZoo(var pettListe: MutableList<Animal>) {

    fun allPettsSounds() {
        for (i in this.pettListe) {
            i.makeSound()
        }
    }

    fun feedAllPetts(visitor: Visitors) {
        for (pett in pettListe) {
            pett.canBeFed(visitor)
        }
    }

    fun ponyRace(firstPony: Pony, secondPony: Pony) {

        println("""
            Welkome to the pony race!
            
            The first poney`s name is ${firstPony.name}, and he will compete with second poney, with the name ${secondPony.name}.
                 
        """.trimIndent())

        if (firstPony.speed > secondPony.speed){
            println("The ${firstPony.name} won , with a speed of ${firstPony.speed}, against ${secondPony.name} wich had a spped egual with ${secondPony.speed}")
        } else {
            println("The ${secondPony.name} won , with a speed of ${secondPony.speed}, against ${firstPony.name} wich had a spped egual with ${firstPony.speed}")
        }
    }

}

