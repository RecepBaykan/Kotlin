fun main(){


    /*
    
    
        Liste içindeki verileri, anlık düzenleyeme yarayan yapıdır.
        String, diziler ve liste içinde kullanılabilir.
     */


    // Liste elemanları, 10'dan büyük ise 10'a bölsün ve listede düzenleme yapılsın

    var list = listOf(1, 10,34,2,3,4,55,5,12,3,42,22,7,8)
    
    list = list.map{if(it>10) it/10 else it}

    list.yazdir()
}


fun <T> List<T>.yazdir(){

    for( i in this){
        println(i)
    }
}
