package com.basic.w3school

object scala_basic14 {
  def test(x: Int, y: Int, z: Int): Boolean = {
    (x >= 20 && x <= 50) || (y >= 20 && y <= 50) || (z >= 20 && z <= 50)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(11, 20, 12))
    println("Result: " + test(30, 30, 17))
    println("Result: " + test(25, 35, 50))
    println("Result: " + test(15, 12, 8))
  }
}
