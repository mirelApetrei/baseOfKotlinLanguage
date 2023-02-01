/*
TODO: Schreibe eine Klasse Hund.
Ein Hund hat ein Alter, ein Geschlecht, einen Namen und kann bellen und sein Alter in Hunde Jahren zurückgeben.

Die Klasse hat zwei Konstruktoren:
*   Einen primären Konstruktor: Hier werden die Parameter Alter, Geschlecht und der Name einfach dem Hund zugewiesen.
*   Einen sekundären Konstruktor: Hier wird ein neuer Hund geboren, das Alter des Hundes ist deshalb 0.
    Das Geschlecht des Hundes ist zufällig und der Name des Hundes soll über die Konsole eingegeben werden (readln()).

Erstelle dann zwei Hunde:
*   Einen mit beliebigen Alter, Geschlecht und Name (primärer Konstruktor).
*   Einen Neugeborenen (sekundärer Konstruktor).
*/

fun main(){
    var dog1 = Hund(3, "Male", "Rinty")
    var dog2 = Hund()
    println(dog2)
}
class Hund {
    var alter: Int? = null
    var geschlecht: String? = null
    var name: String? = null

    constructor(alter: Int, geschlecht: String, name: String){
        this.alter = alter
        this.geschlecht = geschlecht
        this.name = name
    }
    constructor(alter: Int = 0, name: String = readln()){
        this.geschlecht = listOf<String>("Male", "Female").random()
    }
}


/*
TODO: Schreibe eine Klasse Auto und eine Unterklasse Cabriolet.
Ein Auto hat eine PS-Anzahl, eine Anzahl an Räder, eine Anzahl an Sitzen, ein Baujahr und es hat Automatik oder nicht.

Die Klasse hat zwei Konstruktoren:
*   Einen primären Konstruktor: Hier werden die übergebenen Parameter der Klasse zugewiesen.
*   Einen sekundären Konstruktor: Hier werden als Parameter einen Autotyp und ein Baujahr übergeben.
    Im Konstruktor wird dann anhand des Autotyps ein Auto erstellt.
    Autotyp:    - Bus -> 300 PS, 6 Räder, 42 Sitze, hat Automatik.
                - Lkw -> 450 PS, 10 Räder, 2 Sitze, hat Automatik.
                - Pkw -> 100 PS, 4 Räder, 5 Sitze, hat Automatik.

Schreibe dann eine Unterklasse Cabriolet, dass von der Klasse Auto erbt.
Ein Cabriolet kann sein Dach ein- und ausfahren.
Dabei soll eine Warnung ausgegeben werden, wenn man versucht das Dach zu schließen, wenn es bereits zu ist,
bzw. zu öffnen, wenn es bereits offen ist.
Außerdem ist ein Cabriolet immer vom Typ Pkw.
*/

/*
TODO: Schreibe eine Klasse Person sowie die Unterklassen Lehrer.
die Person hat einen Namen, ein Alter, eine Telefonnummer und eine Körpergröße.
Stelle im Konstruktor sicher, dass keine Person mit negativer Körpergröße
und keine Person mit negativem Alter erstellt werden kann.
Eine Person kann sich vorstellen und altern.

Ein Lehrer erbt von der Klasse Person und lehrt entweder in der Haupt-, Realschule oder im Gymnasium.
Zusätzlich lehrt der Lehrer in zwei Fächern aus den Fächern Mathe, Deutsch, Englisch, Französisch, Sport.
Stelle im Konstruktor sicher, dass er genau zwei Fächer lehrt, dass die Fächer stimmen und die Schule stimmt.
Man kann den Lehrer fragen welche Fächer, bzw. in welcher Schule er lehrt.
Wenn der Lehrer älter wird, als 65 Jahre, antwortet er auf die Fragen damit, dass er in Rente ist.
*/

