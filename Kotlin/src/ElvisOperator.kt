fun main() {
    var a:String?=null
    var b:String?="Can also be modified to null"
    println(a?.length?:-1)
    println(b?.length?:-1)
}