fun main(){
    greetings()
    greetingsTo("Peter Parker")
    greetingsTo("Black Widow")
    greetingsToMexico()
    greetingsToMexico("Huamantla")
    println("El doble de 5 es: ${ duplicate(5)}")
    println("100 / 3 es ${ divide(100.0, 3.0)}")
    println(fullName("Lud", "Santi"))
    sayHello()
}
//Function without params and without return
fun greetings(){
    println("Greetings for everyone!")
}
//Function with params and without return
fun greetingsTo(name: String){
    println("Hello $name")
    println("Welcome!")
}

// Functions with params and return
// We must specify the data type
fun duplicate(num: Int): Int {
    return num * 2
}

fun fullName(firstName: String, lastName: String): String{
    return "$firstName $lastName"
}

fun divide(num1: Double, num2: Double): Double{
    return num1 / num2
}

// Specify DAta Type Unit as void

fun sayHello(): Unit{
    println("Hello")
}

// Functions With Default Values
fun greetingsToMexico(name: String = "Mexico"){
    println("Hello $name")
}