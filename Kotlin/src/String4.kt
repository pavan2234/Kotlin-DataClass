fun main() {
    val a = "This is the kotlin program"
    println(a)
   var b = a.get(10)
    var c =a.plus("New line")
    println(b)
    println(c)
    for (i in a.indices) print(a[i]+" ")
}