fun main() {
    var a = arrayOf(10,20,30,40,50,60,70,80,90)
    var b = arrayOf(1,0,45,3)
    try {
        for (i in a.indices) {
            try {
              println(a[i].toString()+"/"+b[i]+"is--"+a[i]/b[i])
            } catch (e: Exception) {
                println("Cant be divided by zero")
            }
        }
    }catch (e:Exception){
        println("Element not found")
    }
}