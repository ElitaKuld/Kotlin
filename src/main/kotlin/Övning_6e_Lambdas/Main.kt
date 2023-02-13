package Övning_6e_Lambdas

fun findMaxNumberOfLegs(listOfAnimals: List<Animal>) = listOfAnimals.maxBy { it.numberOfLegs }

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)
    val animalWithMaxNumberOfLegs = findMaxNumberOfLegs(animalList)
    animalWithMaxNumberOfLegs.getData()
}

/*
Skriv en funktion som hittar det högsta antalet ben som ett djur i listan har (viss googling kan behövas
för funktionen som hittar max-värdet)
 */