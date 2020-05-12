package useimplicits

object ImplicitArguments {

  case class MyMessage(m: String)
  // default arguments are "Function" side choice of default
//  def showMessage(msg: String = "Bonjour"): Unit = println(s"Message is ${msg}")

  // implicit arguments are "Caller side" defaults
  def showMessage(implicit msg: MyMessage): Unit = println(s"Message is ${msg.m}")

  def main(args: Array[String]): Unit = {

    showMessage(MyMessage("Hello"))

    {
      implicit val defaultMsg = MyMessage("Bonjour")
      showMessage
      showMessage
      showMessage
      println(defaultMsg)
//    }
//    println(defaultMsg)
//
//    {
      implicit val defMsg = "Guten Tag"
      showMessage
      showMessage

      val names = List("Fred", "Jim", "Sheila")
      import useimplicits.StringOrdering.byLength2
      println(names.sorted)
      println(names.sorted((a:String, b:String) => b.charAt(0) - a.charAt(0)))
    }
  }
}
