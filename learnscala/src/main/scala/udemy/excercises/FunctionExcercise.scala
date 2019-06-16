package udemy.excercises

object FunctionExcercise extends App {

  // crete function to return My name is $name and i am $ years old

  def excercise1(name: String, age: Int): String = {
    return "My Name is " + name + " and I am " + age + " Years Old"
  }

  println(excercise1("raja", 28))

  // Factorial Number

  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(1))

  // Fibanocci Example f(1) =1 f(2) =2 f(n) = f(n-1) + f(n-2)

  def fibanocci(n: Int): Int = {
    if (n <= 2) 1
    else fibanocci(n - 1) + fibanocci(n - 2)
  }

  println(fibanocci(8))
  // 1 1 2 3 5 8 13 21 34
  // check number is prime or not

  def isNumberPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)

  }
  println(isNumberPrime(17))
}
