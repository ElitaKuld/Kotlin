package HögreOrdningensFunktionerDemo

// Kod från Sigruns video om högre ordningens funktioner

fun main(){

    fun repeat1(times: Int, action: () -> Unit){ // utan inparametrar
        for (i in 0 until times){
            action()
        }
    }


    fun repeat2(times: Int, action: (Int)-> Unit){ // med inparameter
        for (i in 0 until times){
            action(i)
        }
    }

    repeat1(5){println("hej")}
    repeat1(2, {println("då")})

    repeat2(3){i -> println("hej $i")}

    val f = {println("valtest")} // man kan skicka in en variabel
    repeat1(5, f)

    fun funTest() = println("valtest2") // skicka in en funktion
    repeat1(5, {funTest()})
    repeat1(5) {funTest()}
    repeat1(5, ::funTest) // ett alternativt sätt att skicka in en funktion
}

/*

 */