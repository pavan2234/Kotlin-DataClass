open class Vehicle{
    open fun run(){
        println("Vehicle")
    }
}
abstract class Honda:Vehicle(){
    abstract override fun run()
}
class City:Honda(){
    override fun run(){
        println("Honda is running")
    }
}

fun main() {
    val car = Vehicle()
    car.run()
    val city = City()
    city.run()
}