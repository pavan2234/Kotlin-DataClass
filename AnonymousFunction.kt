fun main() {
    var method = { println("method is called") }
    method() //here we didnt have method but it is taking
    method.invoke() //because here method is anonymous 
}
