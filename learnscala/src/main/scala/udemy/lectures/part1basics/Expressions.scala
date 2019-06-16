package udemy.lectures.part1basics

object Expressions extends App{

    val a = 2 + 3 // expression
    println(a)

  //In scala if is a expression

  // Expression vs Instruction
  // Expression has value and type where instruction tells computer to do something

  val aVal = if (a > 5) 5 else 10 // here if is an expression
  println(aVal)

  var b = 1
  while (b < 10) {
    print(b)
    b += 1
  }  // Please NEVER do this again it's imperative programming style.
  // writing loops are bad

  // everything in scala is an expression.

  val aWeirdValue = (b = 3)  // Unit === void & value of Unit is ()
  println(aWeirdValue)

  // side effects println(),returns Unit type


  //Code block contains value which is the last statement of that block

  val aCodeBlock = {
    val a = 19
    val b = 21
    if (a+b > 40 ) 40 else 55
  }
}
