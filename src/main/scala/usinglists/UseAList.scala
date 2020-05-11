package usinglists

object UseAList {
  def main(args: Array[String]): Unit = {
    val l = List.apply("One", "Two", "Three", "Four")
    println(l)
    val l2 = "Zero" :: l
    println(l)
    println(l2)

    println("Item at position two in l2 is " + l2.apply(2))
    println("Item at position two in l2 is " + l2(2))
    val l3 = l2.updated(3, "Bad") // VERY INEFFICIENT, has to duplicate most of the list :(
    println(l)
    println(l2)
    println(l3)

    val l4 = "Ten" :: "Eleven" :: Nil
    println(l4)
  }
}
