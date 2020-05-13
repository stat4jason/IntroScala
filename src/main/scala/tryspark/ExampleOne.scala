 package tryspark

import java.util.regex.Pattern

import org.apache.spark.sql.SparkSession

object ExampleOne {
  val wordBreak = Pattern.compile("\\W+")
//  def collect:(Int, Int) => Int = (a: Int, b:Int) => a + b
//  def combine:(Int, Int) => Int = (a, b) => a + b

  def main(args: Array[String]): Unit = {
    val session = SparkSession.builder.appName("Simple Application")
      .master("local")
      .getOrCreate()
    session.read.textFile("PrideAndPrejudice.txt").rdd
//      .flatMap(l => wordBreak.split(l))
      .flatMap(wordBreak.split(_))
//      .filter(w => w.length() > 0)
      .filter(_.length() > 0)
      // the == The
      .map(_.toLowerCase())
      .map(w => (w, 1))
      .aggregateByKey(0)((a, b) => a + b, (r1, r2) => r1 + r2)
//      .sortBy((t:(String, Int)) => t._2, ascending=false)
      .sortBy(t => t._2, ascending=false)
      .take(200)
      .foreach(println)

    session.close()
  }
}
