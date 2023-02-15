package Övning_11e_Lambdas_Fold

import Övning_11a_Lambdas_GrupperingAvMappar.Animal

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")
    val fourLeggedDog = Animal("Dog", 4)
    val frog = Animal("Frog", 4)

    val animalList = listOf(cat, human, threeLeggedDog, butterfly, fourLeggedDog, frog)

    println(animalList.fold(0) { sum, animal -> sum + animal.numberOfLegs }) // Sigruns lösning

}

/*
Gör en funktion där du adderar fram summan av dina djurs benantal
• Använd Fold
• (Varför är fold lämpligare än reduce i detta fall?)
• (lättare att jobba utifrån den ursprungliga listan än från de mappar som skapats)
 */