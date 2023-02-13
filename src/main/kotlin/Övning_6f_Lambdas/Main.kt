package Övning_6f_Lambdas

fun sumNumberOfLegs(listOfAnimals: List<Animal>) = listOfAnimals.sumOf { it.numberOfLegs }

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)
    println(sumNumberOfLegs(animalList))
}
/*
Skriv en funktion som summerar antal ben djuren har (viss googling kan behövas för funktionen som
hittar max-värdet)
 */