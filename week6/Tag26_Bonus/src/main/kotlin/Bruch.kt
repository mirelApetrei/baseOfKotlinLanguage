
class Bruch {
    //Die zwei Klassenvariablen nicht verändern
    var zaehler: Int = 1
    var nenner: Int = 1

    //Hier drunter kannst du weitercoden:
    fun ausgeben(): String{
        return("$zaehler/$nenner")
    }

    fun setz(z: Int, n: Int){
        this.zaehler = z
        this.nenner = n
    }
    fun einlesen(){
       try {
        setz(z = readln().toInt(), n = readln().toInt() )
       } catch (e: Error){
           println(e.message)
       }
    }

    fun wert(): Double {
        return (zaehler/nenner).toDouble()
    }

    fun kehrwert(): Double{
        return (nenner/zaehler).toDouble()
    }
}