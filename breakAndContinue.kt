fun main() {
    for (i in 1..5){
            println("$i")
            if (i == 2) break
        }
    for (j in 1..5){
        for (k in 1..5){
            println("$j and $k")
            if (j == 5){
                continue
            }
        }
    }
}