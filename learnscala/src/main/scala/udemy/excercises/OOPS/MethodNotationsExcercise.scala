package udemy.excercises.OOPS


class ExPerson(val name: String, val favoriteMovie: String, val age: Int = 0) {

  //1. overload the + operator method which should take string as parameter and returns new Person with favoriteMovie.

  def +(person: ExPerson): String = s"${this.name} is hanging out with ${person.name}"
  def +(input: String): ExPerson = new ExPerson(input, "and His favorite movie is Varsham")


  // 2. add age parameter to this class and add unary operator + method and return age with increment

  def unary_+(): String = s"Next year you are turning ${age+1}"

  // 3. add learns method returns $name learns Scala and one more method learnsScala which should call learn method
  def learns(thing:String): String = s"$name is learning $thing"
  def learnsScala : String = this learns("calling above learns() from learnsScala()")


 // 4. problem overload apply() method and new overload method should take int and return below string result
  def apply(): String = s"Hi My name is $name and I like $favoriteMovie"
  def apply(times: Int):String = s"$name watch the $favoriteMovie $times times"




  override def toString = s"$name, $favoriteMovie"
}

object MethodNotationsExcercise  extends App {
  val person = new ExPerson("Raja", "Inception")

  //1. solution.
  println(person.+("DSP is Rockstar").toString)

  // 2.solution

  println(+person)
  println(person.unary_+)

  // 3. solution
  println(person.learns("Scala"))
  println(person.learnsScala)

  // 4. solution
  println(person.apply(100))
  println(person(10))

}
