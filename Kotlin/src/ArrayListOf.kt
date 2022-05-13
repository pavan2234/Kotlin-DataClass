fun main() {
    var lst = arrayListOf<Int>(1,2,3,1,2)
    for (a in lst ) println(a)
    var lst2:ArrayList<Int> = arrayListOf(1,2,3)
    for (b in lst2) println(b)
    var lst3 = arrayListOf<Int>(10)
    lst3.add(1,1)
    lst3.addAll(lst)
    for (c in lst3) println(c)
}