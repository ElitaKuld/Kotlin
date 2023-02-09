package Övning_7b_Rekursion_Summering

fun sumOfIntegers(list: List<Int>, counter: Int): Int {
    return if (counter == 1) list[counter - 1]
    else list[counter - 1] + sumOfIntegers(list, counter - 1)
}

fun main() {

    val listOfInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val counter = listOfInt.size

    println(sumOfIntegers(listOfInt, counter))

}
/*
Skriv en rekursiv funktion som tar en lista av ints och returnerar summan av talen i listan
 */