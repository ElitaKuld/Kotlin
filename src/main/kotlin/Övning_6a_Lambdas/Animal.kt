package Övning_6a_Lambdas

class Animal (val type: String, val numberOfLegs : Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}