abstract class Car{
    abstract fun run()
}
class Company:Car(){
    override fun run() {
        println("Car")
    }
}

fun main() {
    val a = Company()
    a.run()
}