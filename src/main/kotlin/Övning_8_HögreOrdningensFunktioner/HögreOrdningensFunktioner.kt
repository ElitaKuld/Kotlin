package Övning_8_HögreOrdningensFunktioner

fun toUpperCase(textToDistort: String): String = textToDistort.uppercase() // classic function

val toUpperCase2: (textToDistort: String) -> String = { it.uppercase() }

fun removeAllDigits(textToDistort: String): String = textToDistort.filter { c: Char -> !c.isDigit() }
val removeAllDigits2: (textToDistort: String) -> String = { it.filter { c: Char -> !c.isDigit() } }

fun textDistortion(textToDistort: String, action: (String) -> String) = action(textToDistort)


// Högre ordningens funktion
fun textDistortion2(action: (String) -> String) { // Sigruns lösning
    println("Skriv in en sträng:")
    val s = readln()

    println(action(s))
}

fun main() {

    val text1 = "fava"
    val text2 = "T56he258C952a562t!"

    println(toUpperCase(text1)) // Test
    println(removeAllDigits(text2)) // Test

    // textDistortion2(toUpperCase2) // Sigruns lösning
    println(textDistortion(text1, toUpperCase2))
    //println(textDistortion(text1, toUpperCase(text1))) // Fråga Sigrun
    println(textDistortion(text2, removeAllDigits2))
}

/*
Skriv en metod: TextDistortion, som tar in en funktion som i sin tur tar in en String och lämnar ifrån
sig en String. I TextDistorsion anropas funktionen som skickas in som inparameter.
Skriv följande metoder som kan användas som inparametrar till TextDistorsion
• ToUpperCase(String) : String
• RemoveAllDigits(String) : String
 */