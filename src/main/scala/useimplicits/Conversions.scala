package useimplicits

object Conversions {
  implicit class Message(val msg: String) {
    // hidden first argument, "this", equivalent to "self"
    def =+=(count: Int): String = (0 until 3).map(n => this.msg).reduce((a, b) => a + b)
  }

  object Message {
    implicit def xyz(s: String): Message = return new Message(s)
  }


  def main(args: Array[String]): Unit = {
    val m: Message = new Message("Hello")
    println(m.=+=(3))
//    import Message.xyz
//    xyz("What").=+=(3)
//    "What" =+= 3


    "What" =+= 3
  }
}
