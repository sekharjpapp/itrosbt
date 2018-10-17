package currying

class Currying {}
object CurryingMain{
  def main(args: Array[String]): Unit = {

    def add(a:Int)={(b:Int)=>a+b}

      println("Result :" +add(12)(2))
    }

}
