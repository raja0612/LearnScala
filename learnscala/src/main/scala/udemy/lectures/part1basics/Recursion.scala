package udemy.lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int) :Int = {
    if( n<= 1 ) 1
    else {
      println("factorial of " + n)
      val result = n * factorial(n-1)
      result
    }
  }
  //println(factorial(10))
  // println(factorial(50000)) if you run this , you will get stack over flow error.

  def anotherFactorial(n: BigInt):BigInt = {
      @tailrec
      def factHelper(x:BigInt, accumulator: BigInt):BigInt =
        if (x <= 1) accumulator
        else factHelper(x-1, x * accumulator)  // TAIL RECURSIVE = use recursive call as LAST expression

      factHelper(n,1)
  }

  //anotherFactorial(10)

  /*
      first inner function expression returns to outer function
      here n = 10, x =10, accumulator = 1
      then inner function is called recursively. until x <= 1

      anotherFactorial(10) = factHelper(10,1)
                             factHelper(9, 10 * 1)
                             factHelper(8, 9 * 10 * 1)
                             factHelper(7, 8 * 9 * 10 * 1)
                               .
                               .
                               .
                            factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
                            factHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
   */
  // println(anotherFactorial(50000))


  // WHEN you need loops use tail recursion

  // write string concatenation with given n times with tail recursion

  def concatStringWithTailRecursion(name: String, n: Int) : String = {
    @tailrec
    def concatHelper(result: String, x: Int): String =
      if(x <= 1 )  result
      else
        concatHelper(result + " " + name, x-1)

    concatHelper(name, n)
  }

  println(concatStringWithTailRecursion("raja", 5))
}
