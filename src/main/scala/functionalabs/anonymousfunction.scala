package functionalabs

object anonymousfunction {
  def main(args: Array[String]): Unit = {

    var f= ()=>println("Hello anonymousfunction")
    f()
    //passing parameters
    var f1= (x:Int,y:Int)=>x+y
    println(f1(2,3))
  }

}
