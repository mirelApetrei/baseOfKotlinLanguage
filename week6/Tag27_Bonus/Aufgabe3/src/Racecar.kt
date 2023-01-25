//Hier drunter kannst du die Klasse RaceCar anlegen:
import kotlin.random.Random
class RaceCar {
    var model: String
    var speed: Int

    constructor(model: String, speed: Int){
        this.model = model
        this.speed = (170..200).random()
    }

}
//Hier drunter kannst du deine werIstSchneller Funktion hinterlegen
