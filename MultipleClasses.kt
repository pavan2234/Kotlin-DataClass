open class Vehicles{
    constructor(company:String,model:String){
        println("$company")
        println("$model")
    }
    constructor(company:String,model:String,CC:Int){
        println("$company")
        println("$model")
        println("$CC")
    }
}
class RegistrationDetails:Vehicles{
    constructor(company:String,model:String):super(company, model){
        println("$company")
        println("$model")
    }
    constructor(company:String,model:String,CC:Int):super(company, model, CC){
        println("$company")
        println("$model")
        println("$CC")
    }
}

fun main() {
    var a = RegistrationDetails("Audi","2000")
    var b = RegistrationDetails("Audi","2000",1500)
}