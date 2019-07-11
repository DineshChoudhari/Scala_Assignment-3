import scala.annotation.tailrec

object Fibonacci extends App{
  Fibonacci.gefFibNo(8)
  def  gefFibNo(n:Int): Int ={
    //calFibo(n,0,1)
   @tailrec def calFibo(n:Int, last:Int=0, next:Int=1): Int={
      print(last)
      if(n==1||n==2)
        {
          last
        }
      else
        {
         // print(last)
          calFibo(n-1,last=last+next,next=last)
        }
    }
    calFibo(n)
  }

}
