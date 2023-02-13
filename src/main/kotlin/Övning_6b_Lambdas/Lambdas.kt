package Övning_6b_Lambdas

fun turnAnimalToFrog(animalList: List<Animal>) = animalList.forEach { it.type = "Frog" } // Be Sigrun om hjälp
fun setNumberOfLegsToTwo(animalList: List<Animal>) = animalList.forEach { it.numberOfLegs = 2 }

fun main() {
    var cat = Animal("Cat", 4)
    var human = Animal("Human", 2)
    var threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)
    animalList.forEach { it.getData() }
    println()

    turnAnimalToFrog(animalList)
    animalList.forEach { it.getData() }
    println()

    setNumberOfLegsToTwo(animalList)
    animalList.forEach { it.getData() }

}

/*
Skriv en funktion som tar en lista av olika djur och gör om alla djuren till grodor. Använd lambdas för
detta
 */