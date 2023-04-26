package com.basic.w3school

object scala_basic17 {
  def test(x: Int, y: Int, z: Int): Int = {
    List(x, y, z).max
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(1, 2, 3))
    println("Result: " + test(1, 3, 2))
    println("Result: " + test(1, 1, 1))
    println("Result: " + test(1, 2, 2))
  }
}
