package taitexample

trait Friendable {
  val name:String
  def listen()={println("I'm " +name + " listening")}
}
class Human(val name: String) extends Friendable

class Aninmal(val name:String)
class Dog(override val name: String)extends Aninmal(name) with Friendable

object FriendableMain extends App{
  val sam = new Human("sam")
  sam.listen()

  val buddy= new Dog("Buddy")
  buddy.listen()
}
