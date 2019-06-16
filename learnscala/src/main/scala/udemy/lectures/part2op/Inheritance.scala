package udemy.lectures.part2op

object Inheritance extends App {

  // in scala also we can extend only one class

  class Animal {
     def eat() = println("nomnomnom")

     private def myPrivate()= println("You can't inherit me")

     protected  def myProtected = println("You can access me in subclass method but not outside of sub class")


  }

  class Cat extends Animal {

    def meow() = {
      myProtected // calling myProtected() from inside subclass method
      println("lord venkatesha...meow meoe")
    }

  }
  val ladVedar = new Cat
  println(ladVedar.eat())
  println(ladVedar.meow())


  // constructors

  class Person(name: String, age: Int) { // class with primary constructor.

    //auxilary constructor
    def this(name:String) = this(name, 0)

  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)


  //overriding

  class A  {

    val className: String = "Super Class"
    val aField:String = "I am A class field with $name"
    def aMethod:Unit = println("I am A class method")
  }

  class B(override val className: String) extends  A {
    //override A class members
    override val aField:String = " I am B class field"

    //override A class method
    override def aMethod: Unit = {

       super.aMethod // calling super class method
      println("I am B class method")
    }
  }
  val b = new B("You are overriding through constructor")
  println(b.aField)
  println(b.aMethod)

  // we can override super class fields from sub class constructor
  println(b.className)


  // type substitution - polymorphism

  val unknownClass = new B("Unkonwn")
  println(unknownClass.aMethod)


  // super is the keyword to access super class fields and methods


  /*
       restrict override
       1. make super class fields or methods or class final
       final val fieldName
       final def methodName(arg: Type) = { Implementation}

       final class A

       sealed class A - you can override class A in this file but not in other files

   */


}
