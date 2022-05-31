import java.util.Scanner

fun main(args:Array<String>) {
//    var i = 0
//    while (i<=5){
//        println(i)
//        i++
//    }
    println("Enter your score")
    var read = Scanner(System.`in`)
    var a = read.nextInt()
    while (a in 90..100){
        println("Scored A+ with $a")
        break
    }
}