package TestCompanion

class Another {
  def index(){println("Here is some test")}
}

object SomeMain {
  def main(args: Array[String]): Unit = {
    def xyz(){println("inside obj.....")}
  }
}
