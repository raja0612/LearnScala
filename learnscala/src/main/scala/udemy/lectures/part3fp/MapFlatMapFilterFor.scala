package udemy.lectures.part3fp

object MapFlatMapFilterFor extends App {


  //List()
  val list = List(1, 2, 3)

  println(list)
  println(list.head)
  println(list.tail)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  //flat map
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  // print all combinations of below two list
  val chars = List('a', 'b', 'c', 'd')
  val numbers = List(1, 2, 3, 4)
  var colors = List("black", "red")

  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations)

  val combinations2 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations2)

  //foreach
  list.foreach(println)

  // for-comprehensions
  val forComprehensions = for {
    n <- numbers if n %2 == 0 // guards
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color
  println(forComprehensions)

  for {
    n <- numbers
  } println(n)

  // syntax overload

  list.map { x =>
    x * 2
  }

}
