fun main() {
    validate(15)
}
fun validate(age:Int) {
    if (age<18){
        throw Exception("Under age")
    }
    else{
        println("Eligible for voting")
    }
}