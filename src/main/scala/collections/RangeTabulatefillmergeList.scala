package collections

class RangeTabulatefillmergeList {

}
object RangeTabulatefillmergeListMain{
  def main(args: Array[String]): Unit = {

    var a = List.range(1,10,2)
    var b = List.tabulate(8){a=>a * a}

    a.foreach{
      println

    }
    b.foreach{
      println
    }
  }
}