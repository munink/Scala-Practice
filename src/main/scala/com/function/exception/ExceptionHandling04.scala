package com.function.exception

object ExceptionHandling04 extends App {
  def func(a: Int, b: Int): Float = {
    try {
      a / b
    } catch {
      case e: ArithmeticException => println(e.getMessage)
    } finally {
      println("This will print no matter what")
    }
    0
  }

  func(1, 0)
}
