fun main() {
    val map:MutableMap<Int,String> = mutableMapOf()
    map.put(1,"map")
    map.put(2,"hashmap")
    map.put(3,"mutablemap")
    for (a in map.keys) println("$a is "+map.getValue(a))

    val map2:MutableMap<Int,String> = mutableMapOf<Int,String>()
    map2.put(1,"1")
    map2.put(2,"2")
    map2.put(3,"3")
    var itr = map2.asIterable()
    println(itr)

    var itr2 = map2.iterator()
    while (itr2.hasNext()) println(itr2.next())

    for (b in map2.keys) println(map2[b])

    println("----------------")
    map.putAll(map2)
    var itr3 = map.asIterable()
    println(itr3)

    println(map2.count())
}