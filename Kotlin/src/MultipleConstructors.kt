class pavan(Area:String){
    constructor(name:String,Id:Int,Area: String):this(Area){
        println("The name is $name")
        println("The emply id is $Id")
        println("The Area is $Area")
    }
}

fun main() {
    var obj = pavan("Pavan",1869,"Boduppal")
}