
fun main(){

    var mitarbeiter1: Mitarbeiter = Mitarbeiter(123)
    var mitarbeiter2: Mitarbeiter = Mitarbeiter(456)
    var mitarbeiter3: Mitarbeiter = Mitarbeiter(789)
    var mitarbeiter4: Mitarbeiter = Mitarbeiter(100)

    println()
    println("This is worker1:")
    mitarbeiter1.gehaltAusgeben()
    mitarbeiter1.istVerfuegbar(false)
    mitarbeiter1.befoerdern("CEO", 5000.00)
    mitarbeiter1.gehaltAusgeben()

    println()
    println("Worker 2:")
    mitarbeiter2.name = "Liora"
    mitarbeiter2.gehalt = 2000.00
    mitarbeiter2.gehaltAusgeben()
    mitarbeiter2.istVerfuegbar(true)
    mitarbeiter2.befoerdern("Mother", 2500.00)


    println()
    println("Worker 3 :")
    mitarbeiter3.name = "Mirel"
    mitarbeiter3.gehalt = 1000.00
    mitarbeiter3.gehaltAusgeben()
    mitarbeiter3.istVerfuegbar(false)
    mitarbeiter3.befoerdern("Entwickler", 5000.00)
    mitarbeiter3.gehaltAusgeben()
}