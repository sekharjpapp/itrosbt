package functionalabstraction


object Main extends App {

  def total(list: List[Int]) ={
    var sum=0
    for (i <- list){
      sum +=i
    }
    sum
  }
  def totalFunctional(list: List[Int])={
    list.foldLeft(0){(carryOver,e)=>
      carryOver +e
    }
  }
    println(total(List(1,2,3,4,5,6)))
  println(totalFunctional(List(1,2,3,4,5,6)))
}
