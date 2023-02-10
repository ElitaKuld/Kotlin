package Övning_4c_SetMedDjur

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

    val animalSet1 = setOf(cat, human, cat, threeLeggedDog, human, threeLeggedDog)
    val animalSet2 = setOf(threeLeggedDog, human, cat)

    animalSet1.forEach { animal -> animal.getData() }
    animalSet2.forEach { animal -> animal.getData() }

    println(animalSet1 == animalSet2) //  = lika, även om innehållet har en annan ordning
}

/*
I ditt djur-program, skapa upp två olika Set.
• Ett Set som innehåller alla djur, flera gånger om
• Ett Set som innehåller ett ex av varje djur, men i annan ordning än i det första Set:et
• Skriv ut alla djur i Set1
• Notera att varje djur bara finns med en gång i din utskrift
• Skriv ut alla djur i Set2
• Skriv ut resultatet av Set1.equals(Set2)
• Är de lika eller inte?
 */