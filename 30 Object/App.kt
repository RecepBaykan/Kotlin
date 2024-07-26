fun main()
{

    // Object nesnesi, kotlin içinde her bloktan ulaşabileceğimiz, kullanışlı bir yapıdır
    /*
        a: object nesnesini türetmeden, tüm scoppların içinde metotlarını ve fonksiyonlarını
        çağırabiliriz.
        b: Ayırca tüm değişkenlerini de değiştirebilriiz

        Örnek kullanımlar

        var degisken = Obje.degisken -> Obje nesnesinin değişkeni, degisken adlı degiskene atar
        println(Obje.degisken) -> Obje nesnesi içinde değişkeni yazdırır

        Obje.metot()  -> Obje nesnesinde bulunan dönüşümsüz/Unity metotu çağırır
        
        var degisken = obje.degisken() -> Obje içindeki dönüşümlü metodu, degiskene aktarır
        println(Obje.degisken()) -> Obje iöindeki dönüşümlü metodu yazdırır.
        
       
        
    */

    // a: 
    Hesap.metot()
    println(Hesap.topla(4,2))
    println(Hesap.bilgi)

    // b:

    Hesap.bilgi = "Bilgi değişti"
    println(Hesap.bilgi)
}



object Hesap
{

    var bilgi = "Bu bir bilgi"
    fun metot() = println("Metot çağırdın")
    fun topla(a: Int, b: Int): Int = a + b
}