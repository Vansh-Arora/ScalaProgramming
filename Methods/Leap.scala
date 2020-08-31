object Leap extends App{
    def checkLeap(year: Int) = {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    println("Leap year")
                else
                    println("Not a Leap Year")
            }
            println("Leap Year")
        }
        else
            println("Not a leap Year")
    }

    checkLeap(2020)
}   