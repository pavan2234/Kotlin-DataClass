import java.util.Scanner

fun factorial(n:Int): Long {
    return if (n==1){
        n.toLong()
    } else{
        n*factorial(n-1)
    }
}
fun main(args:Array<String>) {
    println("Enter the value")
    var read = Scanner(System.`in`)
    var n = read.nextInt()
    var result=factorial(n)
    println(result)
}