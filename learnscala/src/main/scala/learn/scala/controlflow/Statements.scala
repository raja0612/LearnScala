package learn.scala.controlflow

class Statements(var age:Int) {
   if(age > 18){
     println("USE YOUR VOTE")
   } else {
     println("TELL SOMEONE TO USE THEIR VOTE")
   }

}
object CFMain{
  def main(args: Array[String]): Unit = {
    new Statements(18)
    new Statements(29)

  }
}
