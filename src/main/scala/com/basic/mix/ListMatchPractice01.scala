package com.basic.mix

object ListMatchPractice01 extends App {
  def sumInts(list: List[Int]): Int = list match {
    case a :: tail => a + sumInts(tail)
    case Nil => 0
  }

  val intList: List[Int] = List(10, -5, -5, 10, -1, 1, 100)
  val sum = intList.sum
  println(sum)
  println(sumInts(intList))

  val numList = (1 to 100000).toList
  val foldResult = (numList).reduce(_ + _)
  println(foldResult)
}
