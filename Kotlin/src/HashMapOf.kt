fun main() {
    val map = hashMapOf<Int,String>()
    map.put(1,"One")
    for (a in map.keys) println(map.getValue(a))
    println(map)

    val map2:HashMap<Int,String> = hashMapOf(4 to "ramesh")
    map2.put(1,"Pavan")
    map2.put(2,"Ram")
    map2.put(3,"Rahul")
    var itr = map2.asIterable()
    println(itr)

    println( map2.get(1))
    println(map2.containsKey(1))
    println(map2.containsValue("Pavan"))
    println(map2.clear())
    var itr1 = map2.asIterable()
    println(itr1)




}