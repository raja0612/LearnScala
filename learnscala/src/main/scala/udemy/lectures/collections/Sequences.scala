package udemy.lectures.collections

object Sequences extends App {

  // Sequences =  List, Array, Vector.
  // type : Seq(Int)

  val aSequence = Seq(1,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(3))
  println(aSequence ++ Seq(8,5,6,7))
  println(aSequence.sorted)
  println(aSequence.head)
  println(aSequence.tail)

  // Ranges
  val aRange: Seq[Int] = 1 to 10 // 1 until 10
  println(aRange.foreach(print))

  //lists
  val aList = List(1,2,3)
  val prepend = 42 :: aList // 42 +: aList
  val append = aList :+ 55
  println(prepend)
  println(append)

  val fiveApples = List.fill(5)("apple")
  println(fiveApples)

  println(aList.mkString("R"))

  // ARRAYS
  val numbers = Array(1,2,3)

  val threeStrings = Array.ofDim[String](3)
  threeStrings.foreach(println)

  // mutation
  numbers(0) = 32
  threeStrings.foreach(println)

  println(numbers.mkString("-"))

  // arrays and sequences

  val numberSeq: Seq[Int] = numbers // implicit conversions : converting array to sequence.
  println(numberSeq)


  // Vectors - immutable

  val aVector: Vector[Int] = Vector(1,2,3)
  println(aVector)

  // Vectors vs Lists


}
