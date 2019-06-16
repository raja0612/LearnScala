package udemy.lectures.part2op

object MethodNotations  extends App {

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String) : Boolean = movie == favoriteMovie

    def hangOut(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name What the heck"
    // here space important unary_! : String
    def isAlive: Boolean = true

    def apply(): String = s"Hi My name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))
  println(mary likes "Inception")  // both are equivalent called infix notation or operator notation
  //but it only works if method must have one parameter
  // called syntactic sugar

  // Operators in Scala
  val tom = new Person("Tom", "Avatar")
  println(tom hangOut mary)

  println(tom + mary)
  println(tom. +(mary))

  // ALL operators are methods
  println(1 + 2)
  println(1. +(2))


  // prefix notations are unary operators

  val x  = -1 // here - is the unary operator
  val y = 1.unary_- // equivalent to -1
  println(f"x and y are $x and $y")

  println(!mary)
  println(mary.unary_!)

  // unary operators work with + - ! ~

  // post fix notations
  //println(mary.isAlive)
 // println(mary isAlive) // post fix notation (syntactic sugar)

  //apply()
  println(mary.apply())
  println(mary()) // it calls implicitly apply() method in person class


  /*
      method notations.

      1. infix notations  (methods with one parameter)  obj method name one parameter value
      2. prefix notations (method name starts with unary_"+ - ! ~")  " + - ! ~"obj
      3. postfix notations (methods with no arguments)  obj methodName
      4. apply() is the default method  obj apply or obj(paramters values in case apply() method takes any arguments)
   */




}
