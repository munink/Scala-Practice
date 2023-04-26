package com.function.exception

object ExceptionHandling02 extends App {
  def div(a: Int, b: Int): Float = {
    try {
      a / b
    } catch {
      case e: ArithmeticException => println(e)
    }
    0
  }

  div(2, 0)
}
