fun main()
{

    hesapla(Gun.PAZARTESI)
    hesapla(Gun.SALI)
    hesapla(Gun.PERSEMBE)

    println("${Renk.KIRMIZI}")
    println("${Renk.PEMBE.deger}")
}


fun hesapla(gun: Gun){

    when(gun){

        Gun.PAZARTESI -> println("Bugün pazartesi")
        Gun.SALI -> println("Bugün Salı")
        else -> println("Bugün ne salı ne çaşamba")
    }

}



enum class Gun{

    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESİ, PAZAR

}

enum class Renk(val deger: Int){

    KIRMIZI(1),
    MAVI(2),
    PEMBE(3),
    SARI(4),
    YESIL(5)
}