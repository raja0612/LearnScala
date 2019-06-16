package udemy.lectures.part2op

object AbstractDataTypes extends App {

  // In Scala also there are abstract classes which can have abstract and non abstract members.
  // we use keyword abstract.

  abstract class Animal {

    val category:String = "animal" // non abstract field

    val name:String // abstract filed  must override in sub class
    def eat(): Unit  // abstract method must override in sub class

    // you can't instantiate abstract class
    // it holds the thing of class

  }

  class Dog extends Animal {
    override val name: String = "Max"
    override def eat(): Unit = println("I eat my food and dig into my father food,")
  }

  val dog = new Dog
  println(dog.name + " "+dog.eat())

  // traits just like interfaces, keyword trait

  trait TraitAnimal  {
    val myName: String = "Trait animal"
    val whoAmI:String
  }

  class Parrot extends Animal with TraitAnimal {
    override val name: String = "Parrot"
    override def eat(): Unit = println("fruits and seeds")
    override val whoAmI: String = "Vegeterain, I can speak like human beings"
  }

  // class can use (with) multiple traits.
  //traits has behavior of the class.
  // traits can't have class level or primary constructors.


  // SCALA TYPE HIERARCHY

  /*

      scala.Any -> scala.AnyRef   (String,List object type etc) -> scala.NULL

      scala.Any-> scalaAnyVal   (Int, Boolean primitive type etc) -> scala.Nothing


   */



}
