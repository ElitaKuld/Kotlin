package Övning_9_GeneriskaFunktioner


// Sigruns lösning
// Map delen:
fun <T, S> List<T>.myMap(
    function: (T) -> (S)
): List<S> {
    var res: List<S> = listOf<S>()
    for (element in this) {
        res += function(element)
    }
    return res
}

// Filter delen:
fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {

    var res : List<T> = listOf<T>()
    for (element in this) {
        if (predicate(element))
            res += element
    }
    return res
}

fun <T>List<T>.filterLetterA(
    predicate: (T) -> Boolean): List<T>{
    val list = mutableListOf<T>()

    for (element in this){
        if(predicate(element)){
            list.add(element)
        }
    }
    return list
}

fun main() {
    // Map delen:
    val ints = listOf(1, 2, -3, 5, -1)
    println(ints.myMap { it + 3 })
    println(ints.myMap { "[$it aaa]" })

    // Filter delen:
    println( ints.myFilter { it > 0 } )
}

/*
9:a Skriv en egen version av funktionen ”filter”
• 9b Skriv en egen version av funktionen ”map”
o Använder inte predicate utan function (T) -> (T)
• I ditt main-program, skapa upp en lista och se att det funkar att göra filter eller map på listan
• Om generics känns svårt, börja med att definiera upp map och filter för listor som bara tar t.ex Int
eller String
o Nästa steg är att kunna hantera alla sorters objekt
 */