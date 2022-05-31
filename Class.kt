class Account{
    var acc_no:Int=0
    var name:String=""
    var amount:Float=0f
    fun insert(ac:Int,n:String,am:Float){
        acc_no = ac
        name = n
        amount = am
        println("Account no $acc_no,Name is $n,Amount is $am")
    }
}
fun deposit(){

}
fun withdran(){

}
fun checkbalance(){

}
fun main(args:Array<String>) {
    Account()
    var acc = Account()
    acc.insert(624953074,"Pavan",100.0f)
    println("${acc.name}")
}