package week4

// some changes
fun main() {

    var listNames1 = listOf<String>("Mark", "Andres", "Jan", "Martin", "Renate", "Nadia")
    var listNames2 = listOf<String>("Andres", "Martin", "Raul", "Daniel", "Maja", "Anna")

    println(isEqual(listNames1[0], listNames2[3]))
    println(isEqual(listNames1[2], listNames2[2]))

    println(isEqual(listNames1[1], listNames2[0]))
    println(isEqual(listNames1[3], listNames2[1]))
}

fun isEqual(value1: String, value2: String ): Boolean{

    return value1.equals(value2)
}