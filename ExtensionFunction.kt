class Student{
    fun isPassed(mark:Int):Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark:Int):Boolean{ //Here fun defined is a type of Extension Function
    return mark>90
}
fun main() {
    val s = Student()
    println(s.isPassed(40))
    println(s.isExcellent(50))
}