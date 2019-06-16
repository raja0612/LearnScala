package udemy.lectures.part4patternmatching

object AllThePatterns extends App {

  // constants

  val x: Any = "Scala"

  x match {
    case 1 => "ONE"
    case "Scala" => "The Scala"
    case true => true
    case AllThePatterns => "singleton object"

  }

  println(x)

  // match anything

  x match {
    case _ => ""
  }
  x match {
    case something => s"$something"
  }

  val myTuple = (1,2)

  myTuple match {
    case (1,1) =>
    case (something, 2) => s"$something"
  }


  val aNumbers  = List(1,2,3)

  val matched2 = aNumbers match {
    case listOfStrings: List[String] => "listOfStrings"
    case listOfInt: List[Int] => "listOfInt"

  }

  println(matched2)
}
