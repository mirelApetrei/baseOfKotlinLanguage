import Aufgabe5.src.Hund
import Aufgabe5.src.Katze

fun main(){

    var dog:Hund = Hund()
    var cat:Katze = Katze()
//    TODO: a) Instanziiere einen Hund und eine Katze, lass sie Geräusche machen.
    dog.makeNoise()     // --> "Woof!"
    cat.makeNoise()     // --> "Miau."

//    TODO: b) Füge diese Zeile Code in die makeNoise()-Methode der Hund und der Katzen-Klasse hinzu: super.makeNoise()
    /*Animal noises...
    Woof!
    Animal noises...   ==> ueber konsole wird printed
    Miau.*/

}
