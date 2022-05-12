//This program will leave a stackoverflow exception
fun main() {
    var result = total(100000)
    println(result)
}
fun total(n: Long):Long {
    return if (n<=1){
        n
    }else{
        n+total(n-1)
    }
}