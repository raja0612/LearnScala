package udemy.lectures.part2op

object Generics extends App {

  //generic classes and traits
  class MyList[A] {
    //use the type A
  }

  trait MyMap[key,value] {

  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]


  // generic methods

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

}
