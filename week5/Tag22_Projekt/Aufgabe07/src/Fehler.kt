

fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Breaking Bad", "Attack on Titan", "Planet der Affen")

    // Verbesser die For-schleife, sodass alle Filme der Liste lieblingsFilme ausgegeben wird.
//    for(i in 0..lieblingsFilme.size)
//    println(lieblingsFilme[i])


    for(element in lieblingsFilme)
        println(element)

}