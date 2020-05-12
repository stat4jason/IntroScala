package functions

object MultipleArgumentLists {
  def add(a: Int)(implicit b: Int): Int = a + b

  def main(args: Array[String]): Unit = {

    implicit val v: Int = 4
    println(add(3))
  }

}
