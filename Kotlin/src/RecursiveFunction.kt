var count = 0
fun rep(){
    count++
    if (count<=5){
        println("Pavan $count")
        rep()
    }
}
fun main(args:Array<String>) {
    rep()
}