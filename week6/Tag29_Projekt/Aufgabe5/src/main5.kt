import Aufgabe5.src.Hund2
import Aufgabe5.src.Katze

fun main(){

    var dog:Hund2 = Hund2()
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
