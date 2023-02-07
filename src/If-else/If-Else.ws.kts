if (5 < 10) println("Mindre") else println("Större")

if (11 < 22) "Mindre" else "Större"

val x = if (11 > 22) "Mindre" else "Större"
x

fun testFun() = if (11 < 22) "Mindre" else "Större"

println(testFun())

fun testFun2() = if (11 < 22) "Mindre" else if (11 < 22) "Större" else "Zero"

testFun2()

fun choice() {
    val n: Int = 11
    if (n > 0)
        println("It's positive")
    else
        println("It's negative or zero")
}

choice()

fun choice2() {
    val nummer = 10
    val resultat = if (nummer > 100) "Större än 100" else "Mindre än 100"
    println(resultat)
}

choice2()

if (5 < 10) {
    println("Mindre")
    println("Mindre")
} else {
    println("Större")
    println("Större")
}

fun funktionInsideFunktion() {
    fun eval(x: Int) = if (x < 100) "Mindre än 100" else "Större än 100"
    println(eval(10))
}

funktionInsideFunktion()