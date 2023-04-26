package com.basic.mix

object CollectionPractice02 {
  def main(args: Array[String]): Unit = {
    val fruit = Seq("apple", "orange", "banana")
    println(fruit)
    // collection.immutable.

    import scala.collection.mutable.ListBuffer
    val fruit1 = ListBuffer("apple", "orange", "banana")
    println(fruit1)
    fruit1 += "cherries"
    println(fruit1)
    fruit1 -= "orange"
    println(fruit1)
  }
}
