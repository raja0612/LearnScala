package udemy.lectures.part2op

object ScalaObjects extends App {

  /*
    IN SCALA NO class level functionality.
   */

  object Person {
    // static or class level functionality means we can directly access these by object name

    val EYES = 2

    def canFly: Boolean = true

    // often we have factory methods in object
    // factory method because the sole purpose of this method to create Person class instance
    def from(mother: Person, father: Person): Person = new Person("Raja")

    def apply(mother: Person, father:Person, child: String): Person = new Person(child)
  }


  // object fields and methods directly accessed by object name
  println(Person.EYES)
  println(Person.canFly)

  // objects are singleton by default

  val raj = Person
  val jack = Person

  // here both raj and jack are same instances.
  println(raj == jack) // true


  // if object and class has same name and resides in same scope then they are called COMPANIONS.

  class Person (name: String){
    //object Person and class Person are COMPANIONS

    // instance level functionality , which means in order to access members of this class, we need instance


    override def toString = s"Your precious Child $name"
  }

  val person1 = new Person("Scala")
  val person2 = new Person("Java")

  println(person1 == person2) // false because they are different instances

  val mother = new Person("Aruna")
  val father = new Person("Siddu")

  println(Person.from(mother, father))

  println(Person.apply(mother, father, "Sandhya"))
  println(Person.apply(mother, father, "Srinivas"))

  println(Person(mother, father,"new Child")) // it calls apply()




}
