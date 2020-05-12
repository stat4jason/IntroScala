package useimplicits

class MyStringOrdering extends Ordering[String] {
  override def compare(x: String, y: String): Int = x.length - y.length
}

object StringOrdering {
  implicit val byLength2 = new MyStringOrdering
  implicit val byLength:Ordering[String] = (a, b) => a.length - b.length
  implicit val byLengthReversed: Ordering[String] = (a, b) => b.length - a.length
  implicit val byFirstLetter: Ordering[String] = (a, b) => a.charAt(0) - b.charAt(0)
}
