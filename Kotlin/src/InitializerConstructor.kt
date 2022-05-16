class InitializerConstructor (name:String,Id:Int){
    var nname:String
    var Iid:Int
    init {
        nname=name
        Iid =Id
        println("$nname")
        println("$Iid")
    }
}

fun main(args:Array<String>) {
    val oibj = InitializerConstructor("Pavan",1869)

}