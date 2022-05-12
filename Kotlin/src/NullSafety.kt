fun main() {
    var s:String? ="Hello" //here ? defines the nullability which accepts the null values
    s = null
    if (s!=null) println(s.length) else println("else")
}