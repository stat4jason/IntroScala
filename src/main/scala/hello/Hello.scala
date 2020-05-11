package hello

// "containers for code" are class object or trait
// containers contain methods (aka functions)
// and other stuff (including other containers)

// JVM convention is that a file called Xyz.scala contains a "container"
// with the same base name

object Hello {
  // program entry point
  def main(args: Array[String]): Unit = {
    println("Hello world")

    // declare two variables, one represents a fahrenheit temperature
    // initialize the first one...
    // calculate... + - * /  assignment / initialization with =
    // calculate a celcius temperature, and print it out

    // c = 5/9 of (f - 32)

    val fahrenheit: Double = 68

    // 5 / 9 is ZERO !!! change order, or go to floating point representation
    //    val celsius = 5 * (fahrenheit - 32)  / 9
    //    val celsius: Double = (fahrenheit - 32) * 5 / 9
        val celsius: Double = 5 / 9.0 * (fahrenheit - 32)

    println("Celsius temp is " + celsius)
  }
}
