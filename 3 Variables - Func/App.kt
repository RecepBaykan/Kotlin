fun main()
{

    //Numeric func.

    var intValue: Int = 1;
    //inc() metodu, sayıları bir artırır. int, double, float ve benzeri sayılal türler
    println("Integer Increment metot inc(), old value: ${intValue}")
    intValue = intValue.inc()
    var doubleValue:Double = 1.4
    doubleValue = doubleValue.inc()

    println("Integer new value ${intValue}")
    println("Double new value ${doubleValue}")

    // minus(sayı) metodu, sayılardan sayı parametresini çıkarır
    println("Integer Minus metot minus(), old value${intValue}")
    intValue = intValue.minus(-4)
    doubleValue = doubleValue.minus(3.3232)
    println("Integer new value ${intValue}")
    println("Double new value ${doubleValue}")

    // Casting (dönüştürme) işlemler
    println("Casting")
    var floatValue: Float = 4.42f
    
    intValue = floatValue.toInt() // Float'ı integer'a dönüştürür.
    doubleValue = floatValue.toDouble() // Float'ı double'a dönüştürür.
    var stringValue: String = floatValue.toString() // Float'ı String'e dönüştürür.
    var charValue: Char = floatValue.toChar() // Float'ı char'a dönüştürür.

    println("Integer value: ${intValue}")
    println("Double value: ${doubleValue}")
    println("Float value: ${floatValue}")
    println("String value: ${stringValue}")
    println("Char value:${charValue}")


    
}