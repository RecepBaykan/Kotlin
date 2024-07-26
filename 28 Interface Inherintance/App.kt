fun main()
{
    var kus = Kus()

    kus.sesCikar()
    kus.yemekYe()
    kus.hareketEt()
}


interface Ises{

    fun sesCikar()
}

interface Ihareket{

    fun hareketEt()
}

interface Iyemek{

    fun yemekYe()
}

interface ITepki: Ises, Ihareket, Iyemek{

    override fun sesCikar() = println("ses çıkardı")
}


class Kus: ITepki{

    override fun hareketEt() = println("Kuş uçtu")
    override fun yemekYe() = println("Kuş yem yedi")
}