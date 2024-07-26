fun main()
{
    var sayHello = SayHello()

    sayHello.hello()
}


interface SayHelloFirst
{
   fun hello() = println("Birinci interface")
}

interface SayHelloSecond
{
    fun hello() = println("İkinci interface")

}


class SayHello: SayHelloFirst, SayHelloSecond{

    override fun hello(){
        super<SayHelloFirst>.hello()
        super<SayHelloSecond>.hello()
    }
    
}