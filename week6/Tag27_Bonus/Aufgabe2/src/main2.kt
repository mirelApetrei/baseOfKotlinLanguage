fun main() {

    var person1: Person = Person("Peter", 13, 150)
    var person2: Person = Person("Sabine", 24, 172)
    var person3: Person = Person("Anne", 12, 155)

    //Hier drunter kannst du die listeAnPersonen anlegen
    var personsList = listOf<Person>(person1, person2, person3)

    for (person in personsList){
        println(person.mayRide(person))
    }

}
//hier drunter kannst du deine darfMitFahren-Funktion hinschreiben: