package classexample

case class Car(val year:Int, var miles:Int){
  def drive(dist:Int)={
    println("driving..")
    miles += dist
  }
}

object CarMain extends App {

  val car = new Car(2019,0)
  println(car)
  car.drive(10)
  println(car.miles)
}
