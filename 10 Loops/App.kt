fun main()
{
    // For döngüsü

    // Basitçe kullanım
    println("1 to 10")
    for(i in 1..10)
    {
        println("${i}. merhaba")
    }
    println("10 to 1")
    for(i in 10.downTo(1))
    {
        println("${i}. merhaba") 
    }

    println("1 to 10 step 2")
    for(i in 1.rangeTo(10) step 2)
    {
        println("${i}. merhaba")
    }
    println("10 to 1 step 3")
    for(i in 10.downTo(1) step 3)
    {
        println("${i}. merhaba")
    }

    // Belli bir değişken sayısına kadar

    println("Int türünde adım sayısı")
    var stepInt: Int = 40
    for(i in 1.rangeTo(stepInt) step 4)
    {
         println("merhaba ${i}")
    }

    // Foreach kullanımı
    println("foreach kullanımı")
    var arrayString = arrayOf("Ali" ,"ata", "bak")
    

    for(string: String in arrayString)
    {
        print("${string} ")
    }
    println("")
    println("while kullanımı")

    var a: Int = 1
    while(a<6)
    {
        println("${a} merhaba")
        a++

    }

    

    
}