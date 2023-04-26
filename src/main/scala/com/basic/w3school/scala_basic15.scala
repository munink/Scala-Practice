package com.basic.w3school

object scala_basic15 {
  def test(x: Int, y: Int): Boolean = {
    (x <= 20 || y >= 50) || (y <= 20 || x >= 50)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(20, 84))
    println("Result: " + test(14, 50))
    println("Result: " + test(11, 45))
    println("Result: " + test(25, 40))
  }
}
