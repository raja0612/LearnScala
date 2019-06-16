package udemy.lectures.part1basics

object DefaultArgs extends App {

  def addition (x: Int = 10, y : Int = 20): Unit = {
    println("addition of " + x +" & "+ y  + (x+y))
  }

  addition(23,23)
  addition()

  addition(y = 300,x = 200) // passing parameters with names and different order

}
