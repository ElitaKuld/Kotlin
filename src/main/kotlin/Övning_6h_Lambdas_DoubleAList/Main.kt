package Övning_6h_Lambdas_DoubleAList

fun doubleNumberOfAnimals(listOfAnimals: List<Animal>) = listOfAnimals + listOfAnimals // creates a new list

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)

    val animalList2 = doubleNumberOfAnimals(animalList)
    animalList2.forEach { it.getData() }

}

/*
Skriv en funktion som fördubblar antalet djur i den lista den returnerar. (Kräver ingen lambda)
 */