fun main()
{
    var araba = Car("Mercedes", "X12", 11.990)

    println("${araba.marka}")

    println(araba.let{it})
    
}