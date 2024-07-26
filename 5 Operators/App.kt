fun main()
{

    // Atama operator -> =

    var stringValue: String
    stringValue = "This is String Value"
    println("String Value -> " + stringValue)

    // Aritmetik operatorler -> +, -, *, /

    var integerValue: Int
    integerValue = 40
    integerValue = integerValue - 20
    integerValue = integerValue + 244
    integerValue = integerValue / 4
    integerValue = integerValue * 2
    println("Integer Value -> " + integerValue)

    // İlişkisel Operator -> || = yada, && = ve

    var p: Boolean = true
    var q: Boolean = false

    println("1. durum: p n q -> " + (p && q))
    println("2. durum: p v q -> " + (p || q))

    // Mantıksal operatörler -> <, <=, >, >=, ==, !=

    var a: Int = 44
    var b: Int = 35

    println("a > b: " + (a > b))
    println("a => b: " + (a >= b))
    println("a < b: " + (a < b))
    println("a <= b: " + (a <= b))
    println("a = b: " + (a == b))
    println("a ! b: " + (a != b))

    // Birleştirme operatorü -> String + String

    var name: String = "John"
    var surName: String = "Stephen"
    var person = "${name} ${surName}"
    println("Person -> ${person}")


}