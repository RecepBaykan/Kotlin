fun main(){

    /*
        filter fonksiyonu bir süzgeçtir.
        Listedeki verileri, başka bir listeye atarken yada aynı liste üzerinde, verileri süzer, 
        süzülen veriler belirtilen listeye eklenir, var olan verileri silinir.
        Çok önemli bir özelliktir

        Bu listenin türü şunlar olamlıdır;
        Stringler, diziler, listeler

        kullanımı

        var list = arrayOf(3, 4, 5, 6, 7,10,1, 45)
        list = list.filter()
    
     */

    // String'teki Boşlukları silme örneği
    var islem = "3 + 4+2*3 / (4)"
    
    islem = islem.filter { it != ' '}

    print(islem)

    // Listedeki elemanları 10'da küçük yapmak
    var list = listOf(4, 5, 6,1,3,4234,12,42,443,12,55,3,2,32)
    list = list.filter{it < 10}



    for(i in list){
        println(i)
    }



    
}