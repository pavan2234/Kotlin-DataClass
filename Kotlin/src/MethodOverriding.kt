open class Bird{
    open fun fly(){
        println("Bird is flying")
    }
}
class Parrot:Bird(){
    override fun fly(){
        super.fly()
        println("Peacock is flying")
    }
}
class Pegion:Bird(){
    override fun fly() {
        println("Pegion is flying")
    }
}

fun main() {
    val a = Parrot()
    a.fly()
    val b = Pegion()
    b.fly()
}