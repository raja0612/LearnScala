package udemy.lectures.part3fp

object WhatsFunction extends App {

  // In SCALA functions are FIRST CLASS ELEMENTS which means we can do same operations like variables.
  // you can pass, assign, perform operations on them
  //In scala default 22 FUNCTION traits  are available

  // all FUNCTIONS are objects.


  val convertToInt: (String => Int) = new Function1[String, Int] {
    override def apply(input: String): Int = input.toInt
  }

  // FUNCTION TYPE :(String => Int)  == ((inputType1,inputType2,.....inputType22) => resultType)

  println(convertToInt("1") + 2)

  val concatString: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(concatString("Scala", "Java"))

  //higher order function which takes either functions as a parameter and returns functions as return.

  // create a function which takes an Int as parameter and return another function which takes Int as parameter and int as return

  // Function1[Int, Function1[Int, Int]


  val specialFunction: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val adder3 = specialFunction(3)
  println(adder3(4))
  println(specialFunction(3)(4)) // curried

  val sumOfCubes = new Function[Int, (Int)=>Int] {   // (Int)=>Int  == Function1[Int, Int]
    override def apply(x: Int): Int => Int = new Function1[Int, Int] {
      override def apply(y: Int): Int = x*x*x +  y*y*y
    }
  }

  println(sumOfCubes(1)(2))


}
