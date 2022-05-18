class MyClass {
    companion object {
        fun create():String{
            return "calls create method of companion object"
        }
    }
}
fun main(args: Array<String>){
    println( MyClass.create())
}