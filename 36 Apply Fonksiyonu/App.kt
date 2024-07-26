fun main(){


    /*
    
        Apply fonkisyonu, sınıfların veya nesnelerin tamamlayıcı özelliklerini,
        sınıfları ve nesnleri yazmadan tamamlayamaya olanak sağlar.

        örnek

        var isim = "John"

        isim.apply{

            reverse()
            split()

        }
        gibi
    
     */


    var person = Person("Recep", "Baykan", 26)

    person.apply{

        name = "John"
        surname = "Stephen"
        age = 24
        println("$name $surname $age")
        dogumYili()

    }
    

}


class Person(var name: String, var surname: String, var age: Int){


    fun dogumYili()
    {
        println(2024 - age)
    }
}