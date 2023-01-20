//Auf gehts eine Runde BlackJack! Hier ist ein vollständiges Kartendeck.
val kartendeck: List<String> = listOf(
    "Pik Ass", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10", "Pik 9",
    "Pik 8", "Pik 7", "Pik 6", "Pik 5", "Pik 4", "Pik 3", "Pik 2",
    "Kreuz Ass", "Kreuz Koenig", "Kreuz Dame", "Kreuz Bube", "Kreuz 10", "Kreuz 9",
    "Kreuz 8", "Kreuz 7", "Kreuz 6", "Kreuz 5", "Kreuz 4", "Kreuz 3", "Kreuz 2",
    "Herz Ass", "Herz Koenig", "Herz Dame", "Herz Bube", "Herz 10", "Herz 9",
    "Herz 8", "Herz 7", "Herz 6", "Herz 5", "Herz 4", "Herz 3", "Herz 2",
    "Karo Ass", "Karo Koenig", "Karo Dame", "Karo Bube", "Karo 10", "Karo 9",
    "Karo 8", "Karo 7", "Karo 6", "Karo 5", "Karo 4", "Karo 3", "Karo 2",
)
    var myHand = mutableListOf<String>()
    var computerHand = mutableListOf<String>()

fun main() {
    /* Die Variable meinDeck ist euer Deck mit dem ihr arbeiten könnt.
    Mit der Funktion mischen() könnt ihr das Deck mischen.
    Mit der Funktion eineKarteZiehen() könnt ihr aus eurem Deck die oberste Karte ziehen.
    Beachtet, dass die Funktion die Karte auch aus eurem Deck entfernt.
    Mit der Funktion kartenWert() bekommst du den Wert einer Karte als Int zurück.
    Unter dem Kommentar siehst du wie du die Funktionen benutzen kannst.
     */
    var meinDeck = kartendeck.toMutableList()
/*
    mischen(meinDeck)
    var karte = eineKarteZiehen(meinDeck)
    var beispielwert = kartenWert(karte)
    //println(beispielwert)*/
    showCards(meinDeck, "Computer")


}

fun mischen(deck: MutableList<String>) {
    deck.shuffle()
}

fun eineKarteZiehen(deck: MutableList<String>): String {
    var karte = deck.first()
    deck.remove(deck.first())
    return karte
}

fun kartenWert(karte: String): Int {
    var kartenWert = karte.split(" ")[1]

    return when (kartenWert) {
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        in listOf("10", "Koenig", "Dame", "Bube") -> 10
        "Ass" -> 11
        else -> 0
    }
}

//TODO: Aufgabe 2
fun gesamtePunktzahlVonHand(hand: MutableList<String>): Int {
    var sum = 0
    for (karte in hand){
        sum += kartenWert(karte)
    }
    return sum
}

//TODO: Aufgabe 3
fun showCards(deck: MutableList<String>, player: String): List<String> {

    if (player == "Me") {
        myHand.add(eineKarteZiehen(kartendeck.toMutableList()))
        myHand.add(eineKarteZiehen(kartendeck.toMutableList()))
        for (card in myHand){
            return card.toString().toList()
        }
    }
    if

}


//TODO: Aufgabe 4
fun loserHand(hand: MutableList<String>): Boolean{
    return gesamtePunktzahlVonHand(hand) > 21
}
//TODO: Aufgabe 5
fun drawMoreCards(player: String){
    println("How is your hand of cards, $player?\n"+
    "Do you want to draw another card:\n" +
            "1. Hit\n" +
            "2. Stand")
    var playerChoise = readln()
    when(playerChoise){
        "1" -> loserHand(handOfCards()
    }
}






/*

var playerHand: MutableList<String> = mutableListOf()
var computerHand: MutableList<String> = mutableListOf()
playerHand.add(eineKarteZiehen(deck))
playerHand.add(eineKarteZiehen(deck))
computerHand.add(eineKarteZiehen(deck))
computerHand.add(eineKarteZiehen(deck))
var length = computerHand.size

if (player == "Player") {
    println("This is Player Hand:")
    for (karte in playerHand) {
        return karte
    }
} else if (player == "Computer") {
    println("This is Computer Hand: ")
    for (i in 0 until computerHand.size - 1) {
        if (kartenWert(computerHand[i]) > kartenWert(computerHand[i + 1])) {
            println(computerHand[i])
        } else
            return computerHand[i + 1].toString()
    }
}*/
