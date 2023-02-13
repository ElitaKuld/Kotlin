package Övning_6d_Lambdas

fun isThereACatHere(listOfAnimals: List<Animal>) = listOfAnimals.any { it.type == "Cat" }
fun isThereAnElephantHere(listOfAnimals: List<Animal>) = listOfAnimals.any { it.type == "Elephant" }

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)
    println(isThereACatHere(animalList))
    println(isThereAnElephantHere(animalList))

}

/*
Skriv en funktion som kollar om det finns några katter i din lista. Testa både med en sorts djur som
finns i listan och en sort som inte finns
 */