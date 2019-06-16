package udemy.lectures.part2op

object Exceptions extends App {

  val name: String = null
  // println(name.length) // This line throw NULL pointer exceptions.


  try {
    println(name.length)
  } catch {
    case e: NullPointerException => println("Null pointer exceptions occurred" + e.getLocalizedMessage)
  } finally {
    println("finally, this will excute no matter what")
  }


  // define own exception. Exception or Error

  class MyException extends  Exception {
     val myException = new MyException
     throw myException
  }

}
