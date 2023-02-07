fun helloWorld() {
    println("Hello World!")
}

helloWorld()

println("Hello World!") // ett enklare sätt att skriva ut

fun helloWorld2() = println("Hello World!") // kortare syntax

helloWorld2()

fun giveMeFive(): Int {
    return 5
}

fun giveMeFive2() = 5

println(giveMeFive())

println(giveMeFive2())

giveMeFive()
giveMeFive2()

giveMeFive() + giveMeFive2()

fun addFiveTo(x: Int) = 5 + x

fun add(x: Int, y: Int) = x + y
fun add2(x: Int, y: Int): Int {
    return x + y
}

val i = 5

var j = 5
j = 6 // inga problem
println(j)

val i2: Int = 7 // explicit

val bird = "Koltrast"

i + giveMeFive()

fun giveMefiveWithParameter(x: Int, y: String) = "Hej " + y + ", du sa " + x

giveMefiveWithParameter(23, "Koltrast")

fun giveMefiveWithParameter2(x: Int, y: String) = "Hej $y, du sa $x" // Pythons sätt att ange variabler i en sträng

giveMefiveWithParameter2(22, "Blåmes")
