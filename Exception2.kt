fun main() {
    val result = getNumber("10")
    println(result)
}
fun getNumber(str:String):Int{
    return try {
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
        0
    }
}