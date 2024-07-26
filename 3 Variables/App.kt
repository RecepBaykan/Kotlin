fun main(){

    

    // Örnek değişken tanımlama

    var exampleVariable = "This is Example Variable"
    println(exampleVariable)

   
    
    // Değişken Tipleri

    // Byte 1 Byte -> -128, 127
    
    var byteVariable: Byte = -3
    println("Byte Variable: " + byteVariable)

    // Short Variable 2 Byte -> -32768, 32767

    var shortVariable: Short = 3233
    println("Short Variable: " + shortVariable)

    // Integer 4 byte -> -2^31, (2^31)-1

    var integerValue: Int = 13321
    println("Integer Variable: " + integerValue)

    // Long 8 Byte -> -2^63, 2^63-1

    var longVariable: Long = 44433322
    println("Long Variable: " + longVariable)

    // Float 4 Byte -> ondalık değerler

    var floatVariable: Float = 3.44f
    println("Float Variable: " + floatVariable)

    // Double 8 Byte -> ondalık değerler

    var doubleVariable: Double = 0.43444
    println("Double Variable: " + doubleVariable)

    // Char -> 2 Byte -> karakterler

    var charValue: Char = 'd'
    println("Char Variable: " + charValue)

    // String

    var stringVariable: String = "This is String Value"
    println("String Variable: " + stringVariable)

    // Boolean 1 bit -> 0, 1

    var booleanVariable: Boolean = false
    println("Boolean Variable: " + booleanVariable)
    
}

