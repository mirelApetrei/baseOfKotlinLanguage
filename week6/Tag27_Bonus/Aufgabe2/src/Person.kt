//Hier kannst du die Klasse Person hinschreiben
class Person{
    var name: String
    var age: Int
    var heigh: Int
    constructor(name: String, age: Int, heigh: Int){
        this.name = name
        this.age = age
        this.heigh = heigh
    }

    fun mayRide(person: Person): Boolean{
        if (person.heigh >= 155 && person.age >= 12)
            return true
        return false
    }


}

