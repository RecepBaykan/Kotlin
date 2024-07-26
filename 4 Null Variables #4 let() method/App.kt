fun main()
{
    var list: List<String?> = listOf("Ali", null, "Veli", "Hatice", "Caner", null, null, "Soner")

    for(item in list)
    {
        print("${item} ")
    }

    // let() metodu

    var res = listOf<String?>()
    for(item in list)
    {
        item.let{res.plus(it)}
    }

       
    
    
}