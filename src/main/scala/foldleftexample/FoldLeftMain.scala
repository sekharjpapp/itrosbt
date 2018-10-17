package foldleftexample

object FoldLeftMain extends App {

      val numbers = List(1,2,3,4,5,6)

      println(numbers.foldLeft(0){(c,e)=>c+e})

      println(numbers.map(e => e*2))

  def foo(a:Int)={
    a *2
  }
  println(foo(3))
}
