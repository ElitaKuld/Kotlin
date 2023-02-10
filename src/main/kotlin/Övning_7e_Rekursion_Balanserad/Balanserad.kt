package Övning_7e_Rekursion_Balanserad

fun balanced(word: String, rightBracket: Int, leftBracket: Int, counter: Int): Boolean {
    return if (counter == word.length)
        rightBracket == leftBracket
    else if (word[counter] == '(') balanced(word, rightBracket, leftBracket + 1, counter + 1)
    else if (word[counter] == ')') balanced(word, rightBracket + 1, leftBracket, counter + 1)
    else balanced(word, rightBracket, leftBracket, counter + 1)
}

fun main() {

    val word1 = "))(("
    val word2 = ":-)"
    val word3 = "Fantastic(Beasts)"
    val counter = 0

    println(balanced(word3, 0, 0, counter))

}
/*
Skriv en rekursiv funktion som tar en sträng och kollar om antalet parenteser är balanserade (att det
finns lika många höger som vänsterparenteser). Returnera true eller false.
Exempel:
• :-) inte balanserad
• ))(( balanserad
 */