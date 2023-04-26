package com.basic.w3school

object scala_basic11 {
  def test(str: String): Boolean = {
    str.startsWith("SC")
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("abcd"))
    println("Result: " + test("sc"))
    println("Result: " + test("a"))
  }
}
