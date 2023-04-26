package com.basic.mix

object CollectionSetPractice02 {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.Set
    val numbers = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.min)
    println(numbers.max)
  }
}
