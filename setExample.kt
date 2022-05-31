fun main() {//immutable
    val set = setOf<Int>(1,21,2,1,2,1)//prints only single time duplicates not allowed
    for (a in set) println(a)
    var b = set.iterator()
    while (b.hasNext()) println(b.next())

    val set2:Set<Int> = setOf(2,4,6,8)
    for (c in set2) println(c)

    val set3:Set<Int> = setOf(9,7,0,3,5,6,2,2,3,4)
    var d=set3.iterator()
    while (d.hasNext()) println(d.next())

}