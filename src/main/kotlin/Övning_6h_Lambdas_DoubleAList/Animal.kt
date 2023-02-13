package Övning_6h_Lambdas_DoubleAList

class Animal (var type: String, var numberOfLegs : Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}