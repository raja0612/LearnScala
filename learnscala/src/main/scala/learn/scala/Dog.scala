package learn.scala

class Dog {

  var name : String = "Maxum"
  var age : Int = 4
  val PI = 3.14

  def myDogDetails() {
    println("My Name is "+name + " and celebrating my "+age +"th birthday")
  }
  def constVariablesInScala(): Unit = {
    println("PI value "+PI)
  }

}

object Dog {
  def main(args:Array[String]) {
    val max = new Dog()
    max.myDogDetails()
    max.constVariablesInScala()

  }
}
