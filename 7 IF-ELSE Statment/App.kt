fun main()
{
    println("1. Durum;")
    if(40 > 30)
    {
        println("yes")
    }

    println("2. Durum;")
    if(40<30){
        println("yes")
    }else{
        println("no")
    }

    println("3. Durum;")
    if(10 > 5) println("yes") else println("no")

    println("4. durum;")
    
    var a: Int = 4
    var b: Int = 3

    var c: Int = if(a > 5) {a} else {b}

    println(c)
}