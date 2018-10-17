package functionalabs

object Closure {

  def main(args: Array[String]): Unit = {

    var f:Int=12
    val a=(x:Int)=>x *f
    println(a(10))
  }

}
