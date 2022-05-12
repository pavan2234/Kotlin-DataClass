fun border(symbol:String="*",n:Int=5){
    for (i in 1..n){
        print(symbol)
    }
}
fun main(args:Array<String>) {
    border()//here I didn't assign the values, but
            // it has taken the default assigned values
}