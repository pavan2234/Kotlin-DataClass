fun main() {
    var number = 100000.toLong()
    var tota = hugetotal(number,0)
    println("The sum for $number is $tota")
}
tailrec fun hugetotal(n:Long,semiresul:Long):Long{
    return if (n<=0){
        semiresul
    }else{
        hugetotal((n-1),n+semiresul)
    }
}