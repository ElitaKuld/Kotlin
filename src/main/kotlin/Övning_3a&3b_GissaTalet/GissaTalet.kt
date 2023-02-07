package `Övning_3a&3b_GissaTalet`

import java.lang.Exception

fun main() {
    var randomNumber = (1..10).random()
    println(randomNumber)
    var wantToPlay = true
    println("Gissa ett tal mellan 1 och 10")
    while (wantToPlay) {
        try {
            val guessed = readLine()!!.toInt()
            if (randomNumber == guessed) {
                println("Du gissade rätt!")
                println("Vill du spela igen? JA/NEJ")
                if (readln().equals("Nej")) {
                    wantToPlay = false
                    println("Tack för att du spelade med oss!")
                } else {
                    randomNumber = (1..10).random()
                    println(randomNumber)
                    println("Gissa ett tal mellan 1 och 10")
                }
            } else {
                if (randomNumber > guessed) {
                    println("Högre! Gissa igen")
                } else if (randomNumber < guessed) {
                    println("Lägre! Gissa igen")
                }
            }
        } catch (e: NumberFormatException) {
            //println(e.printStackTrace())
            println("Inte ett giltigt tal, skriv in ett nytt nummer")
        } catch (e: Exception) {
            //Om någon annan exception skulle inträffa
            //println(e.printStackTrace())
            println("Inte ett giltigt tal, skriv in ett nytt nummer")
        }
    }
}

/*
Gör ett litet program där du väljer ut ett random värde mellan 1 och 10.
Låt användaren gissa talet
Skriv ut ”Högre” eller ”Lägre” tills användaren har gissat rätt.
Fråga sen användaren om hen vill spela igen
 */