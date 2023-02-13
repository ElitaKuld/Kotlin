package FunktionellProgrammeringDemo

// kod från Sigruns film om funktionell programmering i Kotlin

fun unitFun() :Unit = Unit

fun main() {
    // Inte tillåtet eftersom "for is a statement, not an expression" och får inte returnera något
    //val f= for(i in 1..10) {println(i)}

    println(unitFun())
    val i : Int = 4+5
    println(i)
    val u1: Unit = println(42)   //42 // för att println returnerar en Unit
    println(u1)
    val u2 = println(0) // Type inference
    println(u2)
}