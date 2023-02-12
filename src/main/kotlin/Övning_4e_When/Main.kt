package Övning_4e_When

fun getAnimalSound(animal: Animal) {
    when (animal.type) {
        "Cat" -> println("Meow")
        "Human" -> println("Bla-bla-bla")
        "Dog" -> println("Woof")
    }
}

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    getAnimalSound(cat)
    getAnimalSound(human)
    getAnimalSound(threeLeggedDog)

}


/*
Skapa en funktion som tar ett Djur som inparameter. Beroende på Djurets sort ska du skriva ut djurets
läte. Använd en When-sats (Kotlin's motsvarighet till Switch)
 */