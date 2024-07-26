fun main()
{
    var number: Int = 4.sum();
    println(number)

    var sayHello: String = "John".hello()

    println(sayHello)

    var intArray: Array<Int> = arrayOf(1,32,43,32,32,33,112,2,3,4)

    intArray = intArray.changeIndisValue(0,7)

    for(indis: Int in intArray)
    {
        print("${indis} ")
    }
}



fun Int.sum(): Int = this + 10

fun String.hello(): String = "${this} hello"


fun Array<Int>.changeIndisValue(x: Int, y: Int): Array<Int> {

    var temp: Int = this[x]
    this[x] = this[y]
    this[y] = temp

    return this

}