fun main()
{



    disDongu@for(i in 1..10)
    {
        icDongu@for(j in 1..10)
        {
            println("i = ${i}, j = ${j} ")
            if(i == 4)
            {
                continue@disDongu
            }

            if(i == 7)
            {
                break@disDongu
            }
        }
    }


    


    


}