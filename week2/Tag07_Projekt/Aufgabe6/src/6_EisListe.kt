fun main() {
    // todo: Erstelle hier deinen Code.
   /* Erstellt eine Liste mit dem Namen Eis und füllt die Liste bei der Erstellung mit den Elementen
   vom Typ String "Schokolade", "Zitrone", "Haselnuss".
    Nach der Initialisierung der Liste füge der Liste mit der add() Methode eine weitere Eissorte deiner Wahl hinzu.
    Gib mit der println() Funktion das letzte Element der Liste aus.*/
    var eis: MutableList<String> = mutableListOf("Schokolade", "Zitrone", "Haselnuss")
    eis.add(3, "Vanilla")

    println(eis.last())
//    eis.add("Blueberry")
//    println(eis.last())


}