fun main() {
    try{
        var a = 20/0
    }catch (e:ArithmeticException){
        println(e)
    }finally {
        println("can't be divided")
    }
}