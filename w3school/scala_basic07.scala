package com.basic.w3school

// Write a Scala program to create a new string which is 4 copies
// of the 2 front characters of a given string.
// If the given string length is less than 2 return the original string.
object scala_basic07 {
  def test(str: String): String = {
    if (str.length < 2) str
    else str.substring(0, 2) * 4
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("abcd"))
    println("Result: " + test("ab"))
    println("Result: " + test("a"))
  }
}
