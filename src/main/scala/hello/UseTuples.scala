package hello

class UseTuples {
  def main(args: Array[String]): Unit = {
    val date = (11, 5, 2020)
    println("The day is " + date._1)

    val (d, m, y) = date
    println(s"Date is ${d}/${m}/${y}")  // also f"..." does floating point formats.
  }
}
