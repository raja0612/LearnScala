package learn.scala.functions

class Functions {
  /*
     functions in class called methods.
     functions which does not return value called procedures.
     functions in object called functions.

  */
  def myFunction(greet:String) : String = {
    return "Hello..."+greet;
  }

}
object funcMain {
  def main(args: Array[String]): Unit = {
    val obj = new  Functions()
    println(obj.myFunction("raja"))
  }
}