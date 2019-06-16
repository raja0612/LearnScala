package learn.scala.controlflow

class Loops {
  def printWhileLoop(): Unit ={
    var i = 10;
    while(i>0) {
      print(" " +i)
      i = i-1
    }
  }

  def forLoops(): Unit ={
    var a:Int = 1

    println()
    for (a <- 1 to 10) {
      print(" "+a)
    }
    println()
    for (a <- 1 until 10) {
      print(" "+a)
    }
    var b:Int = 1
    for(a<-1 to 3; b <- 1 to 2){
      print(a,b)
    }
  }

  def moreOnForLoops(): Unit = {
    val numList = List(1,2,3,4,5)
    for(a <- numList
        if a!=1; if a!=5){
       print(a)
    }
  }

  def forYeild(): Unit ={
    val numList  = List(1,2,3,4,5)
    var yeildValue = for (i <- numList if i!=1; if i!=5) yield i

    print("yeild.."+yeildValue)
  }
}

object LoopMain {
  def main(args: Array[String]): Unit = {
    val obj = new Loops()
    obj.printWhileLoop()
    obj.forLoops()
    obj.moreOnForLoops()
    obj.forYeild()
  }

}
