fun main()
{

    // Immutable List sadece read-only'dir.


    println("Immutable Listeler")
    println("List of metodu")
    var list = listOf<Int>(1,2,3,4,5)

    for(i in list)
    {
        print("${i} ")
    }


    println("")
    println("'list' listesini 3. indisinin değeri: ${list.get(3)}")


    println("mapOf metodu")

    var mapList = mapOf(1 to "x", 2 to "y", -1 to "zz")

    println(mapList)
    println(mapList.get(1))

    

    

}