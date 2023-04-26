package com.basic.mix

object CollectionMapPractice01 {
  def main(args: Array[String]): Unit = {
    val fruit = Map("apples" -> "$0.75", "oranges" -> "$1.00", "bananas" -> "$0.60")
    println(fruit)
    println(fruit.keys)
    println(fruit.values)
    println(fruit.isEmpty)
    println(fruit("oranges"))

    fruit.keys.foreach { i =>
      print("key: " + i)
      println(" values: " + fruit(i))
    }
  }
}
