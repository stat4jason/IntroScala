package usemap

object UseAMap {
  def main(args: Array[String]): Unit = {
    val people = Map(("Fred", "Jones"), "Jim" -> "Smith", "Sheila" -> "Albertson")
//    println(people.apply("Fred"))
    println(people("Fred"))
  }
}
