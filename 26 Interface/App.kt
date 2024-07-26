fun main(){

    var car = Car("Mercedes", "x11")

    car.productCall("${car.product}")
    car.go()
    car.sell()

}




interface interfaceName{
    // properties
    // methods

}


class Car(var product: String, var model: String): ICar, ISatis{

    override var lastik: Int = 4
    override fun go(){
        println("$lastik lastiği olan araba harekett etti.")
    }

    override fun sell()
    {
        println("$model satıldı")
    }




}


interface ICar{
    
    var lastik: Int

    fun go()
    fun productCall(product: String) = println("${product} marka bir araba")

}

interface ISatis{

    fun sell()

}