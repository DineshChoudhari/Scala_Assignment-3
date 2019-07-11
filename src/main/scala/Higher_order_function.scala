import scala.io
import scala.io.StdIn


object Higher_order_function {
  def area(shape:String,first:Int,second:Int,fun:(Int,Int)=>Int): Unit = {
    fun(first, second)
    shape match {
      case "rectangle"=> val rectarea=fun;
        s"Area of rectangle=${fun}"
      case "rhombus"=> val rhmarea=fun ;"Area of rhombus" +rhmarea
      case "parallelogram"=> val pallarea=fun ;"Area of parallelogram" +pallarea
      case _ =>"No Such shape" +shape

    }
  }

def rectangleArea(len:Int,Bre:Int): Int={
   len*Bre

}
  def rhombusArea(dia1:Int,dia2:Int)={
    (dia1*dia2)/2

  }

  def parallelArea(base:Int,hgt:Int): Int ={
    base*hgt
  }
  def main(args: Array[String]): Unit = {
    print(Higher_order_function.area("rectangle",2,3,rectangleArea))




    }
      }

