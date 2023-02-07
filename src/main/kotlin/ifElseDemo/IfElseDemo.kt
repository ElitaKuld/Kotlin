package ifElseDemo

fun comparator(x : Int, y : Int) = if (x<y) "y är störst" else "x är störst"

fun main(){

    fun comparator2(x : Int, y : Int) = if (x<y) "y är störst" else "x är störst"
    println(comparator(12,22))
    println(comparator2(100,200))
}