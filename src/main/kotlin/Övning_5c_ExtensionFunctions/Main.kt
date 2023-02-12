package Övning_5c_ExtensionFunctions

fun String.printRepeat(i : Int) = repeat(i) { println(this) }

fun main(){
    val string = "Söndagskväll"
    string.printRepeat(5)
}

/*
Skapa följande extension functions för String
PrintRepeat(i : Int) - Skriver ur en String i antal gånger
 */