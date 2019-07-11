object Fibonacci extends App{
  Fibonacci.gefFibNo(5)
  def  gefFibNo(n:Int): Int ={

    def calFibo(n:Int,last:Int=0,next:Int=1): Int ={
      if(n==1||n==2)
        {
          last
        }
      else
        {
          print(last)
          calFibo(n-1,last=last+next,next=last)
        }
    }
    gefFibNo(n)
  }

}