package applyetc

object UsingApply {
  def apply(s: String): Unit = println("apply called with " + s)
  def update(i: Int, s: String): Unit = println("updated called with i = " + i + " and s = " + s)
  def main(args: Array[String]): Unit = {
    UsingApply.apply("Hello")
    UsingApply("Hello")
    UsingApply.update(99, "World")
    UsingApply(99) = "World"
  }
}
