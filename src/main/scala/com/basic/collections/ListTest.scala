package com.basic.collections

object ListTest extends App {
  val y = List("a", "b", "c")
  println(y)
  println(y.head)
  println(y.tail)

  val x = List("sample")
  println(x)
  println(x.head)
  println(x.tail)
  println(x.take(8))
}
