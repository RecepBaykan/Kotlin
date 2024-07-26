fun main()
{
    var person = Person("recep", "baykan", -1)
    
    println("${person.name} ${person.surname} ${person.age}")
       
}




class Person(var name: String, var surname: String, var age: Int)
{
    init{

        name = name.capitalize()
        surname = surname.capitalize()

        if(age<0 || age>90)
        {
            age = 24
        }

    }
}