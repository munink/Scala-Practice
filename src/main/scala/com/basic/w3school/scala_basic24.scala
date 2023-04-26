package com.basic.w3school

object scala_basic24 {
  def test(str: String, n: Int): String = {
    str * n
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala", 2))
    println("Result: " + test("Python", 1))
    println("Result: " + test("JS", 6))
  }
}
