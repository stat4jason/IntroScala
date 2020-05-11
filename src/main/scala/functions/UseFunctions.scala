package functions

object UseFunctions {
  def daysInMonth(month: Int, year: Int = 2020): Int = month match {
    case 9 | 4 | 6 | 11 => 30
    case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
    case 2 => if (year % 4 == 0) 29 else 28
    case _ => -1
  }
  def add(a: Double, b: Double): Double = {
    println("Adding Doubles...")
    a + b
//    return a + b // Poor style, generally, sometimes need "return" to return from middle of block
  }
//  def add(a: Int, b: Int): Int = {
//    println("Adding Ints")
//    a + b
//  }
//  def add(a: Long, b: Int): Long = a + b
//  def add(a: Int, b: Long): Long = a + b

//  def add(a: Int, b: Int): Int = {
//    a + b
//  }

  def main(args: Array[String]): Unit = {
    val twoPlusTwo = add(2, 2)
    println(twoPlusTwo)
    val twoPlusTwoDouble = add(2.0, 2)
    println(twoPlusTwoDouble)

    println(1 + "2")

    add("1".toInt, "2".toInt)

    println("Days in january 2000: " + daysInMonth(year=2000, month=1))
    println("Days in january 2000: " + daysInMonth(1))
  }
}
