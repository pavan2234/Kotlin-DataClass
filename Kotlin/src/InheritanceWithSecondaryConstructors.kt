open class Labour(){
    constructor(name:String,age:String) : this() {
        println("parent constructor --- Name is $name age is $age")
    }
}
class Gender: Labour {
    constructor(name:String,age:String,gender:String):super(name,age){
        println("Child constructor--- Name is $name age is $age gender is $gender")
    }
}
fun main(){
    val obj = Gender("Pavan","22","Male")
}