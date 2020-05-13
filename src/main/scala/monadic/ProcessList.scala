package monadic


case class Student(name:String, grade:Int, courses:List[String])

object ProcessList {
  def main(args: Array[String]): Unit = {
    List(
      Student("Fred", 78, List("Math", "Physics")),
      Student("Jim", 55, List("Art")),
      Student("Sheila", 89, List("Math", "Physics", "Astrophysics")))
      .filter(x => x.grade > 60)
//      .flatMap(x => x.courses)
      .flatMap(_.courses)
//      .foreach(x => println(x))
//      .foreach(println(_))
      .foreach(println)

    List(
      Student("Fred", 78, List("Math", "Physics")),
      Student("Jim", 55, List("Art")),
      Student("Sheila", 89, List("Math", "Physics", "Astrophysics"))) filter
      (_.grade > 60) flatMap (_.courses) foreach println

  }
}
