fun main()
{
    var mercedes = Mercedes()
    mercedes.getInfo()
}


open class Car(var brand: String){

    open fun getInfo(){

        println("${brand}")
    }
}

open class Mercedes: Car("Mercedes")
{
    override fun getInfo(){
        super.getInfo()
        println("Hızlıdır")
    }
}