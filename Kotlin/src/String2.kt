fun main() {
    val str = "hello"
    val str1 = "hello"
    println(str==str1)
    println(str!=str1)

    val str2 = buildString { "Hello" }
    val str3 = buildString { "Hello" }
    println(str2===str3)
    println(str2!==str3)
}