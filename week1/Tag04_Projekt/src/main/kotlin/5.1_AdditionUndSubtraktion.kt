package main.kotlin

fun main (){
    // Addiere das Alter deiner Eltern und subtrahiere das Alter von dir und deinen Geschwistern von der Summe.
    // Lege das Alter der Personen jeweils als Variable an. Gib das Ergebnis mit dem println()-Befehl aus.
    var meineVaterAlter: Int = 65
    var meineMutterAlter: Int = 58

    var elternAlterSume: Int = meineVaterAlter + meineMutterAlter
    println("Eltern alter ist:  $elternAlterSume")

    var meineAlter: Int = 35
    var meinenBruderAlter: Int = 28

    var kinderAlter: Int = meineAlter + meinenBruderAlter
    println("Kinder alter ist: $kinderAlter")


    var elternAlterMinusKindern: Int = elternAlterSume - kinderAlter
    println("Differenz zwischen der Summe der Lebensalter: $elternAlterMinusKindern")

}