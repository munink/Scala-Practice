package com.function.exception

object ExceptionHandling01 extends App {
  def div(a: Int, b: Int): Float = {
    a / b
  }

  div(2, 0)
}
