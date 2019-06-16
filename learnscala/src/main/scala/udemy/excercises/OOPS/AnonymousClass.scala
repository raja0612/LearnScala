package udemy.excercises.OOPS

object AnonymousClass extends  App {

  abstract class Animal {
    def eat: Unit
  }

  //anonymous class
  val anonymousClass: Animal = new Animal {
    override def eat: Unit = println("I am anonymous class impl")
  }

  println(anonymousClass.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s" Hi $name")
  }

  val danayya = new Person("Raja") {

    override def sayHi: Unit =  {
      super.sayHi // calling super class  Person sayHi() method
      println("I am anonymous")
    }
  }

  println(danayya.sayHi)

}
