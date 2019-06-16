package udemy.lectures.part1basics

object Functions extends  App {

  def aFunction(a: String, b:Int) : String = {
     a +" "+ b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction() : Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  // write a function to print given string with n times in functional programming

  def aRepeatedFunction(aString: String, n: Int) : String = {
    if(n==1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }

  println(aRepeatedFunction("hello", 3))

  //WHEN YOU NEED LOOPS USE RECURSION.

  def aSumUptoGivenNumber(n:Int) : Int = {
    if ( n < 1) 0
    else n  + aSumUptoGivenNumber(n-1)
  }
  println(aSumUptoGivenNumber(5))


  // compiler figures out return type of function implicitly but recursive function must specify return types.

  // return types unit, any
}
