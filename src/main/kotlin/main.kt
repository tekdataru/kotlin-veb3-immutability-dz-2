val likes = 31//Сколько лайков поставили люди

fun main() {

    val lastNumb = likes % 10
    var wordManInRussian = "людям"
    if (lastNumb == 1) {
        wordManInRussian = "человеку"
    }

    println("Понравилось $likes $wordManInRussian")
}