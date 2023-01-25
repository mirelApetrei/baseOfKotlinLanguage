

//      TODO: Was gibt das Programm aus?
/*Dein Haustier hat sich streicheln lassen.
Dein Haustier heisst Kruemel und ist 3 Jahre alt.
false*/
//      TODO: Wir instanziieren eine Meerschweinchen-Instanz. In der Meerschweinchen-Klasse ist keine Methode pet(),
// dennoch können wir die Meerschweinchen-Instanz mit pet() streicheln. Warum?
// ==> weil class Meerschweinchen  erbt die Eigenschaften und Methoden von class Haustier

//      TODO: Die Meerschweinchen-Klasse hat keine Eigenschaften name und age, dennoch können wir über die Meerschweinchen-Instanz auf die Eigenschaften zugreifen. Warum?
       // ==> weil class Meerschweinchen  erbt die Eigenschaften und Methoden von class Haustier

//      TODO: Was macht das Keyword? open
// ermöglicht es uns, die Eigenschaften und Methoden der übergeordneten Klasse zu verwenden und zu ändern

//      TODO: Was macht der Codeausschnitt hier? : Haustier(name, age)
            // instanziiert den Basiskonstruktor der Vater-Klasse
open class Haustier(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun pet(){
        println("Dein Haustier hat sich streicheln lassen.")
    }
}

class Meerschweinchen(name: String, age: Int, val jumpheight: Int) : Haustier(name, age) {

    fun jump(heightSleepPlace: Int): Boolean {
        return heightSleepPlace <= jumpheight
    }
}

fun main(){
    var kruemel: Meerschweinchen = Meerschweinchen("Kruemel", 3, 25)
    kruemel.pet()
    println("Dein Haustier heisst " + kruemel.name + " und ist " + kruemel.age + " Jahre alt.")
    println(kruemel.jump(30))
}