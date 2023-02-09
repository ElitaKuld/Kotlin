package Övning_7c_Rekursion_MaxVärde

fun maxValue(list: List<Int>, maxInt: Int, counter: Int): Int {
    return if (counter == list.size) maxInt
    else if (list[counter] > maxInt)
        maxValue(list, list[counter], counter + 1)
    else maxValue(list, maxInt, counter + 1)
}

fun main() {
    val listOfInt = listOf(1, 2, 3, 4, 22, 6, 7, 8, 9, 10)
    val maxInt = 0
    val counter = 0

    println(maxValue(listOfInt, maxInt, counter))
}
/*
Skriv en rekursiv funktion som tar en lista av ints och returnerar maxvärdet av talen i listan
 */