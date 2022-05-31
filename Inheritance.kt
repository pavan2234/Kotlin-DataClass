open class Employee(name:String,age:Int,salary:Float){
    init {
        println("Name is $name")
        println("Age is $age")
        println("salary is $salary")
    }
}
class Developer(name:String,age:Int,salary:Float):Employee(name,age,salary){
    fun work(){
        println("He does the coding")
    }
}
class Tester(name:String,age:Int,salary:Float):Employee(name,age,salary){
    fun work(){
        println("He does the testing")
    }
}

fun main() {
    val obj = Developer("Pavan",22,12000f)
    obj.work()
    val ob = Tester("Sai",21,12000f)
    ob.work()
}