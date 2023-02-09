package inläsningsDemo

import java.lang.Exception

fun reader() = readLine()

fun readNumber1() = readln().toInt() // Kotlin sätt att läsa in ett värde

fun readNumber2() = readlnOrNull()?.toInt()


fun main(){
    try{
        println(reader())
        println(readNumber1())
        println(readNumber2())
    }
    catch (e : NumberFormatException){
        println("Input måste vara ett nummer!")
    }
    catch (ex : Exception){
        println("Något gick fel")
    }
}