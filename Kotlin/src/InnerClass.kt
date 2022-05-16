class outerclas(){
    private var username = "This is the user line"
    inner class innerclass(){
        var line = "this is the public line"
        private var text = "Inside the inner class"
        fun call(){
         println("Function in a inner class")
            println("$username")
            println("$text")
        }
    }
}

fun main(args:Array<String>) {
    println(outerclas().innerclass().line)
    var obj = outerclas().innerclass()
    obj.call()
}