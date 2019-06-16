package udemy.lectures.collections

import scala.util.Random

object Options extends App {

  // options is a wrapper for value that may be present or empty - Some or None

  val someOption: Option[Int] = Some(4)
  val noneOption: Option[Int] = None

  println(someOption)
  println(noneOption)

  // Options are introduced to deal with unsafe APIS

  def unSafeMethod(): String = null

  // val wrong = Some(unSafeMethod()) // WRONG
  val correct = Option(unSafeMethod()) //Some or None
  println(correct)

  def safeMethod(): String = "Valid Result"

  // chained Result
  val result = Option(unSafeMethod()).orElse(Option(safeMethod()))
  println(result)

  // Design better API
  def unSafeMethod1(): Option[String] = None

  def safeMethod1(): Option[String] = Some("Valid Result")

  // better chained Result
  val betterResult = unSafeMethod1() orElse safeMethod1()
  println(betterResult)

  // fucntions on Option
  println(someOption.isEmpty)
  println(someOption.get) // unsafe DO NOT USE


  var config: Map[String, String] = Map(
    // This values are from external file
    "host" -> "10.10.60.9",
    "port" -> "80"
  )

  class Connection {
    def connect = "connected"
  }

  object Connection {

    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }

  // try to establish the connection if so print connect method

  val host = config.get("host")
  val port = config.get("port")

  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus = connection.map(c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)

  //chained calls
  config.get("host")
    .flatMap(host => config.get("port")
      .flatMap(port => Connection(host, port))
      .map(connection => connection.connect)
    ).foreach(println)

  // for-comprehensions

  val connectionFor = for {
    host <- config.get("host")
    port <- config.get("port")
    connection <- Connection(host, port)
  } yield connection.connect

  connectionFor.foreach(println)
}
