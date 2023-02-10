package Övning_4a_Klassen_Djur

interface Printable {
    fun getData()
}
class Animal(private var type: String, private val numberOfLegs : Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}

fun main(){
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    cat.getData()
    human.getData()
    threeLeggedDog.getData()
}

/*
Skapa en klass ”Djur” som har en
• String ”Sort”
• Int ”antalBen”
• Skapa getters och setters för alla variabler - ???
Gör metoder för att skriva ut
• Djurets sort
• Antal ben
• All info om ett djur
I ditt huvudprogram
• Skapa upp ett antal djur
• Skriv ut vilka djur du har och antal ben för varje djur
 */