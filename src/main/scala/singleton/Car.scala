package singleton

import java.time.Year

class Car(val year:Int,var miles:Int){

}
object Car extends App {
    def apply(year: Int) =new Car(year,0)
  val car = Car(2013)
  println(car.hashCode())
  val car1 = Car(2013)
  println(car1.hashCode())
}
