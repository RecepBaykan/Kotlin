package controller

import model.*

class CalculatorController(val calculatorInstance: Calculator, val islemlerInstance: String)
{
    var calculator: Calculator = calculatorInstance
    var islemler: String = islemlerInstance
    var result: Double = 0.0
    var noEror:Boolean = false
    var harf: String = ""

    fun work()
    {
        // Hata kontroller
        erorCheck()

        if(noEror)
        {
            working()
        }else
        {
            println("erorCheck() hatalı")
        }
        
        
        
    }


    fun working()
    {
       for(i in 0..islemler.length-1)
       {
            var harf = islemler[i].toString();
            if(harf.toDoubleOrNull() != null)
            {
                calculator.tempNumber+=harf
                if(i == islemler.length-1)
                {
                    calculator.number2 = calculator.tempNumber.toDouble()
                    isCalculate()
                }
                
            }else
            {
                if(calculator.tempNumber != "")
                {
                    if(calculator.number1 == 0.0)
                    {
                       
                        calculator.number1 = calculator.tempNumber.toDouble()
                        
                    }else
                    {
                        calculator.number2 = calculator.tempNumber.toDouble()
                        isCalculate()
                    }
                    calculator.tempNumber = ""; 
                }
                
                    
                    when(harf)
                    {
                        
                        " " -> continue
                        "+" , "-", "/", "*" -> calculator.islem = harf
                        else -> {
                            println("işlem tanımlı değil")
                            break
                        }
                    }

                    
                
            }
            
       }

       
    }


    fun isCalculate()
    {
       
       
        if(calculator.number1 != 0.0 && calculator.number2 != 0.0 && calculator.islem != "")
        {
            
           calculator.number1 = calculate()
           calculator.number2 = 0.0
           calculator.islem = ""

           

        }
    }
    
    fun erorCheck()
    {
        // 1. indis sayı değil mi?
        noEror = checkIndis(islemler[0].toString())
        // Sonuncu indis sayı değil mi?
        noEror = checkIndis(islemler[islemler.length-1].toString())

        

        
    }


    fun checkIndis(indis: String): Boolean
    {
        if(indis.toDoubleOrNull() != null)
        {
            return true
        }else
        {
            return false
        }
    }



    fun calculate(): Double
    {
        var result: Double = 0.0
        when(calculator.islem)
        {
            "+" -> result = calculator.number1 + calculator.number2
            "-" -> result = calculator.number1 - calculator.number2
            "*" -> result = calculator.number1 * calculator.number2
            "/" -> {
                    if(calculator.number2 == 0.0)
                    {
                        println("Payda sıfır olamaz")
                    }else
                    {
                        result = calculator.number1 / calculator.number2
                    }
                }
                
            else -> print("hatalı işlem")
        }
        
        return result
    }
}

