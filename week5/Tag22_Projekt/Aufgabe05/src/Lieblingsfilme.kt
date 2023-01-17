fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Frankenstein", "Jurassic Park", "Matrix", "Harry Potter")
    var prüfenFilm = "Matrix"
    var filmIndex = lieblingsFilme[0]

//TODO: mit for-loop
    for (film in lieblingsFilme){
        if(film == prüfenFilm){
            println("Ja, der Film Matrix ist in der Liste. Und seine Stelle in die Liste ist ${lieblingsFilme.indexOf(film)}")
        }
    }

//  TODO: mit do-while loop
 var i = 0
    do {
        if (prüfenFilm == lieblingsFilme[i]){
            println("Ja, der Film Matrix ist in der Liste. Und seine Stelle in die Liste ist ${lieblingsFilme.indexOf(lieblingsFilme[i])}")
        }
        i++
    } while (i <= lieblingsFilme.size - 1)

}