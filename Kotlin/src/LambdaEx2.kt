val sum ={ a:Int,b:Int->
    val num = a+b
    num.toString()
}
fun main() {
    println(sum(5,9))
}