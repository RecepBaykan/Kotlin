fun main(){

    var deneme = Deneme("selam")
    deneme.yazdir()

    yazdir(arrayOf("4" , "4", "3" , "5"))

}





class Deneme<T>(var deneme: T){

    fun yazdir(){
        println(deneme)
    }

}


fun <T> yazdir(deger: Array<T>)
{
    for(i in deger)
    {
        print("$i ")
    }
}