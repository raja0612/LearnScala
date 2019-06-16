package learn.scala

object Stock {
  var stock :Int = 0

  def increaseStock(x:Int): Unit ={
    stock = stock + x
  }
  def displayStock(): Unit ={
    println("Stock Value "+stock)
  }
}

class Agent {
  def increaseStock(x:Int): Unit ={
    Stock.increaseStock(x)
  }
}

object Singleton {

  def main(args: Array[String]): Unit = {
    val agent1 = new Agent()
    agent1.increaseStock(10)
    agent1.increaseStock(50)
    agent1.increaseStock(60)

    Stock.displayStock()

  }

}
