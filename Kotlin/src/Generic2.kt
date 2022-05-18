fun <T>printValue(list:ArrayList<T>){
    for (ele in list) println(ele)
}
fun main() {
    val stringList:ArrayList<String> = arrayListOf("Pavan","Prashanth","Ram","Ajay")
//    val s:String = stringList[0]
//    println("$s")
    printValue(stringList)
    val floatlist:ArrayList<Float> = arrayListOf(10.0f,5.0f,9.2f,5.3f,7.9f)
    printValue(floatlist)
    val intlist:ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9)
    printValue(intlist)
}