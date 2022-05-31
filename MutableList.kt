fun main() {
    var lst = mutableListOf<Int>(123,456,789,147,258,369,159,263,478,753,896,421)
    for (el in lst) println(el)

    var lst2:MutableList<String> = mutableListOf("This","is","the","mutable","list.")
    for (a in lst2) println(a)

    var lst3:MutableList<Any> = mutableListOf()
    lst3.add(1)
    lst3.add("pavan")
    lst3.add(1869)
    lst3.add(1,"A.Pavan")
    lst3.addAll(lst)
    for (b in lst3) println(b)


}