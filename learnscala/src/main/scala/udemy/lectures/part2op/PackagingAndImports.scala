package udemy.lectures.part2op

import udemy.playground.{Cinderella, HelloWorld => hw}
import java.util.Date
import java.sql.{Date => sqlDate}



object PackagingAndImports  extends App {

  val princess = new Cinderella()
  princess.whereIsMyCinderella

  // package object
  println(MY_NAME)
  println(sayNamaste())



  val helloWorld = new hw //using alias name hw from imports

  val javaDate = new Date
  val sqlDate = new sqlDate(2019,5,4)
  println(javaDate)
  println(sqlDate)

  /*
       default imports java.lang (String  Objhect, Exceptions,)
       scala (Int, Nothing, Function)
       scala.predef =  println, ???(Nothing)
   */

}
