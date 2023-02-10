package Övning_4b_ListorMedDjur

interface Printable {
    fun getData()
}

class Animal(private var type: String, private val numberOfLegs: Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalList = listOf(cat, human, threeLeggedDog)

    animalList.forEach { animal -> animal.getData() }
}

/*
Modifiera ditt huvudprogram så att du:
• Skapa upp ett antal djur och lägg i en lista
• Skriv ut vilka djur du har och antal ben för varje djur genom att iterera över listan
 */