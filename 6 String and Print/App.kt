fun main(){

    var person = Person()

    person.name = "John"
    person.surname = "Stephen"
    person.age = 26
    person.length = 1.63
    person.weight = 64.7

    println("${person.name} ${person.surname} is age ${person.age}. ${person.name} is len. ${person.length} and weig. is ${person.weight}.")

}


class Person{

    var name: String? = null
    var surname: String? = null
    var age: Byte? = null
    var length: Double? = null
    var weight: Double? = null


}