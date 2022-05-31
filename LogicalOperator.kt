fun main(args:Array<String>) {
    var a = 10
    var b = 20
    var c = 30

    var flag = true
    var result:Boolean
    result = (a<b && a<c)
    println(result)
    result = (a>b || a>c)
    println(result)
    result = !flag
    println(result)

}