package Övning_10a_MerLambdas_Zip

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)
    val butterfly = Animal(numberOfLegs = 6, type = "Butterfly")
    val fourLeggedDog = Animal("Dog", 4)
    val frog = Animal("Frog", 4)

    val listOfAnimalTypes = listOf("Cat", "Human", "Dog", "Butterfly", "Frog")
    val numberOfLegsList = listOf(4, 2, 4, 6, 4)

    val finalList = listOfAnimalTypes.zip(numberOfLegsList) {type, legs -> Animal(type = type, numberOfLegs = legs)}

    finalList.forEach(Animal::getData)
}


/*
Skapa en lista av Strängar, som är olika namn på djur
• Skapa en annan lista med integers som är olika antal ben som djur kan ha
• Låt listorna vara lika långa
• Skriv en metod som zippar ihop de två listorna så att en ny lista skapas
• Denna lista är en List<Djur>
• Varje djurnamn och antal Ben i de gamla listorna är ihop parade
 */