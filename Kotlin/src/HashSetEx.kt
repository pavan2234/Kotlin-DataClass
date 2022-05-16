fun main() {
    val set = HashSet<Int>()
    set.add(1)
    set.add(2)
    set.add(3)
    var itr = set.iterator()
    while (itr.hasNext()) println(itr.next())

    val set2 = hashSetOf<Int>(2,3,5)
    for (a in set2) println(a)

    val set3:HashSet<Int> = hashSetOf(7,8,9)
    for (b in set3) println(b)
}