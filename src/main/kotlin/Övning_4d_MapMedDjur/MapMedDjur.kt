package Övning_4d_MapMedDjur

import SamlingarDemo.myMap

interface Printable {
    fun getData()
}

class Animal(var type: String, val numberOfLegs: Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}

fun main() {
    val cat = Animal("Cat", 4)
    val human = Animal("Human", 2)
    val threeLeggedDog = Animal("Dog", 3)

    val animalMap = mapOf("Fava" to cat, "Cecil" to human, "Molly" to threeLeggedDog)

    for ((key, value) in animalMap) println(key + " " + value.type + " " + value.numberOfLegs) // skriva ut map
    println()
    for ((key, value) in animalMap) println("$key ${value.getData()}") // skriva ut map
}
/*
I ditt djur-program, skapa upp en map över dina djur
• Låt djurets namn vara nyckel (du hittar på namn till dem)
• Låt själva djurobjektet vara värdet i mappen
• Skriv ut alla djur i din mapp
 */