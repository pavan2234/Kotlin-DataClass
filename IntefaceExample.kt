interface Employee1{
    var id:Int
    fun name():String
    fun area(){
        println("Uppal")
    }
}
class Implementing: Employee1 {
    override var id:Int=1869
    override fun name(): String {
        return "Pavan"
    }
}

fun main() {
    val obj = Implementing()
    println("Id = ${obj.id}")
    obj.area()
    println(obj.name())
}