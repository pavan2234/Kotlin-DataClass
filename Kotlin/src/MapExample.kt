fun main() {
    val map2:Map<Int,String> = mapOf(1 to "One",2 to "Two",3 to "Three")
    for (c in map2.keys) println("Key $c is ${map2.getValue(c)}")

    for (c2 in map2.keys) println("$c2 is "+map2[c2])

    val map = mapOf(1 to "pavan",2 to "rahul",3 to "prash")
    for (a in map) println(a)

    for (b in map.keys) println(map[b])
    var itr = map.asIterable()
    println(itr)

    var itr2=map.iterator()
    while (itr2.hasNext()) println(itr2.next())

    val map3 = mapOf<Int,Int>(1 to 1819,2 to 1820,3 to 1821)
    for (a3 in map3.keys) println(map3.getValue(a3))
    println(map3.containsKey(1))
    println(map3.contains(2))
    println(map3.containsValue(1890))
    println(map3.get(1))
    println(map3[1])
    println(map3.getOrDefault(1,1892))
    println(map3.minus(1))
    println(map3.plus(Pair(4,1822)))

}