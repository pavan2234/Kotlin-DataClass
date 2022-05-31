fun calculate(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}
fun sum(a:Int,b:Int)=a+b
fun main() {
    val sumres = calculate(4,5,::sum)
    val mulres = calculate(4,5){a,b->a*b}
    println(sumres)
    println(mulres)
}