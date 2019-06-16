package udemy.excercises.OOPS

abstract class MyList {
  /*
     1. head() - first element of the list
     2. tail() - last element of the list
     3. isEmpty() - returns true or false
     4. add(element:Int)
     5. toString() - string representation of list
   */

  // define above abstract methods here.
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList

}

  object Empty extends MyList {
    def head: Int = throw new NoSuchElementException
    def tail: MyList  = throw new NoSuchElementException
    def isEmpty: Boolean  = true
    def add(element: Int): MyList  = new Cons(element, Empty)
  }

  class Cons(h: Int, t: MyList) extends MyList {
    def head: Int = h
    def tail: MyList  = t
    def isEmpty: Boolean  = false
    def add(element: Int): MyList  = new Cons(element, this)
  }

  object MyLinkedList  extends App {
    val myList = new Cons(1,Empty)
    println(myList.head)
  }



