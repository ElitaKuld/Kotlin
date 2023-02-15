package Övning_11c_FiltreringAvMappar

import Övning_11a_Lambdas_GrupperingAvMappar.Animal

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")
    val fourLeggedDog = Animal("Dog", 4)
    val frog = Animal("Frog", 4)

    val animalList = listOf(cat, human, threeLeggedDog, butterfly, fourLeggedDog, frog, cat)

    val animalMap = animalList.groupBy(Animal::type).filter { it.key.startsWith("K") }
    val animalMap1 = animalList.groupBy(Animal::type).filter { it.key.startsWith("D") }
    val animalMap2 = animalList.groupBy(Animal::type).filter { it.key.contains("ex") }
    val animalMap3 = animalList.groupBy(Animal::type).filter { it.key.contains("og") }
    println(animalMap.map { "${it.key}: ${it.value.map { it.numberOfLegs }}" })
    println(animalMap1.map { "${it.key}: ${it.value.map { it.numberOfLegs }}" })
    println(animalMap2.map { "${it.key}: ${it.value.map { it.numberOfLegs }}" })
    println(animalMap3.map { "${it.key}: ${it.value.map { it.numberOfLegs }}" })

}

/*
Utifrån de mappar du skapade i uppgift 11a-b
• I mappen som har djurens sorter som nyckel
• Filtrera mappen så att den bara visar de djur som börjar på bokstaven K
• Filtrera mappen så att den bara visar de djur som det finns ett ex av
 */