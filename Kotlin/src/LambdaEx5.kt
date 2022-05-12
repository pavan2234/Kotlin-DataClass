val ele = fun(num:Int): String {
    if (num % 2 == 0 && num < 0) {
        return "Num is even and negative"
    } else if (num % 2 != 0 && num > 0) {
        return "Num is odd and positive"
    }else if (num % 2 == 0 && num > 0) {
        return "Num is even and positive"
    } else if (num % 2 != 0 && num < 0) {
        return "Num is odd and negative"
    }else{
        return "invalid"
    }
}
fun main() {
    val result = ele(112)
    println(result)
}