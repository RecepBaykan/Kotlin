fun main()
{


    var intValue: Int = 1

    when
    {
        intValue<-1 -> println("5'ten küçük")
        intValue>4 -> println("4'ten büyük")
        intValue == 3 -> {

            intValue = 6
            println("intValue değeri ${intValue}")
        }

        intValue >4  -> println("evet")
        
        else -> println("Hiç bir değer yok")
        
    }

    // Hangi koşul ilk sağlanırsa, onu kullanır

    when(intValue){

        in 1..10 -> println("yes")
        !in 1..100 -> println("no")
    }

}