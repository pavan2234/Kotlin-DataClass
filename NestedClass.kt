class outerclass{
    private var name: String = "Pavan"
    class nestedclass{
    var description:String ="This is the code inside nested class"
        private var id:Int = 101
        fun foo(){
            println("$id")
        }
    }
}
fun main(args:Array<String>) {
    println(outerclass.nestedclass().description)
    var obj = outerclass.nestedclass()
    obj.foo()
}