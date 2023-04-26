package com.basic.w3school

object scala_basic09 {
  def test(n: Int): Boolean = {
    n % 3 == 0 || n % 7 == 0
  }

  def main(args: Array[String]) = {
    println("Result: " + test(3))
    println("Result: " + test(14))
    println("Result: " + test(12))
    println("Result: " + test(37))
  }
}
