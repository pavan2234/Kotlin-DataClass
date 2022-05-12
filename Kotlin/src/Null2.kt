fun main() {
    var s:String = "Hello"
    //s =null
    //Here s is a nonnull variable so if comd will be false
    var len = if(s!=null) s.length else -1
    println(len)

    var a:String?="Hello there"
    a = null
    return if(a!=null) {
        println("a is not a nullvalue $a")
    } else {
        println("a is null value $a")
    }
}