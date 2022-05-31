abstract class Bank{
    abstract fun simpleInterest(p:Int,r:Double,t:Int):Double
}
class SBI: Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
       return (p*r*t)/100
    }
}
class Union:Bank(){
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100
    }
}

fun main() {
    val a = SBI().simpleInterest(1000,5.3,2)
    println(a)
    val b = Union().simpleInterest(1000,5.6,4)
    println(b)
}