package com.basic.w3school

object scala_basic22 {
  def test(x: Int, y: Int): Boolean = {
    Math.abs(x % 10) == Math.abs(y % 10)
    //x % 10 == y % 10
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(123, 456))
    println("Result: " + test(12, 512))
    println("Result: " + test(7, 87))
    println("Result: " + test(12, 45))
  }
}
