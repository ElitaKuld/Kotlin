package Övning_6c_Lambdas

fun getRidOfHumans(listOfAnimals: List<Animal>) =
    listOfAnimals.filter { it.type != "Human" }.toList() // viktigt att lägga till toList på slutet!

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)
    animalList.forEach { it.getData() }
    println()

    val animalList2 = getRidOfHumans(animalList)
    animalList2.forEach { it.getData() }
    println()

    animalList.filter { it.type != "Human" }.forEach { it.getData() }

}

/*
Skriv en funktion som tar en lista av djur och sorterar bort alla spindlar (Eller någon annan sorts djur
som du har i din lista)
 */