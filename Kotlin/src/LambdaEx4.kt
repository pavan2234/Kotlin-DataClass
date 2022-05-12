var arr = arrayOf(1,-2,3,-4,5,-6,7,-8,-9)
fun main() {
    println(arr.filter { it>0 })
    println(arr.filter { item->item>0 })
}