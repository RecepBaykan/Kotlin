fun main(){

    // String Fonksiyonları ve değişkenleri

    var stringObject: String = "Bu bir string objesi"
    

    stringObject.let{
        // lentgh: Int -> String objesinin uzunluğunu verir
        var bilgi: String = "length nesnesi"
        println("\u001B[32m${bilgi}\u001B[0m")
        
        println("${it.length}") // -> 20

        /*
            compareTo(string): Int -> İki string nesnesini karşılaştır
            Sonuçlar; parametre -> "b"
                    Negatif: String nesnesi, "b" stringinden alfabetik olarak önce gelir
                    sıfır: String nesnesi ile "b" nesnesi eşittir
                    Pozitif: String nesnesi, "b" stringnden alfabetik olarak sonra gelir
        */
        bilgi = "compareTo() metodu"
        println("\u001B[32m${bilgi}\u001B[0m") 
        
        println("${it.compareTo("Evet, o bir String nesnesi")}") // -3
        println("${it.compareTo("Ankara 06")}") // 1
        println("${it.compareTo("Bu bir string objesi")}") // 0

        // equals(String) yada == -> String objesini diğer stringler ile eşit değerli mi diye karşılaştırır
        /*
            true: string objesi, karşılaştırılan obje ile eşittir
            false: string objesi, karşılaştırılan obje ile eşit değildir
        */
        bilgi = "equals() metodu yada =="
        println("\u001B[32m${bilgi}\u001B[0m") 
        
        println("${it.equals("Ankara")}") // false
        println("${it.equals("Bu bir string objesi")}") // true
        println("${it == "Ankara"}") // false
        println("${it == "Bu bir string nesnesi"}") // true

        /*
            get(int) yada [int] -> String objesi bir dizi gibi olduğunda, karakterlere erişmeyi sağlar.
            Not: string karakterleri read-only idir. 
                string[4] = 'r' şeklinde bir değişim olmaz.

        */
        bilgi = "get(int) metodu yada [int]"
        println("\u001B[32m${bilgi}\u001B[0m") 
        
        println("${it.get(0)}") // B
        println("${it[4]}") // i

        /*
            subSequence(Int, Int) -> String içinde, seçilen aralıktaki yazıları alır

        */

        bilgi = "subSequence(Int, Int) metodu"
        println("\u001B[32m${bilgi}\u001B[0m") 

        println("${it.subSequence(4,16)}") //ir string ob

        /*
            indices nesnesi: String, aralığa çevirir
            Örnek:
                    "Ankara" -> 0..5
            for döngüsünde kullanılabilir
            for(i in string.indices)
        */
        bilgi = "indices nesnesi"
        println("\u001B[32m${bilgi}\u001B[0m") 
        
        println("${it.indices}") // 0..19

        /*
            lastIndex: Int -> String'i son indisini verir.
            Örnek: Ankara: 5.
            for döngüsünde kullanılabilir
            for(i in 0..string.lastIndex)
        */

        bilgi = "lastIndex nesnesi"
        println("\u001B[32m${bilgi}\u001B[0m") 
        
        println("${it.lastIndex}") // 19

        /*
            contains(String) -> string içinde string arar.
            true: string var
            false: string yok
        */
        bilgi = "contains(String) metodu"
        println("\u001B[32m${bilgi}\u001B[0m") 

        println("${it.contains("bir")}") // true
        
        
        /*
        
            capitalize() -> String'i büyük harfler başlatır
            örnek: ankara.capitalize() -> Ankara
        
        */
        
        bilgi = "capitalize() metodu"
        println("\u001B[32m${bilgi}\u001B[0m") 

        println("${it.capitalize()}") // Bu bir string objesi

        /*
            toUpperCase() -> String'teki tüm karakteri büyük yapar
            Örnek: ankara.toUpperCase() -> ANKARA

        */

        bilgi = "toUpperCase() metodu"
        println("\u001B[32m${bilgi}\u001B[0m") 

        println("${it.toUpperCase()}") // BU BİR STRİNG OBJESİ

         /*
            toUpperCase() -> String'teki tüm karakteri büyük yapar
            Örnek: ankara.toUpperCase() -> ANKARA

        */

        bilgi = "toLowerCase() metodu"
        println("\u001B[32m${bilgi}\u001B[0m") 

        println("${it.toLowerCase()}") // bu bir string nesnesi


        



    }

    
}