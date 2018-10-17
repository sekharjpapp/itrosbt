package tailrecexample

object TailRecMain extends App {

  def factorial(n:Int,fact:BigInt):BigInt ={
    if (n==1)
      fact
    else
      factorial(n-1,fact *n)
  }
  println(factorial(50000,BigInt(1)))

}
