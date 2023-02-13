package Övning_6g_Lambdas

fun countInsectsInTheList(listOfAnimals: List<Animal>) = listOfAnimals.count { it.numberOfLegs > 4 }
fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")

    val animalList = listOf(cat, human, threeLeggedDog, butterfly)
    println(countInsectsInTheList(animalList))
}

/*
Skriv en funktion som berättar hur många insekter som finns i listan (det är djur med fler än 4 ben)
 */