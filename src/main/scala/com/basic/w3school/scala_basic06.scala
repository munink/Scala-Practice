package com.basic.w3school

// Write a Scala program to exchange the first and last characters
// in a given string and return the new string.
object scala_basic06 {
  def test(str: String): String = {
    val len = str.length
    if (len <= 1) str
    else str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("abcd"))
    println("Result: " + test("ab"))
    println("Result: " + test("a"))
  }
}
