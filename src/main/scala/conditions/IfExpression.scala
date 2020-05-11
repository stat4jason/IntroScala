package conditions

object IfExpression {
  def main(args: Array[String]): Unit = {
    val x = 99

    // Python y = "It's big" if x > 100 else "It's small"

    val y = if (x > 100) {
      print("executing the big side...")
      "It's big" // value of a "block" expression is the last value in that block
    } else {
      "It's small"
    }
    println(y)

    val p = {
      println("Calculating p")
      val q = "Hello"
      q + " world"
    }
    println(p)

    // expression in general
    // can assign expression to variable
//    val sum = 3 + 4
    // or use as function argument
//    println(3 + 4)
    // expressions can be made of other expressions
    print((3 + {
      print("calculating...")
      2 + 2
    }) + " is the sum")
  }
}
