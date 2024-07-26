fun main()
{

    val person: Person? = Person(Country("Eng"))

    println(person?.country?.code)

    val person2 = Person(null)

    println(person2?.country)
    
}

data class Person(val country: Country?)

data class Country(val code: String?)