fun main() {
    var lst = listOf<Any>(1,2,3,"a","b","c")
    for (el in lst) print(el)
    var lst2:List<Int> = listOf(1,2,3,4,5,6,4)
    for (a in lst2) print(a)
    var lst3:List<String> = listOf("A","B","C","D","E")
    for (b in lst3) print(b)
    for (inx in 0..lst3.size-1) print(lst3[inx])
    
}