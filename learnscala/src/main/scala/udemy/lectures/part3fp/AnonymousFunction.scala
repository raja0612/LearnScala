package udemy.lectures.part3fp

object AnonymousFunction extends App {

  // The below function takes one Int arument and returns another Int

  val regFunction = new Function[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }


  // equivalent function for above regFunction
  //LAMBDA
  val anonymousFunction = (x: Int) => x * 2

  // multiple parameters

  val adder =  (x: Int, y: Int) => x + y

  val sameAdder : (Int, Int) => Int  = (x, y) => x + y


  // no parameter

  val returnRandom = () => Math.round(Math.random())

  println(returnRandom) // function itself
  println(returnRandom()) // function call

  // curly braces

  val strToInt = {
    (str: String) => str.toInt
  }

  println(strToInt("5"))

  // more syntactic sugar

  val increment : Int => Int = x => x + 1
  val smartIncrement : Int => Int = _+ 1 // both are same

  println(increment(1))
  println(smartIncrement(1))

  val adder2 : (Int, Int) => Int = (x, y) => x + y
  val smartAdder2: (Int, Int) => Int = _ + _ // both are same

  println(adder2(1, 2))
  println(smartAdder2(1, 2))

  val superCurried = (x: Int) => (y: Int) => x + y

  println(superCurried(4)(3))
}
