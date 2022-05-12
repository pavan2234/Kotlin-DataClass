val sum1 = {a:Int,b:Int->a+b}
val sum2:(Int,Int)->Int={a,b->a+b} //directly without declaring the variables
fun main() {
    println(sum1(5,5))
    println(sum2(5,8))
}