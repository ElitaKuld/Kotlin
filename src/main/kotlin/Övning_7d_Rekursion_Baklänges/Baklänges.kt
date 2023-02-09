package Övning_7d_Rekursion_Baklänges

fun backwards(word: String, wordBackwards: String, counter: Int): String {
    return if (counter == 0) wordBackwards + "" + word[counter]
    else wordBackwards + "" + word[counter] + backwards(word, wordBackwards, counter - 1)
}

fun main() {
    val word = "Love"
    val wordBackwards = ""
    val counter = word.length - 1

    println(backwards(word, wordBackwards, counter))
}
/*
Skriv en rekursiv funktion som skriver ut en sträng baklänges
 */