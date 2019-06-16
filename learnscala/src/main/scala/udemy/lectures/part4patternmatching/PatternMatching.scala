package udemy.lectures.part4patternmatching

import scala.util.Random

object PatternMatching extends App {

  // switch
  val random = new Random
  val x = random.nextInt(10)

  val description = x match {

    case 1 => "ONE"   // case pattern  => "result"
    case 2 => "TWO"
    case 3 => "THREE"
    case _ => "DEFAULT"
  }
  println(x)
  println(description)

  // use cases

  // 1. Decompose values

  case class Person(name: String, age: Int)

  val raj = new Person("Raj", age=28)

  val matched = raj match {

    case Person (n, a)  if a > 21 => s"I am $n ang age $a You are eligible to drink"

    case _ => "I dont know who am i"
  }
  println(matched)
}
