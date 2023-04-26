package com.basic.w3school

object scala_basic23 {
  def test(str: String): String = {
    str.take(str.length - 4) + str.drop(str.length - 4).toUpperCase()
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("Python"))
    println("Result: " + test("abc"))
    println("Result: " + test("x"))
  }
}
