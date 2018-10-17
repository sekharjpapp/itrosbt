package jtug

case class person(var first:String,var  last:String,var age:Int){
}
object JtugMain extends App {
    val p = person("sekhar","Reddy",16)
    val p1 = person("sekhar","Reddy",16)
    println(p == p1)

}
