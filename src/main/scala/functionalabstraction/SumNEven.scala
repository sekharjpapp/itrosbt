package functionalabstraction

object SumNEven extends App {
    def total(list: List[Int], selector:Int =>Boolean)={
      var sum =0
      list.foreach{e=>
        if(selector(e))sum += e}
      sum
    }
  println(total(List(1,2,3,4,5,6),{e => true}))
  println(total(List(1,2,3,4,5,6),{e => e % 2 == 0}))
  println(total(List(1,2,3,4,5,6),{e => e > 4}))

}
