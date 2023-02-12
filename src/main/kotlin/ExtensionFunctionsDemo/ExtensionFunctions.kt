package ExtensionFunctionsDemo

fun String.sayHi() = "Hi $this"

fun main(){
    val s = "Fava"
    println(s.sayHi())
    println("nisse".sayHi()) // man får skapa strängen direkt vid anrop av funktionen
}