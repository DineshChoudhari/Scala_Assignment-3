import scala.io
import scala.io.StdIn


object Higher_order_function {
  def area(shape:String,first:Int,second:Int,fun:(Int,Int)=>Int): String = {
   // fun(first, second)
    shape match {
      case "rectangle"=> s"Area of rectangle ${fun(first,second)}"
      case "rhombus"=> s"Area of rhombus ${fun(first,second)}"
      case "parallelogram"=> s"pallarea ${fun(first,second)}"
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
    //Higher_order_function.area("square",4,5,)



    }
      }

