package patternmatching

class patternmatching {

}

object PatMatching{
  def main(args: Array[String]): Unit = {
    var i:Int =1

    i match {
      case 1 =>print("first case")
      case 2 =>print("Second Case")
      case _ =>print("Default")
    }
  }
}
