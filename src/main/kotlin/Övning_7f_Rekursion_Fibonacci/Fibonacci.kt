package Övning_7f_Rekursion_Fibonacci
/*
fun fibonacci(indexNumber : Int) : Int{

}
*/
fun main(){

    tailrec fun fib(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        println(next)
        if (next > 100) System.exit(0)
        fib(prev, next)
    }

    println(fib(1, 2))

}
/*
Betrakta Fibonacci-demon i facit. Fibonacci-talen är en sekvens där varje nytt tal räknas ut genom att
addera de två föregående talen i sekvensen, De första talen är 1 och 2
Sekvensen blir: 1, 2, 3, 5, 8, 13, 21 …
Kopiera exemplet och skriv om
Man ska kunna ange en siffra som betecknar ett index i fibonacci-sekvensen som inparameter till din
funktion
Ditt program ska sedan skriva ut vilket fibonacci-tal som är på den plats som motsvarar det tal du
skickade in

 */