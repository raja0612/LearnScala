package udemy.lectures.part3fp

object HigerOrderAndCurriedFunctions extends App {

  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null


  // return type =  right side of  last arrow = (Int => Int) is function which takes Int as parameter and returns Int

  // (Int, (String,(Int => Boolean))  = this function takes two parameters 1. Int as parameter and 2. function (String,(Int => Boolean))

  // function (String,(Int => Boolean)) = this function takes two parameters 1. String, 2. returns function (Int => Boolean)

  // (Int => Boolean) => this function takes Int as parameter and returns Int

  // syntax   (input parameters => return type)


  // define function which takes a function and applies n times over a value x

  // nTimes(f, n, 3) = f(f(f(3)))


  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1

  println(nTimes(plusOne, 10, 1))

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x  // return function which takes x as Int param and return X
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))
}
