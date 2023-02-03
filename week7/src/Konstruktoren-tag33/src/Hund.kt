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