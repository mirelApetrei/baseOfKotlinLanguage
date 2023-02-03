/*
Du kannst deine IF-Verzweigungen in die main()-Funktion schreiben.
Dazu sind schon die Variablen, die du in der IF-Verzweigung verwenden sollst, vordefiniert.
Teste deine IF-Verzweigungen, indem du den Variablen verschiedene Werte gibst.
*/

/*
--------------------------------------------------
                Ein Beispiel
--------------------------------------------------

TODO: (0) Erstelle eine If-Else-Verzweigung.
Es soll "wahr." ausgegeben werden, wenn a gleich b ist.
*/
fun main() {

    // Hier sind die vordefinierten Variablen.
    // Ändere ihre Werte, um deine Verzweigungen zu testen.
    var a: Double = 5.0
    var b: Double = 5.0
    var c: Double = 3.0
    var d: Double = 2.5
    var b1: Boolean = true
    var b2: Boolean = false
    var b3: Boolean = true
    var b4: Boolean = true

    if (a == b) {
        println("wahr.")
    }



    /*
TODO: (1) Erstelle eine If-Else-Verzweigung.
Es soll "wahr." ausgegeben werden, wenn a größer als b ist.
*/
    if (a > b){
     println("wahr.")
    } else if (a < b){
        println("falsch")
    } else
        println("sind gleich.")

    /*
TODO: (2) Erstelle eine IF-Else-Verzweigung.
Es soll "wahr." ausgegeben werden, wenn b zwischen a und c liegt.
*/

    if (b > a && b < c)
        println("Wahr.")
    /*
TODO: (3) Erstelle eine IF-Else-Verzweigung.
Es soll "wahr." ausgegeben werden, wenn b und c zwischen a und d liegen.
*/
    if ((b > a && b < d) && (c > a && c < d)){
        println("wahr.")
    }
    /*
TODO: (4) Erstelle eine IF-Else-Verzweigung.
Es soll "wahr." ausgegeben werden, wenn b1, b2 und b3 wahr sind.
*/
    if (b1 && b2 && b3)
        println("wahr.")
    /*
TODO: (5) Erstelle eine IF-Else-Verzweigung.
Es soll "wahr." ausgegeben werden, wenn entweder b1 und b2 wahr oder b3 und b4 falsch sind.
*/

    if ((b1 && b2) || !(b3 && b4)){
        println("wahr.")
    }
    /*
TODO: (6) Gebe alle Zahlen aus der Liste aus, die durch 3 teilbar sind.
Schreibe dazu eine Schleife. Tipp: Du kannst mit dem %-Operator (Modulo) arbeiten.
 */
    val liste1 = listOf(1, 8, 9, 10, 21, 27, 35, 47, 60)
        for (zahl in liste1){
            if (zahl % 3 == 0){
                println(zahl)
            }
        }

    /*
TODO: (7) Gebe die erste Zahl aus der Liste aus, die durch 5 teilbar ist.
Schreibe dazu eine Schleife.
 */
    val liste2 = listOf(1, 8, 9, 10, 21, 27, 35, 47, 60)
    println("---------------------------")
    for (zahl2 in liste2){
        if (zahl2 % 5 == 0){
            println(zahl2)
            break
        }
    }

    /*
TODO: (8) Gebe aus, ob eine Zahl in der Liste durch 22 teilbar ist oder nicht.
Schreibe dazu eine Schleife.
 */
    val liste3 = listOf(1, 8, 9, 10, 21, 27, 35, 47, 60)
    println("---------------------------")
    for (nr in liste3){
        if (nr % 22 == 0){
            println("gibt")
            continue
        } else
            println("gibt keine Zahl durch 22 teilbar.")
        break
    }

    /*
TODO: (9) Gib den Index der Zahl 21 aus.
Schreibe dazu eine Schleife.
 */
    val liste4 = listOf(1, 8, 9, 10, 21, 27, 35, 47, 60)
    println("---------------------------")
    for (i in liste4){
        if (i == 21){
            println(liste4.indexOf(i))
        }
    }
    /*
TODO: (10) Schreibe eine When-Verzweigung.
Gegeben ist ein Double a.
Schreibe eine When-Verzweigung,
die "1" ausgibt, wenn a zwischen 0.0 und 10.0 liegt,
die "2" ausgibt, wenn a zwischen -10.0 und 0.0 liegt,
die "3" ausgibt, wenn a genau 5.0 ist,
die "4" ausgibt, wenn keins zutrifft
 */
    println("---------------------------")
    var a1: Double = -15.0
    when(a1){
        5.0 -> println("3")
        in 0.0..10.0 -> println("1")
        in -10.0..0.0 -> println("2")
        else -> println("4")
    }
}