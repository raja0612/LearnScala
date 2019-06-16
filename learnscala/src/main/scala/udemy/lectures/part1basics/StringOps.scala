package udemy.lectures.part1basics

object StringOps extends App {

  val greeting: String = "Hi, I am learning Scala"

  // common ops
  println(greeting.charAt(0))
  println(greeting.substring(0, 2))
  println(greeting.startsWith("Hi"))
  println(greeting.replace("Hi", "Namaste"))
  println(greeting.toLowerCase)
  println(greeting.toUpperCase)
  println(greeting.length)

  // prepend and append
  //println(+: +"prepend" + greeting   :+ "append")

  // s-interpolators
  val name = "Max"
  val age = 3
  val greet = s"My name is $name and I am ${age + 1} years old"
  println(greet)

  //f-interpolators like printf
  val hobby = "Running"
  val speed = 8.2f

  val message = f"My hobby is $hobby%s and I run $speed%2.2f miles per hour"

  println(message)

  // raw-interpolators

  println(raw"Hello \n you cant see new line")

  val escWithRaw = "Hello \n you can see me in new line"
  println(raw"$escWithRaw")


}