package Övning_11b_Lambdas_TraverseringMappar

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")
    val fourLeggedDog = Animal("Dog", 4)
    val frog = Animal("Frog", 4)

    val animalList = listOf(cat, human, threeLeggedDog, butterfly, fourLeggedDog, frog, cat)

    val animalMap = animalList.groupBy(Animal::numberOfLegs)
    println(animalMap.map { "${it.key}: ${it.value.map { it.type }}" })
    println(animalMap.map { "${it.key}: ${it.value.map { it.type }.distinct()}" }) // distinct!

}

/*
Skapa en lista av olika sorters djur
• Skapa en map som är grupperad på antal ben
• Nyckel: antalBen, Värde: Djur
• Skriv en utskriftsfunktion som traverserar den grupperade mappen och skriver ut varje nyckel,
följt av de sorter av djur som är sorterade under varje nyckel
• Helst inga dubblerade värden på djursorter
 */