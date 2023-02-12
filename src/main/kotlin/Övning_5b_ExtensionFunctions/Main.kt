package Övning_5b_ExtensionFunctions

fun String.doubleUp() = println("$this $this")

fun main(){
    val string = "Sovande Fava"
    string.doubleUp()
    "Elsa".doubleUp() // OH MY GOD!!!!! KAN MAN GÖRA SÅ!!!!!????
    "Kotlin is the best!".doubleUp()
}

/*
Skapa följande extension functions för String:
DoubleUp() - Skriver ur en String två gånger
 */