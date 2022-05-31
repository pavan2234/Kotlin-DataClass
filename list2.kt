import kotlin.contracts.Effect

fun main() {
    var lis:List<Any> = listOf(1,2,3,4,5,6,7,"Ab","Bc","Cd","Ef")
    var lis1:List<Any> = listOf(1,5,6,7,"Cd","Ef")
    for (el in lis) print(el)

    var b = lis.contains(1)
    println(b)
    var c = lis.containsAll(lis1)
    println(c)
    var d = lis1.containsAll(lis)
    println(d)
    println(lis.get(0))
    println(lis1[2])
    println(lis.indexOf("Ab"))
    println(lis.isEmpty())
    println(lis.dropLast(1))
    println(lis.drop(1))
    println(lis.lastIndexOf("Ef"))
}