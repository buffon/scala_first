import org.apache.spark.{SparkContext, SparkConf}

/**
  * scala word count
  *
  * Created by chenyehui on 17/4/3.
  */
object WordCount {

  def main(args: Array[String]) {

    val sparkConf = new SparkConf().setAppName("wordcount").setMaster("local")

    val sc = new SparkContext(sparkConf)

    val line = sc.textFile("/Users/chenyehui/Desktop/spark_txt")

    line.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_+_).collect().foreach(println)

    sc.stop()
  }
}
