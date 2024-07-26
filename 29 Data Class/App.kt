fun main()
{
    var person = Person("John", "Stephen")

    
    person.component1() // String değerdir. 1. paremetredir
    person.component2() // String değerdir. 2. parametredir
    /*
        person.component3, 4, 5 -> String değerdir 3, 4, 5
    
    */

    var component1: String = person.component1()
    var component2: String = person.component2()
    /*
        var component 3, 4 ,5 : String = person.component 3, 4, 5
    */

    println("$component1 , $component2")

    /*
        copy metodu, aynı türdeki dataClass'ı kopyalamaya yarar
        Eğer paremetreleri var ise, paremetre sırasına göre dataClass nesneleri değişererk
        kopyalanır

    */

    var person2 = person.copy()
    var person3 = person2.copy("Kral")
    var person4 = person3.copy("AUX")

    // 1. copy
    println("${person2.name} , ${person2.surname}")

    //2. copy
    println("$person3")

    //3. copy
    println("$person4")
    
    
    
    /*
    
        toString() => Propertlileri hiç bir işlem yapmadan stringe dönüştürür
        

    */

    println("${person.toString()}")

    /*

        equals() => nesneler eşit mi değil mi diye kullanır
    
    */

    println("Person ile Person 1 eşit mi?: ${person.equals(person2)}")
    println("Person 3 ile Person 4 eşit mi?: ${person3.equals(person4)}")

    /*
    
        hasCode() => nesneleri benzersiz yapmak için kullanılır ama doğrudan benzersiz olmaz her nesne.
        Özellikle parametreleri aynı olan nesneler, aynı hash kodu üretir

    
    */

    println("${person.hashCode()}")
    println("${person2.hashCode()}")
    println("${person3.hashCode()}")




}

data class Person(var name: String, var surname: String)