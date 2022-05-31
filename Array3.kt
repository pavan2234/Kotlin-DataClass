fun main() {
    val a = Array(5){1}
    for (ele in a) println(ele)
    val b = arrayOf(1,2,3,1,3)
    for (bl in b) println(bl)
    val c = arrayOf(1,2,3,"a","s","d")
    for (cl in c) println(cl)
    val d = arrayOf<String>("A","B","C")
    for (dl in d) println(dl)
    val e = intArrayOf(1,2,3,4,5,6)
    for (el in e) println(el)
}