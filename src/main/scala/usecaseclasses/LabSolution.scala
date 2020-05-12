package usecaseclasses

case class Car(n: Int)
case class Truck(w: Int)

object LabSolution {

  def allocateFreight(t: Any, w: Int): Boolean = t match {
    case Car(n) => (n - 1)* 170 >= w
    case Truck(wt) => wt >= w
    case _ => println(s"Bad idea to try to carry things in ${t}"); false
  }

  def main(args: Array[String]): Unit = {
    val c = Car(4)
    val t = Truck(10000)
    val weight = 100

    println(s"Car ${if (allocateFreight(c, weight)) "can" else "can't"} carry ${weight}?")
  }
}
