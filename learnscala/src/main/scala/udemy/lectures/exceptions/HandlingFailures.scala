package udemy.lectures.exceptions

import scala.util.{Failure, Success, Try}

object HandlingFailures extends App {

  // create Success and Failure
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Some runtime Error"))

  println(aSuccess)
  println(aFailure)

  def failureMethod(): String = throw new RuntimeException("some error")

  // wrapping error  in Try object with apply method
  val error = Try(failureMethod())
  println(error)

  println(error.isSuccess)
  println(error.isFailure)

  var anotherFailure = Try {
    // some code that can throw error
  }

  // chain method

  // Try(method1()).orElse Try(method2())

  // Design API with better exception handling

  def unsafeMethod(): Try[String] =  Failure(new RuntimeException("Error"))
  def backUpMethod(): Try[String] = Success("success")

  val betterCalling = unsafeMethod() orElse backUpMethod()

  // map, filter flatMap methods on Success and Failure

  println(aSuccess.map(_ * 2)) // 3 * 2
  println(aSuccess.flatMap(x => Success(x * 10)))
  println(aSuccess.filter(_ > 10))

}
