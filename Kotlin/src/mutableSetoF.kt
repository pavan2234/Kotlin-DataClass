fun main(args:Array<String>) {
    val set = mutableSetOf<Int>(1,2,3)
    set.add(4)
    for (a in set) println(a)

    val set2:MutableSet<Int> = mutableSetOf()
    set2.addAll(listOf(1,2,3,4,5,6))
    for (b in set2) println(b)
    var itr = set2.iterator()
    while (itr.hasNext()) println(itr.next())

    val set3:Set<Any> = mutableSetOf(2,4,6)//Readonly
    for (c in set3) println(c)


}