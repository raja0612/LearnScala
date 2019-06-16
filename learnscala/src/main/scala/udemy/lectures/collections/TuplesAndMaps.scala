package udemy.lectures.collections

object TuplesAndMaps extends App {

  // tuples =  finite ordered lists, collection of different data types

  val aTuple = new Tuple2(2, "Scala") // type Tuple2[Int, String] = (Int, String)

  println(aTuple._1) // first tuple element
  println(aTuple._2) // second tuple element
  println(aTuple.copy(_2 = "Good Bye Java")) // add 2 tuple element with value
  println(aTuple)
  println(aTuple.swap)

  // Maps key to value.
  val aMap: Map[String, Int] = Map.apply() // empty map.

  val aPhoneBook = Map(("Raj", 1234), ("Max", 123467), ("Jack" -> 345672))
  // a -> b == (a, b)
  println(aPhoneBook)

  // map operations.
  println(aPhoneBook.contains("Max"))
  println(aPhoneBook.apply("Raj")) // return Raj Phone number

  //println(aPhoneBook.apply("God")) // Returns Exceptions because God is not in the Map.

  val bPhoneBook = Map(("Raj", 1234), ("Max", 123467), ("Jack" -> 345672)).withDefaultValue("You can't see me")
  // default value if key is not exist
  println(bPhoneBook.apply("God"))

  // add new pairing
  val newPair = "Mary" -> 1213
  val newPhoneBook = bPhoneBook + newPair
  println(newPhoneBook)

  // functions on Maps

  // map, flatMap, filter - each method takes each pair of map

  //conversion
  // map.toList
  // list.toMap

  // groupBy
  // list.groupBy(predicate)



}
