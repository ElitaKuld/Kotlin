package SamlingarDemo

// kod från Sigruns video om samlingar

val numbers = listOf(3, 5, 6, 4, 3, 7, 8, 6, 5, 9)

val mySet = setOf(3, 5, 6, 4, 3, 7, 8, 6, 5, 9) // ett set har inga dubbletter

val numbersMutable = mutableListOf(3, 5, 6, 4, 3, 7, 8, 6, 5, 9) // variant på lista där man kan ändra listan

val knattar = listOf("Knatte", "Fnatte", "Tjatte")

val myMap = mapOf(1 to "hus", 2 to "bil", 3 to "bord", 4 to "stol") // en map är ett set av par


fun main() {
    numbersMutable.add(4) // ändra kan man bara mutable listor
    println(numbersMutable)

    println(numbersMutable.sorted()) // sortera listan
    println(numbersMutable.reversed()) // göra om listan så att values kommer i reverse ordning

    println(numbersMutable.take(3)) // plocka ut en del av listan
    println(numbersMutable.takeLast(3)) // plocka ut en del på slutet av listan
    println(numbersMutable.subList(1, 5)) // // plocka ut en del av listan med hjälp av index
    println(numbersMutable.slice(1..6)) // göra samma sak med hjälp av slice men slice INKLUDERAR sista indexet

    println(numbersMutable.sum())
    println(numbersMutable.average())

    println(mySet) // OBS!: inga dubbletter skrivs ut

    for ((key, value) in myMap) println("$key $value") // skriva ut map

    numbers.forEach { e -> println(e) } // skriva ut lista på ett mer funktionellt sätt

}