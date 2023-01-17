//Aufgabe 1 - Die Bank initialisieren
var datenBank:MutableMap<String, Double> = mutableMapOf(
    "Frank" to 3870.60,
    "Gary" to 1234.56,
    "Mija" to 280.75,
    "Müller" to 4500.60,
    "Daniel" to 11450.78,
    "Lena" to 5200.45
)


fun main(){
//getBankAccountBalance("Frank")
//        println("Insert please, the name you want to add, and amount of money: ")
//        addNewAccount()
// println(datenBank)
//  moneyWithdraw("Frank", 370.00)
// addMoneyToAccount("Nestor", 1200.00)
// bankTransfer("Fran", "Mija", 370.00)

    //TODO: Aufgabe 8 - Beta Test deiner App.



}


//TODO: Aufgabe 2 - Konto Geldbetrag
//      Schreibe eine Funktion, die den aktuellen Betrag eines Kontos zurückgibt.

fun getBankAccountBalance(accountOwner: String) {

    if (accountOwner in datenBank.keys) {
            println(datenBank.getValue(accountOwner))
    } else {
        println("This person doesn`t have an account.")
    }
}

/*TODO: Aufgabe 3 - Neue Konten hinzufügen
      Schreibe eine Funktion, die ein neues Konto zur Bank hinzufügt
       */

fun addNewAccount(newName: String = readln(), newSum: Double = readln().toDouble()) {
//    println("Insert please, the name you want to add, and amount of money: ")
    try {
        if (newName in datenBank.keys) {
            println("This name exist already in our accounts.")
            println("Please change the name and try again: ")
            addNewAccount()
        } else {
            datenBank.put(newName, newSum)

            println("Your account was succesfully created!\n"+
                    "Here are your credentials: $newName => ${datenBank.getValue(newName)}")
            println(datenBank)
        }
    } catch (e: Exception){
        println(e.message)
    }
}

/*
TODO: Aufgabe 5 - Auszahlung am Geldautomat
  eine Funktion, die eine Auszahlung am Geldautomaten simuliert.
        -> Überprüfe zuerst, ob ein Konto mit dem angegebenen Namen existiert
        -> Überprüfe ebenfalls, ob das Konto über einen ausreichenden Kontostand verfügt,
        -> Schreibe die Funktion so, dass maximal 500 Euro pro Transaktion abgehoben werden können*/

fun moneyWithdraw(accountOwner: String , sumToDrow: Double ){
    val maximumWithdraw = 500.00

    try {
        if (accountOwner in datenBank.keys){
            println(" Welcome $accountOwner to you bank account.")
        } else {
            println("Your account name doesn`t exist! Please retry. ")

        }
    } catch (ex: Error){
        println( " Your account doesn`t exist." )
    }

    if (sumToDrow <= datenBank.getValue(accountOwner)!! && sumToDrow <= maximumWithdraw){
         var newSum = datenBank.getValue(accountOwner) - sumToDrow
        datenBank[accountOwner] = newSum
        println(datenBank)
    } else if (sumToDrow >= datenBank.getValue(accountOwner)!!) {
        println("Insuficient funds! Please try with a lower sum.")
    } else {
        println("You can maximum 500 € withdraw.")
    }
}

//TODO: Aufgabe 6 - Einzahlung am Geldautomaten
//      Schreibe eine Funktion, die eine Einzahlung am Geldautomaten simuliert

fun addMoneyToAccount(account: String, money: Double){
    try {
        if (account in datenBank.keys){
            datenBank[account] = datenBank[account]!! + money
            println("Dear $account, your amount of money has increased and now you have ${datenBank.getValue(account)}")
            println(datenBank)
        } else {
            datenBank.set(account, money)
            println("A new account was created with following credentials: \n"+
            "$account with amount of money $money")
            println(datenBank)
        }
    } catch (e: Exception){
        println(e.message)
    }
}

//TODO: Aufgabe 7 - Bankinterne Überweisung.
//      Schreibe eine Funktion, die eine Überweisung simuliert.

fun bankTransfer(accountFrom: String, accountTo: String, amountToTransfer: Double){
   try {
        if ( accountFrom in datenBank.keys && accountTo in datenBank.keys){
            println(datenBank)
            println("These accounts exists. We will proceed furthur.")
            datenBank[accountFrom] = datenBank[accountFrom]!! - amountToTransfer
            datenBank[accountTo] = datenBank[accountTo]!! + amountToTransfer
            println("The new amount of $accountFrom is ${datenBank.getValue(accountFrom)} \n" +
                    " The new amount of $accountTo is ${datenBank.getValue(accountTo)}")
            println(datenBank)
        } else {
            println("One of the accounts, or both, doesn`t/ don`t exist/s. Please double-check.")
        }

        } catch (e: Exception){
            println(e.message)
        }
}

