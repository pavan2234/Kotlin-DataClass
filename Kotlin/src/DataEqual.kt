data class Employe(var name:String,var id:Int)

fun main() {
    val a = Employe("Pavan",1869)
    val b = Employe("Pavan",1869)
    println(a)
    println(b)
    println(a==b)
    println(a.equals(b))
    println(a.hashCode())
    println(b.hashCode())
    println(a.hashCode()==b.hashCode())
}