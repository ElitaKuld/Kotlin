package Övning_5a_ExtensionFunctions

fun Rectangle.getArea() = 2 * this.width + 2 * this.height
fun Rectangle.getCircumference() = this.width * this.height

fun main(){

    val rectangle = Rectangle(height = 10.0, width = 5.0) // named arguments exempel
    println(rectangle.getArea())
    println(rectangle.getCircumference())

}

/*
Skapa klassen Rectangle som har följande parametrar
• Bredd
• Höjd
Skapa extension functions till Rectangle som beräknar
• Area
• Omkrets
Gör ett huvudprogram där du
• Skapar en Rectangle
• Skriver ut area och omkrets som du beräknar i dina funktioner
 */