fun main()
{
    var name: String = "John"

    if(name != null)
    {
        println("Hayır null değil")
    }

    name.let{ println(it)}

    var dataClass: DataClass = DataClass()

    dataClass.let{
        it.name = "John"
        it.surName = "Stephen"
        println("${it.name} ${it.surName}")
    }

    println(dataClass.name)
}




class DataClass{

    var name: String = ""
    var surName: String =""
}