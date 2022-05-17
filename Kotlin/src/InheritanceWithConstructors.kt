open class CarCompany(name:String,area:String){
    init {
        println("Company is $name")
        println("Located at $area")
    }
}
class Sports(name: String,area: String,type:String,cost:String):CarCompany(name,area){
    init {
        println("The type of car is $type and price is $cost")
    }
    fun call(){
        println("This is a sports car")
    }
}
class Classic(name: String,area: String,type:String,cost:String):CarCompany(name,area){
    init {
        println("car is a $type type and the price is $cost")
    }
    fun call(){
        println("This is a classic model car")
    }
}

fun main() {
    val a = Sports("Ferrari","London","Sports","2Cr")
    a.call()
    val b = Classic("BMW","India","Classic","1Cr")
    b.call()
}