fun helloWolrd() {
    println("Hello World!")
}

fun helloWorld2() = println("Hello World!")

helloWolrd()
helloWorld2()

fun giveMeTen() = 10

giveMeTen()

fun giveMeTen2(): Int {
    return 10
}

giveMeTen2()

fun printString(x: Int) = "Hej på dig nummer $x!"

printString(11)

fun räknaUtArea(x: Int, y: Int) = x * y

räknaUtArea(5, 5)

fun räknaUtArea2(x: Int, y: Int): Int {
    return x * y
}

räknaUtArea2(5, 6)

fun räknaUtOmkretsRektangel(x: Int, y: Int) = 2 * x + 2 * y

räknaUtOmkretsRektangel(5, 5)

fun räknaUtOmkretsRektangel2(x: Int, y: Int): Int {
    return 2 * x + 2 * y
}

räknaUtOmkretsRektangel2(4, 5)

var i = 5
var i2: Int = 9

val j = 6
val j2: Int = 10

räknaUtArea2(i, j)
räknaUtOmkretsRektangel2(i2, j2)


/*
Se till att du kan skriva ut ”Hello World”, både som ren utskrift och från en funktion.

Skriv en funktion som returnerar valfri int, använd =

Skriv samma funktion, fast med krullparenteser, notera skillnaden.

Skriv ut en variabel, inifrån en sträng, mha $variabelnamn.

Skapa en area-uträknings-funktion som tar 2 int som tar höjd och bredd som inparametrar och räknar
ut och returnerar arean. Gör även en omkrets-uträkningsfunktion som returnerar omkretesen för en
rektangel. Skriv bägge dessa funktioner på både kort och lång-notation (med = och med {})

Skapa variabler som betecknar höjd och bredd för en rektangel. Testa att göra olika varaibler som är
både implicit och explicit typade, och som både är var och val. Använd variablerna när ni anropar era
funktioner för area och omkrets.
Explicit typ är t.ex: var i : Int = 5
 */