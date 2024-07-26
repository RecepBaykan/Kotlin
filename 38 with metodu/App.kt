fun main(){

    /*

        Kullanımı apply gibi olan, sınıfların nesnelerini yada fonskiyonularını
        tekrar etmeden kullanmaya olanak sağlayan yapıladır.

        Kullanımı

        var name = "Ali"
        with(name){
            
            reverse()
            split()
        }
    
     */


    var person = Person("Recep", "Baykan", 26)

    with(person){

        name = "Jupiter"
        surname = "Sun"
        age = 1000
        yazdir()
    }
}


class Person(var name: String, var surname: String, var age: Int){

    fun yazdir(){
        println("$name $surname $age")
    }
}