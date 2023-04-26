package com.basic.w3school

object SequencesPractice01 {
  def main(args: Array[String]): Unit = {
    val numbers = Seq(8, 22, 1, 3, 15, 14, 2)
    println(numbers)
    val sorted = numbers.sorted
    println(sorted)
  }
}
