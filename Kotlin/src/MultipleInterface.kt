interface Employ{
    fun name():String
    fun id():Int
    fun locality():String
}
interface Employ2{
    fun experience():Int
}
class Calling:Employ,Employ2{
    override fun name(): String {
        return "Pavan"
    }

    override fun id(): Int {
        return 1869
    }

    override fun locality(): String {
        return "Uppal"
    }

    override fun experience(): Int {
        return 6
    }
}

fun main() {
    val obj = Calling()
    println(obj.name())
    println(obj.id())
    println(obj.experience())
    println(obj.locality())
}