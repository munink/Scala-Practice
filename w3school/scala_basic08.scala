package com.basic.w3school

object scala_basic08 {
  def test(str: String): String = {
    val len = str.length
    val last = str.charAt(len - 1)
    last + str + last
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("abcd"))
    println("Result: " + test("ab"))
    println("Result: " + test("a"))
  }
}
