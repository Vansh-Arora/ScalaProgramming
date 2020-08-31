import scala.io.StdIn.readInt
object Leap extends App{
    def checkLeap(year: Int): Unit = {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    println("Leap year")
                    return
                }
                else
                {
                    println("Not a Leap Year")
                    return
                }
            }
            
            println("Leap Year")
            return
        }
        else
            println("Not a leap Year")
            return
    }

    var year = readInt(); 
    checkLeap(year)
}   