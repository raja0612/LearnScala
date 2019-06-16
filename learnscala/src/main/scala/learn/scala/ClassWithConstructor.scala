package learn.scala

class ClassWithConstructor(val a:Int,val b:Int) {
  val x = a;
  val y = b;

  def add(){
     println(x+y);
  }

  // aux const
  def this() {
    this(200,300)
  }
  def this(x:Int) {
    this(x,30)
  }
}

object MyMain {
  def main(args:Array[String]) {
     val obj = new ClassWithConstructor(10,20) // calls two parameters const
     obj.add()
     val obj2 = new ClassWithConstructor(250) // calls single parameter const.
     obj2.add()
     val obj3 = new ClassWithConstructor() // calls defaults constructor.
     obj3.add()
  }
}
