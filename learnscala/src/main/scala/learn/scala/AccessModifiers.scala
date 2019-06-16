package learn.scala

class AccessModifiers {

  private var age:Int = 28
  var name : String = "Raja"
  protected var address : String = "Virginia"

  def displayValues() {
    println(age + " "+name + " "+address)
  }

}
