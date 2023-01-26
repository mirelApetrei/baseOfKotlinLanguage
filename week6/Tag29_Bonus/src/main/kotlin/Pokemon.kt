open class Pokemon {
    var name: String
    var level: Int = 1
    var hitPoints: Int
    var damageValue = 0.5 * level
    open var type: String
    var isKO: Boolean = false

    constructor(name: String, level: Int, hitPoints: Int, type: String) {
        this.name = name
        this.level = level
        this.hitPoints = hitPoints
        this.type = type
    }


    fun looseTP(lost: Int) {


    }

    fun attack(pok: Pokemon) {}


}

class WaterPokemon(var name: String,) : Pokemon(name, level, hitPoints, type) {

}

class FirePokemon() : Pokemon() {

}

class WindPokwmon() : Pokemon() {

}