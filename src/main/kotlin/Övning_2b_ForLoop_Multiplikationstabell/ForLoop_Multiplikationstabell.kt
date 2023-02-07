package Övning_2b_ForLoop_Multiplikationstabell

fun main() {
    val x = 5
    val lowestNumber = 1
    val highestNumber = 10

    fun multiply(number: Int, lowestNumber: Int, highestNumber: Int) {
        for (i in lowestNumber..highestNumber) print("" + i * number + " ")
        println()
    }

    multiply(x, lowestNumber, highestNumber)
}

/*
Skriv en funktion som listar godtycklig del av godtycklig multiplikationstabell
Inparametrar ska vara:
• En int x som talar om vilken multiplikationstabell som ska listas
• Det lägsta tal som x ska multipliceras med
• Det högsta tal som x ska multipliceras med
 */