package com.basic.w3school

object scala_basic10 {
  def test(str: String): String = {
    if (str.length <= 3) str * 3
    else str.substring(0, 3) + str + str.substring(0, 3)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("abcd"))
    println("Result: " + test("abc"))
    println("Result: " + test("ab"))
    println("Result: " + test("a"))
  }
}
