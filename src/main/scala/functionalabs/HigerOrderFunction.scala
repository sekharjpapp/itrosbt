package functionalabs

object HigerOrderFunction {
    def perform(f:(Int,Int)=>Int): Unit ={
      println(f(12,2))
    }
  def main(args: Array[String]): Unit = {
    //Higher Order Function (Passing anonymous function as parameter
    perform((x:Int,y:Int)=>x*y)
    //perform((x:Int,y:Int)=>x+y)
  }

}
