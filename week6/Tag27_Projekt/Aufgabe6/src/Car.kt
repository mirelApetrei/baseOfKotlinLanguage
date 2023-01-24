class Car {
    var color: String
    var brand: String
    var speed: String       //added "speed" variable

    constructor(color: String, brand: String, speed: String) { // <- added speed var in constructor
        this.color = color
        this.brand = brand
        this.speed = speed
    }
}