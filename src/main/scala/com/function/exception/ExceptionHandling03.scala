package com.function.exception

object ExceptionHandling03 extends App {
  def func(n: Int): Unit = {
    try {
      println(1 / n)
      var arr = Array(1, 4)
      arr(17)
    } catch {
      case e: ArithmeticException => println(e)
      case anon: Throwable => println("Unknown exception: " + anon)
    }
  }

  func(1)
}
