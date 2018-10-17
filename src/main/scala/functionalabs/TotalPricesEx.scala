package functionalabs

class TotalPricesEx {

}

object TotalPricesMain extends App{

    def totlalprices(prices:List[Int],selector:Int=>Boolean)={
      var total=0
      for (price <- prices){
        if (selector(price)) total += price
      }
      total
    }
  val prices =List(10,20,25,30,35,40)
  println(totlalprices(prices,{price=>true}))
  println(totlalprices(prices,{prices=>prices >25}))
  println(totlalprices(prices,{prices=>prices < 25}))
}
