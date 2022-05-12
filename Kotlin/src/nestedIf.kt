import java.util.Scanner

fun main(arsg:Array<String>) {
    println("Please provide your two subject marks")
    var r = Scanner(System.`in`)
    var a = r.nextInt()
    var b = r.nextInt()
    if (a in 50..100){
        if (b in 50..100){
            println("You qualified for the next test")
        }else println("$b is not up to the mark")
    }else println("$a is not up to the mark")

}