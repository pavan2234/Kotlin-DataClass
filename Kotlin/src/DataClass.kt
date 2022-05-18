data class Product(var name:String,var price:Int,var rating:Int)

fun main() {
    val p = Product("Chocolate",50,3)
    println(p)
}
//class Product(var name:String,var price:Int,var rating:Int)
//
//fun main() {
//    val p = Product("Chocolate",50,3)
//    println(p)
//}
//The above code give the hashcode output Because it is not a data class