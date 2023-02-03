open class Auto {

    var horsePower: Int? = null
    var numberOfWheels: Int? = null
    var nrOfPlaces: Int? = null
    var year: Int? = null
    var isAutomatic: Boolean? = null
    var autoType: String? = null

    // primären Konstruktor: Hier werden die übergebenen Parameter der Klasse zugewiesen.
    constructor(horsePower:Int, numberOfWheels: Int, nrOfPlaces: Int, year: Int,
    isAutomatic: Boolean){
        this.horsePower = horsePower
        this.numberOfWheels = numberOfWheels
        this.nrOfPlaces = nrOfPlaces
        this.year = year
        this.isAutomatic = isAutomatic
    }

    //    sekundären Konstruktor: Hier werden als Parameter einen Autotyp und ein Baujahr übergeben.
    constructor(autoType: String, isAutomatic: Boolean) {
        this.autoType = autoType
        this.isAutomatic = isAutomatic
    }
}