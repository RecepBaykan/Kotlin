fun main(args: Array<String>) {
    

    callMe{

        println("Merhaba dünya")
    }

    merhaba("Recep"){

        println(it)
    }


    var array = arrayOf("30", "4" , "5" , "534")

    sirala(array){

        for (i in it) {
            println(i)
        }
    }
   
}

fun callMe(func: () -> Unit) // Unit türünde bir fonksiyon
{

    /*-
    
        -> callMe fonkisyonu içinde lambda fonksiyonu oluşturduk

     */
    func()

}


fun merhaba(name: String, func:(String) -> Unit){

    func(name)
}


fun sirala(array: Array<String>, func: (Array<String>) -> Unit)
{
    func(array)
}
