package udemy.excercises.OOPS

object CaseClasses extends App {

  /*
     case is the keyword which can be define with class and object in scala

     which implicitly adds hash, equals, toString, some factory methods like copy(), apply(),
     serializable features.

     case class must be parameterized.
   */

  case class Person(name: String, age: Int) {

  }


  val person = new Person("raja", age = 28)

  // toString
  println(person)

  // case class parameters are converted into fields
 println(person.name + " "+person.age)

  // equals and hashcode methods implicitly implemented

  val anotherPerson = new Person(name="raja", age=28)
  println(person == anotherPerson)

  // copy()
  val copyPerson = anotherPerson.copy(name="Srujan")
  println(copyPerson) // will create srujan with same age as raja

    // case classes implicitly has companion objects.

  val companionObject = Person("comapanion",1) // here Person is object we dont need to instantiate new Person()
  println(companionObject)

  // case classes are serialized so we can transfer objects on n/w


  // just classes object can be case object

  case object MycaseObject {
    // it has ever feature like case class excpet companion object because every object is companion itself
  }
}
