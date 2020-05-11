package conditions

import scala.io.StdIn

object UseIf {
  def main(args: Array[String]): Unit = {
    val s = StdIn.readLine("Enter a number")
    val num = s.toDouble
    val u = if (num > 3) {
      println("Big")
      print("I mean it")
    } else {
      println("Small")
      ""
    }
  }
}