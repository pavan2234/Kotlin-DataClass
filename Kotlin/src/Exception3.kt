import java.util.Scanner

fun divide(a:Int, b:Int):Any{
    return try {
       var c = a/b
        println(c)
    }catch (e:ArithmeticException){
        println("can,t be divided by zero")
    }
}
fun main() {
    val read = Scanner(System.`in`)
    println("A/B")
    println("Enter a value")
    val a = read.nextInt()
    println("Enter b value")
    val b = read.nextInt()
   divide(a,b)
}