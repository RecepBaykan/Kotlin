fun main()
{
    var araba = Mercedes()
    araba.info()
}



open class Car(){

    open fun info(){
        println("Bu bir araba")
    }
}


class Mercedes:Car(){

    override fun info(){
        println("Mercedes araba")
    }
}