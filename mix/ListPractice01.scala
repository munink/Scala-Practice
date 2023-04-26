package com.basic.mix

object ListPractice01 extends App {
  val l = List("spark", "rdd", "example", "sample", "example")
  val map = l.map(x => (x, 1))
  println(map)

  val sortList = l.sortBy(c => c).distinct
  println(sortList)
}
