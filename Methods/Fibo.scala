import scala.io.StdIn.readInt


object Fibo extends App{
    def Fibo(term: Int): Int ={
        if(term == 1)
            return 0
        else if(term == 2)
            return 1
        return Fibo(term-1) + Fibo(term-2)

    }
    println(Fibo(3))
}