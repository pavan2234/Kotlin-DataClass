fun main() {
    val map:HashMap<Int,String> = HashMap<Int,String>()
    map.put(1,"pavan")
    map.put(2,"pava")
    map.put(3,"pav")
    map.put(4,"pa")
    for (a in map.keys) println("$a is"+map.getValue(a))

    val map2:HashMap<Int,String> = HashMap<Int,String>(2)
    map2[1] = "this"
    map2[2] = "is"
    map2[3] = "map"
    println(map2.replace(1,"This"))
    var itr = map2.asIterable()
    println(itr)
    var itr2 =map2.iterator()
    while (itr2.hasNext()) println(itr2.next())
    println(map2.remove(1))


}