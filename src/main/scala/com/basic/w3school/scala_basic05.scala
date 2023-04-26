package com.basic.w3school

// Write a Scala program to remove the character in a given position of a given string.
// The given position will be in the range 0...string length -1 inclusive.
object scala_basic05 {

  def test(str: String, n: Int): String = {
    println("=> take: " + str.take(n) + " drop: " + str.drop(n + 1))
    str.take(n) + str.drop(n + 1)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala", 1))
    println("Result: " + test("Scala", 0))
    println("Result: " + test("Scala", 4))
  }
}
