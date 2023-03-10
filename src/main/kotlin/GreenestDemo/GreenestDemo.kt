package GreenestDemo

// kod från Sigruns video om uppgiften Greenest

interface Feedable {
    fun feedMe() = 0.2
}

abstract class Plant(var height: Double, val name: String, val foodType: FoodType) : Feedable

class PalmTree(height: Double, name: String, foodType: FoodType) : Plant(height, name, foodType) {
    override fun feedMe() = 0.5 * height
}

class CarnivorousPlant(height: Double, name: String, foodType: FoodType) : Plant(height, name, foodType) {
    override fun feedMe() = 0.1 + 0.2 * height
}

class Cactus(height: Double, name: String, foodType: FoodType) : Plant(height, name, foodType)

enum class FoodType(val niceName: String) {
    PROTEINDRYCK("proteindryck"),
    MINERALVATTEN("mineralvatten"),
    KRANVATTEN("kranvatten")
}


val laura = PalmTree(500.0, "Laura", FoodType.KRANVATTEN)
val iggy = Cactus(20.0, "Iggy", FoodType.MINERALVATTEN)
val putte = PalmTree(100.0, "Putte", FoodType.KRANVATTEN)
val meatloaf = CarnivorousPlant(70.0, "Meatloaf", FoodType.PROTEINDRYCK)

val plantList = listOf(laura, iggy, putte, meatloaf)

fun main() {
    while (true) {
        println("Vilken växt ska få mat?")
        val input = readLine()
        val plant = plantList.filter { p -> p.name == input }.firstOrNull()
        if (plant != null) {
            println("${plant.name} ska få ${plant.feedMe()}  ${plant.foodType.niceName}")
        }
    }
}