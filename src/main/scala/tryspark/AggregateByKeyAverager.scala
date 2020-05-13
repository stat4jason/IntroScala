package tryspark

import org.apache.spark.sql.SparkSession

import scala.concurrent.forkjoin.ThreadLocalRandom

case class Average(sum: Double, count: Long)

object AggregateByKeyAverager {
  def main(args: Array[String]): Unit = {
    val session = SparkSession.builder.appName("Simple Application")
      .master("local")
      .getOrCreate()
    val x = session.sparkContext.makeRDD(List(1))
      .flatMap(x => ThreadLocalRandom.current().doubles(10000).toArray)
      .map(v => (1, v))
      .aggregateByKey(Average(0, 0))((a: Average, v: Double) => Average(a.sum + v, a.count + 1),
          (a1: Average, a2: Average) => Average(a1.sum + a2.sum, a1.count + a2.count))
      .map((t: (Int, Average)) => t._2.sum / t._2.count)
      .foreach(println)

  }
}
