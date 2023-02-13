package Övning_6a_Lambdas

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)

    println(animalList.mapIndexed { index, djur -> " $index: ${djur.type}" })

    animalList.forEach { print("${it.type} ") }
    println()

    animalList.filter { it.numberOfLegs < 4 }.forEach(Animal::getData)

    println(animalList.count { it.numberOfLegs < 4 }) // snabb variant

    println(animalList.any { it.numberOfLegs == 4 }) // snabb variant

    println(animalList.joinToString { " ${it.type}" })

    println(animalList.joinToString(transform = { " ${it.type} " }, separator = "*", postfix = "end of the list"))

    println(animalList.joinToString(separator = "*", postfix = "end of the list") { " ${it.type} " })

}

/*
Bygg ut djurklasserna i övningsuppgift 4:
Gör om utskriften av listan så att du använder en lambda för att skriva ut djuren
Testa minst 2 olika sätt att skriva ut.
 */