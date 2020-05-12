package conditions

object MatchingLists {

  // Square brackets describe "generics"
  def showAll(l: List[String]): Unit = l match {
    case Nil => ()
    case h :: t => println("> " + h); showAll(t)
  }

  def showThreeItems(l: List[String]): Unit = l match {
//    case a :: b :: c :: Nil => println("THREE ITEMS!!!")
    case List(a, b, c) => println("THREE ITEMS!!!")
    case _ => println("Not three items")
  }
  def main(args: Array[String]): Unit = {
    val l = List("Fred", "Jim", "Sheila")
    showAll(l)
    showThreeItems(l)
    showThreeItems("x" :: l)
  }

}
