fun main()
{
    var intArray = Array<Int>(5) {0}

    for(i in intArray)
    {
        println(i)
    }
    
    intArray= arrayOf(4,4,5,2)

    for(i in intArray)
    {
        println(i)
    }

    println(intArray[2])



}


