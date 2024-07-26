fun main()
{
    println("message() func. is working")
    message()

    println("string func. is working")
    println("${stringFun()}")

    println("string func. is ovverloading")
    println("${stringFun("John")}")

    println("Parametreli fonksiyon'a giriş")
    println("hello(name) is working")
    hello("John")

    // return yani tip döndüren fonksiyon

    var number: Int = sumWithFour(4)
    println("${number}")

    number = sum(12, 44)
    println("${number}")



    
}



fun message()
{
    println("Hello World! This a void func.")
}

/*

    fun message() = printşn("Hello world")

*/

fun stringFun():String = "Hello World!"

fun stringFun(name:String):String
{
    return "Hello ${name}"
} 


fun hello(name: String)
{
    println("Hello ${name}")
}


// Type fun

fun sumWithFour(_number: Int): Int
{
    return _number + 4;
} 

fun sum(number1: Int, number2: Int): Int = number1 + number2

