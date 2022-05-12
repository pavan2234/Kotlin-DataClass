fun main() {
    var a = intArrayOf(10,20,30,40,50,60,70,80,90)
    for (a1 in a) println(a1)
    a.set(0,0)
    for (a1 in a) println(a1)
    println(a.get(2))
    a[4]=500
    for (a1 in a) println(a1)


}