open class Bird {
    var weight: Double
    var canFly: Boolean

    constructor(weight: Double, canFly: Boolean){
        this.weight = weight
        this.canFly = canFly
    }

    fun makeNoise(){
        println("This animal has made a funny noise.")
    }
}