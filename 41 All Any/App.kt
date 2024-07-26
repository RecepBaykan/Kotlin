fun main(){

    /*

        All metodu
        Listede şartı sağlayan her eleman için göre bool nesnesi döndürür

        list = 1, 2, 3, 4
        var isHas = list.all{ it <3} // isHas = true

        var isHas = list.all{ it > 6} // isHas = false
    
     */

     var list = listOf (2, 3, 4, 5, 3 ,3, 2)

     var isHas = list.all{it>0}

     println(isHas)

     isHas = list.all{it > 3}
      println(isHas)



     /*
     
        Any metodu
        Listede şartı sağlayan tek elemena için bool nesnesi üretir

        list = 3, 4, 5, 6, 7,2

        isHas = list.any{it == 5} // isHas = true
        
        isHas = list.any{ it > 6} // isHas = true
        
        isHas = list.any{ it > 8} // isHas = false

      */

      var list2 = listOf(1,3,5,2,7,1)

      isHas = list2.any{it > 6}
      println(isHas)

    isHas = list2.any{it == 6}
      println(isHas)
      
}