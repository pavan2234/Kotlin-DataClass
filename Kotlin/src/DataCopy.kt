data class Voterlist(var name:String,var id:Int)

fun main() {
    val a = Voterlist("Pavan",1002032)
    val b = Voterlist("ram",1002033)
    println(a)
    println(b)
    val c = b.copy()
    println(c)
    val d = b.copy(id = 1002031)
    println("${b.name} id is ${b.id}")
    println(d)
}