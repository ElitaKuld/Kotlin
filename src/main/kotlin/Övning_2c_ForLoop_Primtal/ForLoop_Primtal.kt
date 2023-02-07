package Övning_2c_ForLoop_Primtal

import javax.swing.JOptionPane

fun main() {

    fun isPrimeNumber(number: Int): Boolean {
        for (i in 2 until number) if (number % i == 0) return false
        return true
    }

    val indata = JOptionPane.showInputDialog("Ange ett positivt heltal större än 1")
    val heltal = indata.toInt()
    if (isPrimeNumber(heltal)) println("Detta är ett primtal.")
    else println("Detta är inte ett primtal.")
}

/*
Skriv en funktion som räknar ut om ett givet tal är ett primtal. Returnera true eller false.
 */