

  object higherOrder{

    def  getSum(n1:Int,n2:Int,f:(Int,Int)=>Int): Int ={
     f(n1,n2)
    }

    def sumSquares(n1:Int,n2:Int) = {
      n1*n1+n2*n2
    }
    def sumCubes(n1:Int,n2:Int)  = {
      n1*n1*n1+n2*n2*n2
    }
    def sumInt(n1:Int,n2:Int,n3:Int=3)={
      n1+n2+n3

    }
    //val v1 = new higherOrder()
    def main(args: Array[String]): Unit = {
      print(higherOrder.getSum(2,3,sumCubes))
    }
  }
