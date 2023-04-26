package com.basic.w3school

object scala_basic13 {
  def test(num1: Int, num2: Int): Boolean = {
    (num1 >= 100 && num2 <= 200) || (num2 >= 100 && num1 <= 200)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(100, 199))
    println("Result: " + test(250, 300))
    println("Result: " + test(105, 190))
  }
}
