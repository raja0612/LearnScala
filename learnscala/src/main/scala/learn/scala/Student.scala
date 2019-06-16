package learn.scala

class Student {
  var name : String = _
  var age : Int = _
  var address : String = _

  def setValues(n:String,i:Int,add:String): Unit = {
    name = n
    address = add
    age = i
  }
  def displayValues(): Unit ={
    println(name + " "+age + " "+address)
  }
}

object MyStudentMain {
  def main(args: Array[String]): Unit = {
    val std1 = new Student()
    std1.setValues("Max",4,"Nashville")
    val std2 = new Student()
    std2.setValues("raja",28,"Virginia")
    std1.displayValues()
    std2.displayValues()
  }
}
