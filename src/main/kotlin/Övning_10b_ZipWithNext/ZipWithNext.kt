package Övning_10b_ZipWithNext

fun main() {

    val numberOfLegsList = listOf(2, 3, 8, 45, 123, 256, 2345)

    val newList = numberOfLegsList.zipWithNext { a, b -> b - a }
    println(newList)

}
/*
Skapa upp en lista med integers,
• [2, 3, 8, 45, 123, 256, 2345]
• Genom att använda zipWithNext, skapa en lista som innehåller skillnaden mellan varje tal
• Alltså [1, 5, 37, 78, 133, 2089]
 */