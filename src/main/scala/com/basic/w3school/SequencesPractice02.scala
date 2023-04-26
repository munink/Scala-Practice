package com.basic.w3school

object SequencesPractice02 {
  def main(args: Array[String]): Unit = {
    val fruit1 = Seq("orange", "grapes", "banana")
    val fruit2 = Seq("apple", "pear", "cherries")
    val fruitsort = fruit1 ++ fruit2
    println(fruitsort)

    val sorted = fruitsort.sorted
    println(sorted)
  }
}
