package exceptionhandling

object FirstOne {
  def main(args: Array[String]): Unit = {

    var a:Int =12
    var b:Int =0

    try {
      print(a/b)
    }catch {
      case ex:ArithmeticException=>print("dividing by zero")
    }
  }

}
