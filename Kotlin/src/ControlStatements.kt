import java.util.Scanner

fun main(args:Array<String>) {
    println("Please provide your school percentage")
    val read = Scanner(System.`in`)
    val a = read.nextInt()
    if(a>=90) println("You scored A+ grade with $a percentage")
    else if(a>=80) println("You scored A grade with $a percentage")
    else if(a>=70) println("You scored B+ grade with $a percentage")
    else if(a>=60) println("You scored B grade with $a percentage")
    else if(a>=45) println("You scored C grade with $a percentage")
    else println("Sorry you are Failed")
}