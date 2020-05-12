package usecaseclasses

// Case class gives:
// factory -- called "apply"
// immutable field references
// textual representation "toString" method
// Equality comparison == done based on the elements
// and we get case matching :)
case class Person(firstName: String, lastName: String)

object TryACase {
  def main(args: Array[String]): Unit = {
//    val person = ("Fred", "Jones")
    val person = Person("Fred", "Jones")
    println("Person is " + person)
    val person2 = new Person("Albert", "Smith")
    val person3 = new Person("Fred", "Jones")
    println(s"person == person2? ${person == person2}")
    println(s"person == person3? ${person == person3}")

    val target: Any = person
    val (fn, isAJones) = target match {
      case Person(x, "Jones") => (x , true)
      case Person(x, y) /*if y != "Jones"*/ => (x, false)
      case _ => (Unit, false)
    }
    println(s"Firstname extracted is ${fn}, is a Jones? ${isAJones}")

//    val (a, b) = if (target.isInstanceOf[Person]) {
//      val p:Person = target.asInstanceOf[Person]
//      if (p.lastName == "Jone") {
//        return (p.firstName, true)
//      }
//    }
  }
}
