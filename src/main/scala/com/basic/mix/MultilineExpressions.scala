package com.basic.mix

object MultilineExpressions extends App {
  def method2(x: Int, y: Int)(z: Int): Int = {
    val a = z + y + x
    (x + y) * a
  }

  println(method2(2, 3)(4))
  val _3rdValNeed = method2(2, 3)(_)
  println(_3rdValNeed(4))

  /*def func() = {
    return 7
  }*/

  def func(a: Int = 3, b: Int = 2) {
    println (a * b)
  }
  func(5)

  val (a: Int, b: String) = Pair(7, "Ayushi")
  val (x, y) = Pair(7, "Ayushi")
}
