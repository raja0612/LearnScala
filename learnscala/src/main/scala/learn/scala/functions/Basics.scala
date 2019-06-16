package learn.scala.functions

object Basics {
  def main(args: Array[String]): Unit = {
    Basics.printName("Raja")
    println(Basics.print)
    println(Basics.addition(1,2))
    println(Basics.square(2))

  }
   def printName(name :String) : Unit = {
    println(name)
  }

  def print = "Rajashekhar Goud"

  def addition(a:Int, b:Int) :Int = {
    a+b
  }

  def square(x:Int) = x*x

}
