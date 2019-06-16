package learn.scala

class A {
  def methodA(): Unit = {
    println("A class method")
  }
}
class B extends  A {
  def methodB(): Unit = {
    println("B class method")
  }
}

object inheritance {

  def main(args: Array[String]): Unit = {
    val bObj = new B();
    bObj.methodB()
    bObj.methodA()
  }
}
