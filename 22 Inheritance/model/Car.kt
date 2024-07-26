package model

open class Car(var brand: String="", var model: String="", var price: Double=0.0){

    init{
        println("${brand} ${model} $${price}")
    }

    open fun changePrice(price: Double)
    {
        this.price = price
    }

    open fun getInfo()
    {
        println("${brand} ${model} $${price}")
    }

}