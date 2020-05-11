package conditions

import scala.io.StdIn

object UseMatch {
  def main(args: Array[String]): Unit = {
    val day = StdIn.readLine("Enter a day number in range 0-6").toInt
    val dayName = day match {
      case 0 => "Saturday"
      case 1 => "Sunday"
      case 2 => "Monday"
      case 3 => "Tuesday"
      case 4 => "Wednesday"
      case 5 => "Thursday"
      case 6 => "Friday"
      case _ => "That's a bad number for a day of week"
    }

    println("Day number " + day + " is called " + dayName)
  }
}
