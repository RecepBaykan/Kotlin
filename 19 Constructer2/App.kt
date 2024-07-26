fun main()
{

    var person = Person("recep")
    println("${person.surnameInstance}")


}


class Person(var name: String?, var surname: String? = null, var age: Int = 24)
{
    var surnameInstance = surname
}   