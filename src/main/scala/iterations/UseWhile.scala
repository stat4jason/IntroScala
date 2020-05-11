package iterations

object UseWhile {
  def main(args: Array[String]): Unit = {
    var count = 0
    while (count < 3) {
      println("count is " + count)
//      count = count + 1
      count += 1
    }
    println("finished counting")
  }
}
