fun main() {
//    val a: List<Double> = listOf(2.3, 5.4, 6.8)
//    val b: Double = a.min()


//Erstelle eine Liste für die Warennamen und eine Liste für die Warenpreise. Dabei haben der Warenname und der dazugehörige Warenpreis jeweils den gleichen Index.
//Z.b. hat der Schokoriegel sowie sein preis 1.29€ den Index 0.
    var warenname: MutableList<String> = mutableListOf("Schokoriegel", "Wassereis", "Zeitungen")
    var warenpreis: MutableList<Double> = mutableListOf(1.29, 0.49, 1.99)

//Ein neuer Kunde Peter kommt vorbei und möchte gerne wissen, welche Waren du zu welchen Preisen verkaufst.
//Gebe dazu deine Waren und deren Preise in einer Form deiner Wahl in der Konsole aus.
    println(warenname[0] + " ------> " + warenpreis[0] + "\n" +
            warenname[1] + " ------> " + warenpreis[1] + "\n" +
            warenname[2] + " ------> " + warenpreis[2])

//    Peter hat dich leider nicht ganz verstanden, er fragt also nochmal wie viel denn ein Wassereis kostet.
//Nutze die readln() Methode um Peters Wunsch "Wassereis" als Eingabe zu erhalten, verwende dann eine geeignete Methode aus der Vorlesung,
// um den Index des Wassereises in der Liste warennamen zu erhalten und verwende den Index um den Preis des Wassereises zu erhalten und auszugeben.
    var wantedProductPreis: String = readln()
    var preisIndexOfWantedProduct = warenname.indexOf(wantedProductPreis)
    println(warenpreis[preisIndexOfWantedProduct])

    /*m Hintergrund kommt Alfred vorbei und gibt dir deine neue Ware. Dein Sortiment erweitert sich um Kaugummis für 0.19€ das Stück.
    Füge die neue Ware mit der Methode add() so hinzu, dass sie jetzt den index 0 hat. Passe deinen vorherigen Code an, wenn nötig. */
    warenname.add(0, "Kaugummis")
    warenpreis.add(0, 0.19)

    /*Der vergessliche Peter fragt jetzt nochmal nach dem Preis für die Zeitung.
   Nehme auch hier wieder den Warennamen "Zeitung" entgegen, finde den Index, finde mit dem Index den Preis und gib den Preis aus.*/
//
    var wantedProductPreis2: String = readln()
    var preisIndexOfWantedProduct2 = warenname.indexOf(wantedProductPreis2)
    println(warenpreis[preisIndexOfWantedProduct2])

    /*Schlussendlich will Peter 10 Kaugummis, 5 mal Wassereis und 3 Schokoriegel kaufen, er gibt dir 20€, wie viel Restgeld bekommt Peter?
Berechne das Restgeld von Peter und gib es in der Konsole aus.*/
    val gegebeneGeld: Double = 20.0
    val kaugummisPreis: Double = 0.19 * 10
    val wassereisPreis: Double = 0.49 * 5
    val schokoPreis: Double = 1.29 * 3
    val peterTotalSpent: Double = kaugummisPreis + wassereisPreis + schokoPreis
    val restgeld:Double = gegebeneGeld - peterTotalSpent

    println("Das Restgeld von Peter ist:  ${ restgeld }")

    /* Der Tag ist vorbei, ab nach Hause. Durch den ganzen Stress mit Peter hast du vergessen den Tiefkühlschrank für das Wassereis laufen zu lassen.
     Am nächsten Morgen siehst du wie dein Wassereis geschmolzen ist. Bis das wieder eingefroren ist, musst du es aus deinem Sortiment nehmen.
    Entferne das Wassereis und sein Preis aus den jeweiligen Listen.*/
    warenpreis.removeAt((warenname.indexOf("Wassereis")))
    warenname.remove("Wassereis")

//    println(warenpreis)
//    println(warenname)

/*Ein Junge schaut über die Theke, er hat nicht viel geld und will deswegen gerne wissen, was denn die günstigste Ware ist, die du verkaufst.
Gib den Namen der günstigsten Ware aus, die du verkaufst. Verwende in deiner Lösung die Methoden indexOf() und min().*/
    var gunstigePreis: Double =warenpreis.min()
    var indexOfGunstigerProdukt = warenpreis.indexOf(gunstigePreis)
    println(warenname[indexOfGunstigerProdukt])

}