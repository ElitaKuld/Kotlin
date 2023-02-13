package Övning_6d_Lambdas

class Animal (var type: String, var numberOfLegs : Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}