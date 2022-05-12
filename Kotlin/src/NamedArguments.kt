fun line(symbol:String="+",n:Int=5){
    for (i in 1..n){
        print(symbol)
    }
}
fun main(args:Array<String>) {
    println("Here again I called the argument and assigned the value\n" +
            "It doesn't take the default value")
    line(n=10)/*Here again I called the argument and assigned the value
    It doesn't take the default value */
}