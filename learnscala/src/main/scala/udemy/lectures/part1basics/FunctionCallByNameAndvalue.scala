package udemy.lectures.part1basics

object FunctionCallByNameAndvalue  extends App {

  def callByValue(x: Long): Unit = {
    println("call by value "+x)
    println("call by value "+x)

    // The x value will be assigned in function call. and same value is used in this entire function
  }

  def callByName (x: => Long):Unit = {
    println("call by name "+x)
    println("call by name "+x)

    // here x value is evaluated each time on line 13 and 14. and this value is initialized lately.
    // that means, if you  dont use call by name parameters in this function, it never evaluated
  }

  callByValue(System.nanoTime()) // ex: 1234556789L
  callByName(System.nanoTime())  // here we pass expression  System.nanoTime() not time, when this line is executed


  def infinite(): Int = 1 + infinite()
  def printInfinite(x: Int, y: => Int) = println(x)


  // printInfinite(infinite, 43)
  // The above function call  will give stack over flow because here infinite function will be evaluated before it's passed
  printInfinite(43, infinite)
  // here no error, because infinite function passed as (call by name )expression, and we are not using infinite expression
  // inside printInfinite()
}
