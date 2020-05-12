package tempanddatelabs

import scala.io.StdIn

object Solutions {
  def dayName(d: Int): String = d match {
    case 0 => "Saturday"
    case 1 => "Sunday"
    case 2 => "Monday"
    case 3 => "Tuesday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case _ => "That's a bad number for a day of week"
  }

  // function arguments are "val" NOT "var"...
  def dayOfWeek(day: Int, month: Int, year: Int): Int = {
    val (m, y) = if (month < 3) (month + 12, year - 1) else (month, year)
    (day + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7
  }

  def fahrToCelc(f: Double): Double = 5 * (f - 32) / 9

  def main(args: Array[String]): Unit = {
    //    var f = StdIn.readLine("Enter a Fahrenheit temperature (q to quit): ")
    //    while (f != "q") {
    //      val c = fahrToCelc(f.toDouble)
    //      println(s"${f} Fahrenheit is ${c} Celsius")
    //      f = StdIn.readLine("Enter a Fahrenheit temperature (q to quit): ")
    //    }

//    var f = ""
//    do {
//      f = StdIn.readLine("Enter a Fahrenheit temperature (q to quit): ")
//      if (f != "q") {
//        val c = fahrToCelc(f.toDouble)
//        println(s"${f} Fahrenheit is ${c} Celsius")
//      }
//    } while (f != "q")

    var fahr = -40
    while (fahr <= 220) {
      println(f"${fahr}%5.2f fahrenheit is ${fahrToCelc(fahr)}%5.2f celsius")
      fahr += 10
    }

    println(s"Jan 1, 2000 is " + dayName(dayOfWeek(1, 1, 2000)))
  }
}
