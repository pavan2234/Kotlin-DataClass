import java.util.Scanner

fun main(args:Array<String>) {
    println("Please provide your rating")
    var read = Scanner(System.`in`)
    var rating = read.nextInt()
    when(rating){
        1-> println("You have given $rating rating")
        2-> println("You have given $rating rating")
        3-> println("You have given $rating rating")
        4-> println("You have given $rating rating")
        5-> println("You have given $rating rating")
        else->println("Rate from 1 to 5 only")
    }
}