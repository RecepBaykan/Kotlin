fun main()
{




    /*
        Kurallar: 
        1: Soyut sınıftan nesne türetilemez.
        2: Sınıfın içersinde soyut metodu varsa sınıfta soyut olmalıdır.
        3: Soyut sınıflar, diğer soyut sınıflar ile kalıtıma dahil olabilir, b
        bu nedenle soyut metotlar, alt sınıflarda ovveride edilmesi gerekmez.
    
    */

    var teacher = Teacher("Ali")

    teacher.info("Öğretmen")

    var childTeacher = ChildTeacher("Veli")
    childTeacher.info("PC")
}



abstract class Person(val name: String)
{
    abstract fun info(isTanimi: String)
}


class Teacher(name: String): Person(name)
{
    override fun info(isTanimi: String)
    {
        println("$name adlı kişi ${isTanimi}")
    }
}

abstract class ChildPerson(name: String): Person(name){
    

}

class ChildTeacher(name: String): ChildPerson(name)
{
    override fun info(isTanimi: String)
    {
        println("$name adlı kişi ${isTanimi}")
    }
}



