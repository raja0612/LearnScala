package udemy.excercises.OOPS

class Writer (firstName: String, lastName: String, val dob: Int) {

  def fullName () : String = s"${this.firstName}  ${this.lastName}"

}

class Novel (val name: String, yearOfRelease: Int, author: Writer) {

  def authorAge(): Unit =  println(f"${this.yearOfRelease - this.author.dob}%d")

  def isWrittenBy(novel: String): Unit = println(f"$novel is written by ${this.author.fullName()}%s")

}
object MyMain extends App {

  val writer = new Writer("Rajashekhar", lastName = "Ramayampeta", 1990)
  val novel = new Novel("Asurion", 2019, writer)
  println(writer.fullName())
  println(novel.authorAge())
  println(novel.isWrittenBy(novel.name))

}
