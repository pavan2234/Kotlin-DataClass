fun main() {
    val arraylist = ArrayList<String>()
    arraylist.add("pavan")
    arraylist.add("Ram")
    arraylist.add("mohan")
    for (el in arraylist) println(el)
    var itr = arraylist.iterator()
    while (itr.hasNext()) println(itr.next())

    val lst2 = ArrayList<String>(2)
    lst2.add("A")
    lst2.add("B")
    lst2.add("C")
    for (a in lst2) println(a)

    val lst3:MutableList<String> = mutableListOf()
    lst3.add("A")
    lst3.add("B")
    lst3.add("C")
    arraylist.addAll(lst3)
    for (el in arraylist) println(el)
}