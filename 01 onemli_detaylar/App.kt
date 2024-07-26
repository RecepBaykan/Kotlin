fun main()
{

   // ------------------------ Durum 1 ----------------------------------------//
    /*
        'var' yada 'val' ile tanımlanmayan constructer parametrelerini sınıflar arasında kalıtımda
        korumak için mutlaka parent yada child'da 'var' yada 'val' ile korunması gerekir.

    */

    var durum1Child = DurumChild("Recep")
    durum1Child.info()

   // ------------------------------------------------------------------------------//
}



// ------------------------ Durum 1 ----------------------------------------//
open class Durum1Parent(val name: String)
{
    open fun info()
    {
        println("Merhaba ${name}")
    }
}

class DurumChild(name: String): Durum1Parent(name)
{
    override fun info()
    {
        super.info()
    }
}


// ------------------------------------------------------------------------------//