class MultipleSecondary {
    constructor(name:String,Id:Int):this(name,Id,"Pavan@2234"){
        println("$name")
        println("$Id")
    }
    constructor(name: String,Id: Int,password:String){
        println("$name")
        println("$Id")
        println("$password")
    }
}

fun main() {
    var o = MultipleSecondary("Pavan",1869)
}