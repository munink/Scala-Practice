package com

// Create SparkSession object
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
object SparkSessionTest extends App {

  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExamples.com")
    .getOrCreate();
  println(spark)
  println("Spark Version : " + spark.version)
}
