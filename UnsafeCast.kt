fun main() {
    val s:String="Here is the unsafe cast example"
    val b: String = s as String
    println(b)

    val x:Any? ="Here is the example of safe cast"
    val y:String? = x as? String
    println(y
    )
}