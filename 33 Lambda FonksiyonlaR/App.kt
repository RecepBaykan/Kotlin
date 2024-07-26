fun main(){

    println(islem(3,4, "*"))
    merhaba()
}


val islem = {a: Int, b: Int, c: String ->

    when(c){
        
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> 0
    }
}


val merhaba = { println("merhaba")}