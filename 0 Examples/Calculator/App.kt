import model.*
import controller.*

fun main()
{
    var islemler: String = "4+4+5"
    var calculator: Calculator = Calculator()
    var calculatorController: CalculatorController = CalculatorController(calculator, islemler)

    calculatorController.work()
    println("Result: " + calculatorController.calculator.number1)



}