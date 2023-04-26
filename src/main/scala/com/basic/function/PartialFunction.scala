package com.basic.function

import com.SparkSessionTest

object PartialFunction extends App {
  val doSomething = (x: Int, y: Int) => x * y
  val tenTimes = doSomething(10, _: Int)
  val tenTimes1 = doSomething(_: Int, 10)

  println(tenTimes(5))
  println(tenTimes1(6))
}
