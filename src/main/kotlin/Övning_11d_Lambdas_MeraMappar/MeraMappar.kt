package Övning_11d_Lambdas_MeraMappar

import Övning_11a_Lambdas_GrupperingAvMappar.Animal

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")
    val fourLeggedDog = Animal("Dog", 4)
    val frog = Animal("Frog", 4)

    val animalList = listOf(cat, human, threeLeggedDog, butterfly, fourLeggedDog, frog, cat)

    val animalMap = animalList.groupBy(Animal::type)
    println(animalMap.any { it.key == "Cat" })
    println(animalMap.all { it.key == "Cat" })

}

/*
Skriv en funktion som kollar om du har en katt i din map
• Skriv en funktion som kollar om alla djur i mappen är katter
 */