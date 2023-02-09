package Övning_7a_Rekursion_RäntaPåRänta

fun interestOnInterest(initialAmount: Double, numberYears: Int, percentage: Double): Double {
    return if (numberYears == 0) initialAmount
    else (1 + (percentage * 0.01)) * interestOnInterest(initialAmount, numberYears - 1, percentage)

}

fun main() {

    val initialAmount = 100.00
    val numberYears = 5
    val percentage = 10.00

    println(interestOnInterest(initialAmount, numberYears, percentage))
}


/*
Skriv en rekursiv funktion beräknar hur mycket ränta du får efter et viss antal år.
Inparametrar till funktionen är
• Initialt belopp
• Antal år
• Ränta
Lite info till hur den rekursiva metoden kan byggas upp:
• Du sätter in 100 kr med 10% ränta
• Efter ett år har du 100*1,1 = 110 kr
• Nästa år har du (100*1,1 )*1,1 = 121
• Efter 3 år har du ((100*1,1 )*1,1)*1,1 = 133,10
• Efter 5 år har du ((((100*1,1 )*1,1)*1,1)*1,1)*1,1) = 161,05
(Det går utmärkt att skriva en ränteuträknings-metod som inte är rekursiv, men nu är det rekursivitet
som är övningen)
 */