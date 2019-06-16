package udemy.lectures.part2op

object OOBasics  extends App {
  val person = new Person("Scala", 28)
  println(person.age)
  println(person.x)
  println(person.greet("Raja"))
  println(person.greet2("Raja"))
  println(person.greet2())

}


class Person (name : String, val age: Int) { // primary Constructor

   // class paramters are NOT FIELDS

  // class Body , everything in side class body will be executed when instantiate the object.


  val x = 20 // field this can be accessed by person.x directly.

  println(1 + 3)


  def greet(name : String):Unit = println(s"$name says hi $name")

  def greet2(name : String):Unit = println(s"${this.name} says hi $name")

  // overloading
  def greet2() : Unit = println(s"Hi $name")

  // multiple constructors.

  def this(hobby: String) = this(name="Max", age = 4) // must call primary constructor
  def this() = this(hobby="running") // must call primary or other constructors.


}