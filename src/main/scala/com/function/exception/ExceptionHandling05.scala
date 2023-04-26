package com.function.exception

object ExceptionHandling05 extends App {
  def batmitzvah(age: Int): Unit = {
    if (age < 12) {
      throw new Exception("Sorry, you're ineligible yet!")
    } else {
      println("Eligible")
    }
  }

  batmitzvah(10)
}
