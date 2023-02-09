package rekursionDemo


fun factorial(i: Long): Long {
    if (i <= 1) return 1
    return i * factorial(i - 1)
}

//Svansrekursion : En cleanare metod (för att inget ligger kvar på stacken och väntar):
fun factorialAcc(n: Long): Long {
    fun factorialInneAcc(acc: Long, n: Long): Long {
        if (n == 1L) return acc
        else return factorialInneAcc(n * acc, n - 1)
    }
    return factorialInneAcc(1, n)
}

// factorial (3) = return 3*factorial(2) => return 3*(2*(factorial(1))) => 3*(2*(1)))
fun main() {
    println(factorial(3))
    println(factorialAcc(3))
}

