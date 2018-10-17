case class Car(){
  def turn(direction:String)={
    println("Turning  " +direction)
  }
}

val car = new Car
car turn "left"