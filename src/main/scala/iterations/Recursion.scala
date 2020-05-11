package iterations

import scala.annotation.tailrec

object Recursion {

  def countAndPrint(current: Int, limit: Int): Unit = {
    if (current < limit) {
      println("Count is " + current)
      countAndPrint(current + 1, limit)
    }
  }

  @tailrec
  def countForever(current: Int): Unit = {
    println("Count is " + current)
    countForever(current + 1)
  }

  def main(args: Array[String]): Unit = {
    countAndPrint(1, 10)
    countForever(0)
  }
}
