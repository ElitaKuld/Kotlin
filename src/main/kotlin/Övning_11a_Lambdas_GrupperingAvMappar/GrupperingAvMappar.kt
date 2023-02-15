package Övning_11a_Lambdas_GrupperingAvMappar

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")

    val animalList = listOf(cat, human, threeLeggedDog, butterfly)

    val animalMap = animalList.groupBy(Animal::type)
    println(animalMap.map { "${it.key}: ${it.value.size}" }) // because value is a list!

}

/*
Skapa en lista av olika sorters djur
• Skapa en map som är grupperad på sort av djur
• Nyckel: sort, Värde: Djur
• Skriv en utskriftsfunktion som traverserar den grupperade mappen och skriver ut varje nyckel,
följt av antal djur som ligger i nyckelns värde
 */