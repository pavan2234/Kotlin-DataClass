fun main() {
    var a:String="Here a contains the string"
    if (a is String) println(a.length) else println("not a string")//"is" is a smart cast

    var b:String = "Here b is a string"
    if (b !is String) println("not a string") else println(b.length)
}