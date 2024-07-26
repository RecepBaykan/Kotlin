fun main(){

/*
    let{ } fonksiyonu, değişkenin null olup olmadığını kontrol eden bir yapıdır.

    let{
        -> Bu kısımda değişken null değilse çalışacak parametreler vardır
    }?: -> Bu kısımda değişken null değilse çalışacak parametreler varıdr
 */

// Örnek


val person = Person(null)

person.name?.let{

    println("Bu değişken null değildr")

}?: println("Bu değişken nulldur")

var sayi = 4

sayi?.let{
    println("Bu sayı null değildir")
}?: println("Bu sayı nulldur")


// let metodu ile, bir değişkeni herhangi bir türde değişken atamak da mümküdür.

/*

    var sayi = degisken.let{

        ...
        ...
        ...
        int // string // double ...
    }?: int // string // double ...
 */

var yeniSayi = sayi?.let{
    println("önceki sayi değeri $it")
    sayi + 4; // int döndürür
    
}?: 0

println("yeni sayi: ${yeniSayi}")
}


class Person(var name: String?)