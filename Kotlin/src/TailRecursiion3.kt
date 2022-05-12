fun main(args:Array<String>) {
    var n = 5.toLong()
    var result = factorial1(n,1)
    println("The factorial of $n is $result")
}
tailrec fun factorial1(a: Long,run:Long):Long {
    return if (a<=1){
        run
    }else{
        factorial1((a-1),a*run)
    }
}
