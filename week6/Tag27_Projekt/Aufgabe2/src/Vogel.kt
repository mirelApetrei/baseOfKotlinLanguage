class Vogel(var vogelTypen: String, var futternTypen: String, var alter: Int) {

     var canFly: Boolean = true
     var vogelTypenListe: MutableList<String> = mutableListOf("Amsel", "Bachstelze", "Blaumeise", "Buchfink", "Buntspecht", "Dohle", "Eichelhäher", "Elster")
     fun zwischern(){
          println("zwischer!")
     }

     constructor(vogelTypen: String, futternTypen: String, alter: Int, types: List<String>) : this(vogelTypen, futternTypen, alter) {
          this.vogelTypen = vogelTypen
          this.futternTypen = futternTypen
          this.alter = alter
          this.vogelTypenListe.addAll(types)
     }
     constructor(vogelTypen: String, futternTypen: String, alter: Int, canFly: Boolean) : this(vogelTypen, futternTypen, alter) {
          this.vogelTypen = vogelTypen
          this.futternTypen = futternTypen
          this.alter = alter
          this.canFly = canFly
     }

}


/*
var vogelTypenListe: List<String> = listOf("Amsel", "Bachstelze", "Blaumeise", "Buchfink", "Buntspecht", "Dohle", "Eichelhäher", "Elster")
var futterTypenListe: List<String> = listOf("Meisen", "Finken", "Ammern", "Drosseln", "Kleiber", "Stare", "Spechte")
var canFly: Boolean = true*/
